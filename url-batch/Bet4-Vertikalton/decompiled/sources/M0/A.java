package M0;

import K.T;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f557c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f557c = textInputLayout;
        this.f556b = editText;
        this.f555a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f557c;
        textInputLayout.u(!textInputLayout.f1882A0, false);
        if (textInputLayout.f1922k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1936s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f556b;
        int lineCount = editText.getLineCount();
        int i = this.f555a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f423a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1939t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f555a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
