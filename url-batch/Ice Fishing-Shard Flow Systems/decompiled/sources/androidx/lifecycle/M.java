package androidx.lifecycle;

import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M implements InterfaceC0254u {

    /* renamed from: d, reason: collision with root package name */
    public final String f3866d;

    /* renamed from: e, reason: collision with root package name */
    public final L f3867e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3868i;

    public M(String key, L handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f3866d = key;
        this.f3867e = handle;
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w source, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0248n.ON_DESTROY) {
            this.f3868i = false;
            source.getLifecycle().b(this);
        }
    }

    public final void b(AbstractC0250p lifecycle, C0593d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f3868i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3868i = true;
        lifecycle.a(this);
        registry.c(this.f3866d, this.f3867e.f3865e);
    }
}
