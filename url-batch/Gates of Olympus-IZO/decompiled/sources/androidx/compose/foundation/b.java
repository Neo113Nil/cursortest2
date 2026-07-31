package androidx.compose.foundation;

import I.C0105l;
import I.C0113p;
import U.i;
import U.l;
import Y1.f;
import Z1.j;
import n.Q;

/* loaded from: classes.dex */
public final class b extends j implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f3605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.f f3608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y1.a f3609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Q q2, boolean z3, String str, z0.f fVar, Y1.a aVar) {
        super(3);
        this.f3605e = q2;
        this.f3606f = z3;
        this.f3607g = str;
        this.f3608h = fVar;
        this.f3609i = aVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0113p c0113p = (C0113p) obj2;
        ((Number) obj3).intValue();
        c0113p.Q(-1525724089);
        Object G3 = c0113p.G();
        if (G3 == C0105l.f2272a) {
            G3 = new q.j();
            c0113p.a0(G3);
        }
        q.j jVar = (q.j) G3;
        l e3 = c.a(i.f3302a, jVar, this.f3605e).e(new ClickableElement(jVar, null, this.f3606f, this.f3607g, this.f3608h, this.f3609i));
        c0113p.p(false);
        return e3;
    }
}
