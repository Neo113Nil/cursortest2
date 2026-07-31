package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InnerPlaceable.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\b*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u0007*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u0007*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0011\u001a\u00020\u0007*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u0012*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u0012*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0014\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010&\u001a\u00020\f*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\f*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010%J\u001d\u0010&\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u00101J\u0017\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00101J;\u0010?\u001a\u00020;2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00122\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0018\u000109H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0017\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020;2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ{\u0010X\u001a\u00020;\"\u0014\b\u0000\u0010I*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020H\"\u0004\b\u0001\u0010J\"\b\b\u0002\u0010L*\u00020K2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020M2\u0006\u0010P\u001a\u00020O2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00010Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020SH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "C", "Landroidx/compose/ui/Modifier;", "M", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {
    private static final Paint innerBoundsPaint;
    private final /* synthetic */ MeasureScope $$delegate_0;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo264roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo264roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo265roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo265roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public float mo266toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo266toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo267toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo267toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo268toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo268toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo269toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo269toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo270toPxR2X_6o(long j) {
        return this.$$delegate_0.mo270toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo271toPx0680j_4(float f) {
        return this.$$delegate_0.mo271toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo272toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo272toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public long mo273toSp0xMU5do(float f) {
        return this.$$delegate_0.mo273toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo274toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo274toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo275toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo275toSpkPz2Gy4(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerPlaceable(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.$$delegate_0 = layoutNode.getMeasureScope();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public MeasureScope getMeasureScope() {
        return getLayoutNode().getMeasureScope();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1945placeAtf8xVGno(long position, float zIndex, Function1 layerBlock) {
        super.mo1945placeAtf8xVGno(position, zIndex, layerBlock);
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy == null || !wrappedBy.getIsShallowPlacing()) {
            onPlaced();
            getLayoutNode().onNodePlaced$ui_release();
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = (Integer) getLayoutNode().calculateAlignmentLines$ui_release().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.getIsPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i++;
            } while (i < size);
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2011hitTestChildYqVAtuI(LayoutNodeWrapper.HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        boolean z2 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (m2048withinLayerBoundsk4lQ0M(pointerPosition)) {
                z = isInLayer;
            } else if (isTouchEvent) {
                float m2040distanceInMinimumTouchTargettz77jQw = m2040distanceInMinimumTouchTargettz77jQw(pointerPosition, m2043getMinimumTouchTargetSizeNHjbRc());
                if (!Float.isInfinite(m2040distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(m2040distanceInMinimumTouchTargettz77jQw)) {
                    z = false;
                }
            }
            z2 = true;
            if (z2) {
                return;
            }
            i = hitTestResult.hitDepth;
            MutableVector zSortedChildren = getLayoutNode().getZSortedChildren();
            int size = zSortedChildren.getSize();
            if (size > 0) {
                Object[] content = zSortedChildren.getContent();
                int i2 = size - 1;
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i2];
                    if (layoutNode.getIsPlaced()) {
                        hitTestSource.mo2049childHitTestYqVAtuI(layoutNode, pointerPosition, hitTestResult, isTouchEvent, z);
                        if (hitTestResult.hasHit()) {
                            if (!layoutNode.getOuterLayoutNodeWrapper$ui_release().shouldSharePointerInputWithSiblings()) {
                                break;
                            } else {
                                hitTestResult.acceptHits();
                            }
                        }
                    }
                    i2--;
                } while (i2 >= 0);
            }
            hitTestResult.hitDepth = i;
            return;
        }
        z = isInLayer;
        if (z2) {
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1367setColor8_81llA(Color.INSTANCE.m1459getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1371setStylek9PVt8s(PaintingStyle.INSTANCE.m1539getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo1944measureBRTryo0(long constraints) {
        m1960setMeasurementConstraintsBRTryo0(constraints);
        MutableVector mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
        }
        getLayoutNode().handleMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo37measure3p2s80s(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), constraints));
        onMeasured();
        return this;
    }
}
