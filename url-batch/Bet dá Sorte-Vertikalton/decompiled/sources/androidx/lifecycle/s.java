package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0072m f1444a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0075p f1445b;

    public final void a(r rVar, EnumC0071l enumC0071l) {
        EnumC0072m a2 = enumC0071l.a();
        EnumC0072m enumC0072m = this.f1444a;
        b1.d.e(enumC0072m, "state1");
        if (a2.compareTo(enumC0072m) < 0) {
            enumC0072m = a2;
        }
        this.f1444a = enumC0072m;
        this.f1445b.g(rVar, enumC0071l);
        this.f1444a = a2;
    }
}
