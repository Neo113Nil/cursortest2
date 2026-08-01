package h0;

import M.C0019o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158h extends AbstractC0137C {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3035s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3036g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3037h;
    public ArrayList i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3038k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3039l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3040m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3041n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3042o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3043p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3044q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3045r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((V) arrayList.get(size)).f2958a.animate().cancel();
        }
    }

    @Override // h0.AbstractC0137C
    public final boolean a(V v2, V v3, C0019o c0019o, C0019o c0019o2) {
        int i;
        int i2;
        int i3 = c0019o.f781a;
        int i4 = c0019o.f782b;
        if (v3.p()) {
            int i5 = c0019o.f781a;
            i2 = c0019o.f782b;
            i = i5;
        } else {
            i = c0019o2.f781a;
            i2 = c0019o2.f782b;
        }
        if (v2 == v3) {
            return g(v2, i3, i4, i, i2);
        }
        View view = v2.f2958a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(v2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(v3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = v3.f2958a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3038k;
        C0156f c0156f = new C0156f();
        c0156f.f3022a = v2;
        c0156f.f3023b = v3;
        c0156f.f3024c = i3;
        c0156f.f3025d = i4;
        c0156f.e = i;
        c0156f.f3026f = i2;
        arrayList.add(c0156f);
        return true;
    }

    @Override // h0.AbstractC0137C
    public final void d(V v2) {
        View view = v2.f2958a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0157g) arrayList.get(size)).f3031a == v2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(v2);
                arrayList.remove(size);
            }
        }
        j(this.f3038k, v2);
        if (this.f3037h.remove(v2)) {
            view.setAlpha(1.0f);
            c(v2);
        }
        if (this.i.remove(v2)) {
            view.setAlpha(1.0f);
            c(v2);
        }
        ArrayList arrayList2 = this.f3041n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, v2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3040m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0157g) arrayList5.get(size4)).f3031a == v2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(v2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3039l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(v2)) {
                view.setAlpha(1.0f);
                c(v2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3044q.remove(v2);
        this.f3042o.remove(v2);
        this.f3045r.remove(v2);
        this.f3043p.remove(v2);
        i();
    }

    @Override // h0.AbstractC0137C
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0157g c0157g = (C0157g) arrayList.get(size);
            View view = c0157g.f3031a.f2958a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0157g.f3031a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3037h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((V) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            V v2 = (V) arrayList3.get(size3);
            v2.f2958a.setAlpha(1.0f);
            c(v2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3038k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0156f c0156f = (C0156f) arrayList4.get(size4);
            V v3 = c0156f.f3022a;
            if (v3 != null) {
                k(c0156f, v3);
            }
            V v4 = c0156f.f3023b;
            if (v4 != null) {
                k(c0156f, v4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3040m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0157g c0157g2 = (C0157g) arrayList6.get(size6);
                    View view2 = c0157g2.f3031a.f2958a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0157g2.f3031a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3039l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    V v5 = (V) arrayList8.get(size8);
                    v5.f2958a.setAlpha(1.0f);
                    c(v5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3041n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0156f c0156f2 = (C0156f) arrayList10.get(size10);
                    V v6 = c0156f2.f3022a;
                    if (v6 != null) {
                        k(c0156f2, v6);
                    }
                    V v7 = c0156f2.f3023b;
                    if (v7 != null) {
                        k(c0156f2, v7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3044q);
            h(this.f3043p);
            h(this.f3042o);
            h(this.f3045r);
            ArrayList arrayList11 = this.f2894b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // h0.AbstractC0137C
    public final boolean f() {
        return (this.i.isEmpty() && this.f3038k.isEmpty() && this.j.isEmpty() && this.f3037h.isEmpty() && this.f3043p.isEmpty() && this.f3044q.isEmpty() && this.f3042o.isEmpty() && this.f3045r.isEmpty() && this.f3040m.isEmpty() && this.f3039l.isEmpty() && this.f3041n.isEmpty()) ? false : true;
    }

    public final boolean g(V v2, int i, int i2, int i3, int i4) {
        View view = v2.f2958a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) v2.f2958a.getTranslationY());
        l(v2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(v2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        C0157g c0157g = new C0157g();
        c0157g.f3031a = v2;
        c0157g.f3032b = translationX;
        c0157g.f3033c = translationY;
        c0157g.f3034d = i3;
        c0157g.e = i4;
        arrayList.add(c0157g);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2894b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, V v2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0156f c0156f = (C0156f) arrayList.get(size);
            if (k(c0156f, v2) && c0156f.f3022a == null && c0156f.f3023b == null) {
                arrayList.remove(c0156f);
            }
        }
    }

    public final boolean k(C0156f c0156f, V v2) {
        if (c0156f.f3023b == v2) {
            c0156f.f3023b = null;
        } else {
            if (c0156f.f3022a != v2) {
                return false;
            }
            c0156f.f3022a = null;
        }
        v2.f2958a.setAlpha(1.0f);
        View view = v2.f2958a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(v2);
        return true;
    }

    public final void l(V v2) {
        if (f3035s == null) {
            f3035s = new ValueAnimator().getInterpolator();
        }
        v2.f2958a.animate().setInterpolator(f3035s);
        d(v2);
    }
}
