package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public final class BitmapCompat {

    @RequiresApi(27)
    static class Api27Impl {
        private Api27Impl() {
        }

        @DoNotInline
        static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(config, true);
        }

        @DoNotInline
        static Bitmap createBitmapWithSourceColorspace(int i8, int i9, Bitmap bitmap, boolean z7) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z7 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i8, i9, config, bitmap.hasAlpha(), colorSpace);
        }

        @DoNotInline
        static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private BitmapCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
    
        if (androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r11) == false) goto L124;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i8, int i9, @Nullable Rect rect, boolean z7) {
        Paint paint;
        double floor;
        Paint paint2;
        Bitmap bitmap2;
        int i10;
        Rect rect2;
        Bitmap bitmap3;
        if (i8 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i11 = Build.VERSION.SDK_INT;
        Bitmap copyBitmapIfHardware = i11 >= 27 ? Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int width = rect != null ? rect.width() : bitmap.getWidth();
        int height = rect != null ? rect.height() : bitmap.getHeight();
        float f8 = i8 / width;
        float f9 = i9 / height;
        int i12 = rect != null ? rect.left : 0;
        int i13 = rect != null ? rect.top : 0;
        if (i12 == 0 && i13 == 0 && i8 == bitmap.getWidth() && i9 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == copyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : copyBitmapIfHardware;
        }
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        if (i11 >= 29) {
            Api29Impl.setPaintBlendMode(paint3);
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (width == i8 && height == i9) {
            Bitmap createBitmap = Bitmap.createBitmap(i8, i9, copyBitmapIfHardware.getConfig());
            new Canvas(createBitmap).drawBitmap(copyBitmapIfHardware, -i12, -i13, paint3);
            return createBitmap;
        }
        double log = Math.log(2.0d);
        if (f8 > 1.0f) {
            paint = paint3;
            floor = Math.ceil(Math.log(f8) / log);
        } else {
            paint = paint3;
            floor = Math.floor(Math.log(f8) / log);
        }
        int i14 = (int) floor;
        int ceil = (int) (f9 > 1.0f ? Math.ceil(Math.log(f9) / log) : Math.floor(Math.log(f9) / log));
        if (!z7 || i11 < 27 || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            paint2 = paint;
            bitmap2 = null;
            i10 = 0;
        } else {
            Bitmap createBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(i14 > 0 ? sizeAtStep(width, i8, 1, i14) : width, ceil > 0 ? sizeAtStep(height, i9, 1, ceil) : height, bitmap, true);
            paint2 = paint;
            new Canvas(createBitmapWithSourceColorspace).drawBitmap(copyBitmapIfHardware, -i12, -i13, paint2);
            i13 = 0;
            i12 = 0;
            i10 = 1;
            bitmap2 = copyBitmapIfHardware;
            copyBitmapIfHardware = createBitmapWithSourceColorspace;
        }
        Rect rect3 = new Rect(i12, i13, width, height);
        Rect rect4 = new Rect();
        int i15 = i14;
        int i16 = ceil;
        while (true) {
            if (i15 == 0 && i16 == 0) {
                break;
            }
            if (i15 < 0) {
                i15++;
            } else if (i15 > 0) {
                i15--;
            }
            if (i16 < 0) {
                i16++;
            } else if (i16 > 0) {
                i16--;
            }
            int i17 = i16;
            Paint paint4 = paint2;
            Rect rect5 = rect3;
            rect4.set(0, 0, sizeAtStep(width, i8, i15, i14), sizeAtStep(height, i9, i17, ceil));
            boolean z8 = i15 == 0 && i17 == 0;
            boolean z9 = bitmap2 != null && bitmap2.getWidth() == i8 && bitmap2.getHeight() == i9;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z7) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT >= 27) {
                    }
                } else {
                    rect2 = rect4;
                }
                if (!z8 || (z9 && i10 == 0)) {
                    bitmap3 = bitmap2;
                    Rect rect6 = rect2;
                    new Canvas(bitmap3).drawBitmap(copyBitmapIfHardware, rect5, rect6, paint4);
                    rect5.set(rect6);
                    i16 = i17;
                    Bitmap bitmap4 = copyBitmapIfHardware;
                    copyBitmapIfHardware = bitmap3;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint2 = paint4;
                    bitmap2 = bitmap4;
                }
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int sizeAtStep = sizeAtStep(width, i8, i15 > 0 ? i10 : i15, i14);
            int sizeAtStep2 = sizeAtStep(height, i9, i17 > 0 ? i10 : i17, ceil);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmap3 = Api27Impl.createBitmapWithSourceColorspace(sizeAtStep, sizeAtStep2, bitmap, z7 && !z8);
            } else {
                bitmap3 = Bitmap.createBitmap(sizeAtStep, sizeAtStep2, copyBitmapIfHardware.getConfig());
            }
            Rect rect62 = rect2;
            new Canvas(bitmap3).drawBitmap(copyBitmapIfHardware, rect5, rect62, paint4);
            rect5.set(rect62);
            i16 = i17;
            Bitmap bitmap42 = copyBitmapIfHardware;
            copyBitmapIfHardware = bitmap3;
            rect4 = rect62;
            rect3 = rect5;
            paint2 = paint4;
            bitmap2 = bitmap42;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return copyBitmapIfHardware;
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z7) {
        bitmap.setHasMipMap(z7);
    }

    @VisibleForTesting
    static int sizeAtStep(int i8, int i9, int i10, int i11) {
        return i10 == 0 ? i9 : i10 > 0 ? i8 * (1 << (i11 - i10)) : i9 << ((-i10) - 1);
    }
}
