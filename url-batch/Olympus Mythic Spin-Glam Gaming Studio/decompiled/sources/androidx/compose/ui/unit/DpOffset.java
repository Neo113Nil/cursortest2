package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Dp.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\u00020\u00168FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001d\u001a\u00020\u00168FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue$annotations", "()V", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM", "(J)F", "getX-D9Ej5fM$annotations", VastAttributes.HORIZONTAL_POSITION, "getY-D9Ej5fM", "getY-D9Ej5fM$annotations", VastAttributes.VERTICAL_POSITION, "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DpOffset {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m2518boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2519constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2520equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2521equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2524hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2520equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2524hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    static {
        float f = 0;
        Zero = DpKt.m2516DpOffsetYgX7TsA(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(f));
        Dp.Companion companion = Dp.INSTANCE;
        Unspecified = DpKt.m2516DpOffsetYgX7TsA(companion.m2515getUnspecifiedD9Ej5fM(), companion.m2515getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m2522getXD9Ej5fM(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m2507constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m2523getYD9Ej5fM(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m2507constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public String toString() {
        return m2525toStringimpl(this.packedValue);
    }

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m2528getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m2527getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2525toStringimpl(long j) {
        if (j != INSTANCE.m2527getUnspecifiedRKDOV3M()) {
            return '(' + ((Object) Dp.m2511toStringimpl(m2522getXD9Ej5fM(j))) + ", " + ((Object) Dp.m2511toStringimpl(m2523getYD9Ej5fM(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
