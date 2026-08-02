package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2UiInputTextBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId;
    public final TextInputLayout inputLayout;
    public final TextInputLayout rootView;

    public /* synthetic */ Pi2UiInputTextBinding(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, int i) {
        this.$r8$classId = i;
        this.rootView = textInputLayout;
        this.inputLayout = textInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.$r8$classId) {
        }
        return this.rootView;
    }
}
