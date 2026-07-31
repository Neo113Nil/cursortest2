package b0;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275h {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f4271a;

    public C0275h(Bitmap bitmap) {
        this.f4271a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f4271a.getConfig();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i3 >= 26) {
                config = Bitmap.Config.HARDWARE;
                if (config3 == config) {
                    return 4;
                }
            }
        }
        return 0;
    }
}
