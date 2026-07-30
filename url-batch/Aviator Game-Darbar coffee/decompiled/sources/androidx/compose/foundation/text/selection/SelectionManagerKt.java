package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a%\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u000fH\u0002\u001a*\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00130\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"\u001a\f\u0010#\u001a\u00020\r*\u00020\u0016H\u0000\u001a\u001b\u0010$\u001a\u00020%*\u00020\r2\u0006\u0010&\u001a\u00020\u0018H\u0000¢\u0006\u0004\b'\u0010(\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"merge", "Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "firstAndLast", "", "T", "getSelectedRegionRect", "selectableSubSelectionPairs", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "visibleBounds", "containsInclusive", "", "offset", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "foundation"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    public static final Function1<ContextMenuScope, Unit> contextMenuBuilder(final SelectionManager selectionManager, final ContextMenuState contextMenuState) {
        return new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectionManagerKt.contextMenuBuilder$lambda$0(SelectionManager.this, contextMenuState, (ContextMenuScope) obj);
            }
        };
    }

    static final Unit contextMenuBuilder$lambda$0(final SelectionManager selectionManager, ContextMenuState contextMenuState, ContextMenuScope contextMenuScope) {
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit contextMenuBuilder$lambda$0$0;
                contextMenuBuilder$lambda$0$0 = SelectionManagerKt.contextMenuBuilder$lambda$0$0(SelectionManager.this);
                return contextMenuBuilder$lambda$0$0;
            }
        });
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit contextMenuBuilder$lambda$0$1;
                contextMenuBuilder$lambda$0$1 = SelectionManagerKt.contextMenuBuilder$lambda$0$1(SelectionManager.this);
                return contextMenuBuilder$lambda$0$1;
            }
        });
        CollectionsKt.listOf((Object[]) new Unit[]{Unit.INSTANCE, Unit.INSTANCE});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contextMenuBuilder$lambda$0$0(SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contextMenuBuilder$lambda$0$1(SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.listOf(CollectionsKt.first((List) list), CollectionsKt.last((List) list));
    }

    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends Pair<? extends Selectable, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list2.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Pair<? extends Selectable, Selection> pair = list2.get(i);
            Selectable component1 = pair.component1();
            Selection component2 = pair.component2();
            int offset = component2.getStart().getOffset();
            int offset2 = component2.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = component1.getLayoutCoordinates()) != null) {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2;
                    Rect boundingBox = component1.getBoundingBox(iArr[i3]);
                    left2 = Math.min(left2, boundingBox.getLeft());
                    top2 = Math.min(top2, boundingBox.getTop());
                    right2 = Math.max(right2, boundingBox.getRight());
                    bottom2 = Math.max(bottom2, boundingBox.getBottom());
                    i2 = i3 + 1;
                }
                long m4486constructorimpl = Offset.m4486constructorimpl((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
                long m4486constructorimpl2 = Offset.m4486constructorimpl((Float.floatToRawIntBits(bottom2) & 4294967295L) | (Float.floatToRawIntBits(right2) << 32));
                long mo6192localPositionOfR5De75A = layoutCoordinates.mo6192localPositionOfR5De75A(layoutCoordinates2, m4486constructorimpl);
                long mo6192localPositionOfR5De75A2 = layoutCoordinates.mo6192localPositionOfR5De75A(layoutCoordinates2, m4486constructorimpl2);
                left = Math.min(left, Float.intBitsToFloat((int) (mo6192localPositionOfR5De75A >> 32)));
                top = Math.min(top, Float.intBitsToFloat((int) (mo6192localPositionOfR5De75A & 4294967295L)));
                right = Math.max(right, Float.intBitsToFloat((int) (mo6192localPositionOfR5De75A2 >> 32)));
                bottom = Math.max(bottom, Float.intBitsToFloat((int) (mo6192localPositionOfR5De75A2 & 4294967295L)));
            }
            i++;
            list2 = list;
            c = 0;
        }
        return new Rect(left, top, right, bottom);
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1636calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m1638getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m1638getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1638getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        int offset;
        float coerceIn;
        Selectable anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation.getLastVisibleOffset()) {
            Offset m1626getCurrentDragPosition_m7T9E = selectionManager.m1626getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(m1626getCurrentDragPosition_m7T9E);
            float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo6192localPositionOfR5De75A(containerLayoutCoordinates, m1626getCurrentDragPosition_m7T9E.m4504unboximpl()) >> 32));
            long mo1587getRangeOfLineContainingjx7JFs = anchorSelectable$foundation.mo1587getRangeOfLineContainingjx7JFs(offset);
            if (TextRange.m6964getCollapsedimpl(mo1587getRangeOfLineContainingjx7JFs)) {
                coerceIn = anchorSelectable$foundation.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation.getLineLeft(TextRange.m6970getStartimpl(mo1587getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation.getLineRight(TextRange.m6965getEndimpl(mo1587getRangeOfLineContainingjx7JFs) - 1);
                coerceIn = RangesKt.coerceIn(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (coerceIn == -1.0f) {
                return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
            }
            if (!IntSize.m7691equalsimpl0(j, IntSize.INSTANCE.m7698getZeroYbymL2g()) && Math.abs(intBitsToFloat - coerceIn) > ((int) (j >> 32)) / 2) {
                return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
            }
            if (anchorSelectable$foundation.getCenterYForOffset(offset) == -1.0f) {
                return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo6192localPositionOfR5De75A(layoutCoordinates, Offset.m4486constructorimpl((Float.floatToRawIntBits(coerceIn) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
        }
        return Offset.INSTANCE.m4509getUnspecifiedF1C5BW0();
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
        return RectKt.m4532Rect0a9Yr6o(layoutCoordinates.mo6200windowToLocalMKHz9U(boundsInWindow$default.m4529getTopLeftF1C5BW0()), layoutCoordinates.mo6200windowToLocalMKHz9U(boundsInWindow$default.m4523getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1637containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    private static final void contextMenuBuilder$lambda$0$selectionItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, Function0<Unit> function0) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt$TextItem$2(function0, contextMenuState), 14, null);
        }
    }
}
