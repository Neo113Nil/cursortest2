package j2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public int f2297f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ TextInputLayout h;

    public b0(TextInputLayout textInputLayout, EditText editText) {
        this.h = textInputLayout;
        this.g = editText;
        this.f2297f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.f1416q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1432y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.g;
        int lineCount = editText.getLineCount();
        int i4 = this.f2297f;
        if (lineCount != i4) {
            if (lineCount < i4) {
                int minimumHeight = editText.getMinimumHeight();
                int i5 = textInputLayout.f1435z0;
                if (minimumHeight != i5) {
                    editText.setMinimumHeight(i5);
                }
            }
            this.f2297f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
