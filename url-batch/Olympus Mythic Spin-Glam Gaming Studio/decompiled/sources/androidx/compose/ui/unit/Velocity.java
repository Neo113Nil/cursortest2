package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Velocity.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "", "packedValue", "constructor-impl", "(J)J", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "copy-OhffZ5M", "(JFF)J", "copy", "other", "minus-AH228Gc", "(JJ)J", "minus", "plus-AH228Gc", "plus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getX-impl", "(J)F", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Velocity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m2599boximpl(long j) {
        return new Velocity(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2600constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2603equalsimpl(long j, Object obj) {
        return (obj instanceof Velocity) && j == ((Velocity) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2604equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2607hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2603equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2607hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2605getXimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2606getYimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m2601copyOhffZ5M(long j, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m2602copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m2605getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m2606getYimpl(j);
        }
        return m2601copyOhffZ5M(j, f, f2);
    }

    /* compiled from: Velocity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Velocity;", "Zero", "J", "getZero-9UxMQ8M", "()J", "getZero-9UxMQ8M$annotations", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m2612getZero9UxMQ8M() {
            return Velocity.Zero;
        }
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m2608minusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m2605getXimpl(j) - m2605getXimpl(j2), m2606getYimpl(j) - m2606getYimpl(j2));
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m2609plusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m2605getXimpl(j) + m2605getXimpl(j2), m2606getYimpl(j) + m2606getYimpl(j2));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2610toStringimpl(long j) {
        return '(' + m2605getXimpl(j) + ", " + m2606getYimpl(j) + ") px/sec";
    }

    public String toString() {
        return m2610toStringimpl(this.packedValue);
    }
}
