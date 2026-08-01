package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.derinko.gbini.n1casino.MainActivity2;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class qa implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qa(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ua uaVar = (ua) obj;
                EditText editText = uaVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    uaVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                uaVar.p();
                return;
            case 1:
                ((rg) obj).t();
                return;
            case 2:
                int i2 = MainActivity2.J;
                ((MainActivity2) obj).r(null);
                return;
            case 3:
                ((xs) obj).L();
                throw null;
            default:
                qw qwVar = (qw) obj;
                EditText editText2 = qwVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = qwVar.f;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = qwVar.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    qwVar.f.setSelection(selectionEnd);
                }
                qwVar.p();
                return;
        }
    }
}
