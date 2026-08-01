package a3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import c2.g0;
import c2.p1;
import c2.q1;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.md;
import d2.p2;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.h0;
import o3.h1;
import o3.k1;
import x3.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n extends ViewGroup implements o3.h, n0.i, p1, o3.i {
    public f5.e A;
    public final int[] B;
    public long C;
    public k1 D;
    public Function1 E;
    public final m F;
    public final m G;
    public Function1 H;
    public final int[] I;
    public int J;
    public int K;
    public final md L;
    public boolean M;
    public final g0 N;

    /* renamed from: d, reason: collision with root package name */
    public final w1.c f233d;

    /* renamed from: e, reason: collision with root package name */
    public final View f234e;

    /* renamed from: i, reason: collision with root package name */
    public final d2.v f235i;

    /* renamed from: r, reason: collision with root package name */
    public Function0 f236r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237s;

    /* renamed from: t, reason: collision with root package name */
    public Function0 f238t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f239u;

    /* renamed from: v, reason: collision with root package name */
    public d1.l f240v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f241w;

    /* renamed from: x, reason: collision with root package name */
    public x2.c f242x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f243y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.lifecycle.u f244z;

    public n(Context context, h0 h0Var, int i3, w1.c cVar, View view, d2.v vVar) {
        super(context);
        this.f233d = cVar;
        this.f234e = view;
        this.f235i = vVar;
        s.h0 h0Var2 = p2.f3507a;
        setTag(R.id.androidx_compose_ui_view_composition_context, h0Var);
        int i10 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        e0 e0Var = (e0) this;
        o3.c0.f(this, new b(e0Var, i10));
        o3.w.c(this, this);
        this.f236r = l.f229r;
        this.f238t = l.f228i;
        this.f239u = l.f227e;
        this.f240v = d1.i.f3304a;
        this.f242x = z4.w.a();
        this.B = new int[2];
        this.C = 0L;
        this.F = new m(e0Var, 1);
        this.G = new m(e0Var, i10);
        this.I = new int[2];
        this.J = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.L = new md();
        g0 g0Var = new g0(3);
        g0Var.C = e0Var;
        d1.l c10 = w1.e.a(cVar).c(new j2.b(c.f200r, true));
        x1.q qVar = new x1.q();
        qVar.f10311a = new g(e0Var, 2);
        b1.b bVar = new b1.b();
        b1.b bVar2 = qVar.f10312b;
        if (bVar2 != null) {
            bVar2.f944e = null;
        }
        qVar.f10312b = bVar;
        bVar.f944e = qVar;
        setOnRequestDisallowInterceptTouchEvent$ui(bVar);
        d1.l c11 = a2.q.k(h1.d.b(c10.c(qVar), new i(e0Var, g0Var, e0Var)), new f(e0Var, g0Var, 2)).c(new s(new g(e0Var, 1)));
        g0Var.Z(this.f240v.c(c11));
        this.f241w = new d(i10, g0Var, c11);
        g0Var.V(this.f242x);
        this.f243y = new e(i10, g0Var);
        g0Var.Z = new f(e0Var, g0Var, 0);
        g0Var.f1545a0 = new g(e0Var, 0);
        g0Var.Y(new h(e0Var, g0Var));
        this.N = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            z1.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f235i.getSnapshotObserver();
    }

    public static final int k(e0 e0Var, int i3, int i10, int i11) {
        return (i11 >= 0 || i3 == i10) ? View.MeasureSpec.makeMeasureSpec(be.f.c(i11, i3, i10), 1073741824) : (i11 != -2 || i10 == Integer.MAX_VALUE) ? (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static h3.b l(h3.b bVar, int i3, int i10, int i11, int i12) {
        int i13 = bVar.f4443a - i3;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = bVar.f4444b - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f4445c - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f4446d - i12;
        return h3.b.b(i13, i14, i15, i16 >= 0 ? i16 : 0);
    }

    @Override // o3.g
    public final void a(View view, View view2, int i3, int i10) {
        md mdVar = this.L;
        if (i10 == 1) {
            mdVar.f2540b = i3;
        } else {
            mdVar.f2539a = i3;
        }
    }

    @Override // o3.i
    public final k1 b(View view, k1 k1Var) {
        this.D = new k1(k1Var);
        return m(k1Var);
    }

    @Override // o3.g
    public final void c(View view, int i3) {
        md mdVar = this.L;
        if (i3 == 1) {
            mdVar.f2540b = 0;
        } else {
            mdVar.f2539a = 0;
        }
    }

    @Override // o3.h
    public final void d(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.f234e.isNestedScrollingEnabled()) {
            float f3 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i3 * f3) << 32) | (Float.floatToRawIntBits(i10 * f3) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f3) & 4294967295L) | (Float.floatToRawIntBits(i11 * f3) << 32);
            int i14 = i13 == 0 ? 1 : 2;
            w1.h hVar = this.f233d.f10009a;
            w1.h J = hVar != null ? hVar.J() : null;
            long L = J != null ? J.L(i14, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = yd.c.a(Float.intBitsToFloat((int) (L >> 32))) * (-1);
            iArr[1] = yd.c.a(Float.intBitsToFloat((int) (L & 4294967295L))) * (-1);
        }
    }

    @Override // o3.g
    public final void e(int i3, int i10, int[] iArr, int i11) {
        if (this.f234e.isNestedScrollingEnabled()) {
            float f3 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i10 * f3) & 4294967295L) | (Float.floatToRawIntBits(i3 * f3) << 32);
            int i12 = i11 == 0 ? 1 : 2;
            w1.h hVar = this.f233d.f10009a;
            w1.h J = hVar != null ? hVar.J() : null;
            long N = J != null ? J.N(i12, floatToRawIntBits) : 0L;
            iArr[0] = yd.c.a(Float.intBitsToFloat((int) (N >> 32))) * (-1);
            iArr[1] = yd.c.a(Float.intBitsToFloat((int) (N & 4294967295L))) * (-1);
        }
    }

    @Override // o3.g
    public final void f(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13) {
        if (this.f234e.isNestedScrollingEnabled()) {
            float f3 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i3 * f3) << 32) | (Float.floatToRawIntBits(i10 * f3) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i11 * f3) << 32) | (Float.floatToRawIntBits(i12 * f3) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            w1.h hVar = this.f233d.f10009a;
            w1.h J = hVar != null ? hVar.J() : null;
            if (J != null) {
                J.L(i14, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // n0.i
    public final void g() {
        this.f239u.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.I;
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], getWidth() + i3, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final x2.c getDensity() {
        return this.f242x;
    }

    public final View getInteropView() {
        return this.f234e;
    }

    public final g0 getLayoutNode() {
        return this.N;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f234e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.u getLifecycleOwner() {
        return this.f244z;
    }

    public final d1.l getModifier() {
        return this.f240v;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        md mdVar = this.L;
        return mdVar.f2540b | mdVar.f2539a;
    }

    public final Function1<x2.c, Unit> getOnDensityChanged$ui() {
        return this.f243y;
    }

    public final Function1<d1.l, Unit> getOnModifierChanged$ui() {
        return this.f241w;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.H;
    }

    public final Function0<Unit> getRelease() {
        return this.f239u;
    }

    public final Function0<Unit> getReset() {
        return this.f238t;
    }

    public final f5.e getSavedStateRegistryOwner() {
        return this.A;
    }

    public final Function0<Unit> getUpdate() {
        return this.f236r;
    }

    public final View getView() {
        return this.f234e;
    }

    @Override // n0.i
    public final void h() {
        this.f238t.invoke();
        removeAllViewsInLayout();
    }

    @Override // o3.g
    public final boolean i(View view, View view2, int i3, int i10) {
        return ((i3 & 2) == 0 && (i3 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.M) {
            this.N.z();
            return null;
        }
        this.f234e.postOnAnimation(new a(0, this.G));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f234e.isNestedScrollingEnabled();
    }

    public final k1 m(k1 k1Var) {
        h1 h1Var = k1Var.f7415a;
        h3.b i3 = h1Var.i(-1);
        h3.b bVar = h3.b.f4442e;
        if (!i3.equals(bVar) || !h1Var.j(-9).equals(bVar) || h1Var.h() != null) {
            c2.q qVar = (c2.q) this.N.S.f1493d;
            if (qVar.f1639d0.B) {
                long c10 = j0.c(qVar.K(0L));
                int i10 = (int) (c10 >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (c10 & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long J = a2.q.h(qVar).J();
                int i12 = (int) (J >> 32);
                int i13 = (int) (J & 4294967295L);
                long j = qVar.f133i;
                long c11 = j0.c(qVar.K((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (c11 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & c11));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return k1Var.f7415a.r(i10, i11, i14, i16);
                }
            }
        }
        return k1Var;
    }

    @Override // c2.p1
    public final boolean o() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.M) {
            this.N.z();
        } else {
            this.f234e.postOnAnimation(new a(0, this.G));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f1645a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f234e.layout(0, 0, i11 - i3, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        View view = this.f234e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i3, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.J = i3;
        this.K = i10;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.jvm.functions.Function0, wd.p] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (!this.f234e.isNestedScrollingEnabled()) {
            return false;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(f10 * (-1.0f)) & 4294967295L);
        ge.x xVar = (ge.x) this.f233d.f10011c.invoke();
        if (xVar != null) {
            ge.a0.s(xVar, null, new j(z10, this, floatToRawIntBits, null), 3);
            return false;
        }
        i0.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function0, wd.p] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        if (!this.f234e.isNestedScrollingEnabled()) {
            return false;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(f10 * (-1.0f)) & 4294967295L);
        ge.x xVar = (ge.x) this.f233d.f10011c.invoke();
        if (xVar != null) {
            ge.a0.s(xVar, null, new k(this, floatToRawIntBits, null), 3);
            return false;
        }
        i0.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        Function1 function1 = this.E;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? new j1.c(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        Function1 function1 = this.H;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(x2.c cVar) {
        if (cVar != this.f242x) {
            this.f242x = cVar;
            Function1 function1 = this.f243y;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.u uVar) {
        if (uVar != this.f244z) {
            this.f244z = uVar;
            setTag(R.id.view_tree_lifecycle_owner, uVar);
        }
    }

    public final void setModifier(d1.l lVar) {
        if (lVar != this.f240v) {
            this.f240v = lVar;
            Function1 function1 = this.f241w;
            if (function1 != null) {
                function1.invoke(lVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super x2.c, Unit> function1) {
        this.f243y = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super d1.l, Unit> function1) {
        this.f241w = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.H = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.f239u = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.f238t = function0;
    }

    public final void setSavedStateRegistryOwner(f5.e eVar) {
        if (eVar != this.A) {
            this.A = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.f236r = function0;
        this.f237s = true;
        this.F.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
