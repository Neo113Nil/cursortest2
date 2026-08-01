package androidx.recyclerview.widget;

import a4.b;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.q;
import b4.d;
import b4.l;
import com.google.android.material.datepicker.c;
import g1.a;
import g1.a0;
import g1.a1;
import g1.a2;
import g1.b1;
import g1.c1;
import g1.d1;
import g1.e1;
import g1.f1;
import g1.g1;
import g1.h;
import g1.h0;
import g1.h1;
import g1.i1;
import g1.j1;
import g1.l0;
import g1.l1;
import g1.m0;
import g1.m1;
import g1.n0;
import g1.n1;
import g1.o;
import g1.o0;
import g1.o1;
import g1.p0;
import g1.p1;
import g1.q0;
import g1.q1;
import g1.s1;
import g1.t0;
import g1.u0;
import g1.v0;
import g1.w0;
import g1.x;
import g1.x0;
import g1.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.g;
import n0.j0;
import n0.m;
import q.j;
import t.e;
import x2.i;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean G0 = false;
    public static boolean H0 = false;
    public static final int[] I0 = {R.attr.nestedScrollingEnabled};
    public static final float J0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean K0 = true;
    public static final boolean L0 = true;
    public static final Class[] M0;
    public static final o0 N0;
    public static final n1 O0;
    public int A;
    public boolean A0;
    public boolean B;
    public int B0;
    public boolean C;
    public int C0;
    public boolean D;
    public final boolean D0;
    public int E;
    public final p0 E0;
    public boolean F;
    public final g F0;
    public final AccessibilityManager G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public u0 L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public w0 Q;
    public int R;
    public int S;
    public VelocityTracker T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f761a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f762b0;

    /* renamed from: c0, reason: collision with root package name */
    public c1 f763c0;
    public final int d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f764e0;

    /* renamed from: f, reason: collision with root package name */
    public final float f765f;

    /* renamed from: f0, reason: collision with root package name */
    public final float f766f0;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f767g;

    /* renamed from: g0, reason: collision with root package name */
    public final float f768g0;
    public final g1 h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f769h0;
    public j1 i;
    public final p1 i0;

    /* renamed from: j, reason: collision with root package name */
    public final c f770j;

    /* renamed from: j0, reason: collision with root package name */
    public a0 f771j0;

    /* renamed from: k, reason: collision with root package name */
    public final h f772k;

    /* renamed from: k0, reason: collision with root package name */
    public final y f773k0;

    /* renamed from: l, reason: collision with root package name */
    public final q f774l;

    /* renamed from: l0, reason: collision with root package name */
    public final m1 f775l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f776m;

    /* renamed from: m0, reason: collision with root package name */
    public d1 f777m0;

    /* renamed from: n, reason: collision with root package name */
    public final n0 f778n;

    /* renamed from: n0, reason: collision with root package name */
    public ArrayList f779n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f780o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f781o0;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f782p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f783p0;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f784q;

    /* renamed from: q0, reason: collision with root package name */
    public final p0 f785q0;

    /* renamed from: r, reason: collision with root package name */
    public q0 f786r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f787r0;

    /* renamed from: s, reason: collision with root package name */
    public a1 f788s;

    /* renamed from: s0, reason: collision with root package name */
    public s1 f789s0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f790t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f791t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f792u;

    /* renamed from: u0, reason: collision with root package name */
    public m f793u0;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f794v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f795v0;

    /* renamed from: w, reason: collision with root package name */
    public x f796w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f797w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f798x;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f799x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f800y;

    /* renamed from: y0, reason: collision with root package name */
    public final ArrayList f801y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f802z;

    /* renamed from: z0, reason: collision with root package name */
    public final n0 f803z0;

    static {
        Class cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        N0 = new o0(0);
        O0 = new n1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.gdmhkmf.belbet.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G = G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static q1 M(View view) {
        if (view == null) {
            return null;
        }
        return ((b1) view.getLayoutParams()).f1617a;
    }

    private m getScrollingChildHelper() {
        if (this.f793u0 == null) {
            this.f793u0 = new m(this);
        }
        return this.f793u0;
    }

    public static void l(q1 q1Var) {
        WeakReference weakReference = q1Var.f1769b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == q1Var.f1768a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            q1Var.f1769b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i4) {
        if (i > 0 && edgeEffect != null && d.x(edgeEffect) != 0.0f) {
            int round = Math.round(d.L(edgeEffect, ((-i) * 4.0f) / i4, 0.5f) * ((-i4) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || d.x(edgeEffect2) == 0.0f) {
            return i;
        }
        float f5 = i4;
        int round2 = Math.round(d.L(edgeEffect2, (i * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        G0 = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        H0 = z4;
    }

    public final void A() {
        if (this.N != null) {
            return;
        }
        ((n1) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f776m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f786r + ", layout:" + this.f788s + ", context:" + getContext();
    }

    public final void C(m1 m1Var) {
        if (getScrollState() != 2) {
            m1Var.getClass();
            return;
        }
        OverScroller overScroller = this.i0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        m1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f794v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x xVar = (x) arrayList.get(i);
            int i4 = xVar.f1838v;
            if (i4 == 1) {
                boolean d = xVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c5 = xVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c5)) {
                    if (c5) {
                        xVar.f1839w = 1;
                        xVar.f1832p = (int) motionEvent.getX();
                    } else if (d) {
                        xVar.f1839w = 2;
                        xVar.f1829m = (int) motionEvent.getY();
                    }
                    xVar.f(2);
                    if (action == 3) {
                        this.f796w = xVar;
                        return true;
                    }
                }
            } else {
                if (i4 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e4 = this.f772k.e();
        if (e4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < e4; i5++) {
            q1 M = M(this.f772k.d(i5));
            if (!M.o()) {
                int b2 = M.b();
                if (b2 < i) {
                    i = b2;
                }
                if (b2 > i4) {
                    i4 = b2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
    }

    public final q1 H(int i) {
        q1 q1Var = null;
        if (this.H) {
            return null;
        }
        int h = this.f772k.h();
        for (int i4 = 0; i4 < h; i4++) {
            q1 M = M(this.f772k.g(i4));
            if (M != null && !M.h() && J(M) == i) {
                if (!this.f772k.f1673c.contains(M.f1768a)) {
                    return M;
                }
                q1Var = M;
            }
        }
        return q1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0210, code lost:
    
        if (r1 < r14) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        p1 p1Var;
        float f5;
        float f6;
        boolean z4;
        boolean z5;
        boolean z6;
        int minFlingVelocity;
        boolean z7;
        int G;
        PointF a5;
        int i9;
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.C) {
            boolean d = a1Var.d();
            boolean e4 = this.f788s.e();
            int i10 = (!d || Math.abs(i) < i5) ? 0 : i;
            int i11 = (!e4 || Math.abs(i4) < i5) ? 0 : i4;
            if (i10 != 0 || i11 != 0) {
                if (i10 != 0) {
                    EdgeEffect edgeEffect = this.M;
                    if (edgeEffect == null || d.x(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.O;
                        if (edgeEffect2 != null && d.x(edgeEffect2) != 0.0f) {
                            if (h0(this.O, i10, getWidth())) {
                                this.O.onAbsorb(i10);
                                i10 = 0;
                            }
                            i7 = i10;
                            i10 = 0;
                        }
                    } else {
                        int i12 = -i10;
                        if (h0(this.M, i12, getWidth())) {
                            this.M.onAbsorb(i12);
                            i10 = 0;
                        }
                        i7 = i10;
                        i10 = 0;
                    }
                    if (i11 != 0) {
                        EdgeEffect edgeEffect3 = this.N;
                        if (edgeEffect3 == null || d.x(edgeEffect3) == 0.0f) {
                            EdgeEffect edgeEffect4 = this.P;
                            if (edgeEffect4 != null && d.x(edgeEffect4) != 0.0f) {
                                if (h0(this.P, i11, getHeight())) {
                                    this.P.onAbsorb(i11);
                                    i11 = 0;
                                }
                                i8 = 0;
                            }
                        } else {
                            int i13 = -i11;
                            if (h0(this.N, i13, getHeight())) {
                                this.N.onAbsorb(i13);
                                i11 = 0;
                            }
                            i8 = 0;
                        }
                        p1Var = this.i0;
                        if (i7 == 0 || i11 != 0) {
                            int i14 = -i6;
                            i7 = Math.max(i14, Math.min(i7, i6));
                            i11 = Math.max(i14, Math.min(i11, i6));
                            l0(1);
                            p1Var.a(i7, i11);
                        }
                        if (i10 == 0 || i8 != 0) {
                            f5 = i10;
                            f6 = i8;
                            if (!dispatchNestedPreFling(f5, f6)) {
                                boolean z8 = d || e4;
                                dispatchNestedFling(f5, f6, z8);
                                c1 c1Var = this.f763c0;
                                if (c1Var != null) {
                                    m0 m0Var = (m0) c1Var;
                                    a1 layoutManager = m0Var.f1717a.getLayoutManager();
                                    if (layoutManager != 0 && m0Var.f1717a.getAdapter() != null && ((Math.abs(i8) > (minFlingVelocity = m0Var.f1717a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z7 = layoutManager instanceof l1)))) {
                                        View view = null;
                                        l0 l0Var = !z7 ? null : new l0(m0Var, m0Var.f1717a.getContext());
                                        if (l0Var != null) {
                                            int B = layoutManager.B();
                                            if (B != 0) {
                                                androidx.emoji2.text.g e5 = layoutManager.e() ? m0Var.e(layoutManager) : layoutManager.d() ? m0Var.d(layoutManager) : null;
                                                if (e5 != null) {
                                                    z5 = false;
                                                    int v4 = layoutManager.v();
                                                    z6 = true;
                                                    int i15 = 0;
                                                    int i16 = Integer.MIN_VALUE;
                                                    int i17 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i15 < v4) {
                                                        boolean z9 = z8;
                                                        View u4 = layoutManager.u(i15);
                                                        if (u4 == null) {
                                                            i9 = v4;
                                                        } else {
                                                            i9 = v4;
                                                            int b2 = m0.b(u4, e5);
                                                            if (b2 <= 0 && b2 > i16) {
                                                                view2 = u4;
                                                                i16 = b2;
                                                            }
                                                            if (b2 >= 0 && b2 < i17) {
                                                                view = u4;
                                                                i17 = b2;
                                                            }
                                                        }
                                                        i15++;
                                                        z8 = z9;
                                                        v4 = i9;
                                                    }
                                                    z4 = z8;
                                                    Object[] objArr = !layoutManager.d() ? i8 <= 0 : i10 <= 0;
                                                    if (objArr == true && view != null) {
                                                        G = a1.G(view);
                                                    } else if (objArr == true || view2 == null) {
                                                        if (objArr != false) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            G = ((z7 && (a5 = ((l1) layoutManager).a(layoutManager.B() + (-1))) != null && ((a5.x > 0.0f ? 1 : (a5.x == 0.0f ? 0 : -1)) < 0 || (a5.y > 0.0f ? 1 : (a5.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + a1.G(view);
                                                            if (G >= 0) {
                                                            }
                                                        }
                                                        G = -1;
                                                    } else {
                                                        G = a1.G(view2);
                                                    }
                                                    if (G != -1) {
                                                        l0Var.f1675a = G;
                                                        layoutManager.B0(l0Var);
                                                        return z6;
                                                    }
                                                    if (!z4) {
                                                        return z5;
                                                    }
                                                    boolean z10 = z6;
                                                    l0(z10 ? 1 : 0);
                                                    int i18 = -i6;
                                                    p1Var.a(Math.max(i18, Math.min(i10, i6)), Math.max(i18, Math.min(i8, i6)));
                                                    return z10;
                                                }
                                            }
                                            z4 = z8;
                                            z5 = false;
                                            z6 = true;
                                            G = -1;
                                            if (G != -1) {
                                            }
                                            if (!z4) {
                                            }
                                        }
                                    }
                                }
                                z4 = z8;
                                z5 = false;
                                z6 = true;
                                if (!z4) {
                                }
                            }
                        } else if (i7 != 0 || i11 != 0) {
                            return true;
                        }
                    }
                    i8 = i11;
                    i11 = 0;
                    p1Var = this.i0;
                    if (i7 == 0) {
                    }
                    int i142 = -i6;
                    i7 = Math.max(i142, Math.min(i7, i6));
                    i11 = Math.max(i142, Math.min(i11, i6));
                    l0(1);
                    p1Var.a(i7, i11);
                    if (i10 == 0) {
                    }
                    f5 = i10;
                    f6 = i8;
                    if (!dispatchNestedPreFling(f5, f6)) {
                    }
                }
                i7 = 0;
                if (i11 != 0) {
                }
                i8 = i11;
                i11 = 0;
                p1Var = this.i0;
                if (i7 == 0) {
                }
                int i1422 = -i6;
                i7 = Math.max(i1422, Math.min(i7, i6));
                i11 = Math.max(i1422, Math.min(i11, i6));
                l0(1);
                p1Var.a(i7, i11);
                if (i10 == 0) {
                }
                f5 = i10;
                f6 = i8;
                if (!dispatchNestedPreFling(f5, f6)) {
                }
            }
        }
        return false;
    }

    public final int J(q1 q1Var) {
        if ((q1Var.f1774j & 524) == 0 && q1Var.e()) {
            int i = q1Var.f1770c;
            ArrayList arrayList = (ArrayList) this.f770j.f1042c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) arrayList.get(i4);
                int i5 = aVar.f1590a;
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = aVar.f1591b;
                        if (i6 <= i) {
                            int i7 = aVar.d;
                            if (i6 + i7 <= i) {
                                i -= i7;
                            }
                        } else {
                            continue;
                        }
                    } else if (i5 == 8) {
                        int i8 = aVar.f1591b;
                        if (i8 == i) {
                            i = aVar.d;
                        } else {
                            if (i8 < i) {
                                i--;
                            }
                            if (aVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (aVar.f1591b <= i) {
                    i += aVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long K(q1 q1Var) {
        return this.f786r.f1765b ? q1Var.f1771e : q1Var.f1770c;
    }

    public final q1 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        b1 b1Var = (b1) view.getLayoutParams();
        boolean z4 = b1Var.f1619c;
        Rect rect = b1Var.f1618b;
        if (!z4 || (this.f775l0.f1725g && (b1Var.f1617a.k() || b1Var.f1617a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f792u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f780o;
            rect2.set(0, 0, 0, 0);
            ((x0) arrayList.get(i)).getClass();
            ((b1) view.getLayoutParams()).f1617a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        b1Var.f1619c = false;
        return rect;
    }

    public final boolean O() {
        return !this.f802z || this.H || this.f770j.l();
    }

    public final boolean P() {
        return this.J > 0;
    }

    public final void Q(int i) {
        if (this.f788s == null) {
            return;
        }
        setScrollState(2);
        this.f788s.q0(i);
        awakenScrollBars();
    }

    public final void R() {
        int h = this.f772k.h();
        for (int i = 0; i < h; i++) {
            ((b1) this.f772k.g(i).getLayoutParams()).f1619c = true;
        }
        ArrayList arrayList = this.h.f1667c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b1 b1Var = (b1) ((q1) arrayList.get(i4)).f1768a.getLayoutParams();
            if (b1Var != null) {
                b1Var.f1619c = true;
            }
        }
    }

    public final void S(int i, int i4, boolean z4) {
        int i5 = i + i4;
        int h = this.f772k.h();
        for (int i6 = 0; i6 < h; i6++) {
            q1 M = M(this.f772k.g(i6));
            if (M != null && !M.o()) {
                int i7 = M.f1770c;
                m1 m1Var = this.f775l0;
                if (i7 >= i5) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i6 + " holder " + M + " now at position " + (M.f1770c - i4));
                    }
                    M.l(-i4, z4);
                    m1Var.f1724f = true;
                } else if (i7 >= i) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i6 + " holder " + M + " now REMOVED");
                    }
                    M.a(8);
                    M.l(-i4, z4);
                    M.f1770c = i - 1;
                    m1Var.f1724f = true;
                }
            }
        }
        g1 g1Var = this.h;
        ArrayList arrayList = g1Var.f1667c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) arrayList.get(size);
            if (q1Var != null) {
                int i8 = q1Var.f1770c;
                if (i8 >= i5) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + q1Var + " now at position " + (q1Var.f1770c - i4));
                    }
                    q1Var.l(-i4, z4);
                } else if (i8 >= i) {
                    q1Var.a(8);
                    g1Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.J++;
    }

    public final void U(boolean z4) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.J - 1;
        this.J = i4;
        if (i4 < 1) {
            if (G0 && i4 < 0) {
                throw new IllegalStateException(b.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.J = 0;
            if (z4) {
                int i5 = this.E;
                this.E = 0;
                if (i5 != 0 && (accessibilityManager = this.G) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f801y0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q1 q1Var = (q1) arrayList.get(size);
                    if (q1Var.f1768a.getParent() == this && !q1Var.o() && (i = q1Var.f1781q) != -1) {
                        q1Var.f1768a.setImportantForAccessibility(i);
                        q1Var.f1781q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i);
            int x4 = (int) (motionEvent.getX(i) + 0.5f);
            this.W = x4;
            this.U = x4;
            int y4 = (int) (motionEvent.getY(i) + 0.5f);
            this.f761a0 = y4;
            this.V = y4;
        }
    }

    public final void W() {
        if (this.f787r0 || !this.f798x) {
            return;
        }
        WeakHashMap weakHashMap = n0.p0.f2816a;
        postOnAnimation(this.f803z0);
        this.f787r0 = true;
    }

    public final void X() {
        boolean z4;
        boolean z5 = false;
        if (this.H) {
            c cVar = this.f770j;
            cVar.s((ArrayList) cVar.f1042c);
            cVar.s((ArrayList) cVar.d);
            cVar.f1040a = 0;
            if (this.I) {
                this.f788s.Z();
            }
        }
        if (this.Q == null || !this.f788s.C0()) {
            this.f770j.d();
        } else {
            this.f770j.r();
        }
        boolean z6 = this.f781o0 || this.f783p0;
        boolean z7 = this.f802z && this.Q != null && ((z4 = this.H) || z6 || this.f788s.f1601f) && (!z4 || this.f786r.f1765b);
        m1 m1Var = this.f775l0;
        m1Var.f1726j = z7;
        if (z7 && z6 && !this.H && this.Q != null && this.f788s.C0()) {
            z5 = true;
        }
        m1Var.f1727k = z5;
    }

    public final void Y(boolean z4) {
        this.I = z4 | this.I;
        this.H = true;
        int h = this.f772k.h();
        for (int i = 0; i < h; i++) {
            q1 M = M(this.f772k.g(i));
            if (M != null && !M.o()) {
                M.a(6);
            }
        }
        R();
        g1 g1Var = this.h;
        ArrayList arrayList = g1Var.f1667c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q1 q1Var = (q1) arrayList.get(i4);
            if (q1Var != null) {
                q1Var.a(6);
                q1Var.a(1024);
            }
        }
        q0 q0Var = g1Var.h.f786r;
        if (q0Var == null || !q0Var.f1765b) {
            g1Var.g();
        }
    }

    public final void Z(q1 q1Var, v0 v0Var) {
        q1Var.f1774j &= -8193;
        boolean z4 = this.f775l0.h;
        q qVar = this.f774l;
        if (z4 && q1Var.k() && !q1Var.h() && !q1Var.o()) {
            ((q.h) qVar.h).d(K(q1Var), q1Var);
        }
        j jVar = (j) qVar.f466g;
        a2 a2Var = (a2) jVar.get(q1Var);
        if (a2Var == null) {
            a2Var = a2.a();
            jVar.put(q1Var, a2Var);
        }
        a2Var.f1610b = v0Var;
        a2Var.f1609a |= 4;
    }

    public final void a0() {
        boolean z4;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.M.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.P.isFinished();
        }
        if (z4) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            a1Var.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    public final int b0(int i, float f5) {
        float height = f5 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.M;
        float f6 = 0.0f;
        if (edgeEffect == null || d.x(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.O;
            if (edgeEffect2 != null && d.x(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.O.onRelease();
                } else {
                    float L = d.L(this.O, width, height);
                    if (d.x(this.O) == 0.0f) {
                        this.O.onRelease();
                    }
                    f6 = L;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.M.onRelease();
            } else {
                float f7 = -d.L(this.M, -width, 1.0f - height);
                if (d.x(this.M) == 0.0f) {
                    this.M.onRelease();
                }
                f6 = f7;
            }
            invalidate();
        }
        return Math.round(f6 * getWidth());
    }

    public final int c0(int i, float f5) {
        float width = f5 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.N;
        float f6 = 0.0f;
        if (edgeEffect == null || d.x(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.P;
            if (edgeEffect2 != null && d.x(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.P.onRelease();
                } else {
                    float L = d.L(this.P, height, 1.0f - width);
                    if (d.x(this.P) == 0.0f) {
                        this.P.onRelease();
                    }
                    f6 = L;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.N.onRelease();
            } else {
                float f7 = -d.L(this.N, -height, width);
                if (d.x(this.N) == 0.0f) {
                    this.N.onRelease();
                }
                f6 = f7;
            }
            invalidate();
        }
        return Math.round(f6 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b1) && this.f788s.f((b1) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.d()) {
            return this.f788s.j(this.f775l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.d()) {
            return this.f788s.k(this.f775l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.d()) {
            return this.f788s.l(this.f775l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.e()) {
            return this.f788s.m(this.f775l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.e()) {
            return this.f788s.n(this.f775l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a1 a1Var = this.f788s;
        if (a1Var != null && a1Var.e()) {
            return this.f788s.o(this.f775l0);
        }
        return 0;
    }

    public final void d0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f780o;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof b1) {
            b1 b1Var = (b1) layoutParams;
            if (!b1Var.f1619c) {
                Rect rect2 = b1Var.f1618b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f788s.n0(this, view, this.f780o, !this.f802z, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        a1 layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        i0(0, measuredHeight, false);
                        return true;
                    }
                    i0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean L = layoutManager.L();
                    if (keyCode == 122) {
                        if (L) {
                            i = getAdapter().a();
                        }
                    } else if (!L) {
                        i = getAdapter().a();
                    }
                    j0(i);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        i0(measuredWidth, 0, false);
                        return true;
                    }
                    i0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean L2 = layoutManager.L();
                    if (keyCode2 == 122) {
                        if (L2) {
                            i = getAdapter().a();
                        }
                    } else if (!L2) {
                        i = getAdapter().a();
                    }
                    j0(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return getScrollingChildHelper().a(f5, f6, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return getScrollingChildHelper().b(f5, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f792u;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i = 0; i < size; i++) {
            ((x0) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f776m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.M;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f776m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f776m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.O;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f776m) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.Q == null || arrayList.size() <= 0 || !this.Q.f()) ? z4 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(int i, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        boolean z6;
        p();
        q0 q0Var = this.f786r;
        int[] iArr = this.f799x0;
        if (q0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(i, i4, iArr);
            i6 = iArr[0];
            i7 = iArr[1];
            i8 = i - i6;
            i9 = i4 - i7;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.f792u.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i6, i7, i8, i9, this.f795v0, i5, iArr);
        int i10 = iArr[0];
        int i11 = i8 - i10;
        int i12 = iArr[1];
        int i13 = i9 - i12;
        boolean z7 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.W;
        int[] iArr2 = this.f795v0;
        int i15 = iArr2[0];
        this.W = i14 - i15;
        int i16 = this.f761a0;
        int i17 = iArr2[1];
        this.f761a0 = i16 - i17;
        int[] iArr3 = this.f797w0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || l.L(motionEvent, 8194)) {
                z4 = true;
                z5 = false;
            } else {
                float x4 = motionEvent.getX();
                float f5 = i11;
                float y4 = motionEvent.getY();
                float f6 = i13;
                if (f5 < 0.0f) {
                    y();
                    z4 = true;
                    z5 = false;
                    d.L(this.M, (-f5) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    z4 = true;
                    z5 = false;
                    if (f5 > 0.0f) {
                        z();
                        d.L(this.O, f5 / getWidth(), y4 / getHeight());
                    } else {
                        z6 = false;
                        if (f6 >= 0.0f) {
                            A();
                            d.L(this.N, (-f6) / getHeight(), x4 / getWidth());
                        } else {
                            if (f6 > 0.0f) {
                                x();
                                d.L(this.P, f6 / getHeight(), 1.0f - (x4 / getWidth()));
                            }
                            if (!z6 || f5 != 0.0f || f6 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && l.L(motionEvent, 4194304)) {
                                a0();
                            }
                        }
                        z6 = z4;
                        if (!z6) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            a0();
                        }
                    }
                }
                z6 = z4;
                if (f6 >= 0.0f) {
                }
                z6 = z4;
                if (!z6) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            }
            n(i, i4);
        } else {
            z4 = true;
            z5 = false;
        }
        if (i6 != 0 || i7 != 0) {
            w(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z7 && i6 == 0 && i7 == 0) ? z5 : z4;
    }

    public final void f0(int i, int i4, int[] iArr) {
        q1 q1Var;
        k0();
        T();
        Trace.beginSection("RV Scroll");
        m1 m1Var = this.f775l0;
        C(m1Var);
        g1 g1Var = this.h;
        int p02 = i != 0 ? this.f788s.p0(i, g1Var, m1Var) : 0;
        int r02 = i4 != 0 ? this.f788s.r0(i4, g1Var, m1Var) : 0;
        Trace.endSection();
        int e4 = this.f772k.e();
        for (int i5 = 0; i5 < e4; i5++) {
            View d = this.f772k.d(i5);
            q1 L = L(d);
            if (L != null && (q1Var = L.i) != null) {
                View view = q1Var.f1768a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        m0(false);
        if (iArr != null) {
            iArr[0] = p02;
            iArr[1] = r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0183, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0193, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i4;
        char c5;
        boolean z4;
        this.f788s.getClass();
        boolean z5 = true;
        boolean z6 = (this.f786r == null || this.f788s == null || P() || this.C) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        m1 m1Var = this.f775l0;
        g1 g1Var = this.h;
        if (z6 && (i == 2 || i == 1)) {
            if (this.f788s.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z4 = true;
                    if (!z4 && this.f788s.d()) {
                        z4 = focusFinder.findNextFocus(this, view, !((this.f788s.f1598b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z4) {
                        p();
                        if (D(view) != null) {
                            k0();
                            this.f788s.T(view, i, g1Var, m1Var);
                            m0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (D(view2) != null) {
                        }
                        if (z5) {
                        }
                    }
                    z5 = false;
                    if (z5) {
                    }
                }
            }
            z4 = false;
            if (!z4) {
                if (focusFinder.findNextFocus(this, view, !((this.f788s.f1598b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z4) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z5 = false;
            if (z5) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z6) {
                p();
                if (D(view) != null) {
                    k0();
                    view2 = this.f788s.T(view, i, g1Var, m1Var);
                    m0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                d0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (D(view2) != null) {
                    z5 = false;
                } else if (view != null && D(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f780o;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f782p;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i5 = this.f788s.f1598b.getLayoutDirection() == 1 ? -1 : 1;
                    int i6 = rect.left;
                    int i7 = rect2.left;
                    if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                        i4 = 1;
                    } else {
                        int i8 = rect.right;
                        int i9 = rect2.right;
                        i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
                    }
                    int i10 = rect.top;
                    int i11 = rect2.top;
                    if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                        c5 = 1;
                    } else {
                        int i12 = rect.bottom;
                        int i13 = rect2.bottom;
                        c5 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            StringBuilder sb = new StringBuilder("Invalid direction: ");
                                            sb.append(i);
                                            throw new IllegalArgumentException(b.e(this, sb));
                                        }
                                    }
                                }
                            }
                        } else if (c5 <= 0) {
                            if (c5 == 0) {
                            }
                        }
                    } else if (c5 >= 0) {
                        if (c5 == 0) {
                        }
                    }
                }
                return z5 ? view2 : super.focusSearch(view, i);
            }
            z5 = false;
            if (z5) {
            }
        }
    }

    public final void g0(int i) {
        if (this.C) {
            return;
        }
        o0();
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            a1Var.q0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            return a1Var.r();
        }
        throw new IllegalStateException(b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            return a1Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public q0 getAdapter() {
        return this.f786r;
    }

    @Override // android.view.View
    public int getBaseline() {
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            return super.getBaseline();
        }
        a1Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f776m;
    }

    public s1 getCompatAccessibilityDelegate() {
        return this.f789s0;
    }

    public u0 getEdgeEffectFactory() {
        return this.L;
    }

    public w0 getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.f792u.size();
    }

    public a1 getLayoutManager() {
        return this.f788s;
    }

    public int getMaxFlingVelocity() {
        return this.f764e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public c1 getOnFlingListener() {
        return this.f763c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f769h0;
    }

    public f1 getRecycledViewPool() {
        return this.h.c();
    }

    public int getScrollState() {
        return this.R;
    }

    public final void h(q1 q1Var) {
        View view = q1Var.f1768a;
        boolean z4 = view.getParent() == this;
        this.h.m(L(view));
        if (q1Var.j()) {
            this.f772k.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f772k.a(view, -1, true);
            return;
        }
        h hVar = this.f772k;
        int indexOfChild = hVar.f1671a.f1752a.indexOfChild(view);
        if (indexOfChild >= 0) {
            hVar.f1672b.i(indexOfChild);
            hVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i, int i4) {
        if (i > 0) {
            return true;
        }
        float x4 = d.x(edgeEffect) * i4;
        float abs = Math.abs(-i) * 0.35f;
        float f5 = this.f765f * 0.015f;
        double log = Math.log(abs / f5);
        double d = J0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f5))) < x4;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(x0 x0Var) {
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            a1Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f792u;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(x0Var);
        R();
        requestLayout();
    }

    public final void i0(int i, int i4, boolean z4) {
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        if (!a1Var.d()) {
            i = 0;
        }
        if (!this.f788s.e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z4) {
            int i5 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        this.i0.c(i, i4, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f798x;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(d1 d1Var) {
        if (this.f779n0 == null) {
            this.f779n0 = new ArrayList();
        }
        this.f779n0.add(d1Var);
    }

    public final void j0(int i) {
        if (this.C) {
            return;
        }
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            a1Var.A0(this, i);
        }
    }

    public final void k(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(b.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.e(this, new StringBuilder(""))));
        }
    }

    public final void k0() {
        int i = this.A + 1;
        this.A = i;
        if (i != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(int i) {
        boolean d = this.f788s.d();
        int i4 = d;
        if (this.f788s.e()) {
            i4 = (d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i4, i);
    }

    public final void m() {
        int h = this.f772k.h();
        for (int i = 0; i < h; i++) {
            q1 M = M(this.f772k.g(i));
            if (!M.o()) {
                M.d = -1;
                M.f1773g = -1;
            }
        }
        g1 g1Var = this.h;
        ArrayList arrayList = g1Var.f1665a;
        ArrayList arrayList2 = g1Var.f1667c;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            q1 q1Var = (q1) arrayList2.get(i4);
            q1Var.d = -1;
            q1Var.f1773g = -1;
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            q1 q1Var2 = (q1) arrayList.get(i5);
            q1Var2.d = -1;
            q1Var2.f1773g = -1;
        }
        ArrayList arrayList3 = g1Var.f1666b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                q1 q1Var3 = (q1) g1Var.f1666b.get(i6);
                q1Var3.d = -1;
                q1Var3.f1773g = -1;
            }
        }
    }

    public final void m0(boolean z4) {
        if (this.A < 1) {
            if (G0) {
                throw new IllegalStateException(b.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.A = 1;
        }
        if (!z4 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z4 && this.B && !this.C && this.f788s != null && this.f786r != null) {
                r();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    public final void n(int i, int i4) {
        boolean z4;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z4 = false;
        } else {
            this.M.onRelease();
            z4 = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.O.onRelease();
            z4 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.N.onRelease();
            z4 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.P.onRelease();
            z4 |= this.P.isFinished();
        }
        if (z4) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void o0() {
        h0 h0Var;
        setScrollState(0);
        p1 p1Var = this.i0;
        p1Var.f1757l.removeCallbacks(p1Var);
        p1Var.h.abortAnimation();
        a1 a1Var = this.f788s;
        if (a1Var == null || (h0Var = a1Var.f1600e) == null) {
            return;
        }
        h0Var.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f5;
        super.onAttachedToWindow();
        this.J = 0;
        this.f798x = true;
        this.f802z = this.f802z && !isLayoutRequested();
        this.h.e();
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            a1Var.f1602g = true;
            a1Var.R(this);
        }
        this.f787r0 = false;
        if (L0) {
            ThreadLocal threadLocal = a0.f1593j;
            a0 a0Var = (a0) threadLocal.get();
            this.f771j0 = a0Var;
            if (a0Var == null) {
                this.f771j0 = new a0();
                WeakHashMap weakHashMap = n0.p0.f2816a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f5 = display.getRefreshRate();
                }
                f5 = 60.0f;
                a0 a0Var2 = this.f771j0;
                a0Var2.h = (long) (1.0E9f / f5);
                threadLocal.set(a0Var2);
            }
            ArrayList arrayList = this.f771j0.f1595f;
            if (G0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a0 a0Var;
        super.onDetachedFromWindow();
        w0 w0Var = this.Q;
        if (w0Var != null) {
            w0Var.e();
        }
        o0();
        int i = 0;
        this.f798x = false;
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            a1Var.f1602g = false;
            a1Var.S(this);
        }
        this.f801y0.clear();
        removeCallbacks(this.f803z0);
        this.f774l.getClass();
        while (a2.d.a() != null) {
        }
        g1 g1Var = this.h;
        ArrayList arrayList = g1Var.f1667c;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            r1.b.b(((q1) arrayList.get(i4)).f1768a);
        }
        g1Var.f(g1Var.h.f786r, false);
        while (i < getChildCount()) {
            int i5 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            s0.a aVar = (s0.a) childAt.getTag(com.gdmhkmf.belbet.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new s0.a();
                childAt.setTag(com.gdmhkmf.belbet.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f3234a;
            int A = i.A(arrayList2);
            if (-1 < A) {
                arrayList2.get(A).getClass();
                throw new ClassCastException();
            }
            i = i5;
        }
        if (!L0 || (a0Var = this.f771j0) == null) {
            return;
        }
        boolean remove = a0Var.f1595f.remove(this);
        if (G0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f771j0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f792u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x0) arrayList.get(i)).a(this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        int i;
        boolean z4;
        if (this.f788s != null && !this.C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f6 = this.f788s.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                f5 = this.f788s.d() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z4 = false;
                r2 = f6;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f5 = motionEvent.getAxisValue(26);
                if (this.f788s.e()) {
                    float f7 = -f5;
                    f5 = 0.0f;
                    r2 = f7;
                } else if (!this.f788s.d()) {
                    f5 = 0.0f;
                }
                i = 26;
                z4 = this.D0;
            } else {
                f5 = 0.0f;
                i = 0;
                z4 = false;
            }
            int i4 = (int) (r2 * this.f768g0);
            int i5 = (int) (f5 * this.f766f0);
            if (z4) {
                OverScroller overScroller = this.i0.h;
                i0((overScroller.getFinalX() - overScroller.getCurrX()) + i5, (overScroller.getFinalY() - overScroller.getCurrY()) + i4, true);
            } else {
                a1 a1Var = this.f788s;
                if (a1Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.C) {
                    int[] iArr = this.f799x0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d = a1Var.d();
                    boolean e4 = this.f788s.e();
                    int i6 = e4 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                    float y4 = motionEvent.getY();
                    float x4 = motionEvent.getX();
                    int b02 = i5 - b0(i5, y4);
                    int c02 = i4 - c0(i4, x4);
                    getScrollingChildHelper().g(i6, 1);
                    if (u(d ? b02 : 0, e4 ? c02 : 0, 1, this.f799x0, this.f795v0)) {
                        b02 -= iArr[0];
                        c02 -= iArr[1];
                    }
                    e0(d ? b02 : 0, e4 ? c02 : 0, motionEvent, 1);
                    a0 a0Var = this.f771j0;
                    if (a0Var != null && (b02 != 0 || c02 != 0)) {
                        a0Var.a(this, b02, c02);
                    }
                    n0(1);
                }
            }
            if (i != 0 && !z4) {
                this.F0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        if (!this.C) {
            this.f796w = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            a1 a1Var = this.f788s;
            if (a1Var != null) {
                boolean d = a1Var.d();
                boolean e4 = this.f788s.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                this.T.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.D) {
                        this.D = false;
                    }
                    this.S = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.W = x4;
                    this.U = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.f761a0 = y4;
                    this.V = y4;
                    EdgeEffect edgeEffect = this.M;
                    if (edgeEffect == null || d.x(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z4 = false;
                    } else {
                        d.L(this.M, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z4 = true;
                    }
                    EdgeEffect edgeEffect2 = this.O;
                    if (edgeEffect2 != null && d.x(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        d.L(this.O, 0.0f, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                    EdgeEffect edgeEffect3 = this.N;
                    if (edgeEffect3 != null && d.x(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        d.L(this.N, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    EdgeEffect edgeEffect4 = this.P;
                    if (edgeEffect4 != null && d.x(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        d.L(this.P, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z4 = true;
                    }
                    if (z4 || this.R == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        n0(1);
                    }
                    int[] iArr = this.f797w0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    l0(0);
                } else if (actionMasked == 1) {
                    this.T.clear();
                    n0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.S);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.R != 1) {
                        int i = x5 - this.U;
                        int i4 = y5 - this.V;
                        if (!d || Math.abs(i) <= this.f762b0) {
                            z5 = false;
                        } else {
                            this.W = x5;
                            z5 = true;
                        }
                        if (e4 && Math.abs(i4) > this.f762b0) {
                            this.f761a0 = y5;
                            z5 = true;
                        }
                        if (z5) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.T;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    n0(0);
                    a0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.S = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.W = x6;
                    this.U = x6;
                    int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f761a0 = y6;
                    this.V = y6;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.R == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f802z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            q(i, i4);
            return;
        }
        boolean K = a1Var.K();
        boolean z4 = false;
        m1 m1Var = this.f775l0;
        if (K) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f788s.f1598b.q(i, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.A0 = z4;
            if (z4 || this.f786r == null) {
                return;
            }
            if (m1Var.d == 1) {
                s();
            }
            this.f788s.t0(i, i4);
            m1Var.i = true;
            t();
            this.f788s.v0(i, i4);
            if (this.f788s.y0()) {
                this.f788s.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                m1Var.i = true;
                t();
                this.f788s.v0(i, i4);
            }
            this.B0 = getMeasuredWidth();
            this.C0 = getMeasuredHeight();
            return;
        }
        if (this.f800y) {
            this.f788s.f1598b.q(i, i4);
            return;
        }
        if (this.F) {
            k0();
            T();
            X();
            U(true);
            if (m1Var.f1727k) {
                m1Var.f1725g = true;
            } else {
                this.f770j.d();
                m1Var.f1725g = false;
            }
            this.F = false;
            m0(false);
        } else if (m1Var.f1727k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        q0 q0Var = this.f786r;
        if (q0Var != null) {
            m1Var.f1723e = q0Var.a();
        } else {
            m1Var.f1723e = 0;
        }
        k0();
        this.f788s.f1598b.q(i, i4);
        m0(false);
        m1Var.f1725g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j1 j1Var = (j1) parcelable;
        this.i = j1Var;
        super.onRestoreInstanceState(j1Var.f3386f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j1 j1Var = new j1(super.onSaveInstanceState());
        j1 j1Var2 = this.i;
        if (j1Var2 != null) {
            j1Var.h = j1Var2.h;
            return j1Var;
        }
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            j1Var.h = a1Var.g0();
            return j1Var;
        }
        j1Var.h = null;
        return j1Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        if (i == i5 && i4 == i6) {
            return;
        }
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0224  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        if (!this.C && !this.D) {
            x xVar = this.f796w;
            if (xVar == null) {
                z4 = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                int i = xVar.f1821b;
                if (xVar.f1838v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d = xVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c5 = xVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d || c5) {
                            if (c5) {
                                xVar.f1839w = 1;
                                xVar.f1832p = (int) motionEvent.getX();
                            } else if (d) {
                                xVar.f1839w = 2;
                                xVar.f1829m = (int) motionEvent.getY();
                            }
                            xVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && xVar.f1838v == 2) {
                        xVar.f1829m = 0.0f;
                        xVar.f1832p = 0.0f;
                        xVar.f(1);
                        xVar.f1839w = 0;
                    } else if (motionEvent.getAction() == 2 && xVar.f1838v == 2) {
                        xVar.g();
                        if (xVar.f1839w == 1) {
                            float x4 = motionEvent.getX();
                            int[] iArr = xVar.f1841y;
                            iArr[0] = i;
                            int i4 = xVar.f1833q - i;
                            iArr[1] = i4;
                            float max = Math.max(i, Math.min(i4, x4));
                            if (Math.abs(xVar.f1831o - max) >= 2.0f) {
                                int e4 = x.e(xVar.f1832p, max, iArr, xVar.f1835s.computeHorizontalScrollRange(), xVar.f1835s.computeHorizontalScrollOffset(), xVar.f1833q);
                                if (e4 != 0) {
                                    xVar.f1835s.scrollBy(e4, 0);
                                }
                                xVar.f1832p = max;
                            }
                        }
                        if (xVar.f1839w == 2) {
                            float y4 = motionEvent.getY();
                            int[] iArr2 = xVar.f1840x;
                            iArr2[0] = i;
                            int i5 = xVar.f1834r - i;
                            iArr2[1] = i5;
                            float max2 = Math.max(i, Math.min(i5, y4));
                            if (Math.abs(xVar.f1828l - max2) >= 2.0f) {
                                int e5 = x.e(xVar.f1829m, max2, iArr2, xVar.f1835s.computeVerticalScrollRange(), xVar.f1835s.computeVerticalScrollOffset(), xVar.f1834r);
                                if (e5 != 0) {
                                    xVar.f1835s.scrollBy(0, e5);
                                }
                                xVar.f1829m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f796w = null;
                }
                z4 = true;
            }
            if (z4) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            a1 a1Var = this.f788s;
            if (a1Var != null) {
                boolean d5 = a1Var.d();
                boolean e6 = this.f788s.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f797w0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.S = motionEvent.getPointerId(0);
                    int x5 = (int) (motionEvent.getX() + 0.5f);
                    this.W = x5;
                    this.U = x5;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.f761a0 = y5;
                    this.V = y5;
                    l0(0);
                } else {
                    if (actionMasked == 1) {
                        this.T.addMovement(obtain);
                        VelocityTracker velocityTracker2 = this.T;
                        int i6 = this.f764e0;
                        velocityTracker2.computeCurrentVelocity(1000, i6);
                        float f5 = d5 ? -this.T.getXVelocity(this.S) : 0.0f;
                        float f6 = e6 ? -this.T.getYVelocity(this.S) : 0.0f;
                        if ((f5 == 0.0f && f6 == 0.0f) || !I((int) f5, (int) f6, this.d0, i6)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.T;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        n0(0);
                        a0();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.S);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i7 = this.W - x6;
                        int i8 = this.f761a0 - y6;
                        if (this.R != 1) {
                            if (d5) {
                                i7 = i7 > 0 ? Math.max(0, i7 - this.f762b0) : Math.min(0, i7 + this.f762b0);
                                if (i7 != 0) {
                                    z5 = true;
                                    if (e6) {
                                        i8 = i8 > 0 ? Math.max(0, i8 - this.f762b0) : Math.min(0, i8 + this.f762b0);
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                    }
                                    if (z5) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z5 = false;
                            if (e6) {
                            }
                            if (z5) {
                            }
                        }
                        if (this.R == 1) {
                            int[] iArr4 = this.f799x0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int b02 = i7 - b0(i7, motionEvent.getY());
                            int c02 = i8 - c0(i8, motionEvent.getX());
                            boolean u4 = u(d5 ? b02 : 0, e6 ? c02 : 0, 0, this.f799x0, this.f795v0);
                            int[] iArr5 = this.f795v0;
                            if (u4) {
                                b02 -= iArr4[0];
                                c02 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i9 = b02;
                            int i10 = c02;
                            this.W = x6 - iArr5[0];
                            this.f761a0 = y6 - iArr5[1];
                            if (e0(d5 ? i9 : 0, e6 ? i10 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            a0 a0Var = this.f771j0;
                            if (a0Var != null && (i9 != 0 || i10 != 0)) {
                                a0Var.a(this, i9, i10);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.T;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        n0(0);
                        a0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.S = motionEvent.getPointerId(actionIndex);
                        int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.W = x7;
                        this.U = x7;
                        int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f761a0 = y7;
                        this.V = y7;
                    } else if (actionMasked == 6) {
                        V(motionEvent);
                    }
                }
                this.T.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.f802z || this.H) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (this.f770j.l()) {
            c cVar = this.f770j;
            int i = cVar.f1040a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (cVar.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            k0();
            T();
            this.f770j.r();
            if (!this.B) {
                int e4 = this.f772k.e();
                int i4 = 0;
                while (true) {
                    if (i4 < e4) {
                        q1 M = M(this.f772k.d(i4));
                        if (M != null && !M.o() && M.k()) {
                            r();
                            break;
                        }
                        i4++;
                    } else {
                        this.f770j.c();
                        break;
                    }
                }
            }
            m0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = n0.p0.f2816a;
        setMeasuredDimension(a1.g(i, paddingRight, getMinimumWidth()), a1.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0344, code lost:
    
        if (r21.f772k.f1673c.contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ec  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        boolean z4;
        q1 q1Var;
        View findViewById;
        boolean z5;
        v0 v0Var;
        ?? r32;
        RecyclerView recyclerView;
        boolean g3;
        boolean z6;
        if (this.f786r == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f788s == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        m1 m1Var = this.f775l0;
        boolean z7 = false;
        m1Var.i = false;
        boolean z8 = true;
        boolean z9 = this.A0 && !(this.B0 == getWidth() && this.C0 == getHeight());
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = false;
        if (m1Var.d == 1) {
            s();
            this.f788s.s0(this);
            t();
        } else {
            c cVar = this.f770j;
            if ((((ArrayList) cVar.d).isEmpty() || ((ArrayList) cVar.f1042c).isEmpty()) && !z9 && this.f788s.f1607n == getWidth() && this.f788s.f1608o == getHeight()) {
                this.f788s.s0(this);
            } else {
                this.f788s.s0(this);
                t();
            }
        }
        m1Var.a(4);
        k0();
        T();
        m1Var.d = 1;
        boolean z10 = m1Var.f1726j;
        g1 g1Var = this.h;
        q qVar = this.f774l;
        if (z10) {
            int e4 = this.f772k.e() - 1;
            while (e4 >= 0) {
                q1 M = M(this.f772k.d(e4));
                if (M.o()) {
                    z6 = z8;
                } else {
                    long K = K(M);
                    this.Q.getClass();
                    v0 v0Var2 = new v0();
                    v0Var2.a(M);
                    q.h hVar = (q.h) qVar.h;
                    j jVar = (j) qVar.f466g;
                    q1 q1Var2 = (q1) hVar.b(K);
                    if (q1Var2 == null || q1Var2.o()) {
                        z6 = z8;
                        qVar.a(M, v0Var2);
                    } else {
                        z6 = z8;
                        a2 a2Var = (a2) jVar.get(q1Var2);
                        boolean z11 = (a2Var == null || (a2Var.f1609a & 1) == 0) ? false : z6;
                        a2 a2Var2 = (a2) jVar.get(M);
                        boolean z12 = (a2Var2 == null || (a2Var2.f1609a & 1) == 0) ? false : z6;
                        if (z11 && q1Var2 == M) {
                            qVar.a(M, v0Var2);
                        } else {
                            v0 G = qVar.G(q1Var2, 4);
                            qVar.a(M, v0Var2);
                            v0 G2 = qVar.G(M, 8);
                            if (G == null) {
                                int e5 = this.f772k.e();
                                for (int i = 0; i < e5; i++) {
                                    q1 M2 = M(this.f772k.d(i));
                                    if (M2 != M && K(M2) == K) {
                                        q0 q0Var = this.f786r;
                                        if (q0Var == null || !q0Var.f1765b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(M2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(M);
                                            throw new IllegalStateException(b.e(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(M2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(M);
                                        throw new IllegalStateException(b.e(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + q1Var2 + " cannot be found but it is necessary for " + M + B());
                            } else {
                                q1Var2.n(false);
                                if (z11) {
                                    h(q1Var2);
                                }
                                if (q1Var2 != M) {
                                    if (z12) {
                                        h(M);
                                    }
                                    q1Var2.h = M;
                                    h(q1Var2);
                                    g1Var.m(q1Var2);
                                    M.n(false);
                                    M.i = q1Var2;
                                }
                                if (this.Q.a(q1Var2, M, G, G2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
                e4--;
                z8 = z6;
            }
            z4 = z8;
            j jVar2 = (j) qVar.f466g;
            int i4 = jVar2.h - 1;
            while (i4 >= 0) {
                q1 q1Var3 = (q1) jVar2.f(i4);
                a2 a2Var3 = (a2) jVar2.g(i4);
                int i5 = a2Var3.f1609a;
                int i6 = i5 & 3;
                p0 p0Var = this.E0;
                if (i6 == 3) {
                    RecyclerView recyclerView2 = p0Var.f1752a;
                    recyclerView2.f788s.l0(q1Var3.f1768a, recyclerView2.h);
                    r32 = z7;
                } else if ((i5 & 1) != 0) {
                    v0 v0Var3 = a2Var3.f1610b;
                    if (v0Var3 == null) {
                        RecyclerView recyclerView3 = p0Var.f1752a;
                        recyclerView3.f788s.l0(q1Var3.f1768a, recyclerView3.h);
                        r32 = z7;
                    } else {
                        p0Var.j(q1Var3, v0Var3, a2Var3.f1611c);
                        r32 = z7;
                    }
                } else if ((i5 & 14) == 14) {
                    p0Var.i(q1Var3, a2Var3.f1610b, a2Var3.f1611c);
                    r32 = z7;
                } else if ((i5 & 12) == 12) {
                    v0 v0Var4 = a2Var3.f1610b;
                    v0 v0Var5 = a2Var3.f1611c;
                    p0Var.getClass();
                    q1Var3.n(z7);
                    RecyclerView recyclerView4 = p0Var.f1752a;
                    if (!recyclerView4.H) {
                        o oVar = (o) recyclerView4.Q;
                        oVar.getClass();
                        int i7 = v0Var4.f1808a;
                        int i8 = v0Var5.f1808a;
                        if (i7 == i8 && v0Var4.f1809b == v0Var5.f1809b) {
                            oVar.c(q1Var3);
                            recyclerView = recyclerView4;
                            g3 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g3 = oVar.g(q1Var3, i7, v0Var4.f1809b, i8, v0Var5.f1809b);
                        }
                        if (g3) {
                            recyclerView.W();
                        }
                    } else if (recyclerView4.Q.a(q1Var3, q1Var3, v0Var4, v0Var5)) {
                        recyclerView4.W();
                    }
                    r32 = 0;
                } else {
                    if ((i5 & 4) != 0) {
                        v0Var = null;
                        p0Var.j(q1Var3, a2Var3.f1610b, null);
                    } else {
                        v0Var = null;
                        if ((i5 & 8) != 0) {
                            p0Var.i(q1Var3, a2Var3.f1610b, a2Var3.f1611c);
                        }
                    }
                    r32 = 0;
                    a2Var3.f1609a = r32;
                    a2Var3.f1610b = v0Var;
                    a2Var3.f1611c = v0Var;
                    a2.d.c(a2Var3);
                    i4--;
                    z7 = false;
                }
                v0Var = null;
                a2Var3.f1609a = r32;
                a2Var3.f1610b = v0Var;
                a2Var3.f1611c = v0Var;
                a2.d.c(a2Var3);
                i4--;
                z7 = false;
            }
        } else {
            z4 = true;
        }
        View view = null;
        this.f788s.k0(g1Var);
        m1Var.f1721b = m1Var.f1723e;
        this.H = false;
        this.I = false;
        m1Var.f1726j = false;
        m1Var.f1727k = false;
        this.f788s.f1601f = false;
        ArrayList arrayList = g1Var.f1666b;
        if (arrayList != null) {
            arrayList.clear();
        }
        a1 a1Var = this.f788s;
        if (a1Var.f1604k) {
            a1Var.f1603j = 0;
            a1Var.f1604k = false;
            g1Var.n();
        }
        this.f788s.e0(m1Var);
        boolean z13 = z4;
        U(z13);
        m0(false);
        ((j) qVar.f466g).clear();
        ((q.h) qVar.h).a();
        int[] iArr = this.f791t0;
        int i9 = iArr[0];
        int i10 = iArr[z13 ? 1 : 0];
        F(iArr);
        if ((iArr[0] == i9 && iArr[z13 ? 1 : 0] == i10) ? false : true) {
            w(0, 0);
        }
        if (this.f769h0 && this.f786r != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = m1Var.f1729m;
            if (j2 != -1 && (z5 = this.f786r.f1765b) && z5) {
                int h = this.f772k.h();
                int i11 = 0;
                q1Var = null;
                while (true) {
                    if (i11 >= h) {
                        break;
                    }
                    q1 M3 = M(this.f772k.g(i11));
                    if (M3 != null && !M3.h() && M3.f1771e == j2) {
                        if (!this.f772k.f1673c.contains(M3.f1768a)) {
                            q1Var = M3;
                            break;
                        }
                        q1Var = M3;
                    }
                    i11++;
                }
            } else {
                q1Var = null;
            }
            if (q1Var != null) {
                View view2 = q1Var.f1768a;
                if (!this.f772k.f1673c.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i12 = m1Var.f1730n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f772k.e() > 0) {
                int i13 = m1Var.f1728l;
                int i14 = i13 != -1 ? i13 : 0;
                int b2 = m1Var.b();
                for (int i15 = i14; i15 < b2; i15++) {
                    q1 H = H(i15);
                    if (H == null) {
                        break;
                    }
                    View view3 = H.f1768a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b2, i14) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    q1 H2 = H(min);
                    if (H2 == null) {
                        break;
                    }
                    View view4 = H2.f1768a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        m1Var.f1729m = -1L;
        m1Var.f1728l = -1;
        m1Var.f1730n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        q1 M = M(view);
        if (M != null) {
            if (M.j()) {
                M.f1774j &= -257;
            } else if (!M.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(M);
                throw new IllegalArgumentException(b.e(this, sb));
            }
        } else if (G0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(b.e(this, sb2));
        }
        view.clearAnimation();
        M(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        h0 h0Var = this.f788s.f1600e;
        if ((h0Var == null || !h0Var.f1678e) && !P() && view2 != null) {
            d0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f788s.n0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f794v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int J;
        View view;
        a2 a2Var;
        View D;
        m1 m1Var = this.f775l0;
        m1Var.a(1);
        C(m1Var);
        m1Var.i = false;
        k0();
        q qVar = this.f774l;
        j jVar = (j) qVar.f466g;
        j jVar2 = (j) qVar.f466g;
        jVar.clear();
        q.h hVar = (q.h) qVar.h;
        hVar.a();
        T();
        X();
        q1 q1Var = null;
        View focusedChild = (this.f769h0 && hasFocus() && this.f786r != null) ? getFocusedChild() : null;
        if (focusedChild != null && (D = D(focusedChild)) != null) {
            q1Var = L(D);
        }
        if (q1Var == null) {
            m1Var.f1729m = -1L;
            m1Var.f1728l = -1;
            m1Var.f1730n = -1;
        } else {
            m1Var.f1729m = this.f786r.f1765b ? q1Var.f1771e : -1L;
            if (!this.H) {
                if (q1Var.h()) {
                    J = q1Var.d;
                } else {
                    RecyclerView recyclerView = q1Var.f1782r;
                    if (recyclerView != null) {
                        J = recyclerView.J(q1Var);
                    }
                }
                m1Var.f1728l = J;
                view = q1Var.f1768a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                m1Var.f1730n = id;
            }
            J = -1;
            m1Var.f1728l = J;
            view = q1Var.f1768a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            m1Var.f1730n = id2;
        }
        m1Var.h = m1Var.f1726j && this.f783p0;
        this.f783p0 = false;
        this.f781o0 = false;
        m1Var.f1725g = m1Var.f1727k;
        m1Var.f1723e = this.f786r.a();
        F(this.f791t0);
        if (m1Var.f1726j) {
            int e4 = this.f772k.e();
            for (int i = 0; i < e4; i++) {
                q1 M = M(this.f772k.d(i));
                if (!M.o() && (!M.f() || this.f786r.f1765b)) {
                    w0 w0Var = this.Q;
                    w0.b(M);
                    M.c();
                    w0Var.getClass();
                    v0 v0Var = new v0();
                    v0Var.a(M);
                    a2 a2Var2 = (a2) jVar2.get(M);
                    if (a2Var2 == null) {
                        a2Var2 = a2.a();
                        jVar2.put(M, a2Var2);
                    }
                    a2Var2.f1610b = v0Var;
                    a2Var2.f1609a |= 4;
                    if (m1Var.h && M.k() && !M.h() && !M.o() && !M.f()) {
                        hVar.d(K(M), M);
                    }
                }
            }
        }
        if (m1Var.f1727k) {
            int h = this.f772k.h();
            for (int i4 = 0; i4 < h; i4++) {
                q1 M2 = M(this.f772k.g(i4));
                if (G0 && M2.f1770c == -1 && !M2.h()) {
                    throw new IllegalStateException(b.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!M2.o() && M2.d == -1) {
                    M2.d = M2.f1770c;
                }
            }
            boolean z4 = m1Var.f1724f;
            m1Var.f1724f = false;
            this.f788s.d0(this.h, m1Var);
            m1Var.f1724f = z4;
            for (int i5 = 0; i5 < this.f772k.e(); i5++) {
                q1 M3 = M(this.f772k.d(i5));
                if (!M3.o() && ((a2Var = (a2) jVar2.get(M3)) == null || (a2Var.f1609a & 4) == 0)) {
                    w0.b(M3);
                    boolean z5 = (M3.f1774j & 8192) != 0;
                    w0 w0Var2 = this.Q;
                    M3.c();
                    w0Var2.getClass();
                    v0 v0Var2 = new v0();
                    v0Var2.a(M3);
                    if (z5) {
                        Z(M3, v0Var2);
                    } else {
                        a2 a2Var3 = (a2) jVar2.get(M3);
                        if (a2Var3 == null) {
                            a2Var3 = a2.a();
                            jVar2.put(M3, a2Var3);
                        }
                        a2Var3.f1609a |= 2;
                        a2Var3.f1610b = v0Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        m0(false);
        m1Var.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        a1 a1Var = this.f788s;
        if (a1Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        boolean d = a1Var.d();
        boolean e4 = this.f788s.e();
        if (d || e4) {
            if (!d) {
                i = 0;
            }
            if (!e4) {
                i4 = 0;
            }
            e0(i, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.E |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(s1 s1Var) {
        this.f789s0 = s1Var;
        n0.p0.m(this, s1Var);
    }

    public void setAdapter(q0 q0Var) {
        setLayoutFrozen(false);
        q0 q0Var2 = this.f786r;
        i1 i1Var = this.f767g;
        if (q0Var2 != null) {
            q0Var2.f1764a.unregisterObserver(i1Var);
            this.f786r.getClass();
        }
        w0 w0Var = this.Q;
        if (w0Var != null) {
            w0Var.e();
        }
        a1 a1Var = this.f788s;
        g1 g1Var = this.h;
        if (a1Var != null) {
            a1Var.j0(g1Var);
            this.f788s.k0(g1Var);
        }
        g1Var.f1665a.clear();
        g1Var.g();
        c cVar = this.f770j;
        cVar.s((ArrayList) cVar.f1042c);
        cVar.s((ArrayList) cVar.d);
        cVar.f1040a = 0;
        q0 q0Var3 = this.f786r;
        this.f786r = q0Var;
        if (q0Var != null) {
            q0Var.f1764a.registerObserver(i1Var);
        }
        a1 a1Var2 = this.f788s;
        if (a1Var2 != null) {
            a1Var2.Q();
        }
        q0 q0Var4 = this.f786r;
        g1Var.f1665a.clear();
        g1Var.g();
        g1Var.f(q0Var3, true);
        f1 c5 = g1Var.c();
        if (q0Var3 != null) {
            c5.f1658b--;
        }
        if (c5.f1658b == 0) {
            SparseArray sparseArray = c5.f1657a;
            for (int i = 0; i < sparseArray.size(); i++) {
                e1 e1Var = (e1) sparseArray.valueAt(i);
                ArrayList arrayList = e1Var.f1643a;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    r1.b.b(((q1) obj).f1768a);
                }
                e1Var.f1643a.clear();
            }
        }
        if (q0Var4 != null) {
            c5.f1658b++;
        }
        g1Var.e();
        this.f775l0.f1724f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f776m) {
            this.P = null;
            this.N = null;
            this.O = null;
            this.M = null;
        }
        this.f776m = z4;
        super.setClipToPadding(z4);
        if (this.f802z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(u0 u0Var) {
        u0Var.getClass();
        this.L = u0Var;
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f800y = z4;
    }

    public void setItemAnimator(w0 w0Var) {
        w0 w0Var2 = this.Q;
        if (w0Var2 != null) {
            w0Var2.e();
            this.Q.f1813a = null;
        }
        this.Q = w0Var;
        if (w0Var != null) {
            w0Var.f1813a = this.f785q0;
        }
    }

    public void setItemViewCacheSize(int i) {
        g1 g1Var = this.h;
        g1Var.f1668e = i;
        g1Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(a1 a1Var) {
        if (a1Var == this.f788s) {
            return;
        }
        o0();
        a1 a1Var2 = this.f788s;
        g1 g1Var = this.h;
        if (a1Var2 != null) {
            w0 w0Var = this.Q;
            if (w0Var != null) {
                w0Var.e();
            }
            this.f788s.j0(g1Var);
            this.f788s.k0(g1Var);
            g1Var.f1665a.clear();
            g1Var.g();
            if (this.f798x) {
                a1 a1Var3 = this.f788s;
                a1Var3.f1602g = false;
                a1Var3.S(this);
            }
            this.f788s.w0(null);
            this.f788s = null;
        } else {
            g1Var.f1665a.clear();
            g1Var.g();
        }
        h hVar = this.f772k;
        RecyclerView recyclerView = hVar.f1671a.f1752a;
        hVar.f1672b.h();
        ArrayList arrayList = hVar.f1673c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q1 M = M((View) arrayList.get(size));
            if (M != null) {
                int i = M.f1780p;
                if (recyclerView.P()) {
                    M.f1781q = i;
                    recyclerView.f801y0.add(M);
                } else {
                    M.f1768a.setImportantForAccessibility(i);
                }
                M.f1780p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f788s = a1Var;
        if (a1Var != null) {
            if (a1Var.f1598b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(a1Var);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(b.e(a1Var.f1598b, sb));
            }
            a1Var.w0(this);
            if (this.f798x) {
                a1 a1Var4 = this.f788s;
                a1Var4.f1602g = true;
                a1Var4.R(this);
            }
        }
        g1Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.f2807c;
            WeakHashMap weakHashMap = n0.p0.f2816a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z4;
    }

    public void setOnFlingListener(c1 c1Var) {
        this.f763c0 = c1Var;
    }

    @Deprecated
    public void setOnScrollListener(d1 d1Var) {
        this.f777m0 = d1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f769h0 = z4;
    }

    public void setRecycledViewPool(f1 f1Var) {
        g1 g1Var = this.h;
        RecyclerView recyclerView = g1Var.h;
        g1Var.f(recyclerView.f786r, false);
        if (g1Var.f1670g != null) {
            r2.f1658b--;
        }
        g1Var.f1670g = f1Var;
        if (f1Var != null && recyclerView.getAdapter() != null) {
            g1Var.f1670g.f1658b++;
        }
        g1Var.e();
    }

    public void setScrollState(int i) {
        h0 h0Var;
        if (i == this.R) {
            return;
        }
        if (H0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.R, new Exception());
        }
        this.R = i;
        if (i != 2) {
            p1 p1Var = this.i0;
            p1Var.f1757l.removeCallbacks(p1Var);
            p1Var.h.abortAnimation();
            a1 a1Var = this.f788s;
            if (a1Var != null && (h0Var = a1Var.f1600e) != null) {
                h0Var.i();
            }
        }
        a1 a1Var2 = this.f788s;
        if (a1Var2 != null) {
            a1Var2.h0(i);
        }
        d1 d1Var = this.f777m0;
        if (d1Var != null) {
            d1Var.a(this, i);
        }
        ArrayList arrayList = this.f779n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d1) this.f779n0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f762b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f762b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(o1 o1Var) {
        this.h.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        if (z4 != this.C) {
            k("Do not suppressLayout in layout or scroll");
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                o0();
                return;
            }
            this.C = false;
            if (this.B && this.f788s != null && this.f786r != null) {
                requestLayout();
            }
            this.B = false;
        }
    }

    public final void t() {
        k0();
        T();
        m1 m1Var = this.f775l0;
        m1Var.a(6);
        this.f770j.d();
        m1Var.f1723e = this.f786r.a();
        m1Var.f1722c = 0;
        if (this.i != null) {
            q0 q0Var = this.f786r;
            int a5 = e.a(q0Var.f1766c);
            if (a5 == 1 ? q0Var.a() > 0 : a5 != 2) {
                Parcelable parcelable = this.i.h;
                if (parcelable != null) {
                    this.f788s.f0(parcelable);
                }
                this.i = null;
            }
        }
        m1Var.f1725g = false;
        this.f788s.d0(this.h, m1Var);
        m1Var.f1724f = false;
        m1Var.f1726j = m1Var.f1726j && this.Q != null;
        m1Var.d = 4;
        U(true);
        m0(false);
    }

    public final boolean u(int i, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, i5, iArr, iArr2);
    }

    public final void v(int i, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().d(i, i4, i5, i6, iArr, i7, iArr2);
    }

    public final void w(int i, int i4) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        d1 d1Var = this.f777m0;
        if (d1Var != null) {
            d1Var.b(this, i, i4);
        }
        ArrayList arrayList = this.f779n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d1) this.f779n0.get(size)).b(this, i, i4);
            }
        }
        this.K--;
    }

    public final void x() {
        if (this.P != null) {
            return;
        }
        ((n1) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.f776m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.M != null) {
            return;
        }
        ((n1) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f776m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.O != null) {
            return;
        }
        ((n1) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.f776m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c5;
        boolean z4;
        char c6;
        TypedArray typedArray;
        int i4;
        Constructor constructor;
        this.f767g = new i1(this);
        this.h = new g1(this);
        this.f774l = new q(10);
        this.f778n = new n0(this, 0);
        this.f780o = new Rect();
        this.f782p = new Rect();
        this.f784q = new RectF();
        this.f790t = new ArrayList();
        this.f792u = new ArrayList();
        this.f794v = new ArrayList();
        this.A = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = O0;
        o oVar = new o();
        Object[] objArr = null;
        oVar.f1813a = null;
        oVar.f1814b = new ArrayList();
        oVar.f1815c = 120L;
        oVar.d = 120L;
        oVar.f1816e = 250L;
        oVar.f1817f = 250L;
        int i5 = 1;
        oVar.f1738g = true;
        oVar.h = new ArrayList();
        oVar.i = new ArrayList();
        oVar.f1739j = new ArrayList();
        oVar.f1740k = new ArrayList();
        oVar.f1741l = new ArrayList();
        oVar.f1742m = new ArrayList();
        oVar.f1743n = new ArrayList();
        oVar.f1744o = new ArrayList();
        oVar.f1745p = new ArrayList();
        oVar.f1746q = new ArrayList();
        oVar.f1747r = new ArrayList();
        this.Q = oVar;
        this.R = 0;
        this.S = -1;
        this.f766f0 = Float.MIN_VALUE;
        this.f768g0 = Float.MIN_VALUE;
        this.f769h0 = true;
        this.i0 = new p1(this);
        this.f773k0 = L0 ? new y() : null;
        m1 m1Var = new m1();
        m1Var.f1720a = -1;
        m1Var.f1721b = 0;
        m1Var.f1722c = 0;
        m1Var.d = 1;
        m1Var.f1723e = 0;
        m1Var.f1724f = false;
        m1Var.f1725g = false;
        m1Var.h = false;
        m1Var.i = false;
        m1Var.f1726j = false;
        m1Var.f1727k = false;
        this.f775l0 = m1Var;
        this.f781o0 = false;
        this.f783p0 = false;
        p0 p0Var = new p0(this);
        this.f785q0 = p0Var;
        this.f787r0 = false;
        this.f791t0 = new int[2];
        this.f795v0 = new int[2];
        this.f797w0 = new int[2];
        this.f799x0 = new int[2];
        this.f801y0 = new ArrayList();
        this.f803z0 = new n0(this, i5);
        this.B0 = 0;
        this.C0 = 0;
        this.E0 = new p0(this);
        this.F0 = new g(getContext(), new p0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f762b0 = viewConfiguration.getScaledTouchSlop();
        this.f766f0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f768g0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f764e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f765f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.f1813a = p0Var;
        this.f770j = new c(new p0(this));
        this.f772k = new h(new p0(this));
        WeakHashMap weakHashMap = n0.p0.f2816a;
        if (j0.a(this) == 0) {
            j0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new s1(this));
        int[] iArr = f1.a.f1435a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        n0.p0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f776m = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(b.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c5 = 3;
            c6 = 2;
            z4 = 1;
            typedArray = obtainStyledAttributes;
            i4 = 4;
            new x(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.gdmhkmf.belbet.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.gdmhkmf.belbet.R.dimen.fastscroll_margin));
        } else {
            c5 = 3;
            z4 = 1;
            c6 = 2;
            typedArray = obtainStyledAttributes;
            i4 = 4;
        }
        typedArray.recycle();
        this.D0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(a1.class);
                    try {
                        constructor = asSubclass.getConstructor(M0);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context;
                        objArr2[z4] = attributeSet;
                        objArr2[c6] = Integer.valueOf(i);
                        objArr2[c5] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                    }
                    constructor.setAccessible(z4);
                    setLayoutManager((a1) constructor.newInstance(objArr));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e6);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e7);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e8);
                } catch (InstantiationException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                }
            }
        }
        int[] iArr2 = I0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        n0.p0.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
        setTag(com.gdmhkmf.belbet.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a1 a1Var = this.f788s;
        if (a1Var != null) {
            return a1Var.t(layoutParams);
        }
        throw new IllegalStateException(b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(h1 h1Var) {
    }
}
