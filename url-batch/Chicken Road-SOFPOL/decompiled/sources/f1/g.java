package f1;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f2643a;

    public g(Bitmap bitmap) {
        this.f2643a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f2643a.getConfig();
        q6.i.b(config3);
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config = Bitmap.Config.HARDWARE;
        return config3 == config ? 4 : 0;
    }
}
