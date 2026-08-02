package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bif {
    private static final bmc a = new bmb(new bie());

    public static boolean a(BitmapFactory.Options options) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT != 34) {
            return false;
        }
        Bitmap.Config config2 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        if (config2 == config) {
            return ((Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
