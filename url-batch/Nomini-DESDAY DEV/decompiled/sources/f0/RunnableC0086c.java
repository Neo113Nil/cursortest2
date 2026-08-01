package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0086c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0092i f2039c;

    public /* synthetic */ RunnableC0086c(C0092i c0092i, ArrayList arrayList, int i) {
        this.f2037a = i;
        this.f2039c = c0092i;
        this.f2038b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2037a) {
            case 0:
                ArrayList arrayList = this.f2038b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0092i c0092i = this.f2039c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0092i.f2090m.remove(arrayList);
                        break;
                    } else {
                        C0091h c0091h = (C0091h) it2.next();
                        X x2 = c0091h.f2078a;
                        c0092i.getClass();
                        View view = x2.f2006a;
                        int i = c0091h.d - c0091h.f2079b;
                        int i2 = c0091h.f2081e - c0091h.f2080c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0092i.f2093p.add(x2);
                        animate.setDuration(c0092i.f1948e).setListener(new C0088e(c0092i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2038b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0092i c0092i2 = this.f2039c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0092i2.f2091n.remove(arrayList2);
                        break;
                    } else {
                        C0090g c0090g = (C0090g) it3.next();
                        c0092i2.getClass();
                        X x3 = c0090g.f2069a;
                        View view2 = x3 == null ? null : x3.f2006a;
                        X x4 = c0090g.f2070b;
                        View view3 = x4 != null ? x4.f2006a : null;
                        ArrayList arrayList3 = c0092i2.f2095r;
                        long j2 = c0092i2.f1949f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0090g.f2069a);
                            duration.translationX(c0090g.f2072e - c0090g.f2071c);
                            duration.translationY(c0090g.f2073f - c0090g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0089f(c0092i2, c0090g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0090g.f2070b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0089f(c0092i2, c0090g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2038b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0092i c0092i3 = this.f2039c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0092i3.f2089l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0092i3.getClass();
                        View view4 = x5.f2006a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0092i3.f2092o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0092i3.f1947c).setListener(new C0087d(c0092i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
