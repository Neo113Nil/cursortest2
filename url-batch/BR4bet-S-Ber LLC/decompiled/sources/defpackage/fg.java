package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fg implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ lg h;

    public /* synthetic */ fg(lg lgVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = lgVar;
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
                    lg lgVar = this.h;
                    if (i2 >= size) {
                        arrayList.clear();
                        lgVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        kg kgVar = (kg) obj;
                        q20 q20Var = kgVar.a;
                        int i3 = kgVar.b;
                        int i4 = kgVar.c;
                        int i5 = kgVar.d;
                        int i6 = kgVar.e;
                        lgVar.getClass();
                        View view = q20Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        lgVar.p.add(q20Var);
                        animate.setDuration(lgVar.e).setListener(new hg(lgVar, q20Var, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    lg lgVar2 = this.h;
                    if (i2 >= size2) {
                        arrayList.clear();
                        lgVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        jg jgVar = (jg) obj2;
                        ArrayList arrayList2 = lgVar2.r;
                        long j = lgVar2.f;
                        q20 q20Var2 = jgVar.a;
                        View view2 = q20Var2 == null ? null : q20Var2.a;
                        q20 q20Var3 = jgVar.b;
                        View view3 = q20Var3 != null ? q20Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(jgVar.a);
                            duration.translationX(jgVar.e - jgVar.c);
                            duration.translationY(jgVar.f - jgVar.d);
                            duration.alpha(0.0f).setListener(new ig(lgVar2, jgVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(jgVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new ig(lgVar2, jgVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    lg lgVar3 = this.h;
                    if (i2 >= size3) {
                        arrayList.clear();
                        lgVar3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        q20 q20Var4 = (q20) obj3;
                        lgVar3.getClass();
                        View view4 = q20Var4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        lgVar3.o.add(q20Var4);
                        animate3.alpha(1.0f).setDuration(lgVar3.c).setListener(new gg(lgVar3, q20Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
