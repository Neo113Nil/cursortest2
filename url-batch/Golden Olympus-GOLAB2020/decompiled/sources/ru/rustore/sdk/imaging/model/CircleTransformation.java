package ru.rustore.sdk.imaging.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class CircleTransformation extends Transformation {
    public CircleTransformation() {
        super(null);
    }

    @Override // ru.rustore.sdk.imaging.model.Transformation
    public Bitmap transform$sdk_public_imaging_release(Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int min = Math.min(source.getWidth(), source.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(source, (source.getWidth() - min) / 2, (source.getHeight() - min) / 2, min, min);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(source, x, y, size, size)");
        Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(size, size, Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint(1);
        float f4 = min / 2.0f;
        canvas.drawCircle(f4, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        createBitmap.recycle();
        if (!Intrinsics.areEqual(source, createBitmap2) && !Intrinsics.areEqual(source, createBitmap)) {
            source.recycle();
        }
        return createBitmap2;
    }
}
