package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class WriggleGuideView extends View {
    private Bitmap Jd;
    private pvs Mxy;
    private Paint NB;
    private int icD;
    private int pvs;
    private int sUS;
    private boolean so;
    private Bitmap vG;
    private boolean yiw;

    public interface pvs {
    }

    private Bitmap pvs(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), uc.Jd(getContext(), "tt_wriggle_union"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i, i2), this.NB);
        }
        return createBitmap;
    }

    private Bitmap icD(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), uc.Jd(getContext(), "tt_wriggle_union_white"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i, i2), paint);
        }
        return createBitmap;
    }

    private Bitmap vG(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(i / 2, 10.0f, this.sUS, paint);
        return createBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.yiw) {
            this.pvs = getWidth();
            int height = getHeight();
            this.icD = height;
            this.vG = pvs(this.pvs, height);
            this.Jd = icD(this.pvs, this.icD);
            this.yiw = false;
        }
        Bitmap bitmap = this.vG;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.NB);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        Bitmap bitmap2 = this.Jd;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.NB);
        }
        this.NB.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(vG(this.pvs, this.icD), 0.0f, 0.0f, this.NB);
        this.NB.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        if (this.so) {
            this.sUS += 5;
            invalidate();
            if (this.sUS >= this.pvs) {
                this.so = false;
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.Mxy != null) {
            this.Mxy = null;
        }
    }
}
