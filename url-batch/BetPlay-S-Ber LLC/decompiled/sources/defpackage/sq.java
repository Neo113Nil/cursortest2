package defpackage;

import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sq {
    public zg a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public sq() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        zg zgVar = this.a;
        this.c = z ? zgVar.g() : zgVar.k();
    }

    public final void b(View view, int i) {
        zg zgVar = this.a;
        int l = Integer.MIN_VALUE == zgVar.a ? 0 : zgVar.l() - zgVar.a;
        if (l >= 0) {
            boolean z = this.d;
            zg zgVar2 = this.a;
            if (z) {
                int b = zgVar2.b(view);
                zg zgVar3 = this.a;
                this.c = (Integer.MIN_VALUE != zgVar3.a ? zgVar3.l() - zgVar3.a : 0) + b;
            } else {
                this.c = zgVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        zg zgVar4 = this.a;
        if (!z2) {
            int e = zgVar4.e(view);
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
        int g2 = (zgVar4.g() - l) - this.a.b(view);
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
