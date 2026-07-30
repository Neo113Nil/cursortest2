package j$.time.format;

import com.google.firebase.encoders.json.BuildConfig;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public class b0 {
    public static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final z b = new z();
    public static final b0 c = new b0();

    public static Object a(j$.time.temporal.q qVar, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(qVar, locale);
        Object obj2 = ((ConcurrentHashMap) a).get(simpleImmutableEntry);
        if (obj2 != null) {
            return obj2;
        }
        HashMap hashMap = new HashMap();
        if (qVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    Long valueOf = Long.valueOf(j);
                    String str = eras[i];
                    hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(g0.FULL, hashMap2);
                hashMap.put(g0.SHORT, hashMap2);
                hashMap.put(g0.NARROW, hashMap3);
            }
            obj = new a0(hashMap);
        } else if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String b2 = j$.time.b.b(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), b2);
                linkedHashMap2.put(Long.valueOf(j2), b2.substring(0, Character.charCount(b2.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), j$.time.b.b(j2, "LLL", locale));
            }
            if (length > 0) {
                hashMap.put(g0.FULL_STANDALONE, linkedHashMap);
                hashMap.put(g0.NARROW_STANDALONE, linkedHashMap2);
                hashMap.put(g0.SHORT_STANDALONE, linkedHashMap3);
                hashMap.put(g0.FULL, linkedHashMap);
                hashMap.put(g0.NARROW, linkedHashMap2);
                hashMap.put(g0.SHORT, linkedHashMap3);
            }
            obj = new a0(hashMap);
        } else if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String a2 = j$.time.b.a(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), a2);
                linkedHashMap5.put(Long.valueOf(j3), z ? new StringBuilder().appendCodePoint(a2.codePointBefore(a2.length())).toString() : a2.substring(0, Character.charCount(a2.codePointAt(0))));
                linkedHashMap6.put(Long.valueOf(j3), j$.time.b.a(j3, "ccc", locale));
            }
            if (length2 > 0) {
                hashMap.put(g0.FULL_STANDALONE, linkedHashMap4);
                hashMap.put(g0.NARROW_STANDALONE, linkedHashMap5);
                hashMap.put(g0.SHORT_STANDALONE, linkedHashMap6);
                hashMap.put(g0.FULL, linkedHashMap4);
                hashMap.put(g0.NARROW, linkedHashMap5);
                hashMap.put(g0.SHORT, linkedHashMap6);
            }
            obj = new a0(hashMap);
        } else if (qVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j4 = i2;
                    hashMap4.put(Long.valueOf(j4), amPmStrings[i2]);
                    Long valueOf2 = Long.valueOf(j4);
                    String str2 = amPmStrings[i2];
                    hashMap5.put(valueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(g0.FULL, hashMap4);
                hashMap.put(g0.SHORT, hashMap4);
                hashMap.put(g0.NARROW, hashMap5);
            }
            obj = new a0(hashMap);
        } else {
            obj = BuildConfig.FLAVOR;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(j$.time.chrono.m mVar, j$.time.temporal.q qVar, long j, g0 g0Var, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(qVar instanceof j$.time.temporal.a)) {
            return c(qVar, j, g0Var, locale);
        }
        return null;
    }

    public String c(j$.time.temporal.q qVar, long j, g0 g0Var, Locale locale) {
        Object a2 = a(qVar, locale);
        if (a2 instanceof a0) {
            return ((a0) a2).a(j, g0Var);
        }
        return null;
    }

    public Iterator d(j$.time.chrono.m mVar, j$.time.temporal.q qVar, g0 g0Var, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(qVar instanceof j$.time.temporal.a)) {
            return e(qVar, g0Var, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.q qVar, g0 g0Var, Locale locale) {
        List list;
        Object a2 = a(qVar, locale);
        if (!(a2 instanceof a0) || (list = (List) ((HashMap) ((a0) a2).b).get(g0Var)) == null) {
            return null;
        }
        return list.iterator();
    }
}
