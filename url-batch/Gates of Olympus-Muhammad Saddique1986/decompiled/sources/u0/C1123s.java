package u0;

import D0.AbstractC0070h;
import I.C0143d;
import I.C0156j0;
import I.C0174t;
import S.C0220d;
import a0.C0238c;
import a0.C0239d;
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
import androidx.lifecycle.C0294x;
import androidx.lifecycle.InterfaceC0276e;
import androidx.lifecycle.InterfaceC0292v;
import b0.C0334c;
import b0.C0337f;
import b0.C0349s;
import c1.AbstractC0394s;
import c1.AbstractC0395t;
import c1.AbstractC0396u;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import j.C0519A;
import j0.C0554b;
import j0.InterfaceC0553a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k0.C0562a;
import k0.C0564c;
import k0.InterfaceC0563b;
import m.AbstractC0625j;
import n0.C0702C;
import n0.C0707e;
import n0.C0710h;
import n0.InterfaceC0718p;
import p0.C0800a;
import q2.AbstractC0837y;
import r0.AbstractC0892N;
import r0.AbstractC0895Q;
import r0.C0882D;
import r0.C0896S;
import r0.C0929z;
import s0.C0958d;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.C1006t;
import z.C1241e;
import z.C1256t;
import z.InputConnectionC1234B;

/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123s extends ViewGroup implements t0.h0, t0.n0, InterfaceC0276e {

    /* renamed from: B0, reason: collision with root package name */
    public static Class f9450B0;

    /* renamed from: C0, reason: collision with root package name */
    public static Method f9451C0;

    /* renamed from: A, reason: collision with root package name */
    public final V.a f9452A;

    /* renamed from: A0, reason: collision with root package name */
    public final C1118p f9453A0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9454B;
    public final C1102h C;
    public final t0.j0 D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9455E;

    /* renamed from: F, reason: collision with root package name */
    public C1089a0 f9456F;

    /* renamed from: G, reason: collision with root package name */
    public C1113m0 f9457G;

    /* renamed from: H, reason: collision with root package name */
    public O0.a f9458H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9459I;

    /* renamed from: J, reason: collision with root package name */
    public final t0.T f9460J;

    /* renamed from: K, reason: collision with root package name */
    public final Y f9461K;

    /* renamed from: L, reason: collision with root package name */
    public long f9462L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f9463M;

    /* renamed from: N, reason: collision with root package name */
    public final float[] f9464N;

    /* renamed from: O, reason: collision with root package name */
    public final float[] f9465O;

    /* renamed from: P, reason: collision with root package name */
    public final float[] f9466P;

    /* renamed from: Q, reason: collision with root package name */
    public long f9467Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f9468R;

    /* renamed from: S, reason: collision with root package name */
    public long f9469S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f9470T;

    /* renamed from: U, reason: collision with root package name */
    public final C0156j0 f9471U;

    /* renamed from: V, reason: collision with root package name */
    public final I.F f9472V;

    /* renamed from: W, reason: collision with root package name */
    public InterfaceC0424c f9473W;

    /* renamed from: a0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1104i f9474a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC1106j f9475b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC1108k f9476c0;

    /* renamed from: d, reason: collision with root package name */
    public long f9477d;

    /* renamed from: d0, reason: collision with root package name */
    public final I0.C f9478d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9479e;

    /* renamed from: e0, reason: collision with root package name */
    public final I0.A f9480e0;

    /* renamed from: f, reason: collision with root package name */
    public final t0.G f9481f;

    /* renamed from: f0, reason: collision with root package name */
    public final AtomicReference f9482f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0156j0 f9483g;

    /* renamed from: g0, reason: collision with root package name */
    public final C1103h0 f9484g0;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f9485h;

    /* renamed from: h0, reason: collision with root package name */
    public final C1121q0 f9486h0;

    /* renamed from: i, reason: collision with root package name */
    public V1.i f9487i;

    /* renamed from: i0, reason: collision with root package name */
    public final C0156j0 f9488i0;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnDragListenerC1111l0 f9489j;

    /* renamed from: j0, reason: collision with root package name */
    public int f9490j0;

    /* renamed from: k, reason: collision with root package name */
    public final V0 f9491k;

    /* renamed from: k0, reason: collision with root package name */
    public final C0156j0 f9492k0;

    /* renamed from: l, reason: collision with root package name */
    public final C0349s f9493l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0554b f9494l0;

    /* renamed from: m, reason: collision with root package name */
    public final t0.E f9495m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0564c f9496m0;

    /* renamed from: n, reason: collision with root package name */
    public final C1123s f9497n;

    /* renamed from: n0, reason: collision with root package name */
    public final C0958d f9498n0;

    /* renamed from: o, reason: collision with root package name */
    public final A0.q f9499o;

    /* renamed from: o0, reason: collision with root package name */
    public final T f9500o0;

    /* renamed from: p, reason: collision with root package name */
    public final E f9501p;

    /* renamed from: p0, reason: collision with root package name */
    public MotionEvent f9502p0;

    /* renamed from: q, reason: collision with root package name */
    public W.c f9503q;
    public long q0;

    /* renamed from: r, reason: collision with root package name */
    public final C1100g f9504r;

    /* renamed from: r0, reason: collision with root package name */
    public final C1256t f9505r0;

    /* renamed from: s, reason: collision with root package name */
    public final C0337f f9506s;

    /* renamed from: s0, reason: collision with root package name */
    public final K.d f9507s0;

    /* renamed from: t, reason: collision with root package name */
    public final V.f f9508t;

    /* renamed from: t0, reason: collision with root package name */
    public final J2.d f9509t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f9510u;

    /* renamed from: u0, reason: collision with root package name */
    public final E.t f9511u0;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f9512v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9513w;

    /* renamed from: w0, reason: collision with root package name */
    public final C1120q f9514w0;

    /* renamed from: x, reason: collision with root package name */
    public final C0707e f9515x;

    /* renamed from: x0, reason: collision with root package name */
    public final InterfaceC1091b0 f9516x0;

    /* renamed from: y, reason: collision with root package name */
    public final E.F f9517y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f9518y0;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0424c f9519z;

    /* renamed from: z0, reason: collision with root package name */
    public final z0.j f9520z0;

    /* JADX WARN: Type inference failed for: r3v13, types: [u0.i] */
    /* JADX WARN: Type inference failed for: r3v14, types: [u0.j] */
    /* JADX WARN: Type inference failed for: r3v15, types: [u0.k] */
    public C1123s(Context context, V1.i iVar) {
        super(context);
        this.f9477d = 9205357640488583168L;
        int i3 = 1;
        this.f9479e = true;
        this.f9481f = new t0.G();
        O0.d b3 = l0.c.b(context);
        I.W w2 = I.W.f2781g;
        this.f9483g = C0143d.K(b3, w2);
        A0.d dVar = new A0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.f9485h = new androidx.compose.ui.focus.b(new q2.a0(1, this, C1123s.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 1), new E2.d(2, this, C1123s.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 1), new q2.a0(1, this, C1123s.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 2), new Z.e(0, this, C1123s.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new Z.e(0, this, C1123s.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new G.o(0, 1, C1123s.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        ViewOnDragListenerC1111l0 viewOnDragListenerC1111l0 = new ViewOnDragListenerC1111l0();
        this.f9487i = iVar;
        this.f9489j = viewOnDragListenerC1111l0;
        this.f9491k = new V0();
        U.q a3 = androidx.compose.ui.input.key.a.a(new C1116o(this, 0));
        U.q a4 = androidx.compose.ui.input.rotary.a.a();
        this.f9493l = new C0349s();
        t0.E e3 = new t0.E(3, 0, false);
        e3.Y(C0896S.f8136b);
        e3.W(getDensity());
        e3.Z(emptySemanticsElement.i(a4).i(a3).i(((androidx.compose.ui.focus.b) getFocusOwner()).f4907i).i(viewOnDragListenerC1111l0.f9397c));
        this.f9495m = e3;
        this.f9497n = this;
        this.f9499o = new A0.q(getRoot(), dVar);
        E e4 = new E(this);
        this.f9501p = e4;
        this.f9503q = new W.c(this, new Z.e(0, this, L.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        C1100g c1100g = new C1100g();
        Object systemService = context.getSystemService("accessibility");
        f2.j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f9504r = c1100g;
        this.f9506s = new C0337f(this);
        this.f9508t = new V.f();
        this.f9510u = new ArrayList();
        this.f9515x = new C0707e();
        t0.E root = getRoot();
        E.F f3 = new E.F();
        f3.f923b = root;
        f3.f924c = new G1.m((C1006t) root.f8561y.f2912c);
        f3.f925d = new m.y0(3);
        f3.f926e = new t0.r();
        this.f9517y = f3;
        this.f9519z = C1112m.f9399f;
        this.f9452A = h() ? new V.a(this, getAutofillTree()) : null;
        this.C = new C1102h(context);
        this.D = new t0.j0(new C1116o(this, i3));
        this.f9460J = new t0.T(getRoot());
        this.f9461K = new Y(ViewConfiguration.get(context));
        this.f9462L = l0.c.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f9463M = new int[]{0, 0};
        float[] a5 = b0.G.a();
        this.f9464N = a5;
        this.f9465O = b0.G.a();
        this.f9466P = b0.G.a();
        this.f9467Q = -1L;
        this.f9469S = 9187343241974906880L;
        this.f9470T = true;
        I.W w3 = I.W.f2783i;
        this.f9471U = C0143d.K(null, w3);
        this.f9472V = C0143d.D(new C1120q(this, i3));
        this.f9474a0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C1123s.this.I();
            }
        };
        this.f9475b0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: u0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C1123s.this.I();
            }
        };
        this.f9476c0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: u0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                C0564c c0564c = C1123s.this.f9496m0;
                int i4 = z3 ? 1 : 2;
                c0564c.getClass();
                c0564c.f6412a.setValue(new C0562a(i4));
            }
        };
        I0.C c2 = new I0.C(getView(), this);
        this.f9478d0 = c2;
        this.f9480e0 = new I0.A(c2);
        this.f9482f0 = new AtomicReference(null);
        this.f9484g0 = new C1103h0(getTextInputService());
        this.f9486h0 = new C1121q0();
        this.f9488i0 = C0143d.K(O2.d.I(context), w2);
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = Build.VERSION.SDK_INT;
        this.f9490j0 = i4 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        O0.k kVar = O0.k.f3741d;
        O0.k kVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : O0.k.f3742e : kVar;
        this.f9492k0 = C0143d.K(kVar2 != null ? kVar2 : kVar, w3);
        this.f9494l0 = new C0554b(this);
        this.f9496m0 = new C0564c(isInTouchMode() ? 1 : 2);
        this.f9498n0 = new C0958d(this);
        this.f9500o0 = new T(this);
        this.f9505r0 = new C1256t(19);
        this.f9507s0 = new K.d(new InterfaceC0422a[16]);
        this.f9509t0 = new J2.d(i3, this);
        this.f9511u0 = new E.t(9, this);
        this.f9514w0 = new C1120q(this, 0);
        this.f9516x0 = i4 < 29 ? new W0.e(a5) : new C1093c0();
        addOnAttachStateChangeListener(this.f9503q);
        setWillNotDraw(false);
        setFocusable(true);
        if (i4 >= 26) {
            K.f9204a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i5 = AbstractC0394s.f5610a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(e4.f5596b);
        setOnDragListener(viewOnDragListenerC1111l0);
        getRoot().e(this);
        if (i4 >= 29) {
            G.f9189a.a(this);
        }
        this.f9520z0 = i4 >= 31 ? new z0.j() : null;
        this.f9453A0 = new C1118p(this);
    }

    public static final boolean g(C1123s c1123s, Z.b bVar, C0239d c0239d) {
        Integer J3;
        if (c1123s.isFocused() || c1123s.hasFocus()) {
            return true;
        }
        return super.requestFocus((bVar == null || (J3 = Z.d.J(bVar.f4666a)) == null) ? 130 : J3.intValue(), c0239d != null ? b0.M.B(c0239d) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1110l get_viewTreeOwners() {
        return (C1110l) this.f9471U.getValue();
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof C1123s) {
                ((C1123s) childAt).v();
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
            if (f2.j.a(declaredMethod.invoke(view, null), Integer.valueOf(i3))) {
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

    public static void m(t0.E e3) {
        e3.z();
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                m((t0.E) objArr[i4]);
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
                                    if (!Float.isInfinite(y4) && !Float.isNaN(y4) && (Build.VERSION.SDK_INT < 29 || C1130v0.f9535a.a(motionEvent, i3))) {
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

    private void setDensity(O0.b bVar) {
        this.f9483g.setValue(bVar);
    }

    private void setFontFamilyResolver(H0.d dVar) {
        this.f9488i0.setValue(dVar);
    }

    private void setLayoutDirection(O0.k kVar) {
        this.f9492k0.setValue(kVar);
    }

    private final void set_viewTreeOwners(C1110l c1110l) {
        this.f9471U.setValue(c1110l);
    }

    public final void A() {
        E e3 = this.f9501p;
        e3.f9172y = true;
        if (e3.q() && !e3.f9147J) {
            e3.f9147J = true;
            e3.f9159l.post(e3.f9148K);
        }
        W.c cVar = this.f9503q;
        cVar.f4574k = true;
        if (!cVar.g() || cVar.f4582s) {
            return;
        }
        cVar.f4582s = true;
        cVar.f4577n.post(cVar.f4583t);
    }

    public final void B() {
        if (this.f9468R) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f9467Q) {
            this.f9467Q = currentAnimationTimeMillis;
            InterfaceC1091b0 interfaceC1091b0 = this.f9516x0;
            float[] fArr = this.f9465O;
            interfaceC1091b0.a(this, fArr);
            L.s(fArr, this.f9466P);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f9463M;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f9469S = l0.c.e(f3 - iArr[0], f4 - iArr[1]);
        }
    }

    public final void C(t0.g0 g0Var) {
        C1256t c1256t;
        Reference poll;
        K.d dVar;
        if (this.f9457G != null) {
            R0.w wVar = Q0.f9245s;
        }
        do {
            c1256t = this.f9505r0;
            poll = ((ReferenceQueue) c1256t.f10467f).poll();
            dVar = (K.d) c1256t.f10466e;
            if (poll != null) {
                dVar.n(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(g0Var, (ReferenceQueue) c1256t.f10467f));
    }

    public final void D(t0.E e3) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e3 != null) {
            while (e3 != null && e3.f8562z.f8642r.f8610n == 1) {
                if (!this.f9459I) {
                    t0.E s3 = e3.s();
                    if (s3 == null) {
                        break;
                    }
                    long j3 = ((C1006t) s3.f8561y.f2912c).f8129g;
                    if (O0.a.f(j3) && O0.a.e(j3)) {
                        break;
                    }
                }
                e3 = e3.s();
            }
            if (e3 == getRoot()) {
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
        float d3 = C0238c.d(j3) - C0238c.d(this.f9469S);
        float e3 = C0238c.e(j3) - C0238c.e(this.f9469S);
        return b0.G.b(l0.c.e(d3, e3), this.f9466P);
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        int i3 = 0;
        if (this.f9518y0) {
            this.f9518y0 = false;
            int metaState = motionEvent.getMetaState();
            this.f9491k.getClass();
            V0.f9276b.setValue(new n0.v(metaState));
        }
        C0707e c0707e = this.f9515x;
        C1256t a3 = c0707e.a(motionEvent, this);
        E.F f3 = this.f9517y;
        if (a3 != null) {
            ArrayList arrayList = (ArrayList) a3.f10466e;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    obj = arrayList.get(size);
                    if (((n0.u) obj).f7328e) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            obj = null;
            n0.u uVar = (n0.u) obj;
            if (uVar != null) {
                this.f9477d = uVar.f7327d;
            }
            i3 = f3.e(a3, this, p(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i3 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0707e.f7278c.delete(pointerId);
                c0707e.f7277b.delete(pointerId);
            }
        } else {
            f3.f();
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
            long r3 = r(l0.c.e(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C0238c.d(r3);
            pointerCoords.y = C0238c.e(r3);
            i7++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i3, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C1256t a3 = this.f9515x.a(obtain, this);
        f2.j.c(a3);
        this.f9517y.e(a3, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(C1241e c1241e, X1.c cVar) {
        r rVar;
        int i3;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i4 = rVar.f9444i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rVar.f9444i = i4 - Integer.MIN_VALUE;
                Object obj = rVar.f9442g;
                W1.a aVar = W1.a.f4608d;
                i3 = rVar.f9444i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    AtomicReference atomicReference = this.f9482f0;
                    C1116o c1116o = new C1116o(this, 2);
                    rVar.f9444i = 1;
                    if (AbstractC0837y.e(new U.t(c1116o, atomicReference, c1241e, null), rVar) == aVar) {
                        return;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                throw new C1.c();
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f9442g;
        W1.a aVar2 = W1.a.f4608d;
        i3 = rVar.f9444i;
        if (i3 != 0) {
        }
        throw new C1.c();
    }

    public final void I() {
        int[] iArr = this.f9463M;
        getLocationOnScreen(iArr);
        long j3 = this.f9462L;
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        boolean z3 = false;
        int i5 = iArr[0];
        if (i3 != i5 || i4 != iArr[1]) {
            this.f9462L = l0.c.c(i5, iArr[1]);
            if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                getRoot().f8562z.f8642r.q0();
                z3 = true;
            }
        }
        this.f9460J.a(z3);
    }

    @Override // androidx.lifecycle.InterfaceC0276e
    public final void a(InterfaceC0292v interfaceC0292v) {
        setShowLayoutBounds(C1121q0.a());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        V.a aVar;
        if (!h() || (aVar = this.f9452A) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            AutofillValue i4 = AbstractC0070h.i(sparseArray.get(keyAt));
            V.d dVar = V.d.f4548a;
            if (dVar.d(i4)) {
                dVar.i(i4).toString();
                if (aVar.f4545b.f4550a.get(Integer.valueOf(keyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (dVar.b(i4)) {
                    throw new R1.h("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (dVar.c(i4)) {
                    throw new R1.h("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (dVar.e(i4)) {
                    throw new R1.h("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i3) {
        return this.f9501p.e(false, i3, this.f9477d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        return this.f9501p.e(true, i3, this.f9477d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        s(true);
        synchronized (S.p.f4241b) {
            C0519A c0519a = ((C0220d) S.p.f4248i.get()).f4204h;
            if (c0519a != null) {
                z3 = c0519a.h();
            }
        }
        if (z3) {
            S.p.a();
        }
        this.f9513w = true;
        C0349s c0349s = this.f9493l;
        C0334c c0334c = c0349s.f5432a;
        Canvas canvas2 = c0334c.f5405a;
        c0334c.f5405a = canvas;
        getRoot().j(c0334c, null);
        c0349s.f5432a.f5405a = canvas2;
        if (!this.f9510u.isEmpty()) {
            int size = this.f9510u.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((t0.g0) this.f9510u.get(i3)).f();
            }
        }
        if (Q0.f9249w) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f9510u.clear();
        this.f9513w = false;
        ArrayList arrayList = this.f9512v;
        if (arrayList != null) {
            this.f9510u.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0800a c0800a;
        int size;
        C0174t c0174t;
        U.p pVar;
        C0174t c0174t2;
        if (this.v0) {
            E.t tVar = this.f9511u0;
            removeCallbacks(tVar);
            if (motionEvent.getActionMasked() == 8) {
                this.v0 = false;
            } else {
                tVar.run();
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
            Method method = AbstractC0396u.f5611a;
            AbstractC0395t.b(viewConfiguration);
        } else {
            AbstractC0396u.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i3 >= 26) {
            AbstractC0395t.a(viewConfiguration);
        } else {
            AbstractC0396u.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        if (bVar.f4905g.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        Z.t g3 = Z.d.g(bVar.f4904f);
        if (g3 != null) {
            U.p pVar2 = g3.f4489d;
            if (!pVar2.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            t0.E t3 = AbstractC0993f.t(g3);
            loop0: while (true) {
                if (t3 == null) {
                    pVar = null;
                    break;
                }
                if ((((U.p) t3.f8561y.f2915f).f4492g & 16384) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f4491f & 16384) != 0) {
                            K.d dVar = null;
                            pVar = pVar2;
                            while (pVar != null) {
                                if (pVar instanceof C0800a) {
                                    break loop0;
                                }
                                if ((pVar.f4491f & 16384) != 0 && (pVar instanceof AbstractC1000m)) {
                                    int i4 = 0;
                                    for (U.p pVar3 = ((AbstractC1000m) pVar).f8771r; pVar3 != null; pVar3 = pVar3.f4494i) {
                                        if ((pVar3.f4491f & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                pVar = pVar3;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new K.d(new U.p[16]);
                                                }
                                                if (pVar != null) {
                                                    dVar.b(pVar);
                                                    pVar = null;
                                                }
                                                dVar.b(pVar3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                pVar = AbstractC0993f.f(dVar);
                            }
                        }
                        pVar2 = pVar2.f4493h;
                    }
                }
                t3 = t3.s();
                pVar2 = (t3 == null || (c0174t2 = t3.f8561y) == null) ? null : (t0.p0) c0174t2.f2914e;
            }
            c0800a = (C0800a) pVar;
        } else {
            c0800a = null;
        }
        if (c0800a == null) {
            return false;
        }
        C0800a c0800a2 = c0800a;
        U.p pVar4 = c0800a2.f4489d;
        if (!pVar4.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar5 = pVar4.f4493h;
        t0.E t4 = AbstractC0993f.t(c0800a);
        ArrayList arrayList = null;
        while (t4 != null) {
            if ((((U.p) t4.f8561y.f2915f).f4492g & 16384) != 0) {
                while (pVar5 != null) {
                    if ((pVar5.f4491f & 16384) != 0) {
                        U.p pVar6 = pVar5;
                        K.d dVar2 = null;
                        while (pVar6 != null) {
                            if (pVar6 instanceof C0800a) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(pVar6);
                            } else if ((pVar6.f4491f & 16384) != 0 && (pVar6 instanceof AbstractC1000m)) {
                                int i5 = 0;
                                for (U.p pVar7 = ((AbstractC1000m) pVar6).f8771r; pVar7 != null; pVar7 = pVar7.f4494i) {
                                    if ((pVar7.f4491f & 16384) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            pVar6 = pVar7;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar6 != null) {
                                                dVar2.b(pVar6);
                                                pVar6 = null;
                                            }
                                            dVar2.b(pVar7);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            pVar6 = AbstractC0993f.f(dVar2);
                        }
                    }
                    pVar5 = pVar5.f4493h;
                }
            }
            t4 = t4.s();
            pVar5 = (t4 == null || (c0174t = t4.f8561y) == null) ? null : (t0.p0) c0174t.f2914e;
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i6 = size - 1;
                ((C0800a) arrayList.get(size)).getClass();
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        U.p pVar8 = c0800a2.f4489d;
        K.d dVar3 = null;
        while (pVar8 != null) {
            if (pVar8 instanceof C0800a) {
            } else if ((pVar8.f4491f & 16384) != 0 && (pVar8 instanceof AbstractC1000m)) {
                int i7 = 0;
                for (U.p pVar9 = ((AbstractC1000m) pVar8).f8771r; pVar9 != null; pVar9 = pVar9.f4494i) {
                    if ((pVar9.f4491f & 16384) != 0) {
                        i7++;
                        if (i7 == 1) {
                            pVar8 = pVar9;
                        } else {
                            if (dVar3 == null) {
                                dVar3 = new K.d(new U.p[16]);
                            }
                            if (pVar8 != null) {
                                dVar3.b(pVar8);
                                pVar8 = null;
                            }
                            dVar3.b(pVar9);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            pVar8 = AbstractC0993f.f(dVar3);
        }
        U.p pVar10 = c0800a2.f4489d;
        K.d dVar4 = null;
        while (pVar10 != null) {
            if (pVar10 instanceof C0800a) {
            } else if ((pVar10.f4491f & 16384) != 0 && (pVar10 instanceof AbstractC1000m)) {
                int i8 = 0;
                for (U.p pVar11 = ((AbstractC1000m) pVar10).f8771r; pVar11 != null; pVar11 = pVar11.f4494i) {
                    if ((pVar11.f4491f & 16384) != 0) {
                        i8++;
                        if (i8 == 1) {
                            pVar10 = pVar11;
                        } else {
                            if (dVar4 == null) {
                                dVar4 = new K.d(new U.p[16]);
                            }
                            if (pVar10 != null) {
                                dVar4.b(pVar10);
                                pVar10 = null;
                            }
                            dVar4.b(pVar11);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            pVar10 = AbstractC0993f.f(dVar4);
        }
        if (arrayList == null) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C1112m c1112m = ((C0800a) arrayList.get(i9)).f7817q;
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
        C0174t c0174t;
        boolean z3;
        boolean z4 = this.v0;
        E.t tVar = this.f9511u0;
        if (z4) {
            removeCallbacks(tVar);
            tVar.run();
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        E e3 = this.f9501p;
        AccessibilityManager accessibilityManager = e3.f9154g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            C1123s c1123s = e3.f9151d;
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                c1123s.s(true);
                t0.r rVar = new t0.r();
                t0.E root = c1123s.getRoot();
                long e4 = l0.c.e(x3, y3);
                C0174t c0174t2 = root.f8561y;
                t0.b0 b0Var = (t0.b0) c0174t2.f2913d;
                b0.O o3 = t0.b0.f8701H;
                ((t0.b0) c0174t2.f2913d).O0(t0.b0.f8705L, b0Var.H0(e4, true), rVar, true, true);
                U.p pVar = (U.p) S1.l.R0(rVar);
                t0.E t3 = pVar != null ? AbstractC0993f.t(pVar) : null;
                if (t3 != null && (c0174t = t3.f8561y) != null && c0174t.f(8)) {
                    A0.p j3 = AbstractC0508a.j(t3, false);
                    t0.b0 c2 = j3.c();
                    if (!(c2 != null ? c2.R0() : false)) {
                        if (!j3.f142d.f129d.containsKey(A0.s.f178m)) {
                            z3 = true;
                            if (z3) {
                                if (c1123s.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(t3) != null) {
                                    throw new ClassCastException();
                                }
                                i3 = e3.w(t3.f8541e);
                                c1123s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                                i4 = e3.f9152e;
                                if (i4 != i3) {
                                    e3.f9152e = i3;
                                    E.A(e3, i3, 128, null, 12);
                                    E.A(e3, i4, 256, null, 12);
                                }
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
                i3 = Integer.MIN_VALUE;
                c1123s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                i4 = e3.f9152e;
                if (i4 != i3) {
                }
            } else if (action == 10) {
                int i5 = e3.f9152e;
                if (i5 == Integer.MIN_VALUE) {
                    c1123s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i5 != Integer.MIN_VALUE) {
                    e3.f9152e = Integer.MIN_VALUE;
                    E.A(e3, Integer.MIN_VALUE, 128, null, 12);
                    E.A(e3, i5, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && p(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f9502p0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f9502p0 = MotionEvent.obtainNoHistory(motionEvent);
                this.v0 = true;
                postDelayed(tVar, 8L);
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
            return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, new B.f0(this, 11, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f9491k.getClass();
        V0.f9276b.setValue(new n0.v(metaState));
        return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, Z.g.f4675f) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0174t c0174t;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (bVar.f4905g.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            Z.t g3 = Z.d.g(bVar.f4904f);
            if (g3 != null) {
                U.p pVar = g3.f4489d;
                if (!pVar.f4501p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                t0.E t3 = AbstractC0993f.t(g3);
                while (t3 != null) {
                    if ((((U.p) t3.f8561y.f2915f).f4492g & 131072) != 0) {
                        while (pVar != null) {
                            if ((pVar.f4491f & 131072) != 0) {
                                U.p pVar2 = pVar;
                                K.d dVar = null;
                                while (pVar2 != null) {
                                    if ((pVar2.f4491f & 131072) != 0 && (pVar2 instanceof AbstractC1000m)) {
                                        int i3 = 0;
                                        for (U.p pVar3 = ((AbstractC1000m) pVar2).f8771r; pVar3 != null; pVar3 = pVar3.f4494i) {
                                            if ((pVar3.f4491f & 131072) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    pVar2 = pVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.p[16]);
                                                    }
                                                    if (pVar2 != null) {
                                                        dVar.b(pVar2);
                                                        pVar2 = null;
                                                    }
                                                    dVar.b(pVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    pVar2 = AbstractC0993f.f(dVar);
                                }
                            }
                            pVar = pVar.f4493h;
                        }
                    }
                    t3 = t3.s();
                    pVar = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (t0.p0) c0174t.f2914e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            F.f9187a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.v0) {
            E.t tVar = this.f9511u0;
            removeCallbacks(tVar);
            MotionEvent motionEvent2 = this.f9502p0;
            f2.j.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.v0 = false;
            } else {
                tVar.run();
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
            C0239d d3 = Z.d.d(view);
            Z.b K3 = Z.d.K(i3);
            if (f2.j.a(((androidx.compose.ui.focus.b) getFocusOwner()).c(K3 != null ? K3.f4666a : 6, d3, C1112m.f9400g), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i3);
    }

    public final C1089a0 getAndroidViewsHandler$ui_release() {
        if (this.f9456F == null) {
            C1089a0 c1089a0 = new C1089a0(getContext());
            this.f9456F = c1089a0;
            addView(c1089a0, -1);
            requestLayout();
        }
        C1089a0 c1089a02 = this.f9456F;
        f2.j.c(c1089a02);
        return c1089a02;
    }

    public V.b getAutofill() {
        return this.f9452A;
    }

    public V.f getAutofillTree() {
        return this.f9508t;
    }

    public final InterfaceC0424c getConfigurationChangeObserver() {
        return this.f9519z;
    }

    public final W.c getContentCaptureManager$ui_release() {
        return this.f9503q;
    }

    public V1.i getCoroutineContext() {
        return this.f9487i;
    }

    public O0.b getDensity() {
        return (O0.b) this.f9483g.getValue();
    }

    public X.a getDragAndDropManager() {
        return this.f9489j;
    }

    public Z.h getFocusOwner() {
        return this.f9485h;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        R1.y yVar;
        C0239d w2 = w();
        if (w2 != null) {
            rect.left = Math.round(w2.f4724a);
            rect.top = Math.round(w2.f4725b);
            rect.right = Math.round(w2.f4726c);
            rect.bottom = Math.round(w2.f4727d);
            yVar = R1.y.f4171a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public H0.d getFontFamilyResolver() {
        return (H0.d) this.f9488i0.getValue();
    }

    public H0.c getFontLoader() {
        return this.f9486h0;
    }

    public b0.D getGraphicsContext() {
        return this.f9506s;
    }

    public InterfaceC0553a getHapticFeedBack() {
        return this.f9494l0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f9460J.f8668b.p();
    }

    public InterfaceC0563b getInputModeManager() {
        return this.f9496m0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f9467Q;
    }

    @Override // android.view.View, android.view.ViewParent
    public O0.k getLayoutDirection() {
        return (O0.k) this.f9492k0.getValue();
    }

    public long getMeasureIteration() {
        t0.T t3 = this.f9460J;
        if (t3.f8669c) {
            return t3.f8673g;
        }
        n.z0.n("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C0958d getModifierLocalManager() {
        return this.f9498n0;
    }

    public AbstractC0892N getPlacementScope() {
        int i3 = AbstractC0895Q.f8135b;
        return new C0882D(1, this);
    }

    public InterfaceC0718p getPointerIconService() {
        return this.f9453A0;
    }

    public t0.E getRoot() {
        return this.f9495m;
    }

    public t0.n0 getRootForTest() {
        return this.f9497n;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        z0.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.f9520z0) == null) {
            return false;
        }
        return ((Boolean) jVar.f10542a.getValue()).booleanValue();
    }

    public A0.q getSemanticsOwner() {
        return this.f9499o;
    }

    public t0.G getSharedDrawScope() {
        return this.f9481f;
    }

    public boolean getShowLayoutBounds() {
        return this.f9455E;
    }

    public t0.j0 getSnapshotObserver() {
        return this.D;
    }

    public K0 getSoftwareKeyboardController() {
        return this.f9484g0;
    }

    public I0.A getTextInputService() {
        return this.f9480e0;
    }

    public L0 getTextToolbar() {
        return this.f9500o0;
    }

    public O0 getViewConfiguration() {
        return this.f9461K;
    }

    public final C1110l getViewTreeOwners() {
        return (C1110l) this.f9472V.getValue();
    }

    public U0 getWindowInfo() {
        return this.f9491k;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:12:0x006b, B:14:0x0075, B:19:0x0085, B:22:0x00ae, B:23:0x008c, B:29:0x0098, B:32:0x00a0, B:34:0x00b1, B:42:0x00c4, B:44:0x00ca, B:46:0x00de, B:47:0x00e1, B:49:0x00e5, B:51:0x00eb, B:53:0x00ef, B:54:0x00f5, B:57:0x00fd, B:60:0x0105, B:61:0x0111, B:63:0x0117, B:65:0x011d, B:67:0x0123, B:68:0x0129, B:70:0x012d, B:71:0x0131, B:76:0x0144, B:78:0x0148, B:79:0x014f, B:85:0x015f, B:86:0x0169, B:92:0x0176), top: B:4:0x004f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(MotionEvent motionEvent) {
        int i3;
        boolean z3;
        int actionMasked;
        float[] fArr = this.f9465O;
        removeCallbacks(this.f9509t0);
        try {
            this.f9467Q = AnimationUtils.currentAnimationTimeMillis();
            this.f9516x0.a(this, fArr);
            L.s(fArr, this.f9466P);
            long b3 = b0.G.b(l0.c.e(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f9469S = l0.c.e(motionEvent.getRawX() - C0238c.d(b3), motionEvent.getRawY() - C0238c.e(b3));
            boolean z4 = true;
            this.f9468R = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f9502p0;
                boolean z5 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                E.F f3 = this.f9517y;
                if (motionEvent2 != null) {
                    if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                        z3 = false;
                        if (z3) {
                            if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                                if (motionEvent2.getActionMasked() != 10 && z5) {
                                    G(motionEvent2, 10, motionEvent2.getEventTime(), true);
                                }
                            }
                            f3.f();
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
                MotionEvent motionEvent3 = this.f9502p0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f9502p0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C0707e c0707e = this.f9515x;
                    if (action == i3 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c0707e.f7278c.delete(pointerId);
                            c0707e.f7277b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f9502p0;
                        float x3 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f9502p0;
                        boolean z7 = (x3 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f9502p0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z4 = false;
                        }
                        if (z7 || z4) {
                            if (pointerId >= 0) {
                                c0707e.f7278c.delete(pointerId);
                                c0707e.f7277b.delete(pointerId);
                            }
                            ((C0710h) ((G1.m) f3.f924c).f2117c).f7291a.h();
                        }
                    }
                }
                this.f9502p0 = MotionEvent.obtainNoHistory(motionEvent);
                return F(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f9468R = false;
        }
    }

    public final void n(t0.E e3) {
        int i3 = 0;
        this.f9460J.p(e3, false);
        K.d v3 = e3.v();
        int i4 = v3.f3216f;
        if (i4 > 0) {
            Object[] objArr = v3.f3214d;
            do {
                n((t0.E) objArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0294x e3;
        InterfaceC0292v interfaceC0292v;
        V.a aVar;
        super.onAttachedToWindow();
        this.f9491k.f9277a.setValue(Boolean.valueOf(hasWindowFocus()));
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().f8760a.d();
        if (h() && (aVar = this.f9452A) != null) {
            V.e.f4549a.a(aVar);
        }
        InterfaceC0292v f3 = androidx.lifecycle.P.f(this);
        y1.f l3 = n.T.l(this);
        C1110l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f3 != null && l3 != null && (f3 != (interfaceC0292v = viewTreeOwners.f9393a) || l3 != interfaceC0292v))) {
            if (f3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (l3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (e3 = viewTreeOwners.f9393a.e()) != null) {
                e3.f(this);
            }
            f3.e().a(this);
            C1110l c1110l = new C1110l(f3, l3);
            set_viewTreeOwners(c1110l);
            InterfaceC0424c interfaceC0424c = this.f9473W;
            if (interfaceC0424c != null) {
                interfaceC0424c.n(c1110l);
            }
            this.f9473W = null;
        }
        int i3 = isInTouchMode() ? 1 : 2;
        C0564c c0564c = this.f9496m0;
        c0564c.getClass();
        c0564c.f6412a.setValue(new C0562a(i3));
        C1110l viewTreeOwners2 = getViewTreeOwners();
        C0294x e4 = viewTreeOwners2 != null ? viewTreeOwners2.f9393a.e() : null;
        if (e4 == null) {
            n.z0.p("No lifecycle owner exists");
            throw null;
        }
        e4.a(this);
        e4.a(this.f9503q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f9474a0);
        getViewTreeObserver().addOnScrollChangedListener(this.f9475b0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f9476c0);
        if (Build.VERSION.SDK_INT >= 31) {
            I.f9198a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        U.s sVar = (U.s) this.f9482f0.get();
        S s3 = (S) (sVar != null ? sVar.f4503b : null);
        if (s3 == null) {
            return this.f9478d0.f3015d;
        }
        U.s sVar2 = (U.s) s3.f9268g.get();
        C1122r0 c1122r0 = (C1122r0) (sVar2 != null ? sVar2.f4503b : null);
        return c1122r0 != null && (c1122r0.f9449e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(l0.c.b(getContext()));
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f9490j0) {
            this.f9490j0 = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(O2.d.I(getContext()));
        }
        this.f9519z.n(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r6 != false) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        U.s sVar = (U.s) this.f9482f0.get();
        InputConnection inputConnection = null;
        S s3 = (S) (sVar != null ? sVar.f4503b : null);
        if (s3 != null) {
            U.s sVar2 = (U.s) s3.f9268g.get();
            C1122r0 c1122r0 = (C1122r0) (sVar2 != null ? sVar2.f4503b : null);
            if (c1122r0 != null) {
                synchronized (c1122r0.f9447c) {
                    if (!c1122r0.f9449e) {
                        InputConnectionC1234B a3 = c1122r0.f9445a.a(editorInfo);
                        C0929z c0929z = new C0929z(10, c1122r0);
                        int i3 = Build.VERSION.SDK_INT;
                        inputConnection = i3 >= 34 ? new I0.r(a3, c0929z) : i3 >= 25 ? new I0.q(a3, c0929z) : new I0.p(a3, c0929z);
                        c1122r0.f9448d.b(new WeakReference(inputConnection));
                    }
                }
            }
            return inputConnection;
        }
        I0.C c2 = this.f9478d0;
        if (!c2.f3015d) {
            return null;
        }
        I0.m mVar = c2.f3019h;
        I0.z zVar = c2.f3018g;
        int i4 = mVar.f3076e;
        boolean a4 = I0.l.a(i4, 1);
        boolean z3 = mVar.f3072a;
        int i5 = 0;
        if (!a4) {
            if (I0.l.a(i4, 0)) {
                i5 = 1;
            } else if (I0.l.a(i4, 2)) {
                i5 = 2;
            } else if (I0.l.a(i4, 6)) {
                i5 = 5;
            } else if (I0.l.a(i4, 5)) {
                i5 = 7;
            } else if (I0.l.a(i4, 3)) {
                i5 = 3;
            } else if (I0.l.a(i4, 4)) {
                i5 = 4;
            } else {
                if (!I0.l.a(i4, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i5 = 6;
            }
            editorInfo.imeOptions = i5;
            int i6 = mVar.f3075d;
            if (I0.o.a(i6, 1)) {
                editorInfo.inputType = 1;
            } else if (I0.o.a(i6, 2)) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else if (I0.o.a(i6, 3)) {
                editorInfo.inputType = 2;
            } else if (I0.o.a(i6, 4)) {
                editorInfo.inputType = 3;
            } else if (I0.o.a(i6, 5)) {
                editorInfo.inputType = 17;
            } else if (I0.o.a(i6, 6)) {
                editorInfo.inputType = 33;
            } else if (I0.o.a(i6, 7)) {
                editorInfo.inputType = 129;
            } else if (I0.o.a(i6, 8)) {
                editorInfo.inputType = 18;
            } else {
                if (!I0.o.a(i6, 9)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                editorInfo.inputType = 8194;
            }
            if (!z3) {
                int i7 = editorInfo.inputType;
                if ((i7 & 1) == 1) {
                    editorInfo.inputType = i7 | 131072;
                    if (I0.l.a(mVar.f3076e, 1)) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
                int i8 = mVar.f3073b;
                if (I0.n.a(i8, 1)) {
                    editorInfo.inputType |= 4096;
                } else if (I0.n.a(i8, 2)) {
                    editorInfo.inputType |= 8192;
                } else if (I0.n.a(i8, 3)) {
                    editorInfo.inputType |= 16384;
                }
                if (mVar.f3074c) {
                    editorInfo.inputType |= 32768;
                }
            }
            long j3 = zVar.f3098b;
            int i9 = C0.J.f568c;
            editorInfo.initialSelStart = (int) (j3 >> 32);
            editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
            O2.l.u0(editorInfo, zVar.f3097a.f596a);
            editorInfo.imeOptions |= 33554432;
            if (m1.i.c()) {
                m1.i.a().f(editorInfo);
            }
            I0.v vVar = new I0.v(c2.f3018g, new B.Y(c2), c2.f3019h.f3074c);
            c2.f3020i.add(new WeakReference(vVar));
            return vVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        W.c cVar = this.f9503q;
        cVar.getClass();
        W.a.f4561a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        V.a aVar;
        super.onDetachedFromWindow();
        S.w wVar = getSnapshotObserver().f8760a;
        L1.g gVar = wVar.f4277g;
        if (gVar != null) {
            gVar.a();
        }
        wVar.b();
        C1110l viewTreeOwners = getViewTreeOwners();
        C0294x e3 = viewTreeOwners != null ? viewTreeOwners.f9393a.e() : null;
        if (e3 == null) {
            n.z0.p("No lifecycle owner exists");
            throw null;
        }
        e3.f(this.f9503q);
        e3.f(this);
        if (h() && (aVar = this.f9452A) != null) {
            V.e.f4549a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f9474a0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f9475b0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f9476c0);
        if (Build.VERSION.SDK_INT >= 31) {
            I.f9198a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (z3 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        B.U u3 = bVar.f4906h;
        boolean z4 = u3.f318b;
        Z.t tVar = bVar.f4904f;
        if (z4) {
            Z.d.e(tVar, true, true);
            return;
        }
        try {
            u3.f318b = true;
            Z.d.e(tVar, true, true);
        } finally {
            B.U.b(u3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        this.f9460J.j(this.f9514w0);
        this.f9458H = null;
        I();
        if (this.f9456F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i5 - i3, i6 - i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        t0.T t3 = this.f9460J;
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
            int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
            if (i6 != Integer.MAX_VALUE) {
                i8 = Math.min(l3, i6);
            }
            long a3 = O2.d.a(Math.min(l3, i5), i8, min, min2);
            O0.a aVar = this.f9458H;
            if (aVar == null) {
                this.f9458H = new O0.a(a3);
                this.f9459I = false;
            } else if (!O0.a.b(aVar.f3725a, a3)) {
                this.f9459I = true;
            }
            t3.q(a3);
            t3.l();
            setMeasuredDimension(getRoot().f8562z.f8642r.f8126d, getRoot().f8562z.f8642r.f8127e);
            if (this.f9456F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f8562z.f8642r.f8126d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f8562z.f8642r.f8127e, 1073741824));
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
        if (!h() || viewStructure == null || (aVar = this.f9452A) == null) {
            return;
        }
        V.c cVar = V.c.f4547a;
        V.f fVar = aVar.f4545b;
        int a3 = cVar.a(viewStructure, fVar.f4550a.size());
        for (Map.Entry entry : fVar.f4550a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b3 = cVar.b(viewStructure, a3);
            if (b3 != null) {
                V.d dVar = V.d.f4548a;
                AutofillId a4 = dVar.a(viewStructure);
                f2.j.c(a4);
                dVar.g(b3, a4, intValue);
                cVar.d(b3, intValue, aVar.f4544a.getContext().getPackageName(), null, null);
                dVar.h(b3, 1);
                throw null;
            }
            a3++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        if (this.f9479e) {
            O0.k kVar = O0.k.f3741d;
            O0.k kVar2 = i3 != 0 ? i3 != 1 ? null : O0.k.f3742e : kVar;
            if (kVar2 != null) {
                kVar = kVar2;
            }
            setLayoutDirection(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        z0.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.f9520z0) == null) {
            return;
        }
        jVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        W.c cVar = this.f9503q;
        cVar.getClass();
        W.a.f4561a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean a3;
        this.f9491k.f9277a.setValue(Boolean.valueOf(z3));
        this.f9518y0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || getShowLayoutBounds() == (a3 = C1121q0.a())) {
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
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f9502p0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long r(long j3) {
        B();
        long b3 = b0.G.b(j3, this.f9465O);
        return l0.c.e(C0238c.d(this.f9469S) + C0238c.d(b3), C0238c.e(this.f9469S) + C0238c.e(b3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f4904f.z0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i3, rect);
        }
        if (ordinal != 3) {
            throw new C1.c();
        }
        Z.b K3 = Z.d.K(i3);
        int i4 = K3 != null ? K3.f4666a : 7;
        Boolean c2 = ((androidx.compose.ui.focus.b) getFocusOwner()).c(i4, rect != null ? new C0239d(rect.left, rect.top, rect.right, rect.bottom) : null, new Z.j(i4, 1));
        if (c2 != null) {
            return c2.booleanValue();
        }
        return false;
    }

    public final void s(boolean z3) {
        C1120q c1120q;
        t0.T t3 = this.f9460J;
        if (t3.f8668b.p() || ((K.d) t3.f8671e.f10466e).m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    c1120q = this.f9514w0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c1120q = null;
            }
            if (t3.j(c1120q)) {
                requestLayout();
            }
            t3.a(false);
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f9501p.f9155h = j3;
    }

    public final void setConfigurationChangeObserver(InterfaceC0424c interfaceC0424c) {
        this.f9519z = interfaceC0424c;
    }

    public final void setContentCaptureManager$ui_release(W.c cVar) {
        this.f9503q = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [U.p] */
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
    public void setCoroutineContext(V1.i iVar) {
        int i3;
        int i4;
        this.f9487i = iVar;
        U.p pVar = (U.p) getRoot().f8561y.f2915f;
        if (pVar instanceof C0702C) {
            ((C0702C) pVar).A0();
        }
        U.p pVar2 = pVar.f4489d;
        if (!pVar2.f4501p) {
            n.z0.o("visitSubtree called on an unattached node");
            throw null;
        }
        U.p pVar3 = pVar2.f4494i;
        t0.E t3 = AbstractC0993f.t(pVar);
        int[] iArr = new int[16];
        K.d[] dVarArr = new K.d[16];
        int i5 = 0;
        while (t3 != null) {
            if (pVar3 == null) {
                pVar3 = (U.p) t3.f8561y.f2915f;
            }
            if ((pVar3.f4492g & 16) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f4491f & 16) != 0) {
                        AbstractC1000m abstractC1000m = pVar3;
                        ?? r9 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof t0.m0) {
                                t0.m0 m0Var = (t0.m0) abstractC1000m;
                                if (m0Var instanceof C0702C) {
                                    ((C0702C) m0Var).A0();
                                }
                            } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar4 = abstractC1000m.f8771r;
                                int i6 = 0;
                                abstractC1000m = abstractC1000m;
                                r9 = r9;
                                while (pVar4 != null) {
                                    if ((pVar4.f4491f & 16) != 0) {
                                        i6++;
                                        r9 = r9;
                                        if (i6 == 1) {
                                            abstractC1000m = pVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r9.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r9.b(pVar4);
                                        }
                                    }
                                    pVar4 = pVar4.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r9 = r9;
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r9);
                        }
                    }
                    pVar3 = pVar3.f4494i;
                }
            }
            K.d v3 = t3.v();
            if (!v3.l()) {
                if (i5 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    f2.j.e(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    f2.j.e(copyOf, "copyOf(this, newSize)");
                    dVarArr = (K.d[]) copyOf;
                }
                iArr[i5] = v3.f3216f - 1;
                dVarArr[i5] = v3;
                i5++;
            }
            if (i5 <= 0 || (i4 = iArr[i5 - 1]) < 0) {
                t3 = null;
            } else {
                if (i5 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                K.d dVar = dVarArr[i3];
                f2.j.c(dVar);
                if (i4 > 0) {
                    iArr[i3] = iArr[i3] - 1;
                } else if (i4 == 0) {
                    dVarArr[i3] = null;
                    i5--;
                }
                t3 = (t0.E) dVar.f3214d[i4];
            }
            pVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f9467Q = j3;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC0424c interfaceC0424c) {
        C1110l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC0424c.n(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f9473W = interfaceC0424c;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.f9455E = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(t0.E e3, long j3) {
        t0.T t3 = this.f9460J;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t3.k(e3, j3);
            if (!t3.f8668b.p()) {
                t3.a(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void u(t0.g0 g0Var, boolean z3) {
        ArrayList arrayList = this.f9510u;
        if (!z3) {
            if (this.f9513w) {
                return;
            }
            arrayList.remove(g0Var);
            ArrayList arrayList2 = this.f9512v;
            if (arrayList2 != null) {
                arrayList2.remove(g0Var);
                return;
            }
            return;
        }
        if (!this.f9513w) {
            arrayList.add(g0Var);
            return;
        }
        ArrayList arrayList3 = this.f9512v;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f9512v = arrayList3;
        }
        arrayList3.add(g0Var);
    }

    public final void v() {
        if (this.f9454B) {
            S.w wVar = getSnapshotObserver().f8760a;
            synchronized (wVar.f4276f) {
                try {
                    K.d dVar = wVar.f4276f;
                    int i3 = dVar.f3216f;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        S.v vVar = (S.v) dVar.f3214d[i5];
                        vVar.e();
                        if (!(vVar.f4264f.f6348e != 0)) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr = dVar.f3214d;
                            objArr[i5 - i4] = objArr[i5];
                        }
                    }
                    int i6 = i3 - i4;
                    Arrays.fill(dVar.f3214d, i6, i3, (Object) null);
                    dVar.f3216f = i6;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f9454B = false;
        }
        C1089a0 c1089a0 = this.f9456F;
        if (c1089a0 != null) {
            i(c1089a0);
        }
        while (this.f9507s0.m()) {
            int i7 = this.f9507s0.f3216f;
            for (int i8 = 0; i8 < i7; i8++) {
                Object[] objArr2 = this.f9507s0.f3214d;
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) objArr2[i8];
                objArr2[i8] = null;
                if (interfaceC0422a != null) {
                    interfaceC0422a.b();
                }
            }
            this.f9507s0.p(0, i7);
        }
    }

    public final C0239d w() {
        if (isFocused()) {
            Z.t g3 = Z.d.g(((androidx.compose.ui.focus.b) getFocusOwner()).f4904f);
            if (g3 != null) {
                return Z.d.j(g3);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return Z.d.d(findFocus);
        }
        return null;
    }

    public final void x(t0.E e3) {
        E e4 = this.f9501p;
        e4.f9172y = true;
        if (e4.q()) {
            e4.s(e3);
        }
        W.c cVar = this.f9503q;
        cVar.f4574k = true;
        if (cVar.g() && cVar.f4575l.add(e3)) {
            cVar.f4576m.p(R1.y.f4171a);
        }
    }

    public final void y(t0.E e3, boolean z3, boolean z4, boolean z5) {
        t0.E s3;
        t0.E s4;
        t0.J j3;
        t0.F f3;
        t0.T t3 = this.f9460J;
        if (!z3) {
            if (t3.p(e3, z4) && z5) {
                D(e3);
                return;
            }
            return;
        }
        t3.getClass();
        if (e3.f8542f == null) {
            n.z0.o("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        t0.M m3 = e3.f8562z;
        int b3 = AbstractC0625j.b(m3.f8627c);
        if (b3 != 0) {
            if (b3 == 1) {
                return;
            }
            if (b3 != 2 && b3 != 3) {
                if (b3 != 4) {
                    throw new C1.c();
                }
                if (!m3.f8631g || z4) {
                    m3.f8631g = true;
                    m3.f8628d = true;
                    if (e3.f8537G) {
                        return;
                    }
                    boolean a3 = f2.j.a(e3.F(), Boolean.TRUE);
                    C1256t c1256t = t3.f8668b;
                    if ((a3 || (m3.f8631g && (e3.q() == 1 || !((j3 = m3.f8643s) == null || (f3 = j3.f8591t) == null || !f3.e())))) && ((s3 = e3.s()) == null || !s3.f8562z.f8631g)) {
                        c1256t.h(e3, true);
                    } else if ((e3.E() || t0.T.h(e3)) && ((s4 = e3.s()) == null || !s4.f8562z.f8628d)) {
                        c1256t.h(e3, false);
                    }
                    if (t3.f8670d || !z5) {
                        return;
                    }
                    D(e3);
                    return;
                }
                return;
            }
        }
        t3.f8674h.b(new t0.S(e3, true, z4));
    }

    public final void z(t0.E e3, boolean z3, boolean z4) {
        t0.T t3 = this.f9460J;
        if (!z3) {
            t3.getClass();
            int b3 = AbstractC0625j.b(e3.f8562z.f8627c);
            if (b3 == 0 || b3 == 1 || b3 == 2 || b3 == 3) {
                return;
            }
            if (b3 != 4) {
                throw new C1.c();
            }
            t0.M m3 = e3.f8562z;
            if (!z4 && e3.E() == m3.f8642r.f8618v && (m3.f8628d || m3.f8629e)) {
                return;
            }
            m3.f8629e = true;
            m3.f8630f = true;
            if (!e3.f8537G && m3.f8642r.f8618v) {
                t0.E s3 = e3.s();
                if ((s3 == null || !s3.f8562z.f8629e) && (s3 == null || !s3.f8562z.f8628d)) {
                    t3.f8668b.h(e3, false);
                }
                if (t3.f8670d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        t3.getClass();
        int b4 = AbstractC0625j.b(e3.f8562z.f8627c);
        if (b4 != 0) {
            if (b4 == 1) {
                return;
            }
            if (b4 != 2) {
                if (b4 == 3) {
                    return;
                }
                if (b4 != 4) {
                    throw new C1.c();
                }
            }
        }
        t0.M m4 = e3.f8562z;
        if ((m4.f8631g || m4.f8632h) && !z4) {
            return;
        }
        m4.f8632h = true;
        m4.f8633i = true;
        m4.f8629e = true;
        m4.f8630f = true;
        if (e3.f8537G) {
            return;
        }
        t0.E s4 = e3.s();
        boolean a3 = f2.j.a(e3.F(), Boolean.TRUE);
        C1256t c1256t = t3.f8668b;
        if (a3 && ((s4 == null || !s4.f8562z.f8631g) && (s4 == null || !s4.f8562z.f8632h))) {
            c1256t.h(e3, true);
        } else if (e3.E() && ((s4 == null || !s4.f8562z.f8629e) && (s4 == null || !s4.f8562z.f8628d))) {
            c1256t.h(e3, false);
        }
        if (t3.f8670d) {
            return;
        }
        D(null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        f2.j.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i3, layoutParams, true);
    }

    public C1100g getAccessibilityManager() {
        return this.f9504r;
    }

    public C1102h getClipboardManager() {
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

    @R1.c
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
