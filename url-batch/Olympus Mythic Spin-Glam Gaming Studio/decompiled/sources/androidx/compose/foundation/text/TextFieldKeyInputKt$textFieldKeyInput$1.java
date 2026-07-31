package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TextFieldKeyInputKt$textFieldKeyInput$1 extends Lambda implements Function1 {
    public static final TextFieldKeyInputKt$textFieldKeyInput$1 INSTANCE = new TextFieldKeyInputKt$textFieldKeyInput$1();

    TextFieldKeyInputKt$textFieldKeyInput$1() {
        super(1);
    }

    public final void invoke(@NotNull TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return Unit.INSTANCE;
    }
}
