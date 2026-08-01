package j2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f2332a;

    public p(r rVar) {
        this.f2332a = rVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        r rVar = this.f2332a;
        o oVar = rVar.A;
        if (rVar.f2352x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = rVar.f2352x;
        if (editText != null) {
            editText.removeTextChangedListener(oVar);
            if (rVar.f2352x.getOnFocusChangeListener() == rVar.b().e()) {
                rVar.f2352x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        rVar.f2352x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(oVar);
        }
        rVar.b().l(rVar.f2352x);
        rVar.k(rVar.b());
    }
}
