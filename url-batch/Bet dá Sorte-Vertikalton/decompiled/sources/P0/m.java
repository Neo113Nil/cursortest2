package P0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f622a;

    public m(p pVar) {
        this.f622a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f622a;
        if (pVar.f643s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f643s;
        l lVar = pVar.f646v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f643s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f643s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f643s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f643s);
        pVar.j(pVar.b());
    }
}
