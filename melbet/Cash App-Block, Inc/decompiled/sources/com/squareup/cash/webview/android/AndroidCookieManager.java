package com.squareup.cash.webview.android;

import android.webkit.CookieManager;
import app.cash.local.backend.BuyerIntentManagerKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class AndroidCookieManager {
    public CookieManager cookieManager;

    public final CookieManager cookieManager() {
        if (this.cookieManager == null) {
            try {
                this.cookieManager = CookieManager.getInstance();
            } catch (Exception e) {
                if (!BuyerIntentManagerKt.isMissingWebViewPackageException(e)) {
                    throw e;
                }
                Timber.Forest.e(e);
            }
        }
        return this.cookieManager;
    }

    public final void setCookie(String str, String str2) {
        str.getClass();
        str2.getClass();
        CookieManager cookieManager = cookieManager();
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }
}
