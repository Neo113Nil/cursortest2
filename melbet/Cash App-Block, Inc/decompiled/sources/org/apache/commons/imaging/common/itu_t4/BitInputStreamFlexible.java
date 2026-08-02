package org.apache.commons.imaging.common.itu_t4;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;

/* loaded from: classes9.dex */
class BitInputStreamFlexible extends InputStream {
    private long bytesRead;
    private int cache;
    private int cacheBitsRemaining;
    private final InputStream is;

    public BitInputStreamFlexible(InputStream inputStream) {
        this.is = inputStream;
    }

    public void flushCache() {
        this.cacheBitsRemaining = 0;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.cacheBitsRemaining <= 0) {
            return this.is.read();
        }
        a$$ExternalSyntheticBUOutline0.m$4("BitInputStream: incomplete bit read");
        return 0;
    }

    public final int readBits(int i) {
        if (i > 32) {
            a$$ExternalSyntheticBUOutline0.m$4("BitInputStream: unknown error");
            return 0;
        }
        int i2 = this.cacheBitsRemaining;
        int i3 = 0;
        if (i2 > 0) {
            if (i >= i2) {
                int i4 = ((1 << i2) - 1) & this.cache;
                i -= i2;
                this.cacheBitsRemaining = 0;
                i3 = i4;
            } else {
                int i5 = i2 - i;
                this.cacheBitsRemaining = i5;
                i3 = ((1 << i) - 1) & (this.cache >> i5);
                i = 0;
            }
        }
        while (i >= 8) {
            int read = this.is.read();
            this.cache = read;
            if (read < 0) {
                a$$ExternalSyntheticBUOutline0.m$4("couldn't read bits");
                return 0;
            }
            this.bytesRead++;
            i3 = (read & 255) | (i3 << 8);
            i -= 8;
        }
        if (i <= 0) {
            return i3;
        }
        int read2 = this.is.read();
        this.cache = read2;
        if (read2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$4("couldn't read bits");
            return 0;
        }
        this.bytesRead++;
        int i6 = 8 - i;
        this.cacheBitsRemaining = i6;
        return (i3 << i) | (((1 << i) - 1) & (read2 >> i6));
    }
}
