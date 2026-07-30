package W;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f2782d;

    /* renamed from: e, reason: collision with root package name */
    public h f2783e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2784i = true;

    public i(EditText editText) {
        this.f2782d = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            U.j a7 = U.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a7.getClass();
                length = editableText.length();
            }
            a7.e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        EditText editText = this.f2782d;
        if (editText.isInEditMode() || !this.f2784i || U.j.j == null || i5 > i7 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b7 = U.j.a().b();
        if (b7 != 0) {
            if (b7 == 1) {
                U.j.a().e((Spannable) charSequence, i2, i7 + i2);
                return;
            } else if (b7 != 3) {
                return;
            }
        }
        U.j a7 = U.j.a();
        if (this.f2783e == null) {
            this.f2783e = new h(editText);
        }
        a7.f(this.f2783e);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
    }
}
