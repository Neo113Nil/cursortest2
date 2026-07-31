package x1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final o.j0 f8408a;

    /* renamed from: b, reason: collision with root package name */
    public final o.k0 f8409b;

    /* renamed from: c, reason: collision with root package name */
    public final o.j0 f8410c;

    /* renamed from: d, reason: collision with root package name */
    public final o.d0 f8411d;

    public f1(c5.n nVar) {
        long[] jArr = o.r0.f5528a;
        this.f8408a = new o.j0();
        o.k0 k0Var = o.s0.f5536a;
        this.f8409b = new o.k0();
        this.f8410c = new o.j0();
        o.d0 d0Var = o.o0.f5516a;
        this.f8411d = new o.d0();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        o.d0 d0Var;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            d0Var = this.f8411d;
            if (i >= size) {
                break;
            }
            d0Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        o.k0 k0Var = this.f8409b;
        o.j0 j0Var = this.f8408a;
        if (size2 >= 0) {
            while (true) {
                int i8 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View b8 = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : g0.b(view, viewGroup, 2);
                if (b8 != null && d0Var.d(b8) >= 0) {
                    j0Var.m(view, b8);
                    k0Var.a(b8);
                }
                if (i8 < 0) {
                    break;
                } else {
                    size2 = i8;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i9 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) j0Var.g(view2)) != null && !k0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    o.j0 j0Var2 = this.f8410c;
                    View view4 = (View) j0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    j0Var2.m(view2, view3);
                    view2 = (View) j0Var.g(view2);
                }
            }
            if (i9 < 0) {
                return;
            } else {
                size3 = i9;
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
        o.j0 j0Var = this.f8410c;
        View view3 = (View) j0Var.g(view);
        View view4 = (View) j0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f8408a.g(view) == null) ? 1 : -1;
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
        o.d0 d0Var = this.f8411d;
        return d0Var.e(view) < d0Var.e(view2) ? -1 : 1;
    }
}
