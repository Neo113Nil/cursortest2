package com.iab.omid.library.startio.attestation;

import android.webkit.WebView;
import androidx.webkit.WebViewFeature;

/* loaded from: classes2.dex */
public class g {
    public static boolean a(WebView webView) {
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            return false;
        }
        try {
            if (!c.a(com.iab.omid.library.startio.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e) {
            com.iab.omid.library.startio.utils.d.a("Error during initialization of AttestationMessageListener", e);
            return false;
        }
    }
}
