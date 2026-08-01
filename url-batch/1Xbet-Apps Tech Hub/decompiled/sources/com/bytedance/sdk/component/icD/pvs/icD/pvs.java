package com.bytedance.sdk.component.icD.pvs.icD;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.objectweb.asm.Opcodes;

/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public final class pvs implements icD, vG, Cloneable, ByteChannel {
    private static final byte[] vG = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long icD;
    NB pvs;

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

    public boolean pvs() {
        return this.icD == 0;
    }

    public byte icD() {
        if (this.icD == 0) {
            throw new IllegalStateException("size == 0");
        }
        NB nb = this.pvs;
        int i = nb.icD;
        int i2 = nb.vG;
        int i3 = i + 1;
        byte b = nb.pvs[i];
        this.icD--;
        if (i3 == i2) {
            this.pvs = nb.icD();
            sUS.pvs(nb);
        } else {
            nb.icD = i3;
        }
        return b;
    }

    public String vG() {
        try {
            return pvs(this.icD, Mxy.pvs);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String pvs(long j, Charset charset) throws EOFException {
        Mxy.pvs(this.icD, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        NB nb = this.pvs;
        if (nb.icD + j > nb.vG) {
            return new String(pvs(j), charset);
        }
        String str = new String(nb.pvs, nb.icD, (int) j, charset);
        nb.icD = (int) (nb.icD + j);
        this.icD -= j;
        if (nb.icD == nb.vG) {
            this.pvs = nb.icD();
            sUS.pvs(nb);
        }
        return str;
    }

    public byte[] pvs(long j) throws EOFException {
        Mxy.pvs(this.icD, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        pvs(bArr);
        return bArr;
    }

    public void pvs(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int pvs = pvs(bArr, i, bArr.length - i);
            if (pvs == -1) {
                throw new EOFException();
            }
            i += pvs;
        }
    }

    public int pvs(byte[] bArr, int i, int i2) {
        Mxy.pvs(bArr.length, i, i2);
        NB nb = this.pvs;
        if (nb == null) {
            return -1;
        }
        int min = Math.min(i2, nb.vG - nb.icD);
        System.arraycopy(nb.pvs, nb.icD, bArr, i, min);
        nb.icD += min;
        this.icD -= min;
        if (nb.icD == nb.vG) {
            this.pvs = nb.icD();
            sUS.pvs(nb);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        NB nb = this.pvs;
        if (nb == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), nb.vG - nb.icD);
        byteBuffer.put(nb.pvs, nb.icD, min);
        nb.icD += min;
        this.icD -= min;
        if (nb.icD == nb.vG) {
            this.pvs = nb.icD();
            sUS.pvs(nb);
        }
        return min;
    }

    public pvs pvs(String str) {
        return pvs(str, 0, str.length());
    }

    public pvs pvs(String str, int i, int i2) {
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
                NB vG2 = vG(1);
                byte[] bArr = vG2.pvs;
                int i3 = vG2.vG - i;
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
                int i5 = (i3 + i) - vG2.vG;
                vG2.vG += i5;
                this.icD += i5;
            } else {
                if (charAt2 < 2048) {
                    icD((charAt2 >> 6) | Opcodes.CHECKCAST);
                    icD((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    icD((charAt2 >> '\f') | 224);
                    icD(((charAt2 >> 6) & 63) | 128);
                    icD((charAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        icD(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        icD((i7 >> 18) | 240);
                        icD(((i7 >> 12) & 63) | 128);
                        icD(((i7 >> 6) & 63) | 128);
                        icD((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public pvs pvs(int i) {
        if (i < 128) {
            icD(i);
        } else if (i < 2048) {
            icD((i >> 6) | Opcodes.CHECKCAST);
            icD((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                icD(63);
            } else {
                icD((i >> 12) | 224);
                icD(((i >> 6) & 63) | 128);
                icD((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            icD((i >> 18) | 240);
            icD(((i >> 12) & 63) | 128);
            icD(((i >> 6) & 63) | 128);
            icD((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public pvs pvs(String str, int i, int i2, Charset charset) {
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
        if (charset.equals(Mxy.pvs)) {
            return pvs(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return icD(bytes, 0, bytes.length);
    }

    public pvs icD(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        Mxy.pvs(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            NB vG2 = vG(1);
            int min = Math.min(i3 - i, 8192 - vG2.vG);
            System.arraycopy(bArr, i, vG2.pvs, vG2.vG, min);
            i += min;
            vG2.vG += min;
        }
        this.icD += j;
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
            NB vG2 = vG(1);
            int min = Math.min(i, 8192 - vG2.vG);
            byteBuffer.get(vG2.pvs, vG2.vG, min);
            i -= min;
            vG2.vG += min;
        }
        this.icD += remaining;
        return remaining;
    }

    public pvs icD(int i) {
        NB vG2 = vG(1);
        byte[] bArr = vG2.pvs;
        int i2 = vG2.vG;
        vG2.vG = i2 + 1;
        bArr[i2] = (byte) i;
        this.icD++;
        return this;
    }

    public pvs icD(long j) {
        if (j == 0) {
            return icD(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        NB vG2 = vG(numberOfTrailingZeros);
        byte[] bArr = vG2.pvs;
        int i = vG2.vG;
        for (int i2 = (vG2.vG + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = vG[(int) (15 & j)];
            j >>>= 4;
        }
        vG2.vG += numberOfTrailingZeros;
        this.icD += numberOfTrailingZeros;
        return this;
    }

    NB vG(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        NB nb = this.pvs;
        if (nb == null) {
            NB pvs = sUS.pvs();
            this.pvs = pvs;
            pvs.yiw = pvs;
            pvs.sUS = pvs;
            return pvs;
        }
        NB nb2 = nb.yiw;
        return (nb2.vG + i > 8192 || !nb2.NB) ? nb2.pvs(sUS.pvs()) : nb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvs)) {
            return false;
        }
        pvs pvsVar = (pvs) obj;
        long j = this.icD;
        if (j != pvsVar.icD) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        NB nb = this.pvs;
        NB nb2 = pvsVar.pvs;
        int i = nb.icD;
        int i2 = nb2.icD;
        while (j2 < this.icD) {
            long min = Math.min(nb.vG - i, nb2.vG - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (nb.pvs[i] != nb2.pvs[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == nb.vG) {
                nb = nb.sUS;
                i = nb.icD;
            }
            if (i2 == nb2.vG) {
                nb2 = nb2.sUS;
                i2 = nb2.icD;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        NB nb = this.pvs;
        if (nb == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = nb.vG;
            for (int i3 = nb.icD; i3 < i2; i3++) {
                i = (i * 31) + nb.pvs[i3];
            }
            nb = nb.sUS;
        } while (nb != this.pvs);
        return i;
    }

    public String toString() {
        return NB().toString();
    }

    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public pvs clone() {
        pvs pvsVar = new pvs();
        if (this.icD == 0) {
            return pvsVar;
        }
        NB pvs = this.pvs.pvs();
        pvsVar.pvs = pvs;
        pvs.yiw = pvs;
        pvs.sUS = pvs;
        NB nb = this.pvs;
        while (true) {
            nb = nb.sUS;
            if (nb != this.pvs) {
                pvsVar.pvs.yiw.pvs(nb.pvs());
            } else {
                pvsVar.icD = this.icD;
                return pvsVar;
            }
        }
    }

    public final Jd NB() {
        long j = this.icD;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.icD);
        }
        return Jd((int) j);
    }

    public final Jd Jd(int i) {
        if (i == 0) {
            return Jd.vG;
        }
        return new yiw(this, i);
    }
}
