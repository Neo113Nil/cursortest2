package com.just.agentweb;

import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.just.agentweb.AgentWeb;

/* loaded from: classes4.dex */
public class WebSecurityLogicImpl implements WebSecurityCheckLogic {
    private String TAG = getClass().getSimpleName();
    private int webviewType;

    public WebSecurityLogicImpl(int i8) {
        this.webviewType = i8;
    }

    public static WebSecurityLogicImpl getInstance(int i8) {
        return new WebSecurityLogicImpl(i8);
    }

    @Override // com.just.agentweb.WebSecurityCheckLogic
    public void dealHoneyComb(WebView webView) {
    }

    @Override // com.just.agentweb.WebSecurityCheckLogic
    public void dealJsInterface(ArrayMap<String, Object> arrayMap, AgentWeb.SecurityType securityType) {
        AgentWeb.SecurityType securityType2 = AgentWeb.SecurityType.DEFAULT_CHECK;
    }
}
