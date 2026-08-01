package Q0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1036a;

    public n(q qVar) {
        this.f1036a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f1036a;
        if (qVar.f1058s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f1058s;
        m mVar = qVar.f1061v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f1058s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f1058s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f1058s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f1058s);
        qVar.j(qVar.b());
    }
}
