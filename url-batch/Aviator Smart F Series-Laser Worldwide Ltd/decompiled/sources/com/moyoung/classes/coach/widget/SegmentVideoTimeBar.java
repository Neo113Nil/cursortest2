package com.moyoung.classes.coach.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.moyoung.classes.R$bool;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class SegmentVideoTimeBar extends ProgressBar {
    private Paint segmentPaint;
    private List<Integer> segmentTimeList;
    private int totalTime;

    public SegmentVideoTimeBar(Context context) {
        super(context);
    }

    private void drawSegmentLine(Canvas canvas) {
        if (this.segmentTimeList == null) {
            return;
        }
        float f8 = 0.0f;
        for (int i8 = 0; i8 < this.segmentTimeList.size() && i8 != this.segmentTimeList.size() - 1; i8++) {
            f8 += (this.segmentTimeList.get(i8).intValue() / this.totalTime) * getWidth();
            canvas.drawLine(f8, 0.5f, f8, getHeight() - 0.5f, this.segmentPaint);
        }
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.segmentPaint = paint;
        paint.setAntiAlias(true);
        this.segmentPaint.setStyle(Paint.Style.STROKE);
        this.segmentPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.segmentPaint.setStrokeWidth(4.0f);
    }

    public List<Integer> getSegmentTimeList() {
        return this.segmentTimeList;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSegmentLine(canvas);
    }

    public void setSegmentColorRes(@ColorRes int i8) {
        this.segmentPaint.setColor(ContextCompat.getColor(getContext(), i8));
    }

    public void showSegment(List<Integer> list) {
        if (getResources().getBoolean(R$bool.is_right_to_left)) {
            Collections.reverse(list);
        }
        this.segmentTimeList = list;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.totalTime += it.next().intValue();
        }
        invalidate();
    }

    public SegmentVideoTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initPaint();
    }

    public SegmentVideoTimeBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        initPaint();
    }
}
