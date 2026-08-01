package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class za0 {
    public static final AtomicReference a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c = c(calendar);
        Calendar c2 = c(null);
        c2.set(c.get(1), c.get(2), c.get(5));
        return c2;
    }

    public static Calendar b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
