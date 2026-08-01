package g1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o extends w0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1737s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1738g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1739j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1740k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1741l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1742m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1743n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1744o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1745p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1746q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1747r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((q1) arrayList.get(size)).f1768a.animate().cancel();
        }
    }

    @Override // g1.w0
    public final boolean a(q1 q1Var, q1 q1Var2, v0 v0Var, v0 v0Var2) {
        int i;
        int i4;
        int i5 = v0Var.f1808a;
        int i6 = v0Var.f1809b;
        if (q1Var2.o()) {
            int i7 = v0Var.f1808a;
            i4 = v0Var.f1809b;
            i = i7;
        } else {
            i = v0Var2.f1808a;
            i4 = v0Var2.f1809b;
        }
        if (q1Var == q1Var2) {
            return g(q1Var, i5, i6, i, i4);
        }
        View view = q1Var.f1768a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(q1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q1Var2.f1768a;
        l(q1Var2);
        view2.setTranslationX(-((int) ((i - i5) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i6) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f1740k;
        m mVar = new m();
        mVar.f1712a = q1Var;
        mVar.f1713b = q1Var2;
        mVar.f1714c = i5;
        mVar.d = i6;
        mVar.f1715e = i;
        mVar.f1716f = i4;
        arrayList.add(mVar);
        return true;
    }

    @Override // g1.w0
    public final void d(q1 q1Var) {
        ArrayList arrayList = this.f1741l;
        ArrayList arrayList2 = this.f1742m;
        ArrayList arrayList3 = this.f1743n;
        View view = q1Var.f1768a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f1739j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((n) arrayList4.get(size)).f1731a == q1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(q1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f1740k, q1Var);
        if (this.h.remove(q1Var)) {
            view.setAlpha(1.0f);
            c(q1Var);
        }
        if (this.i.remove(q1Var)) {
            view.setAlpha(1.0f);
            c(q1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, q1Var);
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
                if (((n) arrayList6.get(size4)).f1731a == q1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(q1Var);
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
            if (arrayList7.remove(q1Var)) {
                view.setAlpha(1.0f);
                c(q1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f1746q.remove(q1Var);
        this.f1744o.remove(q1Var);
        this.f1747r.remove(q1Var);
        this.f1745p.remove(q1Var);
        i();
    }

    @Override // g1.w0
    public final void e() {
        ArrayList arrayList = this.f1743n;
        ArrayList arrayList2 = this.f1741l;
        ArrayList arrayList3 = this.f1742m;
        ArrayList arrayList4 = this.f1740k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.f1739j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            n nVar = (n) arrayList7.get(size);
            View view = nVar.f1731a.f1768a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(nVar.f1731a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((q1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            q1 q1Var = (q1) arrayList5.get(size3);
            q1Var.f1768a.setAlpha(1.0f);
            c(q1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            m mVar = (m) arrayList4.get(size4);
            q1 q1Var2 = mVar.f1712a;
            if (q1Var2 != null) {
                k(mVar, q1Var2);
            }
            q1 q1Var3 = mVar.f1713b;
            if (q1Var3 != null) {
                k(mVar, q1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    n nVar2 = (n) arrayList8.get(size6);
                    View view2 = nVar2.f1731a.f1768a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(nVar2.f1731a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    q1 q1Var4 = (q1) arrayList9.get(size8);
                    q1Var4.f1768a.setAlpha(1.0f);
                    c(q1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    m mVar2 = (m) arrayList10.get(size10);
                    q1 q1Var5 = mVar2.f1712a;
                    if (q1Var5 != null) {
                        k(mVar2, q1Var5);
                    }
                    q1 q1Var6 = mVar2.f1713b;
                    if (q1Var6 != null) {
                        k(mVar2, q1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f1746q);
            h(this.f1745p);
            h(this.f1744o);
            h(this.f1747r);
            ArrayList arrayList11 = this.f1814b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g1.w0
    public final boolean f() {
        return (this.i.isEmpty() && this.f1740k.isEmpty() && this.f1739j.isEmpty() && this.h.isEmpty() && this.f1745p.isEmpty() && this.f1746q.isEmpty() && this.f1744o.isEmpty() && this.f1747r.isEmpty() && this.f1742m.isEmpty() && this.f1741l.isEmpty() && this.f1743n.isEmpty()) ? false : true;
    }

    public final boolean g(q1 q1Var, int i, int i4, int i5, int i6) {
        View view = q1Var.f1768a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) q1Var.f1768a.getTranslationY());
        l(q1Var);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            c(q1Var);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f1739j;
        n nVar = new n();
        nVar.f1731a = q1Var;
        nVar.f1732b = translationX;
        nVar.f1733c = translationY;
        nVar.d = i5;
        nVar.f1734e = i6;
        arrayList.add(nVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1814b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, q1 q1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m mVar = (m) arrayList.get(size);
            if (k(mVar, q1Var) && mVar.f1712a == null && mVar.f1713b == null) {
                arrayList.remove(mVar);
            }
        }
    }

    public final boolean k(m mVar, q1 q1Var) {
        if (mVar.f1713b == q1Var) {
            mVar.f1713b = null;
        } else {
            if (mVar.f1712a != q1Var) {
                return false;
            }
            mVar.f1712a = null;
        }
        View view = q1Var.f1768a;
        View view2 = q1Var.f1768a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(q1Var);
        return true;
    }

    public final void l(q1 q1Var) {
        if (f1737s == null) {
            f1737s = new ValueAnimator().getInterpolator();
        }
        q1Var.f1768a.animate().setInterpolator(f1737s);
        d(q1Var);
    }
}
