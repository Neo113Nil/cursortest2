package ru.rustore.sdk.imaging.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class RoundedTransformation extends Transformation {
    private final float cornerRadius;

    public RoundedTransformation(float f4) {
        super(null);
        this.cornerRadius = f4;
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Corner radius must be >= 0");
        }
    }

    @Override // ru.rustore.sdk.imaging.model.Transformation
    public Bitmap transform$sdk_public_imaging_release(Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        float f4 = width;
        float f5 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f4, f5);
        float min = Math.min(f4 / 2.0f, f5 / 2.0f);
        float f6 = this.cornerRadius;
        if (f6 > min || f6 > 100.0f) {
            f6 = Math.min(f4 / 8.0f, f5 / 8.0f);
        }
        canvas.drawRoundRect(rectF, f6, f6, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        if (!Intrinsics.areEqual(source, createBitmap)) {
            source.recycle();
        }
        return createBitmap;
    }
}
