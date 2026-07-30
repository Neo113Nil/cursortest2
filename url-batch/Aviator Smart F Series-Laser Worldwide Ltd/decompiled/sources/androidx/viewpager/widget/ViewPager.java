package androidx.viewpager.widget;

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
import android.os.SystemClock;
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
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
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
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            PagerAdapter pagerAdapter = ViewPager.this.mAdapter;
            return pagerAdapter != null && pagerAdapter.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = ViewPager.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            if (super.performAccessibilityAction(view, i8, bundle)) {
                return true;
            }
            if (i8 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i8 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i8);

        void onPageScrolled(int i8, float f8, @Px int i9);

        void onPageSelected(int i8);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f8);
    }

    private class PagerObserver extends DataSetObserver {
        PagerObserver() {
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

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i8);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
        }
    }

    static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z7 = layoutParams.isDecor;
            return z7 != layoutParams2.isDecor ? z7 ? 1 : -1 : layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
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
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i8, ItemInfo itemInfo2) {
        int i9;
        int i10;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f8 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i11 = itemInfo2.position;
            int i12 = itemInfo.position;
            if (i11 < i12) {
                float f9 = itemInfo2.offset + itemInfo2.widthFactor + f8;
                int i13 = i11 + 1;
                int i14 = 0;
                while (i13 <= itemInfo.position && i14 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i14);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i13 <= itemInfo4.position || i14 >= this.mItems.size() - 1) {
                            break;
                        }
                        i14++;
                        itemInfo5 = this.mItems.get(i14);
                    }
                    while (i13 < itemInfo4.position) {
                        f9 += this.mAdapter.getPageWidth(i13) + f8;
                        i13++;
                    }
                    itemInfo4.offset = f9;
                    f9 += itemInfo4.widthFactor + f8;
                    i13++;
                }
            } else if (i11 > i12) {
                int size = this.mItems.size() - 1;
                float f10 = itemInfo2.offset;
                while (true) {
                    i11--;
                    if (i11 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i11 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i11 > itemInfo3.position) {
                        f10 -= this.mAdapter.getPageWidth(i11) + f8;
                        i11--;
                    }
                    f10 -= itemInfo3.widthFactor + f8;
                    itemInfo3.offset = f10;
                }
            }
        }
        int size2 = this.mItems.size();
        float f11 = itemInfo.offset;
        int i15 = itemInfo.position;
        int i16 = i15 - 1;
        this.mFirstOffset = i15 == 0 ? f11 : -3.4028235E38f;
        int i17 = count - 1;
        this.mLastOffset = i15 == i17 ? (itemInfo.widthFactor + f11) - 1.0f : Float.MAX_VALUE;
        int i18 = i8 - 1;
        while (i18 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i18);
            while (true) {
                i10 = itemInfo7.position;
                if (i16 <= i10) {
                    break;
                }
                f11 -= this.mAdapter.getPageWidth(i16) + f8;
                i16--;
            }
            f11 -= itemInfo7.widthFactor + f8;
            itemInfo7.offset = f11;
            if (i10 == 0) {
                this.mFirstOffset = f11;
            }
            i18--;
            i16--;
        }
        float f12 = itemInfo.offset + itemInfo.widthFactor + f8;
        int i19 = itemInfo.position + 1;
        int i20 = i8 + 1;
        while (i20 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i20);
            while (true) {
                i9 = itemInfo8.position;
                if (i19 >= i9) {
                    break;
                }
                f12 += this.mAdapter.getPageWidth(i19) + f8;
                i19++;
            }
            if (i9 == i17) {
                this.mLastOffset = (itemInfo8.widthFactor + f12) - 1.0f;
            }
            itemInfo8.offset = f12;
            f12 += itemInfo8.widthFactor + f8;
            i20++;
            i19++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z7) {
        boolean z8 = this.mScrollState == 2;
        if (z8) {
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
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i8 = 0; i8 < this.mItems.size(); i8++) {
            ItemInfo itemInfo = this.mItems.get(i8);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z8 = true;
            }
        }
        if (z8) {
            if (z7) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i8, float f8, int i9, int i10) {
        if (Math.abs(i10) <= this.mFlingDistance || Math.abs(i9) <= this.mMinimumVelocity) {
            i8 += (int) (f8 + (i8 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i9 <= 0) {
            i8++;
        }
        if (this.mItems.size() <= 0) {
            return i8;
        }
        return Math.max(this.mItems.get(0).position, Math.min(i8, this.mItems.get(r4.size() - 1).position));
    }

    private void dispatchOnPageScrolled(int i8, float f8, int i9) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i8, f8, i9);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i10);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i8, f8, i9);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i8, f8, i9);
        }
    }

    private void dispatchOnPageSelected(int i8) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i8);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i9);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i8);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i8);
        }
    }

    private void dispatchOnScrollStateChanged(int i8) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i8);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i9);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i8);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i8);
        }
    }

    private void enableLayers(boolean z7) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8).setLayerType(z7 ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
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

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int i8;
        int clientWidth = getClientWidth();
        float f8 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        ItemInfo itemInfo = null;
        float f10 = 0.0f;
        int i9 = -1;
        int i10 = 0;
        boolean z7 = true;
        while (i10 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i10);
            if (!z7 && itemInfo2.position != (i8 = i9 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f8 + f10 + f9;
                itemInfo2.position = i8;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(i8);
                i10--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f8 = itemInfo3.offset;
            float f11 = itemInfo3.widthFactor + f8 + f9;
            if (!z7 && scrollX < f8) {
                return itemInfo;
            }
            if (scrollX < f11 || i10 == this.mItems.size() - 1) {
                return itemInfo3;
            }
            int i11 = itemInfo3.position;
            float f12 = itemInfo3.widthFactor;
            i10++;
            z7 = false;
            i9 = i11;
            f10 = f12;
            itemInfo = itemInfo3;
        }
        return itemInfo;
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    private boolean isGutterDrag(float f8, float f9) {
        return (f8 < ((float) this.mGutterSize) && f9 > 0.0f) || (f8 > ((float) (getWidth() - this.mGutterSize)) && f9 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i8);
            this.mActivePointerId = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i8) {
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
        ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i9 = this.mPageMargin;
        int i10 = clientWidth + i9;
        float f8 = clientWidth;
        int i11 = infoForCurrentScrollPosition.position;
        float f9 = ((i8 / f8) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (i9 / f8));
        this.mCalledSuper = false;
        onPageScrolled(i11, f9, (int) (i10 * f9));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f8) {
        boolean z7;
        boolean z8;
        float f9 = this.mLastMotionX - f8;
        this.mLastMotionX = f8;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.mFirstOffset * clientWidth;
        float f11 = this.mLastOffset * clientWidth;
        boolean z9 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f10 = itemInfo.offset * clientWidth;
            z7 = false;
        } else {
            z7 = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f11 = itemInfo2.offset * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (scrollX < f10) {
            if (z7) {
                this.mLeftEdge.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z9 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z8) {
                this.mRightEdge.onPull(Math.abs(scrollX - f11) / clientWidth);
                z9 = true;
            }
            scrollX = f11;
        }
        int i8 = (int) scrollX;
        this.mLastMotionX += scrollX - i8;
        scrollTo(i8, getScrollY());
        pageScrolled(i8);
        return z9;
    }

    private void recomputeScrollPosition(int i8, int i9, int i10, int i11) {
        if (i9 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)) * (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)), getScrollY());
                return;
            }
        }
        ItemInfo infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.offset, this.mLastOffset) : 0.0f) * ((i8 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            completeScroll(false);
            scrollTo(min, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i8 = 0;
        while (i8 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i8).getLayoutParams()).isDecor) {
                removeViewAt(i8);
                i8--;
            }
            i8++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z7) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z7);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i8, boolean z7, int i9, boolean z8) {
        ItemInfo infoForPosition = infoForPosition(i8);
        int clientWidth = infoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset))) : 0;
        if (z7) {
            smoothScrollTo(clientWidth, 0, i9);
            if (z8) {
                dispatchOnPageSelected(i8);
                return;
            }
            return;
        }
        if (z8) {
            dispatchOnPageSelected(i8);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z7) {
        if (this.mScrollingCacheEnabled != z7) {
            this.mScrollingCacheEnabled = z7;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                this.mDrawingOrderedChildren.add(getChildAt(i8));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        ItemInfo infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i8, i9);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i9 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    ItemInfo addNewItem(int i8, int i9) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i8;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i8);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i8);
        if (i9 < 0 || i9 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i9, itemInfo);
        }
        return itemInfo;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo infoForChild;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i8, layoutParams);
        } else {
            if (isDecorView) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i8, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i8) {
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
                Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i8);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i8 != 17 || i8 == 1) {
                    pageLeft = pageLeft();
                } else {
                    if (i8 == 66 || i8 == 2) {
                        pageLeft = pageRight();
                    }
                    pageLeft = false;
                }
            } else if (i8 == 17) {
                pageLeft = (findFocus == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageLeft();
            } else {
                if (i8 == 66) {
                    pageLeft = (findFocus == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageRight();
                }
                pageLeft = false;
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i8));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i8);
        if (findNextFocus != null) {
        }
        if (i8 != 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z7, int i8, int i9, int i10) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i9 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && canScroll(childAt, true, i8, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z7 && view.canScrollHorizontally(-i8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i8 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i8 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z7 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i8 = this.mCurItem;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i9);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i9);
                    i9--;
                    if (!z8) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z8 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i10 = this.mCurItem;
                    if (i10 == itemInfo.position) {
                        i8 = Math.max(0, Math.min(i10, count - 1));
                    }
                } else {
                    int i11 = itemInfo.position;
                    if (i11 != itemPosition) {
                        if (i11 == this.mCurItem) {
                            i8 = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z7 = true;
            }
            i9++;
        }
        if (z8) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z7) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i8, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z7;
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
            return;
        }
        if (this.mLeftEdge.isFinished()) {
            z7 = false;
        } else {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
            this.mLeftEdge.setSize(height, width);
            z7 = this.mLeftEdge.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.mRightEdge.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
            this.mRightEdge.setSize(height2, width2);
            z7 |= this.mRightEdge.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z7) {
            ViewCompat.postInvalidateOnAnimation(this);
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

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / clientWidth) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f8) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f8;
        float scrollX = getScrollX() - f8;
        float clientWidth = getClientWidth();
        float f9 = this.mFirstOffset * clientWidth;
        float f10 = this.mLastOffset * clientWidth;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = this.mItems.get(r4.size() - 1);
        if (itemInfo.position != 0) {
            f9 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f10 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f9) {
            scrollX = f9;
        } else if (scrollX > f10) {
            scrollX = f10;
        }
        int i8 = (int) scrollX;
        this.mLastMotionX += scrollX - i8;
        scrollTo(i8, getScrollY());
        pageScrolled(i8);
        MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        if (this.mDrawingOrder == 2) {
            i9 = (i8 - 1) - i9;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i9).getLayoutParams()).childIndex;
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

    ItemInfo infoForAnyChild(View view) {
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

    ItemInfo infoForChild(View view) {
        for (int i8 = 0; i8 < this.mItems.size(); i8++) {
            ItemInfo itemInfo = this.mItems.get(i8);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    ItemInfo infoForPosition(int i8) {
        for (int i9 = 0; i9 < this.mItems.size(); i9++) {
            ItemInfo itemInfo = this.mItems.get(i9);
            if (itemInfo.position == i8) {
                return itemInfo;
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
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f8);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f8);
        this.mCloseEnough = (int) (2.0f * f8);
        this.mDefaultGutterSize = (int) (f8 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i8), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
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
        int i8;
        float f8;
        float f9;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f10 = this.mPageMargin / width;
        int i9 = 0;
        ItemInfo itemInfo = this.mItems.get(0);
        float f11 = itemInfo.offset;
        int size = this.mItems.size();
        int i10 = itemInfo.position;
        int i11 = this.mItems.get(size - 1).position;
        while (i10 < i11) {
            while (true) {
                i8 = itemInfo.position;
                if (i10 <= i8 || i9 >= size) {
                    break;
                }
                i9++;
                itemInfo = this.mItems.get(i9);
            }
            if (i10 == i8) {
                float f12 = itemInfo.offset;
                float f13 = itemInfo.widthFactor;
                f8 = (f12 + f13) * width;
                f11 = f12 + f13 + f10;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i10);
                f8 = (f11 + pageWidth) * width;
                f11 += pageWidth + f10;
            }
            if (this.mPageMargin + f8 > scrollX) {
                f9 = f10;
                this.mMarginDrawable.setBounds(Math.round(f8), this.mTopPageBounds, Math.round(this.mPageMargin + f8), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f9 = f10;
            }
            if (f8 > scrollX + r2) {
                return;
            }
            i10++;
            f10 = f9;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
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
            float x7 = motionEvent.getX();
            this.mInitialMotionX = x7;
            this.mLastMotionX = x7;
            float y7 = motionEvent.getY();
            this.mInitialMotionY = y7;
            this.mLastMotionY = y7;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i8 = this.mActivePointerId;
            if (i8 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i8);
                float x8 = motionEvent.getX(findPointerIndex);
                float f8 = x8 - this.mLastMotionX;
                float abs = Math.abs(f8);
                float y8 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y8 - this.mInitialMotionY);
                if (f8 != 0.0f && !isGutterDrag(this.mLastMotionX, f8) && canScroll(this, false, (int) f8, (int) x8, (int) y8)) {
                    this.mLastMotionX = x8;
                    this.mLastMotionY = y8;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i9 = this.mTouchSlop;
                if (abs > i9 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f9 = this.mInitialMotionX;
                    float f10 = this.mTouchSlop;
                    this.mLastMotionX = f8 > 0.0f ? f9 + f10 : f9 - f10;
                    this.mLastMotionY = y8;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i9) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x8)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
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
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        boolean z8;
        ItemInfo infoForChild;
        int max;
        int i12;
        int max2;
        int i13;
        int childCount = getChildCount();
        int i14 = i10 - i8;
        int i15 = i11 - i9;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i18 = layoutParams.gravity;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            i12 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            i12 = paddingLeft;
                        } else {
                            max = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 == 16) {
                            if (i20 == 48) {
                                i13 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                i13 = paddingTop;
                            } else {
                                max2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = i13;
                            paddingLeft = i12;
                        } else {
                            max2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = max2;
                        i13 = paddingTop;
                        paddingTop = i22;
                        int i212 = paddingLeft + scrollX;
                        childAt.layout(i212, paddingTop, childAt.getMeasuredWidth() + i212, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = i13;
                        paddingLeft = i12;
                    } else {
                        max = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i23 = max;
                    i12 = paddingLeft;
                    paddingLeft = i23;
                    if (i20 == 16) {
                    }
                    int i222 = max2;
                    i13 = paddingTop;
                    paddingTop = i222;
                    int i2122 = paddingLeft + scrollX;
                    childAt.layout(i2122, paddingTop, childAt.getMeasuredWidth() + i2122, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = i13;
                    paddingLeft = i12;
                }
            }
        }
        int i24 = (i14 - paddingLeft) - paddingRight;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (infoForChild = infoForChild(childAt2)) != null) {
                    float f8 = i24;
                    int i26 = ((int) (infoForChild.offset * f8)) + paddingLeft;
                    if (layoutParams2.needsMeasure) {
                        layoutParams2.needsMeasure = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f8 * layoutParams2.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i26, paddingTop, childAt2.getMeasuredWidth() + i26, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i15 - paddingBottom;
        this.mDecorChildCount = i16;
        if (this.mFirstLayout) {
            z8 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z8 = false;
        }
        this.mFirstLayout = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i8, int i9) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i10;
        int i11;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i8), View.getDefaultSize(0, i9));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z7 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i15 = layoutParams2.gravity;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z8 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z7 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z8) {
                    i18 = 1073741824;
                } else if (z7) {
                    i10 = 1073741824;
                    i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                    if (i11 == -2) {
                        if (i11 == -1) {
                            i11 = paddingLeft;
                        }
                        i18 = 1073741824;
                    } else {
                        i11 = paddingLeft;
                    }
                    i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                    if (i12 != -2) {
                        i12 = measuredHeight;
                        i14 = i10;
                    } else if (i12 == -1) {
                        i12 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i18), View.MeasureSpec.makeMeasureSpec(i12, i14));
                    if (!z8) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z7) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i10 = Integer.MIN_VALUE;
                i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i11 == -2) {
                }
                i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i12 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i18), View.MeasureSpec.makeMeasureSpec(i12, i14));
                if (!z8) {
                }
            }
            i13++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i8, float f8, int i9) {
        int max;
        int i10;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i12 = layoutParams.gravity & 7;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i10 = childAt.getWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i10 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i10;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i13 = max;
                    i10 = paddingLeft;
                    paddingLeft = i13;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i10;
                }
            }
        }
        dispatchOnPageScrolled(i8, f8, i9);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int i9;
        int i10;
        int i11;
        ItemInfo infoForChild;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i10 = childCount;
            i9 = 0;
            i11 = 1;
        } else {
            i9 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i10) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i8, rect)) {
                return true;
            }
            i9 += i11;
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
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10) {
            int i12 = this.mPageMargin;
            recomputeScrollPosition(i8, i10, i12, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean resetTouch;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x7 = motionEvent.getX();
            this.mInitialMotionX = x7;
            this.mLastMotionX = x7;
            float y7 = motionEvent.getY();
            this.mInitialMotionY = y7;
            this.mLastMotionY = y7;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        resetTouch = resetTouch();
                        if (resetTouch) {
                        }
                    } else {
                        float x8 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x8 - this.mLastMotionX);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y8 - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f8 = this.mInitialMotionX;
                            this.mLastMotionX = x8 - f8 > 0.0f ? f8 + this.mTouchSlop : f8 - this.mTouchSlop;
                            this.mLastMotionY = y8;
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
                    resetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    if (resetTouch) {
                    }
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                resetTouch = resetTouch();
                if (resetTouch) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f9 = clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / f9) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (this.mPageMargin / f9)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            resetTouch = resetTouch();
            if (resetTouch) {
            }
        }
        return true;
    }

    boolean pageLeft() {
        int i8 = this.mCurItem;
        if (i8 <= 0) {
            return false;
        }
        setCurrentItem(i8 - 1, true);
        return true;
    }

    boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
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

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i8 = 0; i8 < this.mItems.size(); i8++) {
                ItemInfo itemInfo = this.mItems.get(i8);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z7 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z7) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mAdapterChangeListeners.get(i9).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i8) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i8, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i8, boolean z7, boolean z8) {
        setCurrentItemInternal(i8, z7, z8, 0);
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i8 + " too small; defaulting to 1");
            i8 = 1;
        }
        if (i8 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i8;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i8) {
        int i9 = this.mPageMargin;
        this.mPageMargin = i8;
        int width = getWidth();
        recomputeScrollPosition(width, width, i8, i9);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z7, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z7, pageTransformer, 2);
    }

    void setScrollState(int i8) {
        if (this.mScrollState == i8) {
            return;
        }
        this.mScrollState = i8;
        if (this.mPageTransformer != null) {
            enableLayers(i8 != 0);
        }
        dispatchOnScrollStateChanged(i8);
    }

    void smoothScrollTo(int i8, int i9) {
        smoothScrollTo(i8, i9, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void populate(int i8) {
        ItemInfo itemInfo;
        String hexString;
        ItemInfo itemInfo2;
        ItemInfo infoForChild;
        ItemInfo itemInfo3;
        int i9 = this.mCurItem;
        if (i9 != i8) {
            itemInfo = infoForPosition(i9);
            this.mCurItem = i8;
        } else {
            itemInfo = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i10 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i10);
        int count = this.mAdapter.getCount();
        int min = Math.min(count - 1, this.mCurItem + i10);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.mItems.size()) {
                break;
            }
            itemInfo2 = this.mItems.get(i11);
            int i12 = itemInfo2.position;
            int i13 = this.mCurItem;
            if (i12 < i13) {
                i11++;
            }
        }
        if (itemInfo2 == null && count > 0) {
            itemInfo2 = addNewItem(this.mCurItem, i11);
        }
        if (itemInfo2 != null) {
            int i14 = i11 - 1;
            ItemInfo itemInfo4 = i14 >= 0 ? this.mItems.get(i14) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - itemInfo2.widthFactor) + (getPaddingLeft() / clientWidth);
            float f8 = 0.0f;
            for (int i15 = this.mCurItem - 1; i15 >= 0; i15--) {
                if (f8 >= paddingLeft && i15 < max) {
                    if (itemInfo4 == null) {
                        break;
                    }
                    if (i15 == itemInfo4.position && !itemInfo4.scrolling) {
                        this.mItems.remove(i14);
                        this.mAdapter.destroyItem((ViewGroup) this, i15, itemInfo4.object);
                        i14--;
                        i11--;
                        if (i14 >= 0) {
                            itemInfo3 = this.mItems.get(i14);
                            itemInfo4 = itemInfo3;
                        }
                        itemInfo3 = null;
                        itemInfo4 = itemInfo3;
                    }
                } else if (itemInfo4 == null || i15 != itemInfo4.position) {
                    f8 += addNewItem(i15, i14 + 1).widthFactor;
                    i11++;
                    if (i14 >= 0) {
                        itemInfo3 = this.mItems.get(i14);
                        itemInfo4 = itemInfo3;
                    }
                    itemInfo3 = null;
                    itemInfo4 = itemInfo3;
                } else {
                    f8 += itemInfo4.widthFactor;
                    i14--;
                    if (i14 >= 0) {
                        itemInfo3 = this.mItems.get(i14);
                        itemInfo4 = itemInfo3;
                    }
                    itemInfo3 = null;
                    itemInfo4 = itemInfo3;
                }
            }
            float f9 = itemInfo2.widthFactor;
            int i16 = i11 + 1;
            if (f9 < 2.0f) {
                ItemInfo itemInfo5 = i16 < this.mItems.size() ? this.mItems.get(i16) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i17 = this.mCurItem;
                while (true) {
                    i17++;
                    if (i17 >= count) {
                        break;
                    }
                    if (f9 >= paddingRight && i17 > min) {
                        if (itemInfo5 == null) {
                            break;
                        }
                        if (i17 == itemInfo5.position && !itemInfo5.scrolling) {
                            this.mItems.remove(i16);
                            this.mAdapter.destroyItem((ViewGroup) this, i17, itemInfo5.object);
                            if (i16 < this.mItems.size()) {
                                itemInfo5 = this.mItems.get(i16);
                            }
                        }
                    } else if (itemInfo5 == null || i17 != itemInfo5.position) {
                        ItemInfo addNewItem = addNewItem(i17, i16);
                        i16++;
                        f9 += addNewItem.widthFactor;
                        itemInfo5 = i16 < this.mItems.size() ? this.mItems.get(i16) : null;
                    } else {
                        f9 += itemInfo5.widthFactor;
                        i16++;
                        if (i16 < this.mItems.size()) {
                            itemInfo5 = this.mItems.get(i16);
                        }
                    }
                }
            }
            calculatePageOffsets(itemInfo2, i11, itemInfo);
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, itemInfo2.object);
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.childIndex = i18;
            if (!layoutParams.isDecor && layoutParams.widthFactor == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                layoutParams.widthFactor = infoForChild.widthFactor;
                layoutParams.position = infoForChild.position;
            }
        }
        sortChildDrawingOrder();
        if (hasFocus()) {
            View findFocus = findFocus();
            ItemInfo infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
            if (infoForAnyChild == null || infoForAnyChild.position != this.mCurItem) {
                for (int i19 = 0; i19 < getChildCount(); i19++) {
                    View childAt2 = getChildAt(i19);
                    ItemInfo infoForChild2 = infoForChild(childAt2);
                    if (infoForChild2 != null && infoForChild2.position == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setCurrentItem(int i8, boolean z7) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i8, z7, false);
    }

    void setCurrentItemInternal(int i8, boolean z7, boolean z8, int i9) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z8 && this.mCurItem == i8 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        } else if (i8 >= this.mAdapter.getCount()) {
            i8 = this.mAdapter.getCount() - 1;
        }
        int i10 = this.mOffscreenPageLimit;
        int i11 = this.mCurItem;
        if (i8 > i11 + i10 || i8 < i11 - i10) {
            for (int i12 = 0; i12 < this.mItems.size(); i12++) {
                this.mItems.get(i12).scrolling = true;
            }
        }
        boolean z9 = this.mCurItem != i8;
        if (!this.mFirstLayout) {
            populate(i8);
            scrollToItem(i8, z7, i9, z9);
        } else {
            this.mCurItem = i8;
            if (z9) {
                dispatchOnPageSelected(i8);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z7, @Nullable PageTransformer pageTransformer, int i8) {
        boolean z8 = pageTransformer != null;
        boolean z9 = z8 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z8);
        if (z8) {
            this.mDrawingOrder = z7 ? 2 : 1;
            this.mPageTransformerLayerType = i8;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z9) {
            populate();
        }
    }

    void smoothScrollTo(int i8, int i9, int i10) {
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
        int i11 = scrollX;
        int scrollY = getScrollY();
        int i12 = i8 - i11;
        int i13 = i9 - scrollY;
        if (i12 == 0 && i13 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float f8 = clientWidth;
        float f9 = i14;
        float distanceInfluenceForSnapDuration = f9 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f8)) * f9);
        int abs = Math.abs(i10);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4 : (int) (((Math.abs(i12) / ((f8 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f), 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i11, scrollY, i12, i13, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setPageMarginDrawable(@DrawableRes int i8) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i8));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
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
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }
}
