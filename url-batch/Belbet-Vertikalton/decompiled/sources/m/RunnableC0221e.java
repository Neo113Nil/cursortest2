package m;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0221e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0222f f3306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0231o f3307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0229m f3308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1.d f3309d;

    public RunnableC0221e(C1.d dVar, C0222f c0222f, C0231o c0231o, MenuC0229m menuC0229m) {
        this.f3309d = dVar;
        this.f3306a = c0222f;
        this.f3307b = c0231o;
        this.f3308c = menuC0229m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0222f c0222f = this.f3306a;
        if (c0222f != null) {
            C1.d dVar = this.f3309d;
            ((ViewOnKeyListenerC0223g) dVar.f145b).f3334z = true;
            c0222f.f3311b.c(false);
            ((ViewOnKeyListenerC0223g) dVar.f145b).f3334z = false;
        }
        C0231o c0231o = this.f3307b;
        if (c0231o.isEnabled() && c0231o.hasSubMenu()) {
            this.f3308c.q(c0231o, null, 4);
        }
    }
}
