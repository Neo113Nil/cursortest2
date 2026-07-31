package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;

/* compiled from: IntSize.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"", "width", "height", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IntSizeKt {
    public static final long IntSize(int i, int i2) {
        return IntSize.m2563constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m2572toSizeozmzZPI(long j) {
        return SizeKt.Size(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
    }
}
