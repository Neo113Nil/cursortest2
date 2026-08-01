package g0;

import android.view.View;
import java.util.List;

/* renamed from: g0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2515a;

    /* renamed from: b, reason: collision with root package name */
    public int f2516b;

    /* renamed from: c, reason: collision with root package name */
    public int f2517c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2518e;

    /* renamed from: f, reason: collision with root package name */
    public int f2519f;

    /* renamed from: g, reason: collision with root package name */
    public int f2520g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2521j;

    /* renamed from: k, reason: collision with root package name */
    public List f2522k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2523l;

    public final void a(View view) {
        int b2;
        int size = this.f2522k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((a0) this.f2522k.get(i2)).f2366a;
            K k2 = (K) view3.getLayoutParams();
            if (view3 != view && !k2.f2322a.i() && (b2 = (k2.f2322a.b() - this.d) * this.f2518e) >= 0 && b2 < i) {
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
            this.d = ((K) view2.getLayoutParams()).f2322a.b();
        }
    }

    public final View b(P p2) {
        List list = this.f2522k;
        if (list == null) {
            View view = p2.k(this.d, Long.MAX_VALUE).f2366a;
            this.d += this.f2518e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((a0) this.f2522k.get(i)).f2366a;
            K k2 = (K) view2.getLayoutParams();
            if (!k2.f2322a.i() && this.d == k2.f2322a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
