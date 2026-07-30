package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.feathherdashh.dashgame.R;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class o extends ViewGroup {
    public WeakReference d;
    public IBinder e;
    public kq1 g;
    public ml h;
    public mn1 i;
    public boolean j;
    public boolean k;
    public boolean l;

    private final void setParentContext(ml mlVar) {
        if (this.h != mlVar) {
            this.h = mlVar;
            if (mlVar != null) {
                this.d = null;
            }
            kq1 kq1Var = this.g;
            if (kq1Var != null) {
                kq1Var.d();
                this.g = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.e != iBinder) {
            this.e = iBinder;
            this.d = null;
        }
    }

    public abstract void a(int i, hl hlVar);

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
        if (this.k) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.g == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.k = true;
                this.g = mq1.a(this, d(), new hk(-656146368, true, new n((int) (objArr == true ? 1 : 0), (Object) this)));
            } finally {
                this.k = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ml d() {
        o11 o11Var;
        CoroutineContext coroutineContext;
        bw0 bw0Var;
        ml mlVar = this.h;
        if (mlVar == null) {
            mlVar = vp1.b(this);
            if (mlVar == null) {
                Object parent = getParent();
                while (mlVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    mlVar = vp1.b(view);
                    parent = gb0.x(view);
                }
            }
            if (mlVar != null) {
                ml mlVar2 = (!(mlVar instanceof o11) || ((k11) ((o11) mlVar).u.getValue()).compareTo(k11.e) > 0) ? mlVar : null;
                if (mlVar2 != null) {
                    this.d = new WeakReference(mlVar2);
                }
            } else {
                mlVar = null;
            }
            if (mlVar == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (mlVar = (ml) weakReference.get()) == null || ((mlVar instanceof o11) && ((k11) ((o11) mlVar).u.getValue()).compareTo(k11.e) <= 0)) {
                    mlVar = null;
                }
                if (mlVar == null) {
                    if (!isAttachedToWindow()) {
                        o80.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                    ml b = vp1.b(view2);
                    if (b == null) {
                        ((pp1) qp1.a.get()).getClass();
                        g gVar = g.d;
                        gn gnVar = d.f;
                        gVar.getClass();
                        gnVar.getClass();
                        cg1 cg1Var = p6.q;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) p6.q.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) p6.r.get();
                            if (coroutineContext == null) {
                                dd0.j("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext i = coroutineContext.i(gVar);
                        gm0 gm0Var = (gm0) i.d(j50.z);
                        if (gm0Var != null) {
                            bw0 bw0Var2 = new bw0(gm0Var);
                            nz nzVar = bw0Var2.e;
                            synchronized (nzVar.b) {
                                nzVar.a = false;
                                bw0Var = bw0Var2;
                            }
                        } else {
                            bw0Var = 0;
                        }
                        z11 z11Var = new z11();
                        CoroutineContext coroutineContext2 = (im0) i.d(a60.l);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new jm0();
                            z11Var.d = coroutineContext2;
                        }
                        if (bw0Var != 0) {
                            gVar = bw0Var;
                        }
                        CoroutineContext i2 = i.i(gVar).i(coroutineContext2);
                        o11 o11Var2 = new o11(i2);
                        synchronized (o11Var2.c) {
                            o11Var2.t = true;
                        }
                        cn f = la0.f(i2);
                        vg0 s = t80.s(view2);
                        xg0 f2 = s != null ? s.f() : null;
                        if (f2 == null) {
                            o80.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new kc0();
                        }
                        view2.addOnAttachStateChangeListener(new rp1(view2, o11Var2));
                        f2.a(new tp1(f, bw0Var, o11Var2, z11Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, o11Var2);
                        w40 w40Var = w40.d;
                        Handler handler = view2.getHandler();
                        int i3 = w50.a;
                        view2.addOnAttachStateChangeListener(new r5(2, uq1.N(w40Var, new v50(handler, "windowRecomposer cleanup", false).j, new d(o11Var2, view2, r1, 24), 2)));
                        o11Var = o11Var2;
                    } else {
                        if (!(b instanceof o11)) {
                            dd0.j("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        o11Var = (o11) b;
                    }
                    r1 = ((k11) o11Var.u.getValue()).compareTo(k11.e) > 0 ? o11Var : null;
                    if (r1 != null) {
                        this.d = new WeakReference(r1);
                    }
                    return o11Var;
                }
            }
        }
        return mlVar;
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m15getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        sa saVar = tag instanceof sa ? (sa) tag : null;
        if (saVar != null) {
            return saVar.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.l || super.isTransitionGroup();
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m16setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new sa(i));
    }

    public final void setParentCompositionContext(ml mlVar) {
        setParentContext(mlVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.j = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((d4) ((eu0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.l = true;
    }

    public final void setViewCompositionStrategy(nn1 nn1Var) {
        mn1 mn1Var = this.i;
        if (mn1Var != null) {
            mn1Var.invoke();
        }
        ((xa0) nn1Var).getClass();
        r5 r5Var = new r5(1, this);
        addOnAttachStateChangeListener(r5Var);
        dd0 dd0Var = new dd0(17);
        t80.u(this).a.add(dd0Var);
        this.i = new mn1(this, r5Var, dd0Var);
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
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
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
