package h0;

import android.view.View;
import java.util.List;

/* renamed from: h0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2581a;

    /* renamed from: b, reason: collision with root package name */
    public int f2582b;

    /* renamed from: c, reason: collision with root package name */
    public int f2583c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2584e;

    /* renamed from: f, reason: collision with root package name */
    public int f2585f;

    /* renamed from: g, reason: collision with root package name */
    public int f2586g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2587j;

    /* renamed from: k, reason: collision with root package name */
    public List f2588k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2589l;

    public final void a(View view) {
        int b2;
        int size = this.f2588k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2588k.get(i2)).f2430a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f2391a.i() && (b2 = (j2.f2391a.b() - this.d) * this.f2584e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f2391a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2588k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2430a;
            this.d += this.f2584e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2588k.get(i)).f2430a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f2391a.i() && this.d == j2.f2391a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
