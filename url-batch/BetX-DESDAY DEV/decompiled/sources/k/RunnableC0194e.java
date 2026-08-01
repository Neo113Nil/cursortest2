package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0194e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0195f f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0204o f3017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0202m f3018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0.d f3019d;

    public RunnableC0194e(B0.d dVar, C0195f c0195f, C0204o c0204o, MenuC0202m menuC0202m) {
        this.f3019d = dVar;
        this.f3016a = c0195f;
        this.f3017b = c0204o;
        this.f3018c = menuC0202m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0195f c0195f = this.f3016a;
        if (c0195f != null) {
            B0.d dVar = this.f3019d;
            ((ViewOnKeyListenerC0196g) dVar.f66b).f3045z = true;
            c0195f.f3021b.c(false);
            ((ViewOnKeyListenerC0196g) dVar.f66b).f3045z = false;
        }
        C0204o c0204o = this.f3017b;
        if (c0204o.isEnabled() && c0204o.hasSubMenu()) {
            this.f3018c.q(c0204o, null, 4);
        }
    }
}
