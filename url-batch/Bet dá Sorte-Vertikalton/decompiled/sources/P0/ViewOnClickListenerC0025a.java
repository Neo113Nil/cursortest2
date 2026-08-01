package P0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.glasspulse.glasspulse.RulesActivity;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f589b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i, Object obj) {
        this.f588a = i;
        this.f589b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f589b;
        switch (this.f588a) {
            case 0:
                C0029e c0029e = (C0029e) obj;
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
                ((k) obj).u();
                return;
            case 2:
                x xVar = (x) obj;
                EditText editText2 = xVar.f692f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f692f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f692f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f692f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f692f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
            default:
                int i = RulesActivity.f1613z;
                ((RulesActivity) obj).finish();
                return;
        }
    }
}
