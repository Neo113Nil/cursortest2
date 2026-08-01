package l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0161e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162f f2773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0171o f2774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0169m f2775c;
    public final /* synthetic */ D.g d;

    public RunnableC0161e(D.g gVar, C0162f c0162f, C0171o c0171o, MenuC0169m menuC0169m) {
        this.d = gVar;
        this.f2773a = c0162f;
        this.f2774b = c0171o;
        this.f2775c = menuC0169m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162f c0162f = this.f2773a;
        if (c0162f != null) {
            D.g gVar = this.d;
            ((ViewOnKeyListenerC0163g) gVar.f122b).f2801z = true;
            c0162f.f2777b.c(false);
            ((ViewOnKeyListenerC0163g) gVar.f122b).f2801z = false;
        }
        C0171o c0171o = this.f2774b;
        if (c0171o.isEnabled() && c0171o.hasSubMenu()) {
            this.f2775c.q(c0171o, null, 4);
        }
    }
}
