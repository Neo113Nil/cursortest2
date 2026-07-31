package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: CornerRadius.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue$annotations", "()V", "", "getX-impl", "(J)F", "getX$annotations", VastAttributes.HORIZONTAL_POSITION, "getY-impl", "getY$annotations", VastAttributes.VERTICAL_POSITION, "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CornerRadius {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1279constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1280equalsimpl(long j, Object obj) {
        return (obj instanceof CornerRadius) && j == ((CornerRadius) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1281equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1284hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1280equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1284hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1282getXimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1283getYimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/CornerRadius;", "Zero", "J", "getZero-kKHJgLs", "()J", "getZero-kKHJgLs$annotations", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m1287getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    public String toString() {
        return m1285toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1285toStringimpl(long j) {
        if (m1282getXimpl(j) == m1283getYimpl(j)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m1282getXimpl(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m1282getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1283getYimpl(j), 1) + ')';
    }
}
