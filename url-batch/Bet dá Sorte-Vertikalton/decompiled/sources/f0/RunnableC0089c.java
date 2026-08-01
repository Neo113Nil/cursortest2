package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0089c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0095i f2151c;

    public /* synthetic */ RunnableC0089c(C0095i c0095i, ArrayList arrayList, int i) {
        this.f2149a = i;
        this.f2151c = c0095i;
        this.f2150b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2149a) {
            case 0:
                ArrayList arrayList = this.f2150b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0095i c0095i = this.f2151c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0095i.f2202m.remove(arrayList);
                        break;
                    } else {
                        C0094h c0094h = (C0094h) it2.next();
                        X x2 = c0094h.f2190a;
                        c0095i.getClass();
                        View view = x2.f2118a;
                        int i = c0094h.d - c0094h.f2191b;
                        int i2 = c0094h.f2193e - c0094h.f2192c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0095i.f2205p.add(x2);
                        animate.setDuration(c0095i.f2060e).setListener(new C0091e(c0095i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2150b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0095i c0095i2 = this.f2151c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0095i2.f2203n.remove(arrayList2);
                        break;
                    } else {
                        C0093g c0093g = (C0093g) it3.next();
                        c0095i2.getClass();
                        X x3 = c0093g.f2181a;
                        View view2 = x3 == null ? null : x3.f2118a;
                        X x4 = c0093g.f2182b;
                        View view3 = x4 != null ? x4.f2118a : null;
                        ArrayList arrayList3 = c0095i2.f2207r;
                        long j2 = c0095i2.f2061f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0093g.f2181a);
                            duration.translationX(c0093g.f2184e - c0093g.f2183c);
                            duration.translationY(c0093g.f2185f - c0093g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0092f(c0095i2, c0093g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0093g.f2182b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0092f(c0095i2, c0093g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2150b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0095i c0095i3 = this.f2151c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0095i3.f2201l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0095i3.getClass();
                        View view4 = x5.f2118a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0095i3.f2204o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0095i3.f2059c).setListener(new C0090d(c0095i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
