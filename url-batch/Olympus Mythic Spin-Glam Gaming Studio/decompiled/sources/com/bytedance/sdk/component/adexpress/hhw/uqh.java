package com.bytedance.sdk.component.adexpress.hhw;

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
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class uqh extends ImageView {
    private Matrix fb;
    private int fs;
    private Paint zmn;
    private int zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public uqh(Context context) {
        this(context, null);
    }

    public uqh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uqh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fs = 25;
        this.zn = 25;
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setAntiAlias(true);
        this.zmn.setFilterBitmap(true);
        this.fb = new Matrix();
    }

    public void setXRound(int i) {
        this.fs = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.zn = i;
        postInvalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            Bitmap zmn = zmn(drawable);
            if (zmn != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(zmn, tileMode, tileMode);
                float max = (zmn.getWidth() == getWidth() && zmn.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / zmn.getWidth(), (getHeight() * 1.0f) / zmn.getHeight());
                this.fb.setScale(max, max);
                bitmapShader.setLocalMatrix(this.fb);
                this.zmn.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.fs, this.zn, this.zmn);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    private Bitmap zmn(Drawable drawable) {
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
