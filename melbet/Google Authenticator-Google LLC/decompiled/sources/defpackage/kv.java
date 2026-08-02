package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kv {
    private static TimeInterpolator o;
    boolean a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public kee m;
    private final ArrayList n;

    public kv(byte[] bArr) {
        this.m = null;
        this.n = new ArrayList();
        this.a = true;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public static void i(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((lp) list.get(size)).a.animate().cancel();
            }
        }
    }

    public static void k(lp lpVar) {
        int i = lpVar.j;
        if (!lpVar.s() && (i & 4) == 0) {
            int i2 = lpVar.d;
            lpVar.a();
        }
    }

    public static final xp l(lp lpVar) {
        xp xpVar = new xp();
        xpVar.d(lpVar);
        return xpVar;
    }

    private final void n(List list, lp lpVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            jh jhVar = (jh) list.get(size);
            if (p(jhVar, lpVar) && jhVar.a == null && jhVar.b == null) {
                list.remove(jhVar);
            }
        }
    }

    private final void o(jh jhVar) {
        lp lpVar = jhVar.a;
        if (lpVar != null) {
            p(jhVar, lpVar);
        }
        lp lpVar2 = jhVar.b;
        if (lpVar2 != null) {
            p(jhVar, lpVar2);
        }
    }

    private final boolean p(jh jhVar, lp lpVar) {
        if (jhVar.b == lpVar) {
            jhVar.b = null;
        } else {
            if (jhVar.a != lpVar) {
                return false;
            }
            jhVar.a = null;
        }
        View view = lpVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        a(lpVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lp lpVar) {
        kee keeVar = this.m;
        if (keeVar != null) {
            boolean z = true;
            lpVar.m(true);
            if (lpVar.h != null && lpVar.i == null) {
                lpVar.h = null;
            }
            lpVar.i = null;
            if ((lpVar.j & 16) != 0) {
                return;
            }
            View view = lpVar.a;
            RecyclerView recyclerView = (RecyclerView) keeVar.a;
            recyclerView.ab();
            ja jaVar = recyclerView.h;
            int i = jaVar.c;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    jaVar.c = 2;
                    kee keeVar2 = jaVar.e;
                    int C = keeVar2.C(view);
                    if (C == -1) {
                        jaVar.l(view);
                    } else {
                        iz izVar = jaVar.a;
                        if (izVar.f(C)) {
                            izVar.g(C);
                            jaVar.l(view);
                            keeVar2.F(C);
                        }
                    }
                    if (z) {
                        lp h = RecyclerView.h(view);
                        le leVar = recyclerView.e;
                        leVar.l(h);
                        leVar.j(h);
                    }
                    recyclerView.ac(!z);
                    if (z && lpVar.w()) {
                        ((RecyclerView) keeVar.a).removeDetachedView(lpVar.a, false);
                        return;
                    }
                } finally {
                    jaVar.c = 0;
                }
            }
            if (jaVar.d != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z = false;
            if (z) {
            }
            recyclerView.ac(!z);
            if (z) {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ku) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public final void c() {
        if (h()) {
            return;
        }
        b();
    }

    public final void d(lp lpVar) {
        View view = lpVar.a;
        view.animate().cancel();
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ji) this.d.get(size)).a == lpVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(lpVar);
                this.d.remove(size);
            }
        }
        n(this.e, lpVar);
        if (this.b.remove(lpVar)) {
            view.setAlpha(1.0f);
            a(lpVar);
        }
        if (this.c.remove(lpVar)) {
            view.setAlpha(1.0f);
            a(lpVar);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.h.get(size2);
            n(arrayList, lpVar);
            if (arrayList.isEmpty()) {
                this.h.remove(size2);
            }
        }
        int size3 = this.g.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.g.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ji) arrayList2.get(size4)).a == lpVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(lpVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.g.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.k.remove(lpVar);
                this.i.remove(lpVar);
                this.l.remove(lpVar);
                this.j.remove(lpVar);
                c();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f.get(size5);
            if (arrayList3.remove(lpVar)) {
                view.setAlpha(1.0f);
                a(lpVar);
                if (arrayList3.isEmpty()) {
                    this.f.remove(size5);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList;
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lp lpVar = ((ji) this.d.get(size)).a;
            View view = lpVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(lpVar);
            this.d.remove(size);
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((lp) this.b.get(size2));
            this.b.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            lp lpVar2 = (lp) this.c.get(size3);
            lpVar2.a.setAlpha(1.0f);
            a(lpVar2);
            this.c.remove(size3);
        }
        int size4 = this.e.size();
        while (true) {
            size4--;
            arrayList = this.e;
            if (size4 < 0) {
                break;
            } else {
                o((jh) arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (!h()) {
            return;
        }
        int size5 = this.g.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.g.get(size5);
            int size6 = arrayList2.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    lp lpVar3 = ((ji) arrayList2.get(size6)).a;
                    View view2 = lpVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    a(lpVar3);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.g.remove(arrayList2);
                    }
                }
            }
        }
        int size7 = this.f.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) this.f.get(size7);
            int size8 = arrayList3.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    lp lpVar4 = (lp) arrayList3.get(size8);
                    lpVar4.a.setAlpha(1.0f);
                    a(lpVar4);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.f.remove(arrayList3);
                    }
                }
            }
        }
        int size9 = this.h.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                i(this.k);
                i(this.j);
                i(this.i);
                i(this.l);
                b();
                return;
            }
            ArrayList arrayList4 = (ArrayList) this.h.get(size9);
            int size10 = arrayList4.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    o((jh) arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.h.remove(arrayList4);
                    }
                }
            }
        }
    }

    public final void f(lp lpVar) {
        if (o == null) {
            o = new ValueAnimator().getInterpolator();
        }
        lpVar.a.animate().setInterpolator(o);
        d(lpVar);
    }

    public final boolean g(lp lpVar, int i, int i2, int i3, int i4) {
        View view = lpVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        f(lpVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                a(lpVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.d.add(new ji(lpVar, i5, i7, i3, i4));
        return true;
    }

    public final boolean h() {
        return (this.c.isEmpty() && this.e.isEmpty() && this.d.isEmpty() && this.b.isEmpty() && this.j.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.f.isEmpty() && this.h.isEmpty()) ? false : true;
    }

    public final void j() {
        this.a = false;
    }

    public final boolean m(lp lpVar, lp lpVar2, xp xpVar, xp xpVar2) {
        int i;
        int i2;
        int i3 = xpVar.b;
        int i4 = xpVar.a;
        if (lpVar2.z()) {
            int i5 = xpVar.b;
            i2 = xpVar.a;
            i = i5;
        } else {
            i = xpVar2.b;
            i2 = xpVar2.a;
        }
        if (lpVar == lpVar2) {
            return g(lpVar, i3, i4, i, i2);
        }
        View view = lpVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        f(lpVar);
        float f = (i - i3) - translationX;
        float f2 = (i2 - i4) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (lpVar2 != null) {
            f(lpVar2);
            View view2 = lpVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.e.add(new jh(lpVar, lpVar2, i3, i4, i, i2));
        return true;
    }

    public kv() {
        this.m = null;
        this.n = new ArrayList();
    }
}
