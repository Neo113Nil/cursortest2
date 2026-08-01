package x0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final EditText f3853f;

    /* renamed from: g, reason: collision with root package name */
    public h f3854g;
    public boolean h = true;

    public i(EditText editText) {
        this.f3853f = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a5 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a5.getClass();
                length = editableText.length();
            }
            a5.e(editableText, 0, length);
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
        EditText editText = this.f3853f;
        if (editText.isInEditMode() || !this.h || l.f454k == null || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                l.a().e((Spannable) charSequence, i, i5 + i);
                return;
            } else if (b2 != 3) {
                return;
            }
        }
        l a5 = l.a();
        if (this.f3854g == null) {
            this.f3854g = new h(editText);
        }
        a5.f(this.f3854g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
