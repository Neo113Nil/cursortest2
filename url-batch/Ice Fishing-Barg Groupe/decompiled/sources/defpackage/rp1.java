package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class rp1 {
    public static final qp1 PxuCJdSBwIXG;

    static {
        qp1 qp1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                qp1Var = new qp1();
                PxuCJdSBwIXG = qp1Var;
            }
        }
        qp1Var = null;
        PxuCJdSBwIXG = qp1Var;
    }
}
