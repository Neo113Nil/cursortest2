package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0286o f5237a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0290t f5238b;

    public final void a(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        EnumC0286o a3 = enumC0285n.a();
        EnumC0286o enumC0286o = this.f5237a;
        f2.j.f(enumC0286o, "state1");
        if (a3.compareTo(enumC0286o) < 0) {
            enumC0286o = a3;
        }
        this.f5237a = enumC0286o;
        this.f5238b.b(interfaceC0292v, enumC0285n);
        this.f5237a = a3;
    }
}
