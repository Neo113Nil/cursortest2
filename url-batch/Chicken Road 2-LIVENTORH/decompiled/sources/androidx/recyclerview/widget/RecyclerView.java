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
import android.os.Build;
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
import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import f1.a;
import f1.a0;
import f1.a1;
import f1.b;
import f1.b0;
import f1.b1;
import f1.c;
import f1.c0;
import f1.d0;
import f1.d1;
import f1.f0;
import f1.g0;
import f1.h0;
import f1.i0;
import f1.j0;
import f1.l1;
import f1.m;
import f1.m0;
import f1.n;
import f1.n0;
import f1.o0;
import f1.p;
import f1.p0;
import f1.q0;
import f1.r0;
import f1.s0;
import f1.t0;
import f1.u0;
import f1.v0;
import f1.w;
import f1.x0;
import f1.y;
import f1.y0;
import f1.z;
import f1.z0;
import j0.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.k;
import n0.l0;
import q.h;
import q.j;
import t.e;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final b0 F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final c0 C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public g0 K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public i0 P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f659a0;

    /* renamed from: b0, reason: collision with root package name */
    public o0 f660b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f661c0;
    public final int d0;

    /* renamed from: e0, reason: collision with root package name */
    public final float f662e0;

    /* renamed from: f, reason: collision with root package name */
    public final u0 f663f;

    /* renamed from: f0, reason: collision with root package name */
    public final float f664f0;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f665g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f666g0;

    /* renamed from: h, reason: collision with root package name */
    public v0 f667h;

    /* renamed from: h0, reason: collision with root package name */
    public final a1 f668h0;
    public final b i;
    public p i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f669j;

    /* renamed from: j0, reason: collision with root package name */
    public final n f670j0;

    /* renamed from: k, reason: collision with root package name */
    public final q f671k;

    /* renamed from: k0, reason: collision with root package name */
    public final y0 f672k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f673l;

    /* renamed from: l0, reason: collision with root package name */
    public p0 f674l0;

    /* renamed from: m, reason: collision with root package name */
    public final a0 f675m;

    /* renamed from: m0, reason: collision with root package name */
    public ArrayList f676m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f677n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f678n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f679o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f680o0;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f681p;

    /* renamed from: p0, reason: collision with root package name */
    public final c0 f682p0;

    /* renamed from: q, reason: collision with root package name */
    public d0 f683q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f684q0;

    /* renamed from: r, reason: collision with root package name */
    public m0 f685r;

    /* renamed from: r0, reason: collision with root package name */
    public d1 f686r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f687s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f688s0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f689t;

    /* renamed from: t0, reason: collision with root package name */
    public k f690t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f691u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f692u0;

    /* renamed from: v, reason: collision with root package name */
    public m f693v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f694v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f695w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f696w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f697x;

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f698x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f699y;

    /* renamed from: y0, reason: collision with root package name */
    public final a0 f700y0;

    /* renamed from: z, reason: collision with root package name */
    public int f701z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f702z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new b0(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.recyclerViewStyle);
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
        for (int i = 0; i < childCount; i++) {
            RecyclerView D = D(viewGroup.getChildAt(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static b1 I(View view) {
        if (view == null) {
            return null;
        }
        return ((n0) view.getLayoutParams()).f1460a;
    }

    private k getScrollingChildHelper() {
        if (this.f690t0 == null) {
            this.f690t0 = new k(this);
        }
        return this.f690t0;
    }

    public static void j(b1 b1Var) {
        WeakReference weakReference = b1Var.f1310b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == b1Var.f1309a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            b1Var.f1310b = null;
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
        ArrayList arrayList = this.f691u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) arrayList.get(i);
            int i4 = mVar.f1439v;
            if (i4 == 1) {
                boolean d = mVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c4 = mVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c4)) {
                    if (c4) {
                        mVar.f1440w = 1;
                        mVar.f1433p = (int) motionEvent.getX();
                    } else if (d) {
                        mVar.f1440w = 2;
                        mVar.f1430m = (int) motionEvent.getY();
                    }
                    mVar.f(2);
                    if (action == 3) {
                        this.f693v = mVar;
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

    public final void C(int[] iArr) {
        int l4 = this.f669j.l();
        if (l4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < l4; i5++) {
            b1 I = I(this.f669j.k(i5));
            if (!I.o()) {
                int b4 = I.b();
                if (b4 < i) {
                    i = b4;
                }
                if (b4 > i4) {
                    i4 = b4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
    }

    public final b1 E(int i) {
        b1 b1Var = null;
        if (this.G) {
            return null;
        }
        int s3 = this.f669j.s();
        for (int i4 = 0; i4 < s3; i4++) {
            b1 I = I(this.f669j.r(i4));
            if (I != null && !I.h() && F(I) == i) {
                if (!((ArrayList) this.f669j.d).contains(I.f1309a)) {
                    return I;
                }
                b1Var = I;
            }
        }
        return b1Var;
    }

    public final int F(b1 b1Var) {
        if ((b1Var.f1316j & 524) == 0 && b1Var.e()) {
            int i = b1Var.f1311c;
            ArrayList arrayList = (ArrayList) this.i.f1304c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) arrayList.get(i4);
                int i5 = aVar.f1291a;
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = aVar.f1292b;
                        if (i6 <= i) {
                            int i7 = aVar.d;
                            if (i6 + i7 <= i) {
                                i -= i7;
                            }
                        } else {
                            continue;
                        }
                    } else if (i5 == 8) {
                        int i8 = aVar.f1292b;
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
                } else if (aVar.f1292b <= i) {
                    i += aVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(b1 b1Var) {
        return this.f683q.f1334b ? b1Var.f1312e : b1Var.f1311c;
    }

    public final b1 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        n0 n0Var = (n0) view.getLayoutParams();
        boolean z3 = n0Var.f1462c;
        Rect rect = n0Var.f1461b;
        if (!z3 || (this.f672k0.f1541g && (n0Var.f1460a.k() || n0Var.f1460a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f689t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f677n;
            rect2.set(0, 0, 0, 0);
            ((j0) arrayList.get(i)).getClass();
            ((n0) view.getLayoutParams()).f1460a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        n0Var.f1462c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f699y || this.G || this.i.j();
    }

    public final boolean L() {
        return this.I > 0;
    }

    public final void M(int i) {
        if (this.f685r == null) {
            return;
        }
        setScrollState(2);
        this.f685r.o0(i);
        awakenScrollBars();
    }

    public final void N() {
        int s3 = this.f669j.s();
        for (int i = 0; i < s3; i++) {
            ((n0) this.f669j.r(i).getLayoutParams()).f1462c = true;
        }
        ArrayList arrayList = this.f665g.f1492c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n0 n0Var = (n0) ((b1) arrayList.get(i4)).f1309a.getLayoutParams();
            if (n0Var != null) {
                n0Var.f1462c = true;
            }
        }
    }

    public final void O(int i, int i4, boolean z3) {
        int i5 = i + i4;
        int s3 = this.f669j.s();
        for (int i6 = 0; i6 < s3; i6++) {
            b1 I = I(this.f669j.r(i6));
            if (I != null && !I.o()) {
                int i7 = I.f1311c;
                y0 y0Var = this.f672k0;
                if (i7 >= i5) {
                    I.l(-i4, z3);
                    y0Var.f1540f = true;
                } else if (i7 >= i) {
                    I.a(8);
                    I.l(-i4, z3);
                    I.f1311c = i - 1;
                    y0Var.f1540f = true;
                }
            }
        }
        s0 s0Var = this.f665g;
        ArrayList arrayList = s0Var.f1492c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b1 b1Var = (b1) arrayList.get(size);
            if (b1Var != null) {
                int i8 = b1Var.f1311c;
                if (i8 >= i5) {
                    b1Var.l(-i4, z3);
                } else if (i8 >= i) {
                    b1Var.a(8);
                    s0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.I++;
    }

    public final void Q(boolean z3) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.I - 1;
        this.I = i4;
        if (i4 < 1) {
            this.I = 0;
            if (z3) {
                int i5 = this.D;
                this.D = 0;
                if (i5 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f698x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) arrayList.get(size);
                    if (b1Var.f1309a.getParent() == this && !b1Var.o() && (i = b1Var.f1323q) != -1) {
                        View view = b1Var.f1309a;
                        WeakHashMap weakHashMap = l0.f2757a;
                        view.setImportantForAccessibility(i);
                        b1Var.f1323q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i);
            int x3 = (int) (motionEvent.getX(i) + 0.5f);
            this.V = x3;
            this.T = x3;
            int y3 = (int) (motionEvent.getY(i) + 0.5f);
            this.W = y3;
            this.U = y3;
        }
    }

    public final void S() {
        if (this.f684q0 || !this.f695w) {
            return;
        }
        WeakHashMap weakHashMap = l0.f2757a;
        postOnAnimation(this.f700y0);
        this.f684q0 = true;
    }

    public final void T() {
        boolean z3;
        boolean z4 = false;
        if (this.G) {
            b bVar = this.i;
            bVar.q((ArrayList) bVar.f1304c);
            bVar.q((ArrayList) bVar.d);
            bVar.f1302a = 0;
            if (this.H) {
                this.f685r.Y();
            }
        }
        if (this.P == null || !this.f685r.A0()) {
            this.i.d();
        } else {
            this.i.p();
        }
        boolean z5 = this.f678n0 || this.f680o0;
        boolean z6 = this.f699y && this.P != null && ((z3 = this.G) || z5 || this.f685r.f1448f) && (!z3 || this.f683q.f1334b);
        y0 y0Var = this.f672k0;
        y0Var.f1543j = z6;
        if (z6 && z5 && !this.G && this.P != null && this.f685r.A0()) {
            z4 = true;
        }
        y0Var.f1544k = z4;
    }

    public final void U(b1 b1Var, h0 h0Var) {
        b1Var.f1316j &= -8193;
        boolean z3 = this.f672k0.f1542h;
        q qVar = this.f671k;
        if (z3 && b1Var.k() && !b1Var.h() && !b1Var.o()) {
            ((h) qVar.f347h).d(G(b1Var), b1Var);
        }
        j jVar = (j) qVar.f346g;
        l1 l1Var = (l1) jVar.get(b1Var);
        if (l1Var == null) {
            l1Var = l1.a();
            jVar.put(b1Var, l1Var);
        }
        l1Var.f1418b = h0Var;
        l1Var.f1417a |= 4;
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f677n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n0) {
            n0 n0Var = (n0) layoutParams;
            if (!n0Var.f1462c) {
                Rect rect2 = n0Var.f1461b;
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
        this.f685r.l0(this, view, this.f677n, !this.f699y, view2 == null);
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
            WeakHashMap weakHashMap = l0.f2757a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(int i, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        m();
        d0 d0Var = this.f683q;
        int[] iArr = this.f696w0;
        if (d0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Y(i, i4, iArr);
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
        if (!this.f689t.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i6, i7, i8, i9, this.f692u0, i5, iArr);
        int i10 = iArr[0];
        int i11 = i8 - i10;
        int i12 = iArr[1];
        int i13 = i9 - i12;
        boolean z5 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.V;
        int[] iArr2 = this.f692u0;
        int i15 = iArr2[0];
        this.V = i14 - i15;
        int i16 = this.W;
        int i17 = iArr2[1];
        this.W = i16 - i17;
        int[] iArr3 = this.f694v0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z3 = true;
            } else {
                float x3 = motionEvent.getX();
                float f2 = i11;
                float y3 = motionEvent.getY();
                float f4 = i13;
                if (f2 < 0.0f) {
                    v();
                    z3 = true;
                    r0.b.a(this.L, (-f2) / getWidth(), 1.0f - (y3 / getHeight()));
                } else {
                    z3 = true;
                    if (f2 > 0.0f) {
                        w();
                        r0.b.a(this.N, f2 / getWidth(), y3 / getHeight());
                    } else {
                        z4 = false;
                        if (f4 >= 0.0f) {
                            x();
                            r0.b.a(this.M, (-f4) / getHeight(), x3 / getWidth());
                        } else {
                            if (f4 > 0.0f) {
                                u();
                                r0.b.a(this.O, f4 / getHeight(), 1.0f - (x3 / getWidth()));
                            }
                            if (!z4 || f2 != 0.0f || f4 != 0.0f) {
                                WeakHashMap weakHashMap = l0.f2757a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z4 = z3;
                        if (!z4) {
                        }
                        WeakHashMap weakHashMap2 = l0.f2757a;
                        postInvalidateOnAnimation();
                    }
                }
                z4 = z3;
                if (f4 >= 0.0f) {
                }
                z4 = z3;
                if (!z4) {
                }
                WeakHashMap weakHashMap22 = l0.f2757a;
                postInvalidateOnAnimation();
            }
            l(i, i4);
        } else {
            z3 = true;
        }
        if (i6 != 0 || i7 != 0) {
            t(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z5 && i6 == 0 && i7 == 0) {
            return false;
        }
        return z3;
    }

    public final void Y(int i, int i4, int[] iArr) {
        b1 b1Var;
        b0();
        P();
        int i5 = g.f1893a;
        Trace.beginSection("RV Scroll");
        y0 y0Var = this.f672k0;
        z(y0Var);
        s0 s0Var = this.f665g;
        int n02 = i != 0 ? this.f685r.n0(i, s0Var, y0Var) : 0;
        int p02 = i4 != 0 ? this.f685r.p0(i4, s0Var, y0Var) : 0;
        Trace.endSection();
        t tVar = this.f669j;
        int l4 = tVar.l();
        for (int i6 = 0; i6 < l4; i6++) {
            View k4 = tVar.k(i6);
            b1 H = H(k4);
            if (H != null && (b1Var = H.i) != null) {
                View view = b1Var.f1309a;
                int left = k4.getLeft();
                int top = k4.getTop();
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

    public final void Z(int i) {
        w wVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        a1 a1Var = this.f668h0;
        a1Var.f1301l.removeCallbacks(a1Var);
        a1Var.f1298h.abortAnimation();
        m0 m0Var = this.f685r;
        if (m0Var != null && (wVar = m0Var.f1447e) != null) {
            wVar.i();
        }
        m0 m0Var2 = this.f685r;
        if (m0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            m0Var2.o0(i);
            awakenScrollBars();
        }
    }

    public final void a0(int i, int i4, boolean z3) {
        m0 m0Var = this.f685r;
        if (m0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!m0Var.d()) {
            i = 0;
        }
        if (!this.f685r.e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z3) {
            int i5 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        this.f668h0.b(i, i4, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            m0Var.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    public final void b0() {
        int i = this.f701z + 1;
        this.f701z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    public final void c0(boolean z3) {
        if (this.f701z < 1) {
            this.f701z = 1;
        }
        if (!z3 && !this.B) {
            this.A = false;
        }
        if (this.f701z == 1) {
            if (z3 && this.A && !this.B && this.f685r != null && this.f683q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.f701z--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n0) && this.f685r.f((n0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.d()) {
            return this.f685r.j(this.f672k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.d()) {
            return this.f685r.k(this.f672k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.d()) {
            return this.f685r.l(this.f672k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.e()) {
            return this.f685r.m(this.f672k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.e()) {
            return this.f685r.n(this.f672k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m0 m0Var = this.f685r;
        if (m0Var != null && m0Var.e()) {
            return this.f685r.o(this.f672k0);
        }
        return 0;
    }

    public final void d0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return getScrollingChildHelper().a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return getScrollingChildHelper().b(f2, f4);
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
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f689t;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            ((j0) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f673l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f673l) {
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
            int paddingTop = this.f673l ? getPaddingTop() : 0;
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
            if (this.f673l) {
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
            WeakHashMap weakHashMap = l0.f2757a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void f(b1 b1Var) {
        View view = b1Var.f1309a;
        boolean z3 = view.getParent() == this;
        this.f665g.k(H(view));
        if (b1Var.j()) {
            this.f669j.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f669j.f(view, -1, true);
            return;
        }
        t tVar = this.f669j;
        int indexOfChild = ((c0) tVar.f355b).f1328a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((c) tVar.f356c).h(indexOfChild);
            tVar.u(view);
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
    public final View focusSearch(View view, int i) {
        View view2;
        int i4;
        char c4;
        boolean z3;
        this.f685r.getClass();
        boolean z4 = true;
        boolean z5 = (this.f683q == null || this.f685r == null || L() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        y0 y0Var = this.f672k0;
        s0 s0Var = this.f665g;
        if (z5 && (i == 2 || i == 1)) {
            if (this.f685r.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z3 = true;
                    if (!z3 && this.f685r.d()) {
                        z3 = focusFinder.findNextFocus(this, view, !((this.f685r.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z3) {
                        m();
                        if (A(view) != null) {
                            b0();
                            this.f685r.T(view, i, s0Var, y0Var);
                            c0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
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
                if (focusFinder.findNextFocus(this, view, !((this.f685r.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z3) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z4 = false;
            if (z4) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z5) {
                m();
                if (A(view) != null) {
                    b0();
                    view2 = this.f685r.T(view, i, s0Var, y0Var);
                    c0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
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
                    Rect rect = this.f677n;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f679o;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i5 = this.f685r.C() == 1 ? -1 : 1;
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
                        c4 = 1;
                    } else {
                        int i12 = rect.bottom;
                        int i13 = rect2.bottom;
                        c4 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i + y());
                                        }
                                    }
                                }
                            }
                        } else if (c4 <= 0) {
                            if (c4 == 0) {
                            }
                        }
                    } else if (c4 >= 0) {
                        if (c4 == 0) {
                        }
                    }
                }
                return z4 ? view2 : super.focusSearch(view, i);
            }
            z4 = false;
            if (z4) {
            }
        }
    }

    public final void g(j0 j0Var) {
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            m0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f689t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(j0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            return m0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            return m0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d0 getAdapter() {
        return this.f683q;
    }

    @Override // android.view.View
    public int getBaseline() {
        m0 m0Var = this.f685r;
        if (m0Var == null) {
            return super.getBaseline();
        }
        m0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f673l;
    }

    public d1 getCompatAccessibilityDelegate() {
        return this.f686r0;
    }

    public g0 getEdgeEffectFactory() {
        return this.K;
    }

    public i0 getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.f689t.size();
    }

    public m0 getLayoutManager() {
        return this.f685r;
    }

    public int getMaxFlingVelocity() {
        return this.d0;
    }

    public int getMinFlingVelocity() {
        return this.f661c0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o0 getOnFlingListener() {
        return this.f660b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f666g0;
    }

    public r0 getRecycledViewPool() {
        return this.f665g.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(p0 p0Var) {
        if (this.f676m0 == null) {
            this.f676m0 = new ArrayList();
        }
        this.f676m0.add(p0Var);
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
        return this.f695w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int s3 = this.f669j.s();
        for (int i = 0; i < s3; i++) {
            b1 I = I(this.f669j.r(i));
            if (!I.o()) {
                I.d = -1;
                I.f1314g = -1;
            }
        }
        s0 s0Var = this.f665g;
        ArrayList arrayList = s0Var.f1490a;
        ArrayList arrayList2 = s0Var.f1492c;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            b1 b1Var = (b1) arrayList2.get(i4);
            b1Var.d = -1;
            b1Var.f1314g = -1;
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            b1 b1Var2 = (b1) arrayList.get(i5);
            b1Var2.d = -1;
            b1Var2.f1314g = -1;
        }
        ArrayList arrayList3 = s0Var.f1491b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                b1 b1Var3 = (b1) s0Var.f1491b.get(i6);
                b1Var3.d = -1;
                b1Var3.f1314g = -1;
            }
        }
    }

    public final void l(int i, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z3 = false;
        } else {
            this.L.onRelease();
            z3 = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.N.onRelease();
            z3 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.M.onRelease();
            z3 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.O.onRelease();
            z3 |= this.O.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = l0.f2757a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f699y || this.G) {
            int i = g.f1893a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        b bVar = this.i;
        if (bVar.j()) {
            int i4 = bVar.f1302a;
            if ((i4 & 4) == 0 || (i4 & 11) != 0) {
                if (bVar.j()) {
                    int i5 = g.f1893a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i6 = g.f1893a;
            Trace.beginSection("RV PartialInvalidate");
            b0();
            P();
            bVar.p();
            if (!this.A) {
                t tVar = this.f669j;
                int l4 = tVar.l();
                int i7 = 0;
                while (true) {
                    if (i7 < l4) {
                        b1 I = I(tVar.k(i7));
                        if (I != null && !I.o() && I.k()) {
                            o();
                            break;
                        }
                        i7++;
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

    public final void n(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = l0.f2757a;
        setMeasuredDimension(m0.g(i, paddingRight, getMinimumWidth()), m0.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0354, code lost:
    
        if (((java.util.ArrayList) r21.f669j.d).contains(getFocusedChild()) == false) goto L225;
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
        b1 b1Var;
        View findViewById;
        boolean z4;
        h0 h0Var;
        ?? r3;
        RecyclerView recyclerView;
        boolean g4;
        boolean z5;
        if (this.f683q == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f685r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        y0 y0Var = this.f672k0;
        boolean z6 = false;
        y0Var.i = false;
        boolean z7 = true;
        boolean z8 = this.f702z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.f702z0 = false;
        if (y0Var.d == 1) {
            p();
            this.f685r.q0(this);
            q();
        } else {
            b bVar = this.i;
            if ((((ArrayList) bVar.d).isEmpty() || ((ArrayList) bVar.f1304c).isEmpty()) && !z8 && this.f685r.f1455n == getWidth() && this.f685r.f1456o == getHeight()) {
                this.f685r.q0(this);
            } else {
                this.f685r.q0(this);
                q();
            }
        }
        y0Var.a(4);
        b0();
        P();
        y0Var.d = 1;
        boolean z9 = y0Var.f1543j;
        s0 s0Var = this.f665g;
        q qVar = this.f671k;
        if (z9) {
            int l4 = this.f669j.l() - 1;
            while (l4 >= 0) {
                b1 I = I(this.f669j.k(l4));
                if (I.o()) {
                    z5 = z7;
                } else {
                    long G = G(I);
                    this.P.getClass();
                    h0 h0Var2 = new h0();
                    h0Var2.a(I);
                    h hVar = (h) qVar.f347h;
                    j jVar = (j) qVar.f346g;
                    b1 b1Var2 = (b1) hVar.b(G);
                    if (b1Var2 == null || b1Var2.o()) {
                        z5 = z7;
                        qVar.a(I, h0Var2);
                    } else {
                        z5 = z7;
                        l1 l1Var = (l1) jVar.get(b1Var2);
                        boolean z10 = (l1Var == null || (l1Var.f1417a & 1) == 0) ? false : z5;
                        l1 l1Var2 = (l1) jVar.get(I);
                        boolean z11 = (l1Var2 == null || (l1Var2.f1417a & 1) == 0) ? false : z5;
                        if (z10 && b1Var2 == I) {
                            qVar.a(I, h0Var2);
                        } else {
                            h0 E = qVar.E(b1Var2, 4);
                            qVar.a(I, h0Var2);
                            h0 E2 = qVar.E(I, 8);
                            if (E == null) {
                                int l5 = this.f669j.l();
                                for (int i = 0; i < l5; i++) {
                                    b1 I2 = I(this.f669j.k(i));
                                    if (I2 != I && G(I2) == G) {
                                        d0 d0Var = this.f683q;
                                        if (d0Var == null || !d0Var.f1334b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b1Var2 + " cannot be found but it is necessary for " + I + y());
                            } else {
                                b1Var2.n(false);
                                if (z10) {
                                    f(b1Var2);
                                }
                                if (b1Var2 != I) {
                                    if (z11) {
                                        f(I);
                                    }
                                    b1Var2.f1315h = I;
                                    f(b1Var2);
                                    s0Var.k(b1Var2);
                                    I.n(false);
                                    I.i = b1Var2;
                                }
                                if (this.P.a(b1Var2, I, E, E2)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                l4--;
                z7 = z5;
            }
            z3 = z7;
            j jVar2 = (j) qVar.f346g;
            int i4 = jVar2.f3036h - 1;
            while (i4 >= 0) {
                b1 b1Var3 = (b1) jVar2.f(i4);
                l1 l1Var3 = (l1) jVar2.g(i4);
                int i5 = l1Var3.f1417a;
                int i6 = i5 & 3;
                c0 c0Var = this.C0;
                if (i6 == 3) {
                    RecyclerView recyclerView2 = c0Var.f1328a;
                    recyclerView2.f685r.j0(b1Var3.f1309a, recyclerView2.f665g);
                    r3 = z6;
                } else if ((i5 & 1) != 0) {
                    h0 h0Var3 = l1Var3.f1418b;
                    if (h0Var3 == null) {
                        RecyclerView recyclerView3 = c0Var.f1328a;
                        recyclerView3.f685r.j0(b1Var3.f1309a, recyclerView3.f665g);
                        r3 = z6;
                    } else {
                        c0Var.g(b1Var3, h0Var3, l1Var3.f1419c);
                        r3 = z6;
                    }
                } else if ((i5 & 14) == 14) {
                    c0Var.f(b1Var3, l1Var3.f1418b, l1Var3.f1419c);
                    r3 = z6;
                } else if ((i5 & 12) == 12) {
                    h0 h0Var4 = l1Var3.f1418b;
                    h0 h0Var5 = l1Var3.f1419c;
                    c0Var.getClass();
                    b1Var3.n(z6);
                    RecyclerView recyclerView4 = c0Var.f1328a;
                    if (!recyclerView4.G) {
                        f1.j jVar3 = (f1.j) recyclerView4.P;
                        jVar3.getClass();
                        int i7 = h0Var4.f1364a;
                        int i8 = h0Var5.f1364a;
                        if (i7 == i8 && h0Var4.f1365b == h0Var5.f1365b) {
                            jVar3.c(b1Var3);
                            recyclerView = recyclerView4;
                            g4 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g4 = jVar3.g(b1Var3, i7, h0Var4.f1365b, i8, h0Var5.f1365b);
                        }
                        if (g4) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.P.a(b1Var3, b1Var3, h0Var4, h0Var5)) {
                        recyclerView4.S();
                    }
                    r3 = 0;
                } else {
                    if ((i5 & 4) != 0) {
                        h0Var = null;
                        c0Var.g(b1Var3, l1Var3.f1418b, null);
                    } else {
                        h0Var = null;
                        if ((i5 & 8) != 0) {
                            c0Var.f(b1Var3, l1Var3.f1418b, l1Var3.f1419c);
                        }
                    }
                    r3 = 0;
                    l1Var3.f1417a = r3;
                    l1Var3.f1418b = h0Var;
                    l1Var3.f1419c = h0Var;
                    l1.d.c(l1Var3);
                    i4--;
                    z6 = false;
                }
                h0Var = null;
                l1Var3.f1417a = r3;
                l1Var3.f1418b = h0Var;
                l1Var3.f1419c = h0Var;
                l1.d.c(l1Var3);
                i4--;
                z6 = false;
            }
        } else {
            z3 = true;
        }
        View view = null;
        this.f685r.i0(s0Var);
        y0Var.f1537b = y0Var.f1539e;
        this.G = false;
        this.H = false;
        y0Var.f1543j = false;
        y0Var.f1544k = false;
        this.f685r.f1448f = false;
        ArrayList arrayList = s0Var.f1491b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m0 m0Var = this.f685r;
        if (m0Var.f1452k) {
            m0Var.f1451j = 0;
            m0Var.f1452k = false;
            s0Var.l();
        }
        this.f685r.d0(y0Var);
        boolean z12 = z3;
        Q(z12);
        c0(false);
        ((j) qVar.f346g).clear();
        ((h) qVar.f347h).a();
        int[] iArr = this.f688s0;
        int i9 = iArr[0];
        int i10 = iArr[z12 ? 1 : 0];
        C(iArr);
        if ((iArr[0] == i9 && iArr[z12 ? 1 : 0] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.f666g0 && this.f683q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j4 = y0Var.f1546m;
            if (j4 != -1 && (z4 = this.f683q.f1334b) && z4) {
                int s3 = this.f669j.s();
                int i11 = 0;
                b1Var = null;
                while (true) {
                    if (i11 >= s3) {
                        break;
                    }
                    b1 I3 = I(this.f669j.r(i11));
                    if (I3 != null && !I3.h() && I3.f1312e == j4) {
                        if (!((ArrayList) this.f669j.d).contains(I3.f1309a)) {
                            b1Var = I3;
                            break;
                        }
                        b1Var = I3;
                    }
                    i11++;
                }
            } else {
                b1Var = null;
            }
            if (b1Var != null) {
                View view2 = b1Var.f1309a;
                if (!((ArrayList) this.f669j.d).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i12 = y0Var.f1547n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f669j.l() > 0) {
                int i13 = y0Var.f1545l;
                int i14 = i13 != -1 ? i13 : 0;
                int b4 = y0Var.b();
                for (int i15 = i14; i15 < b4; i15++) {
                    b1 E3 = E(i15);
                    if (E3 == null) {
                        break;
                    }
                    View view3 = E3.f1309a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b4, i14) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    b1 E4 = E(min);
                    if (E4 == null) {
                        break;
                    }
                    View view4 = E4.f1309a;
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
        y0Var.f1546m = -1L;
        y0Var.f1545l = -1;
        y0Var.f1547n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.I = 0;
        this.f695w = true;
        this.f699y = this.f699y && !isLayoutRequested();
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            m0Var.f1449g = true;
            m0Var.R(this);
        }
        this.f684q0 = false;
        ThreadLocal threadLocal = p.f1467j;
        p pVar = (p) threadLocal.get();
        this.i0 = pVar;
        if (pVar == null) {
            p pVar2 = new p();
            pVar2.f1469f = new ArrayList();
            pVar2.i = new ArrayList();
            this.i0 = pVar2;
            WeakHashMap weakHashMap = l0.f2757a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            p pVar3 = this.i0;
            pVar3.f1471h = (long) (1.0E9f / f2);
            threadLocal.set(pVar3);
        }
        this.i0.f1469f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar;
        super.onDetachedFromWindow();
        i0 i0Var = this.P;
        if (i0Var != null) {
            i0Var.e();
        }
        setScrollState(0);
        a1 a1Var = this.f668h0;
        a1Var.f1301l.removeCallbacks(a1Var);
        a1Var.f1298h.abortAnimation();
        m0 m0Var = this.f685r;
        if (m0Var != null && (wVar = m0Var.f1447e) != null) {
            wVar.i();
        }
        this.f695w = false;
        m0 m0Var2 = this.f685r;
        if (m0Var2 != null) {
            m0Var2.f1449g = false;
            m0Var2.S(this);
        }
        this.f698x0.clear();
        removeCallbacks(this.f700y0);
        this.f671k.getClass();
        while (l1.d.a() != null) {
        }
        p pVar = this.i0;
        if (pVar != null) {
            pVar.f1469f.remove(this);
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f689t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j0) arrayList.get(i)).a(this);
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
        float f2;
        float f4;
        m0 m0Var;
        if (this.f685r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f685r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f685r.d()) {
                    f4 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f4 != 0.0f) {
                        int i = (int) (f4 * this.f662e0);
                        int i4 = (int) (f2 * this.f664f0);
                        m0Var = this.f685r;
                        if (m0Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.f696w0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = m0Var.d();
                            boolean e4 = this.f685r.e();
                            getScrollingChildHelper().g(e4 ? (d ? 1 : 0) | 2 : d ? 1 : 0, 1);
                            if (r(d ? i : 0, e4 ? i4 : 0, 1, this.f696w0, this.f692u0)) {
                                i -= iArr[0];
                                i4 -= iArr[1];
                            }
                            X(d ? i : 0, e4 ? i4 : 0, motionEvent, 1);
                            p pVar = this.i0;
                            if (pVar != null && (i != 0 || i4 != 0)) {
                                pVar.a(this, i, i4);
                            }
                            d0(1);
                        }
                    }
                }
                f4 = 0.0f;
                if (f2 == 0.0f) {
                }
                int i5 = (int) (f4 * this.f662e0);
                int i42 = (int) (f2 * this.f664f0);
                m0Var = this.f685r;
                if (m0Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f685r.e()) {
                        f2 = -axisValue;
                        f4 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i52 = (int) (f4 * this.f662e0);
                        int i422 = (int) (f2 * this.f664f0);
                        m0Var = this.f685r;
                        if (m0Var == null) {
                        }
                    } else if (this.f685r.d()) {
                        f4 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i522 = (int) (f4 * this.f662e0);
                        int i4222 = (int) (f2 * this.f664f0);
                        m0Var = this.f685r;
                        if (m0Var == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f4 = 0.0f;
                if (f2 == 0.0f) {
                }
                int i5222 = (int) (f4 * this.f662e0);
                int i42222 = (int) (f2 * this.f664f0);
                m0Var = this.f685r;
                if (m0Var == null) {
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
            this.f693v = null;
            if (B(motionEvent)) {
                W();
                setScrollState(0);
                return true;
            }
            m0 m0Var = this.f685r;
            if (m0Var != null) {
                boolean d = m0Var.d();
                boolean e4 = this.f685r.e();
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
                    int[] iArr = this.f694v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d;
                    if (e4) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
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
                        int i4 = x4 - this.T;
                        int i5 = y4 - this.U;
                        if (d == 0 || Math.abs(i4) <= this.f659a0) {
                            z3 = false;
                        } else {
                            this.V = x4;
                            z3 = true;
                        }
                        if (e4 && Math.abs(i5) > this.f659a0) {
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
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7 = g.f1893a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f699y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        m0 m0Var = this.f685r;
        if (m0Var == null) {
            n(i, i4);
            return;
        }
        boolean L = m0Var.L();
        boolean z3 = false;
        y0 y0Var = this.f672k0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f685r.f1445b.n(i, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f702z0 = z3;
            if (z3 || this.f683q == null) {
                return;
            }
            if (y0Var.d == 1) {
                p();
            }
            this.f685r.r0(i, i4);
            y0Var.i = true;
            q();
            this.f685r.t0(i, i4);
            if (this.f685r.w0()) {
                this.f685r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                y0Var.i = true;
                q();
                this.f685r.t0(i, i4);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.f697x) {
            this.f685r.f1445b.n(i, i4);
            return;
        }
        if (this.E) {
            b0();
            P();
            T();
            Q(true);
            if (y0Var.f1544k) {
                y0Var.f1541g = true;
            } else {
                this.i.d();
                y0Var.f1541g = false;
            }
            this.E = false;
            c0(false);
        } else if (y0Var.f1544k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        d0 d0Var = this.f683q;
        if (d0Var != null) {
            y0Var.f1539e = d0Var.a();
        } else {
            y0Var.f1539e = 0;
        }
        b0();
        this.f685r.f1445b.n(i, i4);
        c0(false);
        y0Var.f1541g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v0 v0Var = (v0) parcelable;
        this.f667h = v0Var;
        super.onRestoreInstanceState(v0Var.f3175f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v0 v0Var = new v0(super.onSaveInstanceState());
        v0 v0Var2 = this.f667h;
        if (v0Var2 != null) {
            v0Var.f1514h = v0Var2.f1514h;
            return v0Var;
        }
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            v0Var.f1514h = m0Var.f0();
            return v0Var;
        }
        v0Var.f1514h = null;
        return v0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        if (i == i5 && i4 == i6) {
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
        int i;
        int minFlingVelocity;
        boolean z4;
        y yVar;
        float f2;
        int H;
        PointF a2;
        int i4;
        int i5;
        boolean z5;
        if (!this.B && !this.C) {
            m mVar = this.f693v;
            if (mVar == null) {
                z3 = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                int i6 = mVar.f1421b;
                if (mVar.f1439v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d = mVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c4 = mVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d || c4) {
                            if (c4) {
                                mVar.f1440w = 1;
                                mVar.f1433p = (int) motionEvent.getX();
                            } else if (d) {
                                mVar.f1440w = 2;
                                mVar.f1430m = (int) motionEvent.getY();
                            }
                            mVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && mVar.f1439v == 2) {
                        mVar.f1430m = 0.0f;
                        mVar.f1433p = 0.0f;
                        mVar.f(1);
                        mVar.f1440w = 0;
                    } else if (motionEvent.getAction() == 2 && mVar.f1439v == 2) {
                        mVar.g();
                        if (mVar.f1440w == 1) {
                            float x3 = motionEvent.getX();
                            int[] iArr = mVar.f1442y;
                            iArr[0] = i6;
                            int i7 = mVar.f1434q - i6;
                            iArr[1] = i7;
                            float max = Math.max(i6, Math.min(i7, x3));
                            if (Math.abs(mVar.f1432o - max) >= 2.0f) {
                                int e4 = m.e(mVar.f1433p, max, iArr, mVar.f1436s.computeHorizontalScrollRange(), mVar.f1436s.computeHorizontalScrollOffset(), mVar.f1434q);
                                if (e4 != 0) {
                                    mVar.f1436s.scrollBy(e4, 0);
                                }
                                mVar.f1433p = max;
                            }
                        }
                        if (mVar.f1440w == 2) {
                            float y3 = motionEvent.getY();
                            int[] iArr2 = mVar.f1441x;
                            iArr2[0] = i6;
                            int i8 = mVar.f1435r - i6;
                            iArr2[1] = i8;
                            float max2 = Math.max(i6, Math.min(i8, y3));
                            if (Math.abs(mVar.f1429l - max2) >= 2.0f) {
                                int e5 = m.e(mVar.f1430m, max2, iArr2, mVar.f1436s.computeVerticalScrollRange(), mVar.f1436s.computeVerticalScrollOffset(), mVar.f1435r);
                                if (e5 != 0) {
                                    mVar.f1436s.scrollBy(0, e5);
                                }
                                mVar.f1430m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f693v = null;
                }
                z3 = true;
            }
            if (z3) {
                W();
                setScrollState(0);
                return true;
            }
            m0 m0Var = this.f685r;
            if (m0Var != null) {
                boolean d3 = m0Var.d();
                boolean e6 = this.f685r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f694v0;
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
                    int i9 = d3;
                    if (e6) {
                        i9 = (d3 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i9, 0);
                } else {
                    if (actionMasked == 1) {
                        this.S.addMovement(obtain);
                        VelocityTracker velocityTracker = this.S;
                        int i10 = this.d0;
                        velocityTracker.computeCurrentVelocity(1000, i10);
                        float f4 = d3 != 0 ? -this.S.getXVelocity(this.R) : 0.0f;
                        float f5 = e6 ? -this.S.getYVelocity(this.R) : 0.0f;
                        if (f4 == 0.0f && f5 == 0.0f) {
                            i5 = 0;
                        } else {
                            int i11 = (int) f4;
                            int i12 = (int) f5;
                            m0 m0Var2 = this.f685r;
                            if (m0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                int d4 = m0Var2.d();
                                boolean e7 = this.f685r.e();
                                int i13 = this.f661c0;
                                if (d4 == 0 || Math.abs(i11) < i13) {
                                    i11 = 0;
                                }
                                if (!e7 || Math.abs(i12) < i13) {
                                    i12 = 0;
                                }
                                if (i11 != 0 || i12 != 0) {
                                    float f6 = i11;
                                    float f7 = i12;
                                    if (!dispatchNestedPreFling(f6, f7)) {
                                        boolean z6 = d4 != 0 || e7;
                                        dispatchNestedFling(f6, f7, z6);
                                        o0 o0Var = this.f660b0;
                                        if (o0Var != null) {
                                            z zVar = (z) o0Var;
                                            m0 layoutManager = zVar.f1548a.getLayoutManager();
                                            if (layoutManager != 0 && zVar.f1548a.getAdapter() != null && ((Math.abs(i12) > (minFlingVelocity = zVar.f1548a.getMinFlingVelocity()) || Math.abs(i11) > minFlingVelocity) && ((z4 = layoutManager instanceof x0)))) {
                                                if (z4) {
                                                    f2 = 0.0f;
                                                    yVar = new y(zVar, zVar.f1548a.getContext());
                                                } else {
                                                    f2 = 0.0f;
                                                    yVar = null;
                                                }
                                                if (yVar != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        androidx.emoji2.text.g e8 = layoutManager.e() ? zVar.e(layoutManager) : layoutManager.d() ? zVar.d(layoutManager) : null;
                                                        if (e8 != null) {
                                                            int v3 = layoutManager.v();
                                                            int i14 = Integer.MIN_VALUE;
                                                            int i15 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i = 1;
                                                            int i16 = 0;
                                                            while (i16 < v3) {
                                                                int i17 = v3;
                                                                View u3 = layoutManager.u(i16);
                                                                if (u3 == null) {
                                                                    i4 = i16;
                                                                } else {
                                                                    i4 = i16;
                                                                    int b4 = z.b(u3, e8);
                                                                    if (b4 <= 0 && b4 > i14) {
                                                                        view2 = u3;
                                                                        i14 = b4;
                                                                    }
                                                                    if (b4 >= 0 && b4 < i15) {
                                                                        view = u3;
                                                                        i15 = b4;
                                                                    }
                                                                }
                                                                i16 = i4 + 1;
                                                                v3 = i17;
                                                            }
                                                            boolean z7 = !layoutManager.d() ? i12 <= 0 : i11 <= 0;
                                                            if (z7 && view != null) {
                                                                H = m0.H(view);
                                                            } else if (z7 || view2 == null) {
                                                                if (z7) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z4 && (a2 = ((x0) layoutManager).a(layoutManager.B() + (-1))) != null && ((a2.x > f2 ? 1 : (a2.x == f2 ? 0 : -1)) < 0 || (a2.y > f2 ? 1 : (a2.y == f2 ? 0 : -1)) < 0)) == z7 ? -1 : 1) + m0.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = m0.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                yVar.f1515a = H;
                                                                layoutManager.z0(yVar);
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z6) {
                                                                if (e7) {
                                                                    d4 = (d4 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d4, i);
                                                                int i18 = -i10;
                                                                int max3 = Math.max(i18, Math.min(i11, i10));
                                                                int max4 = Math.max(i18, Math.min(i12, i10));
                                                                a1 a1Var = this.f668h0;
                                                                RecyclerView recyclerView = a1Var.f1301l;
                                                                recyclerView.setScrollState(2);
                                                                a1Var.f1297g = 0;
                                                                a1Var.f1296f = 0;
                                                                Interpolator interpolator = a1Var.i;
                                                                b0 b0Var = F0;
                                                                if (interpolator != b0Var) {
                                                                    a1Var.i = b0Var;
                                                                    a1Var.f1298h = new OverScroller(recyclerView.getContext(), b0Var);
                                                                }
                                                                a1Var.f1298h.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                a1Var.a();
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i = 1;
                                                    H = -1;
                                                    if (H != -1) {
                                                    }
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        }
                                        i = 1;
                                        if (z6) {
                                        }
                                    }
                                }
                            }
                            i5 = 0;
                        }
                        setScrollState(i5);
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
                        int i19 = this.V - x5;
                        int i20 = this.W - y5;
                        if (this.Q != 1) {
                            if (d3 != 0) {
                                i19 = i19 > 0 ? Math.max(0, i19 - this.f659a0) : Math.min(0, i19 + this.f659a0);
                                if (i19 != 0) {
                                    z5 = true;
                                    if (e6) {
                                        i20 = i20 > 0 ? Math.max(0, i20 - this.f659a0) : Math.min(0, i20 + this.f659a0);
                                        if (i20 != 0) {
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
                        int i21 = i19;
                        int i22 = i20;
                        if (this.Q == 1) {
                            int[] iArr4 = this.f696w0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r3 = r(d3 != 0 ? i21 : 0, e6 ? i22 : 0, 0, iArr4, this.f692u0);
                            int[] iArr5 = this.f692u0;
                            if (r3) {
                                i21 -= iArr4[0];
                                i22 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i23 = i22;
                            this.V = x5 - iArr5[0];
                            this.W = y5 - iArr5[1];
                            if (X(d3 != 0 ? i21 : 0, e6 ? i23 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            p pVar = this.i0;
                            if (pVar != null && (i21 != 0 || i23 != 0)) {
                                pVar.a(this, i21, i23);
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
        l1 l1Var;
        View A;
        y0 y0Var = this.f672k0;
        y0Var.a(1);
        z(y0Var);
        y0Var.i = false;
        b0();
        q qVar = this.f671k;
        j jVar = (j) qVar.f346g;
        j jVar2 = (j) qVar.f346g;
        jVar.clear();
        h hVar = (h) qVar.f347h;
        hVar.a();
        P();
        T();
        b1 b1Var = null;
        View focusedChild = (this.f666g0 && hasFocus() && this.f683q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (A = A(focusedChild)) != null) {
            b1Var = H(A);
        }
        if (b1Var == null) {
            y0Var.f1546m = -1L;
            y0Var.f1545l = -1;
            y0Var.f1547n = -1;
        } else {
            y0Var.f1546m = this.f683q.f1334b ? b1Var.f1312e : -1L;
            if (!this.G) {
                if (b1Var.h()) {
                    F = b1Var.d;
                } else {
                    RecyclerView recyclerView = b1Var.f1324r;
                    if (recyclerView != null) {
                        F = recyclerView.F(b1Var);
                    }
                }
                y0Var.f1545l = F;
                view = b1Var.f1309a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                y0Var.f1547n = id;
            }
            F = -1;
            y0Var.f1545l = F;
            view = b1Var.f1309a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            y0Var.f1547n = id2;
        }
        y0Var.f1542h = y0Var.f1543j && this.f680o0;
        this.f680o0 = false;
        this.f678n0 = false;
        y0Var.f1541g = y0Var.f1544k;
        y0Var.f1539e = this.f683q.a();
        C(this.f688s0);
        if (y0Var.f1543j) {
            int l4 = this.f669j.l();
            for (int i = 0; i < l4; i++) {
                b1 I = I(this.f669j.k(i));
                if (!I.o() && (!I.f() || this.f683q.f1334b)) {
                    i0 i0Var = this.P;
                    i0.b(I);
                    I.c();
                    i0Var.getClass();
                    h0 h0Var = new h0();
                    h0Var.a(I);
                    l1 l1Var2 = (l1) jVar2.get(I);
                    if (l1Var2 == null) {
                        l1Var2 = l1.a();
                        jVar2.put(I, l1Var2);
                    }
                    l1Var2.f1418b = h0Var;
                    l1Var2.f1417a |= 4;
                    if (y0Var.f1542h && I.k() && !I.h() && !I.o() && !I.f()) {
                        hVar.d(G(I), I);
                    }
                }
            }
        }
        if (y0Var.f1544k) {
            int s3 = this.f669j.s();
            for (int i4 = 0; i4 < s3; i4++) {
                b1 I2 = I(this.f669j.r(i4));
                if (!I2.o() && I2.d == -1) {
                    I2.d = I2.f1311c;
                }
            }
            boolean z3 = y0Var.f1540f;
            y0Var.f1540f = false;
            this.f685r.c0(this.f665g, y0Var);
            y0Var.f1540f = z3;
            for (int i5 = 0; i5 < this.f669j.l(); i5++) {
                b1 I3 = I(this.f669j.k(i5));
                if (!I3.o() && ((l1Var = (l1) jVar2.get(I3)) == null || (l1Var.f1417a & 4) == 0)) {
                    i0.b(I3);
                    boolean z4 = (I3.f1316j & 8192) != 0;
                    i0 i0Var2 = this.P;
                    I3.c();
                    i0Var2.getClass();
                    h0 h0Var2 = new h0();
                    h0Var2.a(I3);
                    if (z4) {
                        U(I3, h0Var2);
                    } else {
                        l1 l1Var3 = (l1) jVar2.get(I3);
                        if (l1Var3 == null) {
                            l1Var3 = l1.a();
                            jVar2.put(I3, l1Var3);
                        }
                        l1Var3.f1417a |= 2;
                        l1Var3.f1418b = h0Var2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        c0(false);
        y0Var.d = 2;
    }

    public final void q() {
        b0();
        P();
        y0 y0Var = this.f672k0;
        y0Var.a(6);
        this.i.d();
        y0Var.f1539e = this.f683q.a();
        y0Var.f1538c = 0;
        if (this.f667h != null) {
            d0 d0Var = this.f683q;
            int a2 = e.a(d0Var.f1335c);
            if (a2 == 1 ? d0Var.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.f667h.f1514h;
                if (parcelable != null) {
                    this.f685r.e0(parcelable);
                }
                this.f667h = null;
            }
        }
        y0Var.f1541g = false;
        this.f685r.c0(this.f665g, y0Var);
        y0Var.f1540f = false;
        y0Var.f1543j = y0Var.f1543j && this.P != null;
        y0Var.d = 4;
        Q(true);
        c0(false);
    }

    public final boolean r(int i, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, i5, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        b1 I = I(view);
        if (I != null) {
            if (I.j()) {
                I.f1316j &= -257;
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
        w wVar = this.f685r.f1447e;
        if ((wVar == null || !wVar.f1518e) && !L() && view2 != null) {
            V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f685r.l0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f691u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f701z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().d(i, i4, i5, i6, iArr, i7, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        m0 m0Var = this.f685r;
        if (m0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d = m0Var.d();
        boolean e4 = this.f685r.e();
        if (d || e4) {
            if (!d) {
                i = 0;
            }
            if (!e4) {
                i4 = 0;
            }
            X(i, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
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

    public void setAccessibilityDelegateCompat(d1 d1Var) {
        this.f686r0 = d1Var;
        l0.m(this, d1Var);
    }

    public void setAdapter(d0 d0Var) {
        setLayoutFrozen(false);
        d0 d0Var2 = this.f683q;
        u0 u0Var = this.f663f;
        if (d0Var2 != null) {
            d0Var2.f1333a.unregisterObserver(u0Var);
            this.f683q.getClass();
        }
        i0 i0Var = this.P;
        if (i0Var != null) {
            i0Var.e();
        }
        m0 m0Var = this.f685r;
        s0 s0Var = this.f665g;
        if (m0Var != null) {
            m0Var.h0(s0Var);
            this.f685r.i0(s0Var);
        }
        s0Var.f1490a.clear();
        s0Var.e();
        b bVar = this.i;
        bVar.q((ArrayList) bVar.f1304c);
        bVar.q((ArrayList) bVar.d);
        bVar.f1302a = 0;
        d0 d0Var3 = this.f683q;
        this.f683q = d0Var;
        if (d0Var != null) {
            d0Var.f1333a.registerObserver(u0Var);
        }
        m0 m0Var2 = this.f685r;
        if (m0Var2 != null) {
            m0Var2.Q();
        }
        d0 d0Var4 = this.f683q;
        s0Var.f1490a.clear();
        s0Var.e();
        r0 c4 = s0Var.c();
        if (d0Var3 != null) {
            c4.f1485b--;
        }
        if (c4.f1485b == 0) {
            SparseArray sparseArray = c4.f1484a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((q0) sparseArray.valueAt(i)).f1474a.clear();
            }
        }
        if (d0Var4 != null) {
            c4.f1485b++;
        }
        this.f672k0.f1540f = true;
        this.H |= false;
        this.G = true;
        int s3 = this.f669j.s();
        for (int i4 = 0; i4 < s3; i4++) {
            b1 I = I(this.f669j.r(i4));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        s0 s0Var2 = this.f665g;
        ArrayList arrayList = s0Var2.f1492c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            b1 b1Var = (b1) arrayList.get(i5);
            if (b1Var != null) {
                b1Var.a(6);
                b1Var.a(1024);
            }
        }
        d0 d0Var5 = s0Var2.f1496h.f683q;
        if (d0Var5 == null || !d0Var5.f1334b) {
            s0Var2.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f673l) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.f673l = z3;
        super.setClipToPadding(z3);
        if (this.f699y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(g0 g0Var) {
        g0Var.getClass();
        this.K = g0Var;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f697x = z3;
    }

    public void setItemAnimator(i0 i0Var) {
        i0 i0Var2 = this.P;
        if (i0Var2 != null) {
            i0Var2.e();
            this.P.f1373a = null;
        }
        this.P = i0Var;
        if (i0Var != null) {
            i0Var.f1373a = this.f682p0;
        }
    }

    public void setItemViewCacheSize(int i) {
        s0 s0Var = this.f665g;
        s0Var.f1493e = i;
        s0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(m0 m0Var) {
        w wVar;
        if (m0Var == this.f685r) {
            return;
        }
        setScrollState(0);
        a1 a1Var = this.f668h0;
        a1Var.f1301l.removeCallbacks(a1Var);
        a1Var.f1298h.abortAnimation();
        m0 m0Var2 = this.f685r;
        if (m0Var2 != null && (wVar = m0Var2.f1447e) != null) {
            wVar.i();
        }
        m0 m0Var3 = this.f685r;
        s0 s0Var = this.f665g;
        if (m0Var3 != null) {
            i0 i0Var = this.P;
            if (i0Var != null) {
                i0Var.e();
            }
            this.f685r.h0(s0Var);
            this.f685r.i0(s0Var);
            s0Var.f1490a.clear();
            s0Var.e();
            if (this.f695w) {
                m0 m0Var4 = this.f685r;
                m0Var4.f1449g = false;
                m0Var4.S(this);
            }
            this.f685r.u0(null);
            this.f685r = null;
        } else {
            s0Var.f1490a.clear();
            s0Var.e();
        }
        t tVar = this.f669j;
        RecyclerView recyclerView = ((c0) tVar.f355b).f1328a;
        ((c) tVar.f356c).g();
        ArrayList arrayList = (ArrayList) tVar.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b1 I = I((View) arrayList.get(size));
            if (I != null) {
                int i = I.f1322p;
                if (recyclerView.L()) {
                    I.f1323q = i;
                    recyclerView.f698x0.add(I);
                } else {
                    View view = I.f1309a;
                    WeakHashMap weakHashMap = l0.f2757a;
                    view.setImportantForAccessibility(i);
                }
                I.f1322p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f685r = m0Var;
        if (m0Var != null) {
            if (m0Var.f1445b != null) {
                throw new IllegalArgumentException("LayoutManager " + m0Var + " is already attached to a RecyclerView:" + m0Var.f1445b.y());
            }
            m0Var.u0(this);
            if (this.f695w) {
                m0 m0Var5 = this.f685r;
                m0Var5.f1449g = true;
                m0Var5.R(this);
            }
        }
        s0Var.l();
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
        k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.f2751c;
            WeakHashMap weakHashMap = l0.f2757a;
            n0.d0.k(viewGroup);
        }
        scrollingChildHelper.d = z3;
    }

    public void setOnFlingListener(o0 o0Var) {
        this.f660b0 = o0Var;
    }

    @Deprecated
    public void setOnScrollListener(p0 p0Var) {
        this.f674l0 = p0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f666g0 = z3;
    }

    public void setRecycledViewPool(r0 r0Var) {
        s0 s0Var = this.f665g;
        if (s0Var.f1495g != null) {
            r1.f1485b--;
        }
        s0Var.f1495g = r0Var;
        if (r0Var == null || s0Var.f1496h.getAdapter() == null) {
            return;
        }
        s0Var.f1495g.f1485b++;
    }

    public void setScrollState(int i) {
        w wVar;
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (i != 2) {
            a1 a1Var = this.f668h0;
            a1Var.f1301l.removeCallbacks(a1Var);
            a1Var.f1298h.abortAnimation();
            m0 m0Var = this.f685r;
            if (m0Var != null && (wVar = m0Var.f1447e) != null) {
                wVar.i();
            }
        }
        m0 m0Var2 = this.f685r;
        if (m0Var2 != null) {
            m0Var2.g0(i);
        }
        p0 p0Var = this.f674l0;
        if (p0Var != null) {
            p0Var.a(i);
        }
        ArrayList arrayList = this.f676m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p0) this.f676m0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f659a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f659a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z0 z0Var) {
        this.f665g.getClass();
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
    public final void suppressLayout(boolean z3) {
        w wVar;
        if (z3 != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.B = false;
                if (this.A && this.f685r != null && this.f683q != null) {
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
            a1 a1Var = this.f668h0;
            a1Var.f1301l.removeCallbacks(a1Var);
            a1Var.f1298h.abortAnimation();
            m0 m0Var = this.f685r;
            if (m0Var == null || (wVar = m0Var.f1447e) == null) {
                return;
            }
            wVar.i();
        }
    }

    public final void t(int i, int i4) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        p0 p0Var = this.f674l0;
        if (p0Var != null) {
            p0Var.b(this, i, i4);
        }
        ArrayList arrayList = this.f676m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p0) this.f676m0.get(size)).b(this, i, i4);
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
        if (this.f673l) {
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
        if (this.f673l) {
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
        if (this.f673l) {
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
        if (this.f673l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f683q + ", layout:" + this.f685r + ", context:" + getContext();
    }

    public final void z(y0 y0Var) {
        if (getScrollState() != 2) {
            y0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f668h0.f1298h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        y0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a2;
        char c4;
        int i4;
        boolean z3;
        char c5;
        int i5;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        this.f663f = new u0(this);
        this.f665g = new s0(this);
        this.f671k = new q(10);
        this.f675m = new a0(this, 0);
        this.f677n = new Rect();
        this.f679o = new Rect();
        this.f681p = new RectF();
        this.f687s = new ArrayList();
        this.f689t = new ArrayList();
        this.f691u = new ArrayList();
        this.f701z = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new g0();
        f1.j jVar = new f1.j();
        jVar.f1373a = null;
        jVar.f1374b = new ArrayList();
        jVar.f1375c = 120L;
        jVar.d = 120L;
        jVar.f1376e = 250L;
        jVar.f1377f = 250L;
        jVar.f1388g = true;
        jVar.f1389h = new ArrayList();
        jVar.i = new ArrayList();
        jVar.f1390j = new ArrayList();
        jVar.f1391k = new ArrayList();
        jVar.f1392l = new ArrayList();
        jVar.f1393m = new ArrayList();
        jVar.f1394n = new ArrayList();
        jVar.f1395o = new ArrayList();
        jVar.f1396p = new ArrayList();
        jVar.f1397q = new ArrayList();
        jVar.f1398r = new ArrayList();
        this.P = jVar;
        this.Q = 0;
        this.R = -1;
        this.f662e0 = Float.MIN_VALUE;
        this.f664f0 = Float.MIN_VALUE;
        this.f666g0 = true;
        this.f668h0 = new a1(this);
        this.f670j0 = new n();
        y0 y0Var = new y0();
        y0Var.f1536a = -1;
        y0Var.f1537b = 0;
        y0Var.f1538c = 0;
        y0Var.d = 1;
        y0Var.f1539e = 0;
        y0Var.f1540f = false;
        y0Var.f1541g = false;
        y0Var.f1542h = false;
        y0Var.i = false;
        y0Var.f1543j = false;
        y0Var.f1544k = false;
        this.f672k0 = y0Var;
        this.f678n0 = false;
        this.f680o0 = false;
        c0 c0Var = new c0(this);
        this.f682p0 = c0Var;
        this.f684q0 = false;
        this.f688s0 = new int[2];
        this.f692u0 = new int[2];
        this.f694v0 = new int[2];
        this.f696w0 = new int[2];
        this.f698x0 = new ArrayList();
        this.f700y0 = new a0(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new c0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f659a0 = viewConfiguration.getScaledTouchSlop();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            Method method = n0.m0.f2762a;
            a2 = n0.j.a(viewConfiguration);
        } else {
            a2 = n0.m0.a(viewConfiguration, context);
        }
        this.f662e0 = a2;
        this.f664f0 = i6 >= 26 ? n0.j.b(viewConfiguration) : n0.m0.a(viewConfiguration, context);
        this.f661c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.f1373a = c0Var;
        this.i = new b(new c0(this));
        this.f669j = new t(new c0(this));
        WeakHashMap weakHashMap = l0.f2757a;
        if ((i6 >= 26 ? n0.f0.a(this) : 0) == 0 && i6 >= 26) {
            n0.f0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new d1(this));
        int[] iArr = e1.a.f1170a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        l0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f673l = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c5 = 2;
            z3 = 1;
            typedArray = obtainStyledAttributes;
            i5 = i;
            c4 = 3;
            i4 = 4;
            new m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.oriondriftchasers.arordrft.R.dimen.fastscroll_margin));
        } else {
            c4 = 3;
            i4 = 4;
            z3 = 1;
            c5 = 2;
            i5 = i;
            typedArray = obtainStyledAttributes;
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m0.class);
                    try {
                        constructor = asSubclass.getConstructor(E0);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context;
                        objArr2[z3] = attributeSet;
                        objArr2[c5] = Integer.valueOf(i5);
                        objArr2[c4] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((m0) constructor.newInstance(objArr));
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
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        l0.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i5);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m0 m0Var = this.f685r;
        if (m0Var != null) {
            return m0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Deprecated
    public void setRecyclerListener(t0 t0Var) {
    }
}
