package L0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f500b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i, Object obj) {
        this.f499a = i;
        this.f500b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f499a) {
            case 0:
                C0029e c0029e = (C0029e) this.f500b;
                EditText editText = c0029e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0029e.q();
                return;
            case 1:
                ((l) this.f500b).u();
                return;
            case 2:
                y yVar = (y) this.f500b;
                EditText editText2 = yVar.f605f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f605f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f605f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f605f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f605f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.f500b).H();
                throw null;
        }
    }
}
