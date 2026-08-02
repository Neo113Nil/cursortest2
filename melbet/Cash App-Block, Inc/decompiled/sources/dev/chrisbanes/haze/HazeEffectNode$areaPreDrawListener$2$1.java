package dev.chrisbanes.haze;

import androidx.compose.ui.node.DepthSortedSetKt;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class HazeEffectNode$areaPreDrawListener$2$1 implements FunctionAdapter {
    public final /* synthetic */ HazeEffectNode $tmp0;

    public HazeEffectNode$areaPreDrawListener$2$1(HazeEffectNode hazeEffectNode) {
        this.$tmp0 = hazeEffectNode;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof HazeEffectNode$areaPreDrawListener$2$1) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(0, 1, DepthSortedSetKt.class, this.$tmp0, "invalidateDraw", "invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
