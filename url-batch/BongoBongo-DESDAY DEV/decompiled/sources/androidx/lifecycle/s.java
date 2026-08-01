package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0079m f1578a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0082p f1579b;

    public final void a(r rVar, EnumC0078l enumC0078l) {
        EnumC0079m a2 = enumC0078l.a();
        EnumC0079m enumC0079m = this.f1578a;
        h1.d.e(enumC0079m, "state1");
        if (a2.compareTo(enumC0079m) < 0) {
            enumC0079m = a2;
        }
        this.f1578a = enumC0079m;
        this.f1579b.g(rVar, enumC0078l);
        this.f1578a = a2;
    }
}
