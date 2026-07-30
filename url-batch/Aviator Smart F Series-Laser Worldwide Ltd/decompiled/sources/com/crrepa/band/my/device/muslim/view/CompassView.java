package com.crrepa.band.my.device.muslim.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.crrepa.band.my.R$drawable;

/* loaded from: classes2.dex */
public class CompassView extends View {
    private float angle;
    private Bitmap compassBitmap;
    private int destinationAngle;
    private Bitmap flowerBitmap;
    private Matrix matrix;
    private Bitmap needleBitmap;

    public CompassView(Context context) {
        super(context);
        this.angle = 0.0f;
        this.destinationAngle = 0;
        init();
    }

    private void init() {
        this.needleBitmap = BitmapFactory.decodeResource(getResources(), R$drawable.img_qibla_direction_compass_3);
        this.flowerBitmap = BitmapFactory.decodeResource(getResources(), R$drawable.img_qibla_direction_2);
        this.compassBitmap = BitmapFactory.decodeResource(getResources(), R$drawable.img_qibla_direction_1);
        this.matrix = new Matrix();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawBitmap(this.flowerBitmap, width - (r2.getWidth() >> 1), height - (this.flowerBitmap.getHeight() >> 1), (Paint) null);
        canvas.translate(width - (this.compassBitmap.getWidth() >> 1), height - (this.compassBitmap.getHeight() >> 1));
        this.matrix.reset();
        this.matrix.postRotate(-this.angle, this.compassBitmap.getWidth() >> 1, this.compassBitmap.getHeight() >> 1);
        canvas.drawBitmap(this.compassBitmap, this.matrix, null);
        canvas.translate((this.compassBitmap.getWidth() >> 1) - width, (this.compassBitmap.getHeight() >> 1) - height);
        canvas.translate(width - (this.needleBitmap.getWidth() >> 1), height - (this.needleBitmap.getHeight() >> 1));
        this.matrix.reset();
        this.matrix.postRotate((-this.angle) - (360 - this.destinationAngle), this.needleBitmap.getWidth() >> 1, this.needleBitmap.getHeight() >> 1);
        canvas.drawBitmap(this.needleBitmap, this.matrix, null);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(this.needleBitmap.getHeight(), this.needleBitmap.getHeight());
    }

    public void setAngle(float f8) {
        this.angle = f8;
        invalidate();
    }

    public void setDestinationAngle(int i8) {
        this.destinationAngle = i8;
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.angle = 0.0f;
        this.destinationAngle = 0;
        init();
    }

    public CompassView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.angle = 0.0f;
        this.destinationAngle = 0;
        init();
    }
}
