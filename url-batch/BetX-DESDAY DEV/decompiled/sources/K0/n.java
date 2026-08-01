package K0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f566a;

    public n(q qVar) {
        this.f566a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f566a;
        if (qVar.f589s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f589s;
        m mVar = qVar.f592v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f589s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f589s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f589s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f589s);
        qVar.j(qVar.b());
    }
}
