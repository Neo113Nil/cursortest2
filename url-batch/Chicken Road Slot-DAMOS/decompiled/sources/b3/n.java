package b3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.j1;
import n0.s1;
import o3.c0;
import o3.k1;
import o3.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends d2.a implements o3.i {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final Window f1071x;

    /* renamed from: y, reason: collision with root package name */
    public final j1 f1072y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1073z;

    public n(Context context, Window window) {
        super(context);
        this.f1071x = window;
        this.f1072y = n0.h.r(m.f1070a);
        Field field = c0.f7378a;
        w.c(this, this);
        c0.f(this, new a3.b(this, 1));
    }

    @Override // d2.a
    public final void a(int i3, i0 i0Var) {
        i0Var.X(1735448596);
        int i10 = (i0Var.h(this) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 3) != 2)) {
            ((Function2) this.f1072y.getValue()).invoke(i0Var, 0);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new e(this, i3, 1);
        }
    }

    @Override // o3.i
    public final k1 b(View view, k1 k1Var) {
        if (!this.A) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return k1Var.f7415a.r(max, max2, max3, max4);
            }
        }
        return k1Var;
    }

    @Override // d2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    @Override // d2.a
    public final void h(int i3, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i13 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i14 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // d2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i3, int i10) {
        int i11;
        int i12;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i3, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        Window window = this.f1071x;
        if (mode2 == Integer.MIN_VALUE && !this.f1073z && window.getAttributes().height == -2) {
            if (this.A) {
                int i13 = Build.VERSION.SDK_INT;
                if (i13 < 30) {
                    i11 = i.f1066a.a(window);
                } else if (i13 < 32) {
                    i11 = k.f1068a.a(window);
                }
            } else {
                i11 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i12 = size - paddingRight;
            if (i12 < 0) {
                i12 = 0;
            }
            int i14 = i11 - paddingBottom;
            int i15 = i14 >= 0 ? i14 : 0;
            mode = View.MeasureSpec.getMode(i3);
            if (mode != 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
            }
            childAt.measure(i3, i10);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.A && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.f1073z) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i11 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i12 = size - paddingRight2;
        if (i12 < 0) {
        }
        int i142 = i11 - paddingBottom2;
        if (i142 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i3);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i3, i10);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.A) {
        }
    }
}
