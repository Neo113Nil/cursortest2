package N0;

import L.T;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f629c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f629c = textInputLayout;
        this.f628b = editText;
        this.f627a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f629c;
        textInputLayout.u(!textInputLayout.A0, false);
        if (textInputLayout.f2030k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2044s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f628b;
        int lineCount = editText.getLineCount();
        int i = this.f627a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f490a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2047t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f627a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
