package g0;

import android.view.View;
import java.util.List;

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2485a;

    /* renamed from: b, reason: collision with root package name */
    public int f2486b;

    /* renamed from: c, reason: collision with root package name */
    public int f2487c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2488e;

    /* renamed from: f, reason: collision with root package name */
    public int f2489f;

    /* renamed from: g, reason: collision with root package name */
    public int f2490g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2491j;

    /* renamed from: k, reason: collision with root package name */
    public List f2492k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2493l;

    public final void a(View view) {
        int c2;
        int size = this.f2492k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((c0) this.f2492k.get(i2)).f2339a;
            M m2 = (M) view3.getLayoutParams();
            if (view3 != view && !m2.f2287a.j() && (c2 = (m2.f2287a.c() - this.d) * this.f2488e) >= 0 && c2 < i) {
                view2 = view3;
                if (c2 == 0) {
                    break;
                } else {
                    i = c2;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((M) view2.getLayoutParams()).f2287a.c();
        }
    }

    public final View b(S s2) {
        List list = this.f2492k;
        if (list == null) {
            View view = s2.k(this.d, Long.MAX_VALUE).f2339a;
            this.d += this.f2488e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((c0) this.f2492k.get(i)).f2339a;
            M m2 = (M) view2.getLayoutParams();
            if (!m2.f2287a.j() && this.d == m2.f2287a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
