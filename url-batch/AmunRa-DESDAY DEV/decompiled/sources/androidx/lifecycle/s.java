package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0071m f1402a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0074p f1403b;

    public final void a(r rVar, EnumC0070l enumC0070l) {
        EnumC0071m a2 = enumC0070l.a();
        EnumC0071m enumC0071m = this.f1402a;
        Z0.d.e(enumC0071m, "state1");
        if (a2.compareTo(enumC0071m) < 0) {
            enumC0071m = a2;
        }
        this.f1402a = enumC0071m;
        this.f1403b.f(rVar, enumC0070l);
        this.f1402a = a2;
    }
}
