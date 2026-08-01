package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a7 extends s60 {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // defpackage.s60
    public final void A(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).A(j);
        }
    }

    @Override // defpackage.s60
    public final void B(zo zoVar) {
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).B(zoVar);
        }
    }

    @Override // defpackage.s60
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((s60) this.F.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.s60
    public final void D(vw vwVar) {
        super.D(vwVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((s60) this.F.get(i)).D(vwVar);
            }
        }
    }

    @Override // defpackage.s60
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).E();
        }
    }

    @Override // defpackage.s60
    public final void F(long j) {
        this.g = j;
    }

    @Override // defpackage.s60
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.F.size(); i++) {
            H = H + "\n" + ((s60) this.F.get(i)).H(str.concat("  "));
        }
        return H;
    }

    public final void I(s60 s60Var) {
        this.F.add(s60Var);
        s60Var.n = this;
        long j = this.h;
        if (j >= 0) {
            s60Var.A(j);
        }
        if ((this.J & 1) != 0) {
            s60Var.C(this.i);
        }
        if ((this.J & 2) != 0) {
            s60Var.E();
        }
        if ((this.J & 4) != 0) {
            s60Var.D(this.A);
        }
        if ((this.J & 8) != 0) {
            s60Var.B(null);
        }
    }

    @Override // defpackage.s60
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).c();
        }
    }

    @Override // defpackage.s60
    public final void d(a70 a70Var) {
        View view = a70Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s60 s60Var = (s60) obj;
                if (s60Var.t(view)) {
                    s60Var.d(a70Var);
                    a70Var.c.add(s60Var);
                }
            }
        }
    }

    @Override // defpackage.s60
    public final void f(a70 a70Var) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).f(a70Var);
        }
    }

    @Override // defpackage.s60
    public final void g(a70 a70Var) {
        View view = a70Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s60 s60Var = (s60) obj;
                if (s60Var.t(view)) {
                    s60Var.g(a70Var);
                    a70Var.c.add(s60Var);
                }
            }
        }
    }

    @Override // defpackage.s60
    /* renamed from: j */
    public final s60 clone() {
        a7 a7Var = (a7) super.clone();
        a7Var.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            s60 clone = ((s60) this.F.get(i)).clone();
            a7Var.F.add(clone);
            clone.n = a7Var;
        }
        return a7Var;
    }

    @Override // defpackage.s60
    public final void l(ViewGroup viewGroup, we weVar, we weVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            s60 s60Var = (s60) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = s60Var.g;
                if (j2 > 0) {
                    s60Var.F(j2 + j);
                } else {
                    s60Var.F(j);
                }
            }
            s60Var.l(viewGroup, weVar, weVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.s60
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).w(view);
        }
    }

    @Override // defpackage.s60
    public final s60 x(p60 p60Var) {
        super.x(p60Var);
        return this;
    }

    @Override // defpackage.s60
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((s60) this.F.get(i)).y(view);
        }
    }

    @Override // defpackage.s60
    public final void z() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        x60 x60Var = new x60();
        x60Var.b = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((s60) obj).a(x60Var);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList3 = this.F;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((s60) obj2).z();
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
            ((s60) arrayList.get(i3 - 1)).a(new x60((s60) this.F.get(i3)));
            i3++;
        }
        s60 s60Var = (s60) arrayList.get(0);
        if (s60Var != null) {
            s60Var.z();
        }
    }
}
