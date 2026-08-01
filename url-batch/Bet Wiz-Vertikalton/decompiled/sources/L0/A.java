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
    public int f544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f546c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f546c = textInputLayout;
        this.f545b = editText;
        this.f544a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f546c;
        textInputLayout.u(!textInputLayout.f1858A0, false);
        if (textInputLayout.f1898k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1913s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f545b;
        int lineCount = editText.getLineCount();
        int i = this.f544a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f422a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1916t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f544a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
