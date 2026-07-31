package androidx.core.widget;

import B.w;
import B.y;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import androidx.core.view.C1308o;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.InterfaceC1310p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import w.AbstractC3480a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements H, E {

    /* renamed from: D, reason: collision with root package name */
    private static final float f11998D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: E, reason: collision with root package name */
    private static final a f11999E = new a();

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f12000F = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    private d f12001A;

    /* renamed from: B, reason: collision with root package name */
    final c f12002B;

    /* renamed from: C, reason: collision with root package name */
    C1308o f12003C;

    /* renamed from: a, reason: collision with root package name */
    private final float f12004a;

    /* renamed from: b, reason: collision with root package name */
    private long f12005b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f12006c;

    /* renamed from: d, reason: collision with root package name */
    private OverScroller f12007d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f12008e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f12009f;

    /* renamed from: g, reason: collision with root package name */
    private int f12010g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12011h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12012i;

    /* renamed from: j, reason: collision with root package name */
    private View f12013j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12014k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f12015l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12016m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12017n;

    /* renamed from: o, reason: collision with root package name */
    private int f12018o;

    /* renamed from: p, reason: collision with root package name */
    private int f12019p;

    /* renamed from: q, reason: collision with root package name */
    private int f12020q;

    /* renamed from: r, reason: collision with root package name */
    private int f12021r;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f12022s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f12023t;

    /* renamed from: u, reason: collision with root package name */
    private int f12024u;

    /* renamed from: v, reason: collision with root package name */
    private int f12025v;

    /* renamed from: w, reason: collision with root package name */
    private SavedState f12026w;

    /* renamed from: x, reason: collision with root package name */
    private final I f12027x;

    /* renamed from: y, reason: collision with root package name */
    private final F f12028y;

    /* renamed from: z, reason: collision with root package name */
    private float f12029z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f12030b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f12030b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f12030b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f12030b = parcel.readInt();
        }
    }

    static class a extends C1280a {
        a() {
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            y.a(accessibilityEvent, nestedScrollView.getScrollX());
            y.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityNodeInfo(View view, w wVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, wVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            wVar.k0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            wVar.F0(true);
            if (nestedScrollView.getScrollY() > 0) {
                wVar.b(w.a.f153r);
                wVar.b(w.a.f120C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                wVar.b(w.a.f152q);
                wVar.b(w.a.f122E);
            }
        }

        @Override // androidx.core.view.C1280a
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, max, true);
                    return true;
                }
                if (i4 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements InterfaceC1310p {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1310p
        public boolean a(float f4) {
            if (f4 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f4);
            return true;
        }

        @Override // androidx.core.view.InterfaceC1310p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC1310p
        public void c() {
            NestedScrollView.this.f12007d.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3480a.f46494c);
    }

    private boolean A(View view, int i4, int i5) {
        view.getDrawingRect(this.f12006c);
        offsetDescendantRectToMyCoords(view, this.f12006c);
        return this.f12006c.bottom + i4 >= getScrollY() && this.f12006c.top - i4 <= getScrollY() + i5;
    }

    private void B(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f12028y.e(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12021r) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f12010g = (int) motionEvent.getY(i4);
            this.f12021r = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f12015l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f12015l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12015l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int G(int i4, float f4) {
        float d4;
        int round;
        float width = f4 / getWidth();
        float height = i4 / getHeight();
        float f5 = 0.0f;
        if (f.b(this.f12008e) == 0.0f) {
            if (f.b(this.f12009f) != 0.0f) {
                d4 = f.d(this.f12009f, height, 1.0f - width);
                if (f.b(this.f12009f) == 0.0f) {
                    this.f12009f.onRelease();
                }
            }
            round = Math.round(f5 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        d4 = -f.d(this.f12008e, -height, width);
        if (f.b(this.f12008e) == 0.0f) {
            this.f12008e.onRelease();
        }
        f5 = d4;
        round = Math.round(f5 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    private void H(boolean z4) {
        if (z4) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f12025v = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i4, int i5, int i6) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z4 = false;
        boolean z5 = i4 == 33;
        View o4 = o(z5, i5, i6);
        if (o4 == null) {
            o4 = this;
        }
        if (i5 < scrollY || i6 > i7) {
            J(z5 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z4 = true;
        }
        if (o4 != findFocus()) {
            o4.requestFocus(i4);
        }
        return z4;
    }

    private int J(int i4, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            R(2, i6);
        }
        boolean z5 = false;
        if (i(0, i4, this.f12023t, this.f12022s, i6)) {
            int i9 = i4 - this.f12023t[1];
            i8 = this.f12022s[1];
            i7 = i9;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z6 = d() && !z4;
        int i10 = i7;
        boolean z7 = D(0, i7, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i6);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f12023t;
        iArr[1] = 0;
        j(0, scrollY2, 0, i10 - scrollY2, this.f12022s, i6, iArr);
        int i11 = i8 + this.f12022s[1];
        int i12 = i10 - this.f12023t[1];
        int i13 = scrollY + i12;
        if (i13 < 0) {
            if (z6) {
                f.d(this.f12008e, (-i12) / getHeight(), i5 / getWidth());
                if (!this.f12009f.isFinished()) {
                    this.f12009f.onRelease();
                }
            }
        } else if (i13 > scrollRange && z6) {
            f.d(this.f12009f, i12 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!this.f12008e.isFinished()) {
                this.f12008e.onRelease();
            }
        }
        if (this.f12008e.isFinished() && this.f12009f.isFinished()) {
            z5 = z7;
        } else {
            postInvalidateOnAnimation();
        }
        if (z5 && i6 == 0 && (velocityTracker = this.f12015l) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            T(i6);
            this.f12008e.onRelease();
            this.f12009f.onRelease();
        }
        return i11;
    }

    private void K(View view) {
        view.getDrawingRect(this.f12006c);
        offsetDescendantRectToMyCoords(view, this.f12006c);
        int g4 = g(this.f12006c);
        if (g4 != 0) {
            scrollBy(0, g4);
        }
    }

    private boolean L(Rect rect, boolean z4) {
        int g4 = g(rect);
        boolean z5 = g4 != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, g4);
                return z5;
            }
            N(0, g4);
        }
        return z5;
    }

    private boolean M(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        return r(-i4) < f.b(edgeEffect) * ((float) getHeight());
    }

    private void O(int i4, int i5, int i6, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f12005b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f12007d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i6);
            H(z4);
        } else {
            if (!this.f12007d.isFinished()) {
                a();
            }
            scrollBy(i4, i5);
        }
        this.f12005b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z4;
        if (f.b(this.f12008e) != 0.0f) {
            f.d(this.f12008e, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        if (f.b(this.f12009f) == 0.0f) {
            return z4;
        }
        f.d(this.f12009f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f12007d.abortAnimation();
        T(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int f(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    private void k(int i4) {
        if (i4 != 0) {
            if (this.f12017n) {
                N(0, i4);
            } else {
                scrollBy(0, i4);
            }
        }
    }

    private boolean l(int i4) {
        if (f.b(this.f12008e) != 0.0f) {
            if (M(this.f12008e, i4)) {
                this.f12008e.onAbsorb(i4);
                return true;
            }
            p(-i4);
            return true;
        }
        if (f.b(this.f12009f) == 0.0f) {
            return false;
        }
        int i5 = -i4;
        if (M(this.f12009f, i5)) {
            this.f12009f.onAbsorb(i5);
            return true;
        }
        p(i5);
        return true;
    }

    private void m() {
        this.f12021r = -1;
        this.f12014k = false;
        F();
        T(0);
        this.f12008e.onRelease();
        this.f12009f.onRelease();
    }

    private View o(boolean z4, int i4, int i5) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float r(int i4) {
        double log = Math.log((Math.abs(i4) * 0.35f) / (this.f12004a * 0.015f));
        float f4 = f11998D;
        return (float) (this.f12004a * 0.015f * Math.exp((f4 / (f4 - 1.0d)) * log));
    }

    private boolean t(int i4, int i5) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        VelocityTracker velocityTracker = this.f12015l;
        if (velocityTracker == null) {
            this.f12015l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f12007d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12018o = viewConfiguration.getScaledTouchSlop();
        this.f12019p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12020q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f12015l == null) {
            this.f12015l = VelocityTracker.obtain();
        }
    }

    private void x(int i4, int i5) {
        this.f12010g = i4;
        this.f12021r = i5;
        R(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4) {
        boolean z5;
        boolean z6;
        int i12;
        int overScrollMode = getOverScrollMode();
        boolean z7 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z8 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        boolean z10 = overScrollMode == 0 || (overScrollMode == 1 && z8);
        int i13 = i6 + i4;
        int i14 = !z9 ? 0 : i10;
        int i15 = i7 + i5;
        int i16 = !z10 ? 0 : i11;
        int i17 = -i14;
        int i18 = i14 + i8;
        int i19 = -i16;
        int i20 = i16 + i9;
        if (i13 > i18) {
            i13 = i18;
            z5 = true;
        } else if (i13 < i17) {
            z5 = true;
            i13 = i17;
        } else {
            z5 = false;
        }
        if (i15 > i20) {
            i15 = i20;
            z6 = true;
        } else if (i15 < i19) {
            z6 = true;
            i15 = i19;
        } else {
            z6 = false;
        }
        if (!z6 || s(1)) {
            i12 = i13;
        } else {
            int i21 = i13;
            this.f12007d.springBack(i21, i15, 0, 0, 0, getScrollRange());
            i12 = i21;
        }
        onOverScrolled(i12, i15, z5, z6);
        return z5 || z6;
    }

    public boolean E(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        if (z4) {
            this.f12006c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f12006c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f12006c.top = getScrollY() - height;
            Rect rect2 = this.f12006c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f12006c;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return I(i4, i5, i6);
    }

    public final void N(int i4, int i5) {
        O(i4, i5, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, false);
    }

    void P(int i4, int i5, int i6, boolean z4) {
        O(i4 - getScrollX(), i5 - getScrollY(), i6, z4);
    }

    void Q(int i4, int i5, boolean z4) {
        P(i4, i5, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, z4);
    }

    public boolean R(int i4, int i5) {
        return this.f12028y.p(i4, i5);
    }

    public void T(int i4) {
        this.f12028y.r(i4);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f12006c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f12006c);
            J(g(this.f12006c), 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus != null && findFocus.isFocused() && y(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i4;
        if (this.f12007d.isFinished()) {
            return;
        }
        this.f12007d.computeScrollOffset();
        int currY = this.f12007d.getCurrY();
        int h4 = h(currY - this.f12025v);
        this.f12025v = currY;
        int[] iArr = this.f12023t;
        iArr[1] = 0;
        i(0, h4, iArr, null, 1);
        int i5 = h4 - this.f12023t[1];
        int scrollRange = getScrollRange();
        if (i5 != 0) {
            int scrollY = getScrollY();
            D(0, i5, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i4 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i6 = i5 - scrollY2;
            int[] iArr2 = this.f12023t;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i6, this.f12022s, 1, iArr2);
            i5 = i6 - this.f12023t[1];
        } else {
            i4 = scrollRange;
        }
        if (i5 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i4 > 0)) {
                if (i5 < 0) {
                    if (this.f12008e.isFinished()) {
                        this.f12008e.onAbsorb((int) this.f12007d.getCurrVelocity());
                    }
                } else if (this.f12009f.isFinished()) {
                    this.f12009f.onAbsorb((int) this.f12007d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f12007d.isFinished()) {
            T(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.f12028y.a(f4, f5, z4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f12028y.b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return i(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f12028y.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f12008e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            this.f12008e.setSize(width, height);
            if (this.f12008e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f12009f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i5 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f12009f.setSize(width2, height2);
        if (this.f12009f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
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

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f12027x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
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

    float getVerticalScrollFactorCompat() {
        if (this.f12029z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f12029z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f12029z;
    }

    int h(int i4) {
        int height = getHeight();
        if (i4 > 0 && f.b(this.f12008e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * f.d(this.f12008e, ((-i4) * 4.0f) / height, 0.5f));
            if (round != i4) {
                this.f12008e.finish();
            }
            return i4 - round;
        }
        if (i4 >= 0 || f.b(this.f12009f) == 0.0f) {
            return i4;
        }
        float f4 = height;
        int round2 = Math.round((f4 / 4.0f) * f.d(this.f12009f, (i4 * 4.0f) / f4, 0.5f));
        if (round2 != i4) {
            this.f12009f.finish();
        }
        return i4 - round2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f12028y.d(i4, i5, iArr, iArr2, i6);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f12028y.l();
    }

    public void j(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        this.f12028y.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f12006c.setEmpty();
        if (!e()) {
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
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? q(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? q(130) : c(130);
            }
            if (keyCode == 62) {
                E(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return q(33);
            }
            if (keyCode == 93) {
                return q(130);
            }
            if (keyCode == 122) {
                E(33);
                return false;
            }
            if (keyCode == 123) {
                E(130);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12012i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i4;
        int i5;
        float f4;
        if (motionEvent.getAction() == 8 && !this.f12014k) {
            if (D.a(motionEvent, 2)) {
                i4 = 9;
                f4 = motionEvent.getAxisValue(9);
                i5 = (int) motionEvent.getX();
            } else if (D.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i5 = getWidth() / 2;
                i4 = 26;
                f4 = axisValue;
            } else {
                i4 = 0;
                i5 = 0;
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                J(-((int) (f4 * getVerticalScrollFactorCompat())), i5, 1, D.a(motionEvent, 8194));
                if (i4 != 0) {
                    this.f12003C.g(motionEvent, i4);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f12014k) {
            return true;
        }
        int i4 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f12021r;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f12010g) > this.f12018o && (2 & getNestedScrollAxes()) == 0) {
                                this.f12014k = true;
                                this.f12010g = y4;
                                w();
                                this.f12015l.addMovement(motionEvent);
                                this.f12024u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        C(motionEvent);
                    }
                }
            }
            this.f12014k = false;
            this.f12021r = -1;
            F();
            if (this.f12007d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            T(0);
        } else {
            int y5 = (int) motionEvent.getY();
            if (t((int) motionEvent.getX(), y5)) {
                this.f12010g = y5;
                this.f12021r = motionEvent.getPointerId(0);
                u();
                this.f12015l.addMovement(motionEvent);
                this.f12007d.computeScrollOffset();
                if (!S(motionEvent) && this.f12007d.isFinished()) {
                    z4 = false;
                }
                this.f12014k = z4;
                R(2, 0);
            } else {
                if (!S(motionEvent) && this.f12007d.isFinished()) {
                    z4 = false;
                }
                this.f12014k = z4;
                F();
            }
        }
        return this.f12014k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        int i8 = 0;
        this.f12011h = false;
        View view = this.f12013j;
        if (view != null && z(view, this)) {
            K(this.f12013j);
        }
        this.f12013j = null;
        if (!this.f12012i) {
            if (this.f12026w != null) {
                scrollTo(getScrollX(), this.f12026w.f12030b);
                this.f12026w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f4 = f(scrollY, paddingTop, i8);
            if (f4 != scrollY) {
                scrollTo(getScrollX(), f4);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f12012i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f12016m && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        p((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // androidx.core.view.G
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        i(i4, i5, iArr, null, i6);
    }

    @Override // androidx.core.view.H
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        B(i7, i8, iArr);
    }

    @Override // androidx.core.view.G
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        this.f12027x.c(view, view2, i4, i5);
        R(2, i5);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus == null || y(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12026w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12030b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        d dVar = this.f12001A;
        if (dVar != null) {
            dVar.a(this, i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !A(findFocus, 0, i7)) {
            return;
        }
        findFocus.getDrawingRect(this.f12006c);
        offsetDescendantRectToMyCoords(findFocus, this.f12006c);
        k(g(this.f12006c));
    }

    @Override // androidx.core.view.G
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    @Override // androidx.core.view.G
    public void onStopNestedScroll(View view, int i4) {
        this.f12027x.d(view, i4);
        T(i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12024u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f12024u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f12015l;
                velocityTracker.computeCurrentVelocity(1000, this.f12020q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f12021r);
                if (Math.abs(yVelocity) >= this.f12019p) {
                    if (!l(yVelocity)) {
                        int i4 = -yVelocity;
                        float f4 = i4;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            p(i4);
                        }
                    }
                } else if (this.f12007d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f12021r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f12021r + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f12010g - y4;
                    int G3 = i5 - G(i5, motionEvent.getX(findPointerIndex));
                    if (!this.f12014k && Math.abs(G3) > this.f12018o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f12014k = true;
                        G3 = G3 > 0 ? G3 - this.f12018o : G3 + this.f12018o;
                    }
                    if (this.f12014k) {
                        int J3 = J(G3, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f12010g = y4 - J3;
                        this.f12024u += J3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f12014k && getChildCount() > 0 && this.f12007d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f12010g = (int) motionEvent.getY(actionIndex);
                this.f12021r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f12010g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f12021r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f12014k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f12007d.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f12015l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i4) {
        if (getChildCount() > 0) {
            this.f12007d.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            H(true);
        }
    }

    public boolean q(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f12006c;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f12006c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f12006c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f12006c;
        return I(i4, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f12011h) {
            this.f12013j = view2;
        } else {
            K(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (z4) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f12011h = true;
        super.requestLayout();
    }

    public boolean s(int i4) {
        return this.f12028y.k(i4);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int f4 = f(i4, width, width2);
            int f5 = f(i5, height, height2);
            if (f4 == getScrollX() && f5 == getScrollY()) {
                return;
            }
            super.scrollTo(f4, f5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f12016m) {
            this.f12016m = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        this.f12028y.m(z4);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.f12001A = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f12017n = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return R(i4, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        T(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12006c = new Rect();
        this.f12011h = true;
        this.f12012i = false;
        this.f12013j = null;
        this.f12014k = false;
        this.f12017n = true;
        this.f12021r = -1;
        this.f12022s = new int[2];
        this.f12023t = new int[2];
        c cVar = new c();
        this.f12002B = cVar;
        this.f12003C = new C1308o(getContext(), cVar);
        this.f12008e = f.a(context, attributeSet);
        this.f12009f = f.a(context, attributeSet);
        this.f12004a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12000F, i4, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f12027x = new I(this);
        this.f12028y = new F(this);
        setNestedScrollingEnabled(true);
        AbstractC1281a0.o0(this, f11999E);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        onNestedPreScroll(view, i4, i5, iArr, 0);
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
        B(i7, i8, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        B(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
