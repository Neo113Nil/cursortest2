package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w3 implements ym0 {
    public final Bitmap PxuCJdSBwIXG;

    public w3(Bitmap bitmap) {
        this.PxuCJdSBwIXG = bitmap;
    }

    public final int PxuCJdSBwIXG() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.PxuCJdSBwIXG.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            an0.Companion.getClass();
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            an0.Companion.getClass();
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            an0.Companion.getClass();
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                an0.Companion.getClass();
                return 3;
            }
        }
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            if (config3 == config) {
                an0.Companion.getClass();
                return 4;
            }
        }
        an0.Companion.getClass();
        return 0;
    }
}
