package R0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f684a;

    public m(p pVar) {
        this.f684a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f684a;
        if (pVar.f705s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f705s;
        l lVar = pVar.f708v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f705s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f705s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f705s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f705s);
        pVar.j(pVar.b());
    }
}
