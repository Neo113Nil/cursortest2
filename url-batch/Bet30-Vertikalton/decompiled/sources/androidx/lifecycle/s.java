package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0069m f1367a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0072p f1368b;

    public final void a(r rVar, EnumC0068l enumC0068l) {
        EnumC0069m a2 = enumC0068l.a();
        EnumC0069m enumC0069m = this.f1367a;
        X0.d.e(enumC0069m, "state1");
        if (a2.compareTo(enumC0069m) < 0) {
            enumC0069m = a2;
        }
        this.f1367a = enumC0069m;
        this.f1368b.e(rVar, enumC0068l);
        this.f1367a = a2;
    }
}
