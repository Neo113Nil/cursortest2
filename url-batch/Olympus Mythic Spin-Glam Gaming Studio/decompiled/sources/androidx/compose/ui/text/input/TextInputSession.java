package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "", "dispose", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", "newValue", "", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)Z", "showSoftwareKeyboard", "()Z", "Landroidx/compose/ui/text/input/TextInputService;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "isOpen", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextInputSession {
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    public final boolean isOpen() {
        return Intrinsics.areEqual(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(TextFieldValue oldValue, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(oldValue, newValue);
        }
        return isOpen;
    }
}
