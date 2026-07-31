package com.bytedance.adsdk.ugeno.bvs.hhw;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.zmn.nps;
import com.bytedance.adsdk.ugeno.zmn.zg;

/* loaded from: classes5.dex */
public class zmn extends TextView implements IAnimation, nps {
    private float btk;
    private float fb;
    private float fs;
    private float hhw;
    private float nps;
    private fb zmn;
    private zg zn;

    public zmn(Context context) {
        super(context);
        this.fb = -1.0f;
        this.hhw = 1.0f;
        this.nps = 0.0f;
        this.zn = new zg(this);
    }

    public void zmn(fb fbVar) {
        this.zmn = fbVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.zmn;
        if (fbVar != null) {
            int[] zmn = fbVar.zmn(i, i2);
            super.onMeasure(zmn[0], zmn[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zmn(i, i2, i3, i4);
        }
        if (z && this.fb > 0.0f) {
            zmn(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.zmn.nps
    public float getRipple() {
        return this.fs;
    }

    public void setShine(float f) {
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.zn(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getShine() {
        return this.zn.getShine();
    }

    public void setStretch(float f) {
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.fb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getStretch() {
        return this.zn.getStretch();
    }

    public void setRubIn(float f) {
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.btk(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRubIn() {
        return this.zn.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.fs = f;
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.fs(f);
        }
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zmn(canvas, this);
            this.zmn.zmn(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.fs(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.zmn(f);
        }
    }

    public float getBorderRadius() {
        return this.zn.zmn();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.zn.zmn(i);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.btk = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.btk = getTextSize();
    }

    public void setMinTextSize(float f) {
        this.fb = f;
    }

    private void zmn(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.btk == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float f = this.btk;
        int zmn = zmn(text, paint, i, f);
        while (zmn > i2 && f > this.fb) {
            Log.d("UGTextView", "resizeText: targetSize=" + f + "; mMinTextSize=" + this.fb);
            f = Math.max(f - 1.0f, this.fb);
            zmn = zmn(text, paint, i, f);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(f)));
        setTextSize(0, f);
        setLineSpacing(this.nps, this.hhw);
    }

    private int zmn(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.hhw, this.nps, true).getHeight();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.hhw = f2;
        this.nps = f;
    }
}
