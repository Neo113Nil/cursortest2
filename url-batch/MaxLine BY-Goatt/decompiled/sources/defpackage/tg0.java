package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tg0 implements TextWatcher {
    public final EditText m;
    public sg0 n;
    public boolean o = true;

    public tg0(EditText editText) {
        this.m = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ag0 a = ag0.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.m;
        if (!editText.isInEditMode() && this.o && ag0.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = ag0.a().c();
            if (c != 0) {
                if (c == 1) {
                    ag0.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            ag0 a = ag0.a();
            if (this.n == null) {
                this.n = new sg0(editText);
            }
            a.h(this.n);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
