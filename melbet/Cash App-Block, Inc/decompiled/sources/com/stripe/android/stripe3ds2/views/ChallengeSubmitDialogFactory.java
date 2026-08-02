package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes8.dex */
public final class ChallengeSubmitDialogFactory {
    public final Context context;
    public final StripeUiCustomization uiCustomization;

    public final class ChallengeSubmitDialog extends Dialog {
        public final StripeUiCustomization uiCustomization;
        public final Lazy viewBinding$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, StripeUiCustomization stripeUiCustomization) {
            super(context);
            stripeUiCustomization.getClass();
            this.uiCustomization = stripeUiCustomization;
            this.viewBinding$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 22));
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        @Override // android.app.Dialog
        public final void onStart() {
            String str;
            super.onStart();
            Lazy lazy = this.viewBinding$delegate;
            setContentView(((StripeChallengeSubmitDialogBinding) lazy.getValue()).rootView);
            CircularProgressIndicator circularProgressIndicator = ((StripeChallengeSubmitDialogBinding) lazy.getValue()).progressBar;
            StripeUiCustomization stripeUiCustomization = this.uiCustomization;
            if (stripeUiCustomization == null || (str = stripeUiCustomization.mAccentColor) == null) {
                return;
            }
            circularProgressIndicator.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(str)));
        }
    }

    public ChallengeSubmitDialogFactory(Context context, StripeUiCustomization stripeUiCustomization) {
        stripeUiCustomization.getClass();
        this.context = context;
        this.uiCustomization = stripeUiCustomization;
    }
}
