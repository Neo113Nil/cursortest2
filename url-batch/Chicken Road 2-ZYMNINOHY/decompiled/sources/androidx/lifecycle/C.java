package androidx.lifecycle;

import m1.C1307e;

/* loaded from: classes.dex */
public final class C implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final String f5011a;

    /* renamed from: b, reason: collision with root package name */
    public final B f5012b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5013c;

    public C(String str, B b4) {
        this.f5011a = str;
        this.f5012b = b4;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        if (enumC0229h == EnumC0229h.ON_DESTROY) {
            this.f5013c = false;
            interfaceC0235n.getLifecycle().b(this);
        }
    }

    public final void b(AbstractC0231j lifecycle, C1307e registry) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        if (this.f5013c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5013c = true;
        lifecycle.a(this);
        registry.c(this.f5011a, this.f5012b.f5010e);
    }
}
