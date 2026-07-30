package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v91 implements gz {
    public int A;
    public final String B;
    public final i91 m;
    public d00 n;
    public jq2 o;
    public int p;
    public int q;
    public final tn1 r;
    public final tn1 s;
    public final q91 t;
    public final n91 u;
    public final tn1 v;
    public final iq2 w;
    public final tn1 x;
    public final eo1 y;
    public int z;

    public v91(i91 i91Var, jq2 jq2Var) {
        this.m = i91Var;
        this.o = jq2Var;
        long[] jArr = oe2.a;
        this.r = new tn1();
        this.s = new tn1();
        this.t = new q91(this);
        this.u = new n91(this);
        this.v = new tn1();
        this.w = new iq2();
        this.x = new tn1();
        this.y = new eo1(new Object[16]);
        this.B = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    @Override // defpackage.gz
    public final void a() {
        k00 k00Var;
        i91 i91Var = this.m;
        i91Var.A = true;
        tn1 tn1Var = this.r;
        Object[] objArr = tn1Var.c;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (k00Var = ((o91) objArr[(i << 3) + i3]).c) != null) {
                            k00Var.l();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i91Var.Q();
        Unit unit = Unit.a;
        i91Var.A = false;
        tn1Var.a();
        this.s.a();
        this.A = 0;
        this.z = 0;
        this.v.a();
        d();
    }

    @Override // defpackage.gz
    public final void b() {
        e(true);
    }

    public final void c(int i) {
        boolean z;
        boolean z2 = false;
        this.z = 0;
        List o = this.m.o();
        bo1 bo1Var = (bo1) o;
        int i2 = (bo1Var.m.o - this.A) - 1;
        if (i <= i2) {
            this.w.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.r.g((i91) bo1Var.get(i3));
                    g.getClass();
                    ((ln1) this.w.n).a(((o91) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.o.c(this.w);
            nm2 d = ci2.d();
            Function1 e = d != null ? d.e() : null;
            nm2 f = ci2.f(d);
            z = false;
            while (i2 >= i) {
                try {
                    i91 i91Var = (i91) ((bo1) o).get(i2);
                    Object g2 = this.r.g(i91Var);
                    g2.getClass();
                    o91 o91Var = (o91) g2;
                    Object obj = o91Var.a;
                    if (((ln1) this.w.n).c(obj)) {
                        this.z++;
                        if (((Boolean) o91Var.f.getValue()).booleanValue()) {
                            m91 m91Var = i91Var.Q;
                            nj1 nj1Var = m91Var.p;
                            g91 g91Var = g91.o;
                            nj1Var.x = g91Var;
                            xg1 xg1Var = m91Var.q;
                            if (xg1Var != null) {
                                xg1Var.v = g91Var;
                            }
                            h(o91Var, false);
                            if (o91Var.g) {
                                z = true;
                            }
                        }
                    } else {
                        i91 i91Var2 = this.m;
                        i91Var2.A = true;
                        this.r.k(i91Var);
                        k00 k00Var = o91Var.c;
                        if (k00Var != null) {
                            k00Var.l();
                        }
                        this.m.R(i2, 1);
                        Unit unit = Unit.a;
                        i91Var2.A = false;
                    }
                    this.s.k(obj);
                    i2--;
                } catch (Throwable th) {
                    ci2.j(d, f, e);
                    throw th;
                }
            }
            Unit unit2 = Unit.a;
            ci2.j(d, f, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (tm2.c) {
                un1 un1Var = tm2.j.h;
                if (un1Var != null) {
                    if (un1Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                tm2.a();
            }
        }
        d();
    }

    public final void d() {
        int i = ((bo1) this.m.o()).m.o;
        tn1 tn1Var = this.r;
        if (tn1Var.e != i) {
            h21.a("Inconsistency between the count of nodes tracked by the state (" + tn1Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.z) - this.A < 0) {
            StringBuilder n = in1.n(i, "Incorrect state. Total children ", ". Reusable children ");
            n.append(this.z);
            n.append(". Precomposed children ");
            n.append(this.A);
            h21.a(n.toString());
        }
        tn1 tn1Var2 = this.v;
        if (tn1Var2.e == this.A) {
            return;
        }
        h21.a("Incorrect state. Precomposed children " + this.A + ". Map size " + tn1Var2.e);
    }

    public final void e(boolean z) {
        this.A = 0;
        this.v.a();
        List o = this.m.o();
        int i = ((bo1) o).m.o;
        if (this.z != i) {
            this.z = i;
            nm2 d = ci2.d();
            Function1 e = d != null ? d.e() : null;
            nm2 f = ci2.f(d);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    i91 i91Var = (i91) ((bo1) o).get(i2);
                    o91 o91Var = (o91) this.r.g(i91Var);
                    if (o91Var != null && ((Boolean) o91Var.f.getValue()).booleanValue()) {
                        m91 m91Var = i91Var.Q;
                        nj1 nj1Var = m91Var.p;
                        g91 g91Var = g91.o;
                        nj1Var.x = g91Var;
                        xg1 xg1Var = m91Var.q;
                        if (xg1Var != null) {
                            xg1Var.v = g91Var;
                        }
                        h(o91Var, z);
                        o91Var.a = j8.u;
                    }
                } catch (Throwable th) {
                    ci2.j(d, f, e);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            ci2.j(d, f, e);
            this.s.a();
        }
        d();
    }

    public final void f(int i, int i2) {
        i91 i91Var = this.m;
        i91Var.A = true;
        i91Var.M(i, i2, 1);
        Unit unit = Unit.a;
        i91Var.A = false;
    }

    public final eq2 g(Object obj, Function2 function2) {
        i91 i91Var = this.m;
        if (i91Var.I()) {
            d();
            if (!this.s.c(obj)) {
                this.x.k(obj);
                tn1 tn1Var = this.v;
                Object g = tn1Var.g(obj);
                if (g == null) {
                    g = j(obj);
                    if (g != null) {
                        f(((bo1) i91Var.o()).m.j(g), ((bo1) i91Var.o()).m.o);
                        this.A++;
                    } else {
                        int i = ((bo1) i91Var.o()).m.o;
                        i91 i91Var2 = new i91(2);
                        i91Var.A = true;
                        i91Var.A(i, i91Var2);
                        Unit unit = Unit.a;
                        i91Var.A = false;
                        this.A++;
                        g = i91Var2;
                    }
                    tn1Var.m(obj, g);
                }
                i((i91) g, obj, function2);
            }
        }
        return !i91Var.I() ? new t91() : new u91(this, obj);
    }

    public final void h(o91 o91Var, boolean z) {
        k00 k00Var;
        if (z || !o91Var.g) {
            o91Var.f = ij2.j(Boolean.FALSE);
        } else {
            o91Var.f.setValue(Boolean.FALSE);
        }
        if (z) {
            k00 k00Var2 = o91Var.c;
            if (k00Var2 != null) {
                k00Var2.k();
                return;
            }
            return;
        }
        xw1 m21getOutOfFrameExecutor = ((t7) l91.a(this.m)).m21getOutOfFrameExecutor();
        if (m21getOutOfFrameExecutor == null) {
            if (o91Var.g || (k00Var = o91Var.c) == null) {
                return;
            }
            k00Var.k();
            return;
        }
        u uVar = new u(15, o91Var);
        Handler handler = ((t7) m21getOutOfFrameExecutor).getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new k3(2, uVar));
        } else {
            lh.e("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c8, B:44:0x00c5, B:45:0x0097, B:47:0x0075, B:48:0x00d4, B:49:0x00de), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c8, B:44:0x00c5, B:45:0x0097, B:47:0x0075, B:48:0x00d4, B:49:0x00de), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c8, B:44:0x00c5, B:45:0x0097, B:47:0x0075, B:48:0x00d4, B:49:0x00de), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c8, B:44:0x00c5, B:45:0x0097, B:47:0x0075, B:48:0x00d4, B:49:0x00de), top: B:26:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(i91 i91Var, Object obj, Function2 function2) {
        boolean z;
        tn1 tn1Var = this.r;
        Object g = tn1Var.g(i91Var);
        Object obj2 = g;
        if (g == null) {
            my myVar = xy.a;
            o91 o91Var = new o91();
            o91Var.a = obj;
            o91Var.b = myVar;
            o91Var.c = null;
            o91Var.f = ij2.j(Boolean.TRUE);
            tn1Var.m(i91Var, o91Var);
            obj2 = o91Var;
        }
        o91 o91Var2 = (o91) obj2;
        boolean z2 = o91Var2.b != function2;
        k00 k00Var = o91Var2.c;
        if (k00Var != null) {
            synchronized (k00Var.p) {
                z = k00Var.z.e > 0;
            }
        } else {
            z = true;
        }
        if (z2 || z || o91Var2.d) {
            o91Var2.b = function2;
            nm2 d = ci2.d();
            Function1 e = d != null ? d.e() : null;
            nm2 f = ci2.f(d);
            try {
                i91 i91Var2 = this.m;
                i91Var2.A = true;
                k00 k00Var2 = o91Var2.c;
                d00 d00Var = this.n;
                if (d00Var == null) {
                    h21.c("parent composition reference not set");
                    throw new k81();
                }
                if (k00Var2 != null) {
                    if (k00Var2.G == 3) {
                    }
                    o91Var2.c = k00Var2;
                    Function2 function22 = o91Var2.b;
                    if (((t7) l91.a(this.m)).m21getOutOfFrameExecutor() == null) {
                        o91Var2.g = false;
                    } else {
                        o91Var2.g = true;
                        function22 = new my(1524156494, new n8(11, o91Var2, function22), true);
                    }
                    if (o91Var2.e) {
                        k00Var2.A(function22);
                    } else {
                        k00Var2.i();
                        k00Var2.p();
                        a00 a00Var = k00Var2.F;
                        a00Var.z = 100;
                        a00Var.y = true;
                        k00Var2.H = function22;
                        k00Var2.m.a(k00Var2, function22);
                        a00Var.u();
                    }
                    o91Var2.e = false;
                    Unit unit = Unit.a;
                    i91Var2.A = false;
                    ci2.j(d, f, e);
                    o91Var2.d = false;
                }
                ViewGroup.LayoutParams layoutParams = h93.a;
                k00Var2 = new k00(d00Var, new t13(i91Var));
                o91Var2.c = k00Var2;
                Function2 function222 = o91Var2.b;
                if (((t7) l91.a(this.m)).m21getOutOfFrameExecutor() == null) {
                }
                if (o91Var2.e) {
                }
                o91Var2.e = false;
                Unit unit2 = Unit.a;
                i91Var2.A = false;
                ci2.j(d, f, e);
                o91Var2.d = false;
            } catch (Throwable th) {
                ci2.j(d, f, e);
                throw th;
            }
        }
    }

    public final i91 j(Object obj) {
        tn1 tn1Var;
        int i;
        if (this.z == 0) {
            return null;
        }
        bo1 bo1Var = (bo1) this.m.o();
        int i2 = bo1Var.m.o - this.A;
        int i3 = i2 - this.z;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            tn1Var = this.r;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = tn1Var.g((i91) bo1Var.get(i5));
            g.getClass();
            if (Intrinsics.b(((o91) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = tn1Var.g((i91) bo1Var.get(i4));
                g2.getClass();
                o91 o91Var = (o91) g2;
                Object obj2 = o91Var.a;
                if (obj2 == j8.u || this.o.i(obj, obj2)) {
                    o91Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            f(i5, i3);
        }
        this.z--;
        i91 i91Var = (i91) bo1Var.get(i3);
        Object g3 = tn1Var.g(i91Var);
        g3.getClass();
        o91 o91Var2 = (o91) g3;
        o91Var2.f = ij2.j(Boolean.TRUE);
        o91Var2.e = true;
        o91Var2.d = true;
        return i91Var;
    }
}
