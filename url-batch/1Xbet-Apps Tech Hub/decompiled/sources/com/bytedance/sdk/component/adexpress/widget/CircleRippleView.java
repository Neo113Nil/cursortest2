package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CircleRippleView extends View {
    private int IP;
    private int Jd;
    private float Ju;
    private List<Integer> Mxy;
    private float NB;
    private Paint Wyp;
    private int icD;
    private float kj;
    private int pvs;
    private Paint qh;
    private int sUS;
    private List<Integer> so;
    private float vG;
    private boolean yiw;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pvs = -1;
        this.icD = -65536;
        this.vG = 18.0f;
        this.Jd = 3;
        this.NB = 50.0f;
        this.sUS = 2;
        this.yiw = false;
        this.so = new ArrayList();
        this.Mxy = new ArrayList();
        this.IP = 24;
        vG();
    }

    private void vG() {
        Paint paint = new Paint();
        this.Wyp = paint;
        paint.setAntiAlias(true);
        this.Wyp.setStrokeWidth(this.IP);
        this.so.add(255);
        this.Mxy.add(0);
        Paint paint2 = new Paint();
        this.qh = paint2;
        paint2.setAntiAlias(true);
        this.qh.setColor(Color.parseColor("#0FFFFFFF"));
        this.qh.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.kj = f;
        this.Ju = i2 / 2.0f;
        float f2 = f - (this.IP / 2.0f);
        this.NB = f2;
        this.vG = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.Wyp.setShader(new LinearGradient(this.kj, 0.0f, this.Ju, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.so.size()) {
                break;
            }
            Integer num = this.so.get(i);
            this.Wyp.setAlpha(num.intValue());
            Integer num2 = this.Mxy.get(i);
            if (this.vG + num2.intValue() < this.NB) {
                canvas.drawCircle(this.kj, this.Ju, this.vG + num2.intValue(), this.Wyp);
            }
            if (num.intValue() > 0 && num2.intValue() < this.NB) {
                this.so.set(i, Integer.valueOf(num.intValue() - this.sUS > 0 ? num.intValue() - (this.sUS * 3) : 1));
                this.Mxy.set(i, Integer.valueOf(num2.intValue() + this.sUS));
            }
            i++;
        }
        List<Integer> list = this.Mxy;
        if (list.get(list.size() - 1).intValue() >= this.NB / this.Jd) {
            this.so.add(255);
            this.Mxy.add(0);
        }
        if (this.Mxy.size() >= 3) {
            this.Mxy.remove(0);
            this.so.remove(0);
        }
        this.Wyp.setAlpha(255);
        this.Wyp.setColor(this.icD);
        canvas.drawCircle(this.kj, this.Ju, this.vG, this.qh);
        if (this.yiw) {
            invalidate();
        }
    }

    public void pvs() {
        this.yiw = true;
        invalidate();
    }

    public void icD() {
        this.yiw = false;
        this.Mxy.clear();
        this.so.clear();
        this.so.add(255);
        this.Mxy.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.pvs = i;
    }

    public void setCoreColor(int i) {
        this.icD = i;
    }

    public void setCoreRadius(int i) {
        this.vG = i;
    }

    public void setDiffuseWidth(int i) {
        this.Jd = i;
    }

    public void setMaxWidth(int i) {
        this.NB = i;
    }

    public void setDiffuseSpeed(int i) {
        this.sUS = i;
    }
}
