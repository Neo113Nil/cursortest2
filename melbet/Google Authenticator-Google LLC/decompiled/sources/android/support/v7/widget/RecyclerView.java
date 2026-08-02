package android.support.v7.widget;

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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.abh;
import defpackage.abq;
import defpackage.afr;
import defpackage.bo;
import defpackage.brn;
import defpackage.ep;
import defpackage.hp;
import defpackage.hq;
import defpackage.ifn;
import defpackage.ja;
import defpackage.js;
import defpackage.jv;
import defpackage.jx;
import defpackage.kee;
import defpackage.ko;
import defpackage.kp;
import defpackage.kq;
import defpackage.kr;
import defpackage.kt;
import defpackage.kv;
import defpackage.ky;
import defpackage.kz;
import defpackage.la;
import defpackage.lb;
import defpackage.lc;
import defpackage.ld;
import defpackage.le;
import defpackage.lg;
import defpackage.li;
import defpackage.lk;
import defpackage.ll;
import defpackage.lm;
import defpackage.ln;
import defpackage.lo;
import defpackage.lp;
import defpackage.lr;
import defpackage.mn;
import defpackage.qq;
import defpackage.qy;
import defpackage.xd;
import defpackage.xe;
import defpackage.xl;
import defpackage.xm;
import defpackage.xp;
import defpackage.yg;
import defpackage.yl;
import defpackage.yp;
import defpackage.yq;
import defpackage.yt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements xl {
    public static final /* synthetic */ int aa = 0;
    private static final Class[] ad;
    public static final Interpolator c;
    static final ln d;
    public EdgeEffect A;
    public EdgeEffect B;
    public kv C;
    public int D;
    public int E;
    public lb F;
    public final int G;
    public float H;
    public float I;
    public final lo J;
    public jx K;
    public jv L;
    public final lm M;
    public boolean N;
    public boolean O;
    public boolean P;
    public lr Q;
    public final int[] R;
    final List S;
    boolean T;
    xd U;
    public final afr V;
    brn W;
    private boolean aA;
    private List aB;
    private final int[] aC;
    private xm aD;
    private final int[] aE;
    private final int[] aF;
    private Runnable aG;
    private boolean aH;
    private int aI;
    private int aJ;
    private final xe aK;
    private kt aL;
    private kee aM;
    private final kee aN;
    private final float ae;
    private final lg af;
    private final Rect ag;
    private final ArrayList ah;
    private lc ai;
    private final Runnable aj;
    private boolean ak;
    private boolean al;
    private int am;
    private boolean an;
    private int ao;
    private final AccessibilityManager ap;
    private int aq;
    private int ar;
    private int as;
    private VelocityTracker at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private final int ay;
    private boolean az;
    public final le e;
    li f;
    public hq g;
    public ja h;
    public boolean i;
    public final Rect j;
    public final RectF k;
    public kr l;
    public ky m;
    public final List n;
    public final ArrayList o;
    public boolean p;
    boolean q;
    public boolean r;
    boolean s;
    boolean t;
    public boolean u;
    public List v;
    public boolean w;
    boolean x;
    public EdgeEffect y;
    public EdgeEffect z;
    private static final int[] ab = {R.attr.nestedScrollingEnabled};
    private static final float ac = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ad = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new abq(1);
        d = new ln();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float scaledHorizontalScrollFactor;
        float scaledVerticalScrollFactor;
        String str;
        RecyclerView recyclerView = this;
        recyclerView.af = new lg(recyclerView);
        recyclerView.e = new le(recyclerView);
        recyclerView.V = new afr((char[]) null);
        recyclerView.j = new Rect();
        recyclerView.ag = new Rect();
        recyclerView.k = new RectF();
        recyclerView.n = new ArrayList();
        recyclerView.o = new ArrayList();
        recyclerView.ah = new ArrayList();
        recyclerView.aj = new bo(recyclerView, 15);
        recyclerView.am = 0;
        recyclerView.w = false;
        recyclerView.x = false;
        recyclerView.aq = 0;
        recyclerView.ar = 0;
        recyclerView.aL = d;
        recyclerView.C = new kv(null);
        recyclerView.D = 0;
        recyclerView.as = -1;
        recyclerView.H = Float.MIN_VALUE;
        recyclerView.I = Float.MIN_VALUE;
        recyclerView.az = true;
        recyclerView.aA = true;
        recyclerView.J = new lo(recyclerView);
        recyclerView.L = new jv();
        recyclerView.M = new lm();
        recyclerView.N = false;
        recyclerView.O = false;
        recyclerView.aM = new kee(recyclerView);
        recyclerView.P = false;
        recyclerView.aC = new int[2];
        recyclerView.aE = new int[2];
        recyclerView.aF = new int[2];
        recyclerView.R = new int[2];
        recyclerView.S = new ArrayList();
        recyclerView.aG = new bo(recyclerView, 16, null);
        recyclerView.aI = 0;
        recyclerView.aJ = 0;
        recyclerView.aN = new kee(recyclerView);
        abh abhVar = new abh(recyclerView, 1);
        recyclerView.aK = abhVar;
        recyclerView.U = new xd(recyclerView.getContext(), abhVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.E = viewConfiguration.getScaledTouchSlop();
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.H = scaledHorizontalScrollFactor;
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.I = scaledVerticalScrollFactor;
        recyclerView.G = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.ay = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ae = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.C.m = recyclerView.aM;
        recyclerView.g = new hq(new kee(recyclerView));
        recyclerView.h = new ja(new kee(recyclerView));
        int i2 = yq.a;
        if (yl.a(recyclerView) == 0) {
            yl.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.ap = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.W(new lr(recyclerView));
        int[] iArr = ep.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        yq.k(recyclerView, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(9);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = obtainStyledAttributes.getBoolean(1, true);
        recyclerView.aA = obtainStyledAttributes.getBoolean(8, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.k()));
            }
            Resources resources = recyclerView.getContext().getResources();
            str = string;
            new js(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.fastscroll_margin));
            recyclerView = this;
        } else {
            str = string;
        }
        obtainStyledAttributes.recycle();
        recyclerView.T = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aN(context, str, attributeSet, i);
        int[] iArr2 = ab;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        yq.k(recyclerView, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.apps.authenticator2.R.id.is_pooling_container_tag, true);
    }

    public static void I(View view, Rect rect) {
        kz kzVar = (kz) view.getLayoutParams();
        Rect rect2 = kzVar.d;
        rect.set((view.getLeft() - rect2.left) - kzVar.leftMargin, (view.getTop() - rect2.top) - kzVar.topMargin, view.getRight() + rect2.right + kzVar.rightMargin, view.getBottom() + rect2.bottom + kzVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.y;
        float f2 = 0.0f;
        if (edgeEffect == null || yp.c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && yp.c(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.A;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float d2 = yp.d(edgeEffect3, width, height);
                    if (yp.c(this.A) == 0.0f) {
                        this.A.onRelease();
                    }
                    f2 = d2;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.y;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -yp.d(edgeEffect4, -width, 1.0f - height);
                if (yp.c(this.y) == 0.0f) {
                    this.y.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final void aA() {
        ab();
        O();
        lm lmVar = this.M;
        lmVar.b(6);
        this.g.d();
        lmVar.e = this.l.a();
        lmVar.c = 0;
        li liVar = this.f;
        if (liVar != null) {
            int i = this.l.d;
            Parcelable parcelable = liVar.a;
            if (parcelable != null) {
                this.m.Y(parcelable);
            }
            this.f = null;
        }
        lmVar.g = false;
        this.m.p(this.e, lmVar);
        lmVar.f = false;
        lmVar.j = lmVar.j && this.C != null;
        lmVar.d = 4;
        P(true);
        ac(false);
    }

    private final void aB(int[] iArr) {
        int a2 = this.h.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < a2; i3++) {
            lp h = h(this.h.e(i3));
            if (!h.z()) {
                int b2 = h.b();
                if (b2 < i2) {
                    i2 = b2;
                }
                if (b2 > i) {
                    i = b2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aC(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.as) {
            int i = actionIndex == 0 ? 1 : 0;
            this.as = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aw = x;
            this.au = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.ax = y;
            this.av = y;
        }
    }

    private final void aD() {
        boolean z;
        if (this.w) {
            this.g.i();
            if (this.x) {
                this.m.y();
            }
        }
        boolean aL = aL();
        hq hqVar = this.g;
        if (aL) {
            hqVar.f();
        } else {
            hqVar.d();
        }
        boolean z2 = this.N || this.O;
        lm lmVar = this.M;
        boolean z3 = this.q && this.C != null && ((z = this.w) || z2 || this.m.u) && (!z || this.l.c);
        lmVar.j = z3;
        lmVar.k = z3 && z2 && !this.w && aL();
    }

    private final void aE() {
        boolean z;
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.y.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final void aF(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.j;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof kz) {
            kz kzVar = (kz) layoutParams;
            if (!kzVar.e) {
                Rect rect2 = kzVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        ky kyVar = this.m;
        boolean z2 = !this.q;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        kyVar.be(recyclerView, view3, rect, z2, z);
    }

    private final void aG() {
        lm lmVar = this.M;
        lmVar.m = -1L;
        lmVar.l = -1;
        lmVar.n = -1;
    }

    private final void aH() {
        VelocityTracker velocityTracker = this.at;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ad(0);
        aE();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aI(int i) {
        boolean ad2 = this.m.ad();
        int i2 = ad2;
        if (this.m.ae()) {
            i2 = (ad2 ? 1 : 0) | 2;
        }
        aq(i2, i);
    }

    private final void aJ() {
        ll llVar;
        this.J.d();
        ky kyVar = this.m;
        if (kyVar == null || (llVar = kyVar.t) == null) {
            return;
        }
        llVar.f();
    }

    private final boolean aK(MotionEvent motionEvent) {
        ArrayList arrayList = this.ah;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lc lcVar = (lc) arrayList.get(i);
            if (lcVar.k(motionEvent) && action != 3) {
                this.ai = lcVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aL() {
        return this.C != null && this.m.v();
    }

    private final boolean aM(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float c2 = yp.c(edgeEffect) * i2;
        float abs = Math.abs(-i);
        float f = this.ae * 0.015f;
        double log = Math.log((abs * 0.35f) / f);
        double d2 = ac;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * log))) < c2;
    }

    private final void aN(Context context, String str, AttributeSet attributeSet, int i) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            if (trim.charAt(0) == '.') {
                trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
            } else if (!trim.contains(".")) {
                trim = RecyclerView.class.getPackage().getName() + '.' + trim;
            }
            try {
                Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(ky.class);
                try {
                    constructor = asSubclass.getConstructor(ad);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.ad(trim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                Y((ky) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.ad(trim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.ad(trim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.ad(trim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.ad(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.ad(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final brn aO() {
        brn brnVar = this.W;
        if (brnVar != null) {
            return brnVar;
        }
        brn brnVar2 = new brn((View) this, (byte[]) null);
        this.W = brnVar2;
        return brnVar2;
    }

    public static final int am(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && yp.c(edgeEffect) != 0.0f) {
            int round = Math.round(((-i2) / 4.0f) * yp.d(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || yp.c(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round((f / 4.0f) * yp.d(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    private final int aw(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.z;
        float f2 = 0.0f;
        if (edgeEffect == null || yp.c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.B;
            if (edgeEffect2 != null && yp.c(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.B;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float d2 = yp.d(edgeEffect3, height, 1.0f - width);
                    if (yp.c(this.B) == 0.0f) {
                        this.B.onRelease();
                    }
                    f2 = d2;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.z;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -yp.d(edgeEffect4, -height, width);
                if (yp.c(this.z) == 0.0f) {
                    this.z.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final xm ax() {
        xm xmVar = this.aD;
        if (xmVar != null) {
            return xmVar;
        }
        xm xmVar2 = new xm(this);
        this.aD = xmVar2;
        return xmVar2;
    }

    private final void ay() {
        aH();
        Z(0);
    }

    private final void az() {
        View j;
        lm lmVar = this.M;
        lmVar.b(1);
        H(lmVar);
        lmVar.i = false;
        ab();
        afr afrVar = this.V;
        afrVar.g();
        O();
        aD();
        lp lpVar = null;
        View focusedChild = (this.az && hasFocus() && this.l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (j = j(focusedChild)) != null) {
            lpVar = g(j);
        }
        if (lpVar == null) {
            aG();
        } else {
            lmVar.m = this.l.c ? lpVar.e : -1L;
            lmVar.l = this.w ? -1 : lpVar.u() ? lpVar.d : lpVar.a();
            View view = lpVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            lmVar.n = id;
        }
        lmVar.h = lmVar.j && this.O;
        this.O = false;
        this.N = false;
        lmVar.g = lmVar.k;
        lmVar.e = this.l.a();
        aB(this.aC);
        if (lmVar.j) {
            int a2 = this.h.a();
            for (int i = 0; i < a2; i++) {
                lp h = h(this.h.e(i));
                if (!h.z() && (!h.s() || this.l.c)) {
                    kv.k(h);
                    h.c();
                    afrVar.o(h, kv.l(h));
                    if (lmVar.h && h.x() && !h.u() && !h.z() && !h.s()) {
                        afrVar.f(d(h), h);
                    }
                }
            }
        }
        if (lmVar.k) {
            int c2 = this.h.c();
            for (int i2 = 0; i2 < c2; i2++) {
                lp h2 = h(this.h.f(i2));
                if (!h2.z() && h2.d == -1) {
                    h2.d = h2.c;
                }
            }
            boolean z = lmVar.f;
            lmVar.f = false;
            this.m.p(this.e, lmVar);
            lmVar.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                lp h3 = h(this.h.e(i3));
                if (!h3.z()) {
                    qy qyVar = (qy) afrVar.b;
                    mn mnVar = (mn) qyVar.get(h3);
                    if (mnVar == null || (mnVar.b & 4) == 0) {
                        kv.k(h3);
                        boolean p = h3.p(8192);
                        h3.c();
                        xp l = kv.l(h3);
                        if (p) {
                            ar(h3, l);
                        } else {
                            mn mnVar2 = (mn) qyVar.get(h3);
                            if (mnVar2 == null) {
                                mnVar2 = mn.a();
                                qyVar.put(h3, mnVar2);
                            }
                            mnVar2.b |= 2;
                            mnVar2.c = l;
                        }
                    }
                }
            }
            v();
        } else {
            v();
        }
        P(true);
        ac(false);
        lmVar.d = 2;
    }

    public static lp h(View view) {
        if (view == null) {
            return null;
        }
        return ((kz) view.getLayoutParams()).c;
    }

    public static RecyclerView i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView i2 = i(viewGroup.getChildAt(i));
            if (i2 != null) {
                return i2;
            }
        }
        return null;
    }

    public static void u(lp lpVar) {
        WeakReference weakReference = lpVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == lpVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            lpVar.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ef, code lost:
    
        if (r18.h.k(getFocusedChild()) != false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void A() {
        int i;
        lp lpVar;
        View findViewById;
        int i2;
        if (this.l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        lm lmVar = this.M;
        boolean z = false;
        lmVar.i = false;
        boolean z2 = this.aH && !(this.aI == getWidth() && this.aJ == getHeight());
        this.aI = 0;
        this.aJ = 0;
        this.aH = false;
        if (lmVar.d == 1) {
            az();
            this.m.aW(this);
            aA();
        } else {
            hq hqVar = this.g;
            if ((hqVar.b.isEmpty() || hqVar.a.isEmpty()) && !z2 && this.m.C == getWidth() && this.m.D == getHeight()) {
                this.m.aW(this);
            } else {
                this.m.aW(this);
                aA();
            }
        }
        lmVar.b(4);
        ab();
        O();
        lmVar.d = 1;
        int i3 = -1;
        View view = null;
        if (lmVar.j) {
            int a2 = this.h.a() - 1;
            while (a2 >= 0) {
                lp h = h(this.h.e(a2));
                if (!h.z()) {
                    long d2 = d(h);
                    xp xpVar = new xp();
                    xpVar.d(h);
                    afr afrVar = this.V;
                    lp lpVar2 = (lp) ((qq) afrVar.a).d(d2);
                    if (lpVar2 == null || lpVar2.z()) {
                        i2 = i3;
                        afrVar.n(h, xpVar);
                    } else {
                        boolean j = afrVar.j(lpVar2);
                        boolean j2 = afrVar.j(h);
                        if (j && lpVar2 == h) {
                            afrVar.n(h, xpVar);
                        } else {
                            i2 = i3;
                            xp m = afrVar.m(lpVar2, 4);
                            afrVar.n(h, xpVar);
                            xp m2 = afrVar.m(h, 8);
                            if (m == null) {
                                int a3 = this.h.a();
                                for (int i4 = 0; i4 < a3; i4++) {
                                    lp h2 = h(this.h.e(i4));
                                    if (h2 != h && d(h2) == d2) {
                                        kr krVar = this.l;
                                        if (krVar == null || !krVar.c) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + h2 + " \n View Holder 2:" + h + k());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + h2 + " \n View Holder 2:" + h + k());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + lpVar2 + " cannot be found but it is necessary for " + h + k());
                            } else {
                                lpVar2.m(false);
                                if (j) {
                                    q(lpVar2);
                                }
                                if (lpVar2 != h) {
                                    if (j2) {
                                        q(h);
                                    }
                                    lpVar2.h = h;
                                    q(lpVar2);
                                    this.e.l(lpVar2);
                                    h.m(false);
                                    h.i = lpVar2;
                                }
                                if (this.C.m(lpVar2, h, m, m2)) {
                                    Q();
                                }
                            }
                        }
                    }
                    a2--;
                    i3 = i2;
                }
                i2 = i3;
                a2--;
                i3 = i2;
            }
            i = i3;
            afr afrVar2 = this.V;
            kee keeVar = this.aN;
            qy qyVar = (qy) afrVar2.b;
            int i5 = qyVar.d - 1;
            while (i5 >= 0) {
                lp lpVar3 = (lp) qyVar.c(i5);
                mn mnVar = (mn) qyVar.d(i5);
                int i6 = mnVar.b;
                if ((i6 & 3) == 3) {
                    keeVar.G(lpVar3);
                } else if ((i6 & 1) != 0) {
                    xp xpVar2 = mnVar.c;
                    if (xpVar2 == null) {
                        keeVar.G(lpVar3);
                    } else {
                        keeVar.I(lpVar3, xpVar2, mnVar.d);
                    }
                } else if ((i6 & 14) == 14) {
                    keeVar.H(lpVar3, mnVar.c, mnVar.d);
                } else if ((i6 & 12) == 12) {
                    xp xpVar3 = mnVar.c;
                    xp xpVar4 = mnVar.d;
                    lpVar3.m(z);
                    RecyclerView recyclerView = (RecyclerView) keeVar.a;
                    if (!recyclerView.w) {
                        kv kvVar = recyclerView.C;
                        int i7 = xpVar3.b;
                        int i8 = xpVar4.b;
                        if (i7 == i8 && xpVar3.a == xpVar4.a) {
                            kvVar.a(lpVar3);
                        } else if (kvVar.g(lpVar3, i7, xpVar3.a, i8, xpVar4.a)) {
                            recyclerView.Q();
                        }
                    } else if (recyclerView.C.m(lpVar3, lpVar3, xpVar3, xpVar4)) {
                        recyclerView.Q();
                    }
                } else if ((i6 & 4) != 0) {
                    keeVar.I(lpVar3, mnVar.c, null);
                } else if ((i6 & 8) != 0) {
                    keeVar.H(lpVar3, mnVar.c, mnVar.d);
                }
                mn.b(mnVar);
                i5--;
                z = false;
            }
        } else {
            i = -1;
        }
        ky kyVar = this.m;
        le leVar = this.e;
        kyVar.aQ(leVar);
        lmVar.b = lmVar.e;
        this.w = false;
        this.x = false;
        lmVar.j = false;
        lmVar.k = false;
        this.m.u = false;
        ArrayList arrayList = leVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        ky kyVar2 = this.m;
        if (kyVar2.z) {
            kyVar2.y = 0;
            kyVar2.z = false;
            leVar.m();
        }
        this.m.q(lmVar);
        P(true);
        ac(false);
        this.V.g();
        int[] iArr = this.aC;
        int i9 = iArr[0];
        int i10 = iArr[1];
        aB(iArr);
        if (iArr[0] != i9 || iArr[1] != i10) {
            C(0, 0);
        }
        if (this.az && this.l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = lmVar.m;
            if (j3 != -1) {
                kr krVar2 = this.l;
                if (krVar2.c && krVar2 != null) {
                    int c2 = this.h.c();
                    int i11 = 0;
                    lpVar = null;
                    while (true) {
                        if (i11 >= c2) {
                            break;
                        }
                        lp h3 = h(this.h.f(i11));
                        if (h3 != null && !h3.u() && h3.e == j3) {
                            if (!this.h.k(h3.a)) {
                                lpVar = h3;
                                break;
                            }
                            lpVar = h3;
                        }
                        i11++;
                    }
                    if (lpVar != null) {
                        ja jaVar = this.h;
                        View view2 = lpVar.a;
                        if (!jaVar.k(view2) && view2.hasFocusable()) {
                            view = view2;
                            if (view != null) {
                                int i12 = lmVar.n;
                                if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                                    view = findViewById;
                                }
                                view.requestFocus();
                            }
                        }
                    }
                    if (this.h.a() > 0) {
                        int i13 = lmVar.l;
                        if (i13 == i) {
                            i13 = 0;
                        }
                        int a4 = lmVar.a();
                        for (int i14 = i13; i14 < a4; i14++) {
                            lp f = f(i14);
                            if (f == null) {
                                break;
                            }
                            View view3 = f.a;
                            if (view3.hasFocusable()) {
                                view = view3;
                                break;
                            }
                        }
                        int min = Math.min(a4, i13) - 1;
                        while (true) {
                            if (min < 0) {
                                break;
                            }
                            lp f2 = f(min);
                            if (f2 == null) {
                                break;
                            }
                            View view4 = f2.a;
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
            }
            lpVar = null;
            if (lpVar != null) {
            }
            if (this.h.a() > 0) {
            }
            if (view != null) {
            }
        }
        aG();
    }

    public final void B(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ax().f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void C(int i, int i2) {
        this.ar++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.aB;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((kt) this.aB.get(size)).L(this, i, i2);
                }
            }
        }
        this.ar--;
    }

    public final void D() {
        if (this.B != null) {
            return;
        }
        EdgeEffect n = this.aL.n(this);
        this.B = n;
        if (this.i) {
            n.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            n.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void E() {
        if (this.y != null) {
            return;
        }
        EdgeEffect n = this.aL.n(this);
        this.y = n;
        if (this.i) {
            n.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            n.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void F() {
        if (this.A != null) {
            return;
        }
        EdgeEffect n = this.aL.n(this);
        this.A = n;
        if (this.i) {
            n.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            n.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void G() {
        if (this.z != null) {
            return;
        }
        EdgeEffect n = this.aL.n(this);
        this.z = n;
        if (this.i) {
            n.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            n.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void H(lm lmVar) {
        if (this.D != 2) {
            lmVar.o = 0;
            lmVar.p = 0;
        } else {
            OverScroller overScroller = this.J.a;
            lmVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            lmVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void J() {
        this.B = null;
        this.z = null;
        this.A = null;
        this.y = null;
    }

    public final void K() {
        if (this.o.size() == 0) {
            return;
        }
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.T("Cannot invalidate item decorations during a scroll or layout");
        }
        M();
        requestLayout();
    }

    public final void L(int i) {
        if (this.m == null) {
            return;
        }
        Z(2);
        this.m.aa(i);
        awakenScrollBars();
    }

    final void M() {
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            ((kz) this.h.f(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kz kzVar = (kz) ((lp) arrayList.get(i2)).a.getLayoutParams();
            if (kzVar != null) {
                kzVar.e = true;
            }
        }
    }

    public final void N(int i, int i2, boolean z) {
        int i3;
        int c2 = this.h.c();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= c2) {
                break;
            }
            lp h = h(this.h.f(i4));
            if (h != null && !h.z()) {
                int i5 = h.c;
                if (i5 >= i3) {
                    h.j(-i2, z);
                    this.M.f = true;
                } else if (i5 >= i) {
                    h.e(8);
                    h.j(-i2, z);
                    h.c = i - 1;
                    this.M.f = true;
                }
            }
            i4++;
        }
        le leVar = this.e;
        ArrayList arrayList = leVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            lp lpVar = (lp) arrayList.get(size);
            if (lpVar != null) {
                int i6 = lpVar.c;
                if (i6 >= i3) {
                    lpVar.j(-i2, z);
                } else if (i6 >= i) {
                    lpVar.e(8);
                    leVar.h(size);
                }
            }
        }
    }

    public final void O() {
        this.aq++;
    }

    public final void P(boolean z) {
        int i;
        int i2 = this.aq - 1;
        this.aq = i2;
        if (i2 <= 0) {
            this.aq = 0;
            if (z) {
                int i3 = this.ao;
                this.ao = 0;
                if (i3 != 0 && aj()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.S;
                for (int size = list.size() - 1; size >= 0; size--) {
                    lp lpVar = (lp) list.get(size);
                    View view = lpVar.a;
                    if (view.getParent() == this && !lpVar.z() && (i = lpVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        lpVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void Q() {
        if (this.P || !this.p) {
            return;
        }
        Runnable runnable = this.aG;
        int i = yq.a;
        postOnAnimation(runnable);
        this.P = true;
    }

    public final void R(boolean z) {
        this.x = z | this.x;
        this.w = true;
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            lp h = h(this.h.f(i));
            if (h != null && !h.z()) {
                h.e(6);
            }
        }
        M();
        le leVar = this.e;
        ArrayList arrayList = leVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lp lpVar = (lp) arrayList.get(i2);
            if (lpVar != null) {
                lpVar.e(6);
                lpVar.d(null);
            }
        }
        kr krVar = leVar.f.l;
        if (krVar == null || !krVar.c) {
            leVar.g();
        }
    }

    public final void S() {
        kv kvVar = this.C;
        if (kvVar != null) {
            kvVar.e();
        }
        ky kyVar = this.m;
        if (kyVar != null) {
            le leVar = this.e;
            kyVar.aP(leVar);
            this.m.aQ(leVar);
        }
        this.e.c();
    }

    public final void T(lc lcVar) {
        this.ah.remove(lcVar);
        if (this.ai == lcVar) {
            this.ai = null;
        }
    }

    public final void U(int i, int i2, int[] iArr) {
        lp lpVar;
        ab();
        O();
        Trace.beginSection("RV Scroll");
        lm lmVar = this.M;
        H(lmVar);
        int d2 = i != 0 ? this.m.d(i, this.e, lmVar) : 0;
        int e = i2 != 0 ? this.m.e(i2, this.e, lmVar) : 0;
        Trace.endSection();
        int a2 = this.h.a();
        for (int i3 = 0; i3 < a2; i3++) {
            View e2 = this.h.e(i3);
            lp g = g(e2);
            if (g != null && (lpVar = g.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = lpVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        P(true);
        ac(false);
        if (iArr != null) {
            iArr[0] = d2;
            iArr[1] = e;
        }
    }

    public final void V(int i) {
        if (this.t) {
            return;
        }
        ae();
        ky kyVar = this.m;
        if (kyVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kyVar.aa(i);
            awakenScrollBars();
        }
    }

    public final void W(lr lrVar) {
        this.Q = lrVar;
        yq.l(this, lrVar);
    }

    public final void X(kr krVar) {
        suppressLayout(false);
        kr krVar2 = this.l;
        if (krVar2 != null) {
            krVar2.s(this.af);
            this.l.l(this);
        }
        S();
        this.g.i();
        kr krVar3 = this.l;
        this.l = krVar;
        if (krVar != null) {
            krVar.r(this.af);
            krVar.j(this);
        }
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.br();
        }
        le leVar = this.e;
        kr krVar4 = this.l;
        leVar.c();
        leVar.e(krVar3, true);
        ifn p = leVar.p();
        if (krVar3 != null) {
            p.b--;
        }
        if (p.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) p.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ArrayList arrayList = ((ld) sparseArray.valueAt(i)).a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yg.d(((lp) arrayList.get(i2)).a);
                }
                arrayList.clear();
                i++;
            }
        }
        if (krVar4 != null) {
            p.b++;
        }
        leVar.d();
        this.M.f = true;
        R(false);
        requestLayout();
    }

    public final void Y(ky kyVar) {
        if (kyVar == this.m) {
            return;
        }
        ae();
        if (this.m != null) {
            kv kvVar = this.C;
            if (kvVar != null) {
                kvVar.e();
            }
            ky kyVar2 = this.m;
            le leVar = this.e;
            kyVar2.aP(leVar);
            this.m.aQ(leVar);
            leVar.c();
            if (this.p) {
                this.m.bu(this);
            }
            this.m.ba(null);
            this.m = null;
        } else {
            this.e.c();
        }
        ja jaVar = this.h;
        jaVar.a.d();
        List list = jaVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jaVar.e.E((View) list.get(size));
            list.remove(size);
        }
        kee keeVar = jaVar.e;
        int B = keeVar.B();
        for (int i = 0; i < B; i++) {
            View D = keeVar.D(i);
            ((RecyclerView) keeVar.a).z(D);
            D.clearAnimation();
        }
        ((RecyclerView) keeVar.a).removeAllViews();
        this.m = kyVar;
        if (kyVar != null) {
            if (kyVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + kyVar + " is already attached to a RecyclerView:" + kyVar.s.k());
            }
            this.m.ba(this);
            if (this.p) {
                this.m.bg();
            }
        }
        this.e.m();
        requestLayout();
    }

    public final void Z(int i) {
        if (i == this.D) {
            return;
        }
        this.D = i;
        if (i != 2) {
            aJ();
        }
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.aO(i);
        }
        List list = this.aB;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((kt) this.aB.get(size)).z(i);
            }
        }
    }

    public final void aa(int i) {
        if (this.t) {
            return;
        }
        ky kyVar = this.m;
        if (kyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kyVar.aq(this, i);
        }
    }

    public final void ab() {
        int i = this.am + 1;
        this.am = i;
        if (i != 1 || this.t) {
            return;
        }
        this.s = false;
    }

    public final void ac(boolean z) {
        int i = this.am;
        if (i <= 0) {
            this.am = 1;
            i = 1;
        }
        if (!z && !this.t) {
            this.s = false;
        }
        if (i == 1) {
            if (z && this.s && !this.t && this.m != null && this.l != null) {
                A();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.am--;
    }

    public final void ad(int i) {
        ax().b(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (b && !this.al && (!hasFocus() || this.ak)) {
            if (i != 2) {
                if (i == 1) {
                    i = 1;
                }
            }
            if (i == 2) {
                arrayList.add(this);
            }
            super.addFocusables(arrayList, i, i2);
            if (i == 1) {
                arrayList.add(this);
            }
            Runnable runnable = this.aj;
            removeCallbacks(runnable);
            this.r = true;
            post(runnable);
            return;
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void ae() {
        Z(0);
        aJ();
    }

    public final boolean ag(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return ax().e(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0203, code lost:
    
        if (r1 < r13) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ah(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        int max2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        ?? r1;
        RecyclerView recyclerView;
        ky kyVar;
        int i7;
        boolean z3;
        kp kpVar;
        int bl;
        PointF M;
        int i8;
        ky kyVar2 = this.m;
        if (kyVar2 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.t) {
            return false;
        }
        boolean ad2 = kyVar2.ad();
        boolean ae = kyVar2.ae();
        int i9 = (!ad2 || Math.abs(i) < i3) ? 0 : i;
        int i10 = (!ae || Math.abs(i2) < i3) ? 0 : i2;
        if (i9 == 0) {
            if (i10 == 0) {
                return false;
            }
            i9 = 0;
        }
        if (i9 != 0) {
            EdgeEffect edgeEffect = this.y;
            if (edgeEffect == null || yp.c(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.A;
                if (edgeEffect2 != null && yp.c(edgeEffect2) != 0.0f) {
                    if (aM(this.A, i9, getWidth())) {
                        this.A.onAbsorb(i9);
                        i9 = 0;
                    }
                    i5 = i9;
                    i9 = 0;
                }
            } else {
                int i11 = -i9;
                if (aM(this.y, i11, getWidth())) {
                    this.y.onAbsorb(i11);
                    i9 = 0;
                }
                i5 = i9;
                i9 = 0;
            }
            if (i10 != 0) {
                EdgeEffect edgeEffect3 = this.z;
                if (edgeEffect3 == null || yp.c(edgeEffect3) == 0.0f) {
                    EdgeEffect edgeEffect4 = this.B;
                    if (edgeEffect4 != null && yp.c(edgeEffect4) != 0.0f) {
                        if (aM(this.B, i10, getHeight())) {
                            this.B.onAbsorb(i10);
                            i10 = 0;
                        }
                        i6 = 0;
                    }
                } else {
                    int i12 = -i10;
                    if (aM(this.z, i12, getHeight())) {
                        this.z.onAbsorb(i12);
                        i10 = 0;
                    }
                    i6 = 0;
                }
                if (i5 == 0) {
                    if (i10 != 0) {
                        i5 = 0;
                    } else {
                        max2 = 0;
                        max = 0;
                        if (i9 == 0) {
                            if (i6 == 0) {
                                return (max == 0 && max2 == 0) ? false : true;
                            }
                            i9 = 0;
                        }
                        f = i9;
                        f2 = i6;
                        if (!dispatchNestedPreFling(f, f2)) {
                            return false;
                        }
                        boolean z4 = ad2 || ae;
                        dispatchNestedFling(f, f2, z4);
                        lb lbVar = this.F;
                        if (lbVar != null && (kyVar = (recyclerView = lbVar.a).m) != 0 && recyclerView.l != null && ((Math.abs(i6) > (i7 = recyclerView.G) || Math.abs(i9) > i7) && ((z3 = kyVar instanceof lk)))) {
                            View view = null;
                            if (z3) {
                                kq kqVar = (kq) lbVar;
                                kpVar = new kp(kqVar, kqVar.a.getContext());
                            } else {
                                kpVar = null;
                            }
                            if (kpVar != null) {
                                int av = kyVar.av();
                                if (av != 0) {
                                    ko b2 = kyVar.ae() ? ((kq) lbVar).b(kyVar) : kyVar.ad() ? ((kq) lbVar).a(kyVar) : null;
                                    if (b2 != null) {
                                        int at = kyVar.at();
                                        int i13 = 0;
                                        int i14 = Integer.MIN_VALUE;
                                        z2 = false;
                                        int i15 = Integer.MAX_VALUE;
                                        View view2 = null;
                                        while (i13 < at) {
                                            View aF = kyVar.aF(i13);
                                            boolean z5 = z4;
                                            if (aF != null) {
                                                int e = kq.e(aF, b2);
                                                if (e <= 0 && e > i14) {
                                                    i14 = e;
                                                    view2 = aF;
                                                }
                                                if (e >= 0 && e < i15) {
                                                    i15 = e;
                                                    view = aF;
                                                }
                                            }
                                            i13++;
                                            z4 = z5;
                                        }
                                        z = z4;
                                        boolean z6 = (true != kyVar.ad() ? i6 : i9) > 0;
                                        if (z6 && view != null) {
                                            bl = ky.bl(view);
                                        } else {
                                            if (z6 || view2 == null) {
                                                if (true == z6) {
                                                    view = view2;
                                                }
                                                if (view != null) {
                                                    bl = ky.bl(view) + ((z3 && (M = ((lk) kyVar).M(kyVar.av() + (-1))) != null && ((M.x > 0.0f ? 1 : (M.x == 0.0f ? 0 : -1)) < 0 || (M.y > 0.0f ? 1 : (M.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1);
                                                    if (bl >= 0) {
                                                    }
                                                }
                                                bl = -1;
                                                i8 = -1;
                                                if (bl != i8) {
                                                    kpVar.b = bl;
                                                    kyVar.bb(kpVar);
                                                    return true;
                                                }
                                                r1 = 1;
                                                if (z) {
                                                    return z2;
                                                }
                                                int i16 = -i4;
                                                aI(r1);
                                                this.J.a(Math.max(i16, Math.min(i9, i4)), Math.max(i16, Math.min(i6, i4)));
                                                return r1;
                                            }
                                            bl = ky.bl(view2);
                                        }
                                        i8 = -1;
                                        if (bl != i8) {
                                        }
                                    }
                                }
                                z = z4;
                                z2 = false;
                                bl = -1;
                                i8 = -1;
                                if (bl != i8) {
                                }
                            }
                        }
                        z = z4;
                        z2 = false;
                        r1 = 1;
                        if (z) {
                        }
                    }
                }
                int i17 = -i4;
                max = Math.max(i17, Math.min(i5, i4));
                max2 = Math.max(i17, Math.min(i10, i4));
                aI(1);
                this.J.a(max, max2);
                if (i9 == 0) {
                }
                f = i9;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                }
            }
            i6 = i10;
            i10 = 0;
            if (i5 == 0) {
            }
            int i172 = -i4;
            max = Math.max(i172, Math.min(i5, i4));
            max2 = Math.max(i172, Math.min(i10, i4));
            aI(1);
            this.J.a(max, max2);
            if (i9 == 0) {
            }
            f = i9;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
            }
        }
        i5 = 0;
        if (i10 != 0) {
        }
        i6 = i10;
        i10 = 0;
        if (i5 == 0) {
        }
        int i1722 = -i4;
        max = Math.max(i1722, Math.min(i5, i4));
        max2 = Math.max(i1722, Math.min(i10, i4));
        aI(1);
        this.J.a(max, max2);
        if (i9 == 0) {
        }
        f = i9;
        f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
        }
    }

    public final boolean ai() {
        return !this.q || this.w || this.g.k();
    }

    public final boolean aj() {
        AccessibilityManager accessibilityManager = this.ap;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ak() {
        return this.aq > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016e, code lost:
    
        if (r4 == r27) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean al(int i, int i2, int i3, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        boolean z;
        x();
        if (this.l != null) {
            int[] iArr = this.R;
            iArr[0] = 0;
            iArr[1] = 0;
            U(i, i2, iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            i8 = i - i13;
            i9 = i2 - i14;
            i7 = i14;
            i6 = i13;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.R;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int[] iArr3 = this.aE;
        B(i6, i7, i8, i9, iArr3, i5, iArr2);
        int i15 = iArr2[0];
        int i16 = i8 - i15;
        int i17 = iArr2[1];
        int i18 = i9 - i17;
        boolean z2 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.aw;
        int i20 = iArr3[0];
        this.aw = i19 - i20;
        int i21 = this.ax;
        int i22 = iArr3[1];
        this.ax = i21 - i22;
        int[] iArr4 = this.aF;
        iArr4[0] = iArr4[0] + i20;
        iArr4[1] = iArr4[1] + i22;
        if (motionEvent != null) {
            if (i6 != 0) {
                aO().S(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i6);
            }
            if (i7 != 0) {
                aO().S(motionEvent.getDeviceId(), motionEvent.getSource(), i4, i7);
            }
        }
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || yg.e(motionEvent, 8194)) {
                i10 = i6;
            } else {
                float x = motionEvent.getX();
                float f2 = i16;
                float y = motionEvent.getY();
                float f3 = i18;
                if (f2 < 0.0f) {
                    E();
                    f = 0.0f;
                    i10 = i6;
                    yp.d(this.y, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                    aO().R(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                } else {
                    i10 = i6;
                    f = 0.0f;
                    if (f2 > 0.0f) {
                        F();
                        yp.d(this.A, f2 / getWidth(), y / getHeight());
                        aO().R(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
                    } else {
                        z = false;
                        if (f3 >= f) {
                            G();
                            yp.d(this.z, (-f3) / getHeight(), x / getWidth());
                            aO().R(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                        } else if (f3 > f) {
                            D();
                            yp.d(this.B, f3 / getHeight(), 1.0f - (x / getWidth()));
                            aO().R(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                        } else if (!z) {
                            if (f2 == f) {
                            }
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31 && yg.e(motionEvent, 4194304)) {
                            aE();
                        }
                    }
                }
                z = true;
                if (f3 >= f) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                    aE();
                }
            }
            w(i, i2);
        } else {
            i10 = i6;
        }
        if (i10 != 0) {
            i11 = i10;
        } else {
            if (i7 == 0) {
                i12 = 0;
                if (!awakenScrollBars()) {
                    invalidate();
                }
                return !z2 ? true : true;
            }
            i11 = 0;
        }
        C(i11, i7);
        i12 = i11;
        if (!awakenScrollBars()) {
        }
        return !z2 ? true : true;
    }

    public final void an(lp lpVar, int i) {
        if (!ak()) {
            lpVar.a.setImportantForAccessibility(i);
        } else {
            lpVar.p = i;
            this.S.add(lpVar);
        }
    }

    public final void ao() {
        kv kvVar = this.C;
        if (kvVar != null) {
            kvVar.e();
            this.C.m = null;
        }
        this.C = null;
    }

    public final void ap(int i, int i2, boolean z) {
        ky kyVar = this.m;
        if (kyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.t) {
            return;
        }
        if (true != kyVar.ad()) {
            i = 0;
        }
        if (true != kyVar.ae()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aq(i3, 1);
        }
        this.J.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void aq(int i, int i2) {
        ax().h(i, i2);
    }

    public final void ar(lp lpVar, xp xpVar) {
        lpVar.l(0, 8192);
        if (this.M.h && lpVar.x() && !lpVar.u() && !lpVar.z()) {
            this.V.f(d(lpVar), lpVar);
        }
        this.V.o(lpVar, xpVar);
    }

    public final void as(kt ktVar) {
        if (this.aB == null) {
            this.aB = new ArrayList();
        }
        this.aB.add(ktVar);
    }

    public final void at(kt ktVar) {
        List list = this.aB;
        if (list != null) {
            list.remove(ktVar);
        }
    }

    public final void au(kt ktVar) {
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.T("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.o;
        arrayList.remove(ktVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        M();
        requestLayout();
    }

    public final void av(kt ktVar) {
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.T("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(ktVar);
        M();
        requestLayout();
    }

    public final int b(lp lpVar) {
        if (lpVar.p(524) || !lpVar.r()) {
            return -1;
        }
        hq hqVar = this.g;
        int i = lpVar.c;
        ArrayList arrayList = hqVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hp hpVar = (hp) arrayList.get(i2);
            int i3 = hpVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = hpVar.b;
                    if (i4 <= i) {
                        int i5 = hpVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = hpVar.b;
                    if (i6 == i) {
                        i = hpVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (hpVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (hpVar.b <= i) {
                i += hpVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        lp h = h(view);
        if (h != null) {
            return h.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof kz) && this.m.t((kz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ad()) {
            return kyVar.C(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ad()) {
            return kyVar.D(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ad()) {
            return kyVar.E(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ae()) {
            return kyVar.F(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ae()) {
            return kyVar.G(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        ky kyVar = this.m;
        if (kyVar != null && kyVar.ae()) {
            return kyVar.H(this.M);
        }
        return 0;
    }

    final long d(lp lpVar) {
        return this.l.c ? lpVar.e : lpVar.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        ky kyVar = this.m;
        int i = 0;
        if (kyVar == null) {
            return false;
        }
        if (kyVar.ae()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    ap(0, measuredHeight, false);
                } else {
                    ap(0, -measuredHeight, false);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean ah = kyVar.ah();
                if (keyCode == 122) {
                    if (ah) {
                        i = this.l.a();
                    }
                } else if (!ah) {
                    i = this.l.a();
                }
                aa(i);
                return true;
            }
        } else if (kyVar.ad()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    ap(measuredWidth, 0, false);
                } else {
                    ap(-measuredWidth, 0, false);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean ah2 = kyVar.ah();
                if (keyCode2 == 122) {
                    if (ah2) {
                        i = this.l.a();
                    }
                } else if (!ah2) {
                    i = this.l.a();
                }
                aa(i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return ax().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return ax().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return ax().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return ax().f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((kt) arrayList.get(i)).j(canvas, this);
        }
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.y;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.z;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.A;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.A;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.B;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.B;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.C != null && arrayList.size() > 0 && this.C.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final Rect e(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        if (!kzVar.e) {
            return kzVar.d;
        }
        if (this.M.g && (kzVar.b() || kzVar.c.s())) {
            return kzVar.d;
        }
        Rect rect = kzVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((kt) arrayList.get(i)).b(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        kzVar.e = false;
        return rect;
    }

    public final lp f(int i) {
        lp lpVar = null;
        if (this.w) {
            return null;
        }
        int c2 = this.h.c();
        for (int i2 = 0; i2 < c2; i2++) {
            lp h = h(this.h.f(i2));
            if (h != null && !h.u() && b(h) == i) {
                if (!this.h.k(h.a)) {
                    return h;
                }
                lpVar = h;
            }
        }
        return lpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0067, code lost:
    
        if (r6.findNextFocus(r16, r17, true != ((r16.m.aw() == 1) ^ (r2 == 2)) ? 17 : 66) == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r6.findNextFocus(r16, r17, r2 == 2 ? 130 : 33) != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (j(r17) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        ab();
        r16.m.k(r17, r2, r16.e, r16.M);
        ac(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r14 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        if (r14 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        if ((r14 * r13) >= 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2 = i;
        boolean z = (this.l == null || this.m == null || ak() || this.t) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z) {
            if (i2 != 2) {
                if (i2 == 1) {
                    i2 = 1;
                }
            }
            if (this.m.ae()) {
            }
            if (this.m.ad()) {
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i2);
                }
                aF(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view && j(view2) != null) {
                if (view != null && j(view) != null) {
                    Rect rect = this.j;
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                    Rect rect2 = this.ag;
                    rect2.set(0, 0, view2.getWidth(), view2.getHeight());
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i3 = this.m.aw() != 1 ? -1 : 1;
                    int i4 = ((rect.left >= rect2.left || rect.right <= rect2.left) && rect.right < rect2.right) ? 1 : ((rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left) ? -1 : 0;
                    char c2 = ((rect.top >= rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom) ? (char) 1 : ((rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top) ? (char) 65535 : (char) 0;
                    if (i2 == 1) {
                        if (i2 != 2) {
                            if (i2 != 17) {
                                if (i2 != 33) {
                                    if (i2 != 66) {
                                        if (i2 != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i2 + k());
                                        }
                                    }
                                }
                            }
                        } else if (c2 > 0 || (c2 == 0 && i4 * i3 > 0)) {
                            return view2;
                        }
                    } else if (c2 >= 0) {
                        if (c2 == 0) {
                        }
                    }
                }
                return view2;
            }
            this.ak = true;
            View focusSearch = super.focusSearch(view, i2);
            this.ak = false;
            return focusSearch;
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i2);
        if (findNextFocus == null && z) {
            x();
            if (j(view) == null) {
                return null;
            }
            ab();
            view2 = this.m.k(view, i2, this.e, this.M);
            ac(false);
        } else {
            view2 = findNextFocus;
        }
        if (view2 == null) {
        }
        if (view2 != null) {
            if (view != null) {
                Rect rect3 = this.j;
                rect3.set(0, 0, view.getWidth(), view.getHeight());
                Rect rect22 = this.ag;
                rect22.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(view2, rect22);
                if (this.m.aw() != 1) {
                }
                if (rect3.left >= rect22.left) {
                }
                if (rect3.top >= rect22.top) {
                }
                if (i2 == 1) {
                }
            }
            return view2;
        }
        this.ak = true;
        View focusSearch2 = super.focusSearch(view, i2);
        this.ak = false;
        return focusSearch2;
    }

    public final lp g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return h(view);
        }
        throw new IllegalArgumentException(a.ae(this, view, "View ", " is not a direct child of "));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ky kyVar = this.m;
        if (kyVar != null) {
            return kyVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ky kyVar = this.m;
        if (kyVar != null) {
            return kyVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return ax().g(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.t;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return ax().a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View j(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final String k() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aq = 0;
        this.p = true;
        this.q = this.q && !isLayoutRequested();
        this.e.d();
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.bg();
        }
        this.P = false;
        ThreadLocal threadLocal = jx.a;
        jx jxVar = (jx) threadLocal.get();
        this.K = jxVar;
        if (jxVar == null) {
            this.K = new jx();
            int i = yq.a;
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            jx jxVar2 = this.K;
            jxVar2.e = (long) (1.0E9f / f);
            threadLocal.set(jxVar2);
        }
        this.K.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kv kvVar = this.C;
        if (kvVar != null) {
            kvVar.e();
        }
        ae();
        this.p = false;
        ky kyVar = this.m;
        if (kyVar != null) {
            kyVar.bu(this);
        }
        this.S.clear();
        removeCallbacks(this.aG);
        while (mn.a.a() != null) {
        }
        le leVar = this.e;
        int i = 0;
        while (true) {
            ArrayList arrayList = leVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            yg.d(((lp) arrayList.get(i)).a);
            i++;
        }
        leVar.e(leVar.f.l, false);
        Iterator a2 = new yt(this, 1).a();
        while (a2.hasNext()) {
            yg.h((View) a2.next()).H();
        }
        jx jxVar = this.K;
        if (jxVar != null) {
            jxVar.c.remove(this);
            this.K = null;
        }
        removeCallbacks(this.aj);
        this.r = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kt) arrayList.get(i)).c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        float y;
        boolean z;
        float x;
        MotionEvent motionEvent2;
        int i7;
        float f4;
        int i8;
        RecyclerView recyclerView = this;
        if (recyclerView.m == null || recyclerView.t || motionEvent.getAction() != 8) {
            return false;
        }
        float f5 = 0.0f;
        if ((motionEvent.getSource() & 2) != 0) {
            if (recyclerView.m.ae()) {
                i8 = 9;
                f4 = -motionEvent.getAxisValue(9);
            } else {
                f4 = 0.0f;
                i8 = 0;
            }
            if (recyclerView.m.ad()) {
                f = motionEvent.getAxisValue(10);
                i = i8;
                i2 = 10;
                f5 = f4;
                i5 = 0;
                i6 = i5;
                float f6 = f5 * recyclerView.I;
                int i9 = (int) (f * recyclerView.H);
                int i10 = (int) f6;
                if (i5 != 0) {
                    OverScroller overScroller = recyclerView.J.a;
                    recyclerView.ap(i9 + (overScroller.getFinalX() - overScroller.getCurrX()), i10 + (overScroller.getFinalY() - overScroller.getCurrY()), true);
                } else {
                    ky kyVar = recyclerView.m;
                    if (kyVar == null) {
                        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!recyclerView.t) {
                        int[] iArr = recyclerView.R;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        boolean ad2 = kyVar.ad();
                        boolean ae = kyVar.ae();
                        int i11 = ae ? (ad2 ? 1 : 0) | 2 : ad2 ? 1 : 0;
                        if (motionEvent == null) {
                            f3 = 2.0f;
                            y = recyclerView.getHeight() / 2.0f;
                        } else {
                            f3 = 2.0f;
                            y = motionEvent.getY();
                        }
                        if (motionEvent == null) {
                            z = false;
                            x = recyclerView.getWidth() / f3;
                        } else {
                            z = false;
                            x = motionEvent.getX();
                        }
                        int a2 = i9 - recyclerView.a(i9, y);
                        int aw = i10 - recyclerView.aw(i10, x);
                        recyclerView.aq(i11, 1);
                        if (recyclerView.ag(true != ad2 ? z ? 1 : 0 : a2, true != ae ? z ? 1 : 0 : aw, iArr, recyclerView.aE, 1)) {
                            a2 -= iArr[z ? 1 : 0];
                            aw -= iArr[1];
                        }
                        recyclerView = this;
                        motionEvent2 = motionEvent;
                        recyclerView.al(true != ad2 ? z ? 1 : 0 : a2, true != ae ? z ? 1 : 0 : aw, i2, i, motionEvent2, 1);
                        jx jxVar = recyclerView.K;
                        if (jxVar != null) {
                            if (a2 != 0) {
                                i7 = a2;
                            } else if (aw != 0) {
                                i7 = z ? 1 : 0;
                            }
                            jxVar.a(recyclerView, i7, aw);
                        }
                        recyclerView.ad(1);
                        if (i6 == 0 && i5 == 0) {
                            recyclerView.U.a(motionEvent2, 26);
                            return z;
                        }
                    }
                }
                motionEvent2 = motionEvent;
                z = false;
                return i6 == 0 ? z : z;
            }
            i = i8;
            f = 0.0f;
            f5 = f4;
            i2 = 0;
        } else if ((motionEvent.getSource() & 4194304) != 0) {
            float axisValue = motionEvent.getAxisValue(26);
            if (recyclerView.m.ae()) {
                f2 = -axisValue;
                i4 = 0;
                i3 = 26;
            } else if (recyclerView.m.ad()) {
                f2 = 0.0f;
                i4 = 26;
                f5 = axisValue;
                i3 = 0;
            } else {
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
            }
            i = i3;
            i2 = i4;
            i5 = recyclerView.T ? 1 : 0;
            i6 = 26;
            f = f5;
            f5 = f2;
            float f62 = f5 * recyclerView.I;
            int i92 = (int) (f * recyclerView.H);
            int i102 = (int) f62;
            if (i5 != 0) {
            }
            motionEvent2 = motionEvent;
            z = false;
            if (i6 == 0) {
            }
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        i5 = i2;
        i6 = i5;
        float f622 = f5 * recyclerView.I;
        int i922 = (int) (f * recyclerView.H);
        int i1022 = (int) f622;
        if (i5 != 0) {
        }
        motionEvent2 = motionEvent;
        z = false;
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        if (r2 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
    
        if (r9.D != 2) goto L90;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.t) {
            return false;
        }
        this.ai = null;
        if (aK(motionEvent)) {
            ay();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            ArrayList arrayList = this.ah;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lc lcVar = (lc) arrayList.get(i);
                if (lcVar != null && lcVar != this.ai) {
                    lcVar.k(obtain);
                }
            }
            return true;
        }
        ky kyVar = this.m;
        if (kyVar == null) {
            return false;
        }
        boolean ad2 = kyVar.ad();
        boolean ae = kyVar.ae();
        VelocityTracker velocityTracker = this.at;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.at = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.an) {
                this.an = false;
            }
            this.as = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aw = x;
            this.au = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.ax = y;
            this.av = y;
            EdgeEffect edgeEffect = this.y;
            if (edgeEffect == null || yp.c(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                yp.d(this.y, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && yp.c(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                yp.d(this.A, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.z;
            if (edgeEffect3 != null && yp.c(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                yp.d(this.z, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.B;
            if (edgeEffect4 != null && yp.c(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                yp.d(this.B, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            } else if (!z) {
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            Z(1);
            ad(1);
            int[] iArr = this.aF;
            iArr[1] = 0;
            iArr[0] = 0;
            aI(0);
        } else if (actionMasked == 1) {
            this.at.clear();
            ad(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.as);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.as + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(findPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(findPointerIndex) + 0.5f;
            if (this.D != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.au;
                int i5 = i2 - this.av;
                if (!ad2 || Math.abs(i4) <= this.E) {
                    z2 = false;
                } else {
                    this.aw = i3;
                    z2 = true;
                }
                if (ae && Math.abs(i5) > this.E) {
                    this.ax = i2;
                }
                Z(1);
            }
        } else if (actionMasked == 3) {
            ay();
        } else if (actionMasked == 5) {
            this.as = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aw = x3;
            this.au = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ax = y3;
            this.av = y3;
        } else if (actionMasked == 6) {
            aC(motionEvent);
        }
        return this.D == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        A();
        Trace.endSection();
        this.q = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        ky kyVar = this.m;
        if (kyVar == null) {
            y(i, i2);
            return;
        }
        boolean z = false;
        if (kyVar.af()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            ky kyVar2 = this.m;
            lm lmVar = this.M;
            kyVar2.bs(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aH = z;
            if (z || this.l == null) {
                return;
            }
            if (lmVar.d == 1) {
                az();
            }
            this.m.aX(i, i2);
            lmVar.i = true;
            aA();
            this.m.aZ(i, i2);
            if (this.m.aj()) {
                this.m.aX(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                lmVar.i = true;
                aA();
                this.m.aZ(i, i2);
            }
            this.aI = getMeasuredWidth();
            this.aJ = getMeasuredHeight();
            return;
        }
        if (this.u) {
            ab();
            O();
            aD();
            P(true);
            lm lmVar2 = this.M;
            if (lmVar2.k) {
                lmVar2.g = true;
            } else {
                this.g.d();
                lmVar2.g = false;
            }
            this.u = false;
            ac(false);
        } else if (this.M.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        kr krVar = this.l;
        lm lmVar3 = this.M;
        if (krVar != null) {
            lmVar3.e = krVar.a();
        } else {
            lmVar3.e = 0;
        }
        ab();
        ky kyVar3 = this.m;
        lm lmVar4 = this.M;
        kyVar3.bs(i, i2);
        ac(false);
        lmVar4.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        removeCallbacks(this.aj);
        this.r = false;
        if (ak()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof li)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        li liVar = (li) parcelable;
        this.f = liVar;
        super.onRestoreInstanceState(liVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        li liVar = new li(super.onSaveInstanceState());
        li liVar2 = this.f;
        if (liVar2 != null) {
            liVar.a = liVar2.a;
            return liVar;
        }
        ky kyVar = this.m;
        if (kyVar != null) {
            liVar.a = kyVar.N();
            return liVar;
        }
        liVar.a = null;
        return liVar;
    }

    public final boolean onScrollToTop(int i) {
        ky kyVar;
        if (!this.aA || (kyVar = this.m) == null || !kyVar.ae() || !canScrollVertically(-1)) {
            return false;
        }
        aa(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0186, code lost:
    
        if (r10 != 0) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        if (!this.t && !this.an) {
            lc lcVar = this.ai;
            if (lcVar != null) {
                lcVar.l(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.ai = null;
                }
            } else if (motionEvent.getAction() == 0 || !aK(motionEvent)) {
                ky kyVar = this.m;
                if (kyVar != null) {
                    boolean ad2 = kyVar.ad();
                    boolean ae = kyVar.ae();
                    if (this.at == null) {
                        this.at = VelocityTracker.obtain();
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionMasked == 0) {
                        int[] iArr = this.aF;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        actionMasked = 0;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    int[] iArr2 = this.aF;
                    obtain.offsetLocation(iArr2[0], iArr2[1]);
                    if (actionMasked == 0) {
                        this.as = motionEvent.getPointerId(0);
                        int x = (int) (motionEvent.getX() + 0.5f);
                        this.aw = x;
                        this.au = x;
                        int y = (int) (motionEvent.getY() + 0.5f);
                        this.ax = y;
                        this.av = y;
                        aI(0);
                    } else {
                        if (actionMasked == 1) {
                            this.at.addMovement(obtain);
                            VelocityTracker velocityTracker = this.at;
                            int i2 = this.ay;
                            velocityTracker.computeCurrentVelocity(1000, i2);
                            float f = ad2 ? -this.at.getXVelocity(this.as) : 0.0f;
                            float f2 = ae ? -this.at.getYVelocity(this.as) : 0.0f;
                            if ((f == 0.0f && f2 == 0.0f) || !ah((int) f, (int) f2, this.G, i2)) {
                                Z(0);
                            }
                            aH();
                            obtain.recycle();
                            return true;
                        }
                        if (actionMasked == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.as);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.as + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            float x2 = motionEvent.getX(findPointerIndex) + 0.5f;
                            float y2 = motionEvent.getY(findPointerIndex) + 0.5f;
                            int i3 = (int) x2;
                            int i4 = this.aw - i3;
                            int i5 = (int) y2;
                            int i6 = this.ax - i5;
                            if (this.D != 1) {
                                if (ad2) {
                                    int i7 = this.E;
                                    int max = i4 > 0 ? Math.max(0, i4 - i7) : Math.min(0, i4 + i7);
                                    if (max != 0) {
                                        i4 = max;
                                        z = true;
                                    } else {
                                        i4 = max;
                                        z = false;
                                        ad2 = true;
                                        if (ae) {
                                            ae = false;
                                        } else {
                                            int i8 = this.E;
                                            int max2 = i6 > 0 ? Math.max(0, i6 - i8) : Math.min(0, i6 + i8);
                                            if (max2 != 0) {
                                                i6 = max2;
                                                ae = true;
                                                z = true;
                                            } else {
                                                i6 = max2;
                                                ae = true;
                                            }
                                        }
                                        if (z) {
                                            Z(1);
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                ad2 = z;
                                if (ae) {
                                }
                                if (z) {
                                }
                            }
                            boolean z2 = ae;
                            boolean z3 = ad2;
                            if (this.D == 1) {
                                int[] iArr3 = this.R;
                                iArr3[0] = 0;
                                iArr3[1] = 0;
                                int a2 = i4 - a(i4, motionEvent.getY());
                                int aw = i6 - aw(i6, motionEvent.getX());
                                int i9 = true != z3 ? 0 : a2;
                                int i10 = true != z2 ? 0 : aw;
                                int[] iArr4 = this.aE;
                                if (ag(i9, i10, iArr3, iArr4, 0)) {
                                    a2 -= iArr3[0];
                                    aw -= iArr3[1];
                                    iArr2[0] = iArr2[0] + iArr4[0];
                                    iArr2[1] = iArr2[1] + iArr4[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i11 = aw;
                                this.aw = i3 - iArr4[0];
                                this.ax = i5 - iArr4[1];
                                if (al(true != z3 ? 0 : a2, true != z2 ? 0 : i11, 0, 1, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                jx jxVar = this.K;
                                if (jxVar != null) {
                                    if (a2 != 0) {
                                        i = a2;
                                    }
                                    jxVar.a(this, i, i11);
                                }
                            }
                        } else if (actionMasked == 3) {
                            ay();
                        } else if (actionMasked == 5) {
                            this.as = motionEvent.getPointerId(actionIndex);
                            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.aw = x3;
                            this.au = x3;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.ax = y3;
                            this.av = y3;
                        } else if (actionMasked == 6) {
                            aC(motionEvent);
                        }
                    }
                    this.at.addMovement(obtain);
                    obtain.recycle();
                    return true;
                }
            }
            ay();
            return true;
        }
        return false;
    }

    public final void q(lp lpVar) {
        View view = lpVar.a;
        ViewParent parent = view.getParent();
        this.e.l(g(view));
        if (lpVar.w()) {
            this.h.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        ja jaVar = this.h;
        if (parent != this) {
            jaVar.g(view, -1, true);
            return;
        }
        int C = jaVar.e.C(view);
        if (C < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        jaVar.a.e(C);
        jaVar.j(view);
    }

    public final void r(la laVar) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(laVar);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        lp h = h(view);
        if (h != null) {
            if (h.w()) {
                h.i();
            } else if (!h.z()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + h + k());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.bd() && !ak() && view2 != null) {
            aF(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.be(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.ah;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lc) arrayList.get(i)).d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.r) {
            return super.requestFocus(i, rect);
        }
        removeCallbacks(this.aj);
        this.r = false;
        View view = null;
        if (this.l != null && this.m != null && !ak() && !this.t) {
            x();
            view = this.m.j(i, this.e, this.M);
        }
        if ((view == null || !view.requestFocus(i, rect)) && !super.requestFocus(i, rect)) {
            this.al = true;
            View focusSearch = super.focusSearch(getRootView().findFocus(), i);
            if (focusSearch != null) {
                focusSearch.requestFocus(i, rect);
            }
            this.al = false;
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.am != 0 || this.t) {
            this.s = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(lc lcVar) {
        this.ah.add(lcVar);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        ky kyVar = this.m;
        if (kyVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.t) {
            return;
        }
        boolean ad2 = kyVar.ad();
        boolean ae = kyVar.ae();
        if (!ad2) {
            if (!ae) {
                return;
            } else {
                ae = true;
            }
        }
        al(true != ad2 ? 0 : i, true != ae ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!ak()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ao |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            J();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.q) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        ax().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return ax().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        ax().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.t) {
            t("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.t = true;
                this.an = true;
                ae();
                return;
            }
            this.t = false;
            if (this.s && this.m != null && this.l != null) {
                requestLayout();
            }
            this.s = false;
        }
    }

    public final void t(String str) {
        if (ak()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(k()));
        }
        if (this.ar > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(k())));
        }
    }

    final void v() {
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            lp h = h(this.h.f(i));
            if (!h.z()) {
                h.f();
            }
        }
        le leVar = this.e;
        ArrayList arrayList = leVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((lp) arrayList.get(i2)).f();
        }
        ArrayList arrayList2 = leVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((lp) arrayList2.get(i3)).f();
        }
        ArrayList arrayList3 = leVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((lp) leVar.b.get(i4)).f();
            }
        }
    }

    public final void w(int i, int i2) {
        EdgeEffect edgeEffect = this.y;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.y.onRelease();
            z = this.y.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.z.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void x() {
        if (!this.q || this.w) {
            Trace.beginSection("RV FullInvalidate");
            A();
            Trace.endSection();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    Trace.beginSection("RV FullInvalidate");
                    A();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            ab();
            O();
            this.g.f();
            if (!this.s) {
                int a2 = this.h.a();
                int i = 0;
                while (true) {
                    if (i < a2) {
                        lp h = h(this.h.e(i));
                        if (h != null && !h.z() && h.x()) {
                            A();
                            break;
                        }
                        i++;
                    } else {
                        this.g.c();
                        break;
                    }
                }
            }
            ac(true);
            P(true);
            Trace.endSection();
        }
    }

    public final void y(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i3 = yq.a;
        setMeasuredDimension(ky.as(i, paddingLeft, getMinimumWidth()), ky.as(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void z(View view) {
        h(view);
        List list = this.v;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((la) this.v.get(size)).d(view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ky kyVar = this.m;
        if (kyVar != null) {
            return kyVar.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
