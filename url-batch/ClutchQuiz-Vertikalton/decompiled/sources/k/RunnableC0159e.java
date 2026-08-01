package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0159e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0160f f2705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0169o f2706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0167m f2707c;
    public final /* synthetic */ A0.h d;

    public RunnableC0159e(A0.h hVar, C0160f c0160f, C0169o c0169o, MenuC0167m menuC0167m) {
        this.d = hVar;
        this.f2705a = c0160f;
        this.f2706b = c0169o;
        this.f2707c = menuC0167m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0160f c0160f = this.f2705a;
        if (c0160f != null) {
            A0.h hVar = this.d;
            ((ViewOnKeyListenerC0161g) hVar.f30b).f2732z = true;
            c0160f.f2709b.c(false);
            ((ViewOnKeyListenerC0161g) hVar.f30b).f2732z = false;
        }
        C0169o c0169o = this.f2706b;
        if (c0169o.isEnabled() && c0169o.hasSubMenu()) {
            this.f2707c.q(c0169o, null, 4);
        }
    }
}
