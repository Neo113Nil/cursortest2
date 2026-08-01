package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* compiled from: JsBridgeUtils.java */
/* loaded from: classes2.dex */
public class bNS {
    public static void pvs(Uri uri, com.bytedance.sdk.openadsdk.core.CvL cvL) {
        if (cvL == null || !cvL.pvs(uri)) {
            return;
        }
        try {
            cvL.icD(uri);
        } catch (Exception e) {
            new StringBuilder("TTAndroidObj handleUri exception: ").append(e);
        }
    }

    public static String pvs(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(userAgentString);
        sb.append(" open_news open_news_u_s/").append(i);
        return sb.toString();
    }
}
