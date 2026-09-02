package o2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public int f2986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditText f2987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f2988h;

    public x(TextInputLayout textInputLayout, EditText editText) {
        this.f2988h = textInputLayout;
        this.f2987g = editText;
        this.f2986f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f2988h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.f1034q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1050y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f2987g;
        int lineCount = editText.getLineCount();
        int i = this.f2986f;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f1053z0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f2986f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
