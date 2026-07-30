package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"getTextBeforeSelection", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "maxChars", "", "getTextAfterSelection", "getSelectedText", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m6968getMinimpl = TextRange.m6968getMinimpl(textFieldValue.getSelection());
        int i2 = m6968getMinimpl - i;
        if (((i ^ m6968getMinimpl) & (m6968getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return annotatedString.subSequence(Math.max(0, i2), TextRange.m6968getMinimpl(textFieldValue.getSelection()));
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m6967getMaximpl = TextRange.m6967getMaximpl(textFieldValue.getSelection());
        int m6967getMaximpl2 = TextRange.m6967getMaximpl(textFieldValue.getSelection());
        int i2 = m6967getMaximpl2 + i;
        if (((i ^ i2) & (m6967getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldValue.getText().length();
        }
        return annotatedString.subSequence(m6967getMaximpl, Math.min(i2, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m6805subSequence5zctL8(textFieldValue.getSelection());
    }
}
