package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Dp.kt */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R#\u0010\u001e\u001a\u00020\u001a8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR#\u0010!\u001a\u00020\u001a8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001f\u0010\u001c\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "", "packedValue", "constructor-impl", "(J)J", "", "other", "times-Gh9hcWk", "(JF)J", "times", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue$annotations", "()V", "Landroidx/compose/ui/unit/Dp;", "getWidth-D9Ej5fM", "(J)F", "getWidth-D9Ej5fM$annotations", "width", "getHeight-D9Ej5fM", "getHeight-D9Ej5fM$annotations", "height", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DpSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m2533boximpl(long j) {
        return new DpSize(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2534constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2535equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2536equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2539hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2535equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2539hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    static {
        float f = 0;
        Zero = DpKt.m2517DpSizeYgX7TsA(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(f));
        Dp.Companion companion = Dp.INSTANCE;
        Unspecified = DpKt.m2517DpSizeYgX7TsA(companion.m2515getUnspecifiedD9Ej5fM(), companion.m2515getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m2538getWidthD9Ej5fM(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m2507constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m2537getHeightD9Ej5fM(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m2507constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m2540timesGh9hcWk(long j, float f) {
        return DpKt.m2517DpSizeYgX7TsA(Dp.m2507constructorimpl(m2538getWidthD9Ej5fM(j) * f), Dp.m2507constructorimpl(m2537getHeightD9Ej5fM(j) * f));
    }

    public String toString() {
        return m2541toStringimpl(this.packedValue);
    }

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m2544getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m2543getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2541toStringimpl(long j) {
        if (j != INSTANCE.m2543getUnspecifiedMYxV2XQ()) {
            return ((Object) Dp.m2511toStringimpl(m2538getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m2511toStringimpl(m2537getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }
}
