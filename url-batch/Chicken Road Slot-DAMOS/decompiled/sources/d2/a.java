package d2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f3319d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f3320e;

    /* renamed from: i, reason: collision with root package name */
    public r2 f3321i;

    /* renamed from: r, reason: collision with root package name */
    public n0.o f3322r;

    /* renamed from: s, reason: collision with root package name */
    public c1 f3323s;

    /* renamed from: t, reason: collision with root package name */
    public z1 f3324t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3325u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3326v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3327w;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        a2 a2Var = new a2(0, this);
        addOnAttachStateChangeListener(a2Var);
        a2.r rVar = new a2.r(15);
        k7.e.u(this).f9608a.add(rVar);
        this.f3324t = new z1(this, a2Var, rVar);
    }

    private final void setParentContext(n0.o oVar) {
        if (this.f3322r != oVar) {
            this.f3322r = oVar;
            if (oVar != null) {
                this.f3319d = null;
            }
            r2 r2Var = this.f3321i;
            if (r2Var != null) {
                r2Var.b();
                this.f3321i = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f3320e != iBinder) {
            this.f3320e = iBinder;
            this.f3319d = null;
        }
    }

    public abstract void a(int i3, n0.i0 i0Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i3, layoutParams);
    }

    public final void c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f3323s == null) {
                v vVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof v) {
                        vVar = (v) childAt;
                    }
                }
                if (vVar != null) {
                    vVar.setComposeViewContext(l(h0.h(this), vVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                g();
            }
        }
    }

    public final void d() {
        if (this.f3326v) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void e() {
        c1 c1Var;
        View view;
        if (this.f3322r == null && !isAttachedToWindow() && ((c1Var = this.f3323s) == null || (view = c1Var.f3353a) == null || !view.isAttachedToWindow())) {
            kotlin.collections.i0.l("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            g();
        }
    }

    public final void f() {
        View childAt = getChildAt(0);
        v vVar = childAt instanceof v ? (v) childAt : null;
        if (vVar != null && vVar.V0) {
            vVar.getComposeViewContext().b();
            vVar.V0 = false;
        }
        r2 r2Var = this.f3321i;
        if (r2Var != null) {
            r2Var.b();
        }
        this.f3321i = null;
        requestLayout();
    }

    public final void g() {
        if (this.f3321i == null) {
            try {
                this.f3326v = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    c1 c1Var = this.f3323s;
                    if (c1Var == null) {
                        c1Var = j();
                    }
                    this.f3321i = t2.a(this, c1Var, new x0.d(1003123809, true, new b3.e(3, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f3326v = false;
            }
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m32getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        s0 s0Var = tag instanceof s0 ? (s0) tag : null;
        if (s0Var != null) {
            return s0Var.f3530a;
        }
        return 1;
    }

    public final c1 getComposeViewContext$ui() {
        return this.f3323s;
    }

    public final boolean getHasComposition() {
        return this.f3321i != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f3325u;
    }

    public void h(int i3, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i3) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void i(int i3, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i3, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i3)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f3327w || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c1 j() {
        c1 composeViewContext;
        c1 i3;
        androidx.lifecycle.a1 a1Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            v vVar = childAt instanceof v ? (v) childAt : null;
            if (vVar != null) {
                composeViewContext = vVar.getComposeViewContext();
                View h10 = h0.h(this);
                i3 = h0.i(h10);
                if (i3 == null) {
                    return l(h10, i3);
                }
                n0.o k10 = k();
                androidx.lifecycle.u d10 = androidx.lifecycle.o0.d(h10);
                if (d10 == null) {
                    d10 = composeViewContext != null ? composeViewContext.f3355c : null;
                    if (d10 == null) {
                        kotlin.collections.i0.l("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                androidx.lifecycle.u uVar = d10;
                f5.e B = g8.b.B(h10);
                if (B == null) {
                    B = composeViewContext != null ? composeViewContext.f3356d : null;
                    if (B == null) {
                        kotlin.collections.i0.l("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                f5.e eVar = B;
                androidx.lifecycle.a1 e2 = androidx.lifecycle.o0.e(h10);
                if (e2 == null) {
                    a1Var = composeViewContext != null ? composeViewContext.f3357e : null;
                } else {
                    a1Var = e2;
                }
                c1 c1Var = new c1(h0.i(h0.h(h10)), h10, k10, uVar, eVar, a1Var);
                h10.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c1Var));
                return c1Var;
            }
        }
        composeViewContext = null;
        View h102 = h0.h(this);
        i3 = h0.i(h102);
        if (i3 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0.o k() {
        n0.z1 z1Var;
        CoroutineContext coroutineContext;
        n0.l1 l1Var;
        int i3;
        n0.o oVar = this.f3322r;
        if (oVar == null) {
            oVar = p2.a(this);
            if (oVar == null) {
                Object parent = getParent();
                while (oVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    oVar = p2.a(view);
                    parent = z4.w.z(view);
                }
            }
            if (oVar != null) {
                n0.o oVar2 = (!(oVar instanceof n0.z1) || ((n0.v1) ((n0.z1) oVar).f6893u.getValue()).compareTo(n0.v1.f6825e) > 0) ? oVar : null;
                if (oVar2 != null) {
                    this.f3319d = new WeakReference(oVar2);
                }
            } else {
                oVar = null;
            }
            if (oVar == null) {
                WeakReference weakReference = this.f3319d;
                if (weakReference == null || (oVar = (n0.o) weakReference.get()) == null || ((oVar instanceof n0.z1) && ((n0.v1) ((n0.z1) oVar).f6893u.getValue()).compareTo(n0.v1.f6825e) <= 0)) {
                    oVar = null;
                }
                if (oVar == null) {
                    if (!isAttachedToWindow()) {
                        z1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object z10 = z4.w.z(this);
                    View view2 = this;
                    while (z10 instanceof View) {
                        View view3 = (View) z10;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        z10 = view3.getParent();
                    }
                    n0.o a9 = p2.a(view2);
                    if (a9 == null) {
                        ((h2) i2.f3443a.get()).getClass();
                        kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
                        ld.b bVar = kotlin.coroutines.d.f5591n;
                        gVar.getClass();
                        bVar.getClass();
                        hd.q qVar = l0.A;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) l0.A.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) l0.B.get();
                            if (coroutineContext == null) {
                                kotlin.collections.i0.l("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext p4 = coroutineContext.p(gVar);
                        n0.s0 s0Var = (n0.s0) p4.m(n0.e.f6659i);
                        if (s0Var != null) {
                            n0.l1 l1Var2 = new n0.l1(s0Var);
                            b7.o0 o0Var = l1Var2.f6748e;
                            synchronized (o0Var.f1326b) {
                                o0Var.f1325a = false;
                                l1Var = l1Var2;
                            }
                        } else {
                            l1Var = 0;
                        }
                        wd.b0 b0Var = new wd.b0();
                        CoroutineContext coroutineContext2 = (d1.n) p4.m(d1.a.B);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new s1(view2.getContext().getApplicationContext());
                            b0Var.f10141d = coroutineContext2;
                        }
                        if (l1Var != 0) {
                            gVar = l1Var;
                        }
                        CoroutineContext p10 = p4.p(gVar).p(coroutineContext2);
                        n0.z1 z1Var2 = new n0.z1(p10);
                        synchronized (z1Var2.f6877c) {
                            i3 = 1;
                            z1Var2.f6892t = true;
                        }
                        le.d b10 = ge.a0.b(p10);
                        androidx.lifecycle.u d10 = androidx.lifecycle.o0.d(view2);
                        androidx.lifecycle.w g = d10 != null ? d10.g() : null;
                        if (g == null) {
                            z1.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new hd.d();
                        }
                        view2.addOnAttachStateChangeListener(new j2(view2, z1Var2));
                        g.a(new m2(b10, l1Var, z1Var2, b0Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, z1Var2);
                        ge.x0 x0Var = ge.x0.f4413d;
                        Handler handler = view2.getHandler();
                        int i10 = he.e.f4538a;
                        view2.addOnAttachStateChangeListener(new a2(i3, ge.a0.s(x0Var, new he.d(handler, "windowRecomposer cleanup", false).f4537t, new a3.t(z1Var2, view2, r1, 5), 2)));
                        z1Var = z1Var2;
                    } else {
                        if (!(a9 instanceof n0.z1)) {
                            kotlin.collections.i0.l("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        z1Var = (n0.z1) a9;
                    }
                    r1 = ((n0.v1) z1Var.f6893u.getValue()).compareTo(n0.v1.f6825e) > 0 ? z1Var : null;
                    if (r1 != null) {
                        this.f3319d = new WeakReference(r1);
                    }
                    return z1Var;
                }
            }
        }
        return oVar;
    }

    public final c1 l(View view, c1 c1Var) {
        n0.o k10 = k();
        androidx.lifecycle.u d10 = androidx.lifecycle.o0.d(view);
        androidx.lifecycle.a1 e2 = androidx.lifecycle.o0.e(view);
        f5.e B = g8.b.B(view);
        n0.o oVar = c1Var.f3354b;
        f5.e eVar = c1Var.f3356d;
        androidx.lifecycle.u uVar = c1Var.f3355c;
        if (k10 == oVar && d10 == uVar && e2 == c1Var.f3357e && B == eVar) {
            return c1Var;
        }
        if (k10.i() != c1Var.f3354b.i()) {
            f();
        }
        if (d10 == null) {
            d10 = uVar;
        }
        c1 c1Var2 = new c1(c1Var, view, k10, d10, B == null ? eVar : B, e2);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c1Var2));
        return c1Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s.h0 h0Var = p2.f3507a;
        Object z10 = z4.w.z(this);
        View view = this;
        while (z10 instanceof View) {
            View view2 = (View) z10;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            z10 = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new androidx.lifecycle.d0(10, this));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        h(i3, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        g();
        i(i3, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i3);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m33setAutoClearFocusBehavior17tfJxM(int i3) {
        setTag(R.id.auto_clear_focus_behavior_tag, new s0(i3));
    }

    public final void setComposeViewContext$ui(c1 c1Var) {
        if (this.f3323s != c1Var) {
            if (c1Var == null) {
                f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                v vVar = childAt instanceof v ? (v) childAt : null;
                if (vVar != null) {
                    if (vVar.getCoroutineContext() != c1Var.f3354b.i()) {
                        f();
                    }
                    vVar.setComposeViewContext(c1Var);
                }
            }
            this.f3323s = c1Var;
        }
    }

    public final void setParentCompositionContext(n0.o oVar) {
        setParentContext(oVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f3325u = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((v) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f3327w = true;
    }

    public final void setViewCompositionStrategy(b2 b2Var) {
        z1 z1Var = this.f3324t;
        if (z1Var != null) {
            z1Var.invoke();
        }
        ((h0) b2Var).getClass();
        a2 a2Var = new a2(0, this);
        addOnAttachStateChangeListener(a2Var);
        a2.r rVar = new a2.r(15);
        k7.e.u(this).f9608a.add(rVar);
        this.f3324t = new z1(this, a2Var, rVar);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        d();
        super.addView(view, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z10) {
        d();
        return super.addViewInLayout(view, i3, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i10) {
        d();
        super.addView(view, i3, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i3, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
