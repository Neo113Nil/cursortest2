package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0073m f1427a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0076p f1428b;

    public final void a(r rVar, EnumC0072l enumC0072l) {
        EnumC0073m a2 = enumC0072l.a();
        EnumC0073m enumC0073m = this.f1427a;
        b1.d.e(enumC0073m, "state1");
        if (a2.compareTo(enumC0073m) < 0) {
            enumC0073m = a2;
        }
        this.f1427a = enumC0073m;
        this.f1428b.g(rVar, enumC0072l);
        this.f1427a = a2;
    }
}
