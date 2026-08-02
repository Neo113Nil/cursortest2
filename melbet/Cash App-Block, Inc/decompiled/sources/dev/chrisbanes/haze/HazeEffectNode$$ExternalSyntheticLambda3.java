package dev.chrisbanes.haze;

import androidx.compose.runtime.snapshots.StateSetIterator;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class HazeEffectNode$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ HazeSourceNode f$1;

    public /* synthetic */ HazeEffectNode$$ExternalSyntheticLambda3(HazeEffectNode hazeEffectNode, HazeSourceNode hazeSourceNode) {
        this.f$1 = hazeSourceNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        HazeSourceNode hazeSourceNode = this.f$1;
        switch (i) {
            case 0:
                HazeArea hazeArea = (HazeArea) obj;
                hazeArea.getClass();
                return Boolean.valueOf(hazeSourceNode == null || hazeArea.zIndex$delegate.getFloatValue() < RecyclerView.DECELERATION_RATE);
            default:
                ((Long) obj).getClass();
                Iterator it = hazeSourceNode.area.preDrawListeners.iterator();
                while (true) {
                    StateSetIterator stateSetIterator = (StateSetIterator) it;
                    if (!stateSetIterator.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    DepthSortedSetKt.invalidateDraw(((HazeEffectNode$areaPreDrawListener$2$1) stateSetIterator.next()).$tmp0);
                }
        }
    }

    public /* synthetic */ HazeEffectNode$$ExternalSyntheticLambda3(HazeSourceNode hazeSourceNode) {
        this.f$1 = hazeSourceNode;
    }
}
