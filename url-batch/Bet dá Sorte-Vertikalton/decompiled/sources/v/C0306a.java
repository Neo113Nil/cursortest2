package v;

import s.C0278a;
import s.C0281d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306a extends AbstractC0308c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0278a f3968j;

    public boolean getAllowsGoneWidget() {
        return this.f3968j.f3580t0;
    }

    public int getMargin() {
        return this.f3968j.f3581u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0308c
    public final void h(C0281d c0281d, boolean z2) {
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
        if (c0281d instanceof C0278a) {
            ((C0278a) c0281d).f3579s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3968j.f3580t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3968j.f3581u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3968j.f3581u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
