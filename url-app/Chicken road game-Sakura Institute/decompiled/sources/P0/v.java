package P0;

import G.C0192d;
import G.C0205j0;
import G.C0216p;
import G.C0222s0;
import G.W;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function2;
import s0.AbstractC1131a;

/* loaded from: classes.dex */
public final class v extends AbstractC1131a {

    /* renamed from: o, reason: collision with root package name */
    public final Window f3764o;

    /* renamed from: p, reason: collision with root package name */
    public final C0205j0 f3765p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3766q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3767r;

    public v(Context context, Window window) {
        super(context);
        this.f3764o = window;
        this.f3765p = C0192d.K(s.f3759a, W.f2779l);
    }

    @Override // s0.AbstractC1131a
    public final void a(int i2, C0216p c0216p) {
        int i4;
        c0216p.U(1735448596);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(this) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            ((Function2) this.f3765p.getValue()).h(c0216p, 0);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new u(i2, 0, this);
        }
    }

    @Override // s0.AbstractC1131a
    public final void d(boolean z4, int i2, int i4, int i5, int i6) {
        View childAt;
        super.d(z4, i2, i4, i5, i6);
        if (this.f3766q || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f3764o.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // s0.AbstractC1131a
    public final void e(int i2, int i4) {
        if (this.f3766q) {
            super.e(i2, i4);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // s0.AbstractC1131a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3767r;
    }
}
