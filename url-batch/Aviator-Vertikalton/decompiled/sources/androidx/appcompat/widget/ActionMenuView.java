package androidx.appcompat.widget;

import H0.e;
import I.g;
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
import k.C0202o;
import k.InterfaceC0183A;
import k.InterfaceC0198k;
import k.InterfaceC0199l;
import k.InterfaceC0211x;
import k.MenuC0200m;
import l.AbstractC0299z0;
import l.C0260g;
import l.C0266j;
import l.C0268k;
import l.C0272m;
import l.C0274n;
import l.C0297y0;
import l.InterfaceC0270l;
import l.InterfaceC0276o;
import l.j1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0299z0 implements InterfaceC0199l, InterfaceC0183A {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0276o f1035A;

    /* renamed from: p, reason: collision with root package name */
    public MenuC0200m f1036p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1037q;

    /* renamed from: r, reason: collision with root package name */
    public int f1038r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1039s;

    /* renamed from: t, reason: collision with root package name */
    public C0268k f1040t;

    /* renamed from: u, reason: collision with root package name */
    public g f1041u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0198k f1042v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1043w;

    /* renamed from: x, reason: collision with root package name */
    public int f1044x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1045y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1046z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1045y = (int) (56.0f * f2);
        this.f1046z = (int) (f2 * 4.0f);
        this.f1037q = context;
        this.f1038r = 0;
    }

    public static C0272m j() {
        C0272m c0272m = new C0272m(-2, -2);
        c0272m.f3410a = false;
        ((LinearLayout.LayoutParams) c0272m).gravity = 16;
        return c0272m;
    }

    public static C0272m k(ViewGroup.LayoutParams layoutParams) {
        C0272m c0272m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0272m) {
            C0272m c0272m2 = (C0272m) layoutParams;
            c0272m = new C0272m(c0272m2);
            c0272m.f3410a = c0272m2.f3410a;
        } else {
            c0272m = new C0272m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0272m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0272m).gravity = 16;
        }
        return c0272m;
    }

    @Override // k.InterfaceC0199l
    public final boolean b(C0202o c0202o) {
        return this.f1036p.q(c0202o, null, 0);
    }

    @Override // k.InterfaceC0183A
    public final void c(MenuC0200m menuC0200m) {
        this.f1036p = menuC0200m;
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0272m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0299z0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0297y0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0299z0
    /* renamed from: g */
    public final C0297y0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0272m(getContext(), attributeSet);
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1036p == null) {
            Context context = getContext();
            MenuC0200m menuC0200m = new MenuC0200m(context);
            this.f1036p = menuC0200m;
            menuC0200m.f3061e = new C0274n(this);
            C0268k c0268k = new C0268k(context);
            this.f1040t = c0268k;
            c0268k.f3395l = true;
            c0268k.f3396m = true;
            InterfaceC0211x interfaceC0211x = this.f1041u;
            if (interfaceC0211x == null) {
                interfaceC0211x = new e(26);
            }
            c0268k.f3390e = interfaceC0211x;
            this.f1036p.b(c0268k, this.f1037q);
            C0268k c0268k2 = this.f1040t;
            c0268k2.h = this;
            this.f1036p = c0268k2.f3388c;
        }
        return this.f1036p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0268k c0268k = this.f1040t;
        C0266j c0266j = c0268k.i;
        if (c0266j != null) {
            return c0266j.getDrawable();
        }
        if (c0268k.f3394k) {
            return c0268k.f3393j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1038r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0299z0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0297y0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0270l)) {
            z2 = ((InterfaceC0270l) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0270l)) ? z2 : z2 | ((InterfaceC0270l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0268k c0268k = this.f1040t;
        if (c0268k != null) {
            c0268k.c();
            if (this.f1040t.i()) {
                this.f1040t.f();
                this.f1040t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0268k c0268k = this.f1040t;
        if (c0268k != null) {
            c0268k.f();
            C0260g c0260g = c0268k.f3403t;
            if (c0260g == null || !c0260g.b()) {
                return;
            }
            c0260g.i.dismiss();
        }
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1043w) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = j1.f3383a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0272m c0272m = (C0272m) childAt.getLayoutParams();
                if (c0272m.f3410a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0272m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0272m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0272m).leftMargin) + ((LinearLayout.LayoutParams) c0272m).rightMargin;
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
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0272m c0272m2 = (C0272m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0272m2.f3410a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0272m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0272m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0272m c0272m3 = (C0272m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0272m3.f3410a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0272m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0272m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0299z0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC0200m menuC0200m;
        boolean z4 = this.f1043w;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1043w = z5;
        if (z4 != z5) {
            this.f1044x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1043w && (menuC0200m = this.f1036p) != null && size != this.f1044x) {
            this.f1044x = size;
            menuC0200m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1043w || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0272m c0272m = (C0272m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0272m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0272m).leftMargin = 0;
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
        int i12 = size2 - paddingRight;
        int i13 = this.f1045y;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f1046z;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0272m c0272m2 = (C0272m) childAt.getLayoutParams();
                c0272m2.f3415f = false;
                c0272m2.f3412c = 0;
                c0272m2.f3411b = 0;
                c0272m2.f3413d = false;
                ((LinearLayout.LayoutParams) c0272m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0272m2).rightMargin = 0;
                c0272m2.f3414e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0272m2.f3410a ? 1 : i14;
                C0272m c0272m3 = (C0272m) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z8 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c0272m3.f3413d = !c0272m3.f3410a && z8;
                c0272m3.f3411b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0272m2.f3413d) {
                    i21++;
                }
                if (c0272m2.f3410a) {
                    z6 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                C0272m c0272m4 = (C0272m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0272m4.f3413d) {
                    int i32 = c0272m4.f3411b;
                    if (i32 < i29) {
                        j3 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j3 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0272m c0272m5 = (C0272m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0272m5.f3414e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0272m5.f3411b += r4;
                    c0272m5.f3415f = r4;
                    i14--;
                } else if (c0272m5.f3411b == i33) {
                    j2 |= j4;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z10 = true;
        }
        z2 = z10;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i14 <= 0 || j2 == 0 || (i14 >= i18 - 1 && !z12 && i19 <= 1)) {
            i4 = i40;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0272m) getChildAt(0).getLayoutParams()).f3414e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0272m) getChildAt(i41).getLayoutParams()).f3414e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0272m c0272m6 = (C0272m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0272m6.f3412c = i42;
                        c0272m6.f3415f = true;
                        if (i43 == 0 && !c0272m6.f3414e) {
                            ((LinearLayout.LayoutParams) c0272m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0272m6.f3410a) {
                            c0272m6.f3412c = i42;
                            c0272m6.f3415f = true;
                            ((LinearLayout.LayoutParams) c0272m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0272m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0272m6).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C0272m c0272m7 = (C0272m) childAt4.getLayoutParams();
                if (c0272m7.f3415f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0272m7.f3411b * i16) + c0272m7.f3412c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1040t.f3400q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0276o interfaceC0276o) {
        this.f1035A = interfaceC0276o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0268k c0268k = this.f1040t;
        C0266j c0266j = c0268k.i;
        if (c0266j != null) {
            c0266j.setImageDrawable(drawable);
        } else {
            c0268k.f3394k = true;
            c0268k.f3393j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1039s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1038r != i) {
            this.f1038r = i;
            if (i == 0) {
                this.f1037q = getContext();
            } else {
                this.f1037q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0268k c0268k) {
        this.f1040t = c0268k;
        c0268k.h = this;
        this.f1036p = c0268k.f3388c;
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0272m(getContext(), attributeSet);
    }
}
