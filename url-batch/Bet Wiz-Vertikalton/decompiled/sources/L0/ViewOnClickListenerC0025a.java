package L0;

import android.content.Intent;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.HomeActivity;
import com.neonpulse.gridlogic.LevelsActivity;
import com.neonpulse.gridlogic.ResultActivity;
import com.neonpulse.gridlogic.RulesActivity;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f553b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i, Object obj) {
        this.f552a = i;
        this.f553b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f553b;
        switch (this.f552a) {
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
                EditText editText2 = yVar.f657f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f657f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f657f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f657f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f657f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                GameplayActivity gameplayActivity = (GameplayActivity) obj;
                CountDownTimer countDownTimer = gameplayActivity.f1970E;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                gameplayActivity.finish();
                return;
            case 4:
                int i = LevelsActivity.f1976A;
                ((LevelsActivity) obj).finish();
                return;
            case 5:
                int i2 = ResultActivity.f1986z;
                ResultActivity resultActivity = (ResultActivity) obj;
                Intent intent = new Intent(resultActivity, (Class<?>) HomeActivity.class);
                intent.addFlags(603979776);
                resultActivity.startActivity(intent);
                resultActivity.finish();
                return;
            case 6:
                int i3 = RulesActivity.f1988z;
                ((RulesActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
