package R0;

import I.C0143d;
import I.C0156j0;
import I.C0167p;
import I.C0173s0;
import I.W;
import android.content.Context;
import android.view.View;
import android.view.Window;
import e2.InterfaceC0426e;
import u0.AbstractC1088a;

/* loaded from: classes.dex */
public final class u extends AbstractC1088a {

    /* renamed from: l, reason: collision with root package name */
    public final Window f4118l;

    /* renamed from: m, reason: collision with root package name */
    public final C0156j0 f4119m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4120n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4121o;

    public u(Context context, Window window) {
        super(context);
        this.f4118l = window;
        this.f4119m = C0143d.K(r.f4113a, W.f2783i);
    }

    @Override // u0.AbstractC1088a
    public final void a(int i3, C0167p c0167p) {
        int i4;
        c0167p.S(1735448596);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            ((InterfaceC0426e) this.f4119m.getValue()).h(c0167p, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new t(i3, 0, this);
        }
    }

    @Override // u0.AbstractC1088a
    public final void d(boolean z3, int i3, int i4, int i5, int i6) {
        View childAt;
        super.d(z3, i3, i4, i5, i6);
        if (this.f4120n || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f4118l.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // u0.AbstractC1088a
    public final void e(int i3, int i4) {
        if (this.f4120n) {
            super.e(i3, i4);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // u0.AbstractC1088a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f4121o;
    }
}
