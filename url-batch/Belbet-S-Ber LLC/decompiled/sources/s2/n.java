package s2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f3269a;

    public n(p pVar) {
        this.f3269a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f3269a;
        m mVar = pVar.A;
        if (pVar.f3289x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f3289x;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (pVar.f3289x.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f3289x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f3289x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        pVar.b().l(pVar.f3289x);
        pVar.k(pVar.b());
    }
}
