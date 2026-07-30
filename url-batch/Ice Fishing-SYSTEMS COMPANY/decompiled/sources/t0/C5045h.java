package t0;

import O.C0357t;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5045h extends AbstractC5063z {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f40700s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40701g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f40702h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f40703j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f40704k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f40705l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f40706m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40707n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f40708o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f40709p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f40710q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f40711r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC5032P) arrayList.get(size)).f40615a.animate().cancel();
        }
    }

    @Override // t0.AbstractC5063z
    public final boolean a(AbstractC5032P abstractC5032P, AbstractC5032P abstractC5032P2, C0357t c0357t, C0357t c0357t2) {
        int i;
        int i4;
        int i9 = c0357t.f2319a;
        int i10 = c0357t.f2320b;
        if (abstractC5032P2.o()) {
            int i11 = c0357t.f2319a;
            i4 = c0357t.f2320b;
            i = i11;
        } else {
            i = c0357t2.f2319a;
            i4 = c0357t2.f2320b;
        }
        if (abstractC5032P == abstractC5032P2) {
            return g(abstractC5032P, i9, i10, i, i4);
        }
        View view = abstractC5032P.f40615a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(abstractC5032P);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(abstractC5032P2);
        float f6 = -((int) ((i - i9) - translationX));
        View view2 = abstractC5032P2.f40615a;
        view2.setTranslationX(f6);
        view2.setTranslationY(-((int) ((i4 - i10) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f40704k;
        C5043f c5043f = new C5043f();
        c5043f.f40689a = abstractC5032P;
        c5043f.f40690b = abstractC5032P2;
        c5043f.f40691c = i9;
        c5043f.f40692d = i10;
        c5043f.f40693e = i;
        c5043f.f40694f = i4;
        arrayList.add(c5043f);
        return true;
    }

    @Override // t0.AbstractC5063z
    public final void d(AbstractC5032P abstractC5032P) {
        View view = abstractC5032P.f40615a;
        view.animate().cancel();
        ArrayList arrayList = this.f40703j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C5044g) arrayList.get(size)).f40695a == abstractC5032P) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(abstractC5032P);
                arrayList.remove(size);
            }
        }
        j(this.f40704k, abstractC5032P);
        if (this.f40702h.remove(abstractC5032P)) {
            view.setAlpha(1.0f);
            c(abstractC5032P);
        }
        if (this.i.remove(abstractC5032P)) {
            view.setAlpha(1.0f);
            c(abstractC5032P);
        }
        ArrayList arrayList2 = this.f40707n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, abstractC5032P);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f40706m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C5044g) arrayList5.get(size4)).f40695a == abstractC5032P) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(abstractC5032P);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f40705l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC5032P)) {
                view.setAlpha(1.0f);
                c(abstractC5032P);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f40710q.remove(abstractC5032P);
        this.f40708o.remove(abstractC5032P);
        this.f40711r.remove(abstractC5032P);
        this.f40709p.remove(abstractC5032P);
        i();
    }

    @Override // t0.AbstractC5063z
    public final void e() {
        ArrayList arrayList = this.f40703j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C5044g c5044g = (C5044g) arrayList.get(size);
            View view = c5044g.f40695a.f40615a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c5044g.f40695a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f40702h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((AbstractC5032P) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList3.get(size3);
            abstractC5032P.f40615a.setAlpha(1.0f);
            c(abstractC5032P);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f40704k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C5043f c5043f = (C5043f) arrayList4.get(size4);
            AbstractC5032P abstractC5032P2 = c5043f.f40689a;
            if (abstractC5032P2 != null) {
                k(c5043f, abstractC5032P2);
            }
            AbstractC5032P abstractC5032P3 = c5043f.f40690b;
            if (abstractC5032P3 != null) {
                k(c5043f, abstractC5032P3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f40706m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C5044g c5044g2 = (C5044g) arrayList6.get(size6);
                    View view2 = c5044g2.f40695a.f40615a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c5044g2.f40695a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f40705l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC5032P abstractC5032P4 = (AbstractC5032P) arrayList8.get(size8);
                    abstractC5032P4.f40615a.setAlpha(1.0f);
                    c(abstractC5032P4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f40707n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C5043f c5043f2 = (C5043f) arrayList10.get(size10);
                    AbstractC5032P abstractC5032P5 = c5043f2.f40689a;
                    if (abstractC5032P5 != null) {
                        k(c5043f2, abstractC5032P5);
                    }
                    AbstractC5032P abstractC5032P6 = c5043f2.f40690b;
                    if (abstractC5032P6 != null) {
                        k(c5043f2, abstractC5032P6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f40710q);
            h(this.f40709p);
            h(this.f40708o);
            h(this.f40711r);
            ArrayList arrayList11 = this.f40802b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // t0.AbstractC5063z
    public final boolean f() {
        return (this.i.isEmpty() && this.f40704k.isEmpty() && this.f40703j.isEmpty() && this.f40702h.isEmpty() && this.f40709p.isEmpty() && this.f40710q.isEmpty() && this.f40708o.isEmpty() && this.f40711r.isEmpty() && this.f40706m.isEmpty() && this.f40705l.isEmpty() && this.f40707n.isEmpty()) ? false : true;
    }

    public final boolean g(AbstractC5032P abstractC5032P, int i, int i4, int i9, int i10) {
        View view = abstractC5032P.f40615a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) abstractC5032P.f40615a.getTranslationY());
        l(abstractC5032P);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            c(abstractC5032P);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList arrayList = this.f40703j;
        C5044g c5044g = new C5044g();
        c5044g.f40695a = abstractC5032P;
        c5044g.f40696b = translationX;
        c5044g.f40697c = translationY;
        c5044g.f40698d = i9;
        c5044g.f40699e = i10;
        arrayList.add(c5044g);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f40802b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, AbstractC5032P abstractC5032P) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5043f c5043f = (C5043f) arrayList.get(size);
            if (k(c5043f, abstractC5032P) && c5043f.f40689a == null && c5043f.f40690b == null) {
                arrayList.remove(c5043f);
            }
        }
    }

    public final boolean k(C5043f c5043f, AbstractC5032P abstractC5032P) {
        if (c5043f.f40690b == abstractC5032P) {
            c5043f.f40690b = null;
        } else {
            if (c5043f.f40689a != abstractC5032P) {
                return false;
            }
            c5043f.f40689a = null;
        }
        abstractC5032P.f40615a.setAlpha(1.0f);
        View view = abstractC5032P.f40615a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(abstractC5032P);
        return true;
    }

    public final void l(AbstractC5032P abstractC5032P) {
        if (f40700s == null) {
            f40700s = new ValueAnimator().getInterpolator();
        }
        abstractC5032P.f40615a.animate().setInterpolator(f40700s);
        d(abstractC5032P);
    }
}
