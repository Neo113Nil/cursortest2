package O0;

import M.Q;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f644c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f644c = textInputLayout;
        this.f643b = editText;
        this.f642a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f644c;
        textInputLayout.u(!textInputLayout.f1970A0, false);
        if (textInputLayout.f2009k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2024s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f643b;
        int lineCount = editText.getLineCount();
        int i = this.f642a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = Q.f513a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2027t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f642a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
