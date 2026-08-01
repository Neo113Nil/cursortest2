package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ny implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ ny(RecyclerView recyclerView, int i) {
        this.f = i;
        this.g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f;
        RecyclerView recyclerView = this.g;
        switch (i) {
            case 0:
                if (recyclerView.y && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.w) {
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
                ty tyVar = recyclerView.Q;
                if (tyVar != null) {
                    re reVar = (re) tyVar;
                    long j = reVar.d;
                    ArrayList arrayList = reVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = reVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = reVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = reVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            nz nzVar = (nz) obj;
                            View view = nzVar.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            reVar.q.add(nzVar);
                            animate.setDuration(j).alpha(0.0f).setListener(new me(reVar, nzVar, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            reVar.m.add(arrayList6);
                            arrayList2.clear();
                            le leVar = new le(reVar, arrayList6, 0);
                            if (z2) {
                                leVar.run();
                            } else {
                                View view2 = ((qe) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = x80.a;
                                view2.postOnAnimationDelayed(leVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            reVar.n.add(arrayList7);
                            arrayList3.clear();
                            le leVar2 = new le(reVar, arrayList7, 1);
                            if (z2) {
                                leVar2.run();
                            } else {
                                View view3 = ((pe) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = x80.a;
                                view3.postOnAnimationDelayed(leVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            reVar.l.add(arrayList8);
                            arrayList4.clear();
                            le leVar3 = new le(reVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? reVar.e : 0L, isEmpty3 ? 0L : reVar.f) + j;
                                z = false;
                                View view4 = ((nz) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = x80.a;
                                view4.postOnAnimationDelayed(leVar3, max);
                                recyclerView.r0 = z;
                                break;
                            } else {
                                leVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.r0 = z;
        }
    }
}
