package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0230o f4036a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0234t f4037b;

    public final void a(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        EnumC0230o a3 = enumC0229n.a();
        EnumC0230o enumC0230o = this.f4036a;
        Z1.i.f(enumC0230o, "state1");
        if (a3.compareTo(enumC0230o) < 0) {
            enumC0230o = a3;
        }
        this.f4036a = enumC0230o;
        this.f4037b.b(interfaceC0236v, enumC0229n);
        this.f4036a = a3;
    }
}
