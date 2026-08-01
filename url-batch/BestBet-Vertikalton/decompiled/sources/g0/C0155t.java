package g0;

import android.view.View;
import java.util.List;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2926a;

    /* renamed from: b, reason: collision with root package name */
    public int f2927b;

    /* renamed from: c, reason: collision with root package name */
    public int f2928c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2929e;

    /* renamed from: f, reason: collision with root package name */
    public int f2930f;

    /* renamed from: g, reason: collision with root package name */
    public int f2931g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2932j;

    /* renamed from: k, reason: collision with root package name */
    public List f2933k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2934l;

    public final void a(View view) {
        int b2;
        int size = this.f2933k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((Y) this.f2933k.get(i2)).f2777a;
            I i3 = (I) view3.getLayoutParams();
            if (view3 != view && !i3.f2736a.i() && (b2 = (i3.f2736a.b() - this.d) * this.f2929e) >= 0 && b2 < i) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i = b2;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((I) view2.getLayoutParams()).f2736a.b();
        }
    }

    public final View b(N n2) {
        List list = this.f2933k;
        if (list == null) {
            View view = n2.k(this.d, Long.MAX_VALUE).f2777a;
            this.d += this.f2929e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((Y) this.f2933k.get(i)).f2777a;
            I i2 = (I) view2.getLayoutParams();
            if (!i2.f2736a.i() && this.d == i2.f2736a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
