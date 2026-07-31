package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OuterMeasurablePlaceable.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J;\u0010%\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0012J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020!2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b-\u0010)J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u001b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000f¢\u0006\u0004\b1\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\"\u0010;\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00109\u001a\u0004\b<\u0010=\"\u0004\b>\u00100R\u001f\u0010?\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR(\u0010G\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010E8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010M\u001a\u0004\u0018\u00010\u00168Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "outerWrapper", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "layerBlock", "placeOuterWrapper-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeOuterWrapper", "onIntrinsicsQueried", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "placeAt-f8xVGno", "placeAt", "replace", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRequest", "invalidateIntrinsicsParent", "(Z)V", "recalculateParentData", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getOuterWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setOuterWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "measuredOnce", "Z", "placedOnce", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "lastPosition", "J", "lastLayerBlock", "Lkotlin/jvm/functions/Function1;", "lastZIndex", "F", "", "<set-?>", "parentData", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getMeasuredWidth", "()I", "measuredWidth", "getMeasuredHeight", "measuredHeight", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OuterMeasurablePlaceable extends Placeable implements Measurable {
    private boolean duringAlignmentLinesQuery;
    private Function1 lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private final LayoutNode layoutNode;
    private boolean measuredOnce;
    private LayoutNodeWrapper outerWrapper;
    private Object parentData;
    private boolean placedOnce;

    /* compiled from: OuterMeasurablePlaceable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final LayoutNodeWrapper getOuterWrapper() {
        return this.outerWrapper;
    }

    public final void setOuterWrapper(LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.outerWrapper = layoutNodeWrapper;
    }

    public OuterMeasurablePlaceable(LayoutNode layoutNode, LayoutNodeWrapper outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.layoutNode = layoutNode;
        this.outerWrapper = outerWrapper;
        this.lastPosition = IntOffset.INSTANCE.m2558getZeronOccac();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m2065getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m2475boximpl(getMeasurementConstraints());
        }
        return null;
    }

    /* renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
    public final boolean getDuringAlignmentLinesQuery() {
        return this.duringAlignmentLinesQuery;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo1944measureBRTryo0(long constraints) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null) {
            this.layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        } else {
            if (this.layoutNode.getMeasuredByParent() != LayoutNode.UsageByParent.NotUsed && !this.layoutNode.getCanMultiMeasure()) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.layoutNode.getMeasuredByParent() + ". Parent state " + parent$ui_release.getLayoutState() + '.').toString());
            }
            LayoutNode layoutNode = this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState().ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + parent$ui_release.getLayoutState());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.setMeasuredByParent$ui_release(usageByParent);
        }
        m2066remeasureBRTryo0(constraints);
        return this;
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m2066remeasureBRTryo0(long constraints) {
        Owner requireOwner = LayoutNodeKt.requireOwner(this.layoutNode);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        LayoutNode layoutNode = this.layoutNode;
        boolean z = true;
        layoutNode.setCanMultiMeasure$ui_release(layoutNode.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
        if (this.layoutNode.getMeasurePending() || !Constraints.m2480equalsimpl0(getMeasurementConstraints(), constraints)) {
            this.layoutNode.getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            MutableVector mutableVector = this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    i++;
                } while (i < size);
            }
            this.measuredOnce = true;
            long mo1946getSizeYbymL2g = this.outerWrapper.mo1946getSizeYbymL2g();
            m1960setMeasurementConstraintsBRTryo0(constraints);
            this.layoutNode.m2018performMeasureBRTryo0$ui_release(constraints);
            if (IntSize.m2565equalsimpl0(this.outerWrapper.mo1946getSizeYbymL2g(), mo1946getSizeYbymL2g) && this.outerWrapper.getWidth() == getWidth() && this.outerWrapper.getHeight() == getHeight()) {
                z = false;
            }
            m1959setMeasuredSizeozmzZPI(IntSizeKt.IntSize(this.outerWrapper.getWidth(), this.outerWrapper.getHeight()));
            return z;
        }
        requireOwner.forceMeasureTheSubtree(this.layoutNode);
        this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
        return false;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int getMeasuredWidth() {
        return this.outerWrapper.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int getMeasuredHeight() {
        return this.outerWrapper.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if ((parent$ui_release != null ? parent$ui_release.getLayoutState() : null) == LayoutNode.LayoutState.Measuring) {
            this.layoutNode.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState() : null) == LayoutNode.LayoutState.LayingOut) {
                this.layoutNode.getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i = this.outerWrapper.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1945placeAtf8xVGno(final long position, final float zIndex, final Function1 layerBlock) {
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        LayoutNodeWrapper wrappedBy = this.outerWrapper.getWrappedBy();
        if (wrappedBy != null && wrappedBy.getIsShallowPlacing()) {
            m2064placeOuterWrapperf8xVGno(position, zIndex, layerBlock);
            return;
        }
        this.placedOnce = true;
        this.layoutNode.getAlignmentLines().setUsedByModifierLayout$ui_release(false);
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(this.layoutNode, new Function0() { // from class: androidx.compose.ui.node.OuterMeasurablePlaceable$placeAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m2067invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2067invoke() {
                OuterMeasurablePlaceable.this.m2064placeOuterWrapperf8xVGno(position, zIndex, layerBlock);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeOuterWrapper-f8xVGno, reason: not valid java name */
    public final void m2064placeOuterWrapperf8xVGno(long position, float zIndex, Function1 layerBlock) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        if (layerBlock == null) {
            companion.m1965place70tqf50(this.outerWrapper, position, zIndex);
        } else {
            companion.m1968placeWithLayeraW9wM(this.outerWrapper, position, zIndex, layerBlock);
        }
    }

    public final void replace() {
        if (!this.placedOnce) {
            throw new IllegalStateException("Check failed.");
        }
        mo1945placeAtf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicHeight(width);
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode.requestRemeasure$ui_release$default(this.layoutNode, false, 1, null);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null || this.layoutNode.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = this.layoutNode;
        int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState().ordinal()];
        if (i == 1) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else if (i == 2) {
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            usageByParent = parent$ui_release.getIntrinsicsUsageByParent();
        }
        layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
    }

    public final void invalidateIntrinsicsParent(boolean forceRequest) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent = this.layoutNode.getIntrinsicsUsageByParent();
        if (parent$ui_release2 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
            parent$ui_release2 = parent$ui_release;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
        if (i == 1) {
            parent$ui_release2.requestRemeasure$ui_release(forceRequest);
        } else {
            if (i == 2) {
                parent$ui_release2.requestRelayout$ui_release(forceRequest);
                return;
            }
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
    }

    public final void recalculateParentData() {
        this.parentData = this.outerWrapper.getParentData();
    }
}
