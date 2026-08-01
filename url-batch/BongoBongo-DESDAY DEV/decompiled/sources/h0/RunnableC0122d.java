package h0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0122d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0128j f2483c;

    public /* synthetic */ RunnableC0122d(C0128j c0128j, ArrayList arrayList, int i) {
        this.f2481a = i;
        this.f2483c = c0128j;
        this.f2482b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2481a) {
            case 0:
                ArrayList arrayList = this.f2482b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0128j c0128j = this.f2483c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0128j.f2535m.remove(arrayList);
                        break;
                    } else {
                        C0127i c0127i = (C0127i) it2.next();
                        a0 a0Var = c0127i.f2517a;
                        c0128j.getClass();
                        View view = a0Var.f2455a;
                        int i = c0127i.d - c0127i.f2518b;
                        int i2 = c0127i.f2520e - c0127i.f2519c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.A0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.A0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0128j.f2538p.add(a0Var);
                        animate.setDuration(c0128j.f2389e).setListener(new C0124f(c0128j, a0Var, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2482b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0128j c0128j2 = this.f2483c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0128j2.f2536n.remove(arrayList2);
                        break;
                    } else {
                        C0126h c0126h = (C0126h) it3.next();
                        c0128j2.getClass();
                        a0 a0Var2 = c0126h.f2509a;
                        View view2 = a0Var2 == null ? null : a0Var2.f2455a;
                        a0 a0Var3 = c0126h.f2510b;
                        View view3 = a0Var3 != null ? a0Var3.f2455a : null;
                        ArrayList arrayList3 = c0128j2.f2540r;
                        long j2 = c0128j2.f2390f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0126h.f2509a);
                            duration.translationX(c0126h.f2512e - c0126h.f2511c);
                            duration.translationY(c0126h.f2513f - c0126h.d);
                            it = it3;
                            duration.alpha(RecyclerView.A0).setListener(new C0125g(c0128j2, c0126h, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0126h.f2510b);
                            animate2.translationX(RecyclerView.A0).translationY(RecyclerView.A0).setDuration(j2).alpha(1.0f).setListener(new C0125g(c0128j2, c0126h, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2482b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0128j c0128j3 = this.f2483c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0128j3.f2534l.remove(arrayList4);
                        break;
                    } else {
                        a0 a0Var4 = (a0) it4.next();
                        c0128j3.getClass();
                        View view4 = a0Var4.f2455a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0128j3.f2537o.add(a0Var4);
                        animate3.alpha(1.0f).setDuration(c0128j3.f2388c).setListener(new C0123e(c0128j3, a0Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
