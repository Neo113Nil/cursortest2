package e0;

import android.view.View;
import java.util.List;

/* renamed from: e0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2340a;

    /* renamed from: b, reason: collision with root package name */
    public int f2341b;

    /* renamed from: c, reason: collision with root package name */
    public int f2342c;

    /* renamed from: d, reason: collision with root package name */
    public int f2343d;

    /* renamed from: e, reason: collision with root package name */
    public int f2344e;

    /* renamed from: f, reason: collision with root package name */
    public int f2345f;

    /* renamed from: g, reason: collision with root package name */
    public int f2346g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2347j;

    /* renamed from: k, reason: collision with root package name */
    public List f2348k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2349l;

    public final void a(View view) {
        int b2;
        int size = this.f2348k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2348k.get(i2)).f2172a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f2127a.i() && (b2 = (j2.f2127a.b() - this.f2343d) * this.f2344e) >= 0 && b2 < i) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i = b2;
                }
            }
        }
        if (view2 == null) {
            this.f2343d = -1;
        } else {
            this.f2343d = ((J) view2.getLayoutParams()).f2127a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2348k;
        if (list == null) {
            View view = o2.i(this.f2343d, Long.MAX_VALUE).f2172a;
            this.f2343d += this.f2344e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2348k.get(i)).f2172a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f2127a.i() && this.f2343d == j2.f2127a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
