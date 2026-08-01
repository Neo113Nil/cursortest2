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
    public int f572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f574c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f574c = textInputLayout;
        this.f573b = editText;
        this.f572a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f574c;
        textInputLayout.u(!textInputLayout.f1914A0, false);
        if (textInputLayout.f1954k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1969s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f573b;
        int lineCount = editText.getLineCount();
        int i = this.f572a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f440a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1972t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f572a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
