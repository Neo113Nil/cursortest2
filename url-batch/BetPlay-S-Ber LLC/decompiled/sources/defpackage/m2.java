package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.awerser.monnit.betplay.MainActivity2;
import com.awerser.monnit.betplay.R;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Object obj;
        u40 u40Var;
        String obj2;
        int i = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                n2 n2Var = (n2) obj3;
                h8 h8Var = n2Var.f;
                h8Var.getClass();
                Editable text = ((TextInputEditText) h8Var.h).getText();
                String obj4 = (text == null || (obj2 = text.toString()) == null) ? null : l40.q0(obj2).toString();
                if (obj4 == null) {
                    obj4 = "";
                }
                String str = obj4;
                int length = str.length();
                h8 h8Var2 = n2Var.f;
                if (length == 0) {
                    h8Var2.getClass();
                    ((TextInputLayout) h8Var2.i).setError(n2Var.getString(R.string.error_empty_name));
                    return;
                }
                h8Var2.getClass();
                ((TextInputLayout) h8Var2.i).setError(null);
                h8 h8Var3 = n2Var.f;
                h8Var3.getClass();
                int checkedChipId = ((ChipGroup) h8Var3.g).getCheckedChipId();
                h8 h8Var4 = n2Var.f;
                h8Var4.getClass();
                ChipGroup chipGroup = (ChipGroup) h8Var4.g;
                h8 h8Var5 = n2Var.f;
                h8Var5.getClass();
                int indexOfChild = chipGroup.indexOfChild(((ChipGroup) h8Var5.g).findViewById(checkedChipId));
                if (indexOfChild >= 0) {
                    ei eiVar = m9.j;
                    if (indexOfChild < eiVar.a()) {
                        obj = eiVar.get(indexOfChild);
                        m9 m9Var = (m9) obj;
                        u40Var = n2Var.g;
                        if (u40Var != null) {
                            u40Var.a(new en(null, str, m9Var, 0, null, 0L, 57, null));
                        }
                        n2Var.dismiss();
                        return;
                    }
                }
                obj = m9.h;
                m9 m9Var2 = (m9) obj;
                u40Var = n2Var.g;
                if (u40Var != null) {
                }
                n2Var.dismiss();
                return;
            case 1:
                xa xaVar = (xa) obj3;
                EditText editText = xaVar.i;
                if (editText == null) {
                    return;
                }
                Editable text2 = editText.getText();
                if (view.hasFocus()) {
                    xaVar.i.requestFocus();
                }
                if (text2 != null) {
                    text2.clear();
                }
                xaVar.p();
                return;
            case 2:
                ((jg) obj3).t();
                return;
            case 3:
                MainActivity2 mainActivity2 = (MainActivity2) obj3;
                int i2 = MainActivity2.J;
                n2 n2Var2 = new n2();
                n2Var2.g = new u40(4, mainActivity2);
                n2Var2.show(((kk) mainActivity2.z.g).i, "AddHabitBottomSheet");
                return;
            case 4:
                ((mt) obj3).g();
                throw null;
            default:
                dx dxVar = (dx) obj3;
                EditText editText2 = dxVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = dxVar.f;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = dxVar.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    dxVar.f.setSelection(selectionEnd);
                }
                dxVar.p();
                return;
        }
    }
}
