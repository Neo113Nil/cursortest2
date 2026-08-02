package com.stripe.android.networking;

/* loaded from: classes8.dex */
public enum RequestSurface {
    PaymentElement("android_payment_element"),
    /* JADX INFO: Fake field, exist only in values array */
    CryptoOnramp("android_crypto_onramp");

    public final String value;

    RequestSurface(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
