package com.stripe.hcaptcha.webview;

/* loaded from: classes8.dex */
public final /* synthetic */ class HCaptchaJSInterface$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HCaptchaJSInterface f$0;

    public /* synthetic */ HCaptchaJSInterface$$ExternalSyntheticLambda3(HCaptchaJSInterface hCaptchaJSInterface, int i) {
        this.$r8$classId = i;
        this.f$0 = hCaptchaJSInterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        HCaptchaJSInterface hCaptchaJSInterface = this.f$0;
        switch (i) {
            case 0:
                hCaptchaJSInterface.captchaVerifier.onOpen();
                break;
            default:
                hCaptchaJSInterface.captchaVerifier.onLoaded();
                break;
        }
    }
}
