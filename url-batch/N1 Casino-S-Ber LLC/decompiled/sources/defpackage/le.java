package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class le implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ re h;

    public /* synthetic */ le(re reVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = reVar;
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
                    re reVar = this.h;
                    if (i2 >= size) {
                        arrayList.clear();
                        reVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        qe qeVar = (qe) obj;
                        nz nzVar = qeVar.a;
                        int i3 = qeVar.b;
                        int i4 = qeVar.c;
                        int i5 = qeVar.d;
                        int i6 = qeVar.e;
                        reVar.getClass();
                        View view = nzVar.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        reVar.p.add(nzVar);
                        animate.setDuration(reVar.e).setListener(new ne(reVar, nzVar, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    re reVar2 = this.h;
                    if (i2 >= size2) {
                        arrayList.clear();
                        reVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        pe peVar = (pe) obj2;
                        ArrayList arrayList2 = reVar2.r;
                        long j = reVar2.f;
                        nz nzVar2 = peVar.a;
                        View view2 = nzVar2 == null ? null : nzVar2.a;
                        nz nzVar3 = peVar.b;
                        View view3 = nzVar3 != null ? nzVar3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(peVar.a);
                            duration.translationX(peVar.e - peVar.c);
                            duration.translationY(peVar.f - peVar.d);
                            duration.alpha(0.0f).setListener(new oe(reVar2, peVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(peVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new oe(reVar2, peVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    re reVar3 = this.h;
                    if (i2 >= size3) {
                        arrayList.clear();
                        reVar3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        nz nzVar4 = (nz) obj3;
                        reVar3.getClass();
                        View view4 = nzVar4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        reVar3.o.add(nzVar4);
                        animate3.alpha(1.0f).setDuration(reVar3.c).setListener(new me(reVar3, nzVar4, view4, animate3)).start();
                    }
                }
        }
    }
}
