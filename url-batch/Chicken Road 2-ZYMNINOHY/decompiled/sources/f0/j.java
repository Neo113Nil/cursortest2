package f0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class j implements Z.a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8496a;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f8496a = z;
            }
        }
        z = false;
        f8496a = z;
    }
}
