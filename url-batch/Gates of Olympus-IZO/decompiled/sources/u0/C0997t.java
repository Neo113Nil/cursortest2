package u0;

import D1.C0014b;
import I.C0089d;
import I.C0102j0;
import I.C0120t;
import I.C0125v0;
import a.AbstractC0157a;
import a1.AbstractC0179q;
import a1.AbstractC0180s;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.InterfaceC0220e;
import androidx.lifecycle.InterfaceC0236v;
import b0.AbstractC0259J;
import b0.C0261L;
import b0.C0271d;
import b0.C0274g;
import b0.C0286s;
import b0.InterfaceC0251B;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import j.C0475A;
import j.C0506x;
import j0.InterfaceC0509a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k0.C0524a;
import k0.InterfaceC0525b;
import m.AbstractC0600j;
import n0.C0673c;
import p0.C0760a;
import s0.C0887d;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.C0911t;

/* renamed from: u0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997t extends ViewGroup implements t0.g0, t0.m0, InterfaceC0220e {

    /* renamed from: A0, reason: collision with root package name */
    public static Class f8408A0;

    /* renamed from: B0, reason: collision with root package name */
    public static Method f8409B0;

    /* renamed from: A, reason: collision with root package name */
    public final V.a f8410A;
    public boolean B;
    public final C0974h C;
    public final t0.i0 D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8411E;

    /* renamed from: F, reason: collision with root package name */
    public V f8412F;

    /* renamed from: G, reason: collision with root package name */
    public C0973g0 f8413G;

    /* renamed from: H, reason: collision with root package name */
    public M0.a f8414H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8415I;

    /* renamed from: J, reason: collision with root package name */
    public final t0.S f8416J;

    /* renamed from: K, reason: collision with root package name */
    public final U f8417K;

    /* renamed from: L, reason: collision with root package name */
    public long f8418L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f8419M;

    /* renamed from: N, reason: collision with root package name */
    public final float[] f8420N;

    /* renamed from: O, reason: collision with root package name */
    public final float[] f8421O;

    /* renamed from: P, reason: collision with root package name */
    public long f8422P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f8423Q;

    /* renamed from: R, reason: collision with root package name */
    public long f8424R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8425S;

    /* renamed from: T, reason: collision with root package name */
    public final C0102j0 f8426T;

    /* renamed from: U, reason: collision with root package name */
    public final I.G f8427U;

    /* renamed from: V, reason: collision with root package name */
    public Y1.c f8428V;

    /* renamed from: W, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0976i f8429W;

    /* renamed from: a0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0978j f8430a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0980k f8431b0;

    /* renamed from: c0, reason: collision with root package name */
    public final G0.c f8432c0;

    /* renamed from: d, reason: collision with root package name */
    public long f8433d;

    /* renamed from: d0, reason: collision with root package name */
    public final G0.e f8434d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8435e;

    /* renamed from: e0, reason: collision with root package name */
    public final AtomicReference f8436e0;

    /* renamed from: f, reason: collision with root package name */
    public final t0.F f8437f;

    /* renamed from: f0, reason: collision with root package name */
    public final C0981k0 f8438f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0102j0 f8439g;

    /* renamed from: g0, reason: collision with root package name */
    public final C0981k0 f8440g0;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.focus.a f8441h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0102j0 f8442h0;

    /* renamed from: i, reason: collision with root package name */
    public P1.i f8443i;

    /* renamed from: i0, reason: collision with root package name */
    public int f8444i0;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnDragListenerC0971f0 f8445j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0102j0 f8446j0;

    /* renamed from: k, reason: collision with root package name */
    public final K0 f8447k;

    /* renamed from: k0, reason: collision with root package name */
    public final F0.a f8448k0;

    /* renamed from: l, reason: collision with root package name */
    public final C0286s f8449l;

    /* renamed from: l0, reason: collision with root package name */
    public final k0.c f8450l0;

    /* renamed from: m, reason: collision with root package name */
    public final t0.D f8451m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0887d f8452m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0997t f8453n;

    /* renamed from: n0, reason: collision with root package name */
    public final C0981k0 f8454n0;

    /* renamed from: o, reason: collision with root package name */
    public final z0.o f8455o;

    /* renamed from: o0, reason: collision with root package name */
    public MotionEvent f8456o0;
    public final C0959F p;

    /* renamed from: p0, reason: collision with root package name */
    public long f8457p0;

    /* renamed from: q, reason: collision with root package name */
    public W.c f8458q;
    public final C2.c q0;

    /* renamed from: r, reason: collision with root package name */
    public final C0972g f8459r;

    /* renamed from: r0, reason: collision with root package name */
    public final K.d f8460r0;

    /* renamed from: s, reason: collision with root package name */
    public final C0274g f8461s;

    /* renamed from: s0, reason: collision with root package name */
    public final D2.d f8462s0;

    /* renamed from: t, reason: collision with root package name */
    public final V.f f8463t;

    /* renamed from: t0, reason: collision with root package name */
    public final E.u f8464t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f8465u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f8466u0;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f8467v;
    public final C0995s v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8468w;

    /* renamed from: w0, reason: collision with root package name */
    public final W f8469w0;

    /* renamed from: x, reason: collision with root package name */
    public final C0673c f8470x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f8471x0;

    /* renamed from: y, reason: collision with root package name */
    public final E.G f8472y;

    /* renamed from: y0, reason: collision with root package name */
    public final y0.l f8473y0;

    /* renamed from: z, reason: collision with root package name */
    public Y1.c f8474z;

    /* renamed from: z0, reason: collision with root package name */
    public final C0981k0 f8475z0;

    /* JADX WARN: Type inference failed for: r2v20, types: [u0.i] */
    /* JADX WARN: Type inference failed for: r2v21, types: [u0.j] */
    /* JADX WARN: Type inference failed for: r2v22, types: [u0.k] */
    public C0997t(Context context, P1.i iVar) {
        super(context);
        this.f8433d = 9205357640488583168L;
        this.f8435e = true;
        this.f8437f = new t0.F();
        M0.d a3 = I2.d.a(context);
        I.X x3 = I.X.f2226g;
        this.f8439g = C0089d.J(a3, x3);
        z0.d dVar = new z0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.f8441h = new androidx.compose.ui.focus.a(new k2.a0(1, this, C0997t.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 1), new C0986n(2, this, C0997t.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 0), new Z.d(0, this, C0997t.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new C0988o(this, C0997t.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        ViewOnDragListenerC0971f0 viewOnDragListenerC0971f0 = new ViewOnDragListenerC0971f0();
        this.f8443i = iVar;
        this.f8445j = viewOnDragListenerC0971f0;
        this.f8447k = new K0();
        U.l a4 = androidx.compose.ui.input.key.a.a(new C0992q(this, 0));
        U.l a5 = androidx.compose.ui.input.rotary.a.a();
        this.f8449l = new C0286s();
        t0.D d3 = new t0.D(3, 0, false);
        r0.K k3 = r0.K.f7124a;
        if (!Z1.i.a(d3.f7729r, k3)) {
            d3.f7729r = k3;
            d3.y();
        }
        d3.U(getDensity());
        d3.W(emptySemanticsElement.e(a5).e(a4).e(((androidx.compose.ui.focus.a) getFocusOwner()).f3711g).e(viewOnDragListenerC0971f0.f8327c));
        this.f8451m = d3;
        this.f8453n = this;
        this.f8455o = new z0.o(getRoot(), dVar);
        C0959F c0959f = new C0959F(this);
        this.p = c0959f;
        this.f8458q = new W.c(this, new Z.d(0, this, L.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        C0972g c0972g = new C0972g();
        Object systemService = context.getSystemService("accessibility");
        Z1.i.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f8459r = c0972g;
        this.f8461s = new C0274g(this);
        this.f8463t = new V.f();
        this.f8465u = new ArrayList();
        this.f8470x = new C0673c();
        t0.D root = getRoot();
        E.G g3 = new E.G();
        g3.f622b = root;
        g3.f623c = new C0014b((C0911t) root.f7735x.f2353c);
        g3.f624d = new n0.o(0);
        g3.f625e = new t0.r();
        this.f8472y = g3;
        this.f8474z = C0984m.f8363f;
        this.f8410A = g() ? new V.a(this, getAutofillTree()) : null;
        this.C = new C0974h(context);
        this.D = new t0.i0(new C0992q(this, 1));
        this.f8416J = new t0.S(getRoot());
        this.f8417K = new U(ViewConfiguration.get(context));
        this.f8418L = I2.d.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f8419M = new int[]{0, 0};
        float[] l3 = AbstractC0259J.l();
        this.f8420N = AbstractC0259J.l();
        this.f8421O = AbstractC0259J.l();
        this.f8422P = -1L;
        this.f8424R = 9187343241974906880L;
        this.f8425S = true;
        I.X x4 = I.X.f2228i;
        this.f8426T = C0089d.J(null, x4);
        this.f8427U = C0089d.D(new C0995s(this, 1));
        this.f8429W = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0997t.this.H();
            }
        };
        this.f8430a0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: u0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C0997t.this.H();
            }
        };
        this.f8431b0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: u0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                k0.c cVar = C0997t.this.f8450l0;
                int i3 = z3 ? 1 : 2;
                cVar.getClass();
                cVar.f5308a.setValue(new C0524a(i3));
            }
        };
        this.f8432c0 = new G0.c(getView(), this);
        G0.e eVar = new G0.e();
        new AtomicReference(null);
        this.f8434d0 = eVar;
        this.f8436e0 = new AtomicReference(null);
        getTextInputService();
        this.f8438f0 = new C0981k0();
        this.f8440g0 = new C0981k0();
        this.f8442h0 = C0089d.J(AbstractC0157a.r(context), x3);
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = Build.VERSION.SDK_INT;
        this.f8444i0 = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        M0.j jVar = M0.j.f2775d;
        M0.j jVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : M0.j.f2776e : jVar;
        this.f8446j0 = C0089d.J(jVar2 != null ? jVar2 : jVar, x4);
        this.f8448k0 = new F0.a(25);
        this.f8450l0 = new k0.c(isInTouchMode() ? 1 : 2);
        this.f8452m0 = new C0887d(this);
        this.f8454n0 = new C0981k0();
        this.q0 = new C2.c(15);
        this.f8460r0 = new K.d(new Y1.a[16]);
        this.f8462s0 = new D2.d(2, this);
        this.f8464t0 = new E.u(7, this);
        this.v0 = new C0995s(this, 0);
        this.f8469w0 = i3 < 29 ? new U0.e(l3) : new X();
        addOnAttachStateChangeListener(this.f8458q);
        setWillNotDraw(false);
        setFocusable(true);
        if (i3 >= 26) {
            K.f8183a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i4 = AbstractC0179q.f3561a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(c0959f.f3549b);
        setOnDragListener(viewOnDragListenerC0971f0);
        getRoot().e(this);
        if (i3 >= 29) {
            H.f8178a.a(this);
        }
        this.f8473y0 = i3 >= 31 ? new y0.l() : null;
        C0981k0 c0981k0 = new C0981k0();
        n0.j.f6221a.getClass();
        this.f8475z0 = c0981k0;
    }

    public static final boolean f(C0997t c0997t, Z.a aVar, a0.d dVar) {
        Integer I3;
        if (c0997t.isFocused() || c0997t.hasFocus()) {
            return true;
        }
        return super.requestFocus((aVar == null || (I3 = Z.c.I(aVar.f3414a)) == null) ? 130 : I3.intValue(), dVar != null ? AbstractC0259J.D(dVar) : null);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0982l get_viewTreeOwners() {
        return (C0982l) this.f8426T.getValue();
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof C0997t) {
                ((C0997t) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i3) {
        long j3;
        long j4;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            j3 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j4 = size;
                j3 = j4 << 32;
                return j3 | j4;
            }
            j3 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j4 = size;
        return j3 | j4;
    }

    public static View k(View view, int i3) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Z1.i.a(declaredMethod.invoke(view, null), Integer.valueOf(i3))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View k3 = k(viewGroup.getChildAt(i4), i3);
                    if (k3 != null) {
                        return k3;
                    }
                }
            }
        }
        return null;
    }

    public static void m(t0.D d3) {
        d3.x();
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                m((t0.D) objArr[i4]);
                i4++;
            } while (i4 < i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(MotionEvent motionEvent) {
        boolean z3;
        float x3 = motionEvent.getX();
        if (!Float.isInfinite(x3) && !Float.isNaN(x3)) {
            float y3 = motionEvent.getY();
            if (!Float.isInfinite(y3) && !Float.isNaN(y3)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z3 = false;
                        if (!z3) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i3 = 1; i3 < pointerCount; i3++) {
                                float x4 = motionEvent.getX(i3);
                                if (!Float.isInfinite(x4) && !Float.isNaN(x4)) {
                                    float y4 = motionEvent.getY(i3);
                                    if (!Float.isInfinite(y4) && !Float.isNaN(y4) && (Build.VERSION.SDK_INT < 29 || C0989o0.f8379a.a(motionEvent, i3))) {
                                        z3 = false;
                                        if (!z3) {
                                            break;
                                        }
                                    }
                                }
                                z3 = true;
                                if (!z3) {
                                }
                            }
                        }
                        return z3;
                    }
                }
            }
        }
        z3 = true;
        if (!z3) {
        }
        return z3;
    }

    private void setDensity(M0.b bVar) {
        this.f8439g.setValue(bVar);
    }

    private void setFontFamilyResolver(F0.e eVar) {
        this.f8442h0.setValue(eVar);
    }

    private void setLayoutDirection(M0.j jVar) {
        this.f8446j0.setValue(jVar);
    }

    private final void set_viewTreeOwners(C0982l c0982l) {
        this.f8426T.setValue(c0982l);
    }

    public final void A() {
        C0959F c0959f = this.p;
        c0959f.f8156y = true;
        if (c0959f.q() && !c0959f.f8132J) {
            c0959f.f8132J = true;
            c0959f.f8144l.post(c0959f.f8133K);
        }
        W.c cVar = this.f8458q;
        cVar.f3380k = true;
        if (!cVar.f() || cVar.f3387s) {
            return;
        }
        cVar.f3387s = true;
        cVar.f3383n.post(cVar.f3388t);
    }

    public final void B() {
        if (this.f8423Q) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f8422P) {
            this.f8422P = currentAnimationTimeMillis;
            W w3 = this.f8469w0;
            float[] fArr = this.f8420N;
            w3.a(this, fArr);
            L.o(fArr, this.f8421O);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f8419M;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f8424R = I2.l.f(f3 - iArr[0], f4 - iArr[1]);
        }
    }

    public final void C(t0.f0 f0Var) {
        C2.c cVar;
        Reference poll;
        K.d dVar;
        if (this.f8413G != null) {
            P0.p pVar = F0.f8158s;
        }
        do {
            cVar = this.q0;
            poll = ((ReferenceQueue) cVar.f485f).poll();
            dVar = (K.d) cVar.f484e;
            if (poll != null) {
                dVar.n(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(f0Var, (ReferenceQueue) cVar.f485f));
    }

    public final void D(t0.D d3) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (d3 != null) {
            while (d3 != null && d3.f7736y.f7813r.f7783n == 1) {
                if (!this.f8415I) {
                    t0.D q2 = d3.q();
                    if (q2 == null) {
                        break;
                    }
                    long j3 = ((C0911t) q2.f7735x.f2353c).f7117g;
                    if (M0.a.f(j3) && M0.a.e(j3)) {
                        break;
                    }
                }
                d3 = d3.q();
            }
            if (d3 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long E(long j3) {
        B();
        return AbstractC0259J.u(this.f8421O, I2.l.f(a0.c.d(j3) - a0.c.d(this.f8424R), a0.c.e(j3) - a0.c.e(this.f8424R)));
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        int i3 = 0;
        if (this.f8471x0) {
            this.f8471x0 = false;
            int metaState = motionEvent.getMetaState();
            this.f8447k.getClass();
            K0.f8184b.setValue(new n0.q(metaState));
        }
        C0673c c0673c = this.f8470x;
        C2.c a3 = c0673c.a(motionEvent, this);
        E.G g3 = this.f8472y;
        if (a3 != null) {
            ArrayList arrayList = (ArrayList) a3.f484e;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    obj = arrayList.get(size);
                    if (((n0.p) obj).f6244e) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            obj = null;
            n0.p pVar = (n0.p) obj;
            if (pVar != null) {
                this.f8433d = pVar.f6243d;
            }
            i3 = g3.e(a3, this, p(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i3 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0673c.f6200c.delete(pointerId);
                c0673c.f6199b.delete(pointerId);
            }
        } else {
            g3.f();
        }
        return i3;
    }

    public final void G(MotionEvent motionEvent, int i3, long j3, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i3 != 9 && i3 != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i4 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i6 = 0; i6 < pointerCount; i6++) {
            pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
        }
        int i7 = 0;
        while (i7 < pointerCount) {
            int i8 = ((i4 < 0 || i7 < i4) ? 0 : 1) + i7;
            motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
            motionEvent.getPointerCoords(i8, pointerCoords);
            long r3 = r(I2.l.f(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = a0.c.d(r3);
            pointerCoords.y = a0.c.e(r3);
            i7++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i3, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C2.c a3 = this.f8470x.a(obtain, this);
        Z1.i.c(a3);
        this.f8472y.e(a3, this, true);
        obtain.recycle();
    }

    public final void H() {
        int[] iArr = this.f8419M;
        getLocationOnScreen(iArr);
        long j3 = this.f8418L;
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        boolean z3 = false;
        int i5 = iArr[0];
        if (i3 != i5 || i4 != iArr[1]) {
            this.f8418L = I2.d.c(i5, iArr[1]);
            if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                getRoot().f7736y.f7813r.e0();
                z3 = true;
            }
        }
        this.f8416J.a(z3);
    }

    @Override // androidx.lifecycle.InterfaceC0220e
    public final void a(InterfaceC0236v interfaceC0236v) {
        setShowLayoutBounds(C0981k0.a());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        V.a aVar;
        if (!g() || (aVar = this.f8410A) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            AutofillValue i4 = C0.e.i(sparseArray.get(keyAt));
            V.d dVar = V.d.f3345a;
            if (dVar.d(i4)) {
                dVar.i(i4).toString();
                if (aVar.f3342b.f3347a.get(Integer.valueOf(keyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (dVar.b(i4)) {
                    throw new L1.i("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (dVar.c(i4)) {
                    throw new L1.i("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (dVar.e(i4)) {
                    throw new L1.i("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i3) {
        return this.p.e(false, i3, this.f8433d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        return this.p.e(true, i3, this.f8433d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        s(true);
        synchronized (S.q.f3235b) {
            C0475A c0475a = ((S.d) S.q.f3242i.get()).f3197h;
            if (c0475a != null) {
                z3 = c0475a.h();
            }
        }
        if (z3) {
            S.q.a();
        }
        this.f8468w = true;
        C0286s c0286s = this.f8449l;
        C0271d c0271d = c0286s.f4290a;
        Canvas canvas2 = c0271d.f4263a;
        c0271d.f4263a = canvas;
        getRoot().j(c0271d, null);
        c0286s.f4290a.f4263a = canvas2;
        if (!this.f8465u.isEmpty()) {
            int size = this.f8465u.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((t0.f0) this.f8465u.get(i3)).f();
            }
        }
        if (F0.f8162w) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f8465u.clear();
        this.f8468w = false;
        ArrayList arrayList = this.f8467v;
        if (arrayList != null) {
            this.f8465u.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0760a c0760a;
        int size;
        C0120t c0120t;
        U.k kVar;
        C0120t c0120t2;
        if (this.f8466u0) {
            E.u uVar = this.f8464t0;
            removeCallbacks(uVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f8466u0 = false;
            } else {
                uVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = AbstractC0180s.f3562a;
            a1.r.b(viewConfiguration);
        } else {
            AbstractC0180s.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i3 >= 26) {
            a1.r.a(viewConfiguration);
        } else {
            AbstractC0180s.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
        if (aVar.f3709e.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        Z.q g3 = Z.c.g(aVar.f3708d);
        if (g3 != null) {
            U.k kVar2 = g3.f3303d;
            if (!kVar2.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            t0.D t3 = AbstractC0898f.t(g3);
            loop0: while (true) {
                if (t3 == null) {
                    kVar = null;
                    break;
                }
                if ((((U.k) t3.f7735x.f2356f).f3306g & 16384) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f3305f & 16384) != 0) {
                            K.d dVar = null;
                            kVar = kVar2;
                            while (kVar != null) {
                                if (kVar instanceof C0760a) {
                                    break loop0;
                                }
                                if ((kVar.f3305f & 16384) != 0 && (kVar instanceof AbstractC0905m)) {
                                    int i4 = 0;
                                    for (U.k kVar3 = ((AbstractC0905m) kVar).f7937r; kVar3 != null; kVar3 = kVar3.f3308i) {
                                        if ((kVar3.f3305f & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                kVar = kVar3;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new K.d(new U.k[16]);
                                                }
                                                if (kVar != null) {
                                                    dVar.b(kVar);
                                                    kVar = null;
                                                }
                                                dVar.b(kVar3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                kVar = AbstractC0898f.f(dVar);
                            }
                        }
                        kVar2 = kVar2.f3307h;
                    }
                }
                t3 = t3.q();
                kVar2 = (t3 == null || (c0120t2 = t3.f7735x) == null) ? null : (t0.o0) c0120t2.f2355e;
            }
            c0760a = (C0760a) kVar;
        } else {
            c0760a = null;
        }
        if (c0760a == null) {
            return false;
        }
        C0760a c0760a2 = c0760a;
        U.k kVar4 = c0760a2.f3303d;
        if (!kVar4.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar5 = kVar4.f3307h;
        t0.D t4 = AbstractC0898f.t(c0760a);
        ArrayList arrayList = null;
        while (t4 != null) {
            if ((((U.k) t4.f7735x.f2356f).f3306g & 16384) != 0) {
                while (kVar5 != null) {
                    if ((kVar5.f3305f & 16384) != 0) {
                        U.k kVar6 = kVar5;
                        K.d dVar2 = null;
                        while (kVar6 != null) {
                            if (kVar6 instanceof C0760a) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(kVar6);
                            } else if ((kVar6.f3305f & 16384) != 0 && (kVar6 instanceof AbstractC0905m)) {
                                int i5 = 0;
                                for (U.k kVar7 = ((AbstractC0905m) kVar6).f7937r; kVar7 != null; kVar7 = kVar7.f3308i) {
                                    if ((kVar7.f3305f & 16384) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar6 = kVar7;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar6 != null) {
                                                dVar2.b(kVar6);
                                                kVar6 = null;
                                            }
                                            dVar2.b(kVar7);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar6 = AbstractC0898f.f(dVar2);
                        }
                    }
                    kVar5 = kVar5.f3307h;
                }
            }
            t4 = t4.q();
            kVar5 = (t4 == null || (c0120t = t4.f7735x) == null) ? null : (t0.o0) c0120t.f2355e;
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i6 = size - 1;
                ((C0760a) arrayList.get(size)).getClass();
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        U.k kVar8 = c0760a2.f3303d;
        K.d dVar3 = null;
        while (kVar8 != null) {
            if (kVar8 instanceof C0760a) {
            } else if ((kVar8.f3305f & 16384) != 0 && (kVar8 instanceof AbstractC0905m)) {
                int i7 = 0;
                for (U.k kVar9 = ((AbstractC0905m) kVar8).f7937r; kVar9 != null; kVar9 = kVar9.f3308i) {
                    if ((kVar9.f3305f & 16384) != 0) {
                        i7++;
                        if (i7 == 1) {
                            kVar8 = kVar9;
                        } else {
                            if (dVar3 == null) {
                                dVar3 = new K.d(new U.k[16]);
                            }
                            if (kVar8 != null) {
                                dVar3.b(kVar8);
                                kVar8 = null;
                            }
                            dVar3.b(kVar9);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            kVar8 = AbstractC0898f.f(dVar3);
        }
        U.k kVar10 = c0760a2.f3303d;
        K.d dVar4 = null;
        while (kVar10 != null) {
            if (kVar10 instanceof C0760a) {
            } else if ((kVar10.f3305f & 16384) != 0 && (kVar10 instanceof AbstractC0905m)) {
                int i8 = 0;
                for (U.k kVar11 = ((AbstractC0905m) kVar10).f7937r; kVar11 != null; kVar11 = kVar11.f3308i) {
                    if ((kVar11.f3305f & 16384) != 0) {
                        i8++;
                        if (i8 == 1) {
                            kVar10 = kVar11;
                        } else {
                            if (dVar4 == null) {
                                dVar4 = new K.d(new U.k[16]);
                            }
                            if (kVar10 != null) {
                                dVar4.b(kVar10);
                                kVar10 = null;
                            }
                            dVar4.b(kVar11);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            kVar10 = AbstractC0898f.f(dVar4);
        }
        if (arrayList == null) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C0984m c0984m = ((C0760a) arrayList.get(i9)).f6753q;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i3;
        int i4;
        C0120t c0120t;
        boolean z3;
        boolean z4 = this.f8466u0;
        E.u uVar = this.f8464t0;
        if (z4) {
            removeCallbacks(uVar);
            uVar.run();
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        C0959F c0959f = this.p;
        AccessibilityManager accessibilityManager = c0959f.f8139g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            C0997t c0997t = c0959f.f8136d;
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                c0997t.s(true);
                t0.r rVar = new t0.r();
                t0.D root = c0997t.getRoot();
                long f3 = I2.l.f(x3, y3);
                C0120t c0120t2 = root.f7735x;
                t0.a0 a0Var = (t0.a0) c0120t2.f2354d;
                C0261L c0261l = t0.a0.f7869H;
                ((t0.a0) c0120t2.f2354d).F0(t0.a0.f7872K, a0Var.y0(f3, true), rVar, true, true);
                U.k kVar = (U.k) M1.l.t0(rVar);
                t0.D t3 = kVar != null ? AbstractC0898f.t(kVar) : null;
                if (t3 != null && (c0120t = t3.f7735x) != null && c0120t.f(8)) {
                    z0.n g3 = AbstractC0381e.g(t3, false);
                    t0.a0 c3 = g3.c();
                    if (!(c3 != null ? c3.I0() : false)) {
                        if (!g3.f8991d.f8982d.containsKey(z0.q.f9022m)) {
                            z3 = true;
                            if (z3) {
                                if (c0997t.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(t3) != null) {
                                    throw new ClassCastException();
                                }
                                i3 = c0959f.w(t3.f7717e);
                                c0997t.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                                i4 = c0959f.f8137e;
                                if (i4 != i3) {
                                    c0959f.f8137e = i3;
                                    C0959F.A(c0959f, i3, 128, null, 12);
                                    C0959F.A(c0959f, i4, 256, null, 12);
                                }
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
                i3 = Integer.MIN_VALUE;
                c0997t.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                i4 = c0959f.f8137e;
                if (i4 != i3) {
                }
            } else if (action == 10) {
                int i5 = c0959f.f8137e;
                if (i5 == Integer.MIN_VALUE) {
                    c0997t.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i5 != Integer.MIN_VALUE) {
                    c0959f.f8137e = Integer.MIN_VALUE;
                    C0959F.A(c0959f, Integer.MIN_VALUE, 128, null, 12);
                    C0959F.A(c0959f, i5, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && p(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f8456o0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f8456o0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f8466u0 = true;
                postDelayed(uVar, 8L);
                return false;
            }
        } else if (!q(motionEvent)) {
            return false;
        }
        return (l(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, new C0125v0(this, 11, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f8447k.getClass();
        K0.f8184b.setValue(new n0.q(metaState));
        return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, Z.f.f3423f) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0120t c0120t;
        if (isFocused()) {
            androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
            if (aVar.f3709e.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            Z.q g3 = Z.c.g(aVar.f3708d);
            if (g3 != null) {
                U.k kVar = g3.f3303d;
                if (!kVar.p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                t0.D t3 = AbstractC0898f.t(g3);
                while (t3 != null) {
                    if ((((U.k) t3.f7735x.f2356f).f3306g & 131072) != 0) {
                        while (kVar != null) {
                            if ((kVar.f3305f & 131072) != 0) {
                                U.k kVar2 = kVar;
                                K.d dVar = null;
                                while (kVar2 != null) {
                                    if ((kVar2.f3305f & 131072) != 0 && (kVar2 instanceof AbstractC0905m)) {
                                        int i3 = 0;
                                        for (U.k kVar3 = ((AbstractC0905m) kVar2).f7937r; kVar3 != null; kVar3 = kVar3.f3308i) {
                                            if ((kVar3.f3305f & 131072) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar2 = kVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar2 != null) {
                                                        dVar.b(kVar2);
                                                        kVar2 = null;
                                                    }
                                                    dVar.b(kVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar2 = AbstractC0898f.f(dVar);
                                }
                            }
                            kVar = kVar.f3307h;
                        }
                    }
                    t3 = t3.q();
                    kVar = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (t0.o0) c0120t.f2355e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            G.f8177a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8466u0) {
            E.u uVar = this.f8464t0;
            removeCallbacks(uVar);
            MotionEvent motionEvent2 = this.f8456o0;
            Z1.i.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f8466u0 = false;
            } else {
                uVar.run();
            }
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !q(motionEvent)) {
            return false;
        }
        int l3 = l(motionEvent);
        if ((l3 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (l3 & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i3) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i3));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = k(this, i3);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        if (view != null) {
            a0.d d3 = Z.c.d(view);
            Z.a J3 = Z.c.J(i3);
            if (Z1.i.a(((androidx.compose.ui.focus.a) getFocusOwner()).c(J3 != null ? J3.f3414a : 6, d3, C0984m.f8364g), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i3);
    }

    public final V getAndroidViewsHandler$ui_release() {
        if (this.f8412F == null) {
            V v3 = new V(getContext());
            this.f8412F = v3;
            addView(v3, -1);
            requestLayout();
        }
        V v4 = this.f8412F;
        Z1.i.c(v4);
        return v4;
    }

    public V.b getAutofill() {
        return this.f8410A;
    }

    public V.f getAutofillTree() {
        return this.f8463t;
    }

    public final Y1.c getConfigurationChangeObserver() {
        return this.f8474z;
    }

    public final W.c getContentCaptureManager$ui_release() {
        return this.f8458q;
    }

    public P1.i getCoroutineContext() {
        return this.f8443i;
    }

    public M0.b getDensity() {
        return (M0.b) this.f8439g.getValue();
    }

    public X.a getDragAndDropManager() {
        return this.f8445j;
    }

    public Z.g getFocusOwner() {
        return this.f8441h;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        L1.z zVar;
        a0.d w3 = w();
        if (w3 != null) {
            rect.left = Math.round(w3.f3491a);
            rect.top = Math.round(w3.f3492b);
            rect.right = Math.round(w3.f3493c);
            rect.bottom = Math.round(w3.f3494d);
            zVar = L1.z.f2729a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public F0.e getFontFamilyResolver() {
        return (F0.e) this.f8442h0.getValue();
    }

    public F0.d getFontLoader() {
        return this.f8440g0;
    }

    public InterfaceC0251B getGraphicsContext() {
        return this.f8461s;
    }

    public InterfaceC0509a getHapticFeedBack() {
        return this.f8448k0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f8416J.f7838b.n();
    }

    public InterfaceC0525b getInputModeManager() {
        return this.f8450l0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f8422P;
    }

    @Override // android.view.View, android.view.ViewParent
    public M0.j getLayoutDirection() {
        return (M0.j) this.f8446j0.getValue();
    }

    public long getMeasureIteration() {
        t0.S s3 = this.f8416J;
        if (s3.f7839c) {
            return s3.f7843g;
        }
        AbstractC0381e.M("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C0887d getModifierLocalManager() {
        return this.f8452m0;
    }

    public r0.G getPlacementScope() {
        int i3 = r0.J.f7123b;
        return new r0.x(1, this);
    }

    public n0.k getPointerIconService() {
        return this.f8475z0;
    }

    public t0.D getRoot() {
        return this.f8451m;
    }

    public t0.m0 getRootForTest() {
        return this.f8453n;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        y0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f8473y0) == null) {
            return false;
        }
        return ((Boolean) lVar.f8821a.getValue()).booleanValue();
    }

    public z0.o getSemanticsOwner() {
        return this.f8455o;
    }

    public t0.F getSharedDrawScope() {
        return this.f8437f;
    }

    public boolean getShowLayoutBounds() {
        return this.f8411E;
    }

    public t0.i0 getSnapshotObserver() {
        return this.D;
    }

    public A0 getSoftwareKeyboardController() {
        return this.f8438f0;
    }

    public G0.e getTextInputService() {
        return this.f8434d0;
    }

    public B0 getTextToolbar() {
        return this.f8454n0;
    }

    public D0 getViewConfiguration() {
        return this.f8417K;
    }

    public final C0982l getViewTreeOwners() {
        return (C0982l) this.f8427U.getValue();
    }

    public J0 getWindowInfo() {
        return this.f8447k;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:12:0x006b, B:14:0x0075, B:19:0x0085, B:22:0x00ae, B:23:0x008c, B:29:0x0098, B:32:0x00a0, B:34:0x00b1, B:42:0x00c4, B:44:0x00ca, B:46:0x00de, B:47:0x00e1, B:49:0x00e5, B:51:0x00eb, B:53:0x00ef, B:54:0x00f5, B:57:0x00fd, B:60:0x0105, B:61:0x0111, B:63:0x0117, B:65:0x011d, B:67:0x0123, B:68:0x0129, B:70:0x012d, B:71:0x0131, B:76:0x0144, B:78:0x0148, B:79:0x014f, B:85:0x015f, B:86:0x0169, B:92:0x0176), top: B:4:0x004f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(MotionEvent motionEvent) {
        int i3;
        boolean z3;
        int actionMasked;
        float[] fArr = this.f8420N;
        removeCallbacks(this.f8462s0);
        try {
            this.f8422P = AnimationUtils.currentAnimationTimeMillis();
            this.f8469w0.a(this, fArr);
            L.o(fArr, this.f8421O);
            long u3 = AbstractC0259J.u(fArr, I2.l.f(motionEvent.getX(), motionEvent.getY()));
            this.f8424R = I2.l.f(motionEvent.getRawX() - a0.c.d(u3), motionEvent.getRawY() - a0.c.e(u3));
            boolean z4 = true;
            this.f8423Q = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f8456o0;
                boolean z5 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                E.G g3 = this.f8472y;
                if (motionEvent2 != null) {
                    if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                        z3 = false;
                        if (z3) {
                            if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                                if (motionEvent2.getActionMasked() != 10 && z5) {
                                    G(motionEvent2, 10, motionEvent2.getEventTime(), true);
                                }
                            }
                            g3.f();
                        }
                    }
                    z3 = true;
                    if (z3) {
                    }
                }
                boolean z6 = motionEvent.getToolType(0) == 3;
                if (z5 || !z6 || actionMasked2 == 3 || actionMasked2 == 9 || !p(motionEvent)) {
                    i3 = 9;
                } else {
                    i3 = 9;
                    G(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f8456o0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f8456o0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C0673c c0673c = this.f8470x;
                    if (action == i3 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c0673c.f6200c.delete(pointerId);
                            c0673c.f6199b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f8456o0;
                        float x3 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f8456o0;
                        boolean z7 = (x3 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f8456o0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z4 = false;
                        }
                        if (z7 || z4) {
                            if (pointerId >= 0) {
                                c0673c.f6200c.delete(pointerId);
                                c0673c.f6199b.delete(pointerId);
                            }
                            ((n0.f) ((C0014b) g3.f623c).f537c).f6213a.h();
                        }
                    }
                }
                this.f8456o0 = MotionEvent.obtainNoHistory(motionEvent);
                return F(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f8423Q = false;
        }
    }

    public final void n(t0.D d3) {
        int i3 = 0;
        this.f8416J.p(d3, false);
        K.d t3 = d3.t();
        int i4 = t3.f2642f;
        if (i4 > 0) {
            Object[] objArr = t3.f2640d;
            do {
                n((t0.D) objArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0238x e3;
        InterfaceC0236v interfaceC0236v;
        V.a aVar;
        super.onAttachedToWindow();
        this.f8447k.f8185a.setValue(Boolean.valueOf(hasWindowFocus()));
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().f7925a.c();
        if (g() && (aVar = this.f8410A) != null) {
            V.e.f3346a.a(aVar);
        }
        InterfaceC0236v f3 = androidx.lifecycle.P.f(this);
        u1.f k3 = AbstractC0382a.k(this);
        C0982l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f3 != null && k3 != null && (f3 != (interfaceC0236v = viewTreeOwners.f8360a) || k3 != interfaceC0236v))) {
            if (f3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (k3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (e3 = viewTreeOwners.f8360a.e()) != null) {
                e3.f(this);
            }
            f3.e().a(this);
            C0982l c0982l = new C0982l(f3, k3);
            set_viewTreeOwners(c0982l);
            Y1.c cVar = this.f8428V;
            if (cVar != null) {
                cVar.j(c0982l);
            }
            this.f8428V = null;
        }
        int i3 = isInTouchMode() ? 1 : 2;
        k0.c cVar2 = this.f8450l0;
        cVar2.getClass();
        cVar2.f5308a.setValue(new C0524a(i3));
        C0982l viewTreeOwners2 = getViewTreeOwners();
        C0238x e4 = viewTreeOwners2 != null ? viewTreeOwners2.f8360a.e() : null;
        if (e4 == null) {
            AbstractC0381e.O("No lifecycle owner exists");
            throw null;
        }
        e4.a(this);
        e4.a(this.f8458q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f8429W);
        getViewTreeObserver().addOnScrollChangedListener(this.f8430a0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f8431b0);
        if (Build.VERSION.SDK_INT >= 31) {
            J.f8182a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f8436e0.get() != null) {
            throw new ClassCastException();
        }
        this.f8432c0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(I2.d.a(getContext()));
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f8444i0) {
            this.f8444i0 = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC0157a.r(getContext()));
        }
        this.f8474z.j(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f8436e0.get() != null) {
            throw new ClassCastException();
        }
        this.f8432c0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        W.c cVar = this.f8458q;
        cVar.getClass();
        W.a.f3367a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        V.a aVar;
        super.onDetachedFromWindow();
        t0.i0 snapshotObserver = getSnapshotObserver();
        D1.h hVar = snapshotObserver.f7925a.f3268g;
        if (hVar != null) {
            hVar.a();
        }
        S.w wVar = snapshotObserver.f7925a;
        synchronized (wVar.f3267f) {
            K.d dVar = wVar.f3267f;
            int i3 = dVar.f2642f;
            if (i3 > 0) {
                Object[] objArr = dVar.f2640d;
                int i4 = 0;
                do {
                    S.v vVar = (S.v) objArr[i4];
                    ((C0506x) vVar.f3254e.f83b).a();
                    vVar.f3255f.a();
                    ((C0506x) vVar.f3260k.f83b).a();
                    vVar.f3261l.clear();
                    i4++;
                } while (i4 < i3);
            }
        }
        C0982l viewTreeOwners = getViewTreeOwners();
        C0238x e3 = viewTreeOwners != null ? viewTreeOwners.f8360a.e() : null;
        if (e3 == null) {
            AbstractC0381e.O("No lifecycle owner exists");
            throw null;
        }
        e3.f(this.f8458q);
        e3.f(this);
        if (g() && (aVar = this.f8410A) != null) {
            V.e.f3346a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f8429W);
        getViewTreeObserver().removeOnScrollChangedListener(this.f8430a0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f8431b0);
        if (Build.VERSION.SDK_INT >= 31) {
            J.f8182a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (z3 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
        Z.r rVar = aVar.f3710f;
        boolean z4 = rVar.f3453a;
        Z.q qVar = aVar.f3708d;
        if (z4) {
            Z.c.e(qVar, true, true);
            return;
        }
        try {
            rVar.f3453a = true;
            Z.c.e(qVar, true, true);
        } finally {
            Z.r.b(rVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        this.f8416J.j(this.v0);
        this.f8414H = null;
        H();
        if (this.f8412F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i5 - i3, i6 - i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        t0.S s3 = this.f8416J;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long j3 = j(i3);
            int i5 = (int) (j3 >>> 32);
            int i6 = (int) (j3 & 4294967295L);
            long j4 = j(i4);
            int i7 = (int) (4294967295L & j4);
            int min = Math.min((int) (j4 >>> 32), 262142);
            int i8 = Integer.MAX_VALUE;
            int min2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
            int h3 = I2.l.h(min2 == Integer.MAX_VALUE ? min : min2);
            if (i6 != Integer.MAX_VALUE) {
                i8 = Math.min(h3, i6);
            }
            long a3 = I2.l.a(Math.min(h3, i5), i8, min, min2);
            M0.a aVar = this.f8414H;
            if (aVar == null) {
                this.f8414H = new M0.a(a3);
                this.f8415I = false;
            } else if (!M0.a.b(aVar.f2760a, a3)) {
                this.f8415I = true;
            }
            s3.q(a3);
            s3.l();
            setMeasuredDimension(getRoot().f7736y.f7813r.f7114d, getRoot().f7736y.f7813r.f7115e);
            if (this.f8412F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f7736y.f7813r.f7114d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f7736y.f7813r.f7115e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        V.a aVar;
        if (!g() || viewStructure == null || (aVar = this.f8410A) == null) {
            return;
        }
        V.c cVar = V.c.f3344a;
        V.f fVar = aVar.f3342b;
        int a3 = cVar.a(viewStructure, fVar.f3347a.size());
        for (Map.Entry entry : fVar.f3347a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b2 = cVar.b(viewStructure, a3);
            if (b2 != null) {
                V.d dVar = V.d.f3345a;
                AutofillId a4 = dVar.a(viewStructure);
                Z1.i.c(a4);
                dVar.g(b2, a4, intValue);
                cVar.d(b2, intValue, aVar.f3341a.getContext().getPackageName(), null, null);
                dVar.h(b2, 1);
                throw null;
            }
            a3++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        if (this.f8435e) {
            M0.j jVar = M0.j.f2775d;
            M0.j jVar2 = i3 != 0 ? i3 != 1 ? null : M0.j.f2776e : jVar;
            if (jVar2 != null) {
                jVar = jVar2;
            }
            setLayoutDirection(jVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        y0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f8473y0) == null) {
            return;
        }
        lVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        W.c cVar = this.f8458q;
        cVar.getClass();
        W.a.f3367a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean a3;
        this.f8447k.f8185a.setValue(Boolean.valueOf(z3));
        this.f8471x0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || getShowLayoutBounds() == (a3 = C0981k0.a())) {
            return;
        }
        setShowLayoutBounds(a3);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        return 0.0f <= x3 && x3 <= ((float) getWidth()) && 0.0f <= y3 && y3 <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f8456o0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long r(long j3) {
        B();
        long u3 = AbstractC0259J.u(this.f8420N, j3);
        return I2.l.f(a0.c.d(this.f8424R) + a0.c.d(u3), a0.c.e(this.f8424R) + a0.c.e(u3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.a) getFocusOwner()).f3708d.w0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i3, rect);
        }
        if (ordinal != 3) {
            throw new L1.f();
        }
        Z.a J3 = Z.c.J(i3);
        int i4 = J3 != null ? J3.f3414a : 7;
        Boolean c3 = ((androidx.compose.ui.focus.a) getFocusOwner()).c(i4, rect != null ? new a0.d(rect.left, rect.top, rect.right, rect.bottom) : null, new r(i4));
        if (c3 != null) {
            return c3.booleanValue();
        }
        return false;
    }

    public final void s(boolean z3) {
        C0995s c0995s;
        t0.S s3 = this.f8416J;
        if (s3.f7838b.n() || ((K.d) s3.f7841e.f484e).m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    c0995s = this.v0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c0995s = null;
            }
            if (s3.j(c0995s)) {
                requestLayout();
            }
            s3.a(false);
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.p.f8140h = j3;
    }

    public final void setConfigurationChangeObserver(Y1.c cVar) {
        this.f8474z = cVar;
    }

    public final void setContentCaptureManager$ui_release(W.c cVar) {
        this.f8458q = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(P1.i iVar) {
        int i3;
        int i4;
        this.f8443i = iVar;
        U.k kVar = (U.k) getRoot().f7735x.f2356f;
        if (kVar instanceof n0.v) {
            ((n0.v) kVar).w0();
        }
        U.k kVar2 = kVar.f3303d;
        if (!kVar2.p) {
            AbstractC0381e.N("visitSubtree called on an unattached node");
            throw null;
        }
        U.k kVar3 = kVar2.f3308i;
        t0.D t3 = AbstractC0898f.t(kVar);
        int[] iArr = new int[16];
        K.d[] dVarArr = new K.d[16];
        int i5 = 0;
        while (t3 != null) {
            if (kVar3 == null) {
                kVar3 = (U.k) t3.f7735x.f2356f;
            }
            if ((kVar3.f3306g & 16) != 0) {
                while (kVar3 != null) {
                    if ((kVar3.f3305f & 16) != 0) {
                        AbstractC0905m abstractC0905m = kVar3;
                        ?? r9 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof t0.l0) {
                                t0.l0 l0Var = (t0.l0) abstractC0905m;
                                if (l0Var instanceof n0.v) {
                                    ((n0.v) l0Var).w0();
                                }
                            } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar4 = abstractC0905m.f7937r;
                                int i6 = 0;
                                abstractC0905m = abstractC0905m;
                                r9 = r9;
                                while (kVar4 != null) {
                                    if ((kVar4.f3305f & 16) != 0) {
                                        i6++;
                                        r9 = r9;
                                        if (i6 == 1) {
                                            abstractC0905m = kVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r9.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r9.b(kVar4);
                                        }
                                    }
                                    kVar4 = kVar4.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r9 = r9;
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r9);
                        }
                    }
                    kVar3 = kVar3.f3308i;
                }
            }
            K.d t4 = t3.t();
            if (!t4.l()) {
                if (i5 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    Z1.i.e(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Z1.i.e(copyOf, "copyOf(this, newSize)");
                    dVarArr = (K.d[]) copyOf;
                }
                iArr[i5] = t4.f2642f - 1;
                dVarArr[i5] = t4;
                i5++;
            }
            if (i5 <= 0 || (i4 = iArr[i5 - 1]) < 0) {
                t3 = null;
            } else {
                if (i5 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                K.d dVar = dVarArr[i3];
                Z1.i.c(dVar);
                if (i4 > 0) {
                    iArr[i3] = iArr[i3] - 1;
                } else if (i4 == 0) {
                    dVarArr[i3] = null;
                    i5--;
                }
                t3 = (t0.D) dVar.f2640d[i4];
            }
            kVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f8422P = j3;
    }

    public final void setOnViewTreeOwnersAvailable(Y1.c cVar) {
        C0982l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.j(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f8428V = cVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.f8411E = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(t0.D d3, long j3) {
        t0.S s3 = this.f8416J;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            s3.k(d3, j3);
            if (!s3.f7838b.n()) {
                s3.a(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void u(t0.f0 f0Var, boolean z3) {
        ArrayList arrayList = this.f8465u;
        if (!z3) {
            if (this.f8468w) {
                return;
            }
            arrayList.remove(f0Var);
            ArrayList arrayList2 = this.f8467v;
            if (arrayList2 != null) {
                arrayList2.remove(f0Var);
                return;
            }
            return;
        }
        if (!this.f8468w) {
            arrayList.add(f0Var);
            return;
        }
        ArrayList arrayList3 = this.f8467v;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f8467v = arrayList3;
        }
        arrayList3.add(f0Var);
    }

    public final void v() {
        if (this.B) {
            S.w wVar = getSnapshotObserver().f7925a;
            synchronized (wVar.f3267f) {
                try {
                    K.d dVar = wVar.f3267f;
                    int i3 = dVar.f2642f;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        S.v vVar = (S.v) dVar.f2640d[i5];
                        vVar.e();
                        if (!(vVar.f3255f.f5230e != 0)) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr = dVar.f2640d;
                            objArr[i5 - i4] = objArr[i5];
                        }
                    }
                    int i6 = i3 - i4;
                    M1.k.c0(dVar.f2640d, i6, i3);
                    dVar.f2642f = i6;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.B = false;
        }
        V v3 = this.f8412F;
        if (v3 != null) {
            i(v3);
        }
        while (this.f8460r0.m()) {
            int i7 = this.f8460r0.f2642f;
            for (int i8 = 0; i8 < i7; i8++) {
                Object[] objArr2 = this.f8460r0.f2640d;
                Y1.a aVar = (Y1.a) objArr2[i8];
                objArr2[i8] = null;
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.f8460r0.p(0, i7);
        }
    }

    public final a0.d w() {
        if (isFocused()) {
            Z.q g3 = Z.c.g(((androidx.compose.ui.focus.a) getFocusOwner()).f3708d);
            if (g3 != null) {
                return Z.c.j(g3);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return Z.c.d(findFocus);
        }
        return null;
    }

    public final void x(t0.D d3) {
        C0959F c0959f = this.p;
        c0959f.f8156y = true;
        if (c0959f.q()) {
            c0959f.s(d3);
        }
        W.c cVar = this.f8458q;
        cVar.f3380k = true;
        if (cVar.f() && cVar.f3381l.add(d3)) {
            cVar.f3382m.g(L1.z.f2729a);
        }
    }

    public final void y(t0.D d3, boolean z3, boolean z4, boolean z5) {
        t0.D q2;
        t0.D q3;
        t0.I i3;
        t0.E e3;
        t0.S s3 = this.f8416J;
        if (!z3) {
            if (s3.p(d3, z4) && z5) {
                D(d3);
                return;
            }
            return;
        }
        s3.getClass();
        if (d3.f7718f == null) {
            AbstractC0381e.N("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        t0.L l3 = d3.f7736y;
        int a3 = AbstractC0600j.a(l3.f7799c);
        if (a3 != 0) {
            if (a3 == 1) {
                return;
            }
            if (a3 != 2 && a3 != 3) {
                if (a3 != 4) {
                    throw new L1.f();
                }
                if (!l3.f7803g || z4) {
                    l3.f7803g = true;
                    l3.f7800d = true;
                    if (d3.f7713F) {
                        return;
                    }
                    boolean a4 = Z1.i.a(d3.D(), Boolean.TRUE);
                    C2.c cVar = s3.f7838b;
                    if ((a4 || (l3.f7803g && (d3.p() == 1 || !((i3 = l3.f7814s) == null || (e3 = i3.f7765t) == null || !e3.e())))) && ((q2 = d3.q()) == null || !q2.f7736y.f7803g)) {
                        cVar.j(d3, true);
                    } else if ((d3.C() || t0.S.h(d3)) && ((q3 = d3.q()) == null || !q3.f7736y.f7800d)) {
                        cVar.j(d3, false);
                    }
                    if (s3.f7840d || !z5) {
                        return;
                    }
                    D(d3);
                    return;
                }
                return;
            }
        }
        s3.f7844h.b(new t0.Q(d3, true, z4));
    }

    public final void z(t0.D d3, boolean z3, boolean z4) {
        t0.S s3 = this.f8416J;
        if (!z3) {
            s3.getClass();
            int a3 = AbstractC0600j.a(d3.f7736y.f7799c);
            if (a3 == 0 || a3 == 1 || a3 == 2 || a3 == 3) {
                return;
            }
            if (a3 != 4) {
                throw new L1.f();
            }
            t0.L l3 = d3.f7736y;
            if (!z4 && d3.C() == l3.f7813r.f7790v && (l3.f7800d || l3.f7801e)) {
                return;
            }
            l3.f7801e = true;
            l3.f7802f = true;
            if (!d3.f7713F && l3.f7813r.f7790v) {
                t0.D q2 = d3.q();
                if ((q2 == null || !q2.f7736y.f7801e) && (q2 == null || !q2.f7736y.f7800d)) {
                    s3.f7838b.j(d3, false);
                }
                if (s3.f7840d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        s3.getClass();
        int a4 = AbstractC0600j.a(d3.f7736y.f7799c);
        if (a4 != 0) {
            if (a4 == 1) {
                return;
            }
            if (a4 != 2) {
                if (a4 == 3) {
                    return;
                }
                if (a4 != 4) {
                    throw new L1.f();
                }
            }
        }
        t0.L l4 = d3.f7736y;
        if ((l4.f7803g || l4.f7804h) && !z4) {
            return;
        }
        l4.f7804h = true;
        l4.f7805i = true;
        l4.f7801e = true;
        l4.f7802f = true;
        if (d3.f7713F) {
            return;
        }
        t0.D q3 = d3.q();
        boolean a5 = Z1.i.a(d3.D(), Boolean.TRUE);
        C2.c cVar = s3.f7838b;
        if (a5 && ((q3 == null || !q3.f7736y.f7803g) && (q3 == null || !q3.f7736y.f7804h))) {
            cVar.j(d3, true);
        } else if (d3.C() && ((q3 == null || !q3.f7736y.f7801e) && (q3 == null || !q3.f7736y.f7800d))) {
            cVar.j(d3, false);
        }
        if (s3.f7840d) {
            return;
        }
        D(null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        Z1.i.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i3, layoutParams, true);
    }

    public C0972g getAccessibilityManager() {
        return this.f8459r;
    }

    public C0974h getClipboardManager() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i4) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i3;
        generateDefaultLayoutParams.height = i4;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i3, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @L1.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
