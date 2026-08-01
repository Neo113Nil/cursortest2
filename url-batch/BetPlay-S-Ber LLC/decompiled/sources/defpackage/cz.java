package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cz implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ cz(RecyclerView recyclerView, int i) {
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
                jz jzVar = recyclerView.P;
                if (jzVar != null) {
                    se seVar = (se) jzVar;
                    long j = seVar.d;
                    ArrayList arrayList = seVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = seVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = seVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = seVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            c00 c00Var = (c00) obj;
                            View view = c00Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            seVar.q.add(c00Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new ne(seVar, c00Var, animate, view)).start();
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
                            seVar.m.add(arrayList6);
                            arrayList2.clear();
                            me meVar = new me(seVar, arrayList6, 0);
                            if (z2) {
                                meVar.run();
                            } else {
                                View view2 = ((re) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = e90.a;
                                view2.postOnAnimationDelayed(meVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            seVar.n.add(arrayList7);
                            arrayList3.clear();
                            me meVar2 = new me(seVar, arrayList7, 1);
                            if (z2) {
                                meVar2.run();
                            } else {
                                View view3 = ((qe) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = e90.a;
                                view3.postOnAnimationDelayed(meVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            seVar.l.add(arrayList8);
                            arrayList4.clear();
                            me meVar3 = new me(seVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? seVar.e : 0L, isEmpty3 ? 0L : seVar.f) + j;
                                z = false;
                                View view4 = ((c00) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = e90.a;
                                view4.postOnAnimationDelayed(meVar3, max);
                                recyclerView.q0 = z;
                                break;
                            } else {
                                meVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.q0 = z;
        }
    }
}
