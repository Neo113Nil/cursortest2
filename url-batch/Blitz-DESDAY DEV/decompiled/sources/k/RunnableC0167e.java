package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0167e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0168f f2724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2726c;
    public final /* synthetic */ E.g d;

    public RunnableC0167e(E.g gVar, C0168f c0168f, o oVar, m mVar) {
        this.d = gVar;
        this.f2724a = c0168f;
        this.f2725b = oVar;
        this.f2726c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0168f c0168f = this.f2724a;
        if (c0168f != null) {
            E.g gVar = this.d;
            ((ViewOnKeyListenerC0169g) gVar.f170b).f2751z = true;
            c0168f.f2728b.c(false);
            ((ViewOnKeyListenerC0169g) gVar.f170b).f2751z = false;
        }
        o oVar = this.f2725b;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f2726c.q(oVar, null, 4);
        }
    }
}
