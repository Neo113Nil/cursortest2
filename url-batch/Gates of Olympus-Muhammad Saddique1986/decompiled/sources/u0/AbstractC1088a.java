package u0;

import C0.C0025a;
import I.C0160l0;
import I.C0167p;
import I.C0187z0;
import I.EnumC0175t0;
import a.AbstractC0235a;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.InterfaceC0292v;
import com.gatesof.olympus.martu.marku.R;
import java.lang.ref.WeakReference;
import q2.AbstractC0837y;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1088a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f9298d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f9299e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f9300f;

    /* renamed from: g, reason: collision with root package name */
    public I.r f9301g;

    /* renamed from: h, reason: collision with root package name */
    public K2.i f9302h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9303i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9304j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9305k;

    public /* synthetic */ AbstractC1088a(Context context) {
        this(context, null, 0);
    }

    private final void setParentContext(I.r rVar) {
        if (this.f9301g != rVar) {
            this.f9301g = rVar;
            if (rVar != null) {
                this.f9298d = null;
            }
            k1 k1Var = this.f9300f;
            if (k1Var != null) {
                k1Var.c();
                this.f9300f = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f9299e != iBinder) {
            this.f9299e = iBinder;
            this.f9298d = null;
        }
    }

    public abstract void a(int i3, C0167p c0167p);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i3, layoutParams);
    }

    public final void b() {
        if (this.f9304j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f9300f == null) {
            try {
                this.f9304j = true;
                this.f9300f = m1.a(this, f(), new Q.a(-656146368, new C0025a(12, this), true));
            } finally {
                this.f9304j = false;
            }
        }
    }

    public void d(boolean z3, int i3, int i4, int i5, int i6) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i5 - i3) - getPaddingRight(), (i6 - i4) - getPaddingBottom());
        }
    }

    public void e(int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i3, i4);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i3)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i4)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [I.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [I.r] */
    /* JADX WARN: Type inference failed for: r1v17, types: [I.z0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [I.r] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [I.l0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I.r f() {
        V1.i iVar;
        ?? r5;
        I.r rVar;
        int i3 = 2;
        C0187z0 c0187z0 = this.f9301g;
        if (c0187z0 == 0) {
            c0187z0 = g1.b(this);
            if (c0187z0 == 0) {
                ViewParent parent = getParent();
                c0187z0 = c0187z0;
                while (c0187z0 == 0 && (parent instanceof View)) {
                    I.r b3 = g1.b((View) parent);
                    parent = parent.getParent();
                    c0187z0 = b3;
                }
            }
            if (c0187z0 != 0) {
                Object obj = (!(c0187z0 instanceof C0187z0) || ((EnumC0175t0) c0187z0.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) > 0) ? c0187z0 : null;
                if (obj != null) {
                    this.f9298d = new WeakReference(obj);
                }
            } else {
                c0187z0 = 0;
            }
            if (c0187z0 == 0) {
                WeakReference weakReference = this.f9298d;
                if (weakReference != null && (rVar = (I.r) weakReference.get()) != null) {
                    boolean z3 = rVar instanceof C0187z0;
                    c0187z0 = rVar;
                    if (z3) {
                        int compareTo = ((EnumC0175t0) ((C0187z0) rVar).f3001r.getValue()).compareTo(EnumC0175t0.f2920e);
                        c0187z0 = rVar;
                    }
                    if (c0187z0 == 0) {
                        if (!isAttachedToWindow()) {
                            n.z0.o("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                        I.r b4 = g1.b(view);
                        if (b4 == null) {
                            ((W0) Y0.f9294a.get()).getClass();
                            V1.j jVar = V1.j.f4558d;
                            R1.n nVar = W.f9278p;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                iVar = (V1.i) W.f9278p.getValue();
                            } else {
                                iVar = (V1.i) W.f9279q.get();
                                if (iVar == null) {
                                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                                }
                            }
                            V1.i d3 = iVar.d(jVar);
                            I.X x3 = (I.X) d3.v(I.W.f2779e);
                            if (x3 != null) {
                                C0160l0 c0160l0 = new C0160l0(x3);
                                I.S s3 = (I.S) c0160l0.f2832f;
                                synchronized (s3.f2753b) {
                                    s3.f2752a = false;
                                    r5 = c0160l0;
                                }
                            } else {
                                r5 = 0;
                            }
                            f2.u uVar = new f2.u();
                            V1.i iVar2 = (U.r) d3.v(U.b.f4476s);
                            if (iVar2 == null) {
                                iVar2 = new C1128u0();
                                uVar.f5832d = iVar2;
                            }
                            if (r5 != 0) {
                                jVar = r5;
                            }
                            V1.i d4 = d3.d(jVar).d(iVar2);
                            C0187z0 c0187z02 = new C0187z0(d4);
                            synchronized (c0187z02.f2985b) {
                                c0187z02.f3000q = true;
                            }
                            v2.c a3 = AbstractC0837y.a(d4);
                            InterfaceC0292v f3 = androidx.lifecycle.P.f(view);
                            C0294x e3 = f3 != null ? f3.e() : null;
                            if (e3 == null) {
                                n.z0.p("ViewTreeLifecycleOwner not found from " + view);
                                throw null;
                            }
                            view.addOnAttachStateChangeListener(new Z0(view, c0187z02));
                            e3.a(new d1(a3, r5, c0187z02, uVar, view));
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, c0187z02);
                            q2.S s4 = q2.S.f7870d;
                            Handler handler = view.getHandler();
                            int i4 = r2.e.f8208a;
                            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1129v(i3, AbstractC0837y.r(s4, new r2.d(handler, "windowRecomposer cleanup", false).f8207i, null, new X0(c0187z02, view, null), 2)));
                            c0187z0 = c0187z02;
                        } else {
                            if (!(b4 instanceof C0187z0)) {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                            }
                            c0187z0 = (C0187z0) b4;
                        }
                        Object obj2 = ((EnumC0175t0) c0187z0.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) > 0 ? c0187z0 : null;
                        if (obj2 != null) {
                            this.f9298d = new WeakReference(obj2);
                        }
                    }
                }
                c0187z0 = 0;
                if (c0187z0 == 0) {
                }
            }
        }
        return c0187z0;
    }

    public final boolean getHasComposition() {
        return this.f9300f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f9303i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f9305k || super.isTransitionGroup();
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
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        d(z3, i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        c();
        e(i3, i4);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i3);
    }

    public final void setParentCompositionContext(I.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f9303i = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C1123s) ((t0.h0) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f9305k = true;
    }

    public final void setViewCompositionStrategy(N0 n02) {
        K2.i iVar = this.f9302h;
        if (iVar != null) {
            iVar.b();
        }
        ((L) n02).getClass();
        ViewOnAttachStateChangeListenerC1129v viewOnAttachStateChangeListenerC1129v = new ViewOnAttachStateChangeListenerC1129v(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1129v);
        B.r rVar = new B.r(12);
        AbstractC0235a.B(this).f5845a.add(rVar);
        this.f9302h = new K2.i(this, viewOnAttachStateChangeListenerC1129v, rVar, 7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC1088a(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC1129v viewOnAttachStateChangeListenerC1129v = new ViewOnAttachStateChangeListenerC1129v(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1129v);
        B.r rVar = new B.r(12);
        AbstractC0235a.B(this).f5845a.add(rVar);
        this.f9302h = new K2.i(this, viewOnAttachStateChangeListenerC1129v, rVar, 7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        b();
        super.addView(view, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i3, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i4) {
        b();
        super.addView(view, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i3, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
