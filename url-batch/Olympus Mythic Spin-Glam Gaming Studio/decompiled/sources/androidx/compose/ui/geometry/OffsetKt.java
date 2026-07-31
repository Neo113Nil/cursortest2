package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\"!\u0010\u0011\u001a\u00020\f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\"!\u0010\u0014\u001a\u00020\f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e\"!\u0010\u0017\u001a\u00020\f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroidx/compose/ui/geometry/Offset;", "Offset", "(FF)J", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "lerp", "", "isFinite-k-4lQ0M", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "isSpecified-k-4lQ0M", "isSpecified-k-4lQ0M$annotations", "isSpecified", "isUnspecified-k-4lQ0M", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OffsetKt {
    public static final long Offset(float f, float f2) {
        return Offset.m1291constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m1312lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpersKt.lerp(Offset.m1297getXimpl(j), Offset.m1297getXimpl(j2), f), MathHelpersKt.lerp(Offset.m1298getYimpl(j), Offset.m1298getYimpl(j2), f));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m1309isFinitek4lQ0M(long j) {
        float m1297getXimpl = Offset.m1297getXimpl(j);
        if (!Float.isInfinite(m1297getXimpl) && !Float.isNaN(m1297getXimpl)) {
            float m1298getYimpl = Offset.m1298getYimpl(j);
            if (!Float.isInfinite(m1298getYimpl) && !Float.isNaN(m1298getYimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1310isSpecifiedk4lQ0M(long j) {
        return j != Offset.INSTANCE.m1307getUnspecifiedF1C5BW0();
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1311isUnspecifiedk4lQ0M(long j) {
        return j == Offset.INSTANCE.m1307getUnspecifiedF1C5BW0();
    }
}
