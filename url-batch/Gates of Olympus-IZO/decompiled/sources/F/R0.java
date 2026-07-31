package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.InterfaceC0263N;
import java.util.concurrent.atomic.AtomicInteger;
import n.C0665u;
import r.AbstractC0818o;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0963b0;

/* loaded from: classes.dex */
public final class R0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.l f1083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0263N f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0665u f1087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1088j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.a f1089k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(U.l lVar, InterfaceC0263N interfaceC0263N, long j3, float f3, C0665u c0665u, float f4, Q.a aVar) {
        super(2);
        this.f1083e = lVar;
        this.f1084f = interfaceC0263N;
        this.f1085g = j3;
        this.f1086h = f3;
        this.f1087i = c0665u;
        this.f1088j = f4;
        this.f1089k = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        L1.z zVar = L1.z.f2729a;
        if (intValue == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            long d3 = U0.d(this.f1085g, this.f1086h, c0113p);
            float F3 = ((M0.b) c0113p.k(AbstractC0963b0.f8296f)).F(this.f1088j);
            U.l c3 = U0.c(this.f1083e, this.f1084f, d3, this.f1087i, F3);
            C0058p c0058p = C0058p.f1325j;
            AtomicInteger atomicInteger = z0.k.f8985a;
            U.l e3 = c3.e(new AppendedSemanticsElement(c0058p, false));
            Q0 q0 = new Q0(2, null);
            n0.g gVar = n0.r.f6252a;
            U.l e4 = e3.e(new SuspendPointerInputElement(zVar, null, q0, 6));
            InterfaceC0827A e5 = AbstractC0818o.e(U.a.f3280d, true);
            int i3 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c4 = U.m.c(c0113p, e4);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e5);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                AbstractC0080b.p(i3, c0113p, i3, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c4);
            this.f1089k.g(c0113p, 0);
            c0113p.p(true);
        }
        return zVar;
    }
}
