package b1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f763f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ j h;

    public /* synthetic */ d(j jVar, ArrayList arrayList, int i4) {
        this.f763f = i4;
        this.h = jVar;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f763f) {
            case 0:
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    j jVar = this.h;
                    if (i4 >= size) {
                        arrayList.clear();
                        jVar.f810m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i4);
                        i4++;
                        i iVar = (i) obj;
                        c1 c1Var = iVar.f797a;
                        int i5 = iVar.f798b;
                        int i6 = iVar.c;
                        int i7 = iVar.f799d;
                        int i8 = iVar.f800e;
                        jVar.getClass();
                        View view = c1Var.f747a;
                        int i9 = i7 - i5;
                        int i10 = i8 - i6;
                        if (i9 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i10 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        jVar.f813p.add(c1Var);
                        animate.setDuration(jVar.f819e).setListener(new f(jVar, c1Var, i9, view, i10, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    j jVar2 = this.h;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        jVar2.f811n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        h hVar = (h) obj2;
                        ArrayList arrayList3 = jVar2.f815r;
                        long j4 = jVar2.f820f;
                        c1 c1Var2 = hVar.f791a;
                        View view2 = c1Var2 == null ? null : c1Var2.f747a;
                        c1 c1Var3 = hVar.f792b;
                        View view3 = c1Var3 != null ? c1Var3.f747a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                            arrayList3.add(hVar.f791a);
                            duration.translationX(hVar.f794e - hVar.c);
                            duration.translationY(hVar.f795f - hVar.f793d);
                            duration.alpha(0.0f).setListener(new g(jVar2, hVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(hVar.f792b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new g(jVar2, hVar, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.g;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    j jVar3 = this.h;
                    if (i12 >= size3) {
                        arrayList4.clear();
                        jVar3.f809l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i12);
                        i12++;
                        c1 c1Var4 = (c1) obj3;
                        jVar3.getClass();
                        View view4 = c1Var4.f747a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        jVar3.f812o.add(c1Var4);
                        animate3.alpha(1.0f).setDuration(jVar3.c).setListener(new e(jVar3, c1Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
