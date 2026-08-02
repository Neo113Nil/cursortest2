package org.apache.commons.imaging.common.mylzw;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class MyLzwCompressor {
    private final ByteOrder byteOrder;
    private final int clearCode;
    private int codeSize;
    private int codes;
    private final boolean earlyLimit;
    private final int eoiCode;
    private final int initialCodeSize;
    private final Listener listener;
    private final Map<ByteArray, Integer> map;

    public static final class ByteArray {
        private final byte[] bytes;
        private final int hash;
        private final int length;
        private final int start;

        public ByteArray(byte[] bArr, int i, int i2) {
            this.bytes = bArr;
            this.start = i;
            this.length = i2;
            int i3 = i2;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = ((i3 + (i3 << 8)) ^ (bArr[i4 + i] & 255)) ^ i4;
            }
            this.hash = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ByteArray)) {
                return false;
            }
            ByteArray byteArray = (ByteArray) obj;
            if (byteArray.hash != this.hash || byteArray.length != this.length) {
                return false;
            }
            for (int i = 0; i < this.length; i++) {
                if (byteArray.bytes[byteArray.start + i] != this.bytes[this.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.hash;
        }
    }

    public interface Listener {
        void clearCode(int i);

        void dataCode(int i);

        void eoiCode(int i);

        void init(int i, int i2);
    }

    public MyLzwCompressor(int i, ByteOrder byteOrder, boolean z, Listener listener) {
        this.codes = -1;
        this.map = new HashMap();
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.earlyLimit = z;
        this.initialCodeSize = i;
        int i2 = 1 << i;
        this.clearCode = i2;
        int i3 = i2 + 1;
        this.eoiCode = i3;
        if (listener != null) {
            listener.init(i2, i3);
        }
        initializeStringTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean addTableEntry(MyBitOutputStream myBitOutputStream, ByteArray byteArray) {
        boolean z;
        int i = this.codeSize;
        int i2 = 1 << i;
        if (this.earlyLimit) {
            i2--;
        }
        if (this.codes == i2) {
            if (i >= 12) {
                writeClearCode(myBitOutputStream);
                clearTable();
                z = true;
                if (!z) {
                    this.map.put(byteArray, Integer.valueOf(this.codes));
                    this.codes++;
                }
                return z;
            }
            incrementCodeSize();
        }
        z = false;
        if (!z) {
        }
        return z;
    }

    private ByteArray arrayToKey(byte b) {
        return arrayToKey(new byte[]{b}, 0, 1);
    }

    private void clearTable() {
        initializeStringTable();
        incrementCodeSize();
    }

    private int codeFromString(byte[] bArr, int i, int i2) {
        Integer num = this.map.get(arrayToKey(bArr, i, i2));
        if (num != null) {
            return num.intValue();
        }
        a$$ExternalSyntheticBUOutline0.m$4("CodeFromString");
        return 0;
    }

    private void incrementCodeSize() {
        int i = this.codeSize;
        if (i != 12) {
            this.codeSize = i + 1;
        }
    }

    private void initializeStringTable() {
        int i = this.initialCodeSize;
        this.codeSize = i;
        int i2 = (1 << i) + 2;
        this.map.clear();
        int i3 = 0;
        while (true) {
            this.codes = i3;
            int i4 = this.codes;
            if (i4 >= i2) {
                return;
            }
            if (i4 != this.clearCode && i4 != this.eoiCode) {
                this.map.put(arrayToKey((byte) i4), Integer.valueOf(this.codes));
            }
            i3 = this.codes + 1;
        }
    }

    private boolean isInTable(byte[] bArr, int i, int i2) {
        return this.map.containsKey(arrayToKey(bArr, i, i2));
    }

    private void writeClearCode(MyBitOutputStream myBitOutputStream) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.dataCode(this.clearCode);
        }
        writeCode(myBitOutputStream, this.clearCode);
    }

    private void writeCode(MyBitOutputStream myBitOutputStream, int i) {
        myBitOutputStream.writeBits(i, this.codeSize);
    }

    private void writeDataCode(MyBitOutputStream myBitOutputStream, int i) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.dataCode(i);
        }
        writeCode(myBitOutputStream, i);
    }

    private void writeEoiCode(MyBitOutputStream myBitOutputStream) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.eoiCode(this.eoiCode);
        }
        writeCode(myBitOutputStream, this.eoiCode);
    }

    public byte[] compress(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        MyBitOutputStream myBitOutputStream = new MyBitOutputStream(byteArrayOutputStream, this.byteOrder);
        initializeStringTable();
        clearTable();
        writeClearCode(myBitOutputStream);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = i2 + 1;
            if (isInTable(bArr, i, i4)) {
                i2 = i4;
            } else {
                writeDataCode(myBitOutputStream, codeFromString(bArr, i, i2));
                addTableEntry(myBitOutputStream, bArr, i, i4);
                i2 = 1;
                i = i3;
            }
        }
        writeDataCode(myBitOutputStream, codeFromString(bArr, i, i2));
        writeEoiCode(myBitOutputStream);
        myBitOutputStream.flushCache();
        return byteArrayOutputStream.toByteArray();
    }

    private ByteArray arrayToKey(byte[] bArr, int i, int i2) {
        return new ByteArray(bArr, i, i2);
    }

    public MyLzwCompressor(int i, ByteOrder byteOrder, boolean z) {
        this(i, byteOrder, z, null);
    }

    private boolean addTableEntry(MyBitOutputStream myBitOutputStream, byte[] bArr, int i, int i2) {
        return addTableEntry(myBitOutputStream, arrayToKey(bArr, i, i2));
    }
}
