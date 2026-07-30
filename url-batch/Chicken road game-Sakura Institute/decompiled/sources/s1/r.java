package s1;

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
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends ViewGroup implements r1.g1, r1.m1, androidx.lifecycle.e {
    public static Class D0;
    public static Method E0;
    public final c0.w A;
    public boolean A0;
    public q6.c B;
    public final x1.j B0;
    public final t0.a C;
    public final o C0;
    public boolean D;
    public final h E;
    public final r1.i1 F;
    public boolean G;
    public x0 H;
    public l1 I;
    public m2.a J;
    public boolean K;
    public final r1.r0 L;
    public final v0 M;
    public long N;
    public final int[] O;
    public final float[] P;
    public final float[] Q;
    public final float[] R;
    public long S;
    public boolean T;
    public long U;
    public boolean V;
    public final g0.g1 W;

    /* renamed from: a0, reason: collision with root package name */
    public final g0.e0 f8359a0;
    public q6.c b0;

    /* renamed from: c0, reason: collision with root package name */
    public final i f8360c0;

    /* renamed from: d0, reason: collision with root package name */
    public final j f8361d0;

    /* renamed from: e0, reason: collision with root package name */
    public final k f8362e0;

    /* renamed from: f, reason: collision with root package name */
    public long f8363f;

    /* renamed from: f0, reason: collision with root package name */
    public final g2.z f8364f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8365g;

    /* renamed from: g0, reason: collision with root package name */
    public final g2.x f8366g0;

    /* renamed from: h, reason: collision with root package name */
    public final r1.f0 f8367h;

    /* renamed from: h0, reason: collision with root package name */
    public final AtomicReference f8368h0;

    /* renamed from: i, reason: collision with root package name */
    public final g0.g1 f8369i;

    /* renamed from: i0, reason: collision with root package name */
    public final g1 f8370i0;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f8371j;

    /* renamed from: j0, reason: collision with root package name */
    public final o1 f8372j0;

    /* renamed from: k, reason: collision with root package name */
    public h6.i f8373k;

    /* renamed from: k0, reason: collision with root package name */
    public final g0.g1 f8374k0;

    /* renamed from: l, reason: collision with root package name */
    public final k1 f8375l;

    /* renamed from: l0, reason: collision with root package name */
    public int f8376l0;

    /* renamed from: m, reason: collision with root package name */
    public final s2 f8377m;

    /* renamed from: m0, reason: collision with root package name */
    public final g0.g1 f8378m0;

    /* renamed from: n, reason: collision with root package name */
    public final z0.s f8379n;

    /* renamed from: n0, reason: collision with root package name */
    public final h1.b f8380n0;

    /* renamed from: o, reason: collision with root package name */
    public final r1.d0 f8381o;

    /* renamed from: o0, reason: collision with root package name */
    public final i1.c f8382o0;

    /* renamed from: p, reason: collision with root package name */
    public final r f8383p;

    /* renamed from: p0, reason: collision with root package name */
    public final q1.d f8384p0;

    /* renamed from: q, reason: collision with root package name */
    public final y1.n f8385q;

    /* renamed from: q0, reason: collision with root package name */
    public final q0 f8386q0;

    /* renamed from: r, reason: collision with root package name */
    public final c0 f8387r;

    /* renamed from: r0, reason: collision with root package name */
    public MotionEvent f8388r0;

    /* renamed from: s, reason: collision with root package name */
    public u0.c f8389s;

    /* renamed from: s0, reason: collision with root package name */
    public long f8390s0;

    /* renamed from: t, reason: collision with root package name */
    public final g f8391t;

    /* renamed from: t0, reason: collision with root package name */
    public final q5.g f8392t0;

    /* renamed from: u, reason: collision with root package name */
    public final z0.g f8393u;

    /* renamed from: u0, reason: collision with root package name */
    public final i0.d f8394u0;

    /* renamed from: v, reason: collision with root package name */
    public final t0.g f8395v;

    /* renamed from: v0, reason: collision with root package name */
    public final androidx.room.o f8396v0;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8397w;

    /* renamed from: w0, reason: collision with root package name */
    public final androidx.lifecycle.c0 f8398w0;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f8399x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f8400x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8401y;

    /* renamed from: y0, reason: collision with root package name */
    public final p f8402y0;

    /* renamed from: z, reason: collision with root package name */
    public final l1.e f8403z;

    /* renamed from: z0, reason: collision with root package name */
    public final y0 f8404z0;

    /* JADX WARN: Type inference failed for: r6v7, types: [s1.i] */
    /* JADX WARN: Type inference failed for: r6v8, types: [s1.j] */
    /* JADX WARN: Type inference failed for: r6v9, types: [s1.k] */
    public r(Context context, h6.i iVar) {
        super(context);
        this.f8363f = 9205357640488583168L;
        int i7 = 1;
        this.f8365g = true;
        this.f8367h = new r1.f0();
        m2.d F = j1.c.F(context);
        g0.t0 t0Var = g0.t0.f3901i;
        this.f8369i = g0.d.J(F, t0Var);
        y1.d dVar = new y1.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        this.f8371j = new androidx.compose.ui.focus.b(new c7.a1(1, this, r.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i10, i8, i9), new q7.d(2, this, r.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", i10, i8, i9), new c7.a1(1, this, r.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", i10, i8, 2), new b.h0(i11, this, r.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i10, i8, 3), new b.h0(i11, this, r.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", i10, i8, 4), new e0.j(this, r.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0, 1));
        k1 k1Var = new k1();
        this.f8373k = iVar;
        this.f8375l = k1Var;
        this.f8377m = new s2();
        int i12 = 0;
        s0.o a3 = androidx.compose.ui.input.key.a.a(new n(this, i12));
        s0.o a9 = androidx.compose.ui.input.rotary.a.a();
        this.f8379n = new z0.s();
        r1.d0 d0Var = new r1.d0(3);
        d0Var.Y(p1.q0.f7076b);
        d0Var.W(getDensity());
        d0Var.Z(emptySemanticsElement.j(a9).j(a3).j(((androidx.compose.ui.focus.b) getFocusOwner()).f719i).j(k1Var.f8274c));
        this.f8381o = d0Var;
        this.f8383p = this;
        this.f8385q = new y1.n(getRoot(), dVar);
        c0 c0Var = new c0(this);
        this.f8387r = c0Var;
        this.f8389s = new u0.c(this, new b.h0(0, this, j0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 2));
        g gVar = new g();
        Object systemService = context.getSystemService("accessibility");
        r6.k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f8391t = gVar;
        this.f8393u = new z0.g(this);
        this.f8395v = new t0.g();
        this.f8397w = new ArrayList();
        this.f8403z = new l1.e();
        r1.d0 root = getRoot();
        c0.w wVar = new c0.w();
        wVar.f1514b = root;
        wVar.f1515c = new b1.b((r1.t) root.A.f3892c);
        wVar.f1516d = new l1.x(0);
        wVar.f1517e = new r1.r();
        this.A = wVar;
        this.B = m.f8280h;
        int i13 = Build.VERSION.SDK_INT;
        this.C = i13 >= 26 ? new t0.a(this, getAutofillTree()) : null;
        this.E = new h(context);
        this.F = new r1.i1(new n(this, i7));
        this.L = new r1.r0(getRoot());
        this.M = new v0(ViewConfiguration.get(context));
        this.N = a8.m.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.O = new int[]{0, 0};
        float[] a10 = z0.f0.a();
        this.P = a10;
        this.Q = z0.f0.a();
        this.R = z0.f0.a();
        this.S = -1L;
        this.U = 9187343241974906880L;
        this.V = true;
        g0.t0 t0Var2 = g0.t0.f3903k;
        this.W = g0.d.J(null, t0Var2);
        this.f8359a0 = g0.d.C(new p(this, i7));
        this.f8360c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s1.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                r.this.H();
            }
        };
        this.f8361d0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: s1.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                r.this.H();
            }
        };
        this.f8362e0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: s1.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                r.this.f8382o0.f4855a.setValue(new i1.a(z8 ? 1 : 2));
            }
        };
        g2.z zVar = new g2.z(getView(), this);
        this.f8364f0 = zVar;
        this.f8366g0 = new g2.x(zVar);
        this.f8368h0 = new AtomicReference(null);
        this.f8370i0 = new g1(getTextInputService());
        this.f8372j0 = new o1();
        this.f8374k0 = g0.d.J(a8.m.r(context), t0Var);
        this.f8376l0 = i13 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        m2.k kVar = m2.k.f6322f;
        m2.k kVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : m2.k.f6323g : kVar;
        this.f8378m0 = g0.d.J(kVar2 != null ? kVar2 : kVar, t0Var2);
        this.f8380n0 = new h1.b(this);
        this.f8382o0 = new i1.c(isInTouchMode() ? 1 : 2);
        this.f8384p0 = new q1.d(this);
        this.f8386q0 = new q0(this);
        this.f8392t0 = new q5.g(9);
        this.f8394u0 = new i0.d(new q6.a[16]);
        this.f8396v0 = new androidx.room.o(7, this);
        this.f8398w0 = new androidx.lifecycle.c0(10, this);
        this.f8402y0 = new p(this, i12);
        this.f8404z0 = i13 < 29 ? new z0(a10) : new a1();
        addOnAttachStateChangeListener(this.f8389s);
        setWillNotDraw(false);
        setFocusable(true);
        if (i13 >= 26) {
            i0.f8241a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i14 = b3.s.f1365a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(c0Var.f1310b);
        setOnDragListener(k1Var);
        getRoot().e(this);
        if (i13 >= 29) {
            e0.f8201a.a(this);
        }
        this.B0 = i13 >= 31 ? new x1.j() : null;
        this.C0 = new o(this);
    }

    public static final boolean e(r rVar, x0.b bVar, y0.d dVar) {
        Integer I;
        if (rVar.isFocused() || rVar.hasFocus()) {
            return true;
        }
        return super.requestFocus((bVar == null || (I = x0.d.I(bVar.f9595a)) == null) ? 130 : I.intValue(), dVar != null ? z0.l0.u(dVar) : null);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof r) {
                ((r) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j8 = size;
        return j8 | (j8 << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l get_viewTreeOwners() {
        return (l) this.W.getValue();
    }

    public static View h(View view, int i7) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (r6.k.a(declaredMethod.invoke(view, null), Integer.valueOf(i7))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View h3 = h(viewGroup.getChildAt(i8), i7);
                    if (h3 != null) {
                        return h3;
                    }
                }
            }
        }
        return null;
    }

    public static void j(r1.d0 d0Var) {
        d0Var.A();
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                j((r1.d0) objArr[i8]);
                i8++;
            } while (i8 < i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(MotionEvent motionEvent) {
        boolean z8;
        float x8 = motionEvent.getX();
        if (!Float.isInfinite(x8) && !Float.isNaN(x8)) {
            float y4 = motionEvent.getY();
            if (!Float.isInfinite(y4) && !Float.isNaN(y4)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z8 = false;
                        if (!z8) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i7 = 1; i7 < pointerCount; i7++) {
                                float x9 = motionEvent.getX(i7);
                                if (!Float.isInfinite(x9) && !Float.isNaN(x9)) {
                                    float y8 = motionEvent.getY(i7);
                                    if (!Float.isInfinite(y8) && !Float.isNaN(y8) && (Build.VERSION.SDK_INT < 29 || t1.f8432a.a(motionEvent, i7))) {
                                        z8 = false;
                                        if (!z8) {
                                            break;
                                        }
                                    }
                                }
                                z8 = true;
                                if (!z8) {
                                }
                            }
                        }
                        return z8;
                    }
                }
            }
        }
        z8 = true;
        if (!z8) {
        }
        return z8;
    }

    private void setDensity(m2.b bVar) {
        this.f8369i.setValue(bVar);
    }

    private void setFontFamilyResolver(f2.d dVar) {
        this.f8374k0.setValue(dVar);
    }

    private void setLayoutDirection(m2.k kVar) {
        this.f8378m0.setValue(kVar);
    }

    private final void set_viewTreeOwners(l lVar) {
        this.W.setValue(lVar);
    }

    public final void A() {
        if (this.T) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.S) {
            this.S = currentAnimationTimeMillis;
            y0 y0Var = this.f8404z0;
            float[] fArr = this.Q;
            y0Var.a(this, fArr);
            j0.s(fArr, this.R);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.O;
            view.getLocationOnScreen(iArr);
            float f9 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            this.U = u3.r.a(f9 - iArr[0], f10 - iArr[1]);
        }
    }

    public final void B(r1.f1 f1Var) {
        q5.g gVar;
        i0.d dVar;
        Reference poll;
        if (this.I != null) {
            c1.o oVar = n2.f8312u;
        }
        do {
            gVar = this.f8392t0;
            ReferenceQueue referenceQueue = (ReferenceQueue) gVar.f7528h;
            dVar = (i0.d) gVar.f7527g;
            poll = referenceQueue.poll();
            if (poll != null) {
                dVar.n(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(f1Var, (ReferenceQueue) gVar.f7528h));
    }

    public final void C(r1.d0 d0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (d0Var != null) {
            while (d0Var != null && d0Var.B.f7848r.f7816p == 1) {
                if (!this.K) {
                    r1.d0 s5 = d0Var.s();
                    if (s5 == null) {
                        break;
                    }
                    long j8 = ((r1.t) s5.A.f3892c).f7066i;
                    if (m2.a.f(j8) && m2.a.e(j8)) {
                        break;
                    }
                }
                d0Var = d0Var.s();
            }
            if (d0Var == getRoot()) {
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

    public final long D(long j8) {
        A();
        float d8 = y0.c.d(j8) - y0.c.d(this.U);
        float e9 = y0.c.e(j8) - y0.c.e(this.U);
        return z0.f0.b(u3.r.a(d8, e9), this.R);
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        if (this.A0) {
            this.A0 = false;
            int metaState = motionEvent.getMetaState();
            this.f8377m.getClass();
            s2.f8417b.setValue(new l1.z(metaState));
        }
        l1.e eVar = this.f8403z;
        androidx.room.c a3 = eVar.a(motionEvent, this);
        c0.w wVar = this.A;
        if (a3 == null) {
            wVar.d();
            return 0;
        }
        List list = (List) a3.f1069g;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                obj = list.get(size);
                if (((l1.y) obj).f5852e) {
                    break;
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
        }
        obj = null;
        l1.y yVar = (l1.y) obj;
        if (yVar != null) {
            this.f8363f = yVar.f5851d;
        }
        int c4 = wVar.c(a3, this, m(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (c4 & 1) != 0) {
            return c4;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        eVar.f5798c.delete(pointerId);
        eVar.f5797b.delete(pointerId);
        return c4;
    }

    public final void F(MotionEvent motionEvent, int i7, long j8, boolean z8) {
        int actionMasked = motionEvent.getActionMasked();
        int i8 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i8 = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            i8 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i8 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerPropertiesArr[i9] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerCoordsArr[i10] = new MotionEvent.PointerCoords();
        }
        int i11 = 0;
        while (i11 < pointerCount) {
            int i12 = ((i8 < 0 || i11 < i8) ? 0 : 1) + i11;
            motionEvent.getPointerProperties(i12, pointerPropertiesArr[i11]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i11];
            motionEvent.getPointerCoords(i12, pointerCoords);
            long p6 = p(u3.r.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = y0.c.d(p6);
            pointerCoords.y = y0.c.e(p6);
            i11++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j8 : motionEvent.getDownTime(), j8, i7, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z8 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.room.c a3 = this.f8403z.a(obtain, this);
        r6.k.c(a3);
        this.A.c(a3, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(q6.e eVar, j6.c cVar) {
        q qVar;
        int i7;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i8 = qVar.f8352h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f8352h = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f8350f;
                i7 = qVar.f8352h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    n nVar = new n(this, 2);
                    qVar.f8352h = 1;
                    if (c7.a0.d(new androidx.lifecycle.g0(nVar, this.f8368h0, eVar, (h6.d) null), qVar) == i6.a.f4956f) {
                        return;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                throw new b4.c();
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f8350f;
        i7 = qVar.f8352h;
        if (i7 != 0) {
        }
        throw new b4.c();
    }

    public final void H() {
        int[] iArr = this.O;
        getLocationOnScreen(iArr);
        long j8 = this.N;
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        boolean z8 = false;
        int i9 = iArr[0];
        if (i7 != i9 || i8 != iArr[1]) {
            this.N = a8.m.c(i9, iArr[1]);
            if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
                getRoot().B.f7848r.s0();
                z8 = true;
            }
        }
        this.L.a(z8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        t0.a aVar;
        if (Build.VERSION.SDK_INT < 26 || (aVar = this.C) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            AutofillValue f9 = b2.g.f(sparseArray.get(keyAt));
            t0.e eVar = t0.e.f8733a;
            if (eVar.d(f9)) {
                t0.g gVar = aVar.f8730b;
                eVar.i(f9).toString();
                if (gVar.f8735a.get(Integer.valueOf(keyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (eVar.b(f9)) {
                    throw new d6.i("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (eVar.c(f9)) {
                    throw new d6.i("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (eVar.e(f9)) {
                    throw new d6.i("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.v vVar) {
        setShowLayoutBounds(o1.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f8387r.e(false, i7, this.f8363f);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f8387r.e(true, i7, this.f8363f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z8;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        q(true);
        synchronized (q0.n.f7427b) {
            i.b0 b0Var = ((q0.b) q0.n.f7434i.get()).f7390h;
            if (b0Var != null) {
                z8 = b0Var.h();
            }
        }
        if (z8) {
            q0.n.a();
        }
        this.f8401y = true;
        z0.s sVar = this.f8379n;
        z0.d dVar = sVar.f10046a;
        Canvas canvas2 = dVar.f9984a;
        dVar.f9984a = canvas;
        getRoot().j(dVar, null);
        sVar.f10046a.f9984a = canvas2;
        if (!this.f8397w.isEmpty()) {
            int size = this.f8397w.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((r1.f1) this.f8397w.get(i7)).i();
            }
        }
        if (n2.f8316y) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f8397w.clear();
        this.f8401y = false;
        ArrayList arrayList = this.f8399x;
        if (arrayList != null) {
            this.f8397w.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        n1.a aVar;
        int size;
        g0.t tVar;
        s0.n nVar;
        g0.t tVar2;
        if (this.f8400x0) {
            androidx.lifecycle.c0 c0Var = this.f8398w0;
            removeCallbacks(c0Var);
            if (motionEvent.getActionMasked() == 8) {
                this.f8400x0 = false;
            } else {
                c0Var.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (l(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (i(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Method method = b3.u.f1368a;
            b3.t.b(viewConfiguration);
        } else {
            b3.u.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i7 >= 26) {
            b3.t.a(viewConfiguration);
        } else {
            b3.u.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        if (bVar.f717g.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        x0.r g9 = x0.d.g(bVar.f716f);
        if (g9 != null) {
            s0.n nVar2 = g9.f8104f;
            if (!nVar2.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            r1.d0 t2 = r1.f.t(g9);
            loop0: while (true) {
                if (t2 == null) {
                    nVar = null;
                    break;
                }
                if ((((s0.n) t2.A.f3895f).f8107i & 16384) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f8106h & 16384) != 0) {
                            i0.d dVar = null;
                            nVar = nVar2;
                            while (nVar != null) {
                                if (nVar instanceof n1.a) {
                                    break loop0;
                                }
                                if ((nVar.f8106h & 16384) != 0 && (nVar instanceof r1.m)) {
                                    int i8 = 0;
                                    for (s0.n nVar3 = ((r1.m) nVar).f7853t; nVar3 != null; nVar3 = nVar3.f8109k) {
                                        if ((nVar3.f8106h & 16384) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                nVar = nVar3;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar != null) {
                                                    dVar.b(nVar);
                                                    nVar = null;
                                                }
                                                dVar.b(nVar3);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                nVar = r1.f.f(dVar);
                            }
                        }
                        nVar2 = nVar2.f8108j;
                    }
                }
                t2 = t2.s();
                nVar2 = (t2 == null || (tVar2 = t2.A) == null) ? null : (r1.o1) tVar2.f3894e;
            }
            aVar = (n1.a) nVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            n1.a aVar2 = aVar;
            s0.n nVar4 = aVar2.f8104f;
            if (!nVar4.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            s0.n nVar5 = nVar4.f8108j;
            r1.d0 t8 = r1.f.t(aVar);
            ArrayList arrayList = null;
            while (t8 != null) {
                if ((((s0.n) t8.A.f3895f).f8107i & 16384) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f8106h & 16384) != 0) {
                            s0.n nVar6 = nVar5;
                            i0.d dVar2 = null;
                            while (nVar6 != null) {
                                if (nVar6 instanceof n1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVar6);
                                } else if ((nVar6.f8106h & 16384) != 0 && (nVar6 instanceof r1.m)) {
                                    int i9 = 0;
                                    for (s0.n nVar7 = ((r1.m) nVar6).f7853t; nVar7 != null; nVar7 = nVar7.f8109k) {
                                        if ((nVar7.f8106h & 16384) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                nVar6 = nVar7;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar6 != null) {
                                                    dVar2.b(nVar6);
                                                    nVar6 = null;
                                                }
                                                dVar2.b(nVar7);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                nVar6 = r1.f.f(dVar2);
                            }
                        }
                        nVar5 = nVar5.f8108j;
                    }
                }
                t8 = t8.s();
                nVar5 = (t8 == null || (tVar = t8.A) == null) ? null : (r1.o1) tVar.f3894e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i10 = size - 1;
                    ((n1.a) arrayList.get(size)).getClass();
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            s0.n nVar8 = aVar2.f8104f;
            i0.d dVar3 = null;
            while (nVar8 != null) {
                if (nVar8 instanceof n1.a) {
                } else if ((nVar8.f8106h & 16384) != 0 && (nVar8 instanceof r1.m)) {
                    int i11 = 0;
                    for (s0.n nVar9 = ((r1.m) nVar8).f7853t; nVar9 != null; nVar9 = nVar9.f8109k) {
                        if ((nVar9.f8106h & 16384) != 0) {
                            i11++;
                            if (i11 == 1) {
                                nVar8 = nVar9;
                            } else {
                                if (dVar3 == null) {
                                    dVar3 = new i0.d(new s0.n[16]);
                                }
                                if (nVar8 != null) {
                                    dVar3.b(nVar8);
                                    nVar8 = null;
                                }
                                dVar3.b(nVar9);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                nVar8 = r1.f.f(dVar3);
            }
            s0.n nVar10 = aVar2.f8104f;
            i0.d dVar4 = null;
            while (nVar10 != null) {
                if (nVar10 instanceof n1.a) {
                } else if ((nVar10.f8106h & 16384) != 0 && (nVar10 instanceof r1.m)) {
                    int i12 = 0;
                    for (s0.n nVar11 = ((r1.m) nVar10).f7853t; nVar11 != null; nVar11 = nVar11.f8109k) {
                        if ((nVar11.f8106h & 16384) != 0) {
                            i12++;
                            if (i12 == 1) {
                                nVar10 = nVar11;
                            } else {
                                if (dVar4 == null) {
                                    dVar4 = new i0.d(new s0.n[16]);
                                }
                                if (nVar10 != null) {
                                    dVar4.b(nVar10);
                                    nVar10 = null;
                                }
                                dVar4.b(nVar11);
                            }
                        }
                    }
                    if (i12 == 1) {
                    }
                }
                nVar10 = r1.f.f(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    m mVar = ((n1.a) arrayList.get(i13)).f6498s;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0143, code lost:
    
        if (o(r24) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        int i8;
        g0.t tVar;
        boolean z8;
        boolean z9 = this.f8400x0;
        androidx.lifecycle.c0 c0Var = this.f8398w0;
        if (z9) {
            removeCallbacks(c0Var);
            c0Var.run();
        }
        if (!l(motionEvent) && isAttachedToWindow()) {
            c0 c0Var2 = this.f8387r;
            r rVar = c0Var2.f8160d;
            AccessibilityManager accessibilityManager = c0Var2.f8163g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x8 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    rVar.q(true);
                    r1.r rVar2 = new r1.r();
                    r1.d0 root = rVar.getRoot();
                    long a3 = u3.r.a(x8, y4);
                    g0.t tVar2 = root.A;
                    r1.a1 a1Var = (r1.a1) tVar2.f3893d;
                    z0.n0 n0Var = r1.a1.J;
                    ((r1.a1) tVar2.f3893d).Q0(r1.a1.N, a1Var.J0(a3), rVar2, true, true);
                    s0.n nVar = (s0.n) e6.l.o0(rVar2);
                    r1.d0 t2 = nVar != null ? r1.f.t(nVar) : null;
                    if (t2 != null && (tVar = t2.A) != null && tVar.f(8)) {
                        y1.m b9 = u3.q.b(t2, false);
                        r1.a1 c4 = b9.c();
                        if (!(c4 != null ? c4.T0() : false)) {
                            if (!b9.f9840d.f9832f.containsKey(y1.p.f9871m)) {
                                z8 = true;
                                if (z8) {
                                    if (rVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(t2) != null) {
                                        throw new ClassCastException();
                                    }
                                    i7 = c0Var2.v(t2.f7720g);
                                    rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                                    i8 = c0Var2.f8161e;
                                    if (i8 != i7) {
                                        c0Var2.f8161e = i7;
                                        c0.z(c0Var2, i7, 128, null, 12);
                                        c0.z(c0Var2, i8, 256, null, 12);
                                    }
                                }
                            }
                        }
                        z8 = false;
                        if (z8) {
                        }
                    }
                    i7 = Integer.MIN_VALUE;
                    rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    i8 = c0Var2.f8161e;
                    if (i8 != i7) {
                    }
                } else if (action == 10) {
                    int i9 = c0Var2.f8161e;
                    if (i9 == Integer.MIN_VALUE) {
                        rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i9 != Integer.MIN_VALUE) {
                        c0Var2.f8161e = Integer.MIN_VALUE;
                        c0.z(c0Var2, Integer.MIN_VALUE, 128, null, 12);
                        c0.z(c0Var2, i9, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f8388r0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f8388r0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f8400x0 = true;
                        postDelayed(c0Var, 8L);
                        return false;
                    }
                }
                if ((i(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, new a0.b1(this, 8, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f8377m.getClass();
        s2.f8417b.setValue(new l1.z(metaState));
        return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, x0.f.f9603h) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        g0.t tVar;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (bVar.f717g.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            x0.r g9 = x0.d.g(bVar.f716f);
            if (g9 != null) {
                s0.n nVar = g9.f8104f;
                if (!nVar.f8116r) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                r1.d0 t2 = r1.f.t(g9);
                while (t2 != null) {
                    if ((((s0.n) t2.A.f3895f).f8107i & 131072) != 0) {
                        while (nVar != null) {
                            if ((nVar.f8106h & 131072) != 0) {
                                s0.n nVar2 = nVar;
                                i0.d dVar = null;
                                while (nVar2 != null) {
                                    if ((nVar2.f8106h & 131072) != 0 && (nVar2 instanceof r1.m)) {
                                        int i7 = 0;
                                        for (s0.n nVar3 = ((r1.m) nVar2).f7853t; nVar3 != null; nVar3 = nVar3.f8109k) {
                                            if ((nVar3.f8106h & 131072) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    nVar2 = nVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new i0.d(new s0.n[16]);
                                                    }
                                                    if (nVar2 != null) {
                                                        dVar.b(nVar2);
                                                        nVar2 = null;
                                                    }
                                                    dVar.b(nVar3);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    nVar2 = r1.f.f(dVar);
                                }
                            }
                            nVar = nVar.f8108j;
                        }
                    }
                    t2 = t2.s();
                    nVar = (t2 == null || (tVar = t2.A) == null) ? null : (r1.o1) tVar.f3894e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            d0.f8196a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8400x0) {
            androidx.lifecycle.c0 c0Var = this.f8398w0;
            removeCallbacks(c0Var);
            MotionEvent motionEvent2 = this.f8388r0;
            r6.k.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f8400x0 = false;
            } else {
                c0Var.run();
            }
        }
        if (!l(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int i7 = i(motionEvent);
            if ((i7 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((i7 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i7) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return h(this, i7);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i7));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        if (view != null) {
            y0.d d8 = x0.d.d(view);
            x0.b J = x0.d.J(i7);
            if (r6.k.a(((androidx.compose.ui.focus.b) getFocusOwner()).c(J != null ? J.f9595a : 6, d8, m.f8281i), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i7);
    }

    public final x0 getAndroidViewsHandler$ui_release() {
        if (this.H == null) {
            x0 x0Var = new x0(getContext());
            this.H = x0Var;
            addView(x0Var, -1);
            requestLayout();
        }
        x0 x0Var2 = this.H;
        r6.k.c(x0Var2);
        return x0Var2;
    }

    public t0.b getAutofill() {
        return this.C;
    }

    public t0.g getAutofillTree() {
        return this.f8395v;
    }

    public final q6.c getConfigurationChangeObserver() {
        return this.B;
    }

    public final u0.c getContentCaptureManager$ui_release() {
        return this.f8389s;
    }

    public h6.i getCoroutineContext() {
        return this.f8373k;
    }

    public m2.b getDensity() {
        return (m2.b) this.f8369i.getValue();
    }

    public v0.a getDragAndDropManager() {
        return this.f8375l;
    }

    public x0.g getFocusOwner() {
        return this.f8371j;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        d6.z zVar;
        y0.d v5 = v();
        if (v5 != null) {
            rect.left = Math.round(v5.f9780a);
            rect.top = Math.round(v5.f9781b);
            rect.right = Math.round(v5.f9782c);
            rect.bottom = Math.round(v5.f9783d);
            zVar = d6.z.f2639a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public f2.d getFontFamilyResolver() {
        return (f2.d) this.f8374k0.getValue();
    }

    public f2.c getFontLoader() {
        return this.f8372j0;
    }

    public z0.c0 getGraphicsContext() {
        return this.f8393u;
    }

    public h1.a getHapticFeedBack() {
        return this.f8380n0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.L.f7892b.m();
    }

    public i1.b getInputModeManager() {
        return this.f8382o0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.S;
    }

    @Override // android.view.View, android.view.ViewParent
    public m2.k getLayoutDirection() {
        return (m2.k) this.f8378m0.getValue();
    }

    public long getMeasureIteration() {
        r1.r0 r0Var = this.L;
        if (r0Var.f7893c) {
            return r0Var.f7897g;
        }
        a.a.L("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public q1.d getModifierLocalManager() {
        return this.f8384p0;
    }

    public p1.m0 getPlacementScope() {
        int i7 = p1.p0.f7074b;
        return new p1.c0(1, this);
    }

    public l1.s getPointerIconService() {
        return this.C0;
    }

    public r1.d0 getRoot() {
        return this.f8381o;
    }

    public r1.m1 getRootForTest() {
        return this.f8383p;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        x1.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.B0) == null) {
            return false;
        }
        return ((Boolean) jVar.f9666a.getValue()).booleanValue();
    }

    public y1.n getSemanticsOwner() {
        return this.f8385q;
    }

    public r1.f0 getSharedDrawScope() {
        return this.f8367h;
    }

    public boolean getShowLayoutBounds() {
        return this.G;
    }

    public r1.i1 getSnapshotObserver() {
        return this.F;
    }

    public h2 getSoftwareKeyboardController() {
        return this.f8370i0;
    }

    public g2.x getTextInputService() {
        return this.f8366g0;
    }

    public i2 getTextToolbar() {
        return this.f8386q0;
    }

    public l2 getViewConfiguration() {
        return this.M;
    }

    public final l getViewTreeOwners() {
        return (l) this.f8359a0.getValue();
    }

    public r2 getWindowInfo() {
        return this.f8377m;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017a), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:87:0x006b, B:89:0x0075, B:94:0x0085, B:97:0x00b4, B:13:0x00b7, B:21:0x00ca, B:23:0x00d0, B:98:0x008d, B:104:0x0099, B:107:0x00a1), top: B:86:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(MotionEvent motionEvent) {
        boolean z8;
        int actionMasked;
        MotionEvent motionEvent2;
        r rVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z9;
        MotionEvent motionEvent4;
        float[] fArr = this.Q;
        removeCallbacks(this.f8396v0);
        try {
            this.S = AnimationUtils.currentAnimationTimeMillis();
            this.f8404z0.a(this, fArr);
            j0.s(fArr, this.R);
            long b9 = z0.f0.b(u3.r.a(motionEvent.getX(), motionEvent.getY()), fArr);
            this.U = u3.r.a(motionEvent.getRawX() - y0.c.d(b9), motionEvent.getRawY() - y0.c.e(b9));
            boolean z10 = true;
            this.T = true;
            q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent5 = this.f8388r0;
                boolean z11 = motionEvent5 != null && motionEvent5.getToolType(0) == 3;
                c0.w wVar = this.A;
                if (motionEvent5 != null) {
                    try {
                        if (motionEvent5.getSource() == motionEvent.getSource() && motionEvent5.getToolType(0) == motionEvent.getToolType(0)) {
                            z8 = false;
                            if (z8) {
                                if (motionEvent5.getButtonState() != 0 || (actionMasked = motionEvent5.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent5;
                                    wVar.d();
                                } else if (motionEvent5.getActionMasked() != 10 && z11) {
                                    F(motionEvent5, 10, motionEvent5.getEventTime(), true);
                                    motionEvent2 = motionEvent5;
                                }
                                boolean z12 = motionEvent.getToolType(0) != 3;
                                if (z11 && z12 && actionMasked2 != 3 && actionMasked2 != 9 && m(motionEvent)) {
                                    rVar = this;
                                    rVar.F(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    rVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = rVar.f8388r0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent6 = rVar.f8388r0;
                                    pointerId = motionEvent6 == null ? motionEvent6.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    l1.e eVar = rVar.f8403z;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent7 = rVar.f8388r0;
                                            float x8 = motionEvent7 == null ? motionEvent7.getX() : Float.NaN;
                                            MotionEvent motionEvent8 = rVar.f8388r0;
                                            z9 = x8 == motionEvent.getX() || (motionEvent8 != null ? motionEvent8.getY() : Float.NaN) != motionEvent.getY();
                                            motionEvent4 = rVar.f8388r0;
                                            if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                                                z10 = false;
                                            }
                                            if (!z9 || z10) {
                                                if (pointerId >= 0) {
                                                    eVar.f5798c.delete(pointerId);
                                                    eVar.f5797b.delete(pointerId);
                                                }
                                                ((l1.i) ((b1.b) wVar.f1515c).f1231h).f5811a.h();
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        eVar.f5798c.delete(pointerId);
                                        eVar.f5797b.delete(pointerId);
                                    }
                                }
                                rVar.f8388r0 = MotionEvent.obtainNoHistory(motionEvent);
                                int E = E(motionEvent);
                                Trace.endSection();
                                rVar.T = false;
                                return E;
                            }
                        }
                        z8 = true;
                        if (z8) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent5;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z11) {
                }
                rVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = rVar.f8388r0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent62 = rVar.f8388r0;
                    if (motionEvent62 == null) {
                    }
                    action = motionEvent.getAction();
                    l1.e eVar2 = rVar.f8403z;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent72 = rVar.f8388r0;
                        if (motionEvent72 == null) {
                        }
                        MotionEvent motionEvent82 = rVar.f8388r0;
                        if (motionEvent82 != null) {
                        }
                        if (x8 == motionEvent.getX()) {
                        }
                        motionEvent4 = rVar.f8388r0;
                        if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                        }
                        if (!z9) {
                        }
                        if (pointerId >= 0) {
                        }
                        ((l1.i) ((b1.b) wVar.f1515c).f1231h).f5811a.h();
                    }
                }
                rVar.f8388r0 = MotionEvent.obtainNoHistory(motionEvent);
                int E2 = E(motionEvent);
                Trace.endSection();
                rVar.T = false;
                return E2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.T = false;
            throw th3;
        }
    }

    public final void k(r1.d0 d0Var) {
        int i7 = 0;
        this.L.o(d0Var, false);
        i0.d v5 = d0Var.v();
        int i8 = v5.f4842h;
        if (i8 > 0) {
            Object[] objArr = v5.f4840f;
            do {
                k((r1.d0) objArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y4 = motionEvent.getY();
        return 0.0f <= x8 && x8 <= ((float) getWidth()) && 0.0f <= y4 && y4 <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f8388r0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.x f9;
        androidx.lifecycle.v vVar;
        t0.a aVar;
        super.onAttachedToWindow();
        this.f8377m.f8418a.setValue(Boolean.valueOf(hasWindowFocus()));
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().f7802a.d();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && (aVar = this.C) != null) {
            t0.f.f8734a.a(aVar);
        }
        androidx.lifecycle.v f10 = androidx.lifecycle.q0.f(this);
        x3.f i8 = v1.g.i(this);
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f10 != null && i8 != null && (f10 != (vVar = viewTreeOwners.f8275a) || i8 != vVar))) {
            if (f10 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (i8 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (f9 = viewTreeOwners.f8275a.f()) != null) {
                f9.f(this);
            }
            f10.f().a(this);
            l lVar = new l(f10, i8);
            set_viewTreeOwners(lVar);
            q6.c cVar = this.b0;
            if (cVar != null) {
                cVar.f(lVar);
            }
            this.b0 = null;
        }
        this.f8382o0.f4855a.setValue(new i1.a(isInTouchMode() ? 1 : 2));
        l viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.x f11 = viewTreeOwners2 != null ? viewTreeOwners2.f8275a.f() : null;
        if (f11 == null) {
            a.a.N("No lifecycle owner exists");
            throw null;
        }
        f11.a(this);
        f11.a(this.f8389s);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f8360c0);
        getViewTreeObserver().addOnScrollChangedListener(this.f8361d0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f8362e0);
        if (i7 >= 31) {
            g0.f8234a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        s0.q qVar = (s0.q) this.f8368h0.get();
        p0 p0Var = (p0) (qVar != null ? qVar.f8118b : null);
        if (p0Var == null) {
            return this.f8364f0.f4078d;
        }
        s0.q qVar2 = (s0.q) p0Var.f8343i.get();
        p1 p1Var = (p1) (qVar2 != null ? qVar2.f8118b : null);
        return p1Var != null && (p1Var.f8348e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(j1.c.F(getContext()));
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f8376l0) {
            this.f8376l0 = i7 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(a8.m.r(getContext()));
        }
        this.B.f(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        int i8;
        int i9;
        s0.q qVar = (s0.q) this.f8368h0.get();
        p0 p0Var = (p0) (qVar != null ? qVar.f8118b : null);
        int i10 = 3;
        if (p0Var == null) {
            g2.z zVar = this.f8364f0;
            if (zVar.f4078d) {
                g2.m mVar = zVar.f4082h;
                g2.w wVar = zVar.f4081g;
                int i11 = mVar.f4046e;
                boolean z8 = mVar.f4042a;
                if (i11 != 1) {
                    if (i11 == 0) {
                        i7 = 1;
                    } else if (i11 == 2) {
                        i7 = 2;
                    } else if (i11 == 6) {
                        i7 = 5;
                    } else if (i11 == 5) {
                        i7 = 7;
                    } else if (i11 == 3) {
                        i7 = 3;
                    } else if (i11 == 4) {
                        i7 = 4;
                    } else {
                        if (i11 != 7) {
                            throw new IllegalStateException("invalid ImeAction");
                        }
                        i7 = 6;
                    }
                    editorInfo.imeOptions = i7;
                    i8 = mVar.f4045d;
                    if (i8 == 1) {
                    }
                    if (!z8) {
                    }
                    i9 = editorInfo.inputType;
                    if ((i9 & 1) == 1) {
                    }
                    long j8 = wVar.f4066b;
                    int i12 = a2.j0.f407c;
                    editorInfo.initialSelStart = (int) (j8 >> 32);
                    editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
                    a.a.I(editorInfo, wVar.f4065a.f373f);
                    editorInfo.imeOptions |= 33554432;
                    if (l3.k.c()) {
                    }
                    g2.s sVar = new g2.s(zVar.f4081g, new b6.c(16, zVar), zVar.f4082h.f4044c);
                    zVar.f4083i.add(new WeakReference(sVar));
                    return sVar;
                }
                if (!z8) {
                    i7 = 0;
                    editorInfo.imeOptions = i7;
                    i8 = mVar.f4045d;
                    if (i8 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i8 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i7;
                    } else if (i8 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i8 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i8 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i8 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i8 == 7) {
                        editorInfo.inputType = 129;
                    } else if (i8 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i8 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        editorInfo.inputType = 8194;
                    }
                    if (!z8) {
                        int i13 = editorInfo.inputType;
                        if ((i13 & 1) == 1) {
                            editorInfo.inputType = i13 | 131072;
                            if (i11 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i9 = editorInfo.inputType;
                    if ((i9 & 1) == 1) {
                        int i14 = mVar.f4043b;
                        if (i14 == 1) {
                            editorInfo.inputType = i9 | 4096;
                        } else if (i14 == 2) {
                            editorInfo.inputType = i9 | 8192;
                        } else if (i14 == 3) {
                            editorInfo.inputType = i9 | 16384;
                        }
                        if (mVar.f4044c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j82 = wVar.f4066b;
                    int i122 = a2.j0.f407c;
                    editorInfo.initialSelStart = (int) (j82 >> 32);
                    editorInfo.initialSelEnd = (int) (j82 & 4294967295L);
                    a.a.I(editorInfo, wVar.f4065a.f373f);
                    editorInfo.imeOptions |= 33554432;
                    if (l3.k.c()) {
                        l3.k.a().f(editorInfo);
                    }
                    g2.s sVar2 = new g2.s(zVar.f4081g, new b6.c(16, zVar), zVar.f4082h.f4044c);
                    zVar.f4083i.add(new WeakReference(sVar2));
                    return sVar2;
                }
                i7 = 6;
                editorInfo.imeOptions = i7;
                i8 = mVar.f4045d;
                if (i8 == 1) {
                }
                if (!z8) {
                }
                i9 = editorInfo.inputType;
                if ((i9 & 1) == 1) {
                }
                long j822 = wVar.f4066b;
                int i1222 = a2.j0.f407c;
                editorInfo.initialSelStart = (int) (j822 >> 32);
                editorInfo.initialSelEnd = (int) (j822 & 4294967295L);
                a.a.I(editorInfo, wVar.f4065a.f373f);
                editorInfo.imeOptions |= 33554432;
                if (l3.k.c()) {
                }
                g2.s sVar22 = new g2.s(zVar.f4081g, new b6.c(16, zVar), zVar.f4082h.f4044c);
                zVar.f4083i.add(new WeakReference(sVar22));
                return sVar22;
            }
        } else {
            s0.q qVar2 = (s0.q) p0Var.f8343i.get();
            p1 p1Var = (p1) (qVar2 != null ? qVar2.f8118b : null);
            if (p1Var != null) {
                synchronized (p1Var.f8346c) {
                    if (p1Var.f8348e) {
                        return null;
                    }
                    y.w a3 = p1Var.f8344a.a(editorInfo);
                    l0 l0Var = new l0(i10, p1Var);
                    InputConnection oVar = Build.VERSION.SDK_INT >= 34 ? new g2.o(a3, l0Var) : new g2.n(a3, l0Var);
                    p1Var.f8347d.b(new WeakReference(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        u0.c cVar = this.f8389s;
        cVar.getClass();
        u0.a.f8940a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t0.a aVar;
        super.onDetachedFromWindow();
        q0.t tVar = getSnapshotObserver().f7802a;
        e5.a aVar2 = tVar.f7460g;
        if (aVar2 != null) {
            aVar2.c();
        }
        tVar.b();
        l viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.x f9 = viewTreeOwners != null ? viewTreeOwners.f8275a.f() : null;
        if (f9 == null) {
            a.a.N("No lifecycle owner exists");
            throw null;
        }
        f9.f(this.f8389s);
        f9.f(this);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && (aVar = this.C) != null) {
            t0.f.f8734a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f8360c0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f8361d0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f8362e0);
        if (i7 >= 31) {
            g0.f8234a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        if (z8 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        x0.r rVar = bVar.f716f;
        a0.s0 s0Var = bVar.f718h;
        if (s0Var.f136b) {
            x0.d.e(rVar, true);
            return;
        }
        try {
            s0Var.f136b = true;
            x0.d.e(rVar, true);
        } finally {
            a0.s0.b(s0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
        this.L.i(this.f8402y0);
        this.J = null;
        H();
        if (this.H != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        r1.r0 r0Var = this.L;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long g9 = g(i7);
            int i9 = (int) (g9 >>> 32);
            int i10 = (int) (g9 & 4294967295L);
            long g10 = g(i8);
            int i11 = (int) (4294967295L & g10);
            int min = Math.min((int) (g10 >>> 32), 262142);
            int i12 = Integer.MAX_VALUE;
            int min2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int l8 = r4.a.l(min2 == Integer.MAX_VALUE ? min : min2);
            if (i10 != Integer.MAX_VALUE) {
                i12 = Math.min(l8, i10);
            }
            long b9 = r4.a.b(Math.min(l8, i9), i12, min, min2);
            m2.a aVar = this.J;
            if (aVar == null) {
                this.J = new m2.a(b9);
                this.K = false;
            } else if (!m2.a.b(aVar.f6306a, b9)) {
                this.K = true;
            }
            r0Var.p(b9);
            r0Var.k();
            setMeasuredDimension(getRoot().B.f7848r.f7063f, getRoot().B.f7848r.f7064g);
            if (this.H != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().B.f7848r.f7063f, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().B.f7848r.f7064g, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        t0.a aVar;
        if (Build.VERSION.SDK_INT < 26 || viewStructure == null || (aVar = this.C) == null) {
            return;
        }
        t0.g gVar = aVar.f8730b;
        int size = gVar.f8735a.size();
        t0.c cVar = t0.c.f8732a;
        int a3 = cVar.a(viewStructure, size);
        for (Map.Entry entry : gVar.f8735a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b9 = cVar.b(viewStructure, a3);
            if (b9 != null) {
                t0.e eVar = t0.e.f8733a;
                AutofillId a9 = eVar.a(viewStructure);
                r6.k.c(a9);
                eVar.g(b9, a9, intValue);
                cVar.d(b9, intValue, aVar.f8729a.getContext().getPackageName(), null, null);
                eVar.h(b9, 1);
                throw null;
            }
            a3++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        if (this.f8365g) {
            m2.k kVar = m2.k.f6322f;
            m2.k kVar2 = i7 != 0 ? i7 != 1 ? null : m2.k.f6323g : kVar;
            if (kVar2 != null) {
                kVar = kVar2;
            }
            setLayoutDirection(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        x1.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.B0) == null) {
            return;
        }
        jVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        u0.c cVar = this.f8389s;
        cVar.getClass();
        u0.a.f8940a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        boolean a3;
        this.f8377m.f8418a.setValue(Boolean.valueOf(z8));
        this.A0 = true;
        super.onWindowFocusChanged(z8);
        if (!z8 || getShowLayoutBounds() == (a3 = o1.a())) {
            return;
        }
        setShowLayoutBounds(a3);
        j(getRoot());
    }

    public final long p(long j8) {
        A();
        long b9 = z0.f0.b(j8, this.Q);
        return u3.r.a(y0.c.d(this.U) + y0.c.d(b9), y0.c.e(this.U) + y0.c.e(b9));
    }

    public final void q(boolean z8) {
        p pVar;
        r1.r0 r0Var = this.L;
        if (r0Var.f7892b.m() || ((i0.d) r0Var.f7895e.f7527g).m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z8) {
                try {
                    pVar = this.f8402y0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                pVar = null;
            }
            if (r0Var.i(pVar)) {
                requestLayout();
            }
            r0Var.a(false);
            Trace.endSection();
        }
    }

    public final void r(r1.d0 d0Var, long j8) {
        r1.r0 r0Var = this.L;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            r0Var.j(d0Var, j8);
            if (!r0Var.f7892b.m()) {
                r0Var.a(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f716f.B0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i7, rect);
        }
        if (ordinal != 3) {
            throw new b4.c();
        }
        x0.b J = x0.d.J(i7);
        int i8 = J != null ? J.f9595a : 7;
        Boolean c4 = ((androidx.compose.ui.focus.b) getFocusOwner()).c(i8, rect != null ? new y0.d(rect.left, rect.top, rect.right, rect.bottom) : null, new m(i8));
        if (c4 != null) {
            return c4.booleanValue();
        }
        return false;
    }

    public final void s(r1.f1 f1Var, boolean z8) {
        ArrayList arrayList = this.f8397w;
        if (!z8) {
            if (this.f8401y) {
                return;
            }
            arrayList.remove(f1Var);
            ArrayList arrayList2 = this.f8399x;
            if (arrayList2 != null) {
                arrayList2.remove(f1Var);
                return;
            }
            return;
        }
        if (!this.f8401y) {
            arrayList.add(f1Var);
            return;
        }
        ArrayList arrayList3 = this.f8399x;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f8399x = arrayList3;
        }
        arrayList3.add(f1Var);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j8) {
        this.f8387r.f8164h = j8;
    }

    public final void setConfigurationChangeObserver(q6.c cVar) {
        this.B = cVar;
    }

    public final void setContentCaptureManager$ui_release(u0.c cVar) {
        this.f8389s = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(h6.i iVar) {
        int i7;
        int i8;
        this.f8373k = iVar;
        s0.n nVar = (s0.n) getRoot().A.f3895f;
        if (nVar instanceof l1.d0) {
            ((l1.d0) nVar).C0();
        }
        s0.n nVar2 = nVar.f8104f;
        if (!nVar2.f8116r) {
            a.a.M("visitSubtree called on an unattached node");
            throw null;
        }
        s0.n nVar3 = nVar2.f8109k;
        r1.d0 t2 = r1.f.t(nVar);
        int[] iArr = new int[16];
        i0.d[] dVarArr = new i0.d[16];
        int i9 = 0;
        while (t2 != null) {
            if (nVar3 == null) {
                nVar3 = (s0.n) t2.A.f3895f;
            }
            if ((nVar3.f8107i & 16) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f8106h & 16) != 0) {
                        r1.m mVar = nVar3;
                        ?? r9 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof r1.l1) {
                                r1.l1 l1Var = (r1.l1) mVar;
                                if (l1Var instanceof l1.d0) {
                                    ((l1.d0) l1Var).C0();
                                }
                            } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof r1.m)) {
                                s0.n nVar4 = mVar.f7853t;
                                int i10 = 0;
                                mVar = mVar;
                                r9 = r9;
                                while (nVar4 != null) {
                                    if ((nVar4.f8106h & 16) != 0) {
                                        i10++;
                                        r9 = r9;
                                        if (i10 == 1) {
                                            mVar = nVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new i0.d(new s0.n[16]);
                                            }
                                            if (mVar != 0) {
                                                r9.b(mVar);
                                                mVar = 0;
                                            }
                                            r9.b(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f8109k;
                                    mVar = mVar;
                                    r9 = r9;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVar = r1.f.f(r9);
                        }
                    }
                    nVar3 = nVar3.f8109k;
                }
            }
            i0.d v5 = t2.v();
            if (!v5.l()) {
                if (i9 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    r6.k.e(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    r6.k.e(copyOf, "copyOf(this, newSize)");
                    dVarArr = (i0.d[]) copyOf;
                }
                iArr[i9] = v5.f4842h - 1;
                dVarArr[i9] = v5;
                i9++;
            }
            if (i9 <= 0 || (i8 = iArr[i9 - 1]) < 0) {
                t2 = null;
            } else {
                if (i9 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                i0.d dVar = dVarArr[i7];
                r6.k.c(dVar);
                if (i8 > 0) {
                    iArr[i7] = iArr[i7] - 1;
                } else if (i8 == 0) {
                    dVarArr[i7] = null;
                    i9--;
                }
                t2 = (r1.d0) dVar.f4840f[i8];
            }
            nVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j8) {
        this.S = j8;
    }

    public final void setOnViewTreeOwnersAvailable(q6.c cVar) {
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.f(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.b0 = cVar;
    }

    public void setShowLayoutBounds(boolean z8) {
        this.G = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void u() {
        if (this.D) {
            q0.t tVar = getSnapshotObserver().f7802a;
            synchronized (tVar.f7459f) {
                try {
                    i0.d dVar = tVar.f7459f;
                    int i7 = dVar.f4842h;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        q0.s sVar = (q0.s) dVar.f4840f[i9];
                        sVar.e();
                        if (!(sVar.f7447f.f4816e != 0)) {
                            i8++;
                        } else if (i8 > 0) {
                            Object[] objArr = dVar.f4840f;
                            objArr[i9 - i8] = objArr[i9];
                        }
                    }
                    int i10 = i7 - i8;
                    Arrays.fill(dVar.f4840f, i10, i7, (Object) null);
                    dVar.f4842h = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.D = false;
        }
        x0 x0Var = this.H;
        if (x0Var != null) {
            f(x0Var);
        }
        while (this.f8394u0.m()) {
            int i11 = this.f8394u0.f4842h;
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = this.f8394u0.f4840f;
                q6.a aVar = (q6.a) objArr2[i12];
                objArr2[i12] = null;
                if (aVar != null) {
                    aVar.a();
                }
            }
            this.f8394u0.p(0, i11);
        }
    }

    public final y0.d v() {
        if (isFocused()) {
            x0.r g9 = x0.d.g(((androidx.compose.ui.focus.b) getFocusOwner()).f716f);
            if (g9 != null) {
                return x0.d.j(g9);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return x0.d.d(findFocus);
        }
        return null;
    }

    public final void w(r1.d0 d0Var) {
        c0 c0Var = this.f8387r;
        c0Var.f8181y = true;
        if (c0Var.p()) {
            c0Var.r(d0Var);
        }
        u0.c cVar = this.f8389s;
        cVar.f8953m = true;
        if (cVar.e() && cVar.f8954n.add(d0Var)) {
            cVar.f8955o.e(d6.z.f2639a);
        }
    }

    public final void x(r1.d0 d0Var, boolean z8, boolean z9, boolean z10) {
        r1.d0 s5;
        r1.d0 s8;
        r1.i0 i0Var;
        r1.e0 e0Var;
        r1.r0 r0Var = this.L;
        if (!z8) {
            if (r0Var.o(d0Var, z9) && z10) {
                C(d0Var);
                return;
            }
            return;
        }
        q5.g gVar = r0Var.f7892b;
        r1.d0 d0Var2 = d0Var.f7721h;
        r1.l0 l0Var = d0Var.B;
        if (d0Var2 == null) {
            a.a.M("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        int d8 = l.h.d(l0Var.f7833c);
        if (d8 != 0) {
            if (d8 == 1) {
                return;
            }
            if (d8 != 2 && d8 != 3) {
                if (d8 != 4) {
                    throw new b4.c();
                }
                if (!l0Var.f7837g || z9) {
                    l0Var.f7837g = true;
                    l0Var.f7834d = true;
                    if (d0Var.I) {
                        return;
                    }
                    if ((r6.k.a(d0Var.G(), Boolean.TRUE) || (l0Var.f7837g && (d0Var.q() == 1 || !((i0Var = l0Var.f7849s) == null || (e0Var = i0Var.f7797v) == null || !e0Var.e())))) && ((s5 = d0Var.s()) == null || !s5.B.f7837g)) {
                        gVar.f(d0Var, true);
                    } else if ((d0Var.F() || (l0Var.f7834d && r1.r0.h(d0Var))) && ((s8 = d0Var.s()) == null || !s8.B.f7834d)) {
                        gVar.f(d0Var, false);
                    }
                    if (r0Var.f7894d || !z10) {
                        return;
                    }
                    C(d0Var);
                    return;
                }
                return;
            }
        }
        r0Var.f7898h.b(new r1.q0(d0Var, true, z9));
    }

    public final void y(r1.d0 d0Var, boolean z8, boolean z9) {
        r1.l0 l0Var = d0Var.B;
        r1.r0 r0Var = this.L;
        if (!z8) {
            r0Var.getClass();
            int d8 = l.h.d(l0Var.f7833c);
            if (d8 == 0 || d8 == 1 || d8 == 2 || d8 == 3) {
                return;
            }
            if (d8 != 4) {
                throw new b4.c();
            }
            if (!z9 && d0Var.F() == l0Var.f7848r.f7824x && (l0Var.f7834d || l0Var.f7835e)) {
                return;
            }
            l0Var.f7835e = true;
            l0Var.f7836f = true;
            if (!d0Var.I && l0Var.f7848r.f7824x) {
                r1.d0 s5 = d0Var.s();
                if ((s5 == null || !s5.B.f7835e) && (s5 == null || !s5.B.f7834d)) {
                    r0Var.f7892b.f(d0Var, false);
                }
                if (r0Var.f7894d) {
                    return;
                }
                C(null);
                return;
            }
            return;
        }
        q5.g gVar = r0Var.f7892b;
        int d9 = l.h.d(l0Var.f7833c);
        if (d9 != 0) {
            if (d9 == 1) {
                return;
            }
            if (d9 != 2) {
                if (d9 == 3) {
                    return;
                }
                if (d9 != 4) {
                    throw new b4.c();
                }
            }
        }
        if ((l0Var.f7837g || l0Var.f7838h) && !z9) {
            return;
        }
        l0Var.f7838h = true;
        l0Var.f7839i = true;
        l0Var.f7835e = true;
        l0Var.f7836f = true;
        if (d0Var.I) {
            return;
        }
        r1.d0 s8 = d0Var.s();
        if (r6.k.a(d0Var.G(), Boolean.TRUE) && ((s8 == null || !s8.B.f7837g) && (s8 == null || !s8.B.f7838h))) {
            gVar.f(d0Var, true);
        } else if (d0Var.F() && ((s8 == null || !s8.B.f7835e) && (s8 == null || !s8.B.f7834d))) {
            gVar.f(d0Var, false);
        }
        if (r0Var.f7894d) {
            return;
        }
        C(null);
    }

    public final void z() {
        c0 c0Var = this.f8387r;
        c0Var.f8181y = true;
        if (c0Var.p() && !c0Var.J) {
            c0Var.J = true;
            c0Var.f8168l.post(c0Var.K);
        }
        u0.c cVar = this.f8389s;
        cVar.f8953m = true;
        if (!cVar.e() || cVar.f8961u) {
            return;
        }
        cVar.f8961u = true;
        cVar.f8956p.post(cVar.f8962v);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        r6.k.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    public g getAccessibilityManager() {
        return this.f8391t;
    }

    public h getClipboardManager() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i7;
        generateDefaultLayoutParams.height = i8;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @d6.c
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
