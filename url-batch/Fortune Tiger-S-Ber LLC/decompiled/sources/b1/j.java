package b1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f805s;
    public boolean g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f806i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f807j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f808k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f809l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f810m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f811n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f812o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f813p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f814q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f815r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c1) arrayList.get(size)).f747a.animate().cancel();
        }
    }

    @Override // b1.j0
    public final boolean a(c1 c1Var, c1 c1Var2, i0 i0Var, i0 i0Var2) {
        int i4;
        int i5;
        int i6 = i0Var.f801a;
        int i7 = i0Var.f802b;
        if (c1Var2.o()) {
            int i8 = i0Var.f801a;
            i5 = i0Var.f802b;
            i4 = i8;
        } else {
            i4 = i0Var2.f801a;
            i5 = i0Var2.f802b;
        }
        if (c1Var == c1Var2) {
            return g(c1Var, i6, i7, i4, i5);
        }
        View view = c1Var.f747a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f747a;
        l(c1Var2);
        view2.setTranslationX(-((int) ((i4 - i6) - translationX)));
        view2.setTranslationY(-((int) ((i5 - i7) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f808k;
        h hVar = new h();
        hVar.f791a = c1Var;
        hVar.f792b = c1Var2;
        hVar.c = i6;
        hVar.f793d = i7;
        hVar.f794e = i4;
        hVar.f795f = i5;
        arrayList.add(hVar);
        return true;
    }

    @Override // b1.j0
    public final void d(c1 c1Var) {
        ArrayList arrayList = this.f809l;
        ArrayList arrayList2 = this.f810m;
        ArrayList arrayList3 = this.f811n;
        View view = c1Var.f747a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f807j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i) arrayList4.get(size)).f797a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f808k, c1Var);
        if (this.h.remove(c1Var)) {
            view.setAlpha(1.0f);
            c(c1Var);
        }
        if (this.f806i.remove(c1Var)) {
            view.setAlpha(1.0f);
            c(c1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, c1Var);
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
                if (((i) arrayList6.get(size4)).f797a == c1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c1Var);
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
            if (arrayList7.remove(c1Var)) {
                view.setAlpha(1.0f);
                c(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f814q.remove(c1Var);
        this.f812o.remove(c1Var);
        this.f815r.remove(c1Var);
        this.f813p.remove(c1Var);
        i();
    }

    @Override // b1.j0
    public final void e() {
        ArrayList arrayList = this.f811n;
        ArrayList arrayList2 = this.f809l;
        ArrayList arrayList3 = this.f810m;
        ArrayList arrayList4 = this.f808k;
        ArrayList arrayList5 = this.f806i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.f807j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList7.get(size);
            View view = iVar.f797a.f747a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f797a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((c1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c1 c1Var = (c1) arrayList5.get(size3);
            c1Var.f747a.setAlpha(1.0f);
            c(c1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            h hVar = (h) arrayList4.get(size4);
            c1 c1Var2 = hVar.f791a;
            if (c1Var2 != null) {
                k(hVar, c1Var2);
            }
            c1 c1Var3 = hVar.f792b;
            if (c1Var3 != null) {
                k(hVar, c1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = (i) arrayList8.get(size6);
                    View view2 = iVar2.f797a.f747a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(iVar2.f797a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    c1 c1Var4 = (c1) arrayList9.get(size8);
                    c1Var4.f747a.setAlpha(1.0f);
                    c(c1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    h hVar2 = (h) arrayList10.get(size10);
                    c1 c1Var5 = hVar2.f791a;
                    if (c1Var5 != null) {
                        k(hVar2, c1Var5);
                    }
                    c1 c1Var6 = hVar2.f792b;
                    if (c1Var6 != null) {
                        k(hVar2, c1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f814q);
            h(this.f813p);
            h(this.f812o);
            h(this.f815r);
            ArrayList arrayList11 = this.f817b;
            if (arrayList11.size() > 0) {
                throw androidx.fragment.app.w0.d(arrayList11, 0);
            }
            arrayList11.clear();
        }
    }

    @Override // b1.j0
    public final boolean f() {
        return (this.f806i.isEmpty() && this.f808k.isEmpty() && this.f807j.isEmpty() && this.h.isEmpty() && this.f813p.isEmpty() && this.f814q.isEmpty() && this.f812o.isEmpty() && this.f815r.isEmpty() && this.f810m.isEmpty() && this.f809l.isEmpty() && this.f811n.isEmpty()) ? false : true;
    }

    public final boolean g(c1 c1Var, int i4, int i5, int i6, int i7) {
        View view = c1Var.f747a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) c1Var.f747a.getTranslationY());
        l(c1Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(c1Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f807j;
        i iVar = new i();
        iVar.f797a = c1Var;
        iVar.f798b = translationX;
        iVar.c = translationY;
        iVar.f799d = i6;
        iVar.f800e = i7;
        arrayList.add(iVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f817b;
        if (arrayList.size() > 0) {
            throw androidx.fragment.app.w0.d(arrayList, 0);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (k(hVar, c1Var) && hVar.f791a == null && hVar.f792b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final boolean k(h hVar, c1 c1Var) {
        if (hVar.f792b == c1Var) {
            hVar.f792b = null;
        } else {
            if (hVar.f791a != c1Var) {
                return false;
            }
            hVar.f791a = null;
        }
        View view = c1Var.f747a;
        View view2 = c1Var.f747a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(c1Var);
        return true;
    }

    public final void l(c1 c1Var) {
        if (f805s == null) {
            f805s = new ValueAnimator().getInterpolator();
        }
        c1Var.f747a.animate().setInterpolator(f805s);
        d(c1Var);
    }
}
