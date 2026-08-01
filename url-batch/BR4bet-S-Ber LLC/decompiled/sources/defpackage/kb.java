package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class kb implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kb(int i, Object obj) {
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
                ob obVar = (ob) obj;
                EditText editText = obVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    obVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                obVar.p();
                return;
            case 1:
                ((si) obj).t();
                return;
            case 2:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                int i2 = MainActivity2.H;
                if (mainActivity2.k().B("AddEditNoteSheet") != null) {
                    return;
                }
                d2 d2Var = new d2();
                en k = mainActivity2.k();
                d2Var.l0 = false;
                d2Var.m0 = true;
                k.getClass();
                o7 o7Var = new o7(k);
                o7Var.o = true;
                o7Var.e(0, d2Var, "AddEditNoteSheet", 1);
                o7Var.d(false);
                return;
            case 3:
                ((yv) obj).L();
                throw null;
            default:
                uz uzVar = (uz) obj;
                EditText editText2 = uzVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = uzVar.f;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    z = true;
                }
                EditText editText4 = uzVar.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    uzVar.f.setSelection(selectionEnd);
                }
                uzVar.p();
                return;
        }
    }
}
