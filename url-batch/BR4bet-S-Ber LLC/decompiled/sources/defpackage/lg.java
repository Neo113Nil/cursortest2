package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lg extends x10 {
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
            ((q20) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.x10
    public final boolean a(q20 q20Var, q20 q20Var2, hy hyVar, hy hyVar2) {
        int i;
        int i2;
        int i3 = hyVar.a;
        int i4 = hyVar.b;
        if (q20Var2.o()) {
            int i5 = hyVar.a;
            i2 = hyVar.b;
            i = i5;
        } else {
            i = hyVar2.a;
            i2 = hyVar2.b;
        }
        if (q20Var == q20Var2) {
            return g(q20Var, i3, i4, i, i2);
        }
        View view = q20Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(q20Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q20Var2.a;
        l(q20Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        jg jgVar = new jg();
        jgVar.a = q20Var;
        jgVar.b = q20Var2;
        jgVar.c = i3;
        jgVar.d = i4;
        jgVar.e = i;
        jgVar.f = i2;
        arrayList.add(jgVar);
        return true;
    }

    @Override // defpackage.x10
    public final void d(q20 q20Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = q20Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((kg) arrayList4.get(size)).a == q20Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(q20Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, q20Var);
        if (this.h.remove(q20Var)) {
            view.setAlpha(1.0f);
            c(q20Var);
        }
        if (this.i.remove(q20Var)) {
            view.setAlpha(1.0f);
            c(q20Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, q20Var);
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
                if (((kg) arrayList6.get(size4)).a == q20Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(q20Var);
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
            if (arrayList7.remove(q20Var)) {
                view.setAlpha(1.0f);
                c(q20Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(q20Var);
        this.o.remove(q20Var);
        this.r.remove(q20Var);
        this.p.remove(q20Var);
        i();
    }

    @Override // defpackage.x10
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
            kg kgVar = (kg) arrayList7.get(size);
            View view = kgVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(kgVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((q20) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            q20 q20Var = (q20) arrayList5.get(size3);
            q20Var.a.setAlpha(1.0f);
            c(q20Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            jg jgVar = (jg) arrayList.get(size4);
            q20 q20Var2 = jgVar.a;
            if (q20Var2 != null) {
                k(jgVar, q20Var2);
            }
            q20 q20Var3 = jgVar.b;
            if (q20Var3 != null) {
                k(jgVar, q20Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    kg kgVar2 = (kg) arrayList8.get(size6);
                    View view2 = kgVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(kgVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    q20 q20Var4 = (q20) arrayList9.get(size8);
                    q20Var4.a.setAlpha(1.0f);
                    c(q20Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    jg jgVar2 = (jg) arrayList10.get(size10);
                    q20 q20Var5 = jgVar2.a;
                    if (q20Var5 != null) {
                        k(jgVar2, q20Var5);
                    }
                    q20 q20Var6 = jgVar2.b;
                    if (q20Var6 != null) {
                        k(jgVar2, q20Var6);
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
                g9.b();
            }
        }
    }

    @Override // defpackage.x10
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(q20 q20Var, int i, int i2, int i3, int i4) {
        View view = q20Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) q20Var.a.getTranslationY());
        l(q20Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(q20Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        kg kgVar = new kg();
        kgVar.a = q20Var;
        kgVar.b = translationX;
        kgVar.c = translationY;
        kgVar.d = i3;
        kgVar.e = i4;
        arrayList.add(kgVar);
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
            g9.b();
        }
    }

    public final void j(ArrayList arrayList, q20 q20Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jg jgVar = (jg) arrayList.get(size);
            if (k(jgVar, q20Var) && jgVar.a == null && jgVar.b == null) {
                arrayList.remove(jgVar);
            }
        }
    }

    public final boolean k(jg jgVar, q20 q20Var) {
        if (jgVar.b == q20Var) {
            jgVar.b = null;
        } else {
            if (jgVar.a != q20Var) {
                return false;
            }
            jgVar.a = null;
        }
        View view = q20Var.a;
        View view2 = q20Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(q20Var);
        return true;
    }

    public final void l(q20 q20Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        q20Var.a.animate().setInterpolator(s);
        d(q20Var);
    }
}
