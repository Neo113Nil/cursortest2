package D0;

/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f668a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f669b;

    public /* synthetic */ t() {
    }

    @Override // D0.p, D0.m
    public void a(o oVar) {
        switch (this.f668a) {
            case 1:
                C0299a c0299a = (C0299a) this.f669b;
                if (!c0299a.f599W) {
                    c0299a.L();
                    c0299a.f599W = true;
                    break;
                }
                break;
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        switch (this.f668a) {
            case 0:
                this.f669b.E();
                oVar.C(this);
                break;
            default:
                C0299a c0299a = (C0299a) this.f669b;
                int i = c0299a.f598V - 1;
                c0299a.f598V = i;
                if (i == 0) {
                    c0299a.f599W = false;
                    c0299a.r();
                }
                oVar.C(this);
                break;
        }
    }

    public t(o oVar) {
        this.f669b = oVar;
    }
}
