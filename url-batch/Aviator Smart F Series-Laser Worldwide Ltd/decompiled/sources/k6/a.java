package k6;

import androidx.exifinterface.media.ExifInterface;
import f6.q;
import f6.r;
import j6.p;
import j6.v;
import kotlin.comparisons.h;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class a implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final C0358a Companion = new C0358a(null);
    private static final long ZERO = m219constructorimpl(0);

    /* renamed from: k6.a$a, reason: collision with other inner class name */
    public static final class C0358a {
        private C0358a() {
        }

        public /* synthetic */ C0358a(o oVar) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m276getDaysUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m278getDaysUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m282getHoursUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m284getHoursUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m288getMicrosecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m290getMicrosecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m294getMillisecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m296getMillisecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m300getMinutesUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m302getMinutesUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m306getNanosecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m308getNanosecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m312getSecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m314getSecondsUwyO8pc$annotations(double d8) {
        }

        public final double convert(double d8, DurationUnit sourceUnit, DurationUnit targetUnit) {
            s.checkNotNullParameter(sourceUnit, "sourceUnit");
            s.checkNotNullParameter(targetUnit, "targetUnit");
            return d.convertDurationUnit(d8, sourceUnit, targetUnit);
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m318daysUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m320getINFINITEUwyO8pc() {
            return a.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m321getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return a.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m322getZEROUwyO8pc() {
            return a.ZERO;
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m324hoursUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m327microsecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m330millisecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m333minutesUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m336nanosecondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m338parseUwyO8pc(String value) {
            long parseDuration;
            s.checkNotNullParameter(value, "value");
            try {
                parseDuration = c.parseDuration(value, false);
                return parseDuration;
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e8);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m339parseIsoStringUwyO8pc(String value) {
            long parseDuration;
            s.checkNotNullParameter(value, "value");
            try {
                parseDuration = c.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final a m340parseIsoStringOrNullFghU774(String value) {
            long parseDuration;
            s.checkNotNullParameter(value, "value");
            try {
                parseDuration = c.parseDuration(value, true);
                return a.m217boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final a m341parseOrNullFghU774(String value) {
            long parseDuration;
            s.checkNotNullParameter(value, "value");
            try {
                parseDuration = c.parseDuration(value, false);
                return a.m217boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m343secondsUwyO8pc(int i8) {
            return c.toDuration(i8, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m277getDaysUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m279getDaysUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m283getHoursUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m285getHoursUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m289getMicrosecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m291getMicrosecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m295getMillisecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m297getMillisecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m301getMinutesUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m303getMinutesUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m307getNanosecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m309getNanosecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m313getSecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m315getSecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m319daysUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.DAYS);
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m325hoursUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m328microsecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m331millisecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m334minutesUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m337nanosecondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m344secondsUwyO8pc(long j8) {
            return c.toDuration(j8, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m275getDaysUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m280getDaysUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m281getHoursUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m286getHoursUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m287getMicrosecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m292getMicrosecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m293getMillisecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m298getMillisecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m299getMinutesUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m304getMinutesUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m305getNanosecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m310getNanosecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m311getSecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m316getSecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m317daysUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.DAYS);
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m323hoursUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m326microsecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m329millisecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m332minutesUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m335nanosecondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.NANOSECONDS);
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m342secondsUwyO8pc(double d8) {
            return c.toDuration(d8, DurationUnit.SECONDS);
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = c.durationOfMillis(c.MAX_MILLIS);
        INFINITE = durationOfMillis;
        durationOfMillis2 = c.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    private /* synthetic */ a(long j8) {
        this.rawValue = j8;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m215addValuesMixedRangesUwyO8pc(long j8, long j9, long j10) {
        long nanosToMillis;
        long coerceIn;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = c.nanosToMillis(j10);
        long j11 = j9 + nanosToMillis;
        if (!new p(-4611686018426L, 4611686018426L).contains(j11)) {
            coerceIn = v.coerceIn(j11, -4611686018427387903L, c.MAX_MILLIS);
            durationOfMillis = c.durationOfMillis(coerceIn);
            return durationOfMillis;
        }
        millisToNanos = c.millisToNanos(nanosToMillis);
        long j12 = j10 - millisToNanos;
        millisToNanos2 = c.millisToNanos(j11);
        durationOfNanos = c.durationOfNanos(millisToNanos2 + j12);
        return durationOfNanos;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m216appendFractionalimpl(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z7) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append('.');
            String padStart = StringsKt__StringsKt.padStart(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z7 || i13 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i11 + 3) / 3) * 3);
                s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) padStart, 0, i13);
                s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a m217boximpl(long j8) {
        return new a(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m219constructorimpl(long j8) {
        if (b.getDurationAssertionsEnabled()) {
            if (m250isInNanosimpl(j8)) {
                if (!new p(-4611686018426999999L, c.MAX_NANOS).contains(m246getValueimpl(j8))) {
                    throw new AssertionError(m246getValueimpl(j8) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new p(-4611686018427387903L, c.MAX_MILLIS).contains(m246getValueimpl(j8))) {
                    throw new AssertionError(m246getValueimpl(j8) + " ms is out of milliseconds range");
                }
                if (new p(-4611686018426L, 4611686018426L).contains(m246getValueimpl(j8))) {
                    throw new AssertionError(m246getValueimpl(j8) + " ms is denormalized");
                }
            }
        }
        return j8;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m220divLRDsOJo(long j8, long j9) {
        Comparable maxOf;
        maxOf = h.maxOf(m244getStorageUnitimpl(j8), m244getStorageUnitimpl(j9));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m262toDoubleimpl(j8, durationUnit) / m262toDoubleimpl(j9, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m222divUwyO8pc(long j8, int i8) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        int sign;
        long durationOfNanos2;
        if (i8 == 0) {
            if (m253isPositiveimpl(j8)) {
                return INFINITE;
            }
            if (m252isNegativeimpl(j8)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m250isInNanosimpl(j8)) {
            durationOfNanos2 = c.durationOfNanos(m246getValueimpl(j8) / i8);
            return durationOfNanos2;
        }
        if (m251isInfiniteimpl(j8)) {
            sign = h6.d.getSign(i8);
            return m257timesUwyO8pc(j8, sign);
        }
        long j9 = i8;
        long m246getValueimpl = m246getValueimpl(j8) / j9;
        if (!new p(-4611686018426L, 4611686018426L).contains(m246getValueimpl)) {
            durationOfMillis = c.durationOfMillis(m246getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = c.millisToNanos(m246getValueimpl(j8) - (m246getValueimpl * j9));
        millisToNanos2 = c.millisToNanos(m246getValueimpl);
        durationOfNanos = c.durationOfNanos(millisToNanos2 + (millisToNanos / j9));
        return durationOfNanos;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m223equalsimpl(long j8, Object obj) {
        return (obj instanceof a) && j8 == ((a) obj).m274unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m224equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m225getAbsoluteValueUwyO8pc(long j8) {
        return m252isNegativeimpl(j8) ? m272unaryMinusUwyO8pc(j8) : j8;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m226getHoursComponentimpl(long j8) {
        if (m251isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m235getInWholeHoursimpl(j8) % 24);
    }

    public static /* synthetic */ void getInDays$annotations() {
    }

    public static /* synthetic */ void getInHours$annotations() {
    }

    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    public static /* synthetic */ void getInMinutes$annotations() {
    }

    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m234getInWholeDaysimpl(long j8) {
        return m265toLongimpl(j8, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m235getInWholeHoursimpl(long j8) {
        return m265toLongimpl(j8, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m236getInWholeMicrosecondsimpl(long j8) {
        return m265toLongimpl(j8, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m237getInWholeMillisecondsimpl(long j8) {
        return (m249isInMillisimpl(j8) && m248isFiniteimpl(j8)) ? m246getValueimpl(j8) : m265toLongimpl(j8, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m238getInWholeMinutesimpl(long j8) {
        return m265toLongimpl(j8, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m239getInWholeNanosecondsimpl(long j8) {
        long millisToNanos;
        long m246getValueimpl = m246getValueimpl(j8);
        if (m250isInNanosimpl(j8)) {
            return m246getValueimpl;
        }
        if (m246getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m246getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = c.millisToNanos(m246getValueimpl);
        return millisToNanos;
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m240getInWholeSecondsimpl(long j8) {
        return m265toLongimpl(j8, DurationUnit.SECONDS);
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m241getMinutesComponentimpl(long j8) {
        if (m251isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m238getInWholeMinutesimpl(j8) % 60);
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m242getNanosecondsComponentimpl(long j8) {
        if (m251isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m249isInMillisimpl(j8) ? c.millisToNanos(m246getValueimpl(j8) % 1000) : m246getValueimpl(j8) % 1000000000);
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m243getSecondsComponentimpl(long j8) {
        if (m251isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m240getInWholeSecondsimpl(j8) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m244getStorageUnitimpl(long j8) {
        return m250isInNanosimpl(j8) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m245getUnitDiscriminatorimpl(long j8) {
        return ((int) j8) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m246getValueimpl(long j8) {
        return j8 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m247hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m248isFiniteimpl(long j8) {
        return !m251isInfiniteimpl(j8);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m249isInMillisimpl(long j8) {
        return (((int) j8) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m250isInNanosimpl(long j8) {
        return (((int) j8) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m251isInfiniteimpl(long j8) {
        return j8 == INFINITE || j8 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m252isNegativeimpl(long j8) {
        return j8 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m253isPositiveimpl(long j8) {
        return j8 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m254minusLRDsOJo(long j8, long j9) {
        return m255plusLRDsOJo(j8, m272unaryMinusUwyO8pc(j9));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m255plusLRDsOJo(long j8, long j9) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m251isInfiniteimpl(j8)) {
            if (m248isFiniteimpl(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m251isInfiniteimpl(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) != (((int) j9) & 1)) {
            return m249isInMillisimpl(j8) ? m215addValuesMixedRangesUwyO8pc(j8, m246getValueimpl(j8), m246getValueimpl(j9)) : m215addValuesMixedRangesUwyO8pc(j8, m246getValueimpl(j9), m246getValueimpl(j8));
        }
        long m246getValueimpl = m246getValueimpl(j8) + m246getValueimpl(j9);
        if (m250isInNanosimpl(j8)) {
            durationOfNanosNormalized = c.durationOfNanosNormalized(m246getValueimpl);
            return durationOfNanosNormalized;
        }
        durationOfMillisNormalized = c.durationOfMillisNormalized(m246getValueimpl);
        return durationOfMillisNormalized;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m257timesUwyO8pc(long j8, int i8) {
        int sign;
        int sign2;
        long coerceIn;
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        int sign3;
        int sign4;
        long coerceIn2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m251isInfiniteimpl(j8)) {
            if (i8 != 0) {
                return i8 > 0 ? j8 : m272unaryMinusUwyO8pc(j8);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i8 == 0) {
            return ZERO;
        }
        long m246getValueimpl = m246getValueimpl(j8);
        long j9 = i8;
        long j10 = m246getValueimpl * j9;
        if (!m250isInNanosimpl(j8)) {
            if (j10 / j9 == m246getValueimpl) {
                coerceIn = v.coerceIn(j10, new p(-4611686018427387903L, c.MAX_MILLIS));
                durationOfMillis = c.durationOfMillis(coerceIn);
                return durationOfMillis;
            }
            sign = h6.d.getSign(m246getValueimpl);
            sign2 = h6.d.getSign(i8);
            return sign * sign2 > 0 ? INFINITE : NEG_INFINITE;
        }
        if (new p(-2147483647L, 2147483647L).contains(m246getValueimpl)) {
            durationOfNanos = c.durationOfNanos(j10);
            return durationOfNanos;
        }
        if (j10 / j9 == m246getValueimpl) {
            durationOfNanosNormalized = c.durationOfNanosNormalized(j10);
            return durationOfNanosNormalized;
        }
        nanosToMillis = c.nanosToMillis(m246getValueimpl);
        millisToNanos = c.millisToNanos(nanosToMillis);
        long j11 = nanosToMillis * j9;
        nanosToMillis2 = c.nanosToMillis((m246getValueimpl - millisToNanos) * j9);
        long j12 = nanosToMillis2 + j11;
        if (j11 / j9 != nanosToMillis || (j12 ^ j11) < 0) {
            sign3 = h6.d.getSign(m246getValueimpl);
            sign4 = h6.d.getSign(i8);
            return sign3 * sign4 > 0 ? INFINITE : NEG_INFINITE;
        }
        coerceIn2 = v.coerceIn(j12, new p(-4611686018427387903L, c.MAX_MILLIS));
        durationOfMillis2 = c.durationOfMillis(coerceIn2);
        return durationOfMillis2;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m261toComponentsimpl(long j8, f6.s action) {
        s.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m234getInWholeDaysimpl(j8)), Integer.valueOf(m226getHoursComponentimpl(j8)), Integer.valueOf(m241getMinutesComponentimpl(j8)), Integer.valueOf(m243getSecondsComponentimpl(j8)), Integer.valueOf(m242getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m262toDoubleimpl(long j8, DurationUnit unit) {
        s.checkNotNullParameter(unit, "unit");
        if (j8 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return d.convertDurationUnit(m246getValueimpl(j8), m244getStorageUnitimpl(j8), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m263toIntimpl(long j8, DurationUnit unit) {
        long coerceIn;
        s.checkNotNullParameter(unit, "unit");
        coerceIn = v.coerceIn(m265toLongimpl(j8, unit), -2147483648L, 2147483647L);
        return (int) coerceIn;
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m264toIsoStringimpl(long j8) {
        StringBuilder sb = new StringBuilder();
        if (m252isNegativeimpl(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long m225getAbsoluteValueUwyO8pc = m225getAbsoluteValueUwyO8pc(j8);
        long m235getInWholeHoursimpl = m235getInWholeHoursimpl(m225getAbsoluteValueUwyO8pc);
        int m241getMinutesComponentimpl = m241getMinutesComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m243getSecondsComponentimpl = m243getSecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m242getNanosecondsComponentimpl = m242getNanosecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        if (m251isInfiniteimpl(j8)) {
            m235getInWholeHoursimpl = 9999999999999L;
        }
        boolean z7 = false;
        boolean z8 = m235getInWholeHoursimpl != 0;
        boolean z9 = (m243getSecondsComponentimpl == 0 && m242getNanosecondsComponentimpl == 0) ? false : true;
        if (m241getMinutesComponentimpl != 0 || (z9 && z8)) {
            z7 = true;
        }
        if (z8) {
            sb.append(m235getInWholeHoursimpl);
            sb.append('H');
        }
        if (z7) {
            sb.append(m241getMinutesComponentimpl);
            sb.append('M');
        }
        if (z9 || (!z8 && !z7)) {
            m216appendFractionalimpl(j8, sb, m243getSecondsComponentimpl, m242getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m265toLongimpl(long j8, DurationUnit unit) {
        s.checkNotNullParameter(unit, "unit");
        if (j8 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j8 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return d.convertDurationUnit(m246getValueimpl(j8), m244getStorageUnitimpl(j8), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m268toStringimpl(long j8) {
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == INFINITE) {
            return "Infinity";
        }
        if (j8 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m252isNegativeimpl = m252isNegativeimpl(j8);
        StringBuilder sb = new StringBuilder();
        if (m252isNegativeimpl) {
            sb.append('-');
        }
        long m225getAbsoluteValueUwyO8pc = m225getAbsoluteValueUwyO8pc(j8);
        long m234getInWholeDaysimpl = m234getInWholeDaysimpl(m225getAbsoluteValueUwyO8pc);
        int m226getHoursComponentimpl = m226getHoursComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m241getMinutesComponentimpl = m241getMinutesComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m243getSecondsComponentimpl = m243getSecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m242getNanosecondsComponentimpl = m242getNanosecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        int i8 = 0;
        boolean z7 = m234getInWholeDaysimpl != 0;
        boolean z8 = m226getHoursComponentimpl != 0;
        boolean z9 = m241getMinutesComponentimpl != 0;
        boolean z10 = (m243getSecondsComponentimpl == 0 && m242getNanosecondsComponentimpl == 0) ? false : true;
        if (z7) {
            sb.append(m234getInWholeDaysimpl);
            sb.append('d');
            i8 = 1;
        }
        if (z8 || (z7 && (z9 || z10))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(m226getHoursComponentimpl);
            sb.append('h');
            i8 = i9;
        }
        if (z9 || (z10 && (z8 || z7))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(m241getMinutesComponentimpl);
            sb.append('m');
            i8 = i10;
        }
        if (z10) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (m243getSecondsComponentimpl != 0 || z7 || z8 || z9) {
                m216appendFractionalimpl(j8, sb, m243getSecondsComponentimpl, m242getNanosecondsComponentimpl, 9, "s", false);
            } else if (m242getNanosecondsComponentimpl >= 1000000) {
                m216appendFractionalimpl(j8, sb, m242getNanosecondsComponentimpl / 1000000, m242getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m242getNanosecondsComponentimpl >= 1000) {
                m216appendFractionalimpl(j8, sb, m242getNanosecondsComponentimpl / 1000, m242getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m242getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i8 = i11;
        }
        if (m252isNegativeimpl && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m270toStringimpl$default(long j8, DurationUnit durationUnit, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return m269toStringimpl(j8, durationUnit, i8);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m271truncateToUwyO8pc$kotlin_stdlib(long j8, DurationUnit unit) {
        s.checkNotNullParameter(unit, "unit");
        DurationUnit m244getStorageUnitimpl = m244getStorageUnitimpl(j8);
        if (unit.compareTo(m244getStorageUnitimpl) <= 0 || m251isInfiniteimpl(j8)) {
            return j8;
        }
        return c.toDuration(m246getValueimpl(j8) - (m246getValueimpl(j8) % d.convertDurationUnit(1L, unit, m244getStorageUnitimpl)), m244getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m272unaryMinusUwyO8pc(long j8) {
        long durationOf;
        durationOf = c.durationOf(-m246getValueimpl(j8), ((int) j8) & 1);
        return durationOf;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m273compareToLRDsOJo(((a) obj).m274unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m273compareToLRDsOJo(long j8) {
        return m218compareToLRDsOJo(this.rawValue, j8);
    }

    public boolean equals(Object obj) {
        return m223equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m247hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m268toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m274unboximpl() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m218compareToLRDsOJo(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return s.compare(j8, j9);
        }
        int i8 = (((int) j8) & 1) - (((int) j9) & 1);
        return m252isNegativeimpl(j8) ? -i8 : i8;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m260toComponentsimpl(long j8, r action) {
        s.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m235getInWholeHoursimpl(j8)), Integer.valueOf(m241getMinutesComponentimpl(j8)), Integer.valueOf(m243getSecondsComponentimpl(j8)), Integer.valueOf(m242getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m259toComponentsimpl(long j8, q action) {
        s.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m238getInWholeMinutesimpl(j8)), Integer.valueOf(m243getSecondsComponentimpl(j8)), Integer.valueOf(m242getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m258toComponentsimpl(long j8, f6.p action) {
        s.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m240getInWholeSecondsimpl(j8)), Integer.valueOf(m242getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m221divUwyO8pc(long j8, double d8) {
        int roundToInt;
        roundToInt = h6.d.roundToInt(d8);
        if (roundToInt == d8 && roundToInt != 0) {
            return m222divUwyO8pc(j8, roundToInt);
        }
        DurationUnit m244getStorageUnitimpl = m244getStorageUnitimpl(j8);
        return c.toDuration(m262toDoubleimpl(j8, m244getStorageUnitimpl) / d8, m244getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m269toStringimpl(long j8, DurationUnit unit, int i8) {
        int coerceAtMost;
        s.checkNotNullParameter(unit, "unit");
        if (i8 >= 0) {
            double m262toDoubleimpl = m262toDoubleimpl(j8, unit);
            if (Double.isInfinite(m262toDoubleimpl)) {
                return String.valueOf(m262toDoubleimpl);
            }
            StringBuilder sb = new StringBuilder();
            coerceAtMost = v.coerceAtMost(i8, 12);
            sb.append(b.formatToExactDecimals(m262toDoubleimpl, coerceAtMost));
            sb.append(e.shortName(unit));
            return sb.toString();
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i8).toString());
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m256timesUwyO8pc(long j8, double d8) {
        int roundToInt;
        roundToInt = h6.d.roundToInt(d8);
        if (roundToInt == d8) {
            return m257timesUwyO8pc(j8, roundToInt);
        }
        DurationUnit m244getStorageUnitimpl = m244getStorageUnitimpl(j8);
        return c.toDuration(m262toDoubleimpl(j8, m244getStorageUnitimpl) * d8, m244getStorageUnitimpl);
    }
}
