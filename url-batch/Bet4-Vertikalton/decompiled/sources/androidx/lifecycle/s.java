package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0072m f1486a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0075p f1487b;

    public final void a(r rVar, EnumC0071l enumC0071l) {
        EnumC0072m a2 = enumC0071l.a();
        EnumC0072m enumC0072m = this.f1486a;
        d1.d.e(enumC0072m, "state1");
        if (a2.compareTo(enumC0072m) < 0) {
            enumC0072m = a2;
        }
        this.f1486a = enumC0072m;
        this.f1487b.g(rVar, enumC0071l);
        this.f1486a = a2;
    }
}
