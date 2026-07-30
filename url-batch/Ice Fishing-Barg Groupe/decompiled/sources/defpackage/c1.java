package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c1 {
    public static boolean PxuCJdSBwIXG() {
        try {
            if (r1.vfcx0XMziUg4 == null) {
                r1.vfcx0XMziUg4 = Class.forName("android.os.SystemProperties");
            }
            if (r1.ctD2u3GUHhtA == null) {
                Class cls = r1.vfcx0XMziUg4;
                r1.ctD2u3GUHhtA = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = r1.ctD2u3GUHhtA;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return cs0.wdg6QnbFHrFF(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }
}
