package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fq {
    public hh a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public fq() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        hh hhVar = this.a;
        this.c = z ? hhVar.g() : hhVar.k();
    }

    public final void b(View view, int i) {
        hh hhVar = this.a;
        int l = Integer.MIN_VALUE == hhVar.a ? 0 : hhVar.l() - hhVar.a;
        if (l >= 0) {
            boolean z = this.d;
            hh hhVar2 = this.a;
            if (z) {
                int b = hhVar2.b(view);
                hh hhVar3 = this.a;
                this.c = (Integer.MIN_VALUE != hhVar3.a ? hhVar3.l() - hhVar3.a : 0) + b;
            } else {
                this.c = hhVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        hh hhVar4 = this.a;
        if (!z2) {
            int e = hhVar4.e(view);
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
        int g2 = (hhVar4.g() - l) - this.a.b(view);
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
