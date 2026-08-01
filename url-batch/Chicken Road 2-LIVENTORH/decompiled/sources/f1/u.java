package f1;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1500a;

    /* renamed from: b, reason: collision with root package name */
    public int f1501b;

    /* renamed from: c, reason: collision with root package name */
    public int f1502c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1503e;

    /* renamed from: f, reason: collision with root package name */
    public int f1504f;

    /* renamed from: g, reason: collision with root package name */
    public int f1505g;

    /* renamed from: h, reason: collision with root package name */
    public int f1506h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1507j;

    /* renamed from: k, reason: collision with root package name */
    public List f1508k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1509l;

    public final void a(View view) {
        int b4;
        int size = this.f1508k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((b1) this.f1508k.get(i4)).f1309a;
            n0 n0Var = (n0) view3.getLayoutParams();
            if (view3 != view && !n0Var.f1460a.h() && (b4 = (n0Var.f1460a.b() - this.d) * this.f1503e) >= 0 && b4 < i) {
                view2 = view3;
                if (b4 == 0) {
                    break;
                } else {
                    i = b4;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((n0) view2.getLayoutParams()).f1460a.b();
        }
    }

    public final View b(s0 s0Var) {
        List list = this.f1508k;
        if (list == null) {
            View d = s0Var.d(this.d);
            this.d += this.f1503e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((b1) this.f1508k.get(i)).f1309a;
            n0 n0Var = (n0) view.getLayoutParams();
            if (!n0Var.f1460a.h() && this.d == n0Var.f1460a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
