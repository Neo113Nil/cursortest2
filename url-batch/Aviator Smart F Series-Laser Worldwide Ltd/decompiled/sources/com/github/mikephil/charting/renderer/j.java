package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.renderer.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends k {
    protected Path cubicFillPath;
    protected Path cubicPath;
    protected Canvas mBitmapCanvas;
    protected Bitmap.Config mBitmapConfig;
    protected u4.g mChart;
    protected Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mGenerateFilledPathBuffer;
    private HashMap<v4.e, b> mImageCaches;
    private float[] mLineBuffer;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(u4.g gVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        this.cubicPath = new Path();
        this.cubicFillPath = new Path();
        this.mLineBuffer = new float[4];
        this.mGenerateFilledPathBuffer = new Path();
        this.mImageCaches = new HashMap<>();
        this.mCirclesBuffer = new float[2];
        this.mChart = gVar;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    private void generateFilledPath(v4.f fVar, int i8, int i9, Path path) {
        float fillLinePosition = fVar.getFillFormatter().getFillLinePosition(fVar, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z7 = fVar.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        Entry entryForIndex = fVar.getEntryForIndex(i8);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i10 = i8 + 1;
        Entry entry = null;
        while (i10 <= i9) {
            entry = fVar.getEntryForIndex(i10);
            if (z7) {
                path.lineTo(entry.getX(), entryForIndex.getY() * phaseY);
            }
            path.lineTo(entry.getX(), entry.getY() * phaseY);
            i10++;
            entryForIndex = entry;
        }
        if (entry != null) {
            path.lineTo(entry.getX(), fillLinePosition);
        }
        path.close();
    }

    protected void drawCircles(Canvas canvas) {
        b bVar;
        Bitmap bitmap;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.mCirclesBuffer;
        char c8 = 0;
        float f8 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<v4.e> dataSets = this.mChart.getLineData().getDataSets();
        int i8 = 0;
        while (i8 < dataSets.size()) {
            v4.f fVar = (v4.f) dataSets.get(i8);
            if (fVar.isVisible() && fVar.isDrawCirclesEnabled() && fVar.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(fVar.getCircleHoleColor());
                com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar.getAxisDependency());
                this.mXBounds.set(this.mChart, fVar);
                float circleRadius = fVar.getCircleRadius();
                float circleHoleRadius = fVar.getCircleHoleRadius();
                boolean z7 = fVar.isDrawCircleHoleEnabled() && circleHoleRadius < circleRadius && circleHoleRadius > f8;
                boolean z8 = z7 && fVar.getCircleHoleColor() == 1122867;
                a aVar = null;
                if (this.mImageCaches.containsKey(fVar)) {
                    bVar = this.mImageCaches.get(fVar);
                } else {
                    bVar = new b(this, aVar);
                    this.mImageCaches.put(fVar, bVar);
                }
                if (bVar.init(fVar)) {
                    bVar.fill(fVar, z7, z8);
                }
                c.a aVar2 = this.mXBounds;
                int i9 = aVar2.range;
                int i10 = aVar2.min;
                int i11 = i9 + i10;
                while (i10 <= i11) {
                    Entry entryForIndex = fVar.getEntryForIndex(i10);
                    if (entryForIndex == null) {
                        break;
                    }
                    this.mCirclesBuffer[c8] = entryForIndex.getX();
                    this.mCirclesBuffer[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mCirclesBuffer[c8])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mCirclesBuffer[c8]) && this.mViewPortHandler.isInBoundsY(this.mCirclesBuffer[1]) && (bitmap = bVar.getBitmap(i10)) != null) {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmap, fArr2[c8] - circleRadius, fArr2[1] - circleRadius, (Paint) null);
                    }
                    i10++;
                    c8 = 0;
                }
            }
            i8++;
            c8 = 0;
            f8 = 0.0f;
        }
    }

    protected void drawCubicBezier(v4.f fVar) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar.getAxisDependency());
        this.mXBounds.set(this.mChart, fVar);
        float cubicIntensity = fVar.getCubicIntensity();
        this.cubicPath.reset();
        c.a aVar = this.mXBounds;
        if (aVar.range >= 1) {
            int i8 = aVar.min;
            Entry entryForIndex = fVar.getEntryForIndex(Math.max(i8 - 1, 0));
            Entry entryForIndex2 = fVar.getEntryForIndex(Math.max(i8, 0));
            if (entryForIndex2 != null) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                Entry entry = entryForIndex2;
                int i9 = this.mXBounds.min + 1;
                int i10 = -1;
                while (true) {
                    c.a aVar2 = this.mXBounds;
                    if (i9 > aVar2.range + aVar2.min) {
                        break;
                    }
                    if (i10 != i9) {
                        entryForIndex2 = fVar.getEntryForIndex(i9);
                    }
                    int i11 = i9 + 1;
                    if (i11 < fVar.getEntryCount()) {
                        i9 = i11;
                    }
                    Entry entryForIndex3 = fVar.getEntryForIndex(i9);
                    this.cubicPath.cubicTo(entry.getX() + ((entryForIndex2.getX() - entryForIndex.getX()) * cubicIntensity), (entry.getY() + ((entryForIndex2.getY() - entryForIndex.getY()) * cubicIntensity)) * phaseY, entryForIndex2.getX() - ((entryForIndex3.getX() - entry.getX()) * cubicIntensity), (entryForIndex2.getY() - ((entryForIndex3.getY() - entry.getY()) * cubicIntensity)) * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                    entryForIndex = entry;
                    entry = entryForIndex2;
                    entryForIndex2 = entryForIndex3;
                    int i12 = i9;
                    i9 = i11;
                    i10 = i12;
                }
            } else {
                return;
            }
        }
        if (fVar.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, fVar, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(fVar.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawCubicFill(Canvas canvas, v4.f fVar, Path path, com.github.mikephil.charting.utils.g gVar, c.a aVar) {
        float fillLinePosition = fVar.getFillFormatter().getFillLinePosition(fVar, this.mChart);
        path.lineTo(fVar.getEntryForIndex(aVar.min + aVar.range).getX(), fillLinePosition);
        path.lineTo(fVar.getEntryForIndex(aVar.min).getX(), fillLinePosition);
        path.close();
        gVar.pathValueToPixel(path);
        Drawable fillDrawable = fVar.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, fVar.getFillColor(), fVar.getFillAlpha());
        }
    }

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
            bitmap = Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig);
            this.mDrawBitmap = new WeakReference<>(bitmap);
            this.mBitmapCanvas = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        Iterator<v4.e> it = this.mChart.getLineData().getDataSets().iterator();
        while (it.hasNext()) {
            v4.f fVar = (v4.f) it.next();
            if (fVar.isVisible()) {
                drawDataSet(canvas, fVar);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mRenderPaint);
    }

    protected void drawDataSet(Canvas canvas, v4.f fVar) {
        if (fVar.getEntryCount() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(fVar.getLineWidth());
        this.mRenderPaint.setPathEffect(fVar.getDashPathEffect());
        int i8 = a.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[fVar.getMode().ordinal()];
        if (i8 == 3) {
            drawCubicBezier(fVar);
        } else if (i8 != 4) {
            drawLinear(canvas, fVar);
        } else {
            drawHorizontalBezier(fVar);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.k lineData = this.mChart.getLineData();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            v4.h hVar = (v4.f) lineData.getDataSetByIndex(dVar.getDataSetIndex());
            if (hVar != null && hVar.isHighlightEnabled()) {
                Entry entryForXValue = hVar.getEntryForXValue(dVar.getX(), dVar.getY());
                if (isInBoundsX(entryForXValue, hVar)) {
                    com.github.mikephil.charting.utils.d pixelForValues = this.mChart.getTransformer(hVar.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    dVar.setDraw((float) pixelForValues.f14112x, (float) pixelForValues.f14113y);
                    drawHighlightLines(canvas, (float) pixelForValues.f14112x, (float) pixelForValues.f14113y, hVar);
                }
            }
        }
    }

    protected void drawHorizontalBezier(v4.f fVar) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar.getAxisDependency());
        this.mXBounds.set(this.mChart, fVar);
        this.cubicPath.reset();
        c.a aVar = this.mXBounds;
        if (aVar.range >= 1) {
            Entry entryForIndex = fVar.getEntryForIndex(aVar.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i8 = this.mXBounds.min + 1;
            while (true) {
                c.a aVar2 = this.mXBounds;
                if (i8 > aVar2.range + aVar2.min) {
                    break;
                }
                Entry entryForIndex2 = fVar.getEntryForIndex(i8);
                float x7 = entryForIndex.getX() + ((entryForIndex2.getX() - entryForIndex.getX()) / 2.0f);
                this.cubicPath.cubicTo(x7, entryForIndex.getY() * phaseY, x7, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i8++;
                entryForIndex = entryForIndex2;
            }
        }
        if (fVar.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, fVar, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(fVar.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawLinear(Canvas canvas, v4.f fVar) {
        int entryCount = fVar.getEntryCount();
        boolean z7 = fVar.getMode() == LineDataSet.Mode.STEPPED;
        int i8 = z7 ? 4 : 2;
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = fVar.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, fVar);
        if (fVar.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, fVar, transformer, this.mXBounds);
        }
        if (fVar.getColors().size() > 1) {
            int i9 = i8 * 2;
            if (this.mLineBuffer.length <= i9) {
                this.mLineBuffer = new float[i8 * 4];
            }
            int i10 = this.mXBounds.min;
            while (true) {
                c.a aVar = this.mXBounds;
                if (i10 > aVar.range + aVar.min) {
                    break;
                }
                Entry entryForIndex = fVar.getEntryForIndex(i10);
                if (entryForIndex != null) {
                    this.mLineBuffer[0] = entryForIndex.getX();
                    this.mLineBuffer[1] = entryForIndex.getY() * phaseY;
                    if (i10 < this.mXBounds.max) {
                        Entry entryForIndex2 = fVar.getEntryForIndex(i10 + 1);
                        if (entryForIndex2 == null) {
                            break;
                        }
                        if (z7) {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            float[] fArr = this.mLineBuffer;
                            float f8 = fArr[1];
                            fArr[3] = f8;
                            fArr[4] = fArr[2];
                            fArr[5] = f8;
                            fArr[6] = entryForIndex2.getX();
                            this.mLineBuffer[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            this.mLineBuffer[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mLineBuffer[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mLineBuffer[2]) && (this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[1]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[3]))) {
                        this.mRenderPaint.setColor(fVar.getColor(i10));
                        canvas2.drawLines(this.mLineBuffer, 0, i9, this.mRenderPaint);
                    }
                }
                i10++;
            }
        } else {
            int i11 = entryCount * i8;
            if (this.mLineBuffer.length < Math.max(i11, i8) * 2) {
                this.mLineBuffer = new float[Math.max(i11, i8) * 4];
            }
            if (fVar.getEntryForIndex(this.mXBounds.min) != null) {
                int i12 = this.mXBounds.min;
                int i13 = 0;
                while (true) {
                    c.a aVar2 = this.mXBounds;
                    if (i12 > aVar2.range + aVar2.min) {
                        break;
                    }
                    Entry entryForIndex3 = fVar.getEntryForIndex(i12 == 0 ? 0 : i12 - 1);
                    Entry entryForIndex4 = fVar.getEntryForIndex(i12);
                    if (entryForIndex3 != null && entryForIndex4 != null) {
                        this.mLineBuffer[i13] = entryForIndex3.getX();
                        int i14 = i13 + 2;
                        this.mLineBuffer[i13 + 1] = entryForIndex3.getY() * phaseY;
                        if (z7) {
                            this.mLineBuffer[i14] = entryForIndex4.getX();
                            this.mLineBuffer[i13 + 3] = entryForIndex3.getY() * phaseY;
                            this.mLineBuffer[i13 + 4] = entryForIndex4.getX();
                            i14 = i13 + 6;
                            this.mLineBuffer[i13 + 5] = entryForIndex3.getY() * phaseY;
                        }
                        this.mLineBuffer[i14] = entryForIndex4.getX();
                        this.mLineBuffer[i14 + 1] = entryForIndex4.getY() * phaseY;
                        i13 = i14 + 2;
                    }
                    i12++;
                }
                if (i13 > 0) {
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    int max = Math.max((this.mXBounds.range + 1) * i8, i8) * 2;
                    this.mRenderPaint.setColor(fVar.getColor());
                    canvas2.drawLines(this.mLineBuffer, 0, max, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawLinearFill(Canvas canvas, v4.f fVar, com.github.mikephil.charting.utils.g gVar, c.a aVar) {
        int i8;
        int i9;
        Path path = this.mGenerateFilledPathBuffer;
        int i10 = aVar.min;
        int i11 = aVar.range + i10;
        int i12 = 0;
        do {
            i8 = (i12 * 128) + i10;
            i9 = i8 + 128;
            if (i9 > i11) {
                i9 = i11;
            }
            if (i8 <= i9) {
                generateFilledPath(fVar, i8, i9, path);
                gVar.pathValueToPixel(path);
                Drawable fillDrawable = fVar.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, fVar.getFillColor(), fVar.getFillAlpha());
                }
            }
            i12++;
        } while (i8 <= i9);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        int i8;
        v4.f fVar;
        Entry entry;
        if (isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = this.mChart.getLineData().getDataSets();
            for (int i9 = 0; i9 < dataSets.size(); i9++) {
                v4.f fVar2 = (v4.f) dataSets.get(i9);
                if (shouldDrawValues(fVar2) && fVar2.getEntryCount() >= 1) {
                    applyValueTextStyle(fVar2);
                    com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar2.getAxisDependency());
                    int circleRadius = (int) (fVar2.getCircleRadius() * 1.75f);
                    if (!fVar2.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i10 = circleRadius;
                    this.mXBounds.set(this.mChart, fVar2);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    c.a aVar = this.mXBounds;
                    float[] generateTransformedValuesLine = transformer.generateTransformedValuesLine(fVar2, phaseX, phaseY, aVar.min, aVar.max);
                    com.github.mikephil.charting.formatter.g valueFormatter = fVar2.getValueFormatter();
                    com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(fVar2.getIconsOffset());
                    eVar.f14114x = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar.f14114x);
                    eVar.f14115y = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar.f14115y);
                    int i11 = 0;
                    while (i11 < generateTransformedValuesLine.length) {
                        float f8 = generateTransformedValuesLine[i11];
                        float f9 = generateTransformedValuesLine[i11 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f8)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f8) && this.mViewPortHandler.isInBoundsY(f9)) {
                            int i12 = i11 / 2;
                            Entry entryForIndex = fVar2.getEntryForIndex(this.mXBounds.min + i12);
                            if (fVar2.isDrawValuesEnabled()) {
                                entry = entryForIndex;
                                i8 = i10;
                                fVar = fVar2;
                                drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), f8, f9 - i10, fVar2.getValueTextColor(i12));
                            } else {
                                entry = entryForIndex;
                                i8 = i10;
                                fVar = fVar2;
                            }
                            if (entry.getIcon() != null && fVar.isDrawIconsEnabled()) {
                                Drawable icon = entry.getIcon();
                                com.github.mikephil.charting.utils.i.drawImage(canvas, icon, (int) (f8 + eVar.f14114x), (int) (f9 + eVar.f14115y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i8 = i10;
                            fVar = fVar2;
                        }
                        i11 += 2;
                        fVar2 = fVar;
                        i10 = i8;
                    }
                    com.github.mikephil.charting.utils.e.recycleInstance(eVar);
                }
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
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

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    private class b {
        private Bitmap[] circleBitmaps;
        private Path mCirclePathBuffer;

        private b() {
            this.mCirclePathBuffer = new Path();
        }

        protected void fill(v4.f fVar, boolean z7, boolean z8) {
            int circleColorCount = fVar.getCircleColorCount();
            float circleRadius = fVar.getCircleRadius();
            float circleHoleRadius = fVar.getCircleHoleRadius();
            for (int i8 = 0; i8 < circleColorCount; i8++) {
                int i9 = (int) (circleRadius * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.circleBitmaps[i8] = createBitmap;
                j.this.mRenderPaint.setColor(fVar.getCircleColor(i8));
                if (z8) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, j.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, j.this.mRenderPaint);
                    if (z7) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, j.this.mCirclePaintInner);
                    }
                }
            }
        }

        protected Bitmap getBitmap(int i8) {
            Bitmap[] bitmapArr = this.circleBitmaps;
            return bitmapArr[i8 % bitmapArr.length];
        }

        protected boolean init(v4.f fVar) {
            int circleColorCount = fVar.getCircleColorCount();
            Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.circleBitmaps = new Bitmap[circleColorCount];
            return true;
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }
}
