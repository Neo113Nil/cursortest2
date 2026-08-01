package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0153e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0154f f2571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0163o f2572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0161m f2573c;
    public final /* synthetic */ C.g d;

    public RunnableC0153e(C.g gVar, C0154f c0154f, C0163o c0163o, MenuC0161m menuC0161m) {
        this.d = gVar;
        this.f2571a = c0154f;
        this.f2572b = c0163o;
        this.f2573c = menuC0161m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0154f c0154f = this.f2571a;
        if (c0154f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0155g) gVar.f66b).f2598z = true;
            c0154f.f2575b.c(false);
            ((ViewOnKeyListenerC0155g) gVar.f66b).f2598z = false;
        }
        C0163o c0163o = this.f2572b;
        if (c0163o.isEnabled() && c0163o.hasSubMenu()) {
            this.f2573c.q(c0163o, null, 4);
        }
    }
}
