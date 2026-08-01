package o1;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.gdmhkmf.belbet.MainActivity2;
import s2.v;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2894g;

    public /* synthetic */ e(int i, Object obj) {
        this.f2893f = i;
        this.f2894g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2893f;
        Object obj = this.f2894g;
        switch (i) {
            case 0:
                ((g.f) obj).dismiss();
                break;
            case 1:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                int i4 = MainActivity2.M;
                new a4.h(mainActivity2, null, new k(mainActivity2, 5)).g();
                break;
            case 2:
                s2.d dVar = (s2.d) obj;
                EditText editText = dVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        dVar.i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    dVar.p();
                    break;
                }
                break;
            case 3:
                ((s2.k) obj).t();
                break;
            default:
                v vVar = (v) obj;
                EditText editText2 = vVar.f3335f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = vVar.f3335f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        vVar.f3335f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        vVar.f3335f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        vVar.f3335f.setSelection(selectionEnd);
                    }
                    vVar.p();
                    break;
                }
                break;
        }
    }
}
