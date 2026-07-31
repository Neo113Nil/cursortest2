package c5;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1731a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f1732b;

    public /* synthetic */ t() {
    }

    @Override // c5.m
    public final void d(o oVar) {
        switch (this.f1731a) {
            case 0:
                this.f1732b.z();
                oVar.x(this);
                break;
            default:
                a aVar = (a) this.f1732b;
                int i = aVar.F - 1;
                aVar.F = i;
                if (i == 0) {
                    aVar.G = false;
                    aVar.m();
                }
                oVar.x(this);
                break;
        }
    }

    @Override // c5.p, c5.m
    public void e(o oVar) {
        switch (this.f1731a) {
            case 1:
                a aVar = (a) this.f1732b;
                if (!aVar.G) {
                    aVar.G();
                    aVar.G = true;
                    break;
                }
                break;
        }
    }

    public t(o oVar) {
        this.f1732b = oVar;
    }
}
