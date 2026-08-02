package com.stripe.android.payments.core;

import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;

/* loaded from: classes8.dex */
public interface ActivityResultLauncherHost {
    default void onLauncherInvalidated() {
    }

    default void onNewActivityResultCaller(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, PaymentLauncherViewModel$register$1 paymentLauncherViewModel$register$1) {
    }
}
