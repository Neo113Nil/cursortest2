package org.apache.commons.imaging.common.mylzw;

import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class MyBitOutputStream extends OutputStream {
    private int bitCache;
    private int bitsInCache;
    private final ByteOrder byteOrder;
    private int bytesWritten;
    private final OutputStream os;

    public MyBitOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.os = outputStream;
    }

    private void actualWrite(int i) {
        this.os.write(i);
        this.bytesWritten++;
    }

    public void flushCache() {
        int i = this.bitsInCache;
        if (i > 0) {
            int i2 = this.bitCache & ((1 << i) - 1);
            ByteOrder byteOrder = this.byteOrder;
            ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
            OutputStream outputStream = this.os;
            if (byteOrder == byteOrder2) {
                outputStream.write(i2 << (8 - i));
            } else {
                outputStream.write(i2);
            }
        }
        this.bitsInCache = 0;
        this.bitCache = 0;
    }

    public int getBytesWritten() {
        return this.bytesWritten + (this.bitsInCache > 0 ? 1 : 0);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        writeBits(i, 8);
    }

    public void writeBits(int i, int i2) {
        int i3 = i & ((1 << i2) - 1);
        ByteOrder byteOrder = this.byteOrder;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        int i4 = this.bitCache;
        if (byteOrder == byteOrder2) {
            this.bitCache = i3 | (i4 << i2);
        } else {
            this.bitCache = (i3 << this.bitsInCache) | i4;
        }
        this.bitsInCache += i2;
        while (true) {
            int i5 = this.bitsInCache;
            if (i5 < 8) {
                return;
            }
            ByteOrder byteOrder3 = this.byteOrder;
            ByteOrder byteOrder4 = ByteOrder.BIG_ENDIAN;
            int i6 = this.bitCache;
            if (byteOrder3 == byteOrder4) {
                actualWrite((i6 >> (i5 - 8)) & 255);
                this.bitsInCache -= 8;
            } else {
                actualWrite(i6 & 255);
                this.bitCache >>= 8;
                this.bitsInCache -= 8;
            }
            this.bitCache = ((1 << this.bitsInCache) - 1) & this.bitCache;
        }
    }
}
