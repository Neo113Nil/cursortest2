package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;
import com.yalantis.ucrop.util.RectUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    private int getCurrentTouchIndex(float f8, float f9) {
        double d8 = this.mTouchPointThreshold;
        int i8 = -1;
        for (int i9 = 0; i9 < 8; i9 += 2) {
            double sqrt = Math.sqrt(Math.pow(f8 - this.mCropGridCorners[i9], 2.0d) + Math.pow(f9 - this.mCropGridCorners[i9 + 1], 2.0d));
            if (sqrt < d8) {
                i8 = i9 / 2;
                d8 = sqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i8 < 0 && this.mCropViewRect.contains(f8, f9)) {
            return 4;
        }
        return i8;
    }

    private void initCropFrameStyle(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        Paint paint = this.mCropFramePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(style);
    }

    private void initCropGridStyle(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void updateCropViewRect(float f8, float f9) {
        this.mTempRect.set(this.mCropViewRect);
        int i8 = this.mCurrentTouchCornerIndex;
        if (i8 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f8, f9, rectF2.right, rectF2.bottom);
        } else if (i8 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f9, f8, rectF4.bottom);
        } else if (i8 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f8, f9);
        } else if (i8 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f8, rectF8.top, rectF8.right, f9);
        } else if (i8 == 4) {
            this.mTempRect.offset(f8 - this.mPreviousTouchX, f9 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z7 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z8 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z8 ? this.mTempRect.left : rectF9.left, z7 ? this.mTempRect.top : rectF9.top, z8 ? this.mTempRect.right : rectF9.right, z7 ? this.mTempRect.bottom : rectF9.bottom);
        if (z7 || z8) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private void updateGridPoints() {
        this.mCropGridCorners = RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    protected void drawCropGrid(@NonNull Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridRowCount * 4) + (this.mCropGridColumnCount * 4)];
                int i8 = 0;
                for (int i9 = 0; i9 < this.mCropGridRowCount; i9++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.mCropViewRect;
                    fArr[i8] = rectF.left;
                    float f8 = i9 + 1.0f;
                    float height = rectF.height() * (f8 / (this.mCropGridRowCount + 1));
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i8 + 1] = height + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i10 = i8 + 3;
                    fArr2[i8 + 2] = rectF2.right;
                    i8 += 4;
                    fArr2[i10] = (rectF2.height() * (f8 / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                }
                for (int i11 = 0; i11 < this.mCropGridColumnCount; i11++) {
                    float[] fArr3 = this.mGridPoints;
                    float f9 = i11 + 1.0f;
                    float width = this.mCropViewRect.width() * (f9 / (this.mCropGridColumnCount + 1));
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i8] = width + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i8 + 1] = rectF3.top;
                    int i12 = i8 + 3;
                    float width2 = rectF3.width() * (f9 / (this.mCropGridColumnCount + 1));
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i8 + 2] = width2 + rectF4.left;
                    i8 += 4;
                    this.mGridPoints[i12] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(this.mCropRectCornerTouchAreaLineLength, -r1);
            RectF rectF5 = this.mTempRect;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF5, op);
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(-r2, this.mCropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.mTempRect, op);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    protected void drawDimmedLayer(@NonNull Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    protected void init() {
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (z7) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x7, y7);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z7 = currentTouchIndex != -1;
                if (!z7) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                } else if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x7;
                    this.mPreviousTouchY = y7;
                }
                return z7;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float min = Math.min(Math.max(x7, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y7, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(min, min2);
                this.mPreviousTouchX = min;
                this.mPreviousTouchY = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
            }
        }
        return false;
    }

    protected void processStyledAttributes(@NonNull TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(1.0f);
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void setCircleDimmedLayer(boolean z7) {
        this.mCircleDimmedLayer = z7;
    }

    public void setCropFrameColor(@ColorInt int i8) {
        this.mCropFramePaint.setColor(i8);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i8) {
        this.mCropFramePaint.setStrokeWidth(i8);
    }

    public void setCropGridColor(@ColorInt int i8) {
        this.mCropGridPaint.setColor(i8);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i8) {
        this.mCropGridColumnCount = i8;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i8) {
        this.mCropGridRowCount = i8;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i8) {
        this.mCropGridPaint.setStrokeWidth(i8);
    }

    public void setDimmedColor(@ColorInt int i8) {
        this.mDimmedColor = i8;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z7) {
        this.mFreestyleCropMode = z7 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i8) {
        this.mFreestyleCropMode = i8;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public void setShowCropFrame(boolean z7) {
        this.mShowCropFrame = z7;
    }

    public void setShowCropGrid(boolean z7) {
        this.mShowCropGrid = z7;
    }

    public void setTargetAspectRatio(float f8) {
        this.mTargetAspectRatio = f8;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        int i8 = this.mThisWidth;
        float f8 = this.mTargetAspectRatio;
        int i9 = (int) (i8 / f8);
        int i10 = this.mThisHeight;
        if (i9 > i10) {
            int i11 = (i8 - ((int) (i10 * f8))) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i11, getPaddingTop(), getPaddingLeft() + r1 + i11, getPaddingTop() + this.mThisHeight);
        } else {
            int i12 = (i10 - i9) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i12, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i9 + i12);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }
}
