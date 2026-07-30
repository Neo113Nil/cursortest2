package androidx.swiperefreshlayout.widget;

import I.C0121q;
import I.C0123t;
import I.InterfaceC0122s;
import I.T;
import I.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;
import p0.AbstractC0817a;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup implements InterfaceC0122s, r {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    static final int CIRCLE_DIAMETER = 40;
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "l";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private i mChildScrollUpCallback;
    private int mCircleDiameter;
    a mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    j mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final C0121q mNestedScrollingChildHelper;
    private final C0123t mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    e mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new f(this, 0);
        this.mAnimateToCorrectPosition = new h(this, 0);
        this.mAnimateToStartPosition = new h(this, 4);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f7 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(AbstractC0817a.f7151a);
        aVar.f4026e = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = T.f1153a;
        aVar.setElevation(f7 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f4026e);
        aVar.setBackground(shapeDrawable);
        this.mCircleView = aVar;
        e eVar = new e(getContext());
        this.mProgress = eVar;
        eVar.c(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i2;
        this.mTotalDragDistance = i2;
        this.mNestedScrollingParentHelper = new C0123t();
        this.mNestedScrollingChildHelper = new C0121q(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i5;
        this.mOriginalOffsetTop = i5;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.mCircleView.getBackground().setAlpha(i2);
        this.mProgress.setAlpha(i2);
    }

    public final void a() {
        if (this.mTarget == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public final void b(float f7) {
        if (f7 > this.mTotalDragDistance) {
            d(true, true);
            return;
        }
        this.mRefreshing = false;
        e eVar = this.mProgress;
        d dVar = eVar.f4054d;
        dVar.f4035e = 0.0f;
        dVar.f4036f = 0.0f;
        eVar.invalidateSelf();
        boolean z7 = this.mScale;
        f fVar = !z7 ? new f(this, 1) : null;
        int i2 = this.mCurrentTargetOffsetTop;
        if (z7) {
            this.mFrom = i2;
            this.mStartingScale = this.mCircleView.getScaleX();
            h hVar = new h(this, 1);
            this.mScaleDownToStartAnimation = hVar;
            hVar.setDuration(150L);
            if (fVar != null) {
                this.mCircleView.f4025d = fVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
        } else {
            this.mFrom = i2;
            this.mAnimateToStartPosition.reset();
            this.mAnimateToStartPosition.setDuration(200L);
            this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
            if (fVar != null) {
                this.mCircleView.f4025d = fVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToStartPosition);
        }
        e eVar2 = this.mProgress;
        d dVar2 = eVar2.f4054d;
        if (dVar2.f4043n) {
            dVar2.f4043n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void c(float f7) {
        Animation animation;
        Animation animation2;
        e eVar = this.mProgress;
        d dVar = eVar.f4054d;
        if (!dVar.f4043n) {
            dVar.f4043n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f7 / this.mTotalDragDistance));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f7) - this.mTotalDragDistance;
        int i2 = this.mCustomSlingshotDistance;
        if (i2 <= 0) {
            i2 = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f8 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f8 * DECELERATE_INTERPOLATION_FACTOR) / f8) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i5 = this.mOriginalOffsetTop + ((int) ((f8 * min) + (f8 * pow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f7 / this.mTotalDragDistance));
        }
        if (f7 < this.mTotalDragDistance) {
            if (this.mProgress.f4054d.f4049t > STARTING_PROGRESS_ALPHA && ((animation2 = this.mAlphaStartAnimation) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                g gVar = new g(this, this.mProgress.f4054d.f4049t, STARTING_PROGRESS_ALPHA);
                gVar.setDuration(300L);
                a aVar = this.mCircleView;
                aVar.f4025d = null;
                aVar.clearAnimation();
                this.mCircleView.startAnimation(gVar);
                this.mAlphaStartAnimation = gVar;
            }
        } else if (this.mProgress.f4054d.f4049t < MAX_ALPHA && ((animation = this.mAlphaMaxAnimation) == null || !animation.hasStarted() || animation.hasEnded())) {
            g gVar2 = new g(this, this.mProgress.f4054d.f4049t, MAX_ALPHA);
            gVar2.setDuration(300L);
            a aVar2 = this.mCircleView;
            aVar2.f4025d = null;
            aVar2.clearAnimation();
            this.mCircleView.startAnimation(gVar2);
            this.mAlphaMaxAnimation = gVar2;
        }
        float f9 = max * MAX_PROGRESS_ANGLE;
        e eVar2 = this.mProgress;
        float min2 = Math.min(MAX_PROGRESS_ANGLE, f9);
        d dVar2 = eVar2.f4054d;
        dVar2.f4035e = 0.0f;
        dVar2.f4036f = min2;
        eVar2.invalidateSelf();
        e eVar3 = this.mProgress;
        float min3 = Math.min(1.0f, max);
        d dVar3 = eVar3.f4054d;
        if (min3 != dVar3.f4045p) {
            dVar3.f4045p = min3;
        }
        eVar3.invalidateSelf();
        float f10 = ((pow * DECELERATE_INTERPOLATION_FACTOR) + ((max * 0.4f) - 0.25f)) * DRAG_RATE;
        e eVar4 = this.mProgress;
        eVar4.f4054d.f4037g = f10;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i5 - this.mCurrentTargetOffsetTop);
    }

    public boolean canChildScrollUp() {
        i iVar = this.mChildScrollUpCallback;
        if (iVar != null) {
            return iVar.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void d(boolean z7, boolean z8) {
        if (this.mRefreshing != z7) {
            this.mNotify = z8;
            a();
            this.mRefreshing = z7;
            if (!z7) {
                startScaleDownAnimation(this.mRefreshListener);
                return;
            }
            int i2 = this.mCurrentTargetOffsetTop;
            Animation.AnimationListener animationListener = this.mRefreshListener;
            this.mFrom = i2;
            this.mAnimateToCorrectPosition.reset();
            this.mAnimateToCorrectPosition.setDuration(200L);
            this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
            if (animationListener != null) {
                this.mCircleView.f4025d = animationListener;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.mNestedScrollingChildHelper.a(f7, f8, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.mNestedScrollingChildHelper.b(f7, f8);
    }

    public boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2, int i7) {
        return i7 == 0 && dispatchNestedPreScroll(i2, i5, iArr, iArr2);
    }

    public void dispatchNestedScroll(int i2, int i5, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        if (i9 == 0) {
            this.mNestedScrollingChildHelper.d(i2, i5, i7, i8, iArr, i9, iArr2);
        }
    }

    public final void e(float f7) {
        float f8 = this.mInitialDownY;
        float f9 = f7 - f8;
        int i2 = this.mTouchSlop;
        if (f9 <= i2 || this.mIsBeingDragged) {
            return;
        }
        this.mInitialMotionY = f8 + i2;
        this.mIsBeingDragged = true;
        this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i5) {
        int i7 = this.mCircleViewIndex;
        return i7 < 0 ? i5 : i5 == i2 + (-1) ? i7 : i5 >= i7 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0123t c0123t = this.mNestedScrollingParentHelper;
        return c0123t.f1237b | c0123t.f1236a;
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public boolean hasNestedScrollingParent(int i2) {
        return i2 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f1232d;
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f7) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f7))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i2 = this.mActivePointerId;
                        if (i2 == -1) {
                            Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            e(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                                this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.mIsBeingDragged;
                }
                this.mIsBeingDragged = false;
                this.mActivePointerId = -1;
                return this.mIsBeingDragged;
            }
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.mInitialDownY = motionEvent.getY(findPointerIndex2);
                return this.mIsBeingDragged;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i9 = measuredWidth / 2;
        int i10 = measuredWidth2 / 2;
        int i11 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i9 - i10, i11, i9 + i10, measuredHeight2 + i11);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) == this.mCircleView) {
                this.mCircleViewIndex = i7;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        return dispatchNestedFling(f7, f8, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // I.r
    public void onNestedPreScroll(View view, int i2, int i5, int[] iArr, int i7) {
        if (i7 == 0) {
            onNestedPreScroll(view, i2, i5, iArr);
        }
    }

    @Override // I.InterfaceC0122s
    public void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9, int[] iArr) {
        if (i9 != 0) {
            return;
        }
        int i10 = iArr[1];
        dispatchNestedScroll(i2, i5, i7, i8, this.mParentOffsetInWindow, i9, iArr);
        int i11 = i8 - (iArr[1] - i10);
        if ((i11 == 0 ? i8 + this.mParentOffsetInWindow[1] : i11) >= 0 || canChildScrollUp()) {
            return;
        }
        float abs = this.mTotalUnconsumed + Math.abs(r14);
        this.mTotalUnconsumed = abs;
        c(abs);
        iArr[1] = iArr[1] + i11;
    }

    @Override // I.r
    public void onNestedScrollAccepted(View view, View view2, int i2, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f4067d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.mRefreshing);
    }

    @Override // I.r
    public boolean onStartNestedScroll(View view, View view2, int i2, int i5) {
        if (i5 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    @Override // I.r
    public void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
            if (actionMasked == 0) {
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsBeingDragged = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y7 = (motionEvent.getY(findPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                    this.mIsBeingDragged = false;
                    b(y7);
                }
                this.mActivePointerId = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y8 = motionEvent.getY(findPointerIndex2);
                e(y8);
                if (this.mIsBeingDragged) {
                    float f7 = (y8 - this.mInitialMotionY) * DRAG_RATE;
                    if (f7 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        c(f7);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.mActivePointerId = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        ViewParent parent;
        View view = this.mTarget;
        if (view != null) {
            WeakHashMap weakHashMap = T.f1153a;
            if (!view.isNestedScrollingEnabled()) {
                if (this.mEnableLegacyRequestDisallowInterceptTouch || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z7);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(MAX_ALPHA);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f7) {
        this.mCircleView.setScaleX(f7);
        this.mCircleView.setScaleY(f7);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        a();
        e eVar = this.mProgress;
        d dVar = eVar.f4054d;
        dVar.f4039i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = context.getColor(iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.mTotalDragDistance = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (z7) {
            return;
        }
        reset();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z7) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z7;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C0121q c0121q = this.mNestedScrollingChildHelper;
        if (c0121q.f1232d) {
            ViewGroup viewGroup = c0121q.f1231c;
            WeakHashMap weakHashMap = T.f1153a;
            viewGroup.stopNestedScroll();
        }
        c0121q.f1232d = z7;
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.mChildScrollUpCallback = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.mListener = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.mCircleView.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i2));
    }

    public void setProgressViewEndTarget(boolean z7, int i2) {
        this.mSpinnerOffsetEnd = i2;
        this.mScale = z7;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z7, int i2, int i5) {
        this.mScale = z7;
        this.mOriginalOffsetTop = i2;
        this.mSpinnerOffsetEnd = i5;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z7) {
        if (!z7 || this.mRefreshing == z7) {
            d(z7, false);
            return;
        }
        this.mRefreshing = z7;
        setTargetOffsetTopAndBottom((!this.mUsingCustomStart ? this.mSpinnerOffsetEnd + this.mOriginalOffsetTop : this.mSpinnerOffsetEnd) - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        Animation.AnimationListener animationListener = this.mRefreshListener;
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(MAX_ALPHA);
        h hVar = new h(this, 2);
        this.mScaleAnimation = hVar;
        hVar.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.f4025d = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.c(i2);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.mCustomSlingshotDistance = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.mCircleView.bringToFront();
        a aVar = this.mCircleView;
        WeakHashMap weakHashMap = T.f1153a;
        aVar.offsetTopAndBottom(i2);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public boolean startNestedScroll(int i2, int i5) {
        return i5 == 0 && startNestedScroll(i2);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        h hVar = new h(this, 3);
        this.mScaleDownAnimation = hVar;
        hVar.setDuration(150L);
        a aVar = this.mCircleView;
        aVar.f4025d = animationListener;
        aVar.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    public void stopNestedScroll(int i2) {
        if (i2 == 0) {
            stopNestedScroll();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i2, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.f(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
        if (i5 > 0) {
            float f7 = this.mTotalUnconsumed;
            if (f7 > 0.0f) {
                float f8 = i5;
                if (f8 > f7) {
                    iArr[1] = (int) f7;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f7 - f8;
                    iArr[1] = i5;
                }
                c(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i5 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i5 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i2 - iArr[0], i5 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.mNestedScrollingParentHelper.f1236a = i2;
        startNestedScroll(i2 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.f1236a = 0;
        this.mNestedScrollInProgress = false;
        float f7 = this.mTotalUnconsumed;
        if (f7 > 0.0f) {
            b(f7);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.mNestedScrollingChildHelper.g(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.h(0);
    }

    public boolean dispatchNestedScroll(int i2, int i5, int i7, int i8, int[] iArr, int i9) {
        return i9 == 0 && this.mNestedScrollingChildHelper.d(i2, i5, i7, i8, iArr, i9, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i5, int i7, int i8, int[] iArr) {
        return this.mNestedScrollingChildHelper.d(i2, i5, i7, i8, iArr, 0, null);
    }

    @Override // I.r
    public void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9) {
        onNestedScroll(view, i2, i5, i7, i8, i9, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i5, int i7, int i8) {
        onNestedScroll(view, i2, i5, i7, i8, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
