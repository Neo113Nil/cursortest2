package com.stripe.android.stripe3ds2.security;

/* loaded from: classes5.dex */
public enum Algorithm {
    /* JADX INFO: Fake field, exist only in values array */
    EC("EC"),
    /* JADX INFO: Fake field, exist only in values array */
    RSA("RSA");

    public final String key;

    Algorithm(String str) {
        this.key = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.key;
    }
}
