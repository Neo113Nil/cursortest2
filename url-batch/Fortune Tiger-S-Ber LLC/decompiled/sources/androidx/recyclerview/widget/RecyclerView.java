package androidx.recyclerview.widget;

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
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.g;
import androidx.emoji2.text.s;
import b1.a;
import b1.a0;
import b1.a1;
import b1.b;
import b1.b0;
import b1.b1;
import b1.c;
import b1.c0;
import b1.c1;
import b1.d0;
import b1.e0;
import b1.e1;
import b1.g0;
import b1.h0;
import b1.i0;
import b1.j0;
import b1.k0;
import b1.m1;
import b1.n;
import b1.n0;
import b1.o;
import b1.o0;
import b1.p0;
import b1.q;
import b1.q0;
import b1.r0;
import b1.s0;
import b1.t0;
import b1.u0;
import b1.v0;
import b1.w0;
import b1.x;
import b1.y0;
import b1.z;
import b1.z0;
import g0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.j;
import n.h;
import q.e;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final c0 F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final d0 C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public h0 K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public j0 P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public p0 f628b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f629c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f630d0;

    /* renamed from: e0, reason: collision with root package name */
    public final float f631e0;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f632f;
    public final float f0;
    public final t0 g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f633g0;
    public w0 h;

    /* renamed from: h0, reason: collision with root package name */
    public final b1 f634h0;

    /* renamed from: i, reason: collision with root package name */
    public final b f635i;

    /* renamed from: i0, reason: collision with root package name */
    public q f636i0;

    /* renamed from: j, reason: collision with root package name */
    public final s f637j;

    /* renamed from: j0, reason: collision with root package name */
    public final o f638j0;

    /* renamed from: k, reason: collision with root package name */
    public final a2.s f639k;

    /* renamed from: k0, reason: collision with root package name */
    public final z0 f640k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f641l;

    /* renamed from: l0, reason: collision with root package name */
    public q0 f642l0;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f643m;

    /* renamed from: m0, reason: collision with root package name */
    public ArrayList f644m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f645n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f646n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f647o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f648o0;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f649p;

    /* renamed from: p0, reason: collision with root package name */
    public final d0 f650p0;

    /* renamed from: q, reason: collision with root package name */
    public e0 f651q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f652q0;

    /* renamed from: r, reason: collision with root package name */
    public n0 f653r;

    /* renamed from: r0, reason: collision with root package name */
    public e1 f654r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f655s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f656s0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f657t;

    /* renamed from: t0, reason: collision with root package name */
    public j f658t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f659u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f660u0;

    /* renamed from: v, reason: collision with root package name */
    public n f661v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f662v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f663w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f664w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f665x;

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f666x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f667y;

    /* renamed from: y0, reason: collision with root package name */
    public final b0 f668y0;

    /* renamed from: z, reason: collision with root package name */
    public int f669z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f670z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new c0(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView D = D(viewGroup.getChildAt(i4));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static c1 I(View view) {
        if (view == null) {
            return null;
        }
        return ((o0) view.getLayoutParams()).f889a;
    }

    private j getScrollingChildHelper() {
        if (this.f658t0 == null) {
            this.f658t0 = new j(this);
        }
        return this.f658t0;
    }

    public static void j(c1 c1Var) {
        WeakReference weakReference = c1Var.f748b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c1Var.f747a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c1Var.f748b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
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
    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f659u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            int i5 = nVar.f869v;
            if (i5 == 1) {
                boolean d4 = nVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c = nVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d4 || c)) {
                    if (c) {
                        nVar.f870w = 1;
                        nVar.f863p = (int) motionEvent.getX();
                    } else if (d4) {
                        nVar.f870w = 2;
                        nVar.f860m = (int) motionEvent.getY();
                    }
                    nVar.f(2);
                    if (action == 3) {
                        this.f661v = nVar;
                        return true;
                    }
                }
            } else {
                if (i5 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int g = this.f637j.g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g; i6++) {
            c1 I = I(this.f637j.f(i6));
            if (!I.o()) {
                int b2 = I.b();
                if (b2 < i4) {
                    i4 = b2;
                }
                if (b2 > i5) {
                    i5 = b2;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public final c1 E(int i4) {
        c1 c1Var = null;
        if (this.G) {
            return null;
        }
        int n3 = this.f637j.n();
        for (int i5 = 0; i5 < n3; i5++) {
            c1 I = I(this.f637j.m(i5));
            if (I != null && !I.h() && F(I) == i4) {
                if (!((ArrayList) this.f637j.f358d).contains(I.f747a)) {
                    return I;
                }
                c1Var = I;
            }
        }
        return c1Var;
    }

    public final int F(c1 c1Var) {
        if ((c1Var.f753j & 524) == 0 && c1Var.e()) {
            int i4 = c1Var.c;
            ArrayList arrayList = (ArrayList) this.f635i.f733b;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = (a) arrayList.get(i5);
                int i6 = aVar.f726a;
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = aVar.f727b;
                        if (i7 <= i4) {
                            int i8 = aVar.f728d;
                            if (i7 + i8 <= i4) {
                                i4 -= i8;
                            }
                        } else {
                            continue;
                        }
                    } else if (i6 == 8) {
                        int i9 = aVar.f727b;
                        if (i9 == i4) {
                            i4 = aVar.f728d;
                        } else {
                            if (i9 < i4) {
                                i4--;
                            }
                            if (aVar.f728d <= i4) {
                                i4++;
                            }
                        }
                    }
                } else if (aVar.f727b <= i4) {
                    i4 += aVar.f728d;
                }
            }
            return i4;
        }
        return -1;
    }

    public final long G(c1 c1Var) {
        return this.f651q.f772b ? c1Var.f750e : c1Var.c;
    }

    public final c1 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        boolean z3 = o0Var.c;
        Rect rect = o0Var.f890b;
        if (!z3 || (this.f640k0.g && (o0Var.f889a.k() || o0Var.f889a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f657t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Rect rect2 = this.f645n;
            rect2.set(0, 0, 0, 0);
            ((k0) arrayList.get(i4)).getClass();
            ((o0) view.getLayoutParams()).f889a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        o0Var.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f667y || this.G || this.f635i.k();
    }

    public final boolean L() {
        return this.I > 0;
    }

    public final void M(int i4) {
        if (this.f653r == null) {
            return;
        }
        setScrollState(2);
        this.f653r.o0(i4);
        awakenScrollBars();
    }

    public final void N() {
        int n3 = this.f637j.n();
        for (int i4 = 0; i4 < n3; i4++) {
            ((o0) this.f637j.m(i4).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o0 o0Var = (o0) ((c1) arrayList.get(i5)).f747a.getLayoutParams();
            if (o0Var != null) {
                o0Var.c = true;
            }
        }
    }

    public final void O(int i4, int i5, boolean z3) {
        int i6 = i4 + i5;
        int n3 = this.f637j.n();
        for (int i7 = 0; i7 < n3; i7++) {
            c1 I = I(this.f637j.m(i7));
            if (I != null && !I.o()) {
                int i8 = I.c;
                z0 z0Var = this.f640k0;
                if (i8 >= i6) {
                    I.l(-i5, z3);
                    z0Var.f960f = true;
                } else if (i8 >= i4) {
                    I.a(8);
                    I.l(-i5, z3);
                    I.c = i4 - 1;
                    z0Var.f960f = true;
                }
            }
        }
        t0 t0Var = this.g;
        ArrayList arrayList = t0Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var != null) {
                int i9 = c1Var.c;
                if (i9 >= i6) {
                    c1Var.l(-i5, z3);
                } else if (i9 >= i4) {
                    c1Var.a(8);
                    t0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.I++;
    }

    public final void Q(boolean z3) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i5 = this.I - 1;
        this.I = i5;
        if (i5 < 1) {
            this.I = 0;
            if (z3) {
                int i6 = this.D;
                this.D = 0;
                if (i6 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f666x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) arrayList.get(size);
                    if (c1Var.f747a.getParent() == this && !c1Var.o() && (i4 = c1Var.f760q) != -1) {
                        View view = c1Var.f747a;
                        WeakHashMap weakHashMap = k0.j0.f2752a;
                        view.setImportantForAccessibility(i4);
                        c1Var.f760q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.V = x3;
            this.T = x3;
            int y3 = (int) (motionEvent.getY(i4) + 0.5f);
            this.W = y3;
            this.U = y3;
        }
    }

    public final void S() {
        if (this.f652q0 || !this.f663w) {
            return;
        }
        WeakHashMap weakHashMap = k0.j0.f2752a;
        postOnAnimation(this.f668y0);
        this.f652q0 = true;
    }

    public final void T() {
        boolean z3;
        boolean z4 = false;
        if (this.G) {
            b bVar = this.f635i;
            bVar.r((ArrayList) bVar.f733b);
            bVar.r((ArrayList) bVar.f734d);
            bVar.f732a = 0;
            if (this.H) {
                this.f653r.Y();
            }
        }
        if (this.P == null || !this.f653r.A0()) {
            this.f635i.d();
        } else {
            this.f635i.q();
        }
        boolean z5 = this.f646n0 || this.f648o0;
        boolean z6 = this.f667y && this.P != null && ((z3 = this.G) || z5 || this.f653r.f878f) && (!z3 || this.f651q.f772b);
        z0 z0Var = this.f640k0;
        z0Var.f962j = z6;
        if (z6 && z5 && !this.G && this.P != null && this.f653r.A0()) {
            z4 = true;
        }
        z0Var.f963k = z4;
    }

    public final void U(c1 c1Var, i0 i0Var) {
        c1Var.f753j &= -8193;
        boolean z3 = this.f640k0.h;
        a2.s sVar = this.f639k;
        if (z3 && c1Var.k() && !c1Var.h() && !c1Var.o()) {
            ((h) sVar.h).d(G(c1Var), c1Var);
        }
        n.j jVar = (n.j) sVar.g;
        m1 m1Var = (m1) jVar.get(c1Var);
        if (m1Var == null) {
            m1Var = m1.a();
            jVar.put(c1Var, m1Var);
        }
        m1Var.f850b = i0Var;
        m1Var.f849a |= 4;
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f645n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o0) {
            o0 o0Var = (o0) layoutParams;
            if (!o0Var.c) {
                Rect rect2 = o0Var.f890b;
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
        this.f653r.l0(this, view, this.f645n, !this.f667y, view2 == null);
    }

    public final void W() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        d0(0);
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.O.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        m();
        e0 e0Var = this.f651q;
        int[] iArr = this.f664w0;
        if (e0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Y(i4, i5, iArr);
            i7 = iArr[0];
            i8 = iArr[1];
            i9 = i4 - i7;
            i10 = i5 - i8;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (!this.f657t.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i7, i8, i9, i10, this.f660u0, i6, iArr);
        int i11 = iArr[0];
        int i12 = i9 - i11;
        int i13 = iArr[1];
        int i14 = i10 - i13;
        boolean z5 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.V;
        int[] iArr2 = this.f660u0;
        int i16 = iArr2[0];
        this.V = i15 - i16;
        int i17 = this.W;
        int i18 = iArr2[1];
        this.W = i17 - i18;
        int[] iArr3 = this.f662v0;
        iArr3[0] = iArr3[0] + i16;
        iArr3[1] = iArr3[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z3 = true;
            } else {
                float x3 = motionEvent.getX();
                float f4 = i12;
                float y3 = motionEvent.getY();
                float f5 = i14;
                if (f4 < 0.0f) {
                    v();
                    z3 = true;
                    o0.b.a(this.L, (-f4) / getWidth(), 1.0f - (y3 / getHeight()));
                } else {
                    z3 = true;
                    if (f4 > 0.0f) {
                        w();
                        o0.b.a(this.N, f4 / getWidth(), y3 / getHeight());
                    } else {
                        z4 = false;
                        if (f5 >= 0.0f) {
                            x();
                            o0.b.a(this.M, (-f5) / getHeight(), x3 / getWidth());
                        } else {
                            if (f5 > 0.0f) {
                                u();
                                o0.b.a(this.O, f5 / getHeight(), 1.0f - (x3 / getWidth()));
                            }
                            if (!z4 || f4 != 0.0f || f5 != 0.0f) {
                                WeakHashMap weakHashMap = k0.j0.f2752a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z4 = z3;
                        if (!z4) {
                        }
                        WeakHashMap weakHashMap2 = k0.j0.f2752a;
                        postInvalidateOnAnimation();
                    }
                }
                z4 = z3;
                if (f5 >= 0.0f) {
                }
                z4 = z3;
                if (!z4) {
                }
                WeakHashMap weakHashMap22 = k0.j0.f2752a;
                postInvalidateOnAnimation();
            }
            l(i4, i5);
        } else {
            z3 = true;
        }
        if (i7 != 0 || i8 != 0) {
            t(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z5 && i7 == 0 && i8 == 0) {
            return false;
        }
        return z3;
    }

    public final void Y(int i4, int i5, int[] iArr) {
        c1 c1Var;
        b0();
        P();
        int i6 = f.f1759a;
        Trace.beginSection("RV Scroll");
        z0 z0Var = this.f640k0;
        z(z0Var);
        t0 t0Var = this.g;
        int n02 = i4 != 0 ? this.f653r.n0(i4, t0Var, z0Var) : 0;
        int p02 = i5 != 0 ? this.f653r.p0(i5, t0Var, z0Var) : 0;
        Trace.endSection();
        s sVar = this.f637j;
        int g = sVar.g();
        for (int i7 = 0; i7 < g; i7++) {
            View f4 = sVar.f(i7);
            c1 H = H(f4);
            if (H != null && (c1Var = H.f752i) != null) {
                View view = c1Var.f747a;
                int left = f4.getLeft();
                int top = f4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        c0(false);
        if (iArr != null) {
            iArr[0] = n02;
            iArr[1] = p02;
        }
    }

    public final void Z(int i4) {
        x xVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        b1 b1Var = this.f634h0;
        b1Var.f742l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var = this.f653r;
        if (n0Var != null && (xVar = n0Var.f877e) != null) {
            xVar.i();
        }
        n0 n0Var2 = this.f653r;
        if (n0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            n0Var2.o0(i4);
            awakenScrollBars();
        }
    }

    public final void a0(int i4, int i5, boolean z3) {
        n0 n0Var = this.f653r;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!n0Var.d()) {
            i4 = 0;
        }
        if (!this.f653r.e()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (z3) {
            int i6 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        this.f634h0.b(i4, i5, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            n0Var.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b0() {
        int i4 = this.f669z + 1;
        this.f669z = i4;
        if (i4 != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    public final void c0(boolean z3) {
        if (this.f669z < 1) {
            this.f669z = 1;
        }
        if (!z3 && !this.B) {
            this.A = false;
        }
        if (this.f669z == 1) {
            if (z3 && this.A && !this.B && this.f653r != null && this.f651q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.f669z--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o0) && this.f653r.f((o0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.d()) {
            return this.f653r.j(this.f640k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.d()) {
            return this.f653r.k(this.f640k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.d()) {
            return this.f653r.l(this.f640k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.e()) {
            return this.f653r.m(this.f640k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.e()) {
            return this.f653r.n(this.f640k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        n0 n0Var = this.f653r;
        if (n0Var != null && n0Var.e()) {
            return this.f653r.o(this.f640k0);
        }
        return 0;
    }

    public final void d0(int i4) {
        getScrollingChildHelper().h(i4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return getScrollingChildHelper().a(f4, f5, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i4, i5, i6, i7, iArr, 0, null);
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
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f657t;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((k0) arrayList.get(i4)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f641l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f641l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f641l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f641l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.P == null || arrayList.size() <= 0 || !this.P.f()) ? z3 : true) {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void f(c1 c1Var) {
        View view = c1Var.f747a;
        boolean z3 = view.getParent() == this;
        this.g.k(H(view));
        if (c1Var.j()) {
            this.f637j.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f637j.a(view, -1, true);
            return;
        }
        s sVar = this.f637j;
        int indexOfChild = ((d0) sVar.f357b).f764a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((c) sVar.c).i(indexOfChild);
            sVar.p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i4) {
        View view2;
        int i5;
        char c;
        boolean z3;
        this.f653r.getClass();
        boolean z4 = true;
        boolean z5 = (this.f651q == null || this.f653r == null || L() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        z0 z0Var = this.f640k0;
        t0 t0Var = this.g;
        if (z5 && (i4 == 2 || i4 == 1)) {
            if (this.f653r.e()) {
                if (focusFinder.findNextFocus(this, view, i4 == 2 ? 130 : 33) == null) {
                    z3 = true;
                    if (!z3 && this.f653r.d()) {
                        z3 = focusFinder.findNextFocus(this, view, !((this.f653r.C() != 1) ^ (i4 != 2)) ? 66 : 17) != null;
                    }
                    if (z3) {
                        m();
                        if (A(view) != null) {
                            b0();
                            this.f653r.T(view, i4, t0Var, z0Var);
                            c0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i4);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (A(view2) != null) {
                        }
                        if (z4) {
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                }
            }
            z3 = false;
            if (!z3) {
                if (focusFinder.findNextFocus(this, view, !((this.f653r.C() != 1) ^ (i4 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z3) {
            }
            view2 = focusFinder.findNextFocus(this, view, i4);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z4 = false;
            if (z4) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (findNextFocus == null && z5) {
                m();
                if (A(view) != null) {
                    b0();
                    view2 = this.f653r.T(view, i4, t0Var, z0Var);
                    c0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i4);
                }
                V(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (A(view2) != null) {
                    z4 = false;
                } else if (view != null && A(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f645n;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f647o;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i6 = this.f653r.C() == 1 ? -1 : 1;
                    int i7 = rect.left;
                    int i8 = rect2.left;
                    if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                        i5 = 1;
                    } else {
                        int i9 = rect.right;
                        int i10 = rect2.right;
                        i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
                    }
                    int i11 = rect.top;
                    int i12 = rect2.top;
                    if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                        c = 1;
                    } else {
                        int i13 = rect.bottom;
                        int i14 = rect2.bottom;
                        c = ((i13 > i14 || i11 >= i14) && i11 > i12) ? (char) 65535 : (char) 0;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 17) {
                                if (i4 != 33) {
                                    if (i4 != 66) {
                                        if (i4 != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i4 + y());
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return z4 ? view2 : super.focusSearch(view, i4);
            }
            z4 = false;
            if (z4) {
            }
        }
    }

    public final void g(k0 k0Var) {
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            n0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f657t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(k0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            return n0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            return n0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e0 getAdapter() {
        return this.f651q;
    }

    @Override // android.view.View
    public int getBaseline() {
        n0 n0Var = this.f653r;
        if (n0Var == null) {
            return super.getBaseline();
        }
        n0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f641l;
    }

    public e1 getCompatAccessibilityDelegate() {
        return this.f654r0;
    }

    public h0 getEdgeEffectFactory() {
        return this.K;
    }

    public j0 getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.f657t.size();
    }

    public n0 getLayoutManager() {
        return this.f653r;
    }

    public int getMaxFlingVelocity() {
        return this.f630d0;
    }

    public int getMinFlingVelocity() {
        return this.f629c0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public p0 getOnFlingListener() {
        return this.f628b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f633g0;
    }

    public s0 getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(q0 q0Var) {
        if (this.f644m0 == null) {
            this.f644m0 = new ArrayList();
        }
        this.f644m0.add(q0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f663w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2750d;
    }

    public final void k() {
        int n3 = this.f637j.n();
        for (int i4 = 0; i4 < n3; i4++) {
            c1 I = I(this.f637j.m(i4));
            if (!I.o()) {
                I.f749d = -1;
                I.g = -1;
            }
        }
        t0 t0Var = this.g;
        ArrayList arrayList = t0Var.f917a;
        ArrayList arrayList2 = t0Var.c;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            c1 c1Var = (c1) arrayList2.get(i5);
            c1Var.f749d = -1;
            c1Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            c1 c1Var2 = (c1) arrayList.get(i6);
            c1Var2.f749d = -1;
            c1Var2.g = -1;
        }
        ArrayList arrayList3 = t0Var.f918b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                c1 c1Var3 = (c1) t0Var.f918b.get(i7);
                c1Var3.f749d = -1;
                c1Var3.g = -1;
            }
        }
    }

    public final void l(int i4, int i5) {
        boolean z3;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z3 = false;
        } else {
            this.L.onRelease();
            z3 = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.N.onRelease();
            z3 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.M.onRelease();
            z3 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.O.onRelease();
            z3 |= this.O.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f667y || this.G) {
            int i4 = f.f1759a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        b bVar = this.f635i;
        if (bVar.k()) {
            int i5 = bVar.f732a;
            if ((i5 & 4) == 0 || (i5 & 11) != 0) {
                if (bVar.k()) {
                    int i6 = f.f1759a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i7 = f.f1759a;
            Trace.beginSection("RV PartialInvalidate");
            b0();
            P();
            bVar.q();
            if (!this.A) {
                s sVar = this.f637j;
                int g = sVar.g();
                int i8 = 0;
                while (true) {
                    if (i8 < g) {
                        c1 I = I(sVar.f(i8));
                        if (I != null && !I.o() && I.k()) {
                            o();
                            break;
                        }
                        i8++;
                    } else {
                        bVar.c();
                        break;
                    }
                }
            }
            c0(true);
            Q(true);
            Trace.endSection();
        }
    }

    public final void n(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = k0.j0.f2752a;
        setMeasuredDimension(n0.g(i4, paddingRight, getMinimumWidth()), n0.g(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0354, code lost:
    
        if (((java.util.ArrayList) r21.f637j.f358d).contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0400  */
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
    public final void o() {
        boolean z3;
        c1 c1Var;
        View findViewById;
        boolean z4;
        i0 i0Var;
        ?? r3;
        RecyclerView recyclerView;
        boolean g;
        boolean z5;
        if (this.f651q == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f653r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z0 z0Var = this.f640k0;
        boolean z6 = false;
        z0Var.f961i = false;
        boolean z7 = true;
        boolean z8 = this.f670z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.f670z0 = false;
        if (z0Var.f958d == 1) {
            p();
            this.f653r.q0(this);
            q();
        } else {
            b bVar = this.f635i;
            if ((((ArrayList) bVar.f734d).isEmpty() || ((ArrayList) bVar.f733b).isEmpty()) && !z8 && this.f653r.f884n == getWidth() && this.f653r.f885o == getHeight()) {
                this.f653r.q0(this);
            } else {
                this.f653r.q0(this);
                q();
            }
        }
        z0Var.a(4);
        b0();
        P();
        z0Var.f958d = 1;
        boolean z9 = z0Var.f962j;
        t0 t0Var = this.g;
        a2.s sVar = this.f639k;
        if (z9) {
            int g4 = this.f637j.g() - 1;
            while (g4 >= 0) {
                c1 I = I(this.f637j.f(g4));
                if (I.o()) {
                    z5 = z7;
                } else {
                    long G = G(I);
                    this.P.getClass();
                    i0 i0Var2 = new i0();
                    i0Var2.a(I);
                    h hVar = (h) sVar.h;
                    n.j jVar = (n.j) sVar.g;
                    c1 c1Var2 = (c1) hVar.b(G);
                    if (c1Var2 == null || c1Var2.o()) {
                        z5 = z7;
                        sVar.a(I, i0Var2);
                    } else {
                        z5 = z7;
                        m1 m1Var = (m1) jVar.get(c1Var2);
                        boolean z10 = (m1Var == null || (m1Var.f849a & 1) == 0) ? false : z5;
                        m1 m1Var2 = (m1) jVar.get(I);
                        boolean z11 = (m1Var2 == null || (m1Var2.f849a & 1) == 0) ? false : z5;
                        if (z10 && c1Var2 == I) {
                            sVar.a(I, i0Var2);
                        } else {
                            i0 G2 = sVar.G(c1Var2, 4);
                            sVar.a(I, i0Var2);
                            i0 G3 = sVar.G(I, 8);
                            if (G2 == null) {
                                int g5 = this.f637j.g();
                                for (int i4 = 0; i4 < g5; i4++) {
                                    c1 I2 = I(this.f637j.f(i4));
                                    if (I2 != I && G(I2) == G) {
                                        e0 e0Var = this.f651q;
                                        if (e0Var == null || !e0Var.f772b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c1Var2 + " cannot be found but it is necessary for " + I + y());
                            } else {
                                c1Var2.n(false);
                                if (z10) {
                                    f(c1Var2);
                                }
                                if (c1Var2 != I) {
                                    if (z11) {
                                        f(I);
                                    }
                                    c1Var2.h = I;
                                    f(c1Var2);
                                    t0Var.k(c1Var2);
                                    I.n(false);
                                    I.f752i = c1Var2;
                                }
                                if (this.P.a(c1Var2, I, G2, G3)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                g4--;
                z7 = z5;
            }
            z3 = z7;
            n.j jVar2 = (n.j) sVar.g;
            int i5 = jVar2.h - 1;
            while (i5 >= 0) {
                c1 c1Var3 = (c1) jVar2.f(i5);
                m1 m1Var3 = (m1) jVar2.g(i5);
                int i6 = m1Var3.f849a;
                int i7 = i6 & 3;
                d0 d0Var = this.C0;
                if (i7 == 3) {
                    RecyclerView recyclerView2 = d0Var.f764a;
                    recyclerView2.f653r.j0(c1Var3.f747a, recyclerView2.g);
                    r3 = z6;
                } else if ((i6 & 1) != 0) {
                    i0 i0Var3 = m1Var3.f850b;
                    if (i0Var3 == null) {
                        RecyclerView recyclerView3 = d0Var.f764a;
                        recyclerView3.f653r.j0(c1Var3.f747a, recyclerView3.g);
                        r3 = z6;
                    } else {
                        d0Var.g(c1Var3, i0Var3, m1Var3.c);
                        r3 = z6;
                    }
                } else if ((i6 & 14) == 14) {
                    d0Var.f(c1Var3, m1Var3.f850b, m1Var3.c);
                    r3 = z6;
                } else if ((i6 & 12) == 12) {
                    i0 i0Var4 = m1Var3.f850b;
                    i0 i0Var5 = m1Var3.c;
                    d0Var.getClass();
                    c1Var3.n(z6);
                    RecyclerView recyclerView4 = d0Var.f764a;
                    if (!recyclerView4.G) {
                        b1.j jVar3 = (b1.j) recyclerView4.P;
                        jVar3.getClass();
                        int i8 = i0Var4.f801a;
                        int i9 = i0Var5.f801a;
                        if (i8 == i9 && i0Var4.f802b == i0Var5.f802b) {
                            jVar3.c(c1Var3);
                            recyclerView = recyclerView4;
                            g = false;
                        } else {
                            recyclerView = recyclerView4;
                            g = jVar3.g(c1Var3, i8, i0Var4.f802b, i9, i0Var5.f802b);
                        }
                        if (g) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.P.a(c1Var3, c1Var3, i0Var4, i0Var5)) {
                        recyclerView4.S();
                    }
                    r3 = 0;
                } else {
                    if ((i6 & 4) != 0) {
                        i0Var = null;
                        d0Var.g(c1Var3, m1Var3.f850b, null);
                    } else {
                        i0Var = null;
                        if ((i6 & 8) != 0) {
                            d0Var.f(c1Var3, m1Var3.f850b, m1Var3.c);
                        }
                    }
                    r3 = 0;
                    m1Var3.f849a = r3;
                    m1Var3.f850b = i0Var;
                    m1Var3.c = i0Var;
                    m1.f848d.c(m1Var3);
                    i5--;
                    z6 = false;
                }
                i0Var = null;
                m1Var3.f849a = r3;
                m1Var3.f850b = i0Var;
                m1Var3.c = i0Var;
                m1.f848d.c(m1Var3);
                i5--;
                z6 = false;
            }
        } else {
            z3 = true;
        }
        View view = null;
        this.f653r.i0(t0Var);
        z0Var.f957b = z0Var.f959e;
        this.G = false;
        this.H = false;
        z0Var.f962j = false;
        z0Var.f963k = false;
        this.f653r.f878f = false;
        ArrayList arrayList = t0Var.f918b;
        if (arrayList != null) {
            arrayList.clear();
        }
        n0 n0Var = this.f653r;
        if (n0Var.f881k) {
            n0Var.f880j = 0;
            n0Var.f881k = false;
            t0Var.l();
        }
        this.f653r.d0(z0Var);
        boolean z12 = z3;
        Q(z12);
        c0(false);
        ((n.j) sVar.g).clear();
        ((h) sVar.h).a();
        int[] iArr = this.f656s0;
        int i10 = iArr[0];
        int i11 = iArr[z12 ? 1 : 0];
        C(iArr);
        if ((iArr[0] == i10 && iArr[z12 ? 1 : 0] == i11) ? false : true) {
            t(0, 0);
        }
        if (this.f633g0 && this.f651q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j4 = z0Var.f965m;
            if (j4 != -1 && (z4 = this.f651q.f772b) && z4) {
                int n3 = this.f637j.n();
                int i12 = 0;
                c1Var = null;
                while (true) {
                    if (i12 >= n3) {
                        break;
                    }
                    c1 I3 = I(this.f637j.m(i12));
                    if (I3 != null && !I3.h() && I3.f750e == j4) {
                        if (!((ArrayList) this.f637j.f358d).contains(I3.f747a)) {
                            c1Var = I3;
                            break;
                        }
                        c1Var = I3;
                    }
                    i12++;
                }
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                View view2 = c1Var.f747a;
                if (!((ArrayList) this.f637j.f358d).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i13 = z0Var.f966n;
                        if (i13 != -1 && (findViewById = view.findViewById(i13)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f637j.g() > 0) {
                int i14 = z0Var.f964l;
                int i15 = i14 != -1 ? i14 : 0;
                int b2 = z0Var.b();
                for (int i16 = i15; i16 < b2; i16++) {
                    c1 E = E(i16);
                    if (E == null) {
                        break;
                    }
                    View view3 = E.f747a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b2, i15) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    c1 E2 = E(min);
                    if (E2 == null) {
                        break;
                    }
                    View view4 = E2.f747a;
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
        z0Var.f965m = -1L;
        z0Var.f964l = -1;
        z0Var.f966n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f4;
        super.onAttachedToWindow();
        this.I = 0;
        this.f663w = true;
        this.f667y = this.f667y && !isLayoutRequested();
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            n0Var.g = true;
            n0Var.R(this);
        }
        this.f652q0 = false;
        ThreadLocal threadLocal = q.f896j;
        q qVar = (q) threadLocal.get();
        this.f636i0 = qVar;
        if (qVar == null) {
            q qVar2 = new q();
            qVar2.f898f = new ArrayList();
            qVar2.f899i = new ArrayList();
            this.f636i0 = qVar2;
            WeakHashMap weakHashMap = k0.j0.f2752a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f4 = display.getRefreshRate();
            }
            f4 = 60.0f;
            q qVar3 = this.f636i0;
            qVar3.h = (long) (1.0E9f / f4);
            threadLocal.set(qVar3);
        }
        this.f636i0.f898f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x xVar;
        super.onDetachedFromWindow();
        j0 j0Var = this.P;
        if (j0Var != null) {
            j0Var.e();
        }
        setScrollState(0);
        b1 b1Var = this.f634h0;
        b1Var.f742l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var = this.f653r;
        if (n0Var != null && (xVar = n0Var.f877e) != null) {
            xVar.i();
        }
        this.f663w = false;
        n0 n0Var2 = this.f653r;
        if (n0Var2 != null) {
            n0Var2.g = false;
            n0Var2.S(this);
        }
        this.f666x0.clear();
        removeCallbacks(this.f668y0);
        this.f639k.getClass();
        while (m1.f848d.a() != null) {
        }
        q qVar = this.f636i0;
        if (qVar != null) {
            qVar.f898f.remove(this);
            this.f636i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f657t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((k0) arrayList.get(i4)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f5;
        n0 n0Var;
        if (this.f653r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f4 = this.f653r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f653r.d()) {
                    f5 = motionEvent.getAxisValue(10);
                    if (f4 == 0.0f || f5 != 0.0f) {
                        int i4 = (int) (f5 * this.f631e0);
                        int i5 = (int) (f4 * this.f0);
                        n0Var = this.f653r;
                        if (n0Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.f664w0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d4 = n0Var.d();
                            boolean e4 = this.f653r.e();
                            getScrollingChildHelper().g(e4 ? (d4 ? 1 : 0) | 2 : d4 ? 1 : 0, 1);
                            if (r(d4 ? i4 : 0, e4 ? i5 : 0, 1, this.f664w0, this.f660u0)) {
                                i4 -= iArr[0];
                                i5 -= iArr[1];
                            }
                            X(d4 ? i4 : 0, e4 ? i5 : 0, motionEvent, 1);
                            q qVar = this.f636i0;
                            if (qVar != null && (i4 != 0 || i5 != 0)) {
                                qVar.a(this, i4, i5);
                            }
                            d0(1);
                        }
                    }
                }
                f5 = 0.0f;
                if (f4 == 0.0f) {
                }
                int i42 = (int) (f5 * this.f631e0);
                int i52 = (int) (f4 * this.f0);
                n0Var = this.f653r;
                if (n0Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f653r.e()) {
                        f4 = -axisValue;
                        f5 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        int i422 = (int) (f5 * this.f631e0);
                        int i522 = (int) (f4 * this.f0);
                        n0Var = this.f653r;
                        if (n0Var == null) {
                        }
                    } else if (this.f653r.d()) {
                        f5 = axisValue;
                        f4 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        int i4222 = (int) (f5 * this.f631e0);
                        int i5222 = (int) (f4 * this.f0);
                        n0Var = this.f653r;
                        if (n0Var == null) {
                        }
                    }
                }
                f4 = 0.0f;
                f5 = 0.0f;
                if (f4 == 0.0f) {
                }
                int i42222 = (int) (f5 * this.f631e0);
                int i52222 = (int) (f4 * this.f0);
                n0Var = this.f653r;
                if (n0Var == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (!this.B) {
            this.f661v = null;
            if (B(motionEvent)) {
                W();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.f653r;
            if (n0Var != null) {
                boolean d4 = n0Var.d();
                boolean e4 = this.f653r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                this.S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.R = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.V = x3;
                    this.T = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.W = y3;
                    this.U = y3;
                    if (this.Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        d0(1);
                    }
                    int[] iArr = this.f662v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i4 = d4;
                    if (e4) {
                        i4 = (d4 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i4, 0);
                } else if (actionMasked == 1) {
                    this.S.clear();
                    d0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.R);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.Q != 1) {
                        int i5 = x4 - this.T;
                        int i6 = y4 - this.U;
                        if (d4 == 0 || Math.abs(i5) <= this.a0) {
                            z3 = false;
                        } else {
                            this.V = x4;
                            z3 = true;
                        }
                        if (e4 && Math.abs(i6) > this.a0) {
                            this.W = y4;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    W();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.R = motionEvent.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.V = x5;
                    this.T = x5;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.W = y5;
                    this.U = y5;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8 = f.f1759a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f667y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        n0 n0Var = this.f653r;
        if (n0Var == null) {
            n(i4, i5);
            return;
        }
        boolean L = n0Var.L();
        boolean z3 = false;
        z0 z0Var = this.f640k0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f653r.f875b.n(i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f670z0 = z3;
            if (z3 || this.f651q == null) {
                return;
            }
            if (z0Var.f958d == 1) {
                p();
            }
            this.f653r.r0(i4, i5);
            z0Var.f961i = true;
            q();
            this.f653r.t0(i4, i5);
            if (this.f653r.w0()) {
                this.f653r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                z0Var.f961i = true;
                q();
                this.f653r.t0(i4, i5);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.f665x) {
            this.f653r.f875b.n(i4, i5);
            return;
        }
        if (this.E) {
            b0();
            P();
            T();
            Q(true);
            if (z0Var.f963k) {
                z0Var.g = true;
            } else {
                this.f635i.d();
                z0Var.g = false;
            }
            this.E = false;
            c0(false);
        } else if (z0Var.f963k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e0 e0Var = this.f651q;
        if (e0Var != null) {
            z0Var.f959e = e0Var.a();
        } else {
            z0Var.f959e = 0;
        }
        b0();
        this.f653r.f875b.n(i4, i5);
        c0(false);
        z0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w0 w0Var = (w0) parcelable;
        this.h = w0Var;
        super.onRestoreInstanceState(w0Var.f3016f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w0 w0Var = new w0(super.onSaveInstanceState());
        w0 w0Var2 = this.h;
        if (w0Var2 != null) {
            w0Var.h = w0Var2.h;
            return w0Var;
        }
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            w0Var.h = n0Var.f0();
            return w0Var;
        }
        w0Var.h = null;
        return w0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0406, code lost:
    
        if (r2 < r5) goto L194;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        int i4;
        int minFlingVelocity;
        boolean z4;
        z zVar;
        float f4;
        int H;
        PointF a4;
        int i5;
        int i6;
        boolean z5;
        if (!this.B && !this.C) {
            n nVar = this.f661v;
            if (nVar == null) {
                z3 = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                int i7 = nVar.f852b;
                if (nVar.f869v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d4 = nVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c = nVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d4 || c) {
                            if (c) {
                                nVar.f870w = 1;
                                nVar.f863p = (int) motionEvent.getX();
                            } else if (d4) {
                                nVar.f870w = 2;
                                nVar.f860m = (int) motionEvent.getY();
                            }
                            nVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && nVar.f869v == 2) {
                        nVar.f860m = 0.0f;
                        nVar.f863p = 0.0f;
                        nVar.f(1);
                        nVar.f870w = 0;
                    } else if (motionEvent.getAction() == 2 && nVar.f869v == 2) {
                        nVar.g();
                        if (nVar.f870w == 1) {
                            float x3 = motionEvent.getX();
                            int[] iArr = nVar.f872y;
                            iArr[0] = i7;
                            int i8 = nVar.f864q - i7;
                            iArr[1] = i8;
                            float max = Math.max(i7, Math.min(i8, x3));
                            if (Math.abs(nVar.f862o - max) >= 2.0f) {
                                int e4 = n.e(nVar.f863p, max, iArr, nVar.f866s.computeHorizontalScrollRange(), nVar.f866s.computeHorizontalScrollOffset(), nVar.f864q);
                                if (e4 != 0) {
                                    nVar.f866s.scrollBy(e4, 0);
                                }
                                nVar.f863p = max;
                            }
                        }
                        if (nVar.f870w == 2) {
                            float y3 = motionEvent.getY();
                            int[] iArr2 = nVar.f871x;
                            iArr2[0] = i7;
                            int i9 = nVar.f865r - i7;
                            iArr2[1] = i9;
                            float max2 = Math.max(i7, Math.min(i9, y3));
                            if (Math.abs(nVar.f859l - max2) >= 2.0f) {
                                int e5 = n.e(nVar.f860m, max2, iArr2, nVar.f866s.computeVerticalScrollRange(), nVar.f866s.computeVerticalScrollOffset(), nVar.f865r);
                                if (e5 != 0) {
                                    nVar.f866s.scrollBy(0, e5);
                                }
                                nVar.f860m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f661v = null;
                }
                z3 = true;
            }
            if (z3) {
                W();
                setScrollState(0);
                return true;
            }
            n0 n0Var = this.f653r;
            if (n0Var != null) {
                boolean d5 = n0Var.d();
                boolean e6 = this.f653r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f662v0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.R = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.V = x4;
                    this.T = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.W = y4;
                    this.U = y4;
                    int i10 = d5;
                    if (e6) {
                        i10 = (d5 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.S.addMovement(obtain);
                        VelocityTracker velocityTracker = this.S;
                        int i11 = this.f630d0;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f5 = d5 != 0 ? -this.S.getXVelocity(this.R) : 0.0f;
                        float f6 = e6 ? -this.S.getYVelocity(this.R) : 0.0f;
                        if (f5 == 0.0f && f6 == 0.0f) {
                            i6 = 0;
                        } else {
                            int i12 = (int) f5;
                            int i13 = (int) f6;
                            n0 n0Var2 = this.f653r;
                            if (n0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                int d6 = n0Var2.d();
                                boolean e7 = this.f653r.e();
                                int i14 = this.f629c0;
                                if (d6 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e7 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f7 = i12;
                                    float f8 = i13;
                                    if (!dispatchNestedPreFling(f7, f8)) {
                                        boolean z6 = d6 != 0 || e7;
                                        dispatchNestedFling(f7, f8, z6);
                                        p0 p0Var = this.f628b0;
                                        if (p0Var != null) {
                                            a0 a0Var = (a0) p0Var;
                                            n0 layoutManager = a0Var.f729a.getLayoutManager();
                                            if (layoutManager != 0 && a0Var.f729a.getAdapter() != null && ((Math.abs(i13) > (minFlingVelocity = a0Var.f729a.getMinFlingVelocity()) || Math.abs(i12) > minFlingVelocity) && ((z4 = layoutManager instanceof y0)))) {
                                                if (z4) {
                                                    f4 = 0.0f;
                                                    zVar = new z(a0Var, a0Var.f729a.getContext());
                                                } else {
                                                    f4 = 0.0f;
                                                    zVar = null;
                                                }
                                                if (zVar != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        g e8 = layoutManager.e() ? a0Var.e(layoutManager) : layoutManager.d() ? a0Var.d(layoutManager) : null;
                                                        if (e8 != null) {
                                                            int v3 = layoutManager.v();
                                                            int i15 = Integer.MIN_VALUE;
                                                            int i16 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i4 = 1;
                                                            int i17 = 0;
                                                            while (i17 < v3) {
                                                                int i18 = v3;
                                                                View u3 = layoutManager.u(i17);
                                                                if (u3 == null) {
                                                                    i5 = i17;
                                                                } else {
                                                                    i5 = i17;
                                                                    int b2 = a0.b(u3, e8);
                                                                    if (b2 <= 0 && b2 > i15) {
                                                                        view2 = u3;
                                                                        i15 = b2;
                                                                    }
                                                                    if (b2 >= 0 && b2 < i16) {
                                                                        view = u3;
                                                                        i16 = b2;
                                                                    }
                                                                }
                                                                i17 = i5 + 1;
                                                                v3 = i18;
                                                            }
                                                            boolean z7 = !layoutManager.d() ? i13 <= 0 : i12 <= 0;
                                                            if (z7 && view != null) {
                                                                H = n0.H(view);
                                                            } else if (z7 || view2 == null) {
                                                                if (z7) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z4 && (a4 = ((y0) layoutManager).a(layoutManager.B() + (-1))) != null && ((a4.x > f4 ? 1 : (a4.x == f4 ? 0 : -1)) < 0 || (a4.y > f4 ? 1 : (a4.y == f4 ? 0 : -1)) < 0)) == z7 ? -1 : 1) + n0.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = n0.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                zVar.f936a = H;
                                                                layoutManager.z0(zVar);
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z6) {
                                                                if (e7) {
                                                                    d6 = (d6 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d6, i4);
                                                                int i19 = -i11;
                                                                int max3 = Math.max(i19, Math.min(i12, i11));
                                                                int max4 = Math.max(i19, Math.min(i13, i11));
                                                                b1 b1Var = this.f634h0;
                                                                RecyclerView recyclerView = b1Var.f742l;
                                                                recyclerView.setScrollState(2);
                                                                b1Var.g = 0;
                                                                b1Var.f738f = 0;
                                                                Interpolator interpolator = b1Var.f739i;
                                                                c0 c0Var = F0;
                                                                if (interpolator != c0Var) {
                                                                    b1Var.f739i = c0Var;
                                                                    b1Var.h = new OverScroller(recyclerView.getContext(), c0Var);
                                                                }
                                                                b1Var.h.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                b1Var.a();
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i4 = 1;
                                                    H = -1;
                                                    if (H != -1) {
                                                    }
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        }
                                        i4 = 1;
                                        if (z6) {
                                        }
                                    }
                                }
                            }
                            i6 = 0;
                        }
                        setScrollState(i6);
                        W();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.R);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i20 = this.V - x5;
                        int i21 = this.W - y5;
                        if (this.Q != 1) {
                            if (d5 != 0) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.a0) : Math.min(0, i20 + this.a0);
                                if (i20 != 0) {
                                    z5 = true;
                                    if (e6) {
                                        i21 = i21 > 0 ? Math.max(0, i21 - this.a0) : Math.min(0, i21 + this.a0);
                                        if (i21 != 0) {
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
                        int i22 = i20;
                        int i23 = i21;
                        if (this.Q == 1) {
                            int[] iArr4 = this.f664w0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r3 = r(d5 != 0 ? i22 : 0, e6 ? i23 : 0, 0, iArr4, this.f660u0);
                            int[] iArr5 = this.f660u0;
                            if (r3) {
                                i22 -= iArr4[0];
                                i23 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i24 = i23;
                            this.V = x5 - iArr5[0];
                            this.W = y5 - iArr5[1];
                            if (X(d5 != 0 ? i22 : 0, e6 ? i24 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            q qVar = this.f636i0;
                            if (qVar != null && (i22 != 0 || i24 != 0)) {
                                qVar.a(this, i22, i24);
                            }
                        }
                    } else if (actionMasked == 3) {
                        W();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.R = motionEvent.getPointerId(actionIndex);
                        int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.V = x6;
                        this.T = x6;
                        int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.W = y6;
                        this.U = y6;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                }
                this.S.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        int F;
        View view;
        m1 m1Var;
        View A;
        z0 z0Var = this.f640k0;
        z0Var.a(1);
        z(z0Var);
        z0Var.f961i = false;
        b0();
        a2.s sVar = this.f639k;
        n.j jVar = (n.j) sVar.g;
        n.j jVar2 = (n.j) sVar.g;
        jVar.clear();
        h hVar = (h) sVar.h;
        hVar.a();
        P();
        T();
        c1 c1Var = null;
        View focusedChild = (this.f633g0 && hasFocus() && this.f651q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (A = A(focusedChild)) != null) {
            c1Var = H(A);
        }
        if (c1Var == null) {
            z0Var.f965m = -1L;
            z0Var.f964l = -1;
            z0Var.f966n = -1;
        } else {
            z0Var.f965m = this.f651q.f772b ? c1Var.f750e : -1L;
            if (!this.G) {
                if (c1Var.h()) {
                    F = c1Var.f749d;
                } else {
                    RecyclerView recyclerView = c1Var.f761r;
                    if (recyclerView != null) {
                        F = recyclerView.F(c1Var);
                    }
                }
                z0Var.f964l = F;
                view = c1Var.f747a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                z0Var.f966n = id;
            }
            F = -1;
            z0Var.f964l = F;
            view = c1Var.f747a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            z0Var.f966n = id2;
        }
        z0Var.h = z0Var.f962j && this.f648o0;
        this.f648o0 = false;
        this.f646n0 = false;
        z0Var.g = z0Var.f963k;
        z0Var.f959e = this.f651q.a();
        C(this.f656s0);
        if (z0Var.f962j) {
            int g = this.f637j.g();
            for (int i4 = 0; i4 < g; i4++) {
                c1 I = I(this.f637j.f(i4));
                if (!I.o() && (!I.f() || this.f651q.f772b)) {
                    j0 j0Var = this.P;
                    j0.b(I);
                    I.c();
                    j0Var.getClass();
                    i0 i0Var = new i0();
                    i0Var.a(I);
                    m1 m1Var2 = (m1) jVar2.get(I);
                    if (m1Var2 == null) {
                        m1Var2 = m1.a();
                        jVar2.put(I, m1Var2);
                    }
                    m1Var2.f850b = i0Var;
                    m1Var2.f849a |= 4;
                    if (z0Var.h && I.k() && !I.h() && !I.o() && !I.f()) {
                        hVar.d(G(I), I);
                    }
                }
            }
        }
        if (z0Var.f963k) {
            int n3 = this.f637j.n();
            for (int i5 = 0; i5 < n3; i5++) {
                c1 I2 = I(this.f637j.m(i5));
                if (!I2.o() && I2.f749d == -1) {
                    I2.f749d = I2.c;
                }
            }
            boolean z3 = z0Var.f960f;
            z0Var.f960f = false;
            this.f653r.c0(this.g, z0Var);
            z0Var.f960f = z3;
            for (int i6 = 0; i6 < this.f637j.g(); i6++) {
                c1 I3 = I(this.f637j.f(i6));
                if (!I3.o() && ((m1Var = (m1) jVar2.get(I3)) == null || (m1Var.f849a & 4) == 0)) {
                    j0.b(I3);
                    boolean z4 = (I3.f753j & 8192) != 0;
                    j0 j0Var2 = this.P;
                    I3.c();
                    j0Var2.getClass();
                    i0 i0Var2 = new i0();
                    i0Var2.a(I3);
                    if (z4) {
                        U(I3, i0Var2);
                    } else {
                        m1 m1Var3 = (m1) jVar2.get(I3);
                        if (m1Var3 == null) {
                            m1Var3 = m1.a();
                            jVar2.put(I3, m1Var3);
                        }
                        m1Var3.f849a |= 2;
                        m1Var3.f850b = i0Var2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        c0(false);
        z0Var.f958d = 2;
    }

    public final void q() {
        b0();
        P();
        z0 z0Var = this.f640k0;
        z0Var.a(6);
        this.f635i.d();
        z0Var.f959e = this.f651q.a();
        z0Var.c = 0;
        if (this.h != null) {
            e0 e0Var = this.f651q;
            int a4 = e.a(e0Var.c);
            if (a4 == 1 ? e0Var.a() > 0 : a4 != 2) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.f653r.e0(parcelable);
                }
                this.h = null;
            }
        }
        z0Var.g = false;
        this.f653r.c0(this.g, z0Var);
        z0Var.f960f = false;
        z0Var.f962j = z0Var.f962j && this.P != null;
        z0Var.f958d = 4;
        Q(true);
        c0(false);
    }

    public final boolean r(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        c1 I = I(view);
        if (I != null) {
            if (I.j()) {
                I.f753j &= -257;
            } else if (!I.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        x xVar = this.f653r.f877e;
        if ((xVar == null || !xVar.f939e) && !L() && view2 != null) {
            V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f653r.l0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f659u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((n) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f669z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        n0 n0Var = this.f653r;
        if (n0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d4 = n0Var.d();
        boolean e4 = this.f653r.e();
        if (d4 || e4) {
            if (!d4) {
                i4 = 0;
            }
            if (!e4) {
                i5 = 0;
            }
            X(i4, i5, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e1 e1Var) {
        this.f654r0 = e1Var;
        k0.j0.m(this, e1Var);
    }

    public void setAdapter(e0 e0Var) {
        setLayoutFrozen(false);
        e0 e0Var2 = this.f651q;
        v0 v0Var = this.f632f;
        if (e0Var2 != null) {
            e0Var2.f771a.unregisterObserver(v0Var);
            this.f651q.getClass();
        }
        j0 j0Var = this.P;
        if (j0Var != null) {
            j0Var.e();
        }
        n0 n0Var = this.f653r;
        t0 t0Var = this.g;
        if (n0Var != null) {
            n0Var.h0(t0Var);
            this.f653r.i0(t0Var);
        }
        t0Var.f917a.clear();
        t0Var.e();
        b bVar = this.f635i;
        bVar.r((ArrayList) bVar.f733b);
        bVar.r((ArrayList) bVar.f734d);
        bVar.f732a = 0;
        e0 e0Var3 = this.f651q;
        this.f651q = e0Var;
        if (e0Var != null) {
            e0Var.f771a.registerObserver(v0Var);
        }
        n0 n0Var2 = this.f653r;
        if (n0Var2 != null) {
            n0Var2.Q();
        }
        e0 e0Var4 = this.f651q;
        t0Var.f917a.clear();
        t0Var.e();
        s0 c = t0Var.c();
        if (e0Var3 != null) {
            c.f912b--;
        }
        if (c.f912b == 0) {
            SparseArray sparseArray = c.f911a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ((r0) sparseArray.valueAt(i4)).f902a.clear();
            }
        }
        if (e0Var4 != null) {
            c.f912b++;
        }
        this.f640k0.f960f = true;
        this.H |= false;
        this.G = true;
        int n3 = this.f637j.n();
        for (int i5 = 0; i5 < n3; i5++) {
            c1 I = I(this.f637j.m(i5));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        t0 t0Var2 = this.g;
        ArrayList arrayList = t0Var2.c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            c1 c1Var = (c1) arrayList.get(i6);
            if (c1Var != null) {
                c1Var.a(6);
                c1Var.a(1024);
            }
        }
        e0 e0Var5 = t0Var2.h.f651q;
        if (e0Var5 == null || !e0Var5.f772b) {
            t0Var2.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f641l) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.f641l = z3;
        super.setClipToPadding(z3);
        if (this.f667y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h0 h0Var) {
        h0Var.getClass();
        this.K = h0Var;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f665x = z3;
    }

    public void setItemAnimator(j0 j0Var) {
        j0 j0Var2 = this.P;
        if (j0Var2 != null) {
            j0Var2.e();
            this.P.f816a = null;
        }
        this.P = j0Var;
        if (j0Var != null) {
            j0Var.f816a = this.f650p0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        t0 t0Var = this.g;
        t0Var.f920e = i4;
        t0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(n0 n0Var) {
        x xVar;
        if (n0Var == this.f653r) {
            return;
        }
        setScrollState(0);
        b1 b1Var = this.f634h0;
        b1Var.f742l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        n0 n0Var2 = this.f653r;
        if (n0Var2 != null && (xVar = n0Var2.f877e) != null) {
            xVar.i();
        }
        n0 n0Var3 = this.f653r;
        t0 t0Var = this.g;
        if (n0Var3 != null) {
            j0 j0Var = this.P;
            if (j0Var != null) {
                j0Var.e();
            }
            this.f653r.h0(t0Var);
            this.f653r.i0(t0Var);
            t0Var.f917a.clear();
            t0Var.e();
            if (this.f663w) {
                n0 n0Var4 = this.f653r;
                n0Var4.g = false;
                n0Var4.S(this);
            }
            this.f653r.u0(null);
            this.f653r = null;
        } else {
            t0Var.f917a.clear();
            t0Var.e();
        }
        s sVar = this.f637j;
        RecyclerView recyclerView = ((d0) sVar.f357b).f764a;
        ((c) sVar.c).h();
        ArrayList arrayList = (ArrayList) sVar.f358d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c1 I = I((View) arrayList.get(size));
            if (I != null) {
                int i4 = I.f759p;
                if (recyclerView.L()) {
                    I.f760q = i4;
                    recyclerView.f666x0.add(I);
                } else {
                    View view = I.f747a;
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    view.setImportantForAccessibility(i4);
                }
                I.f759p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f653r = n0Var;
        if (n0Var != null) {
            if (n0Var.f875b != null) {
                throw new IllegalArgumentException("LayoutManager " + n0Var + " is already attached to a RecyclerView:" + n0Var.f875b.y());
            }
            n0Var.u0(this);
            if (this.f663w) {
                n0 n0Var5 = this.f653r;
                n0Var5.g = true;
                n0Var5.R(this);
            }
        }
        t0Var.l();
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
    public void setNestedScrollingEnabled(boolean z3) {
        j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2750d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = k0.j0.f2752a;
            k0.b0.k(viewGroup);
        }
        scrollingChildHelper.f2750d = z3;
    }

    public void setOnFlingListener(p0 p0Var) {
        this.f628b0 = p0Var;
    }

    @Deprecated
    public void setOnScrollListener(q0 q0Var) {
        this.f642l0 = q0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f633g0 = z3;
    }

    public void setRecycledViewPool(s0 s0Var) {
        t0 t0Var = this.g;
        if (t0Var.g != null) {
            r1.f912b--;
        }
        t0Var.g = s0Var;
        if (s0Var == null || t0Var.h.getAdapter() == null) {
            return;
        }
        t0Var.g.f912b++;
    }

    public void setScrollState(int i4) {
        x xVar;
        if (i4 == this.Q) {
            return;
        }
        this.Q = i4;
        if (i4 != 2) {
            b1 b1Var = this.f634h0;
            b1Var.f742l.removeCallbacks(b1Var);
            b1Var.h.abortAnimation();
            n0 n0Var = this.f653r;
            if (n0Var != null && (xVar = n0Var.f877e) != null) {
                xVar.i();
            }
        }
        n0 n0Var2 = this.f653r;
        if (n0Var2 != null) {
            n0Var2.g0(i4);
        }
        q0 q0Var = this.f642l0;
        if (q0Var != null) {
            q0Var.a(this, i4);
        }
        ArrayList arrayList = this.f644m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q0) this.f644m0.get(size)).a(this, i4);
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a1 a1Var) {
        this.g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        x xVar;
        if (z3 != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.B = false;
                if (this.A && this.f653r != null && this.f651q != null) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            b1 b1Var = this.f634h0;
            b1Var.f742l.removeCallbacks(b1Var);
            b1Var.h.abortAnimation();
            n0 n0Var = this.f653r;
            if (n0Var == null || (xVar = n0Var.f877e) == null) {
                return;
            }
            xVar.i();
        }
    }

    public final void t(int i4, int i5) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        q0 q0Var = this.f642l0;
        if (q0Var != null) {
            q0Var.b(this, i4, i5);
        }
        ArrayList arrayList = this.f644m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q0) this.f644m0.get(size)).b(this, i4, i5);
            }
        }
        this.J--;
    }

    public final void u() {
        if (this.O != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.f641l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.L != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f641l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.N != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f641l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f641l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f651q + ", layout:" + this.f653r + ", context:" + getContext();
    }

    public final void z(z0 z0Var) {
        if (getScrollState() != 2) {
            z0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f634h0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        z0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        char c;
        boolean z3;
        char c4;
        TypedArray typedArray;
        int i5;
        Constructor constructor;
        this.f632f = new v0(this);
        this.g = new t0(this);
        this.f639k = new a2.s(10);
        this.f643m = new b0(this, 0);
        this.f645n = new Rect();
        this.f647o = new Rect();
        this.f649p = new RectF();
        this.f655s = new ArrayList();
        this.f657t = new ArrayList();
        this.f659u = new ArrayList();
        this.f669z = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new h0();
        b1.j jVar = new b1.j();
        Object[] objArr = null;
        jVar.f816a = null;
        jVar.f817b = new ArrayList();
        jVar.c = 120L;
        jVar.f818d = 120L;
        jVar.f819e = 250L;
        jVar.f820f = 250L;
        jVar.g = true;
        jVar.h = new ArrayList();
        jVar.f806i = new ArrayList();
        jVar.f807j = new ArrayList();
        jVar.f808k = new ArrayList();
        jVar.f809l = new ArrayList();
        jVar.f810m = new ArrayList();
        jVar.f811n = new ArrayList();
        jVar.f812o = new ArrayList();
        jVar.f813p = new ArrayList();
        jVar.f814q = new ArrayList();
        jVar.f815r = new ArrayList();
        this.P = jVar;
        this.Q = 0;
        this.R = -1;
        this.f631e0 = Float.MIN_VALUE;
        this.f0 = Float.MIN_VALUE;
        this.f633g0 = true;
        this.f634h0 = new b1(this);
        this.f638j0 = new o();
        z0 z0Var = new z0();
        z0Var.f956a = -1;
        z0Var.f957b = 0;
        z0Var.c = 0;
        z0Var.f958d = 1;
        z0Var.f959e = 0;
        z0Var.f960f = false;
        z0Var.g = false;
        z0Var.h = false;
        z0Var.f961i = false;
        z0Var.f962j = false;
        z0Var.f963k = false;
        this.f640k0 = z0Var;
        this.f646n0 = false;
        this.f648o0 = false;
        d0 d0Var = new d0(this);
        this.f650p0 = d0Var;
        this.f652q0 = false;
        this.f656s0 = new int[2];
        this.f660u0 = new int[2];
        this.f662v0 = new int[2];
        this.f664w0 = new int[2];
        this.f666x0 = new ArrayList();
        this.f668y0 = new b0(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new d0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.f631e0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f629c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f630d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.f816a = d0Var;
        this.f635i = new b(new d0(this));
        this.f637j = new s(new d0(this));
        WeakHashMap weakHashMap = k0.j0.f2752a;
        if (k0.d0.a(this) == 0) {
            k0.d0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e1(this));
        int[] iArr = a1.a.f2a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        k0.j0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i4);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f641l = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c = 3;
            c4 = 2;
            z3 = 1;
            typedArray = obtainStyledAttributes;
            i5 = 4;
            new n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.gglhk.bofio.fortunetiger.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            z3 = 1;
            c4 = 2;
            typedArray = obtainStyledAttributes;
            i5 = 4;
        }
        typedArray.recycle();
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(n0.class);
                    try {
                        constructor = asSubclass.getConstructor(E0);
                        Object[] objArr2 = new Object[i5];
                        objArr2[0] = context;
                        objArr2[z3] = attributeSet;
                        objArr2[c4] = Integer.valueOf(i4);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((n0) constructor.newInstance(objArr));
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
        int[] iArr2 = D0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        k0.j0.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n0 n0Var = this.f653r;
        if (n0Var != null) {
            return n0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Deprecated
    public void setRecyclerListener(u0 u0Var) {
    }
}
