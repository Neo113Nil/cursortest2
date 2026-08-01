package h0;

import android.view.View;
import java.util.List;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2612a;

    /* renamed from: b, reason: collision with root package name */
    public int f2613b;

    /* renamed from: c, reason: collision with root package name */
    public int f2614c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2615e;

    /* renamed from: f, reason: collision with root package name */
    public int f2616f;

    /* renamed from: g, reason: collision with root package name */
    public int f2617g;

    /* renamed from: h, reason: collision with root package name */
    public int f2618h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2619j;

    /* renamed from: k, reason: collision with root package name */
    public List f2620k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2621l;

    public final void a(View view) {
        int b2;
        int size = this.f2620k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((a0) this.f2620k.get(i2)).f2455a;
            K k2 = (K) view3.getLayoutParams();
            if (view3 != view && !k2.f2409a.i() && (b2 = (k2.f2409a.b() - this.d) * this.f2615e) >= 0 && b2 < i) {
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
            this.d = ((K) view2.getLayoutParams()).f2409a.b();
        }
    }

    public final View b(P p2) {
        List list = this.f2620k;
        if (list == null) {
            View view = p2.k(this.d, Long.MAX_VALUE).f2455a;
            this.d += this.f2615e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((a0) this.f2620k.get(i)).f2455a;
            K k2 = (K) view2.getLayoutParams();
            if (!k2.f2409a.i() && this.d == k2.f2409a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
