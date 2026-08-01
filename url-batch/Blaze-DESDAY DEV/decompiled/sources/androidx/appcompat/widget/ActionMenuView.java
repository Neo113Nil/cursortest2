package androidx.appcompat.widget;

import C.g;
import J0.e;
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
import androidx.recyclerview.widget.RecyclerView;
import k.C0168o;
import k.InterfaceC0149A;
import k.InterfaceC0165l;
import k.MenuC0166m;
import l.AbstractC0246x0;
import l.C0211g;
import l.C0217j;
import l.C0219k;
import l.C0223m;
import l.C0244w0;
import l.InterfaceC0221l;
import l.InterfaceC0225n;
import l.W0;
import l.i1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0246x0 implements InterfaceC0165l, InterfaceC0149A {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0166m f1334p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1335q;

    /* renamed from: r, reason: collision with root package name */
    public int f1336r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1337s;

    /* renamed from: t, reason: collision with root package name */
    public C0219k f1338t;

    /* renamed from: u, reason: collision with root package name */
    public W0 f1339u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1340v;

    /* renamed from: w, reason: collision with root package name */
    public int f1341w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1342x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1343y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0225n f1344z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1342x = (int) (56.0f * f2);
        this.f1343y = (int) (f2 * 4.0f);
        this.f1335q = context;
        this.f1336r = 0;
    }

    public static C0223m j() {
        C0223m c0223m = new C0223m(-2, -2);
        c0223m.f2977a = false;
        ((LinearLayout.LayoutParams) c0223m).gravity = 16;
        return c0223m;
    }

    public static C0223m k(ViewGroup.LayoutParams layoutParams) {
        C0223m c0223m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0223m) {
            C0223m c0223m2 = (C0223m) layoutParams;
            c0223m = new C0223m(c0223m2);
            c0223m.f2977a = c0223m2.f2977a;
        } else {
            c0223m = new C0223m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0223m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0223m).gravity = 16;
        }
        return c0223m;
    }

    @Override // k.InterfaceC0165l
    public final boolean b(C0168o c0168o) {
        return this.f1334p.q(c0168o, null, 0);
    }

    @Override // k.InterfaceC0149A
    public final void c(MenuC0166m menuC0166m) {
        this.f1334p = menuC0166m;
    }

    @Override // l.AbstractC0246x0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0223m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0246x0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0244w0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0246x0
    /* renamed from: g */
    public final C0244w0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0223m(getContext(), attributeSet);
    }

    @Override // l.AbstractC0246x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0246x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1334p == null) {
            Context context = getContext();
            MenuC0166m menuC0166m = new MenuC0166m(context);
            this.f1334p = menuC0166m;
            menuC0166m.f2716e = new g(28, this);
            C0219k c0219k = new C0219k(context);
            this.f1338t = c0219k;
            c0219k.f2965l = true;
            c0219k.f2966m = true;
            c0219k.f2960e = new e(24);
            this.f1334p.b(c0219k, this.f1335q);
            C0219k c0219k2 = this.f1338t;
            c0219k2.h = this;
            this.f1334p = c0219k2.f2959c;
        }
        return this.f1334p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0219k c0219k = this.f1338t;
        C0217j c0217j = c0219k.i;
        if (c0217j != null) {
            return c0217j.getDrawable();
        }
        if (c0219k.f2964k) {
            return c0219k.f2963j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1336r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0246x0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0244w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0221l)) {
            z2 = ((InterfaceC0221l) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0221l)) ? z2 : z2 | ((InterfaceC0221l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0219k c0219k = this.f1338t;
        if (c0219k != null) {
            c0219k.c();
            if (this.f1338t.i()) {
                this.f1338t.e();
                this.f1338t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0219k c0219k = this.f1338t;
        if (c0219k != null) {
            c0219k.e();
            C0211g c0211g = c0219k.f2973t;
            if (c0211g == null || !c0211g.b()) {
                return;
            }
            c0211g.i.dismiss();
        }
    }

    @Override // l.AbstractC0246x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1340v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = i1.f2954a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0223m c0223m = (C0223m) childAt.getLayoutParams();
                if (c0223m.f2977a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0223m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0223m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0223m).leftMargin) + ((LinearLayout.LayoutParams) c0223m).rightMargin;
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
                C0223m c0223m2 = (C0223m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0223m2.f2977a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0223m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0223m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0223m c0223m3 = (C0223m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0223m3.f2977a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0223m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0223m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0246x0, android.view.View
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
        MenuC0166m menuC0166m;
        boolean z4 = this.f1340v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1340v = z5;
        if (z4 != z5) {
            this.f1341w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1340v && (menuC0166m = this.f1334p) != null && size != this.f1341w) {
            this.f1341w = size;
            menuC0166m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1340v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0223m c0223m = (C0223m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0223m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0223m).leftMargin = 0;
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
        int i13 = this.f1342x;
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
            i3 = this.f1343y;
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
                C0223m c0223m2 = (C0223m) childAt.getLayoutParams();
                c0223m2.f2981f = false;
                c0223m2.f2979c = 0;
                c0223m2.f2978b = 0;
                c0223m2.d = false;
                ((LinearLayout.LayoutParams) c0223m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0223m2).rightMargin = 0;
                c0223m2.f2980e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0223m2.f2977a ? 1 : i14;
                C0223m c0223m3 = (C0223m) childAt.getLayoutParams();
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
                c0223m3.d = !c0223m3.f2977a && z8;
                c0223m3.f2978b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0223m2.d) {
                    i21++;
                }
                if (c0223m2.f2977a) {
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
                C0223m c0223m4 = (C0223m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0223m4.d) {
                    int i32 = c0223m4.f2978b;
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
                C0223m c0223m5 = (C0223m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0223m5.f2980e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0223m5.f2978b += r4;
                    c0223m5.f2981f = r4;
                    i14--;
                } else if (c0223m5.f2978b == i33) {
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
                if ((j2 & 1) != 0 && !((C0223m) getChildAt(0).getLayoutParams()).f2980e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0223m) getChildAt(i41).getLayoutParams()).f2980e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > RecyclerView.f1559A0 ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0223m c0223m6 = (C0223m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0223m6.f2979c = i42;
                        c0223m6.f2981f = true;
                        if (i43 == 0 && !c0223m6.f2980e) {
                            ((LinearLayout.LayoutParams) c0223m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0223m6.f2977a) {
                            c0223m6.f2979c = i42;
                            c0223m6.f2981f = true;
                            ((LinearLayout.LayoutParams) c0223m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0223m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0223m6).rightMargin = i42 / 2;
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
                C0223m c0223m7 = (C0223m) childAt4.getLayoutParams();
                if (c0223m7.f2981f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0223m7.f2978b * i16) + c0223m7.f2979c, 1073741824), i7);
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
        this.f1338t.f2970q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0225n interfaceC0225n) {
        this.f1344z = interfaceC0225n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0219k c0219k = this.f1338t;
        C0217j c0217j = c0219k.i;
        if (c0217j != null) {
            c0217j.setImageDrawable(drawable);
        } else {
            c0219k.f2964k = true;
            c0219k.f2963j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1337s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1336r != i) {
            this.f1336r = i;
            if (i == 0) {
                this.f1335q = getContext();
            } else {
                this.f1335q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0219k c0219k) {
        this.f1338t = c0219k;
        c0219k.h = this;
        this.f1334p = c0219k.f2959c;
    }

    @Override // l.AbstractC0246x0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0223m(getContext(), attributeSet);
    }
}
