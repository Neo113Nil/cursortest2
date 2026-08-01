package U0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.HomeActivity;
import com.fortunequest.neontrack.RulesActivity;
import com.fortunequest.neontrack.VictoryActivity;

/* renamed from: U0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0031a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1131b;

    public /* synthetic */ ViewOnClickListenerC0031a(int i, Object obj) {
        this.f1130a = i;
        this.f1131b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1131b;
        switch (this.f1130a) {
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
                EditText editText2 = xVar.f1234f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f1234f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f1234f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f1234f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f1234f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
            case 4:
                int i = DailyQuestActivity.f2073C;
                ((DailyQuestActivity) obj).finish();
                return;
            case 5:
                int i2 = RulesActivity.f2090z;
                ((RulesActivity) obj).finish();
                return;
            default:
                int i3 = VictoryActivity.f2092z;
                VictoryActivity victoryActivity = (VictoryActivity) obj;
                Intent intent = new Intent(victoryActivity, (Class<?>) HomeActivity.class);
                intent.setFlags(67108864);
                victoryActivity.startActivity(intent);
                victoryActivity.finish();
                return;
        }
    }
}
