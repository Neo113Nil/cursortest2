package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.uc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FlowLightView extends View {
    private LinearGradient IP;
    private int Jd;
    private PorterDuff.Mode Ju;
    private int[] Mxy;
    private int NB;
    private Bitmap Wyp;
    private final List<pvs> bNS;
    Rect icD;
    private Xfermode kj;
    Rect pvs;
    private Paint qh;
    private int sUS;
    private int so;
    private int vG;
    private int yiw;

    public FlowLightView(Context context) {
        super(context);
        this.Ju = PorterDuff.Mode.DST_IN;
        this.bNS = new ArrayList();
        pvs();
    }

    private void pvs() {
        this.vG = uc.Jd(getContext(), "tt_splash_unlock_image_arrow");
        this.Jd = Color.parseColor("#00ffffff");
        this.NB = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.sUS = parseColor;
        this.yiw = 10;
        this.so = 40;
        this.Mxy = new int[]{this.Jd, this.NB, parseColor};
        setLayerType(1, null);
        this.qh = new Paint(1);
        this.Wyp = BitmapFactory.decodeResource(getResources(), this.vG);
        this.kj = new PorterDuffXfermode(this.Ju);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.Wyp, this.pvs, this.icD, this.qh);
        canvas.save();
        Iterator<pvs> it = this.bNS.iterator();
        while (it.hasNext()) {
            pvs next = it.next();
            this.IP = new LinearGradient(next.icD, 0.0f, next.icD + this.so, this.yiw, this.Mxy, (float[]) null, Shader.TileMode.CLAMP);
            this.qh.setColor(-1);
            this.qh.setShader(this.IP);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.qh);
            this.qh.setShader(null);
            next.pvs();
            if (next.icD > getWidth()) {
                it.remove();
            }
        }
        this.qh.setXfermode(this.kj);
        canvas.drawBitmap(this.Wyp, this.pvs, this.icD, this.qh);
        this.qh.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.Wyp == null) {
            return;
        }
        this.pvs = new Rect(0, 0, this.Wyp.getWidth(), this.Wyp.getHeight());
        this.icD = new Rect(0, 0, getWidth(), getHeight());
    }

    public void pvs(int i) {
        this.bNS.add(new pvs(i));
        postInvalidate();
    }

    public static class pvs {
        private int icD = 0;
        private final int pvs;

        public pvs(int i) {
            this.pvs = i;
        }

        public void pvs() {
            this.icD += this.pvs;
        }
    }
}
