package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d4 extends ViewGroup implements eu0, g41, iq, ft0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, a10 {
    public static Class M0;
    public static Method N0;
    public static final mn0 O0 = new mn0();
    public static w2 P0;
    public static Method Q0;
    public final d4 A;
    public float A0;
    public final o81 B;
    public float B0;
    public final k4 C;
    public final b4 C0;
    public z4 D;
    public final p3 D0;
    public final g3 E;
    public boolean E0;
    public final s5 F;
    public final f80 F0;
    public final gc G;
    public final a4 G0;
    public final mn0 H;
    public final hf H0;
    public mn0 I;
    public boolean I0;
    public boolean J;
    public final fg0 J0;
    public boolean K;
    public View K0;
    public final lm0 L;
    public final j50 L0;
    public final vg M;
    public final av0 N;
    public final o91 O;
    public final i3 P;
    public boolean Q;
    public final n3 R;
    public final m3 S;
    public final gu0 T;
    public h7 U;
    public mm V;
    public boolean W;
    public final sk0 a0;
    public long b0;
    public final int[] c0;
    public long d;
    public final float[] d0;
    public final boolean e;
    public final float[] e0;
    public long f0;
    public t70 g;
    public boolean g0;
    public final ld0 h;
    public long h0;
    public yg0 i;
    public final av0 i0;
    public zg0 j;
    public final xr j0;
    public n31 k;
    public Function1 k0;
    public final m9 l;
    public final y80 l0;
    public final p3 m;
    public final ch1 m0;
    public final av0 n;
    public final AtomicReference n0;
    public final View o;
    public final j50 o0;
    public final boolean p;
    public final a60 p0;
    public final e10 q;
    public final av0 q0;
    public CoroutineContext r;
    public final av0 r0;
    public final e5 s;
    public final aq s0;
    public final fg0 t;
    public final b90 t0;
    public final s40 u;
    public final bm0 u0;
    public final u6 v;
    public final j41 v0;
    public final f90 w;
    public MotionEvent w0;
    public final jd0 x;
    public long x0;
    public final en0 y;
    public final c51 y0;
    public final u11 z;
    public final mn0 z0;

    public d4(Context context, CoroutineContext coroutineContext) {
        super(context);
        this.d = 9205357640488583168L;
        int i = 1;
        this.e = true;
        this.h = new ld0();
        this.k = j50.y;
        this.l = new m9();
        this.m = new p3(this, 0);
        pr k = yr1.k(context);
        j50 j50Var = j50.B;
        this.n = new av0(k, j50Var);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 35;
        this.p = z;
        pv pvVar = new pv();
        this.q = new e10(this, this);
        this.r = coroutineContext;
        this.s = new e5();
        this.t = new fg0(0);
        this.u = new s40(12);
        this.v = new u6(ViewConfiguration.get(context));
        this.w = new f90();
        jd0 jd0Var = new jd0(3);
        jd0Var.a0(i41.b);
        jd0Var.X(getDensity());
        jd0Var.c0(getViewConfiguration());
        jd0Var.b0(new c4(this).c(((e10) getFocusOwner()).e).c(m12getDragAndDropManager().c));
        this.x = jd0Var;
        en0 en0Var = r90.a;
        this.y = new en0();
        m13getLayoutNodes();
        this.z = new u11();
        this.A = this;
        this.B = new o81(getRoot(), pvVar, m13getLayoutNodes());
        k4 k4Var = new k4(this);
        this.C = k4Var;
        this.D = new z4(this, new v3(0, this, p4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        g3 g3Var = new g3();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.E = g3Var;
        this.F = new s5(this);
        this.G = new gc();
        this.H = new mn0();
        this.L = new lm0();
        jd0 root = getRoot();
        vg vgVar = new vg();
        vgVar.b = root;
        vgVar.c = new f60((v80) root.J.d);
        vgVar.d = new nq0(3);
        vgVar.e = new i60();
        this.M = vgVar;
        this.N = gb0.F(new Configuration(context.getResources().getConfiguration()));
        gc autofillTree = getAutofillTree();
        o91 o91Var = new o91();
        o91Var.d = this;
        o91Var.e = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            dd0.j("Autofill service could not be located.");
            throw null;
        }
        o91Var.g = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw qy0.g("Required value was null.");
        }
        o91Var.h = autofillId;
        this.O = o91Var;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw qy0.g("Autofill service could not be located.");
        }
        this.P = new i3(new nq0(i, autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.R = new n3(context);
        getClipboardManager();
        this.S = new m3();
        this.T = new gu0(new t3(this, 2));
        this.a0 = new sk0(getRoot());
        this.b0 = 9223372034707292159L;
        this.c0 = new int[]{0, 0};
        this.d0 = y90.m();
        this.e0 = y90.m();
        this.f0 = -1L;
        this.h0 = 9187343241974906880L;
        this.i0 = gb0.F(null);
        this.j0 = gb0.o(new a4(this, i));
        this.l0 = new y80(getView(), this);
        ch1 ch1Var = new ch1();
        new AtomicReference(null);
        this.m0 = ch1Var;
        this.n0 = new AtomicReference(null);
        getTextInputService();
        this.o0 = new j50(20);
        int i3 = 13;
        this.p0 = new a60(i3);
        this.q0 = new av0(yr1.F(context), j50Var);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = y00.a;
        vc0 vc0Var = layoutDirection != 0 ? layoutDirection != 1 ? null : vc0.e : vc0.d;
        this.r0 = gb0.F(vc0Var == null ? vc0.d : vc0Var);
        this.s0 = new aq();
        this.t0 = new b90(isInTouchMode() ? 1 : 2, new t3(this, 0));
        bm0 bm0Var = new bm0();
        new eo0(new xc[16]);
        new eo0(new t80[16]);
        new eo0(new jd0[16]);
        new eo0(new t80[16]);
        this.u0 = bm0Var;
        j41 j41Var = new j41(i3);
        vh1[] vh1VarArr = vh1.d;
        this.v0 = j41Var;
        this.y0 = new c51(9);
        this.z0 = new mn0();
        this.C0 = new b4(0, this);
        this.D0 = new p3(this, i);
        this.F0 = new f80(context, new t3(this, 1));
        this.G0 = new a4(this, 0);
        this.H0 = new hf();
        addOnAttachStateChangeListener(this.D);
        setWillNotDraw(false);
        setFocusable(true);
        o4.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ln1.a(this, k4Var);
        setOnDragListener(m12getDragAndDropManager());
        getRoot().d(this);
        l4.a.a(this);
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.o = view;
            addView(view, -1);
        }
        this.J0 = i2 >= 31 ? new fg0(1) : null;
        this.L0 = new j50(this);
    }

    public static final void f(d4 d4Var, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        k4 k4Var = d4Var.C;
        if (Intrinsics.a(str, k4Var.I)) {
            int d2 = k4Var.G.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (!Intrinsics.a(str, k4Var.J) || (d = k4Var.H.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s3 get_viewTreeOwners() {
        return (s3) this.i0.getValue();
    }

    public static void j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof d4) {
                ((d4) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt);
            }
        }
    }

    public static long k(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            jk1 jk1Var = kk1.d;
            return size;
        }
        if (mode == 0) {
            jk1 jk1Var2 = kk1.d;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        jk1 jk1Var3 = kk1.d;
        return j | (j << 32);
    }

    public static void n(jd0 jd0Var) {
        jd0Var.B();
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            n((jd0) objArr[i2]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !mm0.a.a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(nr nrVar) {
        this.n.setValue(nrVar);
    }

    private void setFontFamilyResolver(v10 v10Var) {
        this.q0.setValue(v10Var);
    }

    private void setLayoutDirection(vc0 vc0Var) {
        this.r0.setValue(vc0Var);
    }

    private final void set_viewTreeOwners(s3 s3Var) {
        this.i0.setValue(s3Var);
    }

    public final void A() {
        k4 k4Var = this.C;
        k4Var.C = true;
        if (k4Var.o() && !k4Var.N) {
            k4Var.N = true;
            k4Var.n.post(k4Var.P);
        }
        z4 z4Var = this.D;
        z4Var.k = true;
        if (!z4Var.i() || z4Var.r) {
            return;
        }
        z4Var.r = true;
        z4Var.m.post(z4Var.s);
    }

    public final void B() {
        if (this.g0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f0) {
            this.f0 = currentAnimationTimeMillis;
            hf hfVar = this.H0;
            float[] fArr = this.d0;
            hfVar.a(this, fArr);
            xa0.q(fArr, this.e0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.c0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.h0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void C(MotionEvent motionEvent) {
        this.f0 = AnimationUtils.currentAnimationTimeMillis();
        hf hfVar = this.H0;
        float[] fArr = this.d0;
        hfVar.a(this, fArr);
        xa0.q(fArr, this.e0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long u = y90.u(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (u >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (u & 4294967295L));
        this.h0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(jd0 jd0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (jd0Var != null) {
            while (jd0Var != null && jd0Var.q() == hd0.d) {
                if (!this.W) {
                    jd0 s = jd0Var.s();
                    if (s == null) {
                        break;
                    }
                    long j = ((v80) s.J.d).h;
                    if (mm.f(j) && mm.e(j)) {
                        break;
                    }
                }
                jd0Var = jd0Var.s();
            }
            if (jd0Var == getRoot()) {
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

    public final long F(long j) {
        B();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.h0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.h0 & 4294967295L));
        return y90.u(this.e0, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.I0) {
            this.I0 = false;
            int metaState = motionEvent.getMetaState();
            this.t.getClass();
            qo1.a.setValue(new yx0(metaState));
        }
        lm0 lm0Var = this.L;
        yw c = lm0Var.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        vg vgVar = this.M;
        if (c == null) {
            if (!vgVar.a) {
                ((aj0) ((nq0) vgVar.d).e).a();
                ((f60) vgVar.c).c();
            }
            return 0;
        }
        List list = (List) c.e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((sx0) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        sx0 sx0Var = (sx0) obj;
        if (sx0Var != null) {
            this.d = sx0Var.d;
        }
        int a = vgVar.a(c, this, q(motionEvent));
        c.g = null;
        if ((actionMasked != 0 && actionMasked != 5) || (a & 1) != 0) {
            return a;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        lm0Var.c.delete(pointerId);
        lm0Var.b.delete(pointerId);
        return a;
    }

    public final void H(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long s = s((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (s >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (s & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        yw c = this.L.c(this, obtain);
        c.getClass();
        this.M.a(c, this, true);
        obtain.recycle();
    }

    public final void I(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(yr1.k(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.t.getClass();
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration2.fontWeightAdjustment : 0) != (i >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(yr1.F(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z;
        View view;
        long j;
        long C;
        float[] fArr;
        int i;
        ii1 ii1Var;
        boolean z2;
        long j2;
        int[] iArr = this.c0;
        getLocationOnScreen(iArr);
        long j3 = this.b0;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.f0 < 0) {
            this.b0 = (i4 << 32) | (iArr[1] & 4294967295L);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                getRoot().K.p.h0();
                z = true;
                B();
                view = this.K0;
                if (view == null) {
                    view = getRootView();
                    this.K0 = view;
                }
                u11 rectManager = getRectManager();
                j = this.b0;
                C = t90.C(this.h0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.d0;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
                }
                ii1Var = rectManager.b;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                if (s90.a(C, ii1Var.d)) {
                    ii1Var.d = C;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!s90.a(j, ii1Var.e)) {
                    ii1Var.e = j;
                    z2 = true;
                }
                if (fArr != null) {
                    ii1Var.g = fArr;
                    z2 = true;
                }
                j2 = (width << 32) | (height & 4294967295L);
                if (j2 != ii1Var.f) {
                    ii1Var.f = j2;
                    z2 = true;
                }
                rectManager.e = !z2 || rectManager.e;
                this.a0.a(z);
                getRectManager().a();
            }
        }
        z = false;
        B();
        view = this.K0;
        if (view == null) {
        }
        u11 rectManager2 = getRectManager();
        j = this.b0;
        C = t90.C(this.h0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.d0;
        if (fArr.length >= 16) {
        }
        ii1Var = rectManager2.b;
        if ((i & 2) != 0) {
        }
        if (s90.a(C, ii1Var.d)) {
        }
        if (!s90.a(j, ii1Var.e)) {
        }
        if (fArr != null) {
        }
        j2 = (width2 << 32) | (height2 & 4294967295L);
        if (j2 != ii1Var.f) {
        }
        rectManager2.e = !z2 || rectManager2.e;
        this.a0.a(z);
        getRectManager().a();
    }

    public final void K(float f) {
        if (this.p) {
            if (f > 0.0f) {
                if (Float.isNaN(this.A0) || f > this.A0) {
                    this.A0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.B0) || f < this.B0) {
                    this.B0 = f;
                }
            }
        }
    }

    @Override // defpackage.iq
    public final void a(vg0 vg0Var) {
        zg0 zg0Var = this.j;
        if (zg0Var != null) {
            rj0 rj0Var = (rj0) zg0Var.a.e;
            if (rj0Var.d && !rj0Var.g) {
                uf ufVar = zg0Var.d;
                if (ufVar != null) {
                    ufVar.cancel();
                }
                zg0Var.d = null;
                return;
            }
            if (rj0Var.e) {
                return;
            }
            if (!rj0Var.g) {
                dy0.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((vn0) rj0Var.h).i()) {
                dy0.a("Attempted to start retaining exited values with pending exited values");
            }
            rj0Var.g = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        o10 o10Var = ((e10) getFocusOwner()).c;
        if (!o10Var.r) {
            return;
        }
        if (!o10Var.d.r) {
            o80.b("visitSubtreeIf called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var = o10Var.d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var, zl0Var);
        } else {
            eo0Var.b(zl0Var2);
        }
        while (true) {
            int i3 = eo0Var.g;
            if (i3 == 0) {
                return;
            }
            zl0 zl0Var3 = (zl0) eo0Var.k(i3 - 1);
            if ((zl0Var3.h & 1024) != 0) {
                for (zl0 zl0Var4 = zl0Var3; zl0Var4 != null && zl0Var4.r; zl0Var4 = zl0Var4.j) {
                    if ((zl0Var4.g & 1024) != 0) {
                        zl0 zl0Var5 = zl0Var4;
                        eo0 eo0Var2 = null;
                        while (zl0Var5 != null) {
                            int i4 = 0;
                            if (zl0Var5 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var5;
                                if (o10Var2.r && o10Var2.B0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    o10 o10Var3 = ((e10) getFocusOwner()).c;
                                    if (o10Var3.r) {
                                        if (!o10Var3.d.r) {
                                            o80.b("visitSubtreeIf called on an unattached node");
                                        }
                                        eo0 eo0Var3 = new eo0(new zl0[16]);
                                        zl0 zl0Var6 = o10Var3.d;
                                        zl0 zl0Var7 = zl0Var6.j;
                                        if (zl0Var7 == null) {
                                            op.l(eo0Var3, zl0Var6);
                                        } else {
                                            eo0Var3.b(zl0Var7);
                                        }
                                        while (true) {
                                            int i5 = eo0Var3.g;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            zl0 zl0Var8 = (zl0) eo0Var3.k(i5 - 1);
                                            if ((zl0Var8.h & 1024) != 0) {
                                                for (zl0 zl0Var9 = zl0Var8; zl0Var9 != null && zl0Var9.r; zl0Var9 = zl0Var9.j) {
                                                    if ((zl0Var9.g & 1024) != 0) {
                                                        zl0 zl0Var10 = zl0Var9;
                                                        eo0 eo0Var4 = null;
                                                        while (zl0Var10 != null) {
                                                            if (zl0Var10 instanceof o10) {
                                                                o10 o10Var4 = (o10) zl0Var10;
                                                                if (o10Var4.r) {
                                                                    g10 B0 = o10Var4.B0();
                                                                    if (o10Var4.r && !o10Var4.s && B0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((zl0Var10.g & 1024) != 0 && (zl0Var10 instanceof zq)) {
                                                                int i6 = 0;
                                                                for (zl0 zl0Var11 = ((zq) zl0Var10).t; zl0Var11 != null; zl0Var11 = zl0Var11.j) {
                                                                    if ((zl0Var11.g & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            zl0Var10 = zl0Var11;
                                                                        } else {
                                                                            if (eo0Var4 == null) {
                                                                                eo0Var4 = new eo0(new zl0[16]);
                                                                            }
                                                                            if (zl0Var10 != null) {
                                                                                eo0Var4.b(zl0Var10);
                                                                                zl0Var10 = null;
                                                                            }
                                                                            eo0Var4.b(zl0Var11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            zl0Var10 = op.o(eo0Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            op.l(eo0Var3, zl0Var8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((zl0Var5.g & 1024) != 0 && (zl0Var5 instanceof zq)) {
                                for (zl0 zl0Var12 = ((zq) zl0Var5).t; zl0Var12 != null; zl0Var12 = zl0Var12.j) {
                                    if ((zl0Var12.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            zl0Var5 = zl0Var12;
                                        } else {
                                            if (eo0Var2 == null) {
                                                eo0Var2 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var5 != null) {
                                                eo0Var2.b(zl0Var5);
                                                zl0Var5 = null;
                                            }
                                            eo0Var2.b(zl0Var12);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            zl0Var5 = op.o(eo0Var2);
                        }
                    }
                }
            }
            op.l(eo0Var, zl0Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        h81 v;
        Function1 function1;
        Function1 function12;
        i3 i3Var = this.P;
        if (i3Var != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                jd0 jd0Var = (jd0) i3Var.e.c.b(keyAt);
                if (jd0Var != null && (v = jd0Var.v()) != null) {
                    vn0 vn0Var = v.d;
                    Object g = vn0Var.g(g81.g);
                    if (g == null) {
                        g = null;
                    }
                    z0 z0Var = (z0) g;
                    if (z0Var != null && (function12 = (Function1) z0Var.b) != null) {
                    }
                    Object g2 = vn0Var.g(g81.h);
                    z0 z0Var2 = (z0) (g2 != null ? g2 : null);
                    if (z0Var2 != null && (function1 = (Function1) z0Var2.b) != null) {
                    }
                }
            }
        }
        o91 o91Var = this.O;
        if (o91Var != null) {
            gc gcVar = (gc) o91Var.e;
            if (gcVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (gcVar.a.get(Integer.valueOf(keyAt2)) != null) {
                        af.c();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new zp0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new zp0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new zp0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.iq
    public final void c(vg0 vg0Var) {
        uf ufVar;
        zg0 zg0Var = this.j;
        if (zg0Var != null) {
            yg0 yg0Var = this.i;
            yg0Var.getClass();
            s40 s40Var = zg0Var.a;
            rj0 rj0Var = (rj0) s40Var.e;
            if (!rj0Var.d || rj0Var.g) {
                return;
            }
            try {
                ufVar = ((lq1) yg0Var).a.s(new ce(6, zg0Var));
            } catch (CancellationException unused) {
                rj0 rj0Var2 = (rj0) s40Var.e;
                if (!rj0Var2.e) {
                    if (rj0Var2.g) {
                        dy0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    rj0Var2.c();
                    rj0Var2.g = true;
                }
                ufVar = null;
            }
            uf ufVar2 = zg0Var.d;
            if (ufVar2 != null) {
                ufVar2.cancel();
            }
            zg0Var.d = ufVar;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.C.f(false, i, this.d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.C.f(true, i, this.d);
    }

    @Override // defpackage.a10
    public final void d(o10 o10Var, o10 o10Var2) {
        l7 l7Var;
        l7 l7Var2;
        if (o10Var != null) {
            o10 o10Var3 = o10Var;
            if (!o10Var3.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = o10Var3.d;
            jd0 I = op.I(o10Var);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (I != null) {
                if ((((zl0) I.J.g).h & 2097152) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 2097152) != 0) {
                            zl0 zl0Var2 = zl0Var;
                            eo0 eo0Var = null;
                            while (zl0Var2 != null) {
                                if (zl0Var2 instanceof d80) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(zl0Var2);
                                } else if ((zl0Var2.g & 2097152) != 0 && (zl0Var2 instanceof zq)) {
                                    int i = 0;
                                    for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                        if ((zl0Var3.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                zl0Var2 = zl0Var3;
                                            } else {
                                                if (eo0Var == null) {
                                                    eo0Var = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var2 != null) {
                                                    eo0Var.b(zl0Var2);
                                                    zl0Var2 = null;
                                                }
                                                eo0Var.b(zl0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                zl0Var2 = op.o(eo0Var);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var2 = I.J) == null) ? null : (ig1) l7Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (o10Var2 != null) {
                if (!o10Var2.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var4 = o10Var2.d;
                jd0 I2 = op.I(o10Var2);
                LinkedHashSet linkedHashSet2 = null;
                while (I2 != null) {
                    if ((((zl0) I2.J.g).h & 2097152) != 0) {
                        while (zl0Var4 != null) {
                            if ((zl0Var4.g & 2097152) != 0) {
                                zl0 zl0Var5 = zl0Var4;
                                eo0 eo0Var2 = null;
                                while (zl0Var5 != null) {
                                    if (zl0Var5 instanceof d80) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(zl0Var5);
                                    } else if ((zl0Var5.g & 2097152) != 0 && (zl0Var5 instanceof zq)) {
                                        int i2 = 0;
                                        for (zl0 zl0Var6 = ((zq) zl0Var5).t; zl0Var6 != null; zl0Var6 = zl0Var6.j) {
                                            if ((zl0Var6.g & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    zl0Var5 = zl0Var6;
                                                } else {
                                                    if (eo0Var2 == null) {
                                                        eo0Var2 = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var5 != null) {
                                                        eo0Var2.b(zl0Var5);
                                                        zl0Var5 = null;
                                                    }
                                                    eo0Var2.b(zl0Var6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    zl0Var5 = op.o(eo0Var2);
                                }
                            }
                            zl0Var4 = zl0Var4.i;
                        }
                    }
                    I2 = I2.s();
                    zl0Var4 = (I2 == null || (l7Var = I2.J) == null) ? null : (ig1) l7Var.f;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d80 d80Var = (d80) arrayList.get(i3);
                if (!(linkedHashSet != null ? linkedHashSet.contains(d80Var) : false)) {
                    d80Var.r();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        t(true);
        pb1.j().m();
        this.J = true;
        s40 s40Var = this.u;
        j3 j3Var = (j3) s40Var.e;
        Canvas canvas2 = j3Var.a;
        j3Var.a = canvas;
        getRoot().i(j3Var, null);
        ((j3) s40Var.e).a = canvas2;
        mn0 mn0Var = this.H;
        if (mn0Var.i()) {
            int i = mn0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((n50) ((du0) mn0Var.f(i2))).g();
            }
        }
        int i3 = sn1.d;
        mn0Var.d();
        this.J = false;
        mn0 mn0Var2 = this.I;
        if (mn0Var2 != null) {
            mn0Var.b(mn0Var2);
            mn0Var2.d();
        }
        if (this.p) {
            f8.a(this, this.A0);
            View view = this.o;
            if (view == null) {
                Intrinsics.e("frameRateCategoryView");
                throw null;
            }
            f8.a(view, this.B0);
            if (!Float.isNaN(this.B0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.A0 = Float.NaN;
            this.B0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:643:0x0442, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [ig1] */
    /* JADX WARN: Type inference failed for: r0v33, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v55, types: [ig1] */
    /* JADX WARN: Type inference failed for: r2v41, types: [zl0] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47, types: [ig1] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v71, types: [ig1] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [d80, yq] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [d80, yq] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, zl0] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v67, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, zl0] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Throwable th;
        int i;
        String str;
        int i2;
        u5 u5Var;
        String str2;
        long j;
        t70 t70Var;
        long j2;
        long j3;
        int i3;
        char c;
        int i4;
        long j4;
        zl0 zl0Var;
        l7 l7Var;
        zq zqVar;
        l7 l7Var2;
        Object o;
        zl0 zl0Var2;
        boolean z;
        int size;
        int size2;
        l7 l7Var3;
        zq zqVar2;
        l7 l7Var4;
        Object o2;
        boolean z2;
        r3 r3Var;
        int size3;
        l7 l7Var5;
        zl0 zl0Var3;
        l7 l7Var6;
        if (this.E0) {
            p3 p3Var = this.D0;
            removeCallbacks(p3Var);
            if (motionEvent.getActionMasked() == 8) {
                this.E0 = false;
            } else {
                p3Var.run();
            }
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            b10 focusOwner = getFocusOwner();
            w3 w3Var = new w3(this, i6, motionEvent);
            e10 e10Var = (e10) focusOwner;
            if (e10Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            o10 E = uq1.E(e10Var.c);
            if (E != null) {
                if (!E.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var4 = E.d;
                jd0 I = op.I(E);
                loop0: while (true) {
                    if (I == null) {
                        zl0Var3 = null;
                        break;
                    }
                    if ((((zl0) I.J.g).h & 16384) != 0) {
                        while (zl0Var4 != null) {
                            if ((zl0Var4.g & 16384) != 0) {
                                zl0Var3 = zl0Var4;
                                eo0 eo0Var = null;
                                while (zl0Var3 != null) {
                                    if (zl0Var3 instanceof r3) {
                                        break loop0;
                                    }
                                    if ((zl0Var3.g & 16384) != 0 && (zl0Var3 instanceof zq)) {
                                        int i7 = 0;
                                        for (zl0 zl0Var5 = ((zq) zl0Var3).t; zl0Var5 != null; zl0Var5 = zl0Var5.j) {
                                            if ((zl0Var5.g & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    zl0Var3 = zl0Var5;
                                                } else {
                                                    if (eo0Var == null) {
                                                        eo0Var = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var3 != null) {
                                                        eo0Var.b(zl0Var3);
                                                        zl0Var3 = null;
                                                    }
                                                    eo0Var.b(zl0Var5);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    zl0Var3 = op.o(eo0Var);
                                }
                            }
                            zl0Var4 = zl0Var4.i;
                        }
                    }
                    I = I.s();
                    zl0Var4 = (I == null || (l7Var6 = I.J) == null) ? null : (ig1) l7Var6.f;
                }
                r3Var = (r3) zl0Var3;
            } else {
                r3Var = null;
            }
            if (r3Var != null) {
                if (!r3Var.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var6 = r3Var.d.i;
                jd0 I2 = op.I(r3Var);
                ArrayList arrayList = null;
                while (I2 != null) {
                    if ((((zl0) I2.J.g).h & 16384) != 0) {
                        while (zl0Var6 != null) {
                            if ((zl0Var6.g & 16384) != 0) {
                                zl0 zl0Var7 = zl0Var6;
                                eo0 eo0Var2 = null;
                                while (zl0Var7 != null) {
                                    if (zl0Var7 instanceof r3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(zl0Var7);
                                    } else if ((zl0Var7.g & 16384) != 0 && (zl0Var7 instanceof zq)) {
                                        int i8 = 0;
                                        for (zl0 zl0Var8 = ((zq) zl0Var7).t; zl0Var8 != null; zl0Var8 = zl0Var8.j) {
                                            if ((zl0Var8.g & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    zl0Var7 = zl0Var8;
                                                } else {
                                                    if (eo0Var2 == null) {
                                                        eo0Var2 = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var7 != null) {
                                                        eo0Var2.b(zl0Var7);
                                                        zl0Var7 = null;
                                                    }
                                                    eo0Var2.b(zl0Var8);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    zl0Var7 = op.o(eo0Var2);
                                }
                            }
                            zl0Var6 = zl0Var6.i;
                        }
                    }
                    I2 = I2.s();
                    zl0Var6 = (I2 == null || (l7Var5 = I2.J) == null) ? null : (ig1) l7Var5.f;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i9 = size3 - 1;
                        ((r3) arrayList.get(size3)).getClass();
                        if (i9 < 0) {
                            break;
                        }
                        size3 = i9;
                    }
                }
                zl0 zl0Var9 = r3Var.d;
                eo0 eo0Var3 = null;
                while (zl0Var9 != null) {
                    if (!(zl0Var9 instanceof r3) && (zl0Var9.g & 16384) != 0 && (zl0Var9 instanceof zq)) {
                        int i10 = 0;
                        for (zl0 zl0Var10 = ((zq) zl0Var9).t; zl0Var10 != null; zl0Var10 = zl0Var10.j) {
                            if ((zl0Var10.g & 16384) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    zl0Var9 = zl0Var10;
                                } else {
                                    if (eo0Var3 == null) {
                                        eo0Var3 = new eo0(new zl0[16]);
                                    }
                                    if (zl0Var9 != null) {
                                        eo0Var3.b(zl0Var9);
                                        zl0Var9 = null;
                                    }
                                    eo0Var3.b(zl0Var10);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    zl0Var9 = op.o(eo0Var3);
                }
                if (!((Boolean) w3Var.invoke()).booleanValue()) {
                    zl0 zl0Var11 = r3Var.d;
                    eo0 eo0Var4 = null;
                    while (zl0Var11 != null) {
                        if (!(zl0Var11 instanceof r3) && (zl0Var11.g & 16384) != 0 && (zl0Var11 instanceof zq)) {
                            int i11 = 0;
                            for (zl0 zl0Var12 = ((zq) zl0Var11).t; zl0Var12 != null; zl0Var12 = zl0Var12.j) {
                                if ((zl0Var12.g & 16384) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        zl0Var11 = zl0Var12;
                                    } else {
                                        if (eo0Var4 == null) {
                                            eo0Var4 = new eo0(new zl0[16]);
                                        }
                                        if (zl0Var11 != null) {
                                            eo0Var4.b(zl0Var11);
                                            zl0Var11 = null;
                                        }
                                        eo0Var4.b(zl0Var12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        zl0Var11 = op.o(eo0Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            ((r3) arrayList.get(i12)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        t70 t70Var2 = this.g;
        lm0 lm0Var = this.L;
        aj0 aj0Var = lm0Var.e;
        SparseLongArray sparseLongArray = lm0Var.b;
        int actionMasked = motionEvent.getActionMasked();
        lm0Var.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            lm0Var.c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            u5Var = null;
            th = null;
        } else {
            lm0Var.a(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    i5 = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                i5 = 0;
            }
            boolean z3 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i13 = 0;
            while (i13 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i13);
                int i14 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    str2 = str3;
                    j = sparseLongArray.valueAt(indexOfKey);
                    t70Var = t70Var2;
                } else {
                    str2 = str3;
                    j = lm0Var.a;
                    t70Var = t70Var2;
                    lm0Var.a = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                lm0 lm0Var2 = lm0Var;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i13)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i13)) & 4294967295L);
                ?? r33 = i13 != i5 ? i14 : 0;
                km0 km0Var = (km0) aj0Var.b(j);
                if (i13 == i5) {
                    aj0Var.e(j);
                    j2 = j;
                    j3 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z3) {
                        j3 = 2147483647L;
                        i3 = 65535;
                        j2 = j;
                        aj0Var.d(j2, new km0(1 | ((motionEvent.getEventTime() & 2147483647L) << i14) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16)) << 32)));
                    } else {
                        j2 = j;
                        j3 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j5 = j3;
                float pressure = motionEvent.getPressure(i13);
                int i15 = i3;
                int i16 = i5;
                long eventTime2 = km0Var != null ? (km0Var.a >> i14) & j5 : motionEvent.getEventTime();
                if (km0Var != null) {
                    float f = (short) (((int) (km0Var.a >>> c)) >>> 16);
                    i4 = i16;
                    j4 = (Float.floatToRawIntBits((short) (r5 & i15)) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                } else {
                    i4 = i16;
                    j4 = floatToRawIntBits;
                }
                arrayList2.add(new u70(j2, eventTime, floatToRawIntBits, r33, pressure, eventTime2, j4, km0Var != null ? (km0Var.a & 1) != 0 ? i14 : 0 : 0));
                i13++;
                lm0Var = lm0Var2;
                i6 = i14;
                str3 = str2;
                t70Var2 = t70Var;
                i5 = i4;
            }
            t70 t70Var3 = t70Var2;
            str = str3;
            int i17 = i6;
            lm0Var.d(motionEvent);
            if (t70Var3 != null) {
                i2 = t70Var3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    dd0.e("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
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
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            u5Var = new u5();
            u5Var.b = arrayList2;
            u5Var.a = i2;
            u5Var.c = motionEvent;
            if (arrayList2.isEmpty()) {
                dd0.e("changes cannot be empty");
                throw th;
            }
        }
        f80 f80Var = this.F0;
        if (u5Var == null) {
            o10 f2 = ((e10) getFocusOwner()).f();
            if (f2 != null) {
                if (!f2.d.r) {
                    o80.b(str);
                }
                ?? r2 = f2.d;
                jd0 I3 = op.I(f2);
                loop26: while (true) {
                    if (I3 == null) {
                        zqVar = th;
                        break;
                    }
                    int i18 = 2097152;
                    if ((((zl0) I3.J.g).h & 2097152) != 0) {
                        for (zl0 zl0Var13 = r2; zl0Var13 != null; zl0Var13 = zl0Var13.i) {
                            if ((zl0Var13.g & i18) != 0) {
                                zqVar = zl0Var13;
                                Throwable th2 = th;
                                while (zqVar != 0) {
                                    if (zqVar instanceof d80) {
                                        break loop26;
                                    }
                                    ?? r4 = th2;
                                    if ((zqVar.g & i18) != 0) {
                                        r4 = th2;
                                        if (zqVar instanceof zq) {
                                            zl0 zl0Var14 = zqVar.t;
                                            int i19 = 0;
                                            o = zqVar;
                                            r4 = th2;
                                            while (zl0Var14 != null) {
                                                if ((zl0Var14.g & i18) != 0) {
                                                    i19++;
                                                    r4 = r4;
                                                    if (i19 == 1) {
                                                        o = zl0Var14;
                                                    } else {
                                                        if (r4 == 0) {
                                                            r4 = new eo0(new zl0[16]);
                                                        }
                                                        if (o != null) {
                                                            r4.b(o);
                                                            o = th;
                                                        }
                                                        r4.b(zl0Var14);
                                                    }
                                                }
                                                zl0Var14 = zl0Var14.j;
                                                i18 = 2097152;
                                                o = o;
                                                r4 = r4;
                                            }
                                            r4 = r4;
                                            if (i19 == 1) {
                                                i18 = 2097152;
                                                zqVar = o;
                                                th2 = r4;
                                            }
                                        }
                                    }
                                    o = op.o(r4);
                                    i18 = 2097152;
                                    zqVar = o;
                                    th2 = r4;
                                }
                            }
                            i18 = 2097152;
                        }
                    }
                    I3 = I3.s();
                    r2 = (I3 == null || (l7Var2 = I3.J) == null) ? th : (ig1) l7Var2.f;
                }
                zl0Var = (d80) zqVar;
            } else {
                zl0Var = th;
            }
            if (zl0Var != 0) {
                zl0 zl0Var15 = zl0Var;
                if (!zl0Var15.d.r) {
                    o80.b(str);
                }
                ?? r0 = zl0Var15.d.i;
                jd0 I4 = op.I(zl0Var);
                ?? r42 = th;
                while (I4 != null) {
                    int i20 = 2097152;
                    zl0 zl0Var16 = r0;
                    r42 = r42;
                    if ((((zl0) I4.J.g).h & 2097152) != 0) {
                        while (zl0Var16 != null) {
                            if ((zl0Var16.g & i20) != 0) {
                                zq zqVar3 = zl0Var16;
                                ?? r6 = th;
                                while (zqVar3 != 0) {
                                    if (zqVar3 instanceof d80) {
                                        if (r42 == 0) {
                                            r42 = new ArrayList();
                                        }
                                        r42.add(zqVar3);
                                    } else if ((zqVar3.g & 2097152) != 0 && (zqVar3 instanceof zq)) {
                                        zl0 zl0Var17 = zqVar3.t;
                                        int i21 = 0;
                                        zqVar3 = zqVar3;
                                        r6 = r6;
                                        while (zl0Var17 != null) {
                                            zqVar3 = zqVar3;
                                            if ((zl0Var17.g & 2097152) != 0) {
                                                i21++;
                                                if (i21 == 1) {
                                                    zqVar3 = zl0Var17;
                                                } else {
                                                    r6 = r6 == 0 ? new eo0(new zl0[16]) : r6;
                                                    if (zqVar3 != 0) {
                                                        r6.b(zqVar3);
                                                        zqVar3 = th;
                                                    }
                                                    r6.b(zl0Var17);
                                                    zl0Var17 = zl0Var17.j;
                                                    zqVar3 = zqVar3;
                                                    r6 = r6;
                                                }
                                            }
                                            zl0Var17 = zl0Var17.j;
                                            zqVar3 = zqVar3;
                                            r6 = r6;
                                        }
                                        if (i21 == 1) {
                                        }
                                    }
                                    zqVar3 = op.o(r6);
                                }
                            }
                            i20 = 2097152;
                            zl0Var16 = zl0Var16.i;
                            r42 = r42;
                        }
                    }
                    I4 = I4.s();
                    r0 = (I4 == null || (l7Var = I4.J) == null) ? th : (ig1) l7Var.f;
                }
                zl0Var.r();
                if (r42 != 0) {
                    int size5 = r42.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        ((d80) r42.get(i22)).r();
                    }
                }
            }
            f80Var.b = 0;
            f80Var.c = true;
            return true;
        }
        e10 e10Var2 = (e10) getFocusOwner();
        if (e10Var2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            o10 f3 = e10Var2.f();
            if (f3 != null) {
                if (!f3.d.r) {
                    o80.b(str);
                }
                zl0 zl0Var18 = f3.d;
                jd0 I5 = op.I(f3);
                zl0 zl0Var19 = zl0Var18;
                loop14: while (true) {
                    if (I5 == null) {
                        zqVar2 = th;
                        break;
                    }
                    int i23 = 2097152;
                    if ((((zl0) I5.J.g).h & 2097152) != 0) {
                        for (zl0 zl0Var20 = zl0Var19; zl0Var20 != null; zl0Var20 = zl0Var20.i) {
                            if ((zl0Var20.g & i23) != 0) {
                                zqVar2 = zl0Var20;
                                Throwable th3 = th;
                                while (zqVar2 != 0) {
                                    if (zqVar2 instanceof d80) {
                                        break loop14;
                                    }
                                    ?? r5 = th3;
                                    if ((zqVar2.g & i23) != 0) {
                                        r5 = th3;
                                        if (zqVar2 instanceof zq) {
                                            zl0 zl0Var21 = zqVar2.t;
                                            int i24 = 0;
                                            o2 = zqVar2;
                                            r5 = th3;
                                            while (zl0Var21 != null) {
                                                if ((zl0Var21.g & i23) != 0) {
                                                    i24++;
                                                    r5 = r5;
                                                    if (i24 == 1) {
                                                        o2 = zl0Var21;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new eo0(new zl0[i]);
                                                        }
                                                        if (o2 != null) {
                                                            r5.b(o2);
                                                            o2 = th;
                                                        }
                                                        r5.b(zl0Var21);
                                                    }
                                                }
                                                zl0Var21 = zl0Var21.j;
                                                i = 16;
                                                i23 = 2097152;
                                                o2 = o2;
                                                r5 = r5;
                                            }
                                            r5 = r5;
                                            if (i24 == 1) {
                                                i = 16;
                                                i23 = 2097152;
                                                zqVar2 = o2;
                                                th3 = r5;
                                            }
                                        }
                                    }
                                    o2 = op.o(r5);
                                    i = 16;
                                    i23 = 2097152;
                                    zqVar2 = o2;
                                    th3 = r5;
                                }
                            }
                            i = 16;
                            i23 = 2097152;
                        }
                    }
                    I5 = I5.s();
                    i = 16;
                    zl0Var19 = (I5 == null || (l7Var4 = I5.J) == null) ? th : (ig1) l7Var4.f;
                }
                zl0Var2 = (d80) zqVar2;
            } else {
                zl0Var2 = th;
            }
            if (zl0Var2 != 0) {
                zl0 zl0Var22 = zl0Var2;
                if (!zl0Var22.d.r) {
                    o80.b(str);
                }
                ?? r02 = zl0Var22.d.i;
                jd0 I6 = op.I(zl0Var2);
                ?? r52 = th;
                while (I6 != null) {
                    int i25 = 2097152;
                    zl0 zl0Var23 = r02;
                    r52 = r52;
                    if ((((zl0) I6.J.g).h & 2097152) != 0) {
                        while (zl0Var23 != null) {
                            if ((zl0Var23.g & i25) != 0) {
                                zq zqVar4 = zl0Var23;
                                ?? r7 = th;
                                while (zqVar4 != 0) {
                                    if (zqVar4 instanceof d80) {
                                        if (r52 == 0) {
                                            r52 = new ArrayList();
                                        }
                                        r52.add(zqVar4);
                                    } else {
                                        int i26 = 2097152;
                                        if ((zqVar4.g & 2097152) != 0 && (zqVar4 instanceof zq)) {
                                            zl0 zl0Var24 = zqVar4.t;
                                            int i27 = 0;
                                            zqVar4 = zqVar4;
                                            r7 = r7;
                                            while (zl0Var24 != null) {
                                                if ((zl0Var24.g & i26) != 0) {
                                                    i27++;
                                                    r7 = r7;
                                                    if (i27 == 1) {
                                                        zqVar4 = zl0Var24;
                                                    } else {
                                                        if (r7 == 0) {
                                                            r7 = new eo0(new zl0[16]);
                                                        }
                                                        if (zqVar4 != 0) {
                                                            r7.b(zqVar4);
                                                            zqVar4 = th;
                                                        }
                                                        r7.b(zl0Var24);
                                                    }
                                                }
                                                zl0Var24 = zl0Var24.j;
                                                i26 = 2097152;
                                                zqVar4 = zqVar4;
                                                r7 = r7;
                                            }
                                            if (i27 == 1) {
                                            }
                                        }
                                    }
                                    zqVar4 = op.o(r7);
                                }
                            }
                            i25 = 2097152;
                            zl0Var23 = zl0Var23.i;
                            r52 = r52;
                        }
                    }
                    I6 = I6.s();
                    r02 = (I6 == null || (l7Var3 = I6.J) == null) ? th : (ig1) l7Var3.f;
                }
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i28 = size2 - 1;
                        ((d80) r52.get(size2)).y(u5Var, nx0.d);
                        if (i28 < 0) {
                            break;
                        }
                        size2 = i28;
                    }
                }
                zl0Var2.y(u5Var, nx0.d);
                zl0Var2.y(u5Var, nx0.e);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i29 = 0; i29 < size6; i29++) {
                        ((d80) r52.get(i29)).y(u5Var, nx0.e);
                    }
                }
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i30 = size - 1;
                        ((d80) r52.get(size)).y(u5Var, nx0.g);
                        if (i30 < 0) {
                            break;
                        }
                        size = i30;
                    }
                }
                zl0Var2.y(u5Var, nx0.g);
            }
            ArrayList arrayList3 = (ArrayList) u5Var.b;
            int size7 = arrayList3.size();
            for (int i31 = 0; i31 < size7; i31++) {
                if (((u70) arrayList3.get(i31)).i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        f80Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) u5Var.c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z2 = true;
            if ((action == 1 || action == 2) && z) {
                f80Var.b = 0;
                f80Var.c = true;
            }
        } else {
            z2 = true;
            f80Var.b = u5Var.a;
            f80Var.c = false;
        }
        f80Var.d.onTouchEvent(motionEvent2);
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (r(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.E0;
        p3 p3Var = this.D0;
        if (z) {
            removeCallbacks(p3Var);
            p3Var.run();
        }
        if (!p(motionEvent) && isAttachedToWindow()) {
            k4 k4Var = this.C;
            d4 d4Var = k4Var.h;
            AccessibilityManager accessibilityManager = k4Var.k;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    d4Var.t(true);
                    i60 i60Var = new i60();
                    l7 l7Var = d4Var.getRoot().J;
                    qp0 qp0Var = (qp0) l7Var.e;
                    o31 o31Var = qp0.Q;
                    ((qp0) l7Var.e).O0(qp0.T, qp0Var.G0((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), i60Var, 1, true);
                    mn0 mn0Var = i60Var.d;
                    for (int i2 = mn0Var.b - 1; -1 < i2; i2--) {
                        Object f = mn0Var.f(i2);
                        f.getClass();
                        jd0 I = op.I((zl0) f);
                        if (d4Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(I) != null) {
                            break;
                        }
                        if (I.J.g(8)) {
                            int t = k4Var.t(I.e);
                            l81 d = xa0.d(I, false);
                            if (m90.C(d)) {
                                if (!d.k().d.c(p81.y)) {
                                    i = t;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    d4Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = k4Var.i;
                    if (i3 != i) {
                        k4Var.i = i;
                        k4.x(k4Var, i, 128, null, 12);
                        k4.x(k4Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = k4Var.i;
                    if (i4 == Integer.MIN_VALUE) {
                        d4Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        k4Var.i = Integer.MIN_VALUE;
                        k4.x(k4Var, Integer.MIN_VALUE, 128, null, 12);
                        k4.x(k4Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && q(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.w0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.w0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.E0 = true;
                        postDelayed(p3Var, 8L);
                        return false;
                    }
                }
                if ((m(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((e10) getFocusOwner()).d(keyEvent, new w3(this, i, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.t.getClass();
        qo1.a.setValue(new yx0(metaState));
        return ((e10) getFocusOwner()).d(keyEvent, xl.i) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        l7 l7Var;
        if (isFocused()) {
            e10 e10Var = (e10) getFocusOwner();
            if (e10Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                o10 E = uq1.E(e10Var.c);
                if (E != null) {
                    if (!E.d.r) {
                        o80.b("visitAncestors called on an unattached node");
                    }
                    zl0 zl0Var = E.d;
                    jd0 I = op.I(E);
                    while (I != null) {
                        if ((((zl0) I.J.g).h & 131072) != 0) {
                            while (zl0Var != null) {
                                if ((zl0Var.g & 131072) != 0) {
                                    zl0 zl0Var2 = zl0Var;
                                    eo0 eo0Var = null;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 131072) != 0 && (zl0Var2 instanceof zq)) {
                                            int i = 0;
                                            for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                                if ((zl0Var3.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        zl0Var2 = zl0Var3;
                                                    } else {
                                                        if (eo0Var == null) {
                                                            eo0Var = new eo0(new zl0[16]);
                                                        }
                                                        if (zl0Var2 != null) {
                                                            eo0Var.b(zl0Var2);
                                                            zl0Var2 = null;
                                                        }
                                                        eo0Var.b(zl0Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        zl0Var2 = op.o(eo0Var);
                                    }
                                }
                                zl0Var = zl0Var.i;
                            }
                        }
                        I = I.s();
                        zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object saVar;
        o10 f;
        if (this.E0) {
            p3 p3Var = this.D0;
            removeCallbacks(p3Var);
            MotionEvent motionEvent2 = this.w0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.E0 = false;
            } else {
                p3Var.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int m = m(motionEvent);
            if ((m & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (saVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    saVar = new sa(1);
                }
                if (saVar.equals(new sa(1)) && (f = ((e10) getFocusOwner()).f()) != null) {
                    qp0 H = op.H(f);
                    s11 J = t80.n(H).J(H, true);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    if (!((intBitsToFloat < J.c) & (intBitsToFloat >= J.a) & (intBitsToFloat2 >= J.b) & (intBitsToFloat2 < J.d))) {
                        ((e10) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((m & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        s11 a;
        if (view == null || this.a0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !p4.l(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            o10 E = uq1.E(((e10) getFocusOwner()).c);
            a = E != null ? uq1.G(E) : null;
            if (a == null) {
                a = y00.a(view, this);
            }
        } else {
            a = y00.a(view, this);
        }
        s00 d = y00.d(i);
        int i2 = d != null ? d.a : 6;
        z11 z11Var = new z11();
        if (((e10) getFocusOwner()).e(i2, a, new x3(0, z11Var)) == null) {
            return view;
        }
        Object obj = z11Var.d;
        if (obj == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || i2 == 1 || i2 == 2 || gb0.B(uq1.G((o10) obj), y00.a(findNextFocus, this), a, i2)) {
            return this;
        }
        return findNextFocus;
    }

    public final h7 getAndroidViewsHandler$ui() {
        if (this.U == null) {
            h7 h7Var = new h7(getContext());
            this.U = h7Var;
            addView(h7Var, -1);
            requestLayout();
        }
        h7 h7Var2 = this.U;
        h7Var2.getClass();
        return h7Var2;
    }

    public dc getAutofill() {
        return this.O;
    }

    public fc getAutofillManager() {
        return this.P;
    }

    public gc getAutofillTree() {
        return this.G;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.N.getValue();
    }

    public final z4 getContentCaptureManager$ui() {
        return this.D;
    }

    public CoroutineContext getCoroutineContext() {
        return this.r;
    }

    public nr getDensity() {
        return (nr) this.n.getValue();
    }

    public s11 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            o10 E = uq1.E(((e10) getFocusOwner()).c);
            if (E != null) {
                return uq1.G(E);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return y00.a(findFocus, this);
        }
        return null;
    }

    public b10 getFocusOwner() {
        return this.q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        s11 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.a(((e10) getFocusOwner()).e(6, null, y3.e), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public v10 getFontFamilyResolver() {
        return (v10) this.q0.getValue();
    }

    public u10 getFontLoader() {
        return this.p0;
    }

    public final yg0 getFrameEndScheduler$ui() {
        return this.i;
    }

    public k50 getGraphicsContext() {
        return this.F;
    }

    public x50 getHapticFeedBack() {
        return this.s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.a0.b.l() || !this.l.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public a90 getInputModeManager() {
        return this.t0;
    }

    public final f90 getInsetsListener() {
        return this.w;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f0;
    }

    @Override // android.view.View, android.view.ViewParent
    public vc0 getLayoutDirection() {
        return (vc0) this.r0.getValue();
    }

    public long getMeasureIteration() {
        sk0 sk0Var = this.a0;
        if (!sk0Var.c) {
            o80.a("measureIteration should be only used during the measure/layout pass");
        }
        return sk0Var.g;
    }

    public bm0 getModifierLocalManager() {
        return this.u0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public d4 m14getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public yw0 getPlacementScope() {
        int i = ax0.b;
        return new fj0(1, this);
    }

    public px0 getPointerIconService() {
        return this.L0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final t70 m7getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.g;
    }

    public u11 getRectManager() {
        return this.z;
    }

    public n31 getRetainedValuesStore() {
        return this.k;
    }

    public jd0 getRoot() {
        return this.x;
    }

    public g41 getRootForTest() {
        return this.A;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        fg0 fg0Var;
        if (Build.VERSION.SDK_INT < 31 || (fg0Var = this.J0) == null) {
            return false;
        }
        return ((Boolean) fg0Var.a.getValue()).booleanValue();
    }

    public o81 getSemanticsOwner() {
        return this.B;
    }

    public ld0 getSharedDrawScope() {
        return this.h;
    }

    public boolean getShowLayoutBounds() {
        return c8.a.a(this);
    }

    public gu0 getSnapshotObserver() {
        return this.T;
    }

    public dc1 getSoftwareKeyboardController() {
        return this.o0;
    }

    public ch1 getTextInputService() {
        return this.m0;
    }

    public uh1 getTextToolbar() {
        return this.v0;
    }

    public final f41 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public on1 getViewConfiguration() {
        return this.v;
    }

    public final s3 getViewTreeOwners() {
        return (s3) this.j0.getValue();
    }

    public po1 getWindowInfo() {
        return this.t;
    }

    public final i3 get_autofillManager$ui() {
        return this.P;
    }

    public final void l(jd0 jd0Var, boolean z) {
        this.a0.f(jd0Var, z);
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
    public final int m(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        d4 d4Var;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        f60 f60Var;
        removeCallbacks(this.C0);
        try {
            C(motionEvent);
            this.g0 = true;
            t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.w0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                vg vgVar = this.M;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!vgVar.a) {
                                        ((aj0) ((nq0) vgVar.d).e).a();
                                        ((f60) vgVar.c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    H(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && q(motionEvent)) {
                                    d4Var = this;
                                    d4Var.H(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    d4Var = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = d4Var.w0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = d4Var.w0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    lm0 lm0Var = d4Var.L;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = d4Var.w0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = d4Var.w0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = d4Var.w0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    lm0Var.c.delete(pointerId);
                                                    lm0Var.b.delete(pointerId);
                                                }
                                                f60Var = (f60) vgVar.c;
                                                if (f60Var.d) {
                                                    f60Var.g.a.g();
                                                } else {
                                                    f60Var.d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        lm0Var.c.delete(pointerId);
                                        lm0Var.b.delete(pointerId);
                                    }
                                }
                                d4Var.w0 = MotionEvent.obtainNoHistory(motionEvent);
                                int G = G(motionEvent);
                                Trace.endSection();
                                d4Var.g0 = false;
                                return G;
                            }
                        }
                        z = true;
                        if (z) {
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
                if (z3) {
                }
                d4Var = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = d4Var.w0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = d4Var.w0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    lm0 lm0Var2 = d4Var.L;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = d4Var.w0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = d4Var.w0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = d4Var.w0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        f60Var = (f60) vgVar.c;
                        if (f60Var.d) {
                        }
                    }
                }
                d4Var.w0 = MotionEvent.obtainNoHistory(motionEvent);
                int G2 = G(motionEvent);
                Trace.endSection();
                d4Var.g0 = false;
                return G2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.g0 = false;
            throw th3;
        }
    }

    public final void o(jd0 jd0Var) {
        this.a0.p(jd0Var, false);
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            o((jd0) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        n31 n31Var;
        xg0 f;
        Object obj;
        super.onAttachedToWindow();
        this.w.onViewAttachedToWindow(this);
        int i = 0;
        if (P0 == null) {
            w2 w2Var = new w2(r3);
            P0 = w2Var;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (M0 == null) {
                    M0 = Class.forName("android.os.SystemProperties");
                }
                if (N0 == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = M0;
                    N0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = N0;
                if (method != null) {
                    method.invoke(null, w2Var);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        mn0 mn0Var = O0;
        synchronized (mn0Var) {
            mn0Var.a(this);
        }
        this.t.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.t.getClass();
        this.t.getClass();
        o(getRoot());
        n(getRoot());
        cc1 cc1Var = getSnapshotObserver().a;
        jl jlVar = cc1Var.d;
        pb1.e(pb1.a);
        synchronized (pb1.c) {
            pb1.h = CollectionsKt.v(pb1.h, jlVar);
        }
        cc1Var.h = new m2(2, jlVar);
        o91 o91Var = this.O;
        if (o91Var != null) {
            ec ecVar = ec.a;
            ecVar.getClass();
            ((AutofillManager) o91Var.g).registerCallback(ecVar);
        }
        vg0 s = t80.s(this);
        e61 p = t90.p(this);
        wj r = y90.r(this);
        yg0 yg0Var = this.i;
        if (s == null || r == null || yg0Var == null) {
            n31Var = null;
        } else {
            mj0 g = r.g();
            sc1 sc1Var = new sc1(5);
            ao aoVar = ao.b;
            g.getClass();
            aoVar.getClass();
            ah0 ah0Var = (ah0) new s40(g, sc1Var, aoVar).p(a21.a(ah0.class));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            en0 en0Var = ah0Var.b;
            Object b = en0Var.b(id);
            if (b == null) {
                b = new mn0(1);
                en0Var.h(id, b);
            }
            mn0 mn0Var2 = (mn0) b;
            Object[] objArr = mn0Var2.a;
            int i2 = mn0Var2.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((zg0) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            zg0 zg0Var = (zg0) obj;
            if (zg0Var == null) {
                zg0Var = new zg0();
                mn0Var2.a(zg0Var);
            }
            zg0Var.c = true;
            this.j = zg0Var;
            n31Var = zg0Var.b;
        }
        if (n31Var == null) {
            n31Var = j50.y;
        }
        this.k = n31Var;
        s3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (s != null && p != null && (s != viewTreeOwners.a || p != viewTreeOwners.b || r != viewTreeOwners.c))) {
            if (s == null) {
                dd0.j("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (p == null) {
                dd0.j("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (f = viewTreeOwners.a.f()) != null) {
                f.f(this);
            }
            s.f().a(this);
            s3 s3Var = new s3(s, p, r);
            set_viewTreeOwners(s3Var);
            Function1 function1 = this.k0;
            if (function1 != null) {
                function1.invoke(s3Var);
            }
            this.k0 = null;
        }
        this.t0.a.setValue(new z80(isInTouchMode() ? 1 : 2));
        s3 viewTreeOwners2 = getViewTreeOwners();
        xg0 f2 = viewTreeOwners2 != null ? viewTreeOwners2.a.f() : null;
        if (f2 == null) {
            throw qy0.g("No lifecycle owner exists");
        }
        f2.a(this);
        f2.a(this.D);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            n4.a.b(this);
        }
        i3 i3Var = this.P;
        if (i3Var != null) {
            ((e10) getFocusOwner()).g.a(i3Var);
            getSemanticsOwner().d.a(i3Var);
        }
        ((e10) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.n0.get() == null) {
            this.l0.getClass();
            return false;
        }
        af.c();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.n0.get() == null) {
            this.l0.getClass();
            return null;
        }
        af.c();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        l81 l81Var;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        z4 z4Var = this.D;
        z4Var.getClass();
        for (long j : jArr) {
            n81 n81Var = (n81) z4Var.h().b((int) j);
            if (n81Var != null && (l81Var = n81Var.a) != null) {
                o3.o();
                ViewTranslationRequest.Builder j2 = o3.j(z4Var.d.getAutofillId(), l81Var.g);
                Object g = l81Var.d.d.g(p81.z);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new y7(zh0.a(list, "\n", null, 62)));
                    j2.setValue("android:text", forText);
                    build = j2.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.onViewDetachedFromWindow(this);
        if (this.p) {
            View view = this.o;
            if (view == null) {
                Intrinsics.e("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        mn0 mn0Var = O0;
        synchronized (mn0Var) {
            mn0Var.j(this);
        }
        gu0 snapshotObserver = getSnapshotObserver();
        m2 m2Var = snapshotObserver.a.h;
        if (m2Var != null) {
            m2Var.c();
        }
        cc1 cc1Var = snapshotObserver.a;
        synchronized (cc1Var.g) {
            eo0 eo0Var = cc1Var.f;
            Object[] objArr = eo0Var.d;
            int i = eo0Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                bc1 bc1Var = (bc1) objArr[i2];
                bc1Var.e.a();
                bc1Var.f.a();
                bc1Var.l.a();
                bc1Var.m.clear();
            }
        }
        this.t.getClass();
        s3 viewTreeOwners = getViewTreeOwners();
        xg0 f = viewTreeOwners != null ? viewTreeOwners.a.f() : null;
        if (f == null) {
            throw qy0.g("No lifecycle owner exists");
        }
        f.f(this.D);
        f.f(this);
        o91 o91Var = this.O;
        if (o91Var != null) {
            ec ecVar = ec.a;
            ecVar.getClass();
            ((AutofillManager) o91Var.g).unregisterCallback(ecVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        zg0 zg0Var = this.j;
        if (zg0Var != null) {
            zg0Var.c = false;
        }
        this.j = null;
        if (Build.VERSION.SDK_INT >= 31) {
            n4.a.a(this);
        }
        i3 i3Var = this.P;
        if (i3Var != null) {
            getSemanticsOwner().d.j(i3Var);
            ((e10) getFocusOwner()).g.j(i3Var);
        }
        u11 rectManager = getRectManager();
        q2 q2Var = rectManager.g;
        if (q2Var != null) {
            r2.a.removeCallbacks(q2Var);
            rectManager.g = null;
        }
        ((e10) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        e10 e10Var = (e10) getFocusOwner();
        la0.y(e10Var.c, true);
        if (e10Var.f() != null) {
            o10 f = e10Var.f();
            e10Var.h(null);
            if (f != null) {
                f.A0(j10.d, j10.g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f0 = 0L;
        J();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        I(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f0 = 0L;
        this.a0.j(this.G0);
        this.V = null;
        J();
        if (this.U != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sk0 sk0Var = this.a0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long k = k(i);
            jk1 jk1Var = kk1.d;
            long k2 = k(i2);
            long D = la0.D((int) (k >>> 32), (int) (k & 4294967295L), (int) (k2 >>> 32), (int) (4294967295L & k2));
            mm mmVar = this.V;
            if (mmVar == null) {
                this.V = new mm(D);
                this.W = false;
            } else if (!mm.b(mmVar.a, D)) {
                this.W = true;
            }
            sk0Var.q(D);
            sk0Var.l();
            setMeasuredDimension(getRoot().K.p.d, getRoot().K.p.e);
            if (this.U != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().K.p.d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().K.p.e, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            i3 i3Var = this.P;
            if (i3Var != null) {
                jd0 jd0Var = i3Var.e.a;
                AutofillId autofillId = i3Var.j;
                String str = i3Var.i;
                u11 u11Var = i3Var.h;
                t90.w(viewStructure, jd0Var, autofillId, str, u11Var);
                Object[] objArr = rq0.a;
                mn0 mn0Var = new mn0(2);
                mn0Var.a(jd0Var);
                mn0Var.a(viewStructure);
                while (mn0Var.i()) {
                    Object k = mn0Var.k(mn0Var.b - 1);
                    k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k;
                    Object k2 = mn0Var.k(mn0Var.b - 1);
                    k2.getClass();
                    bo0 bo0Var = (bo0) ((jd0) k2).m();
                    int i2 = bo0Var.d.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        jd0 jd0Var2 = (jd0) bo0Var.get(i3);
                        if (!jd0Var2.U && jd0Var2.F() && jd0Var2.G()) {
                            h81 v = jd0Var2.v();
                            if (v != null) {
                                vn0 vn0Var = v.d;
                                if (vn0Var.b(g81.g) || vn0Var.b(g81.h) || vn0Var.b(p81.q) || vn0Var.b(p81.r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    t90.w(newChild, jd0Var2, autofillId, str, u11Var);
                                    mn0Var.a(jd0Var2);
                                    mn0Var.a(newChild);
                                }
                            }
                            mn0Var.a(jd0Var2);
                            mn0Var.a(viewStructure2);
                        }
                    }
                }
            }
            o91 o91Var = this.O;
            if (o91Var != null) {
                gc gcVar = (gc) o91Var.e;
                LinkedHashMap linkedHashMap = gcVar.a;
                LinkedHashMap linkedHashMap2 = gcVar.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        af.c();
                        return;
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId((AutofillId) o91Var.h, intValue);
                    newChild2.setId(intValue, ((d4) o91Var.d).getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
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
        if (this.e) {
            int[] iArr = y00.a;
            vc0 vc0Var = i != 0 ? i != 1 ? null : vc0.e : vc0.d;
            if (vc0Var == null) {
                vc0Var = vc0.d;
            }
            setLayoutDirection(vc0Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        fg0 fg0Var;
        if (Build.VERSION.SDK_INT < 31 || (fg0Var = this.J0) == null) {
            return;
        }
        o81 semanticsOwner = getSemanticsOwner();
        CoroutineContext coroutineContext = getCoroutineContext();
        eo0 eo0Var = new eo0(new b71[16]);
        t80.P(semanticsOwner.a(), 0, new a71(1, 8, eo0.class, eo0Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(eo0Var.d, 0, eo0Var.g, new cj(0, new Function1[]{h41.g, h41.h}));
        int i = eo0Var.g;
        b71 b71Var = (b71) (i == 0 ? null : eo0Var.d[i - 1]);
        if (b71Var == null) {
            return;
        }
        x90 x90Var = b71Var.c;
        tk tkVar = new tk(b71Var.a, x90Var, la0.f(coroutineContext), fg0Var, this);
        qp0 qp0Var = b71Var.d;
        long j = (x90Var.a << 32) | (x90Var.b & 4294967295L);
        ScrollCaptureTarget f = o3.f(this, t80.L(y90.C(t80.n(qp0Var).J(qp0Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), tkVar);
        f.setScrollBounds(t80.L(x90Var));
        consumer.accept(f);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.t0.a.setValue(new z80(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        z4 z4Var = this.D;
        z4Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            uq1.B(z4Var, longSparseArray);
        } else {
            z4Var.d.post(new x4(z4Var, 0, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.t.a.setValue(Boolean.valueOf(z));
        this.I0 = true;
        super.onWindowFocusChanged(z);
    }

    public final boolean q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.w0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            s00 d = y00.d(i);
            int i2 = d != null ? d.a : 7;
            Boolean e = ((e10) getFocusOwner()).e(i2, rect != null ? t80.M(rect) : null, new z3(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.a(e, bool)) {
                if (!Intrinsics.a(((e10) getFocusOwner()).e(i2, null, new z3(i2, 1)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((e10) getFocusOwner()).g(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final long s(long j) {
        B();
        long u = y90.u(this.d0, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32)) + Float.intBitsToFloat((int) (u >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L)) + Float.intBitsToFloat((int) (u & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.C.l = j;
    }

    public final void setConfiguration(Configuration configuration) {
        this.N.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(z4 z4Var) {
        this.D = z4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.r = coroutineContext;
        zl0 zl0Var = (zl0) getRoot().J.g;
        if (zl0Var instanceof wf1) {
            ((wf1) zl0Var).A0();
        }
        if (!zl0Var.d.r) {
            o80.b("visitSubtreeIf called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var2 = zl0Var.d;
        zl0 zl0Var3 = zl0Var2.j;
        if (zl0Var3 == null) {
            op.l(eo0Var, zl0Var2);
        } else {
            eo0Var.b(zl0Var3);
        }
        while (true) {
            int i = eo0Var.g;
            if (i == 0) {
                return;
            }
            zl0 zl0Var4 = (zl0) eo0Var.k(i - 1);
            if ((zl0Var4.h & 16) != 0) {
                for (zl0 zl0Var5 = zl0Var4; zl0Var5 != null && zl0Var5.r; zl0Var5 = zl0Var5.j) {
                    if ((zl0Var5.g & 16) != 0) {
                        zq zqVar = zl0Var5;
                        ?? r4 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof tx0) {
                                tx0 tx0Var = (tx0) zqVar;
                                if (tx0Var instanceof wf1) {
                                    ((wf1) tx0Var).A0();
                                }
                            } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var6 = zqVar.t;
                                int i2 = 0;
                                zqVar = zqVar;
                                r4 = r4;
                                while (zl0Var6 != null) {
                                    if ((zl0Var6.g & 16) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            zqVar = zl0Var6;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r4.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r4.b(zl0Var6);
                                        }
                                    }
                                    zl0Var6 = zl0Var6.j;
                                    zqVar = zqVar;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            zqVar = op.o(r4);
                        }
                    }
                }
            }
            op.l(eo0Var, zl0Var4);
        }
    }

    public final void setFrameEndScheduler$ui(yg0 yg0Var) {
        this.i = yg0Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super s3, Unit> function1) {
        s3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.k0 = function1;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m8setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(t70 t70Var) {
        this.g = t70Var;
    }

    public void setUncaughtExceptionHandler(f41 f41Var) {
        this.a0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        a4 a4Var;
        sk0 sk0Var = this.a0;
        if (sk0Var.b.l() || ((eo0) sk0Var.e.e).g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    a4Var = this.G0;
                } finally {
                    Trace.endSection();
                }
            } else {
                a4Var = null;
            }
            if (sk0Var.j(a4Var)) {
                requestLayout();
            }
            sk0Var.a(false);
            if (this.K) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.K = false;
            }
        }
    }

    public final void u(jd0 jd0Var, long j) {
        sk0 sk0Var = this.a0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            sk0Var.k(jd0Var, j);
            if (!sk0Var.b.l()) {
                sk0Var.a(false);
                if (this.K) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.K = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    public final boolean v(int i) {
        if (i != 7 && i != 8) {
            Integer c = y00.c(i);
            if (c == null) {
                throw qy0.g("Invalid focus direction");
            }
            int intValue = c.intValue();
            o10 f = ((e10) getFocusOwner()).f();
            if (f == null) {
                dd0.j("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer c2 = y00.c(i);
            if (c2 == null) {
                throw qy0.g("Invalid focus direction");
            }
            int intValue2 = c2.intValue();
            pn1 pn1Var = op.I(f).t;
            View interopView = pn1Var != null ? pn1Var.getInteropView() : null;
            View findFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
            if (findNextFocus == null || interopView == null || !p4.l(interopView, findNextFocus)) {
                findNextFocus = null;
            }
            if (findNextFocus != null) {
                return y00.b(findNextFocus, Integer.valueOf(intValue), null);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a8, code lost:
    
        r4.l(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        mn0 mn0Var;
        Object[] objArr;
        if (this.Q) {
            cc1 cc1Var = getSnapshotObserver().a;
            synchronized (cc1Var.g) {
                try {
                    eo0 eo0Var = cc1Var.f;
                    int i = eo0Var.g;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = eo0Var.d;
                        if (i2 >= i) {
                            break;
                        }
                        bc1 bc1Var = (bc1) objArr[i2];
                        bc1Var.d();
                        if (!bc1Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = eo0Var.d;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    eo0Var.g = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.Q = false;
        }
        h7 h7Var = this.U;
        if (h7Var != null) {
            j(h7Var);
        }
        i3 i3Var = this.P;
        if (i3Var != null) {
            fn0 fn0Var = i3Var.k;
            if (fn0Var.d == 0 && i3Var.l) {
                ((AutofillManager) i3Var.d.e).commit();
                i3Var.l = false;
            }
            if (fn0Var.d != 0) {
                i3Var.l = true;
            }
        }
        loop1: while (this.z0.i() && this.z0.f(0) != null) {
            int i5 = this.z0.b;
            int i6 = 0;
            while (true) {
                mn0 mn0Var2 = this.z0;
                if (i6 < i5) {
                    Function0 function0 = (Function0) mn0Var2.f(i6);
                    mn0Var = this.z0;
                    if (i6 < 0 || i6 >= mn0Var.b) {
                        break loop1;
                    }
                    Object[] objArr3 = mn0Var.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            mn0Var.n(i6);
            throw null;
        }
    }

    public final void x(jd0 jd0Var) {
        k4 k4Var = this.C;
        k4Var.C = true;
        if (k4Var.o()) {
            k4Var.p(jd0Var);
        }
        z4 z4Var = this.D;
        z4Var.k = true;
        if (z4Var.i()) {
            z4Var.l.s(Unit.a);
        }
    }

    public final void y(jd0 jd0Var, boolean z, boolean z2, boolean z3) {
        jd0 s;
        jd0 s2;
        sk0 sk0Var = this.a0;
        if (!z) {
            if (sk0Var.p(jd0Var, z2) && z3) {
                E(jd0Var);
                return;
            }
            return;
        }
        i8 i8Var = sk0Var.b;
        jd0 jd0Var2 = jd0Var.m;
        nd0 nd0Var = jd0Var.K;
        if (jd0Var2 == null) {
            o80.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = nd0Var.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    l.a();
                    return;
                }
                if (!nd0Var.e || z2) {
                    nd0Var.e = true;
                    nd0Var.p.x = true;
                    if (jd0Var.U) {
                        return;
                    }
                    if ((Intrinsics.a(jd0Var.H(), Boolean.TRUE) || sk0.h(jd0Var)) && ((s = jd0Var.s()) == null || !s.K.e)) {
                        i8Var.a(jd0Var, ua0.d);
                    } else if ((jd0Var.G() || sk0.i(jd0Var)) && ((s2 = jd0Var.s()) == null || !s2.p())) {
                        i8Var.a(jd0Var, ua0.g);
                    }
                    if (sk0Var.d || !z3) {
                        return;
                    }
                    E(jd0Var);
                    return;
                }
                return;
            }
        }
        sk0Var.h.b(new rk0(jd0Var, true, z2));
    }

    public final void z(jd0 jd0Var, boolean z, boolean z2) {
        nd0 nd0Var = jd0Var.K;
        sk0 sk0Var = this.a0;
        if (!z) {
            sk0Var.getClass();
            int ordinal = nd0Var.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                l.a();
                return;
            }
            jd0 s = jd0Var.s();
            boolean z3 = s == null || s.G();
            if (!z2) {
                if (jd0Var.p()) {
                    return;
                }
                if (jd0Var.o() && jd0Var.G() == z3 && jd0Var.G() == nd0Var.p.w) {
                    return;
                }
            }
            uk0 uk0Var = nd0Var.p;
            uk0Var.y = true;
            uk0Var.z = true;
            if (!jd0Var.U && uk0Var.w && z3) {
                if ((s == null || !s.o()) && (s == null || !s.p())) {
                    sk0Var.b.a(jd0Var, ua0.h);
                }
                if (sk0Var.d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        i8 i8Var = sk0Var.b;
        int ordinal2 = nd0Var.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    l.a();
                    return;
                }
            }
        }
        if ((nd0Var.e || nd0Var.f) && !z2) {
            return;
        }
        nd0Var.f = true;
        nd0Var.g = true;
        uk0 uk0Var2 = nd0Var.p;
        uk0Var2.y = true;
        uk0Var2.z = true;
        if (jd0Var.U) {
            return;
        }
        jd0 s2 = jd0Var.s();
        if (Intrinsics.a(jd0Var.H(), Boolean.TRUE) && ((s2 == null || !s2.K.e) && (s2 == null || !s2.K.f))) {
            i8Var.a(jd0Var, ua0.e);
        } else if (jd0Var.G() && ((s2 == null || !s2.o()) && (s2 == null || !s2.p()))) {
            i8Var.a(jd0Var, ua0.h);
        }
        if (sk0Var.d) {
            return;
        }
        E(null);
    }

    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public g3 m9getAccessibilityManager() {
        return this.E;
    }

    public m3 getClipboard() {
        return this.S;
    }

    public n3 getClipboardManager() {
        return this.R;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public e5 m12getDragAndDropManager() {
        return this.s;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public en0 m13getLayoutNodes() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
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

    @sr
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m6getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @sr
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setShowLayoutBounds(boolean z) {
    }

    public final void setUncaughtExceptionHandler$ui(f41 f41Var) {
    }
}
