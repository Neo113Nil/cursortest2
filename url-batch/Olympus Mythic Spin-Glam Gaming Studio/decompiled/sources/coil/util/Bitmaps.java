package coil.util;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: Bitmaps.kt */
/* renamed from: coil.util.-Bitmaps, reason: invalid class name */
/* loaded from: classes14.dex */
public abstract class Bitmaps {
    public static final int getBytesPerPixel(Bitmap.Config config) {
        Bitmap.Config config2;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                return 8;
            }
        }
        return 4;
    }

    public static final int getAllocationByteCountCompat(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            return getBytesPerPixel(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
        }
    }

    public static final boolean isHardware(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
        }
        return false;
    }

    public static final Bitmap.Config getSafeConfig(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final Bitmap.Config toSoftware(Bitmap.Config config) {
        return (config == null || isHardware(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
