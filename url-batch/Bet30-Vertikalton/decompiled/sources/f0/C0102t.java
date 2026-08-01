package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2158a;

    /* renamed from: b, reason: collision with root package name */
    public int f2159b;

    /* renamed from: c, reason: collision with root package name */
    public int f2160c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2161e;

    /* renamed from: f, reason: collision with root package name */
    public int f2162f;

    /* renamed from: g, reason: collision with root package name */
    public int f2163g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2164j;

    /* renamed from: k, reason: collision with root package name */
    public List f2165k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2166l;

    public final void a(View view) {
        int b2;
        int size = this.f2165k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2165k.get(i2)).f2011a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f1972a.i() && (b2 = (j2.f1972a.b() - this.d) * this.f2161e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f1972a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2165k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2011a;
            this.d += this.f2161e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2165k.get(i)).f2011a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f1972a.i() && this.d == j2.f1972a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
