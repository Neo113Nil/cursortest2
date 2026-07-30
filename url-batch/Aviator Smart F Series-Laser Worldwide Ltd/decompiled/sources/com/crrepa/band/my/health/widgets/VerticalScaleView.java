package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$styleable;
import com.realsil.sdk.dfu.DfuConstants;

/* loaded from: classes2.dex */
public class VerticalScaleView extends View {
    private static final int WHAT_MINUS = 2;
    private static final int WHAT_PLUS = 1;
    private static final int WHAT_STOP = 3;
    private boolean isShowBaseLine;
    private int mBaseLineColor;
    private int mBaseLineMarginBottom;
    private float mBaseLineWidth;
    private Canvas mCanvas;
    float mChangeIndex;
    float mCurPosX;
    float mCurPosY;
    float mCurPosY_ing;
    int mDirection;
    private boolean mFontIsTop;
    private int mFontMarginBottom;
    private int mFontMarginTop;
    public Handler mHandler;
    private int mHeight;
    private int mHighFrequency;
    private int mHighPointerMargin;
    private int mHighScaleColor;
    private float mHighScaleWidth;
    private boolean mIsShowPointerHead;
    private int mLeftLineCount;
    private int mLeftMarginLeft;
    private int mLineInterval;
    private int mLowPointerMargin;
    private int mLowScaleColor;
    private float mLowScaleWidth;
    private float mMaxIndex;
    private int mMaxVelocity;
    private int mMiddleFrequency;
    private int mMiddlePointerMargin;
    private int mMiddleScaleColor;
    private float mMiddleScaleWidth;
    private float mMinIndex;
    private float mNowIndex;
    private int mNumColor;
    private final Paint mPaint;
    private final Path mPath;
    private boolean mPointerBottomProtruding;
    private int mPointerColor;
    private float mPointerHead;
    private boolean mPointerIsTop;
    private int mPointerMarginTop;
    private int mPointerPosition;
    private boolean mPointerTopProtruding;
    private float mPointerWidth;
    private float[] mPointsHighLeft;
    private float[] mPointsHighRight;
    private float[] mPointsLowLeft;
    private float[] mPointsLowRight;
    private float[] mPointsMiddleLeft;
    private float[] mPointsMiddleRight;
    float mPosX;
    float mPosY;
    private int mRealLeftLineCount;
    private int mRealRightLineCount;
    private int mRightLineCount;
    private int mRightMarginRight;
    private int mScalePosition;
    private float mScaleRatio;
    private int mScaleValue;
    private double mSlidingRatio;
    private Paint.Cap mStrokeCap;
    private float mTextSize;
    private int mUnits;
    private VelocityTracker mVelocityTracker;
    private int mWidth;
    private b onScaleChangeListener;
    private String textFormat;
    float x_down;
    private int yVelocity;
    float y_down;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                VerticalScaleView.this.setPlusScale();
                return false;
            }
            if (i8 == 2) {
                VerticalScaleView.this.setMinusScale();
                return false;
            }
            if (i8 != 3) {
                return false;
            }
            VerticalScaleView.this.mHandler.removeMessages(1);
            VerticalScaleView.this.mHandler.removeMessages(2);
            return false;
        }
    }

    public interface b {
        void OnChange(double d8);
    }

    public VerticalScaleView(Context context) {
        super(context);
        this.mMinIndex = 100.0f;
        this.mMaxIndex = 5000.0f;
        this.mNowIndex = 100.0f;
        this.mScaleValue = 1;
        this.mTextSize = 28.0f;
        this.mPointerWidth = 4.0f;
        this.mPointerHead = 30.0f;
        this.mPointerIsTop = true;
        this.mPointerTopProtruding = false;
        this.mPointerBottomProtruding = false;
        this.mIsShowPointerHead = false;
        this.mBaseLineWidth = 5.0f;
        this.mLowScaleWidth = 2.0f;
        this.mMiddleScaleWidth = 2.0f;
        this.mHighScaleWidth = 3.0f;
        this.mLineInterval = 8;
        this.mBaseLineMarginBottom = 28;
        this.mPointerMarginTop = 0;
        this.mLeftMarginLeft = 0;
        this.mRightMarginRight = 0;
        this.mFontMarginBottom = 0;
        this.mFontMarginTop = 40;
        this.mLowPointerMargin = 39;
        this.mMiddlePointerMargin = 39;
        this.mHighPointerMargin = 16;
        this.mMiddleFrequency = 5;
        this.mHighFrequency = 10;
        this.mBaseLineColor = ContextCompat.getColor(getContext(), R.color.white);
        this.mHighScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mMiddleScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mLowScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mNumColor = ContextCompat.getColor(getContext(), R.color.assist_7_B3);
        this.mPointerColor = ContextCompat.getColor(getContext(), R.color.red);
        this.mFontIsTop = false;
        this.mScaleRatio = 10.0f;
        this.mSlidingRatio = 0.5d;
        this.isShowBaseLine = false;
        this.mScalePosition = 2;
        this.mUnits = 500;
        this.mMaxVelocity = DfuConstants.MAX_CALLBACK_LOCK_WAIT_TIME;
        this.mStrokeCap = Paint.Cap.SQUARE;
        this.mPosX = 0.0f;
        this.mPosY = 0.0f;
        this.mCurPosX = 0.0f;
        this.mCurPosY = 0.0f;
        this.mCurPosY_ing = 0.0f;
        this.mChangeIndex = 0.0f;
        this.mDirection = -1;
        this.textFormat = "%.1f";
        this.x_down = 0.0f;
        this.y_down = 0.0f;
        this.mPaint = new Paint();
        this.mPath = new Path();
        this.mHandler = new Handler(new a());
    }

    private void drawBaseLine() {
        this.mRealLeftLineCount = 0;
        this.mRealRightLineCount = 0;
        this.mPaint.setColor(this.mBaseLineColor);
        this.mPaint.setStrokeWidth(this.mBaseLineWidth);
        int i8 = this.mPointerPosition;
        int i9 = i8 - this.mLeftMarginLeft;
        int i10 = this.mLineInterval;
        this.mLeftLineCount = i9 / i10;
        this.mRightLineCount = ((this.mHeight - this.mRightMarginRight) - i8) / i10;
        float f8 = this.mNowIndex;
        for (int i11 = 0; i11 <= this.mLeftLineCount; i11++) {
            int i12 = this.mScaleValue;
            if (f8 - i12 >= this.mMinIndex) {
                this.mRealLeftLineCount = i11 + 1;
                f8 -= i12;
            }
        }
        float f9 = this.mNowIndex;
        for (int i13 = 0; i13 <= this.mRightLineCount; i13++) {
            int i14 = this.mScaleValue;
            if (i14 + f9 <= this.mMaxIndex) {
                this.mRealRightLineCount = i13 + 1;
                f9 += i14;
            }
        }
        int i15 = this.mPointerPosition;
        int i16 = this.mRealLeftLineCount;
        int i17 = this.mLineInterval;
        int i18 = i15 - (i16 * i17);
        int i19 = (this.mRealRightLineCount * i17) + i15;
        if (!this.isShowBaseLine) {
            this.mBaseLineWidth = 0.0f;
            return;
        }
        Canvas canvas = this.mCanvas;
        float f10 = i18;
        int i20 = this.mHeight;
        int i21 = this.mBaseLineMarginBottom;
        canvas.drawLine(f10, i20 - i21, i19, i20 - i21, this.mPaint);
    }

    private void drawLeftLine() {
        int i8;
        int i9 = this.mPointerPosition - (this.mRealLeftLineCount * this.mLineInterval);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = this.mRealLeftLineCount;
            if (i10 >= i8) {
                break;
            }
            float nowIndexValue = getNowIndexValue(i9);
            if (nowIndexValue % this.mHighFrequency == 0.0f) {
                i11++;
            } else if (nowIndexValue % this.mMiddleFrequency == 0.0f) {
                i12++;
            } else if (nowIndexValue % this.mScaleValue == 0.0f && nowIndexValue > this.mMinIndex) {
                i13++;
            }
            i9 += this.mLineInterval;
            i10++;
        }
        float[] fArr = this.mPointsHighLeft;
        if (fArr == null || fArr.length != i11 * 4) {
            this.mPointsHighLeft = new float[i11 * 4];
        }
        float[] fArr2 = this.mPointsMiddleLeft;
        if (fArr2 == null || fArr2.length != i12 * 4) {
            this.mPointsMiddleLeft = new float[i12 * 4];
        }
        float[] fArr3 = this.mPointsLowLeft;
        if (fArr3 == null || fArr3.length != i13 * 4) {
            this.mPointsLowLeft = new float[i13 * 4];
        }
        int i14 = this.mPointerPosition - (i8 * this.mLineInterval);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < this.mRealLeftLineCount; i18++) {
            float nowIndexValue2 = getNowIndexValue(i14);
            if (nowIndexValue2 % this.mHighFrequency == 0.0f) {
                for (int i19 = 0; i19 < 4; i19++) {
                    if (i19 % 2 != 0) {
                        this.mPointsHighLeft[i15] = i14;
                    } else if (i19 == 0) {
                        this.mPointsHighLeft[i15] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mHighPointerMargin);
                    } else {
                        this.mPointsHighLeft[i15] = this.mPointerMarginTop + getHighPointerMargin(false, this.mHighPointerMargin);
                    }
                    i15++;
                }
            } else if (nowIndexValue2 % this.mMiddleFrequency == 0.0f) {
                for (int i20 = 0; i20 < 4; i20++) {
                    if (i20 % 2 != 0) {
                        this.mPointsMiddleLeft[i16] = i14;
                    } else if (i20 == 0) {
                        this.mPointsMiddleLeft[i16] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mMiddlePointerMargin);
                    } else {
                        this.mPointsMiddleLeft[i16] = this.mPointerMarginTop + getHighPointerMargin(false, this.mMiddlePointerMargin);
                    }
                    i16++;
                }
            } else if (nowIndexValue2 % this.mScaleValue == 0.0f && nowIndexValue2 > this.mMinIndex) {
                for (int i21 = 0; i21 < 4; i21++) {
                    if (i21 % 2 != 0) {
                        this.mPointsLowLeft[i17] = i14;
                    } else if (i21 == 0) {
                        this.mPointsLowLeft[i17] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mLowPointerMargin);
                    } else {
                        this.mPointsLowLeft[i17] = this.mPointerMarginTop + getHighPointerMargin(false, this.mLowPointerMargin);
                    }
                    i17++;
                }
            }
            i14 += this.mLineInterval;
        }
        this.mPaint.setColor(this.mLowScaleColor);
        this.mPaint.setStrokeWidth(this.mLowScaleWidth);
        this.mCanvas.drawLines(this.mPointsLowLeft, this.mPaint);
        this.mPaint.setColor(this.mMiddleScaleColor);
        this.mPaint.setStrokeWidth(this.mMiddleScaleWidth);
        this.mCanvas.drawLines(this.mPointsMiddleLeft, this.mPaint);
        this.mPaint.setColor(this.mHighScaleColor);
        this.mPaint.setStrokeWidth(this.mHighScaleWidth);
        this.mCanvas.drawLines(this.mPointsHighLeft, this.mPaint);
    }

    private void drawNum() {
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mPaint.setTextSize(this.mTextSize);
        this.mPaint.setColor(this.mNumColor);
        float f8 = this.mWidth - this.mFontMarginBottom;
        if (!this.mFontIsTop) {
            f8 = this.mFontMarginTop;
        }
        onDrawRightNum(f8);
        onDrawLeftNum(f8);
        onDrawCenter(f8);
        b bVar = this.onScaleChangeListener;
        if (bVar != null) {
            bVar.OnChange(this.mNowIndex / this.mScaleRatio);
        }
    }

    private void drawPointer() {
        this.mPaint.setColor(this.mPointerColor);
        this.mPaint.setStrokeWidth(this.mPointerWidth);
        float f8 = this.mIsShowPointerHead ? this.mPointerHead + this.mPointerMarginTop : this.mPointerMarginTop;
        if (this.mPointerTopProtruding) {
            f8 -= this.mPointerMarginTop;
        }
        float f9 = f8;
        float highPointerMargin = ((this.mWidth - this.mBaseLineWidth) - this.mBaseLineMarginBottom) - getHighPointerMargin(true, this.mHighPointerMargin);
        if (this.mPointerBottomProtruding) {
            highPointerMargin += this.mBaseLineMarginBottom;
        }
        float f10 = highPointerMargin;
        if (this.mPointerIsTop) {
            Canvas canvas = this.mCanvas;
            int i8 = this.mPointerPosition;
            canvas.drawLine(f10, i8, f9, i8, this.mPaint);
            if (this.mIsShowPointerHead) {
                this.mPath.moveTo(this.mPointerPosition, this.mPointerMarginTop);
                Path path = this.mPath;
                float f11 = this.mPointerPosition;
                float f12 = this.mPointerHead;
                path.lineTo(f11 - (f12 / 2.0f), f12 + this.mPointerMarginTop);
                Path path2 = this.mPath;
                float f13 = this.mPointerPosition;
                float f14 = this.mPointerHead;
                path2.lineTo(f13 + (f14 / 2.0f), f14 + this.mPointerMarginTop);
                this.mPath.close();
                this.mCanvas.drawPath(this.mPath, this.mPaint);
                return;
            }
            return;
        }
        Canvas canvas2 = this.mCanvas;
        float f15 = this.mPointerHead;
        int i9 = this.mPointerPosition;
        canvas2.drawLine(f10 - f15, i9, f9 - f15, i9, this.mPaint);
        if (this.mIsShowPointerHead) {
            this.mPath.moveTo(this.mPointerPosition, f10);
            Path path3 = this.mPath;
            float f16 = this.mPointerPosition;
            float f17 = this.mPointerHead;
            path3.lineTo(f16 - (f17 / 2.0f), f10 - f17);
            Path path4 = this.mPath;
            float f18 = this.mPointerPosition;
            float f19 = this.mPointerHead;
            path4.lineTo(f18 + (f19 / 2.0f), f10 - f19);
            this.mPath.close();
            this.mCanvas.drawPath(this.mPath, this.mPaint);
        }
    }

    private void drawRightLine() {
        int i8;
        int i9 = this.mPointerPosition + (this.mRealRightLineCount * this.mLineInterval);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = this.mRealRightLineCount;
            if (i10 >= i8) {
                break;
            }
            float nowIndexValue = getNowIndexValue(i9);
            if (nowIndexValue % this.mHighFrequency == 0.0f) {
                i11++;
            } else if (nowIndexValue % this.mMiddleFrequency == 0.0f) {
                i12++;
            } else if (nowIndexValue % this.mScaleValue == 0.0f && nowIndexValue < this.mMaxIndex) {
                i13++;
            }
            i9 -= this.mLineInterval;
            i10++;
        }
        float[] fArr = this.mPointsHighRight;
        if (fArr == null || fArr.length != i11 * 4) {
            this.mPointsHighRight = new float[i11 * 4];
        }
        float[] fArr2 = this.mPointsMiddleRight;
        if (fArr2 == null || fArr2.length != i12 * 4) {
            this.mPointsMiddleRight = new float[i12 * 4];
        }
        float[] fArr3 = this.mPointsLowRight;
        if (fArr3 == null || fArr3.length != i13 * 4) {
            this.mPointsLowRight = new float[i13 * 4];
        }
        int i14 = this.mPointerPosition + (i8 * this.mLineInterval);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < this.mRealRightLineCount; i18++) {
            float nowIndexValue2 = getNowIndexValue(i14);
            if (nowIndexValue2 % this.mHighFrequency == 0.0f) {
                for (int i19 = 0; i19 < 4; i19++) {
                    if (i19 % 2 != 0) {
                        this.mPointsHighRight[i15] = i14;
                    } else if (i19 == 2) {
                        this.mPointsHighRight[i15] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mHighPointerMargin);
                    } else {
                        this.mPointsHighRight[i15] = this.mPointerMarginTop + getHighPointerMargin(false, this.mHighPointerMargin);
                    }
                    i15++;
                }
            } else if (nowIndexValue2 % this.mMiddleFrequency == 0.0f) {
                for (int i20 = 0; i20 < 4; i20++) {
                    if (i20 % 2 != 0) {
                        this.mPointsMiddleRight[i16] = i14;
                    } else if (i20 == 2) {
                        this.mPointsMiddleRight[i16] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mMiddlePointerMargin);
                    } else {
                        this.mPointsMiddleRight[i16] = this.mPointerMarginTop + getHighPointerMargin(false, this.mMiddlePointerMargin);
                    }
                    i16++;
                }
            } else if (nowIndexValue2 % this.mScaleValue == 0.0f && nowIndexValue2 < this.mMaxIndex) {
                for (int i21 = 0; i21 < 4; i21++) {
                    if (i21 % 2 != 0) {
                        this.mPointsLowRight[i17] = i14;
                    } else if (i21 == 2) {
                        this.mPointsLowRight[i17] = ((this.mWidth - this.mBaseLineMarginBottom) - this.mBaseLineWidth) - getHighPointerMargin(true, this.mLowPointerMargin);
                    } else {
                        this.mPointsLowRight[i17] = this.mPointerMarginTop + getHighPointerMargin(false, this.mLowPointerMargin);
                    }
                    i17++;
                }
            }
            i14 -= this.mLineInterval;
        }
        this.mPaint.setColor(this.mLowScaleColor);
        this.mPaint.setStrokeWidth(this.mLowScaleWidth);
        this.mCanvas.drawLines(this.mPointsLowRight, this.mPaint);
        this.mPaint.setColor(this.mMiddleScaleColor);
        this.mPaint.setStrokeWidth(this.mMiddleScaleWidth);
        this.mCanvas.drawLines(this.mPointsMiddleRight, this.mPaint);
        this.mPaint.setColor(this.mHighScaleColor);
        this.mPaint.setStrokeWidth(this.mHighScaleWidth);
        this.mCanvas.drawLines(this.mPointsHighRight, this.mPaint);
    }

    private void drawScale() {
        drawLeftLine();
        drawRightLine();
    }

    private int getHighPointerMargin(boolean z7, int i8) {
        int i9 = this.mScalePosition;
        if (i9 == 0) {
            if (z7) {
                return 0;
            }
            return i8;
        }
        if (i9 == 1 || z7) {
            return i8;
        }
        return 0;
    }

    private float getNowIndexValue(int i8) {
        return i8 < this.mPointerPosition ? this.mNowIndex - (((r0 - i8) / this.mLineInterval) * this.mScaleValue) : this.mNowIndex + (((i8 - r0) / this.mLineInterval) * this.mScaleValue);
    }

    private float getRealTextSize(float f8) {
        return TypedValue.applyDimension(1, f8, getResources().getDisplayMetrics());
    }

    private String getShowNum(float f8) {
        float f9 = this.mScaleRatio;
        return f9 == 1.0f ? String.format(this.textFormat, Float.valueOf(f8)) : String.format(this.textFormat, Float.valueOf(f8 / f9));
    }

    private void inertiaScroll(int i8) {
        double d8;
        double d9;
        int abs = Math.abs(i8);
        int i9 = this.mLineInterval;
        if (abs >= i9) {
            int i10 = abs / 3;
            if (i10 / i9 <= 0) {
                return;
            }
            int i11 = i10 / i9;
            int i12 = this.mUnits / i11;
            int i13 = i8 > 0 ? 2 : 1;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                this.mHandler.sendEmptyMessageDelayed(i13, i14);
                i14 += i12;
                double d10 = i15;
                double d11 = i11;
                if (d10 >= d11 * 0.5d) {
                    if (d10 < 0.6d * d11) {
                        d9 = 0.1d;
                    } else if (d10 < 0.7d * d11) {
                        d9 = 0.2d;
                    } else if (d10 < 0.8d * d11) {
                        d9 = 0.3d;
                    } else if (d10 < d11 * 0.9d) {
                        d9 = 0.4d;
                    } else {
                        d8 = d10 * 0.5d;
                        i14 += (int) d8;
                    }
                    d8 = d10 * d9;
                    i14 += (int) d8;
                }
            }
        }
    }

    private void initPaint() {
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeCap(this.mStrokeCap);
    }

    private void onDrawCenter(float f8) {
        float f9 = this.mPaint.getFontMetrics().descent + this.mPaint.getFontMetrics().ascent;
        float f10 = this.mNowIndex;
        if (f10 % this.mHighFrequency == 0.0f) {
            this.mCanvas.drawText(getShowNum(f10), f8, this.mPointerPosition - (f9 / 2.0f), this.mPaint);
        }
    }

    private void onDrawLeftNum(float f8) {
        float f9 = this.mPaint.getFontMetrics().descent + this.mPaint.getFontMetrics().ascent;
        int i8 = 0;
        while (true) {
            float[] fArr = this.mPointsHighLeft;
            if (i8 >= fArr.length) {
                return;
            }
            int i9 = i8 + 1;
            if (i9 % 4 == 0) {
                this.mCanvas.drawText(getShowNum(getNowIndexValue((int) fArr[i8])), f8, this.mPointsHighLeft[i8] - (f9 / 2.0f), this.mPaint);
            }
            i8 = i9;
        }
    }

    private void onDrawRightNum(float f8) {
        float f9 = this.mPaint.getFontMetrics().descent + this.mPaint.getFontMetrics().ascent;
        int i8 = 0;
        while (true) {
            float[] fArr = this.mPointsHighRight;
            if (i8 >= fArr.length) {
                return;
            }
            int i9 = i8 + 1;
            if (i9 % 4 == 0) {
                this.mCanvas.drawText(getShowNum(getNowIndexValue((int) fArr[i8])), f8, this.mPointsHighRight[i8] - (f9 / 2.0f), this.mPaint);
            }
            i8 = i9;
        }
    }

    private void refresh() {
        float f8 = this.mNowIndex;
        float f9 = this.mMinIndex;
        if (f8 < f9) {
            this.mNowIndex = f9;
            this.mHandler.sendEmptyMessage(3);
            return;
        }
        float f10 = this.mMaxIndex;
        if (f8 > f10) {
            this.mNowIndex = f10;
            this.mHandler.sendEmptyMessage(3);
        } else {
            invalidate();
            this.mCurPosY_ing = this.mCurPosY;
        }
    }

    private void setChangeNowIndex(int i8) {
        float abs = Math.abs(this.mPosY - this.mCurPosY);
        float abs2 = Math.abs(this.mChangeIndex - this.mCurPosY);
        double d8 = abs;
        int i9 = this.mLineInterval;
        double d9 = this.mSlidingRatio;
        if (d8 <= i9 * d9 || abs2 <= i9 * d9) {
            return;
        }
        if (i8 == 0) {
            this.mNowIndex += this.mScaleValue;
        } else if (i8 == 1) {
            this.mNowIndex -= this.mScaleValue;
        }
        this.mChangeIndex = this.mCurPosY;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.x_down = motionEvent.getX();
            this.y_down = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if (Math.abs(this.x_down - x7) <= this.mLineInterval || Math.abs(this.x_down - x7) <= Math.abs(this.y_down - y7)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public double getCurrentIndex() {
        return this.mNowIndex / this.mScaleRatio;
    }

    public float getMinIndex() {
        return this.mMinIndex / this.mScaleRatio;
    }

    public int getRealSize(int i8) {
        return (int) TypedValue.applyDimension(1, i8, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mVelocityTracker.recycle();
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mCanvas = canvas;
        initPaint();
        drawBaseLine();
        drawPointer();
        drawScale();
        drawNum();
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        this.mWidth = getWidth();
        int height = getHeight();
        this.mHeight = height;
        this.mPointerPosition = height / 2;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r0 != 3) goto L45;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mVelocityTracker.addMovement(motionEvent);
        this.mVelocityTracker.computeCurrentVelocity(this.mUnits, this.mMaxVelocity);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.mCurPosX = motionEvent.getX();
                    float y7 = motionEvent.getY();
                    this.mCurPosY = y7;
                    if (y7 >= 0.0f && y7 <= this.mHeight) {
                        float f8 = this.mCurPosX;
                        if (f8 >= 0.0f && f8 <= this.mWidth && y7 != this.mCurPosY_ing) {
                            float f9 = this.mPosY;
                            if (y7 - f9 <= 0.0f || Math.abs(y7 - f9) <= this.mLineInterval) {
                                float f10 = this.mCurPosY;
                                float f11 = this.mPosY;
                                if (f10 - f11 < 0.0f && Math.abs(f10 - f11) > this.mLineInterval) {
                                    this.mDirection = 0;
                                }
                            } else {
                                this.mDirection = 1;
                            }
                            int i8 = this.mDirection;
                            if (i8 == 0) {
                                float f12 = this.mCurPosY;
                                float f13 = this.mCurPosY_ing;
                                if (f12 > f13) {
                                    this.mPosY = f13;
                                    this.mDirection = 1;
                                    setChangeNowIndex(1);
                                } else {
                                    setChangeNowIndex(0);
                                }
                            } else if (i8 == 1) {
                                float f14 = this.mCurPosY;
                                float f15 = this.mCurPosY_ing;
                                if (f14 < f15) {
                                    this.mPosY = f15;
                                    this.mDirection = 0;
                                    setChangeNowIndex(0);
                                } else {
                                    setChangeNowIndex(1);
                                }
                            }
                            refresh();
                        }
                    }
                    return true;
                }
            }
            this.mDirection = -1;
            int yVelocity = (int) this.mVelocityTracker.getYVelocity();
            this.yVelocity = yVelocity;
            inertiaScroll(yVelocity);
        } else {
            this.mPosX = motionEvent.getX();
            this.mPosY = motionEvent.getY();
            this.mHandler.sendEmptyMessage(3);
        }
        return true;
    }

    public void setMaxIndex(float f8) {
        this.mMaxIndex = f8 * this.mScaleRatio;
    }

    public void setMinIndex(float f8) {
        this.mMinIndex = f8 * this.mScaleRatio;
    }

    public void setMinusScale() {
        this.mNowIndex -= this.mScaleValue;
        refresh();
    }

    public void setNowIndex(float f8) {
        this.mNowIndex = f8 * this.mScaleRatio;
        refresh();
    }

    public void setOnScaleChangeListener(b bVar) {
        this.onScaleChangeListener = bVar;
    }

    public void setPlusScale() {
        this.mNowIndex += this.mScaleValue;
        refresh();
    }

    public void setTextFormat(String str) {
        this.textFormat = str;
    }

    public VerticalScaleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinIndex = 100.0f;
        this.mMaxIndex = 5000.0f;
        this.mNowIndex = 100.0f;
        this.mScaleValue = 1;
        this.mTextSize = 28.0f;
        this.mPointerWidth = 4.0f;
        this.mPointerHead = 30.0f;
        this.mPointerIsTop = true;
        this.mPointerTopProtruding = false;
        this.mPointerBottomProtruding = false;
        this.mIsShowPointerHead = false;
        this.mBaseLineWidth = 5.0f;
        this.mLowScaleWidth = 2.0f;
        this.mMiddleScaleWidth = 2.0f;
        this.mHighScaleWidth = 3.0f;
        this.mLineInterval = 8;
        this.mBaseLineMarginBottom = 28;
        this.mPointerMarginTop = 0;
        this.mLeftMarginLeft = 0;
        this.mRightMarginRight = 0;
        this.mFontMarginBottom = 0;
        this.mFontMarginTop = 40;
        this.mLowPointerMargin = 39;
        this.mMiddlePointerMargin = 39;
        this.mHighPointerMargin = 16;
        this.mMiddleFrequency = 5;
        this.mHighFrequency = 10;
        this.mBaseLineColor = ContextCompat.getColor(getContext(), R.color.white);
        this.mHighScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mMiddleScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mLowScaleColor = ContextCompat.getColor(getContext(), R.color.assist_6_C4);
        this.mNumColor = ContextCompat.getColor(getContext(), R.color.assist_7_B3);
        this.mPointerColor = ContextCompat.getColor(getContext(), R.color.red);
        this.mFontIsTop = false;
        this.mScaleRatio = 10.0f;
        this.mSlidingRatio = 0.5d;
        this.isShowBaseLine = false;
        this.mScalePosition = 2;
        this.mUnits = 500;
        this.mMaxVelocity = DfuConstants.MAX_CALLBACK_LOCK_WAIT_TIME;
        Paint.Cap cap = Paint.Cap.SQUARE;
        this.mStrokeCap = cap;
        this.mPosX = 0.0f;
        this.mPosY = 0.0f;
        this.mCurPosX = 0.0f;
        this.mCurPosY = 0.0f;
        this.mCurPosY_ing = 0.0f;
        this.mChangeIndex = 0.0f;
        this.mDirection = -1;
        this.textFormat = "%.1f";
        this.x_down = 0.0f;
        this.y_down = 0.0f;
        this.mPaint = new Paint();
        this.mPath = new Path();
        this.mHandler = new Handler(new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScaleView);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mMinIndex = obtainStyledAttributes.getFloat(21, this.mMinIndex);
        this.mMaxIndex = obtainStyledAttributes.getFloat(15, this.mMaxIndex);
        this.mNowIndex = obtainStyledAttributes.getFloat(22, this.mNowIndex);
        this.mScaleValue = obtainStyledAttributes.getInteger(34, this.mScaleValue);
        this.mTextSize = getRealTextSize(obtainStyledAttributes.getFloat(35, this.mTextSize));
        this.mPointerWidth = getRealSize((int) obtainStyledAttributes.getFloat(30, this.mPointerWidth));
        this.mPointerHead = obtainStyledAttributes.getFloat(26, this.mPointerHead);
        this.mPointerIsTop = obtainStyledAttributes.getBoolean(28, this.mPointerIsTop);
        this.mPointerTopProtruding = obtainStyledAttributes.getBoolean(29, this.mPointerTopProtruding);
        this.mPointerBottomProtruding = obtainStyledAttributes.getBoolean(24, this.mPointerBottomProtruding);
        this.mIsShowPointerHead = obtainStyledAttributes.getBoolean(37, this.mIsShowPointerHead);
        this.mBaseLineWidth = obtainStyledAttributes.getFloat(2, this.mBaseLineWidth);
        this.mLowScaleWidth = getRealSize((int) obtainStyledAttributes.getFloat(14, this.mLowScaleWidth));
        this.mMiddleScaleWidth = getRealSize((int) obtainStyledAttributes.getFloat(20, this.mMiddleScaleWidth));
        this.mHighScaleWidth = getRealSize((int) obtainStyledAttributes.getFloat(9, this.mHighScaleWidth));
        this.mLineInterval = getRealSize(obtainStyledAttributes.getInteger(11, this.mLineInterval));
        this.mBaseLineMarginBottom = getRealSize(obtainStyledAttributes.getInteger(1, this.mBaseLineMarginBottom));
        this.mPointerMarginTop = getRealSize(obtainStyledAttributes.getInteger(27, this.mPointerMarginTop));
        this.mLeftMarginLeft = obtainStyledAttributes.getInteger(10, this.mLeftMarginLeft);
        this.mRightMarginRight = obtainStyledAttributes.getInteger(31, this.mRightMarginRight);
        this.mFontMarginBottom = getRealSize(obtainStyledAttributes.getInteger(3, this.mFontMarginBottom));
        this.mFontMarginTop = obtainStyledAttributes.getInteger(4, this.mFontMarginTop);
        this.mLowPointerMargin = getRealSize(obtainStyledAttributes.getInteger(12, this.mLowPointerMargin));
        this.mMiddlePointerMargin = getRealSize(obtainStyledAttributes.getInteger(18, this.mMiddlePointerMargin));
        this.mHighPointerMargin = getRealSize(obtainStyledAttributes.getInteger(7, this.mHighPointerMargin));
        this.mMiddleFrequency = obtainStyledAttributes.getInteger(17, this.mMiddleFrequency);
        this.mHighFrequency = obtainStyledAttributes.getInteger(6, this.mHighFrequency);
        this.mBaseLineColor = obtainStyledAttributes.getColor(0, this.mBaseLineColor);
        this.mHighScaleColor = obtainStyledAttributes.getColor(8, this.mHighScaleColor);
        this.mMiddleScaleColor = obtainStyledAttributes.getColor(19, this.mMiddleScaleColor);
        this.mLowScaleColor = obtainStyledAttributes.getColor(13, this.mLowScaleColor);
        this.mNumColor = obtainStyledAttributes.getColor(23, this.mNumColor);
        this.mPointerColor = obtainStyledAttributes.getColor(25, this.mPointerColor);
        this.mFontIsTop = obtainStyledAttributes.getBoolean(5, this.mFontIsTop);
        this.mScaleRatio = obtainStyledAttributes.getFloat(33, this.mScaleRatio);
        this.mSlidingRatio = obtainStyledAttributes.getFloat(38, (float) this.mSlidingRatio);
        this.isShowBaseLine = obtainStyledAttributes.getBoolean(36, this.isShowBaseLine);
        this.mScalePosition = obtainStyledAttributes.getInt(32, this.mScalePosition);
        this.mUnits = obtainStyledAttributes.getInteger(40, this.mUnits);
        this.mMaxVelocity = obtainStyledAttributes.getInteger(16, this.mMaxVelocity);
        int i8 = obtainStyledAttributes.getInt(39, 2);
        if (i8 == 0) {
            this.mStrokeCap = Paint.Cap.BUTT;
        } else if (i8 != 1) {
            this.mStrokeCap = cap;
        } else {
            this.mStrokeCap = Paint.Cap.ROUND;
        }
    }
}
