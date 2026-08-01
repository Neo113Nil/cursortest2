package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0093c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0099i f2176c;

    public /* synthetic */ RunnableC0093c(C0099i c0099i, ArrayList arrayList, int i) {
        this.f2174a = i;
        this.f2176c = c0099i;
        this.f2175b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2174a) {
            case 0:
                ArrayList arrayList = this.f2175b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0099i c0099i = this.f2176c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0099i.f2227m.remove(arrayList);
                        break;
                    } else {
                        C0098h c0098h = (C0098h) it2.next();
                        X x2 = c0098h.f2215a;
                        c0099i.getClass();
                        View view = x2.f2143a;
                        int i = c0098h.d - c0098h.f2216b;
                        int i2 = c0098h.f2218e - c0098h.f2217c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0099i.f2230p.add(x2);
                        animate.setDuration(c0099i.f2085e).setListener(new C0095e(c0099i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2175b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0099i c0099i2 = this.f2176c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0099i2.f2228n.remove(arrayList2);
                        break;
                    } else {
                        C0097g c0097g = (C0097g) it3.next();
                        c0099i2.getClass();
                        X x3 = c0097g.f2206a;
                        View view2 = x3 == null ? null : x3.f2143a;
                        X x4 = c0097g.f2207b;
                        View view3 = x4 != null ? x4.f2143a : null;
                        ArrayList arrayList3 = c0099i2.f2232r;
                        long j2 = c0099i2.f2086f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0097g.f2206a);
                            duration.translationX(c0097g.f2209e - c0097g.f2208c);
                            duration.translationY(c0097g.f2210f - c0097g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0096f(c0099i2, c0097g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0097g.f2207b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0096f(c0099i2, c0097g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2175b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0099i c0099i3 = this.f2176c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0099i3.f2226l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0099i3.getClass();
                        View view4 = x5.f2143a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0099i3.f2229o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0099i3.f2084c).setListener(new C0094d(c0099i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
