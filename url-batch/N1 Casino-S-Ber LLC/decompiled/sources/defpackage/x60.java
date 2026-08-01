package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x60 extends t60 {
    public final /* synthetic */ int a = 1;
    public s60 b;

    public x60(s60 s60Var) {
        this.b = s60Var;
    }

    @Override // defpackage.t60, defpackage.p60
    public void a(s60 s60Var) {
        switch (this.a) {
            case 1:
                a7 a7Var = (a7) this.b;
                if (!a7Var.I) {
                    a7Var.G();
                    a7Var.I = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p60
    public final void d(s60 s60Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                s60Var.x(this);
                break;
            default:
                a7 a7Var = (a7) this.b;
                int i = a7Var.H - 1;
                a7Var.H = i;
                if (i == 0) {
                    a7Var.I = false;
                    a7Var.m();
                }
                s60Var.x(this);
                break;
        }
    }

    public /* synthetic */ x60() {
    }
}
