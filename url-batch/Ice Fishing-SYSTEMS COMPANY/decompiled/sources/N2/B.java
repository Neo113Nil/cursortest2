package N2;

/* loaded from: classes.dex */
public final class B implements InterfaceC0316b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0318d f1981a;

    public B(C0318d c0318d) {
        this.f1981a = c0318d;
    }

    @Override // N2.InterfaceC0316b
    public final void a(boolean z8) {
        Z2.e eVar = this.f1981a.f2052F;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
