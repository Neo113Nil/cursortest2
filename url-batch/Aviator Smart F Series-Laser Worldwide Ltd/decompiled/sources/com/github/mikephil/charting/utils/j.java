package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
public class j {
    protected final Matrix mMatrixTouch = new Matrix();
    protected RectF mContentRect = new RectF();
    protected float mChartWidth = 0.0f;
    protected float mChartHeight = 0.0f;
    private float mMinScaleY = 1.0f;
    private float mMaxScaleY = Float.MAX_VALUE;
    private float mMinScaleX = 1.0f;
    private float mMaxScaleX = Float.MAX_VALUE;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mTransX = 0.0f;
    private float mTransY = 0.0f;
    private float mTransOffsetX = 0.0f;
    private float mTransOffsetY = 0.0f;
    protected float[] valsBufferForFitScreen = new float[9];
    protected Matrix mCenterViewPortMatrixBuffer = new Matrix();
    protected final float[] matrixBuffer = new float[9];

    public boolean canZoomInMoreX() {
        return this.mScaleX < this.mMaxScaleX;
    }

    public boolean canZoomInMoreY() {
        return this.mScaleY < this.mMaxScaleY;
    }

    public boolean canZoomOutMoreX() {
        return this.mScaleX > this.mMinScaleX;
    }

    public boolean canZoomOutMoreY() {
        return this.mScaleY > this.mMinScaleY;
    }

    public void centerViewPort(float[] fArr, View view) {
        Matrix matrix = this.mCenterViewPortMatrixBuffer;
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
        refresh(matrix, view, true);
    }

    public float contentBottom() {
        return this.mContentRect.bottom;
    }

    public float contentHeight() {
        return this.mContentRect.height();
    }

    public float contentLeft() {
        return this.mContentRect.left;
    }

    public float contentRight() {
        return this.mContentRect.right;
    }

    public float contentTop() {
        return this.mContentRect.top;
    }

    public float contentWidth() {
        return this.mContentRect.width();
    }

    public Matrix fitScreen() {
        Matrix matrix = new Matrix();
        fitScreen(matrix);
        return matrix;
    }

    public float getChartHeight() {
        return this.mChartHeight;
    }

    public float getChartWidth() {
        return this.mChartWidth;
    }

    public e getContentCenter() {
        return e.getInstance(this.mContentRect.centerX(), this.mContentRect.centerY());
    }

    public RectF getContentRect() {
        return this.mContentRect;
    }

    public Matrix getMatrixTouch() {
        return this.mMatrixTouch;
    }

    public float getMaxScaleX() {
        return this.mMaxScaleX;
    }

    public float getMaxScaleY() {
        return this.mMaxScaleY;
    }

    public float getMinScaleX() {
        return this.mMinScaleX;
    }

    public float getMinScaleY() {
        return this.mMinScaleY;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getSmallestContentExtension() {
        return Math.min(this.mContentRect.width(), this.mContentRect.height());
    }

    public float getTransX() {
        return this.mTransX;
    }

    public float getTransY() {
        return this.mTransY;
    }

    public boolean hasChartDimens() {
        return this.mChartHeight > 0.0f && this.mChartWidth > 0.0f;
    }

    public boolean hasNoDragOffset() {
        return this.mTransOffsetX <= 0.0f && this.mTransOffsetY <= 0.0f;
    }

    public boolean isFullyZoomedOut() {
        return isFullyZoomedOutX() && isFullyZoomedOutY();
    }

    public boolean isFullyZoomedOutX() {
        float f8 = this.mScaleX;
        float f9 = this.mMinScaleX;
        return f8 <= f9 && f9 <= 1.0f;
    }

    public boolean isFullyZoomedOutY() {
        float f8 = this.mScaleY;
        float f9 = this.mMinScaleY;
        return f8 <= f9 && f9 <= 1.0f;
    }

    public boolean isInBounds(float f8, float f9) {
        return isInBoundsX(f8) && isInBoundsY(f9);
    }

    public boolean isInBoundsBottom(float f8) {
        return this.mContentRect.bottom >= ((float) ((int) (f8 * 100.0f))) / 100.0f;
    }

    public boolean isInBoundsLeft(float f8) {
        return this.mContentRect.left <= f8 + 1.0f;
    }

    public boolean isInBoundsRight(float f8) {
        return this.mContentRect.right >= (((float) ((int) (f8 * 100.0f))) / 100.0f) - 1.0f;
    }

    public boolean isInBoundsTop(float f8) {
        return this.mContentRect.top <= f8;
    }

    public boolean isInBoundsX(float f8) {
        return isInBoundsLeft(f8) && isInBoundsRight(f8);
    }

    public boolean isInBoundsY(float f8) {
        return isInBoundsTop(f8) && isInBoundsBottom(f8);
    }

    public void limitTransAndScale(Matrix matrix, RectF rectF) {
        float f8;
        float f9;
        matrix.getValues(this.matrixBuffer);
        float[] fArr = this.matrixBuffer;
        float f10 = fArr[2];
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = fArr[4];
        this.mScaleX = Math.min(Math.max(this.mMinScaleX, f11), this.mMaxScaleX);
        this.mScaleY = Math.min(Math.max(this.mMinScaleY, f13), this.mMaxScaleY);
        if (rectF != null) {
            f8 = rectF.width();
            f9 = rectF.height();
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        this.mTransX = Math.min(Math.max(f10, ((-f8) * (this.mScaleX - 1.0f)) - this.mTransOffsetX), this.mTransOffsetX);
        float max = Math.max(Math.min(f12, (f9 * (this.mScaleY - 1.0f)) + this.mTransOffsetY), -this.mTransOffsetY);
        this.mTransY = max;
        float[] fArr2 = this.matrixBuffer;
        fArr2[2] = this.mTransX;
        fArr2[0] = this.mScaleX;
        fArr2[5] = max;
        fArr2[4] = this.mScaleY;
        matrix.setValues(fArr2);
    }

    public float offsetBottom() {
        return this.mChartHeight - this.mContentRect.bottom;
    }

    public float offsetLeft() {
        return this.mContentRect.left;
    }

    public float offsetRight() {
        return this.mChartWidth - this.mContentRect.right;
    }

    public float offsetTop() {
        return this.mContentRect.top;
    }

    public Matrix refresh(Matrix matrix, View view, boolean z7) {
        this.mMatrixTouch.set(matrix);
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
        if (z7) {
            view.invalidate();
        }
        matrix.set(this.mMatrixTouch);
        return matrix;
    }

    public void resetZoom(Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public void restrainViewPort(float f8, float f9, float f10, float f11) {
        this.mContentRect.set(f8, f9, this.mChartWidth - f10, this.mChartHeight - f11);
    }

    public void setChartDimens(float f8, float f9) {
        float offsetLeft = offsetLeft();
        float offsetTop = offsetTop();
        float offsetRight = offsetRight();
        float offsetBottom = offsetBottom();
        this.mChartHeight = f9;
        this.mChartWidth = f8;
        restrainViewPort(offsetLeft, offsetTop, offsetRight, offsetBottom);
    }

    public void setDragOffsetX(float f8) {
        this.mTransOffsetX = i.convertDpToPixel(f8);
    }

    public void setDragOffsetY(float f8) {
        this.mTransOffsetY = i.convertDpToPixel(f8);
    }

    public void setMaximumScaleX(float f8) {
        if (f8 == 0.0f) {
            f8 = Float.MAX_VALUE;
        }
        this.mMaxScaleX = f8;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMaximumScaleY(float f8) {
        if (f8 == 0.0f) {
            f8 = Float.MAX_VALUE;
        }
        this.mMaxScaleY = f8;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleX(float f8, float f9) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f9 == 0.0f) {
            f9 = Float.MAX_VALUE;
        }
        this.mMinScaleX = f8;
        this.mMaxScaleX = f9;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleY(float f8, float f9) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f9 == 0.0f) {
            f9 = Float.MAX_VALUE;
        }
        this.mMinScaleY = f8;
        this.mMaxScaleY = f9;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleX(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        this.mMinScaleX = f8;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleY(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        this.mMinScaleY = f8;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public Matrix setZoom(float f8, float f9) {
        Matrix matrix = new Matrix();
        setZoom(f8, f9, matrix);
        return matrix;
    }

    public Matrix translate(float[] fArr) {
        Matrix matrix = new Matrix();
        translate(fArr, matrix);
        return matrix;
    }

    public Matrix zoom(float f8, float f9) {
        Matrix matrix = new Matrix();
        zoom(f8, f9, matrix);
        return matrix;
    }

    public Matrix zoomIn(float f8, float f9) {
        Matrix matrix = new Matrix();
        zoomIn(f8, f9, matrix);
        return matrix;
    }

    public Matrix zoomOut(float f8, float f9) {
        Matrix matrix = new Matrix();
        zoomOut(f8, f9, matrix);
        return matrix;
    }

    public void fitScreen(Matrix matrix) {
        this.mMinScaleX = 1.0f;
        this.mMinScaleY = 1.0f;
        matrix.set(this.mMatrixTouch);
        float[] fArr = this.valsBufferForFitScreen;
        for (int i8 = 0; i8 < 9; i8++) {
            fArr[i8] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public void setZoom(float f8, float f9, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f8, f9);
    }

    public void translate(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
    }

    public void zoom(float f8, float f9, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f8, f9);
    }

    public void zoomIn(float f8, float f9, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(1.4f, 1.4f, f8, f9);
    }

    public void zoomOut(float f8, float f9, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(0.7f, 0.7f, f8, f9);
    }

    public Matrix setZoom(float f8, float f9, float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f8, f9, f10, f11);
        return matrix;
    }

    public Matrix zoom(float f8, float f9, float f10, float f11) {
        Matrix matrix = new Matrix();
        zoom(f8, f9, f10, f11, matrix);
        return matrix;
    }

    public void zoom(float f8, float f9, float f10, float f11, Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f8, f9, f10, f11);
    }
}
