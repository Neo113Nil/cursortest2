package e0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0115c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0121i f2205c;

    public /* synthetic */ RunnableC0115c(C0121i c0121i, ArrayList arrayList, int i) {
        this.f2203a = i;
        this.f2205c = c0121i;
        this.f2204b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2203a) {
            case 0:
                ArrayList arrayList = this.f2204b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0121i c0121i = this.f2205c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0121i.f2266m.remove(arrayList);
                        break;
                    } else {
                        C0120h c0120h = (C0120h) it2.next();
                        X x2 = c0120h.f2252a;
                        c0121i.getClass();
                        View view = x2.f2168a;
                        int i = c0120h.f2255d - c0120h.f2253b;
                        int i2 = c0120h.f2256e - c0120h.f2254c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0121i.f2269p.add(x2);
                        animate.setDuration(c0121i.f2102e).setListener(new C0117e(c0121i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2204b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0121i c0121i2 = this.f2205c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0121i2.f2267n.remove(arrayList2);
                        break;
                    } else {
                        C0119g c0119g = (C0119g) it3.next();
                        c0121i2.getClass();
                        X x3 = c0119g.f2241a;
                        View view2 = x3 == null ? null : x3.f2168a;
                        X x4 = c0119g.f2242b;
                        View view3 = x4 != null ? x4.f2168a : null;
                        ArrayList arrayList3 = c0121i2.f2271r;
                        long j2 = c0121i2.f2103f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0119g.f2241a);
                            duration.translationX(c0119g.f2245e - c0119g.f2243c);
                            duration.translationY(c0119g.f2246f - c0119g.f2244d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0118f(c0121i2, c0119g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0119g.f2242b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0118f(c0121i2, c0119g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2204b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0121i c0121i3 = this.f2205c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0121i3.f2265l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0121i3.getClass();
                        View view4 = x5.f2168a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0121i3.f2268o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0121i3.f2100c).setListener(new C0116d(c0121i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
