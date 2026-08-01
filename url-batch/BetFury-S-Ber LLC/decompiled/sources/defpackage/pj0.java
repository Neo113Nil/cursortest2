package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pj0 extends lj0 {
    public final /* synthetic */ int a = 1;
    public kj0 b;

    public pj0(kj0 kj0Var) {
        this.b = kj0Var;
    }

    @Override // defpackage.lj0, defpackage.hj0
    public void a(kj0 kj0Var) {
        switch (this.a) {
            case 1:
                w7 w7Var = (w7) this.b;
                if (!w7Var.I) {
                    w7Var.G();
                    w7Var.I = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hj0
    public final void d(kj0 kj0Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                kj0Var.x(this);
                break;
            default:
                w7 w7Var = (w7) this.b;
                int i = w7Var.H - 1;
                w7Var.H = i;
                if (i == 0) {
                    w7Var.I = false;
                    w7Var.m();
                }
                kj0Var.x(this);
                break;
        }
    }

    public /* synthetic */ pj0() {
    }
}
