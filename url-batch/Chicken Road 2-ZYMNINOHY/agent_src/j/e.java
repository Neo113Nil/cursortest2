package j;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f13615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.t f13616d;

    public e(e0.t tVar, f fVar, k kVar, j jVar) {
        this.f13616d = tVar;
        this.f13613a = fVar;
        this.f13614b = kVar;
        this.f13615c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = (g) this.f13616d.f8416a;
        f fVar = this.f13613a;
        if (fVar != null) {
            gVar.z = true;
            fVar.f13618b.c(false);
            gVar.z = false;
        }
        k kVar = this.f13614b;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f13615c.p(kVar, null, 4);
        }
    }
}
