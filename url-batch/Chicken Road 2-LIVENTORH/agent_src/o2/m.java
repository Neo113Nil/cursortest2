package o2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f2907a;

    public m(o oVar) {
        this.f2907a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f2907a;
        l lVar = oVar.A;
        if (oVar.f2928x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f2928x;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (oVar.f2928x.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f2928x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f2928x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        oVar.b().l(oVar.f2928x);
        oVar.j(oVar.b());
    }
}
