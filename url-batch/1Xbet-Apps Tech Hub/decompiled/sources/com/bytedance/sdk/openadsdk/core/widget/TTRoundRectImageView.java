package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes2.dex */
public class TTRoundRectImageView extends PAGImageView {
    private final Matrix Jd;
    private final RectF NB;
    private int icD;
    private final Paint pvs;
    private BitmapShader sUS;
    private int vG;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.icD = 25;
        this.vG = 25;
        this.NB = new RectF();
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.Jd = new Matrix();
    }

    public void setXRound(int i) {
        this.icD = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.vG = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.NB.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap pvs;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.sUS == null && (pvs = pvs(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.sUS = new BitmapShader(pvs, tileMode, tileMode);
            float max = (pvs.getWidth() == getWidth() && pvs.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / pvs.getWidth(), (getHeight() * 1.0f) / pvs.getHeight());
            this.Jd.setScale(max, max);
            this.sUS.setLocalMatrix(this.Jd);
        }
        BitmapShader bitmapShader = this.sUS;
        if (bitmapShader != null) {
            this.pvs.setShader(bitmapShader);
            canvas.drawRoundRect(this.NB, this.icD, this.vG, this.pvs);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.sUS = null;
    }

    private Bitmap pvs(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
