package w0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final EditText f3573f;

    /* renamed from: g, reason: collision with root package name */
    public i f3574g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3575h = true;

    public j(EditText editText) {
        this.f3573f = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a2 = l.a();
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
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        EditText editText = this.f3573f;
        if (editText.isInEditMode() || !this.f3575h || l.f332k == null || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b4 = l.a().b();
        if (b4 != 0) {
            if (b4 == 1) {
                l.a().e((Spannable) charSequence, i, i5 + i);
                return;
            } else if (b4 != 3) {
                return;
            }
        }
        l a2 = l.a();
        if (this.f3574g == null) {
            this.f3574g = new i(editText);
        }
        a2.f(this.f3574g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
