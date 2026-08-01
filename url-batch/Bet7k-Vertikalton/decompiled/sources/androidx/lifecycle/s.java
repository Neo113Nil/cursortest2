package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0069m f1366a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0072p f1367b;

    public final void a(r rVar, EnumC0068l enumC0068l) {
        EnumC0069m a2 = enumC0068l.a();
        EnumC0069m enumC0069m = this.f1366a;
        X0.d.e(enumC0069m, "state1");
        if (a2.compareTo(enumC0069m) < 0) {
            enumC0069m = a2;
        }
        this.f1366a = enumC0069m;
        this.f1367b.e(rVar, enumC0068l);
        this.f1366a = a2;
    }
}
