package s0;

import A.C0022s;
import A0.C0030a;
import G.C0209l0;
import G.C0216p;
import G.C0236z0;
import G.EnumC0224t0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.InterfaceC0481v;
import com.chicken.road.kedro.laqer.R;
import e1.C0558a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m.C0842o;
import n.AbstractC0864b;
import y2.InterfaceC1335j;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1131a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f10161d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f10162e;

    /* renamed from: i, reason: collision with root package name */
    public l1 f10163i;

    /* renamed from: j, reason: collision with root package name */
    public G.r f10164j;

    /* renamed from: k, reason: collision with root package name */
    public C0842o f10165k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10166l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10167m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10168n;

    public /* synthetic */ AbstractC1131a(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(G.r rVar) {
        if (this.f10164j != rVar) {
            this.f10164j = rVar;
            if (rVar != null) {
                this.f10161d = null;
            }
            l1 l1Var = this.f10163i;
            if (l1Var != null) {
                l1Var.c();
                this.f10163i = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f10162e != iBinder) {
            this.f10162e = iBinder;
            this.f10161d = null;
        }
    }

    public abstract void a(int i2, C0216p c0216p);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public final void b() {
        if (this.f10167m) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f10163i == null) {
            try {
                this.f10167m = true;
                this.f10163i = n1.a(this, f(), new O.a(-656146368, true, new C0030a(13, this)));
            } finally {
                this.f10167m = false;
            }
        }
    }

    public void d(boolean z4, int i2, int i4, int i5, int i6) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i5 - i2) - getPaddingRight(), (i6 - i4) - getPaddingBottom());
        }
    }

    public void e(int i2, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i4);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i4)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [G.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [G.r] */
    /* JADX WARN: Type inference failed for: r1v17, types: [G.z0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [G.r] */
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
    /* JADX WARN: Type inference failed for: r5v1, types: [G.l0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G.r f() {
        CoroutineContext coroutineContext;
        ?? r5;
        G.r rVar;
        int i2 = 2;
        C0236z0 c0236z0 = this.f10164j;
        if (c0236z0 == 0) {
            c0236z0 = h1.b(this);
            if (c0236z0 == 0) {
                ViewParent parent = getParent();
                c0236z0 = c0236z0;
                while (c0236z0 == 0 && (parent instanceof View)) {
                    G.r b4 = h1.b((View) parent);
                    parent = parent.getParent();
                    c0236z0 = b4;
                }
            }
            if (c0236z0 != 0) {
                Object obj = (!(c0236z0 instanceof C0236z0) || ((EnumC0224t0) c0236z0.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) > 0) ? c0236z0 : null;
                if (obj != null) {
                    this.f10161d = new WeakReference(obj);
                }
            } else {
                c0236z0 = 0;
            }
            if (c0236z0 == 0) {
                WeakReference weakReference = this.f10161d;
                if (weakReference != null && (rVar = (G.r) weakReference.get()) != null) {
                    boolean z4 = rVar instanceof C0236z0;
                    c0236z0 = rVar;
                    if (z4) {
                        int compareTo = ((EnumC0224t0) ((C0236z0) rVar).f2999r.getValue()).compareTo(EnumC0224t0.f2917e);
                        c0236z0 = rVar;
                    }
                    if (c0236z0 == 0) {
                        if (!isAttachedToWindow()) {
                            AbstractC0864b.D("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                        G.r b5 = h1.b(view);
                        if (b5 == null) {
                            ((X0) Z0.f10160a.get()).getClass();
                            kotlin.coroutines.i iVar = kotlin.coroutines.i.f7498d;
                            iVar.k(kotlin.coroutines.e.f7496f);
                            InterfaceC1335j interfaceC1335j = V.f10139s;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                coroutineContext = (CoroutineContext) V.f10139s.getValue();
                            } else {
                                coroutineContext = (CoroutineContext) V.f10140t.get();
                                if (coroutineContext == null) {
                                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                                }
                            }
                            CoroutineContext s4 = coroutineContext.s(iVar);
                            G.X x2 = (G.X) s4.k(G.W.f2775e);
                            if (x2 != null) {
                                C0209l0 c0209l0 = new C0209l0(x2);
                                G.S s5 = c0209l0.f2828e;
                                synchronized (s5.f2749a) {
                                    s5.f2752d = false;
                                    Unit unit = Unit.f7487a;
                                    r5 = c0209l0;
                                }
                            } else {
                                r5 = 0;
                            }
                            M2.E e4 = new M2.E();
                            CoroutineContext coroutineContext2 = (S.p) s4.k(S.b.f3966u);
                            if (coroutineContext2 == null) {
                                coroutineContext2 = new C1173v0();
                                e4.f3580d = coroutineContext2;
                            }
                            if (r5 != 0) {
                                iVar = r5;
                            }
                            CoroutineContext s6 = s4.s(iVar).s(coroutineContext2);
                            C0236z0 c0236z02 = new C0236z0(s6);
                            synchronized (c0236z02.f2983b) {
                                c0236z02.f2998q = true;
                                Unit unit2 = Unit.f7487a;
                            }
                            b3.c a4 = W2.B.a(s6);
                            InterfaceC0481v f4 = androidx.lifecycle.M.f(view);
                            C0483x e5 = f4 != null ? f4.e() : null;
                            if (e5 == null) {
                                AbstractC0864b.E("ViewTreeLifecycleOwner not found from " + view);
                                throw null;
                            }
                            view.addOnAttachStateChangeListener(new a1(view, c0236z02));
                            e5.a(new e1(a4, r5, c0236z02, e4, view));
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, c0236z02);
                            W2.X x3 = W2.X.f4244d;
                            Handler handler = view.getHandler();
                            int i4 = X2.e.f4365a;
                            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1172v(i2, W2.B.m(x3, new X2.d(handler, "windowRecomposer cleanup", false).f4364l, null, new Y0(c0236z02, view, null), 2)));
                            c0236z0 = c0236z02;
                        } else {
                            if (!(b5 instanceof C0236z0)) {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                            }
                            c0236z0 = (C0236z0) b5;
                        }
                        Object obj2 = ((EnumC0224t0) c0236z0.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) > 0 ? c0236z0 : null;
                        if (obj2 != null) {
                            this.f10161d = new WeakReference(obj2);
                        }
                    }
                }
                c0236z0 = 0;
                if (c0236z0 == 0) {
                }
            }
        }
        return c0236z0;
    }

    public final boolean getHasComposition() {
        return this.f10163i != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f10166l;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f10168n || super.isTransitionGroup();
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
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
        d(z4, i2, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        c();
        e(i2, i4);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i2);
    }

    public final void setParentCompositionContext(G.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z4) {
        this.f10166l = z4;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C1166s) ((r0.g0) childAt)).setShowLayoutBounds(z4);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z4) {
        super.setTransitionGroup(z4);
        this.f10168n = true;
    }

    public final void setViewCompositionStrategy(O0 o0) {
        C0842o c0842o = this.f10165k;
        if (c0842o != null) {
            c0842o.invoke();
        }
        ((AbstractC1125K) o0).getClass();
        ViewOnAttachStateChangeListenerC1172v viewOnAttachStateChangeListenerC1172v = new ViewOnAttachStateChangeListenerC1172v(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1172v);
        C0022s listener = new C0022s(22);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0558a i02 = u3.l.i0(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        i02.f6162a.add(listener);
        this.f10165k = new C0842o(this, viewOnAttachStateChangeListenerC1172v, listener, 7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC1131a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC1172v viewOnAttachStateChangeListenerC1172v = new ViewOnAttachStateChangeListenerC1172v(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1172v);
        C0022s listener = new C0022s(22);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0558a i02 = u3.l.i0(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        i02.f6162a.add(listener);
        this.f10165k = new C0842o(this, viewOnAttachStateChangeListenerC1172v, listener, 7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        b();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z4) {
        b();
        return super.addViewInLayout(view, i2, layoutParams, z4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i4) {
        b();
        super.addView(view, i2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i2, layoutParams);
    }
}
