package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0152e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0153f f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162o f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0160m f2622c;
    public final /* synthetic */ C.g d;

    public RunnableC0152e(C.g gVar, C0153f c0153f, C0162o c0162o, MenuC0160m menuC0160m) {
        this.d = gVar;
        this.f2620a = c0153f;
        this.f2621b = c0162o;
        this.f2622c = menuC0160m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0153f c0153f = this.f2620a;
        if (c0153f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0154g) gVar.f67b).f2647z = true;
            c0153f.f2624b.c(false);
            ((ViewOnKeyListenerC0154g) gVar.f67b).f2647z = false;
        }
        C0162o c0162o = this.f2621b;
        if (c0162o.isEnabled() && c0162o.hasSubMenu()) {
            this.f2622c.q(c0162o, null, 4);
        }
    }
}
