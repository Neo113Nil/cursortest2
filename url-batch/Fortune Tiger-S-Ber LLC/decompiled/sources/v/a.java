package v;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public int f3431m;

    /* renamed from: n, reason: collision with root package name */
    public int f3432n;

    /* renamed from: o, reason: collision with root package name */
    public s.a f3433o;

    public boolean getAllowsGoneWidget() {
        return this.f3433o.f3210t0;
    }

    public int getMargin() {
        return this.f3433o.f3211u0;
    }

    public int getType() {
        return this.f3431m;
    }

    @Override // v.c
    public final void h(s.d dVar, boolean z3) {
        int i4 = this.f3431m;
        this.f3432n = i4;
        if (z3) {
            if (i4 == 5) {
                this.f3432n = 1;
            } else if (i4 == 6) {
                this.f3432n = 0;
            }
        } else if (i4 == 5) {
            this.f3432n = 0;
        } else if (i4 == 6) {
            this.f3432n = 1;
        }
        if (dVar instanceof s.a) {
            ((s.a) dVar).f3209s0 = this.f3432n;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f3433o.f3210t0 = z3;
    }

    public void setDpMargin(int i4) {
        this.f3433o.f3211u0 = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.f3433o.f3211u0 = i4;
    }

    public void setType(int i4) {
        this.f3431m = i4;
    }
}
