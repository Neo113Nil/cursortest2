package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tz extends RfyTYNmI9Srp implements lf1 {
    public final Window BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public boolean RfyTYNmI9Srp;
    public boolean S9EYkSpbGuxq;
    public boolean VhhvGxCb8gfr;
    public final mj1 XL4ISE6Oc65B;

    public tz(Context context, Window window) {
        super(context);
        this.BRwzKIf41E4i = window;
        this.XL4ISE6Oc65B = sj0.tmVwIGCQF4zR(pn.PxuCJdSBwIXG);
        int i = rq2.PxuCJdSBwIXG;
        mq2.lS5Rgt96tfkO(this, this);
        rq2.PxuCJdSBwIXG(this, new sz(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // defpackage.RfyTYNmI9Srp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OPXfSBeufaJ8(int i, int i2) {
        int i3;
        int i4;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.OPXfSBeufaJ8(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.BRwzKIf41E4i;
        if (mode2 == Integer.MIN_VALUE && !this.RfyTYNmI9Srp && window.getAttributes().height == -2) {
            if (this.EcgxDIVH5in8) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = z8.PxuCJdSBwIXG.PxuCJdSBwIXG(window);
                } else if (i5 < 32) {
                    i3 = b9.PxuCJdSBwIXG.PxuCJdSBwIXG(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = i3 - paddingBottom;
            int i7 = i6 >= 0 ? i6 : 0;
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.EcgxDIVH5in8 && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.RfyTYNmI9Srp) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        int i62 = i3 - paddingBottom2;
        if (i62 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.EcgxDIVH5in8) {
        }
    }

    @Override // defpackage.lf1
    public final rt2 PxuCJdSBwIXG(View view, rt2 rt2Var) {
        if (!this.EcgxDIVH5in8) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return rt2Var.PxuCJdSBwIXG.BRwzKIf41E4i(max, max2, max3, max4);
            }
        }
        return rt2Var;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.VhhvGxCb8gfr;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void lS5Rgt96tfkO(int i, hp hpVar) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1735448596);
        int i2 = (tf0Var.rtx2ld2ELZv4(this) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            ((pe0) this.XL4ISE6Oc65B.getValue()).rtx2ld2ELZv4(tf0Var, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new XL4ISE6Oc65B(this, i, 5);
        }
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void rtx2ld2ELZv4(boolean z, int i, int i2, int i3, int i4) {
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
}
