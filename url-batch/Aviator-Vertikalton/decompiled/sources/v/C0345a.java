package v;

import s.C0322a;
import s.C0325d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345a extends AbstractC0347c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0322a f4236j;

    public boolean getAllowsGoneWidget() {
        return this.f4236j.f3980t0;
    }

    public int getMargin() {
        return this.f4236j.f3981u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0347c
    public final void h(C0325d c0325d, boolean z2) {
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
        if (c0325d instanceof C0322a) {
            ((C0322a) c0325d).f3979s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4236j.f3980t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f4236j.f3981u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4236j.f3981u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
