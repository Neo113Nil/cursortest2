package O0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f685a;

    public n(q qVar) {
        this.f685a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f685a;
        if (qVar.f706s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f706s;
        m mVar = qVar.f709v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f706s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f706s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f706s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f706s);
        qVar.j(qVar.b());
    }
}
