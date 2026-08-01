package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0120d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0126j f2393c;

    public /* synthetic */ RunnableC0120d(C0126j c0126j, ArrayList arrayList, int i) {
        this.f2391a = i;
        this.f2393c = c0126j;
        this.f2392b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2391a) {
            case 0:
                ArrayList arrayList = this.f2392b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0126j c0126j = this.f2393c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0126j.f2445m.remove(arrayList);
                        break;
                    } else {
                        C0125i c0125i = (C0125i) it2.next();
                        a0 a0Var = c0125i.f2431a;
                        c0126j.getClass();
                        View view = a0Var.f2366a;
                        int i = c0125i.d - c0125i.f2432b;
                        int i2 = c0125i.f2434e - c0125i.f2433c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f1559A0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f1559A0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0126j.f2448p.add(a0Var);
                        animate.setDuration(c0126j.f2303e).setListener(new C0122f(c0126j, a0Var, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2392b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0126j c0126j2 = this.f2393c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0126j2.f2446n.remove(arrayList2);
                        break;
                    } else {
                        C0124h c0124h = (C0124h) it3.next();
                        c0126j2.getClass();
                        a0 a0Var2 = c0124h.f2419a;
                        View view2 = a0Var2 == null ? null : a0Var2.f2366a;
                        a0 a0Var3 = c0124h.f2420b;
                        View view3 = a0Var3 != null ? a0Var3.f2366a : null;
                        ArrayList arrayList3 = c0126j2.f2450r;
                        long j2 = c0126j2.f2304f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0124h.f2419a);
                            duration.translationX(c0124h.f2422e - c0124h.f2421c);
                            duration.translationY(c0124h.f2423f - c0124h.d);
                            it = it3;
                            duration.alpha(RecyclerView.f1559A0).setListener(new C0123g(c0126j2, c0124h, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0124h.f2420b);
                            animate2.translationX(RecyclerView.f1559A0).translationY(RecyclerView.f1559A0).setDuration(j2).alpha(1.0f).setListener(new C0123g(c0126j2, c0124h, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2392b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0126j c0126j3 = this.f2393c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0126j3.f2444l.remove(arrayList4);
                        break;
                    } else {
                        a0 a0Var4 = (a0) it4.next();
                        c0126j3.getClass();
                        View view4 = a0Var4.f2366a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0126j3.f2447o.add(a0Var4);
                        animate3.alpha(1.0f).setDuration(c0126j3.f2302c).setListener(new C0121e(c0126j3, a0Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
