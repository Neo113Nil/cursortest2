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
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import defpackage.kp;
import defpackage.q13;
import defpackage.t7;
import defpackage.ul1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t7 extends ViewGroup implements rx1, ob2, ui1, l80, xw1 {
    public static Class S0;
    public static Method T0;
    public static Method U0;
    public static final jn1 V0 = new jn1();
    public static m W0;
    public final zm1 A;
    public final x21 A0;
    public final x72 B;
    public final xl1 B0;
    public final t7 C;
    public final tb C0;
    public final ei2 D;
    public MotionEvent D0;
    public final b8 E;
    public long E0;
    public v8 F;
    public final tt1 F0;
    public final r6 G;
    public final jn1 G0;
    public final x9 H;
    public float H0;
    public final om I;
    public float I0;
    public final ArrayList J;
    public final r7 J0;
    public ArrayList K;
    public final k3 K0;
    public boolean L;
    public boolean L0;
    public final hm1 M;
    public final q7 M0;
    public final du N;
    public final pr N0;
    public Function1 O;
    public boolean O0;
    public final t6 P;
    public final j20 P0;
    public final v6 Q;
    public View Q0;
    public boolean R;
    public final o7 R0;
    public final d7 S;
    public final c7 T;
    public final tx1 U;
    public boolean V;
    public ec W;
    public u10 a0;
    public boolean b0;
    public final lj1 c0;
    public long d0;
    public final int[] e0;
    public final float[] f0;
    public final float[] g0;
    public final float[] h0;
    public long i0;
    public boolean j0;
    public long k0;
    public final lz1 l0;
    public long m;
    public final ia0 m0;
    public final boolean n;
    public Function1 n0;
    public final k91 o;
    public final e7 o0;
    public final lz1 p;
    public final f7 p0;
    public final View q;
    public final g7 q0;
    public final boolean r;
    public final uv2 r0;
    public final po0 s;
    public final sv2 s0;
    public CoroutineContext t;
    public final AtomicReference t0;
    public final n9 u;
    public final r90 u0;
    public final mc1 v;
    public final by1 v0;
    public final os w;
    public final lz1 w0;
    public final cc x;
    public int x0;
    public final a31 y;
    public final lz1 y0;
    public final i91 z;
    public final e80 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v31, types: [e7] */
    /* JADX WARN: Type inference failed for: r1v33, types: [g7] */
    public t7(Context context, CoroutineContext coroutineContext) {
        super(context);
        v6 v6Var;
        final t7 t7Var = this;
        t7Var.m = 9205357640488583168L;
        int i = 1;
        t7Var.n = true;
        t7Var.o = new k91();
        ea0 b = zm3.b(context);
        by1 by1Var = by1.q;
        t7Var.p = new lz1(b, by1Var);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        t7Var.r = z;
        dh0 dh0Var = new dh0();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dh0Var);
        cm1 cm1Var = new cm1() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return t7.this.hashCode();
            }

            @Override // defpackage.cm1
            public final ul1 i() {
                return new kp();
            }

            @Override // defpackage.cm1
            public final void m(ul1 ul1Var) {
                ((kp) ul1Var).getClass();
            }
        };
        t7Var.s = new po0(t7Var, t7Var);
        t7Var.t = coroutineContext;
        t7Var.u = new n9();
        t7Var.v = new mc1();
        vl1 a = a.a(new i7(t7Var, i));
        vl1 a2 = androidx.compose.ui.input.rotary.a.a();
        t7Var.w = new os();
        t7Var.x = new cc(ViewConfiguration.get(context));
        a31 a31Var = new a31();
        t7Var.y = a31Var;
        i91 i91Var = new i91(3);
        i91Var.d0(pb2.c);
        i91Var.a0(t7Var.getDensity());
        i91Var.f0(t7Var.getViewConfiguration());
        i91Var.e0(b.b(a31Var).k(emptySemanticsElement).k(a2).k(a).k(((po0) t7Var.getFocusOwner()).e).k(t7Var.m19getDragAndDropManager().c).k(cm1Var));
        t7Var.z = i91Var;
        zm1 zm1Var = r31.a;
        t7Var.A = new zm1();
        t7Var.getLayoutNodes();
        t7Var.B = new x72();
        t7Var.C = t7Var;
        t7Var.D = new ei2(t7Var.getRoot(), dh0Var, t7Var.getLayoutNodes());
        b8 b8Var = new b8(t7Var);
        t7Var.E = b8Var;
        t7Var.F = new v8(t7Var, new j7(0, t7Var, j8.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 0));
        r6 r6Var = new r6();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        t7Var.G = r6Var;
        t7Var.H = new x9(t7Var);
        t7Var.I = new om();
        t7Var.J = new ArrayList();
        t7Var.M = new hm1();
        i91 root = t7Var.getRoot();
        du duVar = new du();
        duVar.b = root;
        duVar.c = new rx0(root.P.c);
        duVar.d = new at0(12);
        duVar.e = new ux0();
        t7Var.N = duVar;
        t7Var.O = o3.o;
        t7Var.P = e() ? new t6(t7Var, t7Var.getAutofillTree()) : null;
        if (e()) {
            AutofillManager c = w6.c(context.getSystemService(w6.e()));
            if (c == null) {
                throw q40.f("Autofill service could not be located.");
            }
            t7Var = this;
            v6Var = new v6(new mm(c), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            v6Var = null;
        }
        t7Var.Q = v6Var;
        t7Var.S = new d7(context);
        t7Var.m18getClipboardManager();
        t7Var.T = new c7();
        t7Var.U = new tx1(new i7(t7Var, 2));
        t7Var.c0 = new lj1(t7Var.getRoot());
        t7Var.d0 = 9223372034707292159L;
        t7Var.e0 = new int[]{0, 0};
        float[] a3 = ti1.a();
        t7Var.f0 = a3;
        t7Var.g0 = ti1.a();
        t7Var.h0 = ti1.a();
        t7Var.i0 = -1L;
        t7Var.k0 = 9187343241974906880L;
        t7Var.l0 = ij2.j(null);
        t7Var.m0 = ij2.f(new q7(t7Var, 1));
        t7Var.o0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: e7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                t7.this.K();
            }
        };
        t7Var.p0 = new f7(0, t7Var);
        t7Var.q0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: g7
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                t7.this.A0.a.setValue(new v21(z2 ? 1 : 2));
            }
        };
        uv2 uv2Var = new uv2(t7Var.getView(), t7Var);
        t7Var.r0 = uv2Var;
        t7Var.s0 = new sv2(uv2Var);
        t7Var.t0 = new AtomicReference(null);
        t7Var.u0 = new r90(t7Var.getTextInputService());
        t7Var.v0 = new by1(24);
        t7Var.w0 = new lz1(ap.u(context), by1Var);
        t7Var.x0 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        u81 u81Var = layoutDirection != 0 ? layoutDirection != 1 ? null : u81.n : u81.m;
        t7Var.y0 = ij2.j(u81Var == null ? u81.m : u81Var);
        t7Var.z0 = new e80(t7Var, 1);
        t7Var.A0 = new x21(t7Var.isInTouchMode() ? 1 : 2, new i7(t7Var, i3));
        t7Var.B0 = new xl1(t7Var);
        t7Var.C0 = new tb(t7Var);
        t7Var.F0 = new tt1(15);
        t7Var.G0 = new jn1();
        t7Var.J0 = new r7(i3, t7Var);
        t7Var.K0 = new k3(1, t7Var);
        t7Var.M0 = new q7(t7Var, i3);
        t7Var.N0 = i2 < 29 ? new qr(a3) : new rr();
        t7Var.addOnAttachStateChangeListener(t7Var.F);
        t7Var.setWillNotDraw(false);
        t7Var.setFocusable(true);
        if (i2 >= 26) {
            i8.a.a(t7Var, 1, false);
        }
        t7Var.setFocusableInTouchMode(true);
        t7Var.setClipChildren(false);
        e53.i(t7Var, b8Var);
        t7Var.setOnDragListener(t7Var.m19getDragAndDropManager());
        t7Var.getRoot().d(t7Var);
        if (i2 >= 29) {
            d8.a.a(t7Var);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            t7Var.q = view;
            t7Var.addView(view, -1);
        }
        t7Var.P0 = i2 >= 31 ? new j20() : null;
        t7Var.R0 = new o7(t7Var);
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof t7) {
                ((t7) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h7 get_viewTreeOwners() {
        return (h7) this.l0.getValue();
    }

    public static long h(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            q13.a aVar = q13.m;
            return size;
        }
        if (mode == 0) {
            q13.a aVar2 = q13.m;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        q13.a aVar3 = q13.m;
        return j | (j << 32);
    }

    public static View i(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.b(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View i3 = i(viewGroup.getChildAt(i2), i);
                    if (i3 != null) {
                        return i3;
                    }
                }
            }
        }
        return null;
    }

    public static void l(i91 i91Var) {
        i91Var.C();
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            l((i91) objArr[i2]);
        }
    }

    public static boolean q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !im1.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(ca0 ca0Var) {
        this.p.setValue(ca0Var);
    }

    private void setFontFamilyResolver(hp0 hp0Var) {
        this.w0.setValue(hp0Var);
    }

    private void setLayoutDirection(u81 u81Var) {
        this.y0.setValue(u81Var);
    }

    private final void set_viewTreeOwners(h7 h7Var) {
        this.l0.setValue(h7Var);
    }

    public final void A(i91 i91Var, boolean z, boolean z2) {
        m91 m91Var = i91Var.Q;
        lj1 lj1Var = this.c0;
        if (!z) {
            lj1Var.getClass();
            int ordinal = m91Var.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                a.b();
                return;
            }
            i91 u = i91Var.u();
            boolean z3 = u == null || u.J();
            if (!z2) {
                if (i91Var.q()) {
                    return;
                }
                if (i91Var.p() && i91Var.J() == z3 && i91Var.J() == m91Var.p.E) {
                    return;
                }
            }
            nj1 nj1Var = m91Var.p;
            nj1Var.G = true;
            nj1Var.H = true;
            if (!i91Var.Y && nj1Var.E && z3) {
                if ((u == null || !u.p()) && (u == null || !u.q())) {
                    lj1Var.b.h(i91Var, w41.p);
                }
                if (lj1Var.d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        mh mhVar = lj1Var.b;
        int ordinal2 = m91Var.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    a.b();
                    return;
                }
            }
        }
        if ((m91Var.e || m91Var.f) && !z2) {
            return;
        }
        m91Var.f = true;
        m91Var.g = true;
        nj1 nj1Var2 = m91Var.p;
        nj1Var2.G = true;
        nj1Var2.H = true;
        if (i91Var.Y) {
            return;
        }
        i91 u2 = i91Var.u();
        if (Intrinsics.b(i91Var.K(), Boolean.TRUE) && ((u2 == null || !u2.Q.e) && (u2 == null || !u2.Q.f))) {
            mhVar.h(i91Var, w41.n);
        } else if (i91Var.J() && ((u2 == null || !u2.p()) && (u2 == null || !u2.q()))) {
            mhVar.h(i91Var, w41.p);
        }
        if (lj1Var.d) {
            return;
        }
        F(null);
    }

    public final void B() {
        b8 b8Var = this.E;
        b8Var.A = true;
        if (b8Var.q() && !b8Var.L) {
            b8Var.L = true;
            b8Var.l.post(b8Var.N);
        }
        v8 v8Var = this.F;
        v8Var.s = true;
        if (!v8Var.g() || v8Var.z) {
            return;
        }
        v8Var.z = true;
        v8Var.u.post(v8Var.A);
    }

    public final void C() {
        if (this.j0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.i0) {
            this.i0 = currentAnimationTimeMillis;
            pr prVar = this.N0;
            float[] fArr = this.g0;
            prVar.a(this, fArr);
            ap.C(fArr, this.h0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.e0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.k0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.i0 = AnimationUtils.currentAnimationTimeMillis();
        pr prVar = this.N0;
        float[] fArr = this.g0;
        prVar.a(this, fArr);
        ap.C(fArr, this.h0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = ti1.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.k0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(i91 i91Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (i91Var != null) {
            while (i91Var != null && i91Var.r() == g91.m) {
                if (!this.b0) {
                    i91 u = i91Var.u();
                    if (u == null) {
                        break;
                    }
                    long j = u.P.c.p;
                    if (u10.f(j) && u10.e(j)) {
                        break;
                    }
                }
                i91Var = i91Var.u();
            }
            if (i91Var == getRoot()) {
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

    public final long G(long j) {
        C();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.k0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.k0 & 4294967295L));
        return ti1.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.h0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.O0) {
            this.O0 = false;
            int metaState = motionEvent.getMetaState();
            this.v.getClass();
            y63.a.setValue(new y22(metaState));
        }
        hm1 hm1Var = this.M;
        tt1 a = hm1Var.a(this, motionEvent);
        du duVar = this.N;
        if (a == null) {
            if (!duVar.a) {
                ((mg1) ((at0) duVar.d).m).a();
                ((rx0) duVar.c).c();
            }
            return 0;
        }
        List list = (List) a.n;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((v22) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        v22 v22Var = (v22) obj;
        if (v22Var != null) {
            this.m = v22Var.d;
        }
        int e = duVar.e(a, this, r(motionEvent));
        a.o = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (e & 1) != 0) {
            return e;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        hm1Var.c.delete(pointerId);
        hm1Var.b.delete(pointerId);
        return e;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long u = u((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (u >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (u & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        tt1 a = this.M.a(this, obtain);
        a.getClass();
        this.N.e(a, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Function2 function2, r30 r30Var) {
        s7 s7Var;
        int i;
        if (r30Var instanceof s7) {
            s7Var = (s7) r30Var;
            int i2 = s7Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s7Var.o = i2 - Integer.MIN_VALUE;
                Object obj = s7Var.m;
                b50 b50Var = b50.m;
                i = s7Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    i7 i7Var = new i7(this, 3);
                    s7Var.o = 1;
                    if (j8.t(new j5(i7Var, this.t0, function2, (o30) null, 10), s7Var) == b50Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    ca2.b(obj);
                }
                throw new k81();
            }
        }
        s7Var = new s7(this, r30Var);
        Object obj2 = s7Var.m;
        b50 b50Var2 = b50.m;
        i = s7Var.o;
        if (i != 0) {
        }
        throw new k81();
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
    public final void K() {
        boolean z;
        View view;
        long j;
        long R;
        float[] fArr;
        int k;
        jx2 jx2Var;
        boolean z2;
        long j2;
        int[] iArr = this.e0;
        getLocationOnScreen(iArr);
        long j3 = this.d0;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1] || this.i0 < 0) {
            this.d0 = (i3 << 32) | (iArr[1] & 4294967295L);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                getRoot().Q.p.q0();
                z = true;
                C();
                view = this.Q0;
                if (view == null) {
                    view = getRootView();
                    this.Q0 = view;
                }
                x72 rectManager = getRectManager();
                j = this.d0;
                R = yk3.R(this.k0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.g0;
                k = yk3.k(fArr);
                jx2Var = rectManager.b;
                if ((k & 2) != 0) {
                    fArr = null;
                }
                if (s31.a(R, jx2Var.c)) {
                    jx2Var.c = R;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!s31.a(j, jx2Var.d)) {
                    jx2Var.d = j;
                    z2 = true;
                }
                if (fArr != null) {
                    z2 = true;
                }
                j2 = (width << 32) | (height & 4294967295L);
                if (j2 != jx2Var.e) {
                    jx2Var.e = j2;
                    z2 = true;
                }
                rectManager.e = !z2 || rectManager.e;
                this.c0.a(z);
                getRectManager().b();
            }
        }
        z = false;
        C();
        view = this.Q0;
        if (view == null) {
        }
        x72 rectManager2 = getRectManager();
        j = this.d0;
        R = yk3.R(this.k0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.g0;
        k = yk3.k(fArr);
        jx2Var = rectManager2.b;
        if ((k & 2) != 0) {
        }
        if (s31.a(R, jx2Var.c)) {
        }
        if (!s31.a(j, jx2Var.d)) {
        }
        if (fArr != null) {
        }
        j2 = (width2 << 32) | (height2 & 4294967295L);
        if (j2 != jx2Var.e) {
        }
        rectManager2.e = !z2 || rectManager2.e;
        this.c0.a(z);
        getRectManager().b();
    }

    public final void L(float f) {
        if (this.r) {
            if (f > 0.0f) {
                if (Float.isNaN(this.H0) || f > this.H0) {
                    this.H0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.I0) || f < this.I0) {
                    this.I0 = f;
                }
            }
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
        if (e()) {
            v6 v6Var = this.Q;
            if (v6Var != null) {
                v6Var.a(sparseArray);
            }
            t6 t6Var = this.P;
            if (t6Var != null) {
                k31.s(t6Var, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.E.h(false, i, this.m);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.E.h(true, i, this.m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        v(true);
        tm2.k().m();
        this.L = true;
        os osVar = this.w;
        y6 y6Var = osVar.a;
        Canvas canvas2 = y6Var.a;
        y6Var.a = canvas;
        getRoot().i(y6Var, null);
        osVar.a.a = canvas2;
        ArrayList arrayList = this.J;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fw0) ((qx1) arrayList.get(i))).g();
            }
        }
        int i2 = k53.m;
        arrayList.clear();
        this.L = false;
        ArrayList arrayList2 = this.K;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.r) {
            me.a(this, this.H0);
            View view = this.q;
            if (view == null) {
                Intrinsics.f("frameRateCategoryView");
                throw null;
            }
            me.a(view, this.I0);
            if (!Float.isNaN(this.I0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.H0 = Float.NaN;
            this.I0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        fs1 fs1Var;
        sb2 sb2Var;
        int size;
        fs1 fs1Var2;
        ul1 ul1Var;
        fs1 fs1Var3;
        if (this.L0) {
            k3 k3Var = this.K0;
            removeCallbacks(k3Var);
            if (motionEvent.getActionMasked() == 8) {
                this.L0 = false;
            } else {
                k3Var.run();
            }
        }
        if (q(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i = 1;
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Float.floatToRawIntBits(x);
                Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                po0 po0Var = (po0) getFocusOwner();
                if (po0Var.d.e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    yo0 A = j8.A(po0Var.c);
                    if (A != null) {
                        if (!A.m.z) {
                            h21.b("visitAncestors called on an unattached node");
                        }
                        ul1 ul1Var2 = A.m;
                        i91 J = s03.J(A);
                        while (J != null) {
                            if ((J.P.f.p & 2097152) != 0) {
                                while (ul1Var2 != null) {
                                    if ((ul1Var2.o & 2097152) != 0) {
                                        ul1 ul1Var3 = ul1Var2;
                                        eo1 eo1Var = null;
                                        while (ul1Var3 != null) {
                                            if ((ul1Var3.o & 2097152) != 0 && (ul1Var3 instanceof p90)) {
                                                int i2 = 0;
                                                for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                                    if ((ul1Var4.o & 2097152) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            ul1Var3 = ul1Var4;
                                                        } else {
                                                            if (eo1Var == null) {
                                                                eo1Var = new eo1(new ul1[16]);
                                                            }
                                                            if (ul1Var3 != null) {
                                                                eo1Var.b(ul1Var3);
                                                                ul1Var3 = null;
                                                            }
                                                            eo1Var.b(ul1Var4);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            ul1Var3 = s03.c(eo1Var);
                                        }
                                    }
                                    ul1Var2 = ul1Var2.q;
                                }
                            }
                            J = J.u();
                            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (k(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = h53.a;
            k31.n(viewConfiguration);
        } else {
            h53.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i3 >= 26) {
            k31.m(viewConfiguration);
        } else {
            h53.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        no0 focusOwner = getFocusOwner();
        k7 k7Var = new k7(i, this, motionEvent);
        po0 po0Var2 = (po0) focusOwner;
        if (po0Var2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        yo0 A2 = j8.A(po0Var2.c);
        if (A2 != null) {
            if (!A2.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var5 = A2.m;
            i91 J2 = s03.J(A2);
            loop0: while (true) {
                if (J2 == null) {
                    ul1Var = null;
                    break;
                }
                if ((J2.P.f.p & 16384) != 0) {
                    while (ul1Var5 != null) {
                        if ((ul1Var5.o & 16384) != 0) {
                            ul1Var = ul1Var5;
                            eo1 eo1Var2 = null;
                            while (ul1Var != null) {
                                if (ul1Var instanceof sb2) {
                                    break loop0;
                                }
                                if ((ul1Var.o & 16384) != 0 && (ul1Var instanceof p90)) {
                                    int i4 = 0;
                                    for (ul1 ul1Var6 = ((p90) ul1Var).B; ul1Var6 != null; ul1Var6 = ul1Var6.r) {
                                        if ((ul1Var6.o & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                ul1Var = ul1Var6;
                                            } else {
                                                if (eo1Var2 == null) {
                                                    eo1Var2 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var != null) {
                                                    eo1Var2.b(ul1Var);
                                                    ul1Var = null;
                                                }
                                                eo1Var2.b(ul1Var6);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                ul1Var = s03.c(eo1Var2);
                            }
                        }
                        ul1Var5 = ul1Var5.q;
                    }
                }
                J2 = J2.u();
                ul1Var5 = (J2 == null || (fs1Var3 = J2.P) == null) ? null : fs1Var3.e;
            }
            sb2Var = (sb2) ul1Var;
        } else {
            sb2Var = null;
        }
        if (sb2Var != null) {
            if (!sb2Var.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var7 = sb2Var.m.q;
            i91 J3 = s03.J(sb2Var);
            ArrayList arrayList = null;
            while (J3 != null) {
                if ((J3.P.f.p & 16384) != 0) {
                    while (ul1Var7 != null) {
                        if ((ul1Var7.o & 16384) != 0) {
                            ul1 ul1Var8 = ul1Var7;
                            eo1 eo1Var3 = null;
                            while (ul1Var8 != null) {
                                if (ul1Var8 instanceof sb2) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(ul1Var8);
                                } else if ((ul1Var8.o & 16384) != 0 && (ul1Var8 instanceof p90)) {
                                    int i5 = 0;
                                    for (ul1 ul1Var9 = ((p90) ul1Var8).B; ul1Var9 != null; ul1Var9 = ul1Var9.r) {
                                        if ((ul1Var9.o & 16384) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                ul1Var8 = ul1Var9;
                                            } else {
                                                if (eo1Var3 == null) {
                                                    eo1Var3 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var8 != null) {
                                                    eo1Var3.b(ul1Var8);
                                                    ul1Var8 = null;
                                                }
                                                eo1Var3.b(ul1Var9);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                ul1Var8 = s03.c(eo1Var3);
                            }
                        }
                        ul1Var7 = ul1Var7.q;
                    }
                }
                J3 = J3.u();
                ul1Var7 = (J3 == null || (fs1Var2 = J3.P) == null) ? null : fs1Var2.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i6 = size - 1;
                    ((sb2) arrayList.get(size)).getClass();
                    if (i6 < 0) {
                        break;
                    }
                    size = i6;
                }
            }
            ul1 ul1Var10 = sb2Var.m;
            eo1 eo1Var4 = null;
            while (ul1Var10 != null) {
                if (!(ul1Var10 instanceof sb2) && (ul1Var10.o & 16384) != 0 && (ul1Var10 instanceof p90)) {
                    int i7 = 0;
                    for (ul1 ul1Var11 = ((p90) ul1Var10).B; ul1Var11 != null; ul1Var11 = ul1Var11.r) {
                        if ((ul1Var11.o & 16384) != 0) {
                            i7++;
                            if (i7 == 1) {
                                ul1Var10 = ul1Var11;
                            } else {
                                if (eo1Var4 == null) {
                                    eo1Var4 = new eo1(new ul1[16]);
                                }
                                if (ul1Var10 != null) {
                                    eo1Var4.b(ul1Var10);
                                    ul1Var10 = null;
                                }
                                eo1Var4.b(ul1Var11);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                ul1Var10 = s03.c(eo1Var4);
            }
            if (!((Boolean) k7Var.invoke()).booleanValue()) {
                ul1 ul1Var12 = sb2Var.m;
                eo1 eo1Var5 = null;
                while (ul1Var12 != null) {
                    if (!(ul1Var12 instanceof sb2) && (ul1Var12.o & 16384) != 0 && (ul1Var12 instanceof p90)) {
                        int i8 = 0;
                        for (ul1 ul1Var13 = ((p90) ul1Var12).B; ul1Var13 != null; ul1Var13 = ul1Var13.r) {
                            if ((ul1Var13.o & 16384) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    ul1Var12 = ul1Var13;
                                } else {
                                    if (eo1Var5 == null) {
                                        eo1Var5 = new eo1(new ul1[16]);
                                    }
                                    if (ul1Var12 != null) {
                                        eo1Var5.b(ul1Var12);
                                        ul1Var12 = null;
                                    }
                                    eo1Var5.b(ul1Var13);
                                }
                            }
                        }
                        if (i8 == 1) {
                        }
                    }
                    ul1Var12 = s03.c(eo1Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        o3 o3Var = ((sb2) arrayList.get(i9)).A;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (s(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.L0;
        k3 k3Var = this.K0;
        if (z) {
            removeCallbacks(k3Var);
            k3Var.run();
        }
        if (!q(motionEvent) && isAttachedToWindow()) {
            b8 b8Var = this.E;
            t7 t7Var = b8Var.d;
            AccessibilityManager accessibilityManager = b8Var.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    t7Var.v(true);
                    ux0 ux0Var = new ux0();
                    fs1 fs1Var = t7Var.getRoot().P;
                    ks1 ks1Var = fs1Var.d;
                    ia2 ia2Var = ks1.V;
                    fs1Var.d.V0(ks1.Z, ks1Var.N0((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), ux0Var, 1, true);
                    jn1 jn1Var = ux0Var.m;
                    int i2 = jn1Var.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object e = jn1Var.e(i2);
                        e.getClass();
                        i91 J = s03.J((ul1) e);
                        if (t7Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(J) != null) {
                            b71.o();
                            return false;
                        }
                        if (J.P.d(8)) {
                            int v = b8Var.v(J.n);
                            ai2 a = ci2.a(J, false);
                            if (s03.D(a)) {
                                if (!a.k().m.c(gi2.z)) {
                                    i = v;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2--;
                    }
                    t7Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i3 = b8Var.e;
                    if (i3 != i) {
                        b8Var.e = i;
                        b8.z(b8Var, i, 128, null, 12);
                        b8.z(b8Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = b8Var.e;
                    if (i4 == Integer.MIN_VALUE) {
                        t7Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        b8Var.e = Integer.MIN_VALUE;
                        b8.z(b8Var, Integer.MIN_VALUE, 128, null, 12);
                        b8.z(b8Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.D0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.D0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.L0 = true;
                        postDelayed(k3Var, 8L);
                        return false;
                    }
                }
                if ((k(motionEvent) & 1) != 0) {
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
            return ((po0) getFocusOwner()).d(keyEvent, new k7(i, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.v.getClass();
        y63.a.setValue(new y22(metaState));
        return ((po0) getFocusOwner()).d(keyEvent, o00.x) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        fs1 fs1Var;
        if (isFocused()) {
            po0 po0Var = (po0) getFocusOwner();
            if (po0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                yo0 A = j8.A(po0Var.c);
                if (A != null) {
                    if (!A.m.z) {
                        h21.b("visitAncestors called on an unattached node");
                    }
                    ul1 ul1Var = A.m;
                    i91 J = s03.J(A);
                    while (J != null) {
                        if ((J.P.f.p & 131072) != 0) {
                            while (ul1Var != null) {
                                if ((ul1Var.o & 131072) != 0) {
                                    ul1 ul1Var2 = ul1Var;
                                    eo1 eo1Var = null;
                                    while (ul1Var2 != null) {
                                        if ((ul1Var2.o & 131072) != 0 && (ul1Var2 instanceof p90)) {
                                            int i = 0;
                                            for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                                if ((ul1Var3.o & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        ul1Var2 = ul1Var3;
                                                    } else {
                                                        if (eo1Var == null) {
                                                            eo1Var = new eo1(new ul1[16]);
                                                        }
                                                        if (ul1Var2 != null) {
                                                            eo1Var.b(ul1Var2);
                                                            ul1Var2 = null;
                                                        }
                                                        eo1Var.b(ul1Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        ul1Var2 = s03.c(eo1Var);
                                    }
                                }
                                ul1Var = ul1Var.q;
                            }
                        }
                        J = J.u();
                        ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            c8.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L0) {
            k3 k3Var = this.K0;
            removeCallbacks(k3Var);
            MotionEvent motionEvent2 = this.D0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.L0 = false;
            } else {
                k3Var.run();
            }
        }
        if (!q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || s(motionEvent))) {
            int k = k(motionEvent);
            if ((k & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((k & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return i(this, i);
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
        w72 n;
        if (view == null || this.c0.c) {
            return super.focusSearch(view, i);
        }
        Object obj = io0.f.get();
        obj.getClass();
        View b = ((io0) obj).b(i, view, this);
        if (view == this) {
            yo0 A = j8.A(((po0) getFocusOwner()).c);
            n = A != null ? j8.B(A) : null;
            if (n == null) {
                n = ll3.n(view, this);
            }
        } else {
            n = ll3.n(view, this);
        }
        fo0 Y = ll3.Y(i);
        int i2 = Y != null ? Y.a : 6;
        c82 c82Var = new c82();
        if (((po0) getFocusOwner()).e(i2, n, new m7(0, c82Var)) != null) {
            Object obj2 = c82Var.m;
            if (obj2 != null) {
                if (b != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (mh2.l(j8.B((yo0) obj2), ll3.n(b, this), n, i2)) {
                    }
                }
                return this;
            }
            if (b == null) {
            }
            return b;
        }
        return view;
    }

    public final ec getAndroidViewsHandler$ui_release() {
        if (this.W == null) {
            ec ecVar = new ec(getContext());
            this.W = ecVar;
            addView(ecVar, -1);
            requestLayout();
        }
        ec ecVar2 = this.W;
        ecVar2.getClass();
        return ecVar2;
    }

    public hm getAutofill() {
        return this.P;
    }

    public nm getAutofillManager() {
        return this.Q;
    }

    public om getAutofillTree() {
        return this.I;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.O;
    }

    public final v8 getContentCaptureManager$ui_release() {
        return this.F;
    }

    public CoroutineContext getCoroutineContext() {
        return this.t;
    }

    public ca0 getDensity() {
        return (ca0) this.p.getValue();
    }

    public w72 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            yo0 A = j8.A(((po0) getFocusOwner()).c);
            if (A != null) {
                return j8.B(A);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return ll3.n(findFocus, this);
        }
        return null;
    }

    public no0 getFocusOwner() {
        return this.s;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        w72 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.b(((po0) getFocusOwner()).e(6, null, o3.p), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public hp0 getFontFamilyResolver() {
        return (hp0) this.w0.getValue();
    }

    public gp0 getFontLoader() {
        return this.v0;
    }

    public cw0 getGraphicsContext() {
        return this.H;
    }

    public hx0 getHapticFeedBack() {
        return this.z0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.c0.b.x();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public w21 getInputModeManager() {
        return this.A0;
    }

    public final a31 getInsetsListener() {
        return this.y;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.i0;
    }

    @Override // android.view.View, android.view.ViewParent
    public u81 getLayoutDirection() {
        return (u81) this.y0.getValue();
    }

    public long getMeasureIteration() {
        lj1 lj1Var = this.c0;
        if (!lj1Var.c) {
            h21.a("measureIteration should be only used during the measure/layout pass");
        }
        return lj1Var.g;
    }

    public xl1 getModifierLocalManager() {
        return this.B0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public t7 m21getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public m12 getPlacementScope() {
        int i = o12.b;
        return new rg1(1, this);
    }

    public r22 getPointerIconService() {
        return this.R0;
    }

    public x72 getRectManager() {
        return this.B;
    }

    public i91 getRoot() {
        return this.z;
    }

    public ob2 getRootForTest() {
        return this.C;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        j20 j20Var;
        if (Build.VERSION.SDK_INT < 31 || (j20Var = this.P0) == null) {
            return false;
        }
        return ((Boolean) ((lz1) j20Var.b).getValue()).booleanValue();
    }

    public ei2 getSemanticsOwner() {
        return this.D;
    }

    public k91 getSharedDrawScope() {
        return this.o;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? fe.a.a(this) : this.V;
    }

    public tx1 getSnapshotObserver() {
        return this.U;
    }

    public kn2 getSoftwareKeyboardController() {
        return this.u0;
    }

    public sv2 getTextInputService() {
        return this.s0;
    }

    public qw2 getTextToolbar() {
        return this.C0;
    }

    public final nb2 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public g53 getViewConfiguration() {
        return this.x;
    }

    public final h7 getViewTreeOwners() {
        return (h7) this.m0.getValue();
    }

    public x63 getWindowInfo() {
        return this.v;
    }

    public final v6 get_autofillManager$ui_release() {
        return this.Q;
    }

    public final void j(i91 i91Var, boolean z) {
        this.c0.f(i91Var, z);
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
    public final int k(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        t7 t7Var;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        rx0 rx0Var;
        removeCallbacks(this.J0);
        try {
            D(motionEvent);
            this.j0 = true;
            v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.D0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                du duVar = this.N;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!duVar.a) {
                                        ((mg1) ((at0) duVar.d).m).a();
                                        ((rx0) duVar.c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    I(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && r(motionEvent)) {
                                    t7Var = this;
                                    t7Var.I(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    t7Var = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = t7Var.D0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = t7Var.D0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    hm1 hm1Var = t7Var.M;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = t7Var.D0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = t7Var.D0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = t7Var.D0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    hm1Var.c.delete(pointerId);
                                                    hm1Var.b.delete(pointerId);
                                                }
                                                rx0Var = (rx0) duVar.c;
                                                if (rx0Var.d) {
                                                    rx0Var.g.a.g();
                                                } else {
                                                    rx0Var.d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        hm1Var.c.delete(pointerId);
                                        hm1Var.b.delete(pointerId);
                                    }
                                }
                                t7Var.D0 = MotionEvent.obtainNoHistory(motionEvent);
                                int H = H(motionEvent);
                                Trace.endSection();
                                t7Var.j0 = false;
                                return H;
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
                t7Var = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = t7Var.D0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = t7Var.D0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    hm1 hm1Var2 = t7Var.M;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = t7Var.D0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = t7Var.D0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = t7Var.D0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        rx0Var = (rx0) duVar.c;
                        if (rx0Var.d) {
                        }
                    }
                }
                t7Var.D0 = MotionEvent.obtainNoHistory(motionEvent);
                int H2 = H(motionEvent);
                Trace.endSection();
                t7Var.j0 = false;
                return H2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.j0 = false;
            throw th3;
        }
    }

    @Override // defpackage.l80
    public final void n(id1 id1Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(bd3.v());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ad1 lifecycle;
        id1 id1Var;
        t6 t6Var;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(bd3.v());
        }
        this.y.onViewAttachedToWindow(this);
        if (i > 28) {
            if (W0 == null) {
                m mVar = new m(6);
                W0 = mVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    try {
                        if (S0 == null) {
                            S0 = Class.forName("android.os.SystemProperties");
                        }
                        if (U0 == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class cls = S0;
                            U0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = U0;
                        if (method != null) {
                            method.invoke(null, mVar);
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.a;
                    }
                } finally {
                    StrictMode.setVmPolicy(vmPolicy);
                }
            }
            jn1 jn1Var = V0;
            synchronized (jn1Var) {
                jn1Var.a(this);
                Unit unit2 = Unit.a;
            }
        }
        this.v.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.v.getClass();
        this.v.getClass();
        p(getRoot());
        l(getRoot());
        getSnapshotObserver().a.d();
        if (e() && (t6Var = this.P) != null) {
            lm.a.a(t6Var);
        }
        id1 g = ij2.g(this);
        zd2 b = uj2.b(this);
        h7 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (g != null && b != null && (g != (id1Var = viewTreeOwners.a) || b != id1Var))) {
            if (g == null) {
                lh.g("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (b == null) {
                lh.g("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            g.getLifecycle().a(this);
            h7 h7Var = new h7(g, b);
            set_viewTreeOwners(h7Var);
            Function1 function1 = this.n0;
            if (function1 != null) {
                function1.invoke(h7Var);
            }
            this.n0 = null;
        }
        this.A0.a.setValue(new v21(isInTouchMode() ? 1 : 2));
        h7 viewTreeOwners2 = getViewTreeOwners();
        ad1 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw q40.f("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.F);
        getViewTreeObserver().addOnGlobalLayoutListener(this.o0);
        getViewTreeObserver().addOnScrollChangedListener(this.p0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.q0);
        if (Build.VERSION.SDK_INT >= 31) {
            g8.a.b(this);
        }
        v6 v6Var = this.Q;
        if (v6Var != null) {
            ((po0) getFocusOwner()).g.a(v6Var);
            getSemanticsOwner().d.a(v6Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        hj2 hj2Var = (hj2) this.t0.get();
        ua uaVar = (ua) (hj2Var != null ? hj2Var.b : null);
        if (uaVar == null) {
            return this.r0.d;
        }
        hj2 hj2Var2 = (hj2) uaVar.p.get();
        u21 u21Var = (u21) (hj2Var2 != null ? hj2Var2.b : null);
        return u21Var != null && (u21Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(zm3.b(getContext()));
        this.v.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.x0) {
            this.x0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(ap.u(getContext()));
        }
        this.O.invoke(configuration);
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
        int i;
        int i2;
        int i3;
        hj2 hj2Var = (hj2) this.t0.get();
        ua uaVar = (ua) (hj2Var != null ? hj2Var.b : null);
        if (uaVar == null) {
            uv2 uv2Var = this.r0;
            if (uv2Var.d) {
                c11 c11Var = uv2Var.h;
                nv2 nv2Var = uv2Var.g;
                int i4 = c11Var.e;
                boolean z = c11Var.a;
                int i5 = 2;
                if (i4 != 1) {
                    if (i4 == 0) {
                        i = 1;
                    } else if (i4 == 2) {
                        i = 2;
                    } else if (i4 == 6) {
                        i = 5;
                    } else if (i4 == 5) {
                        i = 7;
                    } else if (i4 == 3) {
                        i = 3;
                    } else if (i4 == 4) {
                        i = 4;
                    } else {
                        if (i4 != 7) {
                            lh.g("invalid ImeAction");
                            return null;
                        }
                        i = 6;
                    }
                    editorInfo.imeOptions = i;
                    i2 = c11Var.d;
                    if (i2 == 1) {
                    }
                    if (!z) {
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                    }
                    long j = nv2Var.b;
                    int i6 = jw2.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    tf0.c(editorInfo, nv2Var.a.n);
                    editorInfo.imeOptions |= 33554432;
                    if (ag0.d()) {
                    }
                    t72 t72Var = new t72(uv2Var.g, new ot2(i5, uv2Var), uv2Var.h.c);
                    uv2Var.i.add(new WeakReference(t72Var));
                    return t72Var;
                }
                if (!z) {
                    i = 0;
                    editorInfo.imeOptions = i;
                    i2 = c11Var.d;
                    if (i2 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i2 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i;
                    } else if (i2 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i2 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i2 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i2 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i2 == 7) {
                        editorInfo.inputType = 129;
                    } else if (i2 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i2 != 9) {
                            lh.g("Invalid Keyboard Type");
                            return null;
                        }
                        editorInfo.inputType = 8194;
                    }
                    if (!z) {
                        int i7 = editorInfo.inputType;
                        if ((i7 & 1) == 1) {
                            editorInfo.inputType = i7 | 131072;
                            if (i4 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i8 = c11Var.b;
                        if (i8 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i8 == 2) {
                            editorInfo.inputType = i3 | Utility.DEFAULT_STREAM_BUFFER_SIZE;
                        } else if (i8 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (c11Var.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j2 = nv2Var.b;
                    int i62 = jw2.c;
                    editorInfo.initialSelStart = (int) (j2 >> 32);
                    editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                    tf0.c(editorInfo, nv2Var.a.n);
                    editorInfo.imeOptions |= 33554432;
                    if (ag0.d()) {
                        ag0.a().i(editorInfo);
                    }
                    t72 t72Var2 = new t72(uv2Var.g, new ot2(i5, uv2Var), uv2Var.h.c);
                    uv2Var.i.add(new WeakReference(t72Var2));
                    return t72Var2;
                }
                i = 6;
                editorInfo.imeOptions = i;
                i2 = c11Var.d;
                if (i2 == 1) {
                }
                if (!z) {
                }
                i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                }
                long j22 = nv2Var.b;
                int i622 = jw2.c;
                editorInfo.initialSelStart = (int) (j22 >> 32);
                editorInfo.initialSelEnd = (int) (j22 & 4294967295L);
                tf0.c(editorInfo, nv2Var.a.n);
                editorInfo.imeOptions |= 33554432;
                if (ag0.d()) {
                }
                t72 t72Var22 = new t72(uv2Var.g, new ot2(i5, uv2Var), uv2Var.h.c);
                uv2Var.i.add(new WeakReference(t72Var22));
                return t72Var22;
            }
        } else {
            hj2 hj2Var2 = (hj2) uaVar.p.get();
            u21 u21Var = (u21) (hj2Var2 != null ? hj2Var2.b : null);
            if (u21Var != null) {
                synchronized (u21Var.c) {
                    if (u21Var.e) {
                        return null;
                    }
                    u72 a = u21Var.a.a(editorInfo);
                    j6 j6Var = new j6(20, u21Var);
                    int i9 = Build.VERSION.SDK_INT;
                    InputConnection lt1Var = i9 >= 34 ? new lt1(a, j6Var) : i9 >= 25 ? new kt1(a, j6Var) : new jt1(a, j6Var);
                    u21Var.d.b(new k63(lt1Var));
                    return lt1Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        v8 v8Var = this.F;
        v8Var.getClass();
        t8.f(v8Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t6 t6Var;
        super.onDetachedFromWindow();
        this.y.onViewDetachedFromWindow(this);
        if (this.r) {
            View view = this.q;
            if (view == null) {
                Intrinsics.f("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            jn1 jn1Var = V0;
            synchronized (jn1Var) {
                jn1Var.i(this);
                Unit unit = Unit.a;
            }
        }
        hn2 hn2Var = getSnapshotObserver().a;
        k4 k4Var = hn2Var.h;
        if (k4Var != null) {
            k4Var.d();
        }
        hn2Var.a();
        this.v.getClass();
        h7 viewTreeOwners = getViewTreeOwners();
        ad1 lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw q40.f("No lifecycle owner exists");
        }
        lifecycle.c(this.F);
        lifecycle.c(this);
        if (e() && (t6Var = this.P) != null) {
            lm.a.b(t6Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.o0);
        getViewTreeObserver().removeOnScrollChangedListener(this.p0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.q0);
        if (i >= 31) {
            g8.a.a(this);
        }
        v6 v6Var = this.Q;
        if (v6Var != null) {
            getSemanticsOwner().d.i(v6Var);
            ((po0) getFocusOwner()).g.i(v6Var);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        zm3.p(((po0) getFocusOwner()).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i0 = 0L;
        this.c0.j(this.M0);
        this.a0 = null;
        K();
        if (this.W != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        lj1 lj1Var = this.c0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                p(getRoot());
            }
            long h = h(i);
            q13.a aVar = q13.m;
            long h2 = h(i2);
            long v = zm3.v((int) (h >>> 32), (int) (h & 4294967295L), (int) (h2 >>> 32), (int) (4294967295L & h2));
            u10 u10Var = this.a0;
            if (u10Var == null) {
                this.a0 = new u10(v);
                this.b0 = false;
            } else if (!u10.b(u10Var.a, v)) {
                this.b0 = true;
            }
            lj1Var.q(v);
            lj1Var.l();
            setMeasuredDimension(getRoot().Q.p.m, getRoot().Q.p.n);
            if (this.W != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().Q.p.m, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().Q.p.n, 1073741824));
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!e() || viewStructure == null) {
            return;
        }
        v6 v6Var = this.Q;
        if (v6Var != null) {
            i91 i91Var = v6Var.b.a;
            AutofillId autofillId = v6Var.f;
            String str = v6Var.e;
            x72 x72Var = v6Var.d;
            tk3.X(viewStructure, i91Var, autofillId, str, x72Var);
            Object[] objArr = ot1.a;
            jn1 jn1Var = new jn1(2);
            jn1Var.a(i91Var);
            jn1Var.a(viewStructure);
            while (jn1Var.h()) {
                Object j = jn1Var.j(jn1Var.b - 1);
                j.getClass();
                ViewStructure viewStructure2 = (ViewStructure) j;
                Object j2 = jn1Var.j(jn1Var.b - 1);
                j2.getClass();
                bo1 bo1Var = (bo1) ((i91) j2).n();
                int i2 = bo1Var.m.o;
                for (int i3 = 0; i3 < i2; i3++) {
                    i91 i91Var2 = (i91) bo1Var.get(i3);
                    if (!i91Var2.Y && i91Var2.I() && i91Var2.J()) {
                        sh2 w = i91Var2.w();
                        if (w != null) {
                            tn1 tn1Var = w.m;
                            if (tn1Var.b(rh2.g) || tn1Var.b(gi2.q) || tn1Var.b(gi2.r)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                tk3.X(newChild, i91Var2, v6Var.f, str, x72Var);
                                jn1Var.a(i91Var2);
                                jn1Var.a(newChild);
                            }
                        }
                        jn1Var.a(i91Var2);
                        jn1Var.a(viewStructure2);
                    }
                }
            }
        }
        t6 t6Var = this.P;
        if (t6Var != null) {
            om omVar = t6Var.b;
            LinkedHashMap linkedHashMap = omVar.a;
            LinkedHashMap linkedHashMap2 = omVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    b71.o();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                im.c(newChild2, t6Var.d, intValue);
                newChild2.setId(intValue, t6Var.a.getContext().getPackageName(), null, null);
                im.d(newChild2, 1);
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
        if (this.n) {
            u81 u81Var = i != 0 ? i != 1 ? null : u81.n : u81.m;
            if (u81Var == null) {
                u81Var = u81.m;
            }
            setLayoutDirection(u81Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        j20 j20Var;
        if (Build.VERSION.SDK_INT < 31 || (j20Var = this.P0) == null) {
            return;
        }
        j20Var.g(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        v8 v8Var = this.F;
        v8Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            t8.a(v8Var, longSparseArray);
        } else {
            v8Var.m.post(new q1(1, v8Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean v;
        this.v.a.setValue(Boolean.valueOf(z));
        this.O0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (v = bd3.v())) {
            return;
        }
        setShowLayoutBounds(v);
        l(getRoot());
    }

    public final void p(i91 i91Var) {
        this.c0.p(i91Var, false);
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            p((i91) objArr[i2]);
        }
    }

    public final boolean r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((po0) getFocusOwner()).c.I0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        int i2 = 0;
        if (ordinal != 3) {
            a.b();
            return false;
        }
        fo0 Y = ll3.Y(i);
        int i3 = Y != null ? Y.a : 7;
        return Intrinsics.b(((po0) getFocusOwner()).e(i3, rect != null ? bd3.K(rect) : null, new p7(i3, i2)), Boolean.TRUE);
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.D0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.E.h = j;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.O = function1;
    }

    public final void setContentCaptureManager$ui_release(v8 v8Var) {
        this.F = v8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ul1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.t = coroutineContext;
        ul1 ul1Var = getRoot().P.f;
        if (ul1Var instanceof vr2) {
            ((vr2) ul1Var).I0();
        }
        if (!ul1Var.m.z) {
            h21.b("visitSubtreeIf called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var2 = ul1Var.m;
        ul1 ul1Var3 = ul1Var2.r;
        if (ul1Var3 == null) {
            s03.b(eo1Var, ul1Var2);
        } else {
            eo1Var.b(ul1Var3);
        }
        while (true) {
            int i = eo1Var.o;
            if (i == 0) {
                return;
            }
            ul1 ul1Var4 = (ul1) eo1Var.l(i - 1);
            if ((ul1Var4.p & 16) != 0) {
                for (ul1 ul1Var5 = ul1Var4; ul1Var5 != null; ul1Var5 = ul1Var5.r) {
                    if ((ul1Var5.o & 16) != 0) {
                        p90 p90Var = ul1Var5;
                        ?? r4 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof w22) {
                                w22 w22Var = (w22) p90Var;
                                if (w22Var instanceof vr2) {
                                    ((vr2) w22Var).I0();
                                }
                            } else if ((p90Var.o & 16) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var6 = p90Var.B;
                                int i2 = 0;
                                p90Var = p90Var;
                                r4 = r4;
                                while (ul1Var6 != null) {
                                    if ((ul1Var6.o & 16) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            p90Var = ul1Var6;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r4.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r4.b(ul1Var6);
                                        }
                                    }
                                    ul1Var6 = ul1Var6.r;
                                    p90Var = p90Var;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            p90Var = s03.c(r4);
                        }
                    }
                }
            }
            s03.b(eo1Var, ul1Var4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.i0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super h7, Unit> function1) {
        h7 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.n0 = function1;
    }

    public void setShowLayoutBounds(boolean z) {
        this.V = z;
    }

    public void setUncaughtExceptionHandler(nb2 nb2Var) {
        this.c0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(float[] fArr) {
        C();
        ti1.e(fArr, this.g0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.k0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.k0 & 4294967295L));
        float[] fArr2 = this.f0;
        ti1.d(fArr2);
        ti1.f(fArr2, intBitsToFloat, intBitsToFloat2);
        j8.Q(fArr, fArr2);
    }

    public final long u(long j) {
        C();
        long b = ti1.b(j, this.g0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.k0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.k0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void v(boolean z) {
        q7 q7Var;
        lj1 lj1Var = this.c0;
        if (lj1Var.b.x() || ((eo1) lj1Var.e.n).o != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    q7Var = this.M0;
                } finally {
                    Trace.endSection();
                }
            } else {
                q7Var = null;
            }
            if (lj1Var.j(q7Var)) {
                requestLayout();
            }
            lj1Var.a(false);
            Unit unit = Unit.a;
        }
    }

    public final void w(i91 i91Var, long j) {
        lj1 lj1Var = this.c0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            lj1Var.k(i91Var, j);
            if (!lj1Var.b.x()) {
                lj1Var.a(false);
            }
            getRectManager().b();
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ac, code lost:
    
        r4.k(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        jn1 jn1Var;
        v6 v6Var;
        Object[] objArr;
        if (this.R) {
            hn2 hn2Var = getSnapshotObserver().a;
            synchronized (hn2Var.g) {
                try {
                    eo1 eo1Var = hn2Var.f;
                    int i = eo1Var.o;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = eo1Var.m;
                        if (i2 >= i) {
                            break;
                        }
                        gn2 gn2Var = (gn2) objArr[i2];
                        gn2Var.e();
                        if (!gn2Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = eo1Var.m;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    eo1Var.o = i4;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.R = false;
        }
        ec ecVar = this.W;
        if (ecVar != null) {
            g(ecVar);
        }
        if (e() && (v6Var = this.Q) != null) {
            an1 an1Var = v6Var.g;
            if (an1Var.d == 0 && v6Var.h) {
                v6Var.a.a();
                v6Var.h = false;
            }
            if (an1Var.d != 0) {
                v6Var.h = true;
            }
        }
        loop1: while (this.G0.h() && this.G0.e(0) != null) {
            int i5 = this.G0.b;
            int i6 = 0;
            while (true) {
                jn1 jn1Var2 = this.G0;
                if (i6 < i5) {
                    Function0 function0 = (Function0) jn1Var2.e(i6);
                    jn1Var = this.G0;
                    if (i6 < 0 || i6 >= jn1Var.b) {
                        break loop1;
                    }
                    Object[] objArr3 = jn1Var.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            jn1Var.m(i6);
            throw null;
        }
    }

    public final void y(i91 i91Var) {
        b8 b8Var = this.E;
        b8Var.A = true;
        if (b8Var.q()) {
            b8Var.r(i91Var);
        }
        v8 v8Var = this.F;
        v8Var.s = true;
        if (v8Var.g()) {
            v8Var.t.d(Unit.a);
        }
    }

    public final void z(i91 i91Var, boolean z, boolean z2, boolean z3) {
        i91 u;
        i91 u2;
        lj1 lj1Var = this.c0;
        if (!z) {
            if (lj1Var.p(i91Var, z2) && z3) {
                F(i91Var);
                return;
            }
            return;
        }
        mh mhVar = lj1Var.b;
        i91 i91Var2 = i91Var.s;
        m91 m91Var = i91Var.Q;
        if (i91Var2 == null) {
            h21.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = m91Var.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    a.b();
                    return;
                }
                if (!m91Var.e || z2) {
                    m91Var.e = true;
                    m91Var.p.F = true;
                    if (i91Var.Y) {
                        return;
                    }
                    if ((Intrinsics.b(i91Var.K(), Boolean.TRUE) || lj1.h(i91Var)) && ((u = i91Var.u()) == null || !u.Q.e)) {
                        mhVar.h(i91Var, w41.m);
                    } else if ((i91Var.J() || lj1.i(i91Var)) && ((u2 = i91Var.u()) == null || !u2.q())) {
                        mhVar.h(i91Var, w41.o);
                    }
                    if (lj1Var.d || !z3) {
                        return;
                    }
                    F(i91Var);
                    return;
                }
                return;
            }
        }
        lj1Var.h.b(new kj1(i91Var, true, z2));
    }

    public r6 getAccessibilityManager() {
        return this.G;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public c7 m17getClipboard() {
        return this.T;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public d7 m18getClipboardManager() {
        return this.S;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public n9 m19getDragAndDropManager() {
        return this.u;
    }

    public zm1 getLayoutNodes() {
        return this.A;
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
        Unit unit = Unit.a;
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

    @fa0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @fa0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(nb2 nb2Var) {
    }
}
