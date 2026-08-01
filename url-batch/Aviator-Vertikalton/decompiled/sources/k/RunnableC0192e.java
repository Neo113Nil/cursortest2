package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0192e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0193f f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0202o f3013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0200m f3014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0.d f3015d;

    public RunnableC0192e(B0.d dVar, C0193f c0193f, C0202o c0202o, MenuC0200m menuC0200m) {
        this.f3015d = dVar;
        this.f3012a = c0193f;
        this.f3013b = c0202o;
        this.f3014c = menuC0200m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0193f c0193f = this.f3012a;
        if (c0193f != null) {
            B0.d dVar = this.f3015d;
            ((ViewOnKeyListenerC0194g) dVar.f67b).f3041z = true;
            c0193f.f3017b.c(false);
            ((ViewOnKeyListenerC0194g) dVar.f67b).f3041z = false;
        }
        C0202o c0202o = this.f3013b;
        if (c0202o.isEnabled() && c0202o.hasSubMenu()) {
            this.f3014c.q(c0202o, null, 4);
        }
    }
}
