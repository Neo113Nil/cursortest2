package b;

import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final class p extends j1.i implements InterfaceC0181a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f2200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i) {
        super(0);
        this.f2199b = i;
        this.f2200c = wVar;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        switch (this.f2199b) {
            case 0:
                this.f2200c.b();
                break;
            case 1:
                this.f2200c.a();
                break;
            default:
                this.f2200c.b();
                break;
        }
        return W0.i.f1345a;
    }
}
