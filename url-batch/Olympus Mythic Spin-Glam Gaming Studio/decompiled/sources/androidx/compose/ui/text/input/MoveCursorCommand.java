package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditCommand.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "amount", "I", "getAmount", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoveCursorCommand implements EditCommand {
    private final int amount;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getCursor$ui_text_release() == -1) {
            buffer.setCursor$ui_text_release(buffer.getSelectionStart());
        }
        int selectionStart = buffer.getSelectionStart();
        String editingBuffer = buffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer, selectionStart);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = findPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer, selectionStart);
                if (findFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = findFollowingBreak;
            }
        }
        buffer.setCursor$ui_text_release(selectionStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) other).amount;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
