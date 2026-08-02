package androidx.lifecycle;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236o {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0230i f5048a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0234m f5049b;

    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        EnumC0230i a3 = enumC0229h.a();
        EnumC0230i state1 = this.f5048a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a3.compareTo(state1) < 0) {
            state1 = a3;
        }
        this.f5048a = state1;
        this.f5049b.a(interfaceC0235n, enumC0229h);
        this.f5048a = a3;
    }
}
