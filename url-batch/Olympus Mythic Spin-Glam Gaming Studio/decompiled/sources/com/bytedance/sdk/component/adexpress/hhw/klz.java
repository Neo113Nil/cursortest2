package com.bytedance.sdk.component.adexpress.hhw;

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
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class klz extends View {
    private int btk;
    private int[] bvs;
    private final List<zmn> cn;
    private int fb;
    Rect fs;
    private int hhw;
    private Bitmap iv;
    private Xfermode klz;
    private PorterDuff.Mode mw;
    private int nps;
    private Paint rc;
    private LinearGradient rt;
    private int zg;
    Rect zmn;
    private int zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public klz(Context context) {
        super(context);
        this.mw = PorterDuff.Mode.DST_IN;
        this.cn = new ArrayList();
        zmn();
    }

    private void zmn() {
        this.zn = com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_splash_unlock_image_arrow");
        this.fb = Color.parseColor("#00ffffff");
        this.btk = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.hhw = parseColor;
        this.nps = 10;
        this.zg = 40;
        this.bvs = new int[]{this.fb, this.btk, parseColor};
        setLayerType(1, null);
        this.rc = new Paint(1);
        this.iv = BitmapFactory.decodeResource(getResources(), this.zn);
        this.klz = new PorterDuffXfermode(this.mw);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.iv, this.zmn, this.fs, this.rc);
        canvas.save();
        Iterator<zmn> it = this.cn.iterator();
        while (it.hasNext()) {
            zmn next = it.next();
            this.rt = new LinearGradient(next.fs, 0.0f, next.fs + this.zg, this.nps, this.bvs, (float[]) null, Shader.TileMode.CLAMP);
            this.rc.setColor(-1);
            this.rc.setShader(this.rt);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.rc);
            this.rc.setShader(null);
            next.zmn();
            if (next.fs > getWidth()) {
                it.remove();
            }
        }
        this.rc.setXfermode(this.klz);
        canvas.drawBitmap(this.iv, this.zmn, this.fs, this.rc);
        this.rc.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.iv == null) {
            return;
        }
        this.zmn = new Rect(0, 0, this.iv.getWidth(), this.iv.getHeight());
        this.fs = new Rect(0, 0, getWidth(), getHeight());
    }

    public void zmn(int i) {
        this.cn.add(new zmn(i));
        postInvalidate();
    }

    public static class zmn {
        private int fs = 0;
        private final int zmn;

        public zmn(int i) {
            this.zmn = i;
        }

        public void zmn() {
            this.fs += this.zmn;
        }
    }
}
