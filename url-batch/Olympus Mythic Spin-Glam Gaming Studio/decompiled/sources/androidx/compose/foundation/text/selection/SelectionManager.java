package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u0013*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010.\u001a\u00020\u0018H\u0000¢\u0006\u0004\b,\u0010-J;\u00107\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020104032\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b5\u00106J\u0011\u0010;\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010\bJ\u000f\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\b@\u0010\bJ\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\bJ\u0015\u0010D\u001a\u00020C2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bD\u0010EJ9\u0010J\u001a\u00020\u001f2\b\u0010F\u001a\u0004\u0018\u00010\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJ?\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010Z\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010o\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R,\u0010\u0080\u0001\u001a\u00020\u001f2\u0006\u0010|\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010S\u001a\u0004\b~\u0010W\"\u0004\b\u007f\u0010YR\"\u0010G\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0007\n\u0005\bG\u0010\u0081\u0001R5\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010-\"\u0006\b\u0086\u0001\u0010\u0087\u0001R:\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020\u000f8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010S\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R:\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020\u000f8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010S\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001\"\u0006\b\u0090\u0001\u0010\u008c\u0001R=\u0010K\u001a\u0004\u0018\u00010\u000f2\b\u0010|\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0092\u0001\u0010S\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R=\u0010L\u001a\u0004\u0018\u00010\u000f2\b\u0010|\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010S\u001a\u0006\b\u0098\u0001\u0010\u0094\u0001\"\u0006\b\u0099\u0001\u0010\u0096\u0001R7\u0010 \u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010|\u001a\u0005\u0018\u00010\u009a\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009b\u0001\u0010S\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R>\u0010¤\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010|\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b¡\u0001\u0010S\u001a\u0006\b¢\u0001\u0010\u0094\u0001\"\u0006\b£\u0001\u0010\u0096\u0001R\u0016\u0010¦\u0001\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010WR.\u0010«\u0001\u001a\u0004\u0018\u0001012\t\u0010\u0082\u0001\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u0014\u0010®\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¯\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "", "updateHandleOffsets", "()V", "updateSelectionToolbarPosition", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onTap", "detectNonConsumingTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "onClearSelectionRequested", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "offset", "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "convertToContainerCoordinates", X3.i.L, "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "startSelection", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "", "selectAll$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAll", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "copy", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "onRelease", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "newPosition", "previousPosition", "updateSelection-RHHTvR4$foundation_release", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "_selection", "Landroidx/compose/runtime/MutableState;", "touchMode", "Z", "getTouchMode", "()Z", "setTouchMode", "(Z)V", "onSelectionChange", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "getHasFocus", "setHasFocus", "hasFocus", "Landroidx/compose/ui/geometry/Offset;", "value", "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition$delegate", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition", "dragTotalDistance$delegate", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "getShouldShowMagnifier", "shouldShowMagnifier", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", DivActionHandler.DivActionReason.SELECTION, "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectionManager {
    private final MutableState _selection;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final MutableState dragBeginPosition;

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final MutableState dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState endHandlePosition;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private Function1 onSelectionChange;
    private Offset previousPosition;
    private final SelectionRegistrarImpl selectionRegistrar;

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState startHandlePosition;
    private TextToolbar textToolbar;
    private boolean touchMode;

    public SelectionManager(SelectionRegistrarImpl selectionRegistrar) {
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        this._selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.touchMode = true;
        this.onSelectionChange = new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            public final void invoke(@Nullable Selection selection) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Selection) obj);
                return Unit.INSTANCE;
            }
        };
        this.focusRequester = new FocusRequester();
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1288boximpl(companion.m1308getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1288boximpl(companion.m1308getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Selection selection;
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection2 = SelectionManager.this.getSelection();
                if ((selection2 == null || (start = selection2.getStart()) == null || j != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j != end.getSelectableId())) {
                    return;
                }
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbarPosition();
            }
        });
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new Function3() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m660invoked4ec7I((LayoutCoordinates) obj, ((Offset) obj2).getPackedValue(), (SelectionAdjustment) obj3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final void m660invoked4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long j, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                Offset m646convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m646convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j);
                if (m646convertToContainerCoordinatesQ7Q5hAU != null) {
                    SelectionManager.this.m652startSelection9KIMszo(m646convertToContainerCoordinatesQ7Q5hAU.getPackedValue(), false, selectionMode);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            }
        });
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair selectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
                Selection selection = (Selection) selectAll$foundation_release.component1();
                Map map = (Map) selectAll$foundation_release.component2();
                if (!Intrinsics.areEqual(selection, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(map);
                    SelectionManager.this.getOnSelectionChange().invoke(selection);
                }
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new Function5() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return m661invoke5iVPX68((LayoutCoordinates) obj, ((Offset) obj2).getPackedValue(), ((Offset) obj3).getPackedValue(), ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
            }

            @NotNull
            /* renamed from: invoke-5iVPX68, reason: not valid java name */
            public final Boolean m661invoke5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                return Boolean.valueOf(SelectionManager.this.m659updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m646convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j), SelectionManager.this.m646convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2), z, selectionMode));
            }
        });
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m662invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m662invoke() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m647setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j))) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Selection selection;
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection2 = SelectionManager.this.getSelection();
                if ((selection2 == null || (start = selection2.getStart()) == null || j != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j != end.getSelectableId())) {
                    return;
                }
                SelectionManager.this.m651setStartHandlePosition_kEHs6E(null);
                SelectionManager.this.m650setEndHandlePosition_kEHs6E(null);
            }
        });
    }

    public final Selection getSelection() {
        return (Selection) this._selection.getValue();
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final Function1 getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final Modifier getModifier() {
        Modifier modifier = Modifier.INSTANCE;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m663invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m663invoke() {
                SelectionManager.this.onRelease();
            }
        }), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SelectionManager.this.setContainerLayoutCoordinates(it);
            }
        }), this.focusRequester), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FocusState focusState) {
                Intrinsics.checkNotNullParameter(focusState, "focusState");
                if (!focusState.isFocused() && SelectionManager.this.getHasFocus()) {
                    SelectionManager.this.onRelease();
                }
                SelectionManager.this.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m664invokeZmokQxo(((KeyEvent) obj).getNativeKeyEvent());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m664invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (SelectionManager_androidKt.m669isCopyKeyEventZmokQxo(it)) {
                    SelectionManager.this.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m1288boximpl = layoutCoordinates != null ? Offset.m1288boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, m1288boximpl)) {
            return;
        }
        this.previousPosition = m1288boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m648setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(Offset.m1288boximpl(j));
    }

    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m654getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m649setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(Offset.m1288boximpl(j));
    }

    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m655getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m651setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m657getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m650setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m656getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m647setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m653getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return getDraggingHandle() != null;
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return (Selectable) this.selectionRegistrar.get_selectableMap().get(Long.valueOf(anchor.getSelectableId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m651setStartHandlePosition_kEHs6E(null);
            m650setEndHandlePosition_kEHs6E(null);
            return;
        }
        long mo1947localPositionOfR5De75A = layoutCoordinates.mo1947localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release.mo613getHandlePositiondBAh8RU(selection, true));
        long mo1947localPositionOfR5De75A2 = layoutCoordinates.mo1947localPositionOfR5De75A(layoutCoordinates3, anchorSelectable$foundation_release2.mo613getHandlePositiondBAh8RU(selection, false));
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        m651setStartHandlePosition_kEHs6E(SelectionManagerKt.m668containsInclusiveUv8p0NA(visibleBounds, mo1947localPositionOfR5De75A) ? Offset.m1288boximpl(mo1947localPositionOfR5De75A) : null);
        m650setEndHandlePosition_kEHs6E(SelectionManagerKt.m668containsInclusiveUv8p0NA(visibleBounds, mo1947localPositionOfR5De75A2) ? Offset.m1288boximpl(mo1947localPositionOfR5De75A2) : null);
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final Pair selectAll$foundation_release(long selectableId, Selection previousSelection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = (Selectable) sort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selection = SelectionManagerKt.merge(selection, selectAllSelection);
        }
        if (!Intrinsics.areEqual(selection, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
        }
        return new Pair(selection, linkedHashMap);
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString plus;
        List sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = (Selectable) sort.get(i);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (plus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = plus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || getSelection() == null || (textToolbar = this.textToolbar) == null) {
            return;
        }
        TextToolbar.showMenu$default(textToolbar, getContentRect(), new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m666invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m666invoke() {
                SelectionManager.this.copy$foundation_release();
                SelectionManager.this.onRelease();
            }
        }, null, null, null, 28, null);
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.INSTANCE.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 != null && layoutCoordinates3.isAttached()) {
            long mo1947localPositionOfR5De75A = layoutCoordinates3.mo1947localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo613getHandlePositiondBAh8RU(selection, true));
            long mo1947localPositionOfR5De75A2 = layoutCoordinates3.mo1947localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo613getHandlePositiondBAh8RU(selection, false));
            long mo1948localToRootMKHz9U = layoutCoordinates3.mo1948localToRootMKHz9U(mo1947localPositionOfR5De75A);
            long mo1948localToRootMKHz9U2 = layoutCoordinates3.mo1948localToRootMKHz9U(mo1947localPositionOfR5De75A2);
            return new Rect(Math.min(Offset.m1297getXimpl(mo1948localToRootMKHz9U), Offset.m1297getXimpl(mo1948localToRootMKHz9U2)), Math.min(Offset.m1298getYimpl(layoutCoordinates3.mo1948localToRootMKHz9U(layoutCoordinates3.mo1947localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m1298getYimpl(layoutCoordinates3.mo1948localToRootMKHz9U(layoutCoordinates3.mo1947localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m1297getXimpl(mo1948localToRootMKHz9U), Offset.m1297getXimpl(mo1948localToRootMKHz9U2)), Math.max(Offset.m1298getYimpl(mo1948localToRootMKHz9U), Offset.m1298getYimpl(mo1948localToRootMKHz9U2)) + ((float) (SelectionHandlesKt.getHandleHeight() * 4.0d)));
        }
        return Rect.INSTANCE.getZero();
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(MapsKt.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
            }
        }
    }

    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo569onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long m629getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo613getHandlePositiondBAh8RU(selection, isStartHandle));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m647setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo1947localPositionOfR5De75A(layoutCoordinates, m629getAdjustedCoordinatesk4lQ0M)));
                SelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m647setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo571onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinates;
                long mo613getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = (Selectable) SelectionManager.this.selectionRegistrar.get_selectableMap().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = (Selectable) SelectionManager.this.selectionRegistrar.get_selectableMap().get(Long.valueOf(selection.getEnd().getSelectableId()));
                if (isStartHandle) {
                    layoutCoordinates = selectable != null ? selectable.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                } else {
                    layoutCoordinates = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                }
                if (isStartHandle) {
                    Intrinsics.checkNotNull(selectable);
                    mo613getHandlePositiondBAh8RU = selectable.mo613getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    mo613getHandlePositiondBAh8RU = selectable2.mo613getHandlePositiondBAh8RU(selection, false);
                }
                long m629getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(mo613getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m648setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo1947localPositionOfR5De75A(layoutCoordinates, m629getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m649setDragTotalDistancek4lQ0M(Offset.INSTANCE.m1308getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo570onDragk4lQ0M(long delta) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m649setDragTotalDistancek4lQ0M(Offset.m1302plusMKHz9U(selectionManager.m655getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long m1302plusMKHz9U = Offset.m1302plusMKHz9U(SelectionManager.this.m654getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m655getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m659updateSelectionRHHTvR4$foundation_release(Offset.m1288boximpl(m1302plusMKHz9U), Offset.m1288boximpl(SelectionManager.this.m654getDragBeginPositionF1C5BW0$foundation_release()), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m648setDragBeginPositionk4lQ0M(m1302plusMKHz9U);
                    SelectionManager.this.m649setDragTotalDistancek4lQ0M(Offset.INSTANCE.m1308getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m647setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m647setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1 function1, Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0 function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SelectionManager$onClearSelectionRequested$1(this, function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public final Offset m646convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m1288boximpl(requireContainerCoordinates$foundation_release().mo1947localPositionOfR5De75A(layoutCoordinates, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m652startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        m658updateSelection3R_tFg$foundation_release(position, position, null, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m659updateSelectionRHHTvR4$foundation_release(Offset newPosition, Offset previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        Selection selection;
        long selectableId;
        Offset m646convertToContainerCoordinatesQ7Q5hAU;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (newPosition == null || (selection = getSelection()) == null) {
            return false;
        }
        if (isStartHandle) {
            selectableId = selection.getEnd().getSelectableId();
        } else {
            selectableId = selection.getStart().getSelectableId();
        }
        Selectable selectable = (Selectable) this.selectionRegistrar.get_selectableMap().get(Long.valueOf(selectableId));
        if (selectable == null) {
            m646convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates);
            m646convertToContainerCoordinatesQ7Q5hAU = m646convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(selectable.mo613getHandlePositiondBAh8RU(selection, !isStartHandle)));
        }
        if (m646convertToContainerCoordinatesQ7Q5hAU == null) {
            return false;
        }
        long packedValue = m646convertToContainerCoordinatesQ7Q5hAU.getPackedValue();
        long packedValue2 = isStartHandle ? newPosition.getPackedValue() : packedValue;
        if (!isStartHandle) {
            packedValue = newPosition.getPackedValue();
        }
        return m658updateSelection3R_tFg$foundation_release(packedValue2, packedValue, previousPosition, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m658updateSelection3R_tFg$foundation_release(long startHandlePosition, long endHandlePosition, Offset previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m647setCurrentDragPosition_kEHs6E(isStartHandle ? Offset.m1288boximpl(startHandlePosition) : Offset.m1288boximpl(endHandlePosition));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        int i = 0;
        boolean z = false;
        while (i < size) {
            Selectable selectable = (Selectable) sort.get(i);
            int i2 = i;
            Selection selection2 = selection;
            Pair mo615updateSelectionqCDeeow = selectable.mo615updateSelectionqCDeeow(startHandlePosition, endHandlePosition, previousHandlePosition, isStartHandle, requireContainerCoordinates$foundation_release(), adjustment, (Selection) this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection selection3 = (Selection) mo615updateSelectionqCDeeow.component1();
            z = z || ((Boolean) mo615updateSelectionqCDeeow.component2()).booleanValue();
            if (selection3 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection3);
            }
            selection = SelectionManagerKt.merge(selection2, selection3);
            i = i2 + 1;
        }
        Selection selection4 = selection;
        if (!Intrinsics.areEqual(selection4, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection4);
        }
        return z;
    }
}
