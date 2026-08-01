package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: g0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0110B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2260b;

    public /* synthetic */ RunnableC0110B(RecyclerView recyclerView, int i) {
        this.f2259a = i;
        this.f2260b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f2260b;
        switch (this.f2259a) {
            case 0:
                if (recyclerView.f1593u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f1589s) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f1599x) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.f1597w = true;
                        break;
                    }
                }
                break;
            default:
                H h = recyclerView.f1546L;
                if (h != null) {
                    C0125k c0125k = (C0125k) h;
                    ArrayList arrayList = c0125k.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0125k.f2407j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0125k.f2408k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0125k.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j2 = c0125k.d;
                            if (hasNext) {
                                c0 c0Var = (c0) it.next();
                                View view = c0Var.f2339a;
                                ViewPropertyAnimator animate = view.animate();
                                c0125k.f2414q.add(c0Var);
                                animate.setDuration(j2).alpha(RecyclerView.f1530C0).setListener(new C0120f(c0125k, c0Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0125k.f2410m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0119e runnableC0119e = new RunnableC0119e(c0125k, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0119e.run();
                                    } else {
                                        View view2 = ((C0124j) arrayList5.get(0)).f2394a.f2339a;
                                        WeakHashMap weakHashMap = K.T.f423a;
                                        view2.postOnAnimationDelayed(runnableC0119e, j2);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0125k.f2411n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0119e runnableC0119e2 = new RunnableC0119e(c0125k, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0119e2.run();
                                    } else {
                                        View view3 = ((C0123i) arrayList6.get(0)).f2386a.f2339a;
                                        WeakHashMap weakHashMap2 = K.T.f423a;
                                        view3.postOnAnimationDelayed(runnableC0119e2, j2);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0125k.f2409l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0119e runnableC0119e3 = new RunnableC0119e(c0125k, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0119e3.run();
                                    } else {
                                        if (isEmpty) {
                                            j2 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0125k.f2268e : 0L, isEmpty3 ? 0L : c0125k.f2269f) + j2;
                                        View view4 = ((c0) arrayList7.get(0)).f2339a;
                                        WeakHashMap weakHashMap3 = K.T.f423a;
                                        view4.postOnAnimationDelayed(runnableC0119e3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f1579m0 = false;
                break;
        }
    }
}
