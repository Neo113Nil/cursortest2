package com.bytedance.sdk.component.adexpress.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.sdk.component.utils.Ju;

/* loaded from: classes.dex */
public class BrushMaskView extends View {
    private static final String pvs = "BrushMaskView";
    private Canvas Jd;
    private Path Mxy;
    private Paint NB;
    private Paint Wyp;
    private Paint icD;
    private BitmapDrawable sUS;
    private Path so;
    private Bitmap vG;
    private Paint yiw;

    public BrushMaskView(Context context) {
        super(context);
        pvs(context);
    }

    private void pvs(Context context) {
        Paint paint = new Paint();
        this.icD = paint;
        paint.setAntiAlias(true);
        this.icD.setDither(true);
        setMaskColor(-1426063361);
        Paint paint2 = new Paint();
        this.NB = paint2;
        paint2.setAntiAlias(true);
        this.NB.setDither(true);
        Paint paint3 = new Paint();
        this.Wyp = paint3;
        paint3.setColor(-7829368);
        this.Wyp.setAlpha(100);
        this.Wyp.setAntiAlias(true);
        this.Wyp.setDither(true);
        this.Wyp.setStyle(Paint.Style.STROKE);
        this.Wyp.setStrokeCap(Paint.Cap.ROUND);
        setWatermark(-1);
        Paint paint4 = new Paint();
        this.yiw = paint4;
        paint4.setAntiAlias(true);
        this.yiw.setDither(true);
        this.yiw.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.yiw.setStyle(Paint.Style.STROKE);
        this.yiw.setStrokeCap(Paint.Cap.ROUND);
        setEraserSize(60.0f);
        this.so = new Path();
        this.Mxy = new Path();
    }

    public void setEraserSize(float f) {
        this.yiw.setStrokeWidth(f);
        this.Wyp.setStrokeWidth(f);
    }

    public void setMaskColor(int i) {
        this.icD.setColor(i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(pvs(i), pvs(i2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.vG;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.NB);
        }
    }

    public void pvs(float f, float f2) {
        icD(f, f2);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        pvs(i, i2);
    }

    private void pvs(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.vG = createBitmap;
            Canvas canvas = this.Jd;
            if (canvas == null) {
                this.Jd = new Canvas(this.vG);
            } else {
                canvas.setBitmap(createBitmap);
            }
            this.Jd.drawRoundRect(new RectF(0.0f, 0.0f, i, i2), 120.0f, 120.0f, this.icD);
            if (this.sUS != null) {
                this.sUS.setBounds(new Rect(0, 0, i, i2));
                this.sUS.draw(this.Jd);
            }
        } catch (Exception e) {
            Ju.pvs(pvs, e.getMessage());
        }
    }

    private int pvs(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(0, size);
        }
        return 0;
    }

    private void icD(float f, float f2) {
        this.so.reset();
        this.Mxy.reset();
        this.so.moveTo(f, f2);
        this.Mxy.moveTo(f, f2);
    }

    public void setWatermark(int i) {
        if (i == -1) {
            this.sUS = null;
        } else {
            this.sUS = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), i));
        }
    }

    public void pvs() {
        pvs(getWidth(), getHeight());
        invalidate();
    }

    public void icD() {
        vG();
    }

    public void vG() {
        final int width = getWidth();
        final int height = getHeight();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setIntValues(0, width);
        valueAnimator.setInterpolator(new TimeInterpolator() { // from class: com.bytedance.sdk.component.adexpress.widget.BrushMaskView.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                int i = (int) (width * f);
                if (BrushMaskView.this.Jd != null) {
                    Canvas canvas = BrushMaskView.this.Jd;
                    int i2 = height;
                    canvas.drawRect(0.0f, i2 / 2, i - 50, i2 / 2, BrushMaskView.this.yiw);
                    BrushMaskView.this.Jd.drawCircle(i, height / 2, 10.0f, BrushMaskView.this.yiw);
                }
                BrushMaskView.this.postInvalidate();
                return f;
            }
        });
        valueAnimator.start();
    }
}
