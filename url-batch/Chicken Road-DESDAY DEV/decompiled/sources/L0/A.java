package L0;

import K.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f493c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f493c = textInputLayout;
        this.f492b = editText;
        this.f491a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f493c;
        textInputLayout.u(!textInputLayout.f1821A0, false);
        if (textInputLayout.f1861k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1876s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f492b;
        int lineCount = editText.getLineCount();
        int i = this.f491a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f369a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1879t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f491a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
