package x1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import x1.t;
import x1.t0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends ViewGroup implements w1.k1, w1.r1, androidx.lifecycle.f, w1.i1 {
    public static Class I0;
    public static Method J0;
    public static Method K0;
    public static final o.e0 L0 = new o.e0();
    public static l M0;
    public static Method N0;
    public final ArrayList A;
    public final a1.a A0;
    public ArrayList B;
    public boolean B0;
    public boolean C;
    public final r C0;
    public final q1.c D;
    public final u0 D0;
    public final i0.h E;
    public boolean E0;
    public p6.c F;
    public final c2.k F0;
    public final c5.x G;
    public View G0;
    public final z0.b H;
    public final k1 H0;
    public boolean I;
    public final h J;
    public final g K;
    public final w1.m1 L;
    public boolean M;
    public q0 N;
    public r2.a O;
    public boolean P;
    public final w1.u0 Q;
    public long R;
    public final int[] S;
    public final float[] T;
    public final float[] U;
    public long V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public long f8541a0;

    /* renamed from: b0, reason: collision with root package name */
    public final m0.h1 f8542b0;

    /* renamed from: c0, reason: collision with root package name */
    public final m0.e0 f8543c0;

    /* renamed from: d, reason: collision with root package name */
    public long f8544d;

    /* renamed from: d0, reason: collision with root package name */
    public p6.c f8545d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8546e;

    /* renamed from: e0, reason: collision with root package name */
    public final i f8547e0;

    /* renamed from: f, reason: collision with root package name */
    public final w1.h0 f8548f;

    /* renamed from: f0, reason: collision with root package name */
    public final j f8549f0;

    /* renamed from: g, reason: collision with root package name */
    public final m0.h1 f8550g;

    /* renamed from: g0, reason: collision with root package name */
    public final k f8551g0;

    /* renamed from: h, reason: collision with root package name */
    public final View f8552h;

    /* renamed from: h0, reason: collision with root package name */
    public final k2.c f8553h0;
    public final boolean i;

    /* renamed from: i0, reason: collision with root package name */
    public final k2.d f8554i0;

    /* renamed from: j, reason: collision with root package name */
    public final d1.i f8555j;

    /* renamed from: j0, reason: collision with root package name */
    public final AtomicReference f8556j0;

    /* renamed from: k, reason: collision with root package name */
    public g6.h f8557k;

    /* renamed from: k0, reason: collision with root package name */
    public final k1 f8558k0;

    /* renamed from: l, reason: collision with root package name */
    public final b1.a f8559l;

    /* renamed from: l0, reason: collision with root package name */
    public final k1 f8560l0;

    /* renamed from: m, reason: collision with root package name */
    public final c2.k f8561m;

    /* renamed from: m0, reason: collision with root package name */
    public final m0.h1 f8562m0;

    /* renamed from: n, reason: collision with root package name */
    public final f1.r f8563n;

    /* renamed from: n0, reason: collision with root package name */
    public int f8564n0;

    /* renamed from: o, reason: collision with root package name */
    public final p0 f8565o;

    /* renamed from: o0, reason: collision with root package name */
    public final m0.h1 f8566o0;

    /* renamed from: p, reason: collision with root package name */
    public final u1.o f8567p;

    /* renamed from: p0, reason: collision with root package name */
    public final m1.b f8568p0;

    /* renamed from: q, reason: collision with root package name */
    public final w1.f0 f8569q;

    /* renamed from: q0, reason: collision with root package name */
    public final n1.c f8570q0;

    /* renamed from: r, reason: collision with root package name */
    public final o.x f8571r;

    /* renamed from: r0, reason: collision with root package name */
    public final v1.d f8572r0;

    /* renamed from: s, reason: collision with root package name */
    public final e2.a f8573s;

    /* renamed from: s0, reason: collision with root package name */
    public final k1 f8574s0;

    /* renamed from: t, reason: collision with root package name */
    public final t f8575t;

    /* renamed from: t0, reason: collision with root package name */
    public MotionEvent f8576t0;

    /* renamed from: u, reason: collision with root package name */
    public final d2.p f8577u;

    /* renamed from: u0, reason: collision with root package name */
    public long f8578u0;

    /* renamed from: v, reason: collision with root package name */
    public final a0 f8579v;

    /* renamed from: v0, reason: collision with root package name */
    public final a0.a0 f8580v0;

    /* renamed from: w, reason: collision with root package name */
    public a1.h f8581w;

    /* renamed from: w0, reason: collision with root package name */
    public final o.e0 f8582w0;

    /* renamed from: x, reason: collision with root package name */
    public final f f8583x;

    /* renamed from: x0, reason: collision with root package name */
    public float f8584x0;

    /* renamed from: y, reason: collision with root package name */
    public final f1.f f8585y;

    /* renamed from: y0, reason: collision with root package name */
    public float f8586y0;

    /* renamed from: z, reason: collision with root package name */
    public final z0.j f8587z;

    /* renamed from: z0, reason: collision with root package name */
    public final h4.b f8588z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v33, types: [x1.i] */
    /* JADX WARN: Type inference failed for: r1v34, types: [x1.j] */
    /* JADX WARN: Type inference failed for: r1v35, types: [x1.k] */
    public t(Context context, g6.h hVar) {
        super(context);
        c5.x xVar;
        z0.b bVar;
        final t tVar = this;
        tVar.f8544d = 9205357640488583168L;
        int i = 1;
        tVar.f8546e = true;
        tVar.f8548f = new w1.h0();
        r2.e a8 = h0.a.a(context);
        m0.v0 v0Var = m0.v0.f5134g;
        tVar.f8550g = new m0.h1(a8, v0Var);
        int i8 = Build.VERSION.SDK_INT;
        int i9 = 0;
        boolean z3 = i8 >= 35;
        tVar.i = z3;
        d2.d dVar = new d2.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        w1.x0 x0Var = new w1.x0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // w1.x0
            public final l f() {
                t0 t0Var = new t0();
                t0Var.f8589r = t.this;
                return t0Var;
            }

            @Override // w1.x0
            public final void g(l lVar) {
                ((t0) lVar).f8589r = t.this;
            }

            public final int hashCode() {
                return t.this.hashCode();
            }
        };
        tVar.f8555j = new d1.i(tVar, tVar);
        tVar.f8557k = hVar;
        tVar.f8559l = new b1.a();
        tVar.f8561m = new c2.k(1);
        y0.m a9 = androidx.compose.ui.input.key.a.a(new p(tVar, i9));
        y0.m a10 = androidx.compose.ui.input.rotary.a.a();
        tVar.f8563n = new f1.r();
        tVar.f8565o = new p0(ViewConfiguration.get(context));
        u1.o oVar = new u1.o();
        tVar.f8567p = oVar;
        w1.f0 f0Var = new w1.f0(3);
        u1.e0 e0Var = f0Var.f7658x;
        u1.o0 o0Var = u1.o0.f7254a;
        if (!q6.i.a(e0Var, o0Var)) {
            f0Var.f7658x = o0Var;
            f0Var.C();
        }
        f0Var.Y(tVar.getDensity());
        f0Var.c0(tVar.getViewConfiguration());
        f0Var.b0(androidx.compose.ui.layout.b.b(oVar).d(emptySemanticsElement).d(a10).d(a9).d(((d1.i) tVar.getFocusOwner()).f2070e).d(tVar.m10getDragAndDropManager().f1048c).d(x0Var));
        tVar.f8569q = f0Var;
        o.x xVar2 = o.m.f5510a;
        tVar.f8571r = new o.x();
        tVar.getLayoutNodes();
        tVar.f8573s = new e2.a();
        tVar.f8575t = tVar;
        tVar.f8577u = new d2.p(tVar.getRoot(), dVar, tVar.getLayoutNodes());
        a0 a0Var = new a0(tVar);
        tVar.f8579v = a0Var;
        tVar.f8581w = new a1.h(tVar, new d1.e(0, tVar, g0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 2));
        f fVar = new f();
        Object systemService = context.getSystemService("accessibility");
        q6.i.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        tVar.f8583x = fVar;
        tVar.f8585y = new f1.f(tVar);
        tVar.f8587z = new z0.j();
        tVar.A = new ArrayList();
        tVar.D = new q1.c();
        w1.f0 root = tVar.getRoot();
        i0.h hVar2 = new i0.h();
        hVar2.f3283b = root;
        hVar2.f3284c = new q1.b(root.F.f7597c);
        hVar2.f3285d = new b1.b(27);
        hVar2.f3286e = new w1.p();
        tVar.E = hVar2;
        tVar.F = n.f8510f;
        if (g()) {
            z0.j autofillTree = tVar.getAutofillTree();
            xVar = new c5.x();
            xVar.f1737d = tVar;
            xVar.f1738e = autofillTree;
            AutofillManager e8 = a1.d.e(tVar.getContext().getSystemService(a1.d.g()));
            if (e8 == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            xVar.f1739f = e8;
            tVar.setImportantForAutofill(1);
            q0.e A = r2.o.A(tVar);
            AutofillId a11 = A != null ? z0.f.a(A.f5938a) : null;
            if (a11 == null) {
                throw a0.q.f("Required value was null.");
            }
            xVar.f1740g = a11;
        } else {
            xVar = null;
        }
        tVar.G = xVar;
        if (g()) {
            AutofillManager e9 = a1.d.e(context.getSystemService(a1.d.g()));
            if (e9 == null) {
                throw a0.q.f("Autofill service could not be located.");
            }
            tVar = this;
            bVar = new z0.b(new q3.k(19, e9), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            bVar = null;
        }
        tVar.H = bVar;
        tVar.J = new h(context);
        tVar.m9getClipboardManager();
        tVar.K = new g();
        tVar.L = new w1.m1(new p(tVar, i));
        tVar.Q = new w1.u0(tVar.getRoot());
        long j7 = Integer.MAX_VALUE;
        tVar.R = (j7 & 4294967295L) | (j7 << 32);
        tVar.S = new int[]{0, 0};
        float[] i10 = f1.p.i();
        tVar.T = f1.p.i();
        tVar.U = f1.p.i();
        tVar.V = -1L;
        tVar.f8541a0 = 9187343241974906880L;
        tVar.f8542b0 = m0.b.q(null);
        tVar.f8543c0 = m0.b.n(new r(tVar, i));
        tVar.f8547e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: x1.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                t.this.H();
            }
        };
        tVar.f8549f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: x1.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                t.this.H();
            }
        };
        tVar.f8551g0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: x1.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z7) {
                t.this.f8570q0.f5304a.setValue(new n1.a(z7 ? 1 : 2));
            }
        };
        tVar.f8553h0 = new k2.c(tVar.getView(), tVar);
        k2.d dVar2 = new k2.d();
        new AtomicReference(null);
        tVar.f8554i0 = dVar2;
        tVar.f8556j0 = new AtomicReference(null);
        tVar.getTextInputService();
        tVar.f8558k0 = new k1();
        tVar.f8560l0 = new k1();
        tVar.f8562m0 = new m0.h1(h0.a.r(context), v0Var);
        tVar.f8564n0 = i8 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        r2.l lVar = r2.l.f6529d;
        r2.l lVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : r2.l.f6530e : lVar;
        tVar.f8566o0 = m0.b.q(lVar2 != null ? lVar2 : lVar);
        tVar.f8568p0 = new m1.b();
        tVar.f8570q0 = new n1.c(tVar.isInTouchMode() ? 1 : 2);
        tVar.f8572r0 = new v1.d(tVar);
        tVar.f8574s0 = new k1();
        tVar.f8580v0 = new a0.a0(29);
        tVar.f8582w0 = new o.e0();
        int i11 = 10;
        tVar.f8588z0 = new h4.b(i11, tVar);
        tVar.A0 = new a1.a(i11, tVar);
        tVar.C0 = new r(tVar, 0);
        tVar.D0 = i8 < 29 ? new a0.a0(i10) : new v0();
        tVar.addOnAttachStateChangeListener(tVar.f8581w);
        tVar.setWillNotDraw(false);
        tVar.setFocusable(true);
        if (i8 >= 26) {
            f0.f8407a.a(tVar, 1, false);
        }
        tVar.setFocusableInTouchMode(true);
        tVar.setClipChildren(false);
        q3.k0.k(tVar, a0Var);
        tVar.setOnDragListener(tVar.m10getDragAndDropManager());
        tVar.getRoot().d(tVar);
        if (i8 >= 29) {
            c0.f8390a.a(tVar);
        }
        if (z3) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            tVar.f8552h = view;
            tVar.addView(view, -1);
        }
        tVar.F0 = i8 >= 31 ? new c2.k(0) : null;
        k1 k1Var = new k1();
        q1.i.f5993a.getClass();
        tVar.H0 = k1Var;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m get_viewTreeOwners() {
        return (m) this.f8542b0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof t) {
                ((t) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j7 = size;
        return j7 | (j7 << 32);
    }

    public static View j(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (q6.i.a(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View j7 = j(viewGroup.getChildAt(i8), i);
                    if (j7 != null) {
                        return j7;
                    }
                }
            }
        }
        return null;
    }

    public static void m(w1.f0 f0Var) {
        f0Var.B();
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            m((w1.f0) objArr[i8]);
        }
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z3 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z3) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z3 = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !n1.f8516a.a(motionEvent, i));
                if (z3) {
                    break;
                }
            }
        }
        return z3;
    }

    private void setDensity(r2.c cVar) {
        this.f8550g.setValue(cVar);
    }

    private void setFontFamilyResolver(j2.d dVar) {
        this.f8562m0.setValue(dVar);
    }

    private void setLayoutDirection(r2.l lVar) {
        this.f8566o0.setValue(lVar);
    }

    private final void set_viewTreeOwners(m mVar) {
        this.f8542b0.setValue(mVar);
    }

    public final void A() {
        if (this.W) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.V) {
            this.V = currentAnimationTimeMillis;
            u0 u0Var = this.D0;
            float[] fArr = this.T;
            u0Var.b(this, fArr);
            g0.n(fArr, this.U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.S;
            view.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f8 = iArr[1];
            view.getLocationInWindow(iArr);
            float f9 = iArr[0];
            float f10 = f8 - iArr[1];
            this.f8541a0 = (Float.floatToRawIntBits(f6 - f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.V = AnimationUtils.currentAnimationTimeMillis();
        u0 u0Var = this.D0;
        float[] fArr = this.T;
        u0Var.b(this, fArr);
        g0.n(fArr, this.U);
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        long m7 = f1.p.m(fArr, (Float.floatToRawIntBits(x7) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m7 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m7 & 4294967295L));
        this.f8541a0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean C() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void D(w1.f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.q() == w1.d0.f7610d) {
                if (!this.P) {
                    w1.f0 s5 = f0Var.s();
                    if (s5 == null) {
                        break;
                    }
                    long j7 = s5.F.f7597c.f7233g;
                    if (r2.a.f(j7) && r2.a.e(j7)) {
                        break;
                    }
                }
                f0Var = f0Var.s();
            }
            if (f0Var == getRoot()) {
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

    public final long E(long j7) {
        A();
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (this.f8541a0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (this.f8541a0 & 4294967295L));
        return f1.p.m(this.U, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.E0) {
            this.E0 = false;
            int metaState = motionEvent.getMetaState();
            this.f8561m.getClass();
            x1.f8604a.setValue(new q1.p(metaState));
        }
        q1.c cVar = this.D;
        a0.a0 a8 = cVar.a(motionEvent, this);
        i0.h hVar = this.E;
        if (a8 == null) {
            if (!hVar.f3282a) {
                ((o.q) ((b1.b) hVar.f3285d).f1050e).a();
                ((q1.b) hVar.f3284c).c();
            }
            return 0;
        }
        List list = (List) a8.f11e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((q1.m) obj).f6015e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        q1.m mVar = (q1.m) obj;
        if (mVar != null) {
            this.f8544d = mVar.f6014d;
        }
        int a9 = hVar.a(a8, this, p(motionEvent));
        a8.f12f = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (a9 & 1) != 0) {
            return a9;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        cVar.f5973c.delete(pointerId);
        cVar.f5972b.delete(pointerId);
        return a9;
    }

    public final void G(MotionEvent motionEvent, int i, long j7, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int i8 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i8 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
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
            float f6 = pointerCoords.x;
            long r7 = r((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (r7 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (r7 & 4294967295L));
            i11++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j7 : motionEvent.getDownTime(), j7, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        a0.a0 a8 = this.D.a(obtain, this);
        q6.i.b(a8);
        this.E.a(a8, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        boolean z3;
        View view;
        long j7;
        long K;
        float[] fArr;
        int c8;
        e2.b bVar;
        boolean z7;
        long j8;
        int[] iArr = this.S;
        getLocationOnScreen(iArr);
        long j9 = this.R;
        int i = (int) (j9 >> 32);
        int i8 = (int) (j9 & 4294967295L);
        int i9 = iArr[0];
        if (i != i9 || i8 != iArr[1] || this.V < 0) {
            this.R = (i9 << 32) | (iArr[1] & 4294967295L);
            if (i != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
                getRoot().G.f7700p.g0();
                z3 = true;
                A();
                view = this.G0;
                if (view == null) {
                    view = getRootView();
                    this.G0 = view;
                }
                e2.a rectManager = getRectManager();
                j7 = this.R;
                K = m.a.K(this.f8541a0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.T;
                c8 = s6.a.c(fArr);
                bVar = rectManager.f2471b;
                if ((c8 & 2) != 0) {
                    fArr = null;
                }
                if (r2.i.a(K, bVar.f2481c)) {
                    bVar.f2481c = K;
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!r2.i.a(j7, bVar.f2482d)) {
                    bVar.f2482d = j7;
                    z7 = true;
                }
                if (fArr != null) {
                    z7 = true;
                }
                j8 = (width << 32) | (height & 4294967295L);
                if (j8 != bVar.f2483e) {
                    bVar.f2483e = j8;
                    z7 = true;
                }
                rectManager.f2474e = !z7 || rectManager.f2474e;
                this.Q.a(z3);
                getRectManager().b();
            }
        }
        z3 = false;
        A();
        view = this.G0;
        if (view == null) {
        }
        e2.a rectManager2 = getRectManager();
        j7 = this.R;
        K = m.a.K(this.f8541a0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.T;
        c8 = s6.a.c(fArr);
        bVar = rectManager2.f2471b;
        if ((c8 & 2) != 0) {
        }
        if (r2.i.a(K, bVar.f2481c)) {
        }
        if (!r2.i.a(j7, bVar.f2482d)) {
        }
        if (fArr != null) {
        }
        j8 = (width2 << 32) | (height2 & 4294967295L);
        if (j8 != bVar.f2483e) {
        }
        rectManager2.f2474e = !z7 || rectManager2.f2474e;
        this.Q.a(z3);
        getRectManager().b();
    }

    public final void I(float f6) {
        if (this.i) {
            if (f6 > 0.0f) {
                if (Float.isNaN(this.f8584x0) || f6 > this.f8584x0) {
                    this.f8584x0 = f6;
                    return;
                }
                return;
            }
            if (f6 < 0.0f) {
                if (Float.isNaN(this.f8586y0) || f6 < this.f8586y0) {
                    this.f8586y0 = f6;
                }
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(g0.l());
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        d2.j u7;
        p6.c cVar;
        CharSequence textValue2;
        if (g()) {
            z0.b bVar = this.H;
            if (bVar != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue f6 = a1.d.f(sparseArray.get(keyAt));
                    isText2 = f6.isText();
                    if (isText2) {
                        w1.f0 f0Var = (w1.f0) bVar.f9103b.f2167c.b(keyAt);
                        if (f0Var != null && (u7 = f0Var.u()) != null) {
                            Object g3 = u7.f2150d.g(d2.i.f2131g);
                            if (g3 == null) {
                                g3 = null;
                            }
                            d2.a aVar = (d2.a) g3;
                            if (aVar != null && (cVar = (p6.c) aVar.f2109b) != null) {
                                textValue2 = f6.getTextValue();
                            }
                        }
                    } else {
                        isDate2 = f6.isDate();
                        if (isDate2) {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        } else {
                            isList2 = f6.isList();
                            if (isList2) {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            } else {
                                isToggle2 = f6.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            }
                        }
                    }
                }
            }
            c5.x xVar = this.G;
            if (xVar != null) {
                z0.j jVar = (z0.j) xVar.f1738e;
                if (jVar.f9112a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    int keyAt2 = sparseArray.keyAt(i8);
                    AutofillValue f8 = a1.d.f(sparseArray.get(keyAt2));
                    isText = f8.isText();
                    if (isText) {
                        textValue = f8.getTextValue();
                        textValue.toString();
                        if (jVar.f9112a.get(Integer.valueOf(keyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        isDate = f8.isDate();
                        if (isDate) {
                            throw new a7.w("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = f8.isList();
                        if (isList) {
                            throw new a7.w("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = f8.isToggle();
                        if (isToggle) {
                            throw new a7.w("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f8579v.m(false, i, this.f8544d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f8579v.m(true, i, this.f8544d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        s(true);
        w0.m.k().m();
        this.C = true;
        f1.r rVar = this.f8563n;
        f1.b bVar = rVar.f2697a;
        Canvas canvas2 = bVar.f2622a;
        bVar.f2622a = canvas;
        getRoot().i(bVar, null);
        rVar.f2697a.f2622a = canvas2;
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((j1) ((w1.j1) arrayList.get(i))).f();
            }
        }
        int i8 = v1.f8595d;
        arrayList.clear();
        this.C = false;
        ArrayList arrayList2 = this.B;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.i) {
            s0.a(this, this.f8584x0);
            View view = this.f8552h;
            if (view == null) {
                q6.i.j("frameRateCategoryView");
                throw null;
            }
            s0.a(view, this.f8586y0);
            if (!Float.isNaN(this.f8586y0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f8584x0 = Float.NaN;
            this.f8586y0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        w1.b1 b1Var;
        s1.a aVar;
        int size;
        w1.b1 b1Var2;
        y0.l lVar;
        w1.b1 b1Var3;
        if (this.B0) {
            a1.a aVar2 = this.A0;
            removeCallbacks(aVar2);
            if (motionEvent.getActionMasked() == 8) {
                this.B0 = false;
            } else {
                aVar2.run();
            }
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                Float.floatToRawIntBits(x7);
                Float.floatToRawIntBits(y7);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                d1.i iVar = (d1.i) getFocusOwner();
                if (iVar.f2069d.f2064e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    d1.n g3 = d1.d.g(iVar.f2068c);
                    if (g3 != null) {
                        if (!g3.f8706d.f8718q) {
                            t1.a.b("visitAncestors called on an unattached node");
                        }
                        y0.l lVar2 = g3.f8706d;
                        w1.f0 u7 = w1.f.u(g3);
                        while (u7 != null) {
                            if ((u7.F.f7600f.f8709g & 2097152) != 0) {
                                while (lVar2 != null) {
                                    if ((lVar2.f8708f & 2097152) != 0) {
                                        y0.l lVar3 = lVar2;
                                        o0.e eVar = null;
                                        while (lVar3 != null) {
                                            if ((lVar3.f8708f & 2097152) != 0 && (lVar3 instanceof w1.l)) {
                                                int i = 0;
                                                for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                                    if ((lVar4.f8708f & 2097152) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            lVar3 = lVar4;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new o0.e(new y0.l[16]);
                                                            }
                                                            if (lVar3 != null) {
                                                                eVar.b(lVar3);
                                                                lVar3 = null;
                                                            }
                                                            eVar.b(lVar4);
                                                        }
                                                    }
                                                }
                                                if (i == 1) {
                                                }
                                            }
                                            lVar3 = w1.f.f(eVar);
                                        }
                                    }
                                    lVar2 = lVar2.f8710h;
                                }
                            }
                            u7 = u7.s();
                            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            Method method = q3.l0.f6125a;
            q3.l.d(viewConfiguration);
        } else {
            q3.l0.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i8 >= 26) {
            q3.l.c(viewConfiguration);
        } else {
            q3.l0.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        d1.i iVar2 = (d1.i) getFocusOwner();
        if (iVar2.f2069d.f2064e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        d1.n g7 = d1.d.g(iVar2.f2068c);
        if (g7 != null) {
            if (!g7.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar5 = g7.f8706d;
            w1.f0 u8 = w1.f.u(g7);
            loop0: while (true) {
                if (u8 == null) {
                    lVar = null;
                    break;
                }
                if ((u8.F.f7600f.f8709g & 16384) != 0) {
                    while (lVar5 != null) {
                        if ((lVar5.f8708f & 16384) != 0) {
                            lVar = lVar5;
                            o0.e eVar2 = null;
                            while (lVar != null) {
                                if (lVar instanceof s1.a) {
                                    break loop0;
                                }
                                if ((lVar.f8708f & 16384) != 0 && (lVar instanceof w1.l)) {
                                    int i9 = 0;
                                    for (y0.l lVar6 = ((w1.l) lVar).f7707s; lVar6 != null; lVar6 = lVar6.i) {
                                        if ((lVar6.f8708f & 16384) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                lVar = lVar6;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar != null) {
                                                    eVar2.b(lVar);
                                                    lVar = null;
                                                }
                                                eVar2.b(lVar6);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                lVar = w1.f.f(eVar2);
                            }
                        }
                        lVar5 = lVar5.f8710h;
                    }
                }
                u8 = u8.s();
                lVar5 = (u8 == null || (b1Var3 = u8.F) == null) ? null : b1Var3.f7599e;
            }
            aVar = (s1.a) lVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            s1.a aVar3 = aVar;
            if (!aVar3.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar7 = aVar3.f8706d.f8710h;
            w1.f0 u9 = w1.f.u(aVar);
            ArrayList arrayList = null;
            while (u9 != null) {
                if ((u9.F.f7600f.f8709g & 16384) != 0) {
                    while (lVar7 != null) {
                        if ((lVar7.f8708f & 16384) != 0) {
                            y0.l lVar8 = lVar7;
                            o0.e eVar3 = null;
                            while (lVar8 != null) {
                                if (lVar8 instanceof s1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(lVar8);
                                } else if ((lVar8.f8708f & 16384) != 0 && (lVar8 instanceof w1.l)) {
                                    int i10 = 0;
                                    for (y0.l lVar9 = ((w1.l) lVar8).f7707s; lVar9 != null; lVar9 = lVar9.i) {
                                        if ((lVar9.f8708f & 16384) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lVar8 = lVar9;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar8 != null) {
                                                    eVar3.b(lVar8);
                                                    lVar8 = null;
                                                }
                                                eVar3.b(lVar9);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lVar8 = w1.f.f(eVar3);
                            }
                        }
                        lVar7 = lVar7.f8710h;
                    }
                }
                u9 = u9.s();
                lVar7 = (u9 == null || (b1Var2 = u9.F) == null) ? null : b1Var2.f7599e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i11 = size - 1;
                    ((s1.a) arrayList.get(size)).getClass();
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
            y0.l lVar10 = aVar3.f8706d;
            o0.e eVar4 = null;
            while (lVar10 != null) {
                if (lVar10 instanceof s1.a) {
                } else if ((lVar10.f8708f & 16384) != 0 && (lVar10 instanceof w1.l)) {
                    int i12 = 0;
                    for (y0.l lVar11 = ((w1.l) lVar10).f7707s; lVar11 != null; lVar11 = lVar11.i) {
                        if ((lVar11.f8708f & 16384) != 0) {
                            i12++;
                            if (i12 == 1) {
                                lVar10 = lVar11;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new o0.e(new y0.l[16]);
                                }
                                if (lVar10 != null) {
                                    eVar4.b(lVar10);
                                    lVar10 = null;
                                }
                                eVar4.b(lVar11);
                            }
                        }
                    }
                    if (i12 == 1) {
                    }
                }
                lVar10 = w1.f.f(eVar4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                y0.l lVar12 = aVar3.f8706d;
                o0.e eVar5 = null;
                while (lVar12 != null) {
                    if (lVar12 instanceof s1.a) {
                    } else if ((lVar12.f8708f & 16384) != 0 && (lVar12 instanceof w1.l)) {
                        int i13 = 0;
                        for (y0.l lVar13 = ((w1.l) lVar12).f7707s; lVar13 != null; lVar13 = lVar13.i) {
                            if ((lVar13.f8708f & 16384) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    lVar12 = lVar13;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new o0.e(new y0.l[16]);
                                    }
                                    if (lVar12 != null) {
                                        eVar5.b(lVar12);
                                        lVar12 = null;
                                    }
                                    eVar5.b(lVar13);
                                }
                            }
                        }
                        if (i13 == 1) {
                        }
                    }
                    lVar12 = w1.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        n nVar = ((s1.a) arrayList.get(i14)).f6690r;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (q(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z3 = this.B0;
        a1.a aVar = this.A0;
        if (z3) {
            removeCallbacks(aVar);
            aVar.run();
        }
        if (!o(motionEvent) && isAttachedToWindow()) {
            a0 a0Var = this.f8579v;
            t tVar = a0Var.f8330d;
            AccessibilityManager accessibilityManager = a0Var.f8333g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x7 = motionEvent.getX();
                    float y7 = motionEvent.getY();
                    tVar.s(true);
                    w1.p pVar = new w1.p();
                    w1.b1 b1Var = tVar.getRoot().F;
                    w1.d1 d1Var = b1Var.f7598d;
                    f1.g0 g0Var = w1.d1.M;
                    b1Var.f7598d.J0(w1.d1.P, d1Var.B0((Float.floatToRawIntBits(x7) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L)), pVar, 1, true);
                    int t3 = s6.a.t(pVar);
                    while (true) {
                        if (-1 >= t3) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object e8 = pVar.f7745d.e(t3);
                        q6.i.c(e8, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        w1.f0 u7 = w1.f.u((y0.l) e8);
                        if (tVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(u7) != null) {
                            throw new ClassCastException();
                        }
                        if (u7.F.d(8)) {
                            int A = a0Var.A(u7.f7640e);
                            d2.n a8 = d2.q.a(u7, false);
                            if (d2.q.f(a8)) {
                                if (!a8.k().f2150d.c(d2.s.f2211y)) {
                                    i = A;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        t3--;
                    }
                    tVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i8 = a0Var.f8331e;
                    if (i8 != i) {
                        a0Var.f8331e = i;
                        a0.E(a0Var, i, 128, null, 12);
                        a0.E(a0Var, i8, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i9 = a0Var.f8331e;
                    if (i9 == Integer.MIN_VALUE) {
                        tVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i9 != Integer.MIN_VALUE) {
                        a0Var.f8331e = Integer.MIN_VALUE;
                        a0.E(a0Var, Integer.MIN_VALUE, 128, null, 12);
                        a0.E(a0Var, i9, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && p(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f8576t0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f8576t0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.B0 = true;
                        postDelayed(aVar, 8L);
                        return false;
                    }
                }
                if ((l(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((d1.i) getFocusOwner()).d(keyEvent, new a2.b(6, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f8561m.getClass();
        x1.f8604a.setValue(new q1.p(metaState));
        return ((d1.i) getFocusOwner()).d(keyEvent, d1.g.f2065e) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        w1.b1 b1Var;
        if (isFocused()) {
            d1.i iVar = (d1.i) getFocusOwner();
            if (iVar.f2069d.f2064e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                d1.n g3 = d1.d.g(iVar.f2068c);
                if (g3 != null) {
                    if (!g3.f8706d.f8718q) {
                        t1.a.b("visitAncestors called on an unattached node");
                    }
                    y0.l lVar = g3.f8706d;
                    w1.f0 u7 = w1.f.u(g3);
                    while (u7 != null) {
                        if ((u7.F.f7600f.f8709g & 131072) != 0) {
                            while (lVar != null) {
                                if ((lVar.f8708f & 131072) != 0) {
                                    y0.l lVar2 = lVar;
                                    o0.e eVar = null;
                                    while (lVar2 != null) {
                                        if ((lVar2.f8708f & 131072) != 0 && (lVar2 instanceof w1.l)) {
                                            int i = 0;
                                            for (y0.l lVar3 = ((w1.l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                                if ((lVar3.f8708f & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        lVar2 = lVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new o0.e(new y0.l[16]);
                                                        }
                                                        if (lVar2 != null) {
                                                            eVar.b(lVar2);
                                                            lVar2 = null;
                                                        }
                                                        eVar.b(lVar3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        lVar2 = w1.f.f(eVar);
                                    }
                                }
                                lVar = lVar.f8710h;
                            }
                        }
                        u7 = u7.s();
                        lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            b0.f8362a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B0) {
            a1.a aVar = this.A0;
            removeCallbacks(aVar);
            MotionEvent motionEvent2 = this.f8576t0;
            q6.i.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.B0 = false;
            } else {
                aVar.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int l3 = l(motionEvent);
            if ((l3 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((l3 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return j(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        e1.c d8;
        if (view == null || this.Q.f7788c) {
            return super.focusSearch(view, i);
        }
        Object obj = g1.f8414f.get();
        q6.i.b(obj);
        View b8 = ((g1) obj).b(i, view, this);
        if (view == this) {
            d1.n g3 = d1.d.g(((d1.i) getFocusOwner()).f2068c);
            d8 = g3 != null ? d1.d.j(g3) : null;
            if (d8 == null) {
                d8 = d1.d.d(view, this);
            }
        } else {
            d8 = d1.d.d(view, this);
        }
        d1.b B = d1.d.B(i);
        int i8 = B != null ? B.f2057a : 6;
        q6.s sVar = new q6.s();
        if (((d1.i) getFocusOwner()).e(i8, d8, new p1.f(sVar, 1)) != null) {
            Object obj2 = sVar.f6205d;
            if (obj2 != null) {
                if (b8 != null) {
                    if (i8 == 1 || i8 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (d1.d.o(d1.d.j((d1.n) obj2), d1.d.d(b8, this), d8, i8)) {
                    }
                }
                return this;
            }
            if (b8 == null) {
            }
            return b8;
        }
        return view;
    }

    public final q0 getAndroidViewsHandler$ui_release() {
        if (this.N == null) {
            q0 q0Var = new q0(getContext());
            this.N = q0Var;
            addView(q0Var, -1);
            requestLayout();
        }
        q0 q0Var2 = this.N;
        q6.i.b(q0Var2);
        return q0Var2;
    }

    public z0.e getAutofill() {
        return this.G;
    }

    public z0.i getAutofillManager() {
        return this.H;
    }

    public z0.j getAutofillTree() {
        return this.f8587z;
    }

    public final p6.c getConfigurationChangeObserver() {
        return this.F;
    }

    public final a1.h getContentCaptureManager$ui_release() {
        return this.f8581w;
    }

    public g6.h getCoroutineContext() {
        return this.f8557k;
    }

    public r2.c getDensity() {
        return (r2.c) this.f8550g.getValue();
    }

    public e1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            d1.n g3 = d1.d.g(((d1.i) getFocusOwner()).f2068c);
            if (g3 != null) {
                return d1.d.j(g3);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return d1.d.d(findFocus, this);
        }
        return null;
    }

    public d1.h getFocusOwner() {
        return this.f8555j;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        e1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f2457a);
            rect.top = Math.round(embeddedViewFocusRect.f2458b);
            rect.right = Math.round(embeddedViewFocusRect.f2459c);
            rect.bottom = Math.round(embeddedViewFocusRect.f2460d);
            return;
        }
        if (q6.i.a(((d1.i) getFocusOwner()).e(6, null, n.f8511g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public j2.d getFontFamilyResolver() {
        return (j2.d) this.f8562m0.getValue();
    }

    public j2.c getFontLoader() {
        return this.f8560l0;
    }

    public f1.x getGraphicsContext() {
        return this.f8585y;
    }

    public m1.a getHapticFeedBack() {
        return this.f8568p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.Q.f7787b.A();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public n1.b getInputModeManager() {
        return this.f8570q0;
    }

    public final u1.o getInsetsListener() {
        return this.f8567p;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.V;
    }

    @Override // android.view.View, android.view.ViewParent
    public r2.l getLayoutDirection() {
        return (r2.l) this.f8566o0.getValue();
    }

    public long getMeasureIteration() {
        w1.u0 u0Var = this.Q;
        if (!u0Var.f7788c) {
            t1.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return u0Var.f7792g;
    }

    public v1.d getModifierLocalManager() {
        return this.f8572r0;
    }

    public u1.k0 getPlacementScope() {
        int i = u1.n0.f7247b;
        return new u1.b0(1, this);
    }

    public q1.j getPointerIconService() {
        return this.H0;
    }

    public e2.a getRectManager() {
        return this.f8573s;
    }

    public w1.f0 getRoot() {
        return this.f8569q;
    }

    public w1.r1 getRootForTest() {
        return this.f8575t;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        c2.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.F0) == null) {
            return false;
        }
        return ((Boolean) kVar.f1605a.getValue()).booleanValue();
    }

    public d2.p getSemanticsOwner() {
        return this.f8577u;
    }

    public w1.h0 getSharedDrawScope() {
        return this.f8548f;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? r0.f8535a.a(this) : this.M;
    }

    public w1.m1 getSnapshotObserver() {
        return this.L;
    }

    public q1 getSoftwareKeyboardController() {
        return this.f8558k0;
    }

    public k2.d getTextInputService() {
        return this.f8554i0;
    }

    public r1 getTextToolbar() {
        return this.f8574s0;
    }

    public final w1.q1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public u1 getViewConfiguration() {
        return this.f8565o;
    }

    public final m getViewTreeOwners() {
        return (m) this.f8543c0.getValue();
    }

    public w1 getWindowInfo() {
        return this.f8561m;
    }

    public final z0.b get_autofillManager$ui_release() {
        return this.H;
    }

    public final void k(w1.f0 f0Var, boolean z3) {
        this.Q.f(f0Var, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(MotionEvent motionEvent) {
        boolean z3;
        int actionMasked;
        MotionEvent motionEvent2;
        t tVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z7;
        q1.b bVar;
        removeCallbacks(this.f8588z0);
        try {
            B(motionEvent);
            this.W = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.f8576t0;
                boolean z8 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                i0.h hVar = this.E;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z3 = false;
                            if (z3) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!hVar.f3282a) {
                                        ((o.q) ((b1.b) hVar.f3285d).f1050e).a();
                                        ((q1.b) hVar.f3284c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z8) {
                                    G(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z9 = motionEvent.getToolType(0) != 3;
                                if (z8 && z9 && actionMasked2 != 3 && actionMasked2 != 9 && p(motionEvent)) {
                                    tVar = this;
                                    tVar.G(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    tVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = tVar.f8576t0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = tVar.f8576t0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    q1.c cVar = tVar.D;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = tVar.f8576t0;
                                            float x7 = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = tVar.f8576t0;
                                            z7 = x7 == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = tVar.f8576t0;
                                            boolean z10 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z7 || z10) {
                                                if (pointerId >= 0) {
                                                    cVar.f5973c.delete(pointerId);
                                                    cVar.f5972b.delete(pointerId);
                                                }
                                                bVar = (q1.b) hVar.f3284c;
                                                if (bVar.f5966d) {
                                                    bVar.f5969g.f5984a.g();
                                                } else {
                                                    bVar.f5966d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        cVar.f5973c.delete(pointerId);
                                        cVar.f5972b.delete(pointerId);
                                    }
                                }
                                tVar.f8576t0 = MotionEvent.obtainNoHistory(motionEvent);
                                int F = F(motionEvent);
                                Trace.endSection();
                                tVar.W = false;
                                return F;
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z8) {
                }
                tVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = tVar.f8576t0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = tVar.f8576t0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    q1.c cVar2 = tVar.D;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = tVar.f8576t0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = tVar.f8576t0;
                        if (motionEvent72 != null) {
                        }
                        if (x7 == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = tVar.f8576t0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z7) {
                        }
                        if (pointerId >= 0) {
                        }
                        bVar = (q1.b) hVar.f3284c;
                        if (bVar.f5966d) {
                        }
                    }
                }
                tVar.f8576t0 = MotionEvent.obtainNoHistory(motionEvent);
                int F2 = F(motionEvent);
                Trace.endSection();
                tVar.W = false;
                return F2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.W = false;
            throw th3;
        }
    }

    public final void n(w1.f0 f0Var) {
        this.Q.p(f0Var, false);
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            n((w1.f0) objArr[i8]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.w g3;
        androidx.lifecycle.u uVar;
        c5.x xVar;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(g0.l());
        }
        this.f8567p.onViewAttachedToWindow(this);
        if (i > 28) {
            if (M0 == null) {
                l lVar = new l();
                M0 = lVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (I0 == null) {
                        I0 = Class.forName("android.os.SystemProperties");
                    }
                    if (K0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = I0;
                        K0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = K0;
                    if (method != null) {
                        method.invoke(null, lVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            o.e0 e0Var = L0;
            synchronized (e0Var) {
                e0Var.a(this);
            }
        }
        this.f8561m.f1605a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f8561m.getClass();
        this.f8561m.getClass();
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().f7718a.c();
        if (g() && (xVar = this.G) != null) {
            z0.h hVar = z0.h.f9111a;
            hVar.getClass();
            ((AutofillManager) xVar.f1739f).registerCallback(z0.f.b(hVar));
        }
        androidx.lifecycle.u d8 = androidx.lifecycle.l0.d(this);
        x4.f v7 = r2.r.v(this);
        m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (d8 != null && v7 != null && (d8 != (uVar = viewTreeOwners.f8496a) || v7 != uVar))) {
            if (d8 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (v7 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (g3 = viewTreeOwners.f8496a.g()) != null) {
                g3.f(this);
            }
            d8.g().a(this);
            m mVar = new m(d8, v7);
            set_viewTreeOwners(mVar);
            p6.c cVar = this.f8545d0;
            if (cVar != null) {
                cVar.i(mVar);
            }
            this.f8545d0 = null;
        }
        this.f8570q0.f5304a.setValue(new n1.a(isInTouchMode() ? 1 : 2));
        m viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.w g7 = viewTreeOwners2 != null ? viewTreeOwners2.f8496a.g() : null;
        if (g7 == null) {
            throw a0.q.f("No lifecycle owner exists");
        }
        g7.a(this);
        g7.a(this.f8581w);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f8547e0);
        getViewTreeObserver().addOnScrollChangedListener(this.f8549f0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f8551g0);
        if (Build.VERSION.SDK_INT >= 31) {
            e0.f8402a.b(this);
        }
        z0.b bVar = this.H;
        if (bVar != null) {
            ((d1.i) getFocusOwner()).f2072g.a(bVar);
            getSemanticsOwner().f2168d.a(bVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f8556j0.get() != null) {
            throw new ClassCastException();
        }
        this.f8553h0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(h0.a.a(getContext()));
        this.f8561m.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.f8564n0) {
            this.f8564n0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(h0.a.r(getContext()));
        }
        this.F.i(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f8556j0.get() != null) {
            throw new ClassCastException();
        }
        this.f8553h0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        d2.n nVar;
        AutofillId autofillId;
        String a8;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        a1.h hVar = this.f8581w;
        hVar.getClass();
        for (long j7 : jArr) {
            d2.o oVar = (d2.o) hVar.g().b((int) j7);
            if (oVar != null && (nVar = oVar.f2163a) != null) {
                a1.c.u();
                autofillId = hVar.f201d.getAutofillId();
                ViewTranslationRequest.Builder q4 = a1.c.q(autofillId, nVar.f2162g);
                Object g3 = nVar.f2159d.f2150d.g(d2.s.f2212z);
                if (g3 == null) {
                    g3 = null;
                }
                List list = (List) g3;
                if (list != null && (a8 = t2.a.a(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new g2.e(a8));
                    q4.setValue("android:text", forText);
                    build = q4.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c5.x xVar;
        super.onDetachedFromWindow();
        this.f8567p.onViewDetachedFromWindow(this);
        if (this.i) {
            View view = this.f8552h;
            if (view == null) {
                q6.i.j("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            o.e0 e0Var = L0;
            synchronized (e0Var) {
                e0Var.i(this);
            }
        }
        w1.m1 snapshotObserver = getSnapshotObserver();
        b.q qVar = snapshotObserver.f7718a.f7566h;
        if (qVar != null) {
            qVar.a();
        }
        w0.s sVar = snapshotObserver.f7718a;
        synchronized (sVar.f7565g) {
            o0.e eVar = sVar.f7564f;
            Object[] objArr = eVar.f5578d;
            int i = eVar.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                w0.r rVar = (w0.r) objArr[i8];
                rVar.f7552e.a();
                rVar.f7553f.a();
                rVar.f7557k.a();
                rVar.f7558l.clear();
            }
        }
        this.f8561m.getClass();
        m viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.w g3 = viewTreeOwners != null ? viewTreeOwners.f8496a.g() : null;
        if (g3 == null) {
            throw a0.q.f("No lifecycle owner exists");
        }
        g3.f(this.f8581w);
        g3.f(this);
        if (g() && (xVar = this.G) != null) {
            z0.h hVar = z0.h.f9111a;
            hVar.getClass();
            ((AutofillManager) xVar.f1739f).unregisterCallback(z0.f.b(hVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f8547e0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f8549f0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f8551g0);
        if (Build.VERSION.SDK_INT >= 31) {
            e0.f8402a.a(this);
        }
        z0.b bVar = this.H;
        if (bVar != null) {
            getSemanticsOwner().f2168d.i(bVar);
            ((d1.i) getFocusOwner()).f2072g.i(bVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (z3 || hasFocus()) {
            return;
        }
        d1.d.e(((d1.i) getFocusOwner()).f2068c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        this.V = 0L;
        this.Q.j(this.C0);
        this.O = null;
        H();
        if (this.N != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i9 - i, i10 - i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        w1.u0 u0Var = this.Q;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long i9 = i(i);
            long i10 = i(i8);
            long u7 = m.a.u((int) (i9 >>> 32), (int) (i9 & 4294967295L), (int) (i10 >>> 32), (int) (4294967295L & i10));
            r2.a aVar = this.O;
            if (aVar == null) {
                this.O = new r2.a(u7);
                this.P = false;
            } else if (!r2.a.b(aVar.f6514a, u7)) {
                this.P = true;
            }
            u0Var.q(u7);
            u0Var.l();
            setMeasuredDimension(getRoot().G.f7700p.f7230d, getRoot().G.f7700p.f7231e);
            if (this.N != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.f7700p.f7230d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.f7700p.f7231e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!g() || viewStructure == null) {
            return;
        }
        z0.b bVar = this.H;
        if (bVar != null) {
            w1.f0 f0Var = bVar.f9103b.f2165a;
            AutofillId autofillId = bVar.f9107f;
            String str = bVar.f9106e;
            e2.a aVar = bVar.f9105d;
            r2.r.N(viewStructure, f0Var, autofillId, str, aVar);
            Object[] objArr = o.p0.f5518a;
            o.e0 e0Var = new o.e0(2);
            e0Var.a(f0Var);
            e0Var.a(viewStructure);
            while (e0Var.h()) {
                Object j7 = e0Var.j(e0Var.f5443b - 1);
                q6.i.c(j7, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructure2 = (ViewStructure) j7;
                Object j8 = e0Var.j(e0Var.f5443b - 1);
                q6.i.c(j8, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                o0.b bVar2 = (o0.b) ((w1.f0) j8).m();
                int i8 = bVar2.f5572d.f5580f;
                for (int i9 = 0; i9 < i8; i9++) {
                    w1.f0 f0Var2 = (w1.f0) bVar2.get(i9);
                    if (!f0Var2.O && f0Var2.G() && f0Var2.H()) {
                        d2.j u7 = f0Var2.u();
                        if (u7 != null) {
                            o.j0 j0Var = u7.f2150d;
                            if (j0Var.b(d2.i.f2131g) || j0Var.b(d2.s.f2203q) || j0Var.b(d2.s.f2204r)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                r2.r.N(newChild, f0Var2, bVar.f9107f, str, aVar);
                                e0Var.a(f0Var2);
                                e0Var.a(newChild);
                            }
                        }
                        e0Var.a(f0Var2);
                        e0Var.a(viewStructure2);
                    }
                }
            }
        }
        c5.x xVar = this.G;
        if (xVar != null) {
            z0.j jVar = (z0.j) xVar.f1738e;
            LinkedHashMap linkedHashMap = jVar.f9112a;
            LinkedHashMap linkedHashMap2 = jVar.f9112a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) xVar.f1740g, intValue);
                newChild2.setId(intValue, ((t) xVar.f1737d).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f8546e) {
            r2.l lVar = r2.l.f6529d;
            r2.l lVar2 = i != 0 ? i != 1 ? null : r2.l.f6530e : lVar;
            if (lVar2 != null) {
                lVar = lVar2;
            }
            setLayoutDirection(lVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        c2.k kVar;
        if (Build.VERSION.SDK_INT >= 31 && (kVar = this.F0) != null) {
            d2.p semanticsOwner = getSemanticsOwner();
            g6.h coroutineContext = getCoroutineContext();
            o0.e eVar = new o0.e(new c2.l[16]);
            a.a.C(semanticsOwner.a(), 0, new c2.j(1, 8, o0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            d6.l.Q(eVar.f5578d, new d2.w(1, new p6.c[]{c2.c.f1587g, c2.c.f1588h}), 0, eVar.f5580f);
            int i = eVar.f5580f;
            c2.l lVar = (c2.l) (i == 0 ? null : eVar.f5578d[i - 1]);
            if (lVar != null) {
                r2.j jVar = lVar.f1608c;
                c2.e eVar2 = new c2.e(lVar.f1606a, jVar, a7.x.a(coroutineContext), kVar, this);
                w1.d1 d1Var = lVar.f1609d;
                long j7 = (jVar.f6524a << 32) | (jVar.f6525b & 4294967295L);
                ScrollCaptureTarget m7 = a1.c.m(this, f1.p.t(h0.a.V(u1.s0.g(d1Var).K(d1Var, true))), new Point((int) (j7 >> 32), (int) (j7 & 4294967295L)), eVar2);
                m7.setScrollBounds(f1.p.t(jVar));
                consumer.accept(m7);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        a1.h hVar = this.f8581w;
        hVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (q6.i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a.a.h(hVar, longSparseArray);
        } else {
            hVar.f201d.post(new a1.e(0, hVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean l3;
        this.f8561m.f1605a.setValue(Boolean.valueOf(z3));
        this.E0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (l3 = g0.l())) {
            return;
        }
        setShowLayoutBounds(l3);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        return 0.0f <= x7 && x7 <= ((float) getWidth()) && 0.0f <= y7 && y7 <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f8576t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long r(long j7) {
        A();
        long m7 = f1.p.m(this.T, j7);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f8541a0 >> 32)) + Float.intBitsToFloat((int) (m7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f8541a0 & 4294967295L)) + Float.intBitsToFloat((int) (m7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((d1.i) getFocusOwner()).f2068c.t0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (ordinal != 3) {
            throw new a5.c();
        }
        d1.b B = d1.d.B(i);
        int i8 = B != null ? B.f2057a : 7;
        return q6.i.a(((d1.i) getFocusOwner()).e(i8, rect != null ? f1.p.w(rect) : null, new q(i8, 0)), Boolean.TRUE);
    }

    public final void s(boolean z3) {
        r rVar;
        w1.u0 u0Var = this.Q;
        if (u0Var.f7787b.A() || ((o0.e) u0Var.f7790e.f11e).f5580f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    rVar = this.C0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                rVar = null;
            }
            if (u0Var.j(rVar)) {
                requestLayout();
            }
            u0Var.a(false);
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j7) {
        this.f8579v.f8334h = j7;
    }

    public final void setConfigurationChangeObserver(p6.c cVar) {
        this.F = cVar;
    }

    public final void setContentCaptureManager$ui_release(a1.h hVar) {
        this.f8581w = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(g6.h hVar) {
        this.f8557k = hVar;
        y0.l lVar = getRoot().F.f7600f;
        if (lVar instanceof q1.s) {
            ((q1.s) lVar).s0();
        }
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar2 = lVar.f8706d;
        y0.l lVar3 = lVar2.i;
        if (lVar3 == null) {
            w1.f.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.f5580f;
            if (i == 0) {
                return;
            }
            y0.l lVar4 = (y0.l) eVar.k(i - 1);
            if ((lVar4.f8709g & 16) != 0) {
                for (y0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.i) {
                    if ((lVar5.f8708f & 16) != 0) {
                        w1.l lVar6 = lVar5;
                        ?? r52 = 0;
                        while (lVar6 != 0) {
                            if (lVar6 instanceof w1.p1) {
                                w1.p1 p1Var = (w1.p1) lVar6;
                                if (p1Var instanceof q1.s) {
                                    ((q1.s) p1Var).s0();
                                }
                            } else if ((lVar6.f8708f & 16) != 0 && (lVar6 instanceof w1.l)) {
                                y0.l lVar7 = lVar6.f7707s;
                                int i8 = 0;
                                lVar6 = lVar6;
                                r52 = r52;
                                while (lVar7 != null) {
                                    if ((lVar7.f8708f & 16) != 0) {
                                        i8++;
                                        r52 = r52;
                                        if (i8 == 1) {
                                            lVar6 = lVar7;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar6 != 0) {
                                                r52.b(lVar6);
                                                lVar6 = 0;
                                            }
                                            r52.b(lVar7);
                                        }
                                    }
                                    lVar7 = lVar7.i;
                                    lVar6 = lVar6;
                                    r52 = r52;
                                }
                                if (i8 == 1) {
                                }
                            }
                            lVar6 = w1.f.f(r52);
                        }
                    }
                }
            }
            w1.f.b(eVar, lVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j7) {
        this.V = j7;
    }

    public final void setOnViewTreeOwnersAvailable(p6.c cVar) {
        m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.i(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f8545d0 = cVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.M = z3;
    }

    public void setUncaughtExceptionHandler(w1.q1 q1Var) {
        this.Q.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(w1.f0 f0Var, long j7) {
        w1.u0 u0Var = this.Q;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            u0Var.k(f0Var, j7);
            if (!u0Var.f7787b.A()) {
                u0Var.a(false);
            }
            getRectManager().b();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void u(w1.j1 j1Var, boolean z3) {
        ArrayList arrayList = this.A;
        if (!z3) {
            if (this.C) {
                return;
            }
            arrayList.remove(j1Var);
            ArrayList arrayList2 = this.B;
            if (arrayList2 != null) {
                arrayList2.remove(j1Var);
                return;
            }
            return;
        }
        if (!this.C) {
            arrayList.add(j1Var);
            return;
        }
        ArrayList arrayList3 = this.B;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.B = arrayList3;
        }
        arrayList3.add(j1Var);
    }

    public final void v() {
        z0.b bVar;
        if (this.I) {
            w0.s sVar = getSnapshotObserver().f7718a;
            synchronized (sVar.f7565g) {
                try {
                    o0.e eVar = sVar.f7564f;
                    int i = eVar.f5580f;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i; i9++) {
                        w0.r rVar = (w0.r) eVar.f5578d[i9];
                        rVar.e();
                        if (!rVar.f7553f.j()) {
                            i8++;
                        } else if (i8 > 0) {
                            Object[] objArr = eVar.f5578d;
                            objArr[i9 - i8] = objArr[i9];
                        }
                    }
                    int i10 = i - i8;
                    d6.l.L(eVar.f5578d, i10, i);
                    eVar.f5580f = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.I = false;
        }
        q0 q0Var = this.N;
        if (q0Var != null) {
            h(q0Var);
        }
        if (g() && (bVar = this.H) != null) {
            o.y yVar = bVar.f9108g;
            if (yVar.f5567d == 0 && bVar.f9109h) {
                ((AutofillManager) bVar.f9102a.f6119e).commit();
                bVar.f9109h = false;
            }
            if (yVar.f5567d != 0) {
                bVar.f9109h = true;
            }
        }
        while (this.f8582w0.h() && this.f8582w0.e(0) != null) {
            int i11 = this.f8582w0.f5443b;
            for (int i12 = 0; i12 < i11; i12++) {
                p6.a aVar = (p6.a) this.f8582w0.e(i12);
                o.e0 e0Var = this.f8582w0;
                if (i12 < 0 || i12 >= e0Var.f5443b) {
                    e0Var.m(i12);
                    throw null;
                }
                Object[] objArr2 = e0Var.f5442a;
                Object obj = objArr2[i12];
                objArr2[i12] = null;
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.f8582w0.k(0, i11);
        }
    }

    public final void w(w1.f0 f0Var) {
        a0 a0Var = this.f8579v;
        a0Var.A = true;
        if (a0Var.v()) {
            a0Var.w(f0Var);
        }
        a1.h hVar = this.f8581w;
        hVar.f206j = true;
        if (hVar.h()) {
            hVar.f207k.t(c6.m.f1757a);
        }
    }

    public final void x(w1.f0 f0Var, boolean z3, boolean z7, boolean z8) {
        w1.f0 s5;
        w1.f0 s7;
        w1.u0 u0Var = this.Q;
        if (!z3) {
            if (u0Var.p(f0Var, z7) && z8) {
                D(f0Var);
                return;
            }
            return;
        }
        a0.g1 g1Var = u0Var.f7787b;
        w1.f0 f0Var2 = f0Var.f7644j;
        w1.j0 j0Var = f0Var.G;
        if (f0Var2 == null) {
            t1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = j0Var.f7689d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new a5.c();
                }
                if (!j0Var.f7690e || z7) {
                    j0Var.f7690e = true;
                    j0Var.f7700p.f7813w = true;
                    if (f0Var.O) {
                        return;
                    }
                    if ((q6.i.a(f0Var.I(), Boolean.TRUE) || w1.u0.h(f0Var)) && ((s5 = f0Var.s()) == null || !s5.G.f7690e)) {
                        g1Var.f(f0Var, w1.s.f7757d);
                    } else if ((f0Var.H() || w1.u0.i(f0Var)) && ((s7 = f0Var.s()) == null || !s7.p())) {
                        g1Var.f(f0Var, w1.s.f7759f);
                    }
                    if (u0Var.f7789d || !z8) {
                        return;
                    }
                    D(f0Var);
                    return;
                }
                return;
            }
        }
        u0Var.f7793h.b(new w1.t0(f0Var, true, z7));
    }

    public final void y(w1.f0 f0Var, boolean z3, boolean z7) {
        w1.j0 j0Var = f0Var.G;
        w1.s sVar = w1.s.f7760g;
        w1.u0 u0Var = this.Q;
        if (!z3) {
            u0Var.getClass();
            int ordinal = j0Var.f7689d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new a5.c();
            }
            w1.f0 s5 = f0Var.s();
            boolean z8 = s5 == null || s5.H();
            if (!z7) {
                if (f0Var.p()) {
                    return;
                }
                if (f0Var.o() && f0Var.H() == z8 && f0Var.H() == j0Var.f7700p.f7812v) {
                    return;
                }
            }
            w1.w0 w0Var = j0Var.f7700p;
            w0Var.f7814x = true;
            w0Var.f7815y = true;
            if (!f0Var.O && w0Var.f7812v && z8) {
                if ((s5 == null || !s5.o()) && (s5 == null || !s5.p())) {
                    u0Var.f7787b.f(f0Var, sVar);
                }
                if (u0Var.f7789d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        a0.g1 g1Var = u0Var.f7787b;
        int ordinal2 = j0Var.f7689d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new a5.c();
                }
            }
        }
        if ((j0Var.f7690e || j0Var.f7691f) && !z7) {
            return;
        }
        j0Var.f7691f = true;
        j0Var.f7692g = true;
        w1.w0 w0Var2 = j0Var.f7700p;
        w0Var2.f7814x = true;
        w0Var2.f7815y = true;
        if (f0Var.O) {
            return;
        }
        w1.f0 s7 = f0Var.s();
        if (q6.i.a(f0Var.I(), Boolean.TRUE) && ((s7 == null || !s7.G.f7690e) && (s7 == null || !s7.G.f7691f))) {
            g1Var.f(f0Var, w1.s.f7758e);
        } else if (f0Var.H() && ((s7 == null || !s7.o()) && (s7 == null || !s7.p()))) {
            g1Var.f(f0Var, sVar);
        }
        if (u0Var.f7789d) {
            return;
        }
        D(null);
    }

    public final void z() {
        a0 a0Var = this.f8579v;
        a0Var.A = true;
        if (a0Var.v() && !a0Var.L) {
            a0Var.L = true;
            a0Var.f8337l.post(a0Var.N);
        }
        a1.h hVar = this.f8581w;
        hVar.f206j = true;
        if (!hVar.h() || hVar.f213q) {
            return;
        }
        hVar.f213q = true;
        hVar.f208l.post(hVar.f214r);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        q6.i.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public f getAccessibilityManager() {
        return this.f8583x;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public g m8getClipboard() {
        return this.K;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public h m9getClipboardManager() {
        return this.J;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public b1.a m10getDragAndDropManager() {
        return this.f8559l;
    }

    public o.x getLayoutNodes() {
        return this.f8571r;
    }

    public t getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i8) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i8;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @c6.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @c6.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(w1.q1 q1Var) {
    }
}
