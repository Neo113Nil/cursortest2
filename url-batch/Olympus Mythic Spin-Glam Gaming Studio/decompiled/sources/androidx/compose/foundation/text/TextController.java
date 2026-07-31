package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoreText.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00104\u001a\u00020\r2\u0006\u00103\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0011\u00109\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b8\u00106\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/text/TextState;", "state", "<init>", "(Landroidx/compose/foundation/text/TextState;)V", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "outOfBoundary-0a9Yr6o", "(JJ)Z", "outOfBoundary", "Landroidx/compose/ui/Modifier;", "drawTextAndSelectionBehind", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "createSemanticsModifierFor", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "", "update", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "Landroidx/compose/foundation/text/TextState;", "getState", "()Landroidx/compose/foundation/text/TextState;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/TextDragObserver;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "setLongPressDragObserver", "(Landroidx/compose/foundation/text/TextDragObserver;)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "coreModifiers", "Landroidx/compose/ui/Modifier;", "<set-?>", "semanticsModifier", "getSemanticsModifier$foundation_release", "()Landroidx/compose/ui/Modifier;", "selectionModifiers", "getModifiers", "modifiers", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextController implements RememberObserver {
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;
    private final MeasurePolicy measurePolicy;
    private Modifier selectionModifiers;
    private SelectionRegistrar selectionRegistrar;
    private Modifier semanticsModifier;
    private final TextState state;

    public TextController(TextState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
            
                r3 = r5.selectionRegistrar;
             */
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                SelectionRegistrar selectionRegistrar;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                TextLayoutResult m579layoutNN6EwU = TextController.this.getState().getTextDelegate().m579layoutNN6EwU(j, measure.getLayoutDirection(), layoutResult);
                if (!Intrinsics.areEqual(layoutResult, m579layoutNN6EwU)) {
                    TextController.this.getState().getOnTextLayout().invoke(m579layoutNN6EwU);
                    if (layoutResult != null) {
                        TextController textController = TextController.this;
                        if (!Intrinsics.areEqual(layoutResult.getLayoutInput().getText(), m579layoutNN6EwU.getLayoutInput().getText()) && selectionRegistrar != null) {
                            selectionRegistrar.notifySelectableChange(textController.getState().getSelectableId());
                        }
                    }
                }
                TextController.this.getState().setLayoutResult(m579layoutNN6EwU);
                if (measurables.size() < m579layoutNN6EwU.getPlaceholderRects().size()) {
                    throw new IllegalStateException("Check failed.");
                }
                List placeholderRects = m579layoutNN6EwU.getPlaceholderRects();
                final ArrayList arrayList = new ArrayList(placeholderRects.size());
                int size = placeholderRects.size();
                for (int i = 0; i < size; i++) {
                    Rect rect = (Rect) placeholderRects.get(i);
                    Pair pair = rect != null ? new Pair(((Measurable) measurables.get(i)).mo1944measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m2545boximpl(IntOffsetKt.IntOffset(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop())))) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return measure.layout(IntSize.m2567getWidthimpl(m579layoutNN6EwU.getSize()), IntSize.m2566getHeightimpl(m579layoutNN6EwU.getSize()), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(m579layoutNN6EwU.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(m579layoutNN6EwU.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        List<Pair<Placeable, IntOffset>> list = arrayList;
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Pair<Placeable, IntOffset> pair2 = list.get(i2);
                            Placeable.PlacementScope.m1961place70tqf50$default(layout, pair2.component1(), pair2.component2().getPackedValue(), 0.0f, 2, null);
                        }
                    }
                });
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMinIntrinsicWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m2566getHeightimpl(TextDelegate.m576layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMaxIntrinsicWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m2566getHeightimpl(TextDelegate.m576layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.coreModifiers = OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new Function1() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
            
                r5 = r4.this$0.selectionRegistrar;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(@NotNull LayoutCoordinates it) {
                SelectionRegistrar selectionRegistrar;
                SelectionRegistrar selectionRegistrar2;
                Intrinsics.checkNotNullParameter(it, "it");
                TextController.this.getState().setLayoutCoordinates(it);
                selectionRegistrar = TextController.this.selectionRegistrar;
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                    long positionInWindow = LayoutCoordinatesKt.positionInWindow(it);
                    if (!Offset.m1294equalsimpl0(positionInWindow, TextController.this.getState().getPreviousGlobalPosition()) && selectionRegistrar2 != null) {
                        selectionRegistrar2.notifyPositionChange(TextController.this.getState().getSelectableId());
                    }
                    TextController.this.getState().m607setPreviousGlobalPositionk4lQ0M(positionInWindow);
                }
            }
        });
        this.semanticsModifier = createSemanticsModifierFor(state.getTextDelegate().getText());
        this.selectionModifiers = companion;
    }

    public final TextState getState() {
        return this.state;
    }

    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    public final void setLongPressDragObserver(TextDragObserver textDragObserver) {
        Intrinsics.checkNotNullParameter(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1, java.lang.Object] */
    public final void update(final SelectionRegistrar selectionRegistrar) {
        Modifier modifier;
        this.selectionRegistrar = selectionRegistrar;
        if (selectionRegistrar != null) {
            if (TouchMode_androidKt.isInTouchMode()) {
                setLongPressDragObserver(new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController$update$1
                    private long dragTotalDistance;
                    private long lastPosition;

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
                    public void mo569onDownk4lQ0M(long point) {
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public void onUp() {
                    }

                    {
                        Offset.Companion companion = Offset.INSTANCE;
                        this.lastPosition = companion.m1308getZeroF1C5BW0();
                        this.dragTotalDistance = companion.m1308getZeroF1C5BW0();
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    /* renamed from: onStart-k-4lQ0M, reason: not valid java name */
                    public void mo571onStartk4lQ0M(long startPoint) {
                        boolean m568outOfBoundary0a9Yr6o;
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates != null) {
                            TextController textController = TextController.this;
                            SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                            if (!layoutCoordinates.isAttached()) {
                                return;
                            }
                            m568outOfBoundary0a9Yr6o = textController.m568outOfBoundary0a9Yr6o(startPoint, startPoint);
                            if (m568outOfBoundary0a9Yr6o) {
                                selectionRegistrar2.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                            } else {
                                selectionRegistrar2.mo680notifySelectionUpdateStartd4ec7I(layoutCoordinates, startPoint, SelectionAdjustment.INSTANCE.getWord());
                            }
                            this.lastPosition = startPoint;
                        }
                        if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                            this.dragTotalDistance = Offset.INSTANCE.m1308getZeroF1C5BW0();
                        }
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
                    public void mo570onDragk4lQ0M(long delta) {
                        boolean m568outOfBoundary0a9Yr6o;
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates != null) {
                            SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                            TextController textController = TextController.this;
                            if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                                long m1302plusMKHz9U = Offset.m1302plusMKHz9U(this.dragTotalDistance, delta);
                                this.dragTotalDistance = m1302plusMKHz9U;
                                long m1302plusMKHz9U2 = Offset.m1302plusMKHz9U(this.lastPosition, m1302plusMKHz9U);
                                m568outOfBoundary0a9Yr6o = textController.m568outOfBoundary0a9Yr6o(this.lastPosition, m1302plusMKHz9U2);
                                if (m568outOfBoundary0a9Yr6o || !selectionRegistrar2.mo679notifySelectionUpdate5iVPX68(layoutCoordinates, m1302plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                                    return;
                                }
                                this.lastPosition = m1302plusMKHz9U2;
                                this.dragTotalDistance = Offset.INSTANCE.m1308getZeroF1C5BW0();
                            }
                        }
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public void onStop() {
                        if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                            selectionRegistrar.notifySelectionUpdateEnd();
                        }
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public void onCancel() {
                        if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                            selectionRegistrar.notifySelectionUpdateEnd();
                        }
                    }
                });
                modifier = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, getLongPressDragObserver(), new TextController$update$2(this, null));
            } else {
                ?? r0 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1
                    private long lastPosition = Offset.INSTANCE.m1308getZeroF1C5BW0();

                    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                    /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
                    public boolean mo573onExtendk4lQ0M(long downPosition) {
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            return false;
                        }
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (!layoutCoordinates.isAttached()) {
                            return false;
                        }
                        if (selectionRegistrar2.mo679notifySelectionUpdate5iVPX68(layoutCoordinates, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                            this.lastPosition = downPosition;
                        }
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }

                    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                    /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
                    public boolean mo574onExtendDragk4lQ0M(long dragPosition) {
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            return true;
                        }
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            return false;
                        }
                        if (!selectionRegistrar2.mo679notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                            return true;
                        }
                        this.lastPosition = dragPosition;
                        return true;
                    }

                    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
                    public boolean mo575onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            return false;
                        }
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (!layoutCoordinates.isAttached()) {
                            return false;
                        }
                        selectionRegistrar2.mo680notifySelectionUpdateStartd4ec7I(layoutCoordinates, downPosition, adjustment);
                        this.lastPosition = downPosition;
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }

                    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                    /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
                    public boolean mo572onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                        LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                        if (layoutCoordinates != null) {
                            SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                            TextController textController = TextController.this;
                            if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                                return false;
                            }
                            if (selectionRegistrar2.mo679notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, adjustment)) {
                                this.lastPosition = dragPosition;
                            }
                        }
                        return true;
                    }
                };
                modifier = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, (Object) r0, new TextController$update$3(r0, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            }
        } else {
            modifier = Modifier.INSTANCE;
        }
        this.selectionModifiers = modifier;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        if (this.state.getTextDelegate() == textDelegate) {
            return;
        }
        this.state.setTextDelegate(textDelegate);
        this.semanticsModifier = createSemanticsModifierFor(this.state.getTextDelegate().getText());
    }

    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundary-0a9Yr6o, reason: not valid java name */
    public final boolean m568outOfBoundary0a9Yr6o(long start, long end) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int m2234getOffsetForPositionk4lQ0M = layoutResult.m2234getOffsetForPositionk4lQ0M(start);
        int m2234getOffsetForPositionk4lQ0M2 = layoutResult.m2234getOffsetForPositionk4lQ0M(end);
        int i = length - 1;
        return (m2234getOffsetForPositionk4lQ0M >= i && m2234getOffsetForPositionk4lQ0M2 >= i) || (m2234getOffsetForPositionk4lQ0M < 0 && m2234getOffsetForPositionk4lQ0M2 < 0);
    }

    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m1495graphicsLayerpANQ8Wg$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new Function1() { // from class: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DrawScope drawBehind) {
                SelectionRegistrar selectionRegistrar;
                int offset;
                int offset2;
                Map subselections;
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                if (layoutResult != null) {
                    TextController textController = TextController.this;
                    textController.getState().getDrawScopeInvalidation();
                    selectionRegistrar = textController.selectionRegistrar;
                    Selection selection = (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) ? null : (Selection) subselections.get(Long.valueOf(textController.getState().getSelectableId()));
                    if (selection != null) {
                        if (!selection.getHandlesCrossed()) {
                            offset = selection.getStart().getOffset();
                        } else {
                            offset = selection.getEnd().getOffset();
                        }
                        if (!selection.getHandlesCrossed()) {
                            offset2 = selection.getEnd().getOffset();
                        } else {
                            offset2 = selection.getStart().getOffset();
                        }
                        if (offset != offset2) {
                            DrawScope.m1700drawPathLG529CI$default(drawBehind, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                        }
                    }
                    TextDelegate.INSTANCE.paint(drawBehind.getDrawContext().getCanvas(), layoutResult);
                }
            }
        });
    }

    private final Modifier createSemanticsModifierFor(final AnnotatedString text) {
        return SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setText(semantics, AnnotatedString.this);
                final TextController textController = this;
                SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new Function1() { // from class: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                        boolean z;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextController.this.getState().getLayoutResult() != null) {
                            TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            it.add(layoutResult);
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    public final Modifier getModifiers() {
        return this.coreModifiers.then(this.semanticsModifier).then(this.selectionModifiers);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        SelectionRegistrar selectionRegistrar = this.selectionRegistrar;
        if (selectionRegistrar != null) {
            TextState textState = this.state;
            textState.setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(textState.getSelectableId(), new Function0() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final LayoutCoordinates mo4828invoke() {
                    return TextController.this.getState().getLayoutCoordinates();
                }
            }, new Function0() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final TextLayoutResult mo4828invoke() {
                    return TextController.this.getState().getLayoutResult();
                }
            })));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }
}
