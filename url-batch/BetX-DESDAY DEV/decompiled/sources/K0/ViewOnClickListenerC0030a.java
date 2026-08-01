package K0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0030a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f532b;

    public /* synthetic */ ViewOnClickListenerC0030a(int i, Object obj) {
        this.f531a = i;
        this.f532b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f531a) {
            case 0:
                C0034e c0034e = (C0034e) this.f532b;
                EditText editText = c0034e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0034e.q();
                return;
            case 1:
                ((l) this.f532b).u();
                return;
            case 2:
                y yVar = (y) this.f532b;
                EditText editText2 = yVar.f641f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f641f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f641f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f641f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f641f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.f532b).D();
                throw null;
        }
    }
}
