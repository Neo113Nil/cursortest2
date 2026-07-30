package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5039b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40670n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40671u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5045h f40672v;

    public /* synthetic */ RunnableC5039b(C5045h c5045h, ArrayList arrayList, int i) {
        this.f40670n = i;
        this.f40672v = c5045h;
        this.f40671u = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40670n) {
            case 0:
                ArrayList arrayList = this.f40671u;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C5045h c5045h = this.f40672v;
                    if (!hasNext) {
                        arrayList.clear();
                        c5045h.f40706m.remove(arrayList);
                        break;
                    } else {
                        C5044g c5044g = (C5044g) it.next();
                        AbstractC5032P abstractC5032P = c5044g.f40695a;
                        c5045h.getClass();
                        View view = abstractC5032P.f40615a;
                        int i = c5044g.f40698d - c5044g.f40696b;
                        int i4 = c5044g.f40699e - c5044g.f40697c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i4 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c5045h.f40709p.add(abstractC5032P);
                        animate.setDuration(c5045h.f40805e).setListener(new C5041d(c5045h, abstractC5032P, i, view, i4, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f40671u;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C5045h c5045h2 = this.f40672v;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c5045h2.f40707n.remove(arrayList2);
                        break;
                    } else {
                        C5043f c5043f = (C5043f) it2.next();
                        c5045h2.getClass();
                        AbstractC5032P abstractC5032P2 = c5043f.f40689a;
                        View view2 = abstractC5032P2 == null ? null : abstractC5032P2.f40615a;
                        AbstractC5032P abstractC5032P3 = c5043f.f40690b;
                        View view3 = abstractC5032P3 != null ? abstractC5032P3.f40615a : null;
                        ArrayList arrayList3 = c5045h2.f40711r;
                        long j9 = c5045h2.f40806f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j9);
                            arrayList3.add(c5043f.f40689a);
                            duration.translationX(c5043f.f40693e - c5043f.f40691c);
                            duration.translationY(c5043f.f40694f - c5043f.f40692d);
                            duration.alpha(0.0f).setListener(new C5042e(c5045h2, c5043f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c5043f.f40690b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j9).alpha(1.0f).setListener(new C5042e(c5045h2, c5043f, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f40671u;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C5045h c5045h3 = this.f40672v;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c5045h3.f40705l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC5032P abstractC5032P4 = (AbstractC5032P) it3.next();
                        c5045h3.getClass();
                        View view4 = abstractC5032P4.f40615a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c5045h3.f40708o.add(abstractC5032P4);
                        animate3.alpha(1.0f).setDuration(c5045h3.f40803c).setListener(new C5040c(c5045h3, abstractC5032P4, view4, animate3)).start();
                    }
                }
        }
    }
}
