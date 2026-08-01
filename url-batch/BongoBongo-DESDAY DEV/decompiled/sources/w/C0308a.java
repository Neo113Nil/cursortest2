package w;

import t.C0297a;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308a extends c {

    /* renamed from: h, reason: collision with root package name */
    public int f3974h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0297a f3975j;

    public boolean getAllowsGoneWidget() {
        return this.f3975j.f3726t0;
    }

    public int getMargin() {
        return this.f3975j.f3727u0;
    }

    public int getType() {
        return this.f3974h;
    }

    @Override // w.c
    public final void h(t.d dVar, boolean z2) {
        int i = this.f3974h;
        this.i = i;
        if (z2) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (dVar instanceof C0297a) {
            ((C0297a) dVar).f3725s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3975j.f3726t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3975j.f3727u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3975j.f3727u0 = i;
    }

    public void setType(int i) {
        this.f3974h = i;
    }
}
