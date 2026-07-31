package androidx.appcompat.widget;

import B0.C0000a;
import B0.E;
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
import androidx.appcompat.view.menu.ActionMenuItemView;
import h.InterfaceC0142i;
import h.MenuC0143j;
import h.MenuItemC0144k;
import i.AbstractC0151F;
import i.C0150E;
import i.C0159f;
import i.C0161h;
import i.C0162i;
import i.C0164k;
import i.InterfaceC0163j;
import i.InterfaceC0165l;
import i.w0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0151F implements InterfaceC0142i {

    /* renamed from: A, reason: collision with root package name */
    public final int f1250A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0165l f1251B;
    public MenuC0143j t;

    /* renamed from: u, reason: collision with root package name */
    public Context f1252u;

    /* renamed from: v, reason: collision with root package name */
    public int f1253v;

    /* renamed from: w, reason: collision with root package name */
    public C0162i f1254w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1255x;

    /* renamed from: y, reason: collision with root package name */
    public int f1256y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1257z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1257z = (int) (56.0f * f2);
        this.f1250A = (int) (f2 * 4.0f);
        this.f1252u = context;
        this.f1253v = 0;
    }

    public static C0164k h() {
        C0164k c0164k = new C0164k(-2);
        c0164k.f2253c = false;
        c0164k.f2111b = 16;
        return c0164k;
    }

    public static C0164k i(ViewGroup.LayoutParams layoutParams) {
        C0164k c0164k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0164k) {
            C0164k c0164k2 = (C0164k) layoutParams;
            c0164k = new C0164k(c0164k2);
            c0164k.f2253c = c0164k2.f2253c;
        } else {
            c0164k = new C0164k(layoutParams);
        }
        if (c0164k.f2111b <= 0) {
            c0164k.f2111b = 16;
        }
        return c0164k;
    }

    @Override // h.InterfaceC0142i
    public final boolean a(MenuItemC0144k menuItemC0144k) {
        return this.t.p(menuItemC0144k, null, 0);
    }

    @Override // i.AbstractC0151F, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0164k;
    }

    @Override // i.AbstractC0151F
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0150E generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // i.AbstractC0151F
    /* renamed from: e */
    public final C0150E generateLayoutParams(AttributeSet attributeSet) {
        return new C0164k(getContext(), attributeSet);
    }

    @Override // i.AbstractC0151F
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0150E generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // i.AbstractC0151F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // i.AbstractC0151F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            MenuC0143j menuC0143j = new MenuC0143j(context);
            this.t = menuC0143j;
            menuC0143j.f2013e = new E(20, this);
            C0162i c0162i = new C0162i(context);
            this.f1254w = c0162i;
            c0162i.f2237o = true;
            c0162i.f2238p = true;
            c0162i.f2231i = new C0000a(22);
            this.t.b(c0162i, this.f1252u);
            C0162i c0162i2 = this.f1254w;
            c0162i2.f2233k = this;
            this.t = c0162i2.f2229g;
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0162i c0162i = this.f1254w;
        C0161h c0161h = c0162i.f2234l;
        if (c0161h != null) {
            return c0161h.getDrawable();
        }
        if (c0162i.f2236n) {
            return c0162i.f2235m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1253v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0163j)) {
            z2 = ((InterfaceC0163j) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0163j)) ? z2 : ((InterfaceC0163j) childAt2).c() | z2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0162i c0162i = this.f1254w;
        if (c0162i != null) {
            c0162i.d();
            C0159f c0159f = this.f1254w.f2243v;
            if (c0159f == null || !c0159f.b()) {
                return;
            }
            this.f1254w.e();
            this.f1254w.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0162i c0162i = this.f1254w;
        if (c0162i != null) {
            c0162i.e();
            C0159f c0159f = c0162i.f2244w;
            if (c0159f == null || !c0159f.b()) {
                return;
            }
            c0159f.f2065i.dismiss();
        }
    }

    @Override // i.AbstractC0151F, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f1255x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = w0.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0164k c0164k = (C0164k) childAt.getLayoutParams();
                if (c0164k.f2253c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0164k).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0164k).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0164k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0164k).rightMargin;
                    j(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0164k c0164k2 = (C0164k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0164k2.f2253c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) c0164k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0164k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0164k c0164k3 = (C0164k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0164k3.f2253c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0164k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0164k3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // i.AbstractC0151F, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        MenuC0143j menuC0143j;
        boolean z2 = this.f1255x;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1255x = z3;
        if (z2 != z3) {
            this.f1256y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1255x && (menuC0143j = this.t) != null && size != this.f1256y) {
            this.f1256y = size;
            menuC0143j.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1255x || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0164k c0164k = (C0164k) getChildAt(i8).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0164k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0164k).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1257z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z4 = false;
        int i18 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f1250A;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z5) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0164k c0164k2 = (C0164k) childAt.getLayoutParams();
                c0164k2.f2258h = false;
                c0164k2.f2255e = 0;
                c0164k2.f2254d = 0;
                c0164k2.f2256f = false;
                ((ViewGroup.MarginLayoutParams) c0164k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0164k2).rightMargin = 0;
                c0164k2.f2257g = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = c0164k2.f2253c ? 1 : i11;
                C0164k c0164k3 = (C0164k) childAt.getLayoutParams();
                int i22 = i11;
                i6 = i13;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i20, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i21 <= 0 || (z6 && i21 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i21, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z7 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c0164k3.f2256f = !c0164k3.f2253c && z7;
                c0164k3.f2254d = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), makeMeasureSpec);
                i16 = Math.max(i16, i7);
                if (c0164k2.f2256f) {
                    i18++;
                }
                if (c0164k2.f2253c) {
                    z4 = true;
                }
                i11 = i22 - i7;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= 1 << i17;
                }
            }
            i17++;
            size3 = i19;
            paddingBottom = i20;
            i13 = i6;
        }
        int i23 = size3;
        int i24 = i11;
        int i25 = i13;
        boolean z8 = z4 && i15 == 2;
        int i26 = i24;
        boolean z9 = false;
        while (i18 > 0 && i26 > 0) {
            int i27 = Integer.MAX_VALUE;
            long j3 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < childCount2) {
                int i30 = i14;
                C0164k c0164k4 = (C0164k) getChildAt(i29).getLayoutParams();
                boolean z10 = z8;
                if (c0164k4.f2256f) {
                    int i31 = c0164k4.f2254d;
                    if (i31 < i27) {
                        j3 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        j3 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z8 = z10;
                i14 = i30;
            }
            i5 = i14;
            boolean z11 = z8;
            j2 |= j3;
            if (i28 > i26) {
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C0164k c0164k5 = (C0164k) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i33;
                if ((j3 & j4) != 0) {
                    if (z11 && c0164k5.f2257g) {
                        r11 = 1;
                        r11 = 1;
                        if (i26 == 1) {
                            childAt2.setPadding(i4 + i25, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0164k5.f2254d += r11;
                    c0164k5.f2258h = r11;
                    i26--;
                } else if (c0164k5.f2254d == i32) {
                    j2 |= j4;
                }
                i33++;
                z4 = z12;
            }
            z8 = z11;
            i14 = i5;
            z9 = true;
        }
        i5 = i14;
        boolean z13 = !z4 && i15 == 1;
        if (i26 > 0 && j2 != 0 && (i26 < i15 - 1 || z13 || i16 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C0164k) getChildAt(0).getLayoutParams()).f2257g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j2 & (1 << i34)) != 0 && !((C0164k) getChildAt(i34).getLayoutParams()).f2257g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i26 * i25) / bitCount) : 0;
            boolean z14 = z9;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j2 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0164k c0164k6 = (C0164k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0164k6.f2255e = i35;
                        c0164k6.f2258h = true;
                        if (i36 == 0 && !c0164k6.f2257g) {
                            ((ViewGroup.MarginLayoutParams) c0164k6).leftMargin = (-i35) / 2;
                        }
                        z14 = true;
                    } else if (c0164k6.f2253c) {
                        c0164k6.f2255e = i35;
                        c0164k6.f2258h = true;
                        ((ViewGroup.MarginLayoutParams) c0164k6).rightMargin = (-i35) / 2;
                        z14 = true;
                    } else {
                        if (i36 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0164k6).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0164k6).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0164k c0164k7 = (C0164k) childAt4.getLayoutParams();
                if (c0164k7.f2258h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0164k7.f2254d * i25) + c0164k7.f2255e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1254w.t = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0165l interfaceC0165l) {
        this.f1251B = interfaceC0165l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0162i c0162i = this.f1254w;
        C0161h c0161h = c0162i.f2234l;
        if (c0161h != null) {
            c0161h.setImageDrawable(drawable);
        } else {
            c0162i.f2236n = true;
            c0162i.f2235m = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.f1253v != i2) {
            this.f1253v = i2;
            if (i2 == 0) {
                this.f1252u = getContext();
            } else {
                this.f1252u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0162i c0162i) {
        this.f1254w = c0162i;
        c0162i.f2233k = this;
        this.t = c0162i.f2229g;
    }

    @Override // i.AbstractC0151F, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0164k(getContext(), attributeSet);
    }
}
