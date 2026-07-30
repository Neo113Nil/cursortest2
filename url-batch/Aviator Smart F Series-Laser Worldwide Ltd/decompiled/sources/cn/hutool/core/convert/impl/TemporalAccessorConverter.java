package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.date.DateTime;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.IsoEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class TemporalAccessorConverter extends AbstractConverter<TemporalAccessor> {
    private static final long serialVersionUID = 1;
    private String format;
    private final Class<?> targetType;

    public TemporalAccessorConverter(Class<?> cls) {
        this(cls, null);
    }

    private TemporalAccessor parseFromCharSequence(CharSequence charSequence) {
        Instant instant;
        ZoneId zoneId;
        Instant instant2;
        DateTimeFormatter ofPattern;
        Object parse;
        MonthDay parse2;
        IsoEra valueOf;
        Month valueOf2;
        DayOfWeek valueOf3;
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return null;
        }
        if (cn.hutool.core.convert.u.a().equals(this.targetType)) {
            valueOf3 = DayOfWeek.valueOf(cn.hutool.core.util.c1.toString(charSequence));
            return valueOf3;
        }
        if (cn.hutool.core.convert.v.a().equals(this.targetType)) {
            valueOf2 = Month.valueOf(cn.hutool.core.util.c1.toString(charSequence));
            return valueOf2;
        }
        if (o1.a().equals(this.targetType)) {
            valueOf = IsoEra.valueOf(cn.hutool.core.util.c1.toString(charSequence));
            return valueOf;
        }
        if (cn.hutool.core.convert.w.a().equals(this.targetType)) {
            parse2 = MonthDay.parse(charSequence);
            return parse2;
        }
        String str = this.format;
        if (str != null) {
            ofPattern = DateTimeFormatter.ofPattern(str);
            parse = ofPattern.parse(charSequence, (TemporalQuery<Object>) new TemporalQuery() { // from class: cn.hutool.core.convert.impl.y1
                @Override // java.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    Instant from;
                    from = Instant.from(temporalAccessor);
                    return from;
                }
            });
            instant2 = a1.a(parse);
            zoneId = ofPattern.getZone();
        } else {
            DateTime parse3 = cn.hutool.core.date.z.parse(charSequence);
            Objects.requireNonNull(parse3);
            instant = parse3.toInstant();
            zoneId = parse3.getZoneId();
            instant2 = instant;
        }
        return parseFromInstant(instant2, zoneId);
    }

    private TemporalAccessor parseFromInstant(Instant instant, ZoneId zoneId) {
        OffsetTime ofInstant;
        OffsetDateTime ofInstant2;
        ZonedDateTime atZone;
        ZonedDateTime atZone2;
        LocalTime localTime;
        ZonedDateTime atZone3;
        LocalDate localDate;
        LocalDateTime ofInstant3;
        if (cn.hutool.core.convert.c.a().equals(this.targetType)) {
            return instant;
        }
        ZoneId a8 = p0.a(cn.hutool.core.util.e0.defaultIfNull(zoneId, (Supplier<? extends ZoneId>) new Supplier() { // from class: cn.hutool.core.convert.impl.x1
            @Override // java.util.function.Supplier
            public final Object get() {
                ZoneId systemDefault;
                systemDefault = ZoneId.systemDefault();
                return systemDefault;
            }
        }));
        if (cn.hutool.core.convert.a.a().equals(this.targetType)) {
            ofInstant3 = LocalDateTime.ofInstant(instant, a8);
            return ofInstant3;
        }
        if (cn.hutool.core.convert.p.a().equals(this.targetType)) {
            atZone3 = instant.atZone(a8);
            localDate = atZone3.toLocalDate();
            return localDate;
        }
        if (cn.hutool.core.convert.q.a().equals(this.targetType)) {
            atZone2 = instant.atZone(a8);
            localTime = atZone2.toLocalTime();
            return localTime;
        }
        if (cn.hutool.core.convert.r.a().equals(this.targetType)) {
            atZone = instant.atZone(a8);
            return atZone;
        }
        if (cn.hutool.core.convert.s.a().equals(this.targetType)) {
            ofInstant2 = OffsetDateTime.ofInstant(instant, a8);
            return ofInstant2;
        }
        if (!cn.hutool.core.convert.t.a().equals(this.targetType)) {
            return null;
        }
        ofInstant = OffsetTime.ofInstant(instant, a8);
        return ofInstant;
    }

    private TemporalAccessor parseFromLocalDateTime(LocalDateTime localDateTime) {
        ZoneId systemDefault;
        ZonedDateTime atZone;
        OffsetDateTime offsetDateTime;
        OffsetTime offsetTime;
        ZoneId systemDefault2;
        ZonedDateTime atZone2;
        OffsetDateTime offsetDateTime2;
        ZoneId systemDefault3;
        ZonedDateTime atZone3;
        LocalTime localTime;
        LocalDate localDate;
        if (cn.hutool.core.convert.c.a().equals(this.targetType)) {
            return cn.hutool.core.date.z.toInstant(localDateTime);
        }
        if (cn.hutool.core.convert.p.a().equals(this.targetType)) {
            localDate = localDateTime.toLocalDate();
            return localDate;
        }
        if (cn.hutool.core.convert.q.a().equals(this.targetType)) {
            localTime = localDateTime.toLocalTime();
            return localTime;
        }
        if (cn.hutool.core.convert.r.a().equals(this.targetType)) {
            systemDefault3 = ZoneId.systemDefault();
            atZone3 = localDateTime.atZone(systemDefault3);
            return atZone3;
        }
        if (cn.hutool.core.convert.s.a().equals(this.targetType)) {
            systemDefault2 = ZoneId.systemDefault();
            atZone2 = localDateTime.atZone(systemDefault2);
            offsetDateTime2 = atZone2.toOffsetDateTime();
            return offsetDateTime2;
        }
        if (!cn.hutool.core.convert.t.a().equals(this.targetType)) {
            return null;
        }
        systemDefault = ZoneId.systemDefault();
        atZone = localDateTime.atZone(systemDefault);
        offsetDateTime = atZone.toOffsetDateTime();
        offsetTime = offsetDateTime.toOffsetTime();
        return offsetTime;
    }

    private TemporalAccessor parseFromLong(Long l8) {
        IsoEra of;
        Month of2;
        DayOfWeek of3;
        if (cn.hutool.core.convert.u.a().equals(this.targetType)) {
            of3 = DayOfWeek.of(w1.a(l8.longValue()));
            return of3;
        }
        if (cn.hutool.core.convert.v.a().equals(this.targetType)) {
            of2 = Month.of(w1.a(l8.longValue()));
            return of2;
        }
        if (!o1.a().equals(this.targetType)) {
            return parseFromInstant(cn.hutool.core.date.format.o.FORMAT_SECONDS.equals(this.format) ? Instant.ofEpochSecond(l8.longValue()) : Instant.ofEpochMilli(l8.longValue()), null);
        }
        of = IsoEra.of(w1.a(l8.longValue()));
        return of;
    }

    private TemporalAccessor parseFromTemporalAccessor(TemporalAccessor temporalAccessor) {
        MonthDay from;
        Month from2;
        DayOfWeek from3;
        if (cn.hutool.core.convert.u.a().equals(this.targetType)) {
            from3 = DayOfWeek.from(temporalAccessor);
            return from3;
        }
        if (cn.hutool.core.convert.v.a().equals(this.targetType)) {
            from2 = Month.from(temporalAccessor);
            return from2;
        }
        if (cn.hutool.core.convert.w.a().equals(this.targetType)) {
            from = MonthDay.from(temporalAccessor);
            return from;
        }
        TemporalAccessor parseFromLocalDateTime = v1.a(temporalAccessor) ? parseFromLocalDateTime(cn.hutool.core.convert.b.a(temporalAccessor)) : i0.a(temporalAccessor) ? parseFromZonedDateTime(j0.a(temporalAccessor)) : null;
        return parseFromLocalDateTime == null ? parseFromInstant(cn.hutool.core.date.z.toInstant(temporalAccessor), null) : parseFromLocalDateTime;
    }

    private TemporalAccessor parseFromZonedDateTime(ZonedDateTime zonedDateTime) {
        OffsetDateTime offsetDateTime;
        OffsetTime offsetTime;
        OffsetDateTime offsetDateTime2;
        LocalTime localTime;
        LocalDate localDate;
        LocalDateTime localDateTime;
        if (cn.hutool.core.convert.c.a().equals(this.targetType)) {
            return cn.hutool.core.date.z.toInstant(zonedDateTime);
        }
        if (cn.hutool.core.convert.a.a().equals(this.targetType)) {
            localDateTime = zonedDateTime.toLocalDateTime();
            return localDateTime;
        }
        if (cn.hutool.core.convert.p.a().equals(this.targetType)) {
            localDate = zonedDateTime.toLocalDate();
            return localDate;
        }
        if (cn.hutool.core.convert.q.a().equals(this.targetType)) {
            localTime = zonedDateTime.toLocalTime();
            return localTime;
        }
        if (cn.hutool.core.convert.s.a().equals(this.targetType)) {
            offsetDateTime2 = zonedDateTime.toOffsetDateTime();
            return offsetDateTime2;
        }
        if (!cn.hutool.core.convert.t.a().equals(this.targetType)) {
            return null;
        }
        offsetDateTime = zonedDateTime.toOffsetDateTime();
        offsetTime = offsetDateTime.toOffsetTime();
        return offsetTime;
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public String getFormat() {
        return this.format;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<TemporalAccessor> getTargetType() {
        return this.targetType;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public TemporalAccessorConverter(Class<?> cls, String str) {
        this.targetType = cls;
        this.format = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public TemporalAccessor convertInternal(Object obj) {
        LocalTime of;
        LocalDateTime of2;
        LocalDate of3;
        Instant instant;
        ZoneId zoneId;
        Instant instant2;
        if (obj instanceof Number) {
            return parseFromLong(Long.valueOf(((Number) obj).longValue()));
        }
        if (b.a(obj)) {
            return parseFromTemporalAccessor(c.a(obj));
        }
        if (obj instanceof Date) {
            DateTime date = cn.hutool.core.date.z.date((Date) obj);
            instant2 = date.toInstant();
            return parseFromInstant(instant2, date.getZoneId());
        }
        if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            instant = calendar.toInstant();
            zoneId = calendar.getTimeZone().toZoneId();
            return parseFromInstant(instant, zoneId);
        }
        if (!(obj instanceof Map)) {
            return parseFromCharSequence(convertToStr(obj));
        }
        Map map = (Map) obj;
        if (cn.hutool.core.convert.p.a().equals(this.targetType)) {
            of3 = LocalDate.of(cn.hutool.core.convert.d.toInt(map.get("year")).intValue(), cn.hutool.core.convert.d.toInt(map.get("month")).intValue(), cn.hutool.core.convert.d.toInt(map.get("day")).intValue());
            return of3;
        }
        if (cn.hutool.core.convert.a.a().equals(this.targetType)) {
            of2 = LocalDateTime.of(cn.hutool.core.convert.d.toInt(map.get("year")).intValue(), cn.hutool.core.convert.d.toInt(map.get("month")).intValue(), cn.hutool.core.convert.d.toInt(map.get("day")).intValue(), cn.hutool.core.convert.d.toInt(map.get("hour")).intValue(), cn.hutool.core.convert.d.toInt(map.get("minute")).intValue(), cn.hutool.core.convert.d.toInt(map.get("second")).intValue(), cn.hutool.core.convert.d.toInt(map.get("second")).intValue());
            return of2;
        }
        if (!cn.hutool.core.convert.q.a().equals(this.targetType)) {
            throw new ConvertException("Unsupported type: [{}] from map: [{}]", this.targetType, map);
        }
        of = LocalTime.of(cn.hutool.core.convert.d.toInt(map.get("hour")).intValue(), cn.hutool.core.convert.d.toInt(map.get("minute")).intValue(), cn.hutool.core.convert.d.toInt(map.get("second")).intValue(), cn.hutool.core.convert.d.toInt(map.get("nano")).intValue());
        return of;
    }
}
