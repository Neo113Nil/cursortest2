package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "", "bits", "flag", "", "hasFlag", "(II)Z", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 6;
        if (ImeAction.m2339equalsimpl0(imeAction, companion.m2343getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2347getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2345getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2346getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2348getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2349getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m2339equalsimpl0(imeAction, companion.m2350getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m2339equalsimpl0(imeAction, companion.m2344getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2378getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2371getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2374getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2377getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2379getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2373getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2376getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2375getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m2367equalsimpl0(keyboardType, companion2.m2372getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m2339equalsimpl0(imeOptions.getImeAction(), companion.m2343getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m2357equalsimpl0(capitalization, companion3.m2361getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m2357equalsimpl0(capitalization, companion3.m2364getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m2357equalsimpl0(capitalization, companion3.m2363getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m2249getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m2244getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
