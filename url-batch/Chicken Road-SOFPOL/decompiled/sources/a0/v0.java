package a0;

import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m0.t2;
import m0.u1;
import m0.y1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f160f;

    public /* synthetic */ v0(int i, Object obj, Object obj2) {
        this.f158d = i;
        this.f159e = obj;
        this.f160f = obj2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        androidx.lifecycle.w g3;
        int i = 0;
        int i8 = 1;
        switch (this.f158d) {
            case 0:
                y0 y0Var = (y0) this.f159e;
                Object obj2 = this.f160f;
                y0Var.f180f.i(obj2);
                return new x0(i, y0Var, obj2);
            case 1:
                return new y0((v0.e) this.f159e, (Map) obj, (v0.c) this.f160f);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.z0 z0Var = (m0.z0) this.f159e;
                m0.z0 z0Var2 = (m0.z0) this.f160f;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                z0Var.setValue(num);
                z0Var2.setValue(b6.k.E(intValue));
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((b7.e) this.f159e).f1533f.removeCallbacks((b7.d) this.f160f);
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                d.a aVar = (d.a) this.f159e;
                c.d dVar = (c.d) this.f160f;
                c5.x xVar = aVar.f2044a;
                if (xVar != null) {
                    c5.x.b(xVar, dVar.f1541b);
                } else {
                    b.t tVar = aVar.f2045b;
                    if (tVar == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    b.u uVar = dVar.f1540a;
                    q6.i.e(uVar, "onBackPressedCallback");
                    b.o oVar = new b.o(uVar, new b.p(uVar, null));
                    uVar.f1021a.add(oVar);
                    c5.x.b(tVar.f1020b, oVar);
                }
                return new x0(i8, aVar, dVar);
            case 5:
                ((k0.h) this.f159e).f4162a.setValue(new x.v((x.r0) this.f160f, (x.r0) obj));
                return c6.m.f1757a;
            case 6:
                m0.y yVar = (m0.y) this.f159e;
                o.k0 k0Var = (o.k0) this.f160f;
                yVar.A(obj);
                if (k0Var != null) {
                    k0Var.a(obj);
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                y1 y1Var = (y1) this.f159e;
                Throwable th = (Throwable) this.f160f;
                Throwable th2 = (Throwable) obj;
                synchronized (y1Var.f5189b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                s6.a.e(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    y1Var.f5191d = th;
                    d7.n0 n0Var = y1Var.f5206t;
                    u1 u1Var = u1.f5126d;
                    n0Var.getClass();
                    n0Var.j(null, u1Var);
                }
                return c6.m.f1757a;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                o4.o oVar2 = (o4.o) this.f159e;
                r4.g gVar = ((o4.t) this.f160f).f5685b;
                o4.w wVar = (o4.w) obj;
                q6.i.e(wVar, "$this$navOptions");
                j0.o0 o0Var = wVar.f5698a;
                o0Var.f3809a = 0;
                o0Var.f3810b = 0;
                if (oVar2 instanceof o4.q) {
                    int i9 = o4.o.f5669h;
                    Iterator it = h0.a.G(oVar2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o4.o oVar3 = (o4.o) it.next();
                            o4.o f6 = gVar.f();
                            if (q6.i.a(oVar3, f6 != null ? f6.f5672f : null)) {
                            }
                        } else {
                            int i10 = o4.q.f5679j;
                            wVar.f5701d = m.a.t(gVar.g()).f5671e.f4348a;
                            o4.a0 a0Var = new o4.a0();
                            a0Var.f5618a = true;
                            wVar.f5702e = a0Var.f5618a;
                        }
                    }
                }
                return c6.m.f1757a;
            case x.v0.f8304b /* 9 */:
                return new x0(3, (t2) this.f159e, (p4.i) this.f160f);
            case x.v0.f8306d /* 10 */:
                o4.t tVar2 = (o4.t) this.f159e;
                androidx.lifecycle.u uVar2 = (androidx.lifecycle.u) this.f160f;
                tVar2.getClass();
                q6.i.e(uVar2, "owner");
                r4.g gVar2 = tVar2.f5685b;
                r4.d dVar2 = gVar2.f6600r;
                if (!uVar2.equals(gVar2.f6596n)) {
                    androidx.lifecycle.u uVar3 = gVar2.f6596n;
                    if (uVar3 != null && (g3 = uVar3.g()) != null) {
                        g3.f(dVar2);
                    }
                    gVar2.f6596n = uVar2;
                    uVar2.g().a(dVar2);
                }
                return new p4.v();
            case 11:
                r.c0 c0Var = (r.c0) this.f159e;
                r.a0 a0Var2 = (r.a0) this.f160f;
                c0Var.f6242a.b(a0Var2);
                c0Var.f6243b.setValue(Boolean.TRUE);
                return new x0(4, c0Var, a0Var2);
            case 12:
                a7.x.n((a7.u) this.f159e, null, new i0.g((r.l1) this.f160f, null), 1);
                return new r.k1();
            case 13:
                r.l1 l1Var = (r.l1) this.f159e;
                r.l1 l1Var2 = (r.l1) this.f160f;
                l1Var.f6354j.add(l1Var2);
                return new x0(5, l1Var, l1Var2);
            case 14:
                return new x0(6, (r.l1) this.f159e, (r.f1) this.f160f);
            case x.v0.f8308f /* 15 */:
                f1.j jVar = (f1.j) this.f159e;
                f1.p pVar = (f1.p) this.f160f;
                w1.h0 h0Var = (w1.h0) obj;
                h0Var.a();
                h1.d.l(h0Var, jVar, pVar, 0.0f, null, 60);
                return c6.m.f1757a;
            case 16:
                f1.c0 c0Var2 = (f1.c0) this.f159e;
                f1.p pVar2 = (f1.p) this.f160f;
                w1.h0 h0Var2 = (w1.h0) obj;
                h0Var2.a();
                h1.d.l(h0Var2, c0Var2.f2630e, pVar2, 0.0f, null, 60);
                return c6.m.f1757a;
            case 17:
                ((v.j) this.f159e).c((v.h) this.f160f);
                return c6.m.f1757a;
            case 18:
                ((l) this.f159e).f112a.j((u.f) this.f160f);
                return c6.m.f1757a;
            case 19:
                u.c1 c1Var = (u.c1) this.f159e;
                u.e1 e1Var = (u.e1) this.f160f;
                long j7 = ((u.l) obj).f7039a;
                c1Var.a(1, e1Var.f6965d == u.j0.f7028e ? e1.b.a(1, j7) : e1.b.a(2, j7));
                return c6.m.f1757a;
            case 20:
                u.l1 l1Var3 = (u.l1) this.f159e;
                p6.c cVar = (p6.c) this.f160f;
                ((Long) obj).longValue();
                float f8 = l1Var3.f7045e;
                l1Var3.f7045e = 0.0f;
                cVar.i(Float.valueOf(f8));
                return c6.m.f1757a;
            case 21:
                x.e0 e0Var = (x.e0) this.f159e;
                u1.l0 l0Var = (u1.l0) this.f160f;
                u1.k0 k0Var2 = (u1.k0) obj;
                if (e0Var.f8212v) {
                    u1.k0.k(k0Var2, l0Var, k0Var2.H(e0Var.f8208r), k0Var2.H(e0Var.f8209s));
                } else {
                    u1.k0.g(k0Var2, l0Var, k0Var2.H(e0Var.f8208r), k0Var2.H(e0Var.f8209s));
                }
                return c6.m.f1757a;
            default:
                x.s0 s0Var = (x.s0) this.f159e;
                View view = (View) this.f160f;
                x.z zVar = s0Var.f8292t;
                if (s0Var.f8291s == 0) {
                    Field field = q3.k0.f6120a;
                    q3.c0.i(view, zVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(zVar);
                    q3.k0.m(view, zVar);
                }
                s0Var.f8291s++;
                return new x0(7, s0Var, view);
        }
    }
}
