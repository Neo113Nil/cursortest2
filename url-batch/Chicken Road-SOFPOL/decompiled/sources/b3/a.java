package b3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: k, reason: collision with root package name */
    public int f1063k;

    /* renamed from: l, reason: collision with root package name */
    public int f1064l;

    /* renamed from: m, reason: collision with root package name */
    public y2.a f1065m;

    public boolean getAllowsGoneWidget() {
        return this.f1065m.f8720t0;
    }

    public int getMargin() {
        return this.f1065m.f8721u0;
    }

    public int getType() {
        return this.f1063k;
    }

    @Override // b3.c
    public final void h(y2.d dVar, boolean z3) {
        int i = this.f1063k;
        this.f1064l = i;
        if (z3) {
            if (i == 5) {
                this.f1064l = 1;
            } else if (i == 6) {
                this.f1064l = 0;
            }
        } else if (i == 5) {
            this.f1064l = 0;
        } else if (i == 6) {
            this.f1064l = 1;
        }
        if (dVar instanceof y2.a) {
            ((y2.a) dVar).f8719s0 = this.f1064l;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f1065m.f8720t0 = z3;
    }

    public void setDpMargin(int i) {
        this.f1065m.f8721u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1065m.f8721u0 = i;
    }

    public void setType(int i) {
        this.f1063k = i;
    }
}
