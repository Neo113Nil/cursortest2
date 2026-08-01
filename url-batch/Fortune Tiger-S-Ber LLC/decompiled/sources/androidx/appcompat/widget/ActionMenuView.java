package androidx.appcompat.widget;

import a2.e;
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
import g2.f;
import j.a0;
import j.l;
import j.m;
import j.o;
import k.e3;
import k.g;
import k.j;
import k.k;
import k.n;
import k.s2;
import k.t1;
import k.u1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ActionMenuView extends u1 implements l, a0 {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public n E;

    /* renamed from: u, reason: collision with root package name */
    public m f219u;

    /* renamed from: v, reason: collision with root package name */
    public Context f220v;

    /* renamed from: w, reason: collision with root package name */
    public int f221w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f222x;

    /* renamed from: y, reason: collision with root package name */
    public k f223y;

    /* renamed from: z, reason: collision with root package name */
    public s2 f224z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f4);
        this.D = (int) (f4 * 4.0f);
        this.f220v = context;
        this.f221w = 0;
    }

    public static k.m j() {
        k.m mVar = new k.m(-2, -2);
        mVar.f2595a = false;
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    public static k.m k(ViewGroup.LayoutParams layoutParams) {
        k.m mVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof k.m) {
            k.m mVar2 = (k.m) layoutParams;
            mVar = new k.m(mVar2);
            mVar.f2595a = mVar2.f2595a;
        } else {
            mVar = new k.m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) mVar).gravity = 16;
        }
        return mVar;
    }

    @Override // j.a0
    public final void a(m mVar) {
        this.f219u = mVar;
    }

    @Override // j.l
    public final boolean c(o oVar) {
        return this.f219u.q(oVar, null, 0);
    }

    @Override // k.u1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k.m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.u1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ t1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // k.u1
    /* renamed from: g */
    public final t1 generateLayoutParams(AttributeSet attributeSet) {
        return new k.m(getContext(), attributeSet);
    }

    @Override // k.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // k.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f219u == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f219u = mVar;
            mVar.f2192e = new e(20, this);
            k kVar = new k(context);
            this.f223y = kVar;
            kVar.f2576q = true;
            kVar.f2577r = true;
            kVar.f2569j = new f(12);
            this.f219u.b(kVar, this.f220v);
            k kVar2 = this.f223y;
            kVar2.f2572m = this;
            this.f219u = kVar2.h;
        }
        return this.f219u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k kVar = this.f223y;
        j jVar = kVar.f2573n;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f2575p) {
            return kVar.f2574o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f221w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // k.u1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i4) {
        boolean z3 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof k.l)) {
            z3 = ((k.l) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof k.l)) ? z3 : ((k.l) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVar = this.f223y;
        if (kVar != null) {
            kVar.e();
            if (this.f223y.f()) {
                this.f223y.c();
                this.f223y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f223y;
        if (kVar != null) {
            kVar.c();
            g gVar = kVar.f2584y;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f2250j.dismiss();
        }
    }

    @Override // k.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.A) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean z4 = e3.f2538a;
        boolean z5 = getLayoutDirection() == 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                k.m mVar = (k.m) childAt.getLayoutParams();
                if (mVar.f2595a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z5) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    l(i13);
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
        if (z5) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                k.m mVar2 = (k.m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f2595a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            k.m mVar3 = (k.m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f2595a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.u1, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        m mVar;
        boolean z3 = this.A;
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.A = z4;
        if (z3 != z4) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.A && (mVar = this.f219u) != null && size != this.B) {
            this.B = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                k.m mVar2 = (k.m) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
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
        int i12 = this.C;
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
            i6 = this.D;
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
                k.m mVar3 = (k.m) childAt.getLayoutParams();
                mVar3.f2599f = false;
                mVar3.c = 0;
                mVar3.f2596b = 0;
                mVar3.f2597d = false;
                ((LinearLayout.LayoutParams) mVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) mVar3).rightMargin = 0;
                mVar3.f2598e = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = mVar3.f2595a ? 1 : i13;
                k.m mVar4 = (k.m) childAt.getLayoutParams();
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
                mVar4.f2597d = !mVar4.f2595a && z8;
                mVar4.f2596b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                i18 = Math.max(i18, i9);
                if (mVar3.f2597d) {
                    i20++;
                }
                if (mVar3.f2595a) {
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
                k.m mVar5 = (k.m) getChildAt(i31).getLayoutParams();
                boolean z11 = z9;
                if (mVar5.f2597d) {
                    int i33 = mVar5.f2596b;
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
                k.m mVar6 = (k.m) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j6 = 1 << i35;
                if ((j5 & j6) != 0) {
                    if (z12 && mVar6.f2598e) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i6 + i27, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    mVar6.f2596b += r11;
                    mVar6.f2599f = r11;
                    i28--;
                } else if (mVar6.f2596b == i34) {
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
                if ((j4 & 1) != 0 && !((k.m) getChildAt(0).getLayoutParams()).f2598e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j4 & (1 << i36)) != 0 && !((k.m) getChildAt(i36).getLayoutParams()).f2598e) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i28 * i27) / bitCount) : 0;
            boolean z15 = z10;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j4 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    k.m mVar7 = (k.m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar7.c = i37;
                        mVar7.f2599f = true;
                        if (i38 == 0 && !mVar7.f2598e) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = (-i37) / 2;
                        }
                        z15 = true;
                    } else if (mVar7.f2595a) {
                        mVar7.c = i37;
                        mVar7.f2599f = true;
                        ((LinearLayout.LayoutParams) mVar7).rightMargin = (-i37) / 2;
                        z15 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) mVar7).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                k.m mVar8 = (k.m) childAt4.getLayoutParams();
                if (mVar8.f2599f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar8.f2596b * i27) + mVar8.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f223y.f2581v = z3;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.E = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k kVar = this.f223y;
        j jVar = kVar.f2573n;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.f2575p = true;
            kVar.f2574o = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f222x = z3;
    }

    public void setPopupTheme(int i4) {
        if (this.f221w != i4) {
            this.f221w = i4;
            if (i4 == 0) {
                this.f220v = getContext();
            } else {
                this.f220v = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(k kVar) {
        this.f223y = kVar;
        kVar.f2572m = this;
        this.f219u = kVar.h;
    }

    @Override // k.u1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k.m(getContext(), attributeSet);
    }
}
