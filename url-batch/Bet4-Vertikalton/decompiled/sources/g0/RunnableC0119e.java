package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0119e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0125k f2362c;

    public /* synthetic */ RunnableC0119e(C0125k c0125k, ArrayList arrayList, int i) {
        this.f2360a = i;
        this.f2362c = c0125k;
        this.f2361b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2360a) {
            case 0:
                ArrayList arrayList = this.f2361b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0125k c0125k = this.f2362c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0125k.f2410m.remove(arrayList);
                        break;
                    } else {
                        C0124j c0124j = (C0124j) it2.next();
                        c0 c0Var = c0124j.f2394a;
                        c0125k.getClass();
                        View view = c0Var.f2339a;
                        int i = c0124j.d - c0124j.f2395b;
                        int i2 = c0124j.f2397e - c0124j.f2396c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f1530C0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f1530C0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0125k.f2413p.add(c0Var);
                        animate.setDuration(c0125k.f2268e).setListener(new C0121g(c0125k, c0Var, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2361b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0125k c0125k2 = this.f2362c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0125k2.f2411n.remove(arrayList2);
                        break;
                    } else {
                        C0123i c0123i = (C0123i) it3.next();
                        c0125k2.getClass();
                        c0 c0Var2 = c0123i.f2386a;
                        View view2 = c0Var2 == null ? null : c0Var2.f2339a;
                        c0 c0Var3 = c0123i.f2387b;
                        View view3 = c0Var3 != null ? c0Var3.f2339a : null;
                        ArrayList arrayList3 = c0125k2.f2415r;
                        long j2 = c0125k2.f2269f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0123i.f2386a);
                            duration.translationX(c0123i.f2389e - c0123i.f2388c);
                            duration.translationY(c0123i.f2390f - c0123i.d);
                            it = it3;
                            duration.alpha(RecyclerView.f1530C0).setListener(new C0122h(c0125k2, c0123i, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0123i.f2387b);
                            animate2.translationX(RecyclerView.f1530C0).translationY(RecyclerView.f1530C0).setDuration(j2).alpha(1.0f).setListener(new C0122h(c0125k2, c0123i, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2361b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0125k c0125k3 = this.f2362c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0125k3.f2409l.remove(arrayList4);
                        break;
                    } else {
                        c0 c0Var4 = (c0) it4.next();
                        c0125k3.getClass();
                        View view4 = c0Var4.f2339a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0125k3.f2412o.add(c0Var4);
                        animate3.alpha(1.0f).setDuration(c0125k3.f2267c).setListener(new C0120f(c0125k3, c0Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
