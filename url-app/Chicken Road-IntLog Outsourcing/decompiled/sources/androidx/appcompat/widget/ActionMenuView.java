package androidx.appcompat.widget;

import W1.e;
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
import k.h;
import k.i;
import k.j;
import l.AbstractC1228C;
import l.C1227B;
import l.C1234f;
import l.C1236h;
import l.C1237i;
import l.C1239k;
import l.InterfaceC1238j;
import l.InterfaceC1240l;
import l.t0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1228C implements h {

    /* renamed from: p, reason: collision with root package name */
    public i f4155p;

    /* renamed from: q, reason: collision with root package name */
    public Context f4156q;

    /* renamed from: r, reason: collision with root package name */
    public int f4157r;

    /* renamed from: s, reason: collision with root package name */
    public C1237i f4158s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4159t;

    /* renamed from: u, reason: collision with root package name */
    public int f4160u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4161v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4162w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1240l f4163x;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f4161v = (int) (56.0f * f3);
        this.f4162w = (int) (f3 * 4.0f);
        this.f4156q = context;
        this.f4157r = 0;
    }

    public static C1239k h() {
        C1239k c1239k = new C1239k(-2);
        c1239k.f10895c = false;
        c1239k.f10746b = 16;
        return c1239k;
    }

    public static C1239k i(ViewGroup.LayoutParams layoutParams) {
        C1239k c1239k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C1239k) {
            C1239k c1239k2 = (C1239k) layoutParams;
            c1239k = new C1239k(c1239k2);
            c1239k.f10895c = c1239k2.f10895c;
        } else {
            c1239k = new C1239k(layoutParams);
        }
        if (c1239k.f10746b <= 0) {
            c1239k.f10746b = 16;
        }
        return c1239k;
    }

    @Override // k.h
    public final boolean a(j jVar) {
        return this.f4155p.p(jVar, null, 0);
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1239k;
    }

    @Override // l.AbstractC1228C
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C1227B generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC1228C
    /* renamed from: e */
    public final C1227B generateLayoutParams(AttributeSet attributeSet) {
        return new C1239k(getContext(), attributeSet);
    }

    @Override // l.AbstractC1228C
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1227B generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4155p == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.f4155p = iVar;
            iVar.f10590e = new V0.j(17, this);
            C1237i c1237i = new C1237i(context);
            this.f4158s = c1237i;
            c1237i.f10878k = true;
            c1237i.f10879l = true;
            c1237i.f10872e = new e();
            this.f4155p.b(c1237i, this.f4156q);
            C1237i c1237i2 = this.f4158s;
            c1237i2.f10874g = this;
            this.f4155p = c1237i2.f10870c;
        }
        return this.f4155p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1237i c1237i = this.f4158s;
        C1236h c1236h = c1237i.f10875h;
        if (c1236h != null) {
            return c1236h.getDrawable();
        }
        if (c1237i.f10877j) {
            return c1237i.f10876i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4157r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC1238j)) {
            z = ((InterfaceC1238j) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC1238j)) ? z : z | ((InterfaceC1238j) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1237i c1237i = this.f4158s;
        if (c1237i != null) {
            c1237i.f();
            C1234f c1234f = this.f4158s.f10885r;
            if (c1234f == null || !c1234f.b()) {
                return;
            }
            this.f4158s.g();
            this.f4158s.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1237i c1237i = this.f4158s;
        if (c1237i != null) {
            c1237i.g();
            C1234f c1234f = c1237i.f10886s;
            if (c1234f == null || !c1234f.b()) {
                return;
            }
            c1234f.f10643i.dismiss();
        }
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int width;
        int i8;
        if (!this.f4159t) {
            super.onLayout(z, i2, i3, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i2;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a6 = t0.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1239k c1239k = (C1239k) childAt.getLayoutParams();
                if (c1239k.f10895c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a6) {
                        i8 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1239k).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1239k).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1239k).leftMargin) + ((ViewGroup.MarginLayoutParams) c1239k).rightMargin;
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
        if (a6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C1239k c1239k2 = (C1239k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1239k2.f10895c) {
                    int i19 = width2 - ((ViewGroup.MarginLayoutParams) c1239k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1239k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C1239k c1239k3 = (C1239k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1239k3.f10895c) {
                int i22 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1239k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1239k3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC1228C, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        boolean z;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        ?? r42;
        int i11;
        int i12;
        int i13;
        i iVar;
        boolean z6 = this.f4159t;
        boolean z7 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f4159t = z7;
        if (z6 != z7) {
            this.f4160u = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f4159t && (iVar = this.f4155p) != null && size != this.f4160u) {
            this.f4160u = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f4159t || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C1239k c1239k = (C1239k) getChildAt(i14).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c1239k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1239k).leftMargin = 0;
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
        int i15 = size2 - paddingRight;
        int i16 = this.f4161v;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z8 = false;
        int i24 = 0;
        long j2 = 0;
        while (true) {
            i6 = this.f4162w;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i15;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i27 = i21 + 1;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C1239k c1239k2 = (C1239k) childAt.getLayoutParams();
                c1239k2.f10900h = false;
                c1239k2.f10897e = 0;
                c1239k2.f10896d = 0;
                c1239k2.f10898f = false;
                ((ViewGroup.MarginLayoutParams) c1239k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1239k2).rightMargin = 0;
                c1239k2.f10899g = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = c1239k2.f10895c ? 1 : i17;
                C1239k c1239k3 = (C1239k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i28 <= 0 || (z10 && i28 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z10 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c1239k3.f10898f = !c1239k3.f10895c && z10;
                c1239k3.f10896d = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), makeMeasureSpec);
                i22 = Math.max(i22, i13);
                if (c1239k2.f10898f) {
                    i24++;
                }
                if (c1239k2.f10895c) {
                    z8 = true;
                }
                i17 -= i13;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j2 |= 1 << i23;
                }
                i21 = i27;
            }
            i23++;
            size3 = i25;
            i15 = i26;
            paddingBottom = i12;
            mode = i11;
        }
        int i29 = mode;
        int i30 = i15;
        int i31 = size3;
        boolean z11 = z8 && i21 == 2;
        boolean z12 = false;
        while (i24 > 0 && i17 > 0) {
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j6 = 0;
            while (i34 < childCount2) {
                C1239k c1239k4 = (C1239k) getChildAt(i34).getLayoutParams();
                boolean z13 = z12;
                if (c1239k4.f10898f) {
                    int i35 = c1239k4.f10896d;
                    if (i35 < i32) {
                        j6 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j6 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z12 = z13;
            }
            z = z12;
            j2 |= j6;
            if (i33 > i17) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                C1239k c1239k5 = (C1239k) childAt2.getLayoutParams();
                int i38 = i20;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j7 = 1 << i37;
                if ((j6 & j7) != 0) {
                    if (z11 && c1239k5.f10899g) {
                        r42 = 1;
                        r42 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i6 + i19, 0, i6, 0);
                        }
                    } else {
                        r42 = 1;
                    }
                    c1239k5.f10896d += r42;
                    c1239k5.f10900h = r42;
                    i17--;
                } else if (c1239k5.f10896d == i36) {
                    j2 |= j7;
                }
                i37++;
                childMeasureSpec = i39;
                i20 = i38;
                childCount2 = i40;
            }
            z12 = true;
        }
        z = z12;
        int i41 = i20;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z14 = !z8 && i21 == 1;
        if (i17 <= 0 || j2 == 0 || (i17 >= i21 - 1 && !z14 && i22 <= 1)) {
            i7 = i43;
            z5 = z;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z14) {
                if ((j2 & 1) != 0 && !((C1239k) getChildAt(0).getLayoutParams()).f10899g) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j2 & (1 << i44)) != 0 && !((C1239k) getChildAt(i44).getLayoutParams()).f10899g) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : 0;
            boolean z15 = z;
            i7 = i43;
            for (int i46 = 0; i46 < i7; i46++) {
                if ((j2 & (1 << i46)) != 0) {
                    View childAt3 = getChildAt(i46);
                    C1239k c1239k6 = (C1239k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1239k6.f10897e = i45;
                        c1239k6.f10900h = true;
                        if (i46 == 0 && !c1239k6.f10899g) {
                            ((ViewGroup.MarginLayoutParams) c1239k6).leftMargin = (-i45) / 2;
                        }
                        z15 = true;
                    } else {
                        if (c1239k6.f10895c) {
                            c1239k6.f10897e = i45;
                            c1239k6.f10900h = true;
                            ((ViewGroup.MarginLayoutParams) c1239k6).rightMargin = (-i45) / 2;
                            z15 = true;
                        } else {
                            if (i46 != 0) {
                                ((ViewGroup.MarginLayoutParams) c1239k6).leftMargin = i45 / 2;
                            }
                            if (i46 != i7 - 1) {
                                ((ViewGroup.MarginLayoutParams) c1239k6).rightMargin = i45 / 2;
                            }
                        }
                    }
                }
            }
            z5 = z15;
        }
        if (z5) {
            int i47 = 0;
            while (i47 < i7) {
                View childAt4 = getChildAt(i47);
                C1239k c1239k7 = (C1239k) childAt4.getLayoutParams();
                if (c1239k7.f10900h) {
                    i10 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1239k7.f10896d * i19) + c1239k7.f10897e, 1073741824), i10);
                } else {
                    i10 = i42;
                }
                i47++;
                i42 = i10;
            }
        }
        if (i29 != 1073741824) {
            i9 = i30;
            i8 = i41;
        } else {
            i8 = i31;
            i9 = i30;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f4158s.f10883p = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1240l interfaceC1240l) {
        this.f4163x = interfaceC1240l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1237i c1237i = this.f4158s;
        C1236h c1236h = c1237i.f10875h;
        if (c1236h != null) {
            c1236h.setImageDrawable(drawable);
        } else {
            c1237i.f10877j = true;
            c1237i.f10876i = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i2) {
        if (this.f4157r != i2) {
            this.f4157r = i2;
            if (i2 == 0) {
                this.f4156q = getContext();
            } else {
                this.f4156q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C1237i c1237i) {
        this.f4158s = c1237i;
        c1237i.f10874g = this;
        this.f4155p = c1237i.f10870c;
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1239k(getContext(), attributeSet);
    }
}
