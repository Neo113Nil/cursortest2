package androidx.lifecycle;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0078m f1944a;

    /* renamed from: b, reason: collision with root package name */
    public r f1945b;

    public final void a(t tVar, EnumC0077l enumC0077l) {
        EnumC0078m a2 = enumC0077l.a();
        EnumC0078m enumC0078m = this.f1944a;
        j1.h.e(enumC0078m, "state1");
        if (a2.compareTo(enumC0078m) < 0) {
            enumC0078m = a2;
        }
        this.f1944a = enumC0078m;
        this.f1945b.a(tVar, enumC0077l);
        this.f1944a = a2;
    }
}
