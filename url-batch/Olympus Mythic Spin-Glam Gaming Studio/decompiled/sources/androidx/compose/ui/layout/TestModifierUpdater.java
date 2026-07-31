package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TestModifierUpdater.kt */
@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TestModifierUpdater {
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
    }
}
