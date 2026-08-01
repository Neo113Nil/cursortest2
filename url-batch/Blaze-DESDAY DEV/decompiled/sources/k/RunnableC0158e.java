package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0158e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0159f f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0168o f2673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0166m f2674c;
    public final /* synthetic */ C.g d;

    public RunnableC0158e(C.g gVar, C0159f c0159f, C0168o c0168o, MenuC0166m menuC0166m) {
        this.d = gVar;
        this.f2672a = c0159f;
        this.f2673b = c0168o;
        this.f2674c = menuC0166m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0159f c0159f = this.f2672a;
        if (c0159f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0160g) gVar.f80b).f2699z = true;
            c0159f.f2676b.c(false);
            ((ViewOnKeyListenerC0160g) gVar.f80b).f2699z = false;
        }
        C0168o c0168o = this.f2673b;
        if (c0168o.isEnabled() && c0168o.hasSubMenu()) {
            this.f2674c.q(c0168o, null, 4);
        }
    }
}
