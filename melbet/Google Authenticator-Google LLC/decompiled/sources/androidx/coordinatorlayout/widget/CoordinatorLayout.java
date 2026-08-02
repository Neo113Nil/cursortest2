package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.authenticator2.R;
import defpackage.cfz;
import defpackage.ju;
import defpackage.qy;
import defpackage.tt;
import defpackage.tu;
import defpackage.tv;
import defpackage.tw;
import defpackage.tx;
import defpackage.ty;
import defpackage.tz;
import defpackage.ua;
import defpackage.ub;
import defpackage.uc;
import defpackage.wq;
import defpackage.ws;
import defpackage.xn;
import defpackage.xo;
import defpackage.xp;
import defpackage.xq;
import defpackage.yi;
import defpackage.yq;
import defpackage.zz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements xn, xo {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final wq j;
    public zz e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final cfz h;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private ua u;
    private boolean v;
    private Drawable w;
    private xq x;
    private final xp y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new ju(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new ws(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.k = new ArrayList();
        this.h = new cfz((byte[]) null);
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.y = new xp();
        TypedArray obtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, tt.a, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, tt.a, i2, 0);
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            yq.k(coordinatorLayout, context2, tt.a, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            yq.k(coordinatorLayout, context2, tt.a, attributeSet, obtainStyledAttributes, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r11[i3] * f);
            }
        }
        coordinatorLayout.w = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(new ty(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    private final boolean A(tw twVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? twVar.n(this, view, motionEvent) : twVar.k(this, view, motionEvent);
    }

    private final boolean B(MotionEvent motionEvent, int i2) {
        boolean o;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            tz tzVar = (tz) view.getLayoutParams();
            tw twVar = tzVar.a;
            if (!(z || z2) || actionMasked == 0) {
                if (!z2 && !z && twVar != null && (z = A(twVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            tw twVar2 = ((tz) view2.getLayoutParams()).a;
                            if (twVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = D(motionEvent);
                                }
                                A(twVar2, view2, motionEvent2, i2);
                            }
                        }
                    }
                }
                tw twVar3 = tzVar.a;
                if (twVar3 == null) {
                    tzVar.m = false;
                }
                boolean z3 = tzVar.m;
                if (z3) {
                    o = true;
                } else {
                    o = twVar3 != null ? twVar3.o() : false;
                    tzVar.m = o;
                }
                boolean z4 = o && !z3;
                if (o && !z4) {
                    break;
                }
                z2 = z4;
            } else if (twVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = D(motionEvent);
                }
                A(twVar, view, motionEvent2, i2);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private static final void C(int i2, Rect rect, Rect rect2, tz tzVar, int i3, int i4) {
        int i5 = tzVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(r(tzVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i3 / 2;
        } else if (i6 != 5) {
            width -= i3;
        }
        if (i7 == 16) {
            height -= i4 / 2;
        } else if (i7 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private static final MotionEvent D(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void E(View view, int i2) {
        tz tzVar = (tz) view.getLayoutParams();
        int i3 = tzVar.i;
        if (i3 != i2) {
            int i4 = yq.a;
            view.offsetLeftAndRight(i2 - i3);
            tzVar.i = i2;
        }
    }

    private static final void F(View view, int i2) {
        tz tzVar = (tz) view.getLayoutParams();
        int i3 = tzVar.j;
        if (i3 != i2) {
            int i4 = yq.a;
            view.offsetTopAndBottom(i2 - i3);
            tzVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final tz l(View view) {
        tz tzVar = (tz) view.getLayoutParams();
        if (!tzVar.b) {
            if (view instanceof tv) {
                tw a2 = ((tv) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                tzVar.b(a2);
                tzVar.b = true;
                return tzVar;
            }
            tx txVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                txVar = (tx) cls.getAnnotation(tx.class);
                if (txVar != null) {
                    break;
                }
            }
            if (txVar != null) {
                try {
                    tzVar.b((tw) txVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + txVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            tzVar.b = true;
        }
        return tzVar;
    }

    private final int n() {
        return o() - getHeight();
    }

    private final int o() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            tz tzVar = (tz) childAt.getLayoutParams();
            i2 += childAt.getHeight() + tzVar.topMargin + tzVar.bottomMargin;
        }
        return i2;
    }

    private final int p(int i2) {
        int[] iArr = this.r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int q() {
        return (int) (getHeight() * 0.2f);
    }

    private static int r(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int s(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect u() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void v(tz tzVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + tzVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - tzVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + tzVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - tzVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private static void w(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void x() {
        View view = this.s;
        if (view != null) {
            tw twVar = ((tz) view.getLayoutParams()).a;
            if (twVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                twVar.n(this, this.s, obtain);
                obtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((tz) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void y() {
        int i2 = yq.a;
        if (!getFitsSystemWindows()) {
            yi.c(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new tu(this, 0);
        }
        yi.c(this, this.x);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i2) {
        View view;
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view = null;
                break;
            }
            if (view2.isFocused()) {
                view = view2;
                break;
            }
            view2 = view2 instanceof ViewGroup ? ((ViewGroup) view2).getFocusedChild() : null;
        }
        t(this, view, 2, 1);
        int[] iArr = this.o;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    public final List a(View view) {
        qy qyVar = (qy) this.h.d;
        int i2 = qyVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) qyVar.f(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qyVar.c(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList f = this.h.f(view);
        if (f == null || f.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < f.size(); i2++) {
            View view2 = (View) f.get(i2);
            tw twVar = ((tz) view2.getLayoutParams()).a;
            if (twVar != null) {
                twVar.q(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            uc.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof tz) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.xn
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        tw twVar;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                tz tzVar = (tz) childAt.getLayoutParams();
                if (tzVar.d(i4) && (twVar = tzVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    twVar.u(this, childAt, view, i3, iArr2, i4);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[0]) : Math.min(i5, iArr2[0]);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[1]) : Math.min(i6, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? z(-getHeight()) : z(-q());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? z(getHeight()) : z(q());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? z(-o()) : z(n());
            }
            if (keyCode == 92) {
                return z(-getHeight());
            }
            if (keyCode == 93) {
                return z(getHeight());
            }
            if (keyCode == 122) {
                return z(-o());
            }
            if (keyCode == 123) {
                return z(n());
            }
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        tw twVar = ((tz) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.xn
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.xo
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        tw twVar;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                tz tzVar = (tz) childAt.getLayoutParams();
                if (tzVar.d(i6) && (twVar = tzVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    twVar.v(this, childAt, i3, i4, i5, iArr2);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[0]) : Math.min(i7, iArr2[0]);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[1]) : Math.min(i8, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.xn
    public final void g(View view, View view2, int i2, int i3) {
        this.y.b(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            tz tzVar = (tz) getChildAt(i4).getLayoutParams();
            if (tzVar.d(i3)) {
                tw twVar = tzVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new tz();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tz ? new tz((tz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new tz((ViewGroup.MarginLayoutParams) layoutParams) : new tz(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.xn
    public final void h(View view, int i2) {
        this.y.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            tz tzVar = (tz) childAt.getLayoutParams();
            if (tzVar.d(i2)) {
                tw twVar = tzVar.a;
                if (twVar != null) {
                    twVar.j(this, childAt, view, i2);
                }
                tzVar.c(i2, false);
                tzVar.a();
            }
        }
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        CoordinatorLayout coordinatorLayout;
        boolean z3;
        boolean z4;
        int width;
        int i5;
        int height;
        int i6;
        tz tzVar;
        int i7;
        int i8;
        tw twVar;
        CoordinatorLayout coordinatorLayout2 = this;
        int layoutDirection = coordinatorLayout2.getLayoutDirection();
        List list = coordinatorLayout2.k;
        int size = list.size();
        Rect u = u();
        Rect u2 = u();
        Rect u3 = u();
        int i9 = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            tz tzVar2 = (tz) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                coordinatorLayout = coordinatorLayout2;
                i3 = i9;
            } else {
                int i10 = 0;
                while (i10 < i9) {
                    if (tzVar2.l == ((View) list.get(i10))) {
                        tz tzVar3 = (tz) view.getLayoutParams();
                        if (tzVar3.k != null) {
                            tz tzVar4 = tzVar2;
                            Rect u4 = u();
                            Rect u5 = u();
                            i7 = i10;
                            Rect u6 = u();
                            uc.a(coordinatorLayout2, tzVar3.k, u4);
                            coordinatorLayout2.c(view, false, u5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i8 = i9;
                            tzVar = tzVar4;
                            C(layoutDirection, u4, u6, tzVar3, measuredWidth, measuredHeight);
                            boolean z5 = (u6.left == u5.left && u6.top == u5.top) ? false : true;
                            coordinatorLayout2.v(tzVar3, u6, measuredWidth, measuredHeight);
                            int i11 = u6.left - u5.left;
                            int i12 = u6.top - u5.top;
                            if (i11 != 0) {
                                int i13 = yq.a;
                                view.offsetLeftAndRight(i11);
                            }
                            if (i12 != 0) {
                                int i14 = yq.a;
                                view.offsetTopAndBottom(i12);
                            }
                            if (z5 && (twVar = tzVar3.a) != null) {
                                twVar.q(coordinatorLayout2, view, tzVar3.k);
                            }
                            w(u4);
                            w(u5);
                            w(u6);
                            i10 = i7 + 1;
                            i9 = i8;
                            tzVar2 = tzVar;
                        }
                    }
                    tzVar = tzVar2;
                    i7 = i10;
                    i8 = i9;
                    i10 = i7 + 1;
                    i9 = i8;
                    tzVar2 = tzVar;
                }
                tz tzVar5 = tzVar2;
                i3 = i9;
                coordinatorLayout2.c(view, true, u2);
                if (tzVar5.g != 0 && !u2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(tzVar5.g, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        u.top = Math.max(u.top, u2.bottom);
                    } else if (i15 == 80) {
                        u.bottom = Math.max(u.bottom, coordinatorLayout2.getHeight() - u2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        u.left = Math.max(u.left, u2.right);
                    } else if (i16 == 5) {
                        u.right = Math.max(u.right, coordinatorLayout2.getWidth() - u2.left);
                    }
                }
                if (tzVar5.h != 0 && view.getVisibility() == 0 && view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                    tz tzVar6 = (tz) view.getLayoutParams();
                    tw twVar2 = tzVar6.a;
                    Rect u7 = u();
                    Rect u8 = u();
                    u8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (twVar2 == null || !twVar2.z(view, u7)) {
                        u7.set(u8);
                    } else if (!u8.contains(u7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + u7.toShortString() + " | Bounds:" + u8.toShortString());
                    }
                    w(u8);
                    if (u7.isEmpty()) {
                        w(u7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(tzVar6.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i6 = (u7.top - tzVar6.topMargin) - tzVar6.j) >= u.top) {
                            z3 = false;
                        } else {
                            F(view, u.top - i6);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - u7.bottom) - tzVar6.bottomMargin) + tzVar6.j) < u.bottom) {
                            F(view, height - u.bottom);
                        } else if (!z3) {
                            F(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i5 = (u7.left - tzVar6.leftMargin) - tzVar6.i) >= u.left) {
                            z4 = false;
                        } else {
                            E(view, u.left - i5);
                            z4 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - u7.right) - tzVar6.rightMargin) + tzVar6.i) < u.right) {
                            E(view, width - u.right);
                        } else if (!z4) {
                            z = false;
                            E(view, 0);
                            w(u7);
                            if (i2 != 2) {
                                u3.set(((tz) view.getLayoutParams()).p);
                                if (!u3.equals(u2)) {
                                    ((tz) view.getLayoutParams()).p.set(u2);
                                }
                                coordinatorLayout = this;
                            }
                            for (i4 = i3 + 1; i4 < size; i4++) {
                                View view2 = (View) list.get(i4);
                                tz tzVar7 = (tz) view2.getLayoutParams();
                                tw twVar3 = tzVar7.a;
                                if (twVar3 != null && twVar3.p(view2, view)) {
                                    if (i2 == 0 && tzVar7.o) {
                                        tzVar7.a();
                                    } else {
                                        if (i2 != 2) {
                                            twVar3.q(this, view2, view);
                                            z2 = z;
                                        } else {
                                            twVar3.r(this, view);
                                            z2 = true;
                                        }
                                        if (i2 == 1) {
                                            tzVar7.o = z2;
                                        }
                                    }
                                }
                            }
                            coordinatorLayout = this;
                        }
                        z = false;
                        w(u7);
                        if (i2 != 2) {
                        }
                        while (i4 < size) {
                        }
                        coordinatorLayout = this;
                    }
                }
                z = false;
                if (i2 != 2) {
                }
                while (i4 < size) {
                }
                coordinatorLayout = this;
            }
            i9 = i3 + 1;
            coordinatorLayout2 = coordinatorLayout;
        }
        w(u);
        w(u2);
        w(u3);
    }

    public final void j(View view, int i2) {
        Rect u;
        Rect u2;
        tz tzVar = (tz) view.getLayoutParams();
        View view2 = tzVar.k;
        if (view2 == null && tzVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            u = u();
            u2 = u();
            try {
                uc.a(this, view2, u);
                tz tzVar2 = (tz) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i2, u, u2, tzVar2, measuredWidth, measuredHeight);
                v(tzVar2, u2, measuredWidth, measuredHeight);
                view.layout(u2.left, u2.top, u2.right, u2.bottom);
                return;
            } finally {
                w(u);
                w(u2);
            }
        }
        int i3 = tzVar.e;
        if (i3 < 0) {
            tz tzVar3 = (tz) view.getLayoutParams();
            u = u();
            u.set(getPaddingLeft() + tzVar3.leftMargin, getPaddingTop() + tzVar3.topMargin, (getWidth() - getPaddingRight()) - tzVar3.rightMargin, (getHeight() - getPaddingBottom()) - tzVar3.bottomMargin);
            if (this.e != null) {
                int i4 = yq.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    u.left += this.e.b();
                    u.top += this.e.d();
                    u.right -= this.e.c();
                    u.bottom -= this.e.a();
                }
            }
            u2 = u();
            Gravity.apply(r(tzVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), u, u2, i2);
            view.layout(u2.left, u2.top, u2.right, u2.bottom);
            return;
        }
        tz tzVar4 = (tz) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(s(tzVar4.c), i2);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int p = p(i3) - measuredWidth2;
        if (i5 == 1) {
            p += measuredWidth2 / 2;
        } else if (i5 == 5) {
            p += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + tzVar4.leftMargin, Math.min(p, ((width - getPaddingRight()) - measuredWidth2) - tzVar4.rightMargin));
        int max2 = Math.max(getPaddingTop() + tzVar4.topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - tzVar4.bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect u = u();
        uc.a(this, view, u);
        try {
            return u.contains(i2, i3);
        } finally {
            w(u);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.v) {
            if (this.u == null) {
                this.u = new ua(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.e == null) {
            int i2 = yq.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        View view = this.t;
        if (view != null) {
            h(view, 0);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.w == null) {
            return;
        }
        zz zzVar = this.e;
        int d2 = zzVar != null ? zzVar.d() : 0;
        if (d2 > 0) {
            this.w.setBounds(0, 0, getWidth(), d2);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
            actionMasked = 0;
        }
        boolean B = B(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return B;
        }
        this.s = null;
        x();
        return B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        tw twVar;
        int layoutDirection = getLayoutDirection();
        List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((twVar = ((tz) view.getLayoutParams()).a) == null || !twVar.l(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fe  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, wq] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i2, int i3) {
        boolean z;
        boolean z2;
        int size;
        int i4;
        int i5;
        int i6;
        List list;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        tw twVar;
        int i13;
        View view;
        int i14;
        int i15;
        int i16;
        boolean z4;
        View childAt;
        int layoutDirection;
        int absoluteGravity;
        tw twVar2;
        CoordinatorLayout coordinatorLayout = this;
        List list2 = coordinatorLayout.k;
        list2.clear();
        cfz cfzVar = coordinatorLayout.h;
        qy qyVar = (qy) cfzVar.d;
        int i17 = qyVar.d;
        for (int i18 = 0; i18 < i17; i18++) {
            ArrayList arrayList = (ArrayList) qyVar.f(i18);
            if (arrayList != null) {
                arrayList.clear();
                cfzVar.b.b(arrayList);
            }
        }
        qyVar.clear();
        int childCount = coordinatorLayout.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = coordinatorLayout.getChildAt(i19);
            tz l = l(childAt2);
            if (l.f == -1) {
                l.l = null;
                l.k = null;
            } else {
                View view2 = l.k;
                if (view2 != null && view2.getId() == l.f) {
                    View view3 = l.k;
                    for (ViewParent parent = view3.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            l.l = null;
                            l.k = null;
                        } else {
                            if (parent instanceof View) {
                                view3 = parent;
                            }
                        }
                    }
                    l.l = view3;
                    View view4 = l.k;
                }
                l.k = coordinatorLayout.findViewById(l.f);
                View view5 = l.k;
                if (view5 == null) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(l.f) + " to anchor view " + childAt2);
                    }
                    l.l = null;
                    l.k = null;
                } else if (view5 != coordinatorLayout) {
                    for (ViewParent parent2 = view5.getParent(); parent2 != coordinatorLayout && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt2) {
                            if (parent2 instanceof View) {
                                view5 = parent2;
                            }
                        } else {
                            if (!coordinatorLayout.isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            l.l = null;
                            l.k = null;
                        }
                    }
                    l.l = view5;
                } else {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    l.l = null;
                    l.k = null;
                }
                View view42 = l.k;
            }
            cfzVar.g(childAt2);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (i20 != i19 && ((childAt = coordinatorLayout.getChildAt(i20)) == l.l || (((absoluteGravity = Gravity.getAbsoluteGravity(((tz) childAt.getLayoutParams()).g, (layoutDirection = coordinatorLayout.getLayoutDirection()))) != 0 && (Gravity.getAbsoluteGravity(l.h, layoutDirection) & absoluteGravity) == absoluteGravity) || ((twVar2 = l.a) != null && twVar2.p(childAt2, childAt))))) {
                    if (!qyVar.containsKey(childAt)) {
                        cfzVar.g(childAt);
                    }
                    if (!qyVar.containsKey(childAt) || !qyVar.containsKey(childAt2)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList2 = (ArrayList) qyVar.get(childAt);
                    if (arrayList2 == null) {
                        arrayList2 = (ArrayList) cfzVar.b.a();
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        qyVar.put(childAt, arrayList2);
                    }
                    arrayList2.add(childAt2);
                }
            }
        }
        Object obj = cfzVar.c;
        ArrayList arrayList3 = (ArrayList) obj;
        arrayList3.clear();
        HashSet hashSet = (HashSet) cfzVar.a;
        hashSet.clear();
        int i21 = qyVar.d;
        for (int i22 = 0; i22 < i21; i22++) {
            cfzVar.h(qyVar.c(i22), arrayList3, hashSet);
        }
        list2.addAll(obj);
        Collections.reverse(list2);
        int childCount2 = coordinatorLayout.getChildCount();
        int i23 = 0;
        loop6: while (true) {
            if (i23 >= childCount2) {
                z = false;
                break;
            }
            View childAt3 = coordinatorLayout.getChildAt(i23);
            int i24 = qyVar.d;
            for (int i25 = 0; i25 < i24; i25++) {
                ArrayList arrayList4 = (ArrayList) qyVar.f(i25);
                if (arrayList4 != null && arrayList4.contains(childAt3)) {
                    z = true;
                    break loop6;
                }
            }
            i23++;
        }
        if (z != coordinatorLayout.v) {
            boolean z5 = coordinatorLayout.q;
            if (z) {
                if (z5) {
                    if (coordinatorLayout.u == null) {
                        coordinatorLayout.u = new ua(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.u);
                }
                coordinatorLayout.v = true;
            } else {
                if (z5 && coordinatorLayout.u != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.u);
                }
                coordinatorLayout.v = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection2 = coordinatorLayout.getLayoutDirection();
        boolean z6 = layoutDirection2 == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.e != null) {
            int i28 = yq.a;
            if (coordinatorLayout.getFitsSystemWindows()) {
                z2 = true;
                size = list2.size();
                i4 = 0;
                int i29 = 0;
                while (i4 < size) {
                    View view6 = (View) list2.get(i4);
                    if (view6.getVisibility() != 8) {
                        tz tzVar = (tz) view6.getLayoutParams();
                        int i30 = tzVar.e;
                        if (i30 < 0 || mode == 0) {
                            i8 = suggestedMinimumWidth;
                            i9 = suggestedMinimumHeight;
                        } else {
                            int p = coordinatorLayout.p(i30);
                            i8 = suggestedMinimumWidth;
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(s(tzVar.c), layoutDirection2) & 7;
                            i9 = suggestedMinimumHeight;
                            if (absoluteGravity2 == 3) {
                                if (z6) {
                                    absoluteGravity2 = 3;
                                    z4 = true;
                                }
                                i10 = Math.max(0, (size2 - paddingRight) - p);
                                if (z2) {
                                    int i31 = yq.a;
                                    if (!view6.getFitsSystemWindows()) {
                                        int b2 = coordinatorLayout.e.b() + coordinatorLayout.e.c();
                                        int d2 = coordinatorLayout.e.d() + coordinatorLayout.e.a();
                                        i11 = View.MeasureSpec.makeMeasureSpec(size2 - b2, mode);
                                        i12 = View.MeasureSpec.makeMeasureSpec(size3 - d2, mode2);
                                        twVar = tzVar.a;
                                        int i32 = i8;
                                        list = list2;
                                        int i33 = i9;
                                        i7 = paddingLeft;
                                        if (twVar != null) {
                                            z3 = false;
                                            i6 = i4;
                                            int i34 = i10;
                                            i5 = size;
                                            int i35 = i11;
                                            i16 = i29;
                                            int i36 = i12;
                                            boolean s = twVar.s(this, view6, i35, i34, i36);
                                            view = view6;
                                            i15 = i35;
                                            i14 = i34;
                                            i13 = i36;
                                            if (s) {
                                                coordinatorLayout = this;
                                                int max = Math.max(i32, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                                                int max2 = Math.max(i33, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                                                i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                                                suggestedMinimumWidth = max;
                                                suggestedMinimumHeight = max2;
                                            }
                                        } else {
                                            i6 = i4;
                                            z3 = false;
                                            i13 = i12;
                                            view = view6;
                                            i5 = size;
                                            i14 = i10;
                                            i15 = i11;
                                            i16 = i29;
                                        }
                                        coordinatorLayout = this;
                                        coordinatorLayout.measureChildWithMargins(view, i15, i14, i13, 0);
                                        int max3 = Math.max(i32, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                                        int max22 = Math.max(i33, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                                        i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                                        suggestedMinimumWidth = max3;
                                        suggestedMinimumHeight = max22;
                                    }
                                }
                                i11 = i2;
                                i12 = i3;
                                twVar = tzVar.a;
                                int i322 = i8;
                                list = list2;
                                int i332 = i9;
                                i7 = paddingLeft;
                                if (twVar != null) {
                                }
                                coordinatorLayout = this;
                                coordinatorLayout.measureChildWithMargins(view, i15, i14, i13, 0);
                                int max32 = Math.max(i322, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                                int max222 = Math.max(i332, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                                i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                                suggestedMinimumWidth = max32;
                                suggestedMinimumHeight = max222;
                            } else {
                                z4 = z6;
                            }
                            if (absoluteGravity2 == 5) {
                                if (!z4) {
                                    absoluteGravity2 = 5;
                                    z4 = false;
                                }
                                i10 = Math.max(0, (size2 - paddingRight) - p);
                                if (z2) {
                                }
                                i11 = i2;
                                i12 = i3;
                                twVar = tzVar.a;
                                int i3222 = i8;
                                list = list2;
                                int i3322 = i9;
                                i7 = paddingLeft;
                                if (twVar != null) {
                                }
                                coordinatorLayout = this;
                                coordinatorLayout.measureChildWithMargins(view, i15, i14, i13, 0);
                                int max322 = Math.max(i3222, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                                int max2222 = Math.max(i3322, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                                i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                                suggestedMinimumWidth = max322;
                                suggestedMinimumHeight = max2222;
                            }
                            if ((absoluteGravity2 == 5 && !z4) || (absoluteGravity2 == 3 && z4)) {
                                i10 = Math.max(0, p - paddingLeft);
                                if (z2) {
                                }
                                i11 = i2;
                                i12 = i3;
                                twVar = tzVar.a;
                                int i32222 = i8;
                                list = list2;
                                int i33222 = i9;
                                i7 = paddingLeft;
                                if (twVar != null) {
                                }
                                coordinatorLayout = this;
                                coordinatorLayout.measureChildWithMargins(view, i15, i14, i13, 0);
                                int max3222 = Math.max(i32222, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                                int max22222 = Math.max(i33222, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                                i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                                suggestedMinimumWidth = max3222;
                                suggestedMinimumHeight = max22222;
                            }
                        }
                        i10 = 0;
                        if (z2) {
                        }
                        i11 = i2;
                        i12 = i3;
                        twVar = tzVar.a;
                        int i322222 = i8;
                        list = list2;
                        int i332222 = i9;
                        i7 = paddingLeft;
                        if (twVar != null) {
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, i15, i14, i13, 0);
                        int max32222 = Math.max(i322222, i26 + view.getMeasuredWidth() + tzVar.leftMargin + tzVar.rightMargin);
                        int max222222 = Math.max(i332222, i27 + view.getMeasuredHeight() + tzVar.topMargin + tzVar.bottomMargin);
                        i29 = View.combineMeasuredStates(i16, view.getMeasuredState());
                        suggestedMinimumWidth = max32222;
                        suggestedMinimumHeight = max222222;
                    } else {
                        i5 = size;
                        i6 = i4;
                        list = list2;
                        i7 = paddingLeft;
                        z3 = false;
                    }
                    i4 = i6 + 1;
                    size = i5;
                    list2 = list;
                    paddingLeft = i7;
                }
                int i37 = i29;
                coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & i37), View.resolveSizeAndState(suggestedMinimumHeight, i3, i37 << 16));
            }
        }
        z2 = false;
        size = list2.size();
        i4 = 0;
        int i292 = 0;
        while (i4 < size) {
        }
        int i372 = i292;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & i372), View.resolveSizeAndState(suggestedMinimumHeight, i3, i372 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                tz tzVar = (tz) childAt.getLayoutParams();
                if (tzVar.n) {
                    tw twVar = tzVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        tw twVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                tz tzVar = (tz) childAt.getLayoutParams();
                if (tzVar.n && (twVar = tzVar.a) != null) {
                    z |= twVar.t(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof ub)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ub ubVar = (ub) parcelable;
        super.onRestoreInstanceState(ubVar.d);
        SparseArray sparseArray = ubVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            tw twVar = l(childAt).a;
            if (id != -1 && twVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                twVar.w(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable x;
        ub ubVar = new ub(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            tw twVar = ((tz) childAt.getLayoutParams()).a;
            if (id != -1 && twVar != null && (x = twVar.x(childAt)) != null) {
                sparseArray.append(id, x);
            }
        }
        ubVar.a = sparseArray;
        return ubVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean B;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            tw twVar = ((tz) view.getLayoutParams()).a;
            B = twVar != null ? twVar.n(this, this.s, motionEvent) : false;
        } else {
            B = B(motionEvent, 1);
            if (actionMasked != 0 && B) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            B |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent D = D(motionEvent);
            super.onTouchEvent(D);
            D.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return B;
        }
        this.s = null;
        x();
        return B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        tw twVar = ((tz) view.getLayoutParams()).a;
        if (twVar == null || !twVar.m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                tw twVar = ((tz) childAt.getLayoutParams()).a;
                if (twVar != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    twVar.k(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        x();
        this.p = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.xn
    public final boolean t(View view, View view2, int i2, int i3) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        boolean z = false;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                tz tzVar = (tz) childAt.getLayoutParams();
                tw twVar = tzVar.a;
                if (twVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    boolean y = twVar.y(coordinatorLayout, childAt, view3, i4, i5);
                    z |= y;
                    tzVar.c(i5, y);
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    tzVar.c(i5, false);
                }
            } else {
                coordinatorLayout = this;
                view3 = view;
                i4 = i2;
                i5 = i3;
            }
            i6++;
            this = coordinatorLayout;
            view = view3;
            i2 = i4;
            i3 = i5;
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new tz(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
