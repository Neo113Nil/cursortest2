package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ts {
    public ij a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public ts() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        ij ijVar = this.a;
        this.c = z ? ijVar.g() : ijVar.k();
    }

    public final void b(View view, int i) {
        ij ijVar = this.a;
        int l = Integer.MIN_VALUE == ijVar.a ? 0 : ijVar.l() - ijVar.a;
        if (l >= 0) {
            boolean z = this.d;
            ij ijVar2 = this.a;
            if (z) {
                int b = ijVar2.b(view);
                ij ijVar3 = this.a;
                this.c = (Integer.MIN_VALUE != ijVar3.a ? ijVar3.l() - ijVar3.a : 0) + b;
            } else {
                this.c = ijVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        ij ijVar4 = this.a;
        if (!z2) {
            int e = ijVar4.e(view);
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
        int g2 = (ijVar4.g() - l) - this.a.b(view);
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
