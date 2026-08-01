package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s80 implements TextWatcher {
    public int f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ TextInputLayout h;

    public s80(TextInputLayout textInputLayout, EditText editText) {
        this.h = textInputLayout;
        this.g = editText;
        this.f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.g;
        int lineCount = editText.getLineCount();
        int i = this.f;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.z0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
