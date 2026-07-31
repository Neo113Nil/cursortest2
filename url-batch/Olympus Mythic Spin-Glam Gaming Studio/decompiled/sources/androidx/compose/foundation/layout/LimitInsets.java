package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "sides", "I", "getSides-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m386getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m386getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m385getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m386getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m386getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m378hasAnybkgdKaI$foundation_layout_release(this.sides, m386getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m378hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.INSTANCE.m394getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m388getAllowRightInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m388getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m387getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m388getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m388getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m378hasAnybkgdKaI$foundation_layout_release(this.sides, m388getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m378hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.INSTANCE.m389getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) other;
        return Intrinsics.areEqual(this.insets, limitInsets.insets) && WindowInsetsSides.m377equalsimpl0(this.sides, limitInsets.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m379hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m381toStringimpl(this.sides)) + ')';
    }
}
