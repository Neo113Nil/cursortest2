package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\t2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010%\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00107\u001a\u0002052\u0006\u00106\u001a\u0002058F@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R!\u0010>\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0011R\u0011\u0010G\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "doRemeasure-sdFAvZA", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/Constraints;)Z", "doRemeasure", "", "callOnLayoutCompletedListeners", "()V", "remeasureAndRelayoutIfNeeded", "(Landroidx/compose/ui/node/LayoutNode;)Z", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "forced", "requestRemeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "requestRelayout", "Lkotlin/Function0;", "onLayout", "measureAndLayout", "(Lkotlin/jvm/functions/Function0;)Z", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "forceMeasureTheSubtree", "forceDispatch", "dispatchOnPositionedCallbacks", "(Z)V", "node", "onNodeDetached", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "duringMeasureLayout", "Z", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "Landroidx/compose/runtime/collection/MutableVector;", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "measureIteration", "J", "getMeasureIteration", "()J", "", "postponedMeasureRequests", "Ljava/util/List;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "getCanAffectParent", "canAffectParent", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MeasureAndLayoutDelegate {
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final List postponedMeasureRequests;
    private final DepthSortedSet relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSet;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        ArrayList arrayList = new ArrayList();
        this.postponedMeasureRequests = arrayList;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSet, arrayList) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m2059updateRootConstraintsBRTryo0(long constraints) {
        Constraints constraints2 = this.rootConstraints;
        if (constraints2 == null ? false : Constraints.m2480equalsimpl0(constraints2.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.rootConstraints = Constraints.m2475boximpl(constraints);
        this.root.markMeasurePending$ui_release();
        this.relayoutNodes.add(this.root);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.postponedMeasureRequests.add(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.getMeasurePending() || forced) {
                    layoutNode.markMeasurePending$ui_release();
                    if ((layoutNode.getIsPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending())) {
                        this.relayoutNodes.add(layoutNode);
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState().ordinal()];
        if (i == 1 || i == 2) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if ((layoutNode.getMeasurePending() || layoutNode.getLayoutPending()) && !forced) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 == null) {
                return false;
            }
            layoutTreeConsistencyChecker2.assertConsistent();
            return false;
        }
        layoutNode.markLayoutPending$ui_release();
        if (layoutNode.getIsPlaced() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending()))) {
            this.relayoutNodes.add(layoutNode);
        }
        return !this.duringMeasureLayout;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m2057doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m2015remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m2015remeasure_Sx5XlM$ui_release$default = layoutNode.m2019remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m2015remeasure_Sx5XlM$ui_release$default = LayoutNode.m2015remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m2015remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m2015remeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m2058measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (Intrinsics.areEqual(layoutNode, this.root)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.remove(layoutNode);
                m2057doRemeasuresdFAvZA(layoutNode, Constraints.m2475boximpl(constraints));
                if (layoutNode.getLayoutPending() && layoutNode.getIsPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final boolean measureAndLayout(Function0 onLayout) {
        boolean z;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z2 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.isEmpty()) {
                    z = false;
                } else {
                    DepthSortedSet depthSortedSet = this.relayoutNodes;
                    z = false;
                    while (!depthSortedSet.isEmpty()) {
                        LayoutNode pop = depthSortedSet.pop();
                        boolean remeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(pop);
                        if (pop == this.root && remeasureAndRelayoutIfNeeded) {
                            z = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.mo4828invoke();
                    }
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z2 = z;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z2;
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onLayoutCompletedListeners.add(listener);
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((Owner.OnLayoutCompletedListener) content[i]).onLayoutComplete();
                i++;
            } while (i < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode) {
        boolean z;
        Constraints constraints;
        if (!layoutNode.getIsPlaced() && !getCanAffectParent(layoutNode) && !layoutNode.getAlignmentLines().getRequired$ui_release()) {
            return false;
        }
        if (layoutNode.getMeasurePending()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            z = m2057doRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            z = false;
        }
        if (layoutNode.getLayoutPending() && layoutNode.getIsPlaced()) {
            if (layoutNode == this.root) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.onPositionedDispatcher.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        if (!this.postponedMeasureRequests.isEmpty()) {
            List list = this.postponedMeasureRequests;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode2 = (LayoutNode) list.get(i);
                if (layoutNode2.isAttached()) {
                    requestRemeasure$default(this, layoutNode2, false, 2, null);
                }
            }
            this.postponedMeasureRequests.clear();
        }
        return z;
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.relayoutNodes.isEmpty()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.");
        }
        if (layoutNode.getMeasurePending()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MutableVector mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) content[i];
                if (layoutNode2.getMeasurePending() && this.relayoutNodes.remove(layoutNode2)) {
                    remeasureAndRelayoutIfNeeded(layoutNode2);
                }
                if (!layoutNode2.getMeasurePending()) {
                    forceMeasureTheSubtree(layoutNode2);
                }
                i++;
            } while (i < size);
        }
        if (layoutNode.getMeasurePending() && this.relayoutNodes.remove(layoutNode)) {
            remeasureAndRelayoutIfNeeded(layoutNode);
        }
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.relayoutNodes.remove(node);
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending() && (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getAlignmentLines().getRequired$ui_release());
    }
}
