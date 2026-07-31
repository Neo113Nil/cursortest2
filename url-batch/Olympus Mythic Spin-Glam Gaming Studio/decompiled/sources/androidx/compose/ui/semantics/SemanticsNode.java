package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsNode.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010!\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010'\u001a\u00020$H\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-\"\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010-R\u0011\u0010F\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010N\u001a\u00020K8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bO\u0010IR\u001a\u0010S\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010MR\u0011\u0010U\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bT\u00107R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0013\u0010]\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/semantics/SemanticsEntity;", "outerSemanticsEntity", "", "mergingEnabled", "<init>", "(Landroidx/compose/ui/semantics/SemanticsEntity;Z)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedConfig", "", "mergeConfig", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "sortByBounds", "includeReplacedSemantics", "includeFakeNodes", "", "getChildren", "(ZZZ)Ljava/util/List;", "", "list", "findOneLayerOfMergingSemanticsNodes", "(Ljava/util/List;Z)Ljava/util/List;", "unmergedChildren", "emitFakeNodes", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "properties", "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "unmergedChildren$ui_release", "(ZZ)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds", "Landroidx/compose/ui/semantics/SemanticsEntity;", "getOuterSemanticsEntity$ui_release", "()Landroidx/compose/ui/semantics/SemanticsEntity;", "Z", "getMergingEnabled", "()Z", "isFake", "isFake$ui_release", "setFake$ui_release", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "id", "I", "getId", "()I", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "isMergingSemanticsOfDescendants", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getConfig", "config", "getReplacedChildren$ui_release", "()Ljava/util/List;", "replacedChildren", "getReplacedChildrenSortedByBounds$ui_release", "replacedChildrenSortedByBounds", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SemanticsNode {
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final SemanticsEntity outerSemanticsEntity;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(SemanticsEntity outerSemanticsEntity, boolean z) {
        Intrinsics.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
        this.outerSemanticsEntity = outerSemanticsEntity;
        this.mergingEnabled = z;
        this.unmergedConfig = outerSemanticsEntity.collapsedSemanticsConfiguration();
        this.id = ((SemanticsModifier) outerSemanticsEntity.getModifier()).getId();
        this.layoutNode = outerSemanticsEntity.getLayoutNode();
    }

    /* renamed from: getOuterSemanticsEntity$ui_release, reason: from getter */
    public final SemanticsEntity getOuterSemanticsEntity() {
        return this.outerSemanticsEntity;
    }

    /* renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    /* renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    /* renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final Rect getTouchBoundsInRoot() {
        SemanticsEntity semanticsEntity;
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            semanticsEntity = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (semanticsEntity == null) {
                semanticsEntity = this.outerSemanticsEntity;
            }
        } else {
            semanticsEntity = this.outerSemanticsEntity;
        }
        return semanticsEntity.touchBoundsInRoot();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m2172getSizeYbymL2g() {
        return findWrapperToGetBounds$ui_release().mo1946getSizeYbymL2g();
    }

    public final Rect getBoundsInRoot() {
        return !this.layoutNode.isAttached() ? Rect.INSTANCE.getZero() : LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds$ui_release());
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m2171getPositionInRootF1C5BW0() {
        return !this.layoutNode.isAttached() ? Offset.INSTANCE.m1308getZeroF1C5BW0() : LayoutCoordinatesKt.positionInRoot(findWrapperToGetBounds$ui_release());
    }

    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    private final void mergeConfig(SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                mergedConfig.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(mergedConfig);
            }
        }
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z, z2);
    }

    public final List unmergedChildren$ui_release(boolean sortByBounds, boolean includeFakeNodes) {
        List findOneLayerOfSemanticsWrappers$default;
        if (this.isFake) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (sortByBounds) {
            findOneLayerOfSemanticsWrappers$default = SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$default(this.layoutNode, null, 1, null);
        } else {
            findOneLayerOfSemanticsWrappers$default = SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        }
        int size = findOneLayerOfSemanticsWrappers$default.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((SemanticsEntity) findOneLayerOfSemanticsWrappers$default.get(i), this.mergingEnabled));
        }
        if (includeFakeNodes) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    public final List getReplacedChildren$ui_release() {
        return getChildren(false, false, true);
    }

    public final List getReplacedChildrenSortedByBounds$ui_release() {
        return getChildren(true, false, true);
    }

    private final List getChildren(boolean sortByBounds, boolean includeReplacedSemantics, boolean includeFakeNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return CollectionsKt.emptyList();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, sortByBounds, 1, null);
        }
        return unmergedChildren$ui_release(sortByBounds, includeFakeNodes);
    }

    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode findClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode it) {
                SemanticsConfiguration collapsedSemanticsConfiguration;
                Intrinsics.checkNotNullParameter(it, "it");
                SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(it);
                boolean z = false;
                if (outerSemantics != null && (collapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && collapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) : null;
        if (findClosestParentNode == null) {
            findClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(it) != null);
                }
            });
        }
        SemanticsEntity outerSemantics = findClosestParentNode != null ? SemanticsNodeKt.getOuterSemantics(findClosestParentNode) : null;
        if (outerSemantics == null) {
            return null;
        }
        return new SemanticsNode(outerSemantics, this.mergingEnabled);
    }

    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, z);
    }

    private final List findOneLayerOfMergingSemanticsNodes(List list, boolean sortByBounds) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, sortByBounds, false, 2, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                findOneLayerOfMergingSemanticsNodes$default(semanticsNode, list, false, 2, null);
            }
        }
        return list;
    }

    public final LayoutNodeWrapper findWrapperToGetBounds$ui_release() {
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            SemanticsEntity outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (outerMergingSemantics == null) {
                outerMergingSemantics = this.outerSemanticsEntity;
            }
            return outerMergingSemantics.getLayoutNodeWrapper();
        }
        return this.outerSemanticsEntity.getLayoutNodeWrapper();
    }

    private final void emitFakeNodes(List unmergedChildren) {
        final Role role;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(m2170fakeSemanticsNodeypyhhiA(role, new Function1() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver fakeSemanticsNode) {
                    Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.m2176setRolekuIjeqM(fakeSemanticsNode, Role.this.getValue());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            final String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str != null) {
                unmergedChildren.add(0, m2170fakeSemanticsNodeypyhhiA(null, new Function1() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver fakeSemanticsNode) {
                        Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.setContentDescription(fakeSemanticsNode, str);
                    }
                }));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m2170fakeSemanticsNodeypyhhiA(Role role, Function1 properties) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsEntity(new LayoutNode(true).getInnerLayoutNodeWrapper(), new SemanticsModifierCore(role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this), false, false, properties)), false);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }
}
