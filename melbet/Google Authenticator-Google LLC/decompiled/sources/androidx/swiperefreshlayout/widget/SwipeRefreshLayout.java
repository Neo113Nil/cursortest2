package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import defpackage.ano;
import defpackage.anq;
import defpackage.anr;
import defpackage.ans;
import defpackage.ant;
import defpackage.anu;
import defpackage.anv;
import defpackage.anw;
import defpackage.anx;
import defpackage.any;
import defpackage.anz;
import defpackage.nc;
import defpackage.xl;
import defpackage.xm;
import defpackage.xn;
import defpackage.xo;
import defpackage.xp;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements xo, xn, xl {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {R.attr.enabled};
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation.AnimationListener I;
    private final Animation J;
    private final Animation K;
    public any a;
    public boolean b;
    public int c;
    public ano d;
    public int e;
    public int f;
    public int g;
    public anr h;
    public boolean i;
    public boolean j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final xp q;
    private final xm r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = new anv(this, 1);
        this.J = new anw(this);
        this.K = new anx(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (displayMetrics.density * 40.0f);
        this.d = new ano(getContext());
        anr anrVar = new anr(getContext());
        this.h = anrVar;
        anq anqVar = anrVar.a;
        float f = anrVar.b.getDisplayMetrics().density;
        anqVar.d(2.5f * f);
        anqVar.p = 7.5f * f;
        anqVar.g();
        anqVar.q = (int) (10.0f * f);
        anqVar.r = (int) (f * 5.0f);
        anrVar.invalidateSelf();
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.o = i;
        this.q = new xp();
        this.r = new xm(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.c = i2;
        this.f = i2;
        a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private final Animation m(int i, int i2) {
        anu anuVar = new anu(this, i, i2);
        anuVar.setDuration(300L);
        ano anoVar = this.d;
        anoVar.a = null;
        anoVar.clearAnimation();
        this.d.startAnimation(anuVar);
        return anuVar;
    }

    private final void n() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void o(float f) {
        if (f > this.o) {
            r(true, true);
            return;
        }
        this.b = false;
        this.h.d(0.0f);
        anv anvVar = new anv(this, 0);
        this.e = this.c;
        Animation animation = this.K;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.B);
        ano anoVar = this.d;
        anoVar.a = anvVar;
        anoVar.clearAnimation();
        this.d.startAnimation(animation);
        this.h.b(false);
    }

    private final void p(float f) {
        this.h.b(true);
        float min = Math.min(1.0f, Math.abs(f / this.o));
        float max = (float) Math.max(min - 0.4d, 0.0d);
        float abs = Math.abs(f) - this.o;
        float f2 = this.g;
        double max2 = Math.max(0.0f, Math.min(abs, f2 + f2) / f2) / 4.0f;
        float f3 = min * f2;
        float pow = (float) (max2 - Math.pow(max2, 2.0d));
        float f4 = pow + pow;
        float f5 = f2 * f4;
        int i = this.f + ((int) (f3 + f5 + f5));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        float f6 = this.o;
        anr anrVar = this.h;
        if (f < f6) {
            if (anrVar.getAlpha() > 76 && !u(this.F)) {
                this.F = m(this.h.getAlpha(), 76);
            }
        } else if (anrVar.getAlpha() < 255 && !u(this.G)) {
            this.G = m(this.h.getAlpha(), 255);
        }
        float f7 = (max * 5.0f) / 3.0f;
        this.h.d(Math.min(0.8f, f7 * 0.8f));
        this.h.c(Math.min(1.0f, f7));
        anr anrVar2 = this.h;
        anrVar2.a.g = (((f7 * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        anrVar2.invalidateSelf();
        j(i - this.c);
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void r(boolean z, boolean z2) {
        if (this.b != z) {
            this.i = z2;
            n();
            this.b = z;
            if (!z) {
                k(this.I);
                return;
            }
            int i = this.c;
            Animation.AnimationListener animationListener = this.I;
            this.e = i;
            Animation animation = this.J;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.B);
            if (animationListener != null) {
                this.d.a = animationListener;
            }
            this.d.clearAnimation();
            this.d.startAnimation(animation);
        }
    }

    private final void s(float f) {
        float f2 = this.y;
        float f3 = f - f2;
        float f4 = this.n;
        if (f3 <= f4 || this.z) {
            return;
        }
        this.x = f2 + f4;
        this.z = true;
        this.h.setAlpha(76);
    }

    private static final boolean u(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void a(float f) {
        j((this.e + ((int) ((this.f - r0) * f))) - this.d.getTop());
    }

    public final void b() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(255);
        this.h.setAlpha(255);
        j(this.f - this.c);
        this.c = this.d.getTop();
    }

    public final void c(float f) {
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    @Override // defpackage.xn
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        i(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.xn
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.u);
    }

    @Override // defpackage.xo
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        int[] iArr2 = this.t;
        this.r.f(i, i2, i3, i4, iArr2, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = i4 + iArr2[1];
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || l()) {
            return;
        }
        float abs = this.p + Math.abs(i8);
        this.p = abs;
        p(abs);
        iArr[1] = iArr[1] + i6;
    }

    @Override // defpackage.xn
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    @Override // defpackage.xn
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r.g(0);
    }

    public final void i(boolean z, boolean z2) {
        if (z) {
            if (!this.b) {
                this.b = true;
                j((this.g + this.f) - this.c);
                this.i = z2;
                Animation.AnimationListener animationListener = this.I;
                this.d.setVisibility(0);
                this.h.setAlpha(255);
                ans ansVar = new ans(this);
                this.D = ansVar;
                ansVar.setDuration(this.w);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.D);
                return;
            }
            z = true;
        }
        r(z, false);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public final void j(int i) {
        this.d.bringToFront();
        ano anoVar = this.d;
        int i2 = yq.a;
        anoVar.offsetTopAndBottom(i);
        this.c = this.d.getTop();
    }

    public final void k(Animation.AnimationListener animationListener) {
        ant antVar = new ant(this);
        this.E = antVar;
        antVar.setDuration(150L);
        ano anoVar = this.d;
        anoVar.a = animationListener;
        anoVar.clearAnimation();
        this.d.startAnimation(this.E);
    }

    public final boolean l() {
        View view = this.m;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !l() && !this.b && !this.v) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.A;
                        if (i == -1) {
                            Log.e(k, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            s(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            q(motionEvent);
                        }
                    }
                    return this.z;
                }
                this.z = false;
                this.A = -1;
                return this.z;
            }
            j(this.f - this.d.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.A = pointerId;
            this.z = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.y = motionEvent.getY(findPointerIndex2);
                return this.z;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            n();
        }
        View view = this.m;
        if (view != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.d.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            ano anoVar = this.d;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.c;
            int i8 = i5 + i6;
            anoVar.layout(i5 - i6, i7, i8, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            n();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.C = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.d) {
                this.C = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                p(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.b(i, 0);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        anz anzVar = (anz) parcelable;
        super.onRestoreInstanceState(anzVar.getSuperState());
        i(anzVar.a, false);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new anz(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.q.c(0);
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            o(f);
            this.p = 0.0f;
        } else {
            post(new nc(this, 18));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || l() || this.b || this.v) {
            return false;
        }
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.A);
                if (findPointerIndex < 0) {
                    Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.z) {
                    float y = (motionEvent.getY(findPointerIndex) - this.x) * 0.5f;
                    this.z = false;
                    o(y);
                }
                this.A = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.A);
                if (findPointerIndex2 < 0) {
                    Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                s(y2);
                if (this.z) {
                    float f = (y2 - this.x) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.A = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r.b(0);
    }

    @Override // defpackage.xn
    public final boolean t(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
