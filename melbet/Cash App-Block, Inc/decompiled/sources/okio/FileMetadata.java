package okio;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.OuterPlacementScope;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadAlignmentLines;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKindKt;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView$localeList$2;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FileMetadata {
    public final /* synthetic */ int $r8$classId;
    public final Object createdAtMillis;
    public Object extras;
    public boolean isDirectory;
    public boolean isRegularFile;
    public final Object lastAccessedAtMillis;
    public final Object lastModifiedAtMillis;
    public final Object size;
    public final Object symlinkTarget;

    public FileMetadata(LayoutNode layoutNode) {
        this.$r8$classId = 1;
        this.symlinkTarget = layoutNode;
        this.size = new GrpcMethod(8, false);
        this.createdAtMillis = new WorkLauncherImpl(12);
        this.lastModifiedAtMillis = new MutableVector(0, new LayoutNode[16]);
        this.lastAccessedAtMillis = new MutableVector(0, new MeasureAndLayoutDelegate$PostponedRequest[16]);
    }

    public static final boolean access$remeasureAndRelayoutIfNeeded(FileMetadata fileMetadata, LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        OuterPlacementScope outerPlacementScope;
        InnerNodeCoordinator innerNodeCoordinator;
        LayoutNode parent$ui;
        LayoutNode layoutNode2 = (LayoutNode) fileMetadata.symlinkTarget;
        boolean z2 = layoutNode.isDeactivated;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        boolean z3 = false;
        z3 = false;
        if (!z2 && isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == layoutNode2) {
                constraints = (Constraints) fileMetadata.extras;
                constraints.getClass();
            } else {
                constraints = null;
            }
            if (z) {
                z3 = layoutNodeLayoutDelegate.lookaheadMeasurePending ? m4342doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
                if ((z3 || layoutNodeLayoutDelegate.lookaheadLayoutPending) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                    layoutNode.lookaheadReplace$ui();
                }
            } else {
                boolean m4343doRemeasuresdFAvZA = layoutNode.getMeasurePending$ui() ? m4343doRemeasuresdFAvZA(layoutNode, constraints) : false;
                if (layoutNode.getLayoutPending$ui() && (layoutNode == layoutNode2 || ((parent$ui = layoutNode.getParent$ui()) != null && parent$ui.isPlaced() && layoutNodeLayoutDelegate.measurePassDelegate.isPlacedByParent))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.clearSubtreePlacementIntrinsicsUsage();
                        }
                        LayoutNode parent$ui2 = layoutNode.getParent$ui();
                        if (parent$ui2 == null || (innerNodeCoordinator = (InnerNodeCoordinator) parent$ui2.nodes.innerCoordinator) == null || (outerPlacementScope = innerNodeCoordinator.placementScope) == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode);
                            int i = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, z3 ? 1 : 0);
                        }
                        outerPlacementScope.placeRelative(layoutNodeLayoutDelegate.measurePassDelegate, 0, 0, RecyclerView.DECELERATION_RATE);
                    } else {
                        layoutNode.replace$ui();
                    }
                    WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) fileMetadata.createdAtMillis;
                    workLauncherImpl.getClass();
                    if (layoutNode.globallyPositionedObservers > 0) {
                        ((MutableVector) workLauncherImpl.processor).add(layoutNode);
                        layoutNode.needsOnGloballyPositionedDispatch = true;
                    }
                }
                z3 = m4343doRemeasuresdFAvZA;
            }
            fileMetadata.drainPostponedMeasureRequests();
        }
        return z3;
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    public static boolean m4342doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m884remeasureBRTryo0;
        LayoutNode layoutNode2 = layoutNode.lookaheadRoot;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        if (layoutNode2 == null) {
            return false;
        }
        if (constraints != null) {
            if (layoutNode2 != null) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate.getClass();
                m884remeasureBRTryo0 = lookaheadPassDelegate.m884remeasureBRTryo0(constraints.value);
            }
            m884remeasureBRTryo0 = false;
        } else {
            LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            Constraints constraints2 = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.lookaheadConstraints : null;
            if (constraints2 != null && layoutNode2 != null) {
                lookaheadPassDelegate2.getClass();
                m884remeasureBRTryo0 = lookaheadPassDelegate2.m884remeasureBRTryo0(constraints2.value);
            }
            m884remeasureBRTryo0 = false;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (m884remeasureBRTryo0 && parent$ui != null) {
            if (parent$ui.lookaheadRoot == null) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, 3);
                return m884remeasureBRTryo0;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui, false, 3);
                return m884remeasureBRTryo0;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                parent$ui.requestLookaheadRelayout$ui(false);
            }
        }
        return m884remeasureBRTryo0;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    public static boolean m4343doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean z;
        if (constraints != null) {
            if (layoutNode.intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui();
            }
            z = layoutNode.layoutDelegate.measurePassDelegate.m887remeasureBRTryo0(constraints.value);
        } else {
            MeasurePassDelegate measurePassDelegate = layoutNode.layoutDelegate.measurePassDelegate;
            Constraints constraints2 = measurePassDelegate.measuredOnce ? new Constraints(measurePassDelegate.measurementConstraints) : null;
            if (constraints2 != null) {
                if (layoutNode.intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui();
                }
                z = layoutNode.layoutDelegate.measurePassDelegate.m887remeasureBRTryo0(constraints2.value);
            } else {
                z = false;
            }
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (z && parent$ui != null) {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, 3);
                return z;
            }
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                parent$ui.requestRelayout$ui(false);
            }
        }
        return z;
    }

    public static boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        if (layoutNode.layoutDelegate.lookaheadMeasurePending) {
            return (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.NotUsed && ((lookaheadPassDelegate = layoutNode.layoutDelegate.lookaheadPassDelegate) == null || (lookaheadAlignmentLines = lookaheadPassDelegate.alignmentLines) == null || !lookaheadAlignmentLines.getRequired$ui())) ? false : true;
        }
        return false;
    }

    public static boolean getCanAffectPlacedParent(LayoutNode layoutNode) {
        if (!layoutNode.getMeasurePending$ui()) {
            return false;
        }
        do {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.NotUsed && !layoutNode.layoutDelegate.measurePassDelegate.alignmentLines.getRequired$ui()) {
                LayoutNode parent$ui = layoutNode.getParent$ui();
                if ((parent$ui != null ? parent$ui.layoutDelegate.layoutState : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.isPlaced());
        return true;
    }

    public static boolean isUsedInMeasureOrLayout(LayoutNode layoutNode) {
        LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        return layoutNode.isPlaced() || layoutNodeLayoutDelegate.measurePassDelegate.isPlacedByParent || getCanAffectPlacedParent(layoutNode) || Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode) || layoutNodeLayoutDelegate.measurePassDelegate.alignmentLines.getRequired$ui() || !((lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate) == null || (lookaheadAlignmentLines = lookaheadPassDelegate.alignmentLines) == null || !lookaheadAlignmentLines.getRequired$ui());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void callOnLayoutCompletedListeners() {
        int i;
        Modifier.Node parent$ui;
        MutableVector mutableVector = (MutableVector) this.lastModifiedAtMillis;
        Object[] objArr = mutableVector.content;
        int i2 = mutableVector.size;
        for (0; i < i2; i + 1) {
            NodeChain nodeChain = ((LayoutNode) objArr[i]).nodes;
            InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) nodeChain.innerCoordinator;
            if (NodeKindKt.m907getIncludeSelfInTraversalH91voCI(4194304)) {
                parent$ui = innerNodeCoordinator.tail;
            } else {
                parent$ui = innerNodeCoordinator.tail.getParent$ui();
                i = parent$ui == null ? i + 1 : 0;
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
            for (Modifier.Node headNode = innerNodeCoordinator.headNode(r7); headNode != null && (headNode.getAggregateChildKindSet$ui() & 4194304) != 0; headNode = headNode.getChild$ui()) {
                if ((headNode.getKindSet$ui() & 4194304) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    ?? r10 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).onPlaced((InnerNodeCoordinator) nodeChain.innerCoordinator);
                        } else if ((delegatingNode.getKindSet$ui() & 4194304) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node = delegatingNode.delegate;
                            int i3 = 0;
                            delegatingNode = delegatingNode;
                            r10 = r10;
                            while (node != null) {
                                if ((node.getKindSet$ui() & 4194304) != 0) {
                                    i3++;
                                    r10 = r10;
                                    if (i3 == 1) {
                                        delegatingNode = node;
                                    } else {
                                        if (r10 == 0) {
                                            r10 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r10.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r10.add(node);
                                    }
                                }
                                node = node.getChild$ui();
                                delegatingNode = delegatingNode;
                                r10 = r10;
                            }
                            if (i3 == 1) {
                            }
                        }
                        delegatingNode = DepthSortedSetKt.access$pop(r10);
                    }
                }
                if (headNode != parent$ui) {
                }
            }
        }
        mutableVector.clear();
    }

    public void dispatchOnPositionedCallbacks(boolean z) {
        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.createdAtMillis;
        if (z) {
            LayoutNode layoutNode = (LayoutNode) this.symlinkTarget;
            MutableVector mutableVector = (MutableVector) workLauncherImpl.processor;
            if (layoutNode.globallyPositionedObservers > 0) {
                mutableVector.clear();
                mutableVector.add(layoutNode);
                layoutNode.needsOnGloballyPositionedDispatch = true;
            }
        }
        if (((MutableVector) workLauncherImpl.processor).size != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                workLauncherImpl.dispatch();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void drainPostponedMeasureRequests() {
        MutableVector mutableVector = (MutableVector) this.lastAccessedAtMillis;
        int i = mutableVector.size;
        if (i != 0) {
            Object[] objArr = mutableVector.content;
            for (int i2 = 0; i2 < i; i2++) {
                MeasureAndLayoutDelegate$PostponedRequest measureAndLayoutDelegate$PostponedRequest = (MeasureAndLayoutDelegate$PostponedRequest) objArr[i2];
                if (measureAndLayoutDelegate$PostponedRequest.node.isAttached()) {
                    boolean z = measureAndLayoutDelegate$PostponedRequest.isLookahead;
                    LayoutNode layoutNode = measureAndLayoutDelegate$PostponedRequest.node;
                    boolean z2 = measureAndLayoutDelegate$PostponedRequest.isForced;
                    if (z) {
                        LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, z2, 2);
                    } else {
                        LayoutNode.requestRemeasure$ui$default(layoutNode, z2, 2);
                    }
                }
            }
            mutableVector.clear();
        }
    }

    public void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (Intrinsics.areEqual(layoutNode2.isPlacedInLookahead(), Boolean.TRUE) && !layoutNode2.isDeactivated) {
                if (((GrpcMethod) this.size).contains(layoutNode2)) {
                    layoutNode2.lookaheadReplace$ui();
                }
                ensureSubtreeLookaheadReplaced(layoutNode2);
            }
        }
    }

    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        if (!this.isRegularFile) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.layoutDelegate.lookaheadMeasurePending : layoutNode.getMeasurePending$ui()) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z);
    }

    public void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z) {
        LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if ((!z && (layoutNode2.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.layoutDelegate.measurePassDelegate.alignmentLines.getRequired$ui())) || (z && (layoutNode2.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock || ((lookaheadPassDelegate = layoutNode2.layoutDelegate.lookaheadPassDelegate) != null && (lookaheadAlignmentLines = lookaheadPassDelegate.alignmentLines) != null && lookaheadAlignmentLines.getRequired$ui())))) {
                boolean isOutMostLookaheadRoot = DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode2);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.layoutDelegate;
                if (isOutMostLookaheadRoot && !z) {
                    if (layoutNodeLayoutDelegate.lookaheadMeasurePending && ((GrpcMethod) this.size).contains(layoutNode2)) {
                        remeasureIfNeeded(layoutNode2, true);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                if (z ? layoutNodeLayoutDelegate.lookaheadMeasurePending : layoutNode2.getMeasurePending$ui()) {
                    remeasureIfNeeded(layoutNode2, z);
                }
                if (!(z ? layoutNodeLayoutDelegate.lookaheadMeasurePending : layoutNode2.getMeasurePending$ui())) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.layoutDelegate.lookaheadMeasurePending : layoutNode.getMeasurePending$ui()) {
            remeasureIfNeeded(layoutNode, z);
        }
    }

    public boolean measureAndLayout(AndroidComposeView$localeList$2 androidComposeView$localeList$2) {
        boolean z;
        boolean z2;
        LayoutNode layoutNode;
        boolean z3;
        boolean remeasureIfNeeded;
        GrpcMethod grpcMethod = (GrpcMethod) this.size;
        LayoutNode layoutNode2 = (LayoutNode) this.symlinkTarget;
        if (!layoutNode2.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.isRegularFile) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((Constraints) this.extras) != null) {
            this.isRegularFile = true;
            this.isDirectory = true;
            try {
                boolean isNotEmpty = grpcMethod.isNotEmpty();
                MemoryCacheService memoryCacheService = (MemoryCacheService) grpcMethod.path;
                if (isNotEmpty) {
                    z = false;
                    while (true) {
                        MemoryCacheService memoryCacheService2 = (MemoryCacheService) grpcMethod.responseAdapter;
                        MemoryCacheService memoryCacheService3 = (MemoryCacheService) grpcMethod.requestAdapter;
                        if (!((SortedSet) memoryCacheService.imageLoader).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) memoryCacheService.imageLoader).first();
                            memoryCacheService.remove(layoutNode);
                            z3 = layoutNode.lookaheadRoot != null;
                            z2 = false;
                        } else if (!((SortedSet) memoryCacheService3.imageLoader).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) memoryCacheService3.imageLoader).first();
                            memoryCacheService3.remove(layoutNode);
                            z3 = layoutNode.lookaheadRoot != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) memoryCacheService2.imageLoader).isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) ((SortedSet) memoryCacheService2.imageLoader).first();
                            memoryCacheService2.remove(layoutNode3);
                            z2 = true;
                            layoutNode = layoutNode3;
                            z3 = false;
                        }
                        if (z2) {
                            remeasureIfNeeded = access$remeasureAndRelayoutIfNeeded(this, layoutNode, z3);
                        } else {
                            remeasureIfNeeded = remeasureIfNeeded(layoutNode, z3);
                            if (layoutNode.layoutDelegate.lookaheadLayoutPending) {
                                grpcMethod.add(layoutNode, Invalidation.LookaheadPlacement);
                            }
                            if (layoutNode.getLayoutPending$ui()) {
                                grpcMethod.add(layoutNode, Invalidation.Placement);
                            }
                        }
                        if (layoutNode == layoutNode2 && remeasureIfNeeded) {
                            z = true;
                        }
                    }
                    if (androidComposeView$localeList$2 != null) {
                        androidComposeView$localeList$2.invoke();
                    }
                } else {
                    z = false;
                }
                this.isRegularFile = false;
                this.isDirectory = false;
                z4 = z;
            } finally {
            }
        }
        callOnLayoutCompletedListeners();
        return z4;
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public void m4344measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        LayoutNode layoutNode2 = (LayoutNode) this.symlinkTarget;
        if (layoutNode.isDeactivated) {
            return;
        }
        if (layoutNode == layoutNode2) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!layoutNode2.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.isRegularFile) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (((Constraints) this.extras) != null) {
            this.isRegularFile = true;
            this.isDirectory = false;
            try {
                GrpcMethod grpcMethod = (GrpcMethod) this.size;
                ((MemoryCacheService) grpcMethod.path).remove(layoutNode);
                ((MemoryCacheService) grpcMethod.requestAdapter).remove(layoutNode);
                ((MemoryCacheService) grpcMethod.responseAdapter).remove(layoutNode);
                if ((m4342doLookaheadRemeasuresdFAvZA(layoutNode, new Constraints(j)) || layoutNode.layoutDelegate.lookaheadLayoutPending) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                    layoutNode.lookaheadReplace$ui();
                }
                ensureSubtreeLookaheadReplaced(layoutNode);
                m4343doRemeasuresdFAvZA(layoutNode, new Constraints(j));
                if (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui();
                    WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.createdAtMillis;
                    workLauncherImpl.getClass();
                    if (layoutNode.globallyPositionedObservers > 0) {
                        ((MutableVector) workLauncherImpl.processor).add(layoutNode);
                        layoutNode.needsOnGloballyPositionedDispatch = true;
                    }
                }
                drainPostponedMeasureRequests();
            } finally {
            }
        }
        callOnLayoutCompletedListeners();
    }

    public void measureOnly() {
        LayoutNode layoutNode = (LayoutNode) this.symlinkTarget;
        GrpcMethod grpcMethod = (GrpcMethod) this.size;
        if (grpcMethod.isNotEmpty()) {
            if (!layoutNode.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.isRegularFile) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (((Constraints) this.extras) != null) {
                this.isRegularFile = true;
                this.isDirectory = false;
                try {
                    if ((((SortedSet) ((MemoryCacheService) grpcMethod.responseAdapter).imageLoader).isEmpty() || ((SortedSet) ((MemoryCacheService) grpcMethod.path).imageLoader).isEmpty()) ? false : true) {
                        if (layoutNode.lookaheadRoot != null) {
                            remeasureOnly(layoutNode, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(layoutNode);
                        }
                    }
                    remeasureOnly(layoutNode, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.isRegularFile = false;
                        this.isDirectory = false;
                    }
                }
            }
        }
    }

    public boolean remeasureIfNeeded(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        boolean z2 = false;
        if (!layoutNode.isDeactivated && isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == ((LayoutNode) this.symlinkTarget)) {
                constraints = (Constraints) this.extras;
                constraints.getClass();
            } else {
                constraints = null;
            }
            if (z) {
                if (layoutNode.layoutDelegate.lookaheadMeasurePending) {
                    z2 = m4342doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                }
            } else if (layoutNode.getMeasurePending$ui()) {
                z2 = m4343doRemeasuresdFAvZA(layoutNode, constraints);
            }
            drainPostponedMeasureRequests();
        }
        return z2;
    }

    public void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.layoutDelegate.measurePassDelegate.alignmentLines.getRequired$ui()) {
                if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode2)) {
                    remeasureOnly(layoutNode2, true);
                } else {
                    remeasureLookaheadRootsInSubtree(layoutNode2);
                }
            }
        }
    }

    public void remeasureOnly(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        if (layoutNode.isDeactivated) {
            return;
        }
        if (layoutNode == ((LayoutNode) this.symlinkTarget)) {
            constraints = (Constraints) this.extras;
            constraints.getClass();
        } else {
            constraints = null;
        }
        if (z) {
            m4342doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m4343doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        int ordinal = layoutNode.layoutDelegate.layoutState.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                ((MutableVector) this.lastAccessedAtMillis).add(new MeasureAndLayoutDelegate$PostponedRequest(layoutNode, false, z));
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
                if (!layoutNode.getMeasurePending$ui() || z) {
                    layoutNode.layoutDelegate.measurePassDelegate.measurePending = true;
                    if (!layoutNode.isDeactivated && (layoutNode.isPlaced() || getCanAffectPlacedParent(layoutNode))) {
                        LayoutNode parent$ui = layoutNode.getParent$ui();
                        if (parent$ui == null || !parent$ui.getMeasurePending$ui()) {
                            ((GrpcMethod) this.size).add(layoutNode, Invalidation.Measurement);
                        }
                        if (!this.isDirectory) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                Map map = (Map) this.extras;
                Long l = (Long) this.lastAccessedAtMillis;
                Long l2 = (Long) this.lastModifiedAtMillis;
                Long l3 = (Long) this.createdAtMillis;
                Long l4 = (Long) this.size;
                ArrayList arrayList = new ArrayList();
                if (this.isRegularFile) {
                    arrayList.add("isRegularFile");
                }
                if (this.isDirectory) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("extras=", map, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56);
            default:
                return super.toString();
        }
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public void m4345updateRootConstraintsBRTryo0(long j) {
        LayoutNode layoutNode = (LayoutNode) this.symlinkTarget;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        Constraints constraints = (Constraints) this.extras;
        if (constraints == null ? false : Constraints.m1019equalsimpl0(constraints.value, j)) {
            return;
        }
        if (this.isRegularFile) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.extras = new Constraints(j);
        LayoutNode layoutNode2 = layoutNode.lookaheadRoot;
        if (layoutNode2 != null) {
            layoutNodeLayoutDelegate.lookaheadMeasurePending = true;
        }
        layoutNodeLayoutDelegate.measurePassDelegate.measurePending = true;
        ((GrpcMethod) this.size).add(layoutNode, layoutNode2 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, int i) {
        this(z, z2, path, l, l2, l3, l4, r10);
        this.$r8$classId = 0;
        path = (i & 4) != 0 ? null : path;
        l = (i & 8) != 0 ? null : l;
        l2 = (i & 16) != 0 ? null : l2;
        l3 = (i & 32) != 0 ? null : l3;
        l4 = (i & 64) != 0 ? null : l4;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }

    public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map) {
        this.$r8$classId = 0;
        map.getClass();
        this.isRegularFile = z;
        this.isDirectory = z2;
        this.symlinkTarget = path;
        this.size = l;
        this.createdAtMillis = l2;
        this.lastModifiedAtMillis = l3;
        this.lastAccessedAtMillis = l4;
        this.extras = MapsKt__MapsKt.toMap(map);
    }
}
