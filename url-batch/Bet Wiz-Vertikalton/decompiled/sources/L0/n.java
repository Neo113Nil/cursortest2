package L0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f587a;

    public n(q qVar) {
        this.f587a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f587a;
        if (qVar.f608s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f608s;
        m mVar = qVar.f611v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f608s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f608s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f608s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f608s);
        qVar.j(qVar.b());
    }
}
