package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class ChallengeZoneView extends LinearLayout {
    public final FrameLayout challengeEntryView;
    public final ThreeDS2HeaderTextView infoHeader;
    public final ThreeDS2TextView infoLabelView;
    public final ThreeDS2TextView infoTextView;
    public final ThreeDS2Button resendButton;
    public final ThreeDS2Button submitButton;
    public final RadioButton whitelistNoRadioButton;
    public final RadioGroup whitelistRadioGroup;
    public final RadioButton whitelistYesRadioButton;
    public final ThreeDS2TextView whitelistingLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_view, this);
        int i2 = R.id.czv_entry_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(this, R.id.czv_entry_view);
        if (frameLayout != null) {
            i2 = R.id.czv_header;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) ViewBindings.findChildViewById(this, R.id.czv_header);
            if (threeDS2HeaderTextView != null) {
                i2 = R.id.czv_info;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(this, R.id.czv_info);
                if (threeDS2TextView != null) {
                    i2 = R.id.czv_info_label;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(this, R.id.czv_info_label);
                    if (threeDS2TextView2 != null) {
                        i2 = R.id.czv_resend_button;
                        ThreeDS2Button threeDS2Button = (ThreeDS2Button) ViewBindings.findChildViewById(this, R.id.czv_resend_button);
                        if (threeDS2Button != null) {
                            i2 = R.id.czv_submit_button;
                            ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) ViewBindings.findChildViewById(this, R.id.czv_submit_button);
                            if (threeDS2Button2 != null) {
                                i2 = R.id.czv_whitelist_no_button;
                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(this, R.id.czv_whitelist_no_button);
                                if (radioButton != null) {
                                    i2 = R.id.czv_whitelist_radio_group;
                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(this, R.id.czv_whitelist_radio_group);
                                    if (radioGroup != null) {
                                        i2 = R.id.czv_whitelist_yes_button;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(this, R.id.czv_whitelist_yes_button);
                                        if (radioButton2 != null) {
                                            i2 = R.id.czv_whitelisting_label;
                                            ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) ViewBindings.findChildViewById(this, R.id.czv_whitelisting_label);
                                            if (threeDS2TextView3 != null) {
                                                this.infoHeader = threeDS2HeaderTextView;
                                                this.infoTextView = threeDS2TextView;
                                                this.infoLabelView = threeDS2TextView2;
                                                this.submitButton = threeDS2Button2;
                                                this.resendButton = threeDS2Button;
                                                this.whitelistingLabel = threeDS2TextView3;
                                                this.whitelistRadioGroup = radioGroup;
                                                this.challengeEntryView = frameLayout;
                                                this.whitelistYesRadioButton = radioButton2;
                                                this.whitelistNoRadioButton = radioButton;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoHeaderText(str, labelCustomization);
    }

    public static /* synthetic */ void setInfoLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoLabel(str, labelCustomization);
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoText(str, labelCustomization);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setResendButtonLabel(str, buttonCustomization);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setSubmitButton(str, buttonCustomization);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        if ((i & 4) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setWhitelistingLabel(str, labelCustomization, buttonCustomization);
    }

    public final void setChallengeEntryView(View view) {
        view.getClass();
        this.challengeEntryView.addView(view);
    }

    public final void setInfoHeaderText(String str, LabelCustomization labelCustomization) {
        ThreeDS2HeaderTextView threeDS2HeaderTextView = this.infoHeader;
        if (str == null || StringsKt.isBlank(str)) {
            threeDS2HeaderTextView.setVisibility(8);
        } else {
            threeDS2HeaderTextView.setText(str, labelCustomization);
        }
    }

    public final void setInfoLabel(String str, LabelCustomization labelCustomization) {
        ThreeDS2TextView threeDS2TextView = this.infoLabelView;
        if (str == null || StringsKt.isBlank(str)) {
            threeDS2TextView.setVisibility(8);
        } else {
            threeDS2TextView.setText(str, labelCustomization);
        }
    }

    public final void setInfoText(String str, LabelCustomization labelCustomization) {
        ThreeDS2TextView threeDS2TextView = this.infoTextView;
        if (str == null || StringsKt.isBlank(str)) {
            threeDS2TextView.setVisibility(8);
        } else {
            threeDS2TextView.setText(str, labelCustomization);
        }
    }

    public final void setInfoTextIndicator(int i) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.resendButton.setOnClickListener(onClickListener);
    }

    public final void setResendButtonLabel(String str, ButtonCustomization buttonCustomization) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        ThreeDS2Button threeDS2Button = this.resendButton;
        threeDS2Button.setVisibility(0);
        threeDS2Button.setText(str);
        threeDS2Button.setButtonCustomization(buttonCustomization);
    }

    public final void setSubmitButton(String str, ButtonCustomization buttonCustomization) {
        ThreeDS2Button threeDS2Button = this.submitButton;
        if (str == null || StringsKt.isBlank(str)) {
            threeDS2Button.setVisibility(8);
        } else {
            threeDS2Button.setText(str);
            threeDS2Button.setButtonCustomization(buttonCustomization);
        }
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.submitButton.setOnClickListener(onClickListener);
    }

    public final void setWhitelistChecked(boolean z) {
        this.whitelistYesRadioButton.setChecked(z);
        this.whitelistNoRadioButton.setChecked(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setWhitelistingLabel(String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        ThreeDS2TextView threeDS2TextView = this.whitelistingLabel;
        threeDS2TextView.setText(str, labelCustomization);
        RadioGroup radioGroup = this.whitelistRadioGroup;
        if (buttonCustomization != 0) {
            IntRange until = RangesKt___RangesKt.until(0, radioGroup.getChildCount());
            ArrayList<RadioButton> arrayList = new ArrayList();
            Iterator it = until.iterator();
            while (it.hasNext()) {
                View childAt = radioGroup.getChildAt(((IntIterator) it).nextInt());
                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                if (radioButton != null) {
                    arrayList.add(radioButton);
                }
            }
            for (RadioButton radioButton2 : arrayList) {
                String str2 = ((StripeButtonCustomization) buttonCustomization).mBackgroundColor;
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    radioButton2.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str2)));
                }
                String str3 = ((BaseCustomization) buttonCustomization).mTextColor;
                if (str3 != null && !StringsKt.isBlank(str3)) {
                    radioButton2.setTextColor(Color.parseColor(str3));
                }
            }
        }
        threeDS2TextView.setVisibility(0);
        radioGroup.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
