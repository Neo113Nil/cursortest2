package f1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends i0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1387s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1388g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1389h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1390j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1391k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1392l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1393m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1394n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1395o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1396p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1397q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1398r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b1) arrayList.get(size)).f1309a.animate().cancel();
        }
    }

    @Override // f1.i0
    public final boolean a(b1 b1Var, b1 b1Var2, h0 h0Var, h0 h0Var2) {
        int i;
        int i4;
        int i5 = h0Var.f1364a;
        int i6 = h0Var.f1365b;
        if (b1Var2.o()) {
            int i7 = h0Var.f1364a;
            i4 = h0Var.f1365b;
            i = i7;
        } else {
            i = h0Var2.f1364a;
            i4 = h0Var2.f1365b;
        }
        if (b1Var == b1Var2) {
            return g(b1Var, i5, i6, i, i4);
        }
        View view = b1Var.f1309a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(b1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b1Var2.f1309a;
        l(b1Var2);
        view2.setTranslationX(-((int) ((i - i5) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i6) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f1391k;
        h hVar = new h();
        hVar.f1359a = b1Var;
        hVar.f1360b = b1Var2;
        hVar.f1361c = i5;
        hVar.d = i6;
        hVar.f1362e = i;
        hVar.f1363f = i4;
        arrayList.add(hVar);
        return true;
    }

    @Override // f1.i0
    public final void d(b1 b1Var) {
        ArrayList arrayList = this.f1392l;
        ArrayList arrayList2 = this.f1393m;
        ArrayList arrayList3 = this.f1394n;
        View view = b1Var.f1309a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f1390j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i) arrayList4.get(size)).f1369a == b1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f1391k, b1Var);
        if (this.f1389h.remove(b1Var)) {
            view.setAlpha(1.0f);
            c(b1Var);
        }
        if (this.i.remove(b1Var)) {
            view.setAlpha(1.0f);
            c(b1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, b1Var);
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
                if (((i) arrayList6.get(size4)).f1369a == b1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b1Var);
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
            if (arrayList7.remove(b1Var)) {
                view.setAlpha(1.0f);
                c(b1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f1397q.remove(b1Var);
        this.f1395o.remove(b1Var);
        this.f1398r.remove(b1Var);
        this.f1396p.remove(b1Var);
        i();
    }

    @Override // f1.i0
    public final void e() {
        ArrayList arrayList = this.f1394n;
        ArrayList arrayList2 = this.f1392l;
        ArrayList arrayList3 = this.f1393m;
        ArrayList arrayList4 = this.f1391k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f1389h;
        ArrayList arrayList7 = this.f1390j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList7.get(size);
            View view = iVar.f1369a.f1309a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f1369a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((b1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b1 b1Var = (b1) arrayList5.get(size3);
            b1Var.f1309a.setAlpha(1.0f);
            c(b1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            h hVar = (h) arrayList4.get(size4);
            b1 b1Var2 = hVar.f1359a;
            if (b1Var2 != null) {
                k(hVar, b1Var2);
            }
            b1 b1Var3 = hVar.f1360b;
            if (b1Var3 != null) {
                k(hVar, b1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = (i) arrayList8.get(size6);
                    View view2 = iVar2.f1369a.f1309a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(iVar2.f1369a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    b1 b1Var4 = (b1) arrayList9.get(size8);
                    b1Var4.f1309a.setAlpha(1.0f);
                    c(b1Var4);
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
                    b1 b1Var5 = hVar2.f1359a;
                    if (b1Var5 != null) {
                        k(hVar2, b1Var5);
                    }
                    b1 b1Var6 = hVar2.f1360b;
                    if (b1Var6 != null) {
                        k(hVar2, b1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f1397q);
            h(this.f1396p);
            h(this.f1395o);
            h(this.f1398r);
            ArrayList arrayList11 = this.f1374b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // f1.i0
    public final boolean f() {
        return (this.i.isEmpty() && this.f1391k.isEmpty() && this.f1390j.isEmpty() && this.f1389h.isEmpty() && this.f1396p.isEmpty() && this.f1397q.isEmpty() && this.f1395o.isEmpty() && this.f1398r.isEmpty() && this.f1393m.isEmpty() && this.f1392l.isEmpty() && this.f1394n.isEmpty()) ? false : true;
    }

    public final boolean g(b1 b1Var, int i, int i4, int i5, int i6) {
        View view = b1Var.f1309a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) b1Var.f1309a.getTranslationY());
        l(b1Var);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            c(b1Var);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f1390j;
        i iVar = new i();
        iVar.f1369a = b1Var;
        iVar.f1370b = translationX;
        iVar.f1371c = translationY;
        iVar.d = i5;
        iVar.f1372e = i6;
        arrayList.add(iVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1374b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, b1 b1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (k(hVar, b1Var) && hVar.f1359a == null && hVar.f1360b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final boolean k(h hVar, b1 b1Var) {
        if (hVar.f1360b == b1Var) {
            hVar.f1360b = null;
        } else {
            if (hVar.f1359a != b1Var) {
                return false;
            }
            hVar.f1359a = null;
        }
        View view = b1Var.f1309a;
        View view2 = b1Var.f1309a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(b1Var);
        return true;
    }

    public final void l(b1 b1Var) {
        if (f1387s == null) {
            f1387s = new ValueAnimator().getInterpolator();
        }
        b1Var.f1309a.animate().setInterpolator(f1387s);
        d(b1Var);
    }
}
