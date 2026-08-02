package T3;

import E.AbstractC0005f;
import a.AbstractC0124a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f2974a;

    /* renamed from: b, reason: collision with root package name */
    public long f2975b;

    public final void A(int i4) {
        q t4 = t(2);
        byte[] bArr = t4.f2997a;
        int i5 = t4.f2999c;
        bArr[i5] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 1] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        t4.f2999c = i5 + 2;
        this.f2975b += 2;
    }

    public final void B(int i4, int i5, String string) {
        char charAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "beginIndex < 0: ").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(AbstractC0005f.i(i5, i4, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i5 > string.length()) {
            StringBuilder r4 = AbstractC0005f.r(i5, "endIndex > string.length: ", " > ");
            r4.append(string.length());
            throw new IllegalArgumentException(r4.toString().toString());
        }
        while (i4 < i5) {
            char charAt2 = string.charAt(i4);
            if (charAt2 < 128) {
                q t4 = t(1);
                byte[] bArr = t4.f2997a;
                int i6 = t4.f2999c - i4;
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
                int i8 = t4.f2999c;
                int i9 = (i6 + i4) - i8;
                t4.f2999c = i8 + i9;
                this.f2975b += i9;
            } else {
                if (charAt2 < 2048) {
                    q t5 = t(2);
                    byte[] bArr2 = t5.f2997a;
                    int i10 = t5.f2999c;
                    bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                    t5.f2999c = i10 + 2;
                    this.f2975b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q t6 = t(3);
                    byte[] bArr3 = t6.f2997a;
                    int i11 = t6.f2999c;
                    bArr3[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                    t6.f2999c = i11 + 3;
                    this.f2975b += 3;
                } else {
                    int i12 = i4 + 1;
                    char charAt3 = i12 < i5 ? string.charAt(i12) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        x(63);
                        i4 = i12;
                    } else {
                        int i13 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q t7 = t(4);
                        byte[] bArr4 = t7.f2997a;
                        int i14 = t7.f2999c;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        t7.f2999c = i14 + 4;
                        this.f2975b += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    public final void C(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        B(0, string.length(), string);
    }

    public final void D(int i4) {
        String str;
        if (i4 < 128) {
            x(i4);
            return;
        }
        if (i4 < 2048) {
            q t4 = t(2);
            byte[] bArr = t4.f2997a;
            int i5 = t4.f2999c;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            t4.f2999c = i5 + 2;
            this.f2975b += 2;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            x(63);
            return;
        }
        if (i4 < 65536) {
            q t5 = t(3);
            byte[] bArr2 = t5.f2997a;
            int i6 = t5.f2999c;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            t5.f2999c = i6 + 3;
            this.f2975b += 3;
            return;
        }
        if (i4 <= 1114111) {
            q t6 = t(4);
            byte[] bArr3 = t6.f2997a;
            int i7 = t6.f2999c;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            t6.f2999c = i7 + 4;
            this.f2975b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i4 != 0) {
            char[] cArr = U3.b.f3114a;
            char[] cArr2 = {cArr[(i4 >> 28) & 15], cArr[(i4 >> 24) & 15], cArr[(i4 >> 20) & 15], cArr[(i4 >> 16) & 15], cArr[(i4 >> 12) & 15], cArr[(i4 >> 8) & 15], cArr[(i4 >> 4) & 15], cArr[i4 & 15]};
            int i8 = 0;
            while (i8 < 8 && cArr2[i8] == '0') {
                i8++;
            }
            if (i8 < 0) {
                throw new IndexOutOfBoundsException(AbstractC0005f.k(i8, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i8 > 8) {
                throw new IllegalArgumentException(AbstractC0005f.k(i8, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i8, 8 - i8);
        } else {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(g out, long j4, long j5) {
        kotlin.jvm.internal.i.e(out, "out");
        long j6 = j4;
        AbstractC0124a.p(this.f2975b, j6, j5);
        if (j5 == 0) {
            return;
        }
        out.f2975b += j5;
        q qVar = this.f2974a;
        while (true) {
            kotlin.jvm.internal.i.b(qVar);
            long j7 = qVar.f2999c - qVar.f2998b;
            if (j6 < j7) {
                break;
            }
            j6 -= j7;
            qVar = qVar.f3002f;
        }
        q qVar2 = qVar;
        long j8 = j5;
        while (j8 > 0) {
            kotlin.jvm.internal.i.b(qVar2);
            q c4 = qVar2.c();
            int i4 = c4.f2998b + ((int) j6);
            c4.f2998b = i4;
            c4.f2999c = Math.min(i4 + ((int) j8), c4.f2999c);
            q qVar3 = out.f2974a;
            if (qVar3 == null) {
                c4.f3003g = c4;
                c4.f3002f = c4;
                out.f2974a = c4;
            } else {
                q qVar4 = qVar3.f3003g;
                kotlin.jvm.internal.i.b(qVar4);
                qVar4.b(c4);
            }
            j8 -= c4.f2999c - c4.f2998b;
            qVar2 = qVar2.f3002f;
            j6 = 0;
        }
    }

    public final boolean b() {
        return this.f2975b == 0;
    }

    @Override // T3.i
    public final j c(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2975b < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new j(k(j4));
        }
        j s4 = s((int) j4);
        skip(j4);
        return s4;
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f2975b == 0) {
            return gVar;
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        q c4 = qVar.c();
        gVar.f2974a = c4;
        c4.f3003g = c4;
        c4.f3002f = c4;
        for (q qVar2 = qVar.f3002f; qVar2 != qVar; qVar2 = qVar2.f3002f) {
            q qVar3 = c4.f3003g;
            kotlin.jvm.internal.i.b(qVar3);
            kotlin.jvm.internal.i.b(qVar2);
            qVar3.b(qVar2.c());
        }
        gVar.f2975b = this.f2975b;
        return gVar;
    }

    @Override // T3.v
    public final x d() {
        return x.f3010d;
    }

    public final byte e(long j4) {
        AbstractC0124a.p(this.f2975b, j4, 1L);
        q qVar = this.f2974a;
        if (qVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j5 = this.f2975b;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                qVar = qVar.f3003g;
                kotlin.jvm.internal.i.b(qVar);
                j5 -= qVar.f2999c - qVar.f2998b;
            }
            return qVar.f2997a[(int) ((qVar.f2998b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i4 = qVar.f2999c;
            int i5 = qVar.f2998b;
            long j7 = (i4 - i5) + j6;
            if (j7 > j4) {
                return qVar.f2997a[(int) ((i5 + j4) - j6)];
            }
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
            j6 = j7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        long j4 = this.f2975b;
        g gVar = (g) obj;
        if (j4 != gVar.f2975b) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        q qVar2 = gVar.f2974a;
        kotlin.jvm.internal.i.b(qVar2);
        int i4 = qVar.f2998b;
        int i5 = qVar2.f2998b;
        long j5 = 0;
        while (j5 < this.f2975b) {
            long min = Math.min(qVar.f2999c - i4, qVar2.f2999c - i5);
            long j6 = 0;
            while (j6 < min) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (qVar.f2997a[i4] != qVar2.f2997a[i5]) {
                    return false;
                }
                j6++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == qVar.f2999c) {
                qVar = qVar.f3002f;
                kotlin.jvm.internal.i.b(qVar);
                i4 = qVar.f2998b;
            }
            if (i5 == qVar2.f2999c) {
                qVar2 = qVar2.f3002f;
                kotlin.jvm.internal.i.b(qVar2);
                i5 = qVar2.f2998b;
            }
            j5 += min;
        }
        return true;
    }

    public final long f(byte b4, long j4, long j5) {
        q qVar;
        long j6 = 0;
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("size=" + this.f2975b + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        long j7 = this.f2975b;
        if (j5 > j7) {
            j5 = j7;
        }
        if (j4 == j5 || (qVar = this.f2974a) == null) {
            return -1L;
        }
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                qVar = qVar.f3003g;
                kotlin.jvm.internal.i.b(qVar);
                j7 -= qVar.f2999c - qVar.f2998b;
            }
            while (j7 < j5) {
                byte[] bArr = qVar.f2997a;
                int min = (int) Math.min(qVar.f2999c, (qVar.f2998b + j5) - j7);
                for (int i4 = (int) ((qVar.f2998b + j4) - j7); i4 < min; i4++) {
                    if (bArr[i4] == b4) {
                        return (i4 - qVar.f2998b) + j7;
                    }
                }
                j7 += qVar.f2999c - qVar.f2998b;
                qVar = qVar.f3002f;
                kotlin.jvm.internal.i.b(qVar);
                j4 = j7;
            }
            return -1L;
        }
        while (true) {
            long j8 = (qVar.f2999c - qVar.f2998b) + j6;
            if (j8 > j4) {
                break;
            }
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
            j6 = j8;
        }
        while (j6 < j5) {
            byte[] bArr2 = qVar.f2997a;
            int min2 = (int) Math.min(qVar.f2999c, (qVar.f2998b + j5) - j6);
            for (int i5 = (int) ((qVar.f2998b + j4) - j6); i5 < min2; i5++) {
                if (bArr2[i5] == b4) {
                    return (i5 - qVar.f2998b) + j6;
                }
            }
            j6 += qVar.f2999c - qVar.f2998b;
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
            j4 = j6;
        }
        return -1L;
    }

    @Override // T3.i
    public final String g(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long f4 = f((byte) 10, 0L, j5);
        if (f4 != -1) {
            return U3.a.a(this, f4);
        }
        if (j5 < this.f2975b && e(j5 - 1) == 13 && e(j5) == 10) {
            return U3.a.a(this, j5);
        }
        g gVar = new g();
        a(gVar, 0L, Math.min(32, this.f2975b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2975b, j4) + " content=" + gVar.c(gVar.f2975b).b() + (char) 8230);
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h h(String str) {
        C(str);
        return this;
    }

    public final int hashCode() {
        q qVar = this.f2974a;
        if (qVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = qVar.f2999c;
            for (int i6 = qVar.f2998b; i6 < i5; i6++) {
                i4 = (i4 * 31) + qVar.f2997a[i6];
            }
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
        } while (qVar != this.f2974a);
        return i4;
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h i(long j4) {
        y(j4);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // T3.v
    public final long j(g sink, long j4) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j5 = this.f2975b;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        sink.o(this, j4);
        return j4;
    }

    public final byte[] k(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2975b < j4) {
            throw new EOFException();
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = read(bArr, i5, i4 - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
        return bArr;
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h l(j jVar) {
        v(jVar);
        return this;
    }

    @Override // T3.i
    public final String m() {
        return g(Long.MAX_VALUE);
    }

    public final String n(long j4, Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2975b < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        int i4 = qVar.f2998b;
        if (i4 + j4 > qVar.f2999c) {
            return new String(k(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(qVar.f2997a, i4, i5, charset);
        int i6 = qVar.f2998b + i5;
        qVar.f2998b = i6;
        this.f2975b -= j4;
        if (i6 == qVar.f2999c) {
            this.f2974a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // T3.t
    public final void o(g source, long j4) {
        q b4;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0124a.p(source.f2975b, 0L, j4);
        while (j4 > 0) {
            q qVar = source.f2974a;
            kotlin.jvm.internal.i.b(qVar);
            int i4 = qVar.f2999c;
            q qVar2 = source.f2974a;
            kotlin.jvm.internal.i.b(qVar2);
            long j5 = i4 - qVar2.f2998b;
            int i5 = 0;
            if (j4 < j5) {
                q qVar3 = this.f2974a;
                q qVar4 = qVar3 != null ? qVar3.f3003g : null;
                if (qVar4 != null && qVar4.f3001e) {
                    if ((qVar4.f2999c + j4) - (qVar4.f3000d ? 0 : qVar4.f2998b) <= 8192) {
                        q qVar5 = source.f2974a;
                        kotlin.jvm.internal.i.b(qVar5);
                        qVar5.d(qVar4, (int) j4);
                        source.f2975b -= j4;
                        this.f2975b += j4;
                        return;
                    }
                }
                q qVar6 = source.f2974a;
                kotlin.jvm.internal.i.b(qVar6);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > qVar6.f2999c - qVar6.f2998b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    b4 = qVar6.c();
                } else {
                    b4 = r.b();
                    byte[] bArr = qVar6.f2997a;
                    byte[] bArr2 = b4.f2997a;
                    int i7 = qVar6.f2998b;
                    d3.g.O(0, i7, i7 + i6, bArr, bArr2);
                }
                b4.f2999c = b4.f2998b + i6;
                qVar6.f2998b += i6;
                q qVar7 = qVar6.f3003g;
                kotlin.jvm.internal.i.b(qVar7);
                qVar7.b(b4);
                source.f2974a = b4;
            }
            q qVar8 = source.f2974a;
            kotlin.jvm.internal.i.b(qVar8);
            long j6 = qVar8.f2999c - qVar8.f2998b;
            source.f2974a = qVar8.a();
            q qVar9 = this.f2974a;
            if (qVar9 == null) {
                this.f2974a = qVar8;
                qVar8.f3003g = qVar8;
                qVar8.f3002f = qVar8;
            } else {
                q qVar10 = qVar9.f3003g;
                kotlin.jvm.internal.i.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f3003g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(qVar11);
                if (qVar11.f3001e) {
                    int i8 = qVar8.f2999c - qVar8.f2998b;
                    q qVar12 = qVar8.f3003g;
                    kotlin.jvm.internal.i.b(qVar12);
                    int i9 = 8192 - qVar12.f2999c;
                    q qVar13 = qVar8.f3003g;
                    kotlin.jvm.internal.i.b(qVar13);
                    if (!qVar13.f3000d) {
                        q qVar14 = qVar8.f3003g;
                        kotlin.jvm.internal.i.b(qVar14);
                        i5 = qVar14.f2998b;
                    }
                    if (i8 <= i9 + i5) {
                        q qVar15 = qVar8.f3003g;
                        kotlin.jvm.internal.i.b(qVar15);
                        qVar8.d(qVar15, i8);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            source.f2975b -= j6;
            this.f2975b += j6;
            j4 -= j6;
        }
    }

    @Override // T3.i
    public final void p(long j4) {
        if (this.f2975b < j4) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // T3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q() {
        int i4;
        if (this.f2975b == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z = false;
        long j4 = 0;
        do {
            q qVar = this.f2974a;
            kotlin.jvm.internal.i.b(qVar);
            byte[] bArr = qVar.f2997a;
            int i6 = qVar.f2998b;
            int i7 = qVar.f2999c;
            while (i6 < i7) {
                byte b4 = bArr[i6];
                if (b4 >= 48 && b4 <= 57) {
                    i4 = b4 - 48;
                } else if (b4 >= 97 && b4 <= 102) {
                    i4 = b4 - 87;
                } else if (b4 < 65 || b4 > 70) {
                    z = true;
                    if (i5 == 0) {
                        char[] cArr = U3.b.f3114a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b4 >> 4) & 15], cArr[b4 & 15]})));
                    }
                    if (i6 != i7) {
                        this.f2974a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f2998b = i6;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i4 = b4 - 55;
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    g gVar = new g();
                    gVar.y(j4);
                    gVar.x(b4);
                    throw new NumberFormatException("Number too large: ".concat(gVar.n(gVar.f2975b, AbstractC1504a.f15936a)));
                }
                j4 = (j4 << 4) | i4;
                i6++;
                i5++;
            }
            if (i6 != i7) {
            }
            if (!z) {
            }
        } while (this.f2974a != null);
        this.f2975b -= i5;
        return j4;
    }

    @Override // T3.i
    public final InputStream r() {
        return new f(this, 0);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        q qVar = this.f2974a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), qVar.f2999c - qVar.f2998b);
        sink.put(qVar.f2997a, qVar.f2998b, min);
        int i4 = qVar.f2998b + min;
        qVar.f2998b = i4;
        this.f2975b -= min;
        if (i4 == qVar.f2999c) {
            this.f2974a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // T3.i
    public final byte readByte() {
        if (this.f2975b == 0) {
            throw new EOFException();
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        int i4 = qVar.f2998b;
        int i5 = qVar.f2999c;
        int i6 = i4 + 1;
        byte b4 = qVar.f2997a[i4];
        this.f2975b--;
        if (i6 != i5) {
            qVar.f2998b = i6;
            return b4;
        }
        this.f2974a = qVar.a();
        r.a(qVar);
        return b4;
    }

    @Override // T3.i
    public final int readInt() {
        if (this.f2975b < 4) {
            throw new EOFException();
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        int i4 = qVar.f2998b;
        int i5 = qVar.f2999c;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = qVar.f2997a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = (bArr[i6] & 255) | i7;
        this.f2975b -= 4;
        if (i8 != i5) {
            qVar.f2998b = i8;
            return i9;
        }
        this.f2974a = qVar.a();
        r.a(qVar);
        return i9;
    }

    @Override // T3.i
    public final short readShort() {
        if (this.f2975b < 2) {
            throw new EOFException();
        }
        q qVar = this.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        int i4 = qVar.f2998b;
        int i5 = qVar.f2999c;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = qVar.f2997a;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i8 = i4 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.f2975b -= 2;
        if (i8 == i5) {
            this.f2974a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f2998b = i8;
        }
        return (short) i9;
    }

    public final j s(int i4) {
        if (i4 == 0) {
            return j.f2976d;
        }
        AbstractC0124a.p(this.f2975b, 0L, i4);
        q qVar = this.f2974a;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            kotlin.jvm.internal.i.b(qVar);
            int i8 = qVar.f2999c;
            int i9 = qVar.f2998b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            qVar = qVar.f3002f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        q qVar2 = this.f2974a;
        int i10 = 0;
        while (i5 < i4) {
            kotlin.jvm.internal.i.b(qVar2);
            bArr[i10] = qVar2.f2997a;
            i5 += qVar2.f2999c - qVar2.f2998b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = qVar2.f2998b;
            qVar2.f3000d = true;
            i10++;
            qVar2 = qVar2.f3002f;
        }
        return new s(bArr, iArr);
    }

    @Override // T3.i
    public final void skip(long j4) {
        while (j4 > 0) {
            q qVar = this.f2974a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, qVar.f2999c - qVar.f2998b);
            long j5 = min;
            this.f2975b -= j5;
            j4 -= j5;
            int i4 = qVar.f2998b + min;
            qVar.f2998b = i4;
            if (i4 == qVar.f2999c) {
                this.f2974a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final q t(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f2974a;
        if (qVar == null) {
            q b4 = r.b();
            this.f2974a = b4;
            b4.f3003g = b4;
            b4.f3002f = b4;
            return b4;
        }
        q qVar2 = qVar.f3003g;
        kotlin.jvm.internal.i.b(qVar2);
        if (qVar2.f2999c + i4 <= 8192 && qVar2.f3001e) {
            return qVar2;
        }
        q b5 = r.b();
        qVar2.b(b5);
        return b5;
    }

    public final String toString() {
        long j4 = this.f2975b;
        if (j4 <= 2147483647L) {
            return s((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2975b).toString());
    }

    public final void u(int i4, byte[] source) {
        kotlin.jvm.internal.i.e(source, "source");
        int i5 = 0;
        long j4 = i4;
        AbstractC0124a.p(source.length, 0, j4);
        while (i5 < i4) {
            q t4 = t(1);
            int min = Math.min(i4 - i5, 8192 - t4.f2999c);
            int i6 = i5 + min;
            d3.g.O(t4.f2999c, i5, i6, source, t4.f2997a);
            t4.f2999c += min;
            i5 = i6;
        }
        this.f2975b += j4;
    }

    public final void v(j byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        byteString.i(this, byteString.a());
    }

    public final void w(v vVar) {
        while (vVar.j(this, 8192L) != -1) {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int remaining = source.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            q t4 = t(1);
            int min = Math.min(i4, 8192 - t4.f2999c);
            source.get(t4.f2997a, t4.f2999c, min);
            i4 -= min;
            t4.f2999c += min;
        }
        this.f2975b += remaining;
        return remaining;
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h writeByte(int i4) {
        x(i4);
        return this;
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h writeInt(int i4) {
        z(i4);
        return this;
    }

    @Override // T3.h
    public final /* bridge */ /* synthetic */ h writeShort(int i4) {
        A(i4);
        return this;
    }

    public final void x(int i4) {
        q t4 = t(1);
        byte[] bArr = t4.f2997a;
        int i5 = t4.f2999c;
        t4.f2999c = i5 + 1;
        bArr[i5] = (byte) i4;
        this.f2975b++;
    }

    public final void y(long j4) {
        if (j4 == 0) {
            x(48);
            return;
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
        q t4 = t(i4);
        byte[] bArr = t4.f2997a;
        int i5 = t4.f2999c;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = U3.a.f3113a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        t4.f2999c += i4;
        this.f2975b += i4;
    }

    public final void z(int i4) {
        q t4 = t(4);
        byte[] bArr = t4.f2997a;
        int i5 = t4.f2999c;
        bArr[i5] = (byte) ((i4 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5 + 3] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        t4.f2999c = i5 + 4;
        this.f2975b += 4;
    }

    @Override // T3.h
    public final h write(byte[] bArr) {
        u(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i4, int i5) {
        AbstractC0124a.p(bArr.length, i4, i5);
        q qVar = this.f2974a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i5, qVar.f2999c - qVar.f2998b);
        byte[] bArr2 = qVar.f2997a;
        int i6 = qVar.f2998b;
        d3.g.O(i4, i6, i6 + min, bArr2, bArr);
        int i7 = qVar.f2998b + min;
        qVar.f2998b = i7;
        this.f2975b -= min;
        if (i7 == qVar.f2999c) {
            this.f2974a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, T3.t
    public final void close() {
    }

    @Override // T3.h, T3.t, java.io.Flushable
    public final void flush() {
    }
}
