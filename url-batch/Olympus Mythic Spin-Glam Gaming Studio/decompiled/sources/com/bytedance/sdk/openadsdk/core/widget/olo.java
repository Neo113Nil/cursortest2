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
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class olo extends com.bytedance.sdk.openadsdk.core.hhw.fb {
    private final RectF btk;
    private final Matrix fb;
    private int fs;
    private BitmapShader hhw;
    private final Paint zmn;
    private int zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public olo(Context context) {
        this(context, null);
    }

    public olo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public olo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fs = 25;
        this.zn = 25;
        this.btk = new RectF();
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
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

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.btk.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap zmn;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.hhw == null && (zmn = zmn(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.hhw = new BitmapShader(zmn, tileMode, tileMode);
            float max = (zmn.getWidth() == getWidth() && zmn.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / zmn.getWidth(), (getHeight() * 1.0f) / zmn.getHeight());
            this.fb.setScale(max, max);
            this.hhw.setLocalMatrix(this.fb);
        }
        BitmapShader bitmapShader = this.hhw;
        if (bitmapShader != null) {
            this.zmn.setShader(bitmapShader);
            canvas.drawRoundRect(this.btk, this.fs, this.zn, this.zmn);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.hhw = null;
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
