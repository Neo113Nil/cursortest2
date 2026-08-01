package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2339a;

    /* renamed from: b, reason: collision with root package name */
    public int f2340b;

    /* renamed from: c, reason: collision with root package name */
    public int f2341c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2342e;

    /* renamed from: f, reason: collision with root package name */
    public int f2343f;

    /* renamed from: g, reason: collision with root package name */
    public int f2344g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2345j;

    /* renamed from: k, reason: collision with root package name */
    public List f2346k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2347l;

    public final void a(View view) {
        int b2;
        int size = this.f2346k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((W) this.f2346k.get(i2)).f2193a;
            I i3 = (I) view3.getLayoutParams();
            if (view3 != view && !i3.f2154a.i() && (b2 = (i3.f2154a.b() - this.d) * this.f2342e) >= 0 && b2 < i) {
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
            this.d = ((I) view2.getLayoutParams()).f2154a.b();
        }
    }

    public final View b(N n2) {
        List list = this.f2346k;
        if (list == null) {
            View view = n2.i(this.d, Long.MAX_VALUE).f2193a;
            this.d += this.f2342e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((W) this.f2346k.get(i)).f2193a;
            I i2 = (I) view2.getLayoutParams();
            if (!i2.f2154a.i() && this.d == i2.f2154a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
