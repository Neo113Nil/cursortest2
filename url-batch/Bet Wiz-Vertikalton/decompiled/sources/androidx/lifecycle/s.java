package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0070m f1472a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0073p f1473b;

    public final void a(r rVar, EnumC0069l enumC0069l) {
        EnumC0070m a2 = enumC0069l.a();
        EnumC0070m enumC0070m = this.f1472a;
        e1.d.e(enumC0070m, "state1");
        if (a2.compareTo(enumC0070m) < 0) {
            enumC0070m = a2;
        }
        this.f1472a = enumC0070m;
        this.f1473b.g(rVar, enumC0069l);
        this.f1472a = a2;
    }
}
