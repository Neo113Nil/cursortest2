package c;

import android.support.v4.media.session.PlaybackStateCompat;
import com.cmplay.policy.gdpr.DimenUtils;
import com.tapjoy.TapjoyConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public final class c implements d, e, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f2184c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a, reason: collision with root package name */
    n f2185a;

    /* renamed from: b, reason: collision with root package name */
    long f2186b;

    @Override // c.d, c.e
    public c c() {
        return this;
    }

    @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c v() {
        return this;
    }

    @Override // c.d, c.q, java.io.Flushable
    public void flush() {
    }

    public long b() {
        return this.f2186b;
    }

    public OutputStream d() {
        return new OutputStream() { // from class: c.c.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                c.this.i((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                c.this.c(bArr, i, i2);
            }

            public String toString() {
                return c.this + ".outputStream()";
            }
        };
    }

    @Override // c.e
    public boolean f() {
        return this.f2186b == 0;
    }

    @Override // c.e
    public void a(long j) throws EOFException {
        if (this.f2186b < j) {
            throw new EOFException();
        }
    }

    @Override // c.e
    public InputStream g() {
        return new InputStream() { // from class: c.c.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (c.this.f2186b > 0) {
                    return c.this.i() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return c.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(c.this.f2186b, 2147483647L);
            }

            public String toString() {
                return c.this + ".inputStream()";
            }
        };
    }

    public c a(c cVar, long j, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        t.a(this.f2186b, j, j2);
        if (j2 == 0) {
            return this;
        }
        cVar.f2186b += j2;
        n nVar = this.f2185a;
        while (j >= nVar.f2218c - nVar.f2217b) {
            j -= nVar.f2218c - nVar.f2217b;
            nVar = nVar.f;
        }
        while (j2 > 0) {
            n nVar2 = new n(nVar);
            nVar2.f2217b = (int) (nVar2.f2217b + j);
            nVar2.f2218c = Math.min(nVar2.f2217b + ((int) j2), nVar2.f2218c);
            if (cVar.f2185a == null) {
                nVar2.g = nVar2;
                nVar2.f = nVar2;
                cVar.f2185a = nVar2;
            } else {
                cVar.f2185a.g.a(nVar2);
            }
            j2 -= nVar2.f2218c - nVar2.f2217b;
            nVar = nVar.f;
            j = 0;
        }
        return this;
    }

    public long h() {
        long j = this.f2186b;
        if (j == 0) {
            return 0L;
        }
        n nVar = this.f2185a.g;
        return (nVar.f2218c >= 8192 || !nVar.e) ? j : j - (nVar.f2218c - nVar.f2217b);
    }

    @Override // c.e
    public byte i() {
        if (this.f2186b == 0) {
            throw new IllegalStateException("size == 0");
        }
        n nVar = this.f2185a;
        int i = nVar.f2217b;
        int i2 = nVar.f2218c;
        int i3 = i + 1;
        byte b2 = nVar.f2216a[i];
        this.f2186b--;
        if (i3 == i2) {
            this.f2185a = nVar.a();
            o.a(nVar);
        } else {
            nVar.f2217b = i3;
        }
        return b2;
    }

    public byte b(long j) {
        t.a(this.f2186b, j, 1L);
        n nVar = this.f2185a;
        while (true) {
            long j2 = nVar.f2218c - nVar.f2217b;
            if (j >= j2) {
                j -= j2;
                nVar = nVar.f;
            } else {
                return nVar.f2216a[nVar.f2217b + ((int) j)];
            }
        }
    }

    @Override // c.e
    public short j() {
        if (this.f2186b < 2) {
            throw new IllegalStateException("size < 2: " + this.f2186b);
        }
        n nVar = this.f2185a;
        int i = nVar.f2217b;
        int i2 = nVar.f2218c;
        if (i2 - i < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        byte[] bArr = nVar.f2216a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f2186b -= 2;
        if (i4 == i2) {
            this.f2185a = nVar.a();
            o.a(nVar);
        } else {
            nVar.f2217b = i4;
        }
        return (short) i5;
    }

    @Override // c.e
    public int k() {
        if (this.f2186b < 4) {
            throw new IllegalStateException("size < 4: " + this.f2186b);
        }
        n nVar = this.f2185a;
        int i = nVar.f2217b;
        int i2 = nVar.f2218c;
        if (i2 - i < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = nVar.f2216a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f2186b -= 4;
        if (i8 == i2) {
            this.f2185a = nVar.a();
            o.a(nVar);
        } else {
            nVar.f2217b = i8;
        }
        return i9;
    }

    @Override // c.e
    public short l() {
        return t.a(j());
    }

    @Override // c.e
    public int m() {
        return t.a(k());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long n() {
        int i;
        if (this.f2186b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        long j = 0;
        boolean z = false;
        do {
            n nVar = this.f2185a;
            byte[] bArr = nVar.f2216a;
            int i3 = nVar.f2217b;
            int i4 = nVar.f2218c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = (b2 - 97) + 10;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = (b2 - 65) + 10;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b2));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.f2185a = nVar.a();
                        o.a(nVar);
                    } else {
                        nVar.f2217b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().k(j).i((int) b2).p());
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f2185a != null);
        this.f2186b -= i2;
        return j;
    }

    public f o() {
        return new f(r());
    }

    @Override // c.e
    public f c(long j) throws EOFException {
        return new f(g(j));
    }

    @Override // c.e
    public long a(q qVar) throws IOException {
        long j = this.f2186b;
        if (j > 0) {
            qVar.a_(this, j);
        }
        return j;
    }

    public String p() {
        try {
            return a(this.f2186b, t.f2226a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String d(long j) throws EOFException {
        return a(j, t.f2226a);
    }

    public String a(long j, Charset charset) throws EOFException {
        t.a(this.f2186b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        n nVar = this.f2185a;
        if (nVar.f2217b + j > nVar.f2218c) {
            return new String(g(j), charset);
        }
        String str = new String(nVar.f2216a, nVar.f2217b, (int) j, charset);
        nVar.f2217b = (int) (nVar.f2217b + j);
        this.f2186b -= j;
        if (nVar.f2217b == nVar.f2218c) {
            this.f2185a = nVar.a();
            o.a(nVar);
        }
        return str;
    }

    @Override // c.e
    public String q() throws EOFException {
        return e(Long.MAX_VALUE);
    }

    public String e(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return f(a2);
        }
        if (j2 < b() && b(j2 - 1) == 13 && b(j2) == 10) {
            return f(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, b()));
        throw new EOFException("\\n not found: limit=" + Math.min(b(), j) + " content=" + cVar.o().e() + (char) 8230);
    }

    String f(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (b(j2) == 13) {
                String d2 = d(j2);
                h(2L);
                return d2;
            }
        }
        String d3 = d(j);
        h(1L);
        return d3;
    }

    public byte[] r() {
        try {
            return g(this.f2186b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // c.e
    public byte[] g(long j) throws EOFException {
        t.a(this.f2186b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    @Override // c.e
    public void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    public int a(byte[] bArr, int i, int i2) {
        t.a(bArr.length, i, i2);
        n nVar = this.f2185a;
        if (nVar == null) {
            return -1;
        }
        int min = Math.min(i2, nVar.f2218c - nVar.f2217b);
        System.arraycopy(nVar.f2216a, nVar.f2217b, bArr, i, min);
        nVar.f2217b += min;
        this.f2186b -= min;
        if (nVar.f2217b == nVar.f2218c) {
            this.f2185a = nVar.a();
            o.a(nVar);
        }
        return min;
    }

    public void s() {
        try {
            h(this.f2186b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // c.e
    public void h(long j) throws EOFException {
        while (j > 0) {
            if (this.f2185a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.f2185a.f2218c - this.f2185a.f2217b);
            long j2 = min;
            this.f2186b -= j2;
            j -= j2;
            this.f2185a.f2217b += min;
            if (this.f2185a.f2217b == this.f2185a.f2218c) {
                n nVar = this.f2185a;
                this.f2185a = nVar.a();
                o.a(nVar);
            }
        }
    }

    @Override // c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c b(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    @Override // c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c b(String str) {
        return a(str, 0, str.length());
    }

    public c a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                n e = e(1);
                byte[] bArr = e.f2216a;
                int i3 = e.f2218c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt;
                while (i4 < min) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) charAt2;
                    i4++;
                }
                int i5 = (i3 + i4) - e.f2218c;
                e.f2218c += i5;
                this.f2186b += i5;
                i = i4;
            } else if (charAt < 2048) {
                i((charAt >> 6) | 192);
                i((charAt & '?') | 128);
                i++;
            } else if (charAt < 55296 || charAt > 57343) {
                i((charAt >> '\f') | 224);
                i(((charAt >> 6) & 63) | 128);
                i((charAt & '?') | 128);
                i++;
            } else {
                int i6 = i + 1;
                char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                    i(63);
                    i = i6;
                } else {
                    int i7 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                    i((i7 >> 18) | DimenUtils.DENSITY_HIGH);
                    i(((i7 >> 12) & 63) | 128);
                    i(((i7 >> 6) & 63) | 128);
                    i((i7 & 63) | 128);
                    i += 2;
                }
            }
        }
        return this;
    }

    public c a(int i) {
        if (i < 128) {
            i(i);
        } else if (i < 2048) {
            i((i >> 6) | 192);
            i((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                i(63);
            } else {
                i((i >> 12) | 224);
                i(((i >> 6) & 63) | 128);
                i((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            i((i >> 18) | DimenUtils.DENSITY_HIGH);
            i(((i >> 12) & 63) | 128);
            i(((i >> 6) & 63) | 128);
            i((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public c a(String str, Charset charset) {
        return a(str, 0, str.length(), charset);
    }

    public c a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(t.f2226a)) {
                return a(str, i, i2);
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return c(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
    }

    @Override // c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    @Override // c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        t.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            n e = e(1);
            int min = Math.min(i3 - i, 8192 - e.f2218c);
            System.arraycopy(bArr, i, e.f2216a, e.f2218c, min);
            i += min;
            e.f2218c += min;
        }
        this.f2186b += j;
        return this;
    }

    public long a(r rVar) throws IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a2 = rVar.a(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (a2 == -1) {
                return j;
            }
            j += a2;
        }
    }

    @Override // c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c i(int i) {
        n e = e(1);
        byte[] bArr = e.f2216a;
        int i2 = e.f2218c;
        e.f2218c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2186b++;
        return this;
    }

    @Override // c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c h(int i) {
        n e = e(2);
        byte[] bArr = e.f2216a;
        int i2 = e.f2218c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        e.f2218c = i3 + 1;
        this.f2186b += 2;
        return this;
    }

    @Override // c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c g(int i) {
        n e = e(4);
        byte[] bArr = e.f2216a;
        int i2 = e.f2218c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        e.f2218c = i5 + 1;
        this.f2186b += 4;
        return this;
    }

    @Override // c.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c l(long j) {
        if (j == 0) {
            return i(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= TapjoyConstants.TIMER_INCREMENT) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        n e = e(i);
        byte[] bArr = e.f2216a;
        int i2 = e.f2218c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f2184c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        e.f2218c += i;
        this.f2186b += i;
        return this;
    }

    @Override // c.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c k(long j) {
        if (j == 0) {
            return i(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        n e = e(numberOfTrailingZeros);
        byte[] bArr = e.f2216a;
        int i = e.f2218c;
        for (int i2 = (e.f2218c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f2184c[(int) (15 & j)];
            j >>>= 4;
        }
        e.f2218c += numberOfTrailingZeros;
        this.f2186b += numberOfTrailingZeros;
        return this;
    }

    n e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.f2185a == null) {
            this.f2185a = o.a();
            n nVar = this.f2185a;
            n nVar2 = this.f2185a;
            n nVar3 = this.f2185a;
            nVar2.g = nVar3;
            nVar.f = nVar3;
            return nVar3;
        }
        n nVar4 = this.f2185a.g;
        return (nVar4.f2218c + i > 8192 || !nVar4.e) ? nVar4.a(o.a()) : nVar4;
    }

    @Override // c.q
    public void a_(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        t.a(cVar.f2186b, 0L, j);
        while (j > 0) {
            if (j < cVar.f2185a.f2218c - cVar.f2185a.f2217b) {
                n nVar = this.f2185a != null ? this.f2185a.g : null;
                if (nVar != null && nVar.e) {
                    if ((nVar.f2218c + j) - (nVar.f2219d ? 0 : nVar.f2217b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        cVar.f2185a.a(nVar, (int) j);
                        cVar.f2186b -= j;
                        this.f2186b += j;
                        return;
                    }
                }
                cVar.f2185a = cVar.f2185a.a((int) j);
            }
            n nVar2 = cVar.f2185a;
            long j2 = nVar2.f2218c - nVar2.f2217b;
            cVar.f2185a = nVar2.a();
            if (this.f2185a == null) {
                this.f2185a = nVar2;
                n nVar3 = this.f2185a;
                n nVar4 = this.f2185a;
                n nVar5 = this.f2185a;
                nVar4.g = nVar5;
                nVar3.f = nVar5;
            } else {
                this.f2185a.g.a(nVar2).b();
            }
            cVar.f2186b -= j2;
            this.f2186b += j2;
            j -= j2;
        }
    }

    @Override // c.r
    public long a(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2186b == 0) {
            return -1L;
        }
        if (j > this.f2186b) {
            j = this.f2186b;
        }
        cVar.a_(this, j);
        return j;
    }

    @Override // c.e
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a(byte b2, long j, long j2) {
        n nVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f2186b), Long.valueOf(j), Long.valueOf(j2)));
        }
        if (j2 > this.f2186b) {
            j2 = this.f2186b;
        }
        if (j == j2 || (nVar = this.f2185a) == null) {
            return -1L;
        }
        if (this.f2186b - j >= j) {
            while (true) {
                long j4 = (nVar.f2218c - nVar.f2217b) + j3;
                if (j4 < j) {
                    nVar = nVar.f;
                    j3 = j4;
                }
            }
            while (j3 < j2) {
                byte[] bArr = nVar.f2216a;
                int min = (int) Math.min(nVar.f2218c, (nVar.f2217b + j2) - j3);
                for (int i = (int) ((nVar.f2217b + j) - j3); i < min; i++) {
                    if (bArr[i] == b2) {
                        return (i - nVar.f2217b) + j3;
                    }
                }
                j = (nVar.f2218c - nVar.f2217b) + j3;
                nVar = nVar.f;
                j3 = j;
            }
            return -1L;
        }
        j3 = this.f2186b;
        while (j3 > j) {
            nVar = nVar.g;
            j3 -= nVar.f2218c - nVar.f2217b;
        }
        while (j3 < j2) {
        }
        return -1L;
    }

    @Override // c.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.g());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f2186b - j < i2 || fVar.g() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (b(i3 + j) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.q
    public s a() {
        return s.f2222c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2186b != cVar.f2186b) {
            return false;
        }
        long j = 0;
        if (this.f2186b == 0) {
            return true;
        }
        n nVar = this.f2185a;
        n nVar2 = cVar.f2185a;
        int i = nVar.f2217b;
        int i2 = nVar2.f2217b;
        while (j < this.f2186b) {
            long min = Math.min(nVar.f2218c - i, nVar2.f2218c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (nVar.f2216a[i4] != nVar2.f2216a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == nVar.f2218c) {
                nVar = nVar.f;
                i = nVar.f2217b;
            } else {
                i = i4;
            }
            if (i3 == nVar2.f2218c) {
                nVar2 = nVar2.f;
                i2 = nVar2.f2217b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public int hashCode() {
        n nVar = this.f2185a;
        if (nVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = nVar.f2218c;
            for (int i3 = nVar.f2217b; i3 < i2; i3++) {
                i = (i * 31) + nVar.f2216a[i3];
            }
            nVar = nVar.f;
        } while (nVar != this.f2185a);
        return i;
    }

    public String toString() {
        return u().toString();
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f2186b == 0) {
            return cVar;
        }
        cVar.f2185a = new n(this.f2185a);
        n nVar = cVar.f2185a;
        n nVar2 = cVar.f2185a;
        n nVar3 = cVar.f2185a;
        nVar2.g = nVar3;
        nVar.f = nVar3;
        n nVar4 = this.f2185a;
        while (true) {
            nVar4 = nVar4.f;
            if (nVar4 != this.f2185a) {
                cVar.f2185a.g.a(new n(nVar4));
            } else {
                cVar.f2186b = this.f2186b;
                return cVar;
            }
        }
    }

    public f u() {
        if (this.f2186b > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f2186b);
        }
        return f((int) this.f2186b);
    }

    public f f(int i) {
        if (i == 0) {
            return f.f2190b;
        }
        return new p(this, i);
    }
}
