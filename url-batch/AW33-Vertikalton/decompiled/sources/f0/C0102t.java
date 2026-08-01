package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2154a;

    /* renamed from: b, reason: collision with root package name */
    public int f2155b;

    /* renamed from: c, reason: collision with root package name */
    public int f2156c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2157e;

    /* renamed from: f, reason: collision with root package name */
    public int f2158f;

    /* renamed from: g, reason: collision with root package name */
    public int f2159g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2160j;

    /* renamed from: k, reason: collision with root package name */
    public List f2161k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2162l;

    public final void a(View view) {
        int b2;
        int size = this.f2161k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2161k.get(i2)).f2007a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f1968a.i() && (b2 = (j2.f1968a.b() - this.d) * this.f2157e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f1968a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2161k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2007a;
            this.d += this.f2157e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2161k.get(i)).f2007a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f1968a.i() && this.d == j2.f1968a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
