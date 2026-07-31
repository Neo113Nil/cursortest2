package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.semantics.NodeLocationHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SemanticsSort.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0001H\u0000¨\u0006\f"}, d2 = {"findNodeByPredicateTraversal", "Landroidx/compose/ui/node/LayoutNode;", "predicate", "Lkotlin/Function1;", "", "findOneLayerOfSemanticsWrappersSortedByBounds", "", "Landroidx/compose/ui/semantics/SemanticsEntity;", "list", "", "findWrapperToGetBounds", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SemanticsSortKt {
    public static /* synthetic */ List findOneLayerOfSemanticsWrappersSortedByBounds$default(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode, list);
    }

    private static final List findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(List list) {
        try {
            NodeLocationHolder.INSTANCE.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Stripe);
            List mutableList = CollectionsKt.toMutableList((Collection) list);
            CollectionsKt.sort(mutableList);
            return mutableList;
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.INSTANCE.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Location);
            List mutableList2 = CollectionsKt.toMutableList((Collection) list);
            CollectionsKt.sort(mutableList2);
            return mutableList2;
        }
    }

    public static final List findOneLayerOfSemanticsWrappersSortedByBounds(LayoutNode layoutNode, List list) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        if (!layoutNode.isAttached()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            if (layoutNode2.isAttached()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        List findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy = findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(arrayList);
        ArrayList arrayList2 = new ArrayList(findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size());
        int size2 = findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(((NodeLocationHolder) findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.get(i2)).getNode());
        }
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i3);
            SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode3);
            if (outerSemantics != null) {
                list.add(outerSemantics);
            } else {
                findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode3, list);
            }
        }
        return list;
    }

    public static final LayoutNode findNodeByPredicateTraversal(LayoutNode layoutNode, Function1 predicate) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (((Boolean) predicate.invoke(layoutNode)).booleanValue()) {
            return layoutNode;
        }
        List children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode findNodeByPredicateTraversal = findNodeByPredicateTraversal((LayoutNode) children$ui_release.get(i), predicate);
            if (findNodeByPredicateTraversal != null) {
                return findNodeByPredicateTraversal;
            }
        }
        return null;
    }

    public static final LayoutNodeWrapper findWrapperToGetBounds(LayoutNode layoutNode) {
        LayoutNodeWrapper layoutNodeWrapper;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        SemanticsEntity outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
        }
        return (outerMergingSemantics == null || (layoutNodeWrapper = outerMergingSemantics.getLayoutNodeWrapper()) == null) ? layoutNode.getInnerLayoutNodeWrapper() : layoutNodeWrapper;
    }
}
