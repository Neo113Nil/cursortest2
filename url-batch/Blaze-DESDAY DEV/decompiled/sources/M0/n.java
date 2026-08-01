package M0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f615a;

    public n(q qVar) {
        this.f615a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f615a;
        if (qVar.f636s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f636s;
        m mVar = qVar.f639v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f636s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f636s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f636s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f636s);
        qVar.j(qVar.b());
    }
}
