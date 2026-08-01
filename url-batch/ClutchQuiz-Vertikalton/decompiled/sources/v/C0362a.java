package v;

import s.C0337a;
import s.C0340d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362a extends AbstractC0364c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0337a f3783j;

    public boolean getAllowsGoneWidget() {
        return this.f3783j.f3474t0;
    }

    public int getMargin() {
        return this.f3783j.f3475u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0364c
    public final void h(C0340d c0340d, boolean z2) {
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
        if (c0340d instanceof C0337a) {
            ((C0337a) c0340d).f3473s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3783j.f3474t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3783j.f3475u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3783j.f3475u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
