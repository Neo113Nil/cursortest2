package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nk {
    public final /* synthetic */ pk a;

    public nk(pk pkVar) {
        this.a = pkVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        pk pkVar = this.a;
        mk mkVar = pkVar.A;
        if (pkVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pkVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(mkVar);
            if (pkVar.x.getOnFocusChangeListener() == pkVar.b().e()) {
                pkVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pkVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mkVar);
        }
        pkVar.b().l(pkVar.x);
        pkVar.k(pkVar.b());
    }
}
