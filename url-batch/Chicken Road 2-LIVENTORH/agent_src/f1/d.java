package f1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f1332h;

    public /* synthetic */ d(j jVar, ArrayList arrayList, int i) {
        this.f1330f = i;
        this.f1332h = jVar;
        this.f1331g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1330f) {
            case 0:
                ArrayList arrayList = this.f1331g;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    j jVar = this.f1332h;
                    if (i >= size) {
                        arrayList.clear();
                        jVar.f1393m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        i iVar = (i) obj;
                        b1 b1Var = iVar.f1369a;
                        int i4 = iVar.f1370b;
                        int i5 = iVar.f1371c;
                        int i6 = iVar.d;
                        int i7 = iVar.f1372e;
                        jVar.getClass();
                        View view = b1Var.f1309a;
                        int i8 = i6 - i4;
                        int i9 = i7 - i5;
                        if (i8 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i9 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        jVar.f1396p.add(b1Var);
                        animate.setDuration(jVar.f1376e).setListener(new f(jVar, b1Var, i8, view, i9, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f1331g;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    j jVar2 = this.f1332h;
                    if (i10 >= size2) {
                        arrayList2.clear();
                        jVar2.f1394n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        h hVar = (h) obj2;
                        ArrayList arrayList3 = jVar2.f1398r;
                        long j4 = jVar2.f1377f;
                        b1 b1Var2 = hVar.f1359a;
                        View view2 = b1Var2 == null ? null : b1Var2.f1309a;
                        b1 b1Var3 = hVar.f1360b;
                        View view3 = b1Var3 != null ? b1Var3.f1309a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                            arrayList3.add(hVar.f1359a);
                            duration.translationX(hVar.f1362e - hVar.f1361c);
                            duration.translationY(hVar.f1363f - hVar.d);
                            duration.alpha(0.0f).setListener(new g(jVar2, hVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(hVar.f1360b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new g(jVar2, hVar, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f1331g;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    j jVar3 = this.f1332h;
                    if (i11 >= size3) {
                        arrayList4.clear();
                        jVar3.f1392l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        b1 b1Var4 = (b1) obj3;
                        jVar3.getClass();
                        View view4 = b1Var4.f1309a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        jVar3.f1395o.add(b1Var4);
                        animate3.alpha(1.0f).setDuration(jVar3.f1375c).setListener(new e(jVar3, b1Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
