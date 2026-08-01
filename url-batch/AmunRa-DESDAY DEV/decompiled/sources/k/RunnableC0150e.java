package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0150e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0151f f2561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0160o f2562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0158m f2563c;
    public final /* synthetic */ C.g d;

    public RunnableC0150e(C.g gVar, C0151f c0151f, C0160o c0160o, MenuC0158m menuC0158m) {
        this.d = gVar;
        this.f2561a = c0151f;
        this.f2562b = c0160o;
        this.f2563c = menuC0158m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0151f c0151f = this.f2561a;
        if (c0151f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0152g) gVar.f64b).f2588z = true;
            c0151f.f2565b.c(false);
            ((ViewOnKeyListenerC0152g) gVar.f64b).f2588z = false;
        }
        C0160o c0160o = this.f2562b;
        if (c0160o.isEnabled() && c0160o.hasSubMenu()) {
            this.f2563c.q(c0160o, null, 4);
        }
    }
}
