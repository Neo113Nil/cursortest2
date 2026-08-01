package t0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final EditText f3375f;
    public h g;
    public boolean h = true;

    public i(EditText editText) {
        this.f3375f = editText;
    }

    public static void a(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a4 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a4.getClass();
                length = editableText.length();
            }
            a4.e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        EditText editText = this.f3375f;
        if (editText.isInEditMode() || !this.h || l.f340k == null || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                l.a().e((Spannable) charSequence, i4, i6 + i4);
                return;
            } else if (b2 != 3) {
                return;
            }
        }
        l a4 = l.a();
        if (this.g == null) {
            this.g = new h(editText);
        }
        a4.f(this.g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
