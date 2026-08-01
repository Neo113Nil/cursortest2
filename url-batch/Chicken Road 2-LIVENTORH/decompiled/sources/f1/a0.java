package f1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1295g;

    public /* synthetic */ a0(RecyclerView recyclerView, int i) {
        this.f1294f = i;
        this.f1295g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        int i = this.f1294f;
        RecyclerView recyclerView = this.f1295g;
        switch (i) {
            case 0:
                if (recyclerView.f699y && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f695w) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.B) {
                        recyclerView.m();
                        break;
                    } else {
                        recyclerView.A = true;
                        break;
                    }
                }
                break;
            default:
                i0 i0Var = recyclerView.P;
                if (i0Var != null) {
                    j jVar = (j) i0Var;
                    long j4 = jVar.d;
                    ArrayList arrayList = jVar.f1389h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f1390j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f1391k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            int i5 = i4 + 1;
                            b1 b1Var = (b1) obj;
                            View view = b1Var.f1309a;
                            ViewPropertyAnimator animate = view.animate();
                            jVar.f1397q.add(b1Var);
                            animate.setDuration(j4).alpha(0.0f).setListener(new e(jVar, b1Var, animate, view)).start();
                            i4 = i5;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z4 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            jVar.f1393m.add(arrayList5);
                            arrayList2.clear();
                            d dVar = new d(jVar, arrayList5, 0);
                            if (z4) {
                                dVar.run();
                            } else {
                                View view2 = ((i) arrayList5.get(0)).f1369a.f1309a;
                                WeakHashMap weakHashMap = n0.l0.f2757a;
                                view2.postOnAnimationDelayed(dVar, j4);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            jVar.f1394n.add(arrayList6);
                            arrayList3.clear();
                            d dVar2 = new d(jVar, arrayList6, 1);
                            if (z4) {
                                dVar2.run();
                            } else {
                                View view3 = ((h) arrayList6.get(0)).f1359a.f1309a;
                                WeakHashMap weakHashMap2 = n0.l0.f2757a;
                                view3.postOnAnimationDelayed(dVar2, j4);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            jVar.f1392l.add(arrayList7);
                            arrayList4.clear();
                            d dVar3 = new d(jVar, arrayList7, 2);
                            if (!z4 || !isEmpty2 || !isEmpty3) {
                                if (z4) {
                                    j4 = 0;
                                }
                                long max = Math.max(!isEmpty2 ? jVar.f1376e : 0L, isEmpty3 ? 0L : jVar.f1377f) + j4;
                                z3 = false;
                                View view4 = ((b1) arrayList7.get(0)).f1309a;
                                WeakHashMap weakHashMap3 = n0.l0.f2757a;
                                view4.postOnAnimationDelayed(dVar3, max);
                                recyclerView.f684q0 = z3;
                                break;
                            } else {
                                dVar3.run();
                            }
                        }
                    }
                }
                z3 = false;
                recyclerView.f684q0 = z3;
        }
    }
}
