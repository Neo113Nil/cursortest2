package o1;

import k0.y;

/* loaded from: classes.dex */
public final class l extends Z0.e implements Y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1.e f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1.k f3406c;
    public final /* synthetic */ k1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k1.e eVar, k1.k kVar, k1.a aVar) {
        super(0);
        this.f3405b = eVar;
        this.f3406c = kVar;
        this.d = aVar;
    }

    @Override // Y0.a
    public final Object a() {
        y yVar = this.f3405b.f2784b;
        Z0.d.b(yVar);
        return yVar.d(this.f3406c.a(), this.d.h.d);
    }
}
