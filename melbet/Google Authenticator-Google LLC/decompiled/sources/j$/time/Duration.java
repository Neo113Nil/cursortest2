package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.d(temporal2, ChronoUnit.NANOS));
        } catch (c | ArithmeticException unused) {
            long d = temporal.d(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long o = temporal2.o(aVar) - temporal.o(aVar);
                if (d > 0 && o < 0) {
                    d++;
                } else if (d < 0 && o > 0) {
                    d--;
                }
                j = o;
            } catch (c unused2) {
            }
            return ofSeconds(d, j);
        }
    }

    public static Duration h(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.j(j$.nio.file.attribute.a.E(j, 86400L), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            i.a("Unit must not have an estimated duration");
            return null;
        }
        if (j == 0) {
            return duration;
        }
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int i = e.a[chronoUnit.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? duration.j(j$.nio.file.attribute.a.E(chronoUnit.b.a, j), 0L) : duration.j(j, 0L) : duration.j(j / 1000, (j % 1000) * 1000000) : duration.j((j / 1000000000) * 1000, 0L).plusNanos((j % 1000000000) * 1000) : duration.plusNanos(j);
        }
        Duration duration2 = temporalUnit.getDuration();
        duration2.getClass();
        if (j == 0) {
            duration2 = duration;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration2.a).add(BigDecimal.valueOf(duration2.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(c);
            if (divideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
            }
            duration2 = ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        return duration.j(duration2.getSeconds(), 0L).plusNanos(duration2.getNano());
    }

    public static Duration ofDays(long j) {
        return h(j$.nio.file.attribute.a.E(j, 86400L), 0);
    }

    public static Duration ofHours(long j) {
        return h(j$.nio.file.attribute.a.E(j, 3600L), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return h(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return h(j$.nio.file.attribute.a.E(j, 60L), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return h(j2, i);
    }

    public static Duration ofSeconds(long j, long j2) {
        return h(j$.nio.file.attribute.a.D(j, j$.nio.file.attribute.a.B(j2, 1000000000L)), (int) j$.nio.file.attribute.a.C(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.a, duration.a);
        return compare != 0 ? compare : this.b - duration.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? instant.b(i, ChronoUnit.NANOS) : instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        long j = this.a;
        Temporal temporal = instant;
        if (j != 0) {
            temporal = instant.n(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return temporal;
        }
        return ((Instant) temporal).n(i, ChronoUnit.NANOS);
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public final Duration j(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.D(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? j(Long.MAX_VALUE, -nano).j(1L, 0L) : j(-seconds, -nano);
    }

    public Duration plus(Duration duration) {
        return j(duration.getSeconds(), duration.getNano());
    }

    public Duration plusNanos(long j) {
        return j(0L, j);
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j2, 1000L), j / 1000000);
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j2, 1000000000L), j);
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0) {
            sb.append(i3);
        } else if (i3 == 0) {
            sb.append("-0");
        } else {
            sb.append(i3);
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j) {
        return h(j, 0);
    }
}
