package f1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1721a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f1722b;

    public /* synthetic */ t() {
    }

    @Override // f1.p, f1.m
    public void d(o oVar) {
        switch (this.f1721a) {
            case 1:
                a aVar = (a) this.f1722b;
                if (!aVar.I) {
                    aVar.G();
                    aVar.I = true;
                    break;
                }
                break;
        }
    }

    @Override // f1.m
    public final void e(o oVar) {
        switch (this.f1721a) {
            case 0:
                this.f1722b.z();
                oVar.x(this);
                break;
            default:
                a aVar = (a) this.f1722b;
                int i4 = aVar.H - 1;
                aVar.H = i4;
                if (i4 == 0) {
                    aVar.I = false;
                    aVar.m();
                }
                oVar.x(this);
                break;
        }
    }

    public t(o oVar) {
        this.f1722b = oVar;
    }
}
