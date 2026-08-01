package x;

import u.C0272a;
import u.C0275d;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300a extends AbstractC0302c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0272a f3948j;

    public boolean getAllowsGoneWidget() {
        return this.f3948j.f3618t0;
    }

    public int getMargin() {
        return this.f3948j.f3619u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // x.AbstractC0302c
    public final void h(C0275d c0275d, boolean z2) {
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
        if (c0275d instanceof C0272a) {
            ((C0272a) c0275d).f3617s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3948j.f3618t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3948j.f3619u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3948j.f3619u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
