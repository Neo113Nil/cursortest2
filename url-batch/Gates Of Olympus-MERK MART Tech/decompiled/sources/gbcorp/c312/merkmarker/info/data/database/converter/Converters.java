package gbcorp.c312.merkmarker.info.data.database.converter;

import java.time.LocalDateTime;
import kotlin.Metadata;

/* compiled from: Converters.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/database/converter/Converters;", "", "<init>", "()V", "stringToLocalDateTime", "Ljava/time/LocalDateTime;", "value", "", "localDateTimeToString", "localDateTime", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Converters {
    public static final int $stable = 0;

    public final LocalDateTime stringToLocalDateTime(String value) {
        if (value != null) {
            return LocalDateTime.parse(value);
        }
        return null;
    }

    public final String localDateTimeToString(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.toString();
        }
        return null;
    }
}
