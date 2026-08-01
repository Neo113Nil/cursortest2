package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p60 extends vw {
    public final /* synthetic */ int o;
    public boolean p;
    public int q;
    public final /* synthetic */ Object r;

    public p60(u90 u90Var) {
        this.o = 1;
        this.r = u90Var;
        this.p = false;
        this.q = 0;
    }

    @Override // defpackage.v90
    public final void a() {
        int i = this.o;
        Object obj = this.r;
        switch (i) {
            case 0:
                if (!this.p) {
                    ((q60) obj).a.setVisibility(this.q);
                    break;
                }
                break;
            default:
                int i2 = this.q + 1;
                this.q = i2;
                u90 u90Var = (u90) obj;
                if (i2 == u90Var.a.size()) {
                    v90 v90Var = u90Var.d;
                    if (v90Var != null) {
                        v90Var.a();
                    }
                    this.q = 0;
                    this.p = false;
                    u90Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vw, defpackage.v90
    public void b() {
        switch (this.o) {
            case 0:
                this.p = true;
                break;
        }
    }

    @Override // defpackage.vw, defpackage.v90
    public final void c() {
        int i = this.o;
        Object obj = this.r;
        switch (i) {
            case 0:
                ((q60) obj).a.setVisibility(0);
                break;
            default:
                if (!this.p) {
                    this.p = true;
                    v90 v90Var = ((u90) obj).d;
                    if (v90Var != null) {
                        v90Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public p60(q60 q60Var, int i) {
        this.o = 0;
        this.r = q60Var;
        this.q = i;
        this.p = false;
    }
}
