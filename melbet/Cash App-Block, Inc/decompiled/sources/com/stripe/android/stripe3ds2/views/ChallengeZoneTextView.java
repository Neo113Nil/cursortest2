package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;

/* loaded from: classes8.dex */
public final class ChallengeZoneTextView extends LinearLayout {
    public final TextInputLayout infoLabel;
    public final TextInputEditText textEntryView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_text_view, (ViewGroup) this, false);
        addView(inflate);
        TextInputLayout textInputLayout = (TextInputLayout) inflate;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.text_entry);
        if (textInputEditText == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.text_entry)));
            throw null;
        }
        textInputLayout.getClass();
        this.infoLabel = textInputLayout;
        this.textEntryView = textInputEditText;
    }

    public final void setText(String str) {
        str.getClass();
        this.textEntryView.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization == 0) {
            return;
        }
        BaseCustomization baseCustomization = (BaseCustomization) textBoxCustomization;
        String str = baseCustomization.mTextColor;
        TextInputEditText textInputEditText = this.textEntryView;
        if (str != null) {
            textInputEditText.setTextColor(Color.parseColor(str));
        }
        Integer valueOf = Integer.valueOf(baseCustomization.mTextFontSize);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            textInputEditText.setTextSize(2, valueOf.intValue());
        }
        StripeTextBoxCustomization stripeTextBoxCustomization = (StripeTextBoxCustomization) textBoxCustomization;
        int i = stripeTextBoxCustomization.mCornerRadius;
        TextInputLayout textInputLayout = this.infoLabel;
        if (i >= 0) {
            float f = i;
            textInputLayout.setBoxCornerRadii(f, f, f, f);
        }
        String str2 = stripeTextBoxCustomization.mBorderColor;
        if (str2 != null) {
            textInputLayout.setBoxBackgroundMode(2);
            textInputLayout.setBoxStrokeColor(Color.parseColor(str2));
        }
        String str3 = stripeTextBoxCustomization.mHintTextColor;
        if (str3 != null) {
            textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(str3)));
        }
    }

    public final void setTextEntryLabel(String str) {
        this.infoLabel.setHint(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
