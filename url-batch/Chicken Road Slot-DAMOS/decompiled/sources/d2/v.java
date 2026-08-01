package d2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.appsflyer.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends ViewGroup implements c2.v1, androidx.lifecycle.f, c2.n1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, i1.f {
    public static Class Z0;

    /* renamed from: a1, reason: collision with root package name */
    public static Method f3545a1;

    /* renamed from: b1, reason: collision with root package name */
    public static Method f3546b1;

    /* renamed from: c1, reason: collision with root package name */
    public static final s.d0 f3547c1 = new s.d0();

    /* renamed from: d1, reason: collision with root package name */
    public static com.appsflyer.internal.q f3548d1;
    public CoroutineContext A;
    public k1 A0;
    public final g1.b B;
    public final p2.g B0;
    public final n1 C;
    public final n0.z0 C0;
    public final n0.j1 D;
    public final n0.j1 D0;
    public final n0.y E;
    public final s1.a E0;
    public final k1.o F;
    public final t1.c F0;
    public final o0 G;
    public final b2.b G0;
    public final a2.m H;
    public final k1 H0;
    public final c2.g0 I;
    public MotionEvent I0;
    public final s.w J;
    public long J0;
    public final k2.b K;
    public final c6.e K0;
    public final j2.o L;
    public final s.d0 L0;
    public final b0 M;
    public float M0;
    public f1.e N;
    public float N0;
    public final h O;
    public final b7.k O0;
    public final b7.h P;
    public final k P0;
    public final e1.j Q;
    public boolean Q0;
    public final s.d0 R;
    public final a8.l R0;
    public s.d0 S;
    public final p S0;
    public boolean T;
    public final t0 T0;
    public boolean U;
    public boolean U0;
    public final x1.e V;
    public boolean V0;
    public final b7.h W;
    public final n1 W0;
    public View X0;
    public final k1 Y0;

    /* renamed from: a0, reason: collision with root package name */
    public final n0.j1 f3549a0;

    /* renamed from: b0, reason: collision with root package name */
    public final n0.y f3550b0;

    /* renamed from: c0, reason: collision with root package name */
    public final c6.i f3551c0;

    /* renamed from: d, reason: collision with root package name */
    public final n0.j1 f3552d;

    /* renamed from: d0, reason: collision with root package name */
    public final e1.b f3553d0;

    /* renamed from: e, reason: collision with root package name */
    public long f3554e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3555e0;

    /* renamed from: f0, reason: collision with root package name */
    public final j f3556f0;

    /* renamed from: g0, reason: collision with root package name */
    public final i f3557g0;
    public final c2.q1 h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3558i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3559i0;

    /* renamed from: j0, reason: collision with root package name */
    public p0 f3560j0;

    /* renamed from: k0, reason: collision with root package name */
    public x2.a f3561k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f3562l0;

    /* renamed from: m0, reason: collision with root package name */
    public final c2.u0 f3563m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f3564n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f3565o0;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f3566p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float[] f3567q0;

    /* renamed from: r, reason: collision with root package name */
    public final c2.i0 f3568r;

    /* renamed from: r0, reason: collision with root package name */
    public long f3569r0;

    /* renamed from: s, reason: collision with root package name */
    public o1 f3570s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f3571s0;

    /* renamed from: t, reason: collision with root package name */
    public p1 f3572t;

    /* renamed from: t0, reason: collision with root package name */
    public long f3573t0;

    /* renamed from: u, reason: collision with root package name */
    public y0.d f3574u;

    /* renamed from: u0, reason: collision with root package name */
    public final n0.j1 f3575u0;

    /* renamed from: v, reason: collision with root package name */
    public final kotlin.collections.s f3576v;

    /* renamed from: v0, reason: collision with root package name */
    public final n0.y f3577v0;

    /* renamed from: w, reason: collision with root package name */
    public final k f3578w;

    /* renamed from: w0, reason: collision with root package name */
    public Function1 f3579w0;

    /* renamed from: x, reason: collision with root package name */
    public final n0.j1 f3580x;

    /* renamed from: x0, reason: collision with root package name */
    public q2.e f3581x0;

    /* renamed from: y, reason: collision with root package name */
    public final View f3582y;

    /* renamed from: y0, reason: collision with root package name */
    public q2.c f3583y0;

    /* renamed from: z, reason: collision with root package name */
    public final i1.k f3584z;

    /* renamed from: z0, reason: collision with root package name */
    public final AtomicReference f3585z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, c1 c1Var) {
        super(context);
        e1.b bVar;
        v vVar = this;
        vVar.f3552d = n0.h.r(c1Var);
        vVar.f3554e = 9205357640488583168L;
        int i3 = 1;
        vVar.f3558i = true;
        vVar.f3568r = c1Var.f3368r;
        vVar.f3574u = y0.a.f10569d;
        vVar.f3576v = new kotlin.collections.s();
        int i10 = 0;
        vVar.f3578w = new k(vVar, i10);
        vVar.f3580x = new n0.j1(i7.a.d(context), n0.e.f6661s);
        vVar.f3584z = new i1.k(vVar, vVar);
        vVar.A = c1Var.f3354b.i();
        vVar.B = new g1.b();
        vVar.C = new n1(0);
        vVar.D = n0.h.r(Boolean.FALSE);
        vVar.E = n0.h.o(new p(vVar, i10));
        vVar.F = c1Var.f3370t;
        vVar.G = c1Var.f3367q;
        vVar.H = new a2.m();
        int i11 = 3;
        c2.g0 g0Var = new c2.g0(3);
        g0Var.Y(a2.t0.f156a);
        g0Var.V(vVar.getDensity());
        g0Var.a0(vVar.getViewConfiguration());
        g0Var.Z(new u(vVar).c(((i1.k) vVar.getFocusOwner()).f4605e).c(vVar.m40getDragAndDropManager().f4228c));
        vVar.I = g0Var;
        s.w wVar = s.l.f8343a;
        vVar.J = new s.w();
        vVar.getLayoutNodes();
        vVar.K = new k2.b(vVar);
        vVar.L = new j2.o(vVar.getRoot(), new j2.d(), vVar.getLayoutNodes());
        b0 b0Var = new b0(vVar);
        vVar.M = b0Var;
        vVar.N = new f1.e(vVar, new o(0, vVar, h0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        vVar.O = c1Var.j;
        b7.h hVar = new b7.h();
        hVar.f1293b = vVar;
        hVar.f1294c = new Object();
        k1.d dVar = new k1.d();
        hVar.f1296e = dVar;
        if (vVar.isAttachedToWindow()) {
            Context context2 = vVar.getContext();
            if (!hVar.f1292a) {
                context2.getApplicationContext().registerComponentCallbacks(dVar);
                hVar.f1292a = true;
            }
        }
        int i12 = 2;
        vVar.addOnAttachStateChangeListener(new a2(i12, hVar));
        vVar.P = hVar;
        vVar.Q = new e1.j();
        vVar.R = new s.d0();
        vVar.V = new x1.e();
        c2.g0 root = vVar.getRoot();
        b7.h hVar2 = new b7.h();
        hVar2.f1293b = root;
        hVar2.f1294c = new x1.b((c2.q) root.S.f1493d);
        int i13 = 4;
        hVar2.f1295d = new v.c1(4);
        hVar2.f1296e = new c2.o();
        vVar.W = hVar2;
        vVar.f3549a0 = n0.h.r(new Configuration(context.getResources().getConfiguration()));
        vVar.f3550b0 = n0.h.o(new p(vVar, i3));
        vVar.f3551c0 = j() ? new c6.i(vVar, vVar.getAutofillTree()) : null;
        if (j()) {
            AutofillManager b10 = com.onesignal.common.k.b(context.getSystemService(com.onesignal.common.k.g()));
            if (b10 == null) {
                throw v4.a.h("Autofill service could not be located.");
            }
            vVar = this;
            bVar = new e1.b(new d9.c(14, b10), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            bVar = null;
        }
        vVar.f3553d0 = bVar;
        vVar.f3556f0 = c1Var.f3362l;
        vVar.f3557g0 = c1Var.f3363m;
        vVar.h0 = new c2.q1(new s(vVar, i3));
        vVar.f3563m0 = new c2.u0(vVar.getRoot());
        long j = Integer.MAX_VALUE;
        vVar.f3564n0 = (j & 4294967295L) | (j << 32);
        vVar.f3565o0 = new int[]{0, 0};
        float[] g = k1.v.g();
        vVar.f3566p0 = k1.v.g();
        vVar.f3567q0 = k1.v.g();
        vVar.f3569r0 = -1L;
        vVar.f3573t0 = 9187343241974906880L;
        vVar.f3575u0 = n0.h.r(null);
        vVar.f3577v0 = n0.h.o(new p(vVar, i11));
        vVar.f3585z0 = new AtomicReference(null);
        vVar.B0 = c1Var.f3364n;
        vVar.C0 = c1Var.f3365o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = i1.d.f4590a;
        x2.l lVar = layoutDirection != 0 ? layoutDirection != 1 ? null : x2.l.f10331e : x2.l.f10330d;
        vVar.D0 = n0.h.r(lVar == null ? x2.l.f10330d : lVar);
        vVar.E0 = c1Var.f3366p;
        vVar.F0 = new t1.c(vVar.isInTouchMode() ? 1 : 2);
        b2.b bVar2 = new b2.b();
        new o0.e(new c2.b[16]);
        new o0.e(new i7.a[16]);
        new o0.e(new c2.g0[16]);
        new o0.e(new i7.a[16]);
        vVar.G0 = bVar2;
        k1 k1Var = new k1();
        y1[] y1VarArr = y1.f3602d;
        vVar.H0 = k1Var;
        vVar.K0 = new c6.e(4);
        vVar.L0 = new s.d0();
        vVar.O0 = new b7.k(i13, vVar);
        vVar.P0 = new k(vVar, i3);
        s sVar = new s(vVar, i10);
        a8.l lVar2 = new a8.l();
        lVar2.f358c = sVar;
        lVar2.f357b = 0;
        lVar2.f359d = new GestureDetector(context, new j1(lVar2));
        vVar.R0 = lVar2;
        vVar.S0 = new p(vVar, i12);
        int i14 = Build.VERSION.SDK_INT;
        vVar.T0 = i14 < 29 ? new c6.c(g) : new u0();
        vVar.addOnAttachStateChangeListener(vVar.N);
        vVar.setWillNotDraw(false);
        vVar.setFocusable(true);
        if (i14 >= 26) {
            g0.f3411a.a(vVar, 1, false);
        }
        vVar.setFocusableInTouchMode(true);
        vVar.setClipChildren(false);
        o3.c0.d(vVar, b0Var);
        vVar.setOnDragListener(vVar.m40getDragAndDropManager());
        vVar.getRoot().b(vVar);
        if (i14 >= 29) {
            d0.f3377a.a(vVar);
        }
        if (r()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            vVar.f3582y = view;
            vVar.addView(view, -1);
        }
        vVar.W0 = i14 >= 31 ? new n1(1) : null;
        k1 k1Var2 = new k1();
        x1.j.f10275a.getClass();
        vVar.Y0 = k1Var2;
    }

    public static final void c(v vVar, int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d10;
        b0 b0Var = vVar.M;
        if (Intrinsics.a(str, b0Var.O)) {
            int d11 = b0Var.M.d(i3);
            if (d11 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d11);
                return;
            }
            return;
        }
        if (!Intrinsics.a(str, b0Var.P) || (d10 = b0Var.N.d(i3)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d10);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    private final q2.e getLegacyTextInputServiceAndroid() {
        q2.e eVar = this.f3581x0;
        if (eVar != null) {
            return eVar;
        }
        q2.e eVar2 = new q2.e(getView(), this);
        this.f3581x0 = eVar2;
        return eVar2;
    }

    private final c1 get_composeViewContext() {
        return (c1) this.f3552d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m get_viewTreeOwners() {
        v4.a.w(this.f3575u0.getValue());
        return null;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void k(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof v) {
                ((v) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt);
            }
        }
    }

    public static long l(int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            hd.z zVar = hd.a0.f4495e;
            return (0 << 32) | size;
        }
        if (mode == 0) {
            hd.z zVar2 = hd.a0.f4495e;
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        hd.z zVar3 = hd.a0.f4495e;
        return j | (j << 32);
    }

    public static View m(View view, int i3) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.a(declaredMethod.invoke(view, null), Integer.valueOf(i3))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View m10 = m(viewGroup.getChildAt(i10), i3);
                    if (m10 != null) {
                        return m10;
                    }
                }
            }
        }
        return null;
    }

    public static void p(c2.g0 g0Var) {
        g0Var.A();
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            p((c2.g0) objArr[i10]);
        }
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean s(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 1; i3 < pointerCount; i3++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i3)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i3)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !t1.f3538a.a(motionEvent, i3));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private final void setAttached(boolean z10) {
        this.D.setValue(Boolean.valueOf(z10));
    }

    private void setDensity(x2.c cVar) {
        this.f3580x.setValue(cVar);
    }

    private void setFontFamilyResolver(p2.h hVar) {
        this.C0.setValue(hVar);
    }

    private void setLayoutDirection(x2.l lVar) {
        this.D0.setValue(lVar);
    }

    private final void set_composeViewContext(c1 c1Var) {
        this.f3552d.setValue(c1Var);
    }

    private final void set_viewTreeOwners(m mVar) {
        this.f3575u0.setValue(mVar);
    }

    public final void A(c2.g0 g0Var, boolean z10, boolean z11) {
        c2.g0 s3;
        c2.g0 s10;
        c2.u0 u0Var = this.f3563m0;
        if (!z10) {
            if (u0Var.p(g0Var, z11)) {
                G(g0Var);
                return;
            }
            return;
        }
        a1.n nVar = u0Var.f1678b;
        c2.g0 g0Var2 = g0Var.f1556v;
        c2.k0 k0Var = g0Var.T;
        if (g0Var2 == null) {
            z1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = k0Var.f1596d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    a2.r.p();
                    return;
                }
                if (!k0Var.f1597e || z11) {
                    k0Var.f1597e = true;
                    k0Var.f1606p.H = true;
                    if (g0Var.f1549d0) {
                        return;
                    }
                    if ((Intrinsics.a(g0Var.G(), Boolean.TRUE) || c2.u0.h(g0Var)) && ((s3 = g0Var.s()) == null || !s3.T.f1597e)) {
                        nVar.i(g0Var, c2.s.f1656d);
                    } else if ((g0Var.F() || c2.u0.i(g0Var)) && ((s10 = g0Var.s()) == null || !s10.p())) {
                        nVar.i(g0Var, c2.s.f1658i);
                    }
                    if (u0Var.f1680d) {
                        return;
                    }
                    G(g0Var);
                    return;
                }
                return;
            }
        }
        u0Var.f1683h.b(new c2.t0(g0Var, true, z11));
    }

    public final void B(c2.g0 g0Var, boolean z10, boolean z11) {
        c2.k0 k0Var = g0Var.T;
        c2.u0 u0Var = this.f3563m0;
        if (!z10) {
            u0Var.getClass();
            int ordinal = k0Var.f1596d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                a2.r.p();
                return;
            }
            c2.g0 s3 = g0Var.s();
            boolean z12 = s3 == null || s3.F();
            if (!z11) {
                if (g0Var.p()) {
                    return;
                }
                if (g0Var.n() && g0Var.F() == z12 && g0Var.F() == k0Var.f1606p.G) {
                    return;
                }
            }
            c2.w0 w0Var = k0Var.f1606p;
            w0Var.I = true;
            w0Var.J = true;
            if (!g0Var.f1549d0 && w0Var.G && z12) {
                if ((s3 == null || !s3.n()) && (s3 == null || !s3.p())) {
                    u0Var.f1678b.i(g0Var, c2.s.f1659r);
                }
                if (u0Var.f1680d) {
                    return;
                }
                G(null);
                return;
            }
            return;
        }
        a1.n nVar = u0Var.f1678b;
        int ordinal2 = k0Var.f1596d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    a2.r.p();
                    return;
                }
            }
        }
        if ((k0Var.f1597e || k0Var.f1598f) && !z11) {
            return;
        }
        k0Var.f1598f = true;
        k0Var.g = true;
        c2.w0 w0Var2 = k0Var.f1606p;
        w0Var2.I = true;
        w0Var2.J = true;
        if (g0Var.f1549d0) {
            return;
        }
        c2.g0 s10 = g0Var.s();
        if (Intrinsics.a(g0Var.G(), Boolean.TRUE) && ((s10 == null || !s10.T.f1597e) && (s10 == null || !s10.T.f1598f))) {
            nVar.i(g0Var, c2.s.f1657e);
        } else if (g0Var.F() && ((s10 == null || !s10.n()) && (s10 == null || !s10.p()))) {
            nVar.i(g0Var, c2.s.f1659r);
        }
        if (u0Var.f1680d) {
            return;
        }
        G(null);
    }

    public final void C() {
        b0 b0Var = this.M;
        b0Var.I = true;
        Handler handler = b0Var.f3338r.getHandler();
        if (b0Var.p() && !b0Var.T && handler != null) {
            b0Var.T = true;
            handler.post(b0Var.V);
        }
        f1.e eVar = this.N;
        eVar.f4051u = true;
        Handler handler2 = eVar.f4045d.getHandler();
        if (!eVar.g() || eVar.A || handler2 == null) {
            return;
        }
        eVar.A = true;
        handler2.post(eVar.B);
    }

    public final void D() {
        if (this.f3571s0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f3569r0) {
            this.f3569r0 = currentAnimationTimeMillis;
            t0 t0Var = this.T0;
            float[] fArr = this.f3566p0;
            t0Var.a(this, fArr);
            h0.o(fArr, this.f3567q0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f3565o0;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            float f11 = iArr[0];
            float f12 = f10 - iArr[1];
            this.f3573t0 = (Float.floatToRawIntBits(f3 - f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        }
    }

    public final void E(MotionEvent motionEvent) {
        this.f3569r0 = AnimationUtils.currentAnimationTimeMillis();
        t0 t0Var = this.T0;
        float[] fArr = this.f3566p0;
        t0Var.a(this, fArr);
        h0.o(fArr, this.f3567q0);
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        long m10 = k1.v.m(fArr, (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y3) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m10 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m10 & 4294967295L));
        this.f3573t0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void G(c2.g0 g0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (g0Var != null) {
            while (g0Var != null && g0Var.q() == c2.e0.f1528d) {
                if (!this.f3562l0) {
                    c2.g0 s3 = g0Var.s();
                    if (s3 == null) {
                        break;
                    }
                    long j = ((c2.q) s3.S.f1493d).f134r;
                    if (x2.a.f(j) && x2.a.e(j)) {
                        break;
                    }
                }
                g0Var = g0Var.s();
            }
            if (g0Var == getRoot()) {
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

    public final long H(long j) {
        D();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f3573t0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f3573t0 & 4294967295L));
        return k1.v.m(this.f3567q0, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int I(MotionEvent motionEvent) {
        Object obj;
        if (this.U0) {
            this.U0 = false;
            n1 n1Var = getComposeViewContext().f3369s;
            int metaState = motionEvent.getMetaState();
            n1Var.getClass();
            g2.f3415a.setValue(new x1.r(metaState));
        }
        x1.e eVar = this.V;
        c6.c c10 = eVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        b7.h hVar = this.W;
        if (c10 == null) {
            if (!hVar.f1292a) {
                ((s.p) ((v.c1) hVar.f1295d).f9767e).a();
                ((x1.b) hVar.f1294c).c();
            }
            return 0;
        }
        List list = (List) c10.f1809e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((x1.n) obj).f10298e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
        }
        obj = null;
        x1.n nVar = (x1.n) obj;
        if (nVar != null) {
            this.f3554e = nVar.f10297d;
        }
        int f3 = hVar.f(c10, this, t(motionEvent));
        c10.f1810i = null;
        if ((actionMasked != 0 && actionMasked != 5) || (f3 & 1) != 0) {
            return f3;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        eVar.f10256c.delete(pointerId);
        eVar.f10255b.delete(pointerId);
        return f3;
    }

    public final void J(MotionEvent motionEvent, int i3, long j, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i10 = motionEvent.getActionIndex();
            }
        } else if (i3 != 9 && i3 != 10) {
            i10 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i10 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((i10 < 0 || i13 < i10) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f3 = pointerCoords.x;
            long v10 = v((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (v10 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (v10 & 4294967295L));
            i13++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i3, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        c6.c c10 = this.V.c(obtain, this);
        c10.getClass();
        this.W.f(c10, this, true);
        obtain.recycle();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(i7.a.d(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.C.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        boolean z10;
        View view;
        float[] fArr;
        int i3;
        int[] iArr = this.f3565o0;
        getLocationOnScreen(iArr);
        long j = this.f3564n0;
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        int i12 = iArr[0];
        if (i10 != i12 || i11 != iArr[1] || this.f3569r0 < 0) {
            this.f3564n0 = (4294967295L & iArr[1]) | (i12 << 32);
            if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
                o0.e w6 = getRoot().w();
                Object[] objArr = w6.f7317d;
                int i13 = w6.f7319i;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((c2.g0) objArr[i14]).T.f1606p.i0();
                }
                z10 = true;
                D();
                view = this.X0;
                if (view == null) {
                    view = getRootView();
                    this.X0 = view;
                }
                k2.b rectManager = getRectManager();
                long j3 = this.f3564n0;
                long c10 = x3.j0.c(this.f3573t0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.f3566p0;
                if (fArr.length >= 16) {
                    i3 = 0;
                } else {
                    i3 = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
                }
                k2.c cVar = rectManager.f5363c;
                if ((i3 & 2) != 0) {
                    fArr = null;
                }
                rectManager.f5366f = !cVar.a(j3, c10, fArr, width, height) || rectManager.f5366f;
                this.f3563m0.b(z10);
                getRectManager().a();
            }
        }
        z10 = false;
        D();
        view = this.X0;
        if (view == null) {
        }
        k2.b rectManager2 = getRectManager();
        long j32 = this.f3564n0;
        long c102 = x3.j0.c(this.f3573t0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.f3566p0;
        if (fArr.length >= 16) {
        }
        k2.c cVar2 = rectManager2.f5363c;
        if ((i3 & 2) != 0) {
        }
        rectManager2.f5366f = !cVar2.a(j32, c102, fArr, width2, height2) || rectManager2.f5366f;
        this.f3563m0.b(z10);
        getRectManager().a();
    }

    public final void M(float f3) {
        if (r()) {
            if (f3 > 0.0f) {
                if (Float.isNaN(this.M0) || f3 > this.M0) {
                    this.M0 = f3;
                    return;
                }
                return;
            }
            if (f3 < 0.0f) {
                if (Float.isNaN(this.N0) || f3 < this.N0) {
                    this.N0 = f3;
                }
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        n0.f fVar;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(h0.m());
        }
        p1 p1Var = this.f3572t;
        if (p1Var != null) {
            o1 o1Var = this.f3570s;
            o1Var.getClass();
            d9.c cVar = p1Var.f3503a;
            y0.c cVar2 = (y0.c) cVar.f3701e;
            if (!cVar2.f10571d || cVar2.f10573i) {
                return;
            }
            try {
                fVar = ((s2) o1Var).f3535a.p(new a2.a0(6, p1Var));
            } catch (CancellationException unused) {
                y0.c cVar3 = (y0.c) cVar.f3701e;
                if (!cVar3.f10572e) {
                    if (cVar3.f10573i) {
                        z0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar3.a();
                    cVar3.f10573i = true;
                }
                fVar = null;
            }
            n0.f fVar2 = p1Var.f3506d;
            if (fVar2 != null) {
                fVar2.cancel();
            }
            p1Var.f3506d = fVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i10) {
        i1.t tVar = ((i1.k) getFocusOwner()).f4603c;
        if (!tVar.B) {
            return;
        }
        if (!tVar.f3305d.B) {
            z1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new d1.k[16]);
        d1.k kVar = tVar.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar, kVar);
        } else {
            eVar.b(kVar2);
        }
        while (true) {
            int i11 = eVar.f7319i;
            if (i11 == 0) {
                return;
            }
            d1.k kVar3 = (d1.k) eVar.l(i11 - 1);
            if ((kVar3.f3308r & 1024) != 0) {
                for (d1.k kVar4 = kVar3; kVar4 != null && kVar4.B; kVar4 = kVar4.f3310t) {
                    if ((kVar4.f3307i & 1024) != 0) {
                        d1.k kVar5 = kVar4;
                        o0.e eVar2 = null;
                        while (kVar5 != null) {
                            int i12 = 0;
                            if (kVar5 instanceof i1.t) {
                                i1.t tVar2 = (i1.t) kVar5;
                                if (tVar2.B && tVar2.K().f4612a) {
                                    super.addFocusables(arrayList, i3, i10);
                                    i1.t tVar3 = ((i1.k) getFocusOwner()).f4603c;
                                    if (tVar3.B) {
                                        if (!tVar3.f3305d.B) {
                                            z1.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        o0.e eVar3 = new o0.e(new d1.k[16]);
                                        d1.k kVar6 = tVar3.f3305d;
                                        d1.k kVar7 = kVar6.f3310t;
                                        if (kVar7 == null) {
                                            c2.k.b(eVar3, kVar6);
                                        } else {
                                            eVar3.b(kVar7);
                                        }
                                        while (true) {
                                            int i13 = eVar3.f7319i;
                                            if (i13 == 0) {
                                                break;
                                            }
                                            d1.k kVar8 = (d1.k) eVar3.l(i13 - 1);
                                            if ((kVar8.f3308r & 1024) != 0) {
                                                for (d1.k kVar9 = kVar8; kVar9 != null && kVar9.B; kVar9 = kVar9.f3310t) {
                                                    if ((kVar9.f3307i & 1024) != 0) {
                                                        d1.k kVar10 = kVar9;
                                                        o0.e eVar4 = null;
                                                        while (kVar10 != null) {
                                                            if (kVar10 instanceof i1.t) {
                                                                i1.t tVar4 = (i1.t) kVar10;
                                                                if (tVar4.B) {
                                                                    i1.o K = tVar4.K();
                                                                    if (tVar4.B && !tVar4.C && K.f4612a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((kVar10.f3307i & 1024) != 0 && (kVar10 instanceof c2.j)) {
                                                                int i14 = 0;
                                                                for (d1.k kVar11 = ((c2.j) kVar10).D; kVar11 != null; kVar11 = kVar11.f3310t) {
                                                                    if ((kVar11.f3307i & 1024) != 0) {
                                                                        i14++;
                                                                        if (i14 == 1) {
                                                                            kVar10 = kVar11;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new o0.e(new d1.k[16]);
                                                                            }
                                                                            if (kVar10 != null) {
                                                                                eVar4.b(kVar10);
                                                                                kVar10 = null;
                                                                            }
                                                                            eVar4.b(kVar11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i14 == 1) {
                                                                }
                                                            }
                                                            kVar10 = c2.k.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            c2.k.b(eVar3, kVar8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((kVar5.f3307i & 1024) != 0 && (kVar5 instanceof c2.j)) {
                                for (d1.k kVar12 = ((c2.j) kVar5).D; kVar12 != null; kVar12 = kVar12.f3310t) {
                                    if ((kVar12.f3307i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            kVar5 = kVar12;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar5 != null) {
                                                eVar2.b(kVar5);
                                                kVar5 = null;
                                            }
                                            eVar2.b(kVar12);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            kVar5 = c2.k.e(eVar2);
                        }
                    }
                }
            }
            c2.k.b(eVar, kVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i3, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        j2.j u2;
        Function1 function1;
        Function1 function12;
        CharSequence textValue2;
        if (j()) {
            e1.b bVar = this.f3553d0;
            if (bVar != null) {
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int keyAt = sparseArray.keyAt(i3);
                    AutofillValue c10 = com.onesignal.common.k.c(sparseArray.get(keyAt));
                    c2.g0 g0Var = (c2.g0) bVar.f3772e.f4990c.b(keyAt);
                    if (g0Var != null && (u2 = g0Var.u()) != null) {
                        s.h0 h0Var = u2.f4975d;
                        Object g = h0Var.g(j2.i.f4956f);
                        if (g == null) {
                            g = null;
                        }
                        j2.a aVar = (j2.a) g;
                        if (aVar != null && (function12 = (Function1) aVar.f4929b) != null) {
                            textValue2 = c10.getTextValue();
                        }
                        Object g2 = h0Var.g(j2.i.g);
                        j2.a aVar2 = (j2.a) (g2 != null ? g2 : null);
                        if (aVar2 != null && (function1 = (Function1) aVar2.f4929b) != null) {
                        }
                    }
                }
            }
            c6.i iVar = this.f3551c0;
            if (iVar != null) {
                e1.j jVar = (e1.j) iVar.f1821b;
                if (jVar.f3783a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    int keyAt2 = sparseArray.keyAt(i10);
                    AutofillValue c11 = com.onesignal.common.k.c(sparseArray.get(keyAt2));
                    isText = c11.isText();
                    if (isText) {
                        textValue = c11.getTextValue();
                        textValue.toString();
                        if (jVar.f3783a.get(Integer.valueOf(keyAt2)) != null) {
                            kotlin.collections.i0.j();
                            return;
                        }
                    } else {
                        isDate = c11.isDate();
                        if (isDate) {
                            throw new hd.k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = c11.isList();
                        if (isList) {
                            throw new hd.k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = c11.isToggle();
                        if (isToggle) {
                            throw new hd.k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // i1.f
    public final void b(i1.t tVar, i1.t tVar2) {
        c2.b1 b1Var;
        boolean z10;
        c2.b1 b1Var2;
        boolean z11;
        if (tVar != null) {
            i1.t tVar3 = tVar;
            if (!tVar3.f3305d.B) {
                z1.a.b("visitAncestors called on an unattached node");
            }
            d1.k kVar = tVar3.f3305d;
            c2.g0 u2 = c2.k.u(tVar);
            s.i0 i0Var = null;
            ArrayList arrayList = null;
            while (u2 != null) {
                if ((((d1.k) u2.S.g).f3308r & 2097152) != 0) {
                    while (kVar != null) {
                        if ((kVar.f3307i & 2097152) != 0) {
                            d1.k kVar2 = kVar;
                            o0.e eVar = null;
                            while (kVar2 != null) {
                                if (kVar2 instanceof x.l) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(kVar2);
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11 && (kVar2.f3307i & 2097152) != 0 && (kVar2 instanceof c2.j)) {
                                    int i3 = 0;
                                    for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                        if ((kVar3.f3307i & 2097152) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                kVar2 = kVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar2 != null) {
                                                    eVar.b(kVar2);
                                                    kVar2 = null;
                                                }
                                                eVar.b(kVar3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                kVar2 = c2.k.e(eVar);
                            }
                        }
                        kVar = kVar.f3309s;
                    }
                }
                u2 = u2.s();
                kVar = (u2 == null || (b1Var2 = u2.S) == null) ? null : (c2.z1) b1Var2.f1495f;
            }
            if (arrayList == null) {
                return;
            }
            if (tVar2 != null) {
                if (!tVar2.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar4 = tVar2.f3305d;
                c2.g0 u10 = c2.k.u(tVar2);
                s.i0 i0Var2 = null;
                while (u10 != null) {
                    if ((((d1.k) u10.S.g).f3308r & 2097152) != 0) {
                        while (kVar4 != null) {
                            if ((kVar4.f3307i & 2097152) != 0) {
                                d1.k kVar5 = kVar4;
                                o0.e eVar2 = null;
                                while (kVar5 != null) {
                                    if (kVar5 instanceof x.l) {
                                        if (i0Var2 == null) {
                                            int i10 = s.q0.f8360a;
                                            i0Var2 = new s.i0();
                                        }
                                        i0Var2.a(kVar5);
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 && (kVar5.f3307i & 2097152) != 0 && (kVar5 instanceof c2.j)) {
                                        int i11 = 0;
                                        for (d1.k kVar6 = ((c2.j) kVar5).D; kVar6 != null; kVar6 = kVar6.f3310t) {
                                            if ((kVar6.f3307i & 2097152) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    kVar5 = kVar6;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar5 != null) {
                                                        eVar2.b(kVar5);
                                                        kVar5 = null;
                                                    }
                                                    eVar2.b(kVar6);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    kVar5 = c2.k.e(eVar2);
                                }
                            }
                            kVar4 = kVar4.f3309s;
                        }
                    }
                    u10 = u10.s();
                    kVar4 = (u10 == null || (b1Var = u10.S) == null) ? null : (c2.z1) b1Var.f1495f;
                }
                i0Var = i0Var2;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                x.l lVar = (x.l) arrayList.get(i12);
                if (!(i0Var != null ? i0Var.c(lVar) : false)) {
                    lVar.L(true);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i3) {
        this.M.g(false, this.f3554e);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        this.M.g(true, this.f3554e);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s.d0 d0Var = this.R;
        if (!isAttachedToWindow()) {
            p(getRoot());
        }
        w(true);
        b1.r.j().m();
        this.T = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            k1.o oVar = this.F;
            k1.b bVar = oVar.f5335a;
            Canvas canvas2 = bVar.f5296a;
            bVar.f5296a = canvas;
            getRoot().i(bVar, null);
            oVar.f5335a.f5296a = canvas2;
            if (d0Var.i()) {
                int i3 = d0Var.f8285b;
                for (int i10 = 0; i10 < i3; i10++) {
                    ((i1) ((c2.o1) d0Var.f(i10))).g();
                }
            }
            int i11 = d2.f3399d;
            d0Var.d();
            this.T = false;
            Trace.endSection();
            s.d0 d0Var2 = this.S;
            if (d0Var2 != null) {
                d0Var.c(d0Var2);
                d0Var2.d();
            }
            if (r()) {
                r0.a(this, this.M0);
                View view = this.f3582y;
                if (view != null) {
                    r0.a(view, this.N0);
                    if (!Float.isNaN(this.N0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.M0 = Float.NaN;
                this.N0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:658:0x0451, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:588:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x07dd  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v60, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r6v92 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        x.l lVar;
        int pointerCount;
        int i10;
        int i11;
        String str;
        int i12;
        b1.c0 c0Var;
        String str2;
        long j;
        int i13;
        s.p pVar;
        char c10;
        int i14;
        int i15;
        long j3;
        long j10;
        int i16;
        long j11;
        x.l lVar2;
        boolean z10;
        c2.b1 b1Var;
        boolean z11;
        d1.k kVar;
        c2.b1 b1Var2;
        x.l lVar3;
        boolean z12;
        int size;
        int size2;
        c2.b1 b1Var3;
        boolean z13;
        d1.k kVar2;
        c2.b1 b1Var4;
        boolean z14;
        l lVar4;
        int size3;
        c2.b1 b1Var5;
        boolean z15;
        d1.k kVar3;
        c2.b1 b1Var6;
        if (this.Q0) {
            k kVar4 = this.P0;
            removeCallbacks(kVar4);
            if (motionEvent.getActionMasked() == 8) {
                this.Q0 = false;
            } else {
                kVar4.run();
            }
        }
        if (s(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i17 = 1;
        if (motionEvent.getActionMasked() == 8) {
            int i18 = 4;
            if (!motionEvent.isFromSource(4194304)) {
                return (o(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            Context context = getContext();
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 26) {
                Method method = o3.d0.f7385a;
                e3.j.e(viewConfiguration);
            } else {
                o3.d0.a(viewConfiguration, context);
            }
            Context context2 = getContext();
            if (i19 >= 26) {
                e3.j.d(viewConfiguration);
            } else {
                o3.d0.a(viewConfiguration, context2);
            }
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            i1.h focusOwner = getFocusOwner();
            a3.a0 a0Var = new a3.a0(i18, this, motionEvent);
            i1.k kVar5 = (i1.k) focusOwner;
            if (kVar5.f4604d.f4596e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            i1.t n10 = z4.w.n(kVar5.f4603c);
            if (n10 != null) {
                if (!n10.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar6 = n10.f3305d;
                c2.g0 u2 = c2.k.u(n10);
                loop0: while (true) {
                    if (u2 == null) {
                        kVar3 = null;
                        break;
                    }
                    if ((((d1.k) u2.S.g).f3308r & 16384) != 0) {
                        while (kVar6 != null) {
                            if ((kVar6.f3307i & 16384) != 0) {
                                kVar3 = kVar6;
                                o0.e eVar = null;
                                while (kVar3 != null) {
                                    if (kVar3 instanceof l) {
                                        break loop0;
                                    }
                                    if ((kVar3.f3307i & 16384) != 0 && (kVar3 instanceof c2.j)) {
                                        int i20 = 0;
                                        for (d1.k kVar7 = ((c2.j) kVar3).D; kVar7 != null; kVar7 = kVar7.f3310t) {
                                            if ((kVar7.f3307i & 16384) != 0) {
                                                i20++;
                                                if (i20 == 1) {
                                                    kVar3 = kVar7;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar3 != null) {
                                                        eVar.b(kVar3);
                                                        kVar3 = null;
                                                    }
                                                    eVar.b(kVar7);
                                                }
                                            }
                                        }
                                        if (i20 == 1) {
                                        }
                                    }
                                    kVar3 = c2.k.e(eVar);
                                }
                            }
                            kVar6 = kVar6.f3309s;
                        }
                    }
                    u2 = u2.s();
                    kVar6 = (u2 == null || (b1Var6 = u2.S) == null) ? null : (c2.z1) b1Var6.f1495f;
                }
                lVar4 = (l) kVar3;
            } else {
                lVar4 = null;
            }
            if (lVar4 != null) {
                if (!lVar4.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar8 = lVar4.f3305d.f3309s;
                c2.g0 u10 = c2.k.u(lVar4);
                ArrayList arrayList = null;
                while (u10 != null) {
                    if ((((d1.k) u10.S.g).f3308r & 16384) != 0) {
                        while (kVar8 != null) {
                            if ((kVar8.f3307i & 16384) != 0) {
                                d1.k kVar9 = kVar8;
                                o0.e eVar2 = null;
                                while (kVar9 != null) {
                                    if (kVar9 instanceof l) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(kVar9);
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z15 && (kVar9.f3307i & 16384) != 0 && (kVar9 instanceof c2.j)) {
                                        int i21 = 0;
                                        for (d1.k kVar10 = ((c2.j) kVar9).D; kVar10 != null; kVar10 = kVar10.f3310t) {
                                            if ((kVar10.f3307i & 16384) != 0) {
                                                i21++;
                                                if (i21 == 1) {
                                                    kVar9 = kVar10;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar9 != null) {
                                                        eVar2.b(kVar9);
                                                        kVar9 = null;
                                                    }
                                                    eVar2.b(kVar10);
                                                }
                                            }
                                        }
                                        if (i21 == 1) {
                                        }
                                    }
                                    kVar9 = c2.k.e(eVar2);
                                }
                            }
                            kVar8 = kVar8.f3309s;
                        }
                    }
                    u10 = u10.s();
                    kVar8 = (u10 == null || (b1Var5 = u10.S) == null) ? null : (c2.z1) b1Var5.f1495f;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i22 = size3 - 1;
                        ((l) arrayList.get(size3)).getClass();
                        if (i22 < 0) {
                            break;
                        }
                        size3 = i22;
                    }
                }
                d1.k kVar11 = lVar4.f3305d;
                o0.e eVar3 = null;
                while (kVar11 != null) {
                    if (kVar11 instanceof l) {
                    } else if ((kVar11.f3307i & 16384) != 0 && (kVar11 instanceof c2.j)) {
                        int i23 = 0;
                        for (d1.k kVar12 = ((c2.j) kVar11).D; kVar12 != null; kVar12 = kVar12.f3310t) {
                            if ((kVar12.f3307i & 16384) != 0) {
                                i23++;
                                if (i23 == 1) {
                                    kVar11 = kVar12;
                                } else {
                                    if (eVar3 == null) {
                                        eVar3 = new o0.e(new d1.k[16]);
                                    }
                                    if (kVar11 != null) {
                                        eVar3.b(kVar11);
                                        kVar11 = null;
                                    }
                                    eVar3.b(kVar12);
                                }
                            }
                        }
                        if (i23 == 1) {
                        }
                    }
                    kVar11 = c2.k.e(eVar3);
                }
                if (!((Boolean) a0Var.invoke()).booleanValue()) {
                    d1.k kVar13 = lVar4.f3305d;
                    o0.e eVar4 = null;
                    while (kVar13 != null) {
                        if (kVar13 instanceof l) {
                        } else if ((kVar13.f3307i & 16384) != 0 && (kVar13 instanceof c2.j)) {
                            int i24 = 0;
                            for (d1.k kVar14 = ((c2.j) kVar13).D; kVar14 != null; kVar14 = kVar14.f3310t) {
                                if ((kVar14.f3307i & 16384) != 0) {
                                    i24++;
                                    if (i24 == 1) {
                                        kVar13 = kVar14;
                                    } else {
                                        if (eVar4 == null) {
                                            eVar4 = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar13 != null) {
                                            eVar4.b(kVar13);
                                            kVar13 = null;
                                        }
                                        eVar4.b(kVar14);
                                    }
                                }
                            }
                            if (i24 == 1) {
                            }
                        }
                        kVar13 = c2.k.e(eVar4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i25 = 0; i25 < size4; i25++) {
                            ((l) arrayList.get(i25)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        x1.e eVar5 = this.V;
        s.p pVar2 = eVar5.f10258e;
        SparseLongArray sparseLongArray = eVar5.f10255b;
        int actionMasked = motionEvent.getActionMasked();
        eVar5.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            eVar5.f10256c.clear();
            str = "visitAncestors called on an unattached node";
            i10 = 16;
            c0Var = null;
            lVar = null;
        } else {
            eVar5.a(motionEvent);
            if (actionMasked == 1) {
                i3 = 0;
            } else if (actionMasked != 6) {
                i3 = -1;
                boolean z16 = actionMasked != 0 || actionMasked == 2 || actionMasked == 5;
                lVar = null;
                pointerCount = motionEvent.getPointerCount();
                i10 = 16;
                ArrayList arrayList2 = new ArrayList(pointerCount);
                i11 = 0;
                while (i11 < pointerCount) {
                    int pointerId = motionEvent.getPointerId(i11);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                    if (indexOfKey >= 0) {
                        str2 = str3;
                        j = sparseLongArray.valueAt(indexOfKey);
                        i13 = i17;
                        pVar = pVar2;
                    } else {
                        str2 = str3;
                        j = eVar5.f10254a;
                        i13 = i17;
                        pVar = pVar2;
                        eVar5.f10254a = j + 1;
                        sparseLongArray.put(pointerId, j);
                    }
                    float x10 = motionEvent.getX(i11);
                    float y3 = motionEvent.getY(i11);
                    x1.e eVar6 = eVar5;
                    long floatToRawIntBits = Float.floatToRawIntBits(x10);
                    int floatToRawIntBits2 = Float.floatToRawIntBits(y3);
                    SparseLongArray sparseLongArray2 = sparseLongArray;
                    long j12 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
                    ?? r32 = i11 != i3 ? i13 : 0;
                    s.p pVar3 = pVar;
                    x1.d dVar = (x1.d) pVar3.b(j);
                    if (i11 == i3) {
                        pVar3.e(j);
                        c10 = ' ';
                        i14 = pointerCount;
                        j3 = 4294967295L;
                        i15 = 65535;
                    } else {
                        if (z16) {
                            c10 = ' ';
                            i14 = pointerCount;
                            i15 = 65535;
                            pVar3.d(j, new x1.d(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((((short) Float.intBitsToFloat((int) (j12 >> 32))) << 16) | (((short) Float.intBitsToFloat((int) (j12 & 4294967295L))) & 65535)) << 32)));
                        } else {
                            c10 = ' ';
                            i14 = pointerCount;
                            i15 = 65535;
                        }
                        j3 = 4294967295L;
                    }
                    long eventTime = motionEvent.getEventTime();
                    float pressure = motionEvent.getPressure(i11);
                    long j13 = j3;
                    long eventTime2 = dVar != null ? (dVar.f10253a >> i13) & 2147483647L : motionEvent.getEventTime();
                    if (dVar != null) {
                        i16 = i3;
                        int i26 = (int) (dVar.f10253a >>> c10);
                        j10 = j;
                        j11 = (Float.floatToRawIntBits((short) (i15 & i26)) & j13) | (Float.floatToRawIntBits((short) (i26 >>> 16)) << c10);
                    } else {
                        j10 = j;
                        i16 = i3;
                        j11 = j12;
                    }
                    arrayList2.add(new u1.b(j10, eventTime, j12, r32, pressure, eventTime2, j11, dVar != null ? (dVar.f10253a & 1) != 0 ? i13 : 0 : 0));
                    i11++;
                    pVar2 = pVar3;
                    i3 = i16;
                    sparseLongArray = sparseLongArray2;
                    str3 = str2;
                    i17 = i13;
                    eVar5 = eVar6;
                    pointerCount = i14;
                }
                str = str3;
                int i27 = i17;
                eVar5.e(motionEvent);
                if (motionEvent.isFromSource(2097152)) {
                    te.a1.e("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i27);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != 0.0f) {
                                        }
                                    }
                                }
                            }
                        }
                        i12 = 2;
                        if (actionMasked != 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
                        }
                        c0Var = new b1.c0();
                        c0Var.f954b = arrayList2;
                        c0Var.f953a = i12;
                        c0Var.f955c = motionEvent;
                        if (arrayList2.isEmpty()) {
                            te.a1.e("changes cannot be empty");
                            throw null;
                        }
                    }
                    i12 = 1;
                    if (actionMasked != 0) {
                    }
                    c0Var = new b1.c0();
                    c0Var.f954b = arrayList2;
                    c0Var.f953a = i12;
                    c0Var.f955c = motionEvent;
                    if (arrayList2.isEmpty()) {
                    }
                }
                i12 = 0;
                if (actionMasked != 0) {
                }
                c0Var = new b1.c0();
                c0Var.f954b = arrayList2;
                c0Var.f953a = i12;
                c0Var.f955c = motionEvent;
                if (arrayList2.isEmpty()) {
                }
            } else {
                i3 = motionEvent.getActionIndex();
            }
            if (actionMasked != 0) {
            }
            lVar = null;
            pointerCount = motionEvent.getPointerCount();
            i10 = 16;
            ArrayList arrayList22 = new ArrayList(pointerCount);
            i11 = 0;
            while (i11 < pointerCount) {
            }
            str = str3;
            int i272 = i17;
            eVar5.e(motionEvent);
            if (motionEvent.isFromSource(2097152)) {
            }
        }
        a8.l lVar5 = this.R0;
        if (c0Var == null) {
            i1.t f3 = ((i1.k) getFocusOwner()).f();
            if (f3 != null) {
                if (!f3.f3305d.B) {
                    z1.a.b(str);
                }
                d1.k kVar15 = f3.f3305d;
                c2.g0 u11 = c2.k.u(f3);
                loop26: while (true) {
                    if (u11 == null) {
                        kVar = lVar;
                        break;
                    }
                    int i28 = 2097152;
                    if ((((d1.k) u11.S.g).f3308r & 2097152) != 0) {
                        while (kVar15 != null) {
                            if ((kVar15.f3307i & i28) != 0) {
                                kVar = kVar15;
                                x.l lVar6 = lVar;
                                while (kVar != null) {
                                    if (kVar instanceof x.l) {
                                        break loop26;
                                    }
                                    ?? r52 = lVar6;
                                    if ((kVar.f3307i & i28) != 0) {
                                        r52 = lVar6;
                                        if (kVar instanceof c2.j) {
                                            d1.k kVar16 = ((c2.j) kVar).D;
                                            int i29 = 0;
                                            r52 = lVar6;
                                            while (kVar16 != null) {
                                                if ((kVar16.f3307i & i28) != 0) {
                                                    i29++;
                                                    r52 = r52;
                                                    if (i29 == 1) {
                                                        kVar = kVar16;
                                                    } else {
                                                        if (r52 == 0) {
                                                            r52 = new o0.e(new d1.k[16]);
                                                        }
                                                        if (kVar != null) {
                                                            r52.b(kVar);
                                                            kVar = lVar;
                                                        }
                                                        r52.b(kVar16);
                                                    }
                                                }
                                                kVar16 = kVar16.f3310t;
                                                i28 = 2097152;
                                                r52 = r52;
                                            }
                                            r52 = r52;
                                            if (i29 == 1) {
                                                i28 = 2097152;
                                                lVar6 = r52;
                                            }
                                        }
                                    }
                                    kVar = c2.k.e(r52);
                                    i28 = 2097152;
                                    lVar6 = r52;
                                }
                            }
                            kVar15 = kVar15.f3309s;
                            i28 = 2097152;
                        }
                    }
                    u11 = u11.s();
                    kVar15 = (u11 == null || (b1Var2 = u11.S) == null) ? lVar : (c2.z1) b1Var2.f1495f;
                }
                lVar2 = (x.l) kVar;
            } else {
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                if (!lVar2.f3305d.B) {
                    z1.a.b(str);
                }
                d1.k kVar17 = lVar2.f3305d.f3309s;
                c2.g0 u12 = c2.k.u(lVar2);
                ?? r53 = lVar;
                while (u12 != null) {
                    int i30 = 2097152;
                    r53 = r53;
                    if ((((d1.k) u12.S.g).f3308r & 2097152) != 0) {
                        while (kVar17 != null) {
                            if ((kVar17.f3307i & i30) != 0) {
                                d1.k kVar18 = kVar17;
                                ?? r72 = lVar;
                                while (kVar18 != null) {
                                    ArrayList arrayList3 = r53;
                                    if (kVar18 instanceof x.l) {
                                        if (r53 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(kVar18);
                                        z11 = false;
                                        r53 = arrayList3;
                                    } else {
                                        z11 = true;
                                        r53 = r53;
                                    }
                                    if (z11 && (kVar18.f3307i & 2097152) != 0 && (kVar18 instanceof c2.j)) {
                                        d1.k kVar19 = ((c2.j) kVar18).D;
                                        int i31 = 0;
                                        r72 = r72;
                                        while (kVar19 != null) {
                                            if ((kVar19.f3307i & 2097152) != 0) {
                                                i31++;
                                                if (i31 == 1) {
                                                    kVar18 = kVar19;
                                                } else {
                                                    r72 = r72 == 0 ? new o0.e(new d1.k[16]) : r72;
                                                    if (kVar18 != null) {
                                                        r72.b(kVar18);
                                                        kVar18 = lVar;
                                                    }
                                                    r72.b(kVar19);
                                                    kVar19 = kVar19.f3310t;
                                                    r72 = r72;
                                                }
                                            }
                                            kVar19 = kVar19.f3310t;
                                            r72 = r72;
                                        }
                                        if (i31 != 1) {
                                            kVar18 = c2.k.e(r72);
                                        }
                                    }
                                    kVar18 = c2.k.e(r72);
                                }
                            }
                            i30 = 2097152;
                            kVar17 = kVar17.f3309s;
                            r53 = r53;
                        }
                    }
                    u12 = u12.s();
                    kVar17 = (u12 == null || (b1Var = u12.S) == null) ? lVar : (c2.z1) b1Var.f1495f;
                }
                z10 = true;
                lVar2.L(true);
                if (r53 != 0) {
                    int size5 = r53.size();
                    for (int i32 = 0; i32 < size5; i32++) {
                        ((x.l) r53.get(i32)).L(true);
                    }
                }
            } else {
                z10 = true;
            }
            lVar5.f357b = 0;
            lVar5.f356a = z10;
            return z10;
        }
        i1.k kVar20 = (i1.k) getFocusOwner();
        if (kVar20.f4604d.f4596e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            i1.t f10 = kVar20.f();
            if (f10 != null) {
                if (!f10.f3305d.B) {
                    z1.a.b(str);
                }
                d1.k kVar21 = f10.f3305d;
                c2.g0 u13 = c2.k.u(f10);
                loop14: while (true) {
                    if (u13 == null) {
                        kVar2 = lVar;
                        break;
                    }
                    int i33 = 2097152;
                    if ((((d1.k) u13.S.g).f3308r & 2097152) != 0) {
                        while (kVar21 != null) {
                            if ((kVar21.f3307i & i33) != 0) {
                                kVar2 = kVar21;
                                x.l lVar7 = lVar;
                                while (kVar2 != null) {
                                    if (kVar2 instanceof x.l) {
                                        break loop14;
                                    }
                                    ?? r62 = lVar7;
                                    if ((kVar2.f3307i & i33) != 0) {
                                        r62 = lVar7;
                                        if (kVar2 instanceof c2.j) {
                                            d1.k kVar22 = ((c2.j) kVar2).D;
                                            int i34 = 0;
                                            r62 = lVar7;
                                            while (kVar22 != null) {
                                                if ((kVar22.f3307i & i33) != 0) {
                                                    i34++;
                                                    r62 = r62;
                                                    if (i34 == 1) {
                                                        kVar2 = kVar22;
                                                    } else {
                                                        if (r62 == 0) {
                                                            r62 = new o0.e(new d1.k[i10]);
                                                        }
                                                        if (kVar2 != null) {
                                                            r62.b(kVar2);
                                                            kVar2 = lVar;
                                                        }
                                                        r62.b(kVar22);
                                                    }
                                                }
                                                kVar22 = kVar22.f3310t;
                                                i33 = 2097152;
                                                i10 = 16;
                                                r62 = r62;
                                            }
                                            r62 = r62;
                                            if (i34 == 1) {
                                                i33 = 2097152;
                                                i10 = 16;
                                                lVar7 = r62;
                                            }
                                        }
                                    }
                                    kVar2 = c2.k.e(r62);
                                    i33 = 2097152;
                                    i10 = 16;
                                    lVar7 = r62;
                                }
                            }
                            kVar21 = kVar21.f3309s;
                            i33 = 2097152;
                            i10 = 16;
                        }
                    }
                    u13 = u13.s();
                    kVar21 = (u13 == null || (b1Var4 = u13.S) == null) ? lVar : (c2.z1) b1Var4.f1495f;
                    i10 = 16;
                }
                lVar3 = (x.l) kVar2;
            } else {
                lVar3 = lVar;
            }
            if (lVar3 != null) {
                if (!lVar3.f3305d.B) {
                    z1.a.b(str);
                }
                d1.k kVar23 = lVar3.f3305d.f3309s;
                c2.g0 u14 = c2.k.u(lVar3);
                ?? r63 = lVar;
                while (u14 != null) {
                    int i35 = 2097152;
                    r63 = r63;
                    if ((((d1.k) u14.S.g).f3308r & 2097152) != 0) {
                        while (kVar23 != null) {
                            if ((kVar23.f3307i & i35) != 0) {
                                d1.k kVar24 = kVar23;
                                ?? r82 = lVar;
                                while (kVar24 != null) {
                                    ArrayList arrayList4 = r63;
                                    if (kVar24 instanceof x.l) {
                                        if (r63 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(kVar24);
                                        z13 = false;
                                        r63 = arrayList4;
                                    } else {
                                        z13 = true;
                                        r63 = r63;
                                    }
                                    if (z13) {
                                        int i36 = 2097152;
                                        if ((kVar24.f3307i & 2097152) != 0 && (kVar24 instanceof c2.j)) {
                                            d1.k kVar25 = ((c2.j) kVar24).D;
                                            int i37 = 0;
                                            r82 = r82;
                                            while (kVar25 != null) {
                                                if ((kVar25.f3307i & i36) != 0) {
                                                    i37++;
                                                    r82 = r82;
                                                    if (i37 == 1) {
                                                        kVar24 = kVar25;
                                                    } else {
                                                        if (r82 == 0) {
                                                            r82 = new o0.e(new d1.k[16]);
                                                        }
                                                        if (kVar24 != null) {
                                                            r82.b(kVar24);
                                                            kVar24 = lVar;
                                                        }
                                                        r82.b(kVar25);
                                                    }
                                                }
                                                kVar25 = kVar25.f3310t;
                                                i36 = 2097152;
                                                r82 = r82;
                                            }
                                            if (i37 == 1) {
                                            }
                                        }
                                    }
                                    kVar24 = c2.k.e(r82);
                                }
                            }
                            kVar23 = kVar23.f3309s;
                            i35 = 2097152;
                            r63 = r63;
                        }
                    }
                    u14 = u14.s();
                    kVar23 = (u14 == null || (b1Var3 = u14.S) == null) ? lVar : (c2.z1) b1Var3.f1495f;
                }
                if (r63 != 0 && r63.size() - 1 >= 0) {
                    while (true) {
                        int i38 = size2 - 1;
                        ((x.l) r63.get(size2)).P(c0Var, x1.h.f10270d);
                        if (i38 < 0) {
                            break;
                        }
                        size2 = i38;
                    }
                }
                lVar3.P(c0Var, x1.h.f10270d);
                lVar3.P(c0Var, x1.h.f10271e);
                if (r63 != 0) {
                    int size6 = r63.size();
                    for (int i39 = 0; i39 < size6; i39++) {
                        ((x.l) r63.get(i39)).P(c0Var, x1.h.f10271e);
                    }
                }
                if (r63 != 0 && r63.size() - 1 >= 0) {
                    while (true) {
                        int i40 = size - 1;
                        ((x.l) r63.get(size)).P(c0Var, x1.h.f10272i);
                        if (i40 < 0) {
                            break;
                        }
                        size = i40;
                    }
                }
                lVar3.P(c0Var, x1.h.f10272i);
            }
            ArrayList arrayList5 = (ArrayList) c0Var.f954b;
            int size7 = arrayList5.size();
            for (int i41 = 0; i41 < size7; i41++) {
                if (((u1.b) arrayList5.get(i41)).f9607i) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        lVar5.getClass();
        MotionEvent motionEvent2 = (MotionEvent) c0Var.f955c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z14 = true;
            if ((action == 1 || action == 2) && z12) {
                lVar5.f357b = 0;
                lVar5.f356a = true;
            }
        } else {
            z14 = true;
            lVar5.f357b = c0Var.f953a;
            lVar5.f356a = false;
        }
        ((GestureDetector) lVar5.f359d).onTouchEvent(motionEvent2);
        return z14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (u(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i3;
        boolean z10 = this.Q0;
        k kVar = this.P0;
        if (z10) {
            removeCallbacks(kVar);
            kVar.run();
        }
        if (!s(motionEvent) && isAttachedToWindow()) {
            b0 b0Var = this.M;
            v vVar = b0Var.f3338r;
            AccessibilityManager accessibilityManager = b0Var.f3341u;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    vVar.w(true);
                    c2.o oVar = new c2.o();
                    c2.b1 b1Var = vVar.getRoot().S;
                    c2.i1 i1Var = (c2.i1) b1Var.f1494e;
                    k1.d0 d0Var = c2.i1.Z;
                    ((c2.i1) b1Var.f1494e).I0(c2.i1.f1589c0, i1Var.A0((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y3) & 4294967295L)), oVar, 1, true);
                    s.d0 d0Var2 = oVar.f1628d;
                    for (int i10 = d0Var2.f8285b - 1; -1 < i10; i10--) {
                        Object f3 = d0Var2.f(i10);
                        f3.getClass();
                        c2.g0 u2 = c2.k.u((d1.k) f3);
                        if (vVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(u2) != null) {
                            break;
                        }
                        if (u2.S.d(8)) {
                            int r9 = b0Var.r(u2.f1550e);
                            j2.m a9 = j2.p.a(u2, false);
                            if (j2.p.h(a9)) {
                                if (!a9.k().f4975d.c(j2.q.f5016z)) {
                                    i3 = r9;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i3 = Integer.MIN_VALUE;
                    vVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i11 = b0Var.f3339s;
                    if (i11 != i3) {
                        b0Var.f3339s = i3;
                        b0.v(b0Var, i3, 128, null, 12);
                        b0.v(b0Var, i11, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i12 = b0Var.f3339s;
                    if (i12 == Integer.MIN_VALUE) {
                        vVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i12 != Integer.MIN_VALUE) {
                        b0Var.f3339s = Integer.MIN_VALUE;
                        b0.v(b0Var, Integer.MIN_VALUE, 128, null, 12);
                        b0.v(b0Var, i12, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && t(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.I0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.I0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.Q0 = true;
                        postDelayed(kVar, 8L);
                        return false;
                    }
                }
                if ((o(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((i1.k) getFocusOwner()).d(keyEvent, new a3.a0(3, this, keyEvent));
        }
        n1 n1Var = getComposeViewContext().f3369s;
        int metaState = keyEvent.getMetaState();
        n1Var.getClass();
        g2.f3415a.setValue(new x1.r(metaState));
        return ((i1.k) getFocusOwner()).d(keyEvent, i1.g.f4597d) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        c2.b1 b1Var;
        if (isFocused()) {
            i1.k kVar = (i1.k) getFocusOwner();
            if (kVar.f4604d.f4596e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                i1.t n10 = z4.w.n(kVar.f4603c);
                if (n10 != null) {
                    if (!n10.f3305d.B) {
                        z1.a.b("visitAncestors called on an unattached node");
                    }
                    d1.k kVar2 = n10.f3305d;
                    c2.g0 u2 = c2.k.u(n10);
                    while (u2 != null) {
                        if ((((d1.k) u2.S.g).f3308r & 131072) != 0) {
                            while (kVar2 != null) {
                                if ((kVar2.f3307i & 131072) != 0) {
                                    d1.k kVar3 = kVar2;
                                    o0.e eVar = null;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3307i & 131072) != 0 && (kVar3 instanceof c2.j)) {
                                            int i3 = 0;
                                            for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                                if ((kVar4.f3307i & 131072) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        kVar3 = kVar4;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new o0.e(new d1.k[16]);
                                                        }
                                                        if (kVar3 != null) {
                                                            eVar.b(kVar3);
                                                            kVar3 = null;
                                                        }
                                                        eVar.b(kVar4);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                        kVar3 = c2.k.e(eVar);
                                    }
                                }
                                kVar2 = kVar2.f3309s;
                            }
                        }
                        u2 = u2.s();
                        kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (c2.z1) b1Var.f1495f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            c0.f3352a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object s0Var;
        i1.t f3;
        if (this.Q0) {
            k kVar = this.P0;
            removeCallbacks(kVar);
            MotionEvent motionEvent2 = this.I0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.Q0 = false;
            } else {
                kVar.run();
            }
        }
        if (!s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u(motionEvent))) {
            int o6 = o(motionEvent);
            if ((o6 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z10 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z11 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z10 && z11) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (s0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    s0Var = new s0(1);
                }
                if (s0Var.equals(new s0(1)) && (f3 = ((i1.k) getFocusOwner()).f()) != null) {
                    c2.i1 t6 = c2.k.t(f3);
                    j1.c p4 = a2.q.h(t6).p(t6, true);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    if (!((intBitsToFloat < p4.f4918c) & (intBitsToFloat >= p4.f4916a) & (intBitsToFloat2 >= p4.f4917b) & (intBitsToFloat2 < p4.f4919d))) {
                        ((i1.k) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((o6 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i3) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m(this, i3);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i3));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        j1.c a9;
        if (view == null || this.f3563m0.f1679c) {
            return super.focusSearch(view, i3);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i3);
        if (findNextFocus == null || !h0.a(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            i1.t n10 = z4.w.n(((i1.k) getFocusOwner()).f4603c);
            a9 = n10 != null ? z4.w.o(n10) : null;
            if (a9 == null) {
                a9 = i1.d.a(view, this);
            }
        } else {
            a9 = i1.d.a(view, this);
        }
        i1.c d10 = i1.d.d(i3);
        int i10 = d10 != null ? d10.f4589a : 6;
        wd.b0 b0Var = new wd.b0();
        if (((i1.k) getFocusOwner()).e(i10, a9, new q(b0Var, 0)) == null) {
            return view;
        }
        Object obj = b0Var.f10141d;
        if (obj == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i3);
            }
        } else if (findNextFocus == null || i10 == 1 || i10 == 2 || c6.f.N(z4.w.o((i1.t) obj), i1.d.a(findNextFocus, this), a9, i10)) {
            return this;
        }
        return findNextFocus;
    }

    public final p0 getAndroidViewsHandler$ui() {
        if (this.f3560j0 == null) {
            p0 p0Var = new p0(getContext());
            this.f3560j0 = p0Var;
            addView(p0Var, -1);
            requestLayout();
        }
        p0 p0Var2 = this.f3560j0;
        p0Var2.getClass();
        return p0Var2;
    }

    public e1.f getAutofill() {
        return this.f3551c0;
    }

    public e1.i getAutofillManager() {
        return this.f3553d0;
    }

    public e1.j getAutofillTree() {
        return this.Q;
    }

    public final c1 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.V0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f3549a0.getValue();
    }

    public final f1.e getContentCaptureManager$ui() {
        return this.N;
    }

    public CoroutineContext getCoroutineContext() {
        return this.A;
    }

    public x2.c getDensity() {
        return (x2.c) this.f3580x.getValue();
    }

    public j1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            i1.t n10 = z4.w.n(((i1.k) getFocusOwner()).f4603c);
            if (n10 != null) {
                return z4.w.o(n10);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return i1.d.a(findFocus, this);
        }
        return null;
    }

    public i1.h getFocusOwner() {
        return this.f3584z;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        j1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f4916a);
            rect.top = Math.round(embeddedViewFocusRect.f4917b);
            rect.right = Math.round(embeddedViewFocusRect.f4918c);
            rect.bottom = Math.round(embeddedViewFocusRect.f4919d);
            return;
        }
        if (Intrinsics.a(((i1.k) getFocusOwner()).e(6, null, r.f3515e), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public p2.h getFontFamilyResolver() {
        return (p2.h) this.C0.getValue();
    }

    public p2.g getFontLoader() {
        return this.B0;
    }

    public final o1 getFrameEndScheduler$ui() {
        return this.f3570s;
    }

    public k1.t getGraphicsContext() {
        return this.P;
    }

    public s1.a getHapticFeedBack() {
        return this.E0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f3563m0.f1678b.x() || !this.f3576v.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public t1.b getInputModeManager() {
        return this.F0;
    }

    public final a2.m getInsetsListener() {
        return this.H;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f3569r0;
    }

    @Override // android.view.View, android.view.ViewParent
    public x2.l getLayoutDirection() {
        return (x2.l) this.D0.getValue();
    }

    public s2.b getLocaleList() {
        return (s2.b) this.f3550b0.getValue();
    }

    public long getMeasureIteration() {
        c2.u0 u0Var = this.f3563m0;
        if (!u0Var.f1679c) {
            z1.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return u0Var.g;
    }

    public b2.b getModifierLocalManager() {
        return this.G0;
    }

    public v getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public a2.n0 getPlacementScope() {
        int i3 = a2.q0.f142b;
        return new a2.d0(1, this);
    }

    public x1.k getPointerIconService() {
        return this.Y0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final u1.a m35getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return null;
    }

    public k2.b getRectManager() {
        return this.K;
    }

    public y0.d getRetainedValuesStore() {
        return this.f3574u;
    }

    public c2.g0 getRoot() {
        return this.I;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        n1 n1Var;
        if (Build.VERSION.SDK_INT < 31 || (n1Var = this.W0) == null) {
            return false;
        }
        return ((Boolean) n1Var.f3487a.getValue()).booleanValue();
    }

    public j2.o getSemanticsOwner() {
        return this.L;
    }

    public c2.i0 getSharedDrawScope() {
        return this.f3568r;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? q0.f3510a.a(this) : this.f3559i0;
    }

    public c2.q1 getSnapshotObserver() {
        return this.h0;
    }

    public w1 getSoftwareKeyboardController() {
        k1 k1Var = this.A0;
        if (k1Var != null) {
            return k1Var;
        }
        getTextInputService();
        k1 k1Var2 = new k1();
        this.A0 = k1Var2;
        return k1Var2;
    }

    public q2.c getTextInputService() {
        q2.c cVar = this.f3583y0;
        if (cVar != null) {
            return cVar;
        }
        getLegacyTextInputServiceAndroid();
        q2.c cVar2 = new q2.c();
        new AtomicReference(null);
        this.f3583y0 = cVar2;
        return cVar2;
    }

    public x1 getTextToolbar() {
        return this.H0;
    }

    public final c2.u1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public c2 getViewConfiguration() {
        return this.G;
    }

    public final m getViewTreeOwners() {
        v4.a.w(this.f3577v0.getValue());
        return null;
    }

    public f2 getWindowInfo() {
        return getComposeViewContext().f3369s;
    }

    public final e1.b get_autofillManager$ui() {
        return this.f3553d0;
    }

    @Override // androidx.lifecycle.f
    public final void i(androidx.lifecycle.u uVar) {
        p1 p1Var = this.f3572t;
        if (p1Var != null) {
            y0.c cVar = (y0.c) p1Var.f3503a.f3701e;
            if (cVar.f10571d && !cVar.f10573i) {
                n0.f fVar = p1Var.f3506d;
                if (fVar != null) {
                    fVar.cancel();
                }
                p1Var.f3506d = null;
                return;
            }
            if (cVar.f10572e) {
                return;
            }
            if (!cVar.f10573i) {
                z0.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.f10574r.i()) {
                z0.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.f10573i = false;
        }
    }

    public final void n(c2.g0 g0Var, boolean z10) {
        this.f3563m0.f(g0Var, z10);
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
    public final int o(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        MotionEvent motionEvent2;
        v vVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z11;
        x1.b bVar;
        removeCallbacks(this.O0);
        try {
            E(motionEvent);
            this.f3571s0 = true;
            w(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.I0;
                boolean z12 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                b7.h hVar = this.W;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z10 = false;
                            if (z10) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!hVar.f1292a) {
                                        ((s.p) ((v.c1) hVar.f1295d).f9767e).a();
                                        ((x1.b) hVar.f1294c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z12) {
                                    J(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z13 = motionEvent.getToolType(0) != 3;
                                if (z12 && z13 && actionMasked2 != 3 && actionMasked2 != 9 && t(motionEvent)) {
                                    vVar = this;
                                    vVar.J(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    vVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = vVar.I0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = vVar.I0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    x1.e eVar = vVar.V;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = vVar.I0;
                                            float x10 = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = vVar.I0;
                                            z11 = x10 == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = vVar.I0;
                                            boolean z14 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z11 || z14) {
                                                if (pointerId >= 0) {
                                                    eVar.f10256c.delete(pointerId);
                                                    eVar.f10255b.delete(pointerId);
                                                }
                                                bVar = (x1.b) hVar.f1294c;
                                                if (bVar.f10249d) {
                                                    bVar.g.f10268a.g();
                                                } else {
                                                    bVar.f10249d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        eVar.f10256c.delete(pointerId);
                                        eVar.f10255b.delete(pointerId);
                                    }
                                }
                                vVar.I0 = MotionEvent.obtainNoHistory(motionEvent);
                                int I = I(motionEvent);
                                Trace.endSection();
                                vVar.f3571s0 = false;
                                return I;
                            }
                        }
                        z10 = true;
                        if (z10) {
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
                if (z12) {
                }
                vVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = vVar.I0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = vVar.I0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    x1.e eVar2 = vVar.V;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = vVar.I0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = vVar.I0;
                        if (motionEvent72 != null) {
                        }
                        if (x10 == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = vVar.I0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z11) {
                        }
                        if (pointerId >= 0) {
                        }
                        bVar = (x1.b) hVar.f1294c;
                        if (bVar.f10249d) {
                        }
                    }
                }
                vVar.I0 = MotionEvent.obtainNoHistory(motionEvent);
                int I2 = I(motionEvent);
                Trace.endSection();
                vVar.f3571s0 = false;
                return I2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f3571s0 = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        y0.d dVar;
        Object obj;
        c6.i iVar;
        super.onAttachedToWindow();
        setAttached(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            setShowLayoutBounds(h0.m());
        }
        this.H.onViewAttachedToWindow(this);
        int i10 = 0;
        if (i3 > 28) {
            if (f3548d1 == null) {
                com.appsflyer.internal.q qVar = new com.appsflyer.internal.q(r0);
                f3548d1 = qVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (Z0 == null) {
                        Z0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f3546b1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = Z0;
                        f3546b1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f3546b1;
                    if (method != null) {
                        method.invoke(null, qVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            s.d0 d0Var = f3547c1;
            synchronized (d0Var) {
                d0Var.a(this);
            }
        }
        if (!this.V0) {
            getComposeViewContext().c();
        }
        this.V0 = false;
        q(getRoot());
        p(getRoot());
        getSnapshotObserver().f1645a.d();
        if (j() && (iVar = this.f3551c0) != null) {
            e1.h hVar = e1.h.f3782a;
            hVar.getClass();
            ((AutofillManager) iVar.f1822c).registerCallback(com.onesignal.common.k.a(hVar));
        }
        androidx.lifecycle.u uVar = getComposeViewContext().f3355c;
        androidx.lifecycle.a1 a1Var = getComposeViewContext().f3357e;
        o1 o1Var = this.f3570s;
        if (uVar == null || a1Var == null || o1Var == null) {
            dVar = null;
        } else {
            androidx.lifecycle.z0 f3 = a1Var.f();
            androidx.lifecycle.x0 x0Var = new androidx.lifecycle.x0();
            k4.a aVar = k4.a.f5385b;
            f3.getClass();
            aVar.getClass();
            c6.n nVar = new c6.n(f3, x0Var, aVar);
            wd.h a9 = wd.c0.a(q1.class);
            String b10 = a9.b();
            if (b10 == null) {
                te.a1.e("Local and anonymous classes can not be ViewModels");
                return;
            }
            q1 q1Var = (q1) nVar.b(a9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
            Object parent = getParent();
            parent.getClass();
            int id2 = ((View) parent).getId();
            s.w wVar = q1Var.f3511b;
            Object b11 = wVar.b(id2);
            if (b11 == null) {
                b11 = new s.d0(1);
                wVar.h(id2, b11);
            }
            s.d0 d0Var2 = (s.d0) b11;
            Object[] objArr = d0Var2.f8284a;
            int i11 = d0Var2.f8285b;
            while (true) {
                if (i10 >= i11) {
                    obj = null;
                    break;
                }
                obj = objArr[i10];
                if (!((p1) obj).f3505c) {
                    break;
                } else {
                    i10++;
                }
            }
            p1 p1Var = (p1) obj;
            if (p1Var == null) {
                p1Var = new p1();
                d0Var2.a(p1Var);
            }
            p1Var.f3505c = true;
            this.f3572t = p1Var;
            dVar = p1Var.f3504b;
        }
        if (dVar == null) {
            dVar = y0.a.f10569d;
        }
        this.f3574u = dVar;
        Function1 function1 = this.f3579w0;
        if (function1 != null) {
            function1.invoke(getComposeViewContext());
            this.f3579w0 = null;
        }
        androidx.lifecycle.w g = getComposeViewContext().f3355c.g();
        g.a(this);
        g.a(this.N);
        this.F0.f9224a.setValue(new t1.a(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            f0.f3408a.b(this);
        }
        e1.b bVar = this.f3553d0;
        if (bVar != null) {
            ((i1.k) getFocusOwner()).g.a(bVar);
            getSemanticsOwner().f4991d.a(bVar);
        }
        ((i1.k) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f3585z0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        kotlin.collections.i0.j();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f3585z0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        kotlin.collections.i0.j();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        j2.m mVar;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        f1.e eVar = this.N;
        eVar.getClass();
        for (long j : jArr) {
            j2.n nVar = (j2.n) eVar.f().b((int) j);
            if (nVar != null && (mVar = nVar.f4986a) != null) {
                a7.h.r();
                autofillId = eVar.f4045d.getAutofillId();
                ViewTranslationRequest.Builder m10 = a7.h.m(autofillId, mVar.f4985f);
                Object g = mVar.f4983d.f4975d.g(j2.q.A);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new m2.e(z2.a.a(list, "\n", null, 62)));
                    m10.setValue("android:text", forText);
                    build = m10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c6.i iVar;
        super.onDetachedFromWindow();
        setAttached(false);
        this.H.onViewDetachedFromWindow(this);
        View view = this.f3582y;
        if (r() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            s.d0 d0Var = f3547c1;
            synchronized (d0Var) {
                d0Var.j(this);
            }
        }
        getComposeViewContext().b();
        c2.q1 snapshotObserver = getSnapshotObserver();
        b1.h hVar = snapshotObserver.f1645a.f951h;
        if (hVar != null) {
            hVar.d();
        }
        b1.b0 b0Var = snapshotObserver.f1645a;
        synchronized (b0Var.g) {
            o0.e eVar = b0Var.f950f;
            Object[] objArr = eVar.f7317d;
            int i3 = eVar.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                b1.a0 a0Var = (b1.a0) objArr[i10];
                a0Var.f936e.a();
                a0Var.f937f.a();
                a0Var.f941l.a();
                a0Var.f942m.clear();
            }
        }
        androidx.lifecycle.w g = getComposeViewContext().f3355c.g();
        g.f(this.N);
        g.f(this);
        if (j() && (iVar = this.f3551c0) != null) {
            e1.h hVar2 = e1.h.f3782a;
            hVar2.getClass();
            ((AutofillManager) iVar.f1822c).unregisterCallback(com.onesignal.common.k.a(hVar2));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        p1 p1Var = this.f3572t;
        if (p1Var != null) {
            p1Var.f3505c = false;
        }
        this.f3572t = null;
        if (Build.VERSION.SDK_INT >= 31) {
            f0.f3408a.a(this);
        }
        e1.b bVar = this.f3553d0;
        if (bVar != null) {
            getSemanticsOwner().f4991d.j(bVar);
            ((i1.k) getFocusOwner()).g.j(bVar);
        }
        k2.b rectManager = getRectManager();
        rectManager.f5366f = rectManager.f5363c.a(0L, 0L, null, 0, 0);
        getRectManager().a();
        k2.b rectManager2 = getRectManager();
        a3.a aVar = rectManager2.f5367h;
        if (aVar != null) {
            rectManager2.f5361a.removeCallbacks(aVar);
            rectManager2.f5367h = null;
        }
        ((i1.k) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        super.onFocusChanged(z10, i3, rect);
        if (z10 || hasFocus()) {
            return;
        }
        i1.k kVar = (i1.k) getFocusOwner();
        k7.e.j(kVar.f4603c, true);
        if (kVar.f() != null) {
            i1.t f3 = kVar.f();
            kVar.h(null);
            if (f3 != null) {
                f3.J(i1.r.f4626d, i1.r.f4628i);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f3569r0 = 0L;
        L();
        int i3 = Build.VERSION.SDK_INT;
        if (32 > i3 || i3 >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f3569r0 = 0L;
            this.f3563m0.k(this.S0);
            this.f3561k0 = null;
            L();
            if (this.f3560j0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i11 - i3, i12 - i10);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        c2.u0 u0Var = this.f3563m0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                q(getRoot());
            }
            long l10 = l(i3);
            hd.z zVar = hd.a0.f4495e;
            long l11 = l(i10);
            long q3 = k7.e.q((int) (l10 >>> 32), (int) (l10 & 4294967295L), (int) (l11 >>> 32), (int) (4294967295L & l11));
            x2.a aVar = this.f3561k0;
            if (aVar == null) {
                this.f3561k0 = new x2.a(q3);
                this.f3562l0 = false;
            } else if (!x2.a.b(aVar.f10316a, q3)) {
                this.f3562l0 = true;
            }
            u0Var.q(q3);
            u0Var.l();
            setMeasuredDimension(getRoot().T.f1606p.f131d, getRoot().T.f1606p.f132e);
            if (this.f3560j0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().T.f1606p.f131d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().T.f1606p.f132e, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        if (!j() || viewStructure == null) {
            return;
        }
        e1.b bVar = this.f3553d0;
        if (bVar != null) {
            c2.g0 g0Var = bVar.f3772e.f4988a;
            AutofillId autofillId = bVar.f3776t;
            String str = bVar.f3775s;
            k2.b bVar2 = bVar.f3774r;
            g8.b.H(viewStructure, g0Var, autofillId, str, bVar2);
            Object[] objArr = s.n0.f8348a;
            s.d0 d0Var = new s.d0(2);
            d0Var.a(g0Var);
            d0Var.a(viewStructure);
            while (d0Var.i()) {
                Object k10 = d0Var.k(d0Var.f8285b - 1);
                k10.getClass();
                ViewStructure viewStructure2 = (ViewStructure) k10;
                Object k11 = d0Var.k(d0Var.f8285b - 1);
                k11.getClass();
                o0.b bVar3 = (o0.b) ((c2.g0) k11).l();
                int i10 = bVar3.f7311d.f7319i;
                for (int i11 = 0; i11 < i10; i11++) {
                    c2.g0 g0Var2 = (c2.g0) bVar3.get(i11);
                    if (!g0Var2.f1549d0 && g0Var2.E() && g0Var2.F()) {
                        j2.j u2 = g0Var2.u();
                        if (u2 != null) {
                            s.h0 h0Var = u2.f4975d;
                            if (h0Var.b(j2.i.f4956f) || h0Var.b(j2.i.g) || h0Var.b(j2.q.f5007q) || h0Var.b(j2.q.f5008r)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                g8.b.H(newChild, g0Var2, bVar.f3776t, str, bVar2);
                                d0Var.a(g0Var2);
                                d0Var.a(newChild);
                            }
                        }
                        d0Var.a(g0Var2);
                        d0Var.a(viewStructure2);
                    }
                }
            }
        }
        c6.i iVar = this.f3551c0;
        if (iVar != null) {
            e1.j jVar = (e1.j) iVar.f1821b;
            LinkedHashMap linkedHashMap = jVar.f3783a;
            LinkedHashMap linkedHashMap2 = jVar.f3783a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    kotlin.collections.i0.j();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) iVar.f1823d, intValue);
                newChild2.setId(intValue, ((v) iVar.f1820a).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        int toolType = motionEvent.getToolType(i3);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        if (this.f3558i) {
            int[] iArr = i1.d.f4590a;
            x2.l lVar = i3 != 0 ? i3 != 1 ? null : x2.l.f10331e : x2.l.f10330d;
            if (lVar == null) {
                lVar = x2.l.f10330d;
            }
            setLayoutDirection(lVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r1 = r3.g(j2.i.f4955e);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        r1 = (kotlin.jvm.functions.Function2) r1;
        r1 = r3.g(j2.q.f5012v);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        kotlin.collections.i0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        j2.m mVar;
        if (Build.VERSION.SDK_INT < 31 || this.W0 == null) {
            return;
        }
        j2.o semanticsOwner = getSemanticsOwner();
        getCoroutineContext();
        i2.b[] bVarArr = new i2.b[16];
        j2.m a9 = semanticsOwner.a();
        o0.e eVar = new o0.e(new j2.m[16]);
        List i3 = a9.i(false, false);
        while (true) {
            eVar.c(eVar.f7319i, i3);
            while (true) {
                int i10 = eVar.f7319i;
                if (i10 == 0) {
                    Arrays.sort(bVarArr, 0, 0, new j2.v(1, new Function1[]{i2.a.f4632e, i2.a.f4633i}));
                    return;
                }
                mVar = (j2.m) eVar.l(i10 - 1);
                boolean g = j2.p.g(mVar);
                s.h0 h0Var = mVar.f4983d.f4975d;
                if (!g && !h0Var.c(j2.q.j)) {
                    c2.i1 d10 = mVar.d();
                    if (d10 == null) {
                        throw v4.a.h("Expected semantics node to have a coordinator.");
                    }
                    x2.j b10 = z2.b.b(a2.q.f(d10, true));
                    if (b10.f10325a < b10.f10327c && b10.f10326b < b10.f10328d) {
                        break;
                    }
                }
            }
            i3 = mVar.i(false, false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z10) {
        this.F0.f9224a.setValue(new t1.a(z10 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        f1.e eVar = this.N;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            k7.e.o(eVar, longSparseArray);
        } else {
            eVar.f4045d.post(new a6.f(7, eVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean m10;
        this.U0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (m10 = h0.m())) {
            return;
        }
        setShowLayoutBounds(m10);
        p(getRoot());
    }

    public final void q(c2.g0 g0Var) {
        this.f3563m0.p(g0Var, false);
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            q((c2.g0) objArr[i10]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (!isFocused()) {
            i1.c d10 = i1.d.d(i3);
            int i10 = d10 != null ? d10.f4589a : 7;
            Boolean e2 = ((i1.k) getFocusOwner()).e(i10, rect != null ? new j1.c(rect.left, rect.top, rect.right, rect.bottom) : null, new t(i10, 0));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.a(e2, bool)) {
                if (!Intrinsics.a(((i1.k) getFocusOwner()).e(i10, null, new t(i10, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i10 == 1 || i10 == 2) {
                        return ((i1.k) getFocusOwner()).g(i10);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.M.f3342v = j;
    }

    public final void setComposeViewContext(c1 c1Var) {
        if (getCoroutineContext() != c1Var.f3354b.i() && !((o0.b) getRoot().l()).isEmpty()) {
            z1.a.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        b1.i e2 = b1.x.e();
        Function1 e9 = e2 != null ? e2.e() : null;
        b1.i h10 = b1.x.h(e2);
        try {
            c1 c1Var2 = get_composeViewContext();
            b1.x.k(e2, h10, e9);
            if (c1Var.equals(c1Var2)) {
                return;
            }
            if (isAttachedToWindow()) {
                c1Var2.b();
                c1Var.c();
            }
            set_composeViewContext(c1Var);
            setCoroutineContext(c1Var.f3354b.i());
        } catch (Throwable th) {
            b1.x.k(e2, h10, e9);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z10) {
        this.V0 = z10;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f3549a0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(f1.e eVar) {
        this.N = eVar;
    }

    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.A = coroutineContext;
    }

    public final void setFrameEndScheduler$ui(o1 o1Var) {
        this.f3570s = o1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f3569r0 = j;
    }

    public final void setOnReadyForComposition(Function1<? super c1, Unit> function1) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.V0) {
            function1.invoke(getComposeViewContext());
        } else {
            this.f3579w0 = function1;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.f3559i0 = z10;
    }

    public void setUncaughtExceptionHandler(c2.u1 u1Var) {
        this.f3563m0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y3 && y3 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.I0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long v(long j) {
        D();
        long m10 = k1.v.m(this.f3566p0, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f3573t0 >> 32)) + Float.intBitsToFloat((int) (m10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f3573t0 & 4294967295L)) + Float.intBitsToFloat((int) (m10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void w(boolean z10) {
        p pVar;
        c2.u0 u0Var = this.f3563m0;
        if (u0Var.f1678b.x() || ((o0.e) u0Var.f1681e.f1868d).f7319i != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    pVar = this.S0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                pVar = null;
            }
            if (u0Var.k(pVar)) {
                requestLayout();
            }
            u0Var.b(false);
            getRectManager().a();
            if (this.U) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.U = false;
            }
            Trace.endSection();
        }
    }

    public final boolean x(int i3) {
        if (i3 == 7 || i3 == 8) {
            return false;
        }
        Integer c10 = i1.d.c(i3);
        if (c10 == null) {
            throw v4.a.h("Invalid focus direction");
        }
        int intValue = c10.intValue();
        i1.t f3 = ((i1.k) getFocusOwner()).f();
        if (f3 == null) {
            kotlin.collections.i0.l("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return false;
        }
        Integer c11 = i1.d.c(i3);
        if (c11 == null) {
            throw v4.a.h("Invalid focus direction");
        }
        int intValue2 = c11.intValue();
        a3.e0 e0Var = c2.k.u(f3).C;
        View interopView = e0Var != null ? e0Var.getInteropView() : null;
        View findFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
        if (findNextFocus == null || interopView == null || !h0.a(interopView, findNextFocus)) {
            findNextFocus = null;
        }
        if (findNextFocus != null) {
            return i1.d.b(findNextFocus, Integer.valueOf(intValue), null);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        r4.l(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        s.d0 d0Var;
        e1.b bVar;
        Object[] objArr;
        if (this.f3555e0) {
            b1.b0 b0Var = getSnapshotObserver().f1645a;
            synchronized (b0Var.g) {
                try {
                    o0.e eVar = b0Var.f950f;
                    int i3 = eVar.f7319i;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        objArr = eVar.f7317d;
                        if (i10 >= i3) {
                            break;
                        }
                        b1.a0 a0Var = (b1.a0) objArr[i10];
                        a0Var.d();
                        if (!a0Var.f937f.j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr2 = eVar.f7317d;
                            objArr2[i10 - i11] = objArr2[i10];
                        }
                        i10++;
                    }
                    int i12 = i3 - i11;
                    Arrays.fill(objArr, i12, i3, (Object) null);
                    eVar.f7319i = i12;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3555e0 = false;
        }
        p0 p0Var = this.f3560j0;
        if (p0Var != null) {
            k(p0Var);
        }
        if (j() && (bVar = this.f3553d0) != null) {
            s.x xVar = bVar.f3777u;
            if (xVar.f8395d == 0 && bVar.f3778v) {
                ((AutofillManager) bVar.f3771d.f3701e).commit();
                bVar.f3778v = false;
            }
            if (xVar.f8395d != 0) {
                bVar.f3778v = true;
            }
        }
        loop1: while (this.L0.i() && this.L0.f(0) != null) {
            int i13 = this.L0.f8285b;
            int i14 = 0;
            while (true) {
                s.d0 d0Var2 = this.L0;
                if (i14 < i13) {
                    Function0 function0 = (Function0) d0Var2.f(i14);
                    d0Var = this.L0;
                    if (i14 < 0 || i14 >= d0Var.f8285b) {
                        break loop1;
                    }
                    Object[] objArr3 = d0Var.f8284a;
                    Object obj = objArr3[i14];
                    objArr3[i14] = null;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i14++;
                }
            }
            d0Var.n(i14);
            throw null;
        }
    }

    public final void z(c2.g0 g0Var) {
        b0 b0Var = this.M;
        b0Var.I = true;
        if (b0Var.p()) {
            b0Var.q(g0Var);
        }
        f1.e eVar = this.N;
        eVar.f4051u = true;
        if (eVar.g()) {
            eVar.f4052v.b(Unit.f5554a);
        }
    }

    public h getAccessibilityManager() {
        return this.O;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public i m38getClipboard() {
        return this.f3557g0;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public j m39getClipboardManager() {
        return this.f3556f0;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public g1.b m40getDragAndDropManager() {
        return this.B;
    }

    public s.w getLayoutNodes() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i10) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i3;
        generateDefaultLayoutParams.height = i10;
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

    @hd.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m34getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @hd.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public c2.v1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m36setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(u1.a aVar) {
    }

    public final void setUncaughtExceptionHandler$ui(c2.u1 u1Var) {
    }
}
