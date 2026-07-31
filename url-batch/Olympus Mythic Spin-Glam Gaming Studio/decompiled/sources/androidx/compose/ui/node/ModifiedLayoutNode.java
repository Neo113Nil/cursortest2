package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModifiedLayoutNode.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J;\u0010#\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R*\u0010\u0002\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00018\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\b\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "Landroidx/compose/ui/layout/LayoutModifier;", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)V", "modifierFromState", "()Landroidx/compose/ui/layout/LayoutModifier;", "", "onInitialize", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "onModifierChanged", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;)V", "<set-?>", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrapped", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "Landroidx/compose/ui/layout/LayoutModifier;", "getModifier", "setModifier", "(Landroidx/compose/ui/layout/LayoutModifier;)V", "", "toBeReusedForSameModifier", "Z", "getToBeReusedForSameModifier", "()Z", "setToBeReusedForSameModifier", "(Z)V", "Landroidx/compose/runtime/MutableState;", "modifierState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ModifiedLayoutNode extends LayoutNodeWrapper {
    private static final Paint modifierBoundsPaint;
    private LayoutModifier modifier;
    private MutableState modifierState;
    private boolean toBeReusedForSameModifier;
    private LayoutNodeWrapper wrapped;

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: getWrapped$ui_release, reason: from getter */
    public LayoutNodeWrapper getWrapped() {
        return this.wrapped;
    }

    public void setWrapped(LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.wrapped = layoutNodeWrapper;
    }

    public final LayoutModifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(LayoutModifier layoutModifier) {
        Intrinsics.checkNotNullParameter(layoutModifier, "<set-?>");
        this.modifier = layoutModifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedLayoutNode(LayoutNodeWrapper wrapped, LayoutModifier modifier) {
        super(wrapped.getLayoutNode());
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.wrapped = wrapped;
        this.modifier = modifier;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public MeasureScope getMeasureScope() {
        return getWrapped().getMeasureScope();
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.toBeReusedForSameModifier;
    }

    public final void setToBeReusedForSameModifier(boolean z) {
        this.toBeReusedForSameModifier = z;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onInitialize() {
        super.onInitialize();
        getWrapped().setWrappedBy$ui_release(this);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return modifierFromState().minIntrinsicWidth(getMeasureScope(), getWrapped(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return modifierFromState().maxIntrinsicWidth(getMeasureScope(), getWrapped(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return modifierFromState().minIntrinsicHeight(getMeasureScope(), getWrapped(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return modifierFromState().maxIntrinsicHeight(getMeasureScope(), getWrapped(), width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1945placeAtf8xVGno(long position, float zIndex, Function1 layerBlock) {
        int parentWidth;
        LayoutDirection parentLayoutDirection;
        super.mo1945placeAtf8xVGno(position, zIndex, layerBlock);
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy == null || !wrappedBy.getIsShallowPlacing()) {
            onPlaced();
            Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
            int m2567getWidthimpl = IntSize.m2567getWidthimpl(getMeasuredSize());
            LayoutDirection layoutDirection = getMeasureScope().getLayoutDirection();
            parentWidth = companion.getParentWidth();
            parentLayoutDirection = companion.getParentLayoutDirection();
            Placeable.PlacementScope.parentWidth = m2567getWidthimpl;
            Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
            getMeasureResult().placeChildren();
            Placeable.PlacementScope.parentWidth = parentWidth;
            Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
        }
    }

    private final LayoutModifier modifierFromState() {
        MutableState mutableState = this.modifierState;
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.modifier, null, 2, null);
        }
        this.modifierState = mutableState;
        return (LayoutModifier) mutableState.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        MutableState mutableState = this.modifierState;
        if (mutableState == null) {
            return;
        }
        mutableState.setValue(this.modifier);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        int m2553getXimpl;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (getMeasureResult().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = (Integer) getMeasureResult().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = getWrapped().get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        setShallowPlacing(true);
        mo1945placeAtf8xVGno(getPosition(), getZIndex(), getLayerBlock());
        setShallowPlacing(false);
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            m2553getXimpl = IntOffset.m2554getYimpl(getWrapped().getPosition());
        } else {
            m2553getXimpl = IntOffset.m2553getXimpl(getWrapped().getPosition());
        }
        return i + m2553getXimpl;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrapped().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1367setColor8_81llA(Color.INSTANCE.m1457getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1371setStylek9PVt8s(PaintingStyle.INSTANCE.m1539getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo1944measureBRTryo0(long constraints) {
        long measuredSize;
        m1960setMeasurementConstraintsBRTryo0(constraints);
        setMeasureResult$ui_release(this.modifier.mo46measure3p2s80s(getMeasureScope(), getWrapped(), constraints));
        OwnedLayer layer = getLayer();
        if (layer != null) {
            measuredSize = getMeasuredSize();
            layer.mo2071resizeozmzZPI(measuredSize);
        }
        onMeasured();
        return this;
    }
}
