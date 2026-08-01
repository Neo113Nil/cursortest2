package R0;

import K.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f765c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f765c = textInputLayout;
        this.f764b = editText;
        this.f763a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f765c;
        textInputLayout.u(!textInputLayout.f1966A0, false);
        if (textInputLayout.f2006k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2020s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f764b;
        int lineCount = editText.getLineCount();
        int i = this.f763a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f365a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2023t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f763a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
