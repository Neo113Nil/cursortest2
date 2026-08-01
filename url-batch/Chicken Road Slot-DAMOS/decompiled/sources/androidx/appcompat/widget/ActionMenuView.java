package androidx.appcompat.widget;

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
import k5.c;
import l.d;
import l.h;
import l.i;
import m.g;
import m.j;
import m.j2;
import m.k;
import m.l;
import m.m;
import m.t0;
import m.t1;
import m.u0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ActionMenuView extends u0 implements h {
    public i D;
    public Context E;
    public int F;
    public j G;
    public t1 H;
    public boolean I;
    public int J;
    public final int K;
    public final int L;
    public m M;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.K = (int) (56.0f * f3);
        this.L = (int) (f3 * 4.0f);
        this.E = context;
        this.F = 0;
    }

    public static l h() {
        l lVar = new l(-2, -2);
        lVar.f6120a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l i(ViewGroup.LayoutParams layoutParams) {
        l lVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof l) {
            l lVar2 = (l) layoutParams;
            lVar = new l(lVar2);
            lVar.f6120a = lVar2.f6120a;
        } else {
            lVar = new l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // l.h
    public final boolean a(l.j jVar) {
        return this.D.p(jVar, null, 0);
    }

    @Override // m.u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }

    @Override // m.u0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ t0 generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.u0
    /* renamed from: e */
    public final t0 generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    @Override // m.u0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // m.u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // m.u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.D == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.D = iVar;
            iVar.f5669e = new d(5, this);
            j jVar = new j(context);
            this.G = jVar;
            jVar.f6108y = true;
            jVar.f6109z = true;
            jVar.f6102s = new c(7);
            this.D.b(jVar, this.E);
            j jVar2 = this.G;
            jVar2.f6104u = this;
            this.D = jVar2.f6100i;
        }
        return this.D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.G;
        m.i iVar = jVar.f6105v;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f6107x) {
            return jVar.f6106w;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean z10 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof k)) {
            z10 = ((k) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof k)) ? z10 : ((k) childAt2).c() | z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.G;
        if (jVar != null) {
            jVar.c();
            g gVar = this.G.F;
            if (gVar == null || !gVar.b()) {
                return;
            }
            this.G.d();
            this.G.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.G;
        if (jVar != null) {
            jVar.d();
            g gVar = jVar.G;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f5716i.dismiss();
        }
    }

    @Override // m.u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.I) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i3;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = j2.f6117a;
        boolean z12 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                l lVar = (l) childAt.getLayoutParams();
                if (lVar.f6120a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    j(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                l lVar2 = (l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f6120a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            l lVar3 = (l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f6120a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.u0, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        i iVar;
        boolean z10 = this.I;
        boolean z11 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.I = z11;
        if (z10 != z11) {
            this.J = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.I && (iVar = this.D) != null && size != this.J) {
            this.J = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.I || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                l lVar = (l) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i3, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.K;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z12 = false;
        int i25 = 0;
        long j = 0;
        while (true) {
            i11 = this.L;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            int i27 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                l lVar2 = (l) childAt.getLayoutParams();
                lVar2.f6125f = false;
                lVar2.f6122c = 0;
                lVar2.f6121b = 0;
                lVar2.f6123d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f6124e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = lVar2.f6120a ? 1 : i18;
                l lVar3 = (l) childAt.getLayoutParams();
                int i29 = i18;
                i13 = i20;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i28 <= 0 || (z14 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z15 && i14 < 2) {
                        i14 = 2;
                    }
                }
                lVar3.f6123d = !lVar3.f6120a && z15;
                lVar3.f6121b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (lVar2.f6123d) {
                    i25++;
                }
                if (lVar2.f6120a) {
                    z12 = true;
                }
                i18 = i29 - i14;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j |= 1 << i24;
                }
            }
            i24++;
            size3 = i26;
            paddingBottom = i27;
            i20 = i13;
        }
        int i30 = size3;
        int i31 = i18;
        int i32 = i20;
        boolean z16 = z12 && i22 == 2;
        int i33 = i31;
        boolean z17 = false;
        while (i25 > 0 && i33 > 0) {
            int i34 = Integer.MAX_VALUE;
            long j3 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < childCount2) {
                int i37 = i21;
                l lVar4 = (l) getChildAt(i36).getLayoutParams();
                boolean z18 = z16;
                if (lVar4.f6123d) {
                    int i38 = lVar4.f6121b;
                    if (i38 < i34) {
                        j3 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        j3 |= 1 << i36;
                        i35++;
                    }
                }
                i36++;
                z16 = z18;
                i21 = i37;
            }
            i12 = i21;
            boolean z19 = z16;
            j |= j3;
            if (i35 > i33) {
                break;
            }
            int i39 = i34 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                l lVar5 = (l) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j10 = 1 << i40;
                if ((j3 & j10) != 0) {
                    if (z19 && lVar5.f6124e) {
                        r11 = 1;
                        r11 = 1;
                        if (i33 == 1) {
                            childAt2.setPadding(i11 + i32, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f6121b += r11;
                    lVar5.f6125f = r11;
                    i33--;
                } else if (lVar5.f6121b == i39) {
                    j |= j10;
                }
                i40++;
                z12 = z20;
            }
            z16 = z19;
            i21 = i12;
            z17 = true;
        }
        i12 = i21;
        boolean z21 = !z12 && i22 == 1;
        if (i33 > 0 && j != 0 && (i33 < i22 - 1 || z21 || i23 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z21) {
                if ((j & 1) != 0 && !((l) getChildAt(0).getLayoutParams()).f6124e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j & (1 << i41)) != 0 && !((l) getChildAt(i41).getLayoutParams()).f6124e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z22 = z17;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    l lVar6 = (l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f6122c = i42;
                        lVar6.f6125f = true;
                        if (i43 == 0 && !lVar6.f6124e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i42) / 2;
                        }
                        z22 = true;
                    } else if (lVar6.f6120a) {
                        lVar6.f6122c = i42;
                        lVar6.f6125f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i42) / 2;
                        z22 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i44 = 0; i44 < childCount2; i44++) {
                View childAt4 = getChildAt(i44);
                l lVar7 = (l) childAt4.getLayoutParams();
                if (lVar7.f6125f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f6121b * i32) + lVar7.f6122c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.G.D = z10;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.M = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.G;
        m.i iVar = jVar.f6105v;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.f6107x = true;
            jVar.f6106w = drawable;
        }
    }

    public void setPopupTheme(int i3) {
        if (this.F != i3) {
            this.F = i3;
            if (i3 == 0) {
                this.E = getContext();
            } else {
                this.E = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.G = jVar;
        jVar.f6104u = this;
        this.D = jVar.f6100i;
    }

    @Override // m.u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setOverflowReserved(boolean z10) {
    }
}
