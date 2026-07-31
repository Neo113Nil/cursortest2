package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroidx/compose/ui/unit/IntOffset;", "IntOffset", "(II)J", "Landroidx/compose/ui/geometry/Offset;", "offset", "plus-Nv-tHpc", "(JJ)J", "plus", "minus-Nv-tHpc", "minus", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m2548constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m2560plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1297getXimpl(j) + IntOffset.m2553getXimpl(j2), Offset.m1298getYimpl(j) + IntOffset.m2554getYimpl(j2));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m2559minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1297getXimpl(j) - IntOffset.m2553getXimpl(j2), Offset.m1298getYimpl(j) - IntOffset.m2554getYimpl(j2));
    }
}
