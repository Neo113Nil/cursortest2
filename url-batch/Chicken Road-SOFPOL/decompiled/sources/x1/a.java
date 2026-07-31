package x1;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f8323d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f8324e;

    /* renamed from: f, reason: collision with root package name */
    public i2 f8325f;

    /* renamed from: g, reason: collision with root package name */
    public m0.v f8326g;

    /* renamed from: h, reason: collision with root package name */
    public s1 f8327h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8328j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8329k;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        f1.e eVar = new f1.e(6, this);
        addOnAttachStateChangeListener(eVar);
        c5.n nVar = new c5.n(17);
        r2.r.A(this).f7478a.add(nVar);
        this.f8327h = new s1(this, eVar, nVar);
    }

    private final void setParentContext(m0.v vVar) {
        if (this.f8326g != vVar) {
            this.f8326g = vVar;
            if (vVar != null) {
                this.f8323d = null;
            }
            i2 i2Var = this.f8325f;
            if (i2Var != null) {
                i2Var.e();
                this.f8325f = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f8324e != iBinder) {
            this.f8324e = iBinder;
            this.f8323d = null;
        }
    }

    public abstract void a(m0.s sVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.f8328j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f8325f == null) {
            try {
                this.f8328j = true;
                this.f8325f = j2.a(this, f(), new u0.c(-656146368, true, new q.d(3, this)));
            } finally {
                this.f8328j = false;
            }
        }
    }

    public void d(int i, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i9 - i) - getPaddingRight(), (i10 - i8) - getPaddingBottom());
        }
    }

    public void e(int i, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i8);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i8)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m0.v f() {
        m0.y1 y1Var;
        g6.h hVar;
        m0.j1 j1Var;
        m0.v vVar = this.f8326g;
        if (vVar == null) {
            vVar = f2.b(this);
            if (vVar == null) {
                Object parent = getParent();
                while (vVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    vVar = f2.b(view);
                    parent = view.getParent();
                }
            }
            if (vVar != null) {
                m0.v vVar2 = (!(vVar instanceof m0.y1) || ((m0.u1) ((m0.y1) vVar).f5206t.getValue()).compareTo(m0.u1.f5127e) > 0) ? vVar : null;
                if (vVar2 != null) {
                    this.f8323d = new WeakReference(vVar2);
                }
            } else {
                vVar = null;
            }
            if (vVar == null) {
                WeakReference weakReference = this.f8323d;
                if (weakReference == null || (vVar = (m0.v) weakReference.get()) == null || ((vVar instanceof m0.y1) && ((m0.u1) ((m0.y1) vVar).f5206t.getValue()).compareTo(m0.u1.f5127e) <= 0)) {
                    vVar = null;
                }
                if (vVar == null) {
                    if (!isAttachedToWindow()) {
                        t1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    m0.v b8 = f2.b(view2);
                    if (b8 == null) {
                        ((y1) z1.f8613a.get()).getClass();
                        g6.i iVar = g6.i.f3046d;
                        c6.k kVar = m0.f8498p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (g6.h) m0.f8498p.getValue();
                        } else {
                            hVar = (g6.h) m0.f8499q.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        g6.h c8 = hVar.c(iVar);
                        m0.w0 w0Var = (m0.w0) c8.l(m0.v0.f5132e);
                        if (w0Var != null) {
                            m0.j1 j1Var2 = new m0.j1(w0Var);
                            a0.f1 f1Var = (a0.f1) j1Var2.f4977f;
                            synchronized (f1Var.f79b) {
                                f1Var.f78a = false;
                                j1Var = j1Var2;
                            }
                        } else {
                            j1Var = 0;
                        }
                        q6.s sVar = new q6.s();
                        g6.h hVar2 = (y0.n) c8.l(y0.b.f8695s);
                        if (hVar2 == null) {
                            hVar2 = new m1();
                            sVar.f6205d = hVar2;
                        }
                        if (j1Var != 0) {
                            iVar = j1Var;
                        }
                        g6.h c9 = c8.c(iVar).c(hVar2);
                        m0.y1 y1Var2 = new m0.y1(c9);
                        synchronized (y1Var2.f5189b) {
                            y1Var2.f5205s = true;
                        }
                        f7.c a8 = a7.x.a(c9);
                        androidx.lifecycle.u d8 = androidx.lifecycle.l0.d(view2);
                        androidx.lifecycle.w g3 = d8 != null ? d8.g() : null;
                        if (g3 == null) {
                            t1.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new a5.c();
                        }
                        view2.addOnAttachStateChangeListener(new a2(view2, y1Var2));
                        g3.a(new d2(a8, j1Var, y1Var2, sVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, y1Var2);
                        Handler handler = view2.getHandler();
                        int i = b7.f.f1536a;
                        g6.h hVar3 = new b7.e(handler, "windowRecomposer cleanup", false).i;
                        b0.d dVar = new b0.d(y1Var2, view2, r1, 14);
                        a7.v vVar3 = a7.v.f306g;
                        if ((2 & 1) != 0) {
                            hVar3 = g6.i.f3046d;
                        }
                        if ((2 & 2) != 0) {
                            vVar3 = a7.v.f303d;
                        }
                        g6.h e8 = a7.x.e(g6.i.f3046d, hVar3, true);
                        h7.e eVar = a7.d0.f249a;
                        if (e8 != eVar && e8.l(g6.d.f3045d) == null) {
                            e8 = e8.c(eVar);
                        }
                        a7.a b1Var = vVar3 == a7.v.f304e ? new a7.b1(e8, dVar) : new a7.h1(e8, true);
                        b1Var.h0(vVar3, b1Var, dVar);
                        view2.addOnAttachStateChangeListener(new f1.e(7, b1Var));
                        y1Var = y1Var2;
                    } else {
                        if (!(b8 instanceof m0.y1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        y1Var = (m0.y1) b8;
                    }
                    r1 = ((m0.u1) y1Var.f5206t.getValue()).compareTo(m0.u1.f5127e) > 0 ? y1Var : null;
                    if (r1 != null) {
                        this.f8323d = new WeakReference(r1);
                    }
                    return y1Var;
                }
            }
        }
        return vVar;
    }

    public final boolean getHasComposition() {
        return this.f8325f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f8329k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        d(i, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        c();
        e(i, i8);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(m0.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.i = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((t) ((w1.k1) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f8329k = true;
    }

    public final void setViewCompositionStrategy(t1 t1Var) {
        s1 s1Var = this.f8327h;
        if (s1Var != null) {
            s1Var.b();
        }
        ((g0) t1Var).getClass();
        f1.e eVar = new f1.e(6, this);
        addOnAttachStateChangeListener(eVar);
        c5.n nVar = new c5.n(17);
        r2.r.A(this).f7478a.add(nVar);
        this.f8327h = new s1(this, eVar, nVar);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i8) {
        b();
        super.addView(view, i, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
