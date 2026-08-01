package j1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1964a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f1965b;

    public /* synthetic */ t() {
    }

    @Override // j1.p, j1.m
    public void b(o oVar) {
        switch (this.f1964a) {
            case 1:
                a aVar = (a) this.f1965b;
                if (!aVar.J) {
                    aVar.H();
                    aVar.J = true;
                    break;
                }
                break;
        }
    }

    @Override // j1.m
    public final void c(o oVar) {
        switch (this.f1964a) {
            case 0:
                this.f1965b.A();
                oVar.y(this);
                break;
            default:
                a aVar = (a) this.f1965b;
                int i = aVar.I - 1;
                aVar.I = i;
                if (i == 0) {
                    aVar.J = false;
                    aVar.m();
                }
                oVar.y(this);
                break;
        }
    }

    public t(o oVar) {
        this.f1965b = oVar;
    }
}
