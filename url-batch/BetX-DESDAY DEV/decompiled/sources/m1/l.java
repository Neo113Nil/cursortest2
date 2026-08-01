package m1;

import i1.C0167a;

/* loaded from: classes.dex */
public final class l extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.f f3587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.l f3588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0167a f3589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.f fVar, i1.l lVar, C0167a c0167a) {
        super(0);
        this.f3587b = fVar;
        this.f3588c = lVar;
        this.f3589d = c0167a;
    }

    @Override // W0.a
    public final Object a() {
        i1.m mVar = this.f3587b.f2662b;
        X0.f.b(mVar);
        return mVar.f(this.f3588c.a(), this.f3589d.h.f2719d);
    }
}
