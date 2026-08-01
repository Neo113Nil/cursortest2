package M0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winworm.neongrid.ui.HomeActivity;
import com.winworm.neongrid.ui.LevelsActivity;
import com.winworm.neongrid.ui.ResultActivity;
import com.winworm.neongrid.ui.RulesActivity;

/* renamed from: M0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0028a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f581b;

    public /* synthetic */ ViewOnClickListenerC0028a(int i, Object obj) {
        this.f580a = i;
        this.f581b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f581b;
        switch (this.f580a) {
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
                EditText editText2 = yVar.f685f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f685f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f685f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f685f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f685f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = LevelsActivity.f2054B;
                ((LevelsActivity) obj).finish();
                return;
            case 4:
                int i2 = ResultActivity.f2058z;
                ResultActivity resultActivity = (ResultActivity) obj;
                resultActivity.startActivity(new Intent(resultActivity, (Class<?>) HomeActivity.class));
                resultActivity.finishAffinity();
                return;
            case 5:
                int i3 = RulesActivity.f2060z;
                ((RulesActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
