package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k7 extends z90 {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // defpackage.z90
    public final void A(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).A(j);
        }
    }

    @Override // defpackage.z90
    public final void B(la0 la0Var) {
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).B(la0Var);
        }
    }

    @Override // defpackage.z90
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z90) this.F.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.z90
    public final void D(ky kyVar) {
        super.D(kyVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((z90) this.F.get(i)).D(kyVar);
            }
        }
    }

    @Override // defpackage.z90
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).E();
        }
    }

    @Override // defpackage.z90
    public final void F(long j) {
        this.g = j;
    }

    @Override // defpackage.z90
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.F.size(); i++) {
            H = H + "\n" + ((z90) this.F.get(i)).H(str.concat("  "));
        }
        return H;
    }

    public final void I(z90 z90Var) {
        this.F.add(z90Var);
        z90Var.n = this;
        long j = this.h;
        if (j >= 0) {
            z90Var.A(j);
        }
        if ((this.J & 1) != 0) {
            z90Var.C(this.i);
        }
        if ((this.J & 2) != 0) {
            z90Var.E();
        }
        if ((this.J & 4) != 0) {
            z90Var.D(this.A);
        }
        if ((this.J & 8) != 0) {
            z90Var.B(null);
        }
    }

    @Override // defpackage.z90
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).c();
        }
    }

    @Override // defpackage.z90
    public final void d(ha0 ha0Var) {
        View view = ha0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                z90 z90Var = (z90) obj;
                if (z90Var.t(view)) {
                    z90Var.d(ha0Var);
                    ha0Var.c.add(z90Var);
                }
            }
        }
    }

    @Override // defpackage.z90
    public final void f(ha0 ha0Var) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).f(ha0Var);
        }
    }

    @Override // defpackage.z90
    public final void g(ha0 ha0Var) {
        View view = ha0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                z90 z90Var = (z90) obj;
                if (z90Var.t(view)) {
                    z90Var.g(ha0Var);
                    ha0Var.c.add(z90Var);
                }
            }
        }
    }

    @Override // defpackage.z90
    /* renamed from: j */
    public final z90 clone() {
        k7 k7Var = (k7) super.clone();
        k7Var.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            z90 clone = ((z90) this.F.get(i)).clone();
            k7Var.F.add(clone);
            clone.n = k7Var;
        }
        return k7Var;
    }

    @Override // defpackage.z90
    public final void l(ViewGroup viewGroup, rg rgVar, rg rgVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            z90 z90Var = (z90) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = z90Var.g;
                if (j2 > 0) {
                    z90Var.F(j2 + j);
                } else {
                    z90Var.F(j);
                }
            }
            z90Var.l(viewGroup, rgVar, rgVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.z90
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).w(view);
        }
    }

    @Override // defpackage.z90
    public final z90 x(x90 x90Var) {
        super.x(x90Var);
        return this;
    }

    @Override // defpackage.z90
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((z90) this.F.get(i)).y(view);
        }
    }

    @Override // defpackage.z90
    public final void z() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        ea0 ea0Var = new ea0();
        ea0Var.b = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((z90) obj).a(ea0Var);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList3 = this.F;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((z90) obj2).z();
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
            ((z90) arrayList.get(i3 - 1)).a(new ea0((z90) this.F.get(i3)));
            i3++;
        }
        z90 z90Var = (z90) arrayList.get(0);
        if (z90Var != null) {
            z90Var.z();
        }
    }
}
