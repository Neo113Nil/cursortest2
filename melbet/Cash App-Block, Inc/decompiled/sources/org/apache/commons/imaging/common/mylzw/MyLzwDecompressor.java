package org.apache.commons.imaging.common.mylzw;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public final class MyLzwDecompressor {
    private static final int MAX_TABLE_SIZE = 4096;
    private final ByteOrder byteOrder;
    private final int clearCode;
    private int codeSize;
    private int codes;
    private final int eoiCode;
    private final int initialCodeSize;
    private final Listener listener;
    private final byte[][] table;
    private boolean tiffLZWMode;
    private int written;

    public interface Listener {
        void code(int i);

        void init(int i, int i2);
    }

    public MyLzwDecompressor(int i, ByteOrder byteOrder, Listener listener) {
        this.codes = -1;
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.initialCodeSize = i;
        this.table = new byte[4096][];
        int i2 = 1 << i;
        this.clearCode = i2;
        int i3 = i2 + 1;
        this.eoiCode = i3;
        if (listener != null) {
            listener.init(i2, i3);
        }
        initializeTable();
    }

    private void addStringToTable(byte[] bArr) {
        int i = this.codes;
        if (i < (1 << this.codeSize)) {
            this.table[i] = bArr;
            this.codes = i + 1;
        }
        checkCodeSize();
    }

    private byte[] appendBytes(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length] = b;
        return bArr2;
    }

    private void checkCodeSize() {
        int i = 1 << this.codeSize;
        if (this.tiffLZWMode) {
            i--;
        }
        if (this.codes == i) {
            incrementCodeSize();
        }
    }

    private void clearTable() {
        int i = this.initialCodeSize;
        this.codes = (1 << i) + 2;
        this.codeSize = i;
        incrementCodeSize();
    }

    private byte firstChar(byte[] bArr) {
        return bArr[0];
    }

    private int getNextCode(MyBitInputStream myBitInputStream) {
        int readBits = myBitInputStream.readBits(this.codeSize);
        Listener listener = this.listener;
        if (listener != null) {
            listener.code(readBits);
        }
        return readBits;
    }

    private void incrementCodeSize() {
        int i = this.codeSize;
        if (i != 12) {
            this.codeSize = i + 1;
        }
    }

    private void initializeTable() {
        int i = this.initialCodeSize;
        this.codeSize = i;
        int i2 = 1 << (i + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.table[i3] = new byte[]{(byte) i3};
        }
    }

    private boolean isInTable(int i) {
        return i < this.codes;
    }

    private byte[] stringFromCode(int i) {
        if (i < this.codes && i >= 0) {
            return this.table[i];
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Bad Code: ", " codes: ");
        m2m.append(this.codes);
        m2m.append(" code_size: ");
        m2m.append(this.codeSize);
        m2m.append(", table: ");
        m2m.append(this.table.length);
        throw new IOException(m2m.toString());
    }

    private void writeToResult(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
        this.written += bArr.length;
    }

    public byte[] decompress(InputStream inputStream, int i) {
        MyBitInputStream myBitInputStream = new MyBitInputStream(inputStream, this.byteOrder);
        if (this.tiffLZWMode) {
            myBitInputStream.setTiffLZWMode();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        clearTable();
        int i2 = -1;
        do {
            int nextCode = getNextCode(myBitInputStream);
            if (nextCode == this.eoiCode) {
                break;
            }
            if (nextCode == this.clearCode) {
                clearTable();
                if (this.written >= i || (i2 = getNextCode(myBitInputStream)) == this.eoiCode) {
                    break;
                }
                writeToResult(byteArrayOutputStream, stringFromCode(i2));
            } else {
                if (isInTable(nextCode)) {
                    writeToResult(byteArrayOutputStream, stringFromCode(nextCode));
                    addStringToTable(appendBytes(stringFromCode(i2), firstChar(stringFromCode(nextCode))));
                } else {
                    byte[] appendBytes = appendBytes(stringFromCode(i2), firstChar(stringFromCode(i2)));
                    writeToResult(byteArrayOutputStream, appendBytes);
                    addStringToTable(appendBytes);
                }
                i2 = nextCode;
            }
        } while (this.written < i);
        return byteArrayOutputStream.toByteArray();
    }

    public void setTiffLZWMode() {
        this.tiffLZWMode = true;
    }

    public MyLzwDecompressor(int i, ByteOrder byteOrder) {
        this(i, byteOrder, null);
    }
}
