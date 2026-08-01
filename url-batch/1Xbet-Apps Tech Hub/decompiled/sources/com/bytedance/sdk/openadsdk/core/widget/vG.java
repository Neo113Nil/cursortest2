package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.mnm;

/* compiled from: TTCustomShadowBackground.java */
/* loaded from: classes2.dex */
public class vG extends Drawable {
    private final float[] Jd;
    private final int Mxy;
    private final LinearGradient NB;
    private RectF Wyp;
    private final int icD;
    private final int pvs;
    private Paint qh;
    private final int sUS;
    private final int so;
    private final int[] vG;
    private final int yiw;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public vG(int i, int[] iArr, float[] fArr, int i2, LinearGradient linearGradient, int i3, int i4, int i5, int i6) {
        this.pvs = i;
        this.vG = iArr;
        this.Jd = fArr;
        this.icD = i2;
        this.NB = linearGradient;
        this.sUS = i3;
        this.yiw = i4;
        this.so = i5;
        this.Mxy = i6;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.Wyp == null) {
            Rect bounds = getBounds();
            this.Wyp = new RectF((bounds.left + this.yiw) - this.so, (bounds.top + this.yiw) - this.Mxy, (bounds.right - this.yiw) - this.so, (bounds.bottom - this.yiw) - this.Mxy);
        }
        if (this.qh == null) {
            pvs();
        }
        RectF rectF = this.Wyp;
        int i = this.sUS;
        canvas.drawRoundRect(rectF, i, i, this.qh);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Paint paint = this.qh;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.qh;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    private void pvs() {
        int[] iArr;
        Paint paint = new Paint();
        this.qh = paint;
        paint.setAntiAlias(true);
        this.qh.setShadowLayer(this.yiw, this.so, this.Mxy, this.icD);
        if (this.Wyp != null && (iArr = this.vG) != null && iArr.length > 1) {
            float[] fArr = this.Jd;
            boolean z = fArr != null && fArr.length > 0 && fArr.length == iArr.length;
            Paint paint2 = this.qh;
            LinearGradient linearGradient = this.NB;
            if (linearGradient == null) {
                linearGradient = new LinearGradient(this.Wyp.left, 0.0f, this.Wyp.right, 0.0f, this.vG, z ? this.Jd : null, Shader.TileMode.CLAMP);
            }
            paint2.setShader(linearGradient);
            return;
        }
        this.qh.setColor(this.pvs);
    }

    public static void pvs(View view, pvs pvsVar) {
        if (view == null || pvsVar == null) {
            return;
        }
        view.setLayerType(1, null);
        view.setBackground(pvsVar.pvs());
    }

    /* compiled from: TTCustomShadowBackground.java */
    public static class pvs {
        private float[] Jd;
        private int Mxy;
        private LinearGradient NB;
        private int so;
        private int[] vG;
        private int pvs = uc.Mxy(mnm.pvs(), "tt_ssxinmian8");
        private int icD = uc.Mxy(mnm.pvs(), "tt_ssxinxian3");
        private int sUS = 10;
        private int yiw = 16;

        public pvs() {
            this.so = 0;
            this.Mxy = 0;
            this.so = 0;
            this.Mxy = 0;
        }

        public pvs pvs(int i) {
            this.pvs = i;
            return this;
        }

        public pvs icD(int i) {
            this.icD = i;
            return this;
        }

        public pvs pvs(int[] iArr) {
            this.vG = iArr;
            return this;
        }

        public pvs vG(int i) {
            this.sUS = i;
            return this;
        }

        public pvs Jd(int i) {
            this.so = i;
            return this;
        }

        public pvs NB(int i) {
            this.Mxy = i;
            return this;
        }

        public vG pvs() {
            return new vG(this.pvs, this.vG, this.Jd, this.icD, this.NB, this.sUS, this.yiw, this.so, this.Mxy);
        }
    }
}
