package androidx.compose.ui.unit;

import kotlin.Metadata;

/* compiled from: IntRect.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/IntRect;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "IntRect", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntRectKt {
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m2561IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m2553getXimpl(j), IntOffset.m2554getYimpl(j), IntOffset.m2553getXimpl(j) + IntSize.m2567getWidthimpl(j2), IntOffset.m2554getYimpl(j) + IntSize.m2566getHeightimpl(j2));
    }
}
