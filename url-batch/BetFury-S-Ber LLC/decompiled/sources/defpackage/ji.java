package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ji implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ pi h;

    public /* synthetic */ ji(pi piVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = piVar;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.f;
        int i2 = 0;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    pi piVar = this.h;
                    if (i2 >= size) {
                        arrayList.clear();
                        piVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        oi oiVar = (oi) obj;
                        x80 x80Var = oiVar.a;
                        int i3 = oiVar.b;
                        int i4 = oiVar.c;
                        int i5 = oiVar.d;
                        int i6 = oiVar.e;
                        piVar.getClass();
                        View view = x80Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        piVar.p.add(x80Var);
                        animate.setDuration(piVar.e).setListener(new li(piVar, x80Var, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    pi piVar2 = this.h;
                    if (i2 >= size2) {
                        arrayList.clear();
                        piVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        ni niVar = (ni) obj2;
                        ArrayList arrayList2 = piVar2.r;
                        long j = piVar2.f;
                        x80 x80Var2 = niVar.a;
                        View view2 = x80Var2 == null ? null : x80Var2.a;
                        x80 x80Var3 = niVar.b;
                        View view3 = x80Var3 != null ? x80Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(niVar.a);
                            duration.translationX(niVar.e - niVar.c);
                            duration.translationY(niVar.f - niVar.d);
                            duration.alpha(0.0f).setListener(new mi(piVar2, niVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(niVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new mi(piVar2, niVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    pi piVar3 = this.h;
                    if (i2 >= size3) {
                        arrayList.clear();
                        piVar3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        x80 x80Var4 = (x80) obj3;
                        piVar3.getClass();
                        View view4 = x80Var4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        piVar3.o.add(x80Var4);
                        animate3.alpha(1.0f).setDuration(piVar3.c).setListener(new ki(piVar3, x80Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
