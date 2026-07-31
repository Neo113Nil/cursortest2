package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;

/* compiled from: ScaleFactor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "roundToTenths", "(F)F", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScaleFactorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m1969constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m1976timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m1335getWidthimpl(j) * ScaleFactor.m1971getScaleXimpl(j2), Size.m1333getHeightimpl(j) * ScaleFactor.m1972getScaleYimpl(j2));
    }
}
