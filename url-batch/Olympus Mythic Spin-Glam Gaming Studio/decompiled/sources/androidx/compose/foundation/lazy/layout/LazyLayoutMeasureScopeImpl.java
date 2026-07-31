package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyLayoutMeasureScope.kt */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u001aH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001d*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u001d*\u00020\u001aH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010%\u001a\u00020$*\u00020#H\u0097\u0001¢\u0006\u0004\b%\u0010&J+\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u0016*\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\"J\u001c\u00100\u001a\u00020\u0016*\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001c\u00100\u001a\u00020\u0016*\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b1\u0010\u001fJ\u001c\u00105\u001a\u00020\u001a*\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001c\u00105\u001a\u00020\u001a*\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b3\u00106J\u0019\u00105\u001a\u00020\u001a*\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00104J\u0019\u0010<\u001a\u000209*\u000208H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u000208*\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R<\u0010C\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0Aj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*`B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)[Landroidx/compose/ui/layout/Placeable;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "placeablesCache", "Ljava/util/HashMap;", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final HashMap placeablesCache;
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int width, int height, Map alignmentLines, Function1 placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return this.subcomposeMeasureScope.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo264roundToPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo264roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo265roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo265roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo270toPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo270toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo271toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo271toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory itemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.itemContentFactory = itemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.placeablesCache = new HashMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public Placeable[] mo494measure0kLqBqw(int index, long constraints) {
        Placeable[] placeableArr = (Placeable[]) this.placeablesCache.get(Integer.valueOf(index));
        if (placeableArr != null) {
            return placeableArr;
        }
        Object key = ((LazyLayoutItemProvider) this.itemContentFactory.getItemProvider().mo4828invoke()).getKey(index);
        List subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(index, key));
        int size = subcompose.size();
        Placeable[] placeableArr2 = new Placeable[size];
        for (int i = 0; i < size; i++) {
            placeableArr2[i] = ((Measurable) subcompose.get(i)).mo1944measureBRTryo0(constraints);
        }
        this.placeablesCache.put(Integer.valueOf(index), placeableArr2);
        return placeableArr2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public float mo266toDpGaN1DYA(long j) {
        return this.subcomposeMeasureScope.mo266toDpGaN1DYA(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo268toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.mo268toDpu2uoSUM(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo267toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.mo267toDpu2uoSUM(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo274toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.mo274toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo275toSpkPz2Gy4(int i) {
        return this.subcomposeMeasureScope.mo275toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public long mo273toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.mo273toSp0xMU5do(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo272toSizeXkaWNTQ(long j) {
        return this.subcomposeMeasureScope.mo272toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo269toDpSizekrfVVM(long j) {
        return this.subcomposeMeasureScope.mo269toDpSizekrfVVM(j);
    }
}
