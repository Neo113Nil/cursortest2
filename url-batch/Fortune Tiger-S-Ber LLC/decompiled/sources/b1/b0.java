package b1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f737f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ b0(RecyclerView recyclerView, int i4) {
        this.f737f = i4;
        this.g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        int i4 = this.f737f;
        RecyclerView recyclerView = this.g;
        switch (i4) {
            case 0:
                if (recyclerView.f667y && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f663w) {
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
                j0 j0Var = recyclerView.P;
                if (j0Var != null) {
                    j jVar = (j) j0Var;
                    long j4 = jVar.f818d;
                    ArrayList arrayList = jVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f807j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f808k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.f806i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            int i6 = i5 + 1;
                            c1 c1Var = (c1) obj;
                            View view = c1Var.f747a;
                            ViewPropertyAnimator animate = view.animate();
                            jVar.f814q.add(c1Var);
                            animate.setDuration(j4).alpha(0.0f).setListener(new e(jVar, c1Var, animate, view)).start();
                            i5 = i6;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z4 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            jVar.f810m.add(arrayList5);
                            arrayList2.clear();
                            d dVar = new d(jVar, arrayList5, 0);
                            if (z4) {
                                dVar.run();
                            } else {
                                View view2 = ((i) arrayList5.get(0)).f797a.f747a;
                                WeakHashMap weakHashMap = k0.j0.f2752a;
                                view2.postOnAnimationDelayed(dVar, j4);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            jVar.f811n.add(arrayList6);
                            arrayList3.clear();
                            d dVar2 = new d(jVar, arrayList6, 1);
                            if (z4) {
                                dVar2.run();
                            } else {
                                View view3 = ((h) arrayList6.get(0)).f791a.f747a;
                                WeakHashMap weakHashMap2 = k0.j0.f2752a;
                                view3.postOnAnimationDelayed(dVar2, j4);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            jVar.f809l.add(arrayList7);
                            arrayList4.clear();
                            d dVar3 = new d(jVar, arrayList7, 2);
                            if (!z4 || !isEmpty2 || !isEmpty3) {
                                if (z4) {
                                    j4 = 0;
                                }
                                long max = Math.max(!isEmpty2 ? jVar.f819e : 0L, isEmpty3 ? 0L : jVar.f820f) + j4;
                                z3 = false;
                                View view4 = ((c1) arrayList7.get(0)).f747a;
                                WeakHashMap weakHashMap3 = k0.j0.f2752a;
                                view4.postOnAnimationDelayed(dVar3, max);
                                recyclerView.f652q0 = z3;
                                break;
                            } else {
                                dVar3.run();
                            }
                        }
                    }
                }
                z3 = false;
                recyclerView.f652q0 = z3;
        }
    }
}
