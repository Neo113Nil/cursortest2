package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import h0.C2435d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final String f12586b;

    /* renamed from: c, reason: collision with root package name */
    private final K f12587c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12588d;

    public M(String key, K handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f12586b = key;
        this.f12587c = handle;
    }

    public final void a(C2435d registry, AbstractC1346l lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f12588d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f12588d = true;
        lifecycle.addObserver(this);
        registry.h(this.f12586b, this.f12587c.c());
    }

    public final K b() {
        return this.f12587c;
    }

    public final boolean c() {
        return this.f12588d;
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1346l.a.ON_DESTROY) {
            this.f12588d = false;
            source.getLifecycle().removeObserver(this);
        }
    }
}
