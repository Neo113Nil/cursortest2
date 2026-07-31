package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: SpringSimulation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue", "()J", "", "getValue-impl", "(J)F", "value", "getVelocity-impl", "velocity", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Motion {
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m108constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m109equalsimpl(long j, Object obj) {
        return (obj instanceof Motion) && j == ((Motion) obj).getPackedValue();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m112hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m113toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m109equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m112hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m113toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m110getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m111getVelocityimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
