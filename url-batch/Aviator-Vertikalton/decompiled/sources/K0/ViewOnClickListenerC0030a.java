package K0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.fortuneink.neonpad.RulesActivity;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0030a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f531b;

    public /* synthetic */ ViewOnClickListenerC0030a(int i, Object obj) {
        this.f530a = i;
        this.f531b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f530a) {
            case 0:
                C0034e c0034e = (C0034e) this.f531b;
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
                ((l) this.f531b).u();
                return;
            case 2:
                y yVar = (y) this.f531b;
                EditText editText2 = yVar.f640f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f640f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f640f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f640f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f640f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                ((RulesActivity) this.f531b).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.f531b).D();
                throw null;
        }
    }
}
