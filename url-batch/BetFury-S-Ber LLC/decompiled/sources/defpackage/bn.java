package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bn {
    public final /* synthetic */ dn a;

    public bn(dn dnVar) {
        this.a = dnVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        dn dnVar = this.a;
        an anVar = dnVar.A;
        if (dnVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = dnVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(anVar);
            if (dnVar.x.getOnFocusChangeListener() == dnVar.b().e()) {
                dnVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        dnVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(anVar);
        }
        dnVar.b().l(dnVar.x);
        dnVar.k(dnVar.b());
    }
}
