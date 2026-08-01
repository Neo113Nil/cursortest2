package b1;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f925a;

    /* renamed from: b, reason: collision with root package name */
    public int f926b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f927d;

    /* renamed from: e, reason: collision with root package name */
    public int f928e;

    /* renamed from: f, reason: collision with root package name */
    public int f929f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f930i;

    /* renamed from: j, reason: collision with root package name */
    public int f931j;

    /* renamed from: k, reason: collision with root package name */
    public List f932k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f933l;

    public final void a(View view) {
        int b2;
        int size = this.f932k.size();
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((c1) this.f932k.get(i5)).f747a;
            o0 o0Var = (o0) view3.getLayoutParams();
            if (view3 != view && !o0Var.f889a.h() && (b2 = (o0Var.f889a.b() - this.f927d) * this.f928e) >= 0 && b2 < i4) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i4 = b2;
                }
            }
        }
        if (view2 == null) {
            this.f927d = -1;
        } else {
            this.f927d = ((o0) view2.getLayoutParams()).f889a.b();
        }
    }

    public final View b(t0 t0Var) {
        List list = this.f932k;
        if (list == null) {
            View d4 = t0Var.d(this.f927d);
            this.f927d += this.f928e;
            return d4;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = ((c1) this.f932k.get(i4)).f747a;
            o0 o0Var = (o0) view.getLayoutParams();
            if (!o0Var.f889a.h() && this.f927d == o0Var.f889a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
