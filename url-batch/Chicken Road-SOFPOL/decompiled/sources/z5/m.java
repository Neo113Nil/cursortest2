package z5;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f9212a;

    public m(o oVar) {
        this.f9212a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f9212a;
        l lVar = oVar.f9237y;
        if (oVar.f9234v == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f9234v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (oVar.f9234v.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f9234v.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f9234v = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        oVar.b().l(oVar.f9234v);
        oVar.j(oVar.b());
    }
}
