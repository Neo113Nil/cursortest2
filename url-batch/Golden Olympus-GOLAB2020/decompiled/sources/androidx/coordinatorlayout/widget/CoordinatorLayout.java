package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1317t;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.J;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.ironsource.InterfaceC1490j3;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import v.AbstractC3460a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements G, H {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final A.e sRectPool;
    private J mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.b mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final I mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    class a implements J {
        a() {
        }

        @Override // androidx.core.view.J
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return getScrimOpacity(coordinatorLayout, view) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5, boolean z4) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
            if (i6 == 0) {
                onNestedPreScroll(coordinatorLayout, view, view2, i4, i5, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8) {
            if (i8 == 0) {
                onNestedScroll(coordinatorLayout, view, view2, i4, i5, i6, i7);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i4);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                return onStartNestedScroll(coordinatorLayout, view, view2, view3, i4);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            if (i4 == 0) {
                onStopNestedScroll(coordinatorLayout, view, view2);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            onNestedScroll(coordinatorLayout, view, view2, i4, i5, i6, i7, i8);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class h implements Comparator {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float N3 = AbstractC1281a0.N(view);
            float N4 = AbstractC1281a0.N(view2);
            if (N3 > N4) {
                return -1;
            }
            return N3 < N4 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new h();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new A.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3460a.f46413a);
    }

    private static Rect a() {
        Rect rect = (Rect) sRectPool.b();
        return rect == null ? new Rect() : rect;
    }

    private static int b(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    private void c(f fVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    private WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat) {
        c e4;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (AbstractC1281a0.z(childAt) && (e4 = ((f) childAt.getLayoutParams()).e()) != null) {
                windowInsetsCompat = e4.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void e(View view, int i4, Rect rect, Rect rect2, f fVar, int i5, int i6) {
        int b4 = AbstractC1317t.b(q(fVar.f11555c), i4);
        int b5 = AbstractC1317t.b(r(fVar.f11556d), i4);
        int i7 = b4 & 7;
        int i8 = b4 & InterfaceC1490j3.d.b.f16818j;
        int i9 = b5 & 7;
        int i10 = b5 & InterfaceC1490j3.d.b.f16818j;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i5 / 2;
        } else if (i7 != 5) {
            width -= i5;
        }
        if (i8 == 16) {
            height -= i6 / 2;
        } else if (i8 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    private int f(int i4) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    private void g(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean h(View view) {
        return this.mChildDag.j(view);
    }

    private void i(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        Rect a4 = a();
        a4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null && AbstractC1281a0.z(this) && !AbstractC1281a0.z(view)) {
            a4.left += this.mLastInsets.getSystemWindowInsetLeft();
            a4.top += this.mLastInsets.getSystemWindowInsetTop();
            a4.right -= this.mLastInsets.getSystemWindowInsetRight();
            a4.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        Rect a5 = a();
        AbstractC1317t.a(r(fVar.f11555c), view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i4);
        view.layout(a5.left, a5.top, a5.right, a5.bottom);
        o(a4);
        o(a5);
    }

    private void j(View view, View view2, int i4) {
        Rect a4 = a();
        Rect a5 = a();
        try {
            getDescendantRect(view2, a4);
            getDesiredAnchoredChildRect(view, i4, a4, a5);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
        } finally {
            o(a4);
            o(a5);
        }
    }

    private void k(View view, int i4, int i5) {
        f fVar = (f) view.getLayoutParams();
        int b4 = AbstractC1317t.b(s(fVar.f11555c), i5);
        int i6 = b4 & 7;
        int i7 = b4 & InterfaceC1490j3.d.b.f16818j;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int f4 = f(i4) - measuredWidth;
        if (i6 == 1) {
            f4 += measuredWidth / 2;
        } else if (i6 == 5) {
            f4 += measuredWidth;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(f4, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void l(View view, Rect rect, int i4) {
        boolean z4;
        boolean z5;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (AbstractC1281a0.T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c e4 = fVar.e();
            Rect a4 = a();
            Rect a5 = a();
            a5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e4 == null || !e4.getInsetDodgeRect(this, view, a4)) {
                a4.set(a5);
            } else if (!a5.contains(a4)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a4.toShortString() + " | Bounds:" + a5.toShortString());
            }
            o(a5);
            if (a4.isEmpty()) {
                o(a4);
                return;
            }
            int b4 = AbstractC1317t.b(fVar.f11560h, i4);
            boolean z6 = true;
            if ((b4 & 48) != 48 || (i9 = (a4.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f11562j) >= (i10 = rect.top)) {
                z4 = false;
            } else {
                u(view, i10 - i9);
                z4 = true;
            }
            if ((b4 & 80) == 80 && (height = ((getHeight() - a4.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f11562j) < (i8 = rect.bottom)) {
                u(view, height - i8);
                z4 = true;
            }
            if (!z4) {
                u(view, 0);
            }
            if ((b4 & 3) != 3 || (i6 = (a4.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f11561i) >= (i7 = rect.left)) {
                z5 = false;
            } else {
                t(view, i7 - i6);
                z5 = true;
            }
            if ((b4 & 5) != 5 || (width = ((getWidth() - a4.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f11561i) >= (i5 = rect.right)) {
                z6 = z5;
            } else {
                t(view, width - i5);
            }
            if (!z6) {
                t(view, 0);
            }
            o(a4);
        }
    }

    private boolean m(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        g(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            f fVar = (f) view.getLayoutParams();
            c e4 = fVar.e();
            if (!(z4 || z5) || actionMasked == 0) {
                if (!z4 && e4 != null) {
                    if (i4 == 0) {
                        z4 = e4.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i4 == 1) {
                        z4 = e4.onTouchEvent(this, view, motionEvent);
                    }
                    if (z4) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean c4 = fVar.c();
                boolean h4 = fVar.h(this, view);
                z5 = h4 && !c4;
                if (h4 && !z5) {
                    break;
                }
            } else if (e4 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i4 == 0) {
                    e4.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i4 == 1) {
                    e4.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z4;
    }

    private void n() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.d(this, childAt);
            this.mChildDag.b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (resolvedLayoutParams.b(this, childAt, childAt2)) {
                        if (!this.mChildDag.d(childAt2)) {
                            this.mChildDag.b(childAt2);
                        }
                        this.mChildDag.a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void o(Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void p(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            c e4 = ((f) childAt.getLayoutParams()).e();
            if (e4 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    e4.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    e4.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((f) getChildAt(i5).getLayoutParams()).l();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + JwtParser.SEPARATOR_CHAR + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e4) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e4);
        }
    }

    private static int q(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    private static int r(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= 8388611;
        }
        return (i4 & InterfaceC1490j3.d.b.f16818j) == 0 ? i4 | 48 : i4;
    }

    private static int s(int i4) {
        if (i4 == 0) {
            return 8388661;
        }
        return i4;
    }

    private void t(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.f11561i;
        if (i5 != i4) {
            AbstractC1281a0.Y(view, i4 - i5);
            fVar.f11561i = i4;
        }
    }

    private void u(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.f11562j;
        if (i5 != i4) {
            AbstractC1281a0.Z(view, i4 - i5);
            fVar.f11562j = i4;
        }
    }

    private void v() {
        if (!AbstractC1281a0.z(this)) {
            AbstractC1281a0.E0(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        AbstractC1281a0.E0(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List g4 = this.mChildDag.g(view);
        if (g4 == null || g4.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < g4.size(); i4++) {
            View view2 = (View) g4.get(i4);
            c e4 = ((f) view2.getLayoutParams()).e();
            if (e4 != null) {
                e4.onDependentViewChanged(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f11553a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f11553a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(b(Math.round(scrimOpacity * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j4);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (h(getChildAt(i4))) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (z4 != this.mNeedsPreDrawListener) {
            if (z4) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    void getChildRect(View view, boolean z4, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        List h4 = this.mChildDag.h(view);
        this.mTempDependenciesList.clear();
        if (h4 != null) {
            this.mTempDependenciesList.addAll(h4);
        }
        return this.mTempDependenciesList;
    }

    final List<View> getDependencySortedChildren() {
        n();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        List g4 = this.mChildDag.g(view);
        this.mTempDependenciesList.clear();
        if (g4 != null) {
            this.mTempDependenciesList.addAll(g4);
        }
        return this.mTempDependenciesList;
    }

    void getDescendantRect(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i4, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        e(view, i4, rect, rect2, fVar, measuredWidth, measuredHeight);
        c(fVar, rect2, measuredWidth, measuredHeight);
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f11554b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f11554b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            fVar.f11554b = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(View view, int i4, int i5) {
        Rect a4 = a();
        getDescendantRect(view, a4);
        try {
            return a4.contains(i4, i5);
        } finally {
            o(a4);
        }
    }

    void offsetChildToAnchor(View view, int i4) {
        c e4;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f11563k != null) {
            Rect a4 = a();
            Rect a5 = a();
            Rect a6 = a();
            getDescendantRect(fVar.f11563k, a4);
            getChildRect(view, false, a5);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            e(view, i4, a4, a6, fVar, measuredWidth, measuredHeight);
            boolean z4 = (a6.left == a5.left && a6.top == a5.top) ? false : true;
            c(fVar, a6, measuredWidth, measuredHeight);
            int i5 = a6.left - a5.left;
            int i6 = a6.top - a5.top;
            if (i5 != 0) {
                AbstractC1281a0.Y(view, i5);
            }
            if (i6 != 0) {
                AbstractC1281a0.Z(view, i6);
            }
            if (z4 && (e4 = fVar.e()) != null) {
                e4.onDependentViewChanged(this, view, fVar.f11563k);
            }
            o(a4);
            o(a5);
            o(a6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && AbstractC1281a0.z(this)) {
            AbstractC1281a0.l0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    final void onChildViewsChanged(int i4) {
        boolean z4;
        int C4 = AbstractC1281a0.C(this);
        int size = this.mDependencySortedChildren.size();
        Rect a4 = a();
        Rect a5 = a();
        Rect a6 = a();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            f fVar = (f) view.getLayoutParams();
            if (i4 != 0 || view.getVisibility() != 8) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (fVar.f11564l == this.mDependencySortedChildren.get(i6)) {
                        offsetChildToAnchor(view, C4);
                    }
                }
                getChildRect(view, true, a5);
                if (fVar.f11559g != 0 && !a5.isEmpty()) {
                    int b4 = AbstractC1317t.b(fVar.f11559g, C4);
                    int i7 = b4 & InterfaceC1490j3.d.b.f16818j;
                    if (i7 == 48) {
                        a4.top = Math.max(a4.top, a5.bottom);
                    } else if (i7 == 80) {
                        a4.bottom = Math.max(a4.bottom, getHeight() - a5.top);
                    }
                    int i8 = b4 & 7;
                    if (i8 == 3) {
                        a4.left = Math.max(a4.left, a5.right);
                    } else if (i8 == 5) {
                        a4.right = Math.max(a4.right, getWidth() - a5.left);
                    }
                }
                if (fVar.f11560h != 0 && view.getVisibility() == 0) {
                    l(view, a4, C4);
                }
                if (i4 != 2) {
                    getLastChildRect(view, a6);
                    if (!a6.equals(a5)) {
                        recordLastChildRect(view, a5);
                    }
                }
                for (int i9 = i5 + 1; i9 < size; i9++) {
                    View view2 = this.mDependencySortedChildren.get(i9);
                    f fVar2 = (f) view2.getLayoutParams();
                    c e4 = fVar2.e();
                    if (e4 != null && e4.layoutDependsOn(this, view2, view)) {
                        if (i4 == 0 && fVar2.f()) {
                            fVar2.j();
                        } else {
                            if (i4 != 2) {
                                z4 = e4.onDependentViewChanged(this, view2, view);
                            } else {
                                e4.onDependentViewRemoved(this, view2, view);
                                z4 = true;
                            }
                            if (i4 == 1) {
                                fVar2.o(z4);
                            }
                        }
                    }
                }
            }
        }
        o(a4);
        o(a5);
        o(a6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p(true);
        }
        boolean m4 = m(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return m4;
        }
        p(true);
        return m4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        c e4;
        int C4 = AbstractC1281a0.C(this);
        int size = this.mDependencySortedChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.mDependencySortedChildren.get(i8);
            if (view.getVisibility() != 8 && ((e4 = ((f) view.getLayoutParams()).e()) == null || !e4.onLayoutChild(this, view, C4))) {
                onLayoutChild(view, C4);
            }
        }
    }

    public void onLayoutChild(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f11563k;
        if (view2 != null) {
            j(view, view2, i4);
            return;
        }
        int i5 = fVar.f11557e;
        if (i5 >= 0) {
            k(view, i5, i4);
        } else {
            i(view, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        c e4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        int i20;
        int i21;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.n();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int C4 = AbstractC1281a0.C(coordinatorLayout);
        boolean z4 = C4 == 1;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.mLastInsets != null && AbstractC1281a0.z(coordinatorLayout);
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i24 = 0;
        int i25 = 0;
        while (i24 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i24);
            int i26 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i14 = size3;
                i9 = i24;
                i20 = paddingRight;
                i16 = C4;
                suggestedMinimumWidth = i26;
                i12 = paddingLeft;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i27 = fVar.f11557e;
                if (i27 < 0 || mode == 0) {
                    i6 = suggestedMinimumHeight;
                } else {
                    int f4 = coordinatorLayout.f(i27);
                    int b4 = AbstractC1317t.b(s(fVar.f11555c), C4) & 7;
                    i6 = suggestedMinimumHeight;
                    if ((b4 == 3 && !z4) || (b4 == 5 && z4)) {
                        max = Math.max(0, (size - paddingRight) - f4);
                    } else if ((b4 == 5 && !z4) || (b4 == 3 && z4)) {
                        max = Math.max(0, f4 - paddingLeft);
                    }
                    int i28 = i24;
                    i8 = max;
                    i7 = i28;
                    if (z5 || AbstractC1281a0.z(view2)) {
                        i9 = i7;
                        i10 = i4;
                        i11 = i5;
                    } else {
                        i9 = i7;
                        int systemWindowInsetLeft = coordinatorLayout.mLastInsets.getSystemWindowInsetLeft() + coordinatorLayout.mLastInsets.getSystemWindowInsetRight();
                        int systemWindowInsetTop = coordinatorLayout.mLastInsets.getSystemWindowInsetTop() + coordinatorLayout.mLastInsets.getSystemWindowInsetBottom();
                        i10 = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                        i11 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                    }
                    e4 = fVar.e();
                    if (e4 == null) {
                        i14 = size3;
                        int i29 = i10;
                        view = view2;
                        i12 = paddingLeft;
                        i13 = i26;
                        i16 = C4;
                        i17 = i6;
                        i20 = paddingRight;
                        i21 = i25;
                        int i30 = i11;
                        boolean onMeasureChild = e4.onMeasureChild(this, view, i29, i8, i30, 0);
                        i19 = i29;
                        i15 = i8;
                        i18 = i30;
                        if (onMeasureChild) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i13, i22 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max2 = Math.max(i17, i23 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i25 = View.combineMeasuredStates(i21, view.getMeasuredState());
                            suggestedMinimumHeight = max2;
                        }
                    } else {
                        i12 = paddingLeft;
                        i13 = i26;
                        i14 = size3;
                        i15 = i8;
                        i16 = C4;
                        i17 = i6;
                        i18 = i11;
                        i19 = i10;
                        view = view2;
                        i20 = paddingRight;
                        i21 = i25;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view3, i19, i15, i18, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i13, i22 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max22 = Math.max(i17, i23 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i25 = View.combineMeasuredStates(i21, view.getMeasuredState());
                    suggestedMinimumHeight = max22;
                }
                i7 = i24;
                i8 = 0;
                if (z5) {
                }
                i9 = i7;
                i10 = i4;
                i11 = i5;
                e4 = fVar.e();
                if (e4 == null) {
                }
                View view32 = view;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view32, i19, i15, i18, 0);
                view = view32;
                suggestedMinimumWidth = Math.max(i13, i22 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i17, i23 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i25 = View.combineMeasuredStates(i21, view.getMeasuredState());
                suggestedMinimumHeight = max222;
            }
            i24 = i9 + 1;
            paddingLeft = i12;
            paddingRight = i20;
            size3 = i14;
            C4 = i16;
        }
        int i31 = i25;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i5, i31 << 16));
    }

    public void onMeasureChild(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        c e4;
        View view2;
        float f6;
        float f7;
        boolean z5;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z6 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (e4 = fVar.e()) != null) {
                    view2 = view;
                    f6 = f4;
                    f7 = f5;
                    z5 = z4;
                    z6 |= e4.onNestedFling(this, childAt, view2, f6, f7, z5);
                    i4++;
                    view = view2;
                    f4 = f6;
                    f5 = f7;
                    z4 = z5;
                }
            }
            view2 = view;
            f6 = f4;
            f7 = f5;
            z5 = z4;
            i4++;
            view = view2;
            f4 = f6;
            f5 = f7;
            z4 = z5;
        }
        if (z6) {
            onChildViewsChanged(1);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        c e4;
        View view2;
        float f6;
        float f7;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (e4 = fVar.e()) != null) {
                    view2 = view;
                    f6 = f4;
                    f7 = f5;
                    z4 |= e4.onNestedPreFling(this, childAt, view2, f6, f7);
                    i4++;
                    view = view2;
                    f4 = f6;
                    f5 = f7;
                }
            }
            view2 = view;
            f6 = f4;
            f7 = f5;
            i4++;
            view = view2;
            f4 = f6;
            f5 = f7;
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        onNestedPreScroll(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        onNestedScroll(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f11550b;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            c e4 = getResolvedLayoutParams(childAt).e();
            if (id != -1 && e4 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e4.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            c e4 = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && e4 != null && (onSaveInstanceState = e4.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f11550b = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            z4 = m(motionEvent, 1);
        } else {
            z4 = false;
        }
        c e4 = ((f) this.mBehaviorTouchView.getLayoutParams()).e();
        if (e4 != null) {
            onTouchEvent = e4.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
            motionEvent2 = null;
            if (this.mBehaviorTouchView != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return onTouchEvent;
            }
            p(false);
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        p(false);
        return onTouchEvent;
    }

    void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        c e4 = ((f) view.getLayoutParams()).e();
        if (e4 == null || !e4.onRequestChildRectangleOnScreen(this, view, rect, z4)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.mDisallowInterceptReset) {
            return;
        }
        p(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.mStatusBarBackground, AbstractC1281a0.C(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            AbstractC1281a0.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? androidx.core.content.a.g(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.mStatusBarBackground.setVisible(z4, false);
    }

    final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (A.c.a(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z4 = false;
        boolean z5 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z5;
        if (!z5 && getBackground() == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        WindowInsetsCompat d4 = d(windowInsetsCompat);
        requestLayout();
        return d4;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.b();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new I(this);
        TypedArray obtainStyledAttributes = i4 == 0 ? context.obtainStyledAttributes(attributeSet, v.c.f46416b, 0, v.b.f46414a) : context.obtainStyledAttributes(attributeSet, v.c.f46416b, i4, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i4 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, v.c.f46416b, attributeSet, obtainStyledAttributes, 0, v.b.f46414a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, v.c.f46416b, attributeSet, obtainStyledAttributes, i4, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(v.c.f46417c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i5 = 0; i5 < length; i5++) {
                coordinatorLayout.mKeylines[i5] = (int) (r12[i5] * f4);
            }
        }
        coordinatorLayout.mStatusBarBackground = obtainStyledAttributes.getDrawable(v.c.f46418d);
        obtainStyledAttributes.recycle();
        v();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC1281a0.A(this) == 0) {
            AbstractC1281a0.z0(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.G
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        c e4;
        int childCount = getChildCount();
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i6) && (e4 = fVar.e()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.onNestedPreScroll(this, childAt, view, i4, i5, iArr2, i6);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i8 = i5 > 0 ? Math.max(i8, iArr4[1]) : Math.min(i8, iArr4[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z4) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
        onNestedScroll(view, i4, i5, i6, i7, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.G
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        c e4;
        View view3;
        View view4;
        int i6;
        int i7;
        this.mNestedScrollingParentHelper.c(view, view2, i4, i5);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i5) && (e4 = fVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i6 = i4;
                i7 = i5;
                e4.onNestedScrollAccepted(this, childAt, view3, view4, i6, i7);
            } else {
                view3 = view;
                view4 = view2;
                i6 = i4;
                i7 = i5;
            }
            i8++;
            view = view3;
            view2 = view4;
            i4 = i6;
            i5 = i7;
        }
    }

    @Override // androidx.core.view.G
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c e4 = fVar.e();
                if (e4 != null) {
                    boolean onStartNestedScroll = e4.onStartNestedScroll(this, childAt, view, view2, i4, i5);
                    z4 |= onStartNestedScroll;
                    fVar.q(i5, onStartNestedScroll);
                } else {
                    fVar.q(i5, false);
                }
            }
        }
        return z4;
    }

    @Override // androidx.core.view.G
    public void onStopNestedScroll(View view, int i4) {
        this.mNestedScrollingParentHelper.d(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i4)) {
                c e4 = fVar.e();
                if (e4 != null) {
                    e4.onStopNestedScroll(this, childAt, view, i4);
                }
                fVar.k(i4);
                fVar.j();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.H
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        c e4;
        int childCount = getChildCount();
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i8) && (e4 = fVar.e()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.onNestedScroll(this, childAt, view, i4, i5, i6, i7, i8, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i9 = i6 > 0 ? Math.max(i9, iArr3[0]) : Math.min(i9, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i10 = i7 > 0 ? Math.max(i10, iArr4[1]) : Math.min(i10, iArr4[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z4) {
            onChildViewsChanged(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        SparseArray f11550b;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f11550b = new SparseArray(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.f11550b.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            SparseArray sparseArray = this.f11550b;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = this.f11550b.keyAt(i5);
                parcelableArr[i5] = (Parcelable) this.f11550b.valueAt(i5);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f11553a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11554b;

        /* renamed from: c, reason: collision with root package name */
        public int f11555c;

        /* renamed from: d, reason: collision with root package name */
        public int f11556d;

        /* renamed from: e, reason: collision with root package name */
        public int f11557e;

        /* renamed from: f, reason: collision with root package name */
        int f11558f;

        /* renamed from: g, reason: collision with root package name */
        public int f11559g;

        /* renamed from: h, reason: collision with root package name */
        public int f11560h;

        /* renamed from: i, reason: collision with root package name */
        int f11561i;

        /* renamed from: j, reason: collision with root package name */
        int f11562j;

        /* renamed from: k, reason: collision with root package name */
        View f11563k;

        /* renamed from: l, reason: collision with root package name */
        View f11564l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f11565m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f11566n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f11567o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f11568p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f11569q;

        /* renamed from: r, reason: collision with root package name */
        Object f11570r;

        public f(int i4, int i5) {
            super(i4, i5);
            this.f11554b = false;
            this.f11555c = 0;
            this.f11556d = 0;
            this.f11557e = -1;
            this.f11558f = -1;
            this.f11559g = 0;
            this.f11560h = 0;
            this.f11569q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f11558f);
            this.f11563k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f11564l = null;
                    this.f11563k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f11558f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f11564l = null;
                this.f11563k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f11564l = null;
                    this.f11563k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f11564l = findViewById;
        }

        private boolean r(View view, int i4) {
            int b4 = AbstractC1317t.b(((f) view.getLayoutParams()).f11559g, i4);
            return b4 != 0 && (AbstractC1317t.b(this.f11560h, i4) & b4) == b4;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f11563k.getId() != this.f11558f) {
                return false;
            }
            View view2 = this.f11563k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f11564l = null;
                    this.f11563k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f11564l = view2;
            return true;
        }

        boolean a() {
            return this.f11563k == null && this.f11558f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f11564l || r(view2, AbstractC1281a0.C(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f11553a;
            return cVar != null && cVar.layoutDependsOn(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f11553a == null) {
                this.f11565m = false;
            }
            return this.f11565m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f11558f == -1) {
                this.f11564l = null;
                this.f11563k = null;
                return null;
            }
            if (this.f11563k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f11563k;
        }

        public c e() {
            return this.f11553a;
        }

        boolean f() {
            return this.f11568p;
        }

        Rect g() {
            return this.f11569q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z4 = this.f11565m;
            if (z4) {
                return true;
            }
            c cVar = this.f11553a;
            boolean blocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z4;
            this.f11565m = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        boolean i(int i4) {
            if (i4 == 0) {
                return this.f11566n;
            }
            if (i4 != 1) {
                return false;
            }
            return this.f11567o;
        }

        void j() {
            this.f11568p = false;
        }

        void k(int i4) {
            q(i4, false);
        }

        void l() {
            this.f11565m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f11553a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f11553a = cVar;
                this.f11570r = null;
                this.f11554b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        void o(boolean z4) {
            this.f11568p = z4;
        }

        void p(Rect rect) {
            this.f11569q.set(rect);
        }

        void q(int i4, boolean z4) {
            if (i4 == 0) {
                this.f11566n = z4;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f11567o = z4;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11554b = false;
            this.f11555c = 0;
            this.f11556d = 0;
            this.f11557e = -1;
            this.f11558f = -1;
            this.f11559g = 0;
            this.f11560h = 0;
            this.f11569q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.c.f46419e);
            this.f11555c = obtainStyledAttributes.getInteger(v.c.f46420f, 0);
            this.f11558f = obtainStyledAttributes.getResourceId(v.c.f46421g, -1);
            this.f11556d = obtainStyledAttributes.getInteger(v.c.f46422h, 0);
            this.f11557e = obtainStyledAttributes.getInteger(v.c.f46426l, -1);
            this.f11559g = obtainStyledAttributes.getInt(v.c.f46425k, 0);
            this.f11560h = obtainStyledAttributes.getInt(v.c.f46424j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(v.c.f46423i);
            this.f11554b = hasValue;
            if (hasValue) {
                this.f11553a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(v.c.f46423i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f11553a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f11554b = false;
            this.f11555c = 0;
            this.f11556d = 0;
            this.f11557e = -1;
            this.f11558f = -1;
            this.f11559g = 0;
            this.f11560h = 0;
            this.f11569q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11554b = false;
            this.f11555c = 0;
            this.f11556d = 0;
            this.f11557e = -1;
            this.f11558f = -1;
            this.f11559g = 0;
            this.f11560h = 0;
            this.f11569q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11554b = false;
            this.f11555c = 0;
            this.f11556d = 0;
            this.f11557e = -1;
            this.f11558f = -1;
            this.f11559g = 0;
            this.f11560h = 0;
            this.f11569q = new Rect();
        }
    }
}
