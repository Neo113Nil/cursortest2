package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ha0 {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ ha0[] $VALUES;
    public static final ha0 AUTOMATIC = new ha0("AUTOMATIC", 0);
    public static final ha0 TRUNCATE = new ha0("TRUNCATE", 1);
    public static final ha0 WRITE_AHEAD_LOGGING = new ha0("WRITE_AHEAD_LOGGING", 2);

    private static final /* synthetic */ ha0[] $values() {
        return new ha0[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
    }

    static {
        ha0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private ha0(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static ha0 valueOf(String str) {
        return (ha0) Enum.valueOf(ha0.class, str);
    }

    public static ha0[] values() {
        return (ha0[]) $VALUES.clone();
    }

    public final ha0 resolve$room_runtime_release(Context context) {
        context.getClass();
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
    }
}
