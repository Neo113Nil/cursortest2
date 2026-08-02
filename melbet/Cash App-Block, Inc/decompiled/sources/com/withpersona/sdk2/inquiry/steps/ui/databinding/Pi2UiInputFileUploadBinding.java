package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* loaded from: classes9.dex */
public final class Pi2UiInputFileUploadBinding implements ViewBinding {
    public final PersonaMaterialButton chooseFileButton;
    public final TextView chosenFilesList;
    public final TextView errorText;
    public final TextView labelText;
    public final LinearLayout rootView;

    public Pi2UiInputFileUploadBinding(LinearLayout linearLayout, PersonaMaterialButton personaMaterialButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.chooseFileButton = personaMaterialButton;
        this.chosenFilesList = textView;
        this.errorText = textView2;
        this.labelText = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
