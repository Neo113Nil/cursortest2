package org.apache.a.f.d;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: DateUtils.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    private static final Date f9877c;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9876b = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f9875a = TimeZone.getTimeZone("GMT");

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(f9875a);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f9877c = calendar.getTime();
    }

    public static Date a(String str) throws p {
        return a(str, null, null);
    }

    public static Date a(String str, String[] strArr) throws p {
        return a(str, strArr, null);
    }

    public static Date a(String str, String[] strArr, Date date) throws p {
        if (str == null) {
            throw new IllegalArgumentException("dateValue is null");
        }
        if (strArr == null) {
            strArr = f9876b;
        }
        if (date == null) {
            date = f9877c;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat a2 = a.a(str2);
            a2.set2DigitYearStart(date);
            try {
                return a2.parse(str);
            } catch (ParseException unused) {
            }
        }
        throw new p("Unable to parse the date " + str);
    }

    public static String a(Date date) {
        return a(date, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    public static String a(Date date, String str) {
        if (date == null) {
            throw new IllegalArgumentException("date is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("pattern is null");
        }
        return a.a(str).format(date);
    }

    /* compiled from: DateUtils.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f9878a = new ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>>() { // from class: org.apache.a.f.d.q.a.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        };

        public static SimpleDateFormat a(String str) {
            Map<String, SimpleDateFormat> map = f9878a.get().get();
            if (map == null) {
                map = new HashMap<>();
                f9878a.set(new SoftReference<>(map));
            }
            SimpleDateFormat simpleDateFormat = map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }
}
