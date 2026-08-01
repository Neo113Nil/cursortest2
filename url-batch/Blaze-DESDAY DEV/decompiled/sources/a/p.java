package a;

import f1.InterfaceC0090a;

/* loaded from: classes.dex */
public final class p extends g1.e implements InterfaceC0090a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1227b = i;
        this.f1228c = xVar;
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        switch (this.f1227b) {
            case 0:
                this.f1228c.b();
                break;
            case 1:
                this.f1228c.a();
                break;
            default:
                this.f1228c.b();
                break;
        }
        return U0.f.f904c;
    }
}
