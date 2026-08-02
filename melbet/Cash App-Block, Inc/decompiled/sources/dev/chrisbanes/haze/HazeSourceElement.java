package dev.chrisbanes.haze;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.io.LinesSequence;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldev/chrisbanes/haze/HazeSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ldev/chrisbanes/haze/HazeSourceNode;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HazeSourceElement extends ModifierNodeElement {
    public final HazeState state;

    public HazeSourceElement(HazeState hazeState) {
        this.state = hazeState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new HazeSourceNode(this.state);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HazeSourceElement) && this.state == ((HazeSourceElement) obj).state && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0;
    }

    public final int hashCode() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, this.state.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "hazeSource";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(Float.valueOf(RecyclerView.DECELERATION_RATE), "zIndex");
        linesSequence.set(null, "key");
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.state + ", zIndex=0.0, key=null)";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        HazeSourceNode hazeSourceNode = (HazeSourceNode) node;
        hazeSourceNode.getClass();
        SnapshotStateList snapshotStateList = hazeSourceNode.state._areas;
        HazeArea hazeArea = hazeSourceNode.area;
        boolean contains = snapshotStateList.contains(hazeArea);
        if (contains) {
            HazeState hazeState = hazeSourceNode.state;
            hazeState.getClass();
            hazeArea.getClass();
            hazeState._areas.remove(hazeArea);
        }
        HazeState hazeState2 = this.state;
        hazeSourceNode.state = hazeState2;
        if (contains) {
            hazeArea.getClass();
            hazeState2._areas.add(hazeArea);
        }
        hazeArea.zIndex$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
    }
}
