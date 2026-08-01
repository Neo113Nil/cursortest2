package L0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f535a;

    public n(q qVar) {
        this.f535a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f535a;
        if (qVar.f556s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f556s;
        m mVar = qVar.f559v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f556s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f556s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f556s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f556s);
        qVar.j(qVar.b());
    }
}
