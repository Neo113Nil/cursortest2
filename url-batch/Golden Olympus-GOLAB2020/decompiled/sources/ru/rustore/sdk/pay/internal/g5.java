package ru.rustore.sdk.pay.internal;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g5 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextInputLayout f44159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44160b;

    public g5(@Nullable TextInputLayout textInputLayout, int i4) {
        this.f44159a = textInputLayout;
        this.f44160b = i4;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
        TextInputLayout textInputLayout = this.f44159a;
        if (textInputLayout != null) {
            textInputLayout.setHelperText("");
        }
        TextInputLayout textInputLayout2 = this.f44159a;
        if (textInputLayout2 == null) {
            return;
        }
        textInputLayout2.setBoxStrokeColor(this.f44160b);
    }
}
