package y;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public int f3947m;

    /* renamed from: n, reason: collision with root package name */
    public int f3948n;

    /* renamed from: o, reason: collision with root package name */
    public v.a f3949o;

    public boolean getAllowsGoneWidget() {
        return this.f3949o.f3588t0;
    }

    public int getMargin() {
        return this.f3949o.f3589u0;
    }

    public int getType() {
        return this.f3947m;
    }

    @Override // y.c
    public final void h(v.d dVar, boolean z4) {
        int i = this.f3947m;
        this.f3948n = i;
        if (z4) {
            if (i == 5) {
                this.f3948n = 1;
            } else if (i == 6) {
                this.f3948n = 0;
            }
        } else if (i == 5) {
            this.f3948n = 0;
        } else if (i == 6) {
            this.f3948n = 1;
        }
        if (dVar instanceof v.a) {
            ((v.a) dVar).f3587s0 = this.f3948n;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f3949o.f3588t0 = z4;
    }

    public void setDpMargin(int i) {
        this.f3949o.f3589u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3949o.f3589u0 = i;
    }

    public void setType(int i) {
        this.f3947m = i;
    }
}
