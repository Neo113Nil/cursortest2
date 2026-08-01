package f0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103i extends D {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2271s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2272g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2273j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2274k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2275l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2276m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2277n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2278o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2279p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2280q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2281r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((W) arrayList.get(size)).f2193a.animate().cancel();
        }
    }

    @Override // f0.D
    public final boolean a(W w2, W w3, K.r rVar, K.r rVar2) {
        int i;
        int i2;
        int i3 = rVar.f439a;
        int i4 = rVar.f440b;
        if (w3.p()) {
            int i5 = rVar.f439a;
            i2 = rVar.f440b;
            i = i5;
        } else {
            i = rVar2.f439a;
            i2 = rVar2.f440b;
        }
        if (w2 == w3) {
            return g(w2, i3, i4, i, i2);
        }
        View view = w2.f2193a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(w2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(w3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = w3.f2193a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2274k;
        C0101g c0101g = new C0101g();
        c0101g.f2259a = w2;
        c0101g.f2260b = w3;
        c0101g.f2261c = i3;
        c0101g.d = i4;
        c0101g.f2262e = i;
        c0101g.f2263f = i2;
        arrayList.add(c0101g);
        return true;
    }

    @Override // f0.D
    public final void d(W w2) {
        View view = w2.f2193a;
        view.animate().cancel();
        ArrayList arrayList = this.f2273j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0102h) arrayList.get(size)).f2267a == w2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(w2);
                arrayList.remove(size);
            }
        }
        j(this.f2274k, w2);
        if (this.h.remove(w2)) {
            view.setAlpha(1.0f);
            c(w2);
        }
        if (this.i.remove(w2)) {
            view.setAlpha(1.0f);
            c(w2);
        }
        ArrayList arrayList2 = this.f2277n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, w2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2276m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0102h) arrayList5.get(size4)).f2267a == w2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(w2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2275l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(w2)) {
                view.setAlpha(1.0f);
                c(w2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2280q.remove(w2);
        this.f2278o.remove(w2);
        this.f2281r.remove(w2);
        this.f2279p.remove(w2);
        i();
    }

    @Override // f0.D
    public final void e() {
        ArrayList arrayList = this.f2273j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0102h c0102h = (C0102h) arrayList.get(size);
            View view = c0102h.f2267a.f2193a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0102h.f2267a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((W) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            W w2 = (W) arrayList3.get(size3);
            w2.f2193a.setAlpha(1.0f);
            c(w2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2274k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0101g c0101g = (C0101g) arrayList4.get(size4);
            W w3 = c0101g.f2259a;
            if (w3 != null) {
                k(c0101g, w3);
            }
            W w4 = c0101g.f2260b;
            if (w4 != null) {
                k(c0101g, w4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2276m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0102h c0102h2 = (C0102h) arrayList6.get(size6);
                    View view2 = c0102h2.f2267a.f2193a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0102h2.f2267a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2275l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    W w5 = (W) arrayList8.get(size8);
                    w5.f2193a.setAlpha(1.0f);
                    c(w5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2277n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0101g c0101g2 = (C0101g) arrayList10.get(size10);
                    W w6 = c0101g2.f2259a;
                    if (w6 != null) {
                        k(c0101g2, w6);
                    }
                    W w7 = c0101g2.f2260b;
                    if (w7 != null) {
                        k(c0101g2, w7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2280q);
            h(this.f2279p);
            h(this.f2278o);
            h(this.f2281r);
            ArrayList arrayList11 = this.f2133b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // f0.D
    public final boolean f() {
        return (this.i.isEmpty() && this.f2274k.isEmpty() && this.f2273j.isEmpty() && this.h.isEmpty() && this.f2279p.isEmpty() && this.f2280q.isEmpty() && this.f2278o.isEmpty() && this.f2281r.isEmpty() && this.f2276m.isEmpty() && this.f2275l.isEmpty() && this.f2277n.isEmpty()) ? false : true;
    }

    public final boolean g(W w2, int i, int i2, int i3, int i4) {
        View view = w2.f2193a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) w2.f2193a.getTranslationY());
        l(w2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(w2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2273j;
        C0102h c0102h = new C0102h();
        c0102h.f2267a = w2;
        c0102h.f2268b = translationX;
        c0102h.f2269c = translationY;
        c0102h.d = i3;
        c0102h.f2270e = i4;
        arrayList.add(c0102h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2133b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, W w2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0101g c0101g = (C0101g) arrayList.get(size);
            if (k(c0101g, w2) && c0101g.f2259a == null && c0101g.f2260b == null) {
                arrayList.remove(c0101g);
            }
        }
    }

    public final boolean k(C0101g c0101g, W w2) {
        if (c0101g.f2260b == w2) {
            c0101g.f2260b = null;
        } else {
            if (c0101g.f2259a != w2) {
                return false;
            }
            c0101g.f2259a = null;
        }
        w2.f2193a.setAlpha(1.0f);
        View view = w2.f2193a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(w2);
        return true;
    }

    public final void l(W w2) {
        if (f2271s == null) {
            f2271s = new ValueAnimator().getInterpolator();
        }
        w2.f2193a.animate().setInterpolator(f2271s);
        d(w2);
    }
}
