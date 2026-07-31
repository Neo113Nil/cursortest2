package K0;

import com.huawei.hms.framework.common.Logger;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f814a = "e";

    public static boolean a(Long l4) {
        if (l4 == null) {
            Logger.v(f814a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(f814a, "isSpExpire spValue NumberFormatException.");
        }
        if (l4.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i(f814a, "isSpExpire false.");
            return false;
        }
        Logger.i(f814a, "isSpExpire true.");
        return true;
    }

    public static boolean b(Long l4, long j4) {
        if (l4 == null) {
            Logger.v(f814a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l4.longValue() - (System.currentTimeMillis() + j4) >= 0) {
                Logger.v(f814a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f814a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
