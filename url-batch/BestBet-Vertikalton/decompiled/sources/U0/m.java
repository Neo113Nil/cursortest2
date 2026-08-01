package U0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1164a;

    public m(p pVar) {
        this.f1164a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f1164a;
        if (pVar.f1185s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f1185s;
        l lVar = pVar.f1188v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f1185s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f1185s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f1185s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f1185s);
        pVar.j(pVar.b());
    }
}
