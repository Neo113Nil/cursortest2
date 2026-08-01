package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d70 extends z60 {
    public final /* synthetic */ int a = 1;
    public y60 b;

    public d70(y60 y60Var) {
        this.b = y60Var;
    }

    @Override // defpackage.z60, defpackage.v60
    public void a(y60 y60Var) {
        switch (this.a) {
            case 1:
                e70 e70Var = (e70) this.b;
                if (!e70Var.J) {
                    e70Var.I();
                    e70Var.J = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.v60
    public final void d(y60 y60Var) {
        switch (this.a) {
            case 0:
                this.b.B();
                y60Var.y(this);
                break;
            default:
                e70 e70Var = (e70) this.b;
                int i = e70Var.I - 1;
                e70Var.I = i;
                if (i == 0) {
                    e70Var.J = false;
                    e70Var.n();
                }
                y60Var.y(this);
                break;
        }
    }

    public /* synthetic */ d70() {
    }
}
