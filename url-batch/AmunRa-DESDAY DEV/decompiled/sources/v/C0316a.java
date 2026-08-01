package v;

import s.C0292a;
import s.C0295d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316a extends AbstractC0318c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0292a f3912j;

    public boolean getAllowsGoneWidget() {
        return this.f3912j.f3640t0;
    }

    public int getMargin() {
        return this.f3912j.f3641u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0318c
    public final void h(C0295d c0295d, boolean z2) {
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
        if (c0295d instanceof C0292a) {
            ((C0292a) c0295d).f3639s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3912j.f3640t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3912j.f3641u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3912j.f3641u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
