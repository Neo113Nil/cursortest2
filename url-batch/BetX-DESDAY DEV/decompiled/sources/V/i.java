package V;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f856a;

    /* renamed from: b, reason: collision with root package name */
    public h f857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f858c = true;

    public i(EditText editText) {
        this.f856a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            T.j a2 = T.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(editableText, 0, length);
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
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f856a;
        if (editText.isInEditMode() || !this.f858c || T.j.f789k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b2 = T.j.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                T.j.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (b2 != 3) {
                return;
            }
        }
        T.j a2 = T.j.a();
        if (this.f857b == null) {
            this.f857b = new h(editText);
        }
        a2.f(this.f857b);
    }
}
