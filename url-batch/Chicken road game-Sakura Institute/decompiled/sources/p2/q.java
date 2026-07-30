package p2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import g0.g1;
import g0.p1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends s1.a {

    /* renamed from: n, reason: collision with root package name */
    public final Window f7159n;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f7160o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7161p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7162q;

    public q(Context context, Window window) {
        super(context);
        this.f7159n = window;
        this.f7160o = g0.d.J(o.f7157a, t0.f3903k);
    }

    @Override // s1.a
    public final void a(int i7, g0.p pVar) {
        pVar.S(1735448596);
        if ((((pVar.h(this) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            ((q6.e) this.f7160o.getValue()).d(pVar, 0);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 8, this);
        }
    }

    @Override // s1.a
    public final void d(boolean z8, int i7, int i8, int i9, int i10) {
        View childAt;
        super.d(z8, i7, i8, i9, i10);
        if (this.f7161p || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f7159n.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // s1.a
    public final void e(int i7, int i8) {
        if (this.f7161p) {
            super.e(i7, i8);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // s1.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7162q;
    }
}
