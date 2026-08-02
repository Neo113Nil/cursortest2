package com.stripe.hcaptcha;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HCaptchaException extends Exception {
    public final HCaptchaError hCaptchaError;
    public final String hCaptchaMessage;

    public HCaptchaException(HCaptchaError hCaptchaError) {
        this.hCaptchaError = hCaptchaError;
        this.hCaptchaMessage = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj;
        return this.hCaptchaError == hCaptchaException.hCaptchaError && Intrinsics.areEqual(this.hCaptchaMessage, hCaptchaException.hCaptchaMessage);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.hCaptchaMessage;
        return str == null ? this.hCaptchaError.message : str;
    }

    public final int hashCode() {
        int hashCode = this.hCaptchaError.hashCode() * 31;
        String str = this.hCaptchaMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HCaptchaException(hCaptchaError=" + this.hCaptchaError + ", hCaptchaMessage=" + this.hCaptchaMessage + ")";
    }

    public HCaptchaException(HCaptchaError hCaptchaError, String str) {
        this.hCaptchaError = hCaptchaError;
        this.hCaptchaMessage = str;
    }
}
