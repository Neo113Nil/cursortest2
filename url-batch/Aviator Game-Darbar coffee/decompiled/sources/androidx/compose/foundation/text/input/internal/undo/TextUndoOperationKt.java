package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"undo", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "op", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "redo", "foundation"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer, TextRange.m6970getStartimpl(textUndoOperation.getPreSelection()), TextRange.m6965getEndimpl(textUndoOperation.getPreSelection()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m1327toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer(), 0L, null, null, null, 15, null), true);
    }

    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer, TextRange.m6970getStartimpl(textUndoOperation.getPostSelection()), TextRange.m6965getEndimpl(textUndoOperation.getPostSelection()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m1327toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer(), 0L, null, null, null, 15, null), true);
    }
}
