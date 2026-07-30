package s1;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.installreferrer.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f8119f;

    /* renamed from: g, reason: collision with root package name */
    public IBinder f8120g;

    /* renamed from: h, reason: collision with root package name */
    public c3 f8121h;

    /* renamed from: i, reason: collision with root package name */
    public g0.r f8122i;

    /* renamed from: j, reason: collision with root package name */
    public m.h f8123j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8124k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8125l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8126m;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        u uVar = new u(1, this);
        addOnAttachStateChangeListener(uVar);
        a0.s sVar = new a0.s(22);
        j1.c.a0(this).f3292a.add(sVar);
        this.f8123j = new m.h(this, uVar, sVar, 5);
    }

    private final void setParentContext(g0.r rVar) {
        if (this.f8122i != rVar) {
            this.f8122i = rVar;
            if (rVar != null) {
                this.f8119f = null;
            }
            c3 c3Var = this.f8121h;
            if (c3Var != null) {
                c3Var.a();
                this.f8121h = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f8120g != iBinder) {
            this.f8120g = iBinder;
            this.f8119f = null;
        }
    }

    public abstract void a(int i7, g0.p pVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    public final void b() {
        if (this.f8125l) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f8121h == null) {
            try {
                this.f8125l = true;
                this.f8121h = e3.a(this, f(), new o0.a(-656146368, new a2.a(16, this), true));
            } finally {
                this.f8125l = false;
            }
        }
    }

    public void d(boolean z8, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i9 - i7) - getPaddingRight(), (i10 - i8) - getPaddingBottom());
        }
    }

    public void e(int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i8);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i8)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g0.r f() {
        g0.t1 t1Var;
        h6.i iVar;
        g0.i1 i1Var;
        g0.r rVar = this.f8122i;
        if (rVar == null) {
            rVar = z2.b(this);
            if (rVar == null) {
                for (ViewParent parent = getParent(); rVar == null && (parent instanceof View); parent = parent.getParent()) {
                    rVar = z2.b((View) parent);
                }
            }
            if (rVar != null) {
                g0.r rVar2 = (!(rVar instanceof g0.t1) || ((g0.q1) ((g0.t1) rVar).f3924r.getValue()).compareTo(g0.q1.f3861g) > 0) ? rVar : null;
                if (rVar2 != null) {
                    this.f8119f = new WeakReference(rVar2);
                }
            } else {
                rVar = null;
            }
            if (rVar == null) {
                WeakReference weakReference = this.f8119f;
                if (weakReference == null || (rVar = (g0.r) weakReference.get()) == null || ((rVar instanceof g0.t1) && ((g0.q1) ((g0.t1) rVar).f3924r.getValue()).compareTo(g0.q1.f3861g) <= 0)) {
                    rVar = null;
                }
                if (rVar == null) {
                    if (!isAttachedToWindow()) {
                        a.a.M("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    g0.r b9 = z2.b(view);
                    if (b9 == null) {
                        ((t2) u2.f8448a.get()).getClass();
                        h6.j jVar = h6.j.f4661f;
                        d6.o oVar = t0.f8420r;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (h6.i) t0.f8420r.getValue();
                        } else {
                            iVar = (h6.i) t0.f8421s.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        h6.i z8 = iVar.z(jVar);
                        g0.u0 u0Var = (g0.u0) z8.u(g0.t0.f3899g);
                        if (u0Var != null) {
                            g0.i1 i1Var2 = new g0.i1(u0Var);
                            androidx.room.m mVar = (androidx.room.m) i1Var2.f3753h;
                            synchronized (mVar.f1094b) {
                                mVar.f1093a = false;
                                i1Var = i1Var2;
                            }
                        } else {
                            i1Var = 0;
                        }
                        r6.v vVar = new r6.v();
                        h6.i iVar2 = (s0.p) z8.u(s0.b.f8092t);
                        if (iVar2 == null) {
                            iVar2 = new s1();
                            vVar.f7968f = iVar2;
                        }
                        if (i1Var != 0) {
                            jVar = i1Var;
                        }
                        h6.i z9 = z8.z(jVar).z(iVar2);
                        g0.t1 t1Var2 = new g0.t1(z9);
                        synchronized (t1Var2.f3908b) {
                            t1Var2.f3923q = true;
                        }
                        h7.c a3 = c7.a0.a(z9);
                        androidx.lifecycle.v f9 = androidx.lifecycle.q0.f(view);
                        androidx.lifecycle.x f10 = f9 != null ? f9.f() : null;
                        if (f10 == null) {
                            a.a.N("ViewTreeLifecycleOwner not found from " + view);
                            throw null;
                        }
                        view.addOnAttachStateChangeListener(new v2(view, t1Var2));
                        f10.a(new x2(a3, i1Var, t1Var2, vVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, t1Var2);
                        Handler handler = view.getHandler();
                        int i7 = d7.f.f2649a;
                        h6.i iVar3 = new d7.e(handler, "windowRecomposer cleanup", false).f2648k;
                        a0.e0 e0Var = new a0.e0(t1Var2, view, r1, 24);
                        if ((2 & 1) != 0) {
                            iVar3 = h6.j.f4661f;
                        }
                        int i8 = 2;
                        c7.y yVar = (2 & 2) != 0 ? c7.y.f1756f : null;
                        h6.i g9 = c7.a0.g(h6.j.f4661f, iVar3, true);
                        j7.e eVar = c7.g0.f1696a;
                        if (g9 != eVar && g9.u(h6.e.f4660f) == null) {
                            g9 = g9.z(eVar);
                        }
                        c7.a g1Var = yVar == c7.y.f1757g ? new c7.g1(g9, e0Var) : new c7.m1(g9, true);
                        g1Var.f0(yVar, g1Var, e0Var);
                        view.addOnAttachStateChangeListener(new u(i8, g1Var));
                        t1Var = t1Var2;
                    } else {
                        if (!(b9 instanceof g0.t1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        t1Var = (g0.t1) b9;
                    }
                    r1 = ((g0.q1) t1Var.f3924r.getValue()).compareTo(g0.q1.f3861g) > 0 ? t1Var : null;
                    if (r1 != null) {
                        this.f8119f = new WeakReference(r1);
                    }
                    return t1Var;
                }
            }
        }
        return rVar;
    }

    public final boolean getHasComposition() {
        return this.f8121h != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f8124k;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f8126m || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
        d(z8, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        c();
        e(i7, i8);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i7);
    }

    public final void setParentCompositionContext(g0.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z8) {
        this.f8124k = z8;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r) ((r1.g1) childAt)).setShowLayoutBounds(z8);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z8) {
        super.setTransitionGroup(z8);
        this.f8126m = true;
    }

    public final void setViewCompositionStrategy(k2 k2Var) {
        m.h hVar = this.f8123j;
        if (hVar != null) {
            hVar.a();
        }
        ((j0) k2Var).getClass();
        u uVar = new u(1, this);
        addOnAttachStateChangeListener(uVar);
        a0.s sVar = new a0.s(22);
        j1.c.a0(this).f3292a.add(sVar);
        this.f8123j = new m.h(this, uVar, sVar, 5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        b();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z8) {
        b();
        return super.addViewInLayout(view, i7, layoutParams, z8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        b();
        super.addView(view, i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i7, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
