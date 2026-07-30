package F3;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: F3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0307a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1016n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1017u;

    public /* synthetic */ ViewOnClickListenerC0307a(int i, Object obj) {
        this.f1016n = i;
        this.f1017u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1016n) {
            case 0:
                C0311e c0311e = (C0311e) this.f1017u;
                EditText editText = c0311e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0311e.q();
                return;
            case 1:
                ((m) this.f1017u).u();
                return;
            case 2:
                z zVar = (z) this.f1017u;
                EditText editText2 = zVar.f1135f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = zVar.f1135f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    zVar.f1135f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    zVar.f1135f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    zVar.f1135f.setSelection(selectionEnd);
                }
                zVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.f1017u).E();
                throw null;
        }
    }
}
