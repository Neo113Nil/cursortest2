package a;

/* loaded from: classes.dex */
public final class z implements InterfaceC0042c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.C f946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0039B f947b;

    public z(C0039B c0039b, androidx.fragment.app.C c2) {
        X0.f.e(c2, "onBackPressedCallback");
        this.f947b = c0039b;
        this.f946a = c2;
    }

    @Override // a.InterfaceC0042c
    public final void cancel() {
        C0039B c0039b = this.f947b;
        O0.f fVar = c0039b.f893b;
        androidx.fragment.app.C c2 = this.f946a;
        fVar.remove(c2);
        if (X0.f.a(c0039b.f894c, c2)) {
            c2.getClass();
            c0039b.f894c = null;
        }
        c2.f1195b.remove(this);
        C0038A c0038a = c2.f1196c;
        if (c0038a != null) {
            c0038a.a();
        }
        c2.f1196c = null;
    }
}
