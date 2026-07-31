package kotlin.time;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\bA\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0082\u0080\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\rH\u0082\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0016\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b\u0017\u0010\u0005J\u0019\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0082\u0080\u0004¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b\"\u0010\u001bJ\u0019\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0082\u0004¢\u0006\u0004\b%\u0010&J\u0019\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0082\u0004¢\u0006\u0004\b%\u0010(J\u0019\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0082\u0004¢\u0006\u0004\b*\u0010&J\u0019\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0082\u0004¢\u0006\u0004\b*\u0010(J\u0019\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0080\u0080\u0004¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u00020\rH\u0086\u0080\u0004¢\u0006\u0004\b2\u0010\u000fJ\u0011\u00103\u001a\u00020\rH\u0086\u0080\u0004¢\u0006\u0004\b4\u0010\u000fJ\u0011\u00105\u001a\u00020\rH\u0086\u0080\u0004¢\u0006\u0004\b6\u0010\u000fJ\u0011\u00107\u001a\u00020\rH\u0086\u0080\u0004¢\u0006\u0004\b8\u0010\u000fJ\u0019\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0082\u0004¢\u0006\u0004\b<\u0010=J\u009e\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\u0088\u0004ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0089\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\u0088\u0004ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJt\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\u0088\u0004ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ_\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\u0088\u0004ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0019\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013H\u0086\u0080\u0004¢\u0006\u0004\b_\u0010`J\u0019\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013H\u0086\u0080\u0004¢\u0006\u0004\bb\u00100J\u0019\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013H\u0086\u0080\u0004¢\u0006\u0004\bd\u0010eJ\u0011\u0010t\u001a\u00020uH\u0096\u0080\u0004¢\u0006\u0004\bv\u0010wJC\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0082\u0080\u0004¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J%\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\tH\u0086\u0080\u0004¢\u0006\u0005\bv\u0010\u0083\u0001J\u0013\u0010\u0084\u0001\u001a\u00020uH\u0086\u0080\u0004¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0016\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0083\u0004J\u000b\u0010\u0088\u0001\u001a\u00020\tHÖ\u0081\u0004R\u000f\u0010\u0002\u001a\u00020\u0003X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u0015\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0015\u00109\u001a\u00020\u00008FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001b\u0010Q\u001a\u00020\t8@X\u0081\u0084\b¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001b\u0010U\u001a\u00020\t8@X\u0081\u0084\b¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001b\u0010X\u001a\u00020\t8@X\u0081\u0084\b¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001b\u0010[\u001a\u00020\t8@X\u0081\u0084\b¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0015\u0010f\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0015\u0010h\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0015\u0010j\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0015\u0010l\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0015\u0010n\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0015\u0010p\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0015\u0010r\u001a\u00020\u00038FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
@JvmInline
/* loaded from: classes4.dex */
public final class Duration implements Comparable<Duration> {
    private static final long INFINITE;
    private static final long INVALID;
    public static final long INVALID_RAW_VALUE = 9223372036854759646L;
    private static final long NEG_INFINITE;
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m10934constructorimpl(0);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m10932boximpl(long j) {
        return new Duration(j);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10934constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10938equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10939equalsimpl0(long j, long j2) {
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
    private static final int m10953getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getValue-impl, reason: not valid java name */
    public static final long m10954getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10955hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m10957isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isInNanos-impl, reason: not valid java name */
    public static final boolean m10958isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m10960isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m10961isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object other) {
        return m10938equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m10955hashCodeimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m10979compareToLRDsOJo(duration.getRawValue());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m10952getStorageUnitimpl(long j) {
        return m10958isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\u0080\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087\u0080\u0004J\u0019\u00108\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0004\b=\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0002\b?J\u0019\u0010@\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0002\bAR\u001d\u0010\n\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u000f\u0010\u0013\u001a\u00020\u0007X\u0080Ô\b¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\rR \u0010\u001d\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u001d\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010\tR \u0010\u001d\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%R \u0010&\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R \u0010&\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b(\u0010\tR \u0010&\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010%R \u0010)\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R \u0010)\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010#\u001a\u0004\b+\u0010\tR \u0010)\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010$\u001a\u0004\b+\u0010%R \u0010,\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R \u0010,\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010#\u001a\u0004\b.\u0010\tR \u0010,\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010$\u001a\u0004\b.\u0010%R \u0010/\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R \u0010/\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010#\u001a\u0004\b1\u0010\tR \u0010/\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010$\u001a\u0004\b1\u0010%R \u00102\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R \u00102\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010#\u001a\u0004\b4\u0010\tR \u00102\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010$\u001a\u0004\b4\u0010%R \u00105\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010 \u001a\u0004\b7\u0010\"R \u00105\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010#\u001a\u0004\b7\u0010\tR \u00105\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010$\u001a\u0004\b7\u0010%¨\u0006B"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "fromRawValue", "Lkotlin/time/Duration;", "rawValue", "", "fromRawValue-UwyO8pc$kotlin_stdlib", "(J)J", "ZERO", "getZERO-UwyO8pc$annotations", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "INVALID_RAW_VALUE", "INVALID", "getINVALID-UwyO8pc$kotlin_stdlib$annotations", "getINVALID-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "(J)V", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10984getDaysUwyO8pc$annotations(double d) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10985getDaysUwyO8pc$annotations(int i) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10986getDaysUwyO8pc$annotations(long j) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10990getHoursUwyO8pc$annotations(double d) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10991getHoursUwyO8pc$annotations(int i) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10992getHoursUwyO8pc$annotations(long j) {
        }

        /* renamed from: getINVALID-UwyO8pc$kotlin_stdlib$annotations, reason: not valid java name */
        public static /* synthetic */ void m10993getINVALIDUwyO8pc$kotlin_stdlib$annotations() {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10997getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10998getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10999getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11003getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11004getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11005getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11009getMinutesUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11010getMinutesUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11011getMinutesUwyO8pc$annotations(long j) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11015getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11016getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11017getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11021getSecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11022getSecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11023getSecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getZERO-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m11024getZEROUwyO8pc$annotations() {
        }

        private Companion() {
        }

        /* renamed from: fromRawValue-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m11025fromRawValueUwyO8pc$kotlin_stdlib(long rawValue) {
            long m10934constructorimpl = Duration.m10934constructorimpl(rawValue);
            if (DurationJvmKt.getDurationAssertionsEnabled()) {
                if (Duration.m10958isInNanosimpl(m10934constructorimpl)) {
                    long m10954getValueimpl = Duration.m10954getValueimpl(m10934constructorimpl);
                    if (-4611686018426999999L > m10954getValueimpl || m10954getValueimpl >= 4611686018427000000L) {
                        throw new AssertionError(Duration.m10954getValueimpl(m10934constructorimpl) + " ns is out of nanoseconds range");
                    }
                    return m10934constructorimpl;
                }
                long m10954getValueimpl2 = Duration.m10954getValueimpl(m10934constructorimpl);
                if (-4611686018427387903L >= m10954getValueimpl2 || m10954getValueimpl2 >= 4611686018427387903L) {
                    long m10954getValueimpl3 = Duration.m10954getValueimpl(m10934constructorimpl);
                    if (m10954getValueimpl3 != 4611686018427387903L && m10954getValueimpl3 != -4611686018427387903L) {
                        throw new AssertionError(Duration.m10954getValueimpl(m10934constructorimpl) + " ms is out of milliseconds range");
                    }
                }
                long m10954getValueimpl4 = Duration.m10954getValueimpl(m10934constructorimpl);
                if (-4611686018426L > m10954getValueimpl4 || m10954getValueimpl4 >= 4611686018427L) {
                    return m10934constructorimpl;
                }
                throw new AssertionError(Duration.m10954getValueimpl(m10934constructorimpl) + " ms is denormalized");
            }
            return m10934constructorimpl;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m11029getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m11026getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m11028getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getINVALID-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m11027getINVALIDUwyO8pc$kotlin_stdlib() {
            return Duration.INVALID;
        }

        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m11013getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m11014getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m11012getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10995getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10996getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10994getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m11001getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m11002getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m11000getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m11019getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m11020getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m11018getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m11007getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m11008getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m11006getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10988getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10989getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10987getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10982getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10983getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10981getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m11030parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                long parseDuration$default = DurationKt.parseDuration$default(value, false, false, 4, null);
                if (Duration.m10939equalsimpl0(parseDuration$default, Duration.INSTANCE.m11027getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new IllegalStateException("invariant failed".toString());
                }
                return parseDuration$default;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m11031parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                long parseDuration$default = DurationKt.parseDuration$default(value, true, false, 4, null);
                if (Duration.m10939equalsimpl0(parseDuration$default, Duration.INSTANCE.m11027getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new IllegalStateException("invariant failed".toString());
                }
                return parseDuration$default;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m11033parseOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            parseDuration = DurationKt.parseDuration(value, false, false);
            if (Duration.m10939equalsimpl0(parseDuration, Duration.INSTANCE.m11027getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return Duration.m10932boximpl(parseDuration);
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m11032parseIsoStringOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            parseDuration = DurationKt.parseDuration(value, true, false);
            if (Duration.m10939equalsimpl0(parseDuration, Duration.INSTANCE.m11027getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return Duration.m10932boximpl(parseDuration);
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(4611686018427387903L);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
        INVALID = m10934constructorimpl(INVALID_RAW_VALUE);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m10978unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m10954getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m10963plusLRDsOJo(long j, long j2) {
        long addMillisWithoutOverflow;
        long durationOfMillis;
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m10957isInMillisimpl(j) ? m10930addValuesMixedRangesUwyO8pc(j, m10954getValueimpl(j), m10954getValueimpl(j2)) : m10930addValuesMixedRangesUwyO8pc(j, m10954getValueimpl(j2), m10954getValueimpl(j));
        }
        if (m10958isInNanosimpl(j)) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m10954getValueimpl(j) + m10954getValueimpl(j2));
            return durationOfNanosNormalized;
        }
        addMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(m10954getValueimpl(j), m10954getValueimpl(j2));
        if (addMillisWithoutOverflow == INVALID_RAW_VALUE) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (addMillisWithoutOverflow == 4611686018427387903L || addMillisWithoutOverflow == -4611686018427387903L) {
            durationOfMillis = DurationKt.durationOfMillis(addMillisWithoutOverflow);
            return durationOfMillis;
        }
        durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(addMillisWithoutOverflow);
        return durationOfMillisNormalized;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m10930addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long nanosToMillis;
        long addMillisWithoutOverflow;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j3);
        addMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(j2, nanosToMillis);
        if (-4611686018426L > addMillisWithoutOverflow || addMillisWithoutOverflow >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(addMillisWithoutOverflow);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j4 = j3 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(addMillisWithoutOverflow);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j4);
        return durationOfNanos;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m10962minusLRDsOJo(long j, long j2) {
        return m10963plusLRDsOJo(j, m10978unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10965timesUwyO8pc(long j, int i) {
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m10959isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m10978unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long m10954getValueimpl = m10954getValueimpl(j);
        long j2 = i;
        long j3 = m10954getValueimpl * j2;
        if (!m10958isInNanosimpl(j)) {
            if (j3 / j2 != m10954getValueimpl) {
                return MathKt.getSign(m10954getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
            }
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, 4611686018427387903L)));
            return durationOfMillis;
        }
        if (-2147483647L <= m10954getValueimpl && m10954getValueimpl < 2147483648L) {
            durationOfNanos = DurationKt.durationOfNanos(j3);
            return durationOfNanos;
        }
        if (j3 / j2 == m10954getValueimpl) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(j3);
            return durationOfNanosNormalized;
        }
        nanosToMillis = DurationKt.nanosToMillis(m10954getValueimpl);
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j4 = nanosToMillis * j2;
        nanosToMillis2 = DurationKt.nanosToMillis((m10954getValueimpl - millisToNanos) * j2);
        long j5 = nanosToMillis2 + j4;
        if (j4 / j2 != nanosToMillis || (j5 ^ j4) < 0) {
            return MathKt.getSign(m10954getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        durationOfMillis2 = DurationKt.durationOfMillis(RangesKt.coerceIn(j5, new LongRange(-4611686018427387903L, 4611686018427387903L)));
        return durationOfMillis2;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10964timesUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m10965timesUwyO8pc(j, roundToInt);
        }
        DurationUnit m10952getStorageUnitimpl = m10952getStorageUnitimpl(j);
        return DurationKt.toDuration(m10970toDoubleimpl(j, m10952getStorageUnitimpl) * d, m10952getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m10937divUwyO8pc(long j, int i) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i == 0) {
            if (m10961isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m10960isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m10958isInNanosimpl(j)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m10954getValueimpl(j) / i);
            return durationOfNanos2;
        }
        if (m10959isInfiniteimpl(j)) {
            return m10965timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long m10954getValueimpl = m10954getValueimpl(j) / j2;
        if (-4611686018426L > m10954getValueimpl || m10954getValueimpl >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(m10954getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m10954getValueimpl(j) - (m10954getValueimpl * j2));
        millisToNanos2 = DurationKt.millisToNanos(m10954getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j2));
        return durationOfNanos;
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m10936divUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m10937divUwyO8pc(j, roundToInt);
        }
        DurationUnit m10952getStorageUnitimpl = m10952getStorageUnitimpl(j);
        return DurationKt.toDuration(m10970toDoubleimpl(j, m10952getStorageUnitimpl) / d, m10952getStorageUnitimpl);
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m10935divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m10952getStorageUnitimpl(j), m10952getStorageUnitimpl(j2));
        return m10970toDoubleimpl(j, durationUnit) / m10970toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m10977truncateToUwyO8pc$kotlin_stdlib(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m10952getStorageUnitimpl = m10952getStorageUnitimpl(j);
        if (unit.compareTo(m10952getStorageUnitimpl) <= 0 || m10959isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m10954getValueimpl(j) - (m10954getValueimpl(j) % DurationUnitKt.convertDurationUnit(1L, unit, m10952getStorageUnitimpl)), m10952getStorageUnitimpl);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m10959isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m10956isFiniteimpl(long j) {
        return !m10959isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m10940getAbsoluteValueUwyO8pc(long j) {
        return m10960isNegativeimpl(j) ? m10978unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m10979compareToLRDsOJo(long j) {
        return m10933compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m10933compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m10960isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10969toComponentsimpl(long j, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10942getInWholeDaysimpl(j)), Integer.valueOf(m10941getHoursComponentimpl(j)), Integer.valueOf(m10949getMinutesComponentimpl(j)), Integer.valueOf(m10951getSecondsComponentimpl(j)), Integer.valueOf(m10950getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10968toComponentsimpl(long j, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10943getInWholeHoursimpl(j)), Integer.valueOf(m10949getMinutesComponentimpl(j)), Integer.valueOf(m10951getSecondsComponentimpl(j)), Integer.valueOf(m10950getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10967toComponentsimpl(long j, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10946getInWholeMinutesimpl(j)), Integer.valueOf(m10951getSecondsComponentimpl(j)), Integer.valueOf(m10950getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10966toComponentsimpl(long j, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10948getInWholeSecondsimpl(j)), Integer.valueOf(m10950getNanosecondsComponentimpl(j)));
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m10941getHoursComponentimpl(long j) {
        if (m10959isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m10943getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m10949getMinutesComponentimpl(long j) {
        if (m10959isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m10946getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m10951getSecondsComponentimpl(long j) {
        if (m10959isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m10948getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m10950getNanosecondsComponentimpl(long j) {
        long m10954getValueimpl;
        if (m10959isInfiniteimpl(j)) {
            return 0;
        }
        if (m10957isInMillisimpl(j)) {
            m10954getValueimpl = DurationKt.millisToNanos(m10954getValueimpl(j) % 1000);
        } else {
            m10954getValueimpl = m10954getValueimpl(j) % 1000000000;
        }
        return (int) m10954getValueimpl;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m10970toDoubleimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m10954getValueimpl(j), m10952getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m10973toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m10954getValueimpl(j), m10952getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m10971toIntimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m10973toLongimpl(j, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m10942getInWholeDaysimpl(long j) {
        return m10973toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m10943getInWholeHoursimpl(long j) {
        return m10973toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m10946getInWholeMinutesimpl(long j) {
        return m10973toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m10948getInWholeSecondsimpl(long j) {
        return m10973toLongimpl(j, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m10945getInWholeMillisecondsimpl(long j) {
        return (m10957isInMillisimpl(j) && m10956isFiniteimpl(j)) ? m10954getValueimpl(j) : m10973toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m10944getInWholeMicrosecondsimpl(long j) {
        return m10973toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m10947getInWholeNanosecondsimpl(long j) {
        long millisToNanos;
        long m10954getValueimpl = m10954getValueimpl(j);
        if (m10958isInNanosimpl(j)) {
            return m10954getValueimpl;
        }
        if (m10954getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m10954getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m10954getValueimpl);
        return millisToNanos;
    }

    public String toString() {
        return m10974toStringimpl(this.rawValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10974toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m10960isNegativeimpl = m10960isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m10960isNegativeimpl) {
            sb.append('-');
        }
        long m10940getAbsoluteValueUwyO8pc = m10940getAbsoluteValueUwyO8pc(j);
        long m10942getInWholeDaysimpl = m10942getInWholeDaysimpl(m10940getAbsoluteValueUwyO8pc);
        int m10941getHoursComponentimpl = m10941getHoursComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int m10949getMinutesComponentimpl = m10949getMinutesComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int m10951getSecondsComponentimpl = m10951getSecondsComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int m10950getNanosecondsComponentimpl = m10950getNanosecondsComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m10942getInWholeDaysimpl != 0;
        boolean z2 = m10941getHoursComponentimpl != 0;
        boolean z3 = m10949getMinutesComponentimpl != 0;
        boolean z4 = (m10951getSecondsComponentimpl == 0 && m10950getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m10942getInWholeDaysimpl).append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m10941getHoursComponentimpl).append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m10949getMinutesComponentimpl).append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m10951getSecondsComponentimpl != 0 || z || z2 || z3) {
                m10931appendFractionalimpl(j, sb, m10951getSecondsComponentimpl, m10950getNanosecondsComponentimpl, 9, "s", false);
            } else if (m10950getNanosecondsComponentimpl >= 1000000) {
                m10931appendFractionalimpl(j, sb, m10950getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m10950getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m10950getNanosecondsComponentimpl >= 1000) {
                m10931appendFractionalimpl(j, sb, m10950getNanosecondsComponentimpl / 1000, m10950getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m10950getNanosecondsComponentimpl).append("ns");
            }
            i = i4;
        }
        if (m10960isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m10931appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
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
    public static /* synthetic */ String m10976toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m10975toStringimpl(j, durationUnit, i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m10975toStringimpl(long j, DurationUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double m10970toDoubleimpl = m10970toDoubleimpl(j, unit);
        return Double.isInfinite(m10970toDoubleimpl) ? String.valueOf(m10970toDoubleimpl) : DurationJvmKt.formatToExactDecimals(m10970toDoubleimpl, RangesKt.coerceAtMost(i, 12)) + DurationUnitKt.shortName(unit);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m10972toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m10960isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m10940getAbsoluteValueUwyO8pc = m10940getAbsoluteValueUwyO8pc(j);
        long m10943getInWholeHoursimpl = m10943getInWholeHoursimpl(m10940getAbsoluteValueUwyO8pc);
        int m10949getMinutesComponentimpl = m10949getMinutesComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int m10951getSecondsComponentimpl = m10951getSecondsComponentimpl(m10940getAbsoluteValueUwyO8pc);
        int m10950getNanosecondsComponentimpl = m10950getNanosecondsComponentimpl(m10940getAbsoluteValueUwyO8pc);
        long j2 = m10959isInfiniteimpl(j) ? 9999999999999L : m10943getInWholeHoursimpl;
        boolean z = true;
        boolean z2 = j2 != 0;
        boolean z3 = (m10951getSecondsComponentimpl == 0 && m10950getNanosecondsComponentimpl == 0) ? false : true;
        if (m10949getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(j2).append('H');
        }
        if (z) {
            sb.append(m10949getMinutesComponentimpl).append('M');
        }
        if (z3 || (!z2 && !z)) {
            m10931appendFractionalimpl(j, sb, m10951getSecondsComponentimpl, m10950getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }
}
