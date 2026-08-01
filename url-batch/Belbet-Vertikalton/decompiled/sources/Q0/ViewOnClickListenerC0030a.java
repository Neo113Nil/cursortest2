package Q0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winpower.neonfit.DashboardActivity;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.TargetCrashActivity;

/* renamed from: Q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0030a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1005b;

    public /* synthetic */ ViewOnClickListenerC0030a(int i, Object obj) {
        this.f1004a = i;
        this.f1005b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1005b;
        switch (this.f1004a) {
            case 0:
                C0034e c0034e = (C0034e) obj;
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
                ((l) obj).u();
                return;
            case 2:
                y yVar = (y) obj;
                EditText editText2 = yVar.f1106f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f1106f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f1106f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f1106f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f1106f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = FoodLogActivity.f2599A;
                ((FoodLogActivity) obj).finish();
                return;
            case 4:
                int i2 = TargetCrashActivity.f2613z;
                TargetCrashActivity targetCrashActivity = (TargetCrashActivity) obj;
                Intent intent = new Intent(targetCrashActivity, (Class<?>) DashboardActivity.class);
                intent.setFlags(67108864);
                targetCrashActivity.startActivity(intent);
                targetCrashActivity.finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
