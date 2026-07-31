package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class zg extends View {
    private static final int[] zmn = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint btk;
    private int bvs;
    private final ArrayList<zmn> fb;
    private final RectF fs;
    private final Paint hhw;
    private int nps;
    private int zg;
    private final RectF zn;

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

    public zg(Context context) {
        super(context);
        this.fs = new RectF();
        this.zn = new RectF();
        this.fb = new ArrayList<>();
        this.hhw = new Paint();
        Paint paint = new Paint();
        this.btk = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    public void setProgress(int i) {
        int i2 = this.zg;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.zg = i;
        zmn();
    }

    private void zmn() {
        if (this.nps <= 0) {
            return;
        }
        int width = (int) (((this.zg * 1.0f) / 100.0f) * getWidth());
        this.zn.right = Math.max(this.bvs, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.nps = i5;
        this.bvs = i5 * 5;
        float f = i;
        float f2 = i2;
        this.fs.set(0.0f, 0.0f, f, f2);
        this.zn.set(0.0f, 0.0f, 0.0f, f2);
        this.hhw.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.fb.clear();
        float f3 = this.nps / 4.0f;
        for (int i6 : zmn) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.fb.add(new zmn(paint, this.nps / 2.0f, f3, f2 / 2.0f));
            f3 += (this.nps / 2.0f) * 3.0f;
        }
        zmn();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.fs;
        int i = this.nps;
        canvas.drawRoundRect(rectF, i, i, this.btk);
        RectF rectF2 = this.zn;
        int i2 = this.nps;
        canvas.drawRoundRect(rectF2, i2, i2, this.hhw);
        int save = canvas.save();
        canvas.translate(this.zn.right - this.bvs, 0.0f);
        Iterator<zmn> it = this.fb.iterator();
        while (it.hasNext()) {
            zmn next = it.next();
            canvas.drawCircle(next.zn, next.fb, next.fs, next.zmn);
        }
        canvas.restoreToCount(save);
    }

    private static final class zmn {
        float fb;
        public float fs;
        public Paint zmn;
        float zn;

        public zmn(Paint paint, float f, float f2, float f3) {
            this.zmn = paint;
            this.fs = f;
            this.zn = f2;
            this.fb = f3;
        }
    }
}
