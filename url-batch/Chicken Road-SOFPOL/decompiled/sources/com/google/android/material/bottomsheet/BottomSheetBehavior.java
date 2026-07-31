package com.google.android.material.bottomsheet;

import a0.a0;
import a0.q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.snovikpovik.vuevnxsj.R;
import d3.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import k5.d;
import k5.e;
import k5.f;
import k5.g;
import q3.b;
import q3.c0;
import q3.k0;
import r2.o;
import r2.r;
import r5.l;
import r5.m;
import w5.h;
import w5.j;
import w5.n;
import x3.c;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final h4.a A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public c O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1840a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1841a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1842b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1843b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1844c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1845c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f1846d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f1847d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1848e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f1849e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1850f;

    /* renamed from: f0, reason: collision with root package name */
    public final d f1851f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1852g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1853h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1854j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1855k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1856l;

    /* renamed from: m, reason: collision with root package name */
    public int f1857m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1858n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1859o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1860p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1861q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1862r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1863s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1864t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1865u;

    /* renamed from: v, reason: collision with root package name */
    public int f1866v;

    /* renamed from: w, reason: collision with root package name */
    public int f1867w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1868x;

    /* renamed from: y, reason: collision with root package name */
    public final n f1869y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1870z;

    public BottomSheetBehavior() {
        this.f1840a = 0;
        this.f1842b = true;
        this.f1855k = -1;
        this.f1856l = -1;
        this.A = new h4.a(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1843b0 = -1;
        this.f1849e0 = new SparseIntArray();
        this.f1851f0 = new d(this, 0);
    }

    public static View v(View view) {
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
            View v7 = v(viewGroup.getChildAt(i));
            if (v7 != null) {
                return v7;
            }
        }
        return null;
    }

    public static int w(int i, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f1850f) {
                return;
            } else {
                this.f1850f = true;
            }
        } else {
            if (!this.f1850f && this.f1848e == i) {
                return;
            }
            this.f1850f = false;
            this.f1848e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i8 = (i == 6 && this.f1842b && y(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.W.get();
        k5.a aVar = new k5.a(this, view, i8);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void C(int i) {
        if (this.N == i) {
            return;
        }
        this.N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z3 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f6) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f6 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z3) {
        int y7 = y(i);
        c cVar = this.O;
        if (cVar != null) {
            if (!z3) {
                int left = view.getLeft();
                cVar.f8648r = view;
                cVar.f8634c = -1;
                boolean h8 = cVar.h(left, y7, 0, 0);
                if (!h8 && cVar.f8632a == 0 && cVar.f8648r != null) {
                    cVar.f8648r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        k0.h(view, 524288);
        k0.f(view, 0);
        k0.h(view, 262144);
        k0.f(view, 0);
        k0.h(view, 1048576);
        k0.f(view, 0);
        SparseIntArray sparseIntArray = this.f1849e0;
        int i8 = sparseIntArray.get(0, -1);
        if (i8 != -1) {
            k0.h(view, i8);
            k0.f(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1842b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            e eVar = new e(6, this);
            ArrayList d8 = k0.d(view);
            int i9 = 0;
            while (true) {
                if (i9 >= d8.size()) {
                    int i10 = 0;
                    int i11 = -1;
                    while (true) {
                        int[] iArr = k0.f6122c;
                        if (i10 >= 32 || i11 != -1) {
                            break;
                        }
                        int i12 = iArr[i10];
                        boolean z3 = true;
                        for (int i13 = 0; i13 < d8.size(); i13++) {
                            z3 &= ((r3.d) d8.get(i13)).a() != i12;
                        }
                        if (z3) {
                            i11 = i12;
                        }
                        i10++;
                    }
                    i = i11;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((r3.d) d8.get(i9)).f6552a).getLabel())) {
                        i = ((r3.d) d8.get(i9)).a();
                        break;
                    }
                    i9++;
                }
            }
            if (i != -1) {
                r3.d dVar = new r3.d(null, i, string, eVar, null);
                View.AccessibilityDelegate b8 = k0.b(view);
                b bVar = b8 == null ? null : b8 instanceof q3.a ? ((q3.a) b8).f6072a : new b(b8);
                if (bVar == null) {
                    bVar = new b();
                }
                k0.k(view, bVar);
                k0.h(view, dVar.a());
                k0.d(view).add(dVar);
                k0.f(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.I && this.N != 5) {
            k0.i(view, r3.d.f6547l, new e(5, this));
        }
        int i14 = this.N;
        if (i14 == 3) {
            k0.i(view, r3.d.f6546k, new e(this.f1842b ? 4 : 6, this));
            return;
        }
        if (i14 == 4) {
            k0.i(view, r3.d.f6545j, new e(this.f1842b ? 3 : 6, this));
        } else {
            if (i14 != 6) {
                return;
            }
            k0.i(view, r3.d.f6546k, new e(4, this));
            k0.i(view, r3.d.f6545j, new e(3, this));
        }
    }

    public final void G(int i, boolean z3) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z7 = this.N == 3 && (this.f1868x || z());
        if (this.f1870z == z7 || (jVar = this.i) == null) {
            return;
        }
        this.f1870z = z7;
        ValueAnimator valueAnimator = this.B;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jVar.f8105e.f8095j, z7 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s5 = this.f1870z ? s() : 1.0f;
        h hVar = jVar.f8105e;
        if (hVar.f8095j != s5) {
            hVar.f8095j = s5;
            jVar.i = true;
            jVar.f8109j = true;
            jVar.invalidateSelf();
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f1847d0 != null) {
                    return;
                } else {
                    this.f1847d0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z3) {
                    this.f1847d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f1847d0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // d3.a
    public final void c(d3.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // d3.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // d3.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        c cVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1841a0 = -1;
            this.f1843b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            this.f1843b0 = y7;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x7, y7)) {
                    this.f1841a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1845c0 = true;
                }
            }
            this.P = this.f1841a0 == -1 && !coordinatorLayout.o(view, x7, this.f1843b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1845c0 = false;
            this.f1841a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (cVar = this.O) == null || !cVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.f1843b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.f8633b) {
                return false;
            }
        }
        return true;
    }

    @Override // d3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f1852g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z3 = (Build.VERSION.SDK_INT < 29 || this.f1858n || this.f1850f) ? false : true;
            if (this.f1859o || this.f1860p || this.f1861q || this.f1863s || this.f1864t || this.f1865u || z3) {
                k5.c cVar = new k5.c(this, z3);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                m mVar = new m();
                mVar.f6680a = paddingStart;
                mVar.f6681b = paddingEnd;
                mVar.f6682c = paddingBottom;
                a0 a0Var = new a0(19, cVar, mVar);
                Field field = k0.f6120a;
                c0.i(view, a0Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            k0.m(view, new g(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            r.Q(context, R.attr.motionDurationMedium2, 300);
            r.Q(context, R.attr.motionDurationShort3, 150);
            r.Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.i;
            if (jVar != null) {
                view.setBackground(jVar);
                float f6 = this.H;
                if (f6 == -1.0f) {
                    f6 = view.getElevation();
                }
                jVar.m(f6);
            } else {
                ColorStateList colorStateList = this.f1854j;
                if (colorStateList != null) {
                    c0.g(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f1851f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i8 = this.V;
        int i9 = i8 - height;
        int i10 = this.f1867w;
        if (i9 < i10) {
            boolean z7 = this.f1862r;
            int i11 = this.f1856l;
            if (z7) {
                if (i11 != -1) {
                    i8 = Math.min(i8, i11);
                }
                this.T = i8;
            } else {
                int i12 = i8 - i10;
                if (i11 != -1) {
                    i12 = Math.min(i12, i11);
                }
                this.T = i12;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i13 = this.N;
        if (i13 == 3) {
            int x7 = x();
            Field field2 = k0.f6120a;
            view.offsetTopAndBottom(x7);
        } else if (i13 == 6) {
            int i14 = this.E;
            Field field3 = k0.f6120a;
            view.offsetTopAndBottom(i14);
        } else if (this.I && i13 == 5) {
            int i15 = this.V;
            Field field4 = k0.f6120a;
            view.offsetTopAndBottom(i15);
        } else if (i13 == 4) {
            int i16 = this.G;
            Field field5 = k0.f6120a;
            view.offsetTopAndBottom(i16);
        } else if (i13 == 1 || i13 == 2) {
            int top2 = top - view.getTop();
            Field field6 = k0.f6120a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // d3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.f1855k, marginLayoutParams.width), w(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1856l, marginLayoutParams.height));
        return true;
    }

    @Override // d3.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // d3.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i8, int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i10 = top - i8;
        boolean z3 = this.K;
        boolean z7 = this.L;
        if (i8 > 0) {
            if (!this.R && !z7 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i10 < x()) {
                int x7 = top - x();
                iArr[1] = x7;
                Field field = k0.f6120a;
                view.offsetTopAndBottom(-x7);
                C(3);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i8;
                Field field2 = k0.f6120a;
                view.offsetTopAndBottom(-i8);
                C(1);
            }
        } else if (i8 < 0) {
            boolean canScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z7 && view2 == view3 && canScrollVertically) {
                this.M = true;
                return;
            }
            if (!canScrollVertically) {
                int i11 = this.G;
                if (i10 > i11 && !this.I) {
                    int i12 = top - i11;
                    iArr[1] = i12;
                    Field field3 = k0.f6120a;
                    view.offsetTopAndBottom(-i12);
                    C(4);
                } else {
                    if (!z3) {
                        return;
                    }
                    iArr[1] = i8;
                    Field field4 = k0.f6120a;
                    view.offsetTopAndBottom(-i8);
                    C(1);
                }
            }
        }
        u(view.getTop());
        this.Q = i8;
        this.R = true;
        this.M = false;
    }

    @Override // d3.a
    public final void m(View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        int i = this.f1840a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1848e = fVar.f4192g;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1842b = fVar.f4193h;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = fVar.i;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = fVar.f4194j;
            }
        }
        int i8 = fVar.f4191f;
        if (i8 == 1 || i8 == 2) {
            this.N = 4;
        } else {
            this.N = i8;
        }
    }

    @Override // d3.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new f(this);
    }

    @Override // d3.a
    public final boolean o(View view, int i, int i8) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    @Override // d3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i8 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.f1842b) {
                }
                E(view, i8, false);
                this.R = false;
            }
            if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1844c);
                    yVelocity = this.Z.getYVelocity(this.f1841a0);
                }
                if (D(view, yVelocity)) {
                    i8 = 5;
                    E(view, i8, false);
                    this.R = false;
                }
            }
            if (this.Q == 0) {
                int top = view.getTop();
                if (!this.f1842b) {
                    int i9 = this.E;
                    if (top < i9) {
                    }
                    i8 = 6;
                }
            } else {
                if (!this.f1842b) {
                    int top2 = view.getTop();
                }
                i8 = 4;
            }
            E(view, i8, false);
            this.R = false;
        }
    }

    @Override // d3.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        c cVar = this.O;
        if (cVar != null && (this.K || i == 1)) {
            cVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1841a0 = -1;
            this.f1843b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.f1843b0 - motionEvent.getY());
            c cVar2 = this.O;
            if (abs > cVar2.f8633b) {
                cVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t3 = t();
        if (this.f1842b) {
            this.G = Math.max(this.V - t3, this.D);
        } else {
            this.G = this.V - t3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f6;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f8 = 0.0f;
        if (this.i != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.W.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                j jVar = this.i;
                float[] fArr = jVar.E;
                float a8 = fArr != null ? fArr[3] : jVar.f8105e.f8087a.f8142e.a(jVar.g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f9 = radius2;
                    if (f9 > 0.0f && a8 > 0.0f) {
                        f6 = f9 / a8;
                        j jVar2 = this.i;
                        float[] fArr2 = jVar2.E;
                        float a9 = fArr2 == null ? fArr2[0] : jVar2.f8105e.f8087a.f8143f.a(jVar2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f10 = radius;
                            if (f10 > 0.0f && a9 > 0.0f) {
                                f8 = f10 / a9;
                            }
                        }
                        return Math.max(f6, f8);
                    }
                }
                f6 = 0.0f;
                j jVar22 = this.i;
                float[] fArr22 = jVar22.E;
                if (fArr22 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f6, f8);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f1850f ? Math.min(Math.max(this.f1852g, this.V - ((this.U * 9) / 16)), this.T) + this.f1866v : (this.f1858n || this.f1859o || (i = this.f1857m) <= 0) ? this.f1848e + this.f1866v : Math.max(this.f1848e, i + this.f1853h);
    }

    public final void u(int i) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i8 = this.G;
            if (i <= i8 && i8 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f1842b) {
            return this.D;
        }
        return Math.max(this.C, this.f1862r ? 0 : this.f1867w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(q.h("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i8 = 0;
        this.f1840a = 0;
        this.f1842b = true;
        this.f1855k = -1;
        this.f1856l = -1;
        this.A = new h4.a(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1843b0 = -1;
        this.f1849e0 = new SparseIntArray();
        this.f1851f0 = new d(this, i8);
        this.f1853h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2736a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1854j = o.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f1869y = n.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        n nVar = this.f1869y;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.i = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.f1854j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new k5.b(i8, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1855k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1856l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z3) {
            this.I = z3;
            if (!z3 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f1858n = obtainStyledAttributes.getBoolean(14, false);
        boolean z7 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f1842b != z7) {
            this.f1842b = z7;
            if (this.W != null) {
                r();
            }
            C((this.f1842b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f1840a = obtainStyledAttributes.getInt(11, 0);
        float f6 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.F = f6;
            if (this.W != null) {
                this.E = (int) ((1.0f - f6) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i9 = peekValue2.data;
                if (i9 >= 0) {
                    this.C = i9;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f1846d = obtainStyledAttributes.getInt(12, 500);
            this.f1859o = obtainStyledAttributes.getBoolean(18, false);
            this.f1860p = obtainStyledAttributes.getBoolean(19, false);
            this.f1861q = obtainStyledAttributes.getBoolean(20, false);
            this.f1862r = obtainStyledAttributes.getBoolean(21, true);
            this.f1863s = obtainStyledAttributes.getBoolean(15, false);
            this.f1864t = obtainStyledAttributes.getBoolean(16, false);
            this.f1865u = obtainStyledAttributes.getBoolean(17, false);
            this.f1868x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f1844c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // d3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
    }
}
