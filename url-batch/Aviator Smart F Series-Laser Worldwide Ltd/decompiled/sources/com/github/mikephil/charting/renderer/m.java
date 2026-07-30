package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends g {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    public m(PieChart pieChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        Paint paint2 = this.mHolePaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mTransparentCirclePaint = paint3;
        paint3.setColor(-1);
        this.mTransparentCirclePaint.setStyle(style);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        Paint paint4 = this.mValuePaint;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.mEntryLabelsPaint = paint5;
        paint5.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(align);
        this.mEntryLabelsPaint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(13.0f));
        Paint paint6 = new Paint(1);
        this.mValueLinePaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    protected float calculateMinimumRadiusForSpacedSlice(com.github.mikephil.charting.utils.e eVar, float f8, float f9, float f10, float f11, float f12, float f13) {
        double d8 = (f12 + f13) * 0.017453292f;
        float cos = eVar.f14114x + (((float) Math.cos(d8)) * f8);
        float sin = eVar.f14115y + (((float) Math.sin(d8)) * f8);
        double d9 = (f12 + (f13 / 2.0f)) * 0.017453292f;
        return (float) ((f8 - ((float) ((Math.sqrt(Math.pow(cos - f10, 2.0d) + Math.pow(sin - f11, 2.0d)) / 2.0d) * Math.tan(((180.0d - f9) / 2.0d) * 0.017453292519943295d)))) - Math.sqrt(Math.pow((eVar.f14114x + (((float) Math.cos(d9)) * f8)) - ((cos + f10) / 2.0f), 2.0d) + Math.pow((eVar.f14115y + (((float) Math.sin(d9)) * f8)) - ((sin + f11) / 2.0f), 2.0d)));
    }

    protected void drawCenterText(Canvas canvas) {
        com.github.mikephil.charting.utils.e eVar;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
        com.github.mikephil.charting.utils.e centerTextOffset = this.mChart.getCenterTextOffset();
        float f8 = centerCircleBox.f14114x + centerTextOffset.f14114x;
        float f9 = centerCircleBox.f14115y + centerTextOffset.f14115y;
        float radius = (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) ? this.mChart.getRadius() : this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        rectF.left = f8 - radius;
        rectF.top = f9 - radius;
        rectF.right = f8 + radius;
        rectF.bottom = f9 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (centerText.equals(this.mCenterTextLastValue) && rectF2.equals(this.mCenterTextLastBounds)) {
            eVar = centerTextOffset;
        } else {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            eVar = centerTextOffset;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != chartWidth || bitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new WeakReference<>(bitmap);
            this.mBitmapCanvas = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        Iterator<v4.e> it = ((com.github.mikephil.charting.data.n) this.mChart.getData()).getDataSets().iterator();
        while (it.hasNext()) {
            v4.i iVar = (v4.i) it.next();
            if (iVar.isVisible() && iVar.getEntryCount() > 0) {
                drawDataSet(canvas, iVar);
            }
        }
    }

    protected void drawDataSet(Canvas canvas, v4.i iVar) {
        int i8;
        int i9;
        int i10;
        float[] fArr;
        float f8;
        float f9;
        RectF rectF;
        float f10;
        float f11;
        int i11;
        RectF rectF2;
        com.github.mikephil.charting.utils.e eVar;
        float f12;
        RectF rectF3;
        com.github.mikephil.charting.utils.e eVar2;
        int i12;
        v4.i iVar2 = iVar;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iVar.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z7 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z7 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF4 = new RectF();
        boolean z8 = z7 && this.mChart.isDrawRoundedSlicesEnabled();
        int i13 = 0;
        for (int i14 = 0; i14 < entryCount; i14++) {
            if (Math.abs(((PieEntry) iVar2.getEntryForIndex(i14)).getY()) > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                i13++;
            }
        }
        float sliceSpace = i13 <= 1 ? 0.0f : getSliceSpace(iVar2);
        int i15 = 0;
        float f13 = 0.0f;
        while (i15 < entryCount) {
            float f14 = drawAngles[i15];
            float abs = Math.abs(iVar2.getEntryForIndex(i15).getY());
            float f15 = com.github.mikephil.charting.utils.i.FLOAT_EPSILON;
            if (abs > f15 && (!this.mChart.needsHighlight(i15) || z8)) {
                boolean z9 = sliceSpace > 0.0f && f14 <= 180.0f;
                this.mRenderPaint.setColor(iVar2.getColor(i15));
                float f16 = i13 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f17 = rotationAngle + ((f13 + (f16 / 2.0f)) * phaseY);
                float f18 = (f14 - f16) * phaseY;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (z8) {
                    float f19 = radius - holeRadius2;
                    i8 = i15;
                    i9 = i13;
                    double d8 = f17 * 0.017453292f;
                    i10 = entryCount;
                    fArr = drawAngles;
                    float cos = centerCircleBox.f14114x + (((float) Math.cos(d8)) * f19);
                    float sin = centerCircleBox.f14115y + (f19 * ((float) Math.sin(d8)));
                    rectF4.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i8 = i15;
                    i9 = i13;
                    i10 = entryCount;
                    fArr = drawAngles;
                }
                double d9 = f17 * 0.017453292f;
                f8 = rotationAngle;
                f9 = phaseX;
                float cos2 = centerCircleBox.f14114x + (((float) Math.cos(d9)) * radius);
                float sin2 = centerCircleBox.f14115y + (((float) Math.sin(d9)) * radius);
                if (f18 < 360.0f || f18 % 360.0f > f15) {
                    if (z8) {
                        this.mPathBuffer.arcTo(rectF4, f17 + 180.0f, -180.0f);
                    }
                    this.mPathBuffer.arcTo(circleBox, f17, f18);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.f14114x, centerCircleBox.f14115y, radius, Path.Direction.CW);
                }
                RectF rectF5 = this.mInnerRectBuffer;
                float f20 = centerCircleBox.f14114x;
                float f21 = centerCircleBox.f14115y;
                float f22 = f18;
                rectF5.set(f20 - holeRadius, f21 - holeRadius, f20 + holeRadius, f21 + holeRadius);
                if (!z7) {
                    rectF = rectF4;
                    f10 = holeRadius;
                    f11 = radius;
                    i11 = i9;
                    rectF2 = circleBox;
                    eVar = centerCircleBox;
                    f12 = 360.0f;
                } else if (holeRadius > 0.0f || z9) {
                    if (z9) {
                        i11 = i9;
                        rectF2 = circleBox;
                        f10 = holeRadius;
                        rectF3 = rectF4;
                        i12 = 1;
                        f11 = radius;
                        eVar2 = centerCircleBox;
                        float calculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f14 * phaseY, cos2, sin2, f17, f22);
                        if (calculateMinimumRadiusForSpacedSlice < 0.0f) {
                            calculateMinimumRadiusForSpacedSlice = -calculateMinimumRadiusForSpacedSlice;
                        }
                        holeRadius = Math.max(f10, calculateMinimumRadiusForSpacedSlice);
                    } else {
                        rectF3 = rectF4;
                        f10 = holeRadius;
                        f11 = radius;
                        eVar2 = centerCircleBox;
                        i11 = i9;
                        rectF2 = circleBox;
                        i12 = 1;
                    }
                    float f23 = (i11 == i12 || holeRadius == 0.0f) ? 0.0f : sliceSpace / (holeRadius * 0.017453292f);
                    float f24 = f8 + ((f13 + (f23 / 2.0f)) * phaseY);
                    float f25 = (f14 - f23) * phaseY;
                    if (f25 < 0.0f) {
                        f25 = 0.0f;
                    }
                    float f26 = f24 + f25;
                    if (f18 < 360.0f || f22 % 360.0f > f15) {
                        if (z8) {
                            float f27 = f11 - holeRadius2;
                            double d10 = f26 * 0.017453292f;
                            float cos3 = eVar2.f14114x + (((float) Math.cos(d10)) * f27);
                            float sin3 = eVar2.f14115y + (f27 * ((float) Math.sin(d10)));
                            RectF rectF6 = rectF3;
                            rectF6.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            this.mPathBuffer.arcTo(rectF6, f26, 180.0f);
                            rectF = rectF6;
                        } else {
                            double d11 = f26 * 0.017453292f;
                            rectF = rectF3;
                            this.mPathBuffer.lineTo(eVar2.f14114x + (((float) Math.cos(d11)) * holeRadius), eVar2.f14115y + (holeRadius * ((float) Math.sin(d11))));
                        }
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f26, -f25);
                    } else {
                        this.mPathBuffer.addCircle(eVar2.f14114x, eVar2.f14115y, holeRadius, Path.Direction.CCW);
                        rectF = rectF3;
                    }
                    eVar = eVar2;
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                    f13 += f14 * f9;
                } else {
                    rectF = rectF4;
                    f10 = holeRadius;
                    f11 = radius;
                    i11 = i9;
                    f12 = 360.0f;
                    rectF2 = circleBox;
                    eVar = centerCircleBox;
                }
                if (f22 % f12 > f15) {
                    if (z9) {
                        float calculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(eVar, f11, f14 * phaseY, cos2, sin2, f17, f22);
                        double d12 = (f17 + (f22 / 2.0f)) * 0.017453292f;
                        this.mPathBuffer.lineTo(eVar.f14114x + (((float) Math.cos(d12)) * calculateMinimumRadiusForSpacedSlice2), eVar.f14115y + (calculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d12))));
                    } else {
                        this.mPathBuffer.lineTo(eVar.f14114x, eVar.f14115y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                f13 += f14 * f9;
            } else {
                f13 += f14 * phaseX;
                i8 = i15;
                rectF = rectF4;
                f11 = radius;
                f8 = rotationAngle;
                f9 = phaseX;
                rectF2 = circleBox;
                i10 = entryCount;
                fArr = drawAngles;
                i11 = i13;
                f10 = holeRadius;
                eVar = centerCircleBox;
            }
            i15 = i8 + 1;
            rectF4 = rectF;
            iVar2 = iVar;
            holeRadius = f10;
            centerCircleBox = eVar;
            i13 = i11;
            radius = f11;
            rotationAngle = f8;
            circleBox = rectF2;
            entryCount = i10;
            drawAngles = fArr;
            phaseX = f9;
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
    }

    protected void drawEntryLabel(Canvas canvas, String str, float f8, float f9) {
        canvas.drawText(str, f8, f9, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        v4.i dataSetByIndex;
        float f8;
        int i8;
        float[] fArr;
        float f9;
        int i9;
        boolean z7;
        RectF rectF;
        com.github.mikephil.charting.utils.e eVar;
        int i10;
        float f10;
        float[] fArr2;
        float f11;
        float f12;
        float f13;
        float f14;
        com.github.mikephil.charting.highlight.d[] dVarArr2 = dVarArr;
        boolean z8 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z8 && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z8 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i11 = 0;
        while (i11 < dVarArr2.length) {
            int x7 = (int) dVarArr2[i11].getX();
            if (x7 < drawAngles.length && (dataSetByIndex = ((com.github.mikephil.charting.data.n) this.mChart.getData()).getDataSetByIndex(dVarArr2[i11].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i12 = 0;
                for (int i13 = 0; i13 < entryCount; i13++) {
                    if (Math.abs(((PieEntry) dataSetByIndex.getEntryForIndex(i13)).getY()) > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                        i12++;
                    }
                }
                if (x7 == 0) {
                    i8 = 1;
                    f8 = 0.0f;
                } else {
                    f8 = absoluteAngles[x7 - 1] * phaseX;
                    i8 = 1;
                }
                float sliceSpace = i12 <= i8 ? 0.0f : dataSetByIndex.getSliceSpace();
                float f15 = drawAngles[x7];
                float selectionShift = dataSetByIndex.getSelectionShift();
                int i14 = i11;
                float f16 = radius + selectionShift;
                float f17 = holeRadius;
                rectF2.set(this.mChart.getCircleBox());
                float f18 = -selectionShift;
                rectF2.inset(f18, f18);
                boolean z9 = sliceSpace > 0.0f && f15 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x7));
                float f19 = i12 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f20 = i12 == 1 ? 0.0f : sliceSpace / (f16 * 0.017453292f);
                float f21 = rotationAngle + (((f19 / 2.0f) + f8) * phaseY);
                float f22 = (f15 - f19) * phaseY;
                float f23 = f22 < 0.0f ? 0.0f : f22;
                float f24 = (((f20 / 2.0f) + f8) * phaseY) + rotationAngle;
                float f25 = (f15 - f20) * phaseY;
                if (f25 < 0.0f) {
                    f25 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f23 < 360.0f || f23 % 360.0f > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                    fArr = drawAngles;
                    f9 = f8;
                    double d8 = f24 * 0.017453292f;
                    i9 = i12;
                    z7 = z8;
                    this.mPathBuffer.moveTo(centerCircleBox.f14114x + (((float) Math.cos(d8)) * f16), centerCircleBox.f14115y + (f16 * ((float) Math.sin(d8))));
                    this.mPathBuffer.arcTo(rectF2, f24, f25);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.f14114x, centerCircleBox.f14115y, f16, Path.Direction.CW);
                    fArr = drawAngles;
                    f9 = f8;
                    i9 = i12;
                    z7 = z8;
                }
                if (z9) {
                    double d9 = f21 * 0.017453292f;
                    i10 = i14;
                    rectF = rectF2;
                    f10 = f17;
                    eVar = centerCircleBox;
                    fArr2 = fArr;
                    f11 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f15 * phaseY, (((float) Math.cos(d9)) * radius) + centerCircleBox.f14114x, centerCircleBox.f14115y + (((float) Math.sin(d9)) * radius), f21, f23);
                } else {
                    rectF = rectF2;
                    eVar = centerCircleBox;
                    i10 = i14;
                    f10 = f17;
                    fArr2 = fArr;
                    f11 = 0.0f;
                }
                RectF rectF3 = this.mInnerRectBuffer;
                float f26 = eVar.f14114x;
                float f27 = eVar.f14115y;
                rectF3.set(f26 - f10, f27 - f10, f26 + f10, f27 + f10);
                if (!z7 || (f10 <= 0.0f && !z9)) {
                    f12 = phaseX;
                    f13 = phaseY;
                    if (f23 % 360.0f > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                        if (z9) {
                            double d10 = (f21 + (f23 / 2.0f)) * 0.017453292f;
                            this.mPathBuffer.lineTo(eVar.f14114x + (((float) Math.cos(d10)) * f11), eVar.f14115y + (f11 * ((float) Math.sin(d10))));
                        } else {
                            this.mPathBuffer.lineTo(eVar.f14114x, eVar.f14115y);
                        }
                    }
                } else {
                    if (z9) {
                        if (f11 < 0.0f) {
                            f11 = -f11;
                        }
                        f14 = Math.max(f10, f11);
                    } else {
                        f14 = f10;
                    }
                    float f28 = (i9 == 1 || f14 == 0.0f) ? 0.0f : sliceSpace / (f14 * 0.017453292f);
                    float f29 = ((f9 + (f28 / 2.0f)) * phaseY) + rotationAngle;
                    float f30 = (f15 - f28) * phaseY;
                    if (f30 < 0.0f) {
                        f30 = 0.0f;
                    }
                    float f31 = f29 + f30;
                    if (f23 < 360.0f || f23 % 360.0f > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                        double d11 = f31 * 0.017453292f;
                        f12 = phaseX;
                        f13 = phaseY;
                        this.mPathBuffer.lineTo(eVar.f14114x + (((float) Math.cos(d11)) * f14), eVar.f14115y + (f14 * ((float) Math.sin(d11))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f31, -f30);
                    } else {
                        this.mPathBuffer.addCircle(eVar.f14114x, eVar.f14115y, f14, Path.Direction.CCW);
                        f12 = phaseX;
                        f13 = phaseY;
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                i10 = i11;
                rectF = rectF2;
                f10 = holeRadius;
                fArr2 = drawAngles;
                z7 = z8;
                f12 = phaseX;
                f13 = phaseY;
                eVar = centerCircleBox;
            }
            i11 = i10 + 1;
            phaseX = f12;
            rectF2 = rectF;
            holeRadius = f10;
            centerCircleBox = eVar;
            phaseY = f13;
            drawAngles = fArr2;
            z8 = z7;
            dVarArr2 = dVarArr;
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
    }

    protected void drawHole(Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
        if (Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.f14114x, centerCircleBox.f14115y, holeRadius, this.mHolePaint);
        }
        if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = radius * (this.mChart.getTransparentCircleRadius() / 100.0f);
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.f14114x, centerCircleBox.f14115y, transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.f14114x, centerCircleBox.f14115y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawRoundedSlices(Canvas canvas) {
        float f8;
        float[] fArr;
        float f9;
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            v4.i dataSet = ((com.github.mikephil.charting.data.n) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i8 = 0;
                while (i8 < dataSet.getEntryCount()) {
                    float f10 = drawAngles[i8];
                    if (Math.abs(dataSet.getEntryForIndex(i8).getY()) > com.github.mikephil.charting.utils.i.FLOAT_EPSILON) {
                        double d8 = radius - holeRadius;
                        double d9 = (rotationAngle + f10) * phaseY;
                        f8 = phaseY;
                        fArr = drawAngles;
                        f9 = rotationAngle;
                        float cos = (float) (centerCircleBox.f14114x + (Math.cos(Math.toRadians(d9)) * d8));
                        float sin = (float) ((d8 * Math.sin(Math.toRadians(d9))) + centerCircleBox.f14115y);
                        this.mRenderPaint.setColor(dataSet.getColor(i8));
                        this.mBitmapCanvas.drawCircle(cos, sin, holeRadius, this.mRenderPaint);
                    } else {
                        f8 = phaseY;
                        fArr = drawAngles;
                        f9 = rotationAngle;
                    }
                    rotationAngle = f9 + (f10 * phaseX);
                    i8++;
                    phaseY = f8;
                    drawAngles = fArr;
                }
                com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        int i8;
        List<v4.e> list;
        float[] fArr;
        float[] fArr2;
        float f8;
        float f9;
        float f10;
        com.github.mikephil.charting.utils.e eVar;
        float f11;
        Canvas canvas2;
        PieDataSet.ValuePosition valuePosition;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        com.github.mikephil.charting.utils.e eVar2;
        PieEntry pieEntry;
        com.github.mikephil.charting.utils.e eVar3;
        v4.i iVar;
        float f17;
        Canvas canvas3;
        String str;
        String str2;
        Canvas canvas4;
        com.github.mikephil.charting.utils.e eVar4;
        com.github.mikephil.charting.utils.e eVar5;
        Canvas canvas5 = canvas;
        com.github.mikephil.charting.utils.e centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f18 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f18 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) (rotationAngle + ((holeRadius * 360.0f) / (radius * 6.283185307179586d)));
            }
        }
        float f19 = rotationAngle;
        float f20 = radius - f18;
        com.github.mikephil.charting.data.n nVar = (com.github.mikephil.charting.data.n) this.mChart.getData();
        List<v4.e> dataSets = nVar.getDataSets();
        float yValueSum = nVar.getYValueSum();
        boolean isDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(5.0f);
        int i9 = 0;
        int i10 = 0;
        while (i10 < dataSets.size()) {
            v4.i iVar2 = (v4.i) dataSets.get(i10);
            boolean isDrawValuesEnabled = iVar2.isDrawValuesEnabled();
            if (isDrawValuesEnabled || isDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iVar2.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iVar2.getYValuePosition();
                applyValueTextStyle(iVar2);
                int i11 = i9;
                i8 = i10;
                float calcTextHeight = com.github.mikephil.charting.utils.i.calcTextHeight(this.mValuePaint, "Q") + com.github.mikephil.charting.utils.i.convertDpToPixel(4.0f);
                com.github.mikephil.charting.formatter.g valueFormatter = iVar2.getValueFormatter();
                int entryCount = iVar2.getEntryCount();
                list = dataSets;
                this.mValueLinePaint.setColor(iVar2.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(com.github.mikephil.charting.utils.i.convertDpToPixel(iVar2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iVar2);
                com.github.mikephil.charting.utils.e eVar6 = com.github.mikephil.charting.utils.e.getInstance(iVar2.getIconsOffset());
                com.github.mikephil.charting.utils.e eVar7 = centerCircleBox;
                eVar6.f14114x = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar6.f14114x);
                eVar6.f14115y = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar6.f14115y);
                int i12 = 0;
                while (i12 < entryCount) {
                    com.github.mikephil.charting.utils.e eVar8 = eVar6;
                    PieEntry pieEntry2 = (PieEntry) iVar2.getEntryForIndex(i12);
                    int i13 = entryCount;
                    float f21 = f19 + (((i11 == 0 ? 0.0f : absoluteAngles[i11 - 1] * phaseX) + ((drawAngles[i11] - ((sliceSpace / (f20 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    float f22 = sliceSpace;
                    String pieLabel = valueFormatter.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (pieEntry2.getY() / yValueSum) * 100.0f : pieEntry2.getY(), pieEntry2);
                    float[] fArr3 = drawAngles;
                    String label = pieEntry2.getLabel();
                    com.github.mikephil.charting.formatter.g gVar = valueFormatter;
                    double d8 = f21 * 0.017453292f;
                    float[] fArr4 = absoluteAngles;
                    float f23 = phaseX;
                    float cos = (float) Math.cos(d8);
                    float f24 = phaseY;
                    float sin = (float) Math.sin(d8);
                    boolean z7 = isDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float f25 = f19;
                    boolean z8 = isDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z9 = isDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z10 = isDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z7 || z8) {
                        float valueLinePart1Length = iVar2.getValueLinePart1Length();
                        float valueLinePart2Length = iVar2.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iVar2.getValueLinePart1OffsetPercentage() / 100.0f;
                        valuePosition = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f26 = radius * holeRadius2;
                            f12 = ((radius - f26) * valueLinePart1OffsetPercentage) + f26;
                        } else {
                            f12 = radius * valueLinePart1OffsetPercentage;
                        }
                        float abs = iVar2.isValueLineVariableLength() ? valueLinePart2Length * f20 * ((float) Math.abs(Math.sin(d8))) : valueLinePart2Length * f20;
                        com.github.mikephil.charting.utils.e eVar9 = eVar7;
                        float f27 = eVar9.f14114x;
                        float f28 = (f12 * cos) + f27;
                        f13 = radius;
                        float f29 = eVar9.f14115y;
                        float f30 = (f12 * sin) + f29;
                        float f31 = (valueLinePart1Length + 1.0f) * f20;
                        float f32 = (f31 * cos) + f27;
                        float f33 = f29 + (f31 * sin);
                        double d9 = f21 % 360.0d;
                        if (d9 < 90.0d || d9 > 270.0d) {
                            f14 = f32 + abs;
                            Paint paint = this.mValuePaint;
                            Paint.Align align = Paint.Align.LEFT;
                            paint.setTextAlign(align);
                            if (z7) {
                                this.mEntryLabelsPaint.setTextAlign(align);
                            }
                            f15 = f14 + convertDpToPixel;
                        } else {
                            float f34 = f32 - abs;
                            Paint paint2 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.RIGHT;
                            paint2.setTextAlign(align2);
                            if (z7) {
                                this.mEntryLabelsPaint.setTextAlign(align2);
                            }
                            f14 = f34;
                            f15 = f34 - convertDpToPixel;
                        }
                        if (iVar2.getValueLineColor() != 1122867) {
                            if (iVar2.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iVar2.getColor(i12));
                            }
                            f16 = sin;
                            iVar = iVar2;
                            eVar2 = eVar8;
                            pieEntry = pieEntry2;
                            eVar3 = eVar9;
                            f17 = f15;
                            canvas.drawLine(f28, f30, f32, f33, this.mValueLinePaint);
                            canvas.drawLine(f32, f33, f14, f33, this.mValueLinePaint);
                        } else {
                            f16 = sin;
                            eVar2 = eVar8;
                            pieEntry = pieEntry2;
                            eVar3 = eVar9;
                            iVar = iVar2;
                            f17 = f15;
                        }
                        if (z7 && z8) {
                            drawValue(canvas, pieLabel, f17, f33, iVar.getValueTextColor(i12));
                            if (i12 >= nVar.getEntryCount() || label == null) {
                                canvas4 = canvas;
                                str2 = label;
                            } else {
                                canvas3 = canvas;
                                str = label;
                                drawEntryLabel(canvas3, str, f17, f33 + calcTextHeight);
                                str2 = str;
                                canvas4 = canvas3;
                            }
                        } else {
                            canvas3 = canvas;
                            float f35 = f17;
                            str = label;
                            if (z7) {
                                if (i12 < nVar.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f35, f33 + (calcTextHeight / 2.0f));
                                }
                            } else if (z8) {
                                str2 = str;
                                canvas4 = canvas3;
                                drawValue(canvas, pieLabel, f35, f33 + (calcTextHeight / 2.0f), iVar.getValueTextColor(i12));
                            }
                            str2 = str;
                            canvas4 = canvas3;
                        }
                    } else {
                        valuePosition = yValuePosition;
                        f16 = sin;
                        eVar3 = eVar7;
                        eVar2 = eVar8;
                        pieEntry = pieEntry2;
                        str2 = label;
                        iVar = iVar2;
                        f13 = radius;
                        canvas4 = canvas;
                    }
                    if (z9 || z10) {
                        eVar4 = eVar3;
                        float f36 = (f20 * cos) + eVar4.f14114x;
                        float f37 = (f20 * f16) + eVar4.f14115y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z9 && z10) {
                            drawValue(canvas, pieLabel, f36, f37, iVar.getValueTextColor(i12));
                            if (i12 < nVar.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas4, str2, f36, f37 + calcTextHeight);
                            }
                        } else {
                            if (z9) {
                                if (i12 < nVar.getEntryCount() && str2 != null) {
                                    drawEntryLabel(canvas4, str2, f36, f37 + (calcTextHeight / 2.0f));
                                }
                            } else if (z10) {
                                drawValue(canvas, pieLabel, f36, f37 + (calcTextHeight / 2.0f), iVar.getValueTextColor(i12));
                            }
                            if (pieEntry.getIcon() == null && iVar.isDrawIconsEnabled()) {
                                Drawable icon = pieEntry.getIcon();
                                eVar5 = eVar2;
                                float f38 = eVar5.f14115y;
                                com.github.mikephil.charting.utils.i.drawImage(canvas, icon, (int) (((f20 + f38) * cos) + eVar4.f14114x), (int) (((f38 + f20) * f16) + eVar4.f14115y + eVar5.f14114x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            } else {
                                eVar5 = eVar2;
                            }
                            i11++;
                            i12++;
                            eVar6 = eVar5;
                            iVar2 = iVar;
                            radius = f13;
                            sliceSpace = f22;
                            entryCount = i13;
                            drawAngles = fArr3;
                            valueFormatter = gVar;
                            absoluteAngles = fArr4;
                            phaseX = f23;
                            f19 = f25;
                            xValuePosition = valuePosition2;
                            yValuePosition = valuePosition;
                            eVar7 = eVar4;
                            phaseY = f24;
                        }
                    } else {
                        eVar4 = eVar3;
                    }
                    if (pieEntry.getIcon() == null) {
                    }
                    eVar5 = eVar2;
                    i11++;
                    i12++;
                    eVar6 = eVar5;
                    iVar2 = iVar;
                    radius = f13;
                    sliceSpace = f22;
                    entryCount = i13;
                    drawAngles = fArr3;
                    valueFormatter = gVar;
                    absoluteAngles = fArr4;
                    phaseX = f23;
                    f19 = f25;
                    xValuePosition = valuePosition2;
                    yValuePosition = valuePosition;
                    eVar7 = eVar4;
                    phaseY = f24;
                }
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f8 = phaseX;
                f9 = phaseY;
                f10 = f19;
                eVar = eVar7;
                f11 = radius;
                canvas2 = canvas;
                com.github.mikephil.charting.utils.e.recycleInstance(eVar6);
                i9 = i11;
            } else {
                i8 = i10;
                list = dataSets;
                f11 = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f8 = phaseX;
                f9 = phaseY;
                f10 = f19;
                canvas2 = canvas5;
                eVar = centerCircleBox;
            }
            i10 = i8 + 1;
            canvas5 = canvas2;
            centerCircleBox = eVar;
            dataSets = list;
            radius = f11;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            phaseX = f8;
            phaseY = f9;
            f19 = f10;
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float getSliceSpace(v4.i iVar) {
        if (!iVar.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iVar.getSliceSpace();
        }
        if (iVar.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iVar.getYMin() / ((com.github.mikephil.charting.data.n) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iVar.getSliceSpace();
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
