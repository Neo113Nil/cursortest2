package N0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f672a;

    public n(q qVar) {
        this.f672a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f672a;
        if (qVar.f694s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f694s;
        m mVar = qVar.f697v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f694s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f694s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f694s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f694s);
        qVar.j(qVar.b());
    }
}
