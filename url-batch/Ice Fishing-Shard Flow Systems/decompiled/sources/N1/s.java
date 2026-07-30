package N1;

/* loaded from: classes.dex */
public final class s extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K1.h f1827e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L1.d f1828i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f1829l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d dVar, K1.h hVar, K1.h hVar2, L1.d dVar2) {
        super(hVar);
        this.f1829l = dVar;
        this.f1827e = hVar2;
        this.f1828i = dVar2;
    }

    @Override // N1.q
    public final void b() {
        synchronized (this.f1829l.f1807f) {
            try {
                d dVar = this.f1829l;
                K1.h hVar = this.f1827e;
                dVar.f1806e.add(hVar);
                hVar.f1428a.addOnCompleteListener(new P0.l(dVar, 3, hVar));
                if (this.f1829l.f1812l.getAndIncrement() > 0) {
                    this.f1829l.f1803b.a("Already connected to the service.", new Object[0]);
                }
                d.b(this.f1829l, this.f1828i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
