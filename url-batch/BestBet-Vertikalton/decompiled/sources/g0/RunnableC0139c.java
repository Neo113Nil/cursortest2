package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0139c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0145i f2806c;

    public /* synthetic */ RunnableC0139c(C0145i c0145i, ArrayList arrayList, int i) {
        this.f2804a = i;
        this.f2806c = c0145i;
        this.f2805b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2804a) {
            case 0:
                ArrayList arrayList = this.f2805b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0145i c0145i = this.f2806c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0145i.f2860m.remove(arrayList);
                        break;
                    } else {
                        C0144h c0144h = (C0144h) it2.next();
                        Y y2 = c0144h.f2847a;
                        c0145i.getClass();
                        View view = y2.f2777a;
                        int i = c0144h.d - c0144h.f2848b;
                        int i2 = c0144h.f2850e - c0144h.f2849c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f1937A0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f1937A0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0145i.f2863p.add(y2);
                        animate.setDuration(c0145i.f2717e).setListener(new C0141e(c0145i, y2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2805b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0145i c0145i2 = this.f2806c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0145i2.f2861n.remove(arrayList2);
                        break;
                    } else {
                        C0143g c0143g = (C0143g) it3.next();
                        c0145i2.getClass();
                        Y y3 = c0143g.f2837a;
                        View view2 = y3 == null ? null : y3.f2777a;
                        Y y4 = c0143g.f2838b;
                        View view3 = y4 != null ? y4.f2777a : null;
                        ArrayList arrayList3 = c0145i2.f2865r;
                        long j2 = c0145i2.f2718f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0143g.f2837a);
                            duration.translationX(c0143g.f2840e - c0143g.f2839c);
                            duration.translationY(c0143g.f2841f - c0143g.d);
                            it = it3;
                            duration.alpha(RecyclerView.f1937A0).setListener(new C0142f(c0145i2, c0143g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0143g.f2838b);
                            animate2.translationX(RecyclerView.f1937A0).translationY(RecyclerView.f1937A0).setDuration(j2).alpha(1.0f).setListener(new C0142f(c0145i2, c0143g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2805b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0145i c0145i3 = this.f2806c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0145i3.f2859l.remove(arrayList4);
                        break;
                    } else {
                        Y y5 = (Y) it4.next();
                        c0145i3.getClass();
                        View view4 = y5.f2777a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0145i3.f2862o.add(y5);
                        animate3.alpha(1.0f).setDuration(c0145i3.f2716c).setListener(new C0140d(c0145i3, y5, view4, animate3)).start();
                    }
                }
        }
    }
}
