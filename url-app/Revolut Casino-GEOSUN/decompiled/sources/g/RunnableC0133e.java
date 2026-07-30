package g;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0133e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0134f f1938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f1940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A.j f1941h;

    public RunnableC0133e(A.j jVar, C0134f c0134f, k kVar, j jVar2) {
        this.f1941h = jVar;
        this.f1938e = c0134f;
        this.f1939f = kVar;
        this.f1940g = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0134f c0134f = this.f1938e;
        if (c0134f != null) {
            A.j jVar = this.f1941h;
            ((ViewOnKeyListenerC0135g) jVar.f30f).f1948D = true;
            c0134f.f1943b.c(false);
            ((ViewOnKeyListenerC0135g) jVar.f30f).f1948D = false;
        }
        k kVar = this.f1939f;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f1940g.p(kVar, null, 4);
        }
    }
}
