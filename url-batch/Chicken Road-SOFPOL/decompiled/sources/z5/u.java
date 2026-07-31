package z5;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f9280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditText f9281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f9282f;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.f9282f = textInputLayout;
        this.f9281e = editText;
        this.f9280d = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f9282f;
        textInputLayout.w(!textInputLayout.E0, false);
        if (textInputLayout.f1987o) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f2003w) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f9281e;
        int lineCount = editText.getLineCount();
        int i = this.f9280d;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i8 = textInputLayout.f2006x0;
                if (minimumHeight != i8) {
                    editText.setMinimumHeight(i8);
                }
            }
            this.f9280d = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }
}
