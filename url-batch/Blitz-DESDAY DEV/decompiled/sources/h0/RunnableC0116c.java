package h0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0116c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0122i f2461c;

    public /* synthetic */ RunnableC0116c(C0122i c0122i, ArrayList arrayList, int i) {
        this.f2459a = i;
        this.f2461c = c0122i;
        this.f2460b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2459a) {
            case 0:
                ArrayList arrayList = this.f2460b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0122i c0122i = this.f2461c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0122i.f2515m.remove(arrayList);
                        break;
                    } else {
                        C0121h c0121h = (C0121h) it2.next();
                        X x2 = c0121h.f2502a;
                        c0122i.getClass();
                        View view = x2.f2430a;
                        int i = c0121h.d - c0121h.f2503b;
                        int i2 = c0121h.f2505e - c0121h.f2504c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0122i.f2518p.add(x2);
                        animate.setDuration(c0122i.f2372e).setListener(new C0118e(c0122i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2460b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0122i c0122i2 = this.f2461c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0122i2.f2516n.remove(arrayList2);
                        break;
                    } else {
                        C0120g c0120g = (C0120g) it3.next();
                        c0122i2.getClass();
                        X x3 = c0120g.f2492a;
                        View view2 = x3 == null ? null : x3.f2430a;
                        X x4 = c0120g.f2493b;
                        View view3 = x4 != null ? x4.f2430a : null;
                        ArrayList arrayList3 = c0122i2.f2520r;
                        long j2 = c0122i2.f2373f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0120g.f2492a);
                            duration.translationX(c0120g.f2495e - c0120g.f2494c);
                            duration.translationY(c0120g.f2496f - c0120g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0119f(c0122i2, c0120g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0120g.f2493b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0119f(c0122i2, c0120g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2460b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0122i c0122i3 = this.f2461c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0122i3.f2514l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0122i3.getClass();
                        View view4 = x5.f2430a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0122i3.f2517o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0122i3.f2371c).setListener(new C0117d(c0122i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
