package a3;

import android.util.Log;
import com.google.android.gms.internal.ads.d30;
import com.google.android.gms.internal.ads.io0;

/* loaded from: classes.dex */
public final class r1 extends io0 {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z6 = true;
            for (String str2 : io0.f6719a.d(str)) {
                if (z6) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z6 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return io0.j(2) && d30.f4056a.e().booleanValue();
    }
}
