package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ii {
    public final /* synthetic */ ki a;

    public ii(ki kiVar) {
        this.a = kiVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        ki kiVar = this.a;
        hi hiVar = kiVar.A;
        if (kiVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = kiVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(hiVar);
            if (kiVar.x.getOnFocusChangeListener() == kiVar.b().e()) {
                kiVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        kiVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(hiVar);
        }
        kiVar.b().l(kiVar.x);
        kiVar.k(kiVar.b());
    }
}
