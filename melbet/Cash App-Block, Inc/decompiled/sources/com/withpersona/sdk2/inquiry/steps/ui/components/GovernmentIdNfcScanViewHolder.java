package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding;

/* loaded from: classes9.dex */
public final class GovernmentIdNfcScanViewHolder {
    public final TextInputLayout cardAccessNumber;
    public final Pi2UiDateFieldBinding dateOfBirthBinding;
    public final TextInputLayout documentNumber;
    public final TextView errorLabel;
    public final Pi2UiDateFieldBinding expirationDateBinding;
    public final ButtonWithLoadingIndicator launchButton;
    public final View tipsButton;

    public GovernmentIdNfcScanViewHolder(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, Pi2UiDateFieldBinding pi2UiDateFieldBinding, Pi2UiDateFieldBinding pi2UiDateFieldBinding2, ButtonWithLoadingIndicator buttonWithLoadingIndicator, ButtonWithLoadingIndicator buttonWithLoadingIndicator2, TextView textView) {
        this.cardAccessNumber = textInputLayout;
        this.documentNumber = textInputLayout2;
        this.dateOfBirthBinding = pi2UiDateFieldBinding;
        this.expirationDateBinding = pi2UiDateFieldBinding2;
        this.launchButton = buttonWithLoadingIndicator;
        this.tipsButton = buttonWithLoadingIndicator2;
        this.errorLabel = textView;
    }
}
