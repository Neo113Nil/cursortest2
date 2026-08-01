package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sx {
    public wl a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public sx() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        wl wlVar = this.a;
        this.c = z ? wlVar.g() : wlVar.k();
    }

    public final void b(View view, int i) {
        wl wlVar = this.a;
        int l = Integer.MIN_VALUE == wlVar.a ? 0 : wlVar.l() - wlVar.a;
        if (l >= 0) {
            boolean z = this.d;
            wl wlVar2 = this.a;
            if (z) {
                int b = wlVar2.b(view);
                wl wlVar3 = this.a;
                this.c = (Integer.MIN_VALUE != wlVar3.a ? wlVar3.l() - wlVar3.a : 0) + b;
            } else {
                this.c = wlVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        wl wlVar4 = this.a;
        if (!z2) {
            int e = wlVar4.e(view);
            int k = e - this.a.k();
            this.c = e;
            if (k > 0) {
                int g = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(k, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (wlVar4.g() - l) - this.a.b(view);
        this.c = this.a.g() - g2;
        if (g2 > 0) {
            int c = this.c - this.a.c(view);
            int k2 = this.a.k();
            int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
