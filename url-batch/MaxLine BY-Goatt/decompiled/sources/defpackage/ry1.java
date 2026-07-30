package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ry1 implements uf2 {
    public final zn1 A;
    public final zn1 B;
    public final lz1 C;
    public final lz1 D;
    public final lz1 E;
    public final lz1 F;
    public final lz1 a;
    public final at0 b;
    public final my1 c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public final w80 j;
    public final boolean k;
    public int l;
    public wb1 m;
    public boolean n;
    public final lz1 o;
    public ca0 p;
    public final bn1 q;
    public final iz1 r;
    public final iz1 s;
    public final xb1 t;
    public final mp u;
    public final qm v;
    public final lz1 w;
    public final ta1 x;
    public long y;
    public final ub1 z;

    public ry1(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.a = ij2.j(new au1(0L));
        this.b = new at0(this);
        this.c = new my1(i, f, this);
        this.d = i;
        this.f = Long.MAX_VALUE;
        this.j = new w80(new j6(28, this));
        this.k = true;
        this.l = -1;
        this.o = new lz1(uy1.a, qb2.Z);
        this.p = uy1.b;
        this.q = new bn1();
        this.r = new iz1(-1);
        this.s = new iz1(i);
        by1 by1Var = by1.B;
        ij2.e(by1Var, new qy1(this, 0));
        ij2.e(by1Var, new qy1(this, 1));
        this.t = new xb1(null);
        this.u = new mp(1);
        this.v = new qm();
        this.w = ij2.j(null);
        this.x = new ta1(this, 1);
        this.y = v10.b(0, 0, 15);
        this.z = new ub1();
        this.A = zm3.q();
        this.B = zm3.q();
        Boolean bool = Boolean.FALSE;
        this.C = ij2.j(bool);
        this.D = ij2.j(bool);
        this.E = ij2.j(bool);
        this.F = ij2.j(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r9.d(r7, r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(ry1 ry1Var, ho1 ho1Var, Function2 function2, r30 r30Var) {
        py1 py1Var;
        int i;
        if (r30Var instanceof py1) {
            py1Var = (py1) r30Var;
            int i2 = py1Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                py1Var.r = i2 - Integer.MIN_VALUE;
                Object obj = py1Var.p;
                Object obj2 = b50.m;
                i = py1Var.r;
                if (i != 0) {
                    ca2.b(obj);
                    py1Var.m = ry1Var;
                    py1Var.n = ho1Var;
                    py1Var.o = (pr2) function2;
                    py1Var.r = 1;
                    Object i3 = ry1Var.v.i(py1Var);
                    if (i3 != obj2) {
                        i3 = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ry1Var = py1Var.m;
                        ca2.b(obj);
                        ry1Var.r.i(-1);
                        return Unit.a;
                    }
                    function2 = (Function2) py1Var.o;
                    ho1Var = py1Var.n;
                    ry1Var = py1Var.m;
                    ca2.b(obj);
                }
                if (!ry1Var.j.b()) {
                    ry1Var.s.i(ry1Var.j());
                }
                w80 w80Var = ry1Var.j;
                py1Var.m = ry1Var;
                py1Var.n = null;
                py1Var.o = null;
                py1Var.r = 2;
            }
        }
        py1Var = new py1(ry1Var, r30Var);
        Object obj3 = py1Var.p;
        Object obj22 = b50.m;
        i = py1Var.r;
        if (i != 0) {
        }
        if (!ry1Var.j.b()) {
        }
        w80 w80Var2 = ry1Var.j;
        py1Var.m = ry1Var;
        py1Var.n = null;
        py1Var.o = null;
        py1Var.r = 2;
    }

    @Override // defpackage.uf2
    public final boolean a() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final boolean b() {
        return this.j.b();
    }

    @Override // defpackage.uf2
    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final Object d(ho1 ho1Var, Function2 function2, r30 r30Var) {
        return s(this, ho1Var, function2, r30Var);
    }

    @Override // defpackage.uf2
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r0 != r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, eo2 eo2Var, r30 r30Var) {
        oy1 oy1Var;
        b50 b50Var;
        int i2;
        eo2 eo2Var2;
        Object d;
        ry1 ry1Var = this;
        int i3 = i;
        if (r30Var instanceof oy1) {
            oy1Var = (oy1) r30Var;
            int i4 = oy1Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oy1Var.r = i4 - Integer.MIN_VALUE;
                Object obj = oy1Var.p;
                b50Var = b50.m;
                i2 = oy1Var.r;
                if (i2 != 0) {
                    ca2.b(obj);
                    if ((i3 == ry1Var.j() && ry1Var.k() == 0.0f) || ry1Var.m() == 0) {
                        return Unit.a;
                    }
                    oy1Var.m = ry1Var;
                    oy1Var.n = eo2Var;
                    oy1Var.o = i3;
                    oy1Var.r = 1;
                    Object i5 = ry1Var.v.i(oy1Var);
                    if (i5 != b50Var) {
                        i5 = Unit.a;
                    }
                    if (i5 != b50Var) {
                        eo2Var2 = eo2Var;
                    }
                    return b50Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ca2.b(obj);
                        return Unit.a;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = oy1Var.o;
                eo2 eo2Var3 = oy1Var.n;
                ry1 ry1Var2 = oy1Var.m;
                ca2.b(obj);
                eo2Var2 = eo2Var3;
                i3 = i6;
                ry1Var = ry1Var2;
                int i7 = ry1Var.i(i3);
                float o = 0.0f * ry1Var.o();
                at0 at0Var = ry1Var.b;
                c0 c0Var = new c0(14, ry1Var);
                oy1Var.m = null;
                oy1Var.n = null;
                oy1Var.r = 2;
                ky1 ky1Var = uy1.a;
                d = ((ry1) at0Var.m).d(ho1.m, new ty1(c0Var, i7, at0Var, o, eo2Var2, null), oy1Var);
                if (d != b50Var) {
                    d = Unit.a;
                }
                if (d != b50Var) {
                    d = Unit.a;
                }
            }
        }
        oy1Var = new oy1(ry1Var, r30Var);
        Object obj2 = oy1Var.p;
        b50Var = b50.m;
        i2 = oy1Var.r;
        if (i2 != 0) {
        }
        int i72 = ry1Var.i(i3);
        float o2 = 0.0f * ry1Var.o();
        at0 at0Var2 = ry1Var.b;
        c0 c0Var2 = new c0(14, ry1Var);
        oy1Var.m = null;
        oy1Var.n = null;
        oy1Var.r = 2;
        ky1 ky1Var2 = uy1.a;
        d = ((ry1) at0Var2.m).d(ho1.m, new ty1(c0Var2, i72, at0Var2, o2, eo2Var2, null), oy1Var);
        if (d != b50Var) {
        }
        if (d != b50Var) {
        }
    }

    public final void h(ky1 ky1Var, boolean z) {
        rj1 rj1Var = ky1Var.i;
        boolean z2 = true;
        my1 my1Var = this.c;
        if (z) {
            ((hz1) my1Var.p).i(ky1Var.j);
        } else {
            my1Var.getClass();
            List list = ky1Var.a;
            my1Var.q = rj1Var != null ? rj1Var.d : null;
            if (my1Var.m || !list.isEmpty()) {
                my1Var.m = true;
                int i = rj1Var != null ? rj1Var.a : 0;
                float f = ky1Var.j;
                ((iz1) my1Var.o).i(i);
                ((pb1) my1Var.r).a(i);
                ((hz1) my1Var.p).i(f);
            }
            if (this.l != -1 && !list.isEmpty()) {
                if (this.l != (this.n ? ((rj1) zv.B(list)).a + 1 : ((rj1) zv.u(list)).a - 1)) {
                    this.l = -1;
                    wb1 wb1Var = this.m;
                    if (wb1Var != null) {
                        wb1Var.cancel();
                    }
                    this.m = null;
                }
            }
        }
        this.o.setValue(ky1Var);
        boolean z3 = ky1Var.l;
        rj1 rj1Var2 = ky1Var.h;
        this.C.setValue(Boolean.valueOf(z3));
        if ((rj1Var2 != null ? rj1Var2.a : 0) == 0 && ky1Var.k == 0) {
            z2 = false;
        }
        this.D.setValue(Boolean.valueOf(z2));
        if (rj1Var2 != null) {
            this.d = rj1Var2.a;
        }
        this.e = ky1Var.k;
        nm2 d = ci2.d();
        Function1 e = d != null ? d.e() : null;
        nm2 f2 = ci2.f(d);
        try {
            if (Math.abs(this.i) > 0.5f && this.k && q(this.i)) {
                r(this.i, ky1Var);
            }
            Unit unit = Unit.a;
            ci2.j(d, f2, e);
            this.f = uy1.a(ky1Var, m());
            m();
            ww1 ww1Var = ky1Var.e;
            ww1 ww1Var2 = ww1.n;
            long f3 = ky1Var.f();
            int i2 = (int) (ww1Var == ww1Var2 ? f3 >> 32 : f3 & 4294967295L);
            ky1Var.m.getClass();
            this.g = d.c(0, 0, i2);
        } catch (Throwable th) {
            ci2.j(d, f2, e);
            throw th;
        }
    }

    public final int i(int i) {
        if (m() > 0) {
            return d.c(i, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((iz1) this.c.o).h();
    }

    public final float k() {
        return ((hz1) this.c.p).h();
    }

    public final ky1 l() {
        return (ky1) this.o.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((ky1) this.o.getValue()).b;
    }

    public final int o() {
        return ((ky1) this.o.getValue()).c + n();
    }

    public final long p() {
        return ((au1) this.a.getValue()).a;
    }

    public final boolean q(float f) {
        if (l().e == ww1.m) {
            if (Math.signum(f) == Math.signum(-au1.e(p()))) {
                return true;
            }
        } else if (Math.signum(f) == Math.signum(-au1.d(p()))) {
            return true;
        }
        return ((int) au1.d(p())) == 0 && ((int) au1.e(p())) == 0;
    }

    public final void r(float f, ky1 ky1Var) {
        wb1 wb1Var;
        wb1 wb1Var2;
        wb1 wb1Var3;
        if (this.k) {
            List list = ky1Var.a;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f > 0.0f;
            int i = z ? ((rj1) zv.B(list)).a + 1 : ((rj1) zv.u(list)).a - 1;
            if (i < 0 || i >= m()) {
                return;
            }
            if (i != this.l) {
                if (this.n != z && (wb1Var3 = this.m) != null) {
                    wb1Var3.cancel();
                }
                this.n = z;
                this.l = i;
                this.m = this.t.a(this.y, i);
            }
            if (z) {
                if ((((rj1) zv.B(list)).l + (ky1Var.b + ky1Var.c)) - ky1Var.g >= f || (wb1Var2 = this.m) == null) {
                    return;
                }
                wb1Var2.a();
                return;
            }
            if (ky1Var.f - ((rj1) zv.u(list)).l >= (-f) || (wb1Var = this.m) == null) {
                return;
            }
            wb1Var.a();
        }
    }
}
