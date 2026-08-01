package g1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1689g;
    public final /* synthetic */ o h;

    public /* synthetic */ i(o oVar, ArrayList arrayList, int i) {
        this.f1688f = i;
        this.h = oVar;
        this.f1689g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1688f) {
            case 0:
                ArrayList arrayList = this.f1689g;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    o oVar = this.h;
                    if (i >= size) {
                        arrayList.clear();
                        oVar.f1742m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        n nVar = (n) obj;
                        q1 q1Var = nVar.f1731a;
                        int i4 = nVar.f1732b;
                        int i5 = nVar.f1733c;
                        int i6 = nVar.d;
                        int i7 = nVar.f1734e;
                        oVar.getClass();
                        View view = q1Var.f1768a;
                        int i8 = i6 - i4;
                        int i9 = i7 - i5;
                        if (i8 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i9 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        oVar.f1745p.add(q1Var);
                        animate.setDuration(oVar.f1816e).setListener(new k(oVar, q1Var, i8, view, i9, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f1689g;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    o oVar2 = this.h;
                    if (i10 >= size2) {
                        arrayList2.clear();
                        oVar2.f1743n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        m mVar = (m) obj2;
                        ArrayList arrayList3 = oVar2.f1747r;
                        long j2 = oVar2.f1817f;
                        q1 q1Var2 = mVar.f1712a;
                        View view2 = q1Var2 == null ? null : q1Var2.f1768a;
                        q1 q1Var3 = mVar.f1713b;
                        View view3 = q1Var3 != null ? q1Var3.f1768a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(mVar.f1712a);
                            duration.translationX(mVar.f1715e - mVar.f1714c);
                            duration.translationY(mVar.f1716f - mVar.d);
                            duration.alpha(0.0f).setListener(new l(oVar2, mVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(mVar.f1713b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new l(oVar2, mVar, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f1689g;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    o oVar3 = this.h;
                    if (i11 >= size3) {
                        arrayList4.clear();
                        oVar3.f1741l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        q1 q1Var4 = (q1) obj3;
                        oVar3.getClass();
                        View view4 = q1Var4.f1768a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        oVar3.f1744o.add(q1Var4);
                        animate3.alpha(1.0f).setDuration(oVar3.f1815c).setListener(new j(oVar3, q1Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
