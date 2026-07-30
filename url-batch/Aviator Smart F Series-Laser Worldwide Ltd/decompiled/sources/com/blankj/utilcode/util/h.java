package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class h {
    private static final int CACHE_SIZE = 64;
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final Map<String, Long> KEY_MILLIS_MAP = new ConcurrentHashMap(64);

    private h() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void clearIfNecessary(long j8) {
        Map<String, Long> map = KEY_MILLIS_MAP;
        if (map.size() < 64) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j8 >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }

    public static boolean isValid(@NonNull View view) {
        return isValid(view, 1000L);
    }

    public static boolean isValid(@NonNull View view, long j8) {
        return isValid(String.valueOf(view.hashCode()), j8);
    }

    public static boolean isValid(@NonNull String str, long j8) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        }
        if (j8 >= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            clearIfNecessary(elapsedRealtime);
            Map<String, Long> map = KEY_MILLIS_MAP;
            Long l8 = map.get(str);
            if (l8 != null && elapsedRealtime < l8.longValue()) {
                return false;
            }
            map.put(str, Long.valueOf(elapsedRealtime + j8));
            return true;
        }
        throw new IllegalArgumentException("The duration is less than 0.");
    }
}
