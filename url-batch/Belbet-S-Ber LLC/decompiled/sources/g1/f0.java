package g1;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1648a;

    /* renamed from: b, reason: collision with root package name */
    public int f1649b;

    /* renamed from: c, reason: collision with root package name */
    public int f1650c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1651e;

    /* renamed from: f, reason: collision with root package name */
    public int f1652f;

    /* renamed from: g, reason: collision with root package name */
    public int f1653g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1654j;

    /* renamed from: k, reason: collision with root package name */
    public List f1655k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1656l;

    public final void a(View view) {
        int b2;
        int size = this.f1655k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((q1) this.f1655k.get(i4)).f1768a;
            b1 b1Var = (b1) view3.getLayoutParams();
            if (view3 != view && !b1Var.f1617a.h() && (b2 = (b1Var.f1617a.b() - this.d) * this.f1651e) >= 0 && b2 < i) {
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
            this.d = ((b1) view2.getLayoutParams()).f1617a.b();
        }
    }

    public final View b(g1 g1Var) {
        List list = this.f1655k;
        if (list == null) {
            View d = g1Var.d(this.d);
            this.d += this.f1651e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((q1) this.f1655k.get(i)).f1768a;
            b1 b1Var = (b1) view.getLayoutParams();
            if (!b1Var.f1617a.h() && this.d == b1Var.f1617a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
