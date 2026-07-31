package n;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;

/* renamed from: n.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696w extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A0.f f7216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f7217h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0696w(boolean z3, String str, A0.f fVar, InterfaceC0422a interfaceC0422a) {
        super(3);
        this.f7214e = z3;
        this.f7215f = str;
        this.f7216g = fVar;
        this.f7217h = interfaceC0422a;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        q.k kVar;
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(-756081143);
        U u3 = (U) c0167p.k(androidx.compose.foundation.d.f4788a);
        if (u3 instanceof Z) {
            c0167p.Q(617140216);
            c0167p.p(false);
            kVar = null;
        } else {
            c0167p.Q(617248189);
            Object G3 = c0167p.G();
            if (G3 == C0159l.f2829a) {
                G3 = new q.k();
                c0167p.a0(G3);
            }
            kVar = (q.k) G3;
            c0167p.p(false);
        }
        q.k kVar2 = kVar;
        U.q b3 = androidx.compose.foundation.a.b(U.n.f4488a, kVar2, u3, this.f7214e, this.f7215f, this.f7216g, this.f7217h);
        c0167p.p(false);
        return b3;
    }
}
