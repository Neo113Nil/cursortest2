package androidx.appcompat.widget;

import a0.C0144j;
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
import e0.t;
import j.i;
import j.j;
import j.k;
import k.AbstractC1180D;
import k.C1179C;
import k.C1212f;
import k.C1216h;
import k.C1218i;
import k.C1222k;
import k.InterfaceC1220j;
import k.InterfaceC1224l;
import k.t0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1180D implements i {

    /* renamed from: p, reason: collision with root package name */
    public j f4364p;

    /* renamed from: q, reason: collision with root package name */
    public Context f4365q;

    /* renamed from: r, reason: collision with root package name */
    public int f4366r;

    /* renamed from: s, reason: collision with root package name */
    public C1218i f4367s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4368t;

    /* renamed from: u, reason: collision with root package name */
    public int f4369u;
    public final int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4370w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1224l f4371x;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.v = (int) (56.0f * f4);
        this.f4370w = (int) (f4 * 4.0f);
        this.f4365q = context;
        this.f4366r = 0;
    }

    public static C1222k h() {
        C1222k c1222k = new C1222k(-2);
        c1222k.f14036c = false;
        c1222k.f13901b = 16;
        return c1222k;
    }

    public static C1222k i(ViewGroup.LayoutParams layoutParams) {
        C1222k c1222k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C1222k) {
            C1222k c1222k2 = (C1222k) layoutParams;
            c1222k = new C1222k(c1222k2);
            c1222k.f14036c = c1222k2.f14036c;
        } else {
            c1222k = new C1222k(layoutParams);
        }
        if (c1222k.f13901b <= 0) {
            c1222k.f13901b = 16;
        }
        return c1222k;
    }

    @Override // j.i
    public final boolean a(k kVar) {
        return this.f4364p.p(kVar, null, 0);
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1222k;
    }

    @Override // k.AbstractC1180D
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C1179C generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC1180D
    /* renamed from: e */
    public final C1179C generateLayoutParams(AttributeSet attributeSet) {
        return new C1222k(getContext(), attributeSet);
    }

    @Override // k.AbstractC1180D
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1179C generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4364p == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f4364p = jVar;
            jVar.f13651e = new t(this);
            C1218i c1218i = new C1218i(context);
            this.f4367s = c1218i;
            c1218i.f14022k = true;
            c1218i.f14023l = true;
            c1218i.f14016e = new C0144j(15, false);
            this.f4364p.b(c1218i, this.f4365q);
            C1218i c1218i2 = this.f4367s;
            c1218i2.f14018g = this;
            this.f4364p = c1218i2.f14014c;
        }
        return this.f4364p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1218i c1218i = this.f4367s;
        C1216h c1216h = c1218i.f14019h;
        if (c1216h != null) {
            return c1216h.getDrawable();
        }
        if (c1218i.f14021j) {
            return c1218i.f14020i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4366r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i4) {
        boolean z = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC1220j)) {
            z = ((InterfaceC1220j) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof InterfaceC1220j)) ? z : ((InterfaceC1220j) childAt2).b() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1218i c1218i = this.f4367s;
        if (c1218i != null) {
            c1218i.g();
            C1212f c1212f = this.f4367s.f14027r;
            if (c1212f == null || !c1212f.b()) {
                return;
            }
            this.f4367s.h();
            this.f4367s.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1218i c1218i = this.f4367s;
        if (c1218i != null) {
            c1218i.h();
            C1212f c1212f = c1218i.f14028s;
            if (c1212f == null || !c1212f.b()) {
                return;
            }
            c1212f.f13700i.dismiss();
        }
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f4368t) {
            super.onLayout(z, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = t0.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1222k c1222k = (C1222k) childAt.getLayoutParams();
                if (c1222k.f14036c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i8 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1222k).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1222k).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1222k).leftMargin) + ((ViewGroup.MarginLayoutParams) c1222k).rightMargin;
                    j(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int max = Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C1222k c1222k2 = (C1222k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1222k2.f14036c) {
                    int i19 = width2 - ((ViewGroup.MarginLayoutParams) c1222k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1222k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C1222k c1222k3 = (C1222k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1222k3.f14036c) {
                int i22 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1222k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1222k3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.AbstractC1180D, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        j jVar;
        boolean z = this.f4368t;
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f4368t = z4;
        if (z != z4) {
            this.f4369u = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f4368t && (jVar = this.f4364p) != null && size != this.f4369u) {
            this.f4369u = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f4368t || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C1222k c1222k = (C1222k) getChildAt(i10).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c1222k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1222k).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.v;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z5 = false;
        int i20 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.f4370w;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z6) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C1222k c1222k2 = (C1222k) childAt.getLayoutParams();
                c1222k2.f14041h = false;
                c1222k2.f14038e = 0;
                c1222k2.f14037d = 0;
                c1222k2.f14039f = false;
                ((ViewGroup.MarginLayoutParams) c1222k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1222k2).rightMargin = 0;
                c1222k2.f14040g = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c1222k2.f14036c ? 1 : i13;
                C1222k c1222k3 = (C1222k) childAt.getLayoutParams();
                int i24 = i13;
                i8 = i15;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i23 <= 0 || (z7 && i23 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i23, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z8 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c1222k3.f14039f = !c1222k3.f14036c && z8;
                c1222k3.f14037d = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                i18 = Math.max(i18, i9);
                if (c1222k2.f14039f) {
                    i20++;
                }
                if (c1222k2.f14036c) {
                    z5 = true;
                }
                i13 = i24 - i9;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j4 |= 1 << i19;
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i15 = i8;
        }
        int i25 = size3;
        int i26 = i13;
        int i27 = i15;
        boolean z9 = z5 && i17 == 2;
        int i28 = i26;
        boolean z10 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j5 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                int i32 = i16;
                C1222k c1222k4 = (C1222k) getChildAt(i31).getLayoutParams();
                boolean z11 = z9;
                if (c1222k4.f14039f) {
                    int i33 = c1222k4.f14037d;
                    if (i33 < i29) {
                        j5 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j5 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z9 = z11;
                i16 = i32;
            }
            i7 = i16;
            boolean z12 = z9;
            j4 |= j5;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C1222k c1222k5 = (C1222k) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j6 = 1 << i35;
                if ((j5 & j6) != 0) {
                    if (z12 && c1222k5.f14040g) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i6 + i27, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1222k5.f14037d += r11;
                    c1222k5.f14041h = r11;
                    i28--;
                } else if (c1222k5.f14037d == i34) {
                    j4 |= j6;
                }
                i35++;
                z5 = z13;
            }
            z9 = z12;
            i16 = i7;
            z10 = true;
        }
        i7 = i16;
        boolean z14 = !z5 && i17 == 1;
        if (i28 > 0 && j4 != 0 && (i28 < i17 - 1 || z14 || i18 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z14) {
                if ((j4 & 1) != 0 && !((C1222k) getChildAt(0).getLayoutParams()).f14040g) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j4 & (1 << i36)) != 0 && !((C1222k) getChildAt(i36).getLayoutParams()).f14040g) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i28 * i27) / bitCount) : 0;
            boolean z15 = z10;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j4 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    C1222k c1222k6 = (C1222k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1222k6.f14038e = i37;
                        c1222k6.f14041h = true;
                        if (i38 == 0 && !c1222k6.f14040g) {
                            ((ViewGroup.MarginLayoutParams) c1222k6).leftMargin = (-i37) / 2;
                        }
                        z15 = true;
                    } else if (c1222k6.f14036c) {
                        c1222k6.f14038e = i37;
                        c1222k6.f14041h = true;
                        ((ViewGroup.MarginLayoutParams) c1222k6).rightMargin = (-i37) / 2;
                        z15 = true;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) c1222k6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c1222k6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C1222k c1222k7 = (C1222k) childAt4.getLayoutParams();
                if (c1222k7.f14041h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1222k7.f14037d * i27) + c1222k7.f14038e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f4367s.f14025p = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1224l interfaceC1224l) {
        this.f4371x = interfaceC1224l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1218i c1218i = this.f4367s;
        C1216h c1216h = c1218i.f14019h;
        if (c1216h != null) {
            c1216h.setImageDrawable(drawable);
        } else {
            c1218i.f14021j = true;
            c1218i.f14020i = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i4) {
        if (this.f4366r != i4) {
            this.f4366r = i4;
            if (i4 == 0) {
                this.f4365q = getContext();
            } else {
                this.f4365q = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C1218i c1218i) {
        this.f4367s = c1218i;
        c1218i.f14018g = this;
        this.f4364p = c1218i.f14014c;
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1222k(getContext(), attributeSet);
    }
}
