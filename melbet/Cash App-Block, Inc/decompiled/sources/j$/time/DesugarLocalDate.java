package j$.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-22006d330b5bac27a0b9d443f2c43dfc4a96f5c4b2f368f1c0fff99760a58590 */
/* loaded from: classes2.dex */
public final class DesugarLocalDate {
    static {
        LocalDate.of(1970, 1, 1);
    }

    public static Stream<LocalDate> datesUntil(LocalDate localDate, LocalDate localDate2) {
        long epochDay = localDate2.toEpochDay();
        long epochDay2 = localDate.toEpochDay();
        if (epochDay >= epochDay2) {
            return LongStream.range(epochDay2, epochDay).mapToObj(new a());
        }
        throw new IllegalArgumentException(localDate2 + " < " + localDate);
    }

    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return LocalDate.ofEpochDay(Math.floorDiv(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), 86400L));
    }
}
