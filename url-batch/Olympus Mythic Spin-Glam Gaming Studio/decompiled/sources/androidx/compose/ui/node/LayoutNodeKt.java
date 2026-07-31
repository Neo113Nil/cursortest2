package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LayoutNodeKt {
    public static final Owner requireOwner(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
