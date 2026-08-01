package O0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winfour.neondrop.ui.GameActivity;
import com.winfour.neondrop.ui.HomeActivity;
import com.winfour.neondrop.ui.LevelsActivity;
import com.winfour.neondrop.ui.ResultActivity;
import com.winfour.neondrop.ui.RulesActivity;

/* renamed from: O0.a, reason: case insensitive filesystem */
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
                ((l) obj).u();
                return;
            case 2:
                y yVar = (y) obj;
                EditText editText2 = yVar.f755f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f755f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f755f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f755f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f755f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = GameActivity.f2101G;
                ((GameActivity) obj).finish();
                return;
            case 4:
                int i2 = LevelsActivity.f2113A;
                ((LevelsActivity) obj).finish();
                return;
            case 5:
                int i3 = ResultActivity.f2116A;
                ResultActivity resultActivity = (ResultActivity) obj;
                Intent intent = new Intent(resultActivity, (Class<?>) HomeActivity.class);
                intent.setFlags(603979776);
                resultActivity.startActivity(intent);
                resultActivity.finish();
                return;
            case 6:
                int i4 = RulesActivity.f2119z;
                ((RulesActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
