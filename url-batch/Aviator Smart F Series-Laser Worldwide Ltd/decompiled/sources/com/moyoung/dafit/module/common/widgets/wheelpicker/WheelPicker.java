package com.moyoung.dafit.module.common.widgets.wheelpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.moyoung.dafit.module.common.R$array;
import com.moyoung.dafit.module.common.R$dimen;
import com.moyoung.dafit.module.common.R$styleable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class WheelPicker extends View implements com.moyoung.dafit.module.common.widgets.wheelpicker.a, com.moyoung.dafit.module.common.widgets.wheelpicker.b, Runnable {
    public static final int ALIGN_CENTER = 0;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SCROLLING = 2;
    private static final String TAG = "WheelPicker";
    private String fontPath;
    private boolean hasAtmospheric;
    private boolean hasCurtain;
    private boolean hasIndicator;
    private boolean hasSameWidth;
    private boolean isClick;
    private boolean isCurved;
    private boolean isCyclic;
    private boolean isDebug;
    private boolean isForceFinishScroll;
    private boolean isTouchTriggered;
    private Camera mCamera;
    private int mCurrentItemPosition;
    private int mCurtainColor;
    private List mData;
    private int mDownPointY;
    private int mDrawnCenterX;
    private int mDrawnCenterY;
    private int mDrawnItemCount;
    private int mHalfDrawnItemCount;
    private int mHalfItemHeight;
    private int mHalfWheelHeight;
    private final Handler mHandler;
    private int mIndicatorColor;
    private int mIndicatorSize;
    private int mItemAlign;
    private int mItemHeight;
    private int mItemSpace;
    private int mItemTextColor;
    private int mItemTextSize;
    private int mLastPointY;
    private Matrix mMatrixDepth;
    private Matrix mMatrixRotate;
    private int mMaxFlingY;
    private String mMaxWidthText;
    private int mMaximumVelocity;
    private int mMinFlingY;
    private int mMinimumVelocity;
    private a mOnItemSelectedListener;
    private b mOnWheelChangeListener;
    private Paint mPaint;
    private Rect mRectCurrentItem;
    private Rect mRectDrawn;
    private Rect mRectIndicatorFoot;
    private Rect mRectIndicatorHead;
    private int mScrollOffsetY;
    private Scroller mScroller;
    private int mSelectedItemPosition;
    private int mSelectedItemTextColor;
    private int mTextMaxHeight;
    private int mTextMaxWidth;
    private int mTextMaxWidthPosition;
    private int mTouchSlop;
    private VelocityTracker mTracker;
    private int mVisibleItemCount;
    private int mWheelCenterX;
    private int mWheelCenterY;

    public interface a {
        void onItemSelected(WheelPicker wheelPicker, Object obj, int i8);
    }

    public interface b {
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    private void computeCurrentItemRect() {
        if (this.hasCurtain || this.mSelectedItemTextColor != -1) {
            Rect rect = this.mRectCurrentItem;
            Rect rect2 = this.mRectDrawn;
            int i8 = rect2.left;
            int i9 = this.mWheelCenterY;
            int i10 = this.mHalfItemHeight;
            rect.set(i8, i9 - i10, rect2.right, i9 + i10);
        }
    }

    private int computeDepth(int i8) {
        return (int) (this.mHalfWheelHeight - (Math.cos(Math.toRadians(i8)) * this.mHalfWheelHeight));
    }

    private int computeDistanceToEndPoint(int i8) {
        if (Math.abs(i8) > this.mHalfItemHeight) {
            return (this.mScrollOffsetY < 0 ? -this.mItemHeight : this.mItemHeight) - i8;
        }
        return -i8;
    }

    private void computeDrawnCenter() {
        int i8 = this.mItemAlign;
        if (i8 == 1) {
            this.mDrawnCenterX = this.mRectDrawn.left;
        } else if (i8 != 2) {
            this.mDrawnCenterX = this.mWheelCenterX;
        } else {
            this.mDrawnCenterX = this.mRectDrawn.right;
        }
        this.mDrawnCenterY = (int) (this.mWheelCenterY - ((this.mPaint.ascent() + this.mPaint.descent()) / 2.0f));
    }

    private void computeFlingLimitY() {
        int i8 = this.mSelectedItemPosition;
        int i9 = this.mItemHeight;
        int i10 = i8 * i9;
        this.mMinFlingY = this.isCyclic ? Integer.MIN_VALUE : ((-i9) * (this.mData.size() - 1)) + i10;
        if (this.isCyclic) {
            i10 = Integer.MAX_VALUE;
        }
        this.mMaxFlingY = i10;
    }

    private void computeIndicatorRect() {
        if (this.hasIndicator) {
            int i8 = this.mIndicatorSize / 2;
            int i9 = this.mWheelCenterY;
            int i10 = this.mHalfItemHeight;
            int i11 = i9 + i10;
            int i12 = i9 - i10;
            Rect rect = this.mRectIndicatorHead;
            Rect rect2 = this.mRectDrawn;
            rect.set(rect2.left, i11 - i8, rect2.right, i11 + i8);
            Rect rect3 = this.mRectIndicatorFoot;
            Rect rect4 = this.mRectDrawn;
            rect3.set(rect4.left, i12 - i8, rect4.right, i12 + i8);
        }
    }

    private int computeSpace(int i8) {
        return (int) (Math.sin(Math.toRadians(i8)) * this.mHalfWheelHeight);
    }

    private void computeTextSize() {
        this.mTextMaxHeight = 0;
        this.mTextMaxWidth = 0;
        if (this.hasSameWidth) {
            this.mTextMaxWidth = (int) this.mPaint.measureText(String.valueOf(this.mData.get(0)));
        } else if (isPosInRang(this.mTextMaxWidthPosition)) {
            this.mTextMaxWidth = (int) this.mPaint.measureText(String.valueOf(this.mData.get(this.mTextMaxWidthPosition)));
        } else if (TextUtils.isEmpty(this.mMaxWidthText)) {
            Iterator it = this.mData.iterator();
            while (it.hasNext()) {
                this.mTextMaxWidth = Math.max(this.mTextMaxWidth, (int) this.mPaint.measureText(String.valueOf(it.next())));
            }
        } else {
            this.mTextMaxWidth = (int) this.mPaint.measureText(this.mMaxWidthText);
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        this.mTextMaxHeight = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    private boolean isPosInRang(int i8) {
        return i8 >= 0 && i8 < this.mData.size();
    }

    private int measureSize(int i8, int i9, int i10) {
        return i8 == 1073741824 ? i9 : i8 == Integer.MIN_VALUE ? Math.min(i10, i9) : i10;
    }

    private void updateItemTextAlign() {
        int i8 = this.mItemAlign;
        if (i8 == 1) {
            this.mPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i8 != 2) {
            this.mPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            this.mPaint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    private void updateVisibleItemCount() {
        int i8 = this.mVisibleItemCount;
        if (i8 < 2) {
            throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
        }
        if (i8 % 2 == 0) {
            this.mVisibleItemCount = i8 + 1;
        }
        int i9 = this.mVisibleItemCount + 2;
        this.mDrawnItemCount = i9;
        this.mHalfDrawnItemCount = i9 / 2;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getCurrentItemPosition() {
        return this.mCurrentItemPosition;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getCurtainColor() {
        return this.mCurtainColor;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public List getData() {
        return this.mData;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getIndicatorColor() {
        return this.mIndicatorColor;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getIndicatorSize() {
        return this.mIndicatorSize;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemAlign() {
        return this.mItemAlign;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemSpace() {
        return this.mItemSpace;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemTextColor() {
        return this.mItemTextColor;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemTextSize() {
        return this.mItemTextSize;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public String getMaximumWidthText() {
        return this.mMaxWidthText;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getMaximumWidthTextPosition() {
        return this.mTextMaxWidthPosition;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getSelectedItemPosition() {
        return this.mSelectedItemPosition;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getSelectedItemTextColor() {
        return this.mSelectedItemTextColor;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public Typeface getTypeface() {
        Paint paint = this.mPaint;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getVisibleItemCount() {
        return this.mVisibleItemCount;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasAtmospheric() {
        return this.hasAtmospheric;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasCurtain() {
        return this.hasCurtain;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasIndicator() {
        return this.hasIndicator;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasSameWidth() {
        return this.hasSameWidth;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean isCurved() {
        return this.isCurved;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean isCyclic() {
        return this.isCyclic;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        String valueOf;
        int i8;
        if (this.mData.size() == 0) {
            return;
        }
        int i9 = (-this.mScrollOffsetY) / this.mItemHeight;
        int i10 = this.mHalfDrawnItemCount;
        int i11 = i9 - i10;
        int i12 = this.mSelectedItemPosition + i11;
        int i13 = -i10;
        while (i12 < this.mSelectedItemPosition + i11 + this.mDrawnItemCount) {
            if (this.isCyclic) {
                int size = i12 % this.mData.size();
                if (size < 0) {
                    size += this.mData.size();
                }
                valueOf = String.valueOf(this.mData.get(size));
            } else {
                valueOf = isPosInRang(i12) ? String.valueOf(this.mData.get(i12)) : "";
            }
            this.mPaint.setColor(this.mItemTextColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            int i14 = this.mDrawnCenterY;
            int i15 = this.mItemHeight;
            int i16 = (i13 * i15) + i14 + (this.mScrollOffsetY % i15);
            if (this.isCurved) {
                int abs = i14 - Math.abs(i14 - i16);
                int i17 = this.mRectDrawn.top;
                int i18 = this.mDrawnCenterY;
                float f8 = (-(1.0f - (((abs - i17) * 1.0f) / (i18 - i17)))) * 90.0f * (i16 > i18 ? 1 : i16 < i18 ? -1 : 0);
                if (f8 < -90.0f) {
                    f8 = -90.0f;
                }
                float f9 = f8 <= 90.0f ? f8 : 90.0f;
                i8 = computeSpace((int) f9);
                int i19 = this.mWheelCenterX;
                int i20 = this.mItemAlign;
                if (i20 == 1) {
                    i19 = this.mRectDrawn.left;
                } else if (i20 == 2) {
                    i19 = this.mRectDrawn.right;
                }
                int i21 = this.mWheelCenterY - i8;
                this.mCamera.save();
                this.mCamera.rotateX(f9);
                this.mCamera.getMatrix(this.mMatrixRotate);
                this.mCamera.restore();
                float f10 = -i19;
                float f11 = -i21;
                this.mMatrixRotate.preTranslate(f10, f11);
                float f12 = i19;
                float f13 = i21;
                this.mMatrixRotate.postTranslate(f12, f13);
                this.mCamera.save();
                this.mCamera.translate(0.0f, 0.0f, computeDepth(r2));
                this.mCamera.getMatrix(this.mMatrixDepth);
                this.mCamera.restore();
                this.mMatrixDepth.preTranslate(f10, f11);
                this.mMatrixDepth.postTranslate(f12, f13);
                this.mMatrixRotate.postConcat(this.mMatrixDepth);
            } else {
                i8 = 0;
            }
            if (this.hasAtmospheric) {
                int i22 = this.mDrawnCenterY;
                int abs2 = (int) ((((i22 - Math.abs(i22 - i16)) * 1.0f) / this.mDrawnCenterY) * 255.0f);
                this.mPaint.setAlpha(abs2 < 0 ? 0 : abs2);
            }
            if (this.isCurved) {
                i16 = this.mDrawnCenterY - i8;
            }
            if (this.mSelectedItemTextColor != -1) {
                canvas.save();
                if (this.isCurved) {
                    canvas.concat(this.mMatrixRotate);
                }
                canvas.clipRect(this.mRectCurrentItem, Region.Op.DIFFERENCE);
                float f14 = i16;
                canvas.drawText(valueOf, this.mDrawnCenterX, f14, this.mPaint);
                canvas.restore();
                this.mPaint.setColor(this.mSelectedItemTextColor);
                canvas.save();
                if (this.isCurved) {
                    canvas.concat(this.mMatrixRotate);
                }
                canvas.clipRect(this.mRectCurrentItem);
                canvas.drawText(valueOf, this.mDrawnCenterX, f14, this.mPaint);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.mRectDrawn);
                if (this.isCurved) {
                    canvas.concat(this.mMatrixRotate);
                }
                canvas.drawText(valueOf, this.mDrawnCenterX, i16, this.mPaint);
                canvas.restore();
            }
            if (this.isDebug) {
                canvas.save();
                canvas.clipRect(this.mRectDrawn);
                this.mPaint.setColor(-1166541);
                int i23 = this.mWheelCenterY + (this.mItemHeight * i13);
                Rect rect = this.mRectDrawn;
                float f15 = i23;
                canvas.drawLine(rect.left, f15, rect.right, f15, this.mPaint);
                this.mPaint.setColor(-13421586);
                this.mPaint.setStyle(Paint.Style.STROKE);
                int i24 = i23 - this.mHalfItemHeight;
                Rect rect2 = this.mRectDrawn;
                canvas.drawRect(rect2.left, i24, rect2.right, i24 + this.mItemHeight, this.mPaint);
                canvas.restore();
            }
            i12++;
            i13++;
        }
        if (this.hasCurtain) {
            this.mPaint.setColor(this.mCurtainColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.mRectCurrentItem, this.mPaint);
        }
        if (this.hasIndicator) {
            this.mPaint.setColor(this.mIndicatorColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.mRectIndicatorHead, this.mPaint);
            canvas.drawRect(this.mRectIndicatorFoot, this.mPaint);
        }
        if (this.isDebug) {
            this.mPaint.setColor(1144254003);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(0.0f, 0.0f, getPaddingLeft(), getHeight(), this.mPaint);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getPaddingTop(), this.mPaint);
            canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, getWidth(), getHeight(), this.mPaint);
            canvas.drawRect(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight(), this.mPaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int i10 = this.mTextMaxWidth;
        int i11 = this.mTextMaxHeight;
        int i12 = this.mVisibleItemCount;
        int i13 = (i11 * i12) + (this.mItemSpace * (i12 - 1));
        if (this.isCurved) {
            i13 = (int) ((i13 * 2) / 3.141592653589793d);
        }
        if (this.isDebug) {
            Log.i(TAG, "Wheel's content size is (" + i10 + ":" + i13 + ")");
        }
        int paddingLeft = i10 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i13 + getPaddingTop() + getPaddingBottom();
        if (this.isDebug) {
            Log.i(TAG, "Wheel's size is (" + paddingLeft + ":" + paddingTop + ")");
        }
        setMeasuredDimension(measureSize(mode, size, paddingLeft), measureSize(mode2, size2, paddingTop));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        this.mRectDrawn.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.isDebug) {
            Log.i(TAG, "Wheel's drawn rect size is (" + this.mRectDrawn.width() + ":" + this.mRectDrawn.height() + ") and location is (" + this.mRectDrawn.left + ":" + this.mRectDrawn.top + ")");
        }
        this.mWheelCenterX = this.mRectDrawn.centerX();
        this.mWheelCenterY = this.mRectDrawn.centerY();
        computeDrawnCenter();
        this.mHalfWheelHeight = this.mRectDrawn.height() / 2;
        int height = this.mRectDrawn.height() / this.mVisibleItemCount;
        this.mItemHeight = height;
        this.mHalfItemHeight = height / 2;
        computeFlingLimitY();
        computeIndicatorRect();
        computeCurrentItemRect();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isTouchTriggered = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker == null) {
                this.mTracker = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.mTracker.addMovement(motionEvent);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                this.isForceFinishScroll = true;
            }
            int y7 = (int) motionEvent.getY();
            this.mLastPointY = y7;
            this.mDownPointY = y7;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.isClick || this.isForceFinishScroll) {
                this.mTracker.addMovement(motionEvent);
                this.mTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                this.isForceFinishScroll = false;
                int yVelocity = (int) this.mTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.mMinimumVelocity) {
                    this.mScroller.fling(0, this.mScrollOffsetY, 0, yVelocity, 0, 0, this.mMinFlingY, this.mMaxFlingY);
                    Scroller scroller = this.mScroller;
                    scroller.setFinalY(scroller.getFinalY() + computeDistanceToEndPoint(this.mScroller.getFinalY() % this.mItemHeight));
                } else {
                    Scroller scroller2 = this.mScroller;
                    int i8 = this.mScrollOffsetY;
                    scroller2.startScroll(0, i8, 0, computeDistanceToEndPoint(i8 % this.mItemHeight));
                }
                if (!this.isCyclic) {
                    int finalY = this.mScroller.getFinalY();
                    int i9 = this.mMaxFlingY;
                    if (finalY > i9) {
                        this.mScroller.setFinalY(i9);
                    } else {
                        int finalY2 = this.mScroller.getFinalY();
                        int i10 = this.mMinFlingY;
                        if (finalY2 < i10) {
                            this.mScroller.setFinalY(i10);
                        }
                    }
                }
                this.mHandler.post(this);
                VelocityTracker velocityTracker2 = this.mTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.mTracker = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.mTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mTracker = null;
                }
            }
        } else if (Math.abs(this.mDownPointY - motionEvent.getY()) < this.mTouchSlop) {
            this.isClick = true;
        } else {
            this.isClick = false;
            this.mTracker.addMovement(motionEvent);
            float y8 = motionEvent.getY() - this.mLastPointY;
            if (Math.abs(y8) >= 1.0f) {
                this.mScrollOffsetY = (int) (this.mScrollOffsetY + y8);
                this.mLastPointY = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.mData;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.mScroller.isFinished() && !this.isForceFinishScroll) {
            int i8 = this.mItemHeight;
            if (i8 == 0) {
                return;
            }
            int size = (((-this.mScrollOffsetY) / i8) + this.mSelectedItemPosition) % this.mData.size();
            if (size < 0) {
                size += this.mData.size();
            }
            if (this.isDebug) {
                Log.i(TAG, size + ":" + this.mData.get(size) + ":" + this.mScrollOffsetY);
            }
            this.mCurrentItemPosition = size;
            a aVar = this.mOnItemSelectedListener;
            if (aVar != null && this.isTouchTriggered) {
                aVar.onItemSelected(this, this.mData.get(size), size);
            }
        }
        if (this.mScroller.computeScrollOffset()) {
            this.mScrollOffsetY = this.mScroller.getCurrY();
            postInvalidate();
            this.mHandler.postDelayed(this, 16L);
        }
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setAtmospheric(boolean z7) {
        this.hasAtmospheric = z7;
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurtain(boolean z7) {
        this.hasCurtain = z7;
        computeCurrentItemRect();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurtainColor(int i8) {
        this.mCurtainColor = i8;
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurved(boolean z7) {
        this.isCurved = z7;
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCyclic(boolean z7) {
        this.isCyclic = z7;
        computeFlingLimitY();
        invalidate();
    }

    public void setData(List list) {
        if (list == null) {
            throw new NullPointerException("WheelPicker's data can not be null!");
        }
        this.mData = list;
        if (this.mSelectedItemPosition > list.size() - 1 || this.mCurrentItemPosition > list.size() - 1) {
            int size = list.size() - 1;
            this.mCurrentItemPosition = size;
            this.mSelectedItemPosition = size;
        } else {
            this.mSelectedItemPosition = this.mCurrentItemPosition;
        }
        this.mScrollOffsetY = 0;
        computeTextSize();
        computeFlingLimitY();
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.a
    public void setDebug(boolean z7) {
        this.isDebug = z7;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicator(boolean z7) {
        this.hasIndicator = z7;
        computeIndicatorRect();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicatorColor(int i8) {
        this.mIndicatorColor = i8;
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicatorSize(int i8) {
        this.mIndicatorSize = i8;
        computeIndicatorRect();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemAlign(int i8) {
        this.mItemAlign = i8;
        updateItemTextAlign();
        computeDrawnCenter();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemSpace(int i8) {
        this.mItemSpace = i8;
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemTextColor(int i8) {
        this.mItemTextColor = i8;
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemTextSize(int i8) {
        this.mItemTextSize = i8;
        this.mPaint.setTextSize(i8);
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setMaximumWidthText(String str) {
        if (str == null) {
            throw new NullPointerException("Maximum width text can not be null!");
        }
        this.mMaxWidthText = str;
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setMaximumWidthTextPosition(int i8) {
        if (isPosInRang(i8)) {
            this.mTextMaxWidthPosition = i8;
            computeTextSize();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.mData.size() + "), but current is " + i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setOnItemSelectedListener(a aVar) {
        this.mOnItemSelectedListener = aVar;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setOnWheelChangeListener(b bVar) {
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setSameWidth(boolean z7) {
        this.hasSameWidth = z7;
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setSelectedItemPosition(int i8) {
        setSelectedItemPosition(i8, false);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setSelectedItemTextColor(int i8) {
        this.mSelectedItemTextColor = i8;
        computeCurrentItemRect();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setTypeface(Typeface typeface) {
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        computeTextSize();
        requestLayout();
        invalidate();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setVisibleItemCount(int i8) {
        this.mVisibleItemCount = i8;
        updateVisibleItemCount();
        requestLayout();
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandler = new Handler();
        this.mMinimumVelocity = 50;
        this.mMaximumVelocity = 8000;
        this.mTouchSlop = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.WheelPicker_wheel_data, 0);
        this.mData = Arrays.asList(getResources().getStringArray(resourceId == 0 ? R$array.WheelArrayDefault : resourceId));
        this.mItemTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(R$dimen.WheelItemTextSize));
        this.mVisibleItemCount = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_visible_item_count, 7);
        this.mSelectedItemPosition = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_selected_item_position, 0);
        this.hasSameWidth = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_same_width, false);
        this.mTextMaxWidthPosition = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_maximum_width_text_position, -1);
        this.mMaxWidthText = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_maximum_width_text);
        this.mSelectedItemTextColor = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_selected_item_text_color, -1);
        this.mItemTextColor = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_item_text_color, -7829368);
        this.mItemSpace = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(R$dimen.WheelItemSpace));
        this.isCyclic = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_cyclic, false);
        this.hasIndicator = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_indicator, false);
        this.mIndicatorColor = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_indicator_color, -1166541);
        this.mIndicatorSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(R$dimen.WheelIndicatorSize));
        this.hasCurtain = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curtain, false);
        this.mCurtainColor = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_curtain_color, -1996488705);
        this.hasAtmospheric = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_atmospheric, false);
        this.isCurved = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curved, false);
        this.mItemAlign = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_item_align, 0);
        this.fontPath = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_font_path);
        obtainStyledAttributes.recycle();
        updateVisibleItemCount();
        Paint paint = new Paint(69);
        this.mPaint = paint;
        paint.setTextSize(this.mItemTextSize);
        if (this.fontPath != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.fontPath));
        }
        updateItemTextAlign();
        computeTextSize();
        this.mScroller = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mRectDrawn = new Rect();
        this.mRectIndicatorHead = new Rect();
        this.mRectIndicatorFoot = new Rect();
        this.mRectCurrentItem = new Rect();
        this.mCamera = new Camera();
        this.mMatrixRotate = new Matrix();
        this.mMatrixDepth = new Matrix();
    }

    public void setSelectedItemPosition(int i8, boolean z7) {
        this.isTouchTriggered = false;
        if (!z7 || !this.mScroller.isFinished()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
            }
            int max = Math.max(Math.min(i8, this.mData.size() - 1), 0);
            this.mSelectedItemPosition = max;
            this.mCurrentItemPosition = max;
            this.mScrollOffsetY = 0;
            computeFlingLimitY();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i9 = i8 - this.mCurrentItemPosition;
        if (i9 == 0) {
            return;
        }
        if (this.isCyclic && Math.abs(i9) > size / 2) {
            if (i9 > 0) {
                size = -size;
            }
            i9 += size;
        }
        Scroller scroller = this.mScroller;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i9) * this.mItemHeight);
        this.mHandler.post(this);
    }
}
