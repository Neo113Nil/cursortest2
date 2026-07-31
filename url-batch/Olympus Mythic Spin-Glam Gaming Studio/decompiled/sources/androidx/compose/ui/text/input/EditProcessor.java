package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import com.yandex.div.core.timer.TimerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditProcessor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", TimerController.RESET_COMMAND, "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "apply", "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "<set-?>", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EditProcessor {
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m2254getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getText(), this.mBufferState.getSelection(), null);

    public final TextFieldValue apply(List editCommands) {
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i = 0; i < size; i++) {
            ((EditCommand) editCommands.get(i)).applyTo(this.mBuffer);
        }
        TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m2334getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m2333getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
        this.mBufferState = textFieldValue;
        return textFieldValue;
    }

    public final void reset(TextFieldValue value, TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean areEqual = Intrinsics.areEqual(value.getComposition(), this.mBuffer.m2333getCompositionMzsxiRA$ui_text_release());
        boolean z = true;
        boolean z2 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getText(), value.getText())) {
            this.mBuffer = new EditingBuffer(value.getText(), value.getSelection(), null);
        } else if (TextRange.m2242equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m2247getMinimpl(value.getSelection()), TextRange.m2246getMaximpl(value.getSelection()));
            z2 = true;
            z = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m2243getCollapsedimpl(value.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m2247getMinimpl(value.getComposition().getPackedValue()), TextRange.m2246getMaximpl(value.getComposition().getPackedValue()));
        }
        if (z || (!z2 && !areEqual)) {
            this.mBuffer.commitComposition$ui_text_release();
            value = TextFieldValue.m2380copy3r_uNRQ$default(value, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    /* renamed from: toTextFieldValue, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }
}
