package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0149e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0150f f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0159o f2624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0157m f2625c;
    public final /* synthetic */ B0.d d;

    public RunnableC0149e(B0.d dVar, C0150f c0150f, C0159o c0159o, MenuC0157m menuC0157m) {
        this.d = dVar;
        this.f2623a = c0150f;
        this.f2624b = c0159o;
        this.f2625c = menuC0157m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0150f c0150f = this.f2623a;
        if (c0150f != null) {
            B0.d dVar = this.d;
            ((ViewOnKeyListenerC0151g) dVar.f59b).f2650z = true;
            c0150f.f2627b.c(false);
            ((ViewOnKeyListenerC0151g) dVar.f59b).f2650z = false;
        }
        C0159o c0159o = this.f2624b;
        if (c0159o.isEnabled() && c0159o.hasSubMenu()) {
            this.f2625c.q(c0159o, null, 4);
        }
    }
}
