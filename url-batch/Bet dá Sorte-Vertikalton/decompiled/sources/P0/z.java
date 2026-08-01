package P0;

import K.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f703c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f703c = textInputLayout;
        this.f702b = editText;
        this.f701a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f703c;
        textInputLayout.u(!textInputLayout.f1886A0, false);
        if (textInputLayout.f1925k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1940s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f702b;
        int lineCount = editText.getLineCount();
        int i = this.f701a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f351a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1943t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f701a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
