package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i8, int i9) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i8, int i9) {
            return 0;
        }

        public int getOrderedChildIndex(int i8) {
            return i8;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i8, int i9) {
        }

        public boolean onEdgeLock(int i8) {
            return false;
        }

        public void onEdgeTouched(int i8, int i9) {
        }

        public void onViewCaptured(@NonNull View view, int i8) {
        }

        public void onViewDragStateChanged(int i8) {
        }

        public void onViewPositionChanged(@NonNull View view, int i8, int i9, @Px int i10, @Px int i11) {
        }

        public void onViewReleased(@NonNull View view, float f8, float f9) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i8);
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.mParentView = viewGroup;
        this.mCallback = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i8 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mDefaultEdgeSize = i8;
        this.mEdgeSize = i8;
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(context, sInterpolator);
    }

    private boolean checkNewEdgeDrag(float f8, float f9, int i8, int i9) {
        float abs = Math.abs(f8);
        float abs2 = Math.abs(f9);
        if ((this.mInitialEdgesTouched[i8] & i9) != i9 || (this.mTrackingEdges & i9) == 0 || (this.mEdgeDragsLocked[i8] & i9) == i9 || (this.mEdgeDragsInProgress[i8] & i9) == i9) {
            return false;
        }
        int i10 = this.mTouchSlop;
        if (abs <= i10 && abs2 <= i10) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.mCallback.onEdgeLock(i9)) {
            return (this.mEdgeDragsInProgress[i8] & i9) == 0 && abs > ((float) this.mTouchSlop);
        }
        int[] iArr = this.mEdgeDragsLocked;
        iArr[i8] = iArr[i8] | i9;
        return false;
    }

    private boolean checkTouchSlop(View view, float f8, float f9) {
        if (view == null) {
            return false;
        }
        boolean z7 = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z8 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (!z7 || !z8) {
            return z7 ? Math.abs(f8) > ((float) this.mTouchSlop) : z8 && Math.abs(f9) > ((float) this.mTouchSlop);
        }
        float f10 = (f8 * f8) + (f9 * f9);
        int i8 = this.mTouchSlop;
        return f10 > ((float) (i8 * i8));
    }

    private int clampMag(int i8, int i9, int i10) {
        int abs = Math.abs(i8);
        if (abs < i9) {
            return 0;
        }
        return abs > i10 ? i8 > 0 ? i10 : -i10 : i8;
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }

    private int computeAxisDuration(int i8, int i9, int i10) {
        if (i8 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f8 = width / 2;
        float distanceInfluenceForSnapDuration = f8 + (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i8) / width)) * f8);
        int abs = Math.abs(i9);
        return Math.min(abs > 0 ? Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / i10) + 1.0f) * 256.0f), 600);
    }

    private int computeSettleDuration(View view, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        float f10;
        float f11;
        int clampMag = clampMag(i10, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i11, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i8);
        int abs2 = Math.abs(i9);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i12 = abs3 + abs4;
        int i13 = abs + abs2;
        if (clampMag != 0) {
            f8 = abs3;
            f9 = i12;
        } else {
            f8 = abs;
            f9 = i13;
        }
        float f12 = f8 / f9;
        if (clampMag2 != 0) {
            f10 = abs4;
            f11 = i12;
        } else {
            f10 = abs2;
            f11 = i13;
        }
        return (int) ((computeAxisDuration(i8, clampMag, this.mCallback.getViewHorizontalDragRange(view)) * f12) + (computeAxisDuration(i9, clampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f10 / f11)));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f8, float f9) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f8, f9);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i8, int i9, int i10, int i11) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i10 != 0) {
            i8 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i8, i10);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i8 - left);
        }
        int i12 = i8;
        if (i11 != 0) {
            i9 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i9, i11);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i9 - top);
        }
        int i13 = i9;
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i12, i13, i12 - left, i13 - top);
    }

    private void ensureMotionHistorySizeForId(int i8) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i8) {
            int i9 = i8 + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i8, int i9, int i10, int i11) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i12 = i8 - left;
        int i13 = i9 - top;
        if (i12 == 0 && i13 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i12, i13, computeSettleDuration(this.mCapturedView, i12, i13, i10, i11));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i8, int i9) {
        int i10 = i8 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i9 < this.mParentView.getTop() + this.mEdgeSize) {
            i10 |= 4;
        }
        if (i8 > this.mParentView.getRight() - this.mEdgeSize) {
            i10 |= 2;
        }
        return i9 > this.mParentView.getBottom() - this.mEdgeSize ? i10 | 8 : i10;
    }

    private boolean isValidPointerForActionMove(int i8) {
        if (isPointerDown(i8)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    private void reportNewEdgeDrags(float f8, float f9, int i8) {
        boolean checkNewEdgeDrag = checkNewEdgeDrag(f8, f9, i8, 1);
        boolean z7 = checkNewEdgeDrag;
        if (checkNewEdgeDrag(f9, f8, i8, 4)) {
            z7 = (checkNewEdgeDrag ? 1 : 0) | 4;
        }
        boolean z8 = z7;
        if (checkNewEdgeDrag(f8, f9, i8, 2)) {
            z8 = (z7 ? 1 : 0) | 2;
        }
        ?? r02 = z8;
        if (checkNewEdgeDrag(f9, f8, i8, 8)) {
            r02 = (z8 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i8] = iArr[i8] | r02;
            this.mCallback.onEdgeDragStarted(r02, i8);
        }
    }

    private void saveInitialMotion(float f8, float f9, int i8) {
        ensureMotionHistorySizeForId(i8);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i8] = f8;
        fArr[i8] = f8;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i8] = f9;
        fArr2[i8] = f9;
        this.mInitialEdgesTouched[i8] = getEdgesTouched((int) f8, (int) f9);
        this.mPointersDown |= 1 << i8;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (isValidPointerForActionMove(pointerId)) {
                float x7 = motionEvent.getX(i8);
                float y7 = motionEvent.getY(i8);
                this.mLastMotionX[pointerId] = x7;
                this.mLastMotionY[pointerId] = y7;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    protected boolean canScroll(@NonNull View view, boolean z7, int i8, int i9, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && canScroll(childAt, true, i8, i9, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z7 && (view.canScrollHorizontally(-i8) || view.canScrollVertically(-i9));
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(@NonNull View view, int i8) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i8;
            this.mCallback.onViewCaptured(view, i8);
            setDragState(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean continueSettling(boolean z7) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (left != 0 || top != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
            }
            if (z7) {
                this.mParentView.post(this.mSetIdleRunnable);
            } else {
                setDragState(0);
            }
        }
        return this.mDragState == 2;
    }

    @Nullable
    public View findTopChildUnder(int i8, int i9) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i8, int i9, int i10, int i11) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i8, i10, i9, i11);
        setDragState(2);
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.mDefaultEdgeSize;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i8, int i9) {
        return isViewUnder(this.mCapturedView, i8, i9);
    }

    public boolean isEdgeTouched(int i8) {
        int length = this.mInitialEdgesTouched.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (isEdgeTouched(i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i8) {
        return ((1 << i8) & this.mPointersDown) != 0;
    }

    public boolean isViewUnder(@Nullable View view, int i8, int i9) {
        return view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r9.mActivePointerId == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        releaseViewForPointerUp();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View findTopChildUnder = findTopChildUnder((int) x7, (int) y7);
            saveInitialMotion(x7, y7, pointerId);
            tryCaptureViewForDrag(findTopChildUnder, pointerId);
            int i9 = this.mInitialEdgesTouched[pointerId];
            int i10 = this.mTrackingEdges;
            if ((i9 & i10) != 0) {
                this.mCallback.onEdgeTouched(i9 & i10, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.mDragState == 1) {
                if (isValidPointerForActionMove(this.mActivePointerId)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    float x8 = motionEvent.getX(findPointerIndex);
                    float y8 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.mLastMotionX;
                    int i11 = this.mActivePointerId;
                    int i12 = (int) (x8 - fArr[i11]);
                    int i13 = (int) (y8 - this.mLastMotionY[i11]);
                    dragTo(this.mCapturedView.getLeft() + i12, this.mCapturedView.getTop() + i13, i12, i13);
                    saveLastMotion(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i8 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i8);
                if (isValidPointerForActionMove(pointerId2)) {
                    float x9 = motionEvent.getX(i8);
                    float y9 = motionEvent.getY(i8);
                    float f8 = x9 - this.mInitialMotionX[pointerId2];
                    float f9 = y9 - this.mInitialMotionY[pointerId2];
                    reportNewEdgeDrags(f8, f9, pointerId2);
                    if (this.mDragState != 1) {
                        View findTopChildUnder2 = findTopChildUnder((int) x9, (int) y9);
                        if (checkTouchSlop(findTopChildUnder2, f8, f9) && tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i8++;
            }
            saveLastMotion(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.mDragState == 1) {
                dispatchViewReleased(0.0f, 0.0f);
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            saveInitialMotion(x10, y10, pointerId3);
            if (this.mDragState != 0) {
                if (isCapturedViewUnder((int) x10, (int) y10)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    return;
                }
                return;
            } else {
                tryCaptureViewForDrag(findTopChildUnder((int) x10, (int) y10), pointerId3);
                int i14 = this.mInitialEdgesTouched[pointerId3];
                int i15 = this.mTrackingEdges;
                if ((i14 & i15) != 0) {
                    this.mCallback.onEdgeTouched(i14 & i15, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i8 >= pointerCount2) {
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i8);
                if (pointerId5 != this.mActivePointerId) {
                    View findTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                    View view = this.mCapturedView;
                    if (findTopChildUnder3 == view && tryCaptureViewForDrag(view, pointerId5)) {
                    }
                }
                i8++;
            }
        }
        clearMotionHistory(pointerId4);
    }

    void setDragState(int i8) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i8) {
            this.mDragState = i8;
            this.mCallback.onViewDragStateChanged(i8);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int i8) {
        this.mEdgeSize = i8;
    }

    public void setEdgeTrackingEnabled(int i8) {
        this.mTrackingEdges = i8;
    }

    public void setMinVelocity(float f8) {
        this.mMinVelocity = f8;
    }

    public boolean settleCapturedViewAt(int i8, int i9) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i8, i9, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z7;
        View findTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x7 = motionEvent.getX(actionIndex);
                            float y7 = motionEvent.getY(actionIndex);
                            saveInitialMotion(x7, y7, pointerId);
                            int i8 = this.mDragState;
                            if (i8 == 0) {
                                int i9 = this.mInitialEdgesTouched[pointerId];
                                int i10 = this.mTrackingEdges;
                                if ((i9 & i10) != 0) {
                                    this.mCallback.onEdgeTouched(i9 & i10, pointerId);
                                }
                            } else if (i8 == 2 && (findTopChildUnder = findTopChildUnder((int) x7, (int) y7)) == this.mCapturedView) {
                                tryCaptureViewForDrag(findTopChildUnder, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            clearMotionHistory(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.mInitialMotionX != null && this.mInitialMotionY != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (isValidPointerForActionMove(pointerId2)) {
                            float x8 = motionEvent.getX(i11);
                            float y8 = motionEvent.getY(i11);
                            float f8 = x8 - this.mInitialMotionX[pointerId2];
                            float f9 = y8 - this.mInitialMotionY[pointerId2];
                            View findTopChildUnder2 = findTopChildUnder((int) x8, (int) y8);
                            boolean z8 = findTopChildUnder2 != null && checkTouchSlop(findTopChildUnder2, f8, f9);
                            if (z8) {
                                int left = findTopChildUnder2.getLeft();
                                int i12 = (int) f8;
                                int clampViewPositionHorizontal = this.mCallback.clampViewPositionHorizontal(findTopChildUnder2, left + i12, i12);
                                int top = findTopChildUnder2.getTop();
                                int i13 = (int) f9;
                                int clampViewPositionVertical = this.mCallback.clampViewPositionVertical(findTopChildUnder2, top + i13, i13);
                                int viewHorizontalDragRange = this.mCallback.getViewHorizontalDragRange(findTopChildUnder2);
                                int viewVerticalDragRange = this.mCallback.getViewVerticalDragRange(findTopChildUnder2);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            reportNewEdgeDrags(f8, f9, pointerId2);
                            if (this.mDragState == 1) {
                                break;
                            }
                            if (z8 && tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    saveLastMotion(motionEvent);
                }
                z7 = false;
            }
            cancel();
            z7 = false;
        } else {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            z7 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            saveInitialMotion(x9, y9, pointerId3);
            View findTopChildUnder3 = findTopChildUnder((int) x9, (int) y9);
            if (findTopChildUnder3 == this.mCapturedView && this.mDragState == 2) {
                tryCaptureViewForDrag(findTopChildUnder3, pointerId3);
            }
            int i14 = this.mInitialEdgesTouched[pointerId3];
            int i15 = this.mTrackingEdges;
            if ((i14 & i15) != 0) {
                this.mCallback.onEdgeTouched(i14 & i15, pointerId3);
            }
        }
        if (this.mDragState == 1) {
            return true;
        }
        return z7;
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i8, int i9) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i8, i9, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    boolean tryCaptureViewForDrag(View view, int i8) {
        if (view == this.mCapturedView && this.mActivePointerId == i8) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i8)) {
            return false;
        }
        this.mActivePointerId = i8;
        captureChildView(view, i8);
        return true;
    }

    private float clampMag(float f8, float f9, float f10) {
        float abs = Math.abs(f8);
        if (abs < f9) {
            return 0.0f;
        }
        return abs > f10 ? f8 > 0.0f ? f10 : -f10 : f8;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f8, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (create.mTouchSlop * (1.0f / f8));
        return create;
    }

    public boolean isEdgeTouched(int i8, int i9) {
        return isPointerDown(i9) && (i8 & this.mInitialEdgesTouched[i9]) != 0;
    }

    public boolean checkTouchSlop(int i8) {
        int length = this.mInitialMotionX.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (checkTouchSlop(i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i8, int i9) {
        if (!isPointerDown(i9)) {
            return false;
        }
        boolean z7 = (i8 & 1) == 1;
        boolean z8 = (i8 & 2) == 2;
        float f8 = this.mLastMotionX[i9] - this.mInitialMotionX[i9];
        float f9 = this.mLastMotionY[i9] - this.mInitialMotionY[i9];
        if (!z7 || !z8) {
            return z7 ? Math.abs(f8) > ((float) this.mTouchSlop) : z8 && Math.abs(f9) > ((float) this.mTouchSlop);
        }
        float f10 = (f8 * f8) + (f9 * f9);
        int i10 = this.mTouchSlop;
        return f10 > ((float) (i10 * i10));
    }

    private void clearMotionHistory(int i8) {
        if (this.mInitialMotionX == null || !isPointerDown(i8)) {
            return;
        }
        this.mInitialMotionX[i8] = 0.0f;
        this.mInitialMotionY[i8] = 0.0f;
        this.mLastMotionX[i8] = 0.0f;
        this.mLastMotionY[i8] = 0.0f;
        this.mInitialEdgesTouched[i8] = 0;
        this.mEdgeDragsInProgress[i8] = 0;
        this.mEdgeDragsLocked[i8] = 0;
        this.mPointersDown = (~(1 << i8)) & this.mPointersDown;
    }
}
