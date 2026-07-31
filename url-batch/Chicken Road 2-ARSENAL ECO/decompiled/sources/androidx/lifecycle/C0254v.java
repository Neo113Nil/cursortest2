package androidx.lifecycle;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254v {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0247n f3523a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0252t f3524b;

    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        EnumC0247n a7 = enumC0246m.a();
        EnumC0247n state1 = this.f3523a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a7.compareTo(state1) < 0) {
            state1 = a7;
        }
        this.f3523a = state1;
        this.f3524b.a(interfaceC0253u, enumC0246m);
        this.f3523a = a7;
    }
}
