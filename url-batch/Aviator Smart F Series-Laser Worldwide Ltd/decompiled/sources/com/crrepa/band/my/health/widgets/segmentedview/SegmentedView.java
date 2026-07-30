package com.crrepa.band.my.health.widgets.segmentedview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SegmentedView extends View {
    private static final int LINE_WIDTH = 1;
    private static final int SEGMENT_MARGIN_TOP_PERCENT = 12;
    private static final int SEGMENT_RADIUS = 6;
    private float awakeBottom;
    private float awakeTop;
    private int[] bgColors;
    private int contentXEnd;
    private int contentXStart;
    private int highlightIndex;
    private Paint highlightSegmentPaint;
    private float lightBottom;
    private float lightTop;
    private int lineWidth;
    private float remBottom;
    private float remTop;
    private float restfulBottom;
    private float restfulTop;
    private Paint segmentPaint;
    private int segmentRadius;
    private List<Float> segmenthWidthList;
    private List<com.crrepa.band.my.health.widgets.segmentedview.a> sleepSegmentList;
    private float widthUnit;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState;

        static {
            int[] iArr = new int[SleepState.values().length];
            $SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState = iArr;
            try {
                iArr[SleepState.REM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState[SleepState.AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState[SleepState.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState[SleepState.RESTFUL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SegmentedView(Context context) {
        this(context, null);
    }

    private void drawHighlightSegment(Canvas canvas, RectF rectF) {
        com.crrepa.band.my.health.widgets.segmentedview.a segmentByID = getSegmentByID(this.highlightIndex);
        if (segmentByID == null) {
            return;
        }
        RectF rectF2 = new RectF(rectF.left, rectF.bottom - this.segmentRadius, rectF.right, getHeight());
        this.highlightSegmentPaint.setColor(this.bgColors[segmentByID.getType().getValue()]);
        this.highlightSegmentPaint.setAlpha(60);
        canvas.drawRect(rectF2, this.highlightSegmentPaint);
    }

    private void drawLine(Canvas canvas, PointF pointF, PointF pointF2, float f8, float f9, boolean z7) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i8 = this.segmentRadius;
        float f14 = f8 < ((float) i8) ? f8 * 0.8f : i8 + 2;
        float f15 = f9 < ((float) i8) ? f9 * 0.8f : i8 + 2;
        if (z7) {
            f12 = f15;
            f11 = f15 / 3.0f;
            f13 = f14 / 3.0f;
            f10 = f14;
        } else {
            f10 = f14 / 3.0f;
            f11 = f15;
            f12 = f15 / 3.0f;
            f13 = f14;
        }
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y - f10);
        path.lineTo(pointF.x - f14, pointF.y);
        path.lineTo(pointF.x, pointF.y + f13);
        path.lineTo(pointF2.x, pointF2.y + f12);
        path.lineTo(pointF2.x + f15, pointF2.y);
        path.lineTo(pointF2.x, pointF2.y - f11);
        path.close();
        this.segmentPaint.setStrokeWidth(this.lineWidth);
        canvas.drawPath(path, this.segmentPaint);
    }

    private void drawSegment(Canvas canvas, RectF rectF, float[] fArr) {
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, this.segmentPaint);
    }

    private int[] getBgColors() {
        return new int[]{ContextCompat.getColor(getContext(), R.color.color_awake), ContextCompat.getColor(getContext(), R.color.color_rem), ContextCompat.getColor(getContext(), R.color.color_light), ContextCompat.getColor(getContext(), R.color.color_restful)};
    }

    private void getContentRange() {
        this.contentXStart = getPaddingStart();
        this.contentXEnd = getWidth() - getPaddingEnd();
    }

    private int getContentWidth() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    private void getSegmentPosition() {
        int height = getHeight() / 12;
        float height2 = (getHeight() - (height * 3)) / 4.0f;
        this.awakeTop = 0.0f;
        float f8 = 0.0f + height2;
        this.awakeBottom = f8;
        float f9 = height;
        float f10 = f8 + f9;
        this.remTop = f10;
        float f11 = f10 + height2;
        this.remBottom = f11;
        float f12 = f11 + f9;
        this.lightTop = f12;
        float f13 = f12 + height2;
        this.lightBottom = f13;
        float f14 = f13 + f9;
        this.restfulTop = f14;
        this.restfulBottom = f14 + height2;
    }

    private float[] getSegmentRadii(boolean z7, boolean z8, boolean z9, boolean z10) {
        float[] fArr = new float[8];
        if (z7) {
            int i8 = this.segmentRadius;
            fArr[0] = i8;
            fArr[1] = i8;
        }
        if (z8) {
            int i9 = this.segmentRadius;
            fArr[2] = i9;
            fArr[3] = i9;
        }
        if (z10) {
            int i10 = this.segmentRadius;
            fArr[4] = i10;
            fArr[5] = i10;
        }
        if (z9) {
            int i11 = this.segmentRadius;
            fArr[6] = i11;
            fArr[7] = i11;
        }
        return fArr;
    }

    private RectF getSegmentRectf(com.crrepa.band.my.health.widgets.segmentedview.a aVar, float f8, float f9) {
        float f10;
        float f11;
        float time = (aVar.getTime() * f9) + f8;
        int i8 = a.$SwitchMap$com$crrepa$band$my$health$widgets$segmentedview$SleepState[aVar.getType().ordinal()];
        if (i8 == 1) {
            f10 = this.remTop;
            f11 = this.remBottom;
        } else if (i8 == 2) {
            f10 = this.awakeTop;
            f11 = this.awakeBottom;
        } else if (i8 == 3) {
            f10 = this.lightTop;
            f11 = this.lightBottom;
        } else if (i8 != 4) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.restfulTop;
            f11 = this.restfulBottom;
        }
        return new RectF(f8, f10, time, f11);
    }

    private float getWidthUnit() {
        float f8 = 0.0f;
        while (this.sleepSegmentList.iterator().hasNext()) {
            f8 += r0.next().getTime();
        }
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return getContentWidth() / f8;
    }

    private void init() {
        this.segmentRadius = o.dp2px(getContext(), 6.0f);
        this.lineWidth = o.dp2px(getContext(), 1.0f);
        this.bgColors = getBgColors();
        this.segmentPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.segmentPaint.setAntiAlias(true);
        this.segmentPaint.setStrokeWidth(this.lineWidth);
        this.highlightSegmentPaint.setStyle(Paint.Style.FILL);
        this.highlightSegmentPaint.setAntiAlias(true);
    }

    private boolean isSegmentEmpty() {
        List<com.crrepa.band.my.health.widgets.segmentedview.a> list = this.sleepSegmentList;
        return list == null || list.isEmpty();
    }

    public com.crrepa.band.my.health.widgets.segmentedview.a getSegmentByID(int i8) {
        if (i8 < 0 || this.sleepSegmentList.size() <= i8) {
            return null;
        }
        return this.sleepSegmentList.get(i8);
    }

    public int getSegmentIDByTouchPoint(float f8, float f9) {
        if (isSegmentEmpty()) {
            return -1;
        }
        float f10 = f8 - this.contentXStart;
        if (f10 >= 0.0f && this.contentXEnd >= f10) {
            for (int i8 = 0; i8 < this.segmenthWidthList.size(); i8++) {
                f10 -= this.segmenthWidthList.get(i8).floatValue();
                if (f10 <= 0.0f) {
                    return i8;
                }
            }
        }
        return -1;
    }

    public void highlightValue(int i8) {
        this.highlightIndex = i8;
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        PointF pointF;
        PointF pointF2;
        boolean z7;
        super.onDraw(canvas);
        if (isSegmentEmpty()) {
            return;
        }
        this.segmentPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.bgColors, (float[]) null, Shader.TileMode.CLAMP));
        getSegmentPosition();
        getContentRange();
        this.widthUnit = getWidthUnit();
        float paddingStart = getPaddingStart();
        ArrayList arrayList = new ArrayList();
        Iterator<com.crrepa.band.my.health.widgets.segmentedview.a> it = this.sleepSegmentList.iterator();
        while (it.hasNext()) {
            RectF segmentRectf = getSegmentRectf(it.next(), paddingStart, this.widthUnit);
            this.segmenthWidthList.add(Float.valueOf(segmentRectf.width()));
            float f8 = segmentRectf.right;
            arrayList.add(segmentRectf);
            paddingStart = f8;
        }
        int size = arrayList.size() - 1;
        RectF rectF = null;
        int i8 = 0;
        while (i8 <= size) {
            RectF rectF2 = (RectF) arrayList.get(i8);
            float[] segmentRadii = i8 == 0 ? getSegmentRadii(false, true, false, true) : i8 == size ? getSegmentRadii(true, false, true, false) : getSegmentRadii(true, true, true, true);
            if (this.highlightIndex == i8) {
                drawHighlightSegment(canvas, rectF2);
            }
            drawSegment(canvas, rectF2, segmentRadii);
            if (i8 > 0) {
                if (rectF.top < rectF2.top) {
                    pointF = new PointF(rectF.right, rectF.bottom);
                    pointF2 = new PointF(rectF2.left, rectF2.top);
                    z7 = true;
                } else {
                    pointF = new PointF(rectF.right, rectF.top);
                    pointF2 = new PointF(rectF2.left, rectF2.bottom);
                    z7 = false;
                }
                drawLine(canvas, pointF, pointF2, rectF.width(), rectF2.width(), z7);
            }
            i8++;
            rectF = rectF2;
        }
    }

    public void setSegmentList(List<com.crrepa.band.my.health.widgets.segmentedview.a> list) {
        this.sleepSegmentList = list;
        invalidate();
        requestLayout();
    }

    public SegmentedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentedView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.segmentPaint = new Paint();
        this.highlightSegmentPaint = new Paint();
        this.segmenthWidthList = new ArrayList();
        this.highlightIndex = -1;
        init();
    }
}
