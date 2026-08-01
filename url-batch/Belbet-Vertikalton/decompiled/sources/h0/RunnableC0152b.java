package h0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0152b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0158h f2988c;

    public /* synthetic */ RunnableC0152b(C0158h c0158h, ArrayList arrayList, int i) {
        this.f2986a = i;
        this.f2988c = c0158h;
        this.f2987b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2986a) {
            case 0:
                ArrayList arrayList = this.f2987b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0158h c0158h = this.f2988c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0158h.f3040m.remove(arrayList);
                        break;
                    } else {
                        C0157g c0157g = (C0157g) it2.next();
                        V v2 = c0157g.f3031a;
                        c0158h.getClass();
                        View view = v2.f2958a;
                        int i = c0157g.f3034d - c0157g.f3032b;
                        int i2 = c0157g.e - c0157g.f3033c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0158h.f3043p.add(v2);
                        animate.setDuration(c0158h.e).setListener(new C0154d(c0158h, v2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2987b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0158h c0158h2 = this.f2988c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0158h2.f3041n.remove(arrayList2);
                        break;
                    } else {
                        C0156f c0156f = (C0156f) it3.next();
                        c0158h2.getClass();
                        V v3 = c0156f.f3022a;
                        View view2 = v3 == null ? null : v3.f2958a;
                        V v4 = c0156f.f3023b;
                        View view3 = v4 != null ? v4.f2958a : null;
                        ArrayList arrayList3 = c0158h2.f3045r;
                        long j = c0158h2.f2897f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0156f.f3022a);
                            duration.translationX(c0156f.e - c0156f.f3024c);
                            duration.translationY(c0156f.f3026f - c0156f.f3025d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0155e(c0158h2, c0156f, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0156f.f3023b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0155e(c0158h2, c0156f, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2987b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0158h c0158h3 = this.f2988c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0158h3.f3039l.remove(arrayList4);
                        break;
                    } else {
                        V v5 = (V) it4.next();
                        c0158h3.getClass();
                        View view4 = v5.f2958a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0158h3.f3042o.add(v5);
                        animate3.alpha(1.0f).setDuration(c0158h3.f2895c).setListener(new C0153c(c0158h3, v5, view4, animate3)).start();
                    }
                }
        }
    }
}
