package cn.hutool.core.date;

import java.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class f3 {
    public static TimeZone toTimeZone(ZoneId zoneId) {
        TimeZone timeZone;
        if (zoneId == null) {
            return TimeZone.getDefault();
        }
        timeZone = TimeZone.getTimeZone(zoneId);
        return timeZone;
    }

    public static ZoneId toZoneId(TimeZone timeZone) {
        ZoneId zoneId;
        ZoneId systemDefault;
        if (timeZone == null) {
            systemDefault = ZoneId.systemDefault();
            return systemDefault;
        }
        zoneId = timeZone.toZoneId();
        return zoneId;
    }
}
