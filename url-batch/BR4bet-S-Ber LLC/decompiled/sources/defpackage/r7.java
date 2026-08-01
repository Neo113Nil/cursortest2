package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r7 extends nd {
    public int m;
    public int n;
    public s7 o;

    public boolean getAllowsGoneWidget() {
        return this.o.t0;
    }

    public int getMargin() {
        return this.o.u0;
    }

    public int getType() {
        return this.m;
    }

    @Override // defpackage.nd
    public final void h(ae aeVar, boolean z) {
        int i = this.m;
        this.n = i;
        if (z) {
            if (i == 5) {
                this.n = 1;
            } else if (i == 6) {
                this.n = 0;
            }
        } else if (i == 5) {
            this.n = 0;
        } else if (i == 6) {
            this.n = 1;
        }
        if (aeVar instanceof s7) {
            ((s7) aeVar).s0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.t0 = z;
    }

    public void setDpMargin(int i) {
        this.o.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.o.u0 = i;
    }

    public void setType(int i) {
        this.m = i;
    }
}
