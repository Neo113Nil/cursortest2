package N;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f1643g;

    public /* synthetic */ c(f fVar, int i7) {
        this.f1642f = i7;
        this.f1643g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1642f) {
            case 0:
                this.f1643g.f1657p.onDismiss(null);
                break;
            default:
                f fVar = this.f1643g;
                if (fVar.f1651j != null) {
                    if (fVar.f1651j == null) {
                        B0.c cVar = new B0.c(8, false);
                        Object obj = f.f1646u;
                        cVar.f72h = obj;
                        cVar.f73i = obj;
                        cVar.f71g = obj;
                        fVar.f1651j = cVar;
                    }
                    fVar.f1651j.getClass();
                    break;
                }
                break;
        }
    }
}
