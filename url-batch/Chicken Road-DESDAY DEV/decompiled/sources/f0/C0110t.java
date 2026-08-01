package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2223a;

    /* renamed from: b, reason: collision with root package name */
    public int f2224b;

    /* renamed from: c, reason: collision with root package name */
    public int f2225c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2226e;

    /* renamed from: f, reason: collision with root package name */
    public int f2227f;

    /* renamed from: g, reason: collision with root package name */
    public int f2228g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2229j;

    /* renamed from: k, reason: collision with root package name */
    public List f2230k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2231l;

    public final void a(View view) {
        int b2;
        int size = this.f2230k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2230k.get(i2)).f2076a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f2037a.i() && (b2 = (j2.f2037a.b() - this.d) * this.f2226e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f2037a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2230k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2076a;
            this.d += this.f2226e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2230k.get(i)).f2076a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f2037a.i() && this.d == j2.f2037a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
