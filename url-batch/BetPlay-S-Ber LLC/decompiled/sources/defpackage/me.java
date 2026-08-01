package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class me implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ se h;

    public /* synthetic */ me(se seVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = seVar;
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
                    se seVar = this.h;
                    if (i2 >= size) {
                        arrayList.clear();
                        seVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        re reVar = (re) obj;
                        c00 c00Var = reVar.a;
                        int i3 = reVar.b;
                        int i4 = reVar.c;
                        int i5 = reVar.d;
                        int i6 = reVar.e;
                        seVar.getClass();
                        View view = c00Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        seVar.p.add(c00Var);
                        animate.setDuration(seVar.e).setListener(new oe(seVar, c00Var, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    se seVar2 = this.h;
                    if (i2 >= size2) {
                        arrayList.clear();
                        seVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        qe qeVar = (qe) obj2;
                        ArrayList arrayList2 = seVar2.r;
                        long j = seVar2.f;
                        c00 c00Var2 = qeVar.a;
                        View view2 = c00Var2 == null ? null : c00Var2.a;
                        c00 c00Var3 = qeVar.b;
                        View view3 = c00Var3 != null ? c00Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(qeVar.a);
                            duration.translationX(qeVar.e - qeVar.c);
                            duration.translationY(qeVar.f - qeVar.d);
                            duration.alpha(0.0f).setListener(new pe(seVar2, qeVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(qeVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new pe(seVar2, qeVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    se seVar3 = this.h;
                    if (i2 >= size3) {
                        arrayList.clear();
                        seVar3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        c00 c00Var4 = (c00) obj3;
                        seVar3.getClass();
                        View view4 = c00Var4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        seVar3.o.add(c00Var4);
                        animate3.alpha(1.0f).setDuration(seVar3.c).setListener(new ne(seVar3, c00Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
