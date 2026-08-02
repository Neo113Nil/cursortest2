package com.stripe.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public final class GooglePayConfig {
    public final String connectedAccountId;
    public final String sdkVersion;
    public final String validPublishableKey;

    public GooglePayConfig(String str, String str2) {
        str.getClass();
        this.connectedAccountId = str2;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "sk_", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "rk_", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        this.validPublishableKey = str;
        this.sdkVersion = "23.9.1";
    }

    public GooglePayConfig(String str, String str2, String str3) {
        this.connectedAccountId = str;
        this.validPublishableKey = str2;
        this.sdkVersion = str3;
    }
}
