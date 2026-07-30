package com.crrepa.band.my.health.ecg.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes2.dex */
public class a {
    private int gridColor;
    private int gridFrameColor;
    private int gridFrameWidth;
    private int gridLineWidth;
    private float gridWidth;
    private Paint paint = new Paint();
    private int sGridColor;
    private int sGridLineWidth;

    public a(Context context) {
        this.gridColor = ContextCompat.getColor(context, R.color.color_ecg_chart_thick_line);
        this.sGridColor = ContextCompat.getColor(context, R.color.color_ecg_chart_thin_line);
        this.gridFrameColor = ContextCompat.getColor(context, R.color.color_ecg);
        this.gridLineWidth = o.dp2px(context, 1.0f);
        this.sGridLineWidth = o.dp2px(context, 0.5f);
        this.gridFrameWidth = o.dp2px(context, 0.5f);
    }

    public void drawDirdBackGround(Canvas canvas, int i8, int i9, boolean z7, int i10) {
        if (canvas == null) {
            return;
        }
        canvas.drawColor(i10);
        this.paint.setColor(this.gridFrameColor);
        this.paint.setStrokeWidth(this.gridFrameWidth);
        float f8 = i8;
        canvas.drawLine(0.0f, 0.0f, f8, 0.0f, this.paint);
        float f9 = i9 - this.gridFrameWidth;
        canvas.drawLine(0.0f, f9, f8, f9, this.paint);
        if (z7) {
            this.gridWidth = b.getGirdWidth(i9);
            int i11 = 1;
            while (true) {
                float f10 = i11;
                if (f10 >= 30.0f) {
                    break;
                }
                if (i11 % 5 == 0) {
                    this.paint.setColor(this.gridColor);
                    this.paint.setStrokeWidth(this.gridLineWidth);
                } else {
                    this.paint.setColor(this.sGridColor);
                    this.paint.setStrokeWidth(this.sGridLineWidth);
                }
                float f11 = (int) (f10 * this.gridWidth);
                canvas.drawLine(0.0f, f11, f8, f11, this.paint);
                i11++;
            }
            int i12 = (int) (f8 / this.gridWidth);
            for (int i13 = 1; i13 <= i12; i13++) {
                if (i13 % 5 == 0) {
                    this.paint.setColor(this.gridColor);
                    this.paint.setStrokeWidth(this.gridLineWidth);
                } else {
                    this.paint.setColor(this.sGridColor);
                    this.paint.setStrokeWidth(this.sGridLineWidth);
                }
                float f12 = (int) (i13 * this.gridWidth);
                canvas.drawLine(f12, 0.0f, f12, i9, this.paint);
            }
        }
    }
}
