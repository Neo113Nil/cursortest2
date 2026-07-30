package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ya0 extends d0 implements iu1 {
    public final Window u;
    public final lz1 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ya0(Context context, Window window) {
        super(context);
        this.u = window;
        this.v = ij2.j(ny.a);
        WeakHashMap weakHashMap = e53.a;
        x43.c(this, this);
        e53.k(this, new xa0(this));
    }

    @Override // defpackage.iu1
    public final c83 a(View view, c83 c83Var) {
        if (!this.x) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return c83Var.a.q(max, max2, max3, max4);
            }
        }
        return c83Var;
    }

    @Override // defpackage.d0
    public final void b(int i, a00 a00Var) {
        a00Var.Z(1735448596);
        int i2 = (a00Var.h(this) ? 4 : 2) | i;
        if (a00Var.P(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.v.getValue()).invoke(a00Var, 0);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c0(i, 9, this);
        }
    }

    @Override // defpackage.d0
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.d0
    public final void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.u;
        int i3 = (mode != Integer.MIN_VALUE || this.w || this.x || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.x || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.w) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // defpackage.d0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }
}
