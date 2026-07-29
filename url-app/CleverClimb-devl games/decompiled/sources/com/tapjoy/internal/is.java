package com.tapjoy.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.cmplay.policy.gdpr.DimenUtils;
import java.io.EOFException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class is implements it, iu, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8414c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a, reason: collision with root package name */
    iz f8415a;

    /* renamed from: b, reason: collision with root package name */
    long f8416b;

    @Override // com.tapjoy.internal.it
    public final it a() {
        return this;
    }

    @Override // com.tapjoy.internal.jc, java.io.Closeable, java.lang.AutoCloseable, com.tapjoy.internal.jd
    public final void close() {
    }

    @Override // com.tapjoy.internal.jc, java.io.Flushable
    public final void flush() {
    }

    @Override // com.tapjoy.internal.iu
    public final boolean b() {
        return this.f8416b == 0;
    }

    @Override // com.tapjoy.internal.iu
    public final void a(long j) {
        if (this.f8416b < j) {
            throw new EOFException();
        }
    }

    @Override // com.tapjoy.internal.iu
    public final byte c() {
        if (this.f8416b == 0) {
            throw new IllegalStateException("size == 0");
        }
        iz izVar = this.f8415a;
        int i = izVar.f8433b;
        int i2 = izVar.f8434c;
        int i3 = i + 1;
        byte b2 = izVar.f8432a[i];
        this.f8416b--;
        if (i3 == i2) {
            this.f8415a = izVar.a();
            ja.a(izVar);
        } else {
            izVar.f8433b = i3;
        }
        return b2;
    }

    public final int d() {
        if (this.f8416b < 4) {
            throw new IllegalStateException("size < 4: " + this.f8416b);
        }
        iz izVar = this.f8415a;
        int i = izVar.f8433b;
        int i2 = izVar.f8434c;
        if (i2 - i < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = izVar.f8432a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f8416b -= 4;
        if (i8 == i2) {
            this.f8415a = izVar.a();
            ja.a(izVar);
        } else {
            izVar.f8433b = i8;
        }
        return i9;
    }

    @Override // com.tapjoy.internal.iu
    public final int e() {
        return jf.a(d());
    }

    @Override // com.tapjoy.internal.iu
    public final iv b(long j) {
        return new iv(g(j));
    }

    @Override // com.tapjoy.internal.iu
    public final String c(long j) {
        Charset charset = jf.f8441a;
        jf.a(this.f8416b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        iz izVar = this.f8415a;
        if (izVar.f8433b + j > izVar.f8434c) {
            return new String(g(j), charset);
        }
        String str = new String(izVar.f8432a, izVar.f8433b, (int) j, charset);
        izVar.f8433b = (int) (izVar.f8433b + j);
        this.f8416b -= j;
        if (izVar.f8433b == izVar.f8434c) {
            this.f8415a = izVar.a();
            ja.a(izVar);
        }
        return str;
    }

    public final byte[] g() {
        try {
            return g(this.f8416b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private byte[] g(long j) {
        jf.a(this.f8416b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    private void a(byte[] bArr) {
        int min;
        int i = 0;
        while (i < bArr.length) {
            int length = bArr.length - i;
            jf.a(bArr.length, i, length);
            iz izVar = this.f8415a;
            if (izVar == null) {
                min = -1;
            } else {
                min = Math.min(length, izVar.f8434c - izVar.f8433b);
                System.arraycopy(izVar.f8432a, izVar.f8433b, bArr, i, min);
                izVar.f8433b += min;
                this.f8416b -= min;
                if (izVar.f8433b == izVar.f8434c) {
                    this.f8415a = izVar.a();
                    ja.a(izVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i += min;
        }
    }

    @Override // com.tapjoy.internal.iu
    public final void d(long j) {
        while (j > 0) {
            if (this.f8415a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.f8415a.f8434c - this.f8415a.f8433b);
            long j2 = min;
            this.f8416b -= j2;
            j -= j2;
            this.f8415a.f8433b += min;
            if (this.f8415a.f8433b == this.f8415a.f8434c) {
                iz izVar = this.f8415a;
                this.f8415a = izVar.a();
                ja.a(izVar);
            }
        }
    }

    @Override // com.tapjoy.internal.it
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final is b(iv ivVar) {
        if (ivVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        ivVar.a(this);
        return this;
    }

    @Override // com.tapjoy.internal.it
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final is b(String str) {
        char charAt;
        int length = str.length();
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        }
        if (length > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        int i = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                iz c2 = c(1);
                byte[] bArr = c2.f8432a;
                int i2 = c2.f8434c - i;
                int min = Math.min(length, 8192 - i2);
                int i3 = i + 1;
                bArr[i + i2] = (byte) charAt2;
                while (true) {
                    i = i3;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i3 = i + 1;
                    bArr[i + i2] = (byte) charAt;
                }
                int i4 = (i2 + i) - c2.f8434c;
                c2.f8434c += i4;
                this.f8416b += i4;
            } else if (charAt2 < 2048) {
                e((charAt2 >> 6) | 192);
                e((charAt2 & '?') | 128);
                i++;
            } else if (charAt2 < 55296 || charAt2 > 57343) {
                e((charAt2 >> '\f') | 224);
                e(((charAt2 >> 6) & 63) | 128);
                e((charAt2 & '?') | 128);
                i++;
            } else {
                int i5 = i + 1;
                char charAt3 = i5 < length ? str.charAt(i5) : (char) 0;
                if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                    e(63);
                    i = i5;
                } else {
                    int i6 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                    e((i6 >> 18) | DimenUtils.DENSITY_HIGH);
                    e(((i6 >> 12) & 63) | 128);
                    e(((i6 >> 6) & 63) | 128);
                    e((i6 & 63) | 128);
                    i += 2;
                }
            }
        }
        return this;
    }

    public final is a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        jf.a(bArr.length, 0L, j);
        int i3 = i2 + 0;
        while (i < i3) {
            iz c2 = c(1);
            int min = Math.min(i3 - i, 8192 - c2.f8434c);
            System.arraycopy(bArr, i, c2.f8432a, c2.f8434c, min);
            i += min;
            c2.f8434c += min;
        }
        this.f8416b += j;
        return this;
    }

    @Override // com.tapjoy.internal.it
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final is e(int i) {
        iz c2 = c(1);
        byte[] bArr = c2.f8432a;
        int i2 = c2.f8434c;
        c2.f8434c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f8416b++;
        return this;
    }

    @Override // com.tapjoy.internal.it
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final is d(int i) {
        int a2 = jf.a(i);
        iz c2 = c(4);
        byte[] bArr = c2.f8432a;
        int i2 = c2.f8434c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((a2 >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((a2 >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((a2 >>> 8) & 255);
        bArr[i5] = (byte) (a2 & 255);
        c2.f8434c = i5 + 1;
        this.f8416b += 4;
        return this;
    }

    @Override // com.tapjoy.internal.it
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final is f(long j) {
        long a2 = jf.a(j);
        iz c2 = c(8);
        byte[] bArr = c2.f8432a;
        int i = c2.f8434c;
        int i2 = i + 1;
        bArr[i] = (byte) ((a2 >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((a2 >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((a2 >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((a2 >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((a2 >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((a2 >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((a2 >>> 8) & 255);
        bArr[i8] = (byte) (a2 & 255);
        c2.f8434c = i8 + 1;
        this.f8416b += 8;
        return this;
    }

    final iz c(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.f8415a == null) {
            this.f8415a = ja.a();
            iz izVar = this.f8415a;
            iz izVar2 = this.f8415a;
            iz izVar3 = this.f8415a;
            izVar2.g = izVar3;
            izVar.f = izVar3;
            return izVar3;
        }
        iz izVar4 = this.f8415a.g;
        return (izVar4.f8434c + i > 8192 || !izVar4.e) ? izVar4.a(ja.a()) : izVar4;
    }

    @Override // com.tapjoy.internal.jc
    public final void a(is isVar, long j) {
        iz a2;
        if (isVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (isVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        jf.a(isVar.f8416b, 0L, j);
        while (j > 0) {
            if (j < isVar.f8415a.f8434c - isVar.f8415a.f8433b) {
                iz izVar = this.f8415a != null ? this.f8415a.g : null;
                if (izVar != null && izVar.e) {
                    if ((izVar.f8434c + j) - (izVar.f8435d ? 0 : izVar.f8433b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        isVar.f8415a.a(izVar, (int) j);
                        isVar.f8416b -= j;
                        this.f8416b += j;
                        return;
                    }
                }
                iz izVar2 = isVar.f8415a;
                int i = (int) j;
                if (i <= 0 || i > izVar2.f8434c - izVar2.f8433b) {
                    throw new IllegalArgumentException();
                }
                if (i >= 1024) {
                    a2 = new iz(izVar2);
                } else {
                    a2 = ja.a();
                    System.arraycopy(izVar2.f8432a, izVar2.f8433b, a2.f8432a, 0, i);
                }
                a2.f8434c = a2.f8433b + i;
                izVar2.f8433b += i;
                izVar2.g.a(a2);
                isVar.f8415a = a2;
            }
            iz izVar3 = isVar.f8415a;
            long j2 = izVar3.f8434c - izVar3.f8433b;
            isVar.f8415a = izVar3.a();
            if (this.f8415a == null) {
                this.f8415a = izVar3;
                iz izVar4 = this.f8415a;
                iz izVar5 = this.f8415a;
                iz izVar6 = this.f8415a;
                izVar5.g = izVar6;
                izVar4.f = izVar6;
            } else {
                iz a3 = this.f8415a.g.a(izVar3);
                if (a3.g == a3) {
                    throw new IllegalStateException();
                }
                if (a3.g.e) {
                    int i2 = a3.f8434c - a3.f8433b;
                    if (i2 <= (8192 - a3.g.f8434c) + (a3.g.f8435d ? 0 : a3.g.f8433b)) {
                        a3.a(a3.g, i2);
                        a3.a();
                        ja.a(a3);
                    }
                }
            }
            isVar.f8416b -= j2;
            this.f8416b += j2;
            j -= j2;
        }
    }

    @Override // com.tapjoy.internal.jd
    public final long b(is isVar, long j) {
        if (isVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f8416b == 0) {
            return -1L;
        }
        if (j > this.f8416b) {
            j = this.f8416b;
        }
        isVar.a(this, j);
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is)) {
            return false;
        }
        is isVar = (is) obj;
        if (this.f8416b != isVar.f8416b) {
            return false;
        }
        long j = 0;
        if (this.f8416b == 0) {
            return true;
        }
        iz izVar = this.f8415a;
        iz izVar2 = isVar.f8415a;
        int i = izVar.f8433b;
        int i2 = izVar2.f8433b;
        while (j < this.f8416b) {
            long min = Math.min(izVar.f8434c - i, izVar2.f8434c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (izVar.f8432a[i4] != izVar2.f8432a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == izVar.f8434c) {
                izVar = izVar.f;
                i = izVar.f8433b;
            } else {
                i = i4;
            }
            if (i3 == izVar2.f8434c) {
                izVar2 = izVar2.f;
                i2 = izVar2.f8433b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public final int hashCode() {
        iz izVar = this.f8415a;
        if (izVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = izVar.f8434c;
            for (int i3 = izVar.f8433b; i3 < i2; i3++) {
                i = (i * 31) + izVar.f8432a[i3];
            }
            izVar = izVar.f;
        } while (izVar != this.f8415a);
        return i;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final is clone() {
        is isVar = new is();
        if (this.f8416b == 0) {
            return isVar;
        }
        isVar.f8415a = new iz(this.f8415a);
        iz izVar = isVar.f8415a;
        iz izVar2 = isVar.f8415a;
        iz izVar3 = isVar.f8415a;
        izVar2.g = izVar3;
        izVar.f = izVar3;
        iz izVar4 = this.f8415a;
        while (true) {
            izVar4 = izVar4.f;
            if (izVar4 != this.f8415a) {
                isVar.f8415a.g.a(new iz(izVar4));
            } else {
                isVar.f8416b = this.f8416b;
                return isVar;
            }
        }
    }

    @Override // com.tapjoy.internal.iu
    public final long f() {
        long j;
        if (this.f8416b < 8) {
            throw new IllegalStateException("size < 8: " + this.f8416b);
        }
        iz izVar = this.f8415a;
        int i = izVar.f8433b;
        int i2 = izVar.f8434c;
        if (i2 - i < 8) {
            j = ((d() & 4294967295L) << 32) | (4294967295L & d());
        } else {
            byte[] bArr = izVar.f8432a;
            long j2 = (bArr[i] & 255) << 56;
            long j3 = j2 | ((bArr[r8] & 255) << 48);
            long j4 = j3 | ((bArr[r1] & 255) << 40);
            long j5 = j4 | ((bArr[r8] & 255) << 32) | ((bArr[r1] & 255) << 24);
            long j6 = j5 | ((bArr[r6] & 255) << 16);
            long j7 = ((bArr[r1] & 255) << 8) | j6;
            int i3 = i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            long j8 = (bArr[r6] & 255) | j7;
            this.f8416b -= 8;
            if (i3 == i2) {
                this.f8415a = izVar.a();
                ja.a(izVar);
            } else {
                izVar.f8433b = i3;
            }
            j = j8;
        }
        return jf.a(j);
    }

    public final String toString() {
        iv jbVar;
        if (this.f8416b > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f8416b);
        }
        int i = (int) this.f8416b;
        if (i == 0) {
            jbVar = iv.f8418b;
        } else {
            jbVar = new jb(this, i);
        }
        return jbVar.toString();
    }
}
