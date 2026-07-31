package z5;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f9179e;

    public /* synthetic */ a(p pVar, int i) {
        this.f9178d = i;
        this.f9179e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9178d) {
            case 0:
                e eVar = (e) this.f9179e;
                EditText editText = eVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.p();
                    break;
                }
                break;
            case 1:
                ((k) this.f9179e).t();
                break;
            default:
                s sVar = (s) this.f9179e;
                EditText editText2 = sVar.f9269f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f9269f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar.f9269f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        sVar.f9269f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        sVar.f9269f.setSelection(selectionEnd);
                    }
                    sVar.p();
                    break;
                }
                break;
        }
    }
}
