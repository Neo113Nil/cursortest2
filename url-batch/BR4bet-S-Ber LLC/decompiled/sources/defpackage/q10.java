package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class q10 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ q10(RecyclerView recyclerView, int i) {
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
                x10 x10Var = recyclerView.P;
                if (x10Var != null) {
                    lg lgVar = (lg) x10Var;
                    long j = lgVar.d;
                    ArrayList arrayList = lgVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = lgVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = lgVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = lgVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            q20 q20Var = (q20) obj;
                            View view = q20Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            lgVar.q.add(q20Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new gg(lgVar, q20Var, animate, view)).start();
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
                            lgVar.m.add(arrayList6);
                            arrayList2.clear();
                            fg fgVar = new fg(lgVar, arrayList6, 0);
                            if (z2) {
                                fgVar.run();
                            } else {
                                View view2 = ((kg) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = ic0.a;
                                view2.postOnAnimationDelayed(fgVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            lgVar.n.add(arrayList7);
                            arrayList3.clear();
                            fg fgVar2 = new fg(lgVar, arrayList7, 1);
                            if (z2) {
                                fgVar2.run();
                            } else {
                                View view3 = ((jg) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = ic0.a;
                                view3.postOnAnimationDelayed(fgVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            lgVar.l.add(arrayList8);
                            arrayList4.clear();
                            fg fgVar3 = new fg(lgVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? lgVar.e : 0L, isEmpty3 ? 0L : lgVar.f) + j;
                                z = false;
                                View view4 = ((q20) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = ic0.a;
                                view4.postOnAnimationDelayed(fgVar3, max);
                                recyclerView.q0 = z;
                                break;
                            } else {
                                fgVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.q0 = z;
        }
    }
}
