package T0;

/* loaded from: classes.dex */
public final class z implements InterfaceC0167b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0169d f2380a;

    public z(C0169d c0169d) {
        this.f2380a = c0169d;
    }

    @Override // T0.InterfaceC0167b
    public final void a(boolean z5) {
        c1.e eVar = this.f2380a.f2293m;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z5)));
    }
}
