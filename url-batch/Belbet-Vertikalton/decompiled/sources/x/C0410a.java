package x;

import u.C0384a;
import u.C0387d;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410a extends AbstractC0412c {

    /* renamed from: h, reason: collision with root package name */
    public int f4509h;
    public int i;
    public C0384a j;

    public boolean getAllowsGoneWidget() {
        return this.j.f4205t0;
    }

    public int getMargin() {
        return this.j.f4206u0;
    }

    public int getType() {
        return this.f4509h;
    }

    @Override // x.AbstractC0412c
    public final void h(C0387d c0387d, boolean z2) {
        int i = this.f4509h;
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
        if (c0387d instanceof C0384a) {
            ((C0384a) c0387d).s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.j.f4205t0 = z2;
    }

    public void setDpMargin(int i) {
        this.j.f4206u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.f4206u0 = i;
    }

    public void setType(int i) {
        this.f4509h = i;
    }
}
