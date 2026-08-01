package U0;

import K.Q;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f1244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1245c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f1245c = textInputLayout;
        this.f1244b = editText;
        this.f1243a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1245c;
        textInputLayout.u(!textInputLayout.f2363A0, false);
        if (textInputLayout.f2403k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2418s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1244b;
        int lineCount = editText.getLineCount();
        int i = this.f1243a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = Q.f578a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2420t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f1243a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
