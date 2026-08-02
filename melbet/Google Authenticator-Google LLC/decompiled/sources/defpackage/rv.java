package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rv {
    public static boolean a = false;
    public static long b;
    public final byo j;
    private final ru r;
    private ru s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private ry[] p = new ry[1000];
    private int q = 0;
    ru[] e = new ru[32];

    public rv() {
        t();
        byo byoVar = new byo(null);
        this.j = byoVar;
        this.r = new rx(byoVar);
        this.s = new ru(byoVar);
    }

    public static final int o(Object obj) {
        ry ryVar = ((sc) obj).h;
        if (ryVar != null) {
            return (int) (ryVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(ru ruVar) {
        int i;
        if (ruVar.d) {
            ruVar.a.d(this, ruVar.b);
        } else {
            ru[] ruVarArr = this.e;
            int i2 = this.i;
            ruVarArr[i2] = ruVar;
            ry ryVar = ruVar.a;
            ryVar.d = i2;
            this.i = i2 + 1;
            ryVar.e(this, ruVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                ru ruVar2 = this.e[i3];
                if (ruVar2 != null && ruVar2.d) {
                    ruVar2.a.d(this, ruVar2.b);
                    ((ckm) this.j.c).f(ruVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        ru[] ruVarArr2 = this.e;
                        int i6 = i4 - 1;
                        ru ruVar3 = ruVarArr2[i4];
                        ruVarArr2[i6] = ruVar3;
                        ry ryVar2 = ruVar3.a;
                        if (ryVar2.d == i4) {
                            ryVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            ru ruVar = this.e[i];
            ruVar.a.f = ruVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (ru[]) Arrays.copyOf(this.e, i2);
        byo byoVar = this.j;
        byoVar.b = (ry[]) Arrays.copyOf((Object[]) byoVar.b, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            ru ruVar = this.e[i];
            if (ruVar != null) {
                ((ckm) this.j.c).f(ruVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(ru ruVar) {
        rt rtVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            ry ryVar = ruVar.a;
            if (ryVar != null) {
                this.n[ryVar.c] = true;
            }
            ry k = ruVar.k(this.n);
            if (k != null) {
                boolean[] zArr = this.n;
                int i5 = k.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (k != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    ru ruVar2 = this.e[i7];
                    if (ruVar2.a.n != 1 && !ruVar2.d && (i = (rtVar = ruVar2.e).e) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i != -1 && i8 < rtVar.a) {
                                if (rtVar.b[i] == k.c) {
                                    float a2 = ruVar2.e.a(k);
                                    if (a2 < 0.0f) {
                                        float f2 = (-ruVar2.b) / a2;
                                        if (f2 < f) {
                                            i6 = i7;
                                            f = f2;
                                        }
                                    }
                                } else {
                                    i = rtVar.c[i];
                                    i8++;
                                }
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    ru ruVar3 = this.e[i6];
                    ruVar3.a.d = -1;
                    ruVar3.b(k);
                    ry ryVar2 = ruVar3.a;
                    ryVar2.d = i6;
                    ryVar2.e(this, ruVar3);
                }
                z = false;
            }
        }
    }

    private final ry v(int i) {
        ry ryVar = (ry) ((ckm) this.j.a).e();
        if (ryVar == null) {
            ryVar = new ry(i);
            ryVar.n = i;
        } else {
            ryVar.c();
            ryVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (ry[]) Arrays.copyOf(this.p, i4);
        }
        ry[] ryVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        ryVarArr[i5] = ryVar;
        return ryVar;
    }

    public final ru a() {
        byo byoVar = this.j;
        ru ruVar = (ru) ((ckm) byoVar.c).e();
        if (ruVar == null) {
            ruVar = new ru(byoVar);
            b++;
        } else {
            ruVar.a = null;
            ruVar.e.f();
            ruVar.b = 0.0f;
            ruVar.d = false;
        }
        ry.a++;
        return ruVar;
    }

    public final ry b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        sc scVar = (sc) obj;
        ry ryVar = scVar.h;
        if (ryVar == null) {
            scVar.m();
            ryVar = scVar.h;
        }
        int i = ryVar.c;
        if (i != -1) {
            if (i <= this.d && ((ry[]) this.j.b)[i] != null) {
                return ryVar;
            }
            if (i != -1) {
                ryVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        ryVar.c = i2;
        ryVar.n = 1;
        ((ry[]) this.j.b)[i2] = ryVar;
        return ryVar;
    }

    public final ry c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        ry v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        ((ry[]) this.j.b)[i] = v;
        return v;
    }

    public final void d(ry ryVar, ry ryVar2, int i, float f, ry ryVar3, ry ryVar4, int i2, int i3) {
        ru a2 = a();
        if (ryVar2 == ryVar3) {
            a2.e.g(ryVar, 1.0f);
            a2.e.g(ryVar4, 1.0f);
            a2.e.g(ryVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(ryVar, 1.0f);
            a2.e.g(ryVar2, -1.0f);
            a2.e.g(ryVar3, -1.0f);
            a2.e.g(ryVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(ryVar, -1.0f);
            a2.e.g(ryVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(ryVar4, -1.0f);
            a2.e.g(ryVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(ryVar, f2);
            a2.e.g(ryVar2, -f2);
            a2.e.g(ryVar3, -f);
            a2.e.g(ryVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ru ruVar) {
        boolean z;
        boolean z2;
        ry ryVar;
        ry a2;
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            s();
        }
        if (!ruVar.d) {
            if (this.e.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = ruVar.e.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        ry d = ruVar.e.d(i2);
                        if (d.d != -1 || d.g) {
                            ruVar.c.add(d);
                        } else {
                            boolean z4 = d.m;
                        }
                    }
                    ArrayList arrayList = ruVar.c;
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            ry ryVar2 = (ry) arrayList.get(i3);
                            if (ryVar2.g) {
                                ruVar.c(this, ryVar2, true);
                            } else {
                                boolean z5 = ryVar2.m;
                                ruVar.d(this, this.e[ryVar2.d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (ruVar.a != null && ruVar.e.a == 0) {
                    ruVar.d = true;
                    this.c = true;
                }
            }
            if (ruVar.e()) {
                return;
            }
            float f = ruVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                ruVar.b = -f;
                rt rtVar = ruVar.e;
                int i4 = rtVar.e;
                for (int i5 = 0; i4 != -1 && i5 < rtVar.a; i5++) {
                    float[] fArr = rtVar.d;
                    fArr[i4] = -fArr[i4];
                    i4 = rtVar.c[i4];
                }
            }
            int i6 = ruVar.e.a;
            float f3 = 0.0f;
            float f4 = 0.0f;
            ry ryVar3 = null;
            ry ryVar4 = null;
            int i7 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < i6) {
                float b2 = ruVar.e.b(i7);
                ry d2 = ruVar.e.d(i7);
                float f5 = f2;
                if (d2.n == 1) {
                    if (ryVar3 == null) {
                        z6 = ru.l(d2);
                    } else if (f3 > b2) {
                        z6 = ru.l(d2);
                    } else if (!z6 && ru.l(d2)) {
                        z6 = true;
                    }
                    ryVar3 = d2;
                    f3 = b2;
                } else if (ryVar3 == null) {
                    if (b2 < f5) {
                        if (ryVar4 == null) {
                            z7 = ru.l(d2);
                        } else if (f4 > b2) {
                            z7 = ru.l(d2);
                        } else if (!z7 && ru.l(d2)) {
                            z7 = true;
                        }
                        ryVar4 = d2;
                        ryVar3 = null;
                        f4 = b2;
                    }
                    ryVar3 = null;
                }
                i7++;
                f2 = f5;
            }
            float f6 = f2;
            if (ryVar3 == null) {
                ryVar3 = ryVar4;
            }
            if (ryVar3 == null) {
                z = true;
            } else {
                ruVar.b(ryVar3);
                z = false;
            }
            if (ruVar.e.a == 0) {
                ruVar.d = true;
            }
            if (z) {
                if (this.h + 1 >= this.m) {
                    s();
                }
                ry v = v(3);
                int i8 = this.d + 1;
                this.d = i8;
                this.h++;
                v.c = i8;
                byo byoVar = this.j;
                ((ry[]) byoVar.b)[i8] = v;
                ruVar.a = v;
                int i9 = this.i;
                q(ruVar);
                if (this.i == i9 + 1) {
                    ru ruVar2 = this.s;
                    ruVar2.a = null;
                    ruVar2.e.f();
                    int i10 = 0;
                    while (true) {
                        rt rtVar2 = ruVar.e;
                        if (i10 >= rtVar2.a) {
                            break;
                        }
                        ruVar2.e.e(rtVar2.d(i10), ruVar.e.b(i10), true);
                        i10++;
                    }
                    u(this.s);
                    if (v.d == -1) {
                        if (ruVar.a == v && (a2 = ruVar.a(null, v)) != null) {
                            ruVar.b(a2);
                        }
                        if (!ruVar.d) {
                            ruVar.a.e(this, ruVar);
                        }
                        ((ckm) byoVar.c).f(ruVar);
                        this.i--;
                    }
                    z2 = true;
                    ryVar = ruVar.a;
                    if (ryVar != null) {
                        return;
                    }
                    if ((ryVar.n != 1 && ruVar.b < f6) || z2) {
                        return;
                    }
                }
            }
            z2 = false;
            ryVar = ruVar.a;
            if (ryVar != null) {
            }
        }
        q(ruVar);
    }

    public final void f(ry ryVar, int i) {
        int i2 = ryVar.d;
        if (i2 == -1) {
            ryVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                ry ryVar2 = ((ry[]) this.j.b)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            ru a2 = a();
            a2.a = ryVar;
            ryVar.f = f;
            a2.b = f;
            a2.d = true;
            e(a2);
            return;
        }
        ru ruVar = this.e[i2];
        if (ruVar.d) {
            ruVar.b = i;
            return;
        }
        if (ruVar.e.a == 0) {
            ruVar.d = true;
            ruVar.b = i;
            return;
        }
        ru a3 = a();
        if (i < 0) {
            a3.b = -i;
            a3.e.g(ryVar, 1.0f);
        } else {
            a3.b = i;
            a3.e.g(ryVar, -1.0f);
        }
        e(a3);
    }

    public final void g(ry ryVar, ry ryVar2, int i, int i2) {
        ru a2 = a();
        ry c = c();
        c.e = 0;
        a2.h(ryVar, ryVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(ry ryVar, ry ryVar2, int i, int i2) {
        ru a2 = a();
        ry c = c();
        c.e = 0;
        a2.i(ryVar, ryVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(ru ruVar, int i, int i2) {
        ruVar.e.g(p(i2), i);
    }

    public final void j() {
        ru ruVar = this.r;
        if (ruVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(ruVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(ruVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        byo byoVar;
        int i = 0;
        while (true) {
            byoVar = this.j;
            ry[] ryVarArr = (ry[]) byoVar.b;
            if (i >= ryVarArr.length) {
                break;
            }
            ry ryVar = ryVarArr[i];
            if (ryVar != null) {
                ryVar.c();
            }
            i++;
        }
        Object obj = byoVar.a;
        ry[] ryVarArr2 = this.p;
        int i2 = this.q;
        int length = ryVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ry ryVar2 = ryVarArr2[i3];
            ckm ckmVar = (ckm) obj;
            int i4 = ckmVar.a;
            if (i4 < 256) {
                ((Object[]) ckmVar.b)[i4] = ryVar2;
                ckmVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) byoVar.b, (Object) null);
        this.d = 0;
        rx rxVar = (rx) this.r;
        rxVar.f = 0;
        rxVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            ru ruVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new ru(byoVar);
    }

    final void l(ru ruVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            ru ruVar2 = this.e[i];
            if (ruVar2.a.n != 1) {
                float f = 0.0f;
                if (ruVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            ru ruVar3 = this.e[i5];
                            if (ruVar3.a.n != 1 && !ruVar3.d && ruVar3.b < f) {
                                int i7 = ruVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    ry d = ruVar3.e.d(i8);
                                    float a2 = ruVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            ru ruVar4 = this.e[i3];
                            ruVar4.a.d = -1;
                            ruVar4.b(((ry[]) this.j.b)[i4]);
                            ry ryVar = ruVar4.a;
                            ryVar.d = i3;
                            ryVar.e(this, ruVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(ruVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ry ryVar, ry ryVar2, int i, int i2) {
        boolean z;
        if (i2 == 8) {
            if (ryVar2.g && ryVar.d == -1) {
                ryVar.d(this, ryVar2.f + i);
                return;
            }
            i2 = 8;
        }
        ru a2 = a();
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            a2.b = i;
            if (z) {
                a2.e.g(ryVar, 1.0f);
                a2.e.g(ryVar2, -1.0f);
                if (i2 != 8) {
                    a2.f(this, i2);
                }
                e(a2);
            }
        }
        a2.e.g(ryVar, -1.0f);
        a2.e.g(ryVar2, 1.0f);
        if (i2 != 8) {
        }
        e(a2);
    }

    public final void n(ry ryVar, ry ryVar2, ry ryVar3, ry ryVar4, float f) {
        ru a2 = a();
        a2.g(ryVar, ryVar2, ryVar3, ryVar4, f);
        e(a2);
    }

    public final ry p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        ry v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        ((ry[]) this.j.b)[i2] = v;
        rx rxVar = (rx) this.r;
        rw rwVar = rxVar.g;
        rwVar.a = v;
        Arrays.fill(rwVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        rxVar.m(v);
        return v;
    }
}
