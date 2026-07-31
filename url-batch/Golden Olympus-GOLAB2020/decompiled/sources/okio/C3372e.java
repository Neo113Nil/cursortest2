package okio;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: okio.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3372e implements g, f, Cloneable, ByteChannel, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public w f43260b;

    /* renamed from: c, reason: collision with root package name */
    private long f43261c;

    /* renamed from: okio.e$a */
    public static final class a implements Closeable, AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        public C3372e f43262b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f43263c;

        /* renamed from: d, reason: collision with root package name */
        private w f43264d;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f43266f;

        /* renamed from: e, reason: collision with root package name */
        public long f43265e = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f43267g = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f43268h = -1;

        public final void J(w wVar) {
            this.f43264d = wVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f43262b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f43262b = null;
            J(null);
            this.f43265e = -1L;
            this.f43266f = null;
            this.f43267g = -1;
            this.f43268h = -1;
        }

        public final w m() {
            return this.f43264d;
        }

        public final int n() {
            long j4 = this.f43265e;
            C3372e c3372e = this.f43262b;
            Intrinsics.checkNotNull(c3372e);
            if (j4 == c3372e.l0()) {
                throw new IllegalStateException("no more bytes");
            }
            long j5 = this.f43265e;
            return p(j5 == -1 ? 0L : j5 + (this.f43268h - this.f43267g));
        }

        public final long o(long j4) {
            C3372e c3372e = this.f43262b;
            if (c3372e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f43263c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long l02 = c3372e.l0();
            if (j4 <= l02) {
                if (j4 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j4).toString());
                }
                long j5 = l02 - j4;
                while (true) {
                    if (j5 <= 0) {
                        break;
                    }
                    w wVar = c3372e.f43260b;
                    Intrinsics.checkNotNull(wVar);
                    w wVar2 = wVar.f43310g;
                    Intrinsics.checkNotNull(wVar2);
                    int i4 = wVar2.f43306c;
                    long j6 = i4 - wVar2.f43305b;
                    if (j6 > j5) {
                        wVar2.f43306c = i4 - ((int) j5);
                        break;
                    }
                    c3372e.f43260b = wVar2.b();
                    x.b(wVar2);
                    j5 -= j6;
                }
                J(null);
                this.f43265e = j4;
                this.f43266f = null;
                this.f43267g = -1;
                this.f43268h = -1;
            } else if (j4 > l02) {
                long j7 = j4 - l02;
                boolean z4 = true;
                while (j7 > 0) {
                    w o02 = c3372e.o0(1);
                    int min = (int) Math.min(j7, 8192 - o02.f43306c);
                    o02.f43306c += min;
                    j7 -= min;
                    if (z4) {
                        J(o02);
                        this.f43265e = l02;
                        this.f43266f = o02.f43304a;
                        int i5 = o02.f43306c;
                        this.f43267g = i5 - min;
                        this.f43268h = i5;
                        z4 = false;
                    }
                }
            }
            c3372e.k0(j4);
            return l02;
        }

        public final int p(long j4) {
            w wVar;
            C3372e c3372e = this.f43262b;
            if (c3372e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j4 < -1 || j4 > c3372e.l0()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j4 + " > size=" + c3372e.l0());
            }
            if (j4 == -1 || j4 == c3372e.l0()) {
                J(null);
                this.f43265e = j4;
                this.f43266f = null;
                this.f43267g = -1;
                this.f43268h = -1;
                return -1;
            }
            long l02 = c3372e.l0();
            w wVar2 = c3372e.f43260b;
            long j5 = 0;
            if (m() != null) {
                long j6 = this.f43265e;
                int i4 = this.f43267g;
                Intrinsics.checkNotNull(m());
                long j7 = j6 - (i4 - r9.f43305b);
                if (j7 > j4) {
                    wVar = wVar2;
                    wVar2 = m();
                    l02 = j7;
                } else {
                    wVar = m();
                    j5 = j7;
                }
            } else {
                wVar = wVar2;
            }
            if (l02 - j4 > j4 - j5) {
                while (true) {
                    Intrinsics.checkNotNull(wVar);
                    int i5 = wVar.f43306c;
                    int i6 = wVar.f43305b;
                    if (j4 < (i5 - i6) + j5) {
                        break;
                    }
                    j5 += i5 - i6;
                    wVar = wVar.f43309f;
                }
            } else {
                while (l02 > j4) {
                    Intrinsics.checkNotNull(wVar2);
                    wVar2 = wVar2.f43310g;
                    Intrinsics.checkNotNull(wVar2);
                    l02 -= wVar2.f43306c - wVar2.f43305b;
                }
                j5 = l02;
                wVar = wVar2;
            }
            if (this.f43263c) {
                Intrinsics.checkNotNull(wVar);
                if (wVar.f43307d) {
                    w f4 = wVar.f();
                    if (c3372e.f43260b == wVar) {
                        c3372e.f43260b = f4;
                    }
                    wVar = wVar.c(f4);
                    w wVar3 = wVar.f43310g;
                    Intrinsics.checkNotNull(wVar3);
                    wVar3.b();
                }
            }
            J(wVar);
            this.f43265e = j4;
            Intrinsics.checkNotNull(wVar);
            this.f43266f = wVar.f43304a;
            int i7 = wVar.f43305b + ((int) (j4 - j5));
            this.f43267g = i7;
            int i8 = wVar.f43306c;
            this.f43268h = i8;
            return i8 - i7;
        }
    }

    public static /* synthetic */ a d0(C3372e c3372e, a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = AbstractC3369b.d();
        }
        return c3372e.c0(aVar);
    }

    @Override // okio.g
    public String A(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long V3 = V((byte) 10, 0L, j5);
        if (V3 != -1) {
            return H2.a.d(this, V3);
        }
        if (j5 < l0() && U(j5 - 1) == 13 && U(j5) == 10) {
            return H2.a.d(this, j5);
        }
        C3372e c3372e = new C3372e();
        J(c3372e, 0L, Math.min(32, l0()));
        throw new EOFException("\\n not found: limit=" + Math.min(l0(), j4) + " content=" + c3372e.e0().l() + (char) 8230);
    }

    public C3372e A0(String string, int i4, int i5) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (i5 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + string.length()).toString());
        }
        while (i4 < i5) {
            char charAt2 = string.charAt(i4);
            if (charAt2 < 128) {
                w o02 = o0(1);
                byte[] bArr = o02.f43304a;
                int i6 = o02.f43306c - i4;
                int min = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                bArr[i4 + i6] = (byte) charAt2;
                while (true) {
                    i4 = i7;
                    if (i4 >= min || (charAt = string.charAt(i4)) >= 128) {
                        break;
                    }
                    i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) charAt;
                }
                int i8 = o02.f43306c;
                int i9 = (i6 + i4) - i8;
                o02.f43306c = i8 + i9;
                k0(l0() + i9);
            } else {
                if (charAt2 < 2048) {
                    w o03 = o0(2);
                    byte[] bArr2 = o03.f43304a;
                    int i10 = o03.f43306c;
                    bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    o03.f43306c = i10 + 2;
                    k0(l0() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    w o04 = o0(3);
                    byte[] bArr3 = o04.f43304a;
                    int i11 = o04.f43306c;
                    bArr3[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    bArr3[i11 + 2] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    o04.f43306c = i11 + 3;
                    k0(l0() + 3);
                } else {
                    int i12 = i4 + 1;
                    char charAt3 = i12 < i5 ? string.charAt(i12) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        w(63);
                        i4 = i12;
                    } else {
                        int i13 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        w o05 = o0(4);
                        byte[] bArr4 = o05.f43304a;
                        int i14 = o05.f43306c;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        o05.f43306c = i14 + 4;
                        k0(l0() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return this;
    }

    public C3372e B0(int i4) {
        if (i4 < 128) {
            w(i4);
            return this;
        }
        if (i4 < 2048) {
            w o02 = o0(2);
            byte[] bArr = o02.f43304a;
            int i5 = o02.f43306c;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            o02.f43306c = i5 + 2;
            k0(l0() + 2);
            return this;
        }
        if (55296 <= i4 && i4 < 57344) {
            w(63);
            return this;
        }
        if (i4 < 65536) {
            w o03 = o0(3);
            byte[] bArr2 = o03.f43304a;
            int i6 = o03.f43306c;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            o03.f43306c = i6 + 3;
            k0(l0() + 3);
            return this;
        }
        if (i4 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC3369b.k(i4));
        }
        w o04 = o0(4);
        byte[] bArr3 = o04.f43304a;
        int i7 = o04.f43306c;
        bArr3[i7] = (byte) ((i4 >> 18) | 240);
        bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
        bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
        bArr3[i7 + 3] = (byte) ((i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
        o04.f43306c = i7 + 4;
        k0(l0() + 4);
        return this;
    }

    @Override // okio.g
    public boolean D(long j4, h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return a0(j4, bytes, 0, bytes.v());
    }

    @Override // okio.g
    public String E(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return h0(this.f43261c, charset);
    }

    @Override // okio.f
    public long F(B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j4;
            }
            j4 += read;
        }
    }

    @Override // okio.g
    public void H(long j4) {
        while (j4 > 0) {
            w wVar = this.f43260b;
            if (wVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, wVar.f43306c - wVar.f43305b);
            long j5 = min;
            k0(l0() - j5);
            j4 -= j5;
            int i4 = wVar.f43305b + min;
            wVar.f43305b = i4;
            if (i4 == wVar.f43306c) {
                this.f43260b = wVar.b();
                x.b(wVar);
            }
        }
    }

    @Override // okio.g
    public String I() {
        return A(Long.MAX_VALUE);
    }

    public final C3372e J(C3372e out, long j4, long j5) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j6 = j4;
        AbstractC3369b.b(l0(), j6, j5);
        if (j5 != 0) {
            out.k0(out.l0() + j5);
            w wVar = this.f43260b;
            while (true) {
                Intrinsics.checkNotNull(wVar);
                int i4 = wVar.f43306c;
                int i5 = wVar.f43305b;
                if (j6 < i4 - i5) {
                    break;
                }
                j6 -= i4 - i5;
                wVar = wVar.f43309f;
            }
            w wVar2 = wVar;
            long j7 = j5;
            while (j7 > 0) {
                Intrinsics.checkNotNull(wVar2);
                w d4 = wVar2.d();
                int i6 = d4.f43305b + ((int) j6);
                d4.f43305b = i6;
                d4.f43306c = Math.min(i6 + ((int) j7), d4.f43306c);
                w wVar3 = out.f43260b;
                if (wVar3 == null) {
                    d4.f43310g = d4;
                    d4.f43309f = d4;
                    out.f43260b = d4;
                } else {
                    Intrinsics.checkNotNull(wVar3);
                    w wVar4 = wVar3.f43310g;
                    Intrinsics.checkNotNull(wVar4);
                    wVar4.c(d4);
                }
                j7 -= d4.f43306c - d4.f43305b;
                wVar2 = wVar2.f43309f;
                j6 = 0;
            }
        }
        return this;
    }

    @Override // okio.g
    public byte[] K(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (l0() < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.f
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public C3372e r() {
        return this;
    }

    @Override // okio.g
    public void O(long j4) {
        if (this.f43261c < j4) {
            throw new EOFException();
        }
    }

    @Override // okio.f
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C3372e y() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // okio.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long R() {
        int i4;
        if (l0() == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z4 = false;
        long j4 = 0;
        do {
            w wVar = this.f43260b;
            Intrinsics.checkNotNull(wVar);
            byte[] bArr = wVar.f43304a;
            int i6 = wVar.f43305b;
            int i7 = wVar.f43306c;
            while (i6 < i7) {
                byte b4 = bArr[i6];
                if (b4 >= 48 && b4 <= 57) {
                    i4 = b4 - 48;
                } else if (b4 >= 97 && b4 <= 102) {
                    i4 = b4 - 87;
                } else if (b4 >= 65 && b4 <= 70) {
                    i4 = b4 - 55;
                } else {
                    if (i5 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC3369b.j(b4));
                    }
                    z4 = true;
                    if (i6 != i7) {
                        this.f43260b = wVar.b();
                        x.b(wVar);
                    } else {
                        wVar.f43305b = i6;
                    }
                    if (!z4) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    throw new NumberFormatException("Number too large: " + new C3372e().G(j4).w(b4).i0());
                }
                j4 = (j4 << 4) | i4;
                i6++;
                i5++;
            }
            if (i6 != i7) {
            }
            if (!z4) {
            }
        } while (this.f43260b != null);
        k0(l0() - i5);
        return j4;
    }

    @Override // okio.g
    public InputStream S() {
        return new b();
    }

    @Override // okio.g
    public int T(s options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int f4 = H2.a.f(this, options, false, 2, null);
        if (f4 == -1) {
            return -1;
        }
        H(options.e()[f4].v());
        return f4;
    }

    public final byte U(long j4) {
        AbstractC3369b.b(l0(), j4, 1L);
        w wVar = this.f43260b;
        if (wVar == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (l0() - j4 < j4) {
            long l02 = l0();
            while (l02 > j4) {
                wVar = wVar.f43310g;
                Intrinsics.checkNotNull(wVar);
                l02 -= wVar.f43306c - wVar.f43305b;
            }
            Intrinsics.checkNotNull(wVar);
            return wVar.f43304a[(int) ((wVar.f43305b + j4) - l02)];
        }
        long j5 = 0;
        while (true) {
            long j6 = (wVar.f43306c - wVar.f43305b) + j5;
            if (j6 > j4) {
                Intrinsics.checkNotNull(wVar);
                return wVar.f43304a[(int) ((wVar.f43305b + j4) - j5)];
            }
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j5 = j6;
        }
    }

    public long V(byte b4, long j4, long j5) {
        w wVar;
        int i4;
        long j6 = 0;
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("size=" + l0() + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        if (j5 > l0()) {
            j5 = l0();
        }
        if (j4 == j5 || (wVar = this.f43260b) == null) {
            return -1L;
        }
        if (l0() - j4 < j4) {
            j6 = l0();
            while (j6 > j4) {
                wVar = wVar.f43310g;
                Intrinsics.checkNotNull(wVar);
                j6 -= wVar.f43306c - wVar.f43305b;
            }
            while (j6 < j5) {
                byte[] bArr = wVar.f43304a;
                int min = (int) Math.min(wVar.f43306c, (wVar.f43305b + j5) - j6);
                i4 = (int) ((wVar.f43305b + j4) - j6);
                while (i4 < min) {
                    if (bArr[i4] != b4) {
                        i4++;
                    }
                }
                j6 += wVar.f43306c - wVar.f43305b;
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                j4 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (wVar.f43306c - wVar.f43305b) + j6;
            if (j7 > j4) {
                break;
            }
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j6 = j7;
        }
        while (j6 < j5) {
            byte[] bArr2 = wVar.f43304a;
            int min2 = (int) Math.min(wVar.f43306c, (wVar.f43305b + j5) - j6);
            i4 = (int) ((wVar.f43305b + j4) - j6);
            while (i4 < min2) {
                if (bArr2[i4] != b4) {
                    i4++;
                }
            }
            j6 += wVar.f43306c - wVar.f43305b;
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j4 = j6;
        }
        return -1L;
        return (i4 - wVar.f43305b) + j6;
    }

    public long W(h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return X(bytes, 0L);
    }

    public long X(h bytes, long j4) {
        int i4;
        long j5 = j4;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.v() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j6 = 0;
        if (j5 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
        }
        w wVar = this.f43260b;
        if (wVar == null) {
            return -1L;
        }
        if (l0() - j5 >= j5) {
            while (true) {
                long j7 = (wVar.f43306c - wVar.f43305b) + j6;
                if (j7 > j5) {
                    break;
                }
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                j6 = j7;
            }
            byte[] m4 = bytes.m();
            byte b4 = m4[0];
            int v4 = bytes.v();
            long l02 = (l0() - v4) + 1;
            while (j6 < l02) {
                byte[] bArr = wVar.f43304a;
                int min = (int) Math.min(wVar.f43306c, (wVar.f43305b + l02) - j6);
                i4 = (int) ((wVar.f43305b + j5) - j6);
                while (i4 < min) {
                    if (bArr[i4] == b4 && H2.a.c(wVar, i4 + 1, m4, 1, v4)) {
                    }
                    i4++;
                }
                j6 += wVar.f43306c - wVar.f43305b;
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                j5 = j6;
            }
            return -1L;
        }
        j6 = l0();
        while (j6 > j5) {
            wVar = wVar.f43310g;
            Intrinsics.checkNotNull(wVar);
            j6 -= wVar.f43306c - wVar.f43305b;
        }
        byte[] m5 = bytes.m();
        byte b5 = m5[0];
        int v5 = bytes.v();
        long l03 = (l0() - v5) + 1;
        while (j6 < l03) {
            byte[] bArr2 = wVar.f43304a;
            long j8 = l03;
            int min2 = (int) Math.min(wVar.f43306c, (wVar.f43305b + l03) - j6);
            i4 = (int) ((wVar.f43305b + j5) - j6);
            while (i4 < min2) {
                if (bArr2[i4] != b5 || !H2.a.c(wVar, i4 + 1, m5, 1, v5)) {
                    i4++;
                }
            }
            j6 += wVar.f43306c - wVar.f43305b;
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j5 = j6;
            l03 = j8;
        }
        return -1L;
        return (i4 - wVar.f43305b) + j6;
    }

    public long Y(h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return Z(targetBytes, 0L);
    }

    public long Z(h targetBytes, long j4) {
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j5 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        w wVar = this.f43260b;
        if (wVar == null) {
            return -1L;
        }
        if (l0() - j4 < j4) {
            j5 = l0();
            while (j5 > j4) {
                wVar = wVar.f43310g;
                Intrinsics.checkNotNull(wVar);
                j5 -= wVar.f43306c - wVar.f43305b;
            }
            if (targetBytes.v() == 2) {
                byte g4 = targetBytes.g(0);
                byte g5 = targetBytes.g(1);
                while (j5 < l0()) {
                    byte[] bArr = wVar.f43304a;
                    i4 = (int) ((wVar.f43305b + j4) - j5);
                    int i6 = wVar.f43306c;
                    while (i4 < i6) {
                        byte b4 = bArr[i4];
                        if (b4 != g4 && b4 != g5) {
                            i4++;
                        }
                        i5 = wVar.f43305b;
                    }
                    j5 += wVar.f43306c - wVar.f43305b;
                    wVar = wVar.f43309f;
                    Intrinsics.checkNotNull(wVar);
                    j4 = j5;
                }
            } else {
                byte[] m4 = targetBytes.m();
                while (j5 < l0()) {
                    byte[] bArr2 = wVar.f43304a;
                    i4 = (int) ((wVar.f43305b + j4) - j5);
                    int i7 = wVar.f43306c;
                    while (i4 < i7) {
                        byte b5 = bArr2[i4];
                        for (byte b6 : m4) {
                            if (b5 == b6) {
                                i5 = wVar.f43305b;
                            }
                        }
                        i4++;
                    }
                    j5 += wVar.f43306c - wVar.f43305b;
                    wVar = wVar.f43309f;
                    Intrinsics.checkNotNull(wVar);
                    j4 = j5;
                }
            }
            return -1L;
        }
        while (true) {
            long j6 = (wVar.f43306c - wVar.f43305b) + j5;
            if (j6 > j4) {
                break;
            }
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j5 = j6;
        }
        if (targetBytes.v() == 2) {
            byte g6 = targetBytes.g(0);
            byte g7 = targetBytes.g(1);
            while (j5 < l0()) {
                byte[] bArr3 = wVar.f43304a;
                i4 = (int) ((wVar.f43305b + j4) - j5);
                int i8 = wVar.f43306c;
                while (i4 < i8) {
                    byte b7 = bArr3[i4];
                    if (b7 != g6 && b7 != g7) {
                        i4++;
                    }
                    i5 = wVar.f43305b;
                }
                j5 += wVar.f43306c - wVar.f43305b;
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                j4 = j5;
            }
        } else {
            byte[] m5 = targetBytes.m();
            while (j5 < l0()) {
                byte[] bArr4 = wVar.f43304a;
                i4 = (int) ((wVar.f43305b + j4) - j5);
                int i9 = wVar.f43306c;
                while (i4 < i9) {
                    byte b8 = bArr4[i4];
                    for (byte b9 : m5) {
                        if (b8 == b9) {
                            i5 = wVar.f43305b;
                        }
                    }
                    i4++;
                }
                j5 += wVar.f43306c - wVar.f43305b;
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                j4 = j5;
            }
        }
        return -1L;
        return (i4 - i5) + j5;
    }

    public boolean a0(long j4, h bytes, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j4 < 0 || i4 < 0 || i5 < 0 || l0() - j4 < i5 || bytes.v() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (U(i6 + j4) != bytes.g(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public int b0(byte[] sink, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC3369b.b(sink.length, i4, i5);
        w wVar = this.f43260b;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i5, wVar.f43306c - wVar.f43305b);
        byte[] bArr = wVar.f43304a;
        int i6 = wVar.f43305b;
        AbstractC3219i.f(bArr, sink, i4, i6, i6 + min);
        wVar.f43305b += min;
        k0(l0() - min);
        if (wVar.f43305b == wVar.f43306c) {
            this.f43260b = wVar.b();
            x.b(wVar);
        }
        return min;
    }

    public final a c0(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return H2.a.a(this, unsafeCursor);
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.g
    public h d(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (l0() < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new h(K(j4));
        }
        h n02 = n0((int) j4);
        H(j4);
        return n02;
    }

    public h e0() {
        return d(l0());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3372e)) {
            return false;
        }
        C3372e c3372e = (C3372e) obj;
        if (l0() != c3372e.l0()) {
            return false;
        }
        if (l0() == 0) {
            return true;
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        w wVar2 = c3372e.f43260b;
        Intrinsics.checkNotNull(wVar2);
        int i4 = wVar.f43305b;
        int i5 = wVar2.f43305b;
        long j4 = 0;
        while (j4 < l0()) {
            long min = Math.min(wVar.f43306c - i4, wVar2.f43306c - i5);
            long j5 = 0;
            while (j5 < min) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (wVar.f43304a[i4] != wVar2.f43304a[i5]) {
                    return false;
                }
                j5++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == wVar.f43306c) {
                wVar = wVar.f43309f;
                Intrinsics.checkNotNull(wVar);
                i4 = wVar.f43305b;
            }
            if (i5 == wVar2.f43306c) {
                wVar2 = wVar2.f43309f;
                Intrinsics.checkNotNull(wVar2);
                i5 = wVar2.f43305b;
            }
            j4 += min;
        }
        return true;
    }

    public int f0() {
        return AbstractC3369b.h(readInt());
    }

    @Override // okio.f, okio.z, java.io.Flushable
    public void flush() {
    }

    public short g0() {
        return AbstractC3369b.i(readShort());
    }

    public String h0(long j4, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f43261c < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43305b;
        if (i4 + j4 > wVar.f43306c) {
            return new String(K(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(wVar.f43304a, i4, i5, charset);
        int i6 = wVar.f43305b + i5;
        wVar.f43305b = i6;
        this.f43261c -= j4;
        if (i6 == wVar.f43306c) {
            this.f43260b = wVar.b();
            x.b(wVar);
        }
        return str;
    }

    public int hashCode() {
        w wVar = this.f43260b;
        if (wVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = wVar.f43306c;
            for (int i6 = wVar.f43305b; i6 < i5; i6++) {
                i4 = (i4 * 31) + wVar.f43304a[i6];
            }
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
        } while (wVar != this.f43260b);
        return i4;
    }

    public String i0() {
        return h0(this.f43261c, Charsets.UTF_8);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String j0(long j4) {
        return h0(j4, Charsets.UTF_8);
    }

    public final void k0(long j4) {
        this.f43261c = j4;
    }

    public final long l0() {
        return this.f43261c;
    }

    public final void m() {
        H(l0());
    }

    public final h m0() {
        if (l0() <= 2147483647L) {
            return n0((int) l0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + l0()).toString());
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3372e clone() {
        return p();
    }

    public final h n0(int i4) {
        if (i4 == 0) {
            return h.f43271f;
        }
        AbstractC3369b.b(l0(), 0L, i4);
        w wVar = this.f43260b;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Intrinsics.checkNotNull(wVar);
            int i8 = wVar.f43306c;
            int i9 = wVar.f43305b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            wVar = wVar.f43309f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        w wVar2 = this.f43260b;
        int i10 = 0;
        while (i5 < i4) {
            Intrinsics.checkNotNull(wVar2);
            bArr[i10] = wVar2.f43304a;
            i5 += wVar2.f43306c - wVar2.f43305b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = wVar2.f43305b;
            wVar2.f43307d = true;
            i10++;
            wVar2 = wVar2.f43309f;
        }
        return new y(bArr, iArr);
    }

    public final long o() {
        long l02 = l0();
        if (l02 == 0) {
            return 0L;
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        w wVar2 = wVar.f43310g;
        Intrinsics.checkNotNull(wVar2);
        return (wVar2.f43306c >= 8192 || !wVar2.f43308e) ? l02 : l02 - (r3 - wVar2.f43305b);
    }

    public final w o0(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w wVar = this.f43260b;
        if (wVar != null) {
            Intrinsics.checkNotNull(wVar);
            w wVar2 = wVar.f43310g;
            Intrinsics.checkNotNull(wVar2);
            return (wVar2.f43306c + i4 > 8192 || !wVar2.f43308e) ? wVar2.c(x.c()) : wVar2;
        }
        w c4 = x.c();
        this.f43260b = c4;
        c4.f43310g = c4;
        c4.f43309f = c4;
        return c4;
    }

    public final C3372e p() {
        C3372e c3372e = new C3372e();
        if (l0() == 0) {
            return c3372e;
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        w d4 = wVar.d();
        c3372e.f43260b = d4;
        d4.f43310g = d4;
        d4.f43309f = d4;
        for (w wVar2 = wVar.f43309f; wVar2 != wVar; wVar2 = wVar2.f43309f) {
            w wVar3 = d4.f43310g;
            Intrinsics.checkNotNull(wVar3);
            Intrinsics.checkNotNull(wVar2);
            wVar3.c(wVar2.d());
        }
        c3372e.k0(l0());
        return c3372e;
    }

    @Override // okio.f
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C3372e M(h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.z(this, 0, byteString.v());
        return this;
    }

    @Override // okio.g, okio.f
    public C3372e q() {
        return this;
    }

    @Override // okio.f
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C3372e L(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.f
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C3372e write(byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = i5;
        AbstractC3369b.b(source.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            w o02 = o0(1);
            int min = Math.min(i6 - i4, 8192 - o02.f43306c);
            int i7 = i4 + min;
            AbstractC3219i.f(source, o02.f43304a, o02.f43306c, i4, i7);
            o02.f43306c += min;
            i4 = i7;
        }
        k0(l0() + j4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        w wVar = this.f43260b;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), wVar.f43306c - wVar.f43305b);
        sink.put(wVar.f43304a, wVar.f43305b, min);
        int i4 = wVar.f43305b + min;
        wVar.f43305b = i4;
        this.f43261c -= min;
        if (i4 == wVar.f43306c) {
            this.f43260b = wVar.b();
            x.b(wVar);
        }
        return min;
    }

    @Override // okio.g
    public byte readByte() {
        if (l0() == 0) {
            throw new EOFException();
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43305b;
        int i5 = wVar.f43306c;
        int i6 = i4 + 1;
        byte b4 = wVar.f43304a[i4];
        k0(l0() - 1);
        if (i6 != i5) {
            wVar.f43305b = i6;
            return b4;
        }
        this.f43260b = wVar.b();
        x.b(wVar);
        return b4;
    }

    @Override // okio.g
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i4 = 0;
        while (i4 < sink.length) {
            int b02 = b0(sink, i4, sink.length - i4);
            if (b02 == -1) {
                throw new EOFException();
            }
            i4 += b02;
        }
    }

    @Override // okio.g
    public int readInt() {
        if (l0() < 4) {
            throw new EOFException();
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43305b;
        int i5 = wVar.f43306c;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = wVar.f43304a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = (bArr[i6] & 255) | i7;
        k0(l0() - 4);
        if (i8 != i5) {
            wVar.f43305b = i8;
            return i9;
        }
        this.f43260b = wVar.b();
        x.b(wVar);
        return i9;
    }

    @Override // okio.g
    public long readLong() {
        if (l0() < 8) {
            throw new EOFException();
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43305b;
        int i5 = wVar.f43306c;
        if (i5 - i4 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = wVar.f43304a;
        int i6 = i4 + 7;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        int i7 = i4 + 8;
        long j5 = j4 | (bArr[i6] & 255);
        k0(l0() - 8);
        if (i7 != i5) {
            wVar.f43305b = i7;
            return j5;
        }
        this.f43260b = wVar.b();
        x.b(wVar);
        return j5;
    }

    @Override // okio.g
    public short readShort() {
        if (l0() < 2) {
            throw new EOFException();
        }
        w wVar = this.f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43305b;
        int i5 = wVar.f43306c;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = wVar.f43304a;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i8 = i4 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        k0(l0() - 2);
        if (i8 == i5) {
            this.f43260b = wVar.b();
            x.b(wVar);
        } else {
            wVar.f43305b = i8;
        }
        return (short) i9;
    }

    @Override // okio.f
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C3372e w(int i4) {
        w o02 = o0(1);
        byte[] bArr = o02.f43304a;
        int i5 = o02.f43306c;
        o02.f43306c = i5 + 1;
        bArr[i5] = (byte) i4;
        k0(l0() + 1);
        return this;
    }

    @Override // okio.f
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C3372e P(long j4) {
        boolean z4;
        if (j4 == 0) {
            return w(48);
        }
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return C("-9223372036854775808");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (j4 >= 100000000) {
            i4 = j4 < 1000000000000L ? j4 < 10000000000L ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= 10000) {
            i4 = j4 < 1000000 ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
        } else if (j4 >= 100) {
            i4 = j4 < 1000 ? 3 : 4;
        } else if (j4 >= 10) {
            i4 = 2;
        }
        if (z4) {
            i4++;
        }
        w o02 = o0(i4);
        byte[] bArr = o02.f43304a;
        int i5 = o02.f43306c + i4;
        while (j4 != 0) {
            long j5 = 10;
            i5--;
            bArr[i5] = H2.a.b()[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z4) {
            bArr[i5 - 1] = 45;
        }
        o02.f43306c += i4;
        k0(l0() + i4);
        return this;
    }

    @Override // okio.B
    public C timeout() {
        return C.NONE;
    }

    public String toString() {
        return m0().toString();
    }

    @Override // okio.g
    public byte[] u() {
        return K(l0());
    }

    @Override // okio.f
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C3372e G(long j4) {
        if (j4 == 0) {
            return w(48);
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i4 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        w o02 = o0(i4);
        byte[] bArr = o02.f43304a;
        int i5 = o02.f43306c;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = H2.a.b()[(int) (15 & j4)];
            j4 >>>= 4;
        }
        o02.f43306c += i4;
        k0(l0() + i4);
        return this;
    }

    @Override // okio.g
    public boolean v() {
        return this.f43261c == 0;
    }

    @Override // okio.f
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public C3372e t(int i4) {
        w o02 = o0(4);
        byte[] bArr = o02.f43304a;
        int i5 = o02.f43306c;
        bArr[i5] = (byte) ((i4 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 3] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        o02.f43306c = i5 + 4;
        k0(l0() + 4);
        return this;
    }

    public C3372e w0(long j4) {
        w o02 = o0(8);
        byte[] bArr = o02.f43304a;
        int i4 = o02.f43306c;
        bArr[i4] = (byte) ((j4 >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((j4 >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((j4 >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((j4 >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((j4 >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((j4 >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((j4 >>> 8) & 255);
        bArr[i4 + 7] = (byte) (j4 & 255);
        o02.f43306c = i4 + 8;
        k0(l0() + 8);
        return this;
    }

    @Override // okio.g
    public void x(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (l0() >= j4) {
            sink.write(this, j4);
        } else {
            sink.write(this, l0());
            throw new EOFException();
        }
    }

    @Override // okio.f
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C3372e s(int i4) {
        w o02 = o0(2);
        byte[] bArr = o02.f43304a;
        int i5 = o02.f43306c;
        bArr[i5] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 1] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        o02.f43306c = i5 + 2;
        k0(l0() + 2);
        return this;
    }

    public C3372e y0(String string, int i4, int i5, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (i5 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return A0(string, i4, i5);
        }
        String substring = string.substring(i4, i5);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        k0(l0() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (l0() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + okio.AbstractC3369b.j(U(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r14 = 1;
     */
    @Override // okio.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long z() {
        long j4;
        byte b4;
        long j5 = 0;
        if (l0() == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z4 = false;
        long j6 = 0;
        long j7 = -7;
        boolean z5 = false;
        loop0: while (true) {
            w wVar = this.f43260b;
            Intrinsics.checkNotNull(wVar);
            byte[] bArr = wVar.f43304a;
            int i5 = wVar.f43305b;
            int i6 = wVar.f43306c;
            while (i5 < i6) {
                b4 = bArr[i5];
                if (b4 >= 48 && b4 <= 57) {
                    int i7 = 48 - b4;
                    if (j6 < -922337203685477580L) {
                        break loop0;
                    }
                    j4 = j5;
                    if (j6 == -922337203685477580L && i7 < j7) {
                        break loop0;
                    }
                    j6 = (j6 * 10) + i7;
                } else {
                    j4 = j5;
                    if (b4 != 45 || i4 != 0) {
                        z5 = true;
                        break;
                    }
                    j7--;
                    z4 = true;
                }
                i5++;
                i4++;
                j5 = j4;
            }
            j4 = j5;
            if (i5 == i6) {
                this.f43260b = wVar.b();
                x.b(wVar);
            } else {
                wVar.f43305b = i5;
            }
            if (z5 || this.f43260b == null) {
                break;
            }
            j5 = j4;
        }
        C3372e w4 = new C3372e().P(j6).w(b4);
        if (!z4) {
            w4.readByte();
        }
        throw new NumberFormatException("Number too large: " + w4.i0());
    }

    @Override // okio.f
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C3372e C(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return A0(string, 0, string.length());
    }

    /* renamed from: okio.e$b */
    public static final class b extends InputStream implements AutoCloseable {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3372e.this.l0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C3372e.this.l0() > 0) {
                return C3372e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C3372e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i4, int i5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C3372e.this.b0(sink, i4, i5);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            w o02 = o0(1);
            int min = Math.min(i4, 8192 - o02.f43306c);
            source.get(o02.f43304a, o02.f43306c, min);
            i4 -= min;
            o02.f43306c += min;
        }
        this.f43261c += remaining;
        return remaining;
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        w wVar;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            AbstractC3369b.b(source.l0(), 0L, j4);
            while (j4 > 0) {
                w wVar2 = source.f43260b;
                Intrinsics.checkNotNull(wVar2);
                int i4 = wVar2.f43306c;
                Intrinsics.checkNotNull(source.f43260b);
                if (j4 < i4 - r1.f43305b) {
                    w wVar3 = this.f43260b;
                    if (wVar3 != null) {
                        Intrinsics.checkNotNull(wVar3);
                        wVar = wVar3.f43310g;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null && wVar.f43308e) {
                        if ((wVar.f43306c + j4) - (wVar.f43307d ? 0 : wVar.f43305b) <= 8192) {
                            w wVar4 = source.f43260b;
                            Intrinsics.checkNotNull(wVar4);
                            wVar4.g(wVar, (int) j4);
                            source.k0(source.l0() - j4);
                            k0(l0() + j4);
                            return;
                        }
                    }
                    w wVar5 = source.f43260b;
                    Intrinsics.checkNotNull(wVar5);
                    source.f43260b = wVar5.e((int) j4);
                }
                w wVar6 = source.f43260b;
                Intrinsics.checkNotNull(wVar6);
                long j5 = wVar6.f43306c - wVar6.f43305b;
                source.f43260b = wVar6.b();
                w wVar7 = this.f43260b;
                if (wVar7 == null) {
                    this.f43260b = wVar6;
                    wVar6.f43310g = wVar6;
                    wVar6.f43309f = wVar6;
                } else {
                    Intrinsics.checkNotNull(wVar7);
                    w wVar8 = wVar7.f43310g;
                    Intrinsics.checkNotNull(wVar8);
                    wVar8.c(wVar6).a();
                }
                source.k0(source.l0() - j5);
                k0(l0() + j5);
                j4 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (l0() == 0) {
            return -1L;
        }
        if (j4 > l0()) {
            j4 = l0();
        }
        sink.write(this, j4);
        return j4;
    }
}
