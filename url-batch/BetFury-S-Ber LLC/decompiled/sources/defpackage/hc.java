package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.trembin.nirefon.betfury.MainActivity2;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hc(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        boolean z = false;
        Object obj = this.g;
        switch (i) {
            case 0:
                lc lcVar = (lc) obj;
                EditText editText = lcVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    lcVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                lcVar.p();
                return;
            case 1:
                ((dl) obj).t();
                return;
            case 2:
                int i2 = MainActivity2.I;
                m2 D = n9.D(null);
                kq kqVar = ((xp) ((MainActivity2) obj).z.g).r;
                D.l0 = false;
                D.m0 = true;
                kqVar.getClass();
                a8 a8Var = new a8(kqVar);
                a8Var.o = true;
                a8Var.e(0, D, "AddEditNoteSheet", 1);
                a8Var.d(false);
                return;
            case 3:
                ((b10) obj).L();
                throw null;
            default:
                l50 l50Var = (l50) obj;
                EditText editText2 = l50Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = l50Var.f;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    z = true;
                }
                EditText editText4 = l50Var.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    l50Var.f.setSelection(selectionEnd);
                }
                l50Var.p();
                return;
        }
    }
}
