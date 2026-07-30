package cn.hutool.core.date.format;

import cn.hutool.core.collection.v0;
import cn.hutool.core.date.z;
import cn.hutool.core.lang.q;
import cn.hutool.core.map.SafeConcurrentHashMap;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public class o {
    public static final String FORMAT_MILLISECONDS = "#SSS";
    public static final String FORMAT_SECONDS = "#sss";
    private static final Map<CharSequence, Function<Date, String>> formatterMap = new SafeConcurrentHashMap();
    private static final Map<CharSequence, Function<CharSequence, Date>> parserMap = new SafeConcurrentHashMap();

    static {
        putFormatter(FORMAT_SECONDS, new Function() { // from class: cn.hutool.core.date.format.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$static$0;
                lambda$static$0 = o.lambda$static$0((Date) obj);
                return lambda$static$0;
            }
        });
        putParser(FORMAT_SECONDS, new Function() { // from class: cn.hutool.core.date.format.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Date lambda$static$1;
                lambda$static$1 = o.lambda$static$1((CharSequence) obj);
                return lambda$static$1;
            }
        });
        putFormatter(FORMAT_MILLISECONDS, new Function() { // from class: cn.hutool.core.date.format.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$static$2;
                lambda$static$2 = o.lambda$static$2((Date) obj);
                return lambda$static$2;
            }
        });
        putParser(FORMAT_MILLISECONDS, new Function() { // from class: cn.hutool.core.date.format.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Date lambda$static$3;
                lambda$static$3 = o.lambda$static$3((CharSequence) obj);
                return lambda$static$3;
            }
        });
    }

    public static String format(Date date, CharSequence charSequence) {
        Function a8;
        Object apply;
        Map<CharSequence, Function<Date, String>> map = formatterMap;
        if (map == null || (a8 = v0.a(map.get(charSequence))) == null) {
            return null;
        }
        apply = a8.apply(date);
        return (String) apply;
    }

    public static boolean isCustomFormat(String str) {
        return formatterMap.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(Date date) {
        return String.valueOf(i.a(date.getTime(), 1000L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Date lambda$static$1(CharSequence charSequence) {
        return z.date(j.a(Long.parseLong(charSequence.toString()), 1000L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$2(Date date) {
        return String.valueOf(date.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Date lambda$static$3(CharSequence charSequence) {
        return z.date(Long.parseLong(charSequence.toString()));
    }

    public static Date parse(CharSequence charSequence, String str) {
        Function a8;
        Object apply;
        Map<CharSequence, Function<CharSequence, Date>> map = parserMap;
        if (map == null || (a8 = v0.a(map.get(str))) == null) {
            return null;
        }
        apply = a8.apply(charSequence);
        return (Date) apply;
    }

    public static void putFormatter(String str, Function<Date, String> function) {
        q.notNull(str, "Format must be not null !", new Object[0]);
        q.notNull(function, "Function must be not null !", new Object[0]);
        formatterMap.put(str, function);
    }

    public static void putParser(String str, Function<CharSequence, Date> function) {
        q.notNull(str, "Format must be not null !", new Object[0]);
        q.notNull(function, "Function must be not null !", new Object[0]);
        parserMap.put(str, function);
    }

    public static String format(TemporalAccessor temporalAccessor, CharSequence charSequence) {
        return format(z.date(temporalAccessor), charSequence);
    }
}
