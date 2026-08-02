package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.a;
import defpackage.aag;
import defpackage.aas;
import defpackage.abs;
import defpackage.abt;
import defpackage.abu;
import defpackage.abv;
import defpackage.abw;
import defpackage.abx;
import defpackage.aby;
import defpackage.aca;
import defpackage.arm;
import defpackage.boh;
import defpackage.me;
import defpackage.nc;
import defpackage.vb;
import defpackage.yi;
import defpackage.yj;
import defpackage.yq;
import defpackage.zz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup {
    public static final /* synthetic */ int e = 0;
    private static final boolean g;
    private float A;
    private float B;
    private Drawable C;
    private final ArrayList D;
    private Rect E;
    private Matrix F;
    private final aas G;
    public boolean b;
    public zz c;
    public boolean d;
    private float h;
    private final int i;
    private int j;
    private float k;
    private final Paint l;
    private final abs m;
    private final abs n;
    private final aca o;
    private final aca p;
    private int q;
    private boolean r;
    private boolean s;
    private OnBackInvokedCallback t;
    private OnBackInvokedDispatcher u;
    private int v;
    private int w;
    private int x;
    private int y;
    private List z;
    private static final int[] f = {R.attr.colorPrimaryDark};
    public static final int[] a = {R.attr.layout_gravity};

    static {
        g = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new abv();
        this.j = -1728053248;
        this.l = new Paint();
        int i2 = 1;
        this.s = true;
        this.v = 3;
        this.w = 3;
        this.x = 3;
        this.y = 3;
        this.G = new arm(this, i2);
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.i = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        aca acaVar = new aca(this, 3);
        this.o = acaVar;
        aca acaVar2 = new aca(this, 5);
        this.p = acaVar2;
        abs m = abs.m(this, acaVar);
        this.m = m;
        m.j = 1;
        m.g = f3;
        acaVar.b = m;
        abs m2 = abs.m(this, acaVar2);
        this.n = m2;
        m2.j = 2;
        m2.g = f3;
        acaVar2.b = m2;
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        yq.l(this, new abu(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            yi.c(this, new boh(i2));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f);
            try {
                this.C = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, abt.a, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.h = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.h = getResources().getDimension(com.google.android.apps.authenticator2.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.D = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String g(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static final float u(View view) {
        return ((abx) view.getLayoutParams()).b;
    }

    static final boolean v(View view) {
        return ((abx) view.getLayoutParams()).a == 0;
    }

    public static final boolean w(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((abx) view.getLayoutParams()).a, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    private final void y(View view) {
        aag aagVar = aag.f;
        yq.j(view, aagVar.a());
        if (!r(view) || b(view) == 2) {
            return;
        }
        yq.r(view, aagVar, this.G);
    }

    private final void z(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : w(childAt)) {
                childAt.setImportantForAccessibility(4);
            } else {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final int a(int i) {
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.v;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.x : this.y;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.w;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.y : this.x;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.x;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.v : this.w;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.y;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.w : this.v;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!w(childAt)) {
                this.D.add(childAt);
            } else if (r(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            ArrayList arrayList2 = this.D;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.D.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (e() != null || w(view)) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public final int b(View view) {
        if (w(view)) {
            return a(((abx) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException(a.ab(view, "View ", " is not a drawer"));
    }

    public final int c(View view) {
        return Gravity.getAbsoluteGravity(((abx) view.getLayoutParams()).a, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof abx) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((abx) getChildAt(i).getLayoutParams()).b);
        }
        this.k = f2;
        abs absVar = this.m;
        abs absVar2 = this.n;
        boolean l = absVar.l();
        boolean l2 = absVar2.l();
        if (l || l2) {
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((c(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.k <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            Rect rect = this.E;
            if (rect == null) {
                rect = new Rect();
                this.E = rect;
            }
            childAt.getHitRect(rect);
            if (this.E.contains((int) x, (int) y) && !v(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    int scrollX2 = getScrollX() - childAt.getLeft();
                    int scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        Matrix matrix2 = this.F;
                        if (matrix2 == null) {
                            matrix2 = new Matrix();
                            this.F = matrix2;
                        }
                        matrix.invert(matrix2);
                        obtain.transform(this.F);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean v = v(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (v) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && w(childAt) && childAt.getHeight() >= height) {
                    if (q(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.k;
        if (f2 > 0.0f && v) {
            int i4 = this.j;
            Paint paint = this.l;
            paint.setColor((((int) ((i4 >>> 24) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((abx) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (w(childAt) && s(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new abx();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof abx ? new abx((abx) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new abx((ViewGroup.MarginLayoutParams) layoutParams) : new abx(layoutParams);
    }

    public final void h(abw abwVar) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(abwVar);
    }

    public final void i(View view, boolean z) {
        if (!w(view)) {
            throw new IllegalArgumentException(a.ab(view, "View ", " is not a sliding drawer"));
        }
        abx abxVar = (abx) view.getLayoutParams();
        if (this.s) {
            abxVar.b = 0.0f;
            abxVar.d = 0;
        } else if (z) {
            abxVar.d |= 4;
            if (q(view, 3)) {
                this.m.j(view, -view.getWidth(), view.getTop());
            } else {
                this.n.j(view, getWidth(), view.getTop());
            }
        } else {
            float u = u(view);
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (u * width));
            if (!q(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            m(view, 0.0f);
            p(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void j(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            abx abxVar = (abx) childAt.getLayoutParams();
            if (w(childAt) && (!z || abxVar.c)) {
                z2 |= q(childAt, 3) ? this.m.j(childAt, -childAt.getWidth(), childAt.getTop()) : this.n.j(childAt, getWidth(), childAt.getTop());
                abxVar.c = false;
            }
        }
        this.o.n();
        this.p.n();
        if (z2) {
            invalidate();
        }
    }

    public final void k(abw abwVar) {
        List list = this.z;
        if (list == null) {
            return;
        }
        list.remove(abwVar);
    }

    public final void l(int i, int i2) {
        View d;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.v = i;
        } else if (i2 == 5) {
            this.w = i;
        } else if (i2 == 8388611) {
            this.x = i;
        } else if (i2 == 8388613) {
            this.y = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.m : this.n).c();
        }
        if (i != 1) {
            if (i == 2 && (d = d(absoluteGravity)) != null) {
                x(d);
                return;
            }
            return;
        }
        View d2 = d(absoluteGravity);
        if (d2 != null) {
            i(d2, true);
        }
    }

    public final void m(View view, float f2) {
        abx abxVar = (abx) view.getLayoutParams();
        if (f2 == abxVar.b) {
            return;
        }
        abxVar.b = f2;
        List list = this.z;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((abw) this.z.get(size)).c(view, f2);
            }
        }
    }

    public final void n(int i) {
        this.j = i;
        invalidate();
    }

    final void o() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View f2 = f();
            findOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (f2 == null || findOnBackInvokedDispatcher == null || b(f2) != 0 || !isAttachedToWindow()) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.u;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.t);
                    this.u = null;
                    return;
                }
                return;
            }
            if (this.u == null) {
                if (this.t == null) {
                    this.t = new me(new nc(this, 10), 2);
                }
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.t);
                this.u = findOnBackInvokedDispatcher;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        this.o.n();
        this.p.n();
        o();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.d || this.C == null) {
            return;
        }
        zz zzVar = this.c;
        int d = zzVar != null ? zzVar.d() : 0;
        if (d > 0) {
            this.C.setBounds(0, 0, getWidth(), d);
            this.C.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r2 != 3) goto L34;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a2;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        abs absVar = this.n;
        abs absVar2 = this.m;
        int actionMasked = motionEvent.getActionMasked();
        boolean i = absVar.i(motionEvent) | absVar2.i(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float[] fArr4 = absVar2.c;
                    if (fArr4 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= fArr4.length) {
                                break;
                            }
                            if (absVar2.g(i2)) {
                                float[] fArr5 = absVar2.c;
                                if (fArr5 == null || (fArr = absVar2.d) == null || (fArr2 = absVar2.e) == null || (fArr3 = absVar2.f) == null) {
                                    Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
                                } else {
                                    float f2 = fArr2[i2] - fArr5[i2];
                                    float f3 = fArr3[i2] - fArr[i2];
                                    int i3 = absVar2.b;
                                    if ((f2 * f2) + (f3 * f3) > i3 * i3) {
                                        this.o.n();
                                        this.p.n();
                                        break;
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                z = false;
            }
            j(true);
            this.b = false;
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.A = x;
            this.B = y;
            z = this.k > 0.0f && (a2 = absVar2.a((int) x, (int) y)) != null && v(a2);
            this.b = false;
        }
        if (!i && !z) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    if (((abx) getChildAt(i4).getLayoutParams()).c) {
                        break;
                    }
                    i4++;
                } else if (!this.b) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
            i = 4;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View f2 = f();
        if (f2 != null && b(f2) == 0) {
            j(false);
        }
        return f2 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        this.r = true;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                abx abxVar = (abx) childAt.getLayoutParams();
                if (v(childAt)) {
                    childAt.layout(abxVar.leftMargin, abxVar.topMargin, abxVar.leftMargin + childAt.getMeasuredWidth(), abxVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    float f3 = measuredWidth;
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (q(childAt, 3)) {
                        i5 = (-measuredWidth) + ((int) (abxVar.b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        int i7 = (i3 - i) - ((int) (abxVar.b * f3));
                        float f4 = (r7 - i7) / f3;
                        i5 = i7;
                        f2 = f4;
                    }
                    int i8 = measuredWidth + i5;
                    float f5 = abxVar.b;
                    int i9 = abxVar.a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < abxVar.topMargin) {
                            i11 = abxVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - abxVar.bottomMargin) {
                            i11 = (i10 - abxVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, i8, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, abxVar.topMargin, i8, abxVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - abxVar.bottomMargin) - childAt.getMeasuredHeight(), i8, i12 - abxVar.bottomMargin);
                    }
                    if (f2 != f5) {
                        m(childAt, f2);
                    }
                    int i13 = abxVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        if (g) {
            int i14 = yq.a;
            zz a2 = yj.a(this);
            if (a2 != null) {
                abs absVar = this.m;
                vb B = a2.b.B();
                absVar.h = Math.max(absVar.i, B.b);
                abs absVar2 = this.n;
                absVar2.h = Math.max(absVar2.i, B.d);
            }
        }
        this.r = false;
        this.s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int childCount;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 != 1073741824) {
                mode = 1073741824;
            }
            setMeasuredDimension(size, size2);
            int i4 = 0;
            if (this.c != null) {
                int i5 = yq.a;
                if (getFitsSystemWindows()) {
                    z = true;
                    int layoutDirection = getLayoutDirection();
                    childCount = getChildCount();
                    i3 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (i3 < childCount) {
                        View childAt = getChildAt(i3);
                        if (childAt.getVisibility() != 8) {
                            abx abxVar = (abx) childAt.getLayoutParams();
                            if (z) {
                                int absoluteGravity = Gravity.getAbsoluteGravity(abxVar.a, layoutDirection);
                                int i8 = yq.a;
                                boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                                zz zzVar = this.c;
                                if (fitsSystemWindows) {
                                    if (absoluteGravity == 3) {
                                        zzVar = zzVar.p(zzVar.b(), zzVar.d(), i4, zzVar.a());
                                    } else if (absoluteGravity == 5) {
                                        zzVar = zzVar.p(i4, zzVar.d(), zzVar.c(), zzVar.a());
                                    }
                                    yq.q(childAt, zzVar);
                                } else {
                                    if (absoluteGravity == 3) {
                                        zzVar = zzVar.p(zzVar.b(), zzVar.d(), i4, zzVar.a());
                                    } else if (absoluteGravity == 5) {
                                        zzVar = zzVar.p(i4, zzVar.d(), zzVar.c(), zzVar.a());
                                    }
                                    abxVar.leftMargin = zzVar.b();
                                    abxVar.topMargin = zzVar.d();
                                    abxVar.rightMargin = zzVar.c();
                                    abxVar.bottomMargin = zzVar.a();
                                }
                            }
                            if (v(childAt)) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - abxVar.leftMargin) - abxVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - abxVar.topMargin) - abxVar.bottomMargin, 1073741824));
                            } else {
                                if (!w(childAt)) {
                                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                                }
                                int i9 = yq.a;
                                float elevation = childAt.getElevation();
                                float f2 = this.h;
                                if (elevation != f2) {
                                    childAt.setElevation(f2);
                                }
                                int c = c(childAt) & 7;
                                int i10 = c == 3 ? 1 : i4;
                                if (i10 != 0) {
                                    if (i6 != 0) {
                                        throw new IllegalStateException("Child drawer has absolute gravity " + g(c) + " but this DrawerLayout already has a drawer view along that edge");
                                    }
                                    i6 = i4;
                                }
                                if (i10 == 0) {
                                    if (i7 != 0) {
                                        throw new IllegalStateException("Child drawer has absolute gravity " + g(c) + " but this DrawerLayout already has a drawer view along that edge");
                                    }
                                    i7 = i4;
                                }
                                i6 |= i10;
                                childAt.measure(getChildMeasureSpec(i, this.i + abxVar.leftMargin + abxVar.rightMargin, abxVar.width), getChildMeasureSpec(i2, abxVar.topMargin + abxVar.bottomMargin, abxVar.height));
                                i7 |= i10 ^ 1;
                                i3++;
                                i4 = 0;
                            }
                        }
                        i3++;
                        i4 = 0;
                    }
                }
            }
            z = false;
            int layoutDirection2 = getLayoutDirection();
            childCount = getChildCount();
            i3 = 0;
            int i62 = 0;
            int i72 = 0;
            while (i3 < childCount) {
            }
        }
        if (!isInEditMode()) {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        if (mode == 0) {
            size = 300;
        }
        if (mode2 == 0) {
            size2 = 300;
        }
        setMeasuredDimension(size, size2);
        int i42 = 0;
        if (this.c != null) {
        }
        z = false;
        int layoutDirection22 = getLayoutDirection();
        childCount = getChildCount();
        i3 = 0;
        int i622 = 0;
        int i722 = 0;
        while (i3 < childCount) {
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        View d;
        if (!(parcelable instanceof aby)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aby abyVar = (aby) parcelable;
        super.onRestoreInstanceState(abyVar.d);
        int i = abyVar.a;
        if (i != 0 && (d = d(i)) != null) {
            x(d);
        }
        int i2 = abyVar.b;
        if (i2 != 3) {
            l(i2, 3);
        }
        int i3 = abyVar.e;
        if (i3 != 3) {
            l(i3, 5);
        }
        int i4 = abyVar.f;
        if (i4 != 3) {
            l(i4, 8388611);
        }
        int i5 = abyVar.g;
        if (i5 != 3) {
            l(i5, 8388613);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        aby abyVar = new aby(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            abx abxVar = (abx) getChildAt(i).getLayoutParams();
            int i2 = abxVar.d;
            if (i2 == 1 || i2 == 2) {
                abyVar.a = abxVar.a;
                break;
            }
        }
        abyVar.b = this.v;
        abyVar.e = this.w;
        abyVar.f = this.x;
        abyVar.g = this.y;
        return abyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (b(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        abs absVar = this.m;
        absVar.e(motionEvent);
        this.n.e(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.A = x;
            this.B = y;
            this.b = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View a2 = absVar.a((int) x2, (int) y2);
            if (a2 != null && v(a2)) {
                float f2 = x2 - this.A;
                float f3 = y2 - this.B;
                int i = absVar.b;
                if ((f2 * f2) + (f3 * f3) < i * i) {
                    View e2 = e();
                    if (e2 != null) {
                    }
                }
            }
            z = true;
            j(z);
        } else if (action == 3) {
            j(true);
            this.b = false;
        }
        return true;
    }

    public final void p(int i, View view) {
        int i2;
        View rootView;
        abs absVar = this.n;
        int i3 = this.m.a;
        int i4 = absVar.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((abx) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                abx abxVar = (abx) view.getLayoutParams();
                if ((abxVar.d & 1) == 1) {
                    abxVar.d = 0;
                    List list = this.z;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else {
                                ((abw) this.z.get(size)).a(view);
                            }
                        }
                    }
                    z(view, false);
                    y(view);
                    o();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                abx abxVar2 = (abx) view.getLayoutParams();
                if ((abxVar2.d & 1) == 0) {
                    abxVar2.d = 1;
                    List list2 = this.z;
                    if (list2 != null) {
                        int size2 = list2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            } else {
                                ((abw) this.z.get(size2)).b(view);
                            }
                        }
                    }
                    z(view, true);
                    y(view);
                    o();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 == this.q) {
            return;
        }
        this.q = i2;
        List list3 = this.z;
        if (list3 == null) {
            return;
        }
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                ((abw) this.z.get(size3)).f();
            }
        }
    }

    public final boolean q(View view, int i) {
        return (c(view) & i) == i;
    }

    public final boolean r(View view) {
        if (w(view)) {
            return (((abx) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException(a.ab(view, "View ", " is not a drawer"));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            j(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s(View view) {
        if (w(view)) {
            return ((abx) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException(a.ab(view, "View ", " is not a drawer"));
    }

    public final void t() {
        View d = d(8388611);
        if (d == null) {
            throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(g(8388611))));
        }
        i(d, true);
    }

    public final void x(View view) {
        if (!w(view)) {
            throw new IllegalArgumentException(a.ab(view, "View ", " is not a sliding drawer"));
        }
        abx abxVar = (abx) view.getLayoutParams();
        if (this.s) {
            abxVar.b = 1.0f;
            abxVar.d = 1;
            z(view, true);
            y(view);
            o();
        } else {
            abxVar.d |= 2;
            if (q(view, 3)) {
                this.m.j(view, 0, view.getTop());
            } else {
                this.n.j(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new abx(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
