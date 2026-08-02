package com.stripe.hcaptcha.webview;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.squareup.cash.R;
import com.squareup.scannerview.TextSetter;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;

/* loaded from: classes4.dex */
public final class HCaptchaHeadlessWebView implements IHCaptchaVerifier {
    public final HCaptchaStateListener listener;
    public boolean shouldExecuteOnLoad;
    public boolean shouldResetOnLoad;
    public final TextSetter webViewHelper;
    public boolean webViewLoaded;

    public HCaptchaHeadlessWebView(FragmentActivity fragmentActivity, HCaptchaConfig hCaptchaConfig, HCaptchaInternalConfig hCaptchaInternalConfig, HCaptchaStateListener hCaptchaStateListener) {
        fragmentActivity.getClass();
        hCaptchaInternalConfig.getClass();
        this.listener = hCaptchaStateListener;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(fragmentActivity);
        hCaptchaWebView.setId(R.id.webView);
        hCaptchaWebView.setVisibility(8);
        this.webViewHelper = new TextSetter(new Handler(Looper.getMainLooper()), fragmentActivity, hCaptchaConfig, hCaptchaInternalConfig, this, hCaptchaStateListener, hCaptchaWebView);
    }

    @Override // com.stripe.hcaptcha.task.OnFailureListener
    public final void onFailure(HCaptchaException hCaptchaException) {
        hCaptchaException.getClass();
        TextSetter textSetter = this.webViewHelper;
        if (textSetter.shouldRetry(hCaptchaException)) {
            ((HCaptchaWebView) textSetter.scannerText).loadUrl("javascript:resetAndExecute();");
        } else {
            this.listener.onFailure.invoke(hCaptchaException);
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void onLoaded() {
        this.webViewLoaded = true;
        if (this.shouldResetOnLoad) {
            this.shouldResetOnLoad = false;
            reset();
        } else if (this.shouldExecuteOnLoad) {
            this.shouldExecuteOnLoad = false;
            ((HCaptchaWebView) this.webViewHelper.scannerText).loadUrl("javascript:resetAndExecute();");
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void onOpen() {
        this.listener.onOpen.invoke();
    }

    @Override // com.stripe.hcaptcha.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        String str = (String) obj;
        str.getClass();
        this.listener.onSuccess.invoke(str);
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void reset() {
        if (!this.webViewLoaded) {
            this.shouldResetOnLoad = true;
            return;
        }
        TextSetter textSetter = this.webViewHelper;
        ((HCaptchaWebView) textSetter.scannerText).loadUrl("javascript:reset();");
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) textSetter.scannerText;
        if (hCaptchaWebView.getParent() != null) {
            ViewParent parent = hCaptchaWebView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(hCaptchaWebView);
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void startVerification(FragmentActivity fragmentActivity) {
        fragmentActivity.getClass();
        if (this.webViewLoaded) {
            ((HCaptchaWebView) this.webViewHelper.scannerText).loadUrl("javascript:resetAndExecute();");
        } else {
            this.shouldExecuteOnLoad = true;
        }
    }
}
