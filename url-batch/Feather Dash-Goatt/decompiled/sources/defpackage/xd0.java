package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xd0 implements mk {
    public final jd0 d;
    public ml e;
    public yw g;
    public int h;
    public int i;
    public final vn0 j;
    public final vn0 k;
    public final rd0 l;
    public final od0 m;
    public final vn0 n;
    public final ff1 o;
    public final vn0 p;
    public final eo0 q;
    public int r;
    public int s;

    public xd0(jd0 jd0Var, yw ywVar) {
        this.d = jd0Var;
        this.g = ywVar;
        long[] jArr = q61.a;
        this.j = new vn0();
        this.k = new vn0();
        this.l = new rd0(this);
        this.m = new od0(this);
        this.n = new vn0();
        this.o = new ff1();
        this.p = new vn0();
        this.q = new eo0(new Object[16]);
    }

    public static final void b(xd0 xd0Var, Object obj) {
        jd0 jd0Var = xd0Var.d;
        xd0Var.h();
        jd0 jd0Var2 = (jd0) xd0Var.n.k(obj);
        if (jd0Var2 != null) {
            if (xd0Var.s <= 0) {
                o80.b("No pre-composed items to dispose");
            }
            int i = ((bo0) jd0Var.n()).d.i(jd0Var2);
            if (i < ((bo0) jd0Var.n()).d.g - xd0Var.s) {
                o80.b("Item is not in pre-composed item range");
            }
            xd0Var.r++;
            xd0Var.s--;
            pd0 pd0Var = (pd0) xd0Var.j.g(jd0Var2);
            if (pd0Var != null) {
                e(pd0Var);
            }
            int i2 = (((bo0) jd0Var.n()).d.g - xd0Var.s) - xd0Var.r;
            xd0Var.j(i, i2);
            xd0Var.g(i2);
        }
        if (xd0Var.q.h(obj)) {
            jd0.T(jd0Var, true, 6);
        }
    }

    public static void e(pd0 pd0Var) {
        wn0 wn0Var;
        cw0 cw0Var = pd0Var.f;
        if (cw0Var != null) {
            cw0Var.h.set(ew0.e);
            i21 i21Var = cw0Var.k;
            if (i21Var.d.h()) {
                wn0Var = i21Var.d;
                wn0 wn0Var2 = r61.a;
                i21Var.d = new wn0();
                i21Var.c.g();
            } else {
                wn0Var = null;
            }
            i21Var.b();
            tl tlVar = cw0Var.a;
            tlVar.u = null;
            if (wn0Var != null) {
                tlVar.y.k = wn0Var;
                tlVar.A = 2;
            }
            pd0Var.f = null;
            tl tlVar2 = pd0Var.c;
            if (tlVar2 != null) {
                tlVar2.m();
            }
            pd0Var.c = null;
        }
    }

    @Override // defpackage.mk
    public final void a() {
        tl tlVar;
        jd0 jd0Var = this.d;
        jd0Var.v = true;
        vn0 vn0Var = this.j;
        Object[] objArr = vn0Var.c;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (tlVar = ((pd0) objArr[(i << 3) + i3]).c) != null) {
                            tlVar.m();
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
        jd0Var.N();
        jd0Var.v = false;
        vn0Var.a();
        this.k.a();
        this.s = 0;
        this.r = 0;
        this.n.a();
        h();
    }

    @Override // defpackage.mk
    public final void c() {
        i(true);
    }

    public final void d(pd0 pd0Var, boolean z) {
        cw0 cw0Var = pd0Var.f;
        if (cw0Var != null) {
            ib1 n = ca0.n();
            Function1 e = n != null ? n.e() : null;
            ib1 s = ca0.s(n);
            try {
                jd0 jd0Var = this.d;
                jd0Var.v = true;
                if (z) {
                    while (!cw0Var.c()) {
                        try {
                            cw0Var.e(new dd0(1));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                cw0Var.a();
                pd0Var.f = null;
                jd0Var.v = false;
            } finally {
                ca0.u(n, s, e);
            }
        }
    }

    public final bf1 f(Object obj) {
        return !this.d.F() ? new ud0() : new vd0(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.r = 0;
        List n = this.d.n();
        bo0 bo0Var = (bo0) n;
        int i2 = (bo0Var.d.g - this.s) - 1;
        if (i <= i2) {
            this.o.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.j.g((jd0) bo0Var.get(i3));
                    g.getClass();
                    ((nn0) this.o.e).a(((pd0) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            yw ywVar = this.g;
            ff1 ff1Var = this.o;
            ln0 ln0Var = (ln0) ywVar.g;
            ln0Var.a();
            nn0 nn0Var = (nn0) ff1Var.e;
            Object[] objArr = nn0Var.b;
            long[] jArr = nn0Var.c;
            int i4 = nn0Var.e;
            while (i4 != Integer.MAX_VALUE) {
                int i5 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                Object b = ((pe0) ywVar.e).b(obj);
                int d = ln0Var.d(b);
                int i6 = d >= 0 ? ln0Var.c[d] : 0;
                if (i6 == 7) {
                    ff1Var.remove(obj);
                } else {
                    ln0Var.g(i6 + 1, b);
                }
                i4 = i5;
            }
            ib1 n2 = ca0.n();
            Function1 e = n2 != null ? n2.e() : null;
            ib1 s = ca0.s(n2);
            z = false;
            while (i2 >= i) {
                try {
                    jd0 jd0Var = (jd0) ((bo0) n).get(i2);
                    Object g2 = this.j.g(jd0Var);
                    g2.getClass();
                    pd0 pd0Var = (pd0) g2;
                    Object obj2 = pd0Var.a;
                    if (((nn0) this.o.e).c(obj2)) {
                        this.r++;
                        if (((Boolean) pd0Var.g.getValue()).booleanValue()) {
                            nd0 nd0Var = jd0Var.K;
                            uk0 uk0Var = nd0Var.p;
                            hd0 hd0Var = hd0.g;
                            uk0Var.p = hd0Var;
                            kj0 kj0Var = nd0Var.q;
                            if (kj0Var != null) {
                                kj0Var.n = hd0Var;
                            }
                            l(pd0Var, false);
                            if (pd0Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        jd0 jd0Var2 = this.d;
                        jd0Var2.v = true;
                        this.j.k(jd0Var);
                        tl tlVar = pd0Var.c;
                        if (tlVar != null) {
                            tlVar.m();
                        }
                        this.d.O(i2, 1);
                        jd0Var2.v = false;
                    }
                    this.k.k(obj2);
                    i2--;
                } catch (Throwable th) {
                    ca0.u(n2, s, e);
                    throw th;
                }
            }
            ca0.u(n2, s, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (pb1.c) {
                wn0 wn0Var = pb1.j.h;
                if (wn0Var != null) {
                    if (wn0Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                pb1.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((bo0) this.d.n()).d.g;
        vn0 vn0Var = this.j;
        if (vn0Var.e != i) {
            o80.a("Inconsistency between the count of nodes tracked by the state (" + vn0Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.r) - this.s < 0) {
            StringBuilder n = qy0.n("Incorrect state. Total children ", i, ". Reusable children ");
            n.append(this.r);
            n.append(". Precomposed children ");
            n.append(this.s);
            o80.a(n.toString());
        }
        vn0 vn0Var2 = this.n;
        if (vn0Var2.e == this.s) {
            return;
        }
        o80.a("Incorrect state. Precomposed children " + this.s + ". Map size " + vn0Var2.e);
    }

    public final void i(boolean z) {
        this.s = 0;
        this.n.a();
        List n = this.d.n();
        int i = ((bo0) n).d.g;
        if (this.r != i) {
            this.r = i;
            ib1 n2 = ca0.n();
            Function1 e = n2 != null ? n2.e() : null;
            ib1 s = ca0.s(n2);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    jd0 jd0Var = (jd0) ((bo0) n).get(i2);
                    pd0 pd0Var = (pd0) this.j.g(jd0Var);
                    if (pd0Var != null && ((Boolean) pd0Var.g.getValue()).booleanValue()) {
                        nd0 nd0Var = jd0Var.K;
                        uk0 uk0Var = nd0Var.p;
                        hd0 hd0Var = hd0.g;
                        uk0Var.p = hd0Var;
                        kj0 kj0Var = nd0Var.q;
                        if (kj0Var != null) {
                            kj0Var.n = hd0Var;
                        }
                        l(pd0Var, z);
                        pd0Var.a = la0.u;
                    }
                } catch (Throwable th) {
                    ca0.u(n2, s, e);
                    throw th;
                }
            }
            ca0.u(n2, s, e);
            this.k.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        jd0 jd0Var = this.d;
        jd0Var.v = true;
        jd0Var.J(i, i2, 1);
        jd0Var.v = false;
    }

    public final void k(Object obj, Function2 function2, boolean z) {
        jd0 jd0Var = this.d;
        if (jd0Var.F()) {
            h();
            if (this.k.c(obj)) {
                return;
            }
            this.p.k(obj);
            vn0 vn0Var = this.n;
            Object g = vn0Var.g(obj);
            if (g == null) {
                g = n(obj);
                if (g != null) {
                    j(((bo0) jd0Var.n()).d.i(g), ((bo0) jd0Var.n()).d.g);
                    this.s++;
                } else {
                    int i = ((bo0) jd0Var.n()).d.g;
                    jd0 jd0Var2 = new jd0(2);
                    jd0Var.v = true;
                    jd0Var.z(i, jd0Var2);
                    jd0Var.v = false;
                    this.s++;
                    g = jd0Var2;
                }
                vn0Var.m(obj, g);
            }
            m((jd0) g, obj, z, function2);
        }
    }

    public final void l(pd0 pd0Var, boolean z) {
        tl tlVar;
        if (z || !pd0Var.h) {
            pd0Var.g = gb0.F(Boolean.FALSE);
        } else {
            pd0Var.g.setValue(Boolean.FALSE);
        }
        if (pd0Var.f != null) {
            e(pd0Var);
            return;
        }
        if (z) {
            tl tlVar2 = pd0Var.c;
            if (tlVar2 != null) {
                tlVar2.l();
                return;
            }
            return;
        }
        ft0 m14getOutOfFrameExecutor = ((d4) md0.a(this.d)).m14getOutOfFrameExecutor();
        if (m14getOutOfFrameExecutor == null) {
            if (pd0Var.h || (tlVar = pd0Var.c) == null) {
                return;
            }
            tlVar.l();
            return;
        }
        ce ceVar = new ce(5, pd0Var);
        d4 d4Var = (d4) m14getOutOfFrameExecutor;
        m9 m9Var = d4Var.l;
        boolean isEmpty = m9Var.isEmpty();
        m9Var.addLast(ceVar);
        if (isEmpty) {
            Handler handler = d4Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(d4Var.m);
            } else {
                dd0.e("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x0110, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010d, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0124), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x0110, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010d, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0124), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x0110, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010d, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0124), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x0110, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010d, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0124), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(jd0 jd0Var, Object obj, boolean z, Function2 function2) {
        boolean z2;
        tl tlVar;
        vn0 vn0Var = this.j;
        Object g = vn0Var.g(jd0Var);
        Object obj2 = g;
        if (g == null) {
            hk hkVar = jk.a;
            pd0 pd0Var = new pd0();
            pd0Var.a = obj;
            pd0Var.b = hkVar;
            pd0Var.c = null;
            pd0Var.g = gb0.F(Boolean.TRUE);
            vn0Var.m(jd0Var, pd0Var);
            obj2 = pd0Var;
        }
        pd0 pd0Var2 = (pd0) obj2;
        boolean z3 = pd0Var2.b != function2;
        if (pd0Var2.f != null) {
            if (z3) {
                e(pd0Var2);
            } else if (z) {
                return;
            } else {
                d(pd0Var2, true);
            }
        }
        tl tlVar2 = pd0Var2.c;
        if (tlVar2 != null) {
            synchronized (tlVar2.h) {
                z2 = tlVar2.r.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || pd0Var2.d) {
            pd0Var2.b = function2;
            if (pd0Var2.f != null) {
                o80.a("new subcompose call while paused composition is still active");
            }
            ib1 n = ca0.n();
            Function1 e = n != null ? n.e() : null;
            ib1 s = ca0.s(n);
            try {
                jd0 jd0Var2 = this.d;
                jd0Var2.v = true;
                tl tlVar3 = pd0Var2.c;
                ml mlVar = this.e;
                if (mlVar == null) {
                    o80.c("parent composition reference not set");
                    throw new kc0();
                }
                if (tlVar3 != null) {
                    if (tlVar3.A == 3) {
                    }
                    pd0Var2.c = tlVar3;
                    Function2 function22 = pd0Var2.b;
                    if (((d4) md0.a(this.d)).m14getOutOfFrameExecutor() == null) {
                        pd0Var2.h = false;
                    } else {
                        pd0Var2.h = true;
                        function22 = new hk(1524156494, true, new r4(pd0Var2, 2, function22));
                    }
                    if (z) {
                        if (pd0Var2.e) {
                            tlVar3.i();
                            tlVar3.q();
                            hl hlVar = tlVar3.z;
                            hlVar.z = 100;
                            hlVar.y = true;
                            tlVar3.B = function22;
                            tlVar3.d.a(tlVar3, function22);
                            hlVar.s();
                        } else {
                            tlVar3.B(function22);
                        }
                    } else if (pd0Var2.e) {
                        tlVar3.i();
                        tlVar3.q();
                        pd0Var2.f = tlVar3.k(true, function22);
                    } else {
                        pd0Var2.f = tlVar3.k(tlVar3.i(), function22);
                    }
                    pd0Var2.e = false;
                    jd0Var2.v = false;
                    ca0.u(n, s, e);
                    pd0Var2.d = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = mq1.a;
                    tlVar = new tl(mlVar, new mk1(jd0Var));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = mq1.a;
                    tlVar = new tl(mlVar, new mk1(jd0Var));
                }
                tlVar3 = tlVar;
                pd0Var2.c = tlVar3;
                Function2 function222 = pd0Var2.b;
                if (((d4) md0.a(this.d)).m14getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                pd0Var2.e = false;
                jd0Var2.v = false;
                ca0.u(n, s, e);
                pd0Var2.d = false;
            } catch (Throwable th) {
                ca0.u(n, s, e);
                throw th;
            }
        }
    }

    public final jd0 n(Object obj) {
        vn0 vn0Var;
        int i;
        if (this.r == 0) {
            return null;
        }
        bo0 bo0Var = (bo0) this.d.n();
        int i2 = bo0Var.d.g - this.s;
        int i3 = i2 - this.r;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            vn0Var = this.j;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = vn0Var.g((jd0) bo0Var.get(i5));
            g.getClass();
            if (((pd0) g).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = vn0Var.g((jd0) bo0Var.get(i4));
                g2.getClass();
                pd0 pd0Var = (pd0) g2;
                Object obj2 = pd0Var.a;
                if (obj2 != la0.u) {
                    pe0 pe0Var = (pe0) this.g.e;
                    if (!Intrinsics.a(pe0Var.b(obj), pe0Var.b(obj2))) {
                        i4--;
                    }
                }
                pd0Var.a = obj;
                i5 = i4;
                i = i5;
                break;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.r--;
        jd0 jd0Var = (jd0) bo0Var.get(i3);
        Object g3 = vn0Var.g(jd0Var);
        g3.getClass();
        pd0 pd0Var2 = (pd0) g3;
        pd0Var2.g = gb0.F(Boolean.TRUE);
        pd0Var2.e = true;
        pd0Var2.d = true;
        return jd0Var;
    }
}
