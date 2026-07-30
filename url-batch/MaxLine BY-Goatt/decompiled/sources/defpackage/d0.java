package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.majelw.libystne.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class d0 extends ViewGroup {
    public WeakReference m;
    public IBinder n;
    public g93 o;
    public d00 p;
    public bn q;
    public boolean r;
    public boolean s;
    public boolean t;

    public d0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        w7 w7Var = new w7(5, this);
        addOnAttachStateChangeListener(w7Var);
        ch2 ch2Var = new ch2(15);
        bd3.x(this).a.add(ch2Var);
        this.q = new bn(this, w7Var, ch2Var, 6);
    }

    private final void setParentContext(d00 d00Var) {
        if (this.p != d00Var) {
            this.p = d00Var;
            if (d00Var != null) {
                this.m = null;
            }
            g93 g93Var = this.o;
            if (g93Var != null) {
                g93Var.a();
                this.o = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.n != iBinder) {
            this.n = iBinder;
            this.m = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(int i, a00 a00Var);

    public final void c() {
        if (this.s) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        if (this.o == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.s = true;
                this.o = h93.a(this, g(), new my(-656146368, new c0(objArr == true ? 1 : 0, this), true));
            } finally {
                this.s = false;
            }
        }
    }

    public void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d00 g() {
        r72 r72Var;
        CoroutineContext coroutineContext;
        n02 n02Var;
        d00 d00Var = this.p;
        if (d00Var == null) {
            d00Var = s83.b(this);
            if (d00Var == null) {
                Object parent = getParent();
                while (d00Var == null && (parent instanceof View)) {
                    View view = (View) parent;
                    d00Var = s83.b(view);
                    parent = view.getParent();
                }
            }
            if (d00Var != null) {
                d00 d00Var2 = (!(d00Var instanceof r72) || ((o72) ((r72) d00Var).t.getValue()).compareTo(o72.n) > 0) ? d00Var : null;
                if (d00Var2 != null) {
                    this.m = new WeakReference(d00Var2);
                }
            } else {
                d00Var = null;
            }
            if (d00Var == null) {
                WeakReference weakReference = this.m;
                if (weakReference == null || (d00Var = (d00) weakReference.get()) == null || ((d00Var instanceof r72) && ((o72) ((r72) d00Var).t.getValue()).compareTo(o72.n) <= 0)) {
                    d00Var = null;
                }
                if (d00Var == null) {
                    if (!isAttachedToWindow()) {
                        h21.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                    d00 b = s83.b(view2);
                    if (b == null) {
                        ((n83) o83.a.get()).getClass();
                        h hVar = h.m;
                        s30 s30Var = e.d;
                        hVar.getClass();
                        s30Var.getClass();
                        y91 y91Var = xb.y;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) xb.y.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) xb.z.get();
                            if (coroutineContext == null) {
                                lh.g("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext p = coroutineContext.p(hVar);
                        em1 em1Var = (em1) p.m(qb2.W);
                        if (em1Var != null) {
                            n02 n02Var2 = new n02(em1Var);
                            w50 w50Var = n02Var2.n;
                            synchronized (w50Var.b) {
                                w50Var.a = false;
                                Unit unit = Unit.a;
                                n02Var = n02Var2;
                            }
                        } else {
                            n02Var = 0;
                        }
                        c82 c82Var = new c82();
                        CoroutineContext coroutineContext2 = (fm1) p.m(qb2.X);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new gm1();
                            c82Var.m = coroutineContext2;
                        }
                        if (n02Var != 0) {
                            hVar = n02Var;
                        }
                        CoroutineContext p2 = p.p(hVar).p(coroutineContext2);
                        r72 r72Var2 = new r72(p2);
                        synchronized (r72Var2.b) {
                            r72Var2.s = true;
                            Unit unit2 = Unit.a;
                        }
                        m30 b2 = j8.b(p2);
                        id1 g = ij2.g(view2);
                        ad1 lifecycle = g != null ? g.getLifecycle() : null;
                        if (lifecycle == null) {
                            h21.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new k81();
                        }
                        view2.addOnAttachStateChangeListener(new qr0(view2, r72Var2));
                        lifecycle.a(new q83(b2, n02Var, r72Var2, c82Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, r72Var2);
                        kv0 kv0Var = kv0.m;
                        Handler handler = view2.getHandler();
                        int i = cx0.a;
                        view2.addOnAttachStateChangeListener(new w7(6, z71.H(kv0Var, new bx0(handler, "windowRecomposer cleanup", false).r, new z62(r72Var2, view2, r1, 11), 2)));
                        r72Var = r72Var2;
                    } else {
                        if (!(b instanceof r72)) {
                            lh.g("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        r72Var = (r72) b;
                    }
                    r1 = ((o72) r72Var.t.getValue()).compareTo(o72.n) > 0 ? r72Var : null;
                    if (r1 != null) {
                        this.m = new WeakReference(r1);
                    }
                    return r72Var;
                }
            }
        }
        return d00Var;
    }

    public final boolean getHasComposition() {
        return this.o != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.t || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(d00 d00Var) {
        setParentContext(d00Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.r = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((t7) ((rx1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.t = true;
    }

    public final void setViewCompositionStrategy(f53 f53Var) {
        bn bnVar = this.q;
        if (bnVar != null) {
            bnVar.invoke();
        }
        ((yh2) f53Var).getClass();
        w7 w7Var = new w7(5, this);
        addOnAttachStateChangeListener(w7Var);
        ch2 ch2Var = new ch2(15);
        bd3.x(this).a.add(ch2Var);
        this.q = new bn(this, w7Var, ch2Var, 6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
