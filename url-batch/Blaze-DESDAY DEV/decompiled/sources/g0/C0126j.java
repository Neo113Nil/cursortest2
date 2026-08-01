package g0;

import K.C0019q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126j extends AbstractC0116F {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2440s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2441g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2442j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2443k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2444l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2445m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2446n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2447o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2448p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2449q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2450r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a0) arrayList.get(size)).f2366a.animate().cancel();
        }
    }

    @Override // g0.AbstractC0116F
    public final boolean a(a0 a0Var, a0 a0Var2, C0019q c0019q, C0019q c0019q2) {
        int i;
        int i2;
        int i3 = c0019q.f510a;
        int i4 = c0019q.f511b;
        if (a0Var2.p()) {
            int i5 = c0019q.f510a;
            i2 = c0019q.f511b;
            i = i5;
        } else {
            i = c0019q2.f510a;
            i2 = c0019q2.f511b;
        }
        if (a0Var == a0Var2) {
            return g(a0Var, i3, i4, i, i2);
        }
        View view = a0Var.f2366a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(a0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(a0Var2);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = a0Var2.f2366a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f1559A0);
        ArrayList arrayList = this.f2443k;
        C0124h c0124h = new C0124h();
        c0124h.f2419a = a0Var;
        c0124h.f2420b = a0Var2;
        c0124h.f2421c = i3;
        c0124h.d = i4;
        c0124h.f2422e = i;
        c0124h.f2423f = i2;
        arrayList.add(c0124h);
        return true;
    }

    @Override // g0.AbstractC0116F
    public final void d(a0 a0Var) {
        View view = a0Var.f2366a;
        view.animate().cancel();
        ArrayList arrayList = this.f2442j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0125i) arrayList.get(size)).f2431a == a0Var) {
                view.setTranslationY(RecyclerView.f1559A0);
                view.setTranslationX(RecyclerView.f1559A0);
                c(a0Var);
                arrayList.remove(size);
            }
        }
        j(this.f2443k, a0Var);
        if (this.h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        ArrayList arrayList2 = this.f2446n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, a0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2445m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0125i) arrayList5.get(size4)).f2431a == a0Var) {
                    view.setTranslationY(RecyclerView.f1559A0);
                    view.setTranslationX(RecyclerView.f1559A0);
                    c(a0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2444l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2449q.remove(a0Var);
        this.f2447o.remove(a0Var);
        this.f2450r.remove(a0Var);
        this.f2448p.remove(a0Var);
        i();
    }

    @Override // g0.AbstractC0116F
    public final void e() {
        ArrayList arrayList = this.f2442j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0125i c0125i = (C0125i) arrayList.get(size);
            View view = c0125i.f2431a.f2366a;
            view.setTranslationY(RecyclerView.f1559A0);
            view.setTranslationX(RecyclerView.f1559A0);
            c(c0125i.f2431a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((a0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            a0 a0Var = (a0) arrayList3.get(size3);
            a0Var.f2366a.setAlpha(1.0f);
            c(a0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2443k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0124h c0124h = (C0124h) arrayList4.get(size4);
            a0 a0Var2 = c0124h.f2419a;
            if (a0Var2 != null) {
                k(c0124h, a0Var2);
            }
            a0 a0Var3 = c0124h.f2420b;
            if (a0Var3 != null) {
                k(c0124h, a0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2445m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0125i c0125i2 = (C0125i) arrayList6.get(size6);
                    View view2 = c0125i2.f2431a.f2366a;
                    view2.setTranslationY(RecyclerView.f1559A0);
                    view2.setTranslationX(RecyclerView.f1559A0);
                    c(c0125i2.f2431a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2444l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    a0 a0Var4 = (a0) arrayList8.get(size8);
                    a0Var4.f2366a.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2446n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0124h c0124h2 = (C0124h) arrayList10.get(size10);
                    a0 a0Var5 = c0124h2.f2419a;
                    if (a0Var5 != null) {
                        k(c0124h2, a0Var5);
                    }
                    a0 a0Var6 = c0124h2.f2420b;
                    if (a0Var6 != null) {
                        k(c0124h2, a0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2449q);
            h(this.f2448p);
            h(this.f2447o);
            h(this.f2450r);
            ArrayList arrayList11 = this.f2301b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g0.AbstractC0116F
    public final boolean f() {
        return (this.i.isEmpty() && this.f2443k.isEmpty() && this.f2442j.isEmpty() && this.h.isEmpty() && this.f2448p.isEmpty() && this.f2449q.isEmpty() && this.f2447o.isEmpty() && this.f2450r.isEmpty() && this.f2445m.isEmpty() && this.f2444l.isEmpty() && this.f2446n.isEmpty()) ? false : true;
    }

    public final boolean g(a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.f2366a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) a0Var.f2366a.getTranslationY());
        l(a0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(a0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2442j;
        C0125i c0125i = new C0125i();
        c0125i.f2431a = a0Var;
        c0125i.f2432b = translationX;
        c0125i.f2433c = translationY;
        c0125i.d = i3;
        c0125i.f2434e = i4;
        arrayList.add(c0125i);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2301b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, a0 a0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0124h c0124h = (C0124h) arrayList.get(size);
            if (k(c0124h, a0Var) && c0124h.f2419a == null && c0124h.f2420b == null) {
                arrayList.remove(c0124h);
            }
        }
    }

    public final boolean k(C0124h c0124h, a0 a0Var) {
        if (c0124h.f2420b == a0Var) {
            c0124h.f2420b = null;
        } else {
            if (c0124h.f2419a != a0Var) {
                return false;
            }
            c0124h.f2419a = null;
        }
        a0Var.f2366a.setAlpha(1.0f);
        View view = a0Var.f2366a;
        view.setTranslationX(RecyclerView.f1559A0);
        view.setTranslationY(RecyclerView.f1559A0);
        c(a0Var);
        return true;
    }

    public final void l(a0 a0Var) {
        if (f2440s == null) {
            f2440s = new ValueAnimator().getInterpolator();
        }
        a0Var.f2366a.animate().setInterpolator(f2440s);
        d(a0Var);
    }
}
