package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0094c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0100i f2109c;

    public /* synthetic */ RunnableC0094c(C0100i c0100i, ArrayList arrayList, int i) {
        this.f2107a = i;
        this.f2109c = c0100i;
        this.f2108b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2107a) {
            case 0:
                ArrayList arrayList = this.f2108b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0100i c0100i = this.f2109c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0100i.f2160m.remove(arrayList);
                        break;
                    } else {
                        C0099h c0099h = (C0099h) it2.next();
                        X x2 = c0099h.f2148a;
                        c0100i.getClass();
                        View view = x2.f2076a;
                        int i = c0099h.d - c0099h.f2149b;
                        int i2 = c0099h.f2151e - c0099h.f2150c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0100i.f2163p.add(x2);
                        animate.setDuration(c0100i.f2018e).setListener(new C0096e(c0100i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2108b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0100i c0100i2 = this.f2109c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0100i2.f2161n.remove(arrayList2);
                        break;
                    } else {
                        C0098g c0098g = (C0098g) it3.next();
                        c0100i2.getClass();
                        X x3 = c0098g.f2139a;
                        View view2 = x3 == null ? null : x3.f2076a;
                        X x4 = c0098g.f2140b;
                        View view3 = x4 != null ? x4.f2076a : null;
                        ArrayList arrayList3 = c0100i2.f2165r;
                        long j2 = c0100i2.f2019f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0098g.f2139a);
                            duration.translationX(c0098g.f2142e - c0098g.f2141c);
                            duration.translationY(c0098g.f2143f - c0098g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0097f(c0100i2, c0098g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0098g.f2140b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0097f(c0100i2, c0098g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2108b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0100i c0100i3 = this.f2109c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0100i3.f2159l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0100i3.getClass();
                        View view4 = x5.f2076a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0100i3.f2162o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0100i3.f2017c).setListener(new C0095d(c0100i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
