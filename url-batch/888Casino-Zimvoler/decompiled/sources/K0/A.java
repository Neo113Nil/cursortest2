package K0;

import K.T;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f474c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f474c = textInputLayout;
        this.f473b = editText;
        this.f472a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f474c;
        textInputLayout.u(!textInputLayout.f1755A0, false);
        if (textInputLayout.f1794k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1810s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f473b;
        int lineCount = editText.getLineCount();
        int i = this.f472a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f381a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1813t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f472a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
