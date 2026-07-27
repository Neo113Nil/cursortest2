package s0;

import B1.C0097d;
import G.C0192d;
import G.C0205j0;
import G.C0223t;
import Q.C0268d;
import Q.C0273i;
import Z.C0306c;
import Z.C0309f;
import Z.C0321s;
import a.AbstractC0345a;
import a1.AbstractC0404s;
import a1.AbstractC0405t;
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
import androidx.lifecycle.C0483x;
import androidx.lifecycle.InterfaceC0465e;
import androidx.lifecycle.InterfaceC0481v;
import f1.C0607a;
import h0.C0647b;
import h0.InterfaceC0646a;
import i.C0661B;
import i0.C0675a;
import i0.C0677c;
import i0.InterfaceC0676b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import l0.C0802C;
import l0.C0807e;
import l0.C0810h;
import l0.InterfaceC0818p;
import n.AbstractC0864b;
import n0.C0865a;
import p0.AbstractC0953N;
import p0.AbstractC0956Q;
import p0.C0942C;
import p0.C0957S;
import q0.C1051d;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.C1078t;
import v1.InterfaceC1249f;
import w2.C1294c;
import y.C1315e;
import y.InputConnectionC1308B;
import y2.AbstractC1343r;
import y2.C1333h;
import y2.C1338m;
import y2.C1339n;
import y2.InterfaceC1329d;
import y2.y;
import z2.C1403G;
import z2.C1436t;

/* renamed from: s0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166s extends ViewGroup implements r0.g0, r0.m0, InterfaceC0465e {

    /* renamed from: E0, reason: collision with root package name */
    public static Class f10313E0;

    /* renamed from: F0, reason: collision with root package name */
    public static Method f10314F0;

    /* renamed from: A, reason: collision with root package name */
    public final C0807e f10315A;

    /* renamed from: A0, reason: collision with root package name */
    public final InterfaceC1134b0 f10316A0;
    public final C.F B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f10317B0;

    /* renamed from: C, reason: collision with root package name */
    public Function1 f10318C;

    /* renamed from: C0, reason: collision with root package name */
    public final x0.k f10319C0;

    /* renamed from: D, reason: collision with root package name */
    public final T.a f10320D;

    /* renamed from: D0, reason: collision with root package name */
    public final C1161p f10321D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10322E;

    /* renamed from: F, reason: collision with root package name */
    public final C1145h f10323F;

    /* renamed from: G, reason: collision with root package name */
    public final r0.i0 f10324G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10325H;

    /* renamed from: I, reason: collision with root package name */
    public C1132a0 f10326I;

    /* renamed from: J, reason: collision with root package name */
    public C1156m0 f10327J;

    /* renamed from: K, reason: collision with root package name */
    public M0.a f10328K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10329L;

    /* renamed from: M, reason: collision with root package name */
    public final r0.S f10330M;

    /* renamed from: N, reason: collision with root package name */
    public final Y f10331N;

    /* renamed from: O, reason: collision with root package name */
    public long f10332O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f10333P;

    /* renamed from: Q, reason: collision with root package name */
    public final float[] f10334Q;

    /* renamed from: R, reason: collision with root package name */
    public final float[] f10335R;

    /* renamed from: S, reason: collision with root package name */
    public final float[] f10336S;

    /* renamed from: T, reason: collision with root package name */
    public long f10337T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f10338U;

    /* renamed from: V, reason: collision with root package name */
    public long f10339V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f10340W;

    /* renamed from: a0, reason: collision with root package name */
    public final C0205j0 f10341a0;

    /* renamed from: b0, reason: collision with root package name */
    public final G.F f10342b0;

    /* renamed from: c0, reason: collision with root package name */
    public Function1 f10343c0;

    /* renamed from: d, reason: collision with root package name */
    public long f10344d;

    /* renamed from: d0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1147i f10345d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10346e;

    /* renamed from: e0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC1149j f10347e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC1151k f10348f0;

    /* renamed from: g0, reason: collision with root package name */
    public final G0.B f10349g0;

    /* renamed from: h0, reason: collision with root package name */
    public final G0.z f10350h0;

    /* renamed from: i, reason: collision with root package name */
    public final r0.G f10351i;

    /* renamed from: i0, reason: collision with root package name */
    public final AtomicReference f10352i0;

    /* renamed from: j, reason: collision with root package name */
    public final C0205j0 f10353j;

    /* renamed from: j0, reason: collision with root package name */
    public final C1146h0 f10354j0;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f10355k;

    /* renamed from: k0, reason: collision with root package name */
    public final C1165r0 f10356k0;

    /* renamed from: l, reason: collision with root package name */
    public CoroutineContext f10357l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0205j0 f10358l0;

    /* renamed from: m, reason: collision with root package name */
    public final ViewOnDragListenerC1154l0 f10359m;

    /* renamed from: m0, reason: collision with root package name */
    public int f10360m0;

    /* renamed from: n, reason: collision with root package name */
    public final W0 f10361n;

    /* renamed from: n0, reason: collision with root package name */
    public final C0205j0 f10362n0;

    /* renamed from: o, reason: collision with root package name */
    public final C0321s f10363o;
    public final C0647b o0;

    /* renamed from: p, reason: collision with root package name */
    public final r0.E f10364p;

    /* renamed from: p0, reason: collision with root package name */
    public final C0677c f10365p0;

    /* renamed from: q, reason: collision with root package name */
    public final C1166s f10366q;

    /* renamed from: q0, reason: collision with root package name */
    public final C1051d f10367q0;

    /* renamed from: r, reason: collision with root package name */
    public final y0.o f10368r;

    /* renamed from: r0, reason: collision with root package name */
    public final S f10369r0;

    /* renamed from: s, reason: collision with root package name */
    public final C1118D f10370s;

    /* renamed from: s0, reason: collision with root package name */
    public MotionEvent f10371s0;

    /* renamed from: t, reason: collision with root package name */
    public U.c f10372t;
    public long t0;

    /* renamed from: u, reason: collision with root package name */
    public final C1143g f10373u;

    /* renamed from: u0, reason: collision with root package name */
    public final l2.g f10374u0;

    /* renamed from: v, reason: collision with root package name */
    public final C0309f f10375v;

    /* renamed from: v0, reason: collision with root package name */
    public final I.d f10376v0;

    /* renamed from: w, reason: collision with root package name */
    public final T.f f10377w;

    /* renamed from: w0, reason: collision with root package name */
    public final G1.j f10378w0;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f10379x;

    /* renamed from: x0, reason: collision with root package name */
    public final C.t f10380x0;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f10381y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f10382y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10383z;

    /* renamed from: z0, reason: collision with root package name */
    public final C1163q f10384z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v34, types: [s0.i] */
    /* JADX WARN: Type inference failed for: r1v35, types: [s0.j] */
    /* JADX WARN: Type inference failed for: r1v36, types: [s0.k] */
    public C1166s(Context context, CoroutineContext coroutineContext) {
        super(context);
        int i2 = 0;
        this.f10344d = 9205357640488583168L;
        this.f10346e = true;
        this.f10351i = new r0.G();
        M0.d d4 = j0.c.d(context);
        G.W w4 = G.W.f2777j;
        this.f10353j = C0192d.K(d4, w4);
        y0.d dVar = new y0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.f10355k = new androidx.compose.ui.focus.b(new W2.f0(1, this, C1166s.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 1), new k3.e(2, this, C1166s.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 1), new W2.f0(1, this, C1166s.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 2), new X.e(0, this, C1166s.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new X.e(0, this, C1166s.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new E.j(0, 1, C1166s.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        ViewOnDragListenerC1154l0 viewOnDragListenerC1154l0 = new ViewOnDragListenerC1154l0();
        this.f10357l = coroutineContext;
        this.f10359m = viewOnDragListenerC1154l0;
        this.f10361n = new W0();
        S.o a4 = androidx.compose.ui.input.key.a.a(new C1155m(this, 1));
        S.o a5 = androidx.compose.ui.input.rotary.a.a();
        this.f10363o = new C0321s();
        r0.E e4 = new r0.E(3, 0, false);
        e4.Y(C0957S.f9015b);
        e4.W(getDensity());
        e4.Z(emptySemanticsElement.h(a5).h(a4).h(((androidx.compose.ui.focus.b) getFocusOwner()).f5182i).h(viewOnDragListenerC1154l0.f10257c));
        this.f10364p = e4;
        this.f10366q = this;
        this.f10368r = new y0.o(getRoot(), dVar);
        C1118D c1118d = new C1118D(this);
        this.f10370s = c1118d;
        this.f10372t = new U.c(this, new X.e(0, this, AbstractC1125K.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        C1143g c1143g = new C1143g();
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f10373u = c1143g;
        this.f10375v = new C0309f(this);
        this.f10377w = new T.f();
        this.f10379x = new ArrayList();
        this.f10315A = new C0807e();
        r0.E root = getRoot();
        C.F f4 = new C.F();
        f4.f1052b = root;
        f4.f1053c = new C0097d((C1078t) root.B.f2909c);
        f4.f1054d = new C0607a(11);
        f4.f1055e = new r0.r();
        this.B = f4;
        this.f10318C = C1157n.f10267e;
        this.f10320D = new T.a(this, getAutofillTree());
        this.f10323F = new C1145h(context);
        this.f10324G = new r0.i0(new C1155m(this, 2));
        this.f10330M = new r0.S(getRoot());
        this.f10331N = new Y(ViewConfiguration.get(context));
        this.f10332O = j0.c.g(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f10333P = new int[]{0, 0};
        float[] a6 = Z.E.a();
        this.f10334Q = a6;
        this.f10335R = Z.E.a();
        this.f10336S = Z.E.a();
        this.f10337T = -1L;
        this.f10339V = 9187343241974906880L;
        this.f10340W = true;
        G.W w5 = G.W.f2779l;
        this.f10341a0 = C0192d.K(null, w5);
        this.f10342b0 = C0192d.D(new C1163q(this, 1));
        this.f10345d0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C1166s.this.H();
            }
        };
        this.f10347e0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: s0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C1166s.this.H();
            }
        };
        this.f10348f0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: s0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z4) {
                C0677c c0677c = C1166s.this.f10365p0;
                int i4 = z4 ? 1 : 2;
                c0677c.getClass();
                c0677c.f7001a.setValue(new C0675a(i4));
            }
        };
        G0.B b4 = new G0.B(getView(), this);
        this.f10349g0 = b4;
        this.f10350h0 = new G0.z(b4);
        this.f10352i0 = new AtomicReference(null);
        this.f10354j0 = new C1146h0(getTextInputService());
        this.f10356k0 = new C1165r0();
        this.f10358l0 = C0192d.K(u3.d.u(context), w4);
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = Build.VERSION.SDK_INT;
        this.f10360m0 = i4 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        M0.k kVar = M0.k.f3555d;
        M0.k kVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : M0.k.f3556e : kVar;
        this.f10362n0 = C0192d.K(kVar2 != null ? kVar2 : kVar, w5);
        this.o0 = new C0647b(this);
        this.f10365p0 = new C0677c(isInTouchMode() ? 1 : 2, new C1155m(this, i2));
        this.f10367q0 = new C1051d(this);
        this.f10369r0 = new S(this);
        this.f10374u0 = new l2.g(14);
        this.f10376v0 = new I.d(new Function0[16]);
        this.f10378w0 = new G1.j(9, this);
        this.f10380x0 = new C.t(12, this);
        this.f10384z0 = new C1163q(this, i2);
        this.f10316A0 = i4 < 29 ? new U0.e(a6) : new C1136c0();
        addOnAttachStateChangeListener(this.f10372t);
        setWillNotDraw(false);
        setFocusable(true);
        C1124J.f10062a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i5 = AbstractC0404s.f4892a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(c1118d.f4878b);
        setOnDragListener(viewOnDragListenerC1154l0);
        getRoot().e(this);
        if (i4 >= 29) {
            C1120F.f10037a.a(this);
        }
        this.f10319C0 = i4 >= 31 ? new x0.k() : null;
        this.f10321D0 = new C1161p(this);
    }

    public static final boolean g(C1166s c1166s, X.b bVar, Y.d dVar) {
        Integer J3;
        if (c1166s.isFocused() || c1166s.hasFocus()) {
            return true;
        }
        return super.requestFocus((bVar == null || (J3 = X.d.J(bVar.f4312a)) == null) ? 130 : J3.intValue(), dVar != null ? Z.K.B(dVar) : null);
    }

    @InterfaceC1329d
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1153l get_viewTreeOwners() {
        return (C1153l) this.f10341a0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof C1166s) {
                ((C1166s) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i2) {
        long j4;
        long j5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            y.a aVar = y2.y.f11688e;
            j4 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j5 = size;
                y.a aVar2 = y2.y.f11688e;
                j4 = j5 << 32;
                return j4 | j5;
            }
            y.a aVar3 = y2.y.f11688e;
            j4 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j5 = size;
        return j4 | j5;
    }

    public static View j(View view, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.a(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View j4 = j(viewGroup.getChildAt(i4), i2);
                    if (j4 != null) {
                        return j4;
                    }
                }
            }
        }
        return null;
    }

    public static void l(r0.E e4) {
        e4.z();
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                l((r0.E) objArr[i4]);
                i4++;
            } while (i4 < i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(MotionEvent motionEvent) {
        boolean z4;
        float x2 = motionEvent.getX();
        if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
            float y4 = motionEvent.getY();
            if (!Float.isInfinite(y4) && !Float.isNaN(y4)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z4 = false;
                        if (!z4) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i2 = 1; i2 < pointerCount; i2++) {
                                float x3 = motionEvent.getX(i2);
                                if (!Float.isInfinite(x3) && !Float.isNaN(x3)) {
                                    float y5 = motionEvent.getY(i2);
                                    if (!Float.isInfinite(y5) && !Float.isNaN(y5) && (Build.VERSION.SDK_INT < 29 || C1175w0.f10404a.a(motionEvent, i2))) {
                                        z4 = false;
                                        if (!z4) {
                                            break;
                                        }
                                    }
                                }
                                z4 = true;
                                if (!z4) {
                                }
                            }
                        }
                        return z4;
                    }
                }
            }
        }
        z4 = true;
        if (!z4) {
        }
        return z4;
    }

    private void setDensity(M0.b bVar) {
        this.f10353j.setValue(bVar);
    }

    private void setFontFamilyResolver(F0.d dVar) {
        this.f10358l0.setValue(dVar);
    }

    private void setLayoutDirection(M0.k kVar) {
        this.f10362n0.setValue(kVar);
    }

    private final void set_viewTreeOwners(C1153l c1153l) {
        this.f10341a0.setValue(c1153l);
    }

    public final void A() {
        if (this.f10338U) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f10337T) {
            this.f10337T = currentAnimationTimeMillis;
            InterfaceC1134b0 interfaceC1134b0 = this.f10316A0;
            float[] fArr = this.f10335R;
            interfaceC1134b0.a(this, fArr);
            AbstractC1125K.h(fArr, this.f10336S);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f10333P;
            view.getLocationOnScreen(iArr);
            float f4 = iArr[0];
            float f5 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f10339V = AbstractC0345a.c(f4 - iArr[0], f5 - iArr[1]);
        }
    }

    public final void B(r0.f0 f0Var) {
        l2.g gVar;
        Reference poll;
        I.d dVar;
        if (this.f10327J != null) {
            P0.x xVar = R0.f10112v;
        }
        do {
            gVar = this.f10374u0;
            poll = ((ReferenceQueue) gVar.f7977c).poll();
            dVar = (I.d) gVar.f7976b;
            if (poll != null) {
                dVar.m(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(f0Var, (ReferenceQueue) gVar.f7977c));
    }

    public final void C(r0.E e4) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e4 != null) {
            while (e4 != null && e4.f9584C.f9691r.f9664q == 1) {
                if (!this.f10329L) {
                    r0.E s4 = e4.s();
                    if (s4 == null) {
                        break;
                    }
                    long j4 = ((C1078t) s4.B.f2909c).f9008j;
                    if (M0.a.g(j4) && M0.a.f(j4)) {
                        break;
                    }
                }
                e4 = e4.s();
            }
            if (e4 == getRoot()) {
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

    public final long D(long j4) {
        A();
        float d4 = Y.c.d(j4) - Y.c.d(this.f10339V);
        float e4 = Y.c.e(j4) - Y.c.e(this.f10339V);
        return Z.E.b(AbstractC0345a.c(d4, e4), this.f10336S);
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        int i2 = 0;
        if (this.f10317B0) {
            this.f10317B0 = false;
            int metaState = motionEvent.getMetaState();
            this.f10361n.getClass();
            W0.f10153b.setValue(new l0.v(metaState));
        }
        C0807e c0807e = this.f10315A;
        y.t a4 = c0807e.a(motionEvent, this);
        C.F f4 = this.B;
        if (a4 != null) {
            ArrayList arrayList = (ArrayList) a4.f11494e;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    obj = arrayList.get(size);
                    if (((l0.u) obj).f7943e) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            obj = null;
            l0.u uVar = (l0.u) obj;
            if (uVar != null) {
                this.f10344d = uVar.f7942d;
            }
            i2 = f4.e(a4, this, o(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i2 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0807e.f7893c.delete(pointerId);
                c0807e.f7892b.delete(pointerId);
            }
        } else {
            f4.f();
        }
        return i2;
    }

    public final void F(MotionEvent motionEvent, int i2, long j4, boolean z4) {
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
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
            long q2 = q(AbstractC0345a.c(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Y.c.d(q2);
            pointerCoords.y = Y.c.e(q2);
            i7++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j4 : motionEvent.getDownTime(), j4, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z4 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        y.t a4 = this.f10315A.a(obtain, this);
        Intrinsics.c(a4);
        this.B.e(a4, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(C1315e c1315e, E2.c cVar) {
        r rVar;
        int i2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i4 = rVar.f10310l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rVar.f10310l = i4 - Integer.MIN_VALUE;
                Object obj = rVar.f10308j;
                D2.a aVar = D2.a.f2163d;
                i2 = rVar.f10310l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    AtomicReference atomicReference = this.f10352i0;
                    C1155m c1155m = new C1155m(this, 3);
                    rVar.f10310l = 1;
                    if (W2.B.d(new S.r(c1155m, atomicReference, c1315e, null), rVar) == aVar) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                throw new C1333h();
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f10308j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = rVar.f10310l;
        if (i2 != 0) {
        }
        throw new C1333h();
    }

    public final void H() {
        int[] iArr = this.f10333P;
        getLocationOnScreen(iArr);
        long j4 = this.f10332O;
        int i2 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        boolean z4 = false;
        int i5 = iArr[0];
        if (i2 != i5 || i4 != iArr[1]) {
            this.f10332O = j0.c.g(i5, iArr[1]);
            if (i2 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                getRoot().f9584C.f9691r.u0();
                z4 = true;
            }
        }
        this.f10330M.a(z4);
    }

    @Override // androidx.lifecycle.InterfaceC0465e
    public final void a(InterfaceC0481v interfaceC0481v) {
        setShowLayoutBounds(C1165r0.a());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        T.a aVar = this.f10320D;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                T.d dVar = T.d.f4031a;
                if (dVar.d(autofillValue)) {
                    dVar.i(autofillValue).toString();
                    if (aVar.f4028b.f4033a.get(Integer.valueOf(keyAt)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (dVar.b(autofillValue)) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for date", "message");
                        throw new C1339n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (dVar.c(autofillValue)) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for list", "message");
                        throw new C1339n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (dVar.e(autofillValue)) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", "message");
                        throw new C1339n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.f10370s.e(false, i2, this.f10344d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.f10370s.e(true, i2, this.f10344d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        r(true);
        synchronized (Q.q.f3878b) {
            C0661B c0661b = ((C0268d) Q.q.f3885i.get()).f3839h;
            if (c0661b != null) {
                z4 = c0661b.h();
            }
        }
        if (z4) {
            Q.q.a();
        }
        this.f10383z = true;
        C0321s c0321s = this.f10363o;
        C0306c c0306c = c0321s.f4540a;
        Canvas canvas2 = c0306c.f4515a;
        c0306c.f4515a = canvas;
        getRoot().j(c0306c, null);
        c0321s.f4540a.f4515a = canvas2;
        if (!this.f10379x.isEmpty()) {
            int size = this.f10379x.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((r0.f0) this.f10379x.get(i2)).g();
            }
        }
        if (R0.f10116z) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f10379x.clear();
        this.f10383z = false;
        ArrayList arrayList = this.f10381y;
        if (arrayList != null) {
            this.f10379x.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0865a c0865a;
        int size;
        C0223t c0223t;
        S.n nVar;
        C0223t c0223t2;
        if (this.f10382y0) {
            C.t tVar = this.f10380x0;
            removeCallbacks(tVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f10382y0 = false;
            } else {
                tVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (k(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        AbstractC0405t.b(viewConfiguration);
        getContext();
        AbstractC0405t.a(viewConfiguration);
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        if (bVar.f5180g.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        X.t g4 = X.d.g(bVar.f5179f);
        if (g4 != null) {
            S.n nVar2 = g4.f3978d;
            if (!nVar2.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            r0.E v4 = AbstractC1065f.v(g4);
            loop0: while (true) {
                if (v4 == null) {
                    nVar = null;
                    break;
                }
                if ((((S.n) v4.B.f2912f).f3981j & 16384) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f3980i & 16384) != 0) {
                            I.d dVar = null;
                            nVar = nVar2;
                            while (nVar != null) {
                                if (nVar instanceof C0865a) {
                                    break loop0;
                                }
                                if ((nVar.f3980i & 16384) != 0 && (nVar instanceof AbstractC1073n)) {
                                    int i2 = 0;
                                    for (S.n nVar3 = ((AbstractC1073n) nVar).f9826u; nVar3 != null; nVar3 = nVar3.f3983l) {
                                        if ((nVar3.f3980i & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nVar = nVar3;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new I.d(new S.n[16]);
                                                }
                                                if (nVar != null) {
                                                    dVar.b(nVar);
                                                    nVar = null;
                                                }
                                                dVar.b(nVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nVar = AbstractC1065f.f(dVar);
                            }
                        }
                        nVar2 = nVar2.f3982k;
                    }
                }
                v4 = v4.s();
                nVar2 = (v4 == null || (c0223t2 = v4.B) == null) ? null : (r0.o0) c0223t2.f2911e;
            }
            c0865a = (C0865a) nVar;
        } else {
            c0865a = null;
        }
        if (c0865a == null) {
            return false;
        }
        C0865a c0865a2 = c0865a;
        S.n nVar4 = c0865a2.f3978d;
        if (!nVar4.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar5 = nVar4.f3982k;
        r0.E v5 = AbstractC1065f.v(c0865a);
        ArrayList arrayList = null;
        while (v5 != null) {
            if ((((S.n) v5.B.f2912f).f3981j & 16384) != 0) {
                while (nVar5 != null) {
                    if ((nVar5.f3980i & 16384) != 0) {
                        S.n nVar6 = nVar5;
                        I.d dVar2 = null;
                        while (nVar6 != null) {
                            if (nVar6 instanceof C0865a) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nVar6);
                            } else if ((nVar6.f3980i & 16384) != 0 && (nVar6 instanceof AbstractC1073n)) {
                                int i4 = 0;
                                for (S.n nVar7 = ((AbstractC1073n) nVar6).f9826u; nVar7 != null; nVar7 = nVar7.f3983l) {
                                    if ((nVar7.f3980i & 16384) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar6 = nVar7;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar6 != null) {
                                                dVar2.b(nVar6);
                                                nVar6 = null;
                                            }
                                            dVar2.b(nVar7);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar6 = AbstractC1065f.f(dVar2);
                        }
                    }
                    nVar5 = nVar5.f3982k;
                }
            }
            v5 = v5.s();
            nVar5 = (v5 == null || (c0223t = v5.B) == null) ? null : (r0.o0) c0223t.f2911e;
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i5 = size - 1;
                ((C0865a) arrayList.get(size)).getClass();
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        S.n nVar8 = c0865a2.f3978d;
        I.d dVar3 = null;
        while (nVar8 != null) {
            if (nVar8 instanceof C0865a) {
            } else if ((nVar8.f3980i & 16384) != 0 && (nVar8 instanceof AbstractC1073n)) {
                int i6 = 0;
                for (S.n nVar9 = ((AbstractC1073n) nVar8).f9826u; nVar9 != null; nVar9 = nVar9.f3983l) {
                    if ((nVar9.f3980i & 16384) != 0) {
                        i6++;
                        if (i6 == 1) {
                            nVar8 = nVar9;
                        } else {
                            if (dVar3 == null) {
                                dVar3 = new I.d(new S.n[16]);
                            }
                            if (nVar8 != null) {
                                dVar3.b(nVar8);
                                nVar8 = null;
                            }
                            dVar3.b(nVar9);
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            nVar8 = AbstractC1065f.f(dVar3);
        }
        S.n nVar10 = c0865a2.f3978d;
        I.d dVar4 = null;
        while (nVar10 != null) {
            if (nVar10 instanceof C0865a) {
            } else if ((nVar10.f3980i & 16384) != 0 && (nVar10 instanceof AbstractC1073n)) {
                int i7 = 0;
                for (S.n nVar11 = ((AbstractC1073n) nVar10).f9826u; nVar11 != null; nVar11 = nVar11.f3983l) {
                    if ((nVar11.f3980i & 16384) != 0) {
                        i7++;
                        if (i7 == 1) {
                            nVar10 = nVar11;
                        } else {
                            if (dVar4 == null) {
                                dVar4 = new I.d(new S.n[16]);
                            }
                            if (nVar10 != null) {
                                dVar4.b(nVar10);
                                nVar10 = null;
                            }
                            dVar4.b(nVar11);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            nVar10 = AbstractC1065f.f(dVar4);
        }
        if (arrayList == null) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            C1157n c1157n = ((C0865a) arrayList.get(i8)).f8552t;
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
        int i2;
        int i4;
        C0223t c0223t;
        boolean z4;
        boolean z5 = this.f10382y0;
        C.t tVar = this.f10380x0;
        if (z5) {
            removeCallbacks(tVar);
            tVar.run();
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        C1118D c1118d = this.f10370s;
        AccessibilityManager accessibilityManager = c1118d.f10014g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            C1166s c1166s = c1118d.f10011d;
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y4 = motionEvent.getY();
                c1166s.r(true);
                r0.r rVar = new r0.r();
                r0.E root = c1166s.getRoot();
                long c4 = AbstractC0345a.c(x2, y4);
                C0223t c0223t2 = root.B;
                r0.a0 a0Var = (r0.a0) c0223t2.f2910d;
                Z.M m4 = r0.a0.f9748K;
                ((r0.a0) c0223t2.f2910d).S0(r0.a0.f9752O, a0Var.L0(c4, true), rVar, true, true);
                S.n nVar = (S.n) C1403G.y(rVar);
                r0.E v4 = nVar != null ? AbstractC1065f.v(nVar) : null;
                if (v4 != null && (c0223t = v4.B) != null && c0223t.f(8)) {
                    y0.n h4 = AbstractC0864b.h(v4, false);
                    r0.a0 c5 = h4.c();
                    if (!(c5 != null ? c5.V0() : false)) {
                        if (!h4.f11587d.f11576d.containsKey(y0.q.f11624m)) {
                            z4 = true;
                            if (z4) {
                                if (c1166s.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(v4) != null) {
                                    throw new ClassCastException();
                                }
                                i2 = c1118d.w(v4.f9595e);
                                c1166s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                                i4 = c1118d.f10012e;
                                if (i4 != i2) {
                                    c1118d.f10012e = i2;
                                    C1118D.A(c1118d, i2, 128, null, 12);
                                    C1118D.A(c1118d, i4, 256, null, 12);
                                }
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                }
                i2 = Integer.MIN_VALUE;
                c1166s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                i4 = c1118d.f10012e;
                if (i4 != i2) {
                }
            } else if (action == 10) {
                int i5 = c1118d.f10012e;
                if (i5 == Integer.MIN_VALUE) {
                    c1166s.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i5 != Integer.MIN_VALUE) {
                    c1118d.f10012e = Integer.MIN_VALUE;
                    C1118D.A(c1118d, Integer.MIN_VALUE, 128, null, 12);
                    C1118D.A(c1118d, i5, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && o(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f10371s0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f10371s0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f10382y0 = true;
                postDelayed(tVar, 8L);
                return false;
            }
        } else if (!p(motionEvent)) {
            return false;
        }
        return (k(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, new A.f0(this, 10, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f10361n.getClass();
        W0.f10153b.setValue(new l0.v(metaState));
        return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, X.g.f4321e) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0223t c0223t;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (bVar.f5180g.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            X.t g4 = X.d.g(bVar.f5179f);
            if (g4 != null) {
                S.n nVar = g4.f3978d;
                if (!nVar.f3990s) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                r0.E v4 = AbstractC1065f.v(g4);
                while (v4 != null) {
                    if ((((S.n) v4.B.f2912f).f3981j & 131072) != 0) {
                        while (nVar != null) {
                            if ((nVar.f3980i & 131072) != 0) {
                                S.n nVar2 = nVar;
                                I.d dVar = null;
                                while (nVar2 != null) {
                                    if ((nVar2.f3980i & 131072) != 0 && (nVar2 instanceof AbstractC1073n)) {
                                        int i2 = 0;
                                        for (S.n nVar3 = ((AbstractC1073n) nVar2).f9826u; nVar3 != null; nVar3 = nVar3.f3983l) {
                                            if ((nVar3.f3980i & 131072) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar2 = nVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new I.d(new S.n[16]);
                                                    }
                                                    if (nVar2 != null) {
                                                        dVar.b(nVar2);
                                                        nVar2 = null;
                                                    }
                                                    dVar.b(nVar3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar2 = AbstractC1065f.f(dVar);
                                }
                            }
                            nVar = nVar.f3982k;
                        }
                    }
                    v4 = v4.s();
                    nVar = (v4 == null || (c0223t = v4.B) == null) ? null : (r0.o0) c0223t.f2911e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C1119E.f10035a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10382y0) {
            C.t tVar = this.f10380x0;
            removeCallbacks(tVar);
            MotionEvent motionEvent2 = this.f10371s0;
            Intrinsics.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f10382y0 = false;
            } else {
                tVar.run();
            }
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !p(motionEvent)) {
            return false;
        }
        int k4 = k(motionEvent);
        if ((k4 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (k4 & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = j(this, i2);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        if (view != null) {
            Y.d d4 = X.d.d(view);
            X.b K3 = X.d.K(i2);
            if (Intrinsics.a(((androidx.compose.ui.focus.b) getFocusOwner()).c(K3 != null ? K3.f4312a : 6, d4, C1157n.f10268i), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i2);
    }

    public final C1132a0 getAndroidViewsHandler$ui_release() {
        if (this.f10326I == null) {
            C1132a0 c1132a0 = new C1132a0(getContext());
            this.f10326I = c1132a0;
            addView(c1132a0, -1);
            requestLayout();
        }
        C1132a0 c1132a02 = this.f10326I;
        Intrinsics.c(c1132a02);
        return c1132a02;
    }

    public T.b getAutofill() {
        return this.f10320D;
    }

    public T.f getAutofillTree() {
        return this.f10377w;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.f10318C;
    }

    public final U.c getContentCaptureManager$ui_release() {
        return this.f10372t;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f10357l;
    }

    public M0.b getDensity() {
        return (M0.b) this.f10353j.getValue();
    }

    public V.a getDragAndDropManager() {
        return this.f10359m;
    }

    public X.h getFocusOwner() {
        return this.f10355k;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        Unit unit;
        Y.d v4 = v();
        if (v4 != null) {
            rect.left = Math.round(v4.f4374a);
            rect.top = Math.round(v4.f4375b);
            rect.right = Math.round(v4.f4376c);
            rect.bottom = Math.round(v4.f4377d);
            unit = Unit.f7487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    public F0.d getFontFamilyResolver() {
        return (F0.d) this.f10358l0.getValue();
    }

    public F0.c getFontLoader() {
        return this.f10356k0;
    }

    public Z.A getGraphicsContext() {
        return this.f10375v;
    }

    public InterfaceC0646a getHapticFeedBack() {
        return this.o0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f10330M.f9717b.k();
    }

    public InterfaceC0676b getInputModeManager() {
        return this.f10365p0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f10337T;
    }

    @Override // android.view.View, android.view.ViewParent
    public M0.k getLayoutDirection() {
        return (M0.k) this.f10362n0.getValue();
    }

    public long getMeasureIteration() {
        r0.S s4 = this.f10330M;
        if (s4.f9718c) {
            return s4.f9722g;
        }
        AbstractC0864b.C("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C1051d getModifierLocalManager() {
        return this.f10367q0;
    }

    public AbstractC0953N getPlacementScope() {
        int i2 = AbstractC0956Q.f9014b;
        return new C0942C(1, this);
    }

    public InterfaceC0818p getPointerIconService() {
        return this.f10321D0;
    }

    public r0.E getRoot() {
        return this.f10364p;
    }

    public r0.m0 getRootForTest() {
        return this.f10366q;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        x0.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.f10319C0) == null) {
            return false;
        }
        return ((Boolean) kVar.f11439a.getValue()).booleanValue();
    }

    public y0.o getSemanticsOwner() {
        return this.f10368r;
    }

    public r0.G getSharedDrawScope() {
        return this.f10351i;
    }

    public boolean getShowLayoutBounds() {
        return this.f10325H;
    }

    public r0.i0 getSnapshotObserver() {
        return this.f10324G;
    }

    public L0 getSoftwareKeyboardController() {
        return this.f10354j0;
    }

    public G0.z getTextInputService() {
        return this.f10350h0;
    }

    public M0 getTextToolbar() {
        return this.f10369r0;
    }

    public View getView() {
        return this;
    }

    public P0 getViewConfiguration() {
        return this.f10331N;
    }

    public final C1153l getViewTreeOwners() {
        return (C1153l) this.f10342b0.getValue();
    }

    public V0 getWindowInfo() {
        return this.f10361n;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:12:0x006b, B:14:0x0075, B:19:0x0085, B:22:0x00ae, B:23:0x008c, B:29:0x0098, B:32:0x00a0, B:34:0x00b1, B:42:0x00c4, B:44:0x00ca, B:46:0x00de, B:47:0x00e1, B:49:0x00e5, B:51:0x00eb, B:53:0x00ef, B:54:0x00f5, B:57:0x00fd, B:60:0x0105, B:61:0x0111, B:63:0x0117, B:65:0x011d, B:67:0x0123, B:68:0x0129, B:70:0x012d, B:71:0x0131, B:76:0x0144, B:78:0x0148, B:79:0x014f, B:85:0x015f, B:86:0x0169, B:92:0x0176), top: B:4:0x004f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(MotionEvent motionEvent) {
        int i2;
        boolean z4;
        int actionMasked;
        float[] fArr = this.f10335R;
        removeCallbacks(this.f10378w0);
        try {
            this.f10337T = AnimationUtils.currentAnimationTimeMillis();
            this.f10316A0.a(this, fArr);
            AbstractC1125K.h(fArr, this.f10336S);
            long b4 = Z.E.b(AbstractC0345a.c(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f10339V = AbstractC0345a.c(motionEvent.getRawX() - Y.c.d(b4), motionEvent.getRawY() - Y.c.e(b4));
            boolean z5 = true;
            this.f10338U = true;
            r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f10371s0;
                boolean z6 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                C.F f4 = this.B;
                if (motionEvent2 != null) {
                    if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                        z4 = false;
                        if (z4) {
                            if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                                if (motionEvent2.getActionMasked() != 10 && z6) {
                                    F(motionEvent2, 10, motionEvent2.getEventTime(), true);
                                }
                            }
                            f4.f();
                        }
                    }
                    z4 = true;
                    if (z4) {
                    }
                }
                boolean z7 = motionEvent.getToolType(0) == 3;
                if (z6 || !z7 || actionMasked2 == 3 || actionMasked2 == 9 || !o(motionEvent)) {
                    i2 = 9;
                } else {
                    i2 = 9;
                    F(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f10371s0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f10371s0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C0807e c0807e = this.f10315A;
                    if (action == i2 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c0807e.f7893c.delete(pointerId);
                            c0807e.f7892b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f10371s0;
                        float x2 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f10371s0;
                        boolean z8 = (x2 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f10371s0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z5 = false;
                        }
                        if (z8 || z5) {
                            if (pointerId >= 0) {
                                c0807e.f7893c.delete(pointerId);
                                c0807e.f7892b.delete(pointerId);
                            }
                            ((C0810h) ((C0097d) f4.f1053c).f988i).f7906a.g();
                        }
                    }
                }
                this.f10371s0 = MotionEvent.obtainNoHistory(motionEvent);
                return E(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f10338U = false;
        }
    }

    public final void m(r0.E e4) {
        int i2 = 0;
        this.f10330M.p(e4, false);
        I.d v4 = e4.v();
        int i4 = v4.f3332i;
        if (i4 > 0) {
            Object[] objArr = v4.f3330d;
            do {
                m((r0.E) objArr[i2]);
                i2++;
            } while (i2 < i4);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y4 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y4 && y4 <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0483x e4;
        InterfaceC0481v interfaceC0481v;
        super.onAttachedToWindow();
        this.f10361n.f10154a.setValue(Boolean.valueOf(hasWindowFocus()));
        m(getRoot());
        l(getRoot());
        getSnapshotObserver().f9807a.d();
        T.a aVar = this.f10320D;
        if (aVar != null) {
            T.e.f4032a.a(aVar);
        }
        InterfaceC0481v f4 = androidx.lifecycle.M.f(this);
        InterfaceC1249f q2 = AbstractC0864b.q(this);
        C1153l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f4 != null && q2 != null && (f4 != (interfaceC0481v = viewTreeOwners.f10253a) || q2 != interfaceC0481v))) {
            if (f4 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (q2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (e4 = viewTreeOwners.f10253a.e()) != null) {
                e4.f(this);
            }
            f4.e().a(this);
            C1153l c1153l = new C1153l(f4, q2);
            set_viewTreeOwners(c1153l);
            Function1 function1 = this.f10343c0;
            if (function1 != null) {
                function1.invoke(c1153l);
            }
            this.f10343c0 = null;
        }
        int i2 = isInTouchMode() ? 1 : 2;
        C0677c c0677c = this.f10365p0;
        c0677c.getClass();
        c0677c.f7001a.setValue(new C0675a(i2));
        C1153l viewTreeOwners2 = getViewTreeOwners();
        C0483x e5 = viewTreeOwners2 != null ? viewTreeOwners2.f10253a.e() : null;
        if (e5 == null) {
            AbstractC0864b.E("No lifecycle owner exists");
            throw null;
        }
        e5.a(this);
        e5.a(this.f10372t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10345d0);
        getViewTreeObserver().addOnScrollChangedListener(this.f10347e0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f10348f0);
        if (Build.VERSION.SDK_INT >= 31) {
            C1122H.f10053a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        S.q qVar = (S.q) this.f10352i0.get();
        Q q2 = (Q) (qVar != null ? qVar.f3992b : null);
        if (q2 == null) {
            return this.f10349g0.f3011d;
        }
        S.q qVar2 = (S.q) q2.f10111j.get();
        C1167s0 c1167s0 = (C1167s0) (qVar2 != null ? qVar2.f3992b : null);
        return c1167s0 != null && (c1167s0.f10389e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(j0.c.d(getContext()));
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f10360m0) {
            this.f10360m0 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(u3.d.u(getContext()));
        }
        this.f10318C.invoke(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r7 != false) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2 = 2;
        S.q qVar = (S.q) this.f10352i0.get();
        InputConnection inputConnection = null;
        Q q2 = (Q) (qVar != null ? qVar.f3992b : null);
        if (q2 != null) {
            S.q qVar2 = (S.q) q2.f10111j.get();
            C1167s0 c1167s0 = (C1167s0) (qVar2 != null ? qVar2.f3992b : null);
            if (c1167s0 != null) {
                synchronized (c1167s0.f10387c) {
                    if (!c1167s0.f10389e) {
                        InputConnectionC1308B a4 = c1167s0.f10385a.a(editorInfo);
                        C1160o0 c1160o0 = new C1160o0(i2, c1167s0);
                        inputConnection = Build.VERSION.SDK_INT >= 34 ? new G0.q(a4, c1160o0) : new G0.p(a4, c1160o0);
                        c1167s0.f10388d.b(new WeakReference(inputConnection));
                    }
                }
            }
            return inputConnection;
        }
        G0.B b4 = this.f10349g0;
        if (!b4.f3011d) {
            return null;
        }
        G0.m mVar = b4.f3015h;
        G0.y yVar = b4.f3014g;
        int i4 = mVar.f3072e;
        boolean a5 = G0.l.a(i4, 1);
        boolean z4 = mVar.f3068a;
        int i5 = 0;
        if (!a5) {
            if (G0.l.a(i4, 0)) {
                i5 = 1;
            } else if (G0.l.a(i4, 2)) {
                i5 = 2;
            } else if (G0.l.a(i4, 6)) {
                i5 = 5;
            } else if (G0.l.a(i4, 5)) {
                i5 = 7;
            } else if (G0.l.a(i4, 3)) {
                i5 = 3;
            } else if (G0.l.a(i4, 4)) {
                i5 = 4;
            } else {
                if (!G0.l.a(i4, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i5 = 6;
            }
            editorInfo.imeOptions = i5;
            int i6 = mVar.f3071d;
            if (G0.o.a(i6, 1)) {
                editorInfo.inputType = 1;
            } else if (G0.o.a(i6, 2)) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else if (G0.o.a(i6, 3)) {
                editorInfo.inputType = 2;
            } else if (G0.o.a(i6, 4)) {
                editorInfo.inputType = 3;
            } else if (G0.o.a(i6, 5)) {
                editorInfo.inputType = 17;
            } else if (G0.o.a(i6, 6)) {
                editorInfo.inputType = 33;
            } else if (G0.o.a(i6, 7)) {
                editorInfo.inputType = 129;
            } else if (G0.o.a(i6, 8)) {
                editorInfo.inputType = 18;
            } else {
                if (!G0.o.a(i6, 9)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                editorInfo.inputType = 8194;
            }
            if (!z4) {
                int i7 = editorInfo.inputType;
                if ((i7 & 1) == 1) {
                    editorInfo.inputType = i7 | 131072;
                    if (G0.l.a(mVar.f3072e, 1)) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
                int i8 = mVar.f3069b;
                if (G0.n.a(i8, 1)) {
                    editorInfo.inputType |= 4096;
                } else if (G0.n.a(i8, 2)) {
                    editorInfo.inputType |= 8192;
                } else if (G0.n.a(i8, 3)) {
                    editorInfo.inputType |= 16384;
                }
                if (mVar.f3070c) {
                    editorInfo.inputType |= 32768;
                }
            }
            long j4 = yVar.f3094b;
            int i9 = A0.K.f300c;
            editorInfo.initialSelStart = (int) (j4 >> 32);
            editorInfo.initialSelEnd = (int) (j4 & 4294967295L);
            j0.c.O(editorInfo, yVar.f3093a.f328a);
            editorInfo.imeOptions |= 33554432;
            if (k1.h.c()) {
                k1.h.a().f(editorInfo);
            }
            G0.u uVar = new G0.u(b4.f3014g, new C1294c(b4), b4.f3015h.f3070c);
            b4.f3016i.add(new WeakReference(uVar));
            return uVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        U.c cVar = this.f10372t;
        cVar.getClass();
        U.a.f4059a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q.A a4 = getSnapshotObserver().f9807a;
        C0273i c0273i = a4.f3796g;
        if (c0273i != null) {
            c0273i.a();
        }
        a4.b();
        C1153l viewTreeOwners = getViewTreeOwners();
        C0483x e4 = viewTreeOwners != null ? viewTreeOwners.f10253a.e() : null;
        if (e4 == null) {
            AbstractC0864b.E("No lifecycle owner exists");
            throw null;
        }
        e4.f(this.f10372t);
        e4.f(this);
        T.a aVar = this.f10320D;
        if (aVar != null) {
            T.e.f4032a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f10345d0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f10347e0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f10348f0);
        if (Build.VERSION.SDK_INT >= 31) {
            C1122H.f10053a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i2, Rect rect) {
        super.onFocusChanged(z4, i2, rect);
        if (z4 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        A.V v4 = bVar.f5181h;
        boolean z5 = v4.f61b;
        X.t tVar = bVar.f5179f;
        if (z5) {
            X.d.e(tVar, true, true);
            return;
        }
        try {
            v4.f61b = true;
            X.d.e(tVar, true, true);
        } finally {
            A.V.b(v4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
        this.f10330M.j(this.f10384z0);
        this.f10328K = null;
        H();
        if (this.f10326I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i5 - i2, i6 - i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        r0.S s4 = this.f10330M;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long i5 = i(i2);
            y.a aVar = y2.y.f11688e;
            int i6 = (int) (i5 >>> 32);
            int i7 = (int) (i5 & 4294967295L);
            long i8 = i(i4);
            int i9 = (int) (4294967295L & i8);
            int min = Math.min((int) (i8 >>> 32), 262142);
            int i10 = Integer.MAX_VALUE;
            int min2 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i9, 262142);
            int l4 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
            if (i7 != Integer.MAX_VALUE) {
                i10 = Math.min(l4, i7);
            }
            long a4 = u3.d.a(Math.min(l4, i6), i10, min, min2);
            M0.a aVar2 = this.f10328K;
            if (aVar2 == null) {
                this.f10328K = new M0.a(a4);
                this.f10329L = false;
            } else if (!M0.a.c(aVar2.f3539a, a4)) {
                this.f10329L = true;
            }
            s4.q(a4);
            s4.l();
            setMeasuredDimension(getRoot().f9584C.f9691r.f9005d, getRoot().f9584C.f9691r.f9006e);
            if (this.f10326I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f9584C.f9691r.f9005d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f9584C.f9691r.f9006e, 1073741824));
            }
            Unit unit = Unit.f7487a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        T.a aVar;
        if (viewStructure == null || (aVar = this.f10320D) == null) {
            return;
        }
        T.c cVar = T.c.f4030a;
        T.f fVar = aVar.f4028b;
        int a4 = cVar.a(viewStructure, fVar.f4033a.size());
        for (Map.Entry entry : fVar.f4033a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b4 = cVar.b(viewStructure, a4);
            if (b4 != null) {
                T.d dVar = T.d.f4031a;
                AutofillId a5 = dVar.a(viewStructure);
                Intrinsics.c(a5);
                dVar.g(b4, a5, intValue);
                cVar.d(b4, intValue, aVar.f4027a.getContext().getPackageName(), null, null);
                dVar.h(b4, 1);
                throw null;
            }
            a4++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (this.f10346e) {
            M0.k kVar = M0.k.f3555d;
            M0.k kVar2 = i2 != 0 ? i2 != 1 ? null : M0.k.f3556e : kVar;
            if (kVar2 != null) {
                kVar = kVar2;
            }
            setLayoutDirection(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        x0.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.f10319C0) == null) {
            return;
        }
        kVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        U.c cVar = this.f10372t;
        cVar.getClass();
        U.a.f4059a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        boolean a4;
        this.f10361n.f10154a.setValue(Boolean.valueOf(z4));
        this.f10317B0 = true;
        super.onWindowFocusChanged(z4);
        if (!z4 || getShowLayoutBounds() == (a4 = C1165r0.a())) {
            return;
        }
        setShowLayoutBounds(a4);
        l(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f10371s0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long q(long j4) {
        A();
        long b4 = Z.E.b(j4, this.f10335R);
        return AbstractC0345a.c(Y.c.d(this.f10339V) + Y.c.d(b4), Y.c.e(this.f10339V) + Y.c.e(b4));
    }

    public final void r(boolean z4) {
        C1163q c1163q;
        r0.S s4 = this.f10330M;
        if (s4.f9717b.k() || ((I.d) s4.f9720e.f7976b).l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z4) {
                try {
                    c1163q = this.f10384z0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c1163q = null;
            }
            if (s4.j(c1163q)) {
                requestLayout();
            }
            s4.a(false);
            Unit unit = Unit.f7487a;
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f5179f.C0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i2, rect);
        }
        if (ordinal != 3) {
            throw new C1338m();
        }
        if (isInTouchMode()) {
            return false;
        }
        X.b K3 = X.d.K(i2);
        int i4 = K3 != null ? K3.f4312a : 7;
        Boolean c4 = ((androidx.compose.ui.focus.b) getFocusOwner()).c(i4, rect != null ? new Y.d(rect.left, rect.top, rect.right, rect.bottom) : null, new X.j(i4, 1));
        if (c4 != null) {
            return c4.booleanValue();
        }
        return false;
    }

    public final void s(r0.E e4, long j4) {
        r0.S s4 = this.f10330M;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            s4.k(e4, j4);
            if (!s4.f9717b.k()) {
                s4.a(false);
            }
            Unit unit = Unit.f7487a;
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j4) {
        this.f10370s.f10015h = j4;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.f10318C = function1;
    }

    public final void setContentCaptureManager$ui_release(U.c cVar) {
        this.f10372t = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        int i2;
        int i4;
        this.f10357l = coroutineContext;
        S.n nVar = (S.n) getRoot().B.f2912f;
        if (nVar instanceof C0802C) {
            ((C0802C) nVar).D0();
        }
        S.n nVar2 = nVar.f3978d;
        if (!nVar2.f3990s) {
            AbstractC0864b.D("visitSubtree called on an unattached node");
            throw null;
        }
        S.n nVar3 = nVar2.f3983l;
        r0.E v4 = AbstractC1065f.v(nVar);
        int[] iArr = new int[16];
        I.d[] dVarArr = new I.d[16];
        int i5 = 0;
        while (v4 != null) {
            if (nVar3 == null) {
                nVar3 = (S.n) v4.B.f2912f;
            }
            if ((nVar3.f3981j & 16) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f3980i & 16) != 0) {
                        AbstractC1073n abstractC1073n = nVar3;
                        ?? r9 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof r0.l0) {
                                r0.l0 l0Var = (r0.l0) abstractC1073n;
                                if (l0Var instanceof C0802C) {
                                    ((C0802C) l0Var).D0();
                                }
                            } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar4 = abstractC1073n.f9826u;
                                int i6 = 0;
                                abstractC1073n = abstractC1073n;
                                r9 = r9;
                                while (nVar4 != null) {
                                    if ((nVar4.f3980i & 16) != 0) {
                                        i6++;
                                        r9 = r9;
                                        if (i6 == 1) {
                                            abstractC1073n = nVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r9.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r9.b(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r9 = r9;
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r9);
                        }
                    }
                    nVar3 = nVar3.f3983l;
                }
            }
            I.d v5 = v4.v();
            if (!v5.k()) {
                if (i5 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    dVarArr = (I.d[]) copyOf;
                }
                iArr[i5] = v5.f3332i - 1;
                dVarArr[i5] = v5;
                i5++;
            }
            if (i5 <= 0 || (i4 = iArr[i5 - 1]) < 0) {
                v4 = null;
            } else {
                if (i5 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                I.d dVar = dVarArr[i2];
                Intrinsics.c(dVar);
                if (i4 > 0) {
                    iArr[i2] = iArr[i2] - 1;
                } else if (i4 == 0) {
                    dVarArr[i2] = null;
                    i5--;
                }
                v4 = (r0.E) dVar.f3330d[i4];
            }
            nVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j4) {
        this.f10337T = j4;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super C1153l, Unit> function1) {
        C1153l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f10343c0 = function1;
    }

    public void setShowLayoutBounds(boolean z4) {
        this.f10325H = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(r0.f0 f0Var, boolean z4) {
        ArrayList arrayList = this.f10379x;
        if (!z4) {
            if (this.f10383z) {
                return;
            }
            arrayList.remove(f0Var);
            ArrayList arrayList2 = this.f10381y;
            if (arrayList2 != null) {
                arrayList2.remove(f0Var);
                return;
            }
            return;
        }
        if (!this.f10383z) {
            arrayList.add(f0Var);
            return;
        }
        ArrayList arrayList3 = this.f10381y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f10381y = arrayList3;
        }
        arrayList3.add(f0Var);
    }

    public final void u() {
        if (this.f10322E) {
            Q.A a4 = getSnapshotObserver().f9807a;
            synchronized (a4.f3795f) {
                try {
                    I.d dVar = a4.f3795f;
                    int i2 = dVar.f3332i;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i2; i5++) {
                        Q.z zVar = (Q.z) dVar.f3330d[i5];
                        zVar.e();
                        if (!(zVar.f3910f.f6986e != 0)) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr = dVar.f3330d;
                            objArr[i5 - i4] = objArr[i5];
                        }
                    }
                    int i6 = i2 - i4;
                    C1436t.k(dVar.f3330d, i6, i2);
                    dVar.f3332i = i6;
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10322E = false;
        }
        C1132a0 c1132a0 = this.f10326I;
        if (c1132a0 != null) {
            h(c1132a0);
        }
        while (this.f10376v0.l()) {
            int i7 = this.f10376v0.f3332i;
            for (int i8 = 0; i8 < i7; i8++) {
                Object[] objArr2 = this.f10376v0.f3330d;
                Function0 function0 = (Function0) objArr2[i8];
                objArr2[i8] = null;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.f10376v0.o(0, i7);
        }
    }

    public final Y.d v() {
        if (isFocused()) {
            X.t g4 = X.d.g(((androidx.compose.ui.focus.b) getFocusOwner()).f5179f);
            if (g4 != null) {
                return X.d.j(g4);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return X.d.d(findFocus);
        }
        return null;
    }

    public final void w(r0.E e4) {
        C1118D c1118d = this.f10370s;
        c1118d.f10032y = true;
        if (c1118d.q()) {
            c1118d.s(e4);
        }
        U.c cVar = this.f10372t;
        cVar.f4072n = true;
        if (cVar.g() && cVar.f4073o.add(e4)) {
            cVar.f4074p.o(Unit.f7487a);
        }
    }

    public final void x(r0.E e4, boolean z4, boolean z5, boolean z6) {
        r0.E s4;
        r0.E s5;
        r0.J j4;
        r0.F f4;
        r0.S s6 = this.f10330M;
        if (!z4) {
            if (s6.p(e4, z5) && z6) {
                C(e4);
                return;
            }
            return;
        }
        s6.getClass();
        if (e4.f9596i == null) {
            AbstractC0864b.D("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        r0.L l4 = e4.f9584C;
        int d4 = AbstractC0784j.d(l4.f9676c);
        if (d4 != 0) {
            if (d4 == 1) {
                return;
            }
            if (d4 != 2 && d4 != 3) {
                if (d4 != 4) {
                    throw new C1338m();
                }
                if (!l4.f9680g || z5) {
                    l4.f9680g = true;
                    l4.f9677d = true;
                    if (e4.f9591J) {
                        return;
                    }
                    boolean a4 = Intrinsics.a(e4.F(), Boolean.TRUE);
                    l2.g gVar = s6.f9717b;
                    if ((a4 || (l4.f9680g && (e4.q() == 1 || !((j4 = l4.f9692s) == null || (f4 = j4.f9644w) == null || !f4.e())))) && ((s4 = e4.s()) == null || !s4.f9584C.f9680g)) {
                        gVar.d(e4, true);
                    } else if ((e4.E() || r0.S.h(e4)) && ((s5 = e4.s()) == null || !s5.f9584C.f9677d)) {
                        gVar.d(e4, false);
                    }
                    if (s6.f9719d || !z6) {
                        return;
                    }
                    C(e4);
                    return;
                }
                return;
            }
        }
        s6.f9723h.b(new r0.Q(e4, true, z5));
    }

    public final void y(r0.E e4, boolean z4, boolean z5) {
        r0.S s4 = this.f10330M;
        if (!z4) {
            s4.getClass();
            int d4 = AbstractC0784j.d(e4.f9584C.f9676c);
            if (d4 == 0 || d4 == 1 || d4 == 2 || d4 == 3) {
                return;
            }
            if (d4 != 4) {
                throw new C1338m();
            }
            r0.L l4 = e4.f9584C;
            if (!z5 && e4.E() == l4.f9691r.f9672y && (l4.f9677d || l4.f9678e)) {
                return;
            }
            l4.f9678e = true;
            l4.f9679f = true;
            if (!e4.f9591J && l4.f9691r.f9672y) {
                r0.E s5 = e4.s();
                if ((s5 == null || !s5.f9584C.f9678e) && (s5 == null || !s5.f9584C.f9677d)) {
                    s4.f9717b.d(e4, false);
                }
                if (s4.f9719d) {
                    return;
                }
                C(null);
                return;
            }
            return;
        }
        s4.getClass();
        int d5 = AbstractC0784j.d(e4.f9584C.f9676c);
        if (d5 != 0) {
            if (d5 == 1) {
                return;
            }
            if (d5 != 2) {
                if (d5 == 3) {
                    return;
                }
                if (d5 != 4) {
                    throw new C1338m();
                }
            }
        }
        r0.L l5 = e4.f9584C;
        if ((l5.f9680g || l5.f9681h) && !z5) {
            return;
        }
        l5.f9681h = true;
        l5.f9682i = true;
        l5.f9678e = true;
        l5.f9679f = true;
        if (e4.f9591J) {
            return;
        }
        r0.E s6 = e4.s();
        boolean a4 = Intrinsics.a(e4.F(), Boolean.TRUE);
        l2.g gVar = s4.f9717b;
        if (a4 && ((s6 == null || !s6.f9584C.f9680g) && (s6 == null || !s6.f9584C.f9681h))) {
            gVar.d(e4, true);
        } else if (e4.E() && ((s6 == null || !s6.f9584C.f9678e) && (s6 == null || !s6.f9584C.f9677d))) {
            gVar.d(e4, false);
        }
        if (s4.f9719d) {
            return;
        }
        C(null);
    }

    public final void z() {
        C1118D c1118d = this.f10370s;
        c1118d.f10032y = true;
        if (c1118d.q() && !c1118d.f10007J) {
            c1118d.f10007J = true;
            c1118d.f10019l.post(c1118d.f10008K);
        }
        U.c cVar = this.f10372t;
        cVar.f4072n = true;
        if (!cVar.g() || cVar.f4080v) {
            return;
        }
        cVar.f4080v = true;
        cVar.f4075q.post(cVar.f4081w);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        Intrinsics.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    public C1143g getAccessibilityManager() {
        return this.f10373u;
    }

    public C1145h getClipboardManager() {
        return this.f10323F;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i4) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i4;
        Unit unit = Unit.f7487a;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
