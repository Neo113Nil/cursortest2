package androidx.appcompat.widget;

import V5.g;
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
import j.i;
import j.j;
import j.k;
import k.C0447f;
import k.C0449h;
import k.C0450i;
import k.C0452k;
import k.H;
import k.I;
import k.InterfaceC0451j;
import k.InterfaceC0453l;
import k.y0;

/* loaded from: classes.dex */
public class ActionMenuView extends I implements i {

    /* renamed from: A, reason: collision with root package name */
    public final int f3295A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3296B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC0453l f3297C;

    /* renamed from: u, reason: collision with root package name */
    public j f3298u;

    /* renamed from: v, reason: collision with root package name */
    public Context f3299v;

    /* renamed from: w, reason: collision with root package name */
    public int f3300w;

    /* renamed from: x, reason: collision with root package name */
    public C0450i f3301x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f3302z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f3295A = (int) (56.0f * f7);
        this.f3296B = (int) (f7 * 4.0f);
        this.f3299v = context;
        this.f3300w = 0;
    }

    public static C0452k h() {
        C0452k c0452k = new C0452k(-2, -2);
        c0452k.f5045a = false;
        ((LinearLayout.LayoutParams) c0452k).gravity = 16;
        return c0452k;
    }

    public static C0452k i(ViewGroup.LayoutParams layoutParams) {
        C0452k c0452k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0452k) {
            C0452k c0452k2 = (C0452k) layoutParams;
            c0452k = new C0452k(c0452k2);
            c0452k.f5045a = c0452k2.f5045a;
        } else {
            c0452k = new C0452k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0452k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0452k).gravity = 16;
        }
        return c0452k;
    }

    @Override // j.i
    public final boolean a(k kVar) {
        return this.f3298u.p(kVar, null, 0);
    }

    @Override // k.I, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0452k;
    }

    @Override // k.I
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ H generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.I
    /* renamed from: e */
    public final H generateLayoutParams(AttributeSet attributeSet) {
        return new C0452k(getContext(), attributeSet);
    }

    @Override // k.I
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ H generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // k.I, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // k.I, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3298u == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f3298u = jVar;
            jVar.f4799e = new g(11, this);
            C0450i c0450i = new C0450i(context);
            this.f3301x = c0450i;
            c0450i.f5014p = true;
            c0450i.f5015q = true;
            c0450i.f5008j = new R0.g();
            this.f3298u.b(c0450i, this.f3299v);
            C0450i c0450i2 = this.f3301x;
            c0450i2.f5010l = this;
            this.f3298u = c0450i2.f5006h;
        }
        return this.f3298u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0450i c0450i = this.f3301x;
        C0449h c0449h = c0450i.f5011m;
        if (c0449h != null) {
            return c0449h.getDrawable();
        }
        if (c0450i.f5013o) {
            return c0450i.f5012n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3300w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i7) {
        boolean z5 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC0451j)) {
            z5 = ((InterfaceC0451j) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC0451j)) ? z5 : ((InterfaceC0451j) childAt2).c() | z5;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0450i c0450i = this.f3301x;
        if (c0450i != null) {
            c0450i.d();
            C0447f c0447f = this.f3301x.f5021w;
            if (c0447f == null || !c0447f.b()) {
                return;
            }
            this.f3301x.e();
            this.f3301x.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0450i c0450i = this.f3301x;
        if (c0450i != null) {
            c0450i.e();
            C0447f c0447f = c0450i.f5022x;
            if (c0447f == null || !c0447f.b()) {
                return;
            }
            c0447f.f4852i.dismiss();
        }
    }

    @Override // k.I, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.y) {
            super.onLayout(z5, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean a7 = y0.a(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C0452k c0452k = (C0452k) childAt.getLayoutParams();
                if (c0452k.f5045a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a7) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0452k).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0452k).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0452k).leftMargin) + ((LinearLayout.LayoutParams) c0452k).rightMargin;
                    j(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (a7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C0452k c0452k2 = (C0452k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0452k2.f5045a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c0452k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0452k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C0452k c0452k3 = (C0452k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0452k3.f5045a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c0452k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0452k3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.I, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        ?? r11;
        int i11;
        int i12;
        j jVar;
        boolean z5 = this.y;
        boolean z6 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.y = z6;
        if (z5 != z6) {
            this.f3302z = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.y && (jVar = this.f3298u) != null && size != this.f3302z) {
            this.f3302z = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.y || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C0452k c0452k = (C0452k) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c0452k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0452k).leftMargin = 0;
            }
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f3295A;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z7 = false;
        int i23 = 0;
        long j4 = 0;
        while (true) {
            i9 = this.f3296B;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z8) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C0452k c0452k2 = (C0452k) childAt.getLayoutParams();
                c0452k2.f5050f = false;
                c0452k2.f5047c = 0;
                c0452k2.f5046b = 0;
                c0452k2.f5048d = false;
                ((LinearLayout.LayoutParams) c0452k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0452k2).rightMargin = 0;
                c0452k2.f5049e = z8 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c0452k2.f5045a ? 1 : i16;
                C0452k c0452k3 = (C0452k) childAt.getLayoutParams();
                int i27 = i16;
                i11 = i18;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z10 = z9;
                if (i26 <= 0 || (z9 && i26 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i11;
                    if (measuredWidth % i11 != 0) {
                        i12++;
                    }
                    if (z10 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c0452k3.f5048d = !c0452k3.f5045a && z10;
                c0452k3.f5046b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (c0452k2.f5048d) {
                    i23++;
                }
                if (c0452k2.f5045a) {
                    z7 = true;
                }
                i16 = i27 - i12;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j4 |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i18 = i11;
        }
        int i28 = size3;
        int i29 = i16;
        int i30 = i18;
        boolean z11 = z7 && i20 == 2;
        int i31 = i29;
        boolean z12 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j7 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = i19;
                C0452k c0452k4 = (C0452k) getChildAt(i34).getLayoutParams();
                boolean z13 = z11;
                if (c0452k4.f5048d) {
                    int i36 = c0452k4.f5046b;
                    if (i36 < i32) {
                        j7 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j7 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z11 = z13;
                i19 = i35;
            }
            i10 = i19;
            boolean z14 = z11;
            j4 |= j7;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                C0452k c0452k5 = (C0452k) childAt2.getLayoutParams();
                boolean z15 = z7;
                long j8 = 1 << i38;
                if ((j7 & j8) != 0) {
                    if (z14 && c0452k5.f5049e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i9 + i30, 0, i9, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0452k5.f5046b += r11;
                    c0452k5.f5050f = r11;
                    i31--;
                } else if (c0452k5.f5046b == i37) {
                    j4 |= j8;
                }
                i38++;
                z7 = z15;
            }
            z11 = z14;
            i19 = i10;
            z12 = true;
        }
        i10 = i19;
        boolean z16 = !z7 && i20 == 1;
        if (i31 > 0 && j4 != 0 && (i31 < i20 - 1 || z16 || i21 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z16) {
                if ((j4 & 1) != 0 && !((C0452k) getChildAt(0).getLayoutParams()).f5049e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j4 & (1 << i39)) != 0 && !((C0452k) getChildAt(i39).getLayoutParams()).f5049e) {
                    bitCount -= 0.5f;
                }
            }
            int i40 = bitCount > 0.0f ? (int) ((i31 * i30) / bitCount) : 0;
            boolean z17 = z12;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j4 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C0452k c0452k6 = (C0452k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0452k6.f5047c = i40;
                        c0452k6.f5050f = true;
                        if (i41 == 0 && !c0452k6.f5049e) {
                            ((LinearLayout.LayoutParams) c0452k6).leftMargin = (-i40) / 2;
                        }
                        z17 = true;
                    } else if (c0452k6.f5045a) {
                        c0452k6.f5047c = i40;
                        c0452k6.f5050f = true;
                        ((LinearLayout.LayoutParams) c0452k6).rightMargin = (-i40) / 2;
                        z17 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) c0452k6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0452k6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z12 = z17;
        }
        if (z12) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                C0452k c0452k7 = (C0452k) childAt4.getLayoutParams();
                if (c0452k7.f5050f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0452k7.f5046b * i30) + c0452k7.f5047c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i10 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f3301x.f5019u = z5;
    }

    public void setOnMenuItemClickListener(InterfaceC0453l interfaceC0453l) {
        this.f3297C = interfaceC0453l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0450i c0450i = this.f3301x;
        C0449h c0449h = c0450i.f5011m;
        if (c0449h != null) {
            c0449h.setImageDrawable(drawable);
        } else {
            c0450i.f5013o = true;
            c0450i.f5012n = drawable;
        }
    }

    public void setOverflowReserved(boolean z5) {
    }

    public void setPopupTheme(int i7) {
        if (this.f3300w != i7) {
            this.f3300w = i7;
            if (i7 == 0) {
                this.f3299v = getContext();
            } else {
                this.f3299v = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C0450i c0450i) {
        this.f3301x = c0450i;
        c0450i.f5010l = this;
        this.f3298u = c0450i.f5006h;
    }

    @Override // k.I, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0452k(getContext(), attributeSet);
    }
}
