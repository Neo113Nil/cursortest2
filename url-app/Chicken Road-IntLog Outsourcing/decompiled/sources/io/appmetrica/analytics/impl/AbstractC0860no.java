package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0860no {
    public static boolean a(Object obj) {
        return obj != null;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean a(Map map) {
        return map == null || map.size() == 0;
    }

    public static boolean a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static BigDecimal a(long j2) {
        return new BigDecimal(j2).divide(new BigDecimal(1000000), 6, 6);
    }

    public static double a(double d6) {
        return (Double.isNaN(d6) || Double.isInfinite(d6)) ? ConfigValue.DOUBLE_DEFAULT_VALUE : d6;
    }
}
