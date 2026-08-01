package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h7 extends nc {
    public int m;
    public int n;
    public i7 o;

    public boolean getAllowsGoneWidget() {
        return this.o.t0;
    }

    public int getMargin() {
        return this.o.u0;
    }

    public int getType() {
        return this.m;
    }

    @Override // defpackage.nc
    public final void h(ad adVar, boolean z) {
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
        if (adVar instanceof i7) {
            ((i7) adVar).s0 = this.n;
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
