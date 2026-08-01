package h0;

import android.view.View;
import java.util.List;

/* renamed from: h0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3105a;

    /* renamed from: b, reason: collision with root package name */
    public int f3106b;

    /* renamed from: c, reason: collision with root package name */
    public int f3107c;

    /* renamed from: d, reason: collision with root package name */
    public int f3108d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3109f;

    /* renamed from: g, reason: collision with root package name */
    public int f3110g;

    /* renamed from: h, reason: collision with root package name */
    public int f3111h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f3112k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3113l;

    public final void a(View view) {
        int b2;
        int size = this.f3112k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((V) this.f3112k.get(i2)).f2958a;
            C0142H c0142h = (C0142H) view3.getLayoutParams();
            if (view3 != view && !c0142h.f2916a.i() && (b2 = (c0142h.f2916a.b() - this.f3108d) * this.e) >= 0 && b2 < i) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i = b2;
                }
            }
        }
        if (view2 == null) {
            this.f3108d = -1;
        } else {
            this.f3108d = ((C0142H) view2.getLayoutParams()).f2916a.b();
        }
    }

    public final View b(C0147M c0147m) {
        List list = this.f3112k;
        if (list == null) {
            View view = c0147m.i(this.f3108d, Long.MAX_VALUE).f2958a;
            this.f3108d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((V) this.f3112k.get(i)).f2958a;
            C0142H c0142h = (C0142H) view2.getLayoutParams();
            if (!c0142h.f2916a.i() && this.f3108d == c0142h.f2916a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
