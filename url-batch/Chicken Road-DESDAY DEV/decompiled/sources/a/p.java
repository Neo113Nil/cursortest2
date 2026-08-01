package a;

import a1.InterfaceC0059a;

/* loaded from: classes.dex */
public final class p extends b1.e implements InterfaceC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1140b = i;
        this.f1141c = xVar;
    }

    @Override // a1.InterfaceC0059a
    public final Object a() {
        switch (this.f1140b) {
            case 0:
                this.f1141c.b();
                break;
            case 1:
                this.f1141c.a();
                break;
            default:
                this.f1141c.b();
                break;
        }
        return S0.f.f759c;
    }
}
