package kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration> {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m2150constructorimpl(0);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m2148boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2154equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2155equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m2169getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m2170getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2171hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m2173isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m2174isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m2176isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m2177isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object other) {
        return m2154equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m2171hashCodeimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m2195compareToLRDsOJo(duration.getRawValue());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m2168getStorageUnitimpl(long j) {
        return m2174isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2150constructorimpl(long j) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m2174isInNanosimpl(j)) {
            long m2170getValueimpl = m2170getValueimpl(j);
            if (-4611686018426999999L > m2170getValueimpl || m2170getValueimpl >= 4611686018427000000L) {
                throw new AssertionError(m2170getValueimpl(j) + " ns is out of nanoseconds range");
            }
            return j;
        }
        long m2170getValueimpl2 = m2170getValueimpl(j);
        if (-4611686018427387903L > m2170getValueimpl2 || m2170getValueimpl2 >= 4611686018427387904L) {
            throw new AssertionError(m2170getValueimpl(j) + " ms is out of milliseconds range");
        }
        long m2170getValueimpl3 = m2170getValueimpl(j);
        if (-4611686018426L > m2170getValueimpl3 || m2170getValueimpl3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(m2170getValueimpl(j) + " ms is denormalized");
    }

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2200getDaysUwyO8pc$annotations(double d) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2201getDaysUwyO8pc$annotations(int i) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2202getDaysUwyO8pc$annotations(long j) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2206getHoursUwyO8pc$annotations(double d) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2207getHoursUwyO8pc$annotations(int i) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2208getHoursUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2212getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2213getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2214getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2218getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2219getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2220getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2224getMinutesUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2225getMinutesUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2226getMinutesUwyO8pc$annotations(long j) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2230getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2231getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2232getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2236getSecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2237getSecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2238getSecondsUwyO8pc$annotations(long j) {
        }

        private Companion() {
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m2241getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m2239getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m2240getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2228getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2229getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2227getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2210getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2211getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2209getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2216getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2217getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2215getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2234getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2235getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2233getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2222getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2223getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2221getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2204getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2205getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2203getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2198getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2199getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2197getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m2242parseUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return parseDuration;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m2243parseIsoStringUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m2245parseOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return Duration.m2148boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m2244parseIsoStringOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return Duration.m2148boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m2194unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m2170getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m2179plusLRDsOJo(long j, long j2) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m2175isInfiniteimpl(j)) {
            if (m2172isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m2175isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long m2170getValueimpl = m2170getValueimpl(j) + m2170getValueimpl(j2);
            if (m2174isInNanosimpl(j)) {
                durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m2170getValueimpl);
                return durationOfNanosNormalized;
            }
            durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(m2170getValueimpl);
            return durationOfMillisNormalized;
        }
        if (m2173isInMillisimpl(j)) {
            return m2146addValuesMixedRangesUwyO8pc(j, m2170getValueimpl(j), m2170getValueimpl(j2));
        }
        return m2146addValuesMixedRangesUwyO8pc(j, m2170getValueimpl(j2), m2170getValueimpl(j));
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m2146addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long nanosToMillis;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j3);
        long j4 = j2 + nanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, DurationKt.MAX_MILLIS));
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j5 = j3 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(j4);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j5);
        return durationOfNanos;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m2178minusLRDsOJo(long j, long j2) {
        return m2179plusLRDsOJo(j, m2194unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2181timesUwyO8pc(long j, int i) {
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m2175isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m2194unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long m2170getValueimpl = m2170getValueimpl(j);
        long j2 = i;
        long j3 = m2170getValueimpl * j2;
        if (!m2174isInNanosimpl(j)) {
            if (j3 / j2 != m2170getValueimpl) {
                return MathKt.getSign(m2170getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
            }
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            return durationOfMillis;
        }
        if (-2147483647L <= m2170getValueimpl && m2170getValueimpl < 2147483648L) {
            durationOfNanos = DurationKt.durationOfNanos(j3);
            return durationOfNanos;
        }
        if (j3 / j2 == m2170getValueimpl) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(j3);
            return durationOfNanosNormalized;
        }
        nanosToMillis = DurationKt.nanosToMillis(m2170getValueimpl);
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j4 = nanosToMillis * j2;
        nanosToMillis2 = DurationKt.nanosToMillis((m2170getValueimpl - millisToNanos) * j2);
        long j5 = nanosToMillis2 + j4;
        if (j4 / j2 != nanosToMillis || (j5 ^ j4) < 0) {
            return MathKt.getSign(m2170getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        durationOfMillis2 = DurationKt.durationOfMillis(RangesKt.coerceIn(j5, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
        return durationOfMillis2;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2180timesUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m2181timesUwyO8pc(j, roundToInt);
        }
        DurationUnit m2168getStorageUnitimpl = m2168getStorageUnitimpl(j);
        return DurationKt.toDuration(m2186toDoubleimpl(j, m2168getStorageUnitimpl) * d, m2168getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2153divUwyO8pc(long j, int i) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i == 0) {
            if (m2177isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m2176isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m2174isInNanosimpl(j)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m2170getValueimpl(j) / i);
            return durationOfNanos2;
        }
        if (m2175isInfiniteimpl(j)) {
            return m2181timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long m2170getValueimpl = m2170getValueimpl(j) / j2;
        if (-4611686018426L > m2170getValueimpl || m2170getValueimpl >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(m2170getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m2170getValueimpl(j) - (m2170getValueimpl * j2));
        millisToNanos2 = DurationKt.millisToNanos(m2170getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j2));
        return durationOfNanos;
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2152divUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m2153divUwyO8pc(j, roundToInt);
        }
        DurationUnit m2168getStorageUnitimpl = m2168getStorageUnitimpl(j);
        return DurationKt.toDuration(m2186toDoubleimpl(j, m2168getStorageUnitimpl) / d, m2168getStorageUnitimpl);
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m2151divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m2168getStorageUnitimpl(j), m2168getStorageUnitimpl(j2));
        return m2186toDoubleimpl(j, durationUnit) / m2186toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m2193truncateToUwyO8pc$kotlin_stdlib(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m2168getStorageUnitimpl = m2168getStorageUnitimpl(j);
        if (unit.compareTo(m2168getStorageUnitimpl) <= 0 || m2175isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m2170getValueimpl(j) - (m2170getValueimpl(j) % DurationUnitKt.convertDurationUnit(1L, unit, m2168getStorageUnitimpl)), m2168getStorageUnitimpl);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m2175isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m2172isFiniteimpl(long j) {
        return !m2175isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m2156getAbsoluteValueUwyO8pc(long j) {
        return m2176isNegativeimpl(j) ? m2194unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m2195compareToLRDsOJo(long j) {
        return m2149compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m2149compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m2176isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2185toComponentsimpl(long j, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2158getInWholeDaysimpl(j)), Integer.valueOf(m2157getHoursComponentimpl(j)), Integer.valueOf(m2165getMinutesComponentimpl(j)), Integer.valueOf(m2167getSecondsComponentimpl(j)), Integer.valueOf(m2166getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2184toComponentsimpl(long j, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2159getInWholeHoursimpl(j)), Integer.valueOf(m2165getMinutesComponentimpl(j)), Integer.valueOf(m2167getSecondsComponentimpl(j)), Integer.valueOf(m2166getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2183toComponentsimpl(long j, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2162getInWholeMinutesimpl(j)), Integer.valueOf(m2167getSecondsComponentimpl(j)), Integer.valueOf(m2166getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2182toComponentsimpl(long j, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2164getInWholeSecondsimpl(j)), Integer.valueOf(m2166getNanosecondsComponentimpl(j)));
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m2157getHoursComponentimpl(long j) {
        if (m2175isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2159getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m2165getMinutesComponentimpl(long j) {
        if (m2175isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2162getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m2167getSecondsComponentimpl(long j) {
        if (m2175isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2164getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m2166getNanosecondsComponentimpl(long j) {
        long m2170getValueimpl;
        if (m2175isInfiniteimpl(j)) {
            return 0;
        }
        if (m2173isInMillisimpl(j)) {
            m2170getValueimpl = DurationKt.millisToNanos(m2170getValueimpl(j) % 1000);
        } else {
            m2170getValueimpl = m2170getValueimpl(j) % 1000000000;
        }
        return (int) m2170getValueimpl;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m2186toDoubleimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m2170getValueimpl(j), m2168getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m2189toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m2170getValueimpl(j), m2168getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m2187toIntimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m2189toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m2158getInWholeDaysimpl(long j) {
        return m2189toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m2159getInWholeHoursimpl(long j) {
        return m2189toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m2162getInWholeMinutesimpl(long j) {
        return m2189toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m2164getInWholeSecondsimpl(long j) {
        return m2189toLongimpl(j, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m2161getInWholeMillisecondsimpl(long j) {
        return (m2173isInMillisimpl(j) && m2172isFiniteimpl(j)) ? m2170getValueimpl(j) : m2189toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m2160getInWholeMicrosecondsimpl(long j) {
        return m2189toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m2163getInWholeNanosecondsimpl(long j) {
        long millisToNanos;
        long m2170getValueimpl = m2170getValueimpl(j);
        if (m2174isInNanosimpl(j)) {
            return m2170getValueimpl;
        }
        if (m2170getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m2170getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m2170getValueimpl);
        return millisToNanos;
    }

    public String toString() {
        return m2190toStringimpl(this.rawValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2190toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m2176isNegativeimpl = m2176isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m2176isNegativeimpl) {
            sb.append('-');
        }
        long m2156getAbsoluteValueUwyO8pc = m2156getAbsoluteValueUwyO8pc(j);
        long m2158getInWholeDaysimpl = m2158getInWholeDaysimpl(m2156getAbsoluteValueUwyO8pc);
        int m2157getHoursComponentimpl = m2157getHoursComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int m2165getMinutesComponentimpl = m2165getMinutesComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int m2167getSecondsComponentimpl = m2167getSecondsComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int m2166getNanosecondsComponentimpl = m2166getNanosecondsComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m2158getInWholeDaysimpl != 0;
        boolean z2 = m2157getHoursComponentimpl != 0;
        boolean z3 = m2165getMinutesComponentimpl != 0;
        boolean z4 = (m2167getSecondsComponentimpl == 0 && m2166getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m2158getInWholeDaysimpl).append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m2157getHoursComponentimpl).append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m2165getMinutesComponentimpl).append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m2167getSecondsComponentimpl != 0 || z || z2 || z3) {
                m2147appendFractionalimpl(j, sb, m2167getSecondsComponentimpl, m2166getNanosecondsComponentimpl, 9, "s", false);
            } else if (m2166getNanosecondsComponentimpl >= 1000000) {
                m2147appendFractionalimpl(j, sb, m2166getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m2166getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m2166getNanosecondsComponentimpl >= 1000) {
                m2147appendFractionalimpl(j, sb, m2166getNanosecondsComponentimpl / 1000, m2166getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m2166getNanosecondsComponentimpl).append("ns");
            }
            i = i4;
        }
        if (m2176isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m2147appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            String padStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
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
                Intrinsics.checkNotNullExpressionValue(sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3), "append(...)");
            } else {
                Intrinsics.checkNotNullExpressionValue(sb.append((CharSequence) padStart, 0, i6), "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m2192toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m2191toStringimpl(j, durationUnit, i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m2191toStringimpl(long j, DurationUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double m2186toDoubleimpl = m2186toDoubleimpl(j, unit);
        return Double.isInfinite(m2186toDoubleimpl) ? String.valueOf(m2186toDoubleimpl) : DurationJvmKt.formatToExactDecimals(m2186toDoubleimpl, RangesKt.coerceAtMost(i, 12)) + DurationUnitKt.shortName(unit);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m2188toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m2176isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m2156getAbsoluteValueUwyO8pc = m2156getAbsoluteValueUwyO8pc(j);
        long m2159getInWholeHoursimpl = m2159getInWholeHoursimpl(m2156getAbsoluteValueUwyO8pc);
        int m2165getMinutesComponentimpl = m2165getMinutesComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int m2167getSecondsComponentimpl = m2167getSecondsComponentimpl(m2156getAbsoluteValueUwyO8pc);
        int m2166getNanosecondsComponentimpl = m2166getNanosecondsComponentimpl(m2156getAbsoluteValueUwyO8pc);
        long j2 = m2175isInfiniteimpl(j) ? 9999999999999L : m2159getInWholeHoursimpl;
        boolean z = true;
        boolean z2 = j2 != 0;
        boolean z3 = (m2167getSecondsComponentimpl == 0 && m2166getNanosecondsComponentimpl == 0) ? false : true;
        if (m2165getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(j2).append('H');
        }
        if (z) {
            sb.append(m2165getMinutesComponentimpl).append('M');
        }
        if (z3 || (!z2 && !z)) {
            m2147appendFractionalimpl(j, sb, m2167getSecondsComponentimpl, m2166getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }
}
