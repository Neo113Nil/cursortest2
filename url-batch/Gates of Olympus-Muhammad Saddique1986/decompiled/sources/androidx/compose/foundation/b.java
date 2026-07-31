package androidx.compose.foundation;

import A0.f;
import I.C0159l;
import I.C0167p;
import U.n;
import U.q;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;
import f2.k;
import n.U;

/* loaded from: classes.dex */
public final class b extends k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f4783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f4787i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(U u3, boolean z3, String str, f fVar, InterfaceC0422a interfaceC0422a) {
        super(3);
        this.f4783e = u3;
        this.f4784f = z3;
        this.f4785g = str;
        this.f4786h = fVar;
        this.f4787i = interfaceC0422a;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(-1525724089);
        Object G3 = c0167p.G();
        if (G3 == C0159l.f2829a) {
            G3 = new q.k();
            c0167p.a0(G3);
        }
        q.k kVar = (q.k) G3;
        q i3 = d.a(n.f4488a, kVar, this.f4783e).i(new ClickableElement(kVar, null, this.f4784f, this.f4785g, this.f4786h, this.f4787i));
        c0167p.p(false);
        return i3;
    }
}
