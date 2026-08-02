package com.stripe.hcaptcha;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HCaptchaTokenResponse {
    public final Handler handler;
    public final String tokenResult;

    public HCaptchaTokenResponse(String str, Handler handler) {
        str.getClass();
        handler.getClass();
        this.tokenResult = str;
        this.handler = handler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HCaptchaTokenResponse)) {
            return false;
        }
        HCaptchaTokenResponse hCaptchaTokenResponse = (HCaptchaTokenResponse) obj;
        return Intrinsics.areEqual(this.tokenResult, hCaptchaTokenResponse.tokenResult) && Intrinsics.areEqual(this.handler, hCaptchaTokenResponse.handler);
    }

    public final int hashCode() {
        return this.handler.hashCode() + (this.tokenResult.hashCode() * 31);
    }

    public final String toString() {
        return "HCaptchaTokenResponse(tokenResult=" + this.tokenResult + ", handler=" + this.handler + ")";
    }
}
