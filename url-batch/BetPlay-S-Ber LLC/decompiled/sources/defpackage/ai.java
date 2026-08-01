package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ai {
    public final /* synthetic */ ci a;

    public ai(ci ciVar) {
        this.a = ciVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        ci ciVar = this.a;
        zh zhVar = ciVar.A;
        if (ciVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = ciVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(zhVar);
            if (ciVar.x.getOnFocusChangeListener() == ciVar.b().e()) {
                ciVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        ciVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(zhVar);
        }
        ciVar.b().l(ciVar.x);
        ciVar.k(ciVar.b());
    }
}
