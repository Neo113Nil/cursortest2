package N0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winfour.winrandom.ui.HistoryActivity;
import com.winfour.winrandom.ui.RulesActivity;

/* renamed from: N0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0028a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f636b;

    public /* synthetic */ ViewOnClickListenerC0028a(int i, Object obj) {
        this.f635a = i;
        this.f636b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f636b;
        switch (this.f635a) {
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
                EditText editText2 = yVar.f745f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f745f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f745f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f745f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f745f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 3:
                int i = HistoryActivity.f2109B;
                ((HistoryActivity) obj).finish();
                return;
            case 4:
                int i2 = RulesActivity.f2126z;
                ((RulesActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
