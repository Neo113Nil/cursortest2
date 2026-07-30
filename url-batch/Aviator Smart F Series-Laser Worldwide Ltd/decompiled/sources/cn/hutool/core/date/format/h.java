package cn.hutool.core.date.format;

import cn.hutool.core.lang.Tuple;
import cn.hutool.core.lang.q;
import cn.hutool.core.map.SafeConcurrentHashMap;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
abstract class h {
    private static final ConcurrentMap<Tuple, String> C_DATE_TIME_INSTANCE_CACHE = new SafeConcurrentHashMap(7);
    static final int NONE = -1;
    private final ConcurrentMap<Tuple, Format> cInstanceCache = new SafeConcurrentHashMap(7);

    h() {
    }

    static String getPatternForStyle(Integer num, Integer num2, Locale locale) {
        Tuple tuple = new Tuple(num, num2, locale);
        ConcurrentMap<Tuple, String> concurrentMap = C_DATE_TIME_INSTANCE_CACHE;
        String str = concurrentMap.get(tuple);
        if (str != null) {
            return str;
        }
        try {
            String pattern = ((SimpleDateFormat) (num == null ? DateFormat.getTimeInstance(num2.intValue(), locale) : num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale))).toPattern();
            String putIfAbsent = concurrentMap.putIfAbsent(tuple, pattern);
            return putIfAbsent != null ? putIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale);
        }
    }

    protected abstract Format createInstance(String str, TimeZone timeZone, Locale locale);

    Format getDateInstance(int i8, TimeZone timeZone, Locale locale) {
        return getDateTimeInstance(Integer.valueOf(i8), null, timeZone, locale);
    }

    Format getDateTimeInstance(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return getInstance(getPatternForStyle(num, num2, locale), timeZone, locale);
    }

    public Format getInstance() {
        return getDateTimeInstance(3, 3, null, null);
    }

    Format getTimeInstance(int i8, TimeZone timeZone, Locale locale) {
        return getDateTimeInstance(null, Integer.valueOf(i8), timeZone, locale);
    }

    public Format getInstance(String str, TimeZone timeZone, Locale locale) {
        q.notBlank(str, "pattern must not be blank", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Tuple tuple = new Tuple(str, timeZone, locale);
        Format format = this.cInstanceCache.get(tuple);
        if (format != null) {
            return format;
        }
        Format createInstance = createInstance(str, timeZone, locale);
        Format putIfAbsent = this.cInstanceCache.putIfAbsent(tuple, createInstance);
        return putIfAbsent != null ? putIfAbsent : createInstance;
    }
}
