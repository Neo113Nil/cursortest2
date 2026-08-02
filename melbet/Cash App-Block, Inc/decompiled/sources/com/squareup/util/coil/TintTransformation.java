package com.squareup.util.coil;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.Size;
import coil3.transform.Transformation;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class TintTransformation extends Transformation {
    public final /* synthetic */ int $r8$classId;
    public final String cacheKey;
    public final Paint paint;

    public TintTransformation(int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 1:
                this.cacheKey = String.format("circle_fill(%08x)", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(i);
                this.paint = paint;
                break;
            default:
                this.cacheKey = String.format("tint(%08x)", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
                this.paint = paint2;
                break;
        }
    }

    @Override // coil3.transform.Transformation
    public final String getCacheKey() {
        switch (this.$r8$classId) {
        }
        return this.cacheKey;
    }

    @Override // coil3.transform.Transformation
    public final Bitmap transform(Bitmap bitmap, Size size) {
        int i = this.$r8$classId;
        Paint paint = this.paint;
        switch (i) {
            case 0:
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paint);
                return createBitmap;
            default:
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                int i2 = min / 2;
                Paint paint2 = new Paint(1);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                float f = min;
                RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f);
                Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                createBitmap2.getClass();
                Canvas canvas = new Canvas(createBitmap2);
                float f2 = i2;
                canvas.drawRoundRect(rectF, f2, f2, paint);
                canvas.drawRoundRect(rectF, f2, f2, paint2);
                return createBitmap2;
        }
    }
}
