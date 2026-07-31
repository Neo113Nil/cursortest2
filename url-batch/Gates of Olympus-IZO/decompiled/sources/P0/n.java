package P0;

import I.C0089d;
import I.C0102j0;
import I.C0113p;
import I.C0119s0;
import I.X;
import android.content.Context;
import android.view.View;
import android.view.Window;
import u0.AbstractC0960a;

/* loaded from: classes.dex */
public final class n extends AbstractC0960a {

    /* renamed from: l, reason: collision with root package name */
    public final Window f3050l;

    /* renamed from: m, reason: collision with root package name */
    public final C0102j0 f3051m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3052n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3053o;

    public n(Context context, Window window) {
        super(context, null, 0);
        this.f3050l = window;
        this.f3051m = C0089d.J(l.f3046a, X.f2228i);
    }

    @Override // u0.AbstractC0960a
    public final void a(int i3, C0113p c0113p) {
        int i4;
        c0113p.S(1735448596);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            ((Y1.e) this.f3051m.getValue()).g(c0113p, 0);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new m(this, i3, 0);
        }
    }

    @Override // u0.AbstractC0960a
    public final void d(boolean z3, int i3, int i4, int i5, int i6) {
        View childAt;
        super.d(z3, i3, i4, i5, i6);
        if (this.f3052n || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f3050l.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // u0.AbstractC0960a
    public final void e(int i3, int i4) {
        if (this.f3052n) {
            super.e(i3, i4);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // u0.AbstractC0960a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3053o;
    }
}
