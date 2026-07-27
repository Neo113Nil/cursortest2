package androidx.lifecycle;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251v {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0244n f4588a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0249t f4589b;

    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        EnumC0244n a6 = enumC0243m.a();
        EnumC0244n state1 = this.f4588a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a6.compareTo(state1) < 0) {
            state1 = a6;
        }
        this.f4588a = state1;
        this.f4589b.a(interfaceC0250u, enumC0243m);
        this.f4588a = a6;
    }
}
