package com.stripe.android.hcaptcha;

import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class DefaultHCaptchaService$startVerification$2$config$1 implements Function2 {
    public static final DefaultHCaptchaService$startVerification$2$config$1 INSTANCE = new DefaultHCaptchaService$startVerification$2$config$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HCaptchaException hCaptchaException = (HCaptchaException) obj2;
        ((HCaptchaConfig) obj).getClass();
        hCaptchaException.getClass();
        return Boolean.valueOf(hCaptchaException.hCaptchaError == HCaptchaError.SESSION_TIMEOUT);
    }
}
