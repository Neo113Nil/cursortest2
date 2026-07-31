package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/DistanceAndInLayer;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "compareTo-S_HNhKs", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue", "()J", "", "getDistance-impl", "(J)F", "distance", "isInLayer-impl", "(J)Z", "isInLayer", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1979constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1980equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j == ((DistanceAndInLayer) obj).getPackedValue();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1982hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m1983isInLayerimpl(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1984toStringimpl(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1980equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1982hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1984toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m1981getDistanceimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m1978compareToS_HNhKs(long j, long j2) {
        boolean m1983isInLayerimpl = m1983isInLayerimpl(j);
        if (m1983isInLayerimpl != m1983isInLayerimpl(j2)) {
            return m1983isInLayerimpl ? -1 : 1;
        }
        return (int) Math.signum(m1981getDistanceimpl(j) - m1981getDistanceimpl(j2));
    }
}
