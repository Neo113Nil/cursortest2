package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v70 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ v70(RecyclerView recyclerView, int i) {
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
                d80 d80Var = recyclerView.Q;
                if (d80Var != null) {
                    pi piVar = (pi) d80Var;
                    long j = piVar.d;
                    ArrayList arrayList = piVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = piVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = piVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = piVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            x80 x80Var = (x80) obj;
                            View view = x80Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            piVar.q.add(x80Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new ki(piVar, x80Var, animate, view)).start();
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
                            piVar.m.add(arrayList6);
                            arrayList2.clear();
                            ji jiVar = new ji(piVar, arrayList6, 0);
                            if (z2) {
                                jiVar.run();
                            } else {
                                View view2 = ((oi) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = hm0.a;
                                view2.postOnAnimationDelayed(jiVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            piVar.n.add(arrayList7);
                            arrayList3.clear();
                            ji jiVar2 = new ji(piVar, arrayList7, 1);
                            if (z2) {
                                jiVar2.run();
                            } else {
                                View view3 = ((ni) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = hm0.a;
                                view3.postOnAnimationDelayed(jiVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            piVar.l.add(arrayList8);
                            arrayList4.clear();
                            ji jiVar3 = new ji(piVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? piVar.e : 0L, isEmpty3 ? 0L : piVar.f) + j;
                                z = false;
                                View view4 = ((x80) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = hm0.a;
                                view4.postOnAnimationDelayed(jiVar3, max);
                                recyclerView.r0 = z;
                                break;
                            } else {
                                jiVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.r0 = z;
        }
    }
}
