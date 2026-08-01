package a;

import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final class p extends g1.e implements InterfaceC0099a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1282b = i;
        this.f1283c = xVar;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        switch (this.f1282b) {
            case 0:
                this.f1283c.b();
                break;
            case 1:
                this.f1283c.a();
                break;
            default:
                this.f1283c.b();
                break;
        }
        return W0.e.f956c;
    }
}
