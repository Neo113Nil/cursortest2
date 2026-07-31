package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import io.bidmachine.util.network.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsSort.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\u0016B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "Landroidx/compose/ui/node/LayoutNode;", "subtreeRoot", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "other", "", "compareTo", "(Landroidx/compose/ui/semantics/NodeLocationHolder;)I", "Landroidx/compose/ui/node/LayoutNode;", "getSubtreeRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getNode$ui_release", "Landroidx/compose/ui/geometry/Rect;", "location", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Companion", "ComparisonStrategy", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ComparisonStrategy comparisonStrategy = ComparisonStrategy.Stripe;
    private final LayoutDirection layoutDirection;
    private final Rect location;
    private final LayoutNode node;
    private final LayoutNode subtreeRoot;

    /* compiled from: SemanticsSort.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", NetworkUtils.HEADER_LOCATION, "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public NodeLocationHolder(LayoutNode subtreeRoot, LayoutNode node) {
        Intrinsics.checkNotNullParameter(subtreeRoot, "subtreeRoot");
        Intrinsics.checkNotNullParameter(node, "node");
        this.subtreeRoot = subtreeRoot;
        this.node = node;
        this.layoutDirection = subtreeRoot.getLayoutDirection();
        LayoutNodeWrapper innerLayoutNodeWrapper = subtreeRoot.getInnerLayoutNodeWrapper();
        LayoutNodeWrapper findWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(node);
        Rect rect = null;
        if (innerLayoutNodeWrapper.isAttached() && findWrapperToGetBounds.isAttached()) {
            rect = LayoutCoordinates.localBoundingBoxOf$default(innerLayoutNodeWrapper, findWrapperToGetBounds, false, 2, null);
        }
        this.location = rect;
    }

    /* renamed from: getNode$ui_release, reason: from getter */
    public final LayoutNode getNode() {
        return this.node;
    }

    /* compiled from: SemanticsSort.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "getComparisonStrategy$ui_release", "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "setComparisonStrategy$ui_release", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setComparisonStrategy$ui_release(ComparisonStrategy comparisonStrategy) {
            Intrinsics.checkNotNullParameter(comparisonStrategy, "<set-?>");
            NodeLocationHolder.comparisonStrategy = comparisonStrategy;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(NodeLocationHolder other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Rect rect = this.location;
        if (rect == null) {
            return 1;
        }
        if (other.location == null) {
            return -1;
        }
        if (comparisonStrategy == ComparisonStrategy.Stripe) {
            if (rect.getBottom() - other.location.getTop() <= 0.0f) {
                return -1;
            }
            if (this.location.getTop() - other.location.getBottom() >= 0.0f) {
                return 1;
            }
        }
        if (this.layoutDirection == LayoutDirection.Ltr) {
            float left = this.location.getLeft() - other.location.getLeft();
            if (left != 0.0f) {
                return left < 0.0f ? -1 : 1;
            }
        } else {
            float right = this.location.getRight() - other.location.getRight();
            if (right != 0.0f) {
                return right < 0.0f ? 1 : -1;
            }
        }
        float top = this.location.getTop() - other.location.getTop();
        if (top != 0.0f) {
            return top < 0.0f ? -1 : 1;
        }
        float height = this.location.getHeight() - other.location.getHeight();
        if (height != 0.0f) {
            return height < 0.0f ? 1 : -1;
        }
        float width = this.location.getWidth() - other.location.getWidth();
        if (width != 0.0f) {
            return width < 0.0f ? 1 : -1;
        }
        final Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(this.node));
        final Rect boundsInRoot2 = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(other.node));
        LayoutNode findNodeByPredicateTraversal = SemanticsSortKt.findNodeByPredicateTraversal(this.node, new Function1() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LayoutNodeWrapper findWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(it);
                return Boolean.valueOf(findWrapperToGetBounds.isAttached() && !Intrinsics.areEqual(Rect.this, LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds)));
            }
        });
        LayoutNode findNodeByPredicateTraversal2 = SemanticsSortKt.findNodeByPredicateTraversal(other.node, new Function1() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LayoutNodeWrapper findWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(it);
                return Boolean.valueOf(findWrapperToGetBounds.isAttached() && !Intrinsics.areEqual(Rect.this, LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds)));
            }
        });
        if (findNodeByPredicateTraversal == null || findNodeByPredicateTraversal2 == null) {
            return findNodeByPredicateTraversal != null ? 1 : -1;
        }
        return new NodeLocationHolder(this.subtreeRoot, findNodeByPredicateTraversal).compareTo(new NodeLocationHolder(other.subtreeRoot, findNodeByPredicateTraversal2));
    }
}
