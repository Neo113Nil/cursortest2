package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.yanzhenjie.recyclerview.c;

/* loaded from: classes4.dex */
public class SwipeMenuLayout extends FrameLayout implements b {
    public static final int DEFAULT_SCROLLER_DURATION = 200;
    private View mContentView;
    private int mContentViewId;
    private int mDownX;
    private int mDownY;
    private boolean mDragging;
    private int mLastX;
    private int mLastY;
    private int mLeftViewId;
    private float mOpenPercent;
    private int mRightViewId;
    private int mScaledMaximumFlingVelocity;
    private int mScaledMinimumFlingVelocity;
    private int mScaledTouchSlop;
    private OverScroller mScroller;
    private int mScrollerDuration;
    private c mSwipeCurrentHorizontal;
    private d mSwipeLeftHorizontal;
    private h mSwipeRightHorizontal;
    private VelocityTracker mVelocityTracker;
    private boolean shouldResetSwipe;
    private boolean swipeEnable;

    public SwipeMenuLayout(Context context) {
        this(context, null);
    }

    private int getSwipeDuration(MotionEvent motionEvent, int i8) {
        int x7 = (int) (motionEvent.getX() - getScrollX());
        int menuWidth = this.mSwipeCurrentHorizontal.getMenuWidth();
        int i9 = menuWidth / 2;
        float f8 = menuWidth;
        float f9 = i9;
        return Math.min(i8 > 0 ? Math.round(Math.abs((f9 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(x7) * 1.0f) / f8)) * f9)) / i8) * 1000.0f) * 4 : (int) (((Math.abs(x7) / f8) + 1.0f) * 100.0f), this.mScrollerDuration);
    }

    private void judgeOpenClose(int i8, int i9) {
        if (this.mSwipeCurrentHorizontal != null) {
            if (Math.abs(getScrollX()) < this.mSwipeCurrentHorizontal.getMenuView().getWidth() * this.mOpenPercent) {
                smoothCloseMenu();
                return;
            }
            if (Math.abs(i8) > this.mScaledTouchSlop || Math.abs(i9) > this.mScaledTouchSlop) {
                if (isMenuOpenNotEqual()) {
                    smoothCloseMenu();
                    return;
                } else {
                    smoothOpenMenu();
                    return;
                }
            }
            if (isMenuOpen()) {
                smoothCloseMenu();
            } else {
                smoothOpenMenu();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        c cVar;
        if (!this.mScroller.computeScrollOffset() || (cVar = this.mSwipeCurrentHorizontal) == null) {
            return;
        }
        if (cVar instanceof h) {
            scrollTo(Math.abs(this.mScroller.getCurrX()), 0);
            invalidate();
        } else {
            scrollTo(-Math.abs(this.mScroller.getCurrX()), 0);
            invalidate();
        }
    }

    float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((float) ((f8 - 0.5f) * 0.4712389167638204d));
    }

    public float getOpenPercent() {
        return this.mOpenPercent;
    }

    public boolean hasLeftMenu() {
        d dVar = this.mSwipeLeftHorizontal;
        return dVar != null && dVar.canSwipe();
    }

    public boolean hasRightMenu() {
        h hVar = this.mSwipeRightHorizontal;
        return hVar != null && hVar.canSwipe();
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isCompleteOpen() {
        return isLeftCompleteOpen() || isRightMenuOpen();
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isLeftCompleteOpen() {
        d dVar = this.mSwipeLeftHorizontal;
        return (dVar == null || dVar.isCompleteClose(getScrollX())) ? false : true;
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isLeftMenuOpen() {
        d dVar = this.mSwipeLeftHorizontal;
        return dVar != null && dVar.isMenuOpen(getScrollX());
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isLeftMenuOpenNotEqual() {
        d dVar = this.mSwipeLeftHorizontal;
        return dVar != null && dVar.isMenuOpenNotEqual(getScrollX());
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isMenuOpen() {
        return isLeftMenuOpen() || isRightMenuOpen();
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isMenuOpenNotEqual() {
        return isLeftMenuOpenNotEqual() || isRightMenuOpenNotEqual();
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isRightCompleteOpen() {
        h hVar = this.mSwipeRightHorizontal;
        return (hVar == null || hVar.isCompleteClose(getScrollX())) ? false : true;
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isRightMenuOpen() {
        h hVar = this.mSwipeRightHorizontal;
        return hVar != null && hVar.isMenuOpen(getScrollX());
    }

    @Override // com.yanzhenjie.recyclerview.b
    public boolean isRightMenuOpenNotEqual() {
        h hVar = this.mSwipeRightHorizontal;
        return hVar != null && hVar.isMenuOpenNotEqual(getScrollX());
    }

    public boolean isSwipeEnable() {
        return this.swipeEnable;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.mLeftViewId;
        if (i8 != 0 && this.mSwipeLeftHorizontal == null) {
            this.mSwipeLeftHorizontal = new d(findViewById(i8));
        }
        int i9 = this.mRightViewId;
        if (i9 != 0 && this.mSwipeRightHorizontal == null) {
            this.mSwipeRightHorizontal = new h(findViewById(i9));
        }
        int i10 = this.mContentViewId;
        if (i10 != 0 && this.mContentView == null) {
            this.mContentView = findViewById(i10);
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setClickable(true);
        textView.setGravity(17);
        textView.setTextSize(16.0f);
        textView.setText("You may not have set the ContentView.");
        this.mContentView = textView;
        addView(textView);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (!isSwipeEnable()) {
            return onInterceptTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            int x7 = (int) motionEvent.getX();
            this.mLastX = x7;
            this.mDownX = x7;
            this.mDownY = (int) motionEvent.getY();
            return false;
        }
        if (action == 1) {
            c cVar = this.mSwipeCurrentHorizontal;
            boolean z7 = cVar != null && cVar.isClickOnContentView(getWidth(), motionEvent.getX());
            if (!isMenuOpen() || !z7) {
                return false;
            }
            smoothCloseMenu();
            return true;
        }
        if (action == 2) {
            int x8 = (int) (motionEvent.getX() - this.mDownX);
            return Math.abs(x8) > this.mScaledTouchSlop && Math.abs(x8) > Math.abs((int) (motionEvent.getY() - ((float) this.mDownY)));
        }
        if (action != 3) {
            return onInterceptTouchEvent;
        }
        if (!this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        View view = this.mContentView;
        if (view != null) {
            int measuredWidthAndState = view.getMeasuredWidthAndState();
            int measuredHeightAndState = this.mContentView.getMeasuredHeightAndState();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mContentView.getLayoutParams();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() + layoutParams.topMargin;
            this.mContentView.layout(paddingLeft, paddingTop, measuredWidthAndState + paddingLeft, measuredHeightAndState + paddingTop);
        }
        d dVar = this.mSwipeLeftHorizontal;
        if (dVar != null) {
            View menuView = dVar.getMenuView();
            int measuredWidthAndState2 = menuView.getMeasuredWidthAndState();
            int measuredHeightAndState2 = menuView.getMeasuredHeightAndState();
            int paddingTop2 = getPaddingTop() + ((FrameLayout.LayoutParams) menuView.getLayoutParams()).topMargin;
            menuView.layout(-measuredWidthAndState2, paddingTop2, 0, measuredHeightAndState2 + paddingTop2);
        }
        h hVar = this.mSwipeRightHorizontal;
        if (hVar != null) {
            View menuView2 = hVar.getMenuView();
            int measuredWidthAndState3 = menuView2.getMeasuredWidthAndState();
            int measuredHeightAndState3 = menuView2.getMeasuredHeightAndState();
            int paddingTop3 = getPaddingTop() + ((FrameLayout.LayoutParams) menuView2.getLayoutParams()).topMargin;
            int measuredWidthAndState4 = getMeasuredWidthAndState();
            menuView2.layout(measuredWidthAndState4, paddingTop3, measuredWidthAndState3 + measuredWidthAndState4, measuredHeightAndState3 + paddingTop3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isSwipeEnable()) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastX = (int) motionEvent.getX();
            this.mLastY = (int) motionEvent.getY();
        } else if (action == 1) {
            int x7 = (int) (this.mDownX - motionEvent.getX());
            int y7 = (int) (this.mDownY - motionEvent.getY());
            this.mDragging = false;
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mScaledMaximumFlingVelocity);
            int xVelocity = (int) this.mVelocityTracker.getXVelocity();
            int abs = Math.abs(xVelocity);
            if (abs <= this.mScaledMinimumFlingVelocity) {
                judgeOpenClose(x7, y7);
            } else if (this.mSwipeCurrentHorizontal != null) {
                int swipeDuration = getSwipeDuration(motionEvent, abs);
                if (this.mSwipeCurrentHorizontal instanceof h) {
                    if (xVelocity < 0) {
                        smoothOpenMenu(swipeDuration);
                    } else {
                        smoothCloseMenu(swipeDuration);
                    }
                } else if (xVelocity > 0) {
                    smoothOpenMenu(swipeDuration);
                } else {
                    smoothCloseMenu(swipeDuration);
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
            this.mVelocityTracker.clear();
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            if (Math.abs(this.mDownX - motionEvent.getX()) > this.mScaledTouchSlop || Math.abs(this.mDownY - motionEvent.getY()) > this.mScaledTouchSlop || isLeftMenuOpen() || isRightMenuOpen()) {
                motionEvent.setAction(3);
                super.onTouchEvent(motionEvent);
                return true;
            }
        } else if (action == 2) {
            int x8 = (int) (this.mLastX - motionEvent.getX());
            int y8 = (int) (this.mLastY - motionEvent.getY());
            if (!this.mDragging && Math.abs(x8) > this.mScaledTouchSlop && Math.abs(x8) > Math.abs(y8)) {
                this.mDragging = true;
            }
            if (this.mDragging) {
                if (this.mSwipeCurrentHorizontal == null || this.shouldResetSwipe) {
                    if (x8 < 0) {
                        d dVar = this.mSwipeLeftHorizontal;
                        if (dVar != null) {
                            this.mSwipeCurrentHorizontal = dVar;
                        } else {
                            this.mSwipeCurrentHorizontal = this.mSwipeRightHorizontal;
                        }
                    } else {
                        h hVar = this.mSwipeRightHorizontal;
                        if (hVar != null) {
                            this.mSwipeCurrentHorizontal = hVar;
                        } else {
                            this.mSwipeCurrentHorizontal = this.mSwipeLeftHorizontal;
                        }
                    }
                }
                scrollBy(x8, 0);
                this.mLastX = (int) motionEvent.getX();
                this.mLastY = (int) motionEvent.getY();
                this.shouldResetSwipe = false;
            }
        } else if (action == 3) {
            this.mDragging = false;
            if (this.mScroller.isFinished()) {
                judgeOpenClose((int) (this.mDownX - motionEvent.getX()), (int) (this.mDownY - motionEvent.getY()));
            } else {
                this.mScroller.abortAnimation();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        c cVar = this.mSwipeCurrentHorizontal;
        if (cVar == null) {
            super.scrollTo(i8, i9);
            return;
        }
        c.a checkXY = cVar.checkXY(i8, i9);
        this.shouldResetSwipe = checkXY.shouldResetSwipe;
        if (checkXY.f16618x != getScrollX()) {
            super.scrollTo(checkXY.f16618x, checkXY.f16619y);
        }
    }

    public void setOpenPercent(float f8) {
        this.mOpenPercent = f8;
    }

    public void setScrollerDuration(int i8) {
        this.mScrollerDuration = i8;
    }

    public void setSwipeEnable(boolean z7) {
        this.swipeEnable = z7;
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothCloseLeftMenu() {
        d dVar = this.mSwipeLeftHorizontal;
        if (dVar != null) {
            this.mSwipeCurrentHorizontal = dVar;
            smoothCloseMenu();
        }
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothCloseMenu() {
        smoothCloseMenu(this.mScrollerDuration);
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothCloseRightMenu() {
        h hVar = this.mSwipeRightHorizontal;
        if (hVar != null) {
            this.mSwipeCurrentHorizontal = hVar;
            smoothCloseMenu();
        }
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothOpenLeftMenu() {
        smoothOpenLeftMenu(this.mScrollerDuration);
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothOpenMenu() {
        smoothOpenMenu(this.mScrollerDuration);
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothOpenRightMenu() {
        smoothOpenRightMenu(this.mScrollerDuration);
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void smoothOpenMenu(int i8) {
        c cVar = this.mSwipeCurrentHorizontal;
        if (cVar != null) {
            cVar.autoOpenMenu(this.mScroller, getScrollX(), i8);
            invalidate();
        }
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothCloseMenu(int i8) {
        c cVar = this.mSwipeCurrentHorizontal;
        if (cVar != null) {
            cVar.autoCloseMenu(this.mScroller, getScrollX(), i8);
            invalidate();
        }
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothOpenLeftMenu(int i8) {
        d dVar = this.mSwipeLeftHorizontal;
        if (dVar != null) {
            this.mSwipeCurrentHorizontal = dVar;
            smoothOpenMenu(i8);
        }
    }

    @Override // com.yanzhenjie.recyclerview.b
    public void smoothOpenRightMenu(int i8) {
        h hVar = this.mSwipeRightHorizontal;
        if (hVar != null) {
            this.mSwipeCurrentHorizontal = hVar;
            smoothOpenMenu(i8);
        }
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mLeftViewId = 0;
        this.mContentViewId = 0;
        this.mRightViewId = 0;
        this.mOpenPercent = 0.5f;
        this.mScrollerDuration = 200;
        this.swipeEnable = true;
        setClickable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwipeMenuLayout);
        this.mLeftViewId = obtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_leftViewId, this.mLeftViewId);
        this.mContentViewId = obtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_contentViewId, this.mContentViewId);
        this.mRightViewId = obtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_rightViewId, this.mRightViewId);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mScaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mScroller = new OverScroller(getContext());
    }
}
