package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.derinko.gbini.n1casino.R;
import defpackage.c0;
import defpackage.ct;
import defpackage.d20;
import defpackage.d30;
import defpackage.d7;
import defpackage.d8;
import defpackage.e70;
import defpackage.e8;
import defpackage.f8;
import defpackage.g8;
import defpackage.h8;
import defpackage.i8;
import defpackage.j5;
import defpackage.nd;
import defpackage.or;
import defpackage.p80;
import defpackage.q4;
import defpackage.q80;
import defpackage.q90;
import defpackage.qd;
import defpackage.rb0;
import defpackage.s90;
import defpackage.t8;
import defpackage.tr;
import defpackage.uo;
import defpackage.v;
import defpackage.v0;
import defpackage.vx;
import defpackage.w;
import defpackage.w2;
import defpackage.x80;
import defpackage.xr;
import defpackage.z80;
import defpackage.zi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends nd implements tr {
    public boolean A;
    public final i8 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public z80 Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;
    public final int a;
    public final ArrayList a0;
    public boolean b;
    public VelocityTracker b0;
    public final float c;
    public xr c0;
    public final int d;
    public int d0;
    public final boolean e;
    public int e0;
    public int f;
    public WeakReference f0;
    public boolean g;
    public boolean g0;
    public int h;
    public HashMap h0;
    public final int i;
    public final SparseIntArray i0;
    public final ct j;
    public final SparseIntArray j0;
    public final ColorStateList k;
    public final SparseIntArray k0;
    public final int l;
    public final Rect l0;
    public final int m;
    public final f8 m0;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final d20 z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new i8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new f8(this, i2);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.c);
        if (obtainStyledAttributes.hasValue(3)) {
            this.k = e70.y(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.z = d20.g(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        d20 d20Var = this.z;
        if (d20Var != null) {
            ct ctVar = new ct(d20Var);
            this.j = ctVar;
            ctVar.n(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new d8(i2, this));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i = peekValue.data) != -1) {
            K(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            K(i);
        }
        J(obtainStyledAttributes.getBoolean(10, false));
        this.o = obtainStyledAttributes.getBoolean(16, false);
        boolean z = obtainStyledAttributes.getBoolean(8, true);
        if (this.b != z) {
            this.b = z;
            if (this.Y != null) {
                x();
            }
            M((this.b && this.P == 6) ? 3 : this.P);
            Q(this.P, true);
            P();
        }
        this.K = obtainStyledAttributes.getBoolean(15, false);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        this.a = obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            t8.k("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                t8.k("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            Q(this.P, true);
        } else {
            int i3 = peekValue2.data;
            if (i3 < 0) {
                t8.k("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i3;
            Q(this.P, true);
        }
        this.d = obtainStyledAttributes.getInt(14, 500);
        this.e = obtainStyledAttributes.getBoolean(11, false);
        this.O = obtainStyledAttributes.getBoolean(4, true);
        this.p = obtainStyledAttributes.getBoolean(20, false);
        this.q = obtainStyledAttributes.getBoolean(21, false);
        this.r = obtainStyledAttributes.getBoolean(22, false);
        this.s = obtainStyledAttributes.getBoolean(23, true);
        this.t = obtainStyledAttributes.getBoolean(17, false);
        this.u = obtainStyledAttributes.getBoolean(18, false);
        this.v = obtainStyledAttributes.getBoolean(19, false);
        this.y = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View B = B(viewGroup.getChildAt(i));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof qd)) {
            t8.k("The view is not a child of CoordinatorLayout");
            return null;
        }
        nd ndVar = ((qd) layoutParams).a;
        if (ndVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ndVar;
        }
        t8.k("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int D(int i, int i2, int i3, int i4) {
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

    public final void A(int i) {
        View view = (View) this.Y.get();
        if (view != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.H;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((g8) arrayList.get(i3)).b(view);
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        t8.k(d30.e("Invalid state to get top offset: ", i));
        return 0;
    }

    public final boolean G() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void I(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                I(viewGroup.getChildAt(i));
            }
        }
    }

    public final void J(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                L(4);
            }
            P();
        }
    }

    public final void K(int i) {
        boolean z = this.g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!z && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        S();
    }

    public final void L(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && F(i) <= this.E) ? 3 : i;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            M(i);
            return;
        }
        View view = (View) this.Y.get();
        j5 j5Var = new j5(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(j5Var);
        } else {
            j5Var.run();
        }
    }

    public final void M(int i) {
        View view;
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            R(true);
        } else if (i == 6 || i == 5 || i == 4) {
            R(false);
        }
        Q(i, true);
        while (true) {
            ArrayList arrayList = this.a0;
            if (i2 >= arrayList.size()) {
                P();
                return;
            } else {
                ((g8) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean N(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) z()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        M(2);
        Q(r4, true);
        r2.B.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(View view, int i, boolean z) {
        int F = F(i);
        z80 z80Var = this.Q;
        if (z80Var != null) {
            if (!z) {
                int left = view.getLeft();
                z80Var.r = view;
                z80Var.c = -1;
                boolean h = z80Var.h(left, F, 0, 0);
                if (!h && z80Var.a == 0 && z80Var.r != null) {
                    z80Var.r = null;
                }
            }
        }
        M(i);
    }

    public final void P() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        x80.j(view, 1048576);
        x80.h(view, 0);
        x80.j(view, 524288);
        x80.h(view, 0);
        x80.j(view, 262144);
        x80.h(view, 0);
        SparseIntArray sparseIntArray = this.j0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            x80.j(view, i);
            x80.h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.i0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            x80.j(view, i2);
            x80.h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.k0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            x80.j(view, i3);
            x80.h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.b && this.P != 6) {
            sparseIntArray2.put(0, w(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            x80.k(view, c0.i, new or(this, 5));
        }
        int i4 = this.P;
        if (i4 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void Q(int i, boolean z) {
        ct ctVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.y || G());
        if (this.A == z2 || (ctVar = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            ctVar.s(this.A ? y() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(ctVar.g.i, z2 ? y() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void R(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.h0 != null) {
                    return;
                } else {
                    this.h0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.h0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.h0 = null;
        }
    }

    public final void S() {
        View view;
        if (this.Y != null) {
            x();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.tr
    public final void a() {
        xr xrVar = this.c0;
        if (xrVar == null) {
            return;
        }
        int i = xrVar.d;
        int i2 = xrVar.c;
        d7 d7Var = xrVar.f;
        xrVar.f = null;
        if (d7Var != null) {
            float f = d7Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet a = xrVar.a();
                    a.setDuration(w2.c(i2, i, f));
                    a.start();
                    L(4);
                    return;
                }
                v0 v0Var = new v0(2, this);
                View view = xrVar.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new zi(1));
                ofFloat.setDuration(w2.c(i2, i, f));
                ofFloat.addListener(new v0(7, xrVar));
                ofFloat.addListener(v0Var);
                ofFloat.start();
                return;
            }
        }
        L(this.J ? 5 : 4);
    }

    @Override // defpackage.tr
    public final void b(d7 d7Var) {
        xr xrVar = this.c0;
        if (xrVar == null) {
            return;
        }
        if (xrVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        d7 d7Var2 = xrVar.f;
        xrVar.f = d7Var;
        if (d7Var2 == null) {
            return;
        }
        xrVar.b(d7Var.c);
    }

    @Override // defpackage.tr
    public final void c(d7 d7Var) {
        xr xrVar = this.c0;
        if (xrVar == null) {
            return;
        }
        xrVar.f = d7Var;
    }

    @Override // defpackage.tr
    public final void d() {
        xr xrVar = this.c0;
        if (xrVar == null) {
            return;
        }
        if (xrVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        d7 d7Var = xrVar.f;
        xrVar.f = null;
        if (d7Var == null) {
            return;
        }
        AnimatorSet a = xrVar.a();
        a.setDuration(xrVar.e);
        a.start();
    }

    @Override // defpackage.nd
    public final void g(qd qdVar) {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    @Override // defpackage.nd
    public final void j() {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        if (r1.get() != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r18.p(r6, (int) r20.getX(), (int) r20.getY()) != false) goto L87;
     */
    @Override // defpackage.nd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        z80 z80Var;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.e0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.p(view2, x2, y)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.d0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g0 = true;
            }
            this.R = this.d0 == -1 && !coordinatorLayout.p(view, x, this.e0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g0 = false;
            this.f0 = null;
            this.d0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (z80Var = this.Q) == null || !z80Var.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.e) {
                                WeakReference weakReference2 = this.f0;
                                if (weakReference2 != null) {
                                }
                                if (this.Q != null || (i = this.e0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.b) {
                                    break;
                                }
                            } else {
                                View view3 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view3 != null) {
                                }
                                if (this.Q != null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                e8 e8Var = new e8(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                s90 s90Var = new s90();
                s90Var.a = paddingStart;
                s90Var.b = paddingEnd;
                s90Var.c = paddingBottom;
                q4 q4Var = new q4(e8Var, s90Var, 28);
                WeakHashMap weakHashMap = x80.a;
                p80.c(view, q4Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new q90());
                }
            }
            x80.o(view, new uo(view));
            this.Y = new WeakReference(view);
            this.c0 = new xr(view);
            ct ctVar = this.j;
            if (ctVar != null) {
                view.setBackground(ctVar);
                float f = this.I;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                ctVar.q(f);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            P();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new z80(coordinatorLayout.getContext(), coordinatorLayout, this.m0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i3 = this.X;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            boolean z2 = this.s;
            int i6 = this.m;
            if (z2) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.V = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.V = i7;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        this.F = (int) ((1.0f - this.G) * this.X);
        x();
        int i8 = this.P;
        if (i8 == 3) {
            int E = E();
            WeakHashMap weakHashMap2 = x80.a;
            view.offsetTopAndBottom(E);
        } else if (i8 == 6) {
            int i9 = this.F;
            WeakHashMap weakHashMap3 = x80.a;
            view.offsetTopAndBottom(i9);
        } else if (this.J && i8 == 5) {
            int i10 = this.X;
            WeakHashMap weakHashMap4 = x80.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.H;
            WeakHashMap weakHashMap5 = x80.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = x80.a;
            view.offsetTopAndBottom(top2);
        }
        Q(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.e) {
            I(view);
        } else {
            arrayList.add(new WeakReference(B(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.a0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((g8) arrayList2.get(i2)).a(view);
            i2++;
        }
    }

    @Override // defpackage.nd
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.nd
    public final boolean n(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                if (!H(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nd
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean H;
        if (i3 != 1 && (H = H(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.L;
            boolean z2 = this.M;
            if (i2 > 0) {
                if (!this.T && !z2 && H && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < E()) {
                    int E = top - E();
                    iArr[1] = E;
                    WeakHashMap weakHashMap = x80.a;
                    view.offsetTopAndBottom(-E);
                    M(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = x80.a;
                    view.offsetTopAndBottom(-i2);
                    M(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z2 && H && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = x80.a;
                        view.offsetTopAndBottom(-i6);
                        M(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = x80.a;
                        view.offsetTopAndBottom(-i2);
                        M(1);
                    }
                }
            }
            A(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    @Override // defpackage.nd
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.l0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = x80.a;
            rb0 a = q80.a(view);
            if (a != null) {
                rect2.bottom -= a.a.h(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        L(3);
        return true;
    }

    @Override // defpackage.nd
    public final void r(View view, Parcelable parcelable) {
        h8 h8Var = (h8) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = h8Var.i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = h8Var.j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = h8Var.k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = h8Var.l;
            }
        }
        int i2 = h8Var.h;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    @Override // defpackage.nd
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new h8(this);
    }

    @Override // defpackage.nd
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r2.F) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L48;
     */
    @Override // defpackage.nd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == E()) {
            M(3);
            return;
        }
        if (H(view2) && this.T) {
            if (this.S > 0) {
                if (!this.b) {
                }
                O(view, i2, false);
                this.T = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.b0.getYVelocity(this.d0);
                }
                if (N(view, yVelocity)) {
                    i2 = 5;
                    O(view, i2, false);
                    this.T = false;
                }
            }
            if (this.S == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.F;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            O(view, i2, false);
            this.T = false;
        }
    }

    @Override // defpackage.nd
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        z80 z80Var = this.Q;
        boolean z = this.L;
        if (z80Var != null && (z || i == 1)) {
            z80Var.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        if (this.Q != null && ((z || this.P == 1) && actionMasked == 2 && !this.R)) {
            float abs = Math.abs(this.e0 - motionEvent.getY());
            z80 z80Var2 = this.Q;
            if (abs > z80Var2.b) {
                z80Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int w(View view, int i, int i2) {
        int i3;
        String string = view.getResources().getString(i);
        or orVar = new or(this, i2);
        ArrayList f = x80.f(view);
        int i4 = 0;
        while (true) {
            if (i4 >= f.size()) {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = x80.d;
                    if (i5 >= 32 || i6 != -1) {
                        break;
                    }
                    int i7 = iArr[i5];
                    boolean z = true;
                    for (int i8 = 0; i8 < f.size(); i8++) {
                        z &= ((c0) f.get(i8)).a() != i7;
                    }
                    if (z) {
                        i6 = i7;
                    }
                    i5++;
                }
                i3 = i6;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c0) f.get(i4)).a).getLabel())) {
                    i3 = ((c0) f.get(i4)).a();
                    break;
                }
                i4++;
            }
        }
        if (i3 != -1) {
            c0 c0Var = new c0(null, i3, string, orVar, null);
            View.AccessibilityDelegate d = x80.d(view);
            w wVar = d == null ? null : d instanceof v ? ((v) d).a : new w(d);
            if (wVar == null) {
                wVar = new w();
            }
            x80.m(view, wVar);
            x80.j(view, c0Var.a());
            x80.f(view).add(c0Var);
            x80.h(view, 0);
        }
        return i3;
    }

    public final void x() {
        int z = z();
        boolean z2 = this.b;
        int i = this.X;
        if (z2) {
            this.H = Math.max(i - z, this.E);
        } else {
            this.H = i - z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float y() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = 0.0f;
        ct ctVar = this.j;
        if (ctVar != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (G() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float k = ctVar.k();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > 0.0f && k > 0.0f) {
                        f = f3 / k;
                        float[] fArr = ctVar.H;
                        float a = fArr == null ? fArr[0] : ctVar.g.a.d().f.a(ctVar.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > 0.0f && a > 0.0f) {
                                f2 = f4 / a;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float[] fArr2 = ctVar.H;
                if (fArr2 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int z() {
        int i;
        int i2;
        int i3;
        if (this.g) {
            i = Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V);
            i2 = this.w;
        } else {
            if (!this.o && !this.p && (i3 = this.n) > 0) {
                return Math.max(this.f, i3 + this.i);
            }
            i = this.f;
            i2 = this.w;
        }
        return i + i2;
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new i8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new f8(this, 0);
    }

    @Override // defpackage.nd
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
