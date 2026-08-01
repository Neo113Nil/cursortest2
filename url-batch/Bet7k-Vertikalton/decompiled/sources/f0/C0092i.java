package f0;

import K.C0017q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092i extends E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2088s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2089g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2090j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2091k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2092l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2093m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2094n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2095o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2096p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2097q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2098r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((X) arrayList.get(size)).f2009a.animate().cancel();
        }
    }

    @Override // f0.E
    public final boolean a(X x2, X x3, C0017q c0017q, C0017q c0017q2) {
        int i;
        int i2;
        int i3 = c0017q.f447a;
        int i4 = c0017q.f448b;
        if (x3.p()) {
            int i5 = c0017q.f447a;
            i2 = c0017q.f448b;
            i = i5;
        } else {
            i = c0017q2.f447a;
            i2 = c0017q2.f448b;
        }
        if (x2 == x3) {
            return g(x2, i3, i4, i, i2);
        }
        View view = x2.f2009a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(x2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(x3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = x3.f2009a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2091k;
        C0090g c0090g = new C0090g();
        c0090g.f2072a = x2;
        c0090g.f2073b = x3;
        c0090g.f2074c = i3;
        c0090g.d = i4;
        c0090g.f2075e = i;
        c0090g.f2076f = i2;
        arrayList.add(c0090g);
        return true;
    }

    @Override // f0.E
    public final void d(X x2) {
        View view = x2.f2009a;
        view.animate().cancel();
        ArrayList arrayList = this.f2090j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0091h) arrayList.get(size)).f2081a == x2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x2);
                arrayList.remove(size);
            }
        }
        j(this.f2091k, x2);
        if (this.h.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        if (this.i.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        ArrayList arrayList2 = this.f2094n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, x2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2093m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0091h) arrayList5.get(size4)).f2081a == x2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(x2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2092l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(x2)) {
                view.setAlpha(1.0f);
                c(x2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2097q.remove(x2);
        this.f2095o.remove(x2);
        this.f2098r.remove(x2);
        this.f2096p.remove(x2);
        i();
    }

    @Override // f0.E
    public final void e() {
        ArrayList arrayList = this.f2090j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0091h c0091h = (C0091h) arrayList.get(size);
            View view = c0091h.f2081a.f2009a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0091h.f2081a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((X) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            X x2 = (X) arrayList3.get(size3);
            x2.f2009a.setAlpha(1.0f);
            c(x2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2091k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0090g c0090g = (C0090g) arrayList4.get(size4);
            X x3 = c0090g.f2072a;
            if (x3 != null) {
                k(c0090g, x3);
            }
            X x4 = c0090g.f2073b;
            if (x4 != null) {
                k(c0090g, x4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2093m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0091h c0091h2 = (C0091h) arrayList6.get(size6);
                    View view2 = c0091h2.f2081a.f2009a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0091h2.f2081a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2092l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    X x5 = (X) arrayList8.get(size8);
                    x5.f2009a.setAlpha(1.0f);
                    c(x5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2094n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0090g c0090g2 = (C0090g) arrayList10.get(size10);
                    X x6 = c0090g2.f2072a;
                    if (x6 != null) {
                        k(c0090g2, x6);
                    }
                    X x7 = c0090g2.f2073b;
                    if (x7 != null) {
                        k(c0090g2, x7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2097q);
            h(this.f2096p);
            h(this.f2095o);
            h(this.f2098r);
            ArrayList arrayList11 = this.f1949b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // f0.E
    public final boolean f() {
        return (this.i.isEmpty() && this.f2091k.isEmpty() && this.f2090j.isEmpty() && this.h.isEmpty() && this.f2096p.isEmpty() && this.f2097q.isEmpty() && this.f2095o.isEmpty() && this.f2098r.isEmpty() && this.f2093m.isEmpty() && this.f2092l.isEmpty() && this.f2094n.isEmpty()) ? false : true;
    }

    public final boolean g(X x2, int i, int i2, int i3, int i4) {
        View view = x2.f2009a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) x2.f2009a.getTranslationY());
        l(x2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(x2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2090j;
        C0091h c0091h = new C0091h();
        c0091h.f2081a = x2;
        c0091h.f2082b = translationX;
        c0091h.f2083c = translationY;
        c0091h.d = i3;
        c0091h.f2084e = i4;
        arrayList.add(c0091h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1949b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, X x2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0090g c0090g = (C0090g) arrayList.get(size);
            if (k(c0090g, x2) && c0090g.f2072a == null && c0090g.f2073b == null) {
                arrayList.remove(c0090g);
            }
        }
    }

    public final boolean k(C0090g c0090g, X x2) {
        if (c0090g.f2073b == x2) {
            c0090g.f2073b = null;
        } else {
            if (c0090g.f2072a != x2) {
                return false;
            }
            c0090g.f2072a = null;
        }
        x2.f2009a.setAlpha(1.0f);
        View view = x2.f2009a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(x2);
        return true;
    }

    public final void l(X x2) {
        if (f2088s == null) {
            f2088s = new ValueAnimator().getInterpolator();
        }
        x2.f2009a.animate().setInterpolator(f2088s);
        d(x2);
    }
}
