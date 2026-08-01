package a;

/* loaded from: classes.dex */
public final class z implements InterfaceC0042c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.C f947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0039B f948b;

    public z(C0039B c0039b, androidx.fragment.app.C c2) {
        X0.f.e(c2, "onBackPressedCallback");
        this.f948b = c0039b;
        this.f947a = c2;
    }

    @Override // a.InterfaceC0042c
    public final void cancel() {
        C0039B c0039b = this.f948b;
        O0.f fVar = c0039b.f894b;
        androidx.fragment.app.C c2 = this.f947a;
        fVar.remove(c2);
        if (X0.f.a(c0039b.f895c, c2)) {
            c2.getClass();
            c0039b.f895c = null;
        }
        c2.f1196b.remove(this);
        C0038A c0038a = c2.f1197c;
        if (c0038a != null) {
            c0038a.a();
        }
        c2.f1197c = null;
    }
}
