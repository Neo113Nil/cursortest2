package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class e70 extends y60 {
    public int I;
    public ArrayList G = new ArrayList();
    public boolean H = true;
    public boolean J = false;
    public int K = 0;

    @Override // defpackage.y60
    public final void A(View view) {
        super.A(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).A(view);
        }
    }

    @Override // defpackage.y60
    public final void B() {
        ArrayList arrayList;
        if (this.G.isEmpty()) {
            I();
            n();
            return;
        }
        d70 d70Var = new d70();
        d70Var.b = this;
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((y60) obj).a(d70Var);
        }
        this.I = this.G.size();
        if (this.H) {
            ArrayList arrayList3 = this.G;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((y60) obj2).B();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.G.size();
            arrayList = this.G;
            if (i3 >= size3) {
                break;
            }
            ((y60) arrayList.get(i3 - 1)).a(new d70((y60) this.G.get(i3)));
            i3++;
        }
        y60 y60Var = (y60) arrayList.get(0);
        if (y60Var != null) {
            y60Var.B();
        }
    }

    @Override // defpackage.y60
    public final void C(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.G) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).C(j);
        }
    }

    @Override // defpackage.y60
    public final void D(l70 l70Var) {
        this.A = l70Var;
        this.K |= 8;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).D(l70Var);
        }
    }

    @Override // defpackage.y60
    public final void E(TimeInterpolator timeInterpolator) {
        this.K |= 1;
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((y60) this.G.get(i)).E(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.y60
    public final void F(ix ixVar) {
        super.F(ixVar);
        this.K |= 4;
        if (this.G != null) {
            for (int i = 0; i < this.G.size(); i++) {
                ((y60) this.G.get(i)).F(ixVar);
            }
        }
    }

    @Override // defpackage.y60
    public final void G() {
        this.K |= 2;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).G();
        }
    }

    @Override // defpackage.y60
    public final void H(long j) {
        this.g = j;
    }

    @Override // defpackage.y60
    public final String J(String str) {
        String J = super.J(str);
        for (int i = 0; i < this.G.size(); i++) {
            J = J + "\n" + ((y60) this.G.get(i)).J(str.concat("  "));
        }
        return J;
    }

    public final void K(y60 y60Var) {
        this.G.add(y60Var);
        y60Var.n = this;
        long j = this.h;
        if (j >= 0) {
            y60Var.C(j);
        }
        if ((this.K & 1) != 0) {
            y60Var.E(this.i);
        }
        if ((this.K & 2) != 0) {
            y60Var.G();
        }
        if ((this.K & 4) != 0) {
            y60Var.F(this.B);
        }
        if ((this.K & 8) != 0) {
            y60Var.D(this.A);
        }
    }

    @Override // defpackage.y60
    public final void b(View view) {
        for (int i = 0; i < this.G.size(); i++) {
            ((y60) this.G.get(i)).b(view);
        }
        this.k.add(view);
    }

    @Override // defpackage.y60
    public final void d() {
        super.d();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).d();
        }
    }

    @Override // defpackage.y60
    public final void e(h70 h70Var) {
        View view = h70Var.b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y60 y60Var = (y60) obj;
                if (y60Var.u(view)) {
                    y60Var.e(h70Var);
                    h70Var.c.add(y60Var);
                }
            }
        }
    }

    @Override // defpackage.y60
    public final void g(h70 h70Var) {
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).g(h70Var);
        }
    }

    @Override // defpackage.y60
    public final void h(h70 h70Var) {
        View view = h70Var.b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y60 y60Var = (y60) obj;
                if (y60Var.u(view)) {
                    y60Var.h(h70Var);
                    h70Var.c.add(y60Var);
                }
            }
        }
    }

    @Override // defpackage.y60
    /* renamed from: k */
    public final y60 clone() {
        e70 e70Var = (e70) super.clone();
        e70Var.G = new ArrayList();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            y60 clone = ((y60) this.G.get(i)).clone();
            e70Var.G.add(clone);
            clone.n = e70Var;
        }
        return e70Var;
    }

    @Override // defpackage.y60
    public final void m(ViewGroup viewGroup, h8 h8Var, h8 h8Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            y60 y60Var = (y60) this.G.get(i);
            if (j > 0 && (this.H || i == 0)) {
                long j2 = y60Var.g;
                if (j2 > 0) {
                    y60Var.H(j2 + j);
                } else {
                    y60Var.H(j);
                }
            }
            y60Var.m(viewGroup, h8Var, h8Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.y60
    public final void x(View view) {
        super.x(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((y60) this.G.get(i)).x(view);
        }
    }

    @Override // defpackage.y60
    public final y60 y(v60 v60Var) {
        super.y(v60Var);
        return this;
    }

    @Override // defpackage.y60
    public final void z(View view) {
        for (int i = 0; i < this.G.size(); i++) {
            ((y60) this.G.get(i)).z(view);
        }
        this.k.remove(view);
    }
}
