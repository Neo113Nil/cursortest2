package com.mopub.common.util;

/* loaded from: classes2.dex */
public enum JavaScriptWebViewCallbacks {
    WEB_VIEW_DID_APPEAR("webviewDidAppear();"),
    WEB_VIEW_DID_CLOSE("webviewDidClose();");

    private String mJavascript;

    JavaScriptWebViewCallbacks(String str) {
        this.mJavascript = str;
    }

    public String getJavascript() {
        return this.mJavascript;
    }

    public String getUrl() {
        return "javascript:" + this.mJavascript;
    }
}
