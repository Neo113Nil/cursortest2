package e0;

import K.C0024u;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121i extends AbstractC0111E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2261s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2262g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2263j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2264k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2265l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2266m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2267n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2268o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2269p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2270q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2271r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((X) arrayList.get(size)).f2168a.animate().cancel();
        }
    }

    @Override // e0.AbstractC0111E
    public final boolean a(X x2, X x3, C0024u c0024u, C0024u c0024u2) {
        int i;
        int i2;
        int i3 = c0024u.f500a;
        int i4 = c0024u.f501b;
        if (x3.p()) {
            int i5 = c0024u.f500a;
            i2 = c0024u.f501b;
            i = i5;
        } else {
            i = c0024u2.f500a;
            i2 = c0024u2.f501b;
        }
        if (x2 == x3) {
            return g(x2, i3, i4, i, i2);
        }
        View view = x2.f2168a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(x2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(x3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = x3.f2168a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2264k;
        C0119g c0119g = new C0119g();
        c0119g.f2241a = x2;
        c0119g.f2242b = x3;
        c0119g.f2243c = i3;
        c0119g.f2244d = i4;
        c0119g.f2245e = i;
        c0119g.f2246f = i2;
        arrayList.add(c0119g);
        return true;
    }

    @Override // e0.AbstractC0111E
    public final void d(X x2) {
        View view = x2.f2168a;
        view.animate().cancel();
        ArrayList arrayList = this.f2263j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0120h) arrayList.get(size)).f2252a == x2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x2);
                arrayList.remove(size);
            }
        }
        j(this.f2264k, x2);
        if (this.h.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        if (this.i.remove(x2)) {
            view.setAlpha(1.0f);
            c(x2);
        }
        ArrayList arrayList2 = this.f2267n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, x2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2266m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0120h) arrayList5.get(size4)).f2252a == x2) {
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
        ArrayList arrayList6 = this.f2265l;
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
        this.f2270q.remove(x2);
        this.f2268o.remove(x2);
        this.f2271r.remove(x2);
        this.f2269p.remove(x2);
        i();
    }

    @Override // e0.AbstractC0111E
    public final void e() {
        ArrayList arrayList = this.f2263j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0120h c0120h = (C0120h) arrayList.get(size);
            View view = c0120h.f2252a.f2168a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0120h.f2252a);
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
            x2.f2168a.setAlpha(1.0f);
            c(x2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2264k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0119g c0119g = (C0119g) arrayList4.get(size4);
            X x3 = c0119g.f2241a;
            if (x3 != null) {
                k(c0119g, x3);
            }
            X x4 = c0119g.f2242b;
            if (x4 != null) {
                k(c0119g, x4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2266m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0120h c0120h2 = (C0120h) arrayList6.get(size6);
                    View view2 = c0120h2.f2252a.f2168a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0120h2.f2252a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2265l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    X x5 = (X) arrayList8.get(size8);
                    x5.f2168a.setAlpha(1.0f);
                    c(x5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2267n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0119g c0119g2 = (C0119g) arrayList10.get(size10);
                    X x6 = c0119g2.f2241a;
                    if (x6 != null) {
                        k(c0119g2, x6);
                    }
                    X x7 = c0119g2.f2242b;
                    if (x7 != null) {
                        k(c0119g2, x7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2270q);
            h(this.f2269p);
            h(this.f2268o);
            h(this.f2271r);
            ArrayList arrayList11 = this.f2099b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // e0.AbstractC0111E
    public final boolean f() {
        return (this.i.isEmpty() && this.f2264k.isEmpty() && this.f2263j.isEmpty() && this.h.isEmpty() && this.f2269p.isEmpty() && this.f2270q.isEmpty() && this.f2268o.isEmpty() && this.f2271r.isEmpty() && this.f2266m.isEmpty() && this.f2265l.isEmpty() && this.f2267n.isEmpty()) ? false : true;
    }

    public final boolean g(X x2, int i, int i2, int i3, int i4) {
        View view = x2.f2168a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) x2.f2168a.getTranslationY());
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
        ArrayList arrayList = this.f2263j;
        C0120h c0120h = new C0120h();
        c0120h.f2252a = x2;
        c0120h.f2253b = translationX;
        c0120h.f2254c = translationY;
        c0120h.f2255d = i3;
        c0120h.f2256e = i4;
        arrayList.add(c0120h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2099b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, X x2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0119g c0119g = (C0119g) arrayList.get(size);
            if (k(c0119g, x2) && c0119g.f2241a == null && c0119g.f2242b == null) {
                arrayList.remove(c0119g);
            }
        }
    }

    public final boolean k(C0119g c0119g, X x2) {
        if (c0119g.f2242b == x2) {
            c0119g.f2242b = null;
        } else {
            if (c0119g.f2241a != x2) {
                return false;
            }
            c0119g.f2241a = null;
        }
        x2.f2168a.setAlpha(1.0f);
        View view = x2.f2168a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(x2);
        return true;
    }

    public final void l(X x2) {
        if (f2261s == null) {
            f2261s = new ValueAnimator().getInterpolator();
        }
        x2.f2168a.animate().setInterpolator(f2261s);
        d(x2);
    }
}
