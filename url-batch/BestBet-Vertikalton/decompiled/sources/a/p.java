package a;

import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class p extends k1.f implements InterfaceC0170a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1601b = i;
        this.f1602c = xVar;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        switch (this.f1601b) {
            case 0:
                this.f1602c.b();
                break;
            case 1:
                this.f1602c.a();
                break;
            default:
                this.f1602c.b();
                break;
        }
        return X0.g.f1277c;
    }
}
