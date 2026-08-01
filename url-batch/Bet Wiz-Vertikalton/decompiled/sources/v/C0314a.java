package v;

import s.C0290a;
import s.C0293d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314a extends AbstractC0316c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0290a f3831j;

    public boolean getAllowsGoneWidget() {
        return this.f3831j.f3502t0;
    }

    public int getMargin() {
        return this.f3831j.f3503u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0316c
    public final void h(C0293d c0293d, boolean z2) {
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
        if (c0293d instanceof C0290a) {
            ((C0290a) c0293d).f3501s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3831j.f3502t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3831j.f3503u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3831j.f3503u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
