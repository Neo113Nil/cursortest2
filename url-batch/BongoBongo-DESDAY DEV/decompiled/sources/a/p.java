package a;

import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class p extends h1.e implements InterfaceC0110a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1273b = i;
        this.f1274c = xVar;
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        switch (this.f1273b) {
            case 0:
                this.f1274c.b();
                break;
            case 1:
                this.f1274c.a();
                break;
            default:
                this.f1274c.b();
                break;
        }
        return V0.e.f946c;
    }
}
