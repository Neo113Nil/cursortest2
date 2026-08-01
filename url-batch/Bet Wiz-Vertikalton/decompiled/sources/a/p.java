package a;

import d1.InterfaceC0081a;

/* loaded from: classes.dex */
public final class p extends e1.e implements InterfaceC0081a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1184b = i;
        this.f1185c = xVar;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        switch (this.f1184b) {
            case 0:
                this.f1185c.b();
                break;
            case 1:
                this.f1185c.a();
                break;
            default:
                this.f1185c.b();
                break;
        }
        return V0.e.f878c;
    }
}
