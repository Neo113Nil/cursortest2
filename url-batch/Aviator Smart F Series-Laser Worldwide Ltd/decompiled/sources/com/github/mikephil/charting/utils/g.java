package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import v4.k;

/* loaded from: classes3.dex */
public class g {
    protected j mViewPortHandler;
    protected Matrix mMatrixValueToPx = new Matrix();
    protected Matrix mMatrixOffset = new Matrix();
    protected float[] valuePointsForGenerateTransformedValuesScatter = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesBubble = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesLine = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesCandle = new float[1];
    protected Matrix mPixelToValueMatrixBuffer = new Matrix();
    float[] ptsBuffer = new float[2];
    private Matrix mMBuffer1 = new Matrix();
    private Matrix mMBuffer2 = new Matrix();

    public g(j jVar) {
        this.mViewPortHandler = jVar;
    }

    public float[] generateTransformedValuesBubble(v4.c cVar, float f8, int i8, int i9) {
        int i10 = ((i9 - i8) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesBubble.length != i10) {
            this.valuePointsForGenerateTransformedValuesBubble = new float[i10];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesBubble;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            Entry entryForIndex = cVar.getEntryForIndex((i11 / 2) + i8);
            if (entryForIndex != null) {
                fArr[i11] = entryForIndex.getX();
                fArr[i11 + 1] = entryForIndex.getY() * f8;
            } else {
                fArr[i11] = 0.0f;
                fArr[i11 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesCandle(v4.d dVar, float f8, float f9, int i8, int i9) {
        int i10 = ((int) (((i9 - i8) * f8) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesCandle.length != i10) {
            this.valuePointsForGenerateTransformedValuesCandle = new float[i10];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesCandle;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            CandleEntry candleEntry = (CandleEntry) dVar.getEntryForIndex((i11 / 2) + i8);
            if (candleEntry != null) {
                fArr[i11] = candleEntry.getX();
                fArr[i11 + 1] = candleEntry.getHigh() * f9;
            } else {
                fArr[i11] = 0.0f;
                fArr[i11 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesLine(v4.f fVar, float f8, float f9, int i8, int i9) {
        int i10 = (((int) ((i9 - i8) * f8)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i10) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i10];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            Entry entryForIndex = fVar.getEntryForIndex((i11 / 2) + i8);
            if (entryForIndex != null) {
                fArr[i11] = entryForIndex.getX();
                fArr[i11 + 1] = entryForIndex.getY() * f9;
            } else {
                fArr[i11] = 0.0f;
                fArr[i11 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesScatter(k kVar, float f8, float f9, int i8, int i9) {
        int i10 = ((int) (((i9 - i8) * f8) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesScatter.length != i10) {
            this.valuePointsForGenerateTransformedValuesScatter = new float[i10];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesScatter;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            Entry entryForIndex = kVar.getEntryForIndex((i11 / 2) + i8);
            if (entryForIndex != null) {
                fArr[i11] = entryForIndex.getX();
                fArr[i11 + 1] = entryForIndex.getY() * f9;
            } else {
                fArr[i11] = 0.0f;
                fArr[i11 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
    }

    public d getPixelForValues(float f8, float f9) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f8;
        fArr[1] = f9;
        pointValuesToPixel(fArr);
        float[] fArr2 = this.ptsBuffer;
        return d.getInstance(fArr2[0], fArr2[1]);
    }

    public Matrix getPixelToValueMatrix() {
        getValueToPixelMatrix().invert(this.mMBuffer2);
        return this.mMBuffer2;
    }

    public Matrix getValueMatrix() {
        return this.mMatrixValueToPx;
    }

    public Matrix getValueToPixelMatrix() {
        this.mMBuffer1.set(this.mMatrixValueToPx);
        this.mMBuffer1.postConcat(this.mViewPortHandler.mMatrixTouch);
        this.mMBuffer1.postConcat(this.mMatrixOffset);
        return this.mMBuffer1;
    }

    public d getValuesByTouchPoint(float f8, float f9) {
        d dVar = d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        getValuesByTouchPoint(f8, f9, dVar);
        return dVar;
    }

    public void pathValueToPixel(Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    public void pathValuesToPixel(List<Path> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            pathValueToPixel(list.get(i8));
        }
    }

    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    public void prepareMatrixOffset(boolean z7) {
        this.mMatrixOffset.reset();
        if (!z7) {
            this.mMatrixOffset.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            this.mMatrixOffset.setTranslate(this.mViewPortHandler.offsetLeft(), -this.mViewPortHandler.offsetTop());
            this.mMatrixOffset.postScale(1.0f, -1.0f);
        }
    }

    public void prepareMatrixValuePx(float f8, float f9, float f10, float f11) {
        float contentWidth = this.mViewPortHandler.contentWidth() / f9;
        float contentHeight = this.mViewPortHandler.contentHeight() / f10;
        if (Float.isInfinite(contentWidth)) {
            contentWidth = 0.0f;
        }
        if (Float.isInfinite(contentHeight)) {
            contentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f8, -f11);
        this.mMatrixValueToPx.postScale(contentWidth, -contentHeight);
    }

    public void rectToPixelPhase(RectF rectF, float f8) {
        rectF.top *= f8;
        rectF.bottom *= f8;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhaseHorizontal(RectF rectF, float f8) {
        rectF.left *= f8;
        rectF.right *= f8;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValuesToPixel(List<RectF> list) {
        Matrix valueToPixelMatrix = getValueToPixelMatrix();
        for (int i8 = 0; i8 < list.size(); i8++) {
            valueToPixelMatrix.mapRect(list.get(i8));
        }
    }

    public void getValuesByTouchPoint(float f8, float f9, d dVar) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f8;
        fArr[1] = f9;
        pixelsToValue(fArr);
        float[] fArr2 = this.ptsBuffer;
        dVar.f14112x = fArr2[0];
        dVar.f14113y = fArr2[1];
    }

    public void rectValueToPixelHorizontal(RectF rectF, float f8) {
        rectF.left *= f8;
        rectF.right *= f8;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }
}
