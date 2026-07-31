package u0;

import F.C0036e;
import I.C0106l0;
import I.C0113p;
import I.EnumC0121t0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.InterfaceC0236v;
import com.gates.olympus.miruv.R;
import e2.AbstractC0381e;
import java.lang.ref.WeakReference;
import k2.AbstractC0552y;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0960a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f8278d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f8279e;

    /* renamed from: f, reason: collision with root package name */
    public Z0 f8280f;

    /* renamed from: g, reason: collision with root package name */
    public I.r f8281g;

    /* renamed from: h, reason: collision with root package name */
    public E2.j f8282h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8283i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8284j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8285k;

    public AbstractC0960a(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC1003w viewOnAttachStateChangeListenerC1003w = new ViewOnAttachStateChangeListenerC1003w(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1003w);
        B2.a aVar = new B2.a(5);
        I2.d.C(this).f4453a.add(aVar);
        this.f8282h = new E2.j(this, viewOnAttachStateChangeListenerC1003w, aVar, 6);
    }

    private final void setParentContext(I.r rVar) {
        if (this.f8281g != rVar) {
            this.f8281g = rVar;
            if (rVar != null) {
                this.f8278d = null;
            }
            Z0 z02 = this.f8280f;
            if (z02 != null) {
                z02.c();
                this.f8280f = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f8279e != iBinder) {
            this.f8279e = iBinder;
            this.f8278d = null;
        }
    }

    public abstract void a(int i3, C0113p c0113p);

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
        if (this.f8284j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f8280f == null) {
            try {
                this.f8284j = true;
                this.f8280f = b1.a(this, f(), new Q.a(-656146368, new C0036e(11, this), true));
            } finally {
                this.f8284j = false;
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
    /* JADX WARN: Type inference failed for: r1v17, types: [I.A0] */
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
        P1.i iVar;
        ?? r5;
        I.r rVar;
        int i3 = 2;
        I.A0 a02 = this.f8281g;
        if (a02 == 0) {
            a02 = V0.b(this);
            if (a02 == 0) {
                ViewParent parent = getParent();
                a02 = a02;
                while (a02 == 0 && (parent instanceof View)) {
                    I.r b2 = V0.b((View) parent);
                    parent = parent.getParent();
                    a02 = b2;
                }
            }
            if (a02 != 0) {
                Object obj = (!(a02 instanceof I.A0) || ((EnumC0121t0) a02.f2076r.getValue()).compareTo(EnumC0121t0.f2361e) > 0) ? a02 : null;
                if (obj != null) {
                    this.f8278d = new WeakReference(obj);
                }
            } else {
                a02 = 0;
            }
            if (a02 == 0) {
                WeakReference weakReference = this.f8278d;
                if (weakReference != null && (rVar = (I.r) weakReference.get()) != null) {
                    boolean z3 = rVar instanceof I.A0;
                    a02 = rVar;
                    if (z3) {
                        int compareTo = ((EnumC0121t0) ((I.A0) rVar).f2076r.getValue()).compareTo(EnumC0121t0.f2361e);
                        a02 = rVar;
                    }
                    if (a02 == 0) {
                        if (!isAttachedToWindow()) {
                            AbstractC0381e.N("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                        I.r b3 = V0.b(view);
                        if (b3 == null) {
                            ((L0) N0.f8218a.get()).getClass();
                            P1.j jVar = P1.j.f3073d;
                            L1.o oVar = S.p;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                iVar = (P1.i) S.p.getValue();
                            } else {
                                iVar = (P1.i) S.f8234q.get();
                                if (iVar == null) {
                                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                                }
                            }
                            P1.i o3 = iVar.o(jVar);
                            I.Y y3 = (I.Y) o3.k(I.X.f2224e);
                            if (y3 != null) {
                                C0106l0 c0106l0 = new C0106l0(y3);
                                I.T t3 = (I.T) c0106l0.f2275f;
                                synchronized (t3.f2198b) {
                                    t3.f2197a = false;
                                    r5 = c0106l0;
                                }
                            } else {
                                r5 = 0;
                            }
                            Z1.t tVar = new Z1.t();
                            P1.i iVar2 = (U.n) o3.k(U.a.f3292q);
                            if (iVar2 == null) {
                                iVar2 = new C0987n0();
                                tVar.f3480d = iVar2;
                            }
                            if (r5 != 0) {
                                jVar = r5;
                            }
                            P1.i o4 = o3.o(jVar).o(iVar2);
                            I.A0 a03 = new I.A0(o4);
                            synchronized (a03.f2061b) {
                                a03.f2075q = true;
                            }
                            p2.c a3 = AbstractC0552y.a(o4);
                            InterfaceC0236v f3 = androidx.lifecycle.P.f(view);
                            C0238x e3 = f3 != null ? f3.e() : null;
                            if (e3 == null) {
                                AbstractC0381e.O("ViewTreeLifecycleOwner not found from " + view);
                                throw null;
                            }
                            view.addOnAttachStateChangeListener(new O0(view, a03));
                            e3.a(new S0(a3, r5, a03, tVar, view));
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, a03);
                            k2.S s3 = k2.S.f5331d;
                            Handler handler = view.getHandler();
                            int i4 = l2.e.f5552a;
                            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1003w(i3, AbstractC0552y.q(s3, new l2.d(handler, "windowRecomposer cleanup", false).f5551i, null, new M0(a03, view, null), 2)));
                            a02 = a03;
                        } else {
                            if (!(b3 instanceof I.A0)) {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                            }
                            a02 = (I.A0) b3;
                        }
                        Object obj2 = ((EnumC0121t0) a02.f2076r.getValue()).compareTo(EnumC0121t0.f2361e) > 0 ? a02 : null;
                        if (obj2 != null) {
                            this.f8278d = new WeakReference(obj2);
                        }
                    }
                }
                a02 = 0;
                if (a02 == 0) {
                }
            }
        }
        return a02;
    }

    public final boolean getHasComposition() {
        return this.f8280f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f8283i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f8285k || super.isTransitionGroup();
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
        this.f8283i = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C0997t) ((t0.g0) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f8285k = true;
    }

    public final void setViewCompositionStrategy(C0 c02) {
        E2.j jVar = this.f8282h;
        if (jVar != null) {
            jVar.b();
        }
        ((L) c02).getClass();
        ViewOnAttachStateChangeListenerC1003w viewOnAttachStateChangeListenerC1003w = new ViewOnAttachStateChangeListenerC1003w(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1003w);
        B2.a aVar = new B2.a(5);
        I2.d.C(this).f4453a.add(aVar);
        this.f8282h = new E2.j(this, viewOnAttachStateChangeListenerC1003w, aVar, 6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
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
