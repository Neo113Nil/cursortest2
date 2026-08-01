package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0156e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0157f f2644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0166o f2645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0164m f2646c;
    public final /* synthetic */ C.g d;

    public RunnableC0156e(C.g gVar, C0157f c0157f, C0166o c0166o, MenuC0164m menuC0164m) {
        this.d = gVar;
        this.f2644a = c0157f;
        this.f2645b = c0166o;
        this.f2646c = menuC0164m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0157f c0157f = this.f2644a;
        if (c0157f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0158g) gVar.f115b).f2671z = true;
            c0157f.f2648b.c(false);
            ((ViewOnKeyListenerC0158g) gVar.f115b).f2671z = false;
        }
        C0166o c0166o = this.f2645b;
        if (c0166o.isEnabled() && c0166o.hasSubMenu()) {
            this.f2646c.q(c0166o, null, 4);
        }
    }
}
