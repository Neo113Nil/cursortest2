package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class wy0 {
    public static final vy0 a;

    static {
        vy0 vy0Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (Intrinsics.a(lowerCase, "robolectric")) {
                vy0Var = new vy0();
                a = vy0Var;
            }
        }
        vy0Var = null;
        a = vy0Var;
    }
}
