package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rx0 {
    public final t81 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final jn1 f = new jn1();
    public final ps1 g = new ps1();
    public final en1 h;

    public rx0(t81 t81Var) {
        this.a = t81Var;
        en1 en1Var = new en1();
        en1Var.a = oe2.a;
        en1Var.b = lg1.a;
        en1Var.c = yk3.r;
        en1Var.c(oe2.d(10));
        this.h = en1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    public final void a(long j, List list, boolean z) {
        long j2;
        long j3;
        long[] jArr;
        int i;
        char c;
        long j4;
        cs1 cs1Var;
        cs1 cs1Var2;
        en1 en1Var = this.h;
        en1Var.e = 0;
        long[] jArr2 = en1Var.a;
        char c2 = 7;
        if (jArr2 != oe2.a) {
            ni.l(jArr2, -9187201950435737472L);
            long[] jArr3 = en1Var.a;
            int i2 = en1Var.d;
            int i3 = i2 >> 3;
            j2 = -9187201950435737472L;
            long j5 = 255 << ((i2 & 7) << 3);
            j3 = 255;
            jArr3[i3] = ((~j5) & jArr3[i3]) | j5;
        } else {
            j2 = -9187201950435737472L;
            j3 = 255;
        }
        ni.k(0, en1Var.d, null, en1Var.c);
        en1Var.f = oe2.a(en1Var.d) - en1Var.e;
        int size = list.size();
        ps1 ps1Var = this.g;
        int i4 = 0;
        boolean z2 = true;
        ps1 ps1Var2 = ps1Var;
        while (i4 < size) {
            ul1 ul1Var = (ul1) list.get(i4);
            if (ul1Var.z) {
                ul1Var.y = new k7(11, this, ul1Var);
                if (z2) {
                    eo1 eo1Var = ps1Var2.a;
                    ?? r7 = eo1Var.m;
                    int i5 = eo1Var.o;
                    c = c2;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            j4 = j2;
                            cs1Var2 = 0;
                            break;
                        }
                        cs1Var2 = r7[i6];
                        j4 = j2;
                        if (Intrinsics.b(((cs1) cs1Var2).c, ul1Var)) {
                            break;
                        }
                        i6++;
                        j2 = j4;
                    }
                    cs1Var = cs1Var2;
                    if (cs1Var != null) {
                        cs1Var.i = true;
                        cs1Var.d.a(j);
                        Object b = en1Var.b(j);
                        Object obj = b;
                        if (b == null) {
                            jn1 jn1Var = new jn1();
                            en1Var.d(j, jn1Var);
                            obj = jn1Var;
                        }
                        ((jn1) obj).a(cs1Var);
                        ps1Var2 = cs1Var;
                    } else {
                        z2 = false;
                    }
                } else {
                    c = c2;
                    j4 = j2;
                }
                cs1Var = new cs1(ul1Var);
                cs1Var.d.a(j);
                Object b2 = en1Var.b(j);
                Object obj2 = b2;
                if (b2 == null) {
                    jn1 jn1Var2 = new jn1();
                    en1Var.d(j, jn1Var2);
                    obj2 = jn1Var2;
                }
                ((jn1) obj2).a(cs1Var);
                ps1Var2.a.b(cs1Var);
                ps1Var2 = cs1Var;
            } else {
                c = c2;
                j4 = j2;
            }
            i4++;
            c2 = c;
            j2 = j4;
        }
        char c3 = c2;
        long j6 = j2;
        if (!z) {
            return;
        }
        long[] jArr4 = en1Var.b;
        Object[] objArr = en1Var.c;
        long[] jArr5 = en1Var.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr5[i7];
            if ((((~j7) << c3) & j7 & j6) != j6) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j8 = jArr4[i11];
                        jn1 jn1Var3 = (jn1) objArr[i11];
                        eo1 eo1Var2 = ps1Var.a;
                        Object[] objArr2 = eo1Var2.m;
                        int i12 = eo1Var2.o;
                        i = i8;
                        int i13 = 0;
                        while (i13 < i12) {
                            ((cs1) objArr2[i13]).f(j8, jn1Var3);
                            i13++;
                            jArr4 = jArr4;
                        }
                    } else {
                        i = i8;
                    }
                    j7 >>= i;
                    i10++;
                    i8 = i;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i9 != i8) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            jArr4 = jArr;
        }
    }

    public final boolean b(t21 t21Var, boolean z) {
        mg1 mg1Var = (mg1) t21Var.n;
        t81 t81Var = this.a;
        ps1 ps1Var = this.g;
        boolean a = ps1Var.a(mg1Var, t81Var, t21Var, z);
        eo1 eo1Var = ps1Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((cs1) objArr[i2]).e(t21Var, z) || z3;
        }
        Object[] objArr2 = eo1Var.m;
        int i3 = eo1Var.o;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((cs1) objArr2[i4]).d(t21Var) || z4;
        }
        ps1Var.b(t21Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            jn1 jn1Var = this.f;
            int i5 = jn1Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((ul1) jn1Var.e(i6));
            }
            jn1Var.c();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ps1Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        ps1 ps1Var = this.g;
        eo1 eo1Var = ps1Var.a;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((cs1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ps1Var.a.g();
        }
    }

    public final void d(ul1 ul1Var) {
        if (this.b) {
            this.e = true;
            this.f.a(ul1Var);
            return;
        }
        ps1 ps1Var = this.g;
        jn1 jn1Var = ps1Var.b;
        jn1Var.c();
        jn1Var.a(ps1Var);
        while (jn1Var.h()) {
            ps1 ps1Var2 = (ps1) jn1Var.j(jn1Var.b - 1);
            int i = 0;
            while (true) {
                eo1 eo1Var = ps1Var2.a;
                if (i < eo1Var.o) {
                    cs1 cs1Var = (cs1) eo1Var.m[i];
                    if (Intrinsics.b(cs1Var.c, ul1Var)) {
                        ps1Var2.a.k(cs1Var);
                        cs1Var.c();
                    } else {
                        jn1Var.a(cs1Var);
                        i++;
                    }
                }
            }
        }
    }
}
