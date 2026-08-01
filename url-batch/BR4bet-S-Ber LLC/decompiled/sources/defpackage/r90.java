package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r90 extends mz {
    public final /* synthetic */ int j;
    public boolean k;
    public int l;
    public final /* synthetic */ Object m;

    public r90(xc0 xc0Var) {
        this.j = 1;
        this.m = xc0Var;
        this.k = false;
        this.l = 0;
    }

    @Override // defpackage.yc0
    public final void a() {
        int i = this.j;
        Object obj = this.m;
        switch (i) {
            case 0:
                if (!this.k) {
                    ((s90) obj).a.setVisibility(this.l);
                    break;
                }
                break;
            default:
                int i2 = this.l + 1;
                this.l = i2;
                xc0 xc0Var = (xc0) obj;
                if (i2 == xc0Var.a.size()) {
                    yc0 yc0Var = xc0Var.d;
                    if (yc0Var != null) {
                        yc0Var.a();
                    }
                    this.l = 0;
                    this.k = false;
                    xc0Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz, defpackage.yc0
    public void b() {
        switch (this.j) {
            case 0:
                this.k = true;
                break;
        }
    }

    @Override // defpackage.mz, defpackage.yc0
    public final void c() {
        int i = this.j;
        Object obj = this.m;
        switch (i) {
            case 0:
                ((s90) obj).a.setVisibility(0);
                break;
            default:
                if (!this.k) {
                    this.k = true;
                    yc0 yc0Var = ((xc0) obj).d;
                    if (yc0Var != null) {
                        yc0Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public r90(s90 s90Var, int i) {
        this.j = 0;
        this.m = s90Var;
        this.l = i;
        this.k = false;
    }
}
