package com.stripe.android.model;

import android.os.Parcelable;

/* loaded from: classes8.dex */
public interface ConfirmStripeIntentParams extends Parcelable {
    String getClientSecret();

    String getReturnUrl();

    void setReturnUrl(String str);

    ConfirmStripeIntentParams withShouldUseStripeSdk();
}
