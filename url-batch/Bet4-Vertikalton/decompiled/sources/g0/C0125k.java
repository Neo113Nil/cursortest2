package g0;

import K.C0019q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125k extends H {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2405s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2406g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2407j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2408k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2409l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2410m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2411n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2412o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2413p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2414q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2415r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c0) arrayList.get(size)).f2339a.animate().cancel();
        }
    }

    @Override // g0.H
    public final boolean a(c0 c0Var, c0 c0Var2, C0019q c0019q, C0019q c0019q2) {
        int i;
        int i2;
        int i3 = c0019q.f493a;
        int i4 = c0019q.f494b;
        if (c0Var2.q()) {
            int i5 = c0019q.f493a;
            i2 = c0019q.f494b;
            i = i5;
        } else {
            i = c0019q2.f493a;
            i2 = c0019q2.f494b;
        }
        if (c0Var == c0Var2) {
            return g(c0Var, i3, i4, i, i2);
        }
        View view = c0Var.f2339a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(c0Var2);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = c0Var2.f2339a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f1530C0);
        ArrayList arrayList = this.f2408k;
        C0123i c0123i = new C0123i();
        c0123i.f2386a = c0Var;
        c0123i.f2387b = c0Var2;
        c0123i.f2388c = i3;
        c0123i.d = i4;
        c0123i.f2389e = i;
        c0123i.f2390f = i2;
        arrayList.add(c0123i);
        return true;
    }

    @Override // g0.H
    public final void d(c0 c0Var) {
        View view = c0Var.f2339a;
        view.animate().cancel();
        ArrayList arrayList = this.f2407j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0124j) arrayList.get(size)).f2394a == c0Var) {
                view.setTranslationY(RecyclerView.f1530C0);
                view.setTranslationX(RecyclerView.f1530C0);
                c(c0Var);
                arrayList.remove(size);
            }
        }
        j(this.f2408k, c0Var);
        if (this.h.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        if (this.i.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        ArrayList arrayList2 = this.f2411n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, c0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2410m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0124j) arrayList5.get(size4)).f2394a == c0Var) {
                    view.setTranslationY(RecyclerView.f1530C0);
                    view.setTranslationX(RecyclerView.f1530C0);
                    c(c0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2409l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c0Var)) {
                view.setAlpha(1.0f);
                c(c0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2414q.remove(c0Var);
        this.f2412o.remove(c0Var);
        this.f2415r.remove(c0Var);
        this.f2413p.remove(c0Var);
        i();
    }

    @Override // g0.H
    public final void e() {
        ArrayList arrayList = this.f2407j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0124j c0124j = (C0124j) arrayList.get(size);
            View view = c0124j.f2394a.f2339a;
            view.setTranslationY(RecyclerView.f1530C0);
            view.setTranslationX(RecyclerView.f1530C0);
            c(c0124j.f2394a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((c0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c0 c0Var = (c0) arrayList3.get(size3);
            c0Var.f2339a.setAlpha(1.0f);
            c(c0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2408k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0123i c0123i = (C0123i) arrayList4.get(size4);
            c0 c0Var2 = c0123i.f2386a;
            if (c0Var2 != null) {
                k(c0123i, c0Var2);
            }
            c0 c0Var3 = c0123i.f2387b;
            if (c0Var3 != null) {
                k(c0123i, c0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2410m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0124j c0124j2 = (C0124j) arrayList6.get(size6);
                    View view2 = c0124j2.f2394a.f2339a;
                    view2.setTranslationY(RecyclerView.f1530C0);
                    view2.setTranslationX(RecyclerView.f1530C0);
                    c(c0124j2.f2394a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2409l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    c0 c0Var4 = (c0) arrayList8.get(size8);
                    c0Var4.f2339a.setAlpha(1.0f);
                    c(c0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2411n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0123i c0123i2 = (C0123i) arrayList10.get(size10);
                    c0 c0Var5 = c0123i2.f2386a;
                    if (c0Var5 != null) {
                        k(c0123i2, c0Var5);
                    }
                    c0 c0Var6 = c0123i2.f2387b;
                    if (c0Var6 != null) {
                        k(c0123i2, c0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2414q);
            h(this.f2413p);
            h(this.f2412o);
            h(this.f2415r);
            ArrayList arrayList11 = this.f2266b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g0.H
    public final boolean f() {
        return (this.i.isEmpty() && this.f2408k.isEmpty() && this.f2407j.isEmpty() && this.h.isEmpty() && this.f2413p.isEmpty() && this.f2414q.isEmpty() && this.f2412o.isEmpty() && this.f2415r.isEmpty() && this.f2410m.isEmpty() && this.f2409l.isEmpty() && this.f2411n.isEmpty()) ? false : true;
    }

    public final boolean g(c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.f2339a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c0Var.f2339a.getTranslationY());
        l(c0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(c0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2407j;
        C0124j c0124j = new C0124j();
        c0124j.f2394a = c0Var;
        c0124j.f2395b = translationX;
        c0124j.f2396c = translationY;
        c0124j.d = i3;
        c0124j.f2397e = i4;
        arrayList.add(c0124j);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2266b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, c0 c0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0123i c0123i = (C0123i) arrayList.get(size);
            if (k(c0123i, c0Var) && c0123i.f2386a == null && c0123i.f2387b == null) {
                arrayList.remove(c0123i);
            }
        }
    }

    public final boolean k(C0123i c0123i, c0 c0Var) {
        if (c0123i.f2387b == c0Var) {
            c0123i.f2387b = null;
        } else {
            if (c0123i.f2386a != c0Var) {
                return false;
            }
            c0123i.f2386a = null;
        }
        c0Var.f2339a.setAlpha(1.0f);
        View view = c0Var.f2339a;
        view.setTranslationX(RecyclerView.f1530C0);
        view.setTranslationY(RecyclerView.f1530C0);
        c(c0Var);
        return true;
    }

    public final void l(c0 c0Var) {
        if (f2405s == null) {
            f2405s = new ValueAnimator().getInterpolator();
        }
        c0Var.f2339a.animate().setInterpolator(f2405s);
        d(c0Var);
    }
}
