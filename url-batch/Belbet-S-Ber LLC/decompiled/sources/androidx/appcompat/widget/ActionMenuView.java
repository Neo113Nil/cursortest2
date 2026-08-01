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
import k.o;
import l.f3;
import l.i;
import l.j;
import l.k;
import l.m;
import l.t1;
import l.t2;
import l.u1;
import o2.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ActionMenuView extends u1 implements l, a0 {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public m E;

    /* renamed from: u, reason: collision with root package name */
    public k.m f327u;

    /* renamed from: v, reason: collision with root package name */
    public Context f328v;

    /* renamed from: w, reason: collision with root package name */
    public int f329w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f330x;

    /* renamed from: y, reason: collision with root package name */
    public j f331y;

    /* renamed from: z, reason: collision with root package name */
    public t2 f332z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f5);
        this.D = (int) (f5 * 4.0f);
        this.f328v = context;
        this.f329w = 0;
    }

    public static l.l j() {
        l.l lVar = new l.l(-2, -2);
        lVar.f2493a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l.l k(ViewGroup.LayoutParams layoutParams) {
        l.l lVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof l.l) {
            l.l lVar2 = (l.l) layoutParams;
            lVar = new l.l(lVar2);
            lVar.f2493a = lVar2.f2493a;
        } else {
            lVar = new l.l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // k.l
    public final boolean a(o oVar) {
        return this.f327u.q(oVar, null, 0);
    }

    @Override // k.a0
    public final void c(k.m mVar) {
        this.f327u = mVar;
    }

    @Override // l.u1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l.l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.u1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ t1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.u1
    /* renamed from: g */
    public final t1 generateLayoutParams(AttributeSet attributeSet) {
        return new l.l(getContext(), attributeSet);
    }

    @Override // l.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f327u == null) {
            Context context = getContext();
            k.m mVar = new k.m(context);
            this.f327u = mVar;
            mVar.f2214e = new a(21, this);
            j jVar = new j(context);
            this.f331y = jVar;
            jVar.f2471q = true;
            jVar.f2472r = true;
            jVar.f2464j = new f(18);
            this.f327u.b(jVar, this.f328v);
            j jVar2 = this.f331y;
            jVar2.f2467m = this;
            this.f327u = jVar2.h;
        }
        return this.f327u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.f331y;
        i iVar = jVar.f2468n;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f2470p) {
            return jVar.f2469o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f329w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.u1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z4 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof k)) {
            z4 = ((k) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof k)) ? z4 : ((k) childAt2).c() | z4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.f331y;
        if (jVar != null) {
            jVar.g();
            if (this.f331y.h()) {
                this.f331y.e();
                this.f331y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f331y;
        if (jVar != null) {
            jVar.e();
            l.f fVar = jVar.f2479y;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f2273j.dismiss();
        }
    }

    @Override // l.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.A) {
            super.onLayout(z4, i, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z5 = f3.f2448a;
        boolean z6 = getLayoutDirection() == 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                l.l lVar = (l.l) childAt.getLayoutParams();
                if (lVar.f2493a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z6) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
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
        if (z6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                l.l lVar2 = (l.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f2493a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            l.l lVar3 = (l.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f2493a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // l.u1, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        k.m mVar;
        boolean z4 = this.A;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z5;
        if (z4 != z5) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.A && (mVar = this.f327u) != null && size != this.B) {
            this.B = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                l.l lVar = (l.l) getChildAt(i9).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
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
        boolean z6 = false;
        int i19 = 0;
        long j2 = 0;
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
                boolean z7 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z7) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                l.l lVar2 = (l.l) childAt.getLayoutParams();
                lVar2.f2497f = false;
                lVar2.f2495c = 0;
                lVar2.f2494b = 0;
                lVar2.d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f2496e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = lVar2.f2493a ? 1 : i12;
                l.l lVar3 = (l.l) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z9 = z8;
                if (i22 <= 0 || (z8 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z9 && i8 < 2) {
                        i8 = 2;
                    }
                }
                lVar3.d = !lVar3.f2493a && z9;
                lVar3.f2494b = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (lVar2.d) {
                    i19++;
                }
                if (lVar2.f2493a) {
                    z6 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j2 |= 1 << i18;
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
        boolean z10 = z6 && i16 == 2;
        int i27 = i25;
        boolean z11 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j4 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                int i31 = i15;
                l.l lVar4 = (l.l) getChildAt(i30).getLayoutParams();
                boolean z12 = z10;
                if (lVar4.d) {
                    int i32 = lVar4.f2494b;
                    if (i32 < i28) {
                        j4 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j4 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z10 = z12;
                i15 = i31;
            }
            i6 = i15;
            boolean z13 = z10;
            j2 |= j4;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                l.l lVar5 = (l.l) childAt2.getLayoutParams();
                boolean z14 = z6;
                long j5 = 1 << i34;
                if ((j4 & j5) != 0) {
                    if (z13 && lVar5.f2496e) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f2494b += r11;
                    lVar5.f2497f = r11;
                    i27--;
                } else if (lVar5.f2494b == i33) {
                    j2 |= j5;
                }
                i34++;
                z6 = z14;
            }
            z10 = z13;
            i15 = i6;
            z11 = true;
        }
        i6 = i15;
        boolean z15 = !z6 && i16 == 1;
        if (i27 > 0 && j2 != 0 && (i27 < i16 - 1 || z15 || i17 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z15) {
                if ((j2 & 1) != 0 && !((l.l) getChildAt(0).getLayoutParams()).f2496e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j2 & (1 << i35)) != 0 && !((l.l) getChildAt(i35).getLayoutParams()).f2496e) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z16 = z11;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j2 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    l.l lVar6 = (l.l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f2495c = i36;
                        lVar6.f2497f = true;
                        if (i37 == 0 && !lVar6.f2496e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i36) / 2;
                        }
                        z16 = true;
                    } else if (lVar6.f2493a) {
                        lVar6.f2495c = i36;
                        lVar6.f2497f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i36) / 2;
                        z16 = true;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z11 = z16;
        }
        if (z11) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                l.l lVar7 = (l.l) childAt4.getLayoutParams();
                if (lVar7.f2497f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f2494b * i26) + lVar7.f2495c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f331y.f2476v = z4;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.E = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.f331y;
        i iVar = jVar.f2468n;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.f2470p = true;
            jVar.f2469o = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f330x = z4;
    }

    public void setPopupTheme(int i) {
        if (this.f329w != i) {
            this.f329w = i;
            if (i == 0) {
                this.f328v = getContext();
            } else {
                this.f328v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.f331y = jVar;
        jVar.f2467m = this;
        this.f327u = jVar.h;
    }

    @Override // l.u1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l.l(getContext(), attributeSet);
    }
}
