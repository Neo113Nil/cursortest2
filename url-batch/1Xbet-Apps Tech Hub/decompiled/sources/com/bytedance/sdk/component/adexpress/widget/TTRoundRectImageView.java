package com.bytedance.sdk.component.adexpress.widget;

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
import android.widget.ImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends ImageView {
    private Matrix Jd;
    private int icD;
    private Paint pvs;
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
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setAntiAlias(true);
        this.pvs.setFilterBitmap(true);
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap pvs = pvs(drawable);
            if (pvs != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(pvs, tileMode, tileMode);
                float max = (pvs.getWidth() == getWidth() && pvs.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / pvs.getWidth(), (getHeight() * 1.0f) / pvs.getHeight());
                this.Jd.setScale(max, max);
                bitmapShader.setLocalMatrix(this.Jd);
                this.pvs.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.icD, this.vG, this.pvs);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
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
