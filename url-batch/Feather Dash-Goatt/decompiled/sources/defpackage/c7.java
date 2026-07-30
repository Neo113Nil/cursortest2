package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.feathherdashh.dashgame.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class c7 extends ViewGroup implements mk, fu0, br0 {
    public int A;
    public final j50 B;
    public boolean C;
    public final jd0 D;
    public final wo0 d;
    public final View e;
    public final eu0 g;
    public Function0 h;
    public boolean i;
    public Function0 j;
    public Function0 k;
    public am0 l;
    public Function1 m;
    public nr n;
    public Function1 o;
    public vg0 p;
    public e61 q;
    public final int[] r;
    public long s;
    public ip1 t;
    public Function1 u;
    public final b7 v;
    public final b7 w;
    public Function1 x;
    public final int[] y;
    public int z;

    public c7(Context context, fl flVar, int i, wo0 wo0Var, View view, eu0 eu0Var) {
        super(context);
        this.d = wo0Var;
        this.e = view;
        this.g = eu0Var;
        LinkedHashMap linkedHashMap = vp1.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, flVar);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        pn1 pn1Var = (pn1) this;
        v6 v6Var = new v6(pn1Var);
        int i3 = ln1.a;
        setWindowInsetsAnimationCallback(new to1(v6Var));
        hn1.a(this, this);
        this.h = p2.o;
        this.j = p2.n;
        this.k = p2.m;
        this.l = xl0.a;
        this.n = la0.i();
        int i4 = 2;
        this.r = new int[2];
        this.s = 0L;
        this.v = new b7(pn1Var, 1);
        this.w = new b7(pn1Var, i2);
        this.y = new int[2];
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = new j50(24);
        jd0 jd0Var = new jd0(3);
        jd0Var.t = pn1Var;
        am0 a = i81.a(mo.z(wo0Var), true, y3.l);
        xx0 xx0Var = new xx0();
        xx0Var.a = new x6(pn1Var, 2);
        pe peVar = new pe();
        pe peVar2 = xx0Var.b;
        if (peVar2 != null) {
            peVar2.e = null;
        }
        xx0Var.b = peVar;
        peVar.e = xx0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(peVar);
        am0 c = yr1.G(a.c(xx0Var), new z6(pn1Var, jd0Var, pn1Var)).c(new nr0(new w6(pn1Var, jd0Var, i4))).c(new ae(new x6(pn1Var, 1)));
        jd0Var.b0(this.l.c(c));
        this.m = new t4(jd0Var, 4, c);
        jd0Var.X(this.n);
        this.o = new a3(6, jd0Var);
        jd0Var.Q = new w6(pn1Var, jd0Var, i2);
        jd0Var.R = new x6(pn1Var, 0);
        jd0Var.a0(new y6(pn1Var, jd0Var));
        this.D = jd0Var;
    }

    public static final int e(pn1 pn1Var, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(b11.c(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static c90 f(c90 c90Var, int i, int i2, int i3, int i4) {
        int i5 = c90Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c90Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c90Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c90Var.d - i4;
        return c90.a(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gu0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            o80.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((d4) this.g).getSnapshotObserver();
    }

    @Override // defpackage.mk
    public final void a() {
        this.k.invoke();
    }

    @Override // defpackage.br0
    public final ip1 b(View view, ip1 ip1Var) {
        this.t = new ip1(ip1Var);
        return g(ip1Var);
    }

    @Override // defpackage.mk
    public final void c() {
        this.j.invoke();
        removeAllViewsInLayout();
    }

    public final ip1 g(ip1 ip1Var) {
        fp1 fp1Var = ip1Var.a;
        c90 g = fp1Var.g(-1);
        c90 c90Var = c90.e;
        if (!g.equals(c90Var) || !fp1Var.h(-9).equals(c90Var) || fp1Var.f() != null) {
            v80 v80Var = (v80) this.D.J.d;
            if (v80Var.U.r) {
                long C = t90.C(v80Var.M(0L));
                int i = (int) (C >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (C & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long K = t80.n(v80Var).K();
                int i3 = (int) (K >> 32);
                int i4 = (int) (K & 4294967295L);
                long j = v80Var.g;
                long C2 = t90.C(v80Var.M((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (C2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & C2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return ip1Var.a.n(i, i2, i5, i7);
                }
            }
        }
        return ip1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.y;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final nr getDensity() {
        return this.n;
    }

    public final View getInteropView() {
        return this.e;
    }

    public final jd0 getLayoutNode() {
        return this.D;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final vg0 getLifecycleOwner() {
        return this.p;
    }

    public final am0 getModifier() {
        return this.l;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.B.getClass();
        return 0;
    }

    public final Function1<nr, Unit> getOnDensityChanged$ui() {
        return this.o;
    }

    public final Function1<am0, Unit> getOnModifierChanged$ui() {
        return this.m;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.x;
    }

    public final Function0<Unit> getRelease() {
        return this.k;
    }

    public final Function0<Unit> getReset() {
        return this.j;
    }

    public final e61 getSavedStateRegistryOwner() {
        return this.q;
    }

    public final Function0<Unit> getUpdate() {
        return this.h;
    }

    public final View getView() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.C) {
            this.D.A();
            return null;
        }
        this.e.postOnAnimation(new q2(this.w, 2));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.e.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.C) {
            this.D.A();
        } else {
            this.e.postOnAnimation(new q2(this.w, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:11:0x0080, B:13:0x0088, B:15:0x0098, B:17:0x008d, B:20:0x0029, B:23:0x0035, B:25:0x004a, B:27:0x0056, B:29:0x0060, B:31:0x0070, B:38:0x007b, B:41:0x009c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        cc1 cc1Var = getSnapshotObserver().a;
        synchronized (cc1Var.g) {
            try {
                eo0 eo0Var = cc1Var.f;
                int i3 = eo0Var.g;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = eo0Var.d;
                    if (i4 < i3) {
                        bc1 bc1Var = (bc1) objArr[i4];
                        ln0 ln0Var = (ln0) bc1Var.f.k(this);
                        if (ln0Var != null) {
                            Object[] objArr2 = ln0Var.b;
                            int[] iArr = ln0Var.c;
                            long[] jArr = ln0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                bc1Var.c(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (bc1Var.f.j()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = eo0Var.d;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (bc1Var.f.j()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        eo0Var.g = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.e.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.z = i;
        this.A = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.e.isNestedScrollingEnabled()) {
            return false;
        }
        uq1.N(this.d.c(), null, new a7(z, this, ca0.d(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.e.isNestedScrollingEnabled()) {
            return false;
        }
        uq1.N(this.d.c(), null, new t71(this, ca0.d(f * (-1.0f), f2 * (-1.0f)), null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.u;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? t80.M(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.x;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(nr nrVar) {
        if (nrVar != this.n) {
            this.n = nrVar;
            Function1 function1 = this.o;
            if (function1 != null) {
                function1.invoke(nrVar);
            }
        }
    }

    public final void setLifecycleOwner(vg0 vg0Var) {
        if (vg0Var != this.p) {
            this.p = vg0Var;
            setTag(R.id.view_tree_lifecycle_owner, vg0Var);
        }
    }

    public final void setModifier(am0 am0Var) {
        if (am0Var != this.l) {
            this.l = am0Var;
            Function1 function1 = this.m;
            if (function1 != null) {
                function1.invoke(am0Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super nr, Unit> function1) {
        this.o = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super am0, Unit> function1) {
        this.m = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.x = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.k = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.j = function0;
    }

    public final void setSavedStateRegistryOwner(e61 e61Var) {
        if (e61Var != this.q) {
            this.q = e61Var;
            setTag(R.id.view_tree_saved_state_registry_owner, e61Var);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.h = function0;
        this.i = true;
        this.v.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.fu0
    public final boolean t() {
        return isAttachedToWindow();
    }
}
