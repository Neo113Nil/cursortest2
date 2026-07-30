package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.ar0;
import defpackage.b3;
import defpackage.by1;
import defpackage.c63;
import defpackage.cl1;
import defpackage.cy2;
import defpackage.d3;
import defpackage.e3;
import defpackage.ek1;
import defpackage.f3;
import defpackage.fk1;
import defpackage.g3;
import defpackage.h3;
import defpackage.lk1;
import defpackage.yd1;
import defpackage.zd1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ActionMenuView extends zd1 implements ek1, cl1 {
    public fk1 B;
    public Context C;
    public int D;
    public boolean E;
    public e3 F;
    public cy2 G;
    public boolean H;
    public int I;
    public final int J;
    public final int K;
    public h3 L;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.J = (int) (56.0f * f);
        this.K = (int) (f * 4.0f);
        this.C = context;
        this.D = 0;
    }

    public static g3 i() {
        g3 g3Var = new g3(-2, -2);
        g3Var.a = false;
        ((LinearLayout.LayoutParams) g3Var).gravity = 16;
        return g3Var;
    }

    public static g3 j(ViewGroup.LayoutParams layoutParams) {
        g3 g3Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof g3) {
            g3 g3Var2 = (g3) layoutParams;
            g3Var = new g3(g3Var2);
            g3Var.a = g3Var2.a;
        } else {
            g3Var = new g3(layoutParams);
        }
        if (((LinearLayout.LayoutParams) g3Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) g3Var).gravity = 16;
        }
        return g3Var;
    }

    @Override // defpackage.ek1
    public final boolean a(lk1 lk1Var) {
        return this.B.q(lk1Var, null, 0);
    }

    @Override // defpackage.cl1
    public final void b(fk1 fk1Var) {
        this.B = fk1Var;
    }

    @Override // defpackage.zd1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g3;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.zd1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ yd1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.zd1
    /* renamed from: f */
    public final yd1 generateLayoutParams(AttributeSet attributeSet) {
        return new g3(getContext(), attributeSet);
    }

    @Override // defpackage.zd1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ yd1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.zd1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.zd1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g3(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.B == null) {
            Context context = getContext();
            fk1 fk1Var = new fk1(context);
            this.B = fk1Var;
            fk1Var.e = new ar0(6, this);
            e3 e3Var = new e3(context);
            this.F = e3Var;
            e3Var.x = true;
            e3Var.y = true;
            e3Var.q = new by1(23);
            this.B.b(e3Var, this.C);
            e3 e3Var2 = this.F;
            e3Var2.t = this;
            this.B = e3Var2.o;
        }
        return this.B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        e3 e3Var = this.F;
        d3 d3Var = e3Var.u;
        if (d3Var != null) {
            return d3Var.getDrawable();
        }
        if (e3Var.w) {
            return e3Var.v;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof f3)) {
            z = ((f3) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof f3)) ? z : ((f3) childAt2).c() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.g();
            if (this.F.h()) {
                this.F.c();
                this.F.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.c();
            b3 b3Var = e3Var.F;
            if (b3Var == null || !b3Var.b()) {
                return;
            }
            b3Var.i.dismiss();
        }
    }

    @Override // defpackage.zd1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.H) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = c63.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                g3 g3Var = (g3) childAt.getLayoutParams();
                if (g3Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) g3Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) g3Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) g3Var).leftMargin) + ((LinearLayout.LayoutParams) g3Var).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                g3 g3Var2 = (g3) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !g3Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) g3Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) g3Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            g3 g3Var3 = (g3) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !g3Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) g3Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) g3Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.zd1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        fk1 fk1Var;
        boolean z = this.H;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.H = z2;
        if (z != z2) {
            this.I = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.H && (fk1Var = this.B) != null && size != this.I) {
            this.I = size;
            fk1Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.H || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                g3 g3Var = (g3) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) g3Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) g3Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.J;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.K;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                g3 g3Var2 = (g3) childAt.getLayoutParams();
                g3Var2.f = false;
                g3Var2.c = 0;
                g3Var2.b = 0;
                g3Var2.d = false;
                ((LinearLayout.LayoutParams) g3Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) g3Var2).rightMargin = 0;
                g3Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = g3Var2.a ? 1 : i10;
                g3 g3Var3 = (g3) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                g3Var3.d = !g3Var3.a && z6;
                g3Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (g3Var2.d) {
                    i17++;
                }
                if (g3Var2.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                g3 g3Var4 = (g3) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (g3Var4.d) {
                    int i30 = g3Var4.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                g3 g3Var5 = (g3) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && g3Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    g3Var5.b += r11;
                    g3Var5.f = r11;
                    i25--;
                } else if (g3Var5.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((g3) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((g3) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    g3 g3Var6 = (g3) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        g3Var6.c = i34;
                        g3Var6.f = true;
                        if (i35 == 0 && !g3Var6.e) {
                            ((LinearLayout.LayoutParams) g3Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (g3Var6.a) {
                        g3Var6.c = i34;
                        g3Var6.f = true;
                        ((LinearLayout.LayoutParams) g3Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) g3Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) g3Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                g3 g3Var7 = (g3) childAt4.getLayoutParams();
                if (g3Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((g3Var7.b * i24) + g3Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.F.C = z;
    }

    public void setOnMenuItemClickListener(h3 h3Var) {
        this.L = h3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        e3 e3Var = this.F;
        d3 d3Var = e3Var.u;
        if (d3Var != null) {
            d3Var.setImageDrawable(drawable);
        } else {
            e3Var.w = true;
            e3Var.v = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.E = z;
    }

    public void setPopupTheme(int i) {
        if (this.D != i) {
            this.D = i;
            if (i == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(e3 e3Var) {
        this.F = e3Var;
        e3Var.t = this;
        this.B = e3Var.o;
    }

    @Override // defpackage.zd1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }
}
