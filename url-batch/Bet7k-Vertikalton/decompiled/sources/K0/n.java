package K0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f515a;

    public n(q qVar) {
        this.f515a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f515a;
        if (qVar.f536s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f536s;
        m mVar = qVar.f539v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f536s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f536s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f536s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f536s);
        qVar.j(qVar.b());
    }
}
