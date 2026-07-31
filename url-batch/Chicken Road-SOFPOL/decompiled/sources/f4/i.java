package f4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import d4.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f2732d;

    /* renamed from: e, reason: collision with root package name */
    public h f2733e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2734f = true;

    public i(EditText editText) {
        this.f2732d = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a8 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a8.getClass();
                length = editableText.length();
            }
            a8.f(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        EditText editText = this.f2732d;
        if (!editText.isInEditMode() && this.f2734f && l.c() && i8 <= i9 && (charSequence instanceof Spannable)) {
            int b8 = l.a().b();
            if (b8 != 0) {
                if (b8 == 1) {
                    l.a().f(i, i9 + i, 0, (Spannable) charSequence);
                    return;
                } else if (b8 != 3) {
                    return;
                }
            }
            l a8 = l.a();
            if (this.f2733e == null) {
                this.f2733e = new h(editText);
            }
            a8.g(this.f2733e);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }
}
