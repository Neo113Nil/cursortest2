package f1;

import a0.x0;
import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import m0.j1;
import m0.z0;
import u1.c1;
import u1.d1;
import u1.e1;
import u1.p0;
import x1.h2;
import x1.i2;
import x1.m0;
import x1.n0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj, Object obj2) {
        super(1);
        this.f2689e = i;
        this.f2690f = obj;
        this.f2691g = obj2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        View h8;
        switch (this.f2689e) {
            case 0:
                u1.k0.o((u1.k0) obj, (u1.l0) this.f2690f, ((o) this.f2691g).f2692r);
                return c6.m.f1757a;
            case 1:
                u1.k0.o((u1.k0) obj, (u1.l0) this.f2690f, ((j0) this.f2691g).C);
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                u1.k0 k0Var = (u1.k0) obj;
                u1.l0 l0Var = (u1.l0) this.f2690f;
                float g3 = ((q.b0) this.f2691g).f5803c.g();
                k0Var.getClass();
                long j7 = 0;
                u1.k0.a(k0Var, l0Var);
                l0Var.U(r2.i.c((j7 & 4294967295L) | (j7 << 32), l0Var.f7234h), g3, null);
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                w1.k0 k0Var2 = (w1.k0) obj;
                p0 p0Var = (p0) this.f2690f;
                if (p0Var.f7255r.f7251j.g() > 0) {
                    long G = k0Var2.a().G();
                    o.j0 j0Var = ((u1.o) this.f2691g).i;
                    int i = (int) (G >> 32);
                    int i8 = (int) (G & 4294967295L);
                    for (c1 c1Var : androidx.compose.ui.layout.b.f562b) {
                        Object g7 = j0Var.g(c1Var);
                        q6.i.b(g7);
                        e1 e1Var = (e1) g7;
                        d1 d1Var = (d1) c1Var;
                        androidx.compose.ui.layout.b.a(k0Var2, d1Var.f7203c, e1Var.f7212h, i, i8);
                        if (((Boolean) e1Var.f7206b.getValue()).booleanValue()) {
                            androidx.compose.ui.layout.b.a(k0Var2, e1Var.f7210f, e1Var.f7213j, i, i8);
                            androidx.compose.ui.layout.b.a(k0Var2, e1Var.f7211g, e1Var.f7214k, i, i8);
                        }
                        androidx.compose.ui.layout.b.a(k0Var2, d1Var.f7204d, e1Var.i, i, i8);
                    }
                    if (p0Var.f7255r.f7252k.h()) {
                        o.e0 e0Var = p0Var.f7255r.f7252k;
                        Object[] objArr = e0Var.f5442a;
                        int i9 = e0Var.f5443b;
                        for (int i10 = 0; i10 < i9; i10++) {
                            z0 z0Var = (z0) objArr[i10];
                            u1.n nVar = (u1.n) p0Var.f7255r.f7253l.get(i10);
                            Rect rect = (Rect) z0Var.getValue();
                            k0Var2.d(nVar.b(), rect.left);
                            k0Var2.d(nVar.d(), rect.top);
                            k0Var2.d(nVar.c(), rect.right);
                            k0Var2.d(nVar.a(), rect.bottom);
                        }
                    }
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                Context context = (Context) this.f2690f;
                Context applicationContext = context.getApplicationContext();
                x1.i0 i0Var = (x1.i0) this.f2691g;
                applicationContext.registerComponentCallbacks(i0Var);
                return new x0(8, context, i0Var);
            case 5:
                Context context2 = (Context) this.f2690f;
                Context applicationContext2 = context2.getApplicationContext();
                x1.j0 j0Var2 = (x1.j0) this.f2691g;
                applicationContext2.registerComponentCallbacks(j0Var2);
                return new x0(9, context2, j0Var2);
            case 6:
                m0 m0Var = (m0) this.f2690f;
                n0 n0Var = (n0) this.f2691g;
                synchronized (m0Var.f8502h) {
                    m0Var.f8503j.remove(n0Var);
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Choreographer) ((j1) this.f2690f).f4976e).removeFrameCallback((n0) this.f2691g);
                return c6.m.f1757a;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                View view = (View) obj;
                View view2 = (View) this.f2690f;
                x1.q qVar = new x1.q(view.getNextFocusForwardId(), 1);
                View view3 = null;
                View view4 = null;
                while (true) {
                    h8 = x1.g0.h(view, qVar, view4);
                    if (h8 == null && view != view2) {
                        Object parent = view.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view;
                            view = view5;
                        }
                    }
                }
                view3 = h8;
                return Boolean.valueOf(view3 == ((View) this.f2691g));
            default:
                x1.m mVar = (x1.m) obj;
                p6.e eVar = (p6.e) this.f2691g;
                i2 i2Var = (i2) this.f2690f;
                if (!i2Var.f8460f) {
                    androidx.lifecycle.w g8 = mVar.f8496a.g();
                    i2Var.f8462h = eVar;
                    if (i2Var.f8461g == null) {
                        i2Var.f8461g = g8;
                        g8.a(i2Var);
                    } else if (g8.f871c.compareTo(androidx.lifecycle.p.f849f) >= 0) {
                        i2Var.f8459e.B(new u0.c(1330788943, true, new h2(i2Var, eVar, 1)));
                    }
                }
                return c6.m.f1757a;
        }
    }
}
