package j2;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2286f;
    public final /* synthetic */ s g;

    public /* synthetic */ a(s sVar, int i4) {
        this.f2286f = i4;
        this.g = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2286f) {
            case 0:
                e eVar = (e) this.g;
                EditText editText = eVar.f2305i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        eVar.f2305i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    eVar.p();
                    break;
                }
                break;
            case 1:
                ((m) this.g).t();
                break;
            default:
                y yVar = (y) this.g;
                EditText editText2 = yVar.f2398f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = yVar.f2398f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        yVar.f2398f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        yVar.f2398f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        yVar.f2398f.setSelection(selectionEnd);
                    }
                    yVar.p();
                    break;
                }
                break;
        }
    }
}
