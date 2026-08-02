package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import io.flutter.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class ImageUtils {
    private static final String TAG = "ImageUtils";

    public static Bitmap applyFlipIfNeeded(Bitmap bitmap, int i4) {
        if (bitmap == null || !isFlipCase(i4)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        if (i4 == 2) {
            matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        } else if (i4 == 7) {
            matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        } else if (i4 == 4) {
            matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
        } else {
            if (i4 != 5) {
                return bitmap;
            }
            matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] getBytes(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        return bArr;
    }

    public static boolean isFlipCase(int i4) {
        switch (i4) {
            case 1:
            case 3:
            case 6:
            case 8:
                break;
            case 2:
            case 4:
            case 5:
            case 7:
                break;
            default:
                Log.e(TAG, "Unknown EXIF orientation: " + i4);
                break;
        }
        return false;
    }
}
