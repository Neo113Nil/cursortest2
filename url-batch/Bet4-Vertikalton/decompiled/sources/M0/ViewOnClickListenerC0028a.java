package M0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.playbag.tripgear.RulesActivity;

/* renamed from: M0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0028a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f564b;

    public /* synthetic */ ViewOnClickListenerC0028a(int i, Object obj) {
        this.f563a = i;
        this.f564b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f564b;
        switch (this.f563a) {
            case 0:
                C0032e c0032e = (C0032e) obj;
                EditText editText = c0032e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0032e.q();
                return;
            case 1:
                ((l) obj).u();
                return;
            case 2:
                y yVar = (y) obj;
                EditText editText2 = yVar.f668f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f668f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f668f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f668f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f668f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = RulesActivity.f2005z;
                ((RulesActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
