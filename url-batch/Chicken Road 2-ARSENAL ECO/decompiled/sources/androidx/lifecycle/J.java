package androidx.lifecycle;

/* loaded from: classes.dex */
public final class J implements InterfaceC0252t {

    /* renamed from: f, reason: collision with root package name */
    public final String f3472f;

    /* renamed from: g, reason: collision with root package name */
    public final I f3473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3474h;

    public J(String str, I i7) {
        this.f3472f = str;
        this.f3473g = i7;
    }

    @Override // androidx.lifecycle.InterfaceC0252t
    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        if (enumC0246m == EnumC0246m.ON_DESTROY) {
            this.f3474h = false;
            interfaceC0253u.getLifecycle().b(this);
        }
    }

    public final void b(T.f registry, AbstractC0248o lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        if (this.f3474h) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3474h = true;
        lifecycle.a(this);
        registry.c(this.f3472f, this.f3473g.f3471e);
    }
}
