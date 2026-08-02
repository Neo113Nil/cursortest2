package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import defpackage.aag;
import defpackage.abr;
import defpackage.abs;
import defpackage.adx;
import defpackage.brn;
import defpackage.fes;
import defpackage.ffw;
import defpackage.ffx;
import defpackage.ffy;
import defpackage.ffz;
import defpackage.fga;
import defpackage.fgc;
import defpackage.fgd;
import defpackage.fge;
import defpackage.fgf;
import defpackage.fik;
import defpackage.fke;
import defpackage.fki;
import defpackage.fkj;
import defpackage.fny;
import defpackage.fob;
import defpackage.fog;
import defpackage.fpa;
import defpackage.mr;
import defpackage.mx;
import defpackage.tw;
import defpackage.tz;
import defpackage.yj;
import defpackage.yq;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomSheetBehavior extends tw implements fke {
    public int A;
    public WeakReference B;
    final List C;
    fkj D;
    public int E;
    public WeakReference F;
    public boolean G;
    final SparseIntArray H;
    final SparseIntArray I;
    final SparseIntArray J;
    private int K;
    private float L;
    private boolean M;
    private int N;
    private int O;
    private ColorStateList P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private fog V;
    private boolean W;
    private final fgd X;
    private ValueAnimator Y;
    private boolean Z;
    public boolean a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private boolean ae;
    private final float af;
    private int ag;
    private final ArrayList ah;
    private VelocityTracker ai;
    private int aj;
    private Map ak;
    private final Rect al;
    private final abr am;
    public int b;
    public boolean c;
    public int d;
    public fob e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    int o;
    public int p;
    public int q;
    float r;
    public int s;
    float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public abs y;
    int z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 0;
        this.a = true;
        this.Q = -1;
        this.R = -1;
        this.X = new fgd(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.Z = true;
        this.ab = true;
        this.x = 4;
        this.af = 0.1f;
        this.C = new ArrayList();
        this.ah = new ArrayList();
        this.aj = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.al = new Rect();
        this.am = new ffy(this);
        this.O = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fgf.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.P = fny.e(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.V = new fog(fog.k(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.V != null) {
            fob fobVar = new fob(this.V);
            this.e = fobVar;
            fobVar.J(context);
            ColorStateList colorStateList = this.P;
            if (colorStateList != null) {
                this.e.M(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ab(), 1.0f);
        this.Y = ofFloat;
        ofFloat.setDuration(500L);
        this.Y.addUpdateListener(new fpa(this, 1));
        this.t = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.Q = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.R = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || peekValue.data != -1) {
            Z(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            Z(peekValue.data);
        }
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        if (this.u != z) {
            this.u = z;
            if (!z && this.x == 5) {
                R(4);
            }
            ai();
        }
        this.S = obtainStyledAttributes.getBoolean(16, false);
        boolean z2 = obtainStyledAttributes.getBoolean(8, true);
        if (this.a != z2) {
            this.a = z2;
            if (this.B != null) {
                af();
            }
            S((this.a && this.x == 6) ? 3 : this.x);
            aj(this.x, true);
            ai();
        }
        this.v = obtainStyledAttributes.getBoolean(15, false);
        this.w = obtainStyledAttributes.getBoolean(5, true);
        this.Z = obtainStyledAttributes.getBoolean(6, true);
        this.K = obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.r = f;
        if (this.B != null) {
            ag();
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            Q(obtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            Q(peekValue2.data);
        }
        this.b = obtainStyledAttributes.getInt(14, 500);
        this.c = obtainStyledAttributes.getBoolean(11, false);
        this.ab = obtainStyledAttributes.getBoolean(4, true);
        this.g = obtainStyledAttributes.getBoolean(20, false);
        this.h = obtainStyledAttributes.getBoolean(21, false);
        this.i = obtainStyledAttributes.getBoolean(22, false);
        this.T = obtainStyledAttributes.getBoolean(23, true);
        this.j = obtainStyledAttributes.getBoolean(17, false);
        this.k = obtainStyledAttributes.getBoolean(18, false);
        this.l = obtainStyledAttributes.getBoolean(19, false);
        this.U = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.L = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final float ab() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.e == null || (weakReference = this.B) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.B.get();
        if (!am() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float w = this.e.w();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float ap = ap(w, roundedCorner);
        float x = this.e.x();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(ap, ap(x, roundedCorner2));
    }

    private final int ac(View view, int i, int i2) {
        return yq.a(view, view.getResources().getString(i), new ffz(this, i2));
    }

    private final int ad() {
        int i;
        int i2;
        int i3;
        if (this.M) {
            i = Math.min(Math.max(this.N, this.A - ((this.z * 9) / 16)), this.ag);
            i2 = this.m;
        } else {
            if (!this.S && !this.g && (i3 = this.f) > 0) {
                return Math.max(this.d, i3 + this.O);
            }
            i = this.d;
            i2 = this.m;
        }
        return i + i2;
    }

    private final int ae(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.q : this.A : this.s : J();
    }

    private final void af() {
        int ad = ad();
        boolean z = this.a;
        int i = this.A;
        if (z) {
            this.s = Math.max(i - ad, this.p);
        } else {
            this.s = i - ad;
        }
    }

    private final void ag() {
        this.q = (int) (this.A * (1.0f - this.r));
    }

    private final void ah() {
        this.E = -1;
        this.aj = -1;
        this.F = null;
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ai = null;
        }
    }

    private final void ai() {
        View view;
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        yq.j(view, 1048576);
        yq.j(view, 524288);
        yq.j(view, 262144);
        SparseIntArray sparseIntArray = this.I;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            yq.j(view, i);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.H;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            yq.j(view, i2);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.J;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            yq.j(view, i3);
            sparseIntArray3.delete(0);
        }
        if (!this.a && this.x != 6) {
            sparseIntArray2.put(0, ac(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.u && this.x != 5) {
            yq.r(view, aag.f, new ffz(this, 5));
        }
        int i4 = this.x;
        if (i4 == 3) {
            if (X()) {
                sparseIntArray3.put(0, ac(view, R.string.bottomsheet_action_collapse, 4));
            }
        } else if (i4 == 4) {
            sparseIntArray.put(0, ac(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (X()) {
                sparseIntArray3.put(0, ac(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, ac(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void aj(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.x == 3 && (this.U || am());
        if (this.W == z2 || this.e == null) {
            return;
        }
        this.W = z2;
        if (!z || (valueAnimator = this.Y) == null) {
            ValueAnimator valueAnimator2 = this.Y;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Y.cancel();
            }
            this.e.N(this.W ? ab() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.Y.reverse();
        } else {
            this.Y.setFloatValues(this.e.p.k, z2 ? ab() : 1.0f);
            this.Y.start();
        }
    }

    private final void ak(boolean z) {
        WeakReference weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ak != null) {
                    return;
                } else {
                    this.ak = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.B.get() && z) {
                    this.ak.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ak = null;
        }
    }

    private final boolean al() {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean am() {
        WeakReference weakReference = this.B;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.B.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean an(View view) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean ao() {
        if (this.y != null) {
            return this.w || this.x == 1;
        }
        return false;
    }

    private static final float ap(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > 0.0f && f > 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    private static final int aq(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int J() {
        if (this.a) {
            return this.p;
        }
        return Math.max(this.o, this.T ? 0 : this.n);
    }

    final View K(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View K = K(viewGroup.getChildAt(i));
                if (K != null) {
                    return K;
                }
            }
        }
        return null;
    }

    public final View L() {
        List list = this.C;
        if (list.isEmpty()) {
            return null;
        }
        return (View) ((WeakReference) list.get(0)).get();
    }

    @Override // defpackage.fke
    public final void M() {
        fkj fkjVar = this.D;
        if (fkjVar == null) {
            return;
        }
        fkjVar.f();
    }

    public final void N(int i) {
        if (((View) this.B.get()) != null) {
            ArrayList arrayList = this.ah;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.s;
            if (i <= i2 && i2 != J()) {
                J();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((fga) arrayList.get(i3)).a();
            }
        }
    }

    @Override // defpackage.fke
    public final void O() {
        fkj fkjVar = this.D;
        if (fkjVar == null) {
            return;
        }
        if (fkjVar.c() == null || Build.VERSION.SDK_INT < 34) {
            R(true == this.u ? 5 : 4);
            return;
        }
        boolean z = this.u;
        fkj fkjVar2 = this.D;
        if (!z) {
            Animator e = fkjVar2.e();
            e.setDuration(fes.b(fkjVar2.b, fkjVar2.c, r0.b));
            e.start();
            R(4);
            return;
        }
        ffw ffwVar = new ffw(this);
        View view = fkjVar2.a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        ofFloat.setInterpolator(new adx());
        ofFloat.setDuration(fes.b(fkjVar2.b, fkjVar2.c, r0.b));
        ofFloat.addListener(new fki(fkjVar2));
        ofFloat.addListener(ffwVar);
        ofFloat.start();
    }

    final void P(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.C.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                P(viewGroup.getChildAt(i));
            }
        }
    }

    public final void Q(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.o = i;
        aj(this.x, true);
    }

    public final void R(int i) {
        if (!this.u && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && ae(6) <= this.p) ? 3 : i;
        WeakReference weakReference = this.B;
        if (weakReference == null || weakReference.get() == null) {
            S(i);
            return;
        }
        View view = (View) this.B.get();
        mr mrVar = new mr(this, view, i2, 9);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(mrVar);
        } else {
            mrVar.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r7 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(int i) {
        if (this.x == i) {
            return;
        }
        this.x = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.u && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.B;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            ak(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            }
            ak(false);
            i = i2;
        }
        aj(i, true);
        while (true) {
            ArrayList arrayList = this.ah;
            if (i3 >= arrayList.size()) {
                ai();
                return;
            } else {
                ((fga) arrayList.get(i3)).b();
                i3++;
            }
        }
    }

    @Override // defpackage.fke
    public final void T(mx mxVar) {
        fkj fkjVar = this.D;
        if (fkjVar == null) {
            return;
        }
        fkjVar.e = mxVar;
    }

    public final void U(View view, int i, boolean z) {
        int ae = ae(i);
        abs absVar = this.y;
        if (absVar == null || (!z ? absVar.j(view, view.getLeft(), ae) : absVar.h(view.getLeft(), ae))) {
            S(i);
            return;
        }
        S(2);
        aj(i, true);
        this.X.a(i);
    }

    @Override // defpackage.fke
    public final void V(mx mxVar) {
        fkj fkjVar = this.D;
        if (fkjVar == null) {
            return;
        }
        fkjVar.h(mxVar);
    }

    public final boolean W() {
        return this.u;
    }

    final boolean X() {
        return (this.v && this.u) ? false : true;
    }

    public final boolean Y(View view, float f) {
        if (this.v) {
            return true;
        }
        if (view.getTop() < this.s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.af)) - ((float) this.s)) / ((float) ad()) > 0.5f;
    }

    public final void Z(int i) {
        boolean z = this.M;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.M = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.M = false;
            this.d = Math.max(0, i);
        }
        aa();
    }

    public final void aa() {
        View view;
        if (this.B != null) {
            af();
            if (this.x != 4 || (view = (View) this.B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.tw
    public final void h(tz tzVar) {
        this.B = null;
        this.y = null;
        this.D = null;
    }

    @Override // defpackage.tw
    public final void i() {
        this.B = null;
        this.y = null;
        this.D = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r2.q) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (java.lang.Math.abs(r3 - r2.p) < java.lang.Math.abs(r3 - r2.s)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.s)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.s)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (java.lang.Math.abs(r3 - r2.q) < java.lang.Math.abs(r3 - r2.s)) goto L18;
     */
    @Override // defpackage.tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == J()) {
            S(3);
            return;
        }
        if (an(view2) && this.ae) {
            if (this.ad > 0) {
                if (!this.a) {
                }
                U(view, i2, false);
                this.ae = false;
            }
            if (this.u) {
                VelocityTracker velocityTracker = this.ai;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.L);
                    yVelocity = this.ai.getYVelocity(this.E);
                }
                if (Y(view, yVelocity)) {
                    i2 = 5;
                    U(view, i2, false);
                    this.ae = false;
                }
            }
            if (this.ad == 0) {
                int top = view.getTop();
                if (!this.a) {
                    int i3 = this.q;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.a) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            U(view, i2, false);
            this.ae = false;
        }
    }

    @Override // defpackage.tw
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View L;
        int i;
        WeakReference weakReference;
        abs absVar;
        if (!view.isShown() || !this.w) {
            this.ac = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ah();
            actionMasked = 0;
        }
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.ai = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.aj = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            List list = this.C;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View view3 = (View) ((WeakReference) it.next()).get();
                    if (view3 != null && coordinatorLayout.k(view3, x2, y)) {
                        view2 = view3;
                        break;
                    }
                }
            }
            WeakReference weakReference2 = new WeakReference(view2);
            this.F = weakReference2;
            if (this.x != 2 && weakReference2.get() != null) {
                this.E = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.G = true;
            }
            this.ac = this.E == -1 && !coordinatorLayout.k(view, x, this.aj);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
            this.F = null;
            this.E = -1;
            if (this.ac) {
                this.ac = false;
                return false;
            }
        }
        if (!this.ac && (absVar = this.y) != null && absVar.i(motionEvent)) {
            return true;
        }
        if (actionMasked == 2 && al() && !this.ac && this.x != 1 && (!this.c ? (L = L()) == null || !coordinatorLayout.k(L, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.F) == null || weakReference.get() == null) && this.y != null && (i = this.aj) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.y.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    @Override // defpackage.tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        fob fobVar;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.B == null) {
            this.N = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.S || this.M) ? false : true;
            if (!this.g && !this.h && !this.i && !this.j && !this.k && !this.l) {
                if (z) {
                    z = true;
                }
                fge fgeVar = new fge(view);
                int i3 = yq.a;
                brn.K(view, fgeVar);
                this.B = new WeakReference(view);
                this.D = new fkj(view);
                fobVar = this.e;
                if (fobVar == null) {
                    view.setBackground(fobVar);
                    fob fobVar2 = this.e;
                    float f = this.t;
                    if (f == -1.0f) {
                        f = view.getElevation();
                    }
                    fobVar2.L(f);
                } else {
                    ColorStateList colorStateList = this.P;
                    if (colorStateList != null) {
                        view.setBackgroundTintList(colorStateList);
                    }
                }
                ai();
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            fik.g(view, new ffx(this, z));
            fge fgeVar2 = new fge(view);
            int i32 = yq.a;
            brn.K(view, fgeVar2);
            this.B = new WeakReference(view);
            this.D = new fkj(view);
            fobVar = this.e;
            if (fobVar == null) {
            }
            ai();
            if (view.getImportantForAccessibility() == 0) {
            }
        }
        if (this.y == null) {
            this.y = abs.b(coordinatorLayout, this.am);
        }
        int top = view.getTop();
        coordinatorLayout.j(view, i);
        this.z = coordinatorLayout.getWidth();
        this.A = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.ag = height;
        int i4 = this.A;
        int i5 = i4 - height;
        int i6 = this.n;
        if (i5 < i6) {
            boolean z2 = this.T;
            int i7 = this.R;
            if (z2) {
                height = i7 == -1 ? i4 : Math.min(i4, i7);
                this.ag = height;
            } else {
                int i8 = i4 - i6;
                height = i7 != -1 ? Math.min(i8, i7) : i8;
                this.ag = height;
            }
        }
        this.p = Math.max(0, this.A - height);
        ag();
        af();
        int i9 = this.x;
        if (i9 == 3) {
            int J = J();
            int i10 = yq.a;
            view.offsetTopAndBottom(J);
        } else if (i9 == 6) {
            int i11 = this.q;
            int i12 = yq.a;
            view.offsetTopAndBottom(i11);
        } else if (this.u && i9 == 5) {
            int i13 = this.A;
            int i14 = yq.a;
            view.offsetTopAndBottom(i13);
        } else if (i9 == 4) {
            int i15 = this.s;
            int i16 = yq.a;
            view.offsetTopAndBottom(i15);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            int i17 = yq.a;
            view.offsetTopAndBottom(top2);
        }
        aj(this.x, false);
        List list = this.C;
        list.clear();
        if (this.c) {
            P(view);
        } else {
            list.add(new WeakReference(K(view)));
        }
        while (true) {
            ArrayList arrayList = this.ah;
            if (i2 >= arrayList.size()) {
                return true;
            }
            i2++;
        }
    }

    @Override // defpackage.tw
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.ab || view.isInTouchMode()) {
            return false;
        }
        int i = this.x;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.al;
        if (view.getLocalVisibleRect(rect2)) {
            int i2 = yq.a;
            zz a = yj.a(view);
            if (a != null) {
                rect2.bottom -= a.f(519).e;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        R(3);
        return true;
    }

    @Override // defpackage.tw
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.x == 1 && actionMasked == 0) {
            return true;
        }
        if (ao()) {
            this.y.e(motionEvent);
        }
        if (actionMasked == 0) {
            ah();
        }
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.ai = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        if (ao() && actionMasked == 2 && !this.ac) {
            float abs = Math.abs(this.aj - motionEvent.getY());
            abs absVar = this.y;
            if (abs > absVar.b) {
                absVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ac;
    }

    @Override // defpackage.tw
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(aq(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.Q, marginLayoutParams.width), aq(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.R, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.tw
    public final boolean t(View view) {
        return al() && an(view) && this.x != 3 && !this.aa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r5 == false) goto L32;
     */
    @Override // defpackage.tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        if (i2 != 1 && an(view2)) {
            int top = view.getTop();
            int i3 = top - i;
            if (i > 0) {
                if (this.ae || this.Z || !view2.canScrollVertically(1)) {
                    if (i3 < J()) {
                        int J = top - J();
                        iArr[1] = J;
                        int i4 = yq.a;
                        view.offsetTopAndBottom(-J);
                        S(3);
                    } else {
                        if (!this.w) {
                            return;
                        }
                        iArr[1] = i;
                        int i5 = yq.a;
                        view.offsetTopAndBottom(-i);
                        S(1);
                    }
                    N(view.getTop());
                    this.ad = i;
                    this.ae = true;
                    this.aa = false;
                }
                this.aa = true;
                return;
            }
            if (i < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (this.ae || this.Z) {
                }
                int i6 = this.s;
                if (i3 > i6 && !W()) {
                    int i7 = top - i6;
                    iArr[1] = i7;
                    int i8 = yq.a;
                    view.offsetTopAndBottom(-i7);
                    S(4);
                } else {
                    if (!this.w) {
                        return;
                    }
                    iArr[1] = i;
                    int i9 = yq.a;
                    view.offsetTopAndBottom(-i);
                    S(1);
                }
            }
            N(view.getTop());
            this.ad = i;
            this.ae = true;
            this.aa = false;
        }
    }

    @Override // defpackage.tw
    public final void w(View view, Parcelable parcelable) {
        fgc fgcVar = (fgc) parcelable;
        int i = this.K;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = fgcVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = fgcVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.u = fgcVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.v = fgcVar.g;
            }
        }
        int i3 = fgcVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.x = i2;
    }

    @Override // defpackage.tw
    public final Parcelable x(View view) {
        return new fgc(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.tw
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.ad = 0;
        this.ae = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.tw
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.K = 0;
        this.a = true;
        this.Q = -1;
        this.R = -1;
        this.X = new fgd(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.Z = true;
        this.ab = true;
        this.x = 4;
        this.af = 0.1f;
        this.C = new ArrayList();
        this.ah = new ArrayList();
        this.aj = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.al = new Rect();
        this.am = new ffy(this);
    }
}
