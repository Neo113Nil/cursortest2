package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class MarkerView extends RelativeLayout implements d {
    private com.github.mikephil.charting.utils.e mOffset;
    private com.github.mikephil.charting.utils.e mOffset2;
    private WeakReference<Chart> mWeakChart;

    public MarkerView(Context context, int i8) {
        super(context);
        this.mOffset = new com.github.mikephil.charting.utils.e();
        this.mOffset2 = new com.github.mikephil.charting.utils.e();
        setupLayoutResource(i8);
    }

    private void setupLayoutResource(int i8) {
        View inflate = LayoutInflater.from(getContext()).inflate(i8, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.d
    public void draw(Canvas canvas, float f8, float f9) {
        com.github.mikephil.charting.utils.e offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f8, f9);
        int save = canvas.save();
        canvas.translate(f8 + offsetForDrawingAtPoint.f14114x, f9 + offsetForDrawingAtPoint.f14115y);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.e getOffset() {
        return this.mOffset;
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.e getOffsetForDrawingAtPoint(float f8, float f9) {
        com.github.mikephil.charting.utils.e offset = getOffset();
        com.github.mikephil.charting.utils.e eVar = this.mOffset2;
        eVar.f14114x = offset.f14114x;
        eVar.f14115y = offset.f14115y;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        com.github.mikephil.charting.utils.e eVar2 = this.mOffset2;
        float f10 = eVar2.f14114x;
        if (f8 + f10 < 0.0f) {
            eVar2.f14114x = -f8;
        } else if (chartView != null && f8 + width + f10 > chartView.getWidth()) {
            this.mOffset2.f14114x = (chartView.getWidth() - f8) - width;
        }
        com.github.mikephil.charting.utils.e eVar3 = this.mOffset2;
        float f11 = eVar3.f14115y;
        if (f9 + f11 < 0.0f) {
            eVar3.f14115y = -f9;
        } else if (chartView != null && f9 + height + f11 > chartView.getHeight()) {
            this.mOffset2.f14115y = (chartView.getHeight() - f9) - height;
        }
        return this.mOffset2;
    }

    public void refreshContent(Entry entry, com.github.mikephil.charting.highlight.d dVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setChartView(Chart chart) {
        this.mWeakChart = new WeakReference<>(chart);
    }

    public void setOffset(com.github.mikephil.charting.utils.e eVar) {
        this.mOffset = eVar;
        if (eVar == null) {
            this.mOffset = new com.github.mikephil.charting.utils.e();
        }
    }

    public void setOffset(float f8, float f9) {
        com.github.mikephil.charting.utils.e eVar = this.mOffset;
        eVar.f14114x = f8;
        eVar.f14115y = f9;
    }
}
