package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.J;

/* loaded from: classes.dex */
public class ActionMenuView extends J implements e.b, androidx.appcompat.view.menu.k {

    /* renamed from: a, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f10557a;

    /* renamed from: b, reason: collision with root package name */
    private Context f10558b;

    /* renamed from: c, reason: collision with root package name */
    private int f10559c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10560d;

    /* renamed from: e, reason: collision with root package name */
    private ActionMenuPresenter f10561e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f10562f;

    /* renamed from: g, reason: collision with root package name */
    e.a f10563g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10564h;

    /* renamed from: i, reason: collision with root package name */
    private int f10565i;

    /* renamed from: j, reason: collision with root package name */
    private int f10566j;

    /* renamed from: k, reason: collision with root package name */
    private int f10567k;

    /* renamed from: l, reason: collision with root package name */
    e f10568l;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends J.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10569a;

        /* renamed from: b, reason: collision with root package name */
        public int f10570b;

        /* renamed from: c, reason: collision with root package name */
        public int f10571c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10572d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f10573e;

        /* renamed from: f, reason: collision with root package name */
        boolean f10574f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f10569a = cVar.f10569a;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f10569a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f10568l;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f10563g;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int q(View view, int i4, int i5, int i6, int i7) {
        int i8;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z4 = false;
        boolean z5 = actionMenuItemView != null && actionMenuItemView.d();
        if (i5 > 0) {
            i8 = 2;
            if (!z5 || i5 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i9 = measuredWidth / i4;
                if (measuredWidth % i4 != 0) {
                    i9++;
                }
                if (!z5 || i9 >= 2) {
                    i8 = i9;
                }
                if (!cVar.f10569a && z5) {
                    z4 = true;
                }
                cVar.f10572d = z4;
                cVar.f10570b = i8;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
                return i8;
            }
        }
        i8 = 0;
        if (!cVar.f10569a) {
            z4 = true;
        }
        cVar.f10572d = z4;
        cVar.f10570b = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
        return i8;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void r(int i4, int i5) {
        long j4;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        ?? r32;
        int i8;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f10566j;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z6 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j5 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i19 = size2;
            if (childAt.getVisibility() == 8) {
                i8 = i13;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z7) {
                    int i20 = this.f10567k;
                    z5 = z7;
                    r32 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    z5 = z7;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f10574f = r32;
                cVar.f10571c = r32;
                cVar.f10570b = r32;
                cVar.f10572d = r32;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r32;
                cVar.f10573e = z5 && ((ActionMenuItemView) childAt).d();
                int q4 = q(childAt, i13, cVar.f10569a ? 1 : i11, childMeasureSpec, paddingTop);
                i17 = Math.max(i17, q4);
                i8 = i13;
                if (cVar.f10572d) {
                    i18++;
                }
                if (cVar.f10569a) {
                    z6 = true;
                }
                i11 -= q4;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (q4 == 1) {
                    j5 |= 1 << i15;
                }
            }
            i15++;
            size2 = i19;
            i13 = i8;
        }
        int i21 = size2;
        int i22 = i13;
        char c4 = 2;
        boolean z8 = z6 && i16 == 2;
        boolean z9 = false;
        while (i18 > 0 && i11 > 0) {
            int i23 = Integer.MAX_VALUE;
            long j6 = 0;
            char c5 = c4;
            int i24 = 0;
            int i25 = 0;
            j4 = 1;
            while (i25 < childCount) {
                c cVar2 = (c) getChildAt(i25).getLayoutParams();
                boolean z10 = z8;
                if (cVar2.f10572d) {
                    int i26 = cVar2.f10570b;
                    if (i26 < i23) {
                        j6 = 1 << i25;
                        i23 = i26;
                        i24 = 1;
                    } else if (i26 == i23) {
                        j6 |= 1 << i25;
                        i24++;
                    }
                }
                i25++;
                z8 = z10;
            }
            boolean z11 = z8;
            j5 |= j6;
            if (i24 > i11) {
                break;
            }
            int i27 = i23 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j7 = 1 << i28;
                if ((j6 & j7) == 0) {
                    if (cVar3.f10570b == i27) {
                        j5 |= j7;
                    }
                    i7 = i28;
                } else {
                    if (!z11 || !cVar3.f10573e) {
                        i7 = i28;
                        z4 = true;
                    } else if (i11 == 1) {
                        int i29 = this.f10567k;
                        z4 = true;
                        i7 = i28;
                        childAt2.setPadding(i29 + i22, 0, i29, 0);
                    } else {
                        i7 = i28;
                        z4 = true;
                    }
                    cVar3.f10570b++;
                    cVar3.f10574f = z4;
                    i11--;
                }
                i28 = i7 + 1;
            }
            c4 = c5;
            z8 = z11;
            z9 = true;
        }
        j4 = 1;
        boolean z12 = !z6 && i16 == 1;
        if (i11 <= 0 || j5 == 0 || (i11 >= i16 - 1 && !z12 && i17 <= 1)) {
            i6 = 0;
        } else {
            float bitCount = Long.bitCount(j5);
            if (z12) {
                i6 = 0;
            } else {
                if ((j5 & j4) != 0) {
                    i6 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f10573e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i6 = 0;
                }
                int i30 = childCount - 1;
                if ((j5 & (1 << i30)) != 0 && !((c) getChildAt(i30).getLayoutParams()).f10573e) {
                    bitCount -= 0.5f;
                }
            }
            int i31 = bitCount > 0.0f ? (int) ((i11 * i22) / bitCount) : i6;
            boolean z13 = z9;
            for (int i32 = i6; i32 < childCount; i32++) {
                if ((j5 & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f10571c = i31;
                        cVar4.f10574f = true;
                        if (i32 == 0 && !cVar4.f10573e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i31) / 2;
                        }
                        z13 = true;
                    } else {
                        if (cVar4.f10569a) {
                            cVar4.f10571c = i31;
                            cVar4.f10574f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i31) / 2;
                            z13 = true;
                        } else {
                            if (i32 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i31 / 2;
                            }
                            if (i32 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i31 / 2;
                            }
                        }
                    }
                }
            }
            z9 = z13;
        }
        if (z9) {
            for (int i33 = i6; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f10574f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f10570b * i22) + cVar5.f10571c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i14 : i21);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f10557a.performItemAction(gVar, 0);
    }

    @Override // androidx.appcompat.widget.J, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void g() {
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.y();
        }
    }

    public Menu getMenu() {
        if (this.f10557a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f10557a = eVar;
            eVar.setCallback(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f10561e = actionMenuPresenter;
            actionMenuPresenter.J(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f10561e;
            j.a aVar = this.f10562f;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.f(aVar);
            this.f10557a.addMenuPresenter(this.f10561e, this.f10558b);
            this.f10561e.H(this);
        }
        return this.f10557a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f10561e.A();
    }

    public int getPopupTheme() {
        return this.f10559c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.J, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.J, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.k
    public void initialize(androidx.appcompat.view.menu.e eVar) {
        this.f10557a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.J, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c k() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f10569a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean l(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            z4 = ((a) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof a)) ? z4 : ((a) childAt2).b() | z4;
    }

    public boolean m() {
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        return actionMenuPresenter != null && actionMenuPresenter.B();
    }

    public boolean n() {
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b(false);
            if (this.f10561e.E()) {
                this.f10561e.B();
                this.f10561e.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // androidx.appcompat.widget.J, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f10564h) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean b4 = k0.b(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f10569a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b4) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
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
        if (b4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f10569a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f10569a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = i22 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.J, android.view.View
    protected void onMeasure(int i4, int i5) {
        androidx.appcompat.view.menu.e eVar;
        boolean z4 = this.f10564h;
        boolean z5 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f10564h = z5;
        if (z4 != z5) {
            this.f10565i = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f10564h && (eVar = this.f10557a) != null && size != this.f10565i) {
            this.f10565i = size;
            eVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f10564h && childCount > 0) {
            r(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            c cVar = (c) getChildAt(i6).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    public boolean p() {
        return this.f10560d;
    }

    public androidx.appcompat.view.menu.e s() {
        return this.f10557a;
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f10561e.G(z4);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f10568l = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f10561e.I(drawable);
    }

    public void setOverflowReserved(boolean z4) {
        this.f10560d = z4;
    }

    public void setPopupTheme(int i4) {
        if (this.f10559c != i4) {
            this.f10559c = i4;
            if (i4 == 0) {
                this.f10558b = getContext();
            } else {
                this.f10558b = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f10561e = actionMenuPresenter;
        actionMenuPresenter.H(this);
    }

    public void t(j.a aVar, e.a aVar2) {
        this.f10562f = aVar;
        this.f10563g = aVar2;
    }

    public boolean u() {
        ActionMenuPresenter actionMenuPresenter = this.f10561e;
        return actionMenuPresenter != null && actionMenuPresenter.K();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f10566j = (int) (56.0f * f4);
        this.f10567k = (int) (f4 * 4.0f);
        this.f10558b = context;
        this.f10559c = 0;
    }
}
