package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ade implements TextWatcher {
    public boolean a = true;
    private final EditText b;

    public ade(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.b.isInEditMode() || !this.a) {
            return;
        }
        acv acvVar = acv.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
