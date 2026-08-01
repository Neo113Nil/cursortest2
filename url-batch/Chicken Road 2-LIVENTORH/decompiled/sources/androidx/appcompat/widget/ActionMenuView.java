package androidx.appcompat.widget;

import a0.a;
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
import k.a0;
import k.l;
import k.m;
import l.g;
import l.j;
import l.l3;
import l.n;
import l.o;
import l.w1;
import l.w2;
import l.x1;
import l2.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ActionMenuView extends x1 implements l, a0 {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public o E;

    /* renamed from: u, reason: collision with root package name */
    public m f198u;

    /* renamed from: v, reason: collision with root package name */
    public Context f199v;

    /* renamed from: w, reason: collision with root package name */
    public int f200w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f201x;

    /* renamed from: y, reason: collision with root package name */
    public l.l f202y;

    /* renamed from: z, reason: collision with root package name */
    public w2 f203z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f2);
        this.D = (int) (f2 * 4.0f);
        this.f199v = context;
        this.f200w = 0;
    }

    public static n j() {
        n nVar = new n(-2, -2);
        nVar.f2395a = false;
        ((LinearLayout.LayoutParams) nVar).gravity = 16;
        return nVar;
    }

    public static n k(ViewGroup.LayoutParams layoutParams) {
        n nVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof n) {
            n nVar2 = (n) layoutParams;
            nVar = new n(nVar2);
            nVar.f2395a = nVar2.f2395a;
        } else {
            nVar = new n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) nVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) nVar).gravity = 16;
        }
        return nVar;
    }

    @Override // k.l
    public final boolean a(k.o oVar) {
        return this.f198u.q(oVar, null, 0);
    }

    @Override // k.a0
    public final void c(m mVar) {
        this.f198u = mVar;
    }

    @Override // l.x1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.x1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ w1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.x1
    /* renamed from: g */
    public final w1 generateLayoutParams(AttributeSet attributeSet) {
        return new n(getContext(), attributeSet);
    }

    @Override // l.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f198u == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f198u = mVar;
            mVar.f2063e = new a(17, this);
            l.l lVar = new l.l(context);
            this.f202y = lVar;
            lVar.f2370r = true;
            lVar.f2371s = true;
            lVar.f2362j = new f(17);
            this.f198u.b(lVar, this.f199v);
            l.l lVar2 = this.f202y;
            lVar2.f2365m = this;
            this.f198u = lVar2.f2361h;
        }
        return this.f198u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        l.l lVar = this.f202y;
        j jVar = lVar.f2367o;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (lVar.f2369q) {
            return lVar.f2368p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f200w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.x1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof l.m)) {
            z3 = ((l.m) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof l.m)) ? z3 : ((l.m) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l.l lVar = this.f202y;
        if (lVar != null) {
            lVar.m(false);
            if (this.f202y.k()) {
                this.f202y.f();
                this.f202y.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l.l lVar = this.f202y;
        if (lVar != null) {
            lVar.f();
            g gVar = lVar.f2378z;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.i.dismiss();
        }
    }

    @Override // l.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.A) {
            super.onLayout(z3, i, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z4 = l3.f2381a;
        boolean z5 = getLayoutDirection() == 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                n nVar = (n) childAt.getLayoutParams();
                if (nVar.f2395a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z5) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) nVar).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) nVar).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) nVar).leftMargin) + ((LinearLayout.LayoutParams) nVar).rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (z5) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                n nVar2 = (n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !nVar2.f2395a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) nVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) nVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            n nVar3 = (n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !nVar3.f2395a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) nVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) nVar3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // l.x1, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        m mVar;
        boolean z3 = this.A;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z4;
        if (z3 != z4) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.A && (mVar = this.f198u) != null && size != this.B) {
            this.B = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                n nVar = (n) getChildAt(i9).getLayoutParams();
                ((LinearLayout.LayoutParams) nVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) nVar).leftMargin = 0;
            }
            super.onMeasure(i, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.C;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        long j4 = 0;
        while (true) {
            i5 = this.D;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                n nVar2 = (n) childAt.getLayoutParams();
                nVar2.f2399f = false;
                nVar2.f2397c = 0;
                nVar2.f2396b = 0;
                nVar2.d = false;
                ((LinearLayout.LayoutParams) nVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) nVar2).rightMargin = 0;
                nVar2.f2398e = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = nVar2.f2395a ? 1 : i12;
                n nVar3 = (n) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i22 <= 0 || (z7 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                nVar3.d = !nVar3.f2395a && z8;
                nVar3.f2396b = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (nVar2.d) {
                    i19++;
                }
                if (nVar2.f2395a) {
                    z5 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j4 |= 1 << i18;
                }
            }
            i18++;
            size3 = i20;
            paddingBottom = i21;
            i14 = i7;
        }
        int i24 = size3;
        int i25 = i12;
        int i26 = i14;
        boolean z9 = z5 && i16 == 2;
        int i27 = i25;
        boolean z10 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j5 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                int i31 = i15;
                n nVar4 = (n) getChildAt(i30).getLayoutParams();
                boolean z11 = z9;
                if (nVar4.d) {
                    int i32 = nVar4.f2396b;
                    if (i32 < i28) {
                        j5 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j5 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z9 = z11;
                i15 = i31;
            }
            i6 = i15;
            boolean z12 = z9;
            j4 |= j5;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                n nVar5 = (n) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j6 = 1 << i34;
                if ((j5 & j6) != 0) {
                    if (z12 && nVar5.f2398e) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    nVar5.f2396b += r11;
                    nVar5.f2399f = r11;
                    i27--;
                } else if (nVar5.f2396b == i33) {
                    j4 |= j6;
                }
                i34++;
                z5 = z13;
            }
            z9 = z12;
            i15 = i6;
            z10 = true;
        }
        i6 = i15;
        boolean z14 = !z5 && i16 == 1;
        if (i27 > 0 && j4 != 0 && (i27 < i16 - 1 || z14 || i17 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z14) {
                if ((j4 & 1) != 0 && !((n) getChildAt(0).getLayoutParams()).f2398e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j4 & (1 << i35)) != 0 && !((n) getChildAt(i35).getLayoutParams()).f2398e) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z15 = z10;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j4 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    n nVar6 = (n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        nVar6.f2397c = i36;
                        nVar6.f2399f = true;
                        if (i37 == 0 && !nVar6.f2398e) {
                            ((LinearLayout.LayoutParams) nVar6).leftMargin = (-i36) / 2;
                        }
                        z15 = true;
                    } else if (nVar6.f2395a) {
                        nVar6.f2397c = i36;
                        nVar6.f2399f = true;
                        ((LinearLayout.LayoutParams) nVar6).rightMargin = (-i36) / 2;
                        z15 = true;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) nVar6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) nVar6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                n nVar7 = (n) childAt4.getLayoutParams();
                if (nVar7.f2399f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((nVar7.f2396b * i26) + nVar7.f2397c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f202y.f2375w = z3;
    }

    public void setOnMenuItemClickListener(o oVar) {
        this.E = oVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        l.l lVar = this.f202y;
        j jVar = lVar.f2367o;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            lVar.f2369q = true;
            lVar.f2368p = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f201x = z3;
    }

    public void setPopupTheme(int i) {
        if (this.f200w != i) {
            this.f200w = i;
            if (i == 0) {
                this.f199v = getContext();
            } else {
                this.f199v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(l.l lVar) {
        this.f202y = lVar;
        lVar.f2365m = this;
        this.f198u = lVar.f2361h;
    }

    @Override // l.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new n(getContext(), attributeSet);
    }
}
