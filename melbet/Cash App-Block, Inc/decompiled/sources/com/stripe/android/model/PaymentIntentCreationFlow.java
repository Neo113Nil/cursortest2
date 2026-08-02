package com.stripe.android.model;

/* loaded from: classes8.dex */
public enum PaymentIntentCreationFlow {
    /* JADX INFO: Fake field, exist only in values array */
    Standard("standard"),
    /* JADX INFO: Fake field, exist only in values array */
    Deferred("deferred");

    public final String paramValue;

    PaymentIntentCreationFlow(String str) {
        this.paramValue = str;
    }
}
