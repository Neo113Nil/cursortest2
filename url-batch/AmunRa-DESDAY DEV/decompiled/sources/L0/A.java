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
    public int f480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f482c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f482c = textInputLayout;
        this.f481b = editText;
        this.f480a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f482c;
        textInputLayout.u(!textInputLayout.f1790A0, false);
        if (textInputLayout.f1829k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1844s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f481b;
        int lineCount = editText.getLineCount();
        int i = this.f480a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f362a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1847t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f480a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
