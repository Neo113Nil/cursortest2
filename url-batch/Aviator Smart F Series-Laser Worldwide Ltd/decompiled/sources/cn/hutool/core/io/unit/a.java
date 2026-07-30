package cn.hutool.core.io.unit;

import cn.hutool.core.date.format.j;
import cn.hutool.core.lang.q;
import cn.hutool.core.text.l;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements Comparable {
    private static final long BYTES_PER_GB = 1073741824;
    private static final long BYTES_PER_KB = 1024;
    private static final long BYTES_PER_MB = 1048576;
    private static final long BYTES_PER_TB = 1099511627776L;
    private static final Pattern PATTERN = Pattern.compile("^([+-]?\\d+(\\.\\d+)?)([a-zA-Z]{0,2})$");
    private final long bytes;

    private a(long j8) {
        this.bytes = j8;
    }

    private static DataUnit determineDataUnit(String str, DataUnit dataUnit) {
        if (dataUnit == null) {
            dataUnit = DataUnit.BYTES;
        }
        return l.isNotEmpty(str) ? DataUnit.fromSuffix(str) : dataUnit;
    }

    public static a of(long j8, DataUnit dataUnit) {
        if (dataUnit == null) {
            dataUnit = DataUnit.BYTES;
        }
        return new a(j.a(j8, dataUnit.size().toBytes()));
    }

    public static a ofBytes(long j8) {
        return new a(j8);
    }

    public static a ofGigabytes(long j8) {
        return new a(j.a(j8, BYTES_PER_GB));
    }

    public static a ofKilobytes(long j8) {
        return new a(j.a(j8, 1024L));
    }

    public static a ofMegabytes(long j8) {
        return new a(j.a(j8, 1048576L));
    }

    public static a ofTerabytes(long j8) {
        return new a(j.a(j8, BYTES_PER_TB));
    }

    public static a parse(CharSequence charSequence) {
        return parse(charSequence, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.bytes == ((a) obj).bytes;
    }

    public int hashCode() {
        return androidx.collection.a.a(this.bytes);
    }

    public boolean isNegative() {
        return this.bytes < 0;
    }

    public long toBytes() {
        return this.bytes;
    }

    public long toGigabytes() {
        return this.bytes / BYTES_PER_GB;
    }

    public long toKilobytes() {
        return this.bytes / 1024;
    }

    public long toMegabytes() {
        return this.bytes / 1048576;
    }

    public String toString() {
        return String.format("%dB", Long.valueOf(this.bytes));
    }

    public long toTerabytes() {
        return this.bytes / BYTES_PER_TB;
    }

    public static a parse(CharSequence charSequence, DataUnit dataUnit) {
        q.notNull(charSequence, "Text must not be null", new Object[0]);
        try {
            Matcher matcher = PATTERN.matcher(charSequence);
            q.state(matcher.matches(), "Does not match data size pattern", new Object[0]);
            return of(new BigDecimal(matcher.group(1)), determineDataUnit(matcher.group(3), dataUnit));
        } catch (Exception e8) {
            throw new IllegalArgumentException("'" + ((Object) charSequence) + "' is not a valid data size", e8);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(a aVar) {
        return Long.compare(this.bytes, aVar.bytes);
    }

    public static a of(BigDecimal bigDecimal, DataUnit dataUnit) {
        if (dataUnit == null) {
            dataUnit = DataUnit.BYTES;
        }
        return new a(bigDecimal.multiply(new BigDecimal(dataUnit.size().toBytes())).longValue());
    }
}
