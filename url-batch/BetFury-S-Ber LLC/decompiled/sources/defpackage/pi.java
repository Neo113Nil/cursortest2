package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pi extends d80 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((x80) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.d80
    public final boolean a(x80 x80Var, x80 x80Var2, t30 t30Var, t30 t30Var2) {
        int i;
        int i2;
        int i3 = t30Var.a;
        int i4 = t30Var.b;
        if (x80Var2.p()) {
            int i5 = t30Var.a;
            i2 = t30Var.b;
            i = i5;
        } else {
            i = t30Var2.a;
            i2 = t30Var2.b;
        }
        if (x80Var == x80Var2) {
            return g(x80Var, i3, i4, i, i2);
        }
        View view = x80Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(x80Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = x80Var2.a;
        l(x80Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ni niVar = new ni();
        niVar.a = x80Var;
        niVar.b = x80Var2;
        niVar.c = i3;
        niVar.d = i4;
        niVar.e = i;
        niVar.f = i2;
        arrayList.add(niVar);
        return true;
    }

    @Override // defpackage.d80
    public final void d(x80 x80Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = x80Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((oi) arrayList4.get(size)).a == x80Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x80Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, x80Var);
        if (this.h.remove(x80Var)) {
            view.setAlpha(1.0f);
            c(x80Var);
        }
        if (this.i.remove(x80Var)) {
            view.setAlpha(1.0f);
            c(x80Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, x80Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((oi) arrayList6.get(size4)).a == x80Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(x80Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(x80Var)) {
                view.setAlpha(1.0f);
                c(x80Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(x80Var);
        this.o.remove(x80Var);
        this.r.remove(x80Var);
        this.p.remove(x80Var);
        i();
    }

    @Override // defpackage.d80
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            oi oiVar = (oi) arrayList7.get(size);
            View view = oiVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(oiVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((x80) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            x80 x80Var = (x80) arrayList5.get(size3);
            x80Var.a.setAlpha(1.0f);
            c(x80Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            ni niVar = (ni) arrayList.get(size4);
            x80 x80Var2 = niVar.a;
            if (x80Var2 != null) {
                k(niVar, x80Var2);
            }
            x80 x80Var3 = niVar.b;
            if (x80Var3 != null) {
                k(niVar, x80Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    oi oiVar2 = (oi) arrayList8.get(size6);
                    View view2 = oiVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(oiVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    x80 x80Var4 = (x80) arrayList9.get(size8);
                    x80Var4.a.setAlpha(1.0f);
                    c(x80Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ni niVar2 = (ni) arrayList10.get(size10);
                    x80 x80Var5 = niVar2.a;
                    if (x80Var5 != null) {
                        k(niVar2, x80Var5);
                    }
                    x80 x80Var6 = niVar2.b;
                    if (x80Var6 != null) {
                        k(niVar2, x80Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                s9.c();
            }
        }
    }

    @Override // defpackage.d80
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(x80 x80Var, int i, int i2, int i3, int i4) {
        View view = x80Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) x80Var.a.getTranslationY());
        l(x80Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(x80Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        oi oiVar = new oi();
        oiVar.a = x80Var;
        oiVar.b = translationX;
        oiVar.c = translationY;
        oiVar.d = i3;
        oiVar.e = i4;
        arrayList.add(oiVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            s9.c();
        }
    }

    public final void j(ArrayList arrayList, x80 x80Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ni niVar = (ni) arrayList.get(size);
            if (k(niVar, x80Var) && niVar.a == null && niVar.b == null) {
                arrayList.remove(niVar);
            }
        }
    }

    public final boolean k(ni niVar, x80 x80Var) {
        if (niVar.b == x80Var) {
            niVar.b = null;
        } else {
            if (niVar.a != x80Var) {
                return false;
            }
            niVar.a = null;
        }
        View view = x80Var.a;
        View view2 = x80Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(x80Var);
        return true;
    }

    public final void l(x80 x80Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        x80Var.a.animate().setInterpolator(s);
        d(x80Var);
    }
}
