package R0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.J;
import com.clutchquizarena.app.MainActivity;
import com.clutchquizarena.app.ResultActivity;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import r0.C0332m;
import r0.C0336q;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f651b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i, Object obj) {
        this.f650a = i;
        this.f651b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f651b;
        switch (this.f650a) {
            case 0:
                e eVar = (e) obj;
                EditText editText = eVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eVar.q();
                return;
            case 1:
                ((k) obj).u();
                return;
            case 2:
                x xVar = (x) obj;
                EditText editText2 = xVar.f754f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f754f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f754f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f754f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f754f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
            case 4:
                int i = MainActivity.f1718A;
                MainActivity mainActivity = (MainActivity) obj;
                AbstractC0299s.h(J.e(mainActivity), AbstractC0305y.f3370b, new C0332m(mainActivity, null));
                return;
            default:
                int i2 = ResultActivity.f1721A;
                ResultActivity resultActivity = (ResultActivity) obj;
                AbstractC0299s.h(J.e(resultActivity), AbstractC0305y.f3370b, new C0336q(resultActivity, null));
                return;
        }
    }
}
