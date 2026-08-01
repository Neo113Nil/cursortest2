package f0;

import K.C0016q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099i extends AbstractC0089E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2222s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2223g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2224j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2225k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2226l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2227m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2228n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2229o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2230p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2231q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2232r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((X) arrayList.get(size)).f2143a.animate().cancel();
        }
    }

    @Override // f0.AbstractC0089E
    public final boolean a(X x2, X x3, C0016q c0016q, C0016q c0016q2) {
        int i;
        int i2;
        int i3 = c0016q.f495a;
        int i4 = c0016q.f496b;
        if (x3.p()) {
            int i5 = c0016q.f495a;
            i2 = c0016q.f496b;
            i = i5;
        } else {
            i = c0016q2.f495a;
            i2 = c0016q2.f496b;
        }
        if (x2 == x3) {
            return g(x2, i3, i4, i, i2);
        }
        View view = x2.f2143a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(x2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(x3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = x3.f2143a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2225k;
        C0097g c0097g = new C0097g();
        c0097g.f2206a = x2;
        c0097g.f2207b = x3;
        c0097g.f2208c = i3;
        c0097g.d = i4;
        c0097g.f2209e = i;
        c0097g.f2210f = i2;
        arrayList.add(c0097g);
        return true;
    }

    @Override // f0.AbstractC0089E
    public final void d(X x2) {
        View view = x2.f2143a;
        view.animate().cancel();
        ArrayList arrayList = this.f2224j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0098h) arrayList.get(size)).f2215a == x2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x2);
                arrayList.remove(size);
            }
        }
        j(this.f2225k, x2);
        if (this.h.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        if (this.i.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        ArrayList arrayList2 = this.f2228n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, x2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2227m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0098h) arrayList5.get(size4)).f2215a == x2) {
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
        ArrayList arrayList6 = this.f2226l;
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
        this.f2231q.remove(x2);
        this.f2229o.remove(x2);
        this.f2232r.remove(x2);
        this.f2230p.remove(x2);
        i();
    }

    @Override // f0.AbstractC0089E
    public final void e() {
        ArrayList arrayList = this.f2224j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0098h c0098h = (C0098h) arrayList.get(size);
            View view = c0098h.f2215a.f2143a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0098h.f2215a);
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
            x2.f2143a.setAlpha(1.0f);
            c(x2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2225k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0097g c0097g = (C0097g) arrayList4.get(size4);
            X x3 = c0097g.f2206a;
            if (x3 != null) {
                k(c0097g, x3);
            }
            X x4 = c0097g.f2207b;
            if (x4 != null) {
                k(c0097g, x4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2227m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0098h c0098h2 = (C0098h) arrayList6.get(size6);
                    View view2 = c0098h2.f2215a.f2143a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0098h2.f2215a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2226l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    X x5 = (X) arrayList8.get(size8);
                    x5.f2143a.setAlpha(1.0f);
                    c(x5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2228n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0097g c0097g2 = (C0097g) arrayList10.get(size10);
                    X x6 = c0097g2.f2206a;
                    if (x6 != null) {
                        k(c0097g2, x6);
                    }
                    X x7 = c0097g2.f2207b;
                    if (x7 != null) {
                        k(c0097g2, x7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2231q);
            h(this.f2230p);
            h(this.f2229o);
            h(this.f2232r);
            ArrayList arrayList11 = this.f2083b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // f0.AbstractC0089E
    public final boolean f() {
        return (this.i.isEmpty() && this.f2225k.isEmpty() && this.f2224j.isEmpty() && this.h.isEmpty() && this.f2230p.isEmpty() && this.f2231q.isEmpty() && this.f2229o.isEmpty() && this.f2232r.isEmpty() && this.f2227m.isEmpty() && this.f2226l.isEmpty() && this.f2228n.isEmpty()) ? false : true;
    }

    public final boolean g(X x2, int i, int i2, int i3, int i4) {
        View view = x2.f2143a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) x2.f2143a.getTranslationY());
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
        ArrayList arrayList = this.f2224j;
        C0098h c0098h = new C0098h();
        c0098h.f2215a = x2;
        c0098h.f2216b = translationX;
        c0098h.f2217c = translationY;
        c0098h.d = i3;
        c0098h.f2218e = i4;
        arrayList.add(c0098h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2083b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, X x2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0097g c0097g = (C0097g) arrayList.get(size);
            if (k(c0097g, x2) && c0097g.f2206a == null && c0097g.f2207b == null) {
                arrayList.remove(c0097g);
            }
        }
    }

    public final boolean k(C0097g c0097g, X x2) {
        if (c0097g.f2207b == x2) {
            c0097g.f2207b = null;
        } else {
            if (c0097g.f2206a != x2) {
                return false;
            }
            c0097g.f2206a = null;
        }
        x2.f2143a.setAlpha(1.0f);
        View view = x2.f2143a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(x2);
        return true;
    }

    public final void l(X x2) {
        if (f2222s == null) {
            f2222s = new ValueAnimator().getInterpolator();
        }
        x2.f2143a.animate().setInterpolator(f2222s);
        d(x2);
    }
}
