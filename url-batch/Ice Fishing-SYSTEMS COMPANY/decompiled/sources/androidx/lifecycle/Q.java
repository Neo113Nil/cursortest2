package androidx.lifecycle;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C0515x f5251n;

    /* renamed from: u, reason: collision with root package name */
    public final EnumC0506n f5252u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5253v;

    public Q(C0515x registry, EnumC0506n event) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(event, "event");
        this.f5251n = registry;
        this.f5252u = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5253v) {
            return;
        }
        this.f5251n.e(this.f5252u);
        this.f5253v = true;
    }
}
