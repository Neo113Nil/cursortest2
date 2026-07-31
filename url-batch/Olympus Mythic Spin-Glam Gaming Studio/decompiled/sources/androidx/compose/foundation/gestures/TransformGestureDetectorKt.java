package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransformGestureDetector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "calculateRotation", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "", "useCurrent", "calculateCentroidSize", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformGestureDetectorKt {
    public static final float calculateRotation(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = (PointerInputChange) changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long m1301minusMKHz9U = Offset.m1301minusMKHz9U(pointerInputChange2.getPreviousPosition(), calculateCentroid2);
                long m1301minusMKHz9U2 = Offset.m1301minusMKHz9U(position, calculateCentroid);
                float m289anglek4lQ0M = m289anglek4lQ0M(m1301minusMKHz9U2) - m289anglek4lQ0M(m1301minusMKHz9U);
                float m1295getDistanceimpl = Offset.m1295getDistanceimpl(Offset.m1302plusMKHz9U(m1301minusMKHz9U2, m1301minusMKHz9U)) / 2.0f;
                if (m289anglek4lQ0M > 180.0f) {
                    m289anglek4lQ0M -= 360.0f;
                } else if (m289anglek4lQ0M < -180.0f) {
                    m289anglek4lQ0M += 360.0f;
                }
                f2 += m289anglek4lQ0M * m1295getDistanceimpl;
                f += m1295getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m289anglek4lQ0M(long j) {
        if (Offset.m1297getXimpl(j) == 0.0f && Offset.m1298getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        if (Offset.m1294equalsimpl0(calculateCentroid, companion.m1307getUnspecifiedF1C5BW0())) {
            return companion.m1308getZeroF1C5BW0();
        }
        return Offset.m1301minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f = 0.0f;
        if (Offset.m1294equalsimpl0(calculateCentroid, Offset.INSTANCE.m1307getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                f += Offset.m1295getDistanceimpl(Offset.m1301minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), calculateCentroid));
                i++;
            }
        }
        return f / i;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long m1308getZeroF1C5BW0 = Offset.INSTANCE.m1308getZeroF1C5BW0();
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m1308getZeroF1C5BW0 = Offset.m1302plusMKHz9U(m1308getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        if (i == 0) {
            return Offset.INSTANCE.m1307getUnspecifiedF1C5BW0();
        }
        return Offset.m1292divtuRUvjQ(m1308getZeroF1C5BW0, i);
    }
}
