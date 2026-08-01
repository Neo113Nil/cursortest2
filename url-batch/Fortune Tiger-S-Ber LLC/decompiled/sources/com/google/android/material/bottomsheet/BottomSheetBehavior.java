package com.google.android.material.bottomsheet;

import a2.s;
import a2.t;
import a2.u;
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
import androidx.fragment.app.w0;
import com.gglhk.bofio.fortunetiger.R;
import f.f;
import g2.h;
import g2.j;
import g2.o;
import h2.c;
import h2.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k.r0;
import k0.b0;
import k0.c0;
import k0.j0;
import k0.m1;
import k3.m;
import l0.d;
import q1.b;
import x.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
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
    public q0.e Q;
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
    public final int f1194a;
    public final ArrayList a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1195b;

    /* renamed from: b0, reason: collision with root package name */
    public VelocityTracker f1196b0;
    public final float c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1197c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f1198d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1199d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1200e;

    /* renamed from: e0, reason: collision with root package name */
    public WeakReference f1201e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1202f;
    public boolean f0;
    public boolean g;

    /* renamed from: g0, reason: collision with root package name */
    public HashMap f1203g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public final SparseIntArray f1204h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f1205i;

    /* renamed from: i0, reason: collision with root package name */
    public final SparseIntArray f1206i0;

    /* renamed from: j, reason: collision with root package name */
    public final j f1207j;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseIntArray f1208j0;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f1209k;

    /* renamed from: k0, reason: collision with root package name */
    public final Rect f1210k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f1211l;

    /* renamed from: l0, reason: collision with root package name */
    public final c f1212l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f1213m;

    /* renamed from: n, reason: collision with root package name */
    public int f1214n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1215o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1216p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1217q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1218r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1219s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1220t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1221u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1222v;

    /* renamed from: w, reason: collision with root package name */
    public int f1223w;

    /* renamed from: x, reason: collision with root package name */
    public int f1224x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1225y;

    /* renamed from: z, reason: collision with root package name */
    public final o f1226z;

    public BottomSheetBehavior() {
        this.f1194a = 0;
        this.f1195b = true;
        this.f1211l = -1;
        this.f1213m = -1;
        this.B = new e(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.f1199d0 = -1;
        this.f1204h0 = new SparseIntArray();
        this.f1206i0 = new SparseIntArray();
        this.f1208j0 = new SparseIntArray();
        this.f1210k0 = new Rect();
        this.f1212l0 = new c(this, 1);
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
        for (int i4 = 0; i4 < childCount; i4++) {
            View w3 = w(viewGroup.getChildAt(i4));
            if (w3 != null) {
                return w3;
            }
        }
        return null;
    }

    public static int x(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
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
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
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
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                C(viewGroup.getChildAt(i4));
            }
        }
    }

    public final void D(int i4) {
        if (i4 == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f1202f == i4) {
                return;
            }
            this.g = false;
            this.f1202f = Math.max(0, i4);
        }
        L();
    }

    public final void E(int i4) {
        if (i4 == 1 || i4 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i4 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
            return;
        }
        int i5 = (i4 == 6 && this.f1195b && z(i4) <= this.E) ? 3 : i4;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            F(i4);
            return;
        }
        View view = (View) this.Y.get();
        r0 r0Var = new r0(this, view, i5);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(r0Var);
        } else {
            r0Var.run();
        }
    }

    public final void F(int i4) {
        if (this.P == i4) {
            return;
        }
        this.P = i4;
        if (i4 != 4 && i4 != 3 && i4 != 6) {
            boolean z3 = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            K(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            K(false);
        }
        J(i4, true);
        ArrayList arrayList = this.a0;
        if (arrayList.size() > 0) {
            throw w0.d(arrayList, 0);
        }
        I();
    }

    public final boolean G(View view, float f4) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f4 * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) u()) > 0.5f;
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
    public final void H(View view, int i4, boolean z3) {
        int z4 = z(i4);
        q0.e eVar = this.Q;
        if (eVar != null) {
            if (!z3) {
                int left = view.getLeft();
                eVar.f3123r = view;
                eVar.c = -1;
                boolean h = eVar.h(left, z4, 0, 0);
                if (!h && eVar.f3109a == 0 && eVar.f3123r != null) {
                    eVar.f3123r = null;
                }
            }
        }
        F(i4);
    }

    public final void I() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j0.j(view, 1048576);
        j0.h(view, 0);
        j0.j(view, 524288);
        j0.h(view, 0);
        j0.j(view, 262144);
        j0.h(view, 0);
        SparseIntArray sparseIntArray = this.f1206i0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            j0.j(view, i4);
            j0.h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f1204h0;
        int i5 = sparseIntArray2.get(0, -1);
        if (i5 != -1) {
            j0.j(view, i5);
            j0.h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f1208j0;
        int i6 = sparseIntArray3.get(0, -1);
        if (i6 != -1) {
            j0.j(view, i6);
            j0.h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f1195b && this.P != 6) {
            sparseIntArray2.put(0, r(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            j0.k(view, d.f2849i, new f(this, 5));
        }
        int i7 = this.P;
        if (i7 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i7 == 4) {
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i7 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void J(int i4, boolean z3) {
        j jVar;
        if (i4 == 2) {
            return;
        }
        boolean z4 = this.P == 3 && (this.f1225y || A());
        if (this.A == z4 || (jVar = this.f1207j) == null) {
            return;
        }
        this.A = z4;
        ValueAnimator valueAnimator = this.C;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jVar.g.f1848i, z4 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float t3 = this.A ? t() : 1.0f;
        h hVar = jVar.g;
        if (hVar.f1848i != t3) {
            hVar.f1848i = t3;
            jVar.f1860k = true;
            jVar.f1861l = true;
            jVar.invalidateSelf();
        }
    }

    public final void K(boolean z3) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f1203g0 != null) {
                    return;
                } else {
                    this.f1203g0 = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.Y.get() && z3) {
                    this.f1203g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f1203g0 = null;
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

    @Override // x.a
    public final void c(x.d dVar) {
        this.Y = null;
        this.Q = null;
    }

    @Override // x.a
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
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i4;
        q0.e eVar;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f1197c0 = -1;
            this.f1199d0 = -1;
            this.f1201e0 = null;
            VelocityTracker velocityTracker = this.f1196b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1196b0 = null;
            }
        }
        if (this.f1196b0 == null) {
            this.f1196b0 = VelocityTracker.obtain();
        }
        this.f1196b0.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f1199d0 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i5);
                    i5++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.o(view2, x4, y3)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f1201e0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.f1197c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f0 = true;
            }
            this.R = this.f1197c0 == -1 && !coordinatorLayout.o(view, x3, this.f1199d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f0 = false;
            this.f1201e0 = null;
            this.f1197c0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (eVar = this.Q) == null || !eVar.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.f1200e) {
                                WeakReference weakReference2 = this.f1201e0;
                                if (weakReference2 != null) {
                                }
                                if (this.Q != null || (i4 = this.f1199d0) == -1 || Math.abs(i4 - motionEvent.getY()) <= this.Q.f3110b) {
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

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i5 = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z3 = (Build.VERSION.SDK_INT < 29 || this.f1215o || this.g) ? false : true;
            if (this.f1216p || this.f1217q || this.f1218r || this.f1220t || this.f1221u || this.f1222v || z3) {
                i0.f fVar = new i0.f(this, z3);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                u uVar = new u();
                uVar.f68a = paddingStart;
                uVar.f69b = paddingEnd;
                uVar.c = paddingBottom;
                s sVar = new s(fVar, uVar, i5);
                WeakHashMap weakHashMap = j0.f2752a;
                b0.j(view, sVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new t());
                }
            }
            j0.o(view, new b(view));
            this.Y = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            m.Q(context, R.attr.motionDurationMedium2, 300);
            m.Q(context, R.attr.motionDurationShort3, 150);
            m.Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.f1207j;
            if (jVar != null) {
                view.setBackground(jVar);
                float f4 = this.I;
                if (f4 == -1.0f) {
                    f4 = view.getElevation();
                }
                jVar.p(f4);
            } else {
                ColorStateList colorStateList = this.f1209k;
                if (colorStateList != null) {
                    b0.g(view, colorStateList);
                }
            }
            I();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new q0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1212l0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i4);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i6 = this.X;
        int i7 = i6 - height;
        int i8 = this.f1224x;
        if (i7 < i8) {
            boolean z4 = this.f1219s;
            int i9 = this.f1213m;
            if (z4) {
                if (i9 != -1) {
                    i6 = Math.min(i6, i9);
                }
                this.V = i6;
            } else {
                int i10 = i6 - i8;
                if (i9 != -1) {
                    i10 = Math.min(i10, i9);
                }
                this.V = i10;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        this.F = (int) ((1.0f - this.G) * this.X);
        s();
        int i11 = this.P;
        if (i11 == 3) {
            int y3 = y();
            WeakHashMap weakHashMap2 = j0.f2752a;
            view.offsetTopAndBottom(y3);
        } else if (i11 == 6) {
            int i12 = this.F;
            WeakHashMap weakHashMap3 = j0.f2752a;
            view.offsetTopAndBottom(i12);
        } else if (this.J && i11 == 5) {
            int i13 = this.X;
            WeakHashMap weakHashMap4 = j0.f2752a;
            view.offsetTopAndBottom(i13);
        } else if (i11 == 4) {
            int i14 = this.H;
            WeakHashMap weakHashMap5 = j0.f2752a;
            view.offsetTopAndBottom(i14);
        } else if (i11 == 1 || i11 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = j0.f2752a;
            view.offsetTopAndBottom(top2);
        }
        J(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.f1200e) {
            C(view);
        } else {
            arrayList.add(new WeakReference(w(view)));
        }
        ArrayList arrayList2 = this.a0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        throw w0.d(arrayList2, 0);
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f1211l, marginLayoutParams.width), x(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1213m, marginLayoutParams.height));
        return true;
    }

    @Override // x.a
    public final boolean i(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            if (((WeakReference) obj).get() != null) {
                if (!B(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // x.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
        boolean B;
        if (i6 != 1 && (B = B(view2))) {
            int top = view.getTop();
            int i7 = top - i5;
            boolean z3 = this.L;
            boolean z4 = this.M;
            if (i5 > 0) {
                if (!this.T && !z4 && B && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i7 < y()) {
                    int y3 = top - y();
                    iArr[1] = y3;
                    WeakHashMap weakHashMap = j0.f2752a;
                    view.offsetTopAndBottom(-y3);
                    F(3);
                } else {
                    if (!z3) {
                        return;
                    }
                    iArr[1] = i5;
                    WeakHashMap weakHashMap2 = j0.f2752a;
                    view.offsetTopAndBottom(-i5);
                    F(1);
                }
            } else if (i5 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z4 && B && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i8 = this.H;
                    if (i7 > i8 && !this.J) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        WeakHashMap weakHashMap3 = j0.f2752a;
                        view.offsetTopAndBottom(-i9);
                        F(4);
                    } else {
                        if (!z3) {
                            return;
                        }
                        iArr[1] = i5;
                        WeakHashMap weakHashMap4 = j0.f2752a;
                        view.offsetTopAndBottom(-i5);
                        F(1);
                    }
                }
            }
            v(view.getTop());
            this.S = i5;
            this.T = true;
            this.N = false;
        }
    }

    @Override // x.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i4 = this.P;
        if (i4 != 4 && i4 != 6) {
            return false;
        }
        Rect rect2 = this.f1210k0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = j0.f2752a;
            m1 a4 = c0.a(view);
            if (a4 != null) {
                rect2.bottom -= a4.f2760a.f(519).f980d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        E(3);
        return true;
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        q1.a aVar = (q1.a) parcelable;
        int i4 = this.f1194a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f1202f = aVar.f3128i;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f1195b = aVar.f3129j;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.J = aVar.f3130k;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.K = aVar.f3131l;
            }
        }
        int i5 = aVar.h;
        if (i5 == 1 || i5 == 2) {
            this.P = 4;
        } else {
            this.P = i5;
        }
    }

    @Override // x.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new q1.a(this);
    }

    @Override // x.a
    public final boolean o(View view, int i4, int i5) {
        this.S = 0;
        this.T = false;
        return (i4 & 2) != 0;
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
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i4) {
        float yVelocity;
        int i5 = 3;
        if (view.getTop() == y()) {
            F(3);
            return;
        }
        if (B(view2) && this.T) {
            if (this.S > 0) {
                if (!this.f1195b) {
                }
                H(view, i5, false);
                this.T = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.f1196b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.f1196b0.getYVelocity(this.f1197c0);
                }
                if (G(view, yVelocity)) {
                    i5 = 5;
                    H(view, i5, false);
                    this.T = false;
                }
            }
            if (this.S == 0) {
                int top = view.getTop();
                if (!this.f1195b) {
                    int i6 = this.F;
                    if (top < i6) {
                    }
                    i5 = 6;
                }
            } else {
                if (!this.f1195b) {
                    int top2 = view.getTop();
                }
                i5 = 4;
            }
            H(view, i5, false);
            this.T = false;
        }
    }

    @Override // x.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.P;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        q0.e eVar = this.Q;
        if (eVar != null && (this.L || i4 == 1)) {
            eVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1197c0 = -1;
            this.f1199d0 = -1;
            this.f1201e0 = null;
            VelocityTracker velocityTracker = this.f1196b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1196b0 = null;
            }
        }
        if (this.f1196b0 == null) {
            this.f1196b0 = VelocityTracker.obtain();
        }
        this.f1196b0.addMovement(motionEvent);
        if (this.Q != null && ((this.L || this.P == 1) && actionMasked == 2 && !this.R)) {
            float abs = Math.abs(this.f1199d0 - motionEvent.getY());
            q0.e eVar2 = this.Q;
            if (abs > eVar2.f3110b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int r(View view, int i4, int i5) {
        int i6;
        String string = view.getResources().getString(i4);
        f fVar = new f(this, i5);
        ArrayList f4 = j0.f(view);
        int i7 = 0;
        while (true) {
            if (i7 >= f4.size()) {
                int i8 = 0;
                int i9 = -1;
                while (true) {
                    int[] iArr = j0.f2754d;
                    if (i8 >= 32 || i9 != -1) {
                        break;
                    }
                    int i10 = iArr[i8];
                    boolean z3 = true;
                    for (int i11 = 0; i11 < f4.size(); i11++) {
                        z3 &= ((d) f4.get(i11)).a() != i10;
                    }
                    if (z3) {
                        i9 = i10;
                    }
                    i8++;
                }
                i6 = i9;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d) f4.get(i7)).f2852a).getLabel())) {
                    i6 = ((d) f4.get(i7)).a();
                    break;
                }
                i7++;
            }
        }
        if (i6 != -1) {
            d dVar = new d(null, i6, string, fVar, null);
            View.AccessibilityDelegate d4 = j0.d(view);
            k0.b bVar = d4 == null ? null : d4 instanceof k0.a ? ((k0.a) d4).f2711a : new k0.b(d4);
            if (bVar == null) {
                bVar = new k0.b();
            }
            j0.m(view, bVar);
            j0.j(view, dVar.a());
            j0.f(view).add(dVar);
            j0.h(view, 0);
        }
        return i6;
    }

    public final void s() {
        int u3 = u();
        if (this.f1195b) {
            this.H = Math.max(this.X - u3, this.E);
        } else {
            this.H = this.X - u3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f4;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f5 = 0.0f;
        if (this.f1207j != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                j jVar = this.f1207j;
                float[] fArr = jVar.G;
                float a4 = fArr != null ? fArr[3] : jVar.g.f1843a.d().f1889e.a(jVar.g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f6 = radius2;
                    if (f6 > 0.0f && a4 > 0.0f) {
                        f4 = f6 / a4;
                        j jVar2 = this.f1207j;
                        float[] fArr2 = jVar2.G;
                        float a5 = fArr2 == null ? fArr2[0] : jVar2.g.f1843a.d().f1890f.a(jVar2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f7 = radius;
                            if (f7 > 0.0f && a5 > 0.0f) {
                                f5 = f7 / a5;
                            }
                        }
                        return Math.max(f4, f5);
                    }
                }
                f4 = 0.0f;
                j jVar22 = this.f1207j;
                float[] fArr22 = jVar22.G;
                if (fArr22 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f4, f5);
            }
        }
        return 0.0f;
    }

    public final int u() {
        int i4;
        return this.g ? Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V) + this.f1223w : (this.f1215o || this.f1216p || (i4 = this.f1214n) <= 0) ? this.f1202f + this.f1223w : Math.max(this.f1202f, i4 + this.f1205i);
    }

    public final void v(int i4) {
        if (((View) this.Y.get()) != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.H;
            if (i4 <= i5 && i5 != y()) {
                y();
            }
            if (arrayList.size() > 0) {
                throw w0.d(arrayList, 0);
            }
        }
    }

    public final int y() {
        if (this.f1195b) {
            return this.E;
        }
        return Math.max(this.D, this.f1219s ? 0 : this.f1224x);
    }

    public final int z(int i4) {
        if (i4 == 3) {
            return y();
        }
        if (i4 == 4) {
            return this.H;
        }
        if (i4 == 5) {
            return this.X;
        }
        if (i4 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException(w0.e("Invalid state to get top offset: ", i4));
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.f1194a = 0;
        this.f1195b = true;
        this.f1211l = -1;
        this.f1213m = -1;
        this.B = new e(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.f1199d0 = -1;
        this.f1204h0 = new SparseIntArray();
        this.f1206i0 = new SparseIntArray();
        this.f1208j0 = new SparseIntArray();
        this.f1210k0 = new Rect();
        this.f1212l0 = new c(this, 1);
        this.f1205i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2858a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1209k = m.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.f1226z = o.f(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f1226z;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f1207j = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.f1209k;
            if (colorStateList != null) {
                this.f1207j.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1207j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new b1.m(2, this));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1211l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1213m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            D(i4);
        } else {
            D(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(10, false);
        if (this.J != z3) {
            this.J = z3;
            if (!z3 && this.P == 5) {
                E(4);
            }
            I();
        }
        this.f1215o = obtainStyledAttributes.getBoolean(16, false);
        boolean z4 = obtainStyledAttributes.getBoolean(8, true);
        if (this.f1195b != z4) {
            this.f1195b = z4;
            if (this.Y != null) {
                s();
            }
            F((this.f1195b && this.P == 6) ? 3 : this.P);
            J(this.P, true);
            I();
        }
        this.K = obtainStyledAttributes.getBoolean(15, false);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        this.f1194a = obtainStyledAttributes.getInt(13, 0);
        float f4 = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f4 > 0.0f && f4 < 1.0f) {
            this.G = f4;
            if (this.Y != null) {
                this.F = (int) ((1.0f - f4) * this.X);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i5 = peekValue2.data;
                if (i5 >= 0) {
                    this.D = i5;
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
            this.f1198d = obtainStyledAttributes.getInt(14, 500);
            this.f1200e = obtainStyledAttributes.getBoolean(11, false);
            this.O = obtainStyledAttributes.getBoolean(4, true);
            this.f1216p = obtainStyledAttributes.getBoolean(20, false);
            this.f1217q = obtainStyledAttributes.getBoolean(21, false);
            this.f1218r = obtainStyledAttributes.getBoolean(22, false);
            this.f1219s = obtainStyledAttributes.getBoolean(23, true);
            this.f1220t = obtainStyledAttributes.getBoolean(17, false);
            this.f1221u = obtainStyledAttributes.getBoolean(18, false);
            this.f1222v = obtainStyledAttributes.getBoolean(19, false);
            this.f1225y = obtainStyledAttributes.getBoolean(26, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
    }
}
