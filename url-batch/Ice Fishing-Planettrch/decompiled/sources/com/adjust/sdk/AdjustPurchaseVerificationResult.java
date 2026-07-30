package com.adjust.sdk;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class AdjustPurchaseVerificationResult {
    private final int code;
    private final String message;
    private final String verificationStatus;

    public AdjustPurchaseVerificationResult(String str, int i, String str2) {
        this.verificationStatus = str;
        this.code = i;
        this.message = str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }
}
