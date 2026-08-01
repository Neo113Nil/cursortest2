package y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public int f3620m;

    /* renamed from: n, reason: collision with root package name */
    public int f3621n;

    /* renamed from: o, reason: collision with root package name */
    public v.a f3622o;

    public boolean getAllowsGoneWidget() {
        return this.f3622o.f3366t0;
    }

    public int getMargin() {
        return this.f3622o.f3367u0;
    }

    public int getType() {
        return this.f3620m;
    }

    @Override // y.c
    public final void h(v.d dVar, boolean z3) {
        int i = this.f3620m;
        this.f3621n = i;
        if (z3) {
            if (i == 5) {
                this.f3621n = 1;
            } else if (i == 6) {
                this.f3621n = 0;
            }
        } else if (i == 5) {
            this.f3621n = 0;
        } else if (i == 6) {
            this.f3621n = 1;
        }
        if (dVar instanceof v.a) {
            ((v.a) dVar).f3365s0 = this.f3621n;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f3622o.f3366t0 = z3;
    }

    public void setDpMargin(int i) {
        this.f3622o.f3367u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3622o.f3367u0 = i;
    }

    public void setType(int i) {
        this.f3620m = i;
    }
}
