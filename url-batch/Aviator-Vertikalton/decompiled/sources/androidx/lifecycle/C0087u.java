package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0081n f1495a;

    /* renamed from: b, reason: collision with root package name */
    public r f1496b;

    public final void a(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        EnumC0081n a2 = enumC0080m.a();
        EnumC0081n enumC0081n = this.f1495a;
        X0.f.e(enumC0081n, "state1");
        if (a2.compareTo(enumC0081n) < 0) {
            enumC0081n = a2;
        }
        this.f1495a = enumC0081n;
        this.f1496b.g(interfaceC0086t, enumC0080m);
        this.f1495a = a2;
    }
}
