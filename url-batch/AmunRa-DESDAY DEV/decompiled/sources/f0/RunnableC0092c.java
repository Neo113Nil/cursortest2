package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0092c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0098i f2108c;

    public /* synthetic */ RunnableC0092c(C0098i c0098i, ArrayList arrayList, int i) {
        this.f2106a = i;
        this.f2108c = c0098i;
        this.f2107b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2106a) {
            case 0:
                ArrayList arrayList = this.f2107b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0098i c0098i = this.f2108c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0098i.f2159m.remove(arrayList);
                        break;
                    } else {
                        C0097h c0097h = (C0097h) it2.next();
                        X x2 = c0097h.f2147a;
                        c0098i.getClass();
                        View view = x2.f2075a;
                        int i = c0097h.d - c0097h.f2148b;
                        int i2 = c0097h.f2150e - c0097h.f2149c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0098i.f2162p.add(x2);
                        animate.setDuration(c0098i.f2017e).setListener(new C0094e(c0098i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2107b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0098i c0098i2 = this.f2108c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0098i2.f2160n.remove(arrayList2);
                        break;
                    } else {
                        C0096g c0096g = (C0096g) it3.next();
                        c0098i2.getClass();
                        X x3 = c0096g.f2138a;
                        View view2 = x3 == null ? null : x3.f2075a;
                        X x4 = c0096g.f2139b;
                        View view3 = x4 != null ? x4.f2075a : null;
                        ArrayList arrayList3 = c0098i2.f2164r;
                        long j2 = c0098i2.f2018f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0096g.f2138a);
                            duration.translationX(c0096g.f2141e - c0096g.f2140c);
                            duration.translationY(c0096g.f2142f - c0096g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0095f(c0098i2, c0096g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0096g.f2139b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0095f(c0098i2, c0096g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2107b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0098i c0098i3 = this.f2108c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0098i3.f2158l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0098i3.getClass();
                        View view4 = x5.f2075a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0098i3.f2161o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0098i3.f2016c).setListener(new C0093d(c0098i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
