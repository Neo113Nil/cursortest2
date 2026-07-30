package defpackage;

import android.os.Trace;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wf0 implements w71 {
    public static final c51 x;
    public final hq a;
    public boolean b;
    public rf0 c;
    public boolean d;
    public final vg e;
    public final av0 f;
    public final gn0 g;
    public float h;
    public final jb i;
    public final boolean j;
    public jd0 k;
    public final uf0 l;
    public final jc m;
    public final ne0 n;
    public final ee o;
    public final bf0 p;
    public final s40 q;
    public final ye0 r;
    public final ao0 s;
    public final av0 t;
    public final av0 u;
    public final ao0 v;
    public final yw w;

    static {
        e9 e9Var = new e9(10, (byte) 0);
        q1 q1Var = new q1(15);
        jl jlVar = new jl(2, e9Var);
        tj1.b(1, q1Var);
        x = new c51(jlVar, 3, q1Var);
    }

    public wf0(int i, int i2) {
        hq hqVar = new hq();
        hqVar.a = -1;
        hqVar.d = -1;
        this.a = hqVar;
        vg vgVar = new vg();
        vgVar.b = new xu0(i);
        vgVar.c = new xu0(i2);
        vgVar.e = new ve0(i);
        this.e = vgVar;
        rf0 rf0Var = yf0.a;
        j50 j50Var = j50.A;
        this.f = new av0(rf0Var, j50Var);
        this.g = new gn0();
        this.i = new jb(new l(8, this));
        this.j = true;
        this.l = new uf0(this);
        this.m = new jc();
        this.n = new ne0();
        this.o = new ee(1);
        this.p = new bf0(new tf0(this, i));
        this.q = new s40(27, this);
        this.r = new ye0();
        Unit unit = Unit.a;
        this.s = new av0(unit, j50Var);
        Boolean bool = Boolean.FALSE;
        this.t = gb0.F(bool);
        this.u = gb0.F(bool);
        this.v = new av0(unit, j50Var);
        yw ywVar = new yw(15);
        c51 c51Var = p4.o;
        Float valueOf = Float.valueOf(0.0f);
        ywVar.g = new q7(c51Var, valueOf, (v7) ((Function1) c51Var.e).invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.w = ywVar;
    }

    @Override // defpackage.w71
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.w71
    public final boolean b() {
        return this.i.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r6.i.c(r7, r8, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.w71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(go0 go0Var, Function2 function2, fn fnVar) {
        vf0 vf0Var;
        int i;
        if (fnVar instanceof vf0) {
            vf0Var = (vf0) fnVar;
            int i2 = vf0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vf0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = vf0Var.j;
                Object obj2 = tn.d;
                i = vf0Var.l;
                if (i != 0) {
                    ca0.v(obj);
                    if (this.f.getValue() == yf0.a) {
                        vf0Var.h = go0Var;
                        vf0Var.i = (sf1) function2;
                        vf0Var.l = 1;
                        jc jcVar = this.m;
                        ej ejVar = jcVar.b;
                        if (ejVar == null) {
                            ejVar = mo.b();
                            jcVar.b = ejVar;
                            ic icVar = jcVar.a;
                            if (icVar != null && icVar.r) {
                                icVar.z0();
                            }
                        }
                        Object D = ejVar.D(vf0Var);
                        if (D != obj2) {
                            D = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca0.v(obj);
                            return Unit.a;
                        }
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function2 = (Function2) vf0Var.i;
                    go0Var = vf0Var.h;
                    ca0.v(obj);
                }
                vf0Var.h = null;
                vf0Var.i = null;
                vf0Var.l = 2;
            }
        }
        vf0Var = new vf0(this, fnVar);
        Object obj3 = vf0Var.j;
        Object obj22 = tn.d;
        i = vf0Var.l;
        if (i != 0) {
        }
        vf0Var.h = null;
        vf0Var.i = null;
        vf0Var.l = 2;
    }

    @Override // defpackage.w71
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.w71
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(rf0 rf0Var, boolean z, boolean z2) {
        String str;
        long j;
        ib1 n;
        Function1 e;
        ib1 s;
        c51 c51Var = p4.o;
        List list = rf0Var.k;
        int i = rf0Var.n;
        int i2 = rf0Var.b;
        sf0 sf0Var = rf0Var.a;
        this.p.e = list.size();
        yw ywVar = this.w;
        vg vgVar = this.e;
        dn dnVar = null;
        if (!z && this.b) {
            this.c = rf0Var;
            n = ca0.n();
            e = n != null ? n.e() : null;
            s = ca0.s(n);
            try {
                if (((Number) ((q7) ywVar.g).e.getValue()).floatValue() != 0.0f && sf0Var != null && sf0Var.a == ((xu0) vgVar.b).h() && i2 == ((xu0) vgVar.c).h()) {
                    rc1 rc1Var = (rc1) ywVar.e;
                    if (rc1Var != null) {
                        rc1Var.a(null);
                    }
                    ywVar.g = new q7(c51Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                ca0.u(n, s, e);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((sf0Var != null ? sf0Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(rf0Var.c));
        this.h -= rf0Var.d;
        this.f.setValue(rf0Var);
        if (z2) {
            vgVar.getClass();
            if (i2 < 0.0f) {
                r80.c("scrollOffset should be non-negative");
            }
            ((xu0) vgVar.c).i(i2);
        } else {
            sf0 sf0Var2 = (sf0) CollectionsKt.firstOrNull(list);
            sf0 sf0Var3 = (sf0) CollectionsKt.t(list);
            if (sf0Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = sf0Var2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            Trace.setCounter("lastVisibleItem:index", sf0Var3 != null ? sf0Var3.a : -1L);
            vgVar.getClass();
            vgVar.d = sf0Var != null ? sf0Var.g : null;
            if (vgVar.a || i > 0) {
                vgVar.a = true;
                if (i2 < 0.0f) {
                    r80.c(str);
                }
                vgVar.b(sf0Var != null ? sf0Var.a : 0, i2);
            }
            if (this.j) {
                hq hqVar = this.a;
                int i3 = hqVar.a;
                boolean z3 = hqVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != hq.a(rf0Var, z3)) {
                    hqVar.a = -1;
                    af0 af0Var = hqVar.b;
                    if (af0Var != null) {
                        af0Var.cancel();
                    }
                    hqVar.b = null;
                }
                int i4 = hqVar.d;
                if (i4 != -1 && hqVar.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int a = hq.a(rf0Var, hqVar.e < 0.0f);
                    if (a >= 0 && a < i) {
                        hqVar.a = a;
                        hqVar.b = s40.y(this.q, a);
                    }
                }
                hqVar.d = i;
            }
        }
        if (z) {
            float f = rf0Var.f;
            nr nrVar = rf0Var.i;
            sn snVar = rf0Var.h;
            ywVar.getClass();
            if (f <= nrVar.s(1.0f)) {
                return;
            }
            n = ca0.n();
            e = n != null ? n.e() : null;
            s = ca0.s(n);
            try {
                float floatValue = ((Number) ((q7) ywVar.g).e.getValue()).floatValue();
                rc1 rc1Var2 = (rc1) ywVar.e;
                if (rc1Var2 != null) {
                    rc1Var2.a(null);
                }
                q7 q7Var = (q7) ywVar.g;
                if (q7Var.j) {
                    ywVar.g = mo.j(q7Var, floatValue - f);
                } else {
                    ywVar.g = new q7(c51Var, Float.valueOf(-f), null, 60);
                }
                ywVar.e = uq1.N(snVar, null, new rp(ywVar, dnVar, 5), 3);
            } finally {
            }
        }
    }

    public final rf0 g() {
        return (rf0) this.f.getValue();
    }

    public final void h(float f, rf0 rf0Var) {
        af0 af0Var;
        af0 af0Var2;
        if (this.j) {
            boolean isEmpty = rf0Var.k.isEmpty();
            hq hqVar = this.a;
            if (!isEmpty) {
                boolean z = f < 0.0f;
                int a = hq.a(rf0Var, z);
                if (a >= 0 && a < rf0Var.n) {
                    if (a != hqVar.a) {
                        if (hqVar.c != z) {
                            hqVar.a = -1;
                            af0 af0Var3 = hqVar.b;
                            if (af0Var3 != null) {
                                af0Var3.cancel();
                            }
                            hqVar.b = null;
                        }
                        hqVar.c = z;
                        hqVar.a = a;
                        hqVar.b = s40.y(this.q, a);
                    }
                    List list = rf0Var.k;
                    if (z) {
                        sf0 sf0Var = (sf0) CollectionsKt.s(list);
                        if (((sf0Var.j + sf0Var.k) + rf0Var.q) - rf0Var.m < (-f) && (af0Var2 = hqVar.b) != null) {
                            af0Var2.e();
                        }
                    } else if (rf0Var.l - ((sf0) CollectionsKt.p(list)).j < f && (af0Var = hqVar.b) != null) {
                        af0Var.e();
                    }
                }
            }
            hqVar.e = f;
        }
    }
}
