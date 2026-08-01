package m1;

import i1.C0166a;

/* loaded from: classes.dex */
public final class l extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.f f3583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.l f3584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0166a f3585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.f fVar, i1.l lVar, C0166a c0166a) {
        super(0);
        this.f3583b = fVar;
        this.f3584c = lVar;
        this.f3585d = c0166a;
    }

    @Override // W0.a
    public final Object a() {
        i1.m mVar = this.f3583b.f2658b;
        X0.f.b(mVar);
        return mVar.f(this.f3584c.a(), this.f3585d.h.f2715d);
    }
}
