package org.bouncycastle.asn1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
class z1 {
    private static Long ZERO = longValueOf(0);
    private static final Map localeCache = new HashMap();
    static Locale EN_Locale = forEN();

    z1() {
    }

    static Date epochAdjust(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = localeCache;
        synchronized (map) {
            try {
                Long l8 = (Long) map.get(locale);
                if (l8 == null) {
                    long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                    l8 = time == 0 ? ZERO : longValueOf(time);
                    map.put(locale, l8);
                }
                if (l8 != ZERO) {
                    return new Date(date.getTime() - l8.longValue());
                }
                return date;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Locale forEN() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i8 = 0; i8 != availableLocales.length; i8++) {
            if ("en".equalsIgnoreCase(availableLocales[i8].getLanguage())) {
                return availableLocales[i8];
            }
        }
        return Locale.getDefault();
    }

    private static Long longValueOf(long j8) {
        return Long.valueOf(j8);
    }
}
