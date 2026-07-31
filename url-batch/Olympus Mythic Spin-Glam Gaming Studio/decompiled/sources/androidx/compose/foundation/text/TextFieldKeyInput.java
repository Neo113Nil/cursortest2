package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001a\u001a\u00020\u0014*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00020\u00142\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b6\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010A\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "apply", "(Ljava/util/List;)V", "(Landroidx/compose/ui/text/input/EditCommand;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "block", "commandExecutionContext", "(Lkotlin/jvm/functions/Function1;)V", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Z", "getEditable", "()Z", "getSingleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/KeyMapping;", "Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextFieldKeyInput {
    private final boolean editable;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final Function1 onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final TextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    public TextFieldKeyInput(TextFieldState state, TextFieldSelectionManager selectionManager, TextFieldValue value, boolean z, boolean z2, TextPreparedSelectionState preparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, KeyMapping keyMapping, Function1 onValueChange) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyMapping = keyMapping;
        this.onValueChange = onValueChange;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, KeyMapping keyMapping, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, textPreparedSelectionState, (i & 64) != 0 ? OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i & 128) != 0 ? null : undoManager, (i & 256) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i & 512) != 0 ? new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void invoke(@NotNull TextFieldValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return Unit.INSTANCE;
            }
        } : function1);
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List list) {
        EditProcessor processor = this.state.getProcessor();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(mutableList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply(CollectionsKt.listOf(editCommand));
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m583typedCommandZmokQxo(KeyEvent event) {
        if (!TextFieldKeyInput_androidKt.m586isTypedEventZmokQxo(event)) {
            return null;
        }
        String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), KeyEvent_androidKt.m1812getUtf16CodePointZmokQxo(event)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().appendCo…              .toString()");
        return new CommitTextCommand(sb, 1);
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m584processZmokQxo(KeyEvent event) {
        final KeyCommand mo533mapZmokQxo;
        Intrinsics.checkNotNullParameter(event, "event");
        CommitTextCommand m583typedCommandZmokQxo = m583typedCommandZmokQxo(event);
        if (m583typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(m583typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m1803equalsimpl0(KeyEvent_androidKt.m1811getTypeZmokQxo(event), KeyEventType.INSTANCE.m1807getKeyDownCS__XNY()) || (mo533mapZmokQxo = this.keyMapping.mo533mapZmokQxo(event)) == null || (mo533mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        commandExecutionContext(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            /* compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    iArr[KeyCommand.COPY.ordinal()] = 1;
                    iArr[KeyCommand.PASTE.ordinal()] = 2;
                    iArr[KeyCommand.CUT.ordinal()] = 3;
                    iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    iArr[KeyCommand.UP.ordinal()] = 10;
                    iArr[KeyCommand.DOWN.ordinal()] = 11;
                    iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    iArr[KeyCommand.HOME.ordinal()] = 18;
                    iArr[KeyCommand.END.ordinal()] = 19;
                    iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    iArr[KeyCommand.TAB.ordinal()] = 27;
                    iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    iArr[KeyCommand.UNDO.ordinal()] = 46;
                    iArr[KeyCommand.REDO.ordinal()] = 47;
                    iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldPreparedSelection) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull TextFieldPreparedSelection commandExecutionContext) {
                TextFieldValue undo;
                Function1 function1;
                TextFieldValue redo;
                Function1 function12;
                Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
                switch (WhenMappings.$EnumSwitchMapping$0[KeyCommand.this.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        commandExecutionContext.collapseLeftOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull TextFieldPreparedSelection collapseLeftOr) {
                                Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
                                collapseLeftOr.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        commandExecutionContext.collapseRightOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull TextFieldPreparedSelection collapseRightOr) {
                                Intrinsics.checkNotNullParameter(collapseRightOr, "$this$collapseRightOr");
                                collapseRightOr.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        commandExecutionContext.moveCursorLeftByWord();
                        break;
                    case 7:
                        commandExecutionContext.moveCursorRightByWord();
                        break;
                    case 8:
                        commandExecutionContext.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        commandExecutionContext.moveCursorNextByParagraph();
                        break;
                    case 10:
                        commandExecutionContext.moveCursorUpByLine();
                        break;
                    case 11:
                        commandExecutionContext.moveCursorDownByLine();
                        break;
                    case 12:
                        commandExecutionContext.moveCursorUpByPage();
                        break;
                    case 13:
                        commandExecutionContext.moveCursorDownByPage();
                        break;
                    case 14:
                        commandExecutionContext.moveCursorToLineStart();
                        break;
                    case 15:
                        commandExecutionContext.moveCursorToLineEnd();
                        break;
                    case 16:
                        commandExecutionContext.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        commandExecutionContext.moveCursorToLineRightSide();
                        break;
                    case 18:
                        commandExecutionContext.moveCursorToHome();
                        break;
                    case 19:
                        commandExecutionContext.moveCursorToEnd();
                        break;
                    case 20:
                        List deleteIfSelectedOr = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr2) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr2, "$this$deleteIfSelectedOr");
                                return new DeleteSurroundingTextCommand(TextRange.m2244getEndimpl(deleteIfSelectedOr2.getSelection()) - deleteIfSelectedOr2.getPrecedingCharacterIndex(), 0);
                            }
                        });
                        if (deleteIfSelectedOr != null) {
                            this.apply(deleteIfSelectedOr);
                            break;
                        }
                        break;
                    case 21:
                        List deleteIfSelectedOr2 = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr3) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr3, "$this$deleteIfSelectedOr");
                                int nextCharacterIndex = deleteIfSelectedOr3.getNextCharacterIndex();
                                if (nextCharacterIndex != -1) {
                                    return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m2244getEndimpl(deleteIfSelectedOr3.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr2 != null) {
                            this.apply(deleteIfSelectedOr2);
                            break;
                        }
                        break;
                    case 22:
                        List deleteIfSelectedOr3 = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr4) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr4, "$this$deleteIfSelectedOr");
                                Integer previousWordOffset = deleteIfSelectedOr4.getPreviousWordOffset();
                                if (previousWordOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m2244getEndimpl(deleteIfSelectedOr4.getSelection()) - previousWordOffset.intValue(), 0);
                            }
                        });
                        if (deleteIfSelectedOr3 != null) {
                            this.apply(deleteIfSelectedOr3);
                            break;
                        }
                        break;
                    case 23:
                        List deleteIfSelectedOr4 = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr5) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr5, "$this$deleteIfSelectedOr");
                                Integer nextWordOffset = deleteIfSelectedOr5.getNextWordOffset();
                                if (nextWordOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m2244getEndimpl(deleteIfSelectedOr5.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr4 != null) {
                            this.apply(deleteIfSelectedOr4);
                            break;
                        }
                        break;
                    case 24:
                        List deleteIfSelectedOr5 = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr6) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr6, "$this$deleteIfSelectedOr");
                                Integer lineStartByOffset = deleteIfSelectedOr6.getLineStartByOffset();
                                if (lineStartByOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m2244getEndimpl(deleteIfSelectedOr6.getSelection()) - lineStartByOffset.intValue(), 0);
                            }
                        });
                        if (deleteIfSelectedOr5 != null) {
                            this.apply(deleteIfSelectedOr5);
                            break;
                        }
                        break;
                    case 25:
                        List deleteIfSelectedOr6 = commandExecutionContext.deleteIfSelectedOr(new Function1() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr7) {
                                Intrinsics.checkNotNullParameter(deleteIfSelectedOr7, "$this$deleteIfSelectedOr");
                                Integer lineEndByOffset = deleteIfSelectedOr7.getLineEndByOffset();
                                if (lineEndByOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m2244getEndimpl(deleteIfSelectedOr7.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr6 != null) {
                            this.apply(deleteIfSelectedOr6);
                            break;
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\n", 1));
                            break;
                        } else {
                            ref$BooleanRef.element = false;
                            break;
                        }
                    case 27:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\t", 1));
                            break;
                        } else {
                            ref$BooleanRef.element = false;
                            break;
                        }
                    case 28:
                        commandExecutionContext.selectAll();
                        break;
                    case 29:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorLeft()).selectMovement();
                        break;
                    case 30:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorRight()).selectMovement();
                        break;
                    case 31:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorLeftByWord()).selectMovement();
                        break;
                    case 32:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorRightByWord()).selectMovement();
                        break;
                    case 33:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorPrevByParagraph()).selectMovement();
                        break;
                    case 34:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorNextByParagraph()).selectMovement();
                        break;
                    case 35:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToLineStart()).selectMovement();
                        break;
                    case 36:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToLineEnd()).selectMovement();
                        break;
                    case 37:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToLineLeftSide()).selectMovement();
                        break;
                    case 38:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToLineRightSide()).selectMovement();
                        break;
                    case 39:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorUpByLine()).selectMovement();
                        break;
                    case 40:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorDownByLine()).selectMovement();
                        break;
                    case 41:
                        commandExecutionContext.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        commandExecutionContext.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToHome()).selectMovement();
                        break;
                    case 44:
                        ((TextFieldPreparedSelection) commandExecutionContext.moveCursorToEnd()).selectMovement();
                        break;
                    case 45:
                        commandExecutionContext.deselect();
                        break;
                    case 46:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(commandExecutionContext.getValue());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (undo = undoManager2.undo()) != null) {
                            function1 = this.onValueChange;
                            function1.invoke(undo);
                            break;
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (redo = undoManager3.redo()) != null) {
                            function12 = this.onValueChange;
                            function12.invoke(redo);
                            break;
                        }
                        break;
                    case 48:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return ref$BooleanRef.element;
    }

    private final void commandExecutionContext(Function1 block) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (TextRange.m2242equalsimpl0(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }
}
