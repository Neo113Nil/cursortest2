package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.authenticator2.R;
import defpackage.bo;
import defpackage.bvw;
import defpackage.byo;
import defpackage.cq;
import defpackage.em;
import defpackage.fm;
import defpackage.gb;
import defpackage.gd;
import defpackage.gf;
import defpackage.go;
import defpackage.hk;
import defpackage.ho;
import defpackage.hz;
import defpackage.kee;
import defpackage.kt;
import defpackage.lt;
import defpackage.me;
import defpackage.mf;
import defpackage.mg;
import defpackage.mh;
import defpackage.mk;
import defpackage.xk;
import defpackage.yq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements xk {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private mk O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final kee S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public lt n;
    public CharSequence o;
    public CharSequence p;
    public final ArrayList q;
    public ArrayList r;
    public hk s;
    public mf t;
    public go u;
    public gb v;
    public boolean w;
    public final bvw x;
    public kee y;
    private ImageButton z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.q = new ArrayList();
        this.N = new int[2];
        this.x = new bvw(new bo(this, 19));
        this.r = new ArrayList();
        this.S = new kee(this);
        this.R = new bo(this, 20, null);
        Context context2 = getContext();
        int[] iArr = em.y;
        byo u = byo.u(context2, attributeSet, iArr, i, 0);
        yq.k(this, context, iArr, attributeSet, (TypedArray) u.a, i, 0);
        this.k = u.h(28, 0);
        this.l = u.h(19, 0);
        this.H = u.f(0, this.H);
        this.m = u.f(2, 48);
        int c = u.c(22, 0);
        c = u.p(27) ? u.c(27, c) : c;
        this.E = c;
        this.D = c;
        this.C = c;
        this.B = c;
        int c2 = u.c(25, -1);
        if (c2 >= 0) {
            this.B = c2;
        }
        int c3 = u.c(24, -1);
        if (c3 >= 0) {
            this.C = c3;
        }
        int c4 = u.c(26, -1);
        if (c4 >= 0) {
            this.D = c4;
        }
        int c5 = u.c(23, -1);
        if (c5 >= 0) {
            this.E = c5;
        }
        this.A = u.d(13, -1);
        int c6 = u.c(9, Integer.MIN_VALUE);
        int c7 = u.c(5, Integer.MIN_VALUE);
        int d = u.d(7, 0);
        int d2 = u.d(8, 0);
        k();
        lt ltVar = this.n;
        ltVar.h = false;
        if (d != Integer.MIN_VALUE) {
            ltVar.e = d;
            ltVar.a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            ltVar.f = d2;
            ltVar.b = d2;
        }
        if (c6 != Integer.MIN_VALUE || c7 != Integer.MIN_VALUE) {
            ltVar.a(c6, c7);
        }
        this.F = u.c(10, Integer.MIN_VALUE);
        this.G = u.c(6, Integer.MIN_VALUE);
        this.e = u.j(4);
        this.f = u.l(3);
        CharSequence l = u.l(21);
        if (!TextUtils.isEmpty(l)) {
            u(l);
        }
        CharSequence l2 = u.l(18);
        if (!TextUtils.isEmpty(l2)) {
            t(l2);
        }
        this.i = getContext();
        s(u.h(17, 0));
        Drawable j = u.j(16);
        if (j != null) {
            q(j);
        }
        CharSequence l3 = u.l(15);
        if (!TextUtils.isEmpty(l3)) {
            p(l3);
        }
        Drawable j2 = u.j(11);
        if (j2 != null) {
            n(j2);
        }
        CharSequence l4 = u.l(12);
        if (!TextUtils.isEmpty(l4)) {
            if (!TextUtils.isEmpty(l4)) {
                I();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(l4);
            }
        }
        if (u.p(29)) {
            ColorStateList i2 = u.i(29);
            this.I = i2;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(i2);
            }
        }
        if (u.p(20)) {
            ColorStateList i3 = u.i(20);
            this.J = i3;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(i3);
            }
        }
        if (u.p(14)) {
            m(u.h(14, 0));
        }
        u.n();
    }

    protected static final mg A(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mg ? new mg((mg) layoutParams) : layoutParams instanceof cq ? new mg((cq) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new mg((ViewGroup.MarginLayoutParams) layoutParams) : new mg(layoutParams);
    }

    private final int B(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int C(View view, int i) {
        mg mgVar = (mg) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = mgVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - mgVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < mgVar.topMargin) {
            i4 = mgVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < mgVar.bottomMargin) {
                i4 = Math.max(0, i4 - (mgVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    private final int D(View view, int i, int[] iArr, int i2) {
        mg mgVar = (mg) view.getLayoutParams();
        int i3 = mgVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int C = C(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, C, max + measuredWidth, view.getMeasuredHeight() + C);
        return max + measuredWidth + mgVar.rightMargin;
    }

    private final int E(View view, int i, int[] iArr, int i2) {
        mg mgVar = (mg) view.getLayoutParams();
        int i3 = mgVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int C = C(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, C, max, view.getMeasuredHeight() + C);
        return max - (measuredWidth + mgVar.leftMargin);
    }

    private final int F(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void G(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                mg mgVar = (mg) childAt.getLayoutParams();
                if (mgVar.b == 0 && L(childAt) && B(mgVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            mg mgVar2 = (mg) childAt2.getLayoutParams();
            if (mgVar2.b == 0 && L(childAt2) && B(mgVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void H(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        mg mgVar = layoutParams == null ? new mg() : !checkLayoutParams(layoutParams) ? A(layoutParams) : (mg) layoutParams;
        mgVar.b = 1;
        if (!z || this.h == null) {
            addView(view, mgVar);
        } else {
            view.setLayoutParams(mgVar);
            this.q.add(view);
        }
    }

    private final void I() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void J() {
        if (this.z == null) {
            this.z = new hz(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            mg mgVar = new mg();
            mgVar.a = (this.m & 112) | 8388611;
            this.z.setLayoutParams(mgVar);
        }
    }

    private final boolean K(View view) {
        return view.getParent() == this || this.q.contains(view);
    }

    private final boolean L(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int M(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int N(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void O(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int a() {
        lt ltVar = this.n;
        if (ltVar != null) {
            return ltVar.g ? ltVar.a : ltVar.b;
        }
        return 0;
    }

    public final int b() {
        lt ltVar = this.n;
        if (ltVar != null) {
            return ltVar.g ? ltVar.b : ltVar.a;
        }
        return 0;
    }

    public final int c() {
        gd gdVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (gdVar = actionMenuView.a) == null || !gdVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof mg);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu g = actionMenuView.g();
            if (this.t == null) {
                this.t = new mf(this);
            }
            this.a.c.q();
            ((gd) g).h(this.t, this.i);
            v();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new fm(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mg();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mg(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu f = f();
        for (int i = 0; i < f.size(); i++) {
            arrayList.add(f.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        mf mfVar = this.t;
        gf gfVar = mfVar == null ? null : mfVar.b;
        if (gfVar != null) {
            gfVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.n == null) {
            this.n = new lt();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.u, new ho(this, 2));
            mg mgVar = new mg();
            mgVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(mgVar);
            H(this.a, false);
        }
    }

    public void m(int i) {
        g().inflate(i, f());
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            I();
            if (!K(this.d)) {
                H(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && K(imageView)) {
                removeView(this.d);
                this.q.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(int i) {
        p(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.L = true;
                }
                if (i != 10 || i == 3) {
                    this.L = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.L = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b4 A[LOOP:0: B:50:0x02b2->B:51:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cc A[LOOP:1: B:54:0x02ca->B:55:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ed A[LOOP:2: B:58:0x02eb->B:59:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033b A[LOOP:3: B:67:0x0339->B:68:0x033b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        boolean L;
        boolean L2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int paddingTop;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int max;
        int i14;
        boolean z5;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int size2;
        int i19;
        int size3;
        int i20;
        int i21;
        int size4;
        int i22;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i23 = width - paddingRight;
        int[] iArr = this.N;
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        iArr[1] = 0;
        iArr[0] = 0;
        int i24 = yq.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        boolean z6 = layoutDirection == 1;
        if (L(this.z)) {
            View view = this.z;
            if (z6) {
                i6 = E(view, i23, iArr, min);
                i5 = paddingLeft;
                if (L(this.g)) {
                    View view2 = this.g;
                    if (z6) {
                        i6 = E(view2, i6, iArr, min);
                    } else {
                        i5 = D(view2, i5, iArr, min);
                    }
                }
                if (L(this.a)) {
                    View view3 = this.a;
                    if (z6) {
                        i5 = D(view3, i5, iArr, min);
                    } else {
                        i6 = E(view3, i6, iArr, min);
                    }
                }
                int c = getLayoutDirection() != 1 ? c() : d();
                int d = getLayoutDirection() != 1 ? d() : c();
                z2 = z6;
                iArr[0] = Math.max(0, c - i5);
                iArr[1] = Math.max(0, d - (i23 - i6));
                int max2 = Math.max(i5, c);
                int min2 = Math.min(i6, i23 - d);
                if (L(this.h)) {
                    View view4 = this.h;
                    if (z2) {
                        min2 = E(view4, min2, iArr, min);
                    } else {
                        max2 = D(view4, max2, iArr, min);
                    }
                }
                if (L(this.d)) {
                    View view5 = this.d;
                    if (z2) {
                        min2 = E(view5, min2, iArr, min);
                    } else {
                        max2 = D(view5, max2, iArr, min);
                    }
                }
                L = L(this.b);
                L2 = L(this.c);
                if (L) {
                    i7 = 0;
                } else {
                    mg mgVar = (mg) this.b.getLayoutParams();
                    i7 = mgVar.bottomMargin + mgVar.topMargin + this.b.getMeasuredHeight();
                }
                if (L2) {
                    i8 = max2;
                } else {
                    mg mgVar2 = (mg) this.c.getLayoutParams();
                    i8 = max2;
                    i7 += mgVar2.topMargin + this.c.getMeasuredHeight() + mgVar2.bottomMargin;
                }
                if (!L || L2) {
                    TextView textView = !L ? this.b : this.c;
                    TextView textView2 = !L2 ? this.c : this.b;
                    mg mgVar3 = (mg) textView.getLayoutParams();
                    mg mgVar4 = (mg) textView2.getLayoutParams();
                    if ((L || this.b.getMeasuredWidth() <= 0) && (!L2 || this.c.getMeasuredWidth() <= 0)) {
                        i9 = width;
                        z3 = false;
                    } else {
                        z3 = true;
                        i9 = width;
                    }
                    i10 = this.H & 112;
                    if (i10 != 48) {
                        paddingTop = getPaddingTop() + mgVar3.topMargin + this.D;
                    } else if (i10 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                        if (i25 < mgVar3.topMargin + this.D) {
                            i25 = mgVar3.topMargin + this.D;
                        } else {
                            int i26 = (((height - paddingBottom) - i7) - i25) - paddingTop2;
                            if (i26 < mgVar3.bottomMargin + this.E) {
                                i25 = Math.max(0, i25 - ((mgVar4.bottomMargin + this.E) - i26));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        paddingTop = (((height - paddingBottom) - mgVar4.bottomMargin) - this.E) - i7;
                    }
                    if (z2) {
                        if (z3) {
                            i11 = this.B;
                            z4 = true;
                        } else {
                            i11 = 0;
                            z4 = false;
                        }
                        int i27 = i11 - iArr[0];
                        int max3 = i8 + Math.max(0, i27);
                        iArr[0] = Math.max(0, -i27);
                        if (L) {
                            mg mgVar5 = (mg) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max3;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max3, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.C;
                            paddingTop = measuredHeight + mgVar5.bottomMargin;
                        } else {
                            i12 = max3;
                        }
                        if (L2) {
                            mg mgVar6 = (mg) this.c.getLayoutParams();
                            int i28 = paddingTop + mgVar6.topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max3;
                            this.c.layout(max3, i28, measuredWidth2, this.c.getMeasuredHeight() + i28);
                            i13 = measuredWidth2 + this.C;
                            int i29 = mgVar6.bottomMargin;
                        } else {
                            i13 = max3;
                        }
                        max = z4 ? Math.max(i12, i13) : max3;
                    } else {
                        if (z3) {
                            i14 = this.B;
                            z5 = true;
                        } else {
                            i14 = 0;
                            z5 = false;
                        }
                        int i30 = i14 - iArr[1];
                        min2 -= Math.max(0, i30);
                        iArr[1] = Math.max(0, -i30);
                        if (L) {
                            mg mgVar7 = (mg) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i15 = measuredWidth3 - this.C;
                            paddingTop = measuredHeight2 + mgVar7.bottomMargin;
                        } else {
                            i15 = min2;
                        }
                        if (L2) {
                            mg mgVar8 = (mg) this.c.getLayoutParams();
                            int i31 = paddingTop + mgVar8.topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i31, min2, this.c.getMeasuredHeight() + i31);
                            i16 = min2 - this.C;
                            int i32 = mgVar8.bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (z5) {
                            min2 = Math.min(i15, i16);
                        }
                        max = i8;
                    }
                } else {
                    max = i8;
                    i9 = width;
                }
                ArrayList arrayList = this.M;
                G(arrayList, 3);
                size = arrayList.size();
                i17 = max;
                for (i18 = 0; i18 < size; i18++) {
                    i17 = D((View) arrayList.get(i18), i17, iArr, min);
                }
                G(arrayList, 5);
                size2 = arrayList.size();
                for (i19 = 0; i19 < size2; i19++) {
                    min2 = E((View) arrayList.get(i19), min2, iArr, min);
                }
                G(arrayList, 1);
                int i33 = iArr[0];
                int i34 = iArr[1];
                size3 = arrayList.size();
                int i35 = i34;
                int i36 = i33;
                i20 = 0;
                int i37 = 0;
                while (i20 < size3) {
                    View view6 = (View) arrayList.get(i20);
                    mg mgVar9 = (mg) view6.getLayoutParams();
                    int i38 = mgVar9.leftMargin - i36;
                    int i39 = mgVar9.rightMargin - i35;
                    int max4 = Math.max(0, i38);
                    int max5 = Math.max(0, i39);
                    int max6 = Math.max(0, -i38);
                    int max7 = Math.max(0, -i39);
                    i37 += max4 + view6.getMeasuredWidth() + max5;
                    i20++;
                    i35 = max7;
                    i36 = max6;
                }
                i21 = (paddingLeft + (((i9 - paddingLeft) - paddingRight) / 2)) - (i37 / 2);
                int i40 = i37 + i21;
                if (i21 >= i17) {
                    i17 = i40 > min2 ? i21 - (i40 - min2) : i21;
                }
                size4 = arrayList.size();
                for (i22 = 0; i22 < size4; i22++) {
                    i17 = D((View) arrayList.get(i22), i17, iArr, min);
                }
                arrayList.clear();
            }
            i5 = D(view, paddingLeft, iArr, min);
        } else {
            i5 = paddingLeft;
        }
        i6 = i23;
        if (L(this.g)) {
        }
        if (L(this.a)) {
        }
        if (getLayoutDirection() != 1) {
        }
        if (getLayoutDirection() != 1) {
        }
        z2 = z6;
        iArr[0] = Math.max(0, c - i5);
        iArr[1] = Math.max(0, d - (i23 - i6));
        int max22 = Math.max(i5, c);
        int min22 = Math.min(i6, i23 - d);
        if (L(this.h)) {
        }
        if (L(this.d)) {
        }
        L = L(this.b);
        L2 = L(this.c);
        if (L) {
        }
        if (L2) {
        }
        if (L) {
        }
        if (!L) {
        }
        if (!L2) {
        }
        mg mgVar32 = (mg) textView.getLayoutParams();
        mg mgVar42 = (mg) textView2.getLayoutParams();
        if (L) {
        }
        i9 = width;
        z3 = false;
        i10 = this.H & 112;
        if (i10 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.M;
        G(arrayList2, 3);
        size = arrayList2.size();
        i17 = max;
        while (i18 < size) {
        }
        G(arrayList2, 5);
        size2 = arrayList2.size();
        while (i19 < size2) {
        }
        G(arrayList2, 1);
        int i332 = iArr[0];
        int i342 = iArr[1];
        size3 = arrayList2.size();
        int i352 = i342;
        int i362 = i332;
        i20 = 0;
        int i372 = 0;
        while (i20 < size3) {
        }
        i21 = (paddingLeft + (((i9 - paddingLeft) - paddingRight) / 2)) - (i372 / 2);
        int i402 = i372 + i21;
        if (i21 >= i17) {
        }
        size4 = arrayList2.size();
        while (i22 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean v = kt.v(this);
        int i10 = !v ? 1 : 0;
        int i11 = 0;
        if (L(this.z)) {
            O(this.z, i, 0, i2, this.A);
            i3 = this.z.getMeasuredWidth() + M(this.z);
            i4 = Math.max(0, this.z.getMeasuredHeight() + N(this.z));
            i5 = View.combineMeasuredStates(0, this.z.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (L(this.g)) {
            O(this.g, i, 0, i2, this.A);
            i3 = this.g.getMeasuredWidth() + M(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + N(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int[] iArr = this.N;
        int d = d();
        int max = Math.max(d, i3);
        iArr[v ? 1 : 0] = Math.max(0, d - i3);
        if (L(this.a)) {
            O(this.a, i, max, i2, this.A);
            i6 = this.a.getMeasuredWidth() + M(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + N(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i10] = Math.max(0, c - i6);
        if (L(this.h)) {
            max2 += F(this.h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + N(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (L(this.d)) {
            max2 += F(this.d, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + N(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((mg) childAt.getLayoutParams()).b == 0 && L(childAt)) {
                max2 += F(childAt, i, max2, i2, 0, iArr);
                int max3 = Math.max(i4, childAt.getMeasuredHeight() + N(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max3;
            } else {
                max2 = max2;
            }
        }
        int i13 = max2;
        int i14 = this.D + this.E;
        int i15 = this.B + this.C;
        if (L(this.b)) {
            F(this.b, i, i13 + i15, i2, i14, iArr);
            i7 = i14;
            i11 = this.b.getMeasuredWidth() + M(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + N(this.b);
            i8 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i9 = measuredHeight;
        } else {
            i7 = i14;
            i8 = i5;
            i9 = 0;
        }
        if (L(this.c)) {
            i11 = Math.max(i11, F(this.c, i, i13 + i15, i2, i9 + i7, iArr));
            i9 += this.c.getMeasuredHeight() + N(this.c);
            i8 = View.combineMeasuredStates(i8, this.c.getMeasuredState());
        }
        if (L(this.b) || L(this.c)) {
            i9 += i7;
        }
        int max4 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i13 + i11 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i8), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof mh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mh mhVar = (mh) parcelable;
        super.onRestoreInstanceState(mhVar.d);
        ActionMenuView actionMenuView = this.a;
        gd gdVar = actionMenuView != null ? actionMenuView.a : null;
        int i = mhVar.a;
        if (i != 0 && this.t != null && gdVar != null && (findItem = gdVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (mhVar.b) {
            Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        lt ltVar = this.n;
        boolean z = ltVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        ltVar.g = z2;
        if (!ltVar.h) {
            ltVar.a = ltVar.e;
            ltVar.b = ltVar.f;
            return;
        }
        if (z2) {
            int i2 = ltVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = ltVar.e;
            }
            ltVar.a = i2;
            int i3 = ltVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = ltVar.f;
            }
            ltVar.b = i3;
            return;
        }
        int i4 = ltVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = ltVar.e;
        }
        ltVar.a = i4;
        int i5 = ltVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = ltVar.f;
        }
        ltVar.b = i5;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        gf gfVar;
        mh mhVar = new mh(super.onSaveInstanceState());
        mf mfVar = this.t;
        if (mfVar != null && (gfVar = mfVar.b) != null) {
            mhVar.a = gfVar.a;
        }
        mhVar.b = x();
        return mhVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            J();
        }
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.z.setTooltipText(charSequence);
        }
    }

    public void q(Drawable drawable) {
        if (drawable != null) {
            J();
            if (!K(this.z)) {
                H(this.z, true);
            }
        } else {
            ImageButton imageButton = this.z;
            if (imageButton != null && K(imageButton)) {
                removeView(this.z);
                this.q.remove(this.z);
            }
        }
        ImageButton imageButton2 = this.z;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void r(View.OnClickListener onClickListener) {
        J();
        this.z.setOnClickListener(onClickListener);
    }

    public final void s(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void t(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.c;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!K(this.c)) {
                H(this.c, true);
            }
        } else if (textView != null && K(textView)) {
            removeView(this.c);
            this.q.remove(this.c);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.p = charSequence;
    }

    public void u(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!K(this.b)) {
                H(this.b, true);
            }
        } else if (textView != null && K(textView)) {
            removeView(this.b);
            this.q.remove(this.b);
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void v() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            findOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!w() || findOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.w) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    this.P = new me(new bo(this, 18), 0);
                }
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                this.Q = findOnBackInvokedDispatcher;
            }
        }
    }

    public final boolean w() {
        mf mfVar = this.t;
        return (mfVar == null || mfVar.b == null) ? false : true;
    }

    public final boolean x() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean y() {
        hk hkVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hkVar = actionMenuView.c) == null || !hkVar.o()) ? false : true;
    }

    public final mk z() {
        mk mkVar = this.O;
        if (mkVar != null) {
            return mkVar;
        }
        mk mkVar2 = new mk(this, true);
        this.O = mkVar2;
        return mkVar2;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
