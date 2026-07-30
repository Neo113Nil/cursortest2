package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ho0 implements Comparator {
    public final tn1 a;
    public final un1 b;
    public final tn1 c;
    public final hn1 d;

    public ho0(dm0 dm0Var) {
        long[] jArr = oe2.a;
        this.a = new tn1();
        int i = pe2.a;
        this.b = new un1();
        this.c = new tn1();
        hn1 hn1Var = nt1.a;
        this.d = new hn1();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        hn1 hn1Var;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hn1Var = this.d;
            if (i >= size) {
                break;
            }
            hn1Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        un1 un1Var = this.b;
        tn1 tn1Var = this.a;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View t = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : tk3.t(view, viewGroup, 2);
                if (t != null && hn1Var.d(t) >= 0) {
                    tn1Var.m(view, t);
                    un1Var.a(t);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) tn1Var.g(view2)) != null && !un1Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    tn1 tn1Var2 = this.c;
                    View view4 = (View) tn1Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    tn1Var2.m(view2, view3);
                    view2 = (View) tn1Var.g(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        tn1 tn1Var = this.c;
        View view3 = (View) tn1Var.g(view);
        View view4 = (View) tn1Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        hn1 hn1Var = this.d;
        return hn1Var.e(view) < hn1Var.e(view2) ? -1 : 1;
    }
}
