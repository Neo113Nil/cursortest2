package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Offset.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010'\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001a\u0010/\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\bR\u001a\u00102\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "", "isValid-impl", "(J)Z", "isValid", "getDistance-impl", "getDistance", "getDistanceSquared-impl", "getDistanceSquared", "other", "minus-MK-Hz9U", "(JJ)J", "minus", "plus-MK-Hz9U", "plus", "operand", "times-tuRUvjQ", "(JF)J", "times", "div-tuRUvjQ", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getX-impl", "getX$annotations", "()V", VastAttributes.HORIZONTAL_POSITION, "getY-impl", "getY$annotations", VastAttributes.VERTICAL_POSITION, "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Offset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m1288boximpl(long j) {
        return new Offset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1291constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1293equalsimpl(long j, Object obj) {
        return (obj instanceof Offset) && j == ((Offset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1294equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1299hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1293equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1299hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1297getXimpl(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1298getYimpl(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m1289component1impl(long j) {
        return m1297getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m1290component2impl(long j) {
        return m1298getYimpl(j);
    }

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR)\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR)\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "Zero", "J", "getZero-F1C5BW0", "()J", "getZero-F1C5BW0$annotations", "Infinite", "getInfinite-F1C5BW0", "getInfinite-F1C5BW0$annotations", "Unspecified", "getUnspecified-F1C5BW0", "getUnspecified-F1C5BW0$annotations", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m1308getZeroF1C5BW0() {
            return Offset.Zero;
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m1306getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m1307getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }
    }

    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m1300isValidimpl(long j) {
        if (Float.isNaN(m1297getXimpl(j)) || Float.isNaN(m1298getYimpl(j))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m1295getDistanceimpl(long j) {
        return (float) Math.sqrt((m1297getXimpl(j) * m1297getXimpl(j)) + (m1298getYimpl(j) * m1298getYimpl(j)));
    }

    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m1296getDistanceSquaredimpl(long j) {
        return (m1297getXimpl(j) * m1297getXimpl(j)) + (m1298getYimpl(j) * m1298getYimpl(j));
    }

    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m1301minusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m1297getXimpl(j) - m1297getXimpl(j2), m1298getYimpl(j) - m1298getYimpl(j2));
    }

    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m1302plusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m1297getXimpl(j) + m1297getXimpl(j2), m1298getYimpl(j) + m1298getYimpl(j2));
    }

    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m1303timestuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m1297getXimpl(j) * f, m1298getYimpl(j) * f);
    }

    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m1292divtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m1297getXimpl(j) / f, m1298getYimpl(j) / f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1304toStringimpl(long j) {
        if (OffsetKt.m1310isSpecifiedk4lQ0M(j)) {
            return "Offset(" + GeometryUtilsKt.toStringAsFixed(m1297getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1298getYimpl(j), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public String toString() {
        return m1304toStringimpl(this.packedValue);
    }
}
