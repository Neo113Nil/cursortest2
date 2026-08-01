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
import defpackage.bu;
import defpackage.d1;
import defpackage.dh;
import defpackage.dq;
import defpackage.e8;
import defpackage.eq;
import defpackage.eu;
import defpackage.g1;
import defpackage.h1;
import defpackage.i1;
import defpackage.j1;
import defpackage.k0;
import defpackage.k1;
import defpackage.kt;
import defpackage.lt;
import defpackage.mt;
import defpackage.pt;
import defpackage.v90;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ActionMenuView extends eq implements lt, eu {
    public kt A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public k1 F;
    public mt u;
    public Context v;
    public int w;
    public boolean x;
    public h1 y;
    public e8 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f);
        this.E = (int) (f * 4.0f);
        this.v = context;
        this.w = 0;
    }

    public static j1 j() {
        j1 j1Var = new j1(-2, -2);
        j1Var.a = false;
        ((LinearLayout.LayoutParams) j1Var).gravity = 16;
        return j1Var;
    }

    public static j1 k(ViewGroup.LayoutParams layoutParams) {
        j1 j1Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof j1) {
            j1 j1Var2 = (j1) layoutParams;
            j1Var = new j1(j1Var2);
            j1Var.a = j1Var2.a;
        } else {
            j1Var = new j1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) j1Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) j1Var).gravity = 16;
        }
        return j1Var;
    }

    @Override // defpackage.lt
    public final boolean a(pt ptVar) {
        return this.u.q(ptVar, null, 0);
    }

    @Override // defpackage.eu
    public final void b(mt mtVar) {
        this.u = mtVar;
    }

    @Override // defpackage.eq, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.eq
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ dq generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.eq
    /* renamed from: g */
    public final dq generateLayoutParams(AttributeSet attributeSet) {
        return new j1(getContext(), attributeSet);
    }

    @Override // defpackage.eq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.eq, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j1(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.u == null) {
            Context context = getContext();
            mt mtVar = new mt(context);
            this.u = mtVar;
            mtVar.e = new k0(2, this);
            h1 h1Var = new h1(context);
            this.y = h1Var;
            h1Var.q = true;
            h1Var.r = true;
            bu buVar = this.z;
            if (buVar == null) {
                buVar = new dh(10);
            }
            h1Var.j = buVar;
            this.u.b(h1Var, this.v);
            h1 h1Var2 = this.y;
            h1Var2.m = this;
            this.u = h1Var2.h;
        }
        return this.u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h1 h1Var = this.y;
        g1 g1Var = h1Var.n;
        if (g1Var != null) {
            return g1Var.getDrawable();
        }
        if (h1Var.p) {
            return h1Var.o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.eq
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ dq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof i1)) {
            z = ((i1) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof i1)) ? z : ((i1) childAt2).b() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h1 h1Var = this.y;
        if (h1Var != null) {
            h1Var.g();
            if (this.y.h()) {
                this.y.d();
                this.y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1 h1Var = this.y;
        if (h1Var != null) {
            h1Var.d();
            d1 d1Var = h1Var.y;
            if (d1Var == null || !d1Var.b()) {
                return;
            }
            d1Var.j.dismiss();
        }
    }

    @Override // defpackage.eq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = v90.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                j1 j1Var = (j1) childAt.getLayoutParams();
                if (j1Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) j1Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) j1Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) j1Var).leftMargin) + ((LinearLayout.LayoutParams) j1Var).rightMargin;
                    l(i10);
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
                j1 j1Var2 = (j1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !j1Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) j1Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) j1Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            j1 j1Var3 = (j1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !j1Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) j1Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) j1Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.eq, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        mt mtVar;
        boolean z = this.B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.B = z2;
        if (z != z2) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.B && (mtVar = this.u) != null && size != this.C) {
            this.C = size;
            mtVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.B || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                j1 j1Var = (j1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) j1Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) j1Var).leftMargin = 0;
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
        int i9 = this.D;
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
            i3 = this.E;
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
                j1 j1Var2 = (j1) childAt.getLayoutParams();
                j1Var2.f = false;
                j1Var2.c = 0;
                j1Var2.b = 0;
                j1Var2.d = false;
                ((LinearLayout.LayoutParams) j1Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) j1Var2).rightMargin = 0;
                j1Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = j1Var2.a ? 1 : i10;
                j1 j1Var3 = (j1) childAt.getLayoutParams();
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
                j1Var3.d = !j1Var3.a && z6;
                j1Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (j1Var2.d) {
                    i17++;
                }
                if (j1Var2.a) {
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
                j1 j1Var4 = (j1) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (j1Var4.d) {
                    int i30 = j1Var4.b;
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
                j1 j1Var5 = (j1) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && j1Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    j1Var5.b += r11;
                    j1Var5.f = r11;
                    i25--;
                } else if (j1Var5.b == i31) {
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
                if ((j & 1) != 0 && !((j1) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((j1) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    j1 j1Var6 = (j1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        j1Var6.c = i34;
                        j1Var6.f = true;
                        if (i35 == 0 && !j1Var6.e) {
                            ((LinearLayout.LayoutParams) j1Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (j1Var6.a) {
                        j1Var6.c = i34;
                        j1Var6.f = true;
                        ((LinearLayout.LayoutParams) j1Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) j1Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) j1Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                j1 j1Var7 = (j1) childAt4.getLayoutParams();
                if (j1Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((j1Var7.b * i24) + j1Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.y.v = z;
    }

    public void setOnMenuItemClickListener(k1 k1Var) {
        this.F = k1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h1 h1Var = this.y;
        g1 g1Var = h1Var.n;
        if (g1Var != null) {
            g1Var.setImageDrawable(drawable);
        } else {
            h1Var.p = true;
            h1Var.o = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.x = z;
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(h1 h1Var) {
        this.y = h1Var;
        h1Var.m = this;
        this.u = h1Var.h;
    }

    @Override // defpackage.eq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
