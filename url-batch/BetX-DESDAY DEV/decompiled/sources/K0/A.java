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
    public int f521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f523c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f523c = textInputLayout;
        this.f522b = editText;
        this.f521a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f523c;
        textInputLayout.u(!textInputLayout.f1957A0, false);
        if (textInputLayout.f1997k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2012s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f522b;
        int lineCount = editText.getLineCount();
        int i = this.f521a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f419a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2015t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f521a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
