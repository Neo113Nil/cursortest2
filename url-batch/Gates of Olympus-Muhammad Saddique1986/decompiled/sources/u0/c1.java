package u0;

import I.C0143d;
import I.C0181w0;
import I.C0185y0;
import I.C0187z0;
import android.view.View;
import androidx.lifecycle.InterfaceC0292v;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.InterfaceC1043N;

/* loaded from: classes.dex */
public final class c1 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9321h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2.u f9323j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f9324k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0292v f9325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f9326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f9327n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f2.u uVar, C0187z0 c0187z0, InterfaceC0292v interfaceC0292v, d1 d1Var, View view, V1.d dVar) {
        super(2, dVar);
        this.f9323j = uVar;
        this.f9324k = c0187z0;
        this.f9325l = interfaceC0292v;
        this.f9326m = d1Var;
        this.f9327n = view;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((c1) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        c1 c1Var = new c1(this.f9323j, this.f9324k, this.f9325l, this.f9326m, this.f9327n, dVar);
        c1Var.f9322i = obj;
        return c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        q2.X x3;
        q2.m0 m0Var;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9321h;
        InterfaceC0292v interfaceC0292v = this.f9325l;
        R1.y yVar = R1.y.f4171a;
        d1 d1Var = this.f9326m;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9322i;
            try {
                C1128u0 c1128u0 = (C1128u0) this.f9323j.f5832d;
                if (c1128u0 != null) {
                    InterfaceC1043N a3 = g1.a(this.f9327n.getContext().getApplicationContext());
                    c1128u0.f9532d.h(((Number) a3.getValue()).floatValue());
                    m0Var = AbstractC0837y.r(interfaceC0835w, null, null, new b1(a3, c1128u0, null), 3);
                } else {
                    m0Var = null;
                }
                try {
                    C0187z0 c0187z0 = this.f9324k;
                    this.f9322i = m0Var;
                    this.f9321h = 1;
                    C0185y0 c0185y0 = new C0185y0(c0187z0, null);
                    V1.i iVar = this.f4642e;
                    f2.j.c(iVar);
                    Object z3 = AbstractC0837y.z(c0187z0.f2984a, new C0181w0(c0187z0, c0185y0, C0143d.F(iVar), null), this);
                    if (z3 != aVar) {
                        z3 = yVar;
                    }
                    if (z3 != aVar) {
                        z3 = yVar;
                    }
                    if (z3 == aVar) {
                        return aVar;
                    }
                    x3 = m0Var;
                } catch (Throwable th) {
                    x3 = m0Var;
                    th = th;
                    if (x3 != null) {
                    }
                    interfaceC0292v.e().f(d1Var);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                x3 = null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x3 = (q2.X) this.f9322i;
            try {
                R1.a.e(obj);
            } catch (Throwable th3) {
                th = th3;
                if (x3 != null) {
                    x3.a(null);
                }
                interfaceC0292v.e().f(d1Var);
                throw th;
            }
        }
        if (x3 != null) {
            x3.a(null);
        }
        interfaceC0292v.e().f(d1Var);
        return yVar;
    }
}
