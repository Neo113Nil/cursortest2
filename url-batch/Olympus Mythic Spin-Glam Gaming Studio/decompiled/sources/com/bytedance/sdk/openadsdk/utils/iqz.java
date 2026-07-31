package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes15.dex */
public class iqz {
    public static void zmn(Uri uri, com.bytedance.sdk.openadsdk.core.fkt fktVar) {
        if (fktVar == null || !fktVar.zmn(uri)) {
            return;
        }
        try {
            fktVar.fs(uri);
        } catch (Exception e) {
            e.toString();
        }
    }

    public static String zmn(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i;
    }
}
