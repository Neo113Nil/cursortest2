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
import b1.b;
import k.h;
import k.i;
import k.j;
import l.a1;
import l.a2;
import l.b1;
import l.k;
import l.l;
import l.p2;
import w5.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ActionMenuView extends b1 implements h {
    public final int A;
    public l B;

    /* renamed from: s, reason: collision with root package name */
    public i f399s;

    /* renamed from: t, reason: collision with root package name */
    public Context f400t;

    /* renamed from: u, reason: collision with root package name */
    public int f401u;

    /* renamed from: v, reason: collision with root package name */
    public l.i f402v;

    /* renamed from: w, reason: collision with root package name */
    public a2 f403w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f404x;

    /* renamed from: y, reason: collision with root package name */
    public int f405y;

    /* renamed from: z, reason: collision with root package name */
    public final int f406z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f406z = (int) (56.0f * f6);
        this.A = (int) (f6 * 4.0f);
        this.f400t = context;
        this.f401u = 0;
    }

    public static k i() {
        k kVar = new k(-2, -2);
        kVar.f4318a = false;
        ((LinearLayout.LayoutParams) kVar).gravity = 16;
        return kVar;
    }

    public static k j(ViewGroup.LayoutParams layoutParams) {
        k kVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof k) {
            k kVar2 = (k) layoutParams;
            kVar = new k(kVar2);
            kVar.f4318a = kVar2.f4318a;
        } else {
            kVar = new k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) kVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) kVar).gravity = 16;
        }
        return kVar;
    }

    @Override // k.h
    public final boolean a(j jVar) {
        return this.f399s.p(jVar, null, 0);
    }

    @Override // l.b1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.b1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ a1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // l.b1
    /* renamed from: f */
    public final a1 generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    @Override // l.b1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ a1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // l.b1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // l.b1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f399s == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.f399s = iVar;
            iVar.f4074e = new b(20, this);
            l.i iVar2 = new l.i(context);
            this.f402v = iVar2;
            iVar2.f4264n = true;
            iVar2.f4265o = true;
            iVar2.f4259h = new f(26);
            this.f399s.b(iVar2, this.f400t);
            l.i iVar3 = this.f402v;
            iVar3.f4260j = this;
            this.f399s = iVar3.f4257f;
        }
        return this.f399s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        l.i iVar = this.f402v;
        l.h hVar = iVar.f4261k;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.f4263m) {
            return iVar.f4262l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f401u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof l.j)) {
            z3 = ((l.j) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof l.j)) ? z3 : ((l.j) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l.i iVar = this.f402v;
        if (iVar != null) {
            iVar.f();
            l.f fVar = this.f402v.f4271u;
            if (fVar == null || !fVar.b()) {
                return;
            }
            this.f402v.g();
            this.f402v.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l.i iVar = this.f402v;
        if (iVar != null) {
            iVar.g();
            l.f fVar = iVar.f4272v;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.i.dismiss();
        }
    }

    @Override // l.b1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f404x) {
            super.onLayout(z3, i, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean z7 = p2.f4378a;
        boolean z8 = getLayoutDirection() == 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                k kVar = (k) childAt.getLayoutParams();
                if (kVar.f4318a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z8) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    k(i16);
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
        if (z8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                k kVar2 = (k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.f4318a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            k kVar3 = (k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.f4318a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // l.b1, android.view.View
    public final void onMeasure(int i, int i8) {
        int i9;
        int i10;
        ?? r11;
        int i11;
        int i12;
        i iVar;
        boolean z3 = this.f404x;
        boolean z7 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f404x = z7;
        if (z3 != z7) {
            this.f405y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f404x && (iVar = this.f399s) != null && size != this.f405y) {
            this.f405y = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f404x || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                k kVar = (k) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar).leftMargin = 0;
            }
            super.onMeasure(i, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f406z;
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
        boolean z8 = false;
        int i23 = 0;
        long j7 = 0;
        while (true) {
            i9 = this.A;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z9) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                k kVar2 = (k) childAt.getLayoutParams();
                kVar2.f4323f = false;
                kVar2.f4320c = 0;
                kVar2.f4319b = 0;
                kVar2.f4321d = false;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                kVar2.f4322e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = kVar2.f4318a ? 1 : i16;
                k kVar3 = (k) childAt.getLayoutParams();
                int i27 = i16;
                i11 = i18;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z11 = z10;
                if (i26 <= 0 || (z10 && i26 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i11;
                    if (measuredWidth % i11 != 0) {
                        i12++;
                    }
                    if (z11 && i12 < 2) {
                        i12 = 2;
                    }
                }
                kVar3.f4321d = !kVar3.f4318a && z11;
                kVar3.f4319b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (kVar2.f4321d) {
                    i23++;
                }
                if (kVar2.f4318a) {
                    z8 = true;
                }
                i16 = i27 - i12;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j7 |= 1 << i22;
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
        boolean z12 = z8 && i20 == 2;
        int i31 = i29;
        boolean z13 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j8 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = i19;
                k kVar4 = (k) getChildAt(i34).getLayoutParams();
                boolean z14 = z12;
                if (kVar4.f4321d) {
                    int i36 = kVar4.f4319b;
                    if (i36 < i32) {
                        j8 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j8 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z12 = z14;
                i19 = i35;
            }
            i10 = i19;
            boolean z15 = z12;
            j7 |= j8;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                k kVar5 = (k) childAt2.getLayoutParams();
                boolean z16 = z8;
                long j9 = 1 << i38;
                if ((j8 & j9) != 0) {
                    if (z15 && kVar5.f4322e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i9 + i30, 0, i9, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar5.f4319b += r11;
                    kVar5.f4323f = r11;
                    i31--;
                } else if (kVar5.f4319b == i37) {
                    j7 |= j9;
                }
                i38++;
                z8 = z16;
            }
            z12 = z15;
            i19 = i10;
            z13 = true;
        }
        i10 = i19;
        boolean z17 = !z8 && i20 == 1;
        if (i31 > 0 && j7 != 0 && (i31 < i20 - 1 || z17 || i21 > 1)) {
            float bitCount = Long.bitCount(j7);
            if (!z17) {
                if ((j7 & 1) != 0 && !((k) getChildAt(0).getLayoutParams()).f4322e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j7 & (1 << i39)) != 0 && !((k) getChildAt(i39).getLayoutParams()).f4322e) {
                    bitCount -= 0.5f;
                }
            }
            int i40 = bitCount > 0.0f ? (int) ((i31 * i30) / bitCount) : 0;
            boolean z18 = z13;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j7 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    k kVar6 = (k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar6.f4320c = i40;
                        kVar6.f4323f = true;
                        if (i41 == 0 && !kVar6.f4322e) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = (-i40) / 2;
                        }
                        z18 = true;
                    } else if (kVar6.f4318a) {
                        kVar6.f4320c = i40;
                        kVar6.f4323f = true;
                        ((LinearLayout.LayoutParams) kVar6).rightMargin = (-i40) / 2;
                        z18 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z13 = z18;
        }
        if (z13) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                k kVar7 = (k) childAt4.getLayoutParams();
                if (kVar7.f4323f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar7.f4319b * i30) + kVar7.f4320c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i10 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f402v.f4269s = z3;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.B = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        l.i iVar = this.f402v;
        l.h hVar = iVar.f4261k;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            iVar.f4263m = true;
            iVar.f4262l = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.f401u != i) {
            this.f401u = i;
            if (i == 0) {
                this.f400t = getContext();
            } else {
                this.f400t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(l.i iVar) {
        this.f402v = iVar;
        iVar.f4260j = this;
        this.f399s = iVar.f4257f;
    }

    @Override // l.b1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z3) {
    }
}
