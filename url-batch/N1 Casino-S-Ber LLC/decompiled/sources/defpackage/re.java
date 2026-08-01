package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class re extends ty {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((nz) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.ty
    public final boolean a(nz nzVar, nz nzVar2, ev evVar, ev evVar2) {
        int i;
        int i2;
        int i3 = evVar.a;
        int i4 = evVar.b;
        if (nzVar2.p()) {
            int i5 = evVar.a;
            i2 = evVar.b;
            i = i5;
        } else {
            i = evVar2.a;
            i2 = evVar2.b;
        }
        if (nzVar == nzVar2) {
            return g(nzVar, i3, i4, i, i2);
        }
        View view = nzVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(nzVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = nzVar2.a;
        l(nzVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        pe peVar = new pe();
        peVar.a = nzVar;
        peVar.b = nzVar2;
        peVar.c = i3;
        peVar.d = i4;
        peVar.e = i;
        peVar.f = i2;
        arrayList.add(peVar);
        return true;
    }

    @Override // defpackage.ty
    public final void d(nz nzVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = nzVar.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((qe) arrayList4.get(size)).a == nzVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(nzVar);
                arrayList4.remove(size);
            }
        }
        j(this.k, nzVar);
        if (this.h.remove(nzVar)) {
            view.setAlpha(1.0f);
            c(nzVar);
        }
        if (this.i.remove(nzVar)) {
            view.setAlpha(1.0f);
            c(nzVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, nzVar);
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
                if (((qe) arrayList6.get(size4)).a == nzVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(nzVar);
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
            if (arrayList7.remove(nzVar)) {
                view.setAlpha(1.0f);
                c(nzVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(nzVar);
        this.o.remove(nzVar);
        this.r.remove(nzVar);
        this.p.remove(nzVar);
        i();
    }

    @Override // defpackage.ty
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qe qeVar = (qe) arrayList7.get(size);
            View view = qeVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(qeVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((nz) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            nz nzVar = (nz) arrayList5.get(size3);
            nzVar.a.setAlpha(1.0f);
            c(nzVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            pe peVar = (pe) arrayList.get(size4);
            nz nzVar2 = peVar.a;
            if (nzVar2 != null) {
                k(peVar, nzVar2);
            }
            nz nzVar3 = peVar.b;
            if (nzVar3 != null) {
                k(peVar, nzVar3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    qe qeVar2 = (qe) arrayList8.get(size6);
                    View view2 = qeVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(qeVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    nz nzVar4 = (nz) arrayList9.get(size8);
                    nzVar4.a.setAlpha(1.0f);
                    c(nzVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    pe peVar2 = (pe) arrayList10.get(size10);
                    nz nzVar5 = peVar2.a;
                    if (nzVar5 != null) {
                        k(peVar2, nzVar5);
                    }
                    nz nzVar6 = peVar2.b;
                    if (nzVar6 != null) {
                        k(peVar2, nzVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                t8.c();
            }
        }
    }

    @Override // defpackage.ty
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(nz nzVar, int i, int i2, int i3, int i4) {
        View view = nzVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) nzVar.a.getTranslationY());
        l(nzVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(nzVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        qe qeVar = new qe();
        qeVar.a = nzVar;
        qeVar.b = translationX;
        qeVar.c = translationY;
        qeVar.d = i3;
        qeVar.e = i4;
        arrayList.add(qeVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            t8.c();
        }
    }

    public final void j(ArrayList arrayList, nz nzVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pe peVar = (pe) arrayList.get(size);
            if (k(peVar, nzVar) && peVar.a == null && peVar.b == null) {
                arrayList.remove(peVar);
            }
        }
    }

    public final boolean k(pe peVar, nz nzVar) {
        if (peVar.b == nzVar) {
            peVar.b = null;
        } else {
            if (peVar.a != nzVar) {
                return false;
            }
            peVar.a = null;
        }
        View view = nzVar.a;
        View view2 = nzVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(nzVar);
        return true;
    }

    public final void l(nz nzVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        nzVar.a.animate().setInterpolator(s);
        d(nzVar);
    }
}
