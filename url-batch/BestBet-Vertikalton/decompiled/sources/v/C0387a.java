package v;

import s.C0316a;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387a extends c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0316a f4241j;

    public boolean getAllowsGoneWidget() {
        return this.f4241j.f3846t0;
    }

    public int getMargin() {
        return this.f4241j.f3847u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.c
    public final void h(s.d dVar, boolean z2) {
        int i = this.h;
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
        if (dVar instanceof C0316a) {
            ((C0316a) dVar).s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4241j.f3846t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f4241j.f3847u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4241j.f3847u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
