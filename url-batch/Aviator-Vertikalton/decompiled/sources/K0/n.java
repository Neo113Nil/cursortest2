package K0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f565a;

    public n(q qVar) {
        this.f565a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f565a;
        if (qVar.f588s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f588s;
        m mVar = qVar.f591v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f588s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f588s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f588s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f588s);
        qVar.j(qVar.b());
    }
}
