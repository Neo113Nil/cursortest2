package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f60 {
    public final uc0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final mn0 f = new mn0();
    public final tp0 g = new tp0();
    public final in0 h = new in0(10);

    public f60(uc0 uc0Var) {
        this.a = uc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        in0 in0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        jp0 jp0Var;
        jp0 jp0Var2;
        int size = list.size();
        tp0 tp0Var = this.g;
        tp0 tp0Var2 = tp0Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            in0Var = this.h;
            if (i2 >= size) {
                break;
            }
            zl0 zl0Var = (zl0) list.get(i2);
            if (zl0Var.r) {
                zl0Var.q = new w3(this, 6, zl0Var);
                if (z2) {
                    eo0 eo0Var = tp0Var2.a;
                    ?? r14 = eo0Var.d;
                    int i3 = eo0Var.g;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            jp0Var2 = 0;
                            break;
                        }
                        jp0Var2 = r14[i4];
                        if (Intrinsics.a(((jp0) jp0Var2).c, zl0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    jp0Var = jp0Var2;
                    if (jp0Var != null) {
                        jp0Var.i = true;
                        jp0Var.d.c(j);
                        if (z) {
                            Object d = in0Var.d(j);
                            if (d == null) {
                                d = new mn0();
                                in0Var.f(j, d);
                            }
                            ((mn0) d).a(jp0Var);
                        }
                        tp0Var2 = jp0Var;
                    } else {
                        z2 = false;
                    }
                }
                jp0Var = new jp0(zl0Var);
                jp0Var.d.c(j);
                if (z) {
                    Object d2 = in0Var.d(j);
                    if (d2 == null) {
                        d2 = new mn0();
                        in0Var.f(j, d2);
                    }
                    ((mn0) d2).a(jp0Var);
                }
                tp0Var2.a.b(jp0Var);
                tp0Var2 = jp0Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = in0Var.b;
            Object[] objArr = in0Var.c;
            long[] jArr4 = in0Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                mn0 mn0Var = (mn0) objArr[i9];
                                eo0 eo0Var2 = tp0Var.a;
                                i = i6;
                                Object[] objArr2 = eo0Var2.d;
                                int i10 = eo0Var2.g;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((jp0) objArr2[i11]).f(j3, mn0Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        in0Var.a();
    }

    public final boolean b(e30 e30Var, boolean z) {
        aj0 aj0Var = (aj0) e30Var.b;
        uc0 uc0Var = this.a;
        tp0 tp0Var = this.g;
        boolean a = tp0Var.a(aj0Var, uc0Var, e30Var, z);
        eo0 eo0Var = tp0Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((jp0) objArr[i2]).e(e30Var, z) || z3;
        }
        Object[] objArr2 = eo0Var.d;
        int i3 = eo0Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((jp0) objArr2[i4]).d(e30Var) || z4;
        }
        tp0Var.b(e30Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            mn0 mn0Var = this.f;
            int i5 = mn0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((zl0) mn0Var.f(i6));
            }
            mn0Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            tp0Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        tp0 tp0Var = this.g;
        eo0 eo0Var = tp0Var.a;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jp0) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            tp0Var.a.g();
        }
    }

    public final void d(zl0 zl0Var) {
        if (this.b) {
            this.e = true;
            this.f.a(zl0Var);
            return;
        }
        tp0 tp0Var = this.g;
        mn0 mn0Var = tp0Var.b;
        mn0Var.d();
        mn0Var.a(tp0Var);
        while (mn0Var.i()) {
            tp0 tp0Var2 = (tp0) mn0Var.k(mn0Var.b - 1);
            int i = 0;
            while (true) {
                eo0 eo0Var = tp0Var2.a;
                if (i < eo0Var.g) {
                    jp0 jp0Var = (jp0) eo0Var.d[i];
                    if (Intrinsics.a(jp0Var.c, zl0Var)) {
                        tp0Var2.a.j(jp0Var);
                        jp0Var.c();
                    } else {
                        mn0Var.a(jp0Var);
                        i++;
                    }
                }
            }
        }
    }
}
