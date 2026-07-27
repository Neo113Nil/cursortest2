package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;

/* loaded from: classes.dex */
public final class K implements InterfaceC0479t, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final String f5439d;

    /* renamed from: e, reason: collision with root package name */
    public final J f5440e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5441i;

    public K(String key, J handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f5439d = key;
        this.f5440e = handle;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v source, EnumC0474n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0474n.ON_DESTROY) {
            this.f5441i = false;
            source.e().f(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void g(C0483x lifecycle, C1248e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f5441i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5441i = true;
        lifecycle.a(this);
        registry.c(this.f5439d, this.f5440e.f5438e);
    }
}
