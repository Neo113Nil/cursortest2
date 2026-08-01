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
import defpackage.e1;
import defpackage.ed0;
import defpackage.ej;
import defpackage.fx;
import defpackage.h1;
import defpackage.i1;
import defpackage.j1;
import defpackage.k1;
import defpackage.l1;
import defpackage.l90;
import defpackage.lw;
import defpackage.mw;
import defpackage.qw;
import defpackage.rc0;
import defpackage.rs;
import defpackage.ss;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ActionMenuView extends ss implements lw, fx {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public l1 E;
    public mw u;
    public Context v;
    public int w;
    public boolean x;
    public i1 y;
    public l90 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f);
        this.D = (int) (f * 4.0f);
        this.v = context;
        this.w = 0;
    }

    public static k1 j() {
        k1 k1Var = new k1(-2, -2);
        k1Var.a = false;
        ((LinearLayout.LayoutParams) k1Var).gravity = 16;
        return k1Var;
    }

    public static k1 k(ViewGroup.LayoutParams layoutParams) {
        k1 k1Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof k1) {
            k1 k1Var2 = (k1) layoutParams;
            k1Var = new k1(k1Var2);
            k1Var.a = k1Var2.a;
        } else {
            k1Var = new k1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) k1Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) k1Var).gravity = 16;
        }
        return k1Var;
    }

    @Override // defpackage.lw
    public final boolean a(qw qwVar) {
        return this.u.q(qwVar, null, 0);
    }

    @Override // defpackage.fx
    public final void b(mw mwVar) {
        this.u = mwVar;
    }

    @Override // defpackage.ss, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.ss
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ rs generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.ss
    /* renamed from: g */
    public final rs generateLayoutParams(AttributeSet attributeSet) {
        return new k1(getContext(), attributeSet);
    }

    @Override // defpackage.ss, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.ss, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k1(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.u == null) {
            Context context = getContext();
            mw mwVar = new mw(context);
            this.u = mwVar;
            mwVar.e = new rc0(3, this);
            i1 i1Var = new i1(context);
            this.y = i1Var;
            i1Var.q = true;
            i1Var.r = true;
            i1Var.j = new ej(13);
            this.u.b(i1Var, this.v);
            i1 i1Var2 = this.y;
            i1Var2.m = this;
            this.u = i1Var2.h;
        }
        return this.u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        i1 i1Var = this.y;
        h1 h1Var = i1Var.n;
        if (h1Var != null) {
            return h1Var.getDrawable();
        }
        if (i1Var.p) {
            return i1Var.o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.ss
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ rs generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof j1)) {
            z = ((j1) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof j1)) ? z : ((j1) childAt2).b() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i1 i1Var = this.y;
        if (i1Var != null) {
            i1Var.g();
            if (this.y.i()) {
                this.y.d();
                this.y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i1 i1Var = this.y;
        if (i1Var != null) {
            i1Var.d();
            e1 e1Var = i1Var.y;
            if (e1Var == null || !e1Var.b()) {
                return;
            }
            e1Var.j.dismiss();
        }
    }

    @Override // defpackage.ss, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = ed0.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                k1 k1Var = (k1) childAt.getLayoutParams();
                if (k1Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) k1Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) k1Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) k1Var).leftMargin) + ((LinearLayout.LayoutParams) k1Var).rightMargin;
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
                k1 k1Var2 = (k1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !k1Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) k1Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) k1Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            k1 k1Var3 = (k1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !k1Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) k1Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) k1Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.ss, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        mw mwVar;
        boolean z = this.A;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z2;
        if (z != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.A && (mwVar = this.u) != null && size != this.B) {
            this.B = size;
            mwVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                k1 k1Var = (k1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) k1Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) k1Var).leftMargin = 0;
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
        int i9 = this.C;
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
            i3 = this.D;
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
                k1 k1Var2 = (k1) childAt.getLayoutParams();
                k1Var2.f = false;
                k1Var2.c = 0;
                k1Var2.b = 0;
                k1Var2.d = false;
                ((LinearLayout.LayoutParams) k1Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) k1Var2).rightMargin = 0;
                k1Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = k1Var2.a ? 1 : i10;
                k1 k1Var3 = (k1) childAt.getLayoutParams();
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
                k1Var3.d = !k1Var3.a && z6;
                k1Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (k1Var2.d) {
                    i17++;
                }
                if (k1Var2.a) {
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
                k1 k1Var4 = (k1) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (k1Var4.d) {
                    int i30 = k1Var4.b;
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
                k1 k1Var5 = (k1) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && k1Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    k1Var5.b += r11;
                    k1Var5.f = r11;
                    i25--;
                } else if (k1Var5.b == i31) {
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
                if ((j & 1) != 0 && !((k1) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((k1) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    k1 k1Var6 = (k1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        k1Var6.c = i34;
                        k1Var6.f = true;
                        if (i35 == 0 && !k1Var6.e) {
                            ((LinearLayout.LayoutParams) k1Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (k1Var6.a) {
                        k1Var6.c = i34;
                        k1Var6.f = true;
                        ((LinearLayout.LayoutParams) k1Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) k1Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) k1Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                k1 k1Var7 = (k1) childAt4.getLayoutParams();
                if (k1Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((k1Var7.b * i24) + k1Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.y.v = z;
    }

    public void setOnMenuItemClickListener(l1 l1Var) {
        this.E = l1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        i1 i1Var = this.y;
        h1 h1Var = i1Var.n;
        if (h1Var != null) {
            h1Var.setImageDrawable(drawable);
        } else {
            i1Var.p = true;
            i1Var.o = drawable;
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

    public void setPresenter(i1 i1Var) {
        this.y = i1Var;
        i1Var.m = this;
        this.u = i1Var.h;
    }

    @Override // defpackage.ss, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
