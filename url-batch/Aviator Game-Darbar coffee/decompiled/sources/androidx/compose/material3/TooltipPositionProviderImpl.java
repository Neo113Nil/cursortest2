package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001cJ-\u0010!\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b%\u0010#R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006&"}, d2 = {"Landroidx/compose/material3/TooltipPositionProviderImpl;", "Landroidx/compose/ui/window/PopupPositionProvider;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/material3/TooltipAnchorPosition;", "tooltipAnchorSpacing", "", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getType-lOKsHw4", "()I", "I", "getTooltipAnchorSpacing", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "leftPositioning", "leftPositioning-oFUgxo0", "(Landroidx/compose/ui/unit/IntRect;J)J", "rightPositioning", "rightPositioning-uHY26d4", "(Landroidx/compose/ui/unit/IntRect;JJ)J", "abovePositioning", "abovePositioning-uHY26d4", "belowPositioning", "belowPositioning-uHY26d4", "startPositioning", "startPositioning-_JLpSYE", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/IntRect;JJ)J", "endPositioning", "endPositioning-_JLpSYE", "material3"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class TooltipPositionProviderImpl implements PopupPositionProvider {
    private final int tooltipAnchorSpacing;
    private final int type;

    public /* synthetic */ TooltipPositionProviderImpl(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private TooltipPositionProviderImpl(int i, int i2) {
        this.type = i;
        this.tooltipAnchorSpacing = i2;
    }

    /* renamed from: getType-lOKsHw4, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final int getTooltipAnchorSpacing() {
        return this.tooltipAnchorSpacing;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo375calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int i = this.type;
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2883getLeftlOKsHw4())) {
            return m2905leftPositioningoFUgxo0(anchorBounds, popupContentSize);
        }
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2884getRightlOKsHw4())) {
            return m2906rightPositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
        }
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2880getAbovelOKsHw4())) {
            return m2901abovePositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
        }
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2881getBelowlOKsHw4())) {
            return m2902belowPositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
        }
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2885getStartlOKsHw4())) {
            return m2907startPositioning_JLpSYE(layoutDirection, anchorBounds, popupContentSize, windowSize);
        }
        if (TooltipAnchorPosition.m2876equalsimpl0(i, TooltipAnchorPosition.INSTANCE.m2882getEndlOKsHw4())) {
            return m2903endPositioning_JLpSYE(layoutDirection, anchorBounds, popupContentSize, windowSize);
        }
        return m2901abovePositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
    }

    /* renamed from: leftPositioning-oFUgxo0, reason: not valid java name */
    public final long m2905leftPositioningoFUgxo0(IntRect anchorBounds, long popupContentSize) {
        int left = anchorBounds.getLeft() - (((int) (popupContentSize >> 32)) + this.tooltipAnchorSpacing);
        if (left < 0) {
            left = anchorBounds.getRight() + this.tooltipAnchorSpacing;
        }
        return IntOffset.m7644constructorimpl((left << 32) | ((((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & 4294967295L))) / 2) & 4294967295L));
    }

    /* renamed from: rightPositioning-uHY26d4, reason: not valid java name */
    public final long m2906rightPositioninguHY26d4(IntRect anchorBounds, long popupContentSize, long windowSize) {
        int right = anchorBounds.getRight() + this.tooltipAnchorSpacing;
        int i = (int) (popupContentSize >> 32);
        if (right + i > ((int) (windowSize >> 32))) {
            right = anchorBounds.getLeft() - (i + this.tooltipAnchorSpacing);
        }
        return IntOffset.m7644constructorimpl((right << 32) | ((((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & 4294967295L))) / 2) & 4294967295L));
    }

    /* renamed from: abovePositioning-uHY26d4, reason: not valid java name */
    public final long m2901abovePositioninguHY26d4(IntRect anchorBounds, long popupContentSize, long windowSize) {
        int i = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.getWidth() - i) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft();
        } else if (left + i > ((int) (windowSize >> 32))) {
            left = anchorBounds.getRight() - i;
        }
        int top = (anchorBounds.getTop() - ((int) (popupContentSize & 4294967295L))) - this.tooltipAnchorSpacing;
        if (top < 0) {
            top = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        }
        return IntOffset.m7644constructorimpl((left << 32) | (top & 4294967295L));
    }

    /* renamed from: belowPositioning-uHY26d4, reason: not valid java name */
    public final long m2902belowPositioninguHY26d4(IntRect anchorBounds, long popupContentSize, long windowSize) {
        int i = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.getWidth() - i) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft();
        } else if (left + i > ((int) (windowSize >> 32))) {
            left = anchorBounds.getRight() - i;
        }
        int bottom = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        int i2 = (int) (popupContentSize & 4294967295L);
        if (bottom + i2 > ((int) (windowSize & 4294967295L))) {
            bottom = (anchorBounds.getTop() - i2) - this.tooltipAnchorSpacing;
        }
        return IntOffset.m7644constructorimpl((left << 32) | (bottom & 4294967295L));
    }

    /* renamed from: startPositioning-_JLpSYE, reason: not valid java name */
    public final long m2907startPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect anchorBounds, long popupContentSize, long windowSize) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return m2905leftPositioningoFUgxo0(anchorBounds, popupContentSize);
        }
        return m2906rightPositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
    }

    /* renamed from: endPositioning-_JLpSYE, reason: not valid java name */
    public final long m2903endPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect anchorBounds, long popupContentSize, long windowSize) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return m2906rightPositioninguHY26d4(anchorBounds, popupContentSize, windowSize);
        }
        return m2905leftPositioningoFUgxo0(anchorBounds, popupContentSize);
    }
}
