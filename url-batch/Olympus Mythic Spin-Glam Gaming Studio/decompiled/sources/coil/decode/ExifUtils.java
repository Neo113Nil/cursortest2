package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.util.Bitmaps;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* compiled from: ExifUtils.kt */
/* loaded from: classes3.dex */
public final class ExifUtils {
    public static final ExifUtils INSTANCE = new ExifUtils();
    private static final Paint PAINT = new Paint(3);

    private ExifUtils() {
    }

    public final ExifData getExifData(String str, BufferedSource bufferedSource, ExifOrientationPolicy exifOrientationPolicy) {
        if (ExifUtilsKt.supports(exifOrientationPolicy, str)) {
            ExifInterface exifInterface = new ExifInterface(new ExifInterfaceInputStream(bufferedSource.peek().inputStream()));
            return new ExifData(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return ExifData.NONE;
    }

    public final Bitmap reverseTransformations(Bitmap bitmap, ExifData exifData) {
        Bitmap createBitmap;
        if (!exifData.isFlipped() && !ExifUtilsKt.isRotated(exifData)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (exifData.isFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (ExifUtilsKt.isRotated(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f, -rectF.top);
        }
        if (ExifUtilsKt.isSwapped(exifData)) {
            createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmaps.getSafeConfig(bitmap));
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        } else {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmaps.getSafeConfig(bitmap));
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, PAINT);
        bitmap.recycle();
        return createBitmap;
    }
}
