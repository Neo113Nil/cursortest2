package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010#\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020 H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010)\u001a\u00020\u0012H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\u0012H\u0000¢\u0006\u0004\b*\u0010(J!\u00100\u001a\u00020\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u0019\u00104\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u000eH\u0000¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u00020\u0012H\u0000¢\u0006\u0004\b5\u0010(J\u000f\u00108\u001a\u00020\u0012H\u0000¢\u0006\u0004\b7\u0010(J\u000f\u0010:\u001a\u00020\u0012H\u0000¢\u0006\u0004\b9\u0010(J \u0010=\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b;\u0010<J \u0010B\u001a\u00020,2\u0006\u0010?\u001a\u00020>H\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020\u0012H\u0000¢\u0006\u0004\bC\u0010(J\u000f\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bE\u0010(J\u000f\u0010I\u001a\u00020\u000eH\u0000¢\u0006\u0004\bG\u0010HR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR.\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\\\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR+\u0010\n\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R/\u0010\u008f\u0001\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010d\u001a\u0005\b\u008d\u0001\u0010H\"\u0005\b\u008e\u0001\u00103R\"\u0010\u0090\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0094\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R7\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010b\u001a\u0005\u0018\u00010\u0095\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0096\u0001\u0010d\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R=\u0010 \u0001\u001a\u0004\u0018\u00010,2\b\u0010b\u001a\u0004\u0018\u00010,8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u009c\u0001\u0010d\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010/R\u0019\u0010¡\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010£\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010%R \u0010§\u0001\u001a\u00030¦\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006«\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "transformedStartOffset", "transformedEndOffset", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "updateSelection", "(Landroidx/compose/ui/text/input/TextFieldValue;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "Landroidx/compose/foundation/text/HandleState;", "handleState", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", DivActionHandler.DivActionReason.SELECTION, "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "enterSelectionMode$foundation_release", "()V", "enterSelectionMode", "exitSelectionMode$foundation_release", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "(Z)V", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "editable$delegate", "getEditable", "setEditable", "editable", "dragBeginPosition", "J", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private TextFieldValue oldValue;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private OffsetMapping offsetMapping = OffsetMapping.INSTANCE.getIdentity();
    private Function1 onValueChange = new Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
        public final void invoke(@NotNull TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return Unit.INSTANCE;
        }
    };

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
    private VisualTransformation visualTransformation = VisualTransformation.INSTANCE.getNone();

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m1308getZeroF1C5BW0();
        this.dragTotalDistance = companion.m1308getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo569onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo571onStartk4lQ0M(long startPoint) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m685createTextFieldValueFDrldGo;
                long j;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                if (TextFieldSelectionManager.this.getDraggingHandle() != null) {
                    return;
                }
                TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                TextFieldState state2 = TextFieldSelectionManager.this.getState();
                if ((state2 == null || (layoutResult3 = state2.getLayoutResult()) == null || !layoutResult3.m602isPositionOnTextk4lQ0M(startPoint)) && (state = TextFieldSelectionManager.this.getState()) != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    int transformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult, layoutResult.getLineForVerticalPosition(Offset.m1298getYimpl(startPoint)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
                    }
                    m685createTextFieldValueFDrldGo = textFieldSelectionManager.m685createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getText(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange().invoke(m685createTextFieldValueFDrldGo);
                    return;
                }
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                TextFieldState state3 = TextFieldSelectionManager.this.getState();
                if (state3 != null && (layoutResult2 = state3.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    int m599getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m599getOffsetForPosition3MmeM6k$default(layoutResult2, startPoint, false, 2, null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), m599getOffsetForPosition3MmeM6k$default, m599getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(m599getOffsetForPosition3MmeM6k$default);
                }
                TextFieldSelectionManager.this.dragBeginPosition = startPoint;
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                j = textFieldSelectionManager3.dragBeginPosition;
                textFieldSelectionManager3.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(j));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m1308getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo570onDragk4lQ0M(long delta) {
                long j;
                TextLayoutResultProxy layoutResult;
                long j2;
                long j3;
                Integer num;
                long j4;
                int m601getOffsetForPosition3MmeM6k;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1302plusMKHz9U(j, delta);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j2 = textFieldSelectionManager2.dragBeginPosition;
                    j3 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(Offset.m1302plusMKHz9U(j2, j3)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num != null) {
                        m601getOffsetForPosition3MmeM6k = num.intValue();
                    } else {
                        j4 = textFieldSelectionManager2.dragBeginPosition;
                        m601getOffsetForPosition3MmeM6k = layoutResult.m601getOffsetForPosition3MmeM6k(j4, false);
                    }
                    int i = m601getOffsetForPosition3MmeM6k;
                    Offset m689getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m689getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m689getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i, layoutResult.m601getOffsetForPosition3MmeM6k(m689getCurrentDragPosition_m7T9E.getPackedValue(), false), false, SelectionAdjustment.INSTANCE.getWord());
                }
                TextFieldState state2 = TextFieldSelectionManager.this.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m687setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo573onExtendk4lQ0M(long downPosition) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2249getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), TextLayoutResultProxy.m599getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo574onExtendDragk4lQ0M(long dragPosition) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2249getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), layoutResult.m601getOffsetForPosition3MmeM6k(dragPosition, false), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo575onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                long j;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = downPosition;
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m599getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null));
                j = textFieldSelectionManager.dragBeginPosition;
                int m599getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m599getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), m599getOffsetForPosition3MmeM6k$default, m599getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo572onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                Integer num;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int m601getOffsetForPosition3MmeM6k = layoutResult.m601getOffsetForPosition3MmeM6k(dragPosition, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                num = textFieldSelectionManager.dragBeginOffsetInText;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), m601getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }
        };
    }

    /* renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    /* renamed from: getOnValueChange$foundation_release, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    /* renamed from: getState$foundation_release, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
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
    public final void m687setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m689getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    /* renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo569onDownk4lQ0M(long point) {
                TextFieldSelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m691getHandlePositiontuRUvjQ$foundation_release(isStartHandle))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m687setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo571onStartk4lQ0M(long startPoint) {
                long j;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m691getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(j));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m1308getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null) {
                    return;
                }
                state.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo570onDragk4lQ0M(long delta) {
                long j;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j2;
                long j3;
                int originalToTransformed;
                int m2234getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1302plusMKHz9U(j, delta);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    boolean z = isStartHandle;
                    j2 = textFieldSelectionManager2.dragBeginPosition;
                    j3 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(Offset.m1302plusMKHz9U(j2, j3)));
                    if (z) {
                        Offset m689getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m689getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m689getCurrentDragPosition_m7T9E);
                        originalToTransformed = value.m2234getOffsetForPositionk4lQ0M(m689getCurrentDragPosition_m7T9E.getPackedValue());
                    } else {
                        originalToTransformed = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m2249getStartimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    }
                    int i = originalToTransformed;
                    if (z) {
                        m2234getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m2244getEndimpl(textFieldSelectionManager2.getValue$foundation_release().getSelection()));
                    } else {
                        Offset m689getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m689getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m689getCurrentDragPosition_m7T9E2);
                        m2234getOffsetForPositionk4lQ0M = value.m2234getOffsetForPositionk4lQ0M(m689getCurrentDragPosition_m7T9E2.getPackedValue());
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i, m2234getOffsetForPositionk4lQ0M, z, SelectionAdjustment.INSTANCE.getCharacter());
                }
                TextFieldState state2 = TextFieldSelectionManager.this.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m687setCurrentDragPosition_kEHs6E(null);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo569onDownk4lQ0M(long point) {
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m691getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m687setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo571onStartk4lQ0M(long startPoint) {
                long j;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m629getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m691getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(j));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m1308getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo570onDragk4lQ0M(long delta) {
                long j;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j2;
                long j3;
                TextFieldValue m685createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1302plusMKHz9U(j, delta);
                TextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragBeginPosition;
                j3 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m687setCurrentDragPosition_kEHs6E(Offset.m1288boximpl(Offset.m1302plusMKHz9U(j2, j3)));
                Offset m689getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m689getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(m689getCurrentDragPosition_m7T9E);
                int m2234getOffsetForPositionk4lQ0M = value.m2234getOffsetForPositionk4lQ0M(m689getCurrentDragPosition_m7T9E.getPackedValue());
                long TextRange = TextRangeKt.TextRange(m2234getOffsetForPositionk4lQ0M, m2234getOffsetForPositionk4lQ0M);
                if (TextRange.m2242equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
                }
                Function1 onValueChange = textFieldSelectionManager2.getOnValueChange();
                m685createTextFieldValueFDrldGo = textFieldSelectionManager2.m685createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getText(), TextRange);
                onValueChange.invoke(m685createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m687setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && !textFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m686deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m688deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m688deselect_kEHs6E$foundation_release(Offset position) {
        HandleState handleState;
        int m2246getMaximpl;
        if (!TextRange.m2243getCollapsedimpl(getValue$foundation_release().getSelection())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
            if (position != null && layoutResult != null) {
                m2246getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m599getOffsetForPosition3MmeM6k$default(layoutResult, position.getPackedValue(), false, 2, null));
            } else {
                m2246getMaximpl = TextRange.m2246getMaximpl(getValue$foundation_release().getSelection());
            }
            this.onValueChange.invoke(TextFieldValue.m2380copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m2246getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (position != null && getValue$foundation_release().getText().length() > 0) {
            handleState = HandleState.Cursor;
        } else {
            handleState = HandleState.None;
        }
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m2243getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int m2246getMaximpl = TextRange.m2246getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m685createTextFieldValueFDrldGo(getValue$foundation_release().getText(), TextRangeKt.TextRange(m2246getMaximpl, m2246getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m2247getMinimpl = TextRange.m2247getMinimpl(getValue$foundation_release().getSelection()) + text.length();
        this.onValueChange.invoke(m685createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m2247getMinimpl, m2247getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m2243getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m2247getMinimpl = TextRange.m2247getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m685createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m2247getMinimpl, m2247getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m685createTextFieldValueFDrldGo = m685createTextFieldValueFDrldGo(getValue$foundation_release().getText(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m685createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m2380copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m685createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setShowFloatingToolbar(true);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m691getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        long selection = getValue$foundation_release().getSelection();
        int m2249getStartimpl = isStartHandle ? TextRange.m2249getStartimpl(selection) : TextRange.m2244getEndimpl(selection);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(m2249getStartimpl), isStartHandle, TextRange.m2248getReversedimpl(getValue$foundation_release().getSelection()));
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m690getCursorPositiontuRUvjQ$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m2249getStartimpl(getValue$foundation_release().getSelection()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo271toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showSelectionToolbar$foundation_release() {
        Function0 function0;
        TextToolbar textToolbar;
        boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
        Function0 function02 = (TextRange.m2243getCollapsedimpl(getValue$foundation_release().getSelection()) || z) ? null : new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m692invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m692invoke() {
                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        };
        Function0 function03 = (TextRange.m2243getCollapsedimpl(getValue$foundation_release().getSelection()) || !getEditable() || z) ? null : new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m693invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m693invoke() {
                TextFieldSelectionManager.this.cut$foundation_release();
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        };
        if (getEditable()) {
            ClipboardManager clipboardManager = this.clipboardManager;
            if ((clipboardManager != null ? clipboardManager.getText() : null) != null) {
                function0 = new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m694invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m694invoke() {
                        TextFieldSelectionManager.this.paste$foundation_release();
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0 function04 = TextRange.m2245getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m695invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m695invoke() {
                        TextFieldSelectionManager.this.selectAll$foundation_release();
                    }
                } : null;
                textToolbar = this.textToolbar;
                if (textToolbar == null) {
                    textToolbar.showMenu(getContentRect(), function02, function0, function03, function04);
                    return;
                }
                return;
            }
        }
        function0 = null;
        Function0 function042 = TextRange.m2245getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m695invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m695invoke() {
                TextFieldSelectionManager.this.selectAll$foundation_release();
            }
        } : null;
        textToolbar = this.textToolbar;
        if (textToolbar == null) {
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float f;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            long m1308getZeroF1C5BW0 = (textFieldState == null || (layoutCoordinates4 = textFieldState.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m1308getZeroF1C5BW0() : layoutCoordinates4.mo1948localToRootMKHz9U(m691getHandlePositiontuRUvjQ$foundation_release(true));
            TextFieldState textFieldState2 = this.state;
            long m1308getZeroF1C5BW02 = (textFieldState2 == null || (layoutCoordinates3 = textFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m1308getZeroF1C5BW0() : layoutCoordinates3.mo1948localToRootMKHz9U(m691getHandlePositiontuRUvjQ$foundation_release(false));
            TextFieldState textFieldState3 = this.state;
            float f2 = 0.0f;
            if (textFieldState3 == null || (layoutCoordinates2 = textFieldState3.getLayoutCoordinates()) == null) {
                f = 0.0f;
            } else {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                f = Offset.m1298getYimpl(layoutCoordinates2.mo1948localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(RangesKt.coerceIn(TextRange.m2249getStartimpl(getValue$foundation_release().getSelection()), 0, Math.max(0, getValue$foundation_release().getText().length() - 1)))) == null) ? 0.0f : cursorRect2.getTop())));
            }
            TextFieldState textFieldState4 = this.state;
            if (textFieldState4 != null && (layoutCoordinates = textFieldState4.getLayoutCoordinates()) != null) {
                TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                f2 = Offset.m1298getYimpl(layoutCoordinates.mo1948localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(RangesKt.coerceIn(TextRange.m2244getEndimpl(getValue$foundation_release().getSelection()), 0, Math.max(0, getValue$foundation_release().getText().length() - 1)))) == null) ? 0.0f : cursorRect.getTop())));
            }
            return new Rect(Math.min(Offset.m1297getXimpl(m1308getZeroF1C5BW0), Offset.m1297getXimpl(m1308getZeroF1C5BW02)), Math.min(f, f2), Math.max(Offset.m1297getXimpl(m1308getZeroF1C5BW0), Offset.m1297getXimpl(m1308getZeroF1C5BW02)), Math.max(Offset.m1298getYimpl(m1308getZeroF1C5BW0), Offset.m1298getYimpl(m1308getZeroF1C5BW02)) + (Dp.m2507constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue value, int transformedStartOffset, int transformedEndOffset, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m2249getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m2244getEndimpl(value.getSelection())));
        TextFieldState textFieldState = this.state;
        long m682getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m682getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), transformedStartOffset, transformedEndOffset, TextRange.m2243getCollapsedimpl(TextRange) ? null : TextRange.m2237boximpl(TextRange), isStartHandle, adjustment);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m2249getStartimpl(m682getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m2244getEndimpl(m682getTextFieldSelectionbb3KNj8)));
        if (TextRange.m2242equalsimpl0(TextRange2, value.getSelection())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo1757performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1765getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m685createTextFieldValueFDrldGo(value.getText(), TextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m685createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
