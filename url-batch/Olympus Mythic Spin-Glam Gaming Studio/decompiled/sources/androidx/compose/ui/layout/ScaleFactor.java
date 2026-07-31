package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: ScaleFactor.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue$annotations", "()V", "", "getScaleX-impl", "(J)F", "getScaleX$annotations", "scaleX", "getScaleY-impl", "getScaleY$annotations", "scaleY", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScaleFactor {
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1969constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1970equalsimpl(long j, Object obj) {
        return (obj instanceof ScaleFactor) && j == ((ScaleFactor) obj).getPackedValue();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1973hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m1970equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1973hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m1971getScaleXimpl(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m1972getScaleYimpl(long j) {
        if (j != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1974toStringimpl(long j) {
        float roundToTenths;
        float roundToTenths2;
        StringBuilder sb = new StringBuilder();
        sb.append("ScaleFactor(");
        roundToTenths = ScaleFactorKt.roundToTenths(m1971getScaleXimpl(j));
        sb.append(roundToTenths);
        sb.append(", ");
        roundToTenths2 = ScaleFactorKt.roundToTenths(m1972getScaleYimpl(j));
        sb.append(roundToTenths2);
        sb.append(')');
        return sb.toString();
    }

    public String toString() {
        return m1974toStringimpl(this.packedValue);
    }
}
