package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import defpackage.a;
import defpackage.aah;
import defpackage.aqv;
import defpackage.ara;
import defpackage.arc;
import defpackage.ard;
import defpackage.are;
import defpackage.arf;
import defpackage.arg;
import defpackage.arh;
import defpackage.ari;
import defpackage.arj;
import defpackage.arl;
import defpackage.arn;
import defpackage.aro;
import defpackage.arp;
import defpackage.arq;
import defpackage.arr;
import defpackage.ars;
import defpackage.bc;
import defpackage.bd;
import defpackage.brn;
import defpackage.by;
import defpackage.kq;
import defpackage.kr;
import defpackage.kt;
import defpackage.nc;
import defpackage.nv;
import defpackage.qq;
import defpackage.ym;
import defpackage.yn;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public final arc a;
    public int b;
    public boolean c;
    LinearLayoutManager d;
    public RecyclerView e;
    public arf f;
    public final boolean g;
    public final int h;
    public final kt i;
    public ym j;
    private final Rect k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private kq o;
    private arc p;
    private ard q;
    private brn r;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new arc();
        this.c = false;
        this.i = new arg(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, null);
    }

    private final void k(Context context, AttributeSet attributeSet) {
        this.j = new aro(this);
        arq arqVar = new arq(this, context);
        this.e = arqVar;
        arqVar.setId(View.generateViewId());
        this.e.setDescendantFocusability(131072);
        arl arlVar = new arl(this);
        this.d = arlVar;
        this.e.Y(arlVar);
        RecyclerView recyclerView = this.e;
        recyclerView.E = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        int[] iArr = aqv.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        yq.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.d.ab(obtainStyledAttributes.getInt(0, 0));
            ((aro) this.j).t();
            obtainStyledAttributes.recycle();
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.e.r(new arj());
            this.f = new arf(this);
            arf arfVar = this.f;
            RecyclerView recyclerView2 = this.e;
            this.r = new brn(arfVar, (byte[]) null);
            arp arpVar = new arp(this);
            this.o = arpVar;
            RecyclerView recyclerView3 = arpVar.a;
            if (recyclerView3 != recyclerView2) {
                if (recyclerView3 != null) {
                    recyclerView3.at(arpVar.b);
                    arpVar.a.F = null;
                }
                arpVar.a = recyclerView2;
                RecyclerView recyclerView4 = arpVar.a;
                if (recyclerView4 != null) {
                    if (recyclerView4.F != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    recyclerView4.as(arpVar.b);
                    RecyclerView recyclerView5 = arpVar.a;
                    recyclerView5.F = arpVar;
                    new Scroller(recyclerView5.getContext(), new DecelerateInterpolator());
                    arpVar.f();
                }
            }
            this.e.as(this.f);
            this.e.setOverScrollMode(getOverScrollMode());
            arc arcVar = new arc();
            this.p = arcVar;
            this.f.f = arcVar;
            arh arhVar = new arh(this);
            ari ariVar = new ari(this);
            arcVar.m(arhVar);
            this.p.m(ariVar);
            ym ymVar = this.j;
            this.e.setImportantForAccessibility(2);
            aro aroVar = (aro) ymVar;
            aroVar.b = new arn(aroVar);
            ViewPager2 viewPager2 = aroVar.a;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.p.m(this.a);
            ard ardVar = new ard();
            this.q = ardVar;
            this.p.m(ardVar);
            RecyclerView recyclerView6 = this.e;
            attachViewToParent(recyclerView6, 0, recyclerView6.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        return this.d.k == 1 ? 1 : 0;
    }

    public final int b() {
        return this.f.b;
    }

    public final kr c() {
        return this.e.l;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.e.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.e.canScrollVertically(i);
    }

    public final void d() {
        kr c;
        int i;
        int i2;
        bd b;
        int i3 = -1;
        if (this.m == -1 || (c = c()) == null) {
            return;
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            if (c instanceof ara) {
                ara araVar = (ara) c;
                qq qqVar = araVar.g;
                if (qqVar.j()) {
                    qq qqVar2 = araVar.f;
                    if (qqVar2.j()) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(araVar.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (ara.v(str, "f#")) {
                                long z = ara.z(str);
                                by byVar = araVar.e;
                                String string = bundle.getString(str);
                                if (string == null) {
                                    i2 = i3;
                                    b = null;
                                } else {
                                    b = byVar.b(string);
                                    if (b == null) {
                                        i2 = i3;
                                        byVar.O(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                qqVar2.g(z, b);
                            } else {
                                i2 = i3;
                                if (!ara.v(str, "s#")) {
                                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
                                }
                                long z2 = ara.z(str);
                                bc bcVar = (bc) bundle.getParcelable(str);
                                if (ara.y(z2)) {
                                    qqVar.g(z2, bcVar);
                                }
                            }
                            i3 = i2;
                        }
                        i = i3;
                        if (!qqVar2.j()) {
                            araVar.i = true;
                            araVar.h = true;
                            araVar.u();
                            Handler handler = new Handler(Looper.getMainLooper());
                            nc ncVar = new nc(araVar, 19, null);
                            araVar.a.a(new nv(handler, ncVar, 5));
                            handler.postDelayed(ncVar, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            i = -1;
            this.n = null;
        } else {
            i = -1;
        }
        int max = Math.max(0, Math.min(this.m, c.a() - 1));
        this.b = max;
        this.m = i;
        this.e.V(max);
        ((aro) this.j).t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof arr) {
            int i = ((arr) parcelable).a;
            sparseArray.put(this.e.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e() {
        kq kqVar = this.o;
        if (kqVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View c = kqVar.c(this.d);
        if (c == null) {
            return;
        }
        int bl = LinearLayoutManager.bl(c);
        if (bl != this.b && b() == 0) {
            this.p.l(bl);
        }
        this.c = false;
    }

    public final boolean f() {
        return this.d.aw() == 1;
    }

    public final void g() {
        Object obj = this.r.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h(int i) {
        g();
        i(i);
    }

    public final void i(int i) {
        int i2;
        kr c = c();
        if (c == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (c.a() > 0) {
            int min = Math.min(Math.max(i, 0), c.a() - 1);
            if ((min == this.b && this.f.g()) || min == (i2 = this.b)) {
                return;
            }
            this.b = min;
            ((aro) this.j).t();
            double d = i2;
            if (!this.f.g()) {
                arf arfVar = this.f;
                arfVar.f();
                are areVar = arfVar.c;
                d = areVar.a + areVar.b;
            }
            arf arfVar2 = this.f;
            arfVar2.a = 2;
            int i3 = arfVar2.d;
            arfVar2.d = min;
            arfVar2.e(2);
            if (i3 != min) {
                arfVar2.d(min);
            }
            double d2 = min;
            double abs = Math.abs(d2 - d);
            RecyclerView recyclerView = this.e;
            if (abs <= 3.0d) {
                recyclerView.aa(min);
                return;
            }
            recyclerView.V(d2 > d ? min - 3 : min + 3);
            RecyclerView recyclerView2 = this.e;
            recyclerView2.post(new ars(min, recyclerView2));
        }
    }

    public final void j(yn ynVar) {
        this.a.m(ynVar);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int a;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ym ymVar = this.j;
        aah aahVar = new aah(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ((aro) ymVar).a;
        if (viewPager2.c() != null) {
            i2 = 1;
            if (viewPager2.a() == 1) {
                i2 = viewPager2.c().a();
                i = 1;
            } else {
                i = viewPager2.c().a();
            }
        } else {
            i = 0;
            i2 = 0;
        }
        aahVar.q(brn.ab(i2, i, 0));
        kr c = viewPager2.c();
        if (c == null || (a = c.a()) == 0 || !viewPager2.g) {
            return;
        }
        if (viewPager2.b > 0) {
            aahVar.g(8192);
        }
        if (viewPager2.b < a - 1) {
            aahVar.g(4096);
        }
        aahVar.J();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        Rect rect = this.k;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.l;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.e.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.c) {
            e();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.e, i, i2);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredState = this.e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof arr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        arr arrVar = (arr) parcelable;
        super.onRestoreInstanceState(arrVar.getSuperState());
        this.m = arrVar.b;
        this.n = arrVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        arr arrVar = new arr(super.onSaveInstanceState());
        arrVar.a = this.e.getId();
        int i = this.m;
        if (i == -1) {
            i = this.b;
        }
        arrVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            arrVar.c = parcelable;
            return arrVar;
        }
        kr krVar = this.e.l;
        if (krVar instanceof ara) {
            ara araVar = (ara) krVar;
            qq qqVar = araVar.f;
            int b = qqVar.b();
            qq qqVar2 = araVar.g;
            Bundle bundle = new Bundle(b + qqVar2.b());
            for (int i2 = 0; i2 < qqVar.b(); i2++) {
                long c = qqVar.c(i2);
                bd bdVar = (bd) qqVar.d(c);
                if (bdVar != null && bdVar.ao()) {
                    String t = ara.t("f#", c);
                    by byVar = araVar.e;
                    if (bdVar.C != byVar) {
                        byVar.O(new IllegalStateException(a.ab(bdVar, "Fragment ", " is not currently in the FragmentManager")));
                    }
                    bundle.putString(t, bdVar.m);
                }
            }
            for (int i3 = 0; i3 < qqVar2.b(); i3++) {
                long c2 = qqVar2.c(i3);
                if (ara.y(c2)) {
                    bundle.putParcelable(ara.t("s#", c2), (Parcelable) qqVar2.d(c2));
                }
            }
            arrVar.c = bundle;
        }
        return arrVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.j.k(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        ym ymVar = this.j;
        if (!ymVar.k(i)) {
            throw new IllegalStateException();
        }
        aro aroVar = (aro) ymVar;
        aroVar.s(aroVar.a.b + (i == 8192 ? -1 : 1));
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((aro) this.j).t();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new arc();
        this.c = false;
        this.i = new arg(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new arc();
        this.c = false;
        this.i = new arg(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new arc();
        this.c = false;
        this.i = new arg(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }
}
