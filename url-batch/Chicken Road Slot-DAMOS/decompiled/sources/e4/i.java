package e4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import c4.k;
import m.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final n f3868d;

    /* renamed from: e, reason: collision with root package name */
    public h f3869e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3870i = true;

    public i(n nVar) {
        this.f3868d = nVar;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a9 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a9.getClass();
                length = editableText.length();
            }
            a9.f(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        n nVar = this.f3868d;
        if (!nVar.isInEditMode() && this.f3870i && k.c() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int b10 = k.a().b();
            if (b10 != 0) {
                if (b10 == 1) {
                    k.a().f(i3, i11 + i3, 0, (Spannable) charSequence);
                    return;
                } else if (b10 != 3) {
                    return;
                }
            }
            k a9 = k.a();
            if (this.f3869e == null) {
                this.f3869e = new h(nVar);
            }
            a9.g(this.f3869e);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
