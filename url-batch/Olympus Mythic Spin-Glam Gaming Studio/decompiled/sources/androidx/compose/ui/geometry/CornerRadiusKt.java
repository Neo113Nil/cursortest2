package androidx.compose.ui.geometry;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* compiled from: CornerRadius.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroidx/compose/ui/geometry/CornerRadius;", "CornerRadius", "(FF)J", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CornerRadiusKt {
    public static final long CornerRadius(float f, float f2) {
        return CornerRadius.m1279constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return CornerRadius(f, f2);
    }
}
