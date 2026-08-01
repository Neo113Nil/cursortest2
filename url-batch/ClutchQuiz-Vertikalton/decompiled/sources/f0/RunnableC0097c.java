package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0097c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0103i f2226c;

    public /* synthetic */ RunnableC0097c(C0103i c0103i, ArrayList arrayList, int i) {
        this.f2224a = i;
        this.f2226c = c0103i;
        this.f2225b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2224a) {
            case 0:
                ArrayList arrayList = this.f2225b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0103i c0103i = this.f2226c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0103i.f2276m.remove(arrayList);
                        break;
                    } else {
                        C0102h c0102h = (C0102h) it2.next();
                        W w2 = c0102h.f2267a;
                        c0103i.getClass();
                        View view = w2.f2193a;
                        int i = c0102h.d - c0102h.f2268b;
                        int i2 = c0102h.f2270e - c0102h.f2269c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0103i.f2279p.add(w2);
                        animate.setDuration(c0103i.f2135e).setListener(new C0099e(c0103i, w2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2225b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0103i c0103i2 = this.f2226c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0103i2.f2277n.remove(arrayList2);
                        break;
                    } else {
                        C0101g c0101g = (C0101g) it3.next();
                        c0103i2.getClass();
                        W w3 = c0101g.f2259a;
                        View view2 = w3 == null ? null : w3.f2193a;
                        W w4 = c0101g.f2260b;
                        View view3 = w4 != null ? w4.f2193a : null;
                        ArrayList arrayList3 = c0103i2.f2281r;
                        long j2 = c0103i2.f2136f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0101g.f2259a);
                            duration.translationX(c0101g.f2262e - c0101g.f2261c);
                            duration.translationY(c0101g.f2263f - c0101g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0100f(c0103i2, c0101g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0101g.f2260b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0100f(c0103i2, c0101g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2225b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0103i c0103i3 = this.f2226c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0103i3.f2275l.remove(arrayList4);
                        break;
                    } else {
                        W w5 = (W) it4.next();
                        c0103i3.getClass();
                        View view4 = w5.f2193a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0103i3.f2278o.add(w5);
                        animate3.alpha(1.0f).setDuration(c0103i3.f2134c).setListener(new C0098d(c0103i3, w5, view4, animate3)).start();
                    }
                }
        }
    }
}
