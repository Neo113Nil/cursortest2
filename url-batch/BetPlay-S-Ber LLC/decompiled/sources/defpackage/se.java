package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class se extends jz {
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
            ((c00) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.jz
    public final boolean a(c00 c00Var, c00 c00Var2, uv uvVar, uv uvVar2) {
        int i;
        int i2;
        int i3 = uvVar.a;
        int i4 = uvVar.b;
        if (c00Var2.o()) {
            int i5 = uvVar.a;
            i2 = uvVar.b;
            i = i5;
        } else {
            i = uvVar2.a;
            i2 = uvVar2.b;
        }
        if (c00Var == c00Var2) {
            return g(c00Var, i3, i4, i, i2);
        }
        View view = c00Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c00Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c00Var2.a;
        l(c00Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        qe qeVar = new qe();
        qeVar.a = c00Var;
        qeVar.b = c00Var2;
        qeVar.c = i3;
        qeVar.d = i4;
        qeVar.e = i;
        qeVar.f = i2;
        arrayList.add(qeVar);
        return true;
    }

    @Override // defpackage.jz
    public final void d(c00 c00Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = c00Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((re) arrayList4.get(size)).a == c00Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c00Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, c00Var);
        if (this.h.remove(c00Var)) {
            view.setAlpha(1.0f);
            c(c00Var);
        }
        if (this.i.remove(c00Var)) {
            view.setAlpha(1.0f);
            c(c00Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, c00Var);
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
                if (((re) arrayList6.get(size4)).a == c00Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c00Var);
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
            if (arrayList7.remove(c00Var)) {
                view.setAlpha(1.0f);
                c(c00Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(c00Var);
        this.o.remove(c00Var);
        this.r.remove(c00Var);
        this.p.remove(c00Var);
        i();
    }

    @Override // defpackage.jz
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
            re reVar = (re) arrayList7.get(size);
            View view = reVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(reVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((c00) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c00 c00Var = (c00) arrayList5.get(size3);
            c00Var.a.setAlpha(1.0f);
            c(c00Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            qe qeVar = (qe) arrayList.get(size4);
            c00 c00Var2 = qeVar.a;
            if (c00Var2 != null) {
                k(qeVar, c00Var2);
            }
            c00 c00Var3 = qeVar.b;
            if (c00Var3 != null) {
                k(qeVar, c00Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    re reVar2 = (re) arrayList8.get(size6);
                    View view2 = reVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(reVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    c00 c00Var4 = (c00) arrayList9.get(size8);
                    c00Var4.a.setAlpha(1.0f);
                    c(c00Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    qe qeVar2 = (qe) arrayList10.get(size10);
                    c00 c00Var5 = qeVar2.a;
                    if (c00Var5 != null) {
                        k(qeVar2, c00Var5);
                    }
                    c00 c00Var6 = qeVar2.b;
                    if (c00Var6 != null) {
                        k(qeVar2, c00Var6);
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
                o8.c();
            }
        }
    }

    @Override // defpackage.jz
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(c00 c00Var, int i, int i2, int i3, int i4) {
        View view = c00Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c00Var.a.getTranslationY());
        l(c00Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(c00Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        re reVar = new re();
        reVar.a = c00Var;
        reVar.b = translationX;
        reVar.c = translationY;
        reVar.d = i3;
        reVar.e = i4;
        arrayList.add(reVar);
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
            o8.c();
        }
    }

    public final void j(ArrayList arrayList, c00 c00Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qe qeVar = (qe) arrayList.get(size);
            if (k(qeVar, c00Var) && qeVar.a == null && qeVar.b == null) {
                arrayList.remove(qeVar);
            }
        }
    }

    public final boolean k(qe qeVar, c00 c00Var) {
        if (qeVar.b == c00Var) {
            qeVar.b = null;
        } else {
            if (qeVar.a != c00Var) {
                return false;
            }
            qeVar.a = null;
        }
        View view = c00Var.a;
        View view2 = c00Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(c00Var);
        return true;
    }

    public final void l(c00 c00Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        c00Var.a.animate().setInterpolator(s);
        d(c00Var);
    }
}
