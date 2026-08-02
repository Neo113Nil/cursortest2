package com.stripe.android.hcaptcha;

import com.fillr.n;
import dagger.internal.Factory;

/* loaded from: classes8.dex */
public abstract class HCaptchaModule_ProvideHCaptchaServiceFactory implements Factory {
    public static DefaultHCaptchaService provideHCaptchaService(HCaptchaModule hCaptchaModule, n nVar) {
        DefaultHCaptchaService defaultHCaptchaService;
        HCaptchaModule hCaptchaModule2 = HCaptchaModule.INSTANCE;
        DefaultHCaptchaService defaultHCaptchaService2 = HCaptchaModule.hCaptchaService;
        if (defaultHCaptchaService2 != null) {
            return defaultHCaptchaService2;
        }
        synchronized (hCaptchaModule2) {
            defaultHCaptchaService = HCaptchaModule.hCaptchaService;
            if (defaultHCaptchaService == null) {
                defaultHCaptchaService = new DefaultHCaptchaService(hCaptchaModule, nVar);
                HCaptchaModule.hCaptchaService = defaultHCaptchaService;
            }
        }
        return defaultHCaptchaService;
    }
}
