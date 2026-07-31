package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class fb extends View {
    private float btk;
    private List<Integer> bvs;
    private int fb;
    private int fs;
    private int hhw;
    private Paint iv;
    private float klz;
    private float mw;
    private boolean nps;
    private Paint rc;
    private int rt;
    private List<Integer> zg;
    private int zmn;
    private float zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public fb(Context context) {
        this(context, null);
    }

    public fb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public fb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zmn = -1;
        this.fs = -65536;
        this.zn = 18.0f;
        this.fb = 3;
        this.btk = 50.0f;
        this.hhw = 2;
        this.nps = false;
        this.zg = new ArrayList();
        this.bvs = new ArrayList();
        this.rt = 24;
        zn();
    }

    private void zn() {
        Paint paint = new Paint();
        this.iv = paint;
        paint.setAntiAlias(true);
        this.iv.setStrokeWidth(this.rt);
        this.zg.add(255);
        this.bvs.add(0);
        Paint paint2 = new Paint();
        this.rc = paint2;
        paint2.setAntiAlias(true);
        this.rc.setColor(Color.parseColor("#0FFFFFFF"));
        this.rc.setStyle(Paint.Style.FILL);
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
        this.klz = f;
        this.mw = i2 / 2.0f;
        float f2 = f - (this.rt / 2.0f);
        this.btk = f2;
        this.zn = f2 / 4.0f;
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
        this.iv.setShader(new LinearGradient(this.klz, 0.0f, this.mw, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.zg.size()) {
                break;
            }
            Integer num = this.zg.get(i);
            this.iv.setAlpha(num.intValue());
            Integer num2 = this.bvs.get(i);
            if (this.zn + num2.intValue() < this.btk) {
                canvas.drawCircle(this.klz, this.mw, this.zn + num2.intValue(), this.iv);
            }
            if (num.intValue() > 0 && num2.intValue() < this.btk) {
                this.zg.set(i, Integer.valueOf(num.intValue() - this.hhw > 0 ? num.intValue() - (this.hhw * 3) : 1));
                this.bvs.set(i, Integer.valueOf(num2.intValue() + this.hhw));
            }
            i++;
        }
        List<Integer> list = this.bvs;
        if (list.get(list.size() - 1).intValue() >= this.btk / this.fb) {
            this.zg.add(255);
            this.bvs.add(0);
        }
        if (this.bvs.size() >= 3) {
            this.bvs.remove(0);
            this.zg.remove(0);
        }
        this.iv.setAlpha(255);
        this.iv.setColor(this.fs);
        canvas.drawCircle(this.klz, this.mw, this.zn, this.rc);
        if (this.nps) {
            invalidate();
        }
    }

    public void zmn() {
        this.nps = true;
        invalidate();
    }

    public void fs() {
        this.nps = false;
        this.bvs.clear();
        this.zg.clear();
        this.zg.add(255);
        this.bvs.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.zmn = i;
    }

    public void setCoreColor(int i) {
        this.fs = i;
    }

    public void setCoreRadius(int i) {
        this.zn = i;
    }

    public void setDiffuseWidth(int i) {
        this.fb = i;
    }

    public void setMaxWidth(int i) {
        this.btk = i;
    }

    public void setDiffuseSpeed(int i) {
        this.hhw = i;
    }
}
