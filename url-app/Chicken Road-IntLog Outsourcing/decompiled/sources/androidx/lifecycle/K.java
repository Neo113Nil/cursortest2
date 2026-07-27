package androidx.lifecycle;

import a0.C0175f;

/* loaded from: classes.dex */
public final class K implements InterfaceC0249t {

    /* renamed from: a, reason: collision with root package name */
    public final String f4537a;

    /* renamed from: b, reason: collision with root package name */
    public final J f4538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4539c;

    public K(String str, J j2) {
        this.f4537a = str;
        this.f4538b = j2;
    }

    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        if (enumC0243m == EnumC0243m.ON_DESTROY) {
            this.f4539c = false;
            interfaceC0250u.getLifecycle().b(this);
        }
    }

    public final void b(C0175f registry, AbstractC0245o lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        if (this.f4539c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4539c = true;
        lifecycle.a(this);
        registry.c(this.f4537a, this.f4538b.f4536e);
    }
}
