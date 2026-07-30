package androidx.appcompat.widget;

import B6.e;
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
import m.InterfaceC0673B;
import m.k;
import m.l;
import m.m;
import m.o;
import m.y;
import n.A0;
import n.B0;
import n.C0708f;
import n.C0714i;
import n.C0716j;
import n.C0720l;
import n.InterfaceC0718k;
import n.InterfaceC0722m;
import n.z1;
import q1.h;

/* loaded from: classes.dex */
public class ActionMenuView extends B0 implements l, InterfaceC0673B {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3195A;

    /* renamed from: B, reason: collision with root package name */
    public C0716j f3196B;

    /* renamed from: C, reason: collision with root package name */
    public e f3197C;

    /* renamed from: D, reason: collision with root package name */
    public k f3198D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3199E;

    /* renamed from: F, reason: collision with root package name */
    public int f3200F;

    /* renamed from: G, reason: collision with root package name */
    public final int f3201G;

    /* renamed from: H, reason: collision with root package name */
    public final int f3202H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC0722m f3203I;

    /* renamed from: x, reason: collision with root package name */
    public m f3204x;

    /* renamed from: y, reason: collision with root package name */
    public Context f3205y;

    /* renamed from: z, reason: collision with root package name */
    public int f3206z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f3201G = (int) (56.0f * f7);
        this.f3202H = (int) (f7 * 4.0f);
        this.f3205y = context;
        this.f3206z = 0;
    }

    public static C0720l i() {
        C0720l c0720l = new C0720l(-2, -2);
        c0720l.f6832a = false;
        ((LinearLayout.LayoutParams) c0720l).gravity = 16;
        return c0720l;
    }

    public static C0720l j(ViewGroup.LayoutParams layoutParams) {
        C0720l c0720l;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C0720l) {
            C0720l c0720l2 = (C0720l) layoutParams;
            c0720l = new C0720l(c0720l2);
            c0720l.f6832a = c0720l2.f6832a;
        } else {
            c0720l = new C0720l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0720l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0720l).gravity = 16;
        }
        return c0720l;
    }

    @Override // m.InterfaceC0673B
    public final void a(m mVar) {
        this.f3204x = mVar;
    }

    @Override // m.l
    public final boolean b(o oVar) {
        return this.f3204x.q(oVar, null, 0);
    }

    @Override // n.B0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0720l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // n.B0
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ A0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // n.B0
    /* renamed from: f */
    public final A0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0720l(getContext(), attributeSet);
    }

    @Override // n.B0
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ A0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // n.B0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // n.B0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3204x == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f3204x = mVar;
            mVar.f6414e = new l4.b(3, this);
            C0716j c0716j = new C0716j(context);
            this.f3196B = c0716j;
            c0716j.f6809t = true;
            c0716j.f6810u = true;
            y yVar = this.f3197C;
            if (yVar == null) {
                yVar = new h(25);
            }
            c0716j.f6802m = yVar;
            this.f3204x.b(c0716j, this.f3205y);
            C0716j c0716j2 = this.f3196B;
            c0716j2.f6805p = this;
            this.f3204x = c0716j2.f6800i;
        }
        return this.f3204x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0716j c0716j = this.f3196B;
        C0714i c0714i = c0716j.f6806q;
        if (c0714i != null) {
            return c0714i.getDrawable();
        }
        if (c0716j.f6808s) {
            return c0716j.f6807r;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3206z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i2) {
        boolean z7 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0718k)) {
            z7 = ((InterfaceC0718k) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0718k)) ? z7 : ((InterfaceC0718k) childAt2).c() | z7;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0716j c0716j = this.f3196B;
        if (c0716j != null) {
            c0716j.d();
            if (this.f3196B.e()) {
                this.f3196B.c();
                this.f3196B.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0716j c0716j = this.f3196B;
        if (c0716j != null) {
            c0716j.c();
            C0708f c0708f = c0716j.f6794B;
            if (c0708f == null || !c0708f.b()) {
                return;
            }
            c0708f.f6484i.dismiss();
        }
    }

    @Override // n.B0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int width;
        int i9;
        if (!this.f3199E) {
            super.onLayout(z7, i2, i5, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i8 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i7 - i2;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean a7 = z1.a(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0720l c0720l = (C0720l) childAt.getLayoutParams();
                if (c0720l.f6832a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a7) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0720l).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0720l).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0720l).leftMargin) + ((LinearLayout.LayoutParams) c0720l).rightMargin;
                    k(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (a7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C0720l c0720l2 = (C0720l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0720l2.f6832a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) c0720l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0720l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            C0720l c0720l3 = (C0720l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0720l3.f6832a) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) c0720l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0720l3).rightMargin + max + i23;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // n.B0, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        int i8;
        ?? r11;
        int i9;
        int i10;
        m mVar;
        boolean z7 = this.f3199E;
        boolean z8 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f3199E = z8;
        if (z7 != z8) {
            this.f3200F = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f3199E && (mVar = this.f3204x) != null && size != this.f3200F) {
            this.f3200F = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f3199E || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0720l c0720l = (C0720l) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0720l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0720l).leftMargin = 0;
            }
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f3201G;
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
        boolean z9 = false;
        int i21 = 0;
        long j = 0;
        while (true) {
            i7 = this.f3202H;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i9 = i16;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z10) {
                    childAt.setPadding(i7, 0, i7, 0);
                }
                C0720l c0720l2 = (C0720l) childAt.getLayoutParams();
                c0720l2.f6837f = false;
                c0720l2.f6834c = 0;
                c0720l2.f6833b = 0;
                c0720l2.f6835d = false;
                ((LinearLayout.LayoutParams) c0720l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0720l2).rightMargin = 0;
                c0720l2.f6836e = z10 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i24 = c0720l2.f6832a ? 1 : i14;
                C0720l c0720l3 = (C0720l) childAt.getLayoutParams();
                int i25 = i14;
                i9 = i16;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i23, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z10 ? (ActionMenuItemView) childAt : null;
                boolean z11 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z12 = z11;
                if (i24 <= 0 || (z11 && i24 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i24, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i9;
                    if (measuredWidth % i9 != 0) {
                        i10++;
                    }
                    if (z12 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c0720l3.f6835d = !c0720l3.f6832a && z12;
                c0720l3.f6833b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i9, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0720l2.f6835d) {
                    i21++;
                }
                if (c0720l2.f6832a) {
                    z9 = true;
                }
                i14 = i25 - i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j |= 1 << i20;
                }
            }
            i20++;
            size3 = i22;
            paddingBottom = i23;
            i16 = i9;
        }
        int i26 = size3;
        int i27 = i14;
        int i28 = i16;
        boolean z13 = z9 && i18 == 2;
        int i29 = i27;
        boolean z14 = false;
        while (i21 > 0 && i29 > 0) {
            int i30 = Integer.MAX_VALUE;
            long j7 = 0;
            int i31 = 0;
            int i32 = 0;
            while (i32 < childCount2) {
                int i33 = i17;
                C0720l c0720l4 = (C0720l) getChildAt(i32).getLayoutParams();
                boolean z15 = z13;
                if (c0720l4.f6835d) {
                    int i34 = c0720l4.f6833b;
                    if (i34 < i30) {
                        j7 = 1 << i32;
                        i30 = i34;
                        i31 = 1;
                    } else if (i34 == i30) {
                        j7 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z13 = z15;
                i17 = i33;
            }
            i8 = i17;
            boolean z16 = z13;
            j |= j7;
            if (i31 > i29) {
                break;
            }
            int i35 = i30 + 1;
            int i36 = 0;
            while (i36 < childCount2) {
                View childAt2 = getChildAt(i36);
                C0720l c0720l5 = (C0720l) childAt2.getLayoutParams();
                boolean z17 = z9;
                long j8 = 1 << i36;
                if ((j7 & j8) != 0) {
                    if (z16 && c0720l5.f6836e) {
                        r11 = 1;
                        r11 = 1;
                        if (i29 == 1) {
                            childAt2.setPadding(i7 + i28, 0, i7, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0720l5.f6833b += r11;
                    c0720l5.f6837f = r11;
                    i29--;
                } else if (c0720l5.f6833b == i35) {
                    j |= j8;
                }
                i36++;
                z9 = z17;
            }
            z13 = z16;
            i17 = i8;
            z14 = true;
        }
        i8 = i17;
        boolean z18 = !z9 && i18 == 1;
        if (i29 > 0 && j != 0 && (i29 < i18 - 1 || z18 || i19 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z18) {
                if ((j & 1) != 0 && !((C0720l) getChildAt(0).getLayoutParams()).f6836e) {
                    bitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j & (1 << i37)) != 0 && !((C0720l) getChildAt(i37).getLayoutParams()).f6836e) {
                    bitCount -= 0.5f;
                }
            }
            int i38 = bitCount > 0.0f ? (int) ((i29 * i28) / bitCount) : 0;
            boolean z19 = z14;
            for (int i39 = 0; i39 < childCount2; i39++) {
                if ((j & (1 << i39)) != 0) {
                    View childAt3 = getChildAt(i39);
                    C0720l c0720l6 = (C0720l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0720l6.f6834c = i38;
                        c0720l6.f6837f = true;
                        if (i39 == 0 && !c0720l6.f6836e) {
                            ((LinearLayout.LayoutParams) c0720l6).leftMargin = (-i38) / 2;
                        }
                        z19 = true;
                    } else if (c0720l6.f6832a) {
                        c0720l6.f6834c = i38;
                        c0720l6.f6837f = true;
                        ((LinearLayout.LayoutParams) c0720l6).rightMargin = (-i38) / 2;
                        z19 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) c0720l6).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0720l6).rightMargin = i38 / 2;
                        }
                    }
                }
            }
            z14 = z19;
        }
        if (z14) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                C0720l c0720l7 = (C0720l) childAt4.getLayoutParams();
                if (c0720l7.f6837f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0720l7.f6833b * i28) + c0720l7.f6834c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode != 1073741824 ? i8 : i26);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f3196B.f6814y = z7;
    }

    public void setOnMenuItemClickListener(InterfaceC0722m interfaceC0722m) {
        this.f3203I = interfaceC0722m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0716j c0716j = this.f3196B;
        C0714i c0714i = c0716j.f6806q;
        if (c0714i != null) {
            c0714i.setImageDrawable(drawable);
        } else {
            c0716j.f6808s = true;
            c0716j.f6807r = drawable;
        }
    }

    public void setOverflowReserved(boolean z7) {
        this.f3195A = z7;
    }

    public void setPopupTheme(int i2) {
        if (this.f3206z != i2) {
            this.f3206z = i2;
            if (i2 == 0) {
                this.f3205y = getContext();
            } else {
                this.f3205y = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0716j c0716j) {
        this.f3196B = c0716j;
        c0716j.f6805p = this;
        this.f3204x = c0716j.f6800i;
    }

    @Override // n.B0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0720l(getContext(), attributeSet);
    }
}
