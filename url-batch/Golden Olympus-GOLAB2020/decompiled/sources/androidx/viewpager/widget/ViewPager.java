package androidx.viewpager.widget;

import B.w;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import androidx.core.view.J;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.ironsource.InterfaceC1490j3;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private int mActivePointerId;
    androidx.viewpager.widget.a mAdapter;
    private List<i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private l mObserver;
    private int mOffscreenPageLimit;
    private j mOnPageChangeListener;
    private List<j> mOnPageChangeListeners;
    private int mPageMargin;
    private k mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<f> COMPARATOR = new a();
    private static final Interpolator sInterpolator = new b();
    private static final m sPositionComparator = new m();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f13209b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f13210c;

        /* renamed from: d, reason: collision with root package name */
        ClassLoader f13211d;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f13209b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f13209b);
            parcel.writeParcelable(this.f13210c, i4);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f13209b = parcel.readInt();
            this.f13210c = parcel.readParcelable(classLoader);
            this.f13211d = classLoader;
        }
    }

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f13216b - fVar2.f13216b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    class d implements J {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f13213a = new Rect();

        d() {
        }

        @Override // androidx.core.view.J
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat a02 = AbstractC1281a0.a0(view, windowInsetsCompat);
            if (a02.isConsumed()) {
                return a02;
            }
            Rect rect = this.f13213a;
            rect.left = a02.getSystemWindowInsetLeft();
            rect.top = a02.getSystemWindowInsetTop();
            rect.right = a02.getSystemWindowInsetRight();
            rect.bottom = a02.getSystemWindowInsetBottom();
            int childCount = ViewPager.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                WindowInsetsCompat g4 = AbstractC1281a0.g(ViewPager.this.getChildAt(i4), a02);
                rect.left = Math.min(g4.getSystemWindowInsetLeft(), rect.left);
                rect.top = Math.min(g4.getSystemWindowInsetTop(), rect.top);
                rect.right = Math.min(g4.getSystemWindowInsetRight(), rect.right);
                rect.bottom = Math.min(g4.getSystemWindowInsetBottom(), rect.bottom);
            }
            return a02.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f13215a;

        /* renamed from: b, reason: collision with root package name */
        int f13216b;

        /* renamed from: c, reason: collision with root package name */
        boolean f13217c;

        /* renamed from: d, reason: collision with root package name */
        float f13218d;

        /* renamed from: e, reason: collision with root package name */
        float f13219e;

        f() {
        }
    }

    class h extends C1280a {
        h() {
        }

        private boolean c() {
            androidx.viewpager.widget.a aVar = ViewPager.this.mAdapter;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityNodeInfo(View view, w wVar) {
            super.onInitializeAccessibilityNodeInfo(view, wVar);
            wVar.k0(ViewPager.class.getName());
            wVar.F0(c());
            if (ViewPager.this.canScrollHorizontally(1)) {
                wVar.a(Base64Utils.IO_BUFFER_SIZE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                wVar.a(8192);
            }
        }

        @Override // androidx.core.view.C1280a
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            if (i4 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i4 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    public interface i {
        void onAdapterChanged(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i4);

        void onPageScrolled(int i4, float f4, int i5);

        void onPageSelected(int i4);
    }

    public interface k {
        void transformPage(View view, float f4);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    static class m implements Comparator {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z4 = gVar.f13220a;
            return z4 != gVar2.f13220a ? z4 ? 1 : -1 : gVar.f13224e - gVar2.f13224e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void a(f fVar, int i4, f fVar2) {
        int i5;
        int i6;
        f fVar3;
        f fVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f4 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i7 = fVar2.f13216b;
            int i8 = fVar.f13216b;
            if (i7 < i8) {
                float f5 = fVar2.f13219e + fVar2.f13218d + f4;
                int i9 = i7 + 1;
                int i10 = 0;
                while (i9 <= fVar.f13216b && i10 < this.mItems.size()) {
                    f fVar5 = this.mItems.get(i10);
                    while (true) {
                        fVar4 = fVar5;
                        if (i9 <= fVar4.f13216b || i10 >= this.mItems.size() - 1) {
                            break;
                        }
                        i10++;
                        fVar5 = this.mItems.get(i10);
                    }
                    while (i9 < fVar4.f13216b) {
                        f5 += this.mAdapter.getPageWidth(i9) + f4;
                        i9++;
                    }
                    fVar4.f13219e = f5;
                    f5 += fVar4.f13218d + f4;
                    i9++;
                }
            } else if (i7 > i8) {
                int size = this.mItems.size() - 1;
                float f6 = fVar2.f13219e;
                while (true) {
                    i7--;
                    if (i7 < fVar.f13216b || size < 0) {
                        break;
                    }
                    f fVar6 = this.mItems.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i7 >= fVar3.f13216b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.mItems.get(size);
                    }
                    while (i7 > fVar3.f13216b) {
                        f6 -= this.mAdapter.getPageWidth(i7) + f4;
                        i7--;
                    }
                    f6 -= fVar3.f13218d + f4;
                    fVar3.f13219e = f6;
                }
            }
        }
        int size2 = this.mItems.size();
        float f7 = fVar.f13219e;
        int i11 = fVar.f13216b;
        int i12 = i11 - 1;
        this.mFirstOffset = i11 == 0 ? f7 : -3.4028235E38f;
        int i13 = count - 1;
        this.mLastOffset = i11 == i13 ? (fVar.f13218d + f7) - 1.0f : Float.MAX_VALUE;
        int i14 = i4 - 1;
        while (i14 >= 0) {
            f fVar7 = this.mItems.get(i14);
            while (true) {
                i6 = fVar7.f13216b;
                if (i12 <= i6) {
                    break;
                }
                f7 -= this.mAdapter.getPageWidth(i12) + f4;
                i12--;
            }
            f7 -= fVar7.f13218d + f4;
            fVar7.f13219e = f7;
            if (i6 == 0) {
                this.mFirstOffset = f7;
            }
            i14--;
            i12--;
        }
        float f8 = fVar.f13219e + fVar.f13218d + f4;
        int i15 = fVar.f13216b + 1;
        int i16 = i4 + 1;
        while (i16 < size2) {
            f fVar8 = this.mItems.get(i16);
            while (true) {
                i5 = fVar8.f13216b;
                if (i15 >= i5) {
                    break;
                }
                f8 += this.mAdapter.getPageWidth(i15) + f4;
                i15++;
            }
            if (i5 == i13) {
                this.mLastOffset = (fVar8.f13218d + f8) - 1.0f;
            }
            fVar8.f13219e = f8;
            f8 += fVar8.f13218d + f4;
            i16++;
            i15++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void b(boolean z4) {
        boolean z5 = this.mScrollState == 2;
        if (z5) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            f fVar = this.mItems.get(i4);
            if (fVar.f13217c) {
                fVar.f13217c = false;
                z5 = true;
            }
        }
        if (z5) {
            if (z4) {
                AbstractC1281a0.g0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int c(int i4, float f4, int i5, int i6) {
        if (Math.abs(i6) <= this.mFlingDistance || Math.abs(i5) <= this.mMinimumVelocity) {
            i4 += (int) (f4 + (i4 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i5 <= 0) {
            i4++;
        }
        if (this.mItems.size() <= 0) {
            return i4;
        }
        return Math.max(this.mItems.get(0).f13216b, Math.min(i4, this.mItems.get(r4.size() - 1).f13216b));
    }

    private void d(int i4, float f4, int i5) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrolled(i4, f4, i5);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar2 = this.mOnPageChangeListeners.get(i6);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i4, f4, i5);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i4, f4, i5);
        }
    }

    private void e(int i4) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageSelected(i4);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                j jVar2 = this.mOnPageChangeListeners.get(i5);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i4);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageSelected(i4);
        }
    }

    private void f(int i4) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i4);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                j jVar2 = this.mOnPageChangeListeners.get(i5);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i4);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i4);
        }
    }

    private void g(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).setLayerType(z4 ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect i(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f j() {
        int i4;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f5 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i5 = 0;
        boolean z4 = true;
        f fVar = null;
        int i6 = -1;
        float f6 = 0.0f;
        while (i5 < this.mItems.size()) {
            f fVar2 = this.mItems.get(i5);
            if (!z4 && fVar2.f13216b != (i4 = i6 + 1)) {
                fVar2 = this.mTempItem;
                fVar2.f13219e = f4 + f6 + f5;
                fVar2.f13216b = i4;
                fVar2.f13218d = this.mAdapter.getPageWidth(i4);
                i5--;
            }
            f fVar3 = fVar2;
            f4 = fVar3.f13219e;
            float f7 = fVar3.f13218d + f4 + f5;
            if (!z4 && scrollX < f4) {
                break;
            }
            if (scrollX < f7 || i5 == this.mItems.size() - 1) {
                return fVar3;
            }
            int i7 = fVar3.f13216b;
            float f8 = fVar3.f13218d;
            i5++;
            i6 = i7;
            f6 = f8;
            fVar = fVar3;
            z4 = false;
        }
        return fVar;
    }

    private static boolean k(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean l(float f4, float f5) {
        if (f4 >= this.mGutterSize || f5 <= 0.0f) {
            return f4 > ((float) (getWidth() - this.mGutterSize)) && f5 < 0.0f;
        }
        return true;
    }

    private void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i4);
            this.mActivePointerId = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean n(int i4) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f j4 = j();
        int clientWidth = getClientWidth();
        int i5 = this.mPageMargin;
        int i6 = clientWidth + i5;
        float f4 = clientWidth;
        int i7 = j4.f13216b;
        float f5 = ((i4 / f4) - j4.f13219e) / (j4.f13218d + (i5 / f4));
        this.mCalledSuper = false;
        onPageScrolled(i7, f5, (int) (i6 * f5));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean o(float f4) {
        boolean z4;
        boolean z5;
        float f5 = this.mLastMotionX - f4;
        this.mLastMotionX = f4;
        float scrollX = getScrollX() + f5;
        float clientWidth = getClientWidth();
        float f6 = this.mFirstOffset * clientWidth;
        float f7 = this.mLastOffset * clientWidth;
        boolean z6 = false;
        f fVar = this.mItems.get(0);
        ArrayList<f> arrayList = this.mItems;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f13216b != 0) {
            f6 = fVar.f13219e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (fVar2.f13216b != this.mAdapter.getCount() - 1) {
            f7 = fVar2.f13219e * clientWidth;
            z5 = false;
        } else {
            z5 = true;
        }
        if (scrollX < f6) {
            if (z4) {
                this.mLeftEdge.onPull(Math.abs(f6 - scrollX) / clientWidth);
                z6 = true;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z5) {
                this.mRightEdge.onPull(Math.abs(scrollX - f7) / clientWidth);
                z6 = true;
            }
            scrollX = f7;
        }
        int i4 = (int) scrollX;
        this.mLastMotionX += scrollX - i4;
        scrollTo(i4, getScrollY());
        n(i4);
        return z6;
    }

    private void p(int i4, int i5, int i6, int i7) {
        if (i5 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)), getScrollY());
                return;
            }
        }
        f infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f13219e, this.mLastOffset) : 0.0f) * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            b(false);
            scrollTo(min, getScrollY());
        }
    }

    private void q() {
        int i4 = 0;
        while (i4 < getChildCount()) {
            if (!((g) getChildAt(i4).getLayoutParams()).f13220a) {
                removeViewAt(i4);
                i4--;
            }
            i4++;
        }
    }

    private void r(boolean z4) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z4);
        }
    }

    private boolean s() {
        this.mActivePointerId = -1;
        h();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void setScrollingCacheEnabled(boolean z4) {
        if (this.mScrollingCacheEnabled != z4) {
            this.mScrollingCacheEnabled = z4;
        }
    }

    private void t(int i4, boolean z4, int i5, boolean z5) {
        f infoForPosition = infoForPosition(i4);
        int clientWidth = infoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f13219e, this.mLastOffset))) : 0;
        if (z4) {
            smoothScrollTo(clientWidth, 0, i5);
            if (z5) {
                e(i4);
                return;
            }
            return;
        }
        if (z5) {
            e(i4);
        }
        b(false);
        scrollTo(clientWidth, 0);
        n(clientWidth);
    }

    private void u() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.mDrawingOrderedChildren.add(getChildAt(i4));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f13216b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    f addNewItem(int i4, int i5) {
        f fVar = new f();
        fVar.f13216b = i4;
        fVar.f13215a = this.mAdapter.instantiateItem((ViewGroup) this, i4);
        fVar.f13218d = this.mAdapter.getPageWidth(i4);
        if (i5 < 0 || i5 >= this.mItems.size()) {
            this.mItems.add(fVar);
            return fVar;
        }
        this.mItems.add(i5, fVar);
        return fVar;
    }

    public void addOnAdapterChangeListener(i iVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(iVar);
    }

    public void addOnPageChangeListener(j jVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f infoForChild;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f13216b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean k4 = gVar.f13220a | k(view);
        gVar.f13220a = k4;
        if (!this.mInLayout) {
            super.addView(view, i4, layoutParams);
        } else {
            if (k4) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f13223d = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i4) {
        View findNextFocus;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i4 != 17 || i4 == 1) {
                    pageLeft = pageLeft();
                } else {
                    if (i4 == 66 || i4 == 2) {
                        pageLeft = pageRight();
                    }
                    pageLeft = false;
                }
            } else if (i4 == 17) {
                pageLeft = (findFocus == null || i(this.mTempRect, findNextFocus).left < i(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageLeft();
            } else {
                if (i4 == 66) {
                    pageLeft = (findFocus == null || i(this.mTempRect, findNextFocus).left > i(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageRight();
                }
                pageLeft = false;
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i4));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        if (findNextFocus != null) {
        }
        if (i4 != 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    protected boolean canScroll(View view, boolean z4, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i8 = i5 + scrollX;
                if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && canScroll(childAt, true, i4, i8 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z4 && view.canScrollHorizontally(-i4);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i4 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC1281a0.f0(this);
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z4 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i4 = this.mCurItem;
        int i5 = 0;
        boolean z5 = false;
        while (i5 < this.mItems.size()) {
            f fVar = this.mItems.get(i5);
            int itemPosition = this.mAdapter.getItemPosition(fVar.f13215a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i5);
                    i5--;
                    if (!z5) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z5 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, fVar.f13216b, fVar.f13215a);
                    int i6 = this.mCurItem;
                    if (i6 == fVar.f13216b) {
                        i4 = Math.max(0, Math.min(i6, count - 1));
                    }
                } else {
                    int i7 = fVar.f13216b;
                    if (i7 != itemPosition) {
                        if (i7 == this.mCurItem) {
                            i4 = itemPosition;
                        }
                        fVar.f13216b = itemPosition;
                    }
                }
                z4 = true;
            }
            i5++;
        }
        if (z5) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z4) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                g gVar = (g) getChildAt(i8).getLayoutParams();
                if (!gVar.f13220a) {
                    gVar.f13222c = 0.0f;
                }
            }
            setCurrentItemInternal(i4, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f13216b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z4 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z4 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z4 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z4) {
            AbstractC1281a0.f0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        if (this.mDrawingOrder == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((g) this.mDrawingOrderedChildren.get(i5).getLayoutParams()).f13225f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    f infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f infoForChild(View view) {
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            f fVar = this.mItems.get(i4);
            if (this.mAdapter.isViewFromObject(view, fVar.f13215a)) {
                return fVar;
            }
        }
        return null;
    }

    f infoForPosition(int i4) {
        for (int i5 = 0; i5 < this.mItems.size(); i5++) {
            f fVar = this.mItems.get(i5);
            if (fVar.f13216b == i4) {
                return fVar;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f4);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f4);
        this.mCloseEnough = (int) (2.0f * f4);
        this.mDefaultGutterSize = (int) (f4 * 16.0f);
        AbstractC1281a0.o0(this, new h());
        if (AbstractC1281a0.A(this) == 0) {
            AbstractC1281a0.z0(this, 1);
        }
        AbstractC1281a0.E0(this, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        float f4;
        int i5;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f5 = this.mPageMargin / width;
        int i6 = 0;
        f fVar = this.mItems.get(0);
        float f6 = fVar.f13219e;
        int size = this.mItems.size();
        int i7 = fVar.f13216b;
        int i8 = this.mItems.get(size - 1).f13216b;
        while (i7 < i8) {
            while (true) {
                i4 = fVar.f13216b;
                if (i7 <= i4 || i6 >= size) {
                    break;
                }
                i6++;
                fVar = this.mItems.get(i6);
            }
            if (i7 == i4) {
                float f7 = fVar.f13219e;
                float f8 = fVar.f13218d;
                f4 = (f7 + f8) * width;
                f6 = f7 + f8 + f5;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i7);
                f4 = (f6 + pageWidth) * width;
                f6 += pageWidth + f5;
            }
            if (this.mPageMargin + f4 > scrollX) {
                i5 = scrollX;
                this.mMarginDrawable.setBounds(Math.round(f4), this.mTopPageBounds, Math.round(this.mPageMargin + f4), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                i5 = scrollX;
            }
            if (f4 > i5 + r2) {
                return;
            }
            i7++;
            scrollX = i5;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x4 = motionEvent.getX();
            this.mInitialMotionX = x4;
            this.mLastMotionX = x4;
            float y4 = motionEvent.getY();
            this.mInitialMotionY = y4;
            this.mLastMotionY = y4;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                b(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                r(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.mActivePointerId;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x5 = motionEvent.getX(findPointerIndex);
                float f4 = x5 - this.mLastMotionX;
                float abs = Math.abs(f4);
                float y5 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y5 - this.mInitialMotionY);
                if (f4 != 0.0f && !l(this.mLastMotionX, f4) && canScroll(this, false, (int) f4, (int) x5, (int) y5)) {
                    this.mLastMotionX = x5;
                    this.mLastMotionY = y5;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i5 = this.mTouchSlop;
                if (abs > i5 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    r(true);
                    setScrollState(1);
                    float f5 = this.mInitialMotionX;
                    float f6 = this.mTouchSlop;
                    this.mLastMotionX = f4 > 0.0f ? f5 + f6 : f5 - f6;
                    this.mLastMotionY = y5;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i5) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && o(x5)) {
                    AbstractC1281a0.f0(this);
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean z5;
        f infoForChild;
        int max;
        int i8;
        int max2;
        int i9;
        int childCount = getChildCount();
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f13220a) {
                    int i14 = gVar.f13221b;
                    int i15 = i14 & 7;
                    int i16 = i14 & InterfaceC1490j3.d.b.f16818j;
                    if (i15 != 1) {
                        if (i15 == 3) {
                            i8 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i15 != 5) {
                            i8 = paddingLeft;
                        } else {
                            max = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i16 == 16) {
                            if (i16 == 48) {
                                i9 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i16 != 80) {
                                i9 = paddingTop;
                            } else {
                                max2 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i17 = paddingLeft + scrollX;
                            childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                            i12++;
                            paddingTop = i9;
                            paddingLeft = i8;
                        } else {
                            max2 = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i18 = max2;
                        i9 = paddingTop;
                        paddingTop = i18;
                        int i172 = paddingLeft + scrollX;
                        childAt.layout(i172, paddingTop, childAt.getMeasuredWidth() + i172, paddingTop + childAt.getMeasuredHeight());
                        i12++;
                        paddingTop = i9;
                        paddingLeft = i8;
                    } else {
                        max = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i19 = max;
                    i8 = paddingLeft;
                    paddingLeft = i19;
                    if (i16 == 16) {
                    }
                    int i182 = max2;
                    i9 = paddingTop;
                    paddingTop = i182;
                    int i1722 = paddingLeft + scrollX;
                    childAt.layout(i1722, paddingTop, childAt.getMeasuredWidth() + i1722, paddingTop + childAt.getMeasuredHeight());
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i8;
                }
            }
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f13220a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f4 = i20;
                    int i22 = ((int) (infoForChild.f13219e * f4)) + paddingLeft;
                    if (gVar2.f13223d) {
                        gVar2.f13223d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f4 * gVar2.f13222c), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i11 - paddingBottom;
        this.mDecorChildCount = i12;
        if (this.mFirstLayout) {
            z5 = false;
            t(this.mCurItem, false, 0, false);
        } else {
            z5 = false;
        }
        this.mFirstLayout = z5;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        g gVar;
        g gVar2;
        int i6;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i5));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f13220a) {
                int i9 = gVar2.f13221b;
                int i10 = i9 & 7;
                int i11 = i9 & InterfaceC1490j3.d.b.f16818j;
                boolean z5 = i11 == 48 || i11 == 80;
                if (i10 != 3 && i10 != 5) {
                    z4 = false;
                }
                int i12 = Integer.MIN_VALUE;
                if (z5) {
                    i6 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i6 = z4 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i13 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = paddingLeft;
                    }
                    i12 = 1073741824;
                } else {
                    i13 = paddingLeft;
                }
                int i14 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i14 == -2) {
                    i14 = measuredHeight;
                    i8 = i6;
                } else if (i14 == -1) {
                    i14 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i8));
                if (z5) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f13220a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f13222c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i4, float f4, int i5) {
        int max;
        int i6;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f13220a) {
                    int i8 = gVar.f13221b & 7;
                    if (i8 != 1) {
                        if (i8 == 3) {
                            i6 = childAt.getWidth() + paddingLeft;
                        } else if (i8 != 5) {
                            i6 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i6;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i9 = max;
                    i6 = paddingLeft;
                    paddingLeft = i9;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i6;
                }
            }
        }
        d(i4, f4, i5);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = getChildAt(i10);
                if (!((g) childAt2.getLayoutParams()).f13220a) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i6;
        int i7;
        f infoForChild;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i6 = childCount;
            i5 = 0;
            i7 = 1;
        } else {
            i5 = childCount - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f13216b == this.mCurItem && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i7;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.restoreState(savedState.f13210c, savedState.f13211d);
            setCurrentItemInternal(savedState.f13209b, false, true);
        } else {
            this.mRestoredCurItem = savedState.f13209b;
            this.mRestoredAdapterState = savedState.f13210c;
            this.mRestoredClassLoader = savedState.f13211d;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13209b = this.mCurItem;
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            savedState.f13210c = aVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            int i8 = this.mPageMargin;
            p(i4, i6, i8, i8);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z4 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x4 = motionEvent.getX();
            this.mInitialMotionX = x4;
            this.mLastMotionX = x4;
            float y4 = motionEvent.getY();
            this.mInitialMotionY = y4;
            this.mLastMotionY = y4;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z4 = s();
                    } else {
                        float x5 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x5 - this.mLastMotionX);
                        float y5 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y5 - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            r(true);
                            float f4 = this.mInitialMotionX;
                            this.mLastMotionX = x5 - f4 > 0.0f ? f4 + this.mTouchSlop : f4 - this.mTouchSlop;
                            this.mLastMotionY = y5;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z4 = o(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                t(this.mCurItem, true, 0, false);
                z4 = s();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f j4 = j();
            float f5 = clientWidth;
            setCurrentItemInternal(c(j4.f13216b, ((scrollX / f5) - j4.f13219e) / (j4.f13218d + (this.mPageMargin / f5)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z4 = s();
        }
        if (z4) {
            AbstractC1281a0.f0(this);
        }
        return true;
    }

    boolean pageLeft() {
        int i4 = this.mCurItem;
        if (i4 <= 0) {
            return false;
        }
        setCurrentItem(i4 - 1, true);
        return true;
    }

    boolean pageRight() {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(i iVar) {
        List<i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void removeOnPageChangeListener(j jVar) {
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(jVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                f fVar = this.mItems.get(i4);
                this.mAdapter.destroyItem((ViewGroup) this, fVar.f13216b, fVar.f13215a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            q();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new l();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z4 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z4) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<i> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mAdapterChangeListeners.get(i5).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i4) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i4, boolean z4, boolean z5) {
        setCurrentItemInternal(i4, z4, z5, 0);
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i4;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.mOnPageChangeListener = jVar;
    }

    public void setPageMargin(int i4) {
        int i5 = this.mPageMargin;
        this.mPageMargin = i4;
        int width = getWidth();
        p(width, width, i4, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z4, k kVar) {
        setPageTransformer(z4, kVar, 2);
    }

    void setScrollState(int i4) {
        if (this.mScrollState == i4) {
            return;
        }
        this.mScrollState = i4;
        if (this.mPageTransformer != null) {
            g(i4 != 0);
        }
        f(i4);
    }

    void smoothScrollTo(int i4, int i5, int i6) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i8 = i4 - i7;
        int i9 = i5 - scrollY;
        if (i8 == 0 && i9 == 0) {
            b(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f4 = clientWidth;
        float f5 = i10;
        float distanceInfluenceForSnapDuration = f5 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i8) * 1.0f) / f4)) * f5);
        int abs = Math.abs(i6);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / ((f4 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f), 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i7, scrollY, i8, i9, min);
        AbstractC1281a0.f0(this);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13220a;

        /* renamed from: b, reason: collision with root package name */
        public int f13221b;

        /* renamed from: c, reason: collision with root package name */
        float f13222c;

        /* renamed from: d, reason: collision with root package name */
        boolean f13223d;

        /* renamed from: e, reason: collision with root package name */
        int f13224e;

        /* renamed from: f, reason: collision with root package name */
        int f13225f;

        public g() {
            super(-1, -1);
            this.f13222c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13222c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f13221b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void populate(int i4) {
        f fVar;
        String hexString;
        f fVar2;
        f infoForChild;
        f fVar3;
        int i5 = this.mCurItem;
        if (i5 != i4) {
            fVar = infoForPosition(i5);
            this.mCurItem = i4;
        } else {
            fVar = null;
        }
        if (this.mAdapter == null) {
            u();
            return;
        }
        if (this.mPopulatePending) {
            u();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i6 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i6);
        int count = this.mAdapter.getCount();
        int min = Math.min(count - 1, this.mCurItem + i6);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.mItems.size()) {
                break;
            }
            fVar2 = this.mItems.get(i7);
            int i8 = fVar2.f13216b;
            int i9 = this.mCurItem;
            if (i8 < i9) {
                i7++;
            }
        }
        if (fVar2 == null && count > 0) {
            fVar2 = addNewItem(this.mCurItem, i7);
        }
        if (fVar2 != null) {
            int i10 = i7 - 1;
            f fVar4 = i10 >= 0 ? this.mItems.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVar2.f13218d) + (getPaddingLeft() / clientWidth);
            float f4 = 0.0f;
            for (int i11 = this.mCurItem - 1; i11 >= 0; i11--) {
                if (f4 >= paddingLeft && i11 < max) {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i11 == fVar4.f13216b && !fVar4.f13217c) {
                        this.mItems.remove(i10);
                        this.mAdapter.destroyItem((ViewGroup) this, i11, fVar4.f13215a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            fVar3 = this.mItems.get(i10);
                            fVar4 = fVar3;
                        }
                        fVar3 = null;
                        fVar4 = fVar3;
                    }
                } else if (fVar4 == null || i11 != fVar4.f13216b) {
                    f4 += addNewItem(i11, i10 + 1).f13218d;
                    i7++;
                    if (i10 >= 0) {
                        fVar3 = this.mItems.get(i10);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                } else {
                    f4 += fVar4.f13218d;
                    i10--;
                    if (i10 >= 0) {
                        fVar3 = this.mItems.get(i10);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                }
            }
            float f5 = fVar2.f13218d;
            int i12 = i7 + 1;
            if (f5 < 2.0f) {
                f fVar5 = i12 < this.mItems.size() ? this.mItems.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = this.mCurItem;
                while (true) {
                    i13++;
                    if (i13 >= count) {
                        break;
                    }
                    if (f5 >= paddingRight && i13 > min) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i13 == fVar5.f13216b && !fVar5.f13217c) {
                            this.mItems.remove(i12);
                            this.mAdapter.destroyItem((ViewGroup) this, i13, fVar5.f13215a);
                            if (i12 < this.mItems.size()) {
                                fVar5 = this.mItems.get(i12);
                            }
                        }
                    } else if (fVar5 == null || i13 != fVar5.f13216b) {
                        f addNewItem = addNewItem(i13, i12);
                        i12++;
                        f5 += addNewItem.f13218d;
                        fVar5 = i12 < this.mItems.size() ? this.mItems.get(i12) : null;
                    } else {
                        f5 += fVar5.f13218d;
                        i12++;
                        if (i12 < this.mItems.size()) {
                            fVar5 = this.mItems.get(i12);
                        }
                    }
                }
            }
            a(fVar2, i7, fVar);
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, fVar2.f13215a);
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f13225f = i14;
            if (!gVar.f13220a && gVar.f13222c == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                gVar.f13222c = infoForChild.f13218d;
                gVar.f13224e = infoForChild.f13216b;
            }
        }
        u();
        if (hasFocus()) {
            View findFocus = findFocus();
            f infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
            if (infoForAnyChild == null || infoForAnyChild.f13216b != this.mCurItem) {
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    f infoForChild2 = infoForChild(childAt2);
                    if (infoForChild2 != null && infoForChild2.f13216b == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    void setCurrentItemInternal(int i4, boolean z4, boolean z5, int i5) {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z5 && this.mCurItem == i4 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= this.mAdapter.getCount()) {
            i4 = this.mAdapter.getCount() - 1;
        }
        int i6 = this.mOffscreenPageLimit;
        int i7 = this.mCurItem;
        if (i4 > i7 + i6 || i4 < i7 - i6) {
            for (int i8 = 0; i8 < this.mItems.size(); i8++) {
                this.mItems.get(i8).f13217c = true;
            }
        }
        boolean z6 = this.mCurItem != i4;
        if (!this.mFirstLayout) {
            populate(i4);
            t(i4, z4, i5, z6);
        } else {
            this.mCurItem = i4;
            if (z6) {
                e(i4);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z4, k kVar, int i4) {
        boolean z5 = kVar != null;
        boolean z6 = z5 != (this.mPageTransformer != null);
        this.mPageTransformer = kVar;
        setChildrenDrawingOrderEnabled(z5);
        if (z5) {
            this.mDrawingOrder = z4 ? 2 : 1;
            this.mPageTransformerLayerType = i4;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z6) {
            populate();
        }
    }

    public void setCurrentItem(int i4, boolean z4) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, z4, false);
    }

    public void setPageMarginDrawable(int i4) {
        setPageMarginDrawable(androidx.core.content.a.g(getContext(), i4));
    }
}
