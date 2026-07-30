package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final C0258y f3884d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC0248n f3885e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3886i;

    public U(C0258y registry, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f3884d = registry;
        this.f3885e = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3886i) {
            return;
        }
        this.f3884d.e(this.f3885e);
        this.f3886i = true;
    }
}
