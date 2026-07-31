package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC1281a0;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.R$dimen;
import com.yandex.div.R$id;
import com.yandex.div.R$style;
import com.yandex.div.R$styleable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BaseIndicatorTabLayout extends HorizontalScrollView {
    private static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new Y.b();
    private static final A.e sTabPool = new A.g(16);
    private long mAnimationDuration;
    private int mContentInsetEnd;
    private int mContentInsetStart;
    private InputFocusTracker mInputFocusTracker;
    private final boolean mIsTabEllipsizeEnabled;
    private int mMode;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;
    private OnTabSelectedListener mOnTabSelectedListener;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private androidx.viewpager.widget.a mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private Tab mSelectedTab;
    private final OvalIndicators mTabIndicators;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final int mTabScrollPadding;
    private final boolean mTabScrollPaddingEnabled;
    private int mTabTextAppearance;
    private boolean mTabTextBoldOnSelection;
    private ColorStateList mTabTextColors;
    private final TabTitleDelimitersController mTabTitleDelimitersController;

    @NonNull
    private final A.e mTabViewPool;
    private final ArrayList<Tab> mTabs;
    private DivTypefaceProvider mTypefaceProvider;
    private ViewPager mViewPager;

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType = iArr;
            try {
                iArr[AnimationType.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[AnimationType.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AnimationType {
        SLIDE,
        FADE,
        NONE
    }

    public interface OnTabSelectedListener {
        void onTabReselected(Tab tab);

        void onTabSelected(Tab tab);

        void onTabUnselected(Tab tab);
    }

    static class OvalIndicators extends LinearLayout {
        private AnimationType mAnimationType;
        private final Path mClipPath;
        protected float[] mCornerRadii;
        private int mFutureSelectedPosition;
        private boolean mHasDelimiters;
        protected int mIndicatorHeight;
        private final Paint mIndicatorPaint;
        private final RectF mIndicatorRect;
        protected int[] mIndicatorsLeft;
        protected int[] mIndicatorsRight;
        protected int mItemSpacing;
        protected float mOffset;
        private float mOpacity;
        private final int mPaddingBottom;
        private final int mPaddingTop;
        protected int mSelectedColor;
        protected ValueAnimator mSelectedIndicatorAnimator;
        protected int mSelectedIndicatorLeft;
        protected int mSelectedIndicatorRight;
        protected int mSelectedPosition;
        private int mSize;
        protected int mUnselectedColor;

        /* synthetic */ OvalIndicators(Context context, int i4, int i5, AnonymousClass1 anonymousClass1) {
            this(context, i4, i5);
        }

        public static /* synthetic */ void a(OvalIndicators ovalIndicators, int i4, int i5, int i6, int i7, ValueAnimator valueAnimator) {
            ovalIndicators.getClass();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ovalIndicators.setSelectedIndicatorPosition(lerp(i4, i5, animatedFraction), lerp(i6, i7, animatedFraction));
            AbstractC1281a0.f0(ovalIndicators);
        }

        public static /* synthetic */ void b(OvalIndicators ovalIndicators, ValueAnimator valueAnimator) {
            ovalIndicators.getClass();
            ovalIndicators.mOpacity = 1.0f - valueAnimator.getAnimatedFraction();
            AbstractC1281a0.f0(ovalIndicators);
        }

        private static float clampCornerRadius(float f4, float f5, float f6) {
            if (f6 <= 0.0f || f5 <= 0.0f) {
                return 0.0f;
            }
            float min = Math.min(f6, f5) / 2.0f;
            if (f4 == -1.0f) {
                return min;
            }
            if (f4 > min) {
                Log.e("BaseIndicatorTabLayout", "Corner radius is too big");
            }
            return Math.min(f4, min);
        }

        private void drawRoundRect(Canvas canvas, int i4, int i5, float f4, int i6, float f5) {
            if (i4 < 0 || i5 <= i4) {
                return;
            }
            this.mIndicatorRect.set(i4, this.mPaddingTop, i5, f4 - this.mPaddingBottom);
            float width = this.mIndicatorRect.width();
            float height = this.mIndicatorRect.height();
            float[] fArr = new float[8];
            for (int i7 = 0; i7 < 8; i7++) {
                fArr[i7] = clampCornerRadius(this.mCornerRadii[i7], width, height);
            }
            this.mClipPath.reset();
            this.mClipPath.addRoundRect(this.mIndicatorRect, fArr, Path.Direction.CW);
            this.mClipPath.close();
            this.mIndicatorPaint.setColor(i6);
            this.mIndicatorPaint.setAlpha(Math.round(this.mIndicatorPaint.getAlpha() * f5));
            canvas.drawPath(this.mClipPath, this.mIndicatorPaint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTabPositionInLayout(int i4) {
            return (!this.mHasDelimiters || i4 == -1) ? i4 : i4 * 2;
        }

        private void initIndicatorArrays(int i4) {
            this.mSize = i4;
            this.mIndicatorsLeft = new int[i4];
            this.mIndicatorsRight = new int[i4];
            for (int i5 = 0; i5 < this.mSize; i5++) {
                this.mIndicatorsLeft[i5] = -1;
                this.mIndicatorsRight[i5] = -1;
            }
        }

        private static boolean isTransparentColor(int i4) {
            return (i4 >> 24) == 0;
        }

        private static int lerp(int i4, int i5, float f4) {
            return i4 + Math.round(f4 * (i5 - i4));
        }

        private ViewGroup.MarginLayoutParams setLeftMargin(ViewGroup.LayoutParams layoutParams, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i4;
            return marginLayoutParams;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i4 < 0) {
                i4 = childCount;
            }
            if (i4 != 0) {
                super.addView(view, i4, setLeftMargin(layoutParams, this.mItemSpacing));
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
            }
            super.addView(view, i4, setLeftMargin(layoutParams, 0));
        }

        void animateSelectedIndicatorToPosition(int i4, long j4) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                j4 = Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration());
            }
            long j5 = j4;
            View tab = getTab(i4);
            if (tab == null) {
                updateIndicatorsPosition();
                return;
            }
            int i5 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
            if (i5 == 1) {
                startSelectedIndicatorFadeAnimation(i4, j5);
            } else if (i5 != 2) {
                setSelectedIndicatorPositionFromTabPosition(i4, 0.0f);
            } else {
                startSelectedIndicatorSlideAnimation(i4, j5, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, tab.getLeft(), tab.getRight());
            }
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float height = getHeight();
            if (this.mUnselectedColor != -1) {
                int i4 = this.mSize;
                for (int i5 = 0; i5 < i4; i5++) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[i5], this.mIndicatorsRight[i5], height, this.mUnselectedColor, 1.0f);
                }
            }
            if (this.mSelectedColor != -1) {
                int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
                int tabPositionInLayout2 = getTabPositionInLayout(this.mFutureSelectedPosition);
                int i6 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
                if (i6 == 1) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, this.mOpacity);
                    if (this.mFutureSelectedPosition != -1) {
                        drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout2], this.mIndicatorsRight[tabPositionInLayout2], height, this.mSelectedColor, 1.0f - this.mOpacity);
                    }
                } else if (i6 != 2) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, 1.0f);
                } else {
                    drawRoundRect(canvas, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, height, this.mSelectedColor, 1.0f);
                }
            }
            super.draw(canvas);
        }

        View getTab(int i4) {
            return getChildAt(getTabPositionInLayout(i4));
        }

        boolean hasDelimiters() {
            return this.mHasDelimiters;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            super.onLayout(z4, i4, i5, i6, i7);
            updateIndicatorsPosition();
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.mSelectedIndicatorAnimator.cancel();
            animateSelectedIndicatorToPosition(this.mFutureSelectedPosition, Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration()));
        }

        void setAnimationType(AnimationType animationType) {
            if (this.mAnimationType != animationType) {
                this.mAnimationType = animationType;
                ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.mSelectedIndicatorAnimator.cancel();
            }
        }

        void setContainsDelimiters(boolean z4) {
            if (this.mHasDelimiters != z4) {
                this.mHasDelimiters = z4;
                updateOpacity();
                updateIndicatorsPosition();
            }
        }

        void setIndicatorColor(int i4) {
            if (this.mUnselectedColor != i4) {
                if (isTransparentColor(i4)) {
                    this.mUnselectedColor = -1;
                } else {
                    this.mUnselectedColor = i4;
                }
                AbstractC1281a0.f0(this);
            }
        }

        void setIndicatorCornersRadii(@NonNull float[] fArr) {
            if (Arrays.equals(this.mCornerRadii, fArr)) {
                return;
            }
            this.mCornerRadii = fArr;
            AbstractC1281a0.f0(this);
        }

        void setIndicatorHeight(int i4) {
            if (this.mIndicatorHeight != i4) {
                this.mIndicatorHeight = i4;
                AbstractC1281a0.f0(this);
            }
        }

        void setItemSpacing(int i4) {
            if (i4 != this.mItemSpacing) {
                this.mItemSpacing = i4;
                int childCount = getChildCount();
                for (int i5 = 1; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
                }
            }
        }

        void setSelectedIndicatorColor(int i4) {
            if (this.mSelectedColor != i4) {
                if (isTransparentColor(i4)) {
                    this.mSelectedColor = -1;
                } else {
                    this.mSelectedColor = i4;
                }
                AbstractC1281a0.f0(this);
            }
        }

        protected void setSelectedIndicatorPosition(int i4, int i5) {
            if (i4 == this.mSelectedIndicatorLeft && i5 == this.mSelectedIndicatorRight) {
                return;
            }
            this.mSelectedIndicatorLeft = i4;
            this.mSelectedIndicatorRight = i5;
            AbstractC1281a0.f0(this);
        }

        void setSelectedIndicatorPositionFromTabPosition(int i4, float f4) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i4;
            this.mOffset = f4;
            updateIndicatorsPosition();
            updateOpacity();
        }

        protected void setUnselectedIndicatorPosition(int i4, int i5, int i6) {
            int[] iArr = this.mIndicatorsLeft;
            int i7 = iArr[i4];
            int[] iArr2 = this.mIndicatorsRight;
            int i8 = iArr2[i4];
            if (i5 == i7 && i6 == i8) {
                return;
            }
            iArr[i4] = i5;
            iArr2[i4] = i6;
            AbstractC1281a0.f0(this);
        }

        protected void startSelectedIndicatorFadeAnimation(int i4, long j4) {
            if (i4 != this.mSelectedPosition) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
                ofFloat.setDuration(j4);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.i
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.b(BaseIndicatorTabLayout.OvalIndicators.this, valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.2
                    private boolean mHasCancel = false;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.mHasCancel = true;
                        OvalIndicators.this.mOpacity = 1.0f;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (this.mHasCancel) {
                            return;
                        }
                        OvalIndicators ovalIndicators = OvalIndicators.this;
                        ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                        OvalIndicators.this.mOffset = 0.0f;
                    }
                });
                this.mFutureSelectedPosition = i4;
                this.mSelectedIndicatorAnimator = ofFloat;
                ofFloat.start();
            }
        }

        protected void startSelectedIndicatorSlideAnimation(int i4, long j4, final int i5, final int i6, final int i7, final int i8) {
            if (i5 == i7 && i6 == i8) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ofFloat.setDuration(j4);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseIndicatorTabLayout.OvalIndicators.a(BaseIndicatorTabLayout.OvalIndicators.this, i5, i7, i6, i8, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.1
                private boolean mHasCancel = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.mHasCancel = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.mHasCancel) {
                        return;
                    }
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                    OvalIndicators.this.mOffset = 0.0f;
                }
            });
            this.mFutureSelectedPosition = i4;
            this.mSelectedIndicatorAnimator = ofFloat;
            ofFloat.start();
        }

        protected void updateIndicatorsPosition() {
            int i4;
            int i5;
            int i6;
            int i7;
            int childCount = getChildCount();
            if (childCount != this.mSize) {
                initIndicatorArrays(childCount);
            }
            int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt instanceof TabView) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        i5 = childAt.getRight();
                        if (this.mAnimationType != AnimationType.SLIDE || i8 != tabPositionInLayout || this.mOffset <= 0.0f || i8 >= childCount - 1) {
                            i6 = left;
                            i7 = i6;
                            i4 = i5;
                        } else {
                            View childAt2 = getChildAt(this.mHasDelimiters ? i8 + 2 : i8 + 1);
                            float left2 = this.mOffset * childAt2.getLeft();
                            float f4 = this.mOffset;
                            i7 = (int) (left2 + ((1.0f - f4) * left));
                            int right = (int) ((f4 * childAt2.getRight()) + ((1.0f - this.mOffset) * i5));
                            i6 = left;
                            i4 = right;
                        }
                    } else {
                        i4 = -1;
                        i5 = -1;
                        i6 = -1;
                        i7 = -1;
                    }
                    setUnselectedIndicatorPosition(i8, i6, i5);
                    if (i8 == tabPositionInLayout) {
                        setSelectedIndicatorPosition(i7, i4);
                    }
                }
            }
        }

        protected void updateOpacity() {
            float f4 = 1.0f - this.mOffset;
            if (f4 != this.mOpacity) {
                this.mOpacity = f4;
                int i4 = this.mSelectedPosition + 1;
                if (i4 >= this.mSize) {
                    i4 = -1;
                }
                this.mFutureSelectedPosition = i4;
                AbstractC1281a0.f0(this);
            }
        }

        private OvalIndicators(Context context, int i4, int i5) {
            super(context);
            this.mSelectedColor = -1;
            this.mUnselectedColor = -1;
            this.mSelectedPosition = -1;
            this.mItemSpacing = 0;
            this.mSelectedIndicatorLeft = -1;
            this.mSelectedIndicatorRight = -1;
            this.mOpacity = 1.0f;
            this.mFutureSelectedPosition = -1;
            this.mAnimationType = AnimationType.SLIDE;
            setId(R$id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.mSize = childCount;
            if (this.mHasDelimiters) {
                this.mSize = (childCount + 1) / 2;
            }
            initIndicatorArrays(this.mSize);
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setAntiAlias(true);
            this.mIndicatorRect = new RectF();
            this.mPaddingTop = i4;
            this.mPaddingBottom = i5;
            this.mClipPath = new Path();
            this.mCornerRadii = new float[8];
        }
    }

    private class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        /* synthetic */ PagerAdapterObserver(BaseIndicatorTabLayout baseIndicatorTabLayout, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class Tab {
        private BaseIndicatorTabLayout mParent;
        private int mPosition;
        private CharSequence mText;
        private TabView mView;

        /* synthetic */ Tab(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mParent = null;
            this.mView = null;
            this.mText = null;
            this.mPosition = -1;
        }

        private void updateView() {
            TabView tabView = this.mView;
            if (tabView != null) {
                tabView.update();
            }
        }

        public int getPosition() {
            return this.mPosition;
        }

        public TabView getTabView() {
            return this.mView;
        }

        public CharSequence getText() {
            return this.mText;
        }

        public void select() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mParent;
            if (baseIndicatorTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            baseIndicatorTabLayout.selectTab(this);
        }

        void setPosition(int i4) {
            this.mPosition = i4;
        }

        @NonNull
        public Tab setText(CharSequence charSequence) {
            this.mText = charSequence;
            updateView();
            return this;
        }

        private Tab() {
            this.mPosition = -1;
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.j {
        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference<BaseIndicatorTabLayout> mTabLayoutRef;

        TabLayoutOnPageChangeListener(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.mTabLayoutRef = new WeakReference<>(baseIndicatorTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i4) {
            this.mPreviousScrollState = this.mScrollState;
            this.mScrollState = i4;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i4, float f4, int i5) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout != null) {
                if (this.mScrollState != 2 || this.mPreviousScrollState == 1) {
                    baseIndicatorTabLayout.setScrollPosition(i4, f4, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i4) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i4) {
                return;
            }
            int i5 = this.mScrollState;
            baseIndicatorTabLayout.selectTab(baseIndicatorTabLayout.getTabAt(i4), i5 == 0 || (i5 == 2 && this.mPreviousScrollState == 0));
        }

        public void reset() {
            this.mScrollState = 0;
            this.mPreviousScrollState = 0;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.mViewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    @SuppressLint({"PrivateResource"})
    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mTabs = new ArrayList<>();
        this.mAnimationDuration = 300L;
        this.mTypefaceProvider = DivTypefaceProvider.DEFAULT;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion(this);
        this.mTabViewPool = new A.f(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i4, R$style.Div_Tabs_IndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.mTabTextBoldOnSelection = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabTextBoldOnSelection, false);
        this.mContentInsetEnd = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabContentEnd, 0);
        this.mIsTabEllipsizeEnabled = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabEllipsizeEnabled, true);
        this.mTabScrollPaddingEnabled = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.mTabScrollPadding = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2, null);
        this.mTabIndicators = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        ovalIndicators.setIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0));
        ovalIndicators.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        ovalIndicators.setIndicatorColor(obtainStyledAttributes.getColor(R$styleable.TabLayout_tabBackground, 0));
        this.mTabTitleDelimitersController = new TabTitleDelimitersController(getContext(), ovalIndicators);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize3;
        this.mTabPaddingEnd = dimensionPixelSize3;
        this.mTabPaddingTop = dimensionPixelSize3;
        this.mTabPaddingStart = dimensionPixelSize3;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.Div_Tabs_IndicatorTabLayout_Text);
        this.mTabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, e.j.f36441S2);
        try {
            this.mTabTextColors = obtainStyledAttributes3.getColorStateList(e.j.f36457W2);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(R$styleable.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R$styleable.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.mScrollableTabMinWidth = getResources().getDimensionPixelSize(R$dimen.tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    public static /* synthetic */ void a(BaseIndicatorTabLayout baseIndicatorTabLayout, ValueAnimator valueAnimator) {
        baseIndicatorTabLayout.getClass();
        baseIndicatorTabLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    private void addTabView(Tab tab, boolean z4) {
        TabView tabView = tab.mView;
        this.mTabIndicators.addView(tabView, createLayoutParamsForTabs());
        this.mTabTitleDelimitersController.tabAdded(this.mTabIndicators.getChildCount() - 1);
        if (z4) {
            tabView.setSelected(true);
        }
    }

    private void addViewInternal(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i4) {
        if (i4 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewsKt.isActuallyLaidOut(this) || this.mTabIndicators.childrenNeedLayout()) {
            setScrollPosition(i4, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i4, 0.0f);
        if (scrollX != calculateScrollXForTab) {
            if (this.mScrollAnimator == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                this.mScrollAnimator = ofInt;
                ofInt.setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR);
                this.mScrollAnimator.setDuration(this.mAnimationDuration);
                this.mScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.e
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.a(BaseIndicatorTabLayout.this, valueAnimator);
                    }
                });
            }
            this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        this.mTabIndicators.animateSelectedIndicatorToPosition(i4, this.mAnimationDuration);
    }

    private void applyModeAndGravity() {
        int i4;
        int i5;
        if (this.mMode == 0) {
            i4 = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
            i5 = Math.max(0, this.mContentInsetEnd - this.mTabPaddingEnd);
        } else {
            i4 = 0;
            i5 = 0;
        }
        AbstractC1281a0.F0(this.mTabIndicators, i4, 0, i5, 0);
        if (this.mMode != 1) {
            this.mTabIndicators.setGravity(8388611);
        } else {
            this.mTabIndicators.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i4, float f4) {
        View tab;
        int left;
        int width;
        if (this.mMode != 0 || (tab = this.mTabIndicators.getTab(i4)) == null) {
            return 0;
        }
        int width2 = tab.getWidth();
        if (this.mTabScrollPaddingEnabled) {
            left = tab.getLeft();
            width = this.mTabScrollPadding;
        } else {
            int i5 = i4 + 1;
            left = tab.getLeft() + ((int) ((width2 + ((i5 < this.mTabIndicators.getChildCount() ? this.mTabIndicators.getChildAt(i5) : null) != null ? r5.getWidth() : 0)) * f4 * 0.5f)) + (tab.getWidth() / 2);
            width = getWidth() / 2;
        }
        return left - width;
    }

    private void configureTab(Tab tab, int i4) {
        tab.setPosition(i4);
        this.mTabs.add(i4, tab);
        int size = this.mTabs.size();
        while (true) {
            i4++;
            if (i4 >= size) {
                return;
            } else {
                this.mTabs.get(i4).setPosition(i4);
            }
        }
    }

    private void configureTabView(@NonNull TabView tabView) {
        tabView.setTabPadding(this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
        tabView.setTextTypeface(this.mTypefaceProvider, this.mTabTextAppearance);
        tabView.setInputFocusTracker(this.mInputFocusTracker);
        tabView.setTextColorList(this.mTabTextColors);
        tabView.setBoldTextOnSelection(this.mTabTextBoldOnSelection);
        tabView.setEllipsizeEnabled(this.mIsTabEllipsizeEnabled);
        tabView.setMaxWidthProvider(new TabView.MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.f
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            public final int getMaxWidth() {
                int tabMaxWidth;
                tabMaxWidth = BaseIndicatorTabLayout.this.getTabMaxWidth();
                return tabMaxWidth;
            }
        });
        tabView.setOnUpdateListener(new TabView.OnUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.g
            @Override // com.yandex.div.internal.widget.tabs.TabView.OnUpdateListener
            public final void onUpdated(TabView tabView2) {
                BaseIndicatorTabLayout.this.onTabViewUpdated(tabView2);
            }
        });
    }

    private static ColorStateList createColorStateList(int i4, int i5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i5, i4});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    private int getTabMinWidth() {
        int i4 = this.mRequestedTabMinWidth;
        if (i4 != -1) {
            return i4;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabIndicators.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView getTabView(@NonNull Tab tab) {
        TabView tabView = (TabView) this.mTabViewPool.b();
        if (tabView == null) {
            tabView = createTabView(getContext());
            configureTabView(tabView);
            onTabViewCreated(tabView);
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        return tabView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        androidx.viewpager.widget.a aVar = this.mPagerAdapter;
        if (aVar == null) {
            removeAllTabs();
            return;
        }
        int count = aVar.getCount();
        for (int i4 = 0; i4 < count; i4++) {
            addTab(newTab().setText(this.mPagerAdapter.getPageTitle(i4)), false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        selectTab(getTabAt(currentItem));
    }

    private void removeTabViewAt(int i4) {
        TabView tabView = (TabView) this.mTabIndicators.getChildAt(i4);
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i4);
        this.mTabIndicators.removeViewAt(tabPositionInLayout);
        this.mTabTitleDelimitersController.tabRemoved(tabPositionInLayout);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.a(tabView);
        }
        requestLayout();
    }

    private void setPagerAdapter(androidx.viewpager.widget.a aVar, boolean z4) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.mPagerAdapter;
        if (aVar2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = aVar;
        if (z4 && aVar != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver(this, null);
            }
            aVar.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private void setScrollToSelectedTab() {
        int position;
        Tab tab = this.mSelectedTab;
        if (tab == null || (position = tab.getPosition()) == -1) {
            return;
        }
        setScrollPosition(position, 0.0f, true);
    }

    private void setSelectedTabView(int i4) {
        int childCount = this.mTabIndicators.getChildCount();
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i4);
        if (tabPositionInLayout >= childCount || this.mTabIndicators.getChildAt(tabPositionInLayout).isSelected()) {
            return;
        }
        int i5 = 0;
        while (i5 < childCount) {
            this.mTabIndicators.getChildAt(i5).setSelected(i5 == tabPositionInLayout);
            i5++;
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void updateTabViews(boolean z4) {
        for (int i4 = 0; i4 < this.mTabIndicators.getChildCount(); i4++) {
            View childAt = this.mTabIndicators.getChildAt(i4);
            if (childAt instanceof TabView) {
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z4) {
                    childAt.requestLayout();
                }
            }
        }
    }

    public void addTab(@NonNull Tab tab, boolean z4) {
        if (tab.mParent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        addTabView(tab, z4);
        configureTab(tab, this.mTabs.size());
        if (z4) {
            tab.select();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    @NonNull
    public void bindTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        this.mTypefaceProvider = divTypefaceProvider;
    }

    protected abstract TabView createTabView(@NonNull Context context);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return dispatchTouchEvent;
    }

    @NonNull
    public TabLayoutOnPageChangeListener getPageChangeListener() {
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        return this.mPageChangeListener;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.mSelectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.mTabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public Tab getTabAt(int i4) {
        return this.mTabs.get(i4);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabMode() {
        return this.mMode;
    }

    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    @NonNull
    public Tab newTab() {
        Tab tab = (Tab) sTabPool.b();
        if (tab == null) {
            tab = new Tab(null);
        }
        tab.mParent = this;
        tab.mView = getTabView(tab);
        return tab;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    protected void onMeasure(int i4, int i5) {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(44, getResources().getDisplayMetrics()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i5)), 1073741824);
        } else if (mode == 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i4);
        if (View.MeasureSpec.getMode(i4) != 0) {
            int i6 = this.mRequestedTabMaxWidth;
            if (i6 <= 0) {
                i6 = size - BaseDivViewExtensionsKt.dpToPx(56, getResources().getDisplayMetrics());
            }
            this.mTabMaxWidth = i6;
        }
        super.onMeasure(i4, i5);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.mMode != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.onOverScrolled(i4, i5, z4, z5);
        this.mNestedScrollCompanion.dispatchOnOverScrolled(z4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i6 == 0 || i6 == i4) {
            return;
        }
        setScrollToSelectedTab();
    }

    protected void onTabViewCreated(@NonNull TextView textView) {
    }

    protected void onTabViewUpdated(@NonNull TextView textView) {
    }

    public void removeAllTabs() {
        for (int size = this.mTabs.size() - 1; size >= 0; size--) {
            removeTabViewAt(size);
        }
        Iterator<Tab> it = this.mTabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            sTabPool.a(next);
        }
        this.mSelectedTab = null;
    }

    void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    public void setAnimationDuration(long j4) {
        this.mAnimationDuration = j4;
    }

    public void setAnimationType(AnimationType animationType) {
        this.mTabIndicators.setAnimationType(animationType);
    }

    public void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.mOnTabSelectedListener = onTabSelectedListener;
    }

    public void setScrollPosition(int i4, float f4, boolean z4) {
        setScrollPosition(i4, f4, z4, true);
    }

    public void setSelectedTabIndicatorColor(int i4) {
        this.mTabIndicators.setSelectedIndicatorColor(i4);
    }

    public void setTabBackgroundColor(int i4) {
        this.mTabIndicators.setIndicatorColor(i4);
    }

    public void setTabDelimiter(Bitmap bitmap, int i4, int i5) {
        this.mTabTitleDelimitersController.updateTitleDelimiters(bitmap, i4, i5);
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        this.mTabIndicators.setIndicatorCornersRadii(fArr);
    }

    public void setTabIndicatorHeight(int i4) {
        this.mTabIndicators.setIndicatorHeight(i4);
    }

    public void setTabItemSpacing(int i4) {
        this.mTabIndicators.setItemSpacing(i4);
    }

    public void setTabMode(int i4) {
        if (i4 != this.mMode) {
            this.mMode = i4;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            int size = this.mTabs.size();
            for (int i4 = 0; i4 < size; i4++) {
                TabView tabView = this.mTabs.get(i4).getTabView();
                if (tabView != null) {
                    tabView.setTextColorList(this.mTabTextColors);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z4) {
        for (int i4 = 0; i4 < this.mTabs.size(); i4++) {
            this.mTabs.get(i4).mView.setEnabled(z4);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (tabLayoutOnPageChangeListener = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
        }
        if (viewPager == null) {
            this.mViewPager = null;
            setOnTabSelectedListener(null);
            setPagerAdapter(null, true);
            return;
        }
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = viewPager;
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        this.mPageChangeListener.reset();
        viewPager.addOnPageChangeListener(this.mPageChangeListener);
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewPager));
        setPagerAdapter(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollPosition(int i4, float f4, boolean z4, boolean z5) {
        int round = Math.round(i4 + f4);
        if (round < 0 || round >= this.mTabIndicators.getChildCount()) {
            return;
        }
        if (z5) {
            this.mTabIndicators.setSelectedIndicatorPositionFromTabPosition(i4, f4);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i4, f4), 0);
        if (z4) {
            setSelectedTabView(round);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void selectTab(int i4) {
        Tab tabAt;
        if (getSelectedTabPosition() == i4 || (tabAt = getTabAt(i4)) == null) {
            return;
        }
        tabAt.select();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    void selectTab(Tab tab, boolean z4) {
        OnTabSelectedListener onTabSelectedListener;
        OnTabSelectedListener onTabSelectedListener2;
        Tab tab2 = this.mSelectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                OnTabSelectedListener onTabSelectedListener3 = this.mOnTabSelectedListener;
                if (onTabSelectedListener3 != null) {
                    onTabSelectedListener3.onTabReselected(tab2);
                }
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        if (z4) {
            int position = tab != null ? tab.getPosition() : -1;
            if (position != -1) {
                setSelectedTabView(position);
            }
            Tab tab3 = this.mSelectedTab;
            if ((tab3 == null || tab3.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
        }
        Tab tab4 = this.mSelectedTab;
        if (tab4 != null && (onTabSelectedListener2 = this.mOnTabSelectedListener) != null) {
            onTabSelectedListener2.onTabUnselected(tab4);
        }
        this.mSelectedTab = tab;
        if (tab == null || (onTabSelectedListener = this.mOnTabSelectedListener) == null) {
            return;
        }
        onTabSelectedListener.onTabSelected(tab);
    }

    public void setTabTextColors(int i4, int i5) {
        setTabTextColors(createColorStateList(i4, i5));
    }
}
