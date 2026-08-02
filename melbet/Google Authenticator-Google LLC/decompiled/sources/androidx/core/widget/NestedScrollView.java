package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.abg;
import defpackage.abh;
import defpackage.abi;
import defpackage.abj;
import defpackage.brn;
import defpackage.ud;
import defpackage.vy;
import defpackage.xd;
import defpackage.xl;
import defpackage.xm;
import defpackage.xo;
import defpackage.xp;
import defpackage.yg;
import defpackage.yp;
import defpackage.yq;
import defpackage.zx;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements xo, xl {
    private static final float h = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final abg i = new abg();
    private static final int[] j = {R.attr.fillViewport};
    private final int[] A;
    private final int[] B;
    private int C;
    private int D;
    private abj E;
    private final xp F;
    private final xm G;
    private float H;
    private boolean I;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    public abi d;
    final abh e;
    xd f;
    brn g;
    private final float k;
    private long l;
    private final Rect m;
    private int n;
    private boolean o;
    private boolean p;
    private View q;
    private boolean r;
    private boolean s;
    private VelocityTracker t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new Rect();
        this.o = true;
        this.p = false;
        this.q = null;
        this.r = false;
        this.s = false;
        this.v = true;
        this.z = -1;
        this.A = new int[2];
        this.B = new int[2];
        this.I = true;
        abh abhVar = new abh(this, 0);
        this.e = abhVar;
        this.f = new xd(getContext(), abhVar);
        this.b = yp.e(context, attributeSet);
        this.c = yp.e(context, attributeSet);
        this.k = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.w = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i2, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.u) {
            this.u = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        int[] iArr = ud.g;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        yq.k(this, context, iArr, attributeSet, obtainStyledAttributes2, i2, 0);
        this.I = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        this.F = new xp();
        this.G = new xm(this);
        setNestedScrollingEnabled(true);
        yq.l(this, i);
    }

    private final void A() {
        this.z = -1;
        this.r = false;
        z();
        E();
        k(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    private final void B() {
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
    }

    private final void C(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.G.f(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private final void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i2);
            this.z = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void E() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void F(boolean z) {
        if (z) {
            q(2, 1);
        } else {
            k(1);
        }
        this.D = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void G(View view) {
        Rect rect = this.m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int b = b(rect);
        if (b != 0) {
            scrollBy(0, b);
        }
    }

    private final boolean H(View view) {
        return !J(view, 0, getHeight());
    }

    private static boolean I(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && I((View) parent, view2);
    }

    private final boolean J(View view, int i2, int i3) {
        Rect rect = this.m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        if (r18 == 33) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        r1 = r20 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        r1 = r19 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0075, code lost:
    
        if (r18 == 33) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean K(int i2, int i3, int i4) {
        int i5;
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z3 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i2 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (!z2) {
                        if (z3) {
                            z2 = true;
                        } else if (!z4) {
                        }
                        view = view2;
                    } else if (z3) {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i3 >= scrollY) {
            if (i4 <= i6) {
                z = false;
                if (view3 != findFocus()) {
                    view3.requestFocus(i2);
                }
                return z;
            }
        }
        i(i5, -1, null, 0, 1, true);
        z = true;
        if (view3 != findFocus()) {
        }
        return z;
    }

    private final boolean L(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float c = yp.c(edgeEffect) * getHeight();
        float abs = Math.abs(-i2);
        float f = this.k * 0.015f;
        double log = Math.log((abs * 0.35f) / f);
        double d = h;
        return ((float) (((double) f) * Math.exp((d / ((-1.0d) + d)) * log))) < c;
    }

    private final boolean M(MotionEvent motionEvent) {
        boolean z;
        if (yp.c(this.b) != 0.0f) {
            yp.d(this.b, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (yp.c(this.c) == 0.0f) {
            return z;
        }
        yp.d(this.c, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private final void N(int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.l > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            F(z);
        } else {
            if (!this.a.isFinished()) {
                x();
            }
            scrollBy(i2, i3);
        }
        this.l = AnimationUtils.currentAnimationTimeMillis();
    }

    private final brn O() {
        brn brnVar = this.g;
        if (brnVar != null) {
            return brnVar;
        }
        brn brnVar2 = new brn((View) this, (byte[]) null);
        this.g = brnVar2;
        return brnVar2;
    }

    private static int w(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private final void x() {
        this.a.abortAnimation();
        k(1);
    }

    private final void y() {
        if (this.s) {
            return;
        }
        int identityHashCode = System.identityHashCode(this);
        long j2 = vy.a;
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection("NestedScrollView#drag", identityHashCode);
        } else {
            try {
                vy.b.invoke(null, Long.valueOf(vy.a), "NestedScrollView#drag", Integer.valueOf(identityHashCode));
            } catch (Exception unused) {
            }
        }
        this.s = true;
    }

    private final void z() {
        if (this.s) {
            int identityHashCode = System.identityHashCode(this);
            long j2 = vy.a;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection("NestedScrollView#drag", identityHashCode);
            } else {
                try {
                    vy.c.invoke(null, Long.valueOf(vy.a), "NestedScrollView#drag", Integer.valueOf(identityHashCode));
                } catch (Exception unused) {
                }
            }
            this.s = false;
        }
    }

    public final float a() {
        float f = this.H;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.H = dimension;
        return dimension;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    protected final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || rect.bottom >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? -(i3 - rect.bottom) : -(scrollY - rect.top), -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i2;
        if (this.a.isFinished()) {
            return;
        }
        this.a.computeScrollOffset();
        int currY = this.a.getCurrY();
        int i3 = currY - this.D;
        int height = getHeight();
        if (i3 <= 0 || yp.c(this.b) == 0.0f) {
            if (i3 < 0 && yp.c(this.c) != 0.0f) {
                float f = height;
                round = Math.round((f / 4.0f) * yp.d(this.c, (i3 * 4.0f) / f, 0.5f));
                if (round != i3) {
                    this.c.finish();
                }
            }
            int i4 = i3;
            this.D = currY;
            int[] iArr = this.B;
            iArr[1] = 0;
            m(0, i4, iArr, null, 1);
            i2 = i4 - iArr[1];
            int c = c();
            if (Build.VERSION.SDK_INT >= 35) {
                zx.b(this, Math.abs(this.a.getCurrVelocity()));
            }
            if (i2 != 0) {
                int scrollY = getScrollY();
                s(i2, getScrollX(), scrollY, c);
                int scrollY2 = getScrollY() - scrollY;
                iArr[1] = 0;
                int i5 = i2 - scrollY2;
                r(scrollY2, i5, this.A, 1, iArr);
                i2 = i5 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && c > 0)) {
                    if (i2 < 0) {
                        if (this.b.isFinished()) {
                            this.b.onAbsorb((int) this.a.getCurrVelocity());
                        }
                    } else if (this.c.isFinished()) {
                        this.c.onAbsorb((int) this.a.getCurrVelocity());
                    }
                }
                x();
            }
            if (this.a.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                k(1);
                return;
            }
        }
        round = Math.round(((-height) / 4.0f) * yp.d(this.b, ((-i3) * 4.0f) / height, 0.5f));
        if (round != i3) {
            this.b.finish();
        }
        i3 -= round;
        int i42 = i3;
        this.D = currY;
        int[] iArr2 = this.B;
        iArr2[1] = 0;
        m(0, i42, iArr2, null, 1);
        i2 = i42 - iArr2[1];
        int c2 = c();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.a.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    @Override // defpackage.xn
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        m(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.G.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.G.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return m(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.G.f(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.b.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.translate(i2, min);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.c.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(c(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i3 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.c.setSize(width2, height2);
        if (this.c.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // defpackage.xn
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        C(i5, i6, null);
    }

    @Override // defpackage.xo
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        C(i5, i6, iArr);
    }

    @Override // defpackage.xn
    public final void g(View view, View view2, int i2, int i3) {
        this.F.b(i2, i3);
        q(2, i3);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.xn
    public final void h(View view, int i2) {
        this.F.c(i2);
        k(i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return p(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    final int i(int i2, int i3, MotionEvent motionEvent, int i4, int i5, boolean z) {
        int i6;
        int i7;
        boolean z2;
        int i8;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            q(2, 1);
        }
        int[] iArr = this.B;
        int[] iArr2 = this.A;
        if (m(0, i2, iArr, iArr2, i5)) {
            i6 = i2 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i2;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int c = c();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && c() > 0)) && !z;
        boolean z4 = s(i6, 0, scrollY, c) && !p(i5);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent == null || scrollY2 == 0) {
            z2 = 1;
            i8 = 0;
        } else {
            i8 = 0;
            z2 = 1;
            O().S(motionEvent.getDeviceId(), motionEvent.getSource(), i3, scrollY2);
        }
        iArr[z2] = i8;
        r(scrollY2, i6 - scrollY2, iArr2, i5, iArr);
        int i9 = i7 + iArr2[z2];
        int i10 = i6 - iArr[z2];
        int i11 = scrollY + i10;
        if (i11 < 0) {
            if (z3) {
                yp.d(this.b, (-i10) / getHeight(), i4 / getWidth());
                if (motionEvent != null) {
                    O().R(motionEvent.getDeviceId(), motionEvent.getSource(), i3, z2);
                }
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (i11 > c && z3) {
            yp.d(this.c, i10 / getHeight(), 1.0f - (i4 / getWidth()));
            if (motionEvent != null) {
                O().R(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i8);
            }
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (!this.b.isFinished() || !this.c.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z4 && i5 == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            k(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return i9;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.G.a;
    }

    public final void j(int i2) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            F(true);
            if (Build.VERSION.SDK_INT >= 35) {
                zx.b(this, Math.abs(this.a.getCurrVelocity()));
            }
        }
    }

    public final void k(int i2) {
        this.G.b(i2);
    }

    public final boolean l(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !J(findNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            i(height, -1, null, 0, 1, true);
        } else {
            Rect rect = this.m;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            i(b(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (view == null || !view.isFocused() || !H(view)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean m(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.G.e(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(KeyEvent keyEvent) {
        this.m.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? o(33) : l(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? o(130) : l(130);
                }
                if (keyCode == 62) {
                    u(true == keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return o(33);
                }
                if (keyCode == 93) {
                    return o(130);
                }
                if (keyCode == 122) {
                    u(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                u(130);
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(int i2) {
        int childCount;
        Rect rect = this.m;
        int height = getHeight();
        rect.top = 0;
        rect.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.top = rect.bottom - height;
        }
        return K(i2, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        float f;
        if (motionEvent.getAction() == 8 && !this.r) {
            if (yg.e(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
                i2 = 9;
                i3 = (int) motionEvent.getX();
            } else if (yg.e(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i3 = getWidth() / 2;
                i2 = 26;
                f = axisValue;
            } else {
                i2 = 0;
                i3 = 0;
                f = 0.0f;
            }
            if (f != 0.0f) {
                i(-((int) (f * a())), i2, motionEvent, i3, 1, yg.e(motionEvent, 8194));
                if (i2 == 0) {
                    return true;
                }
                this.f.a(motionEvent, i2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.r) {
                return true;
            }
            action = 2;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.z;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", a.ai(i3, "Invalid pointerId=", " in onInterceptTouchEvent"));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.n) > this.w && (2 & getNestedScrollAxes()) == 0) {
                                this.r = true;
                                y();
                                this.n = y;
                                B();
                                this.t.addMovement(motionEvent);
                                this.C = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.r = false;
            z();
            this.z = -1;
            E();
            if (this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                postInvalidateOnAnimation();
            }
            k(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.n = y2;
                    this.z = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.t;
                    if (velocityTracker == null) {
                        this.t = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.t.addMovement(motionEvent);
                    this.a.computeScrollOffset();
                    if (!M(motionEvent) && this.a.isFinished()) {
                        z = false;
                    }
                    this.r = z;
                    if (z) {
                        y();
                    } else {
                        z();
                    }
                    q(2, 0);
                }
            }
            if (!M(motionEvent) && this.a.isFinished()) {
                z = false;
            }
            this.r = z;
            if (z) {
                y();
            } else {
                z();
            }
            E();
        }
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        this.o = false;
        View view = this.q;
        if (view != null && I(view, this)) {
            G(this.q);
        }
        this.q = null;
        if (!this.p) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.a);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int w = w(scrollY, paddingTop, i6);
            if (w != scrollY) {
                scrollTo(getScrollX(), w);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.u && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        m(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        C(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || H(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof abj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        abj abjVar = (abj) parcelable;
        super.onRestoreInstanceState(abjVar.getSuperState());
        this.E = abjVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        abj abjVar = new abj(super.onSaveInstanceState());
        abjVar.a = getScrollY();
        return abjVar;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        abi abiVar = this.d;
        if (abiVar != null) {
            abiVar.a(this, i3);
        }
    }

    public final boolean onScrollToTop(int i2) {
        if (!this.I || !canScrollVertically(-1)) {
            return false;
        }
        v(getScrollX(), 0, false);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !J(findFocus, 0, i5)) {
            return;
        }
        Rect rect = this.m;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b = b(rect);
        if (b != 0) {
            if (this.v) {
                N(0, b, false);
            } else {
                scrollBy(0, b);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        float d;
        int round;
        int i2;
        ViewParent parent2;
        B();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = 0;
            actionMasked = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.C);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (nestedScrollView.getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.r && (parent = nestedScrollView.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.a.isFinished()) {
                nestedScrollView.x();
            }
            int y = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            nestedScrollView.n = y;
            nestedScrollView.z = pointerId;
            nestedScrollView.q(2, 0);
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.z + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.n - y2;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (yp.c(this.b) != 0.0f) {
                        d = -yp.d(this.b, -height, x);
                        if (yp.c(this.b) == 0.0f) {
                            this.b.onRelease();
                        }
                    } else {
                        if (yp.c(this.c) != 0.0f) {
                            d = yp.d(this.c, height, 1.0f - x);
                            if (yp.c(this.c) == 0.0f) {
                                this.c.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i2 = i3 - round;
                        if (!this.r && Math.abs(i2) > this.w) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.r = true;
                            y();
                            int i4 = this.w;
                            i2 = i2 <= 0 ? i2 - i4 : i2 + i4;
                        }
                        int i5 = i2;
                        if (this.r) {
                            nestedScrollView = this;
                            int i6 = nestedScrollView.i(i5, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            nestedScrollView.n = y2 - i6;
                            nestedScrollView.C += i6;
                        }
                    }
                    f = d;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i2 = i3 - round;
                    if (!this.r) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.r = true;
                        y();
                        int i42 = this.w;
                        if (i2 <= 0) {
                        }
                    }
                    int i52 = i2;
                    if (this.r) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.r && getChildCount() > 0 && this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                    postInvalidateOnAnimation();
                }
                A();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                D(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.z));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.t;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.y);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.z);
            if (Math.abs(yVelocity) >= nestedScrollView.x) {
                if (yp.c(nestedScrollView.b) == 0.0f) {
                    int i7 = -yVelocity;
                    if (yp.c(nestedScrollView.c) == 0.0f) {
                        float f2 = i7;
                        if (!nestedScrollView.dispatchNestedPreFling(0.0f, f2)) {
                            nestedScrollView.dispatchNestedFling(0.0f, f2, true);
                            nestedScrollView.j(i7);
                        }
                    } else if (nestedScrollView.L(nestedScrollView.c, i7)) {
                        nestedScrollView.c.onAbsorb(i7);
                    } else {
                        nestedScrollView.j(i7);
                    }
                } else if (nestedScrollView.L(nestedScrollView.b, yVelocity)) {
                    nestedScrollView.b.onAbsorb(yVelocity);
                } else {
                    nestedScrollView.j(-yVelocity);
                }
            } else if (nestedScrollView.a.springBack(nestedScrollView.getScrollX(), nestedScrollView.getScrollY(), 0, 0, 0, nestedScrollView.c())) {
                nestedScrollView.postInvalidateOnAnimation();
            }
            nestedScrollView.A();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i2) {
        return this.G.g(i2);
    }

    public final boolean q(int i2, int i3) {
        return this.G.h(i2, i3);
    }

    public final void r(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.G.f(0, i2, 0, i3, iArr, i4, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.o) {
            this.q = view2;
        } else {
            G(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b = b(rect);
        boolean z2 = b != 0;
        if (z2) {
            if (z) {
                scrollBy(0, b);
                return z2;
            }
            N(0, b, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            E();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.o = true;
        super.requestLayout();
    }

    final boolean s(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i3 > 0 || i3 < 0;
        int i7 = i4 + i2;
        if (i7 > i5) {
            i6 = i5;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z = false;
                if (z && !p(1)) {
                    this.a.springBack(0, i6, 0, 0, 0, c());
                }
                onOverScrolled(0, i6, z2, z);
                return !z2 || z;
            }
            i6 = 0;
        }
        z = true;
        if (z) {
            this.a.springBack(0, i6, 0, 0, 0, c());
        }
        onOverScrolled(0, i6, z2, z);
        if (z2) {
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int w = w(i2, width, width2);
            int w2 = w(i3, height, height2);
            if (w == getScrollX() && w2 == getScrollY()) {
                return;
            }
            super.scrollTo(w, w2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.G.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return q(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        k(0);
    }

    @Override // defpackage.xn
    public boolean t(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final void u(int i2) {
        int height = getHeight();
        Rect rect = this.m;
        if (i2 == 130) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.m;
        rect2.bottom = rect2.top + height;
        K(i2, rect2.top, rect2.bottom);
    }

    public final void v(int i2, int i3, boolean z) {
        N(i2 - getScrollX(), i3 - getScrollY(), z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
