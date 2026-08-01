package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0149e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0150f f2640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0159o f2641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0157m f2642c;
    public final /* synthetic */ B0.d d;

    public RunnableC0149e(B0.d dVar, C0150f c0150f, C0159o c0159o, MenuC0157m menuC0157m) {
        this.d = dVar;
        this.f2640a = c0150f;
        this.f2641b = c0159o;
        this.f2642c = menuC0157m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0150f c0150f = this.f2640a;
        if (c0150f != null) {
            B0.d dVar = this.d;
            ((ViewOnKeyListenerC0151g) dVar.f59b).f2667z = true;
            c0150f.f2644b.c(false);
            ((ViewOnKeyListenerC0151g) dVar.f59b).f2667z = false;
        }
        C0159o c0159o = this.f2641b;
        if (c0159o.isEnabled() && c0159o.hasSubMenu()) {
            this.f2642c.q(c0159o, null, 4);
        }
    }
}
