package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0507o f5286a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0511t f5287b;

    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        EnumC0507o a9 = enumC0506n.a();
        EnumC0507o state1 = this.f5286a;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (a9.compareTo(state1) < 0) {
            state1 = a9;
        }
        this.f5286a = state1;
        this.f5287b.a(interfaceC0513v, enumC0506n);
        this.f5286a = a9;
    }
}
