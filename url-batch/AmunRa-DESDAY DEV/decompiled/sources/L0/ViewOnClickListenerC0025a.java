package L0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.visualfortune.eyerest.GuideActivity;
import com.visualfortune.eyerest.HomeActivity;
import com.visualfortune.eyerest.RoutinesActivity;
import com.visualfortune.eyerest.SessionCompleteActivity;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f489b;

    public /* synthetic */ ViewOnClickListenerC0025a(int i, Object obj) {
        this.f488a = i;
        this.f489b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f489b;
        switch (this.f488a) {
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
                EditText editText2 = yVar.f593f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f593f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f593f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f593f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f593f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = GuideActivity.f1923z;
                ((GuideActivity) obj).finish();
                return;
            case 4:
                int i2 = RoutinesActivity.f1935z;
                ((RoutinesActivity) obj).finish();
                return;
            case 5:
                int i3 = SessionCompleteActivity.f1946z;
                SessionCompleteActivity sessionCompleteActivity = (SessionCompleteActivity) obj;
                sessionCompleteActivity.startActivity(new Intent(sessionCompleteActivity, (Class<?>) HomeActivity.class).addFlags(603979776));
                sessionCompleteActivity.finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
