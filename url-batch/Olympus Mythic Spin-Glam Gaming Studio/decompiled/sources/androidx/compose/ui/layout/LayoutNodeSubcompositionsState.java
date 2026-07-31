package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\\]B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J<\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010*J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J*\u00106\u001a\u0002052\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020300ø\u0001\u0000¢\u0006\u0004\b6\u00107J*\u00109\u001a\u0002082\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u000b¢\u0006\u0004\b;\u0010/J\r\u0010<\u001a\u00020\u000b¢\u0006\u0004\b<\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u0010Q\u001a\u00060PR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010S\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010NR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010KR\u0016\u0010X\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010KR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "node", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V", "Landroidx/compose/runtime/Composition;", "existing", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "composable", "subcomposeInto", "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "", "index", "getSlotIdAtIndex", "(I)Ljava/lang/Object;", "takeNodeFromReusables", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "createNodeAt", "(I)Landroidx/compose/ui/node/LayoutNode;", "from", "to", "count", "move", "(III)V", "", "Landroidx/compose/ui/layout/Measurable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "startIndex", "disposeOrReuseStartingFromIndex", "(I)V", "makeSureStateIsConsistent", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "disposeCurrentNodes", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "value", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "currentIndex", "I", "", "nodeToNodeState", "Ljava/util/Map;", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableCount", "precomposedCount", "", "NoIntrinsicsMessage", "Ljava/lang/String;", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LayoutNodeSubcompositionsState {
    private final String NoIntrinsicsMessage;
    private CompositionContext compositionContext;
    private int currentIndex;
    private final Map nodeToNodeState;
    private final Map precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet;
    private final LayoutNode root;
    private final Scope scope;
    private final Map slotIdToNode;
    private SubcomposeSlotReusePolicy slotReusePolicy;

    public LayoutNodeSubcompositionsState(LayoutNode root, SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.root = root;
        this.slotReusePolicy = slotReusePolicy;
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new Scope();
        this.precomposeMap = new LinkedHashMap();
        this.reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.slotReusePolicy != value) {
            this.slotReusePolicy = value;
            disposeOrReuseStartingFromIndex(0);
        }
    }

    public final List subcompose(Object slotId, Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState = this.root.getLayoutState();
        if (layoutState != LayoutNode.LayoutState.Measuring && layoutState != LayoutNode.LayoutState.LayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        Map map = this.slotIdToNode;
        Object obj = map.get(slotId);
        if (obj == null) {
            obj = (LayoutNode) this.precomposeMap.remove(slotId);
            if (obj != null) {
                int i = this.precomposedCount;
                if (i <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.precomposedCount = i - 1;
            } else {
                obj = takeNodeFromReusables(slotId);
                if (obj == null) {
                    obj = createNodeAt(this.currentIndex);
                }
            }
            map.put(slotId, obj);
        }
        LayoutNode layoutNode = (LayoutNode) obj;
        int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
        int i2 = this.currentIndex;
        if (indexOf < i2) {
            throw new IllegalArgumentException("Key " + slotId + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        if (i2 != indexOf) {
            move$default(this, indexOf, i2, 0, 4, null);
        }
        this.currentIndex++;
        subcompose(layoutNode, slotId, content);
        return layoutNode.getChildren$ui_release();
    }

    private final void subcompose(LayoutNode node, Object slotId, Function2 content) {
        Map map = this.nodeToNodeState;
        Object obj = map.get(node);
        if (obj == null) {
            obj = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m1934getLambda1$ui_release(), null, 4, null);
            map.put(node, obj);
        }
        NodeState nodeState = (NodeState) obj;
        Composition composition = nodeState.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState.getContent() != content || hasInvalidations || nodeState.getForceRecompose()) {
            nodeState.setContent(content);
            subcompose(node, nodeState);
            nodeState.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode node, final NodeState nodeState) {
        Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                final Function2 content = nodeState.getContent();
                Composition composition = nodeState.getComposition();
                CompositionContext compositionContext = this.compositionContext;
                if (compositionContext != null) {
                    nodeState.setComposition(subcomposeInto(composition, node, compositionContext, ComposableLambdaKt.composableLambdaInstance(-34810602, true, new Function2() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer, int i) {
                            if ((i & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            boolean active = LayoutNodeSubcompositionsState.NodeState.this.getActive();
                            Function2 function2 = content;
                            composer.startReusableGroup(207, Boolean.valueOf(active));
                            boolean changed = composer.changed(active);
                            if (active) {
                                function2.invoke(composer, 0);
                            } else {
                                composer.deactivateToEndGroup(changed);
                            }
                            composer.endReusableGroup();
                        }
                    })));
                    layoutNode.ignoreRemeasureRequests = false;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set");
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    private final Composition subcomposeInto(Composition existing, LayoutNode container, CompositionContext parent, Function2 composable) {
        if (existing == null || existing.isDisposed()) {
            existing = Wrapper_androidKt.createSubcomposition(container, parent);
        }
        existing.setContent(composable);
        return existing;
    }

    private final Object getSlotIdAtIndex(int index) {
        Object obj = this.nodeToNodeState.get((LayoutNode) this.root.getFoldedChildren$ui_release().get(index));
        Intrinsics.checkNotNull(obj);
        return ((NodeState) obj).getSlotId();
    }

    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i));
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            while (size >= startIndex) {
                LayoutNode layoutNode = (LayoutNode) this.root.getFoldedChildren$ui_release().get(size);
                Object obj = this.nodeToNodeState.get(layoutNode);
                Intrinsics.checkNotNull(obj);
                NodeState nodeState = (NodeState) obj;
                Object slotId = nodeState.getSlotId();
                if (this.reusableSlotIdsSet.contains(slotId)) {
                    layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    this.reusableCount++;
                    nodeState.setActive(false);
                } else {
                    LayoutNode layoutNode2 = this.root;
                    layoutNode2.ignoreRemeasureRequests = true;
                    this.nodeToNodeState.remove(layoutNode);
                    Composition composition = nodeState.getComposition();
                    if (composition != null) {
                        composition.dispose();
                    }
                    this.root.removeAt$ui_release(size, 1);
                    layoutNode2.ignoreRemeasureRequests = false;
                }
                this.slotIdToNode.remove(slotId);
                size--;
            }
        }
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        if (this.nodeToNodeState.size() != this.root.getFoldedChildren$ui_release().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + this.root.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((this.root.getFoldedChildren$ui_release().size() - this.reusableCount) - this.precomposedCount >= 0) {
            if (this.precomposeMap.size() == this.precomposedCount) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + this.root.getFoldedChildren$ui_release().size() + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
    }

    private final LayoutNode takeNodeFromReusables(Object slotId) {
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(getSlotIdAtIndex(i4), slotId)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object obj = this.nodeToNodeState.get((LayoutNode) this.root.getFoldedChildren$ui_release().get(i3));
                Intrinsics.checkNotNull(obj);
                NodeState nodeState = (NodeState) obj;
                if (this.slotReusePolicy.areCompatible(slotId, nodeState.getSlotId())) {
                    nodeState.setSlotId(slotId);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = (LayoutNode) this.root.getFoldedChildren$ui_release().get(i2);
        Object obj2 = this.nodeToNodeState.get(layoutNode);
        Intrinsics.checkNotNull(obj2);
        ((NodeState) obj2).setActive(true);
        Snapshot.INSTANCE.sendApplyNotifications();
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                LayoutNodeSubcompositionsState.Scope scope;
                LayoutNodeSubcompositionsState.Scope scope2;
                LayoutNodeSubcompositionsState.Scope scope3;
                LayoutNodeSubcompositionsState.Scope scope4;
                final int i;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                scope = LayoutNodeSubcompositionsState.this.scope;
                scope.setLayoutDirection(measure.getLayoutDirection());
                scope2 = LayoutNodeSubcompositionsState.this.scope;
                scope2.setDensity(measure.getDensity());
                scope3 = LayoutNodeSubcompositionsState.this.scope;
                scope3.setFontScale(measure.getFontScale());
                LayoutNodeSubcompositionsState.this.currentIndex = 0;
                Function2 function2 = block;
                scope4 = LayoutNodeSubcompositionsState.this.scope;
                final MeasureResult measureResult = (MeasureResult) function2.invoke(scope4, Constraints.m2475boximpl(j));
                i = LayoutNodeSubcompositionsState.this.currentIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return MeasureResult.this.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return MeasureResult.this.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map getAlignmentLines() {
                        return MeasureResult.this.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        int i2;
                        layoutNodeSubcompositionsState.currentIndex = i;
                        MeasureResult.this.placeChildren();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        i2 = layoutNodeSubcompositionsState2.currentIndex;
                        layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(i2);
                    }
                };
            }
        };
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(final Object slotId, Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(slotId)) {
            Map map = this.precomposeMap;
            Object obj = map.get(slotId);
            if (obj == null) {
                obj = takeNodeFromReusables(slotId);
                if (obj != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(obj), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    obj = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                map.put(slotId, obj);
            }
            subcompose((LayoutNode) obj, slotId, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                Map map2;
                int i;
                LayoutNode layoutNode;
                LayoutNode layoutNode2;
                int i2;
                int i3;
                int i4;
                LayoutNode layoutNode3;
                int i5;
                int i6;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                map2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode4 = (LayoutNode) map2.remove(slotId);
                if (layoutNode4 != null) {
                    i = LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (i > 0) {
                        layoutNode = LayoutNodeSubcompositionsState.this.root;
                        int indexOf = layoutNode.getFoldedChildren$ui_release().indexOf(layoutNode4);
                        layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                        int size = layoutNode2.getFoldedChildren$ui_release().size();
                        i2 = LayoutNodeSubcompositionsState.this.precomposedCount;
                        if (indexOf < size - i2) {
                            throw new IllegalStateException("Check failed.");
                        }
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                        i3 = layoutNodeSubcompositionsState.reusableCount;
                        layoutNodeSubcompositionsState.reusableCount = i3 + 1;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                        i4 = layoutNodeSubcompositionsState2.precomposedCount;
                        layoutNodeSubcompositionsState2.precomposedCount = i4 - 1;
                        layoutNode3 = LayoutNodeSubcompositionsState.this.root;
                        int size2 = layoutNode3.getFoldedChildren$ui_release().size();
                        i5 = LayoutNodeSubcompositionsState.this.precomposedCount;
                        int i7 = size2 - i5;
                        i6 = LayoutNodeSubcompositionsState.this.reusableCount;
                        int i8 = i7 - i6;
                        LayoutNodeSubcompositionsState.this.move(indexOf, i8, 1);
                        LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i8);
                        return;
                    }
                    throw new IllegalStateException("Check failed.");
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                Map map2;
                MutableVector mutableVector;
                map2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode = (LayoutNode) map2.get(slotId);
                if (layoutNode == null || (mutableVector = layoutNode.get_children$ui_release()) == null) {
                    return 0;
                }
                return mutableVector.getSize();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo1952premeasure0kLqBqw(int index, long constraints) {
                Map map2;
                LayoutNode layoutNode;
                map2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) map2.get(slotId);
                if (layoutNode2 == null || !layoutNode2.isAttached()) {
                    return;
                }
                int size = layoutNode2.get_children$ui_release().getSize();
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (!layoutNode2.getIsPlaced()) {
                    layoutNode = LayoutNodeSubcompositionsState.this.root;
                    layoutNode.ignoreRemeasureRequests = true;
                    LayoutNodeKt.requireOwner(layoutNode2).mo2075measureAndLayout0kLqBqw((LayoutNode) layoutNode2.get_children$ui_release().getContent()[index], constraints);
                    layoutNode.ignoreRemeasureRequests = false;
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
        };
    }

    public final void forceRecomposeChildren() {
        Iterator it = this.nodeToNodeState.entrySet().iterator();
        while (it.hasNext()) {
            ((NodeState) ((Map.Entry) it.next()).getValue()).setForceRecompose(true);
        }
        if (this.root.getMeasurePending()) {
            return;
        }
        LayoutNode.requestRemeasure$ui_release$default(this.root, false, 1, null);
    }

    private final LayoutNode createNodeAt(int index) {
        LayoutNode layoutNode = new LayoutNode(true);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int from, int to, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(from, to, count);
        layoutNode.ignoreRemeasureRequests = false;
    }

    public final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        Iterator it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            Composition composition = ((NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R'\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/Composition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composition;)V", "<set-?>", "", "active", "getActive", "()Z", "setActive", "(Z)V", "active$delegate", "Landroidx/compose/runtime/MutableState;", "getComposition", "()Landroidx/compose/runtime/Composition;", "setComposition", "(Landroidx/compose/runtime/Composition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "forceRecompose", "getForceRecompose", "setForceRecompose", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class NodeState {

        /* renamed from: active$delegate, reason: from kotlin metadata */
        private final MutableState active;
        private Composition composition;
        private Function2 content;
        private boolean forceRecompose;
        private Object slotId;

        public NodeState(Object obj, Function2 content, Composition composition) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.slotId = obj;
            this.content = content;
            this.composition = composition;
            this.active = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, Composition composition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : composition);
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public final Function2 getContent() {
            return this.content;
        }

        public final void setContent(Function2 function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.content = function2;
        }

        public final Composition getComposition() {
            return this.composition;
        }

        public final void setComposition(Composition composition) {
            this.composition = composition;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final boolean getActive() {
            return ((Boolean) this.active.getValue()).booleanValue();
        }

        public final void setActive(boolean z) {
            this.active.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        public void setDensity(float f) {
            this.density = f;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List subcompose(Object slotId, Function2 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return LayoutNodeSubcompositionsState.this.subcompose(slotId, content);
        }
    }
}
