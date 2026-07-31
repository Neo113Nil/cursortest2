package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SemanticsOwner.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getUnmergedRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SemanticsOwner {
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        this.rootNode = rootNode;
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(this.rootNode);
        Intrinsics.checkNotNull(outerSemantics);
        return new SemanticsNode(outerSemantics, false);
    }
}
