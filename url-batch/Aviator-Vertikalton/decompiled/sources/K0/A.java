package K0;

import K.X;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f522c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f522c = textInputLayout;
        this.f521b = editText;
        this.f520a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f522c;
        textInputLayout.u(!textInputLayout.f1979A0, false);
        if (textInputLayout.f2019k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2034s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f521b;
        int lineCount = editText.getLineCount();
        int i = this.f520a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f418a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2037t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f520a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
