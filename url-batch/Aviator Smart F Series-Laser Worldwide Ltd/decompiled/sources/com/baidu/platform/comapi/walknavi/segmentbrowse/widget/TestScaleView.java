package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;

/* loaded from: classes2.dex */
public class TestScaleView extends View {

    /* renamed from: a, reason: collision with root package name */
    private double f10290a;

    /* renamed from: b, reason: collision with root package name */
    private double f10291b;

    public TestScaleView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 25;
        rect.right = (int) ((this.f10290a / this.f10291b) * com.baidu.platform.comapi.walknavi.i.c.f10101b);
        paint.setColor(Color.rgb(61, GattError.GATT_INVALID_CFG, 255));
        canvas.drawRect(rect, paint);
        Rect rect2 = new Rect();
        double d8 = this.f10290a / this.f10291b;
        int i8 = com.baidu.platform.comapi.walknavi.i.c.f10101b;
        rect2.left = (int) (d8 * i8);
        rect2.top = 0;
        rect2.bottom = 25;
        rect2.right = i8;
        paint.setColor(Color.rgb(234, 234, 234));
        canvas.drawRect(rect2, paint);
    }

    public void refresh() {
        invalidate();
    }

    public void setPassLengthAndTotalLength(int i8, int i9) {
        this.f10290a = i8;
        this.f10291b = i9;
        invalidate();
    }

    public TestScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
