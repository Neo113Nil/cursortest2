package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2157a;

    /* renamed from: b, reason: collision with root package name */
    public int f2158b;

    /* renamed from: c, reason: collision with root package name */
    public int f2159c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2160e;

    /* renamed from: f, reason: collision with root package name */
    public int f2161f;

    /* renamed from: g, reason: collision with root package name */
    public int f2162g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2163j;

    /* renamed from: k, reason: collision with root package name */
    public List f2164k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2165l;

    public final void a(View view) {
        int b2;
        int size = this.f2164k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2164k.get(i2)).f2010a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f1971a.i() && (b2 = (j2.f1971a.b() - this.d) * this.f2160e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f1971a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2164k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2010a;
            this.d += this.f2160e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2164k.get(i)).f2010a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f1971a.i() && this.d == j2.f1971a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
