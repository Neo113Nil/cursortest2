package com.stripe.hcaptcha.webview;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;

/* loaded from: classes8.dex */
public final class HCaptchaJSInterface implements Serializable {
    public final transient IHCaptchaVerifier captchaVerifier;
    public final Lazy config$delegate;
    public final transient Handler handler;

    public HCaptchaJSInterface(Handler handler, HCaptchaConfig hCaptchaConfig, IHCaptchaVerifier iHCaptchaVerifier) {
        this.handler = handler;
        this.captchaVerifier = iHCaptchaVerifier;
        this.config$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(hCaptchaConfig, 2));
    }

    @JavascriptInterface
    public final String getConfig() {
        return (String) this.config$delegate.getValue();
    }

    @JavascriptInterface
    public final void onError(int i) {
        HCaptchaError.Companion.getClass();
        EnumEntriesList enumEntriesList = HCaptchaError.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (m.hasNext()) {
            HCaptchaError hCaptchaError = (HCaptchaError) m.next();
            if (hCaptchaError.errorId == i) {
                this.handler.post(new r6$$ExternalSyntheticLambda0(13, this, hCaptchaError));
                return;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported error id: "));
    }

    @JavascriptInterface
    public final void onLoaded() {
        this.handler.post(new HCaptchaJSInterface$$ExternalSyntheticLambda3(this, 1));
    }

    @JavascriptInterface
    public final void onOpen() {
        this.handler.post(new HCaptchaJSInterface$$ExternalSyntheticLambda3(this, 0));
    }

    @JavascriptInterface
    public final void onPass(String str) {
        str.getClass();
        this.handler.post(new r6$$ExternalSyntheticLambda0(14, this, str));
    }
}
