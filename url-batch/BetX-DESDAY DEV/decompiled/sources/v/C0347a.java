package v;

import s.C0324a;
import s.C0327d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347a extends AbstractC0349c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0324a f4240j;

    public boolean getAllowsGoneWidget() {
        return this.f4240j.f3984t0;
    }

    public int getMargin() {
        return this.f4240j.f3985u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0349c
    public final void h(C0327d c0327d, boolean z2) {
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
        if (c0327d instanceof C0324a) {
            ((C0324a) c0327d).f3983s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4240j.f3984t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f4240j.f3985u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4240j.f3985u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
