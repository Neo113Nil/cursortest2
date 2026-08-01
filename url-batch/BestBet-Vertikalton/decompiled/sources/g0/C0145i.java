package g0;

import K.C0019o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145i extends AbstractC0134D {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2855s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2856g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2857j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2858k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2859l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2860m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2861n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2862o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2863p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2864q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2865r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Y) arrayList.get(size)).f2777a.animate().cancel();
        }
    }

    @Override // g0.AbstractC0134D
    public final boolean a(Y y2, Y y3, C0019o c0019o, C0019o c0019o2) {
        int i;
        int i2;
        int i3 = c0019o.f641a;
        int i4 = c0019o.f642b;
        if (y3.p()) {
            int i5 = c0019o.f641a;
            i2 = c0019o.f642b;
            i = i5;
        } else {
            i = c0019o2.f641a;
            i2 = c0019o2.f642b;
        }
        if (y2 == y3) {
            return g(y2, i3, i4, i, i2);
        }
        View view = y2.f2777a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(y2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(y3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = y3.f2777a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f1937A0);
        ArrayList arrayList = this.f2858k;
        C0143g c0143g = new C0143g();
        c0143g.f2837a = y2;
        c0143g.f2838b = y3;
        c0143g.f2839c = i3;
        c0143g.d = i4;
        c0143g.f2840e = i;
        c0143g.f2841f = i2;
        arrayList.add(c0143g);
        return true;
    }

    @Override // g0.AbstractC0134D
    public final void d(Y y2) {
        View view = y2.f2777a;
        view.animate().cancel();
        ArrayList arrayList = this.f2857j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0144h) arrayList.get(size)).f2847a == y2) {
                view.setTranslationY(RecyclerView.f1937A0);
                view.setTranslationX(RecyclerView.f1937A0);
                c(y2);
                arrayList.remove(size);
            }
        }
        j(this.f2858k, y2);
        if (this.h.remove(y2)) {
            view.setAlpha(1.0f);
            c(y2);
        }
        if (this.i.remove(y2)) {
            view.setAlpha(1.0f);
            c(y2);
        }
        ArrayList arrayList2 = this.f2861n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, y2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2860m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0144h) arrayList5.get(size4)).f2847a == y2) {
                    view.setTranslationY(RecyclerView.f1937A0);
                    view.setTranslationX(RecyclerView.f1937A0);
                    c(y2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2859l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(y2)) {
                view.setAlpha(1.0f);
                c(y2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2864q.remove(y2);
        this.f2862o.remove(y2);
        this.f2865r.remove(y2);
        this.f2863p.remove(y2);
        i();
    }

    @Override // g0.AbstractC0134D
    public final void e() {
        ArrayList arrayList = this.f2857j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0144h c0144h = (C0144h) arrayList.get(size);
            View view = c0144h.f2847a.f2777a;
            view.setTranslationY(RecyclerView.f1937A0);
            view.setTranslationX(RecyclerView.f1937A0);
            c(c0144h.f2847a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((Y) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Y y2 = (Y) arrayList3.get(size3);
            y2.f2777a.setAlpha(1.0f);
            c(y2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2858k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0143g c0143g = (C0143g) arrayList4.get(size4);
            Y y3 = c0143g.f2837a;
            if (y3 != null) {
                k(c0143g, y3);
            }
            Y y4 = c0143g.f2838b;
            if (y4 != null) {
                k(c0143g, y4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2860m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0144h c0144h2 = (C0144h) arrayList6.get(size6);
                    View view2 = c0144h2.f2847a.f2777a;
                    view2.setTranslationY(RecyclerView.f1937A0);
                    view2.setTranslationX(RecyclerView.f1937A0);
                    c(c0144h2.f2847a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2859l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    Y y5 = (Y) arrayList8.get(size8);
                    y5.f2777a.setAlpha(1.0f);
                    c(y5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2861n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0143g c0143g2 = (C0143g) arrayList10.get(size10);
                    Y y6 = c0143g2.f2837a;
                    if (y6 != null) {
                        k(c0143g2, y6);
                    }
                    Y y7 = c0143g2.f2838b;
                    if (y7 != null) {
                        k(c0143g2, y7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2864q);
            h(this.f2863p);
            h(this.f2862o);
            h(this.f2865r);
            ArrayList arrayList11 = this.f2715b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g0.AbstractC0134D
    public final boolean f() {
        return (this.i.isEmpty() && this.f2858k.isEmpty() && this.f2857j.isEmpty() && this.h.isEmpty() && this.f2863p.isEmpty() && this.f2864q.isEmpty() && this.f2862o.isEmpty() && this.f2865r.isEmpty() && this.f2860m.isEmpty() && this.f2859l.isEmpty() && this.f2861n.isEmpty()) ? false : true;
    }

    public final boolean g(Y y2, int i, int i2, int i3, int i4) {
        View view = y2.f2777a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) y2.f2777a.getTranslationY());
        l(y2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(y2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2857j;
        C0144h c0144h = new C0144h();
        c0144h.f2847a = y2;
        c0144h.f2848b = translationX;
        c0144h.f2849c = translationY;
        c0144h.d = i3;
        c0144h.f2850e = i4;
        arrayList.add(c0144h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2715b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, Y y2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0143g c0143g = (C0143g) arrayList.get(size);
            if (k(c0143g, y2) && c0143g.f2837a == null && c0143g.f2838b == null) {
                arrayList.remove(c0143g);
            }
        }
    }

    public final boolean k(C0143g c0143g, Y y2) {
        if (c0143g.f2838b == y2) {
            c0143g.f2838b = null;
        } else {
            if (c0143g.f2837a != y2) {
                return false;
            }
            c0143g.f2837a = null;
        }
        y2.f2777a.setAlpha(1.0f);
        View view = y2.f2777a;
        view.setTranslationX(RecyclerView.f1937A0);
        view.setTranslationY(RecyclerView.f1937A0);
        c(y2);
        return true;
    }

    public final void l(Y y2) {
        if (f2855s == null) {
            f2855s = new ValueAnimator().getInterpolator();
        }
        y2.f2777a.animate().setInterpolator(f2855s);
        d(y2);
    }
}
