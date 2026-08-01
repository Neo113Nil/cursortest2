package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w7 extends kj0 {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // defpackage.kj0
    public final void A(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).A(j);
        }
    }

    @Override // defpackage.kj0
    public final void B(xc0 xc0Var) {
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).B(xc0Var);
        }
    }

    @Override // defpackage.kj0
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kj0) this.F.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.kj0
    public final void D(xy xyVar) {
        super.D(xyVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((kj0) this.F.get(i)).D(xyVar);
            }
        }
    }

    @Override // defpackage.kj0
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).E();
        }
    }

    @Override // defpackage.kj0
    public final void F(long j) {
        this.g = j;
    }

    @Override // defpackage.kj0
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.F.size(); i++) {
            H = H + "\n" + ((kj0) this.F.get(i)).H(str.concat("  "));
        }
        return H;
    }

    public final void I(kj0 kj0Var) {
        this.F.add(kj0Var);
        kj0Var.n = this;
        long j = this.h;
        if (j >= 0) {
            kj0Var.A(j);
        }
        if ((this.J & 1) != 0) {
            kj0Var.C(this.i);
        }
        if ((this.J & 2) != 0) {
            kj0Var.E();
        }
        if ((this.J & 4) != 0) {
            kj0Var.D(this.A);
        }
        if ((this.J & 8) != 0) {
            kj0Var.B(null);
        }
    }

    @Override // defpackage.kj0
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).c();
        }
    }

    @Override // defpackage.kj0
    public final void d(sj0 sj0Var) {
        View view = sj0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kj0 kj0Var = (kj0) obj;
                if (kj0Var.t(view)) {
                    kj0Var.d(sj0Var);
                    sj0Var.c.add(kj0Var);
                }
            }
        }
    }

    @Override // defpackage.kj0
    public final void f(sj0 sj0Var) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).f(sj0Var);
        }
    }

    @Override // defpackage.kj0
    public final void g(sj0 sj0Var) {
        View view = sj0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kj0 kj0Var = (kj0) obj;
                if (kj0Var.t(view)) {
                    kj0Var.g(sj0Var);
                    sj0Var.c.add(kj0Var);
                }
            }
        }
    }

    @Override // defpackage.kj0
    /* renamed from: j */
    public final kj0 clone() {
        w7 w7Var = (w7) super.clone();
        w7Var.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            kj0 clone = ((kj0) this.F.get(i)).clone();
            w7Var.F.add(clone);
            clone.n = w7Var;
        }
        return w7Var;
    }

    @Override // defpackage.kj0
    public final void l(ViewGroup viewGroup, wi wiVar, wi wiVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            kj0 kj0Var = (kj0) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = kj0Var.g;
                if (j2 > 0) {
                    kj0Var.F(j2 + j);
                } else {
                    kj0Var.F(j);
                }
            }
            kj0Var.l(viewGroup, wiVar, wiVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.kj0
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).w(view);
        }
    }

    @Override // defpackage.kj0
    public final kj0 x(hj0 hj0Var) {
        super.x(hj0Var);
        return this;
    }

    @Override // defpackage.kj0
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((kj0) this.F.get(i)).y(view);
        }
    }

    @Override // defpackage.kj0
    public final void z() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        pj0 pj0Var = new pj0();
        pj0Var.b = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((kj0) obj).a(pj0Var);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList3 = this.F;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((kj0) obj2).z();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.F.size();
            arrayList = this.F;
            if (i3 >= size3) {
                break;
            }
            ((kj0) arrayList.get(i3 - 1)).a(new pj0((kj0) this.F.get(i3)));
            i3++;
        }
        kj0 kj0Var = (kj0) arrayList.get(0);
        if (kj0Var != null) {
            kj0Var.z();
        }
    }
}
