package com.bytedance.sdk.component.fs.zmn.fs;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class zmn implements fs, zn, Cloneable, ByteChannel {
    private static final byte[] zn = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long fs;
    btk zmn;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean zmn() {
        return this.fs == 0;
    }

    public byte fs() {
        long j = this.fs;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        btk btkVar = this.zmn;
        int i = btkVar.fs;
        int i2 = btkVar.zn;
        int i3 = i + 1;
        byte b = btkVar.zmn[i];
        this.fs = j - 1;
        if (i3 == i2) {
            this.zmn = btkVar.fs();
            hhw.zmn(btkVar);
        } else {
            btkVar.fs = i3;
        }
        return b;
    }

    public String zn() {
        try {
            return zmn(this.fs, bvs.zmn);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String zmn(long j, Charset charset) throws EOFException {
        bvs.zmn(this.fs, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        btk btkVar = this.zmn;
        int i = btkVar.fs;
        if (i + j > btkVar.zn) {
            return new String(zmn(j), charset);
        }
        String str = new String(btkVar.zmn, i, (int) j, charset);
        int i2 = (int) (btkVar.fs + j);
        btkVar.fs = i2;
        this.fs -= j;
        if (i2 == btkVar.zn) {
            this.zmn = btkVar.fs();
            hhw.zmn(btkVar);
        }
        return str;
    }

    public byte[] zmn(long j) throws EOFException {
        bvs.zmn(this.fs, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        zmn(bArr);
        return bArr;
    }

    public void zmn(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int zmn = zmn(bArr, i, bArr.length - i);
            if (zmn == -1) {
                throw new EOFException();
            }
            i += zmn;
        }
    }

    public int zmn(byte[] bArr, int i, int i2) {
        bvs.zmn(bArr.length, i, i2);
        btk btkVar = this.zmn;
        if (btkVar == null) {
            return -1;
        }
        int min = Math.min(i2, btkVar.zn - btkVar.fs);
        System.arraycopy(btkVar.zmn, btkVar.fs, bArr, i, min);
        int i3 = btkVar.fs + min;
        btkVar.fs = i3;
        this.fs -= min;
        if (i3 == btkVar.zn) {
            this.zmn = btkVar.fs();
            hhw.zmn(btkVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        btk btkVar = this.zmn;
        if (btkVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), btkVar.zn - btkVar.fs);
        byteBuffer.put(btkVar.zmn, btkVar.fs, min);
        int i = btkVar.fs + min;
        btkVar.fs = i;
        this.fs -= min;
        if (i == btkVar.zn) {
            this.zmn = btkVar.fs();
            hhw.zmn(btkVar);
        }
        return min;
    }

    public zmn zmn(String str) {
        return zmn(str, 0, str.length());
    }

    public zmn zmn(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                btk zn2 = zn(1);
                byte[] bArr = zn2.zmn;
                int i3 = zn2.zn - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = zn2.zn;
                int i6 = (i3 + i) - i5;
                zn2.zn = i5 + i6;
                this.fs += i6;
            } else {
                if (charAt2 < 2048) {
                    fs((charAt2 >> 6) | 192);
                    fs((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    fs((charAt2 >> '\f') | 224);
                    fs(((charAt2 >> 6) & 63) | 128);
                    fs((charAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        fs(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        fs((i8 >> 18) | 240);
                        fs(((i8 >> 12) & 63) | 128);
                        fs(((i8 >> 6) & 63) | 128);
                        fs((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public zmn zmn(int i) {
        if (i < 128) {
            fs(i);
        } else if (i < 2048) {
            fs((i >> 6) | 192);
            fs((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                fs(63);
            } else {
                fs((i >> 12) | 224);
                fs(((i >> 6) & 63) | 128);
                fs((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            fs((i >> 18) | 240);
            fs(((i >> 12) & 63) | 128);
            fs(((i >> 6) & 63) | 128);
            fs((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public zmn zmn(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(bvs.zmn)) {
            return zmn(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return fs(bytes, 0, bytes.length);
    }

    public zmn fs(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        bvs.zmn(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            btk zn2 = zn(1);
            int min = Math.min(i3 - i, 8192 - zn2.zn);
            System.arraycopy(bArr, i, zn2.zmn, zn2.zn, min);
            i += min;
            zn2.zn += min;
        }
        this.fs += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            btk zn2 = zn(1);
            int min = Math.min(i, 8192 - zn2.zn);
            byteBuffer.get(zn2.zmn, zn2.zn, min);
            i -= min;
            zn2.zn += min;
        }
        this.fs += remaining;
        return remaining;
    }

    public zmn fs(int i) {
        btk zn2 = zn(1);
        byte[] bArr = zn2.zmn;
        int i2 = zn2.zn;
        zn2.zn = i2 + 1;
        bArr[i2] = (byte) i;
        this.fs++;
        return this;
    }

    public zmn fs(long j) {
        if (j == 0) {
            return fs(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        btk zn2 = zn(numberOfTrailingZeros);
        byte[] bArr = zn2.zmn;
        int i = zn2.zn;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = zn[(int) (15 & j)];
            j >>>= 4;
        }
        zn2.zn += numberOfTrailingZeros;
        this.fs += numberOfTrailingZeros;
        return this;
    }

    btk zn(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        btk btkVar = this.zmn;
        if (btkVar == null) {
            btk zmn = hhw.zmn();
            this.zmn = zmn;
            zmn.nps = zmn;
            zmn.hhw = zmn;
            return zmn;
        }
        btk btkVar2 = btkVar.nps;
        return (btkVar2.zn + i > 8192 || !btkVar2.btk) ? btkVar2.zmn(hhw.zmn()) : btkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmn)) {
            return false;
        }
        zmn zmnVar = (zmn) obj;
        long j = this.fs;
        if (j != zmnVar.fs) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        btk btkVar = this.zmn;
        btk btkVar2 = zmnVar.zmn;
        int i = btkVar.fs;
        int i2 = btkVar2.fs;
        while (j2 < this.fs) {
            long min = Math.min(btkVar.zn - i, btkVar2.zn - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (btkVar.zmn[i] != btkVar2.zmn[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == btkVar.zn) {
                btkVar = btkVar.hhw;
                i = btkVar.fs;
            }
            if (i2 == btkVar2.zn) {
                btkVar2 = btkVar2.hhw;
                i2 = btkVar2.fs;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        btk btkVar = this.zmn;
        if (btkVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = btkVar.zn;
            for (int i3 = btkVar.fs; i3 < i2; i3++) {
                i = (i * 31) + btkVar.zmn[i3];
            }
            btkVar = btkVar.hhw;
        } while (btkVar != this.zmn);
        return i;
    }

    public String toString() {
        return btk().toString();
    }

    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public zmn clone() {
        zmn zmnVar = new zmn();
        if (this.fs == 0) {
            return zmnVar;
        }
        btk zmn = this.zmn.zmn();
        zmnVar.zmn = zmn;
        zmn.nps = zmn;
        zmn.hhw = zmn;
        btk btkVar = this.zmn;
        while (true) {
            btkVar = btkVar.hhw;
            if (btkVar != this.zmn) {
                zmnVar.zmn.nps.zmn(btkVar.zmn());
            } else {
                zmnVar.fs = this.fs;
                return zmnVar;
            }
        }
    }

    public final fb btk() {
        long j = this.fs;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.fs);
        }
        return fb((int) j);
    }

    public final fb fb(int i) {
        if (i == 0) {
            return fb.zn;
        }
        return new nps(this, i);
    }
}
