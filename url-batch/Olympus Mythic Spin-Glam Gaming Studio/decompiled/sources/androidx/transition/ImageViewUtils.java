package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes9.dex */
class ImageViewUtils {
    private static boolean sTryHiddenAnimateTransform = true;

    static void animateTransform(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.animateTransform(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        hiddenAnimateTransform(imageView, matrix);
    }

    private static void hiddenAnimateTransform(ImageView imageView, Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                Api29Impl.animateTransform(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void animateTransform(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }
}
