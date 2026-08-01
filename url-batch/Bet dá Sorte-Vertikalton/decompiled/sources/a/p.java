package a;

import a1.InterfaceC0058a;

/* loaded from: classes.dex */
public final class p extends b1.e implements InterfaceC0058a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1154b = i;
        this.f1155c = xVar;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        switch (this.f1154b) {
            case 0:
                this.f1155c.b();
                break;
            case 1:
                this.f1155c.a();
                break;
            default:
                this.f1155c.b();
                break;
        }
        return S0.d.f774c;
    }
}
