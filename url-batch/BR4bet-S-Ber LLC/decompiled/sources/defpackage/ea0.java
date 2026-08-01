package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ea0 extends aa0 {
    public final /* synthetic */ int a = 1;
    public z90 b;

    public ea0(z90 z90Var) {
        this.b = z90Var;
    }

    @Override // defpackage.aa0, defpackage.x90
    public void a(z90 z90Var) {
        switch (this.a) {
            case 1:
                k7 k7Var = (k7) this.b;
                if (!k7Var.I) {
                    k7Var.G();
                    k7Var.I = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.x90
    public final void d(z90 z90Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                z90Var.x(this);
                break;
            default:
                k7 k7Var = (k7) this.b;
                int i = k7Var.H - 1;
                k7Var.H = i;
                if (i == 0) {
                    k7Var.I = false;
                    k7Var.m();
                }
                z90Var.x(this);
                break;
        }
    }

    public /* synthetic */ ea0() {
    }
}
