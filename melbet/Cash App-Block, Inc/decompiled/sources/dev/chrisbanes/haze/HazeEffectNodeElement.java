package dev.chrisbanes.haze;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldev/chrisbanes/haze/HazeEffectNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ldev/chrisbanes/haze/HazeEffectNode;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HazeEffectNodeElement extends ModifierNodeElement {
    public final HazeState state;
    public final HazeStyle style;

    public HazeEffectNodeElement(HazeState hazeState, HazeStyle hazeStyle) {
        this.state = hazeState;
        this.style = hazeStyle;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new HazeEffectNode(this.state, this.style);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeEffectNodeElement)) {
            return false;
        }
        HazeEffectNodeElement hazeEffectNodeElement = (HazeEffectNodeElement) obj;
        return Intrinsics.areEqual(this.state, hazeEffectNodeElement.state) && this.style.equals(hazeEffectNodeElement.style);
    }

    public final int hashCode() {
        HazeState hazeState = this.state;
        return (this.style.hashCode() + ((hazeState == null ? 0 : hazeState.hashCode()) * 31)) * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "HazeEffect";
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.state + ", style=" + this.style + ", block=null)";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        HazeEffectNode hazeEffectNode = (HazeEffectNode) node;
        hazeEffectNode.getClass();
        hazeEffectNode.state = this.state;
        HazeStyle hazeStyle = hazeEffectNode.style;
        HazeStyle hazeStyle2 = this.style;
        if (!Intrinsics.areEqual(hazeStyle, hazeStyle2)) {
            hazeEffectNode.onStyleChanged(hazeEffectNode.style, hazeStyle2);
            hazeEffectNode.style = hazeStyle2;
        }
        hazeEffectNode.onObservedReadsChanged();
    }
}
