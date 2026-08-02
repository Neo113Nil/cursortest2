package com.stripe.hcaptcha.config;

import com.stripe.hcaptcha.HCaptchaHtmlKt;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class HCaptchaInternalConfig implements Serializable {
    public final Function0 htmlProvider = HCaptchaHtmlKt.HCAPTCHA_WEBVIEW_HTML_PROVIDER;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HCaptchaInternalConfig) && this.htmlProvider.equals(((HCaptchaInternalConfig) obj).htmlProvider);
    }

    public final int hashCode() {
        return this.htmlProvider.hashCode();
    }

    public final String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + this.htmlProvider + ")";
    }
}
