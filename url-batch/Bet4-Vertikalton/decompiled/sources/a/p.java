package a;

import c1.InterfaceC0085a;

/* loaded from: classes.dex */
public final class p extends d1.e implements InterfaceC0085a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1197b = i;
        this.f1198c = xVar;
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        switch (this.f1197b) {
            case 0:
                this.f1198c.b();
                break;
            case 1:
                this.f1198c.a();
                break;
            default:
                this.f1198c.b();
                break;
        }
        return R0.f.f780c;
    }
}
