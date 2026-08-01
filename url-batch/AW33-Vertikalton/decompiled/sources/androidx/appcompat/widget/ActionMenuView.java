package androidx.appcompat.widget;

import H0.e;
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
import k.C0159o;
import k.InterfaceC0140A;
import k.InterfaceC0156l;
import k.MenuC0157m;
import l.AbstractC0271y0;
import l.C0234g;
import l.C0240j;
import l.C0242k;
import l.C0244l;
import l.C0248n;
import l.C0269x0;
import l.InterfaceC0246m;
import l.InterfaceC0250o;
import l.W0;
import l.i1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0271y0 implements InterfaceC0156l, InterfaceC0140A {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0157m f1180p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1181q;

    /* renamed from: r, reason: collision with root package name */
    public int f1182r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1183s;

    /* renamed from: t, reason: collision with root package name */
    public C0244l f1184t;

    /* renamed from: u, reason: collision with root package name */
    public W0 f1185u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1186v;

    /* renamed from: w, reason: collision with root package name */
    public int f1187w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1188x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1189y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0250o f1190z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1188x = (int) (56.0f * f2);
        this.f1189y = (int) (f2 * 4.0f);
        this.f1181q = context;
        this.f1182r = 0;
    }

    public static C0248n j() {
        C0248n c0248n = new C0248n(-2, -2);
        c0248n.f3024a = false;
        ((LinearLayout.LayoutParams) c0248n).gravity = 16;
        return c0248n;
    }

    public static C0248n k(ViewGroup.LayoutParams layoutParams) {
        C0248n c0248n;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0248n) {
            C0248n c0248n2 = (C0248n) layoutParams;
            c0248n = new C0248n(c0248n2);
            c0248n.f3024a = c0248n2.f3024a;
        } else {
            c0248n = new C0248n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0248n).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0248n).gravity = 16;
        }
        return c0248n;
    }

    @Override // k.InterfaceC0156l
    public final boolean b(C0159o c0159o) {
        return this.f1180p.q(c0159o, null, 0);
    }

    @Override // k.InterfaceC0140A
    public final void c(MenuC0157m menuC0157m) {
        this.f1180p = menuC0157m;
    }

    @Override // l.AbstractC0271y0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0248n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0271y0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0269x0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0271y0
    /* renamed from: g */
    public final C0269x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0248n(getContext(), attributeSet);
    }

    @Override // l.AbstractC0271y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0271y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1180p == null) {
            Context context = getContext();
            MenuC0157m menuC0157m = new MenuC0157m(context);
            this.f1180p = menuC0157m;
            menuC0157m.f2684e = new C0242k(this);
            C0244l c0244l = new C0244l(context);
            this.f1184t = c0244l;
            c0244l.f3012l = true;
            c0244l.f3013m = true;
            c0244l.f3007e = new e(25);
            this.f1180p.b(c0244l, this.f1181q);
            C0244l c0244l2 = this.f1184t;
            c0244l2.h = this;
            this.f1180p = c0244l2.f3006c;
        }
        return this.f1180p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0244l c0244l = this.f1184t;
        C0240j c0240j = c0244l.i;
        if (c0240j != null) {
            return c0240j.getDrawable();
        }
        if (c0244l.f3011k) {
            return c0244l.f3010j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1182r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0271y0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0269x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0246m)) {
            z2 = ((InterfaceC0246m) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0246m)) ? z2 : z2 | ((InterfaceC0246m) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0244l c0244l = this.f1184t;
        if (c0244l != null) {
            c0244l.c();
            if (this.f1184t.i()) {
                this.f1184t.f();
                this.f1184t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0244l c0244l = this.f1184t;
        if (c0244l != null) {
            c0244l.f();
            C0234g c0234g = c0244l.f3020t;
            if (c0234g == null || !c0234g.b()) {
                return;
            }
            c0234g.i.dismiss();
        }
    }

    @Override // l.AbstractC0271y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1186v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = i1.f2997a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0248n c0248n = (C0248n) childAt.getLayoutParams();
                if (c0248n.f3024a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0248n).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0248n).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0248n).leftMargin) + ((LinearLayout.LayoutParams) c0248n).rightMargin;
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
                C0248n c0248n2 = (C0248n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0248n2.f3024a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0248n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0248n2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0248n c0248n3 = (C0248n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0248n3.f3024a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0248n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0248n3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0271y0, android.view.View
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
        MenuC0157m menuC0157m;
        boolean z4 = this.f1186v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1186v = z5;
        if (z4 != z5) {
            this.f1187w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1186v && (menuC0157m = this.f1180p) != null && size != this.f1187w) {
            this.f1187w = size;
            menuC0157m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1186v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0248n c0248n = (C0248n) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0248n).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0248n).leftMargin = 0;
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
        int i13 = this.f1188x;
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
            i3 = this.f1189y;
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
                C0248n c0248n2 = (C0248n) childAt.getLayoutParams();
                c0248n2.f3028f = false;
                c0248n2.f3026c = 0;
                c0248n2.f3025b = 0;
                c0248n2.d = false;
                ((LinearLayout.LayoutParams) c0248n2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0248n2).rightMargin = 0;
                c0248n2.f3027e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0248n2.f3024a ? 1 : i14;
                C0248n c0248n3 = (C0248n) childAt.getLayoutParams();
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
                c0248n3.d = !c0248n3.f3024a && z8;
                c0248n3.f3025b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0248n2.d) {
                    i21++;
                }
                if (c0248n2.f3024a) {
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
                C0248n c0248n4 = (C0248n) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0248n4.d) {
                    int i32 = c0248n4.f3025b;
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
                C0248n c0248n5 = (C0248n) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0248n5.f3027e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0248n5.f3025b += r4;
                    c0248n5.f3028f = r4;
                    i14--;
                } else if (c0248n5.f3025b == i33) {
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
                if ((j2 & 1) != 0 && !((C0248n) getChildAt(0).getLayoutParams()).f3027e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0248n) getChildAt(i41).getLayoutParams()).f3027e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0248n c0248n6 = (C0248n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0248n6.f3026c = i42;
                        c0248n6.f3028f = true;
                        if (i43 == 0 && !c0248n6.f3027e) {
                            ((LinearLayout.LayoutParams) c0248n6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0248n6.f3024a) {
                            c0248n6.f3026c = i42;
                            c0248n6.f3028f = true;
                            ((LinearLayout.LayoutParams) c0248n6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0248n6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0248n6).rightMargin = i42 / 2;
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
                C0248n c0248n7 = (C0248n) childAt4.getLayoutParams();
                if (c0248n7.f3028f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0248n7.f3025b * i16) + c0248n7.f3026c, 1073741824), i7);
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
        this.f1184t.f3017q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0250o interfaceC0250o) {
        this.f1190z = interfaceC0250o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0244l c0244l = this.f1184t;
        C0240j c0240j = c0244l.i;
        if (c0240j != null) {
            c0240j.setImageDrawable(drawable);
        } else {
            c0244l.f3011k = true;
            c0244l.f3010j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1183s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1182r != i) {
            this.f1182r = i;
            if (i == 0) {
                this.f1181q = getContext();
            } else {
                this.f1181q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0244l c0244l) {
        this.f1184t = c0244l;
        c0244l.h = this;
        this.f1180p = c0244l.f3006c;
    }

    @Override // l.AbstractC0271y0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0248n(getContext(), attributeSet);
    }
}
