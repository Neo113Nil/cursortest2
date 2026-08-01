package M0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f598a;

    public n(q qVar) {
        this.f598a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f598a;
        if (qVar.f619s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f619s;
        m mVar = qVar.f622v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f619s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f619s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f619s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f619s);
        qVar.j(qVar.b());
    }
}
