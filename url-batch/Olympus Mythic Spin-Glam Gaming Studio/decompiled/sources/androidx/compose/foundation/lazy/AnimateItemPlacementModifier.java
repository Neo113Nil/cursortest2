package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\u00020\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/AnimateItemPlacementModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AnimateItemPlacementModifier extends InspectorValueInfo implements ParentDataModifier {
    private final FiniteAnimationSpec animationSpec;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this.animationSpec;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AnimateItemPlacementModifier) {
            return !Intrinsics.areEqual(this.animationSpec, ((AnimateItemPlacementModifier) other).animationSpec);
        }
        return false;
    }

    public int hashCode() {
        return this.animationSpec.hashCode();
    }
}
