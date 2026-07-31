package u2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import m0.h1;
import m0.s;
import m0.t1;
import q3.c0;
import q3.k0;
import q3.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends x1.a implements q3.p {

    /* renamed from: l, reason: collision with root package name */
    public final Window f7327l;

    /* renamed from: m, reason: collision with root package name */
    public final h1 f7328m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7329n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7330o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7331p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7332q;

    public n(Context context, Window window) {
        super(context);
        this.f7327l = window;
        this.f7328m = m0.b.q(l.f7325a);
        Field field = k0.f6120a;
        c0.i(this, this);
        k0.m(this, new m(this));
    }

    @Override // x1.a
    public final void a(s sVar, int i) {
        sVar.W(1735448596);
        int i8 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.N(i8 & 1, (i8 & 3) != 2)) {
            ((p6.e) this.f7328m.getValue()).g(sVar, 0);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new q.d(this, i, 2);
        }
    }

    @Override // x1.a
    public final void d(int i, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i11 = i9 - i;
        int i12 = i10 - i8;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i11 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i12 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // x1.a
    public final void e(int i, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.e(i, i8);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        Window window = this.f7327l;
        int i9 = (mode != Integer.MIN_VALUE || this.f7329n || this.f7330o || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i10 = size - paddingRight;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = i9 - paddingBottom;
        int i12 = i11 >= 0 ? i11 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        childAt.measure(i, i8);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f7330o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f7329n) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // x1.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7332q;
    }

    @Override // q3.p
    public final l1 k(View view, l1 l1Var) {
        if (!this.f7330o) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return l1Var.f6127a.m(max, max2, max3, max4);
            }
        }
        return l1Var;
    }
}
