package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0181e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0182f f3122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0192p f3123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0189m f3124c;
    public final /* synthetic */ A0.c d;

    public RunnableC0181e(A0.c cVar, C0182f c0182f, C0192p c0192p, MenuC0189m menuC0189m) {
        this.d = cVar;
        this.f3122a = c0182f;
        this.f3123b = c0192p;
        this.f3124c = menuC0189m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0182f c0182f = this.f3122a;
        if (c0182f != null) {
            A0.c cVar = this.d;
            ((ViewOnKeyListenerC0183g) cVar.f6b).f3149z = true;
            c0182f.f3126b.c(false);
            ((ViewOnKeyListenerC0183g) cVar.f6b).f3149z = false;
        }
        C0192p c0192p = this.f3123b;
        if (c0192p.isEnabled() && c0192p.hasSubMenu()) {
            this.f3124c.q(c0192p, null, 4);
        }
    }
}
