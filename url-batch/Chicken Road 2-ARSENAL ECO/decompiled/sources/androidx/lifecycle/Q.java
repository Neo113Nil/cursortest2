package androidx.lifecycle;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final C0255w f3490f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0246m f3491g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3492h;

    public Q(C0255w registry, EnumC0246m event) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(event, "event");
        this.f3490f = registry;
        this.f3491g = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3492h) {
            return;
        }
        this.f3490f.e(this.f3491g);
        this.f3492h = true;
    }
}
