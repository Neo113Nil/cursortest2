package w;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import kotlin.jvm.functions.Function1;
import o.C0895k0;
import o.C0906q;
import o.InterfaceC0893j0;
import p.C0935k;
import s0.AbstractC1144g0;
import s0.C1160o0;

/* loaded from: classes.dex */
public final class k0 extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f11241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11242e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0935k f11243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, boolean z4, C0935k c0935k) {
        super(3);
        this.f11241d = m0Var;
        this.f11242e = z4;
        this.f11243i = c0935k;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(805428266);
        boolean z4 = c0216p.k(AbstractC1144g0.f10224l) == M0.k.f3556e;
        m0 m0Var = this.f11241d;
        boolean z5 = ((o.N) m0Var.f11256e.getValue()) == o.N.f8665d || !z4;
        boolean f4 = c0216p.f(m0Var);
        Object I3 = c0216p.I();
        Object obj4 = C0208l.f2826a;
        if (f4 || I3 == obj4) {
            I3 = new C1160o0(9, m0Var);
            c0216p.c0(I3);
        }
        InterfaceC0191c0 N3 = C0192d.N((Function1) I3, c0216p);
        Object I4 = c0216p.I();
        if (I4 == obj4) {
            Object c0906q = new C0906q(new C0895k0(0, N3));
            c0216p.c0(c0906q);
            I4 = c0906q;
        }
        InterfaceC0893j0 interfaceC0893j0 = (InterfaceC0893j0) I4;
        boolean f5 = c0216p.f(interfaceC0893j0) | c0216p.f(m0Var);
        Object I5 = c0216p.I();
        if (f5 || I5 == obj4) {
            I5 = new j0(interfaceC0893j0, m0Var);
            c0216p.c0(I5);
        }
        S.o b4 = androidx.compose.foundation.gestures.a.b(S.l.f3977a, (j0) I5, (o.N) m0Var.f11256e.getValue(), null, this.f11242e && m0Var.f11253b.d() != 0.0f, z5, null, this.f11243i, null);
        c0216p.q(false);
        return b4;
    }
}
