package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "J", "getOffset-nOcc-ac", "()J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo612calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long IntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long mo1228alignKFBX0sM = alignment.mo1228alignKFBX0sM(companion.m2571getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long mo1228alignKFBX0sM2 = this.alignment.mo1228alignKFBX0sM(companion.m2571getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m2567getWidthimpl(popupContentSize), IntSize.m2566getHeightimpl(popupContentSize)), layoutDirection);
        long IntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(IntOffset2), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(IntOffset2));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset3) + IntOffset.m2553getXimpl(mo1228alignKFBX0sM), IntOffset.m2554getYimpl(IntOffset3) + IntOffset.m2554getYimpl(mo1228alignKFBX0sM));
        long IntOffset5 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(mo1228alignKFBX0sM2), IntOffset.m2554getYimpl(mo1228alignKFBX0sM2));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset4) - IntOffset.m2553getXimpl(IntOffset5), IntOffset.m2554getYimpl(IntOffset4) - IntOffset.m2554getYimpl(IntOffset5));
        long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m2554getYimpl(this.offset));
        return IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset6) + IntOffset.m2553getXimpl(IntOffset7), IntOffset.m2554getYimpl(IntOffset6) + IntOffset.m2554getYimpl(IntOffset7));
    }
}
