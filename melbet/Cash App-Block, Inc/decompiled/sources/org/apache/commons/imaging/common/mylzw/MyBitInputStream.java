package org.apache.commons.imaging.common.mylzw;

import com.plaid.internal.EnumC0170g;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class MyBitInputStream extends InputStream {
    private int bitCache;
    private int bitsInCache;
    private final ByteOrder byteOrder;
    private long bytesRead;
    private final InputStream is;
    private boolean tiffLZWMode;

    public MyBitInputStream(InputStream inputStream, ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.is = inputStream;
    }

    public void flushCache() {
        this.bitsInCache = 0;
        this.bitCache = 0;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Override // java.io.InputStream
    public int read() {
        return readBits(8);
    }

    public int readBits(int i) {
        int i2;
        while (true) {
            int i3 = this.bitsInCache;
            if (i3 >= i) {
                int i4 = (1 << i) - 1;
                ByteOrder byteOrder = this.byteOrder;
                ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
                int i5 = this.bitCache;
                if (byteOrder == byteOrder2) {
                    i2 = i4 & (i5 >> (i3 - i));
                } else {
                    i2 = i4 & i5;
                    this.bitCache = i5 >> i;
                }
                int i6 = i3 - i;
                this.bitsInCache = i6;
                this.bitCache = ((1 << i6) - 1) & this.bitCache;
                return i2;
            }
            int read = this.is.read();
            if (read < 0) {
                if (this.tiffLZWMode) {
                    return EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                }
                return -1;
            }
            int i7 = read & 255;
            if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
                this.bitCache = i7 | (this.bitCache << 8);
            } else {
                this.bitCache = (i7 << this.bitsInCache) | this.bitCache;
            }
            this.bytesRead++;
            this.bitsInCache += 8;
        }
    }

    public void setTiffLZWMode() {
        this.tiffLZWMode = true;
    }
}
