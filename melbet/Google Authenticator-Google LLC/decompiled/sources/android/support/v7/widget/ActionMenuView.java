package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.gb;
import defpackage.gc;
import defpackage.gd;
import defpackage.gf;
import defpackage.go;
import defpackage.gr;
import defpackage.hk;
import defpackage.hl;
import defpackage.hm;
import defpackage.hn;
import defpackage.ho;
import defpackage.ka;
import defpackage.kb;
import defpackage.kee;
import defpackage.kt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionMenuView extends kb implements gc, gr {
    public gd a;
    public boolean b;
    public hk c;
    public gb d;
    public kee e;
    private Context i;
    private int j;
    private go k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    public static final hn n() {
        hn hnVar = new hn();
        hnVar.gravity = 16;
        return hnVar;
    }

    public static final hn o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return n();
        }
        hn hnVar = layoutParams instanceof hn ? new hn((hn) layoutParams) : new hn(layoutParams);
        if (hnVar.gravity <= 0) {
            hnVar.gravity = 16;
        }
        return hnVar;
    }

    @Override // defpackage.gr
    public final void a(gd gdVar) {
        this.a = gdVar;
    }

    @Override // defpackage.gc
    public final boolean b(gf gfVar) {
        return this.a.z(gfVar, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kb
    /* renamed from: bI */
    public final /* bridge */ /* synthetic */ ka generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    @Override // defpackage.kb, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hn generateLayoutParams(AttributeSet attributeSet) {
        return new hn(getContext(), attributeSet);
    }

    @Override // defpackage.kb, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kb
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ ka generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            gd gdVar = new gd(context);
            this.a = gdVar;
            gdVar.p(new ho(this, 0));
            hk hkVar = new hk(context);
            this.c = hkVar;
            hkVar.r();
            hk hkVar2 = this.c;
            go goVar = this.k;
            if (goVar == null) {
                goVar = new hm();
            }
            hkVar2.e = goVar;
            this.a.h(this.c, this.i);
            this.c.k(this);
        }
        return this.a;
    }

    @Override // defpackage.kb, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h() {
        hk hkVar = this.c;
        if (hkVar != null) {
            hkVar.p();
        }
    }

    public final void i(go goVar, gb gbVar) {
        this.k = goVar;
        this.d = gbVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(hk hkVar) {
        this.c = hkVar;
        hkVar.k(this);
    }

    protected final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof hl)) {
            z = ((hl) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof hl)) ? z : ((hl) childAt2).d() | z;
    }

    public final boolean m() {
        hk hkVar = this.c;
        return hkVar != null && hkVar.m();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hk hkVar = this.c;
        if (hkVar != null) {
            hkVar.j();
            if (this.c.m()) {
                this.c.l();
                this.c.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // defpackage.kb, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = i4 - i2;
        int i8 = this.h;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean v = kt.v(this);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i5 = i7 / 2;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                hn hnVar = (hn) childAt.getLayoutParams();
                if (hnVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (v) {
                        i6 = getPaddingLeft() + hnVar.leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - hnVar.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i5 - (measuredHeight / 2);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + hnVar.leftMargin) + hnVar.rightMargin;
                    l(i10);
                    i12++;
                }
            }
            i10++;
        }
        if (childCount == 1) {
            if (i11 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i14 = i5 - (measuredHeight2 / 2);
                int i15 = (i9 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i15, i14, measuredWidth2 + i15, measuredHeight2 + i14);
                return;
            }
            childCount = 1;
        }
        int i16 = i12 - (i11 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (v) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                hn hnVar2 = (hn) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !hnVar2.a) {
                    int i18 = width2 - hnVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + hnVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            hn hnVar3 = (hn) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !hnVar3.a) {
                int i21 = paddingLeft + hnVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + hnVar3.rightMargin + max;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.kb, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        ?? r3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        boolean z5;
        int i10;
        gd gdVar;
        boolean z6 = this.l;
        boolean z7 = View.MeasureSpec.getMode(i) == 1073741824;
        this.l = z7;
        if (z6 != z7) {
            this.m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.l && (gdVar = this.a) != null && size != this.m) {
            this.m = size;
            gdVar.l(true);
        }
        int childCount = getChildCount();
        if (!this.l || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                hn hnVar = (hn) getChildAt(i11).getLayoutParams();
                hnVar.rightMargin = 0;
                hnVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i12 = size2 - paddingLeft;
        int i13 = this.n;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z8 = false;
        int i20 = 0;
        int i21 = 0;
        long j2 = 0;
        while (i19 < childCount2) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                i7 = size3;
                i8 = i16;
                i9 = paddingTop;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z9) {
                    int i22 = this.o;
                    z3 = z9;
                    r3 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                    z4 = true;
                } else {
                    z3 = z9;
                    r3 = 0;
                    z4 = false;
                }
                boolean z10 = z4;
                hn hnVar2 = (hn) childAt.getLayoutParams();
                hnVar2.f = r3;
                hnVar2.c = r3;
                hnVar2.b = r3;
                hnVar2.d = r3;
                hnVar2.leftMargin = r3;
                hnVar2.rightMargin = r3;
                hnVar2.e = z10 && ((ActionMenuItemView) childAt).b();
                i7 = size3;
                int i23 = true != hnVar2.a ? i14 : 1;
                hn hnVar3 = (hn) childAt.getLayoutParams();
                i8 = i16;
                i9 = paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z3 ? (ActionMenuItemView) childAt : null;
                boolean z11 = actionMenuItemView != null && actionMenuItemView.b();
                if (i23 > 0) {
                    z5 = z11;
                    if (!z11 || i23 >= 2) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i8, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i10 = measuredWidth / i8;
                        if (measuredWidth % i8 != 0) {
                            i10++;
                        }
                        if (z5 && i10 < 2) {
                            i10 = 2;
                        }
                        hnVar3.d = hnVar3.a && z5;
                        hnVar3.b = i10;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), makeMeasureSpec);
                        i20 = Math.max(i20, i10);
                        if (hnVar2.d) {
                            i18++;
                        }
                        z8 |= hnVar2.a;
                        i14 -= i10;
                        i21 = Math.max(i21, childAt.getMeasuredHeight());
                        if (i10 != 1) {
                            j2 |= 1 << i19;
                        }
                    }
                } else {
                    z5 = z11;
                }
                i10 = 0;
                hnVar3.d = hnVar3.a && z5;
                hnVar3.b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), makeMeasureSpec);
                i20 = Math.max(i20, i10);
                if (hnVar2.d) {
                }
                z8 |= hnVar2.a;
                i14 -= i10;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i10 != 1) {
                }
            }
            i19++;
            size3 = i7;
            paddingTop = i9;
            i16 = i8;
        }
        int i24 = size3;
        int i25 = i16;
        int i26 = i20;
        int i27 = i21;
        if (z8 && i17 == 2) {
            z = true;
            i17 = 2;
        } else {
            z = false;
        }
        boolean z12 = false;
        while (i18 > 0 && i14 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j3 = 0;
            int i29 = 0;
            int i30 = 0;
            j = 1;
            while (i30 < childCount2) {
                int i31 = i27;
                hn hnVar4 = (hn) getChildAt(i30).getLayoutParams();
                boolean z13 = z;
                if (hnVar4.d) {
                    int i32 = hnVar4.b;
                    if (i32 < i28) {
                        j3 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j3 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z = z13;
                i27 = i31;
            }
            i3 = i27;
            boolean z14 = z;
            j2 |= j3;
            if (i29 > i14) {
                i4 = 1;
                break;
            }
            int i33 = i28 + 1;
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt2 = getChildAt(i34);
                hn hnVar5 = (hn) childAt2.getLayoutParams();
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (!z14 || !hnVar5.e) {
                        z2 = true;
                    } else if (i14 == 1) {
                        int i35 = this.o;
                        z2 = true;
                        childAt2.setPadding(i35 + i25, 0, i35, 0);
                        i14 = 1;
                    } else {
                        z2 = true;
                    }
                    hnVar5.b++;
                    hnVar5.f = z2;
                    i14--;
                } else if (hnVar5.b == i33) {
                    j2 |= j4;
                }
            }
            z12 = true;
            z = z14;
            i27 = i3;
        }
        i3 = i27;
        i4 = 1;
        j = 1;
        if (z8 || i17 != i4) {
            i5 = i17;
            i6 = 0;
        } else {
            i6 = i4;
            i5 = i6;
        }
        if (i14 > 0 && j2 != 0 && (i14 < i5 - 1 || i6 != 0 || i26 > i4)) {
            float bitCount = Long.bitCount(j2);
            if (i6 == 0) {
                int i36 = childCount2 - 1;
                if ((j2 & j) != 0 && !((hn) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                if ((j2 & (1 << i36)) != 0 && !((hn) getChildAt(i36).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i14 * i25) / bitCount) : 0;
            int i38 = 0;
            while (i38 < childCount2) {
                if ((j2 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    hn hnVar6 = (hn) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        hnVar6.c = i37;
                        hnVar6.f = true;
                        if (i38 == 0) {
                            if (!hnVar6.e) {
                                hnVar6.leftMargin = (-i37) / 2;
                            }
                            i38 = 0;
                        }
                    } else if (hnVar6.a) {
                        hnVar6.c = i37;
                        hnVar6.f = true;
                        hnVar6.rightMargin = (-i37) / 2;
                    } else {
                        int i39 = childCount2 - 1;
                        if (i38 != 0) {
                            hnVar6.leftMargin = i37 / 2;
                        }
                        if (i38 != i39) {
                            hnVar6.rightMargin = i37 / 2;
                        }
                    }
                    z12 = true;
                }
                i38++;
            }
        }
        if (z12) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                hn hnVar7 = (hn) childAt4.getLayoutParams();
                if (hnVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((hnVar7.b * i25) + hnVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode == 1073741824 ? i24 : i3);
    }

    @Override // defpackage.kb, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
