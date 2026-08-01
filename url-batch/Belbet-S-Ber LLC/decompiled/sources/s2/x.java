package s2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public int f3345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditText f3346g;
    public final /* synthetic */ TextInputLayout h;

    public x(TextInputLayout textInputLayout, EditText editText) {
        this.h = textInputLayout;
        this.f3346g = editText;
        this.f3345f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.f1223q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1239y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f3346g;
        int lineCount = editText.getLineCount();
        int i = this.f3345f;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f1242z0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f3345f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
