package l5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q5.i f6027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f6028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f6029h;

    public g(h hVar, q5.i iVar, x xVar) {
        this.f6029h = hVar;
        this.f6027f = iVar;
        this.f6028g = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f6029h.f6031b;
        l1.x xVar = iVar.f6035d;
        f fVar = this.f6027f.f7535a;
        t5.s b9 = ((t5.s) xVar.f5847g).b(fVar);
        if (b9.isEmpty()) {
            return;
        }
        iVar.b(iVar.f6042k.l(fVar, b9));
        this.f6028g.c(null);
    }
}
