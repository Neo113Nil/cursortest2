package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IntOffset.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 #2\u00020\u0001:\u0001#B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\r\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "copy-iSbpLlY", "(JII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue$annotations", "()V", "getX-impl", "getX$annotations", "getY-impl", "getY$annotations", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IntOffset {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m2545boximpl(long j) {
        return new IntOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2548constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2551equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2552equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m2553getXimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m2554getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2555hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2551equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2555hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m2546component1impl(long j) {
        return m2553getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m2547component2impl(long j) {
        return m2554getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m2549copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m2550copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m2553getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m2554getYimpl(j);
        }
        return m2549copyiSbpLlY(j, i, i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2556toStringimpl(long j) {
        return '(' + m2553getXimpl(j) + ", " + m2554getYimpl(j) + ')';
    }

    public String toString() {
        return m2556toStringimpl(this.packedValue);
    }

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m2558getZeronOccac() {
            return IntOffset.Zero;
        }
    }
}
