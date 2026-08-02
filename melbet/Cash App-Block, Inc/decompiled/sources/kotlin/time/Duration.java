package kotlin.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class Duration implements Comparable {
    public final long rawValue;
    public static final Companion Companion = new Companion(null);
    public static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    public static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);
    public static final long INVALID = 9223372036854759646L;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    public static final long m4162addValuesMixedRangesUwyO8pc(long j, long j2) {
        long j3 = j2 / 1000000;
        long addMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(j, j3);
        if (-4611686018426L > addMillisWithoutOverflow || addMillisWithoutOverflow >= 4611686018427L) {
            return DurationKt.durationOfMillis(addMillisWithoutOverflow);
        }
        return DurationKt.durationOfNanos((addMillisWithoutOverflow * 1000000) + (j2 - (j3 * 1000000)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    public static final void m4163appendFractionalimpl(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt.padStart(i3, String.valueOf(i2));
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) padStart, 0, i6);
            }
        }
        sb.append(str);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m4164compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m4165divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt___ComparisonsJvmKt.maxOf(m4170getStorageUnitimpl(j), m4170getStorageUnitimpl(j2));
        return m4175toDoubleimpl(j, durationUnit) / m4175toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4166equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m4167getInWholeMillisecondsimpl(long j) {
        return ((((int) j) & 1) != 1 || m4171isInfiniteimpl(j)) ? m4176toLongimpl(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m4168getInWholeNanosecondsimpl(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m4169getNanosecondsComponentimpl(long j) {
        if (m4171isInfiniteimpl(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    public static final DurationUnit m4170getStorageUnitimpl(long j) {
        return (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4171isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m4172minusLRDsOJo(long j, long j2) {
        return m4173plusLRDsOJo(j, m4179unaryMinusUwyO8pc(j2));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m4173plusLRDsOJo(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m4162addValuesMixedRangesUwyO8pc(j >> 1, j2 >> 1) : m4162addValuesMixedRangesUwyO8pc(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? DurationKt.durationOfMillis(j3 / 1000000) : DurationKt.durationOfNanos(j3);
        }
        long addMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(j >> 1, j2 >> 1);
        if (addMillisWithoutOverflow != 9223372036854759646L) {
            return (addMillisWithoutOverflow == 4611686018427387903L || addMillisWithoutOverflow == -4611686018427387903L) ? DurationKt.durationOfMillis(addMillisWithoutOverflow) : DurationKt.durationOfMillisNormalized(addMillisWithoutOverflow);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if ((java.lang.Integer.signum(r2) * java.lang.Long.signum(r6)) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        return kotlin.time.Duration.NEG_INFINITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        return kotlin.time.Duration.INFINITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if ((java.lang.Integer.signum(r2) * java.lang.Long.signum(r6)) > 0) goto L48;
     */
    /* renamed from: times-UwyO8pc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m4174timesUwyO8pc(long j, double d) {
        int roundToInt = MathKt__MathJVMKt.roundToInt(d);
        if (roundToInt != d) {
            DurationUnit m4170getStorageUnitimpl = m4170getStorageUnitimpl(j);
            return DurationKt.toDuration(m4175toDoubleimpl(j, m4170getStorageUnitimpl) * d, m4170getStorageUnitimpl);
        }
        if (m4171isInfiniteimpl(j)) {
            if (roundToInt != 0) {
                return roundToInt > 0 ? j : m4179unaryMinusUwyO8pc(j);
            }
            a$$ExternalSyntheticBUOutline0.m$3("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (roundToInt == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = roundToInt;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return DurationKt.durationOfNanos(j4);
            }
            if (j4 / j3 == j2) {
                return (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) ? DurationKt.durationOfMillis(j4 / 1000000) : DurationKt.durationOfNanos(j4);
            }
            long j5 = j2 / 1000000;
            long j6 = j5 * j3;
            long j7 = (((j2 - (j5 * 1000000)) * j3) / 1000000) + j6;
            if (j6 / j3 == j5 && (j7 ^ j6) >= 0) {
                return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(j7, new LongRange(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(j4, new LongRange(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4175toDoubleimpl(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j >> 1, m4170getStorageUnitimpl(j), durationUnit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m4176toLongimpl(long j, DurationUnit durationUnit) {
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return durationUnit.timeUnit.convert(j >> 1, m4170getStorageUnitimpl(j).timeUnit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4177toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m4179unaryMinusUwyO8pc(j);
        }
        long m4176toLongimpl = m4176toLongimpl(j, DurationUnit.DAYS);
        int m4176toLongimpl2 = m4171isInfiniteimpl(j) ? 0 : (int) (m4176toLongimpl(j, DurationUnit.HOURS) % 24);
        int m4176toLongimpl3 = m4171isInfiniteimpl(j) ? 0 : (int) (m4176toLongimpl(j, DurationUnit.MINUTES) % 60);
        int m4176toLongimpl4 = m4171isInfiniteimpl(j) ? 0 : (int) (m4176toLongimpl(j, DurationUnit.SECONDS) % 60);
        int m4169getNanosecondsComponentimpl = m4169getNanosecondsComponentimpl(j);
        boolean z2 = m4176toLongimpl != 0;
        boolean z3 = m4176toLongimpl2 != 0;
        boolean z4 = m4176toLongimpl3 != 0;
        boolean z5 = (m4176toLongimpl4 == 0 && m4169getNanosecondsComponentimpl == 0) ? false : true;
        if (z2) {
            sb.append(m4176toLongimpl);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m4176toLongimpl2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m4176toLongimpl3);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m4176toLongimpl4 != 0 || z2 || z3 || z4) {
                m4163appendFractionalimpl(sb, m4176toLongimpl4, m4169getNanosecondsComponentimpl, 9, "s", false);
            } else if (m4169getNanosecondsComponentimpl >= 1000000) {
                m4163appendFractionalimpl(sb, m4169getNanosecondsComponentimpl / 1000000, m4169getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m4169getNanosecondsComponentimpl >= 1000) {
                m4163appendFractionalimpl(sb, m4169getNanosecondsComponentimpl / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, m4169getNanosecondsComponentimpl % IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 3, "us", false);
            } else {
                sb.append(m4169getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static String m4178toStringimpl$default(long j) {
        DecimalFormat decimalFormat;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        double m4175toDoubleimpl = m4175toDoubleimpl(j, durationUnit);
        if (Double.isInfinite(m4175toDoubleimpl)) {
            return String.valueOf(m4175toDoubleimpl);
        }
        ThreadLocal[] threadLocalArr = DurationJvmKt.precisionFormats;
        if (threadLocalArr.length > 0) {
            ThreadLocal threadLocal = threadLocalArr[0];
            Object obj = threadLocal.get();
            Object obj2 = obj;
            if (obj == null) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat2);
                obj2 = decimalFormat2;
            }
            decimalFormat = (DecimalFormat) obj2;
        } else {
            decimalFormat = new DecimalFormat("0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        String format2 = decimalFormat.format(m4175toDoubleimpl);
        format2.getClass();
        return format2.concat(DurationUnitKt__DurationUnitKt.shortName(durationUnit));
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m4179unaryMinusUwyO8pc(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        Companion.getClass();
        ThreadLocal[] threadLocalArr = DurationJvmKt.precisionFormats;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m4164compareToLRDsOJo(this.rawValue, ((Duration) obj).rawValue);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.rawValue == ((Duration) obj).rawValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.rawValue);
    }

    public final String toString() {
        return m4177toStringimpl(this.rawValue);
    }
}
