package com.google.android.material.bottomsheet;

import a0.c;
import a0.f;
import a4.e0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
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
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.l;
import com.gdmhkmf.belbet.R;
import g1.w;
import i2.p;
import i2.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.r0;
import n0.h0;
import n0.i0;
import n0.p0;
import n0.v1;
import o2.j;
import o2.o;
import p2.e;
import v1.a;
import v1.b;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends c {
    public boolean A;
    public final e B;
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
    public u0.e Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f932a;

    /* renamed from: a0, reason: collision with root package name */
    public final ArrayList f933a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f934b;

    /* renamed from: b0, reason: collision with root package name */
    public VelocityTracker f935b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f936c;

    /* renamed from: c0, reason: collision with root package name */
    public int f937c0;
    public final int d;
    public int d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f938e;

    /* renamed from: e0, reason: collision with root package name */
    public WeakReference f939e0;

    /* renamed from: f, reason: collision with root package name */
    public int f940f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f941f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f942g;

    /* renamed from: g0, reason: collision with root package name */
    public HashMap f943g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public final SparseIntArray f944h0;
    public final int i;
    public final SparseIntArray i0;

    /* renamed from: j, reason: collision with root package name */
    public final j f945j;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseIntArray f946j0;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f947k;

    /* renamed from: k0, reason: collision with root package name */
    public final Rect f948k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f949l;

    /* renamed from: l0, reason: collision with root package name */
    public final p2.c f950l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f951m;

    /* renamed from: n, reason: collision with root package name */
    public int f952n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f953o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f954p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f955q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f956r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f957s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f958t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f959u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f960v;

    /* renamed from: w, reason: collision with root package name */
    public int f961w;

    /* renamed from: x, reason: collision with root package name */
    public int f962x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f963y;

    /* renamed from: z, reason: collision with root package name */
    public final o f964z;

    public BottomSheetBehavior() {
        this.f932a = 0;
        this.f934b = true;
        this.f949l = -1;
        this.f951m = -1;
        this.B = new e(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.f933a0 = new ArrayList();
        this.d0 = -1;
        this.f944h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.f946j0 = new SparseIntArray();
        this.f948k0 = new Rect();
        this.f950l0 = new p2.c(this, 1);
    }

    public static View w(View view) {
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
            View w4 = w(viewGroup.getChildAt(i));
            if (w4 != null) {
                return w4;
            }
        }
        return null;
    }

    public static int x(int i, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    public final boolean A() {
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

    public final boolean B(View view) {
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

    public final void C(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C(viewGroup.getChildAt(i));
            }
        }
    }

    public final void D(int i) {
        if (i == -1) {
            if (this.f942g) {
                return;
            } else {
                this.f942g = true;
            }
        } else {
            if (!this.f942g && this.f940f == i) {
                return;
            }
            this.f942g = false;
            this.f940f = Math.max(0, i);
        }
        L();
    }

    public final void E(int i) {
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
        int i4 = (i == 6 && this.f934b && z(i) <= this.E) ? 3 : i;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            F(i);
            return;
        }
        View view = (View) this.Y.get();
        r0 r0Var = new r0(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(r0Var);
        } else {
            r0Var.run();
        }
    }

    public final void F(int i) {
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z4 = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            K(true);
        } else if (i == 6 || i == 5 || i == 4) {
            K(false);
        }
        J(i, true);
        ArrayList arrayList = this.f933a0;
        if (arrayList.size() <= 0) {
            I();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean G(View view, float f5) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f5 * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        F(2);
        J(r4, true);
        r2.B.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(View view, int i, boolean z4) {
        int z5 = z(i);
        u0.e eVar = this.Q;
        if (eVar != null) {
            if (!z4) {
                int left = view.getLeft();
                eVar.f3571r = view;
                eVar.f3559c = -1;
                boolean h = eVar.h(left, z5, 0, 0);
                if (!h && eVar.f3557a == 0 && eVar.f3571r != null) {
                    eVar.f3571r = null;
                }
            }
        }
        F(i);
    }

    public final void I() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        p0.j(view, 1048576);
        p0.h(view, 0);
        p0.j(view, 524288);
        p0.h(view, 0);
        p0.j(view, 262144);
        p0.h(view, 0);
        SparseIntArray sparseIntArray = this.i0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            p0.j(view, i);
            p0.h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f944h0;
        int i4 = sparseIntArray2.get(0, -1);
        if (i4 != -1) {
            p0.j(view, i4);
            p0.h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f946j0;
        int i5 = sparseIntArray3.get(0, -1);
        if (i5 != -1) {
            p0.j(view, i5);
            p0.h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f934b && this.P != 6) {
            sparseIntArray2.put(0, r(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            p0.k(view, o0.c.i, new e0(this, 5));
        }
        int i6 = this.P;
        if (i6 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i6 == 4) {
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i6 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void J(int i, boolean z4) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z5 = this.P == 3 && (this.f963y || A());
        if (this.A == z5 || (jVar = this.f945j) == null) {
            return;
        }
        this.A = z5;
        ValueAnimator valueAnimator = this.C;
        if (!z4 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            jVar.s(this.A ? t() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(jVar.f2955g.i, z5 ? t() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void K(boolean z4) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f943g0 != null) {
                    return;
                } else {
                    this.f943g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z4) {
                    this.f943g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f943g0 = null;
        }
    }

    public final void L() {
        View view;
        if (this.Y != null) {
            s();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // a0.c
    public final void c(f fVar) {
        this.Y = null;
        this.Q = null;
    }

    @Override // a0.c
    public final void e() {
        this.Y = null;
        this.Q = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        if (r1.get() != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r18.o(r6, (int) r20.getX(), (int) r20.getY()) != false) goto L87;
     */
    @Override // a0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        u0.e eVar;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f937c0 = -1;
            this.d0 = -1;
            this.f939e0 = null;
            VelocityTracker velocityTracker = this.f935b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f935b0 = null;
            }
        }
        if (this.f935b0 == null) {
            this.f935b0 = VelocityTracker.obtain();
        }
        this.f935b0.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            int x5 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.o(view2, x5, y4)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f939e0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.f937c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f941f0 = true;
            }
            this.R = this.f937c0 == -1 && !coordinatorLayout.o(view, x4, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f941f0 = false;
            this.f939e0 = null;
            this.f937c0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (eVar = this.Q) == null || !eVar.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.f938e) {
                                WeakReference weakReference2 = this.f939e0;
                                if (weakReference2 != null) {
                                }
                                if (this.Q != null || (i = this.d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.f3558b) {
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

    @Override // a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z4 = (Build.VERSION.SDK_INT < 29 || this.f953o || this.f942g) ? false : true;
            if (this.f954p || this.f955q || this.f956r || this.f958t || this.f959u || this.f960v || z4) {
                l0.f fVar = new l0.f(this, z4);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                q qVar = new q();
                qVar.f2065a = paddingStart;
                qVar.f2066b = paddingEnd;
                qVar.f2067c = paddingBottom;
                androidx.emoji2.text.q qVar2 = new androidx.emoji2.text.q(fVar, qVar, 11);
                WeakHashMap weakHashMap = p0.f2816a;
                h0.c(view, qVar2);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new p());
                }
            }
            p0.o(view, new b(view));
            this.Y = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            l.V(context, R.attr.motionDurationMedium2, 300);
            l.V(context, R.attr.motionDurationShort3, 150);
            l.V(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.f945j;
            if (jVar != null) {
                view.setBackground(jVar);
                float f5 = this.I;
                if (f5 == -1.0f) {
                    f5 = view.getElevation();
                }
                jVar.q(f5);
            } else {
                ColorStateList colorStateList = this.f947k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            I();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new u0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f950l0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i4 = this.X;
        int i5 = i4 - height;
        int i6 = this.f962x;
        if (i5 < i6) {
            boolean z5 = this.f957s;
            int i7 = this.f951m;
            if (z5) {
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.V = i4;
            } else {
                int i8 = i4 - i6;
                if (i7 != -1) {
                    i8 = Math.min(i8, i7);
                }
                this.V = i8;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        this.F = (int) ((1.0f - this.G) * this.X);
        s();
        int i9 = this.P;
        if (i9 == 3) {
            int y4 = y();
            WeakHashMap weakHashMap2 = p0.f2816a;
            view.offsetTopAndBottom(y4);
        } else if (i9 == 6) {
            int i10 = this.F;
            WeakHashMap weakHashMap3 = p0.f2816a;
            view.offsetTopAndBottom(i10);
        } else if (this.J && i9 == 5) {
            int i11 = this.X;
            WeakHashMap weakHashMap4 = p0.f2816a;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.H;
            WeakHashMap weakHashMap5 = p0.f2816a;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = p0.f2816a;
            view.offsetTopAndBottom(top2);
        }
        J(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.f938e) {
            C(view);
        } else {
            arrayList.add(new WeakReference(w(view)));
        }
        ArrayList arrayList2 = this.f933a0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // a0.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f949l, marginLayoutParams.width), x(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f951m, marginLayoutParams.height));
        return true;
    }

    @Override // a0.c
    public final boolean i(View view) {
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
                if (!B(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // a0.c
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
        boolean B;
        if (i5 != 1 && (B = B(view2))) {
            int top = view.getTop();
            int i6 = top - i4;
            boolean z4 = this.L;
            boolean z5 = this.M;
            if (i4 > 0) {
                if (!this.T && !z5 && B && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i6 < y()) {
                    int y4 = top - y();
                    iArr[1] = y4;
                    WeakHashMap weakHashMap = p0.f2816a;
                    view.offsetTopAndBottom(-y4);
                    F(3);
                } else {
                    if (!z4) {
                        return;
                    }
                    iArr[1] = i4;
                    WeakHashMap weakHashMap2 = p0.f2816a;
                    view.offsetTopAndBottom(-i4);
                    F(1);
                }
            } else if (i4 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z5 && B && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i7 = this.H;
                    if (i6 > i7 && !this.J) {
                        int i8 = top - i7;
                        iArr[1] = i8;
                        WeakHashMap weakHashMap3 = p0.f2816a;
                        view.offsetTopAndBottom(-i8);
                        F(4);
                    } else {
                        if (!z4) {
                            return;
                        }
                        iArr[1] = i4;
                        WeakHashMap weakHashMap4 = p0.f2816a;
                        view.offsetTopAndBottom(-i4);
                        F(1);
                    }
                }
            }
            v(view.getTop());
            this.S = i4;
            this.T = true;
            this.N = false;
        }
    }

    @Override // a0.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.f948k0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = p0.f2816a;
            v1 a5 = i0.a(view);
            if (a5 != null) {
                rect2.bottom -= a5.f2842a.h(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        E(3);
        return true;
    }

    @Override // a0.c
    public final void m(View view, Parcelable parcelable) {
        a aVar = (a) parcelable;
        int i = this.f932a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f940f = aVar.i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f934b = aVar.f3724j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = aVar.f3725k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = aVar.f3726l;
            }
        }
        int i4 = aVar.h;
        if (i4 == 1 || i4 == 2) {
            this.P = 4;
        } else {
            this.P = i4;
        }
    }

    @Override // a0.c
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a(this);
    }

    @Override // a0.c
    public final boolean o(View view, int i, int i4) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r3.F) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.H)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (java.lang.Math.abs(r5 - r3.F) < java.lang.Math.abs(r5 - r3.H)) goto L48;
     */
    @Override // a0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == y()) {
            F(3);
            return;
        }
        if (B(view2) && this.T) {
            if (this.S > 0) {
                if (!this.f934b) {
                }
                H(view, i4, false);
                this.T = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.f935b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f936c);
                    yVelocity = this.f935b0.getYVelocity(this.f937c0);
                }
                if (G(view, yVelocity)) {
                    i4 = 5;
                    H(view, i4, false);
                    this.T = false;
                }
            }
            if (this.S == 0) {
                int top = view.getTop();
                if (!this.f934b) {
                    int i5 = this.F;
                    if (top < i5) {
                    }
                    i4 = 6;
                }
            } else {
                if (!this.f934b) {
                    int top2 = view.getTop();
                }
                i4 = 4;
            }
            H(view, i4, false);
            this.T = false;
        }
    }

    @Override // a0.c
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        u0.e eVar = this.Q;
        if (eVar != null && (this.L || i == 1)) {
            eVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f937c0 = -1;
            this.d0 = -1;
            this.f939e0 = null;
            VelocityTracker velocityTracker = this.f935b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f935b0 = null;
            }
        }
        if (this.f935b0 == null) {
            this.f935b0 = VelocityTracker.obtain();
        }
        this.f935b0.addMovement(motionEvent);
        if (this.Q != null && ((this.L || this.P == 1) && actionMasked == 2 && !this.R)) {
            float abs = Math.abs(this.d0 - motionEvent.getY());
            u0.e eVar2 = this.Q;
            if (abs > eVar2.f3558b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int r(View view, int i, int i4) {
        int i5;
        String string = view.getResources().getString(i);
        e0 e0Var = new e0(this, i4);
        ArrayList f5 = p0.f(view);
        int i6 = 0;
        while (true) {
            if (i6 >= f5.size()) {
                int i7 = 0;
                int i8 = -1;
                while (true) {
                    int[] iArr = p0.d;
                    if (i7 >= 32 || i8 != -1) {
                        break;
                    }
                    int i9 = iArr[i7];
                    boolean z4 = true;
                    for (int i10 = 0; i10 < f5.size(); i10++) {
                        z4 &= ((o0.c) f5.get(i10)).a() != i9;
                    }
                    if (z4) {
                        i8 = i9;
                    }
                    i7++;
                }
                i5 = i8;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o0.c) f5.get(i6)).f2877a).getLabel())) {
                    i5 = ((o0.c) f5.get(i6)).a();
                    break;
                }
                i6++;
            }
        }
        if (i5 != -1) {
            o0.c cVar = new o0.c(null, i5, string, e0Var, null);
            View.AccessibilityDelegate d = p0.d(view);
            n0.b bVar = d == null ? null : d instanceof n0.a ? ((n0.a) d).f2748a : new n0.b(d);
            if (bVar == null) {
                bVar = new n0.b();
            }
            p0.m(view, bVar);
            p0.j(view, cVar.a());
            p0.f(view).add(cVar);
            p0.h(view, 0);
        }
        return i5;
    }

    public final void s() {
        int u4 = u();
        if (this.f934b) {
            this.H = Math.max(this.X - u4, this.E);
        } else {
            this.H = this.X - u4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f5;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f6 = 0.0f;
        if (this.f945j != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float k4 = this.f945j.k();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f7 = radius2;
                    if (f7 > 0.0f && k4 > 0.0f) {
                        f5 = f7 / k4;
                        j jVar = this.f945j;
                        float[] fArr = jVar.G;
                        float a5 = fArr == null ? fArr[0] : jVar.f2955g.f2940a.d().f2988f.a(jVar.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f8 = radius;
                            if (f8 > 0.0f && a5 > 0.0f) {
                                f6 = f8 / a5;
                            }
                        }
                        return Math.max(f5, f6);
                    }
                }
                f5 = 0.0f;
                j jVar2 = this.f945j;
                float[] fArr2 = jVar2.G;
                if (fArr2 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f5, f6);
            }
        }
        return 0.0f;
    }

    public final int u() {
        int i;
        return this.f942g ? Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V) + this.f961w : (this.f953o || this.f954p || (i = this.f952n) <= 0) ? this.f940f + this.f961w : Math.max(this.f940f, i + this.i);
    }

    public final void v(int i) {
        if (((View) this.Y.get()) != null) {
            ArrayList arrayList = this.f933a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.H;
            if (i <= i4 && i4 != y()) {
                y();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int y() {
        if (this.f934b) {
            return this.E;
        }
        return Math.max(this.D, this.f957s ? 0 : this.f962x);
    }

    public final int z(int i) {
        if (i == 3) {
            return y();
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
        throw new IllegalArgumentException(a4.b.f("Invalid state to get top offset: ", i));
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f932a = 0;
        this.f934b = true;
        this.f949l = -1;
        this.f951m = -1;
        this.B = new e(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.f933a0 = new ArrayList();
        this.d0 = -1;
        this.f944h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.f946j0 = new SparseIntArray();
        this.f948k0 = new Rect();
        this.f950l0 = new p2.c(this, 1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f3140a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f947k = l.r(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.f964z = o.g(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f964z;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f945j = jVar;
            jVar.n(context);
            ColorStateList colorStateList = this.f947k;
            if (colorStateList != null) {
                this.f945j.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f945j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new w(2, this));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f949l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f951m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue != null && (i = peekValue.data) == -1) {
            D(i);
        } else {
            D(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z4 = obtainStyledAttributes.getBoolean(10, false);
        if (this.J != z4) {
            this.J = z4;
            if (!z4 && this.P == 5) {
                E(4);
            }
            I();
        }
        this.f953o = obtainStyledAttributes.getBoolean(16, false);
        boolean z5 = obtainStyledAttributes.getBoolean(8, true);
        if (this.f934b != z5) {
            this.f934b = z5;
            if (this.Y != null) {
                s();
            }
            F((this.f934b && this.P == 6) ? 3 : this.P);
            J(this.P, true);
            I();
        }
        this.K = obtainStyledAttributes.getBoolean(15, false);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        this.f932a = obtainStyledAttributes.getInt(13, 0);
        float f5 = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f5 > 0.0f && f5 < 1.0f) {
            this.G = f5;
            if (this.Y != null) {
                this.F = (int) ((1.0f - f5) * this.X);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.D = i4;
                    J(this.P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
                if (dimensionPixelOffset >= 0) {
                    this.D = dimensionPixelOffset;
                    J(this.P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(14, 500);
            this.f938e = obtainStyledAttributes.getBoolean(11, false);
            this.O = obtainStyledAttributes.getBoolean(4, true);
            this.f954p = obtainStyledAttributes.getBoolean(20, false);
            this.f955q = obtainStyledAttributes.getBoolean(21, false);
            this.f956r = obtainStyledAttributes.getBoolean(22, false);
            this.f957s = obtainStyledAttributes.getBoolean(23, true);
            this.f958t = obtainStyledAttributes.getBoolean(17, false);
            this.f959u = obtainStyledAttributes.getBoolean(18, false);
            this.f960v = obtainStyledAttributes.getBoolean(19, false);
            this.f963y = obtainStyledAttributes.getBoolean(26, true);
            obtainStyledAttributes.recycle();
            this.f936c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // a0.c
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
    }
}
