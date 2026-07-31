package com.iab.omid.library.startio.adsession;

import android.webkit.WebView;
import com.iab.omid.library.startio.utils.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AdSessionContext {
    private final AdSessionContextType adSessionContextType;
    private final String contentUrl;
    private final String customReferenceData;
    private final Map injectedResourcesMap;
    private final String omidJsScriptContent;
    private final Partner partner;
    private final UniversalAdId universalAdId;
    private final List verificationScriptResources;
    private final WebView webView;

    private AdSessionContext(Partner partner, WebView webView, String str, List list, String str2, String str3, AdSessionContextType adSessionContextType, UniversalAdId universalAdId) {
        ArrayList arrayList = new ArrayList();
        this.verificationScriptResources = arrayList;
        this.injectedResourcesMap = new HashMap();
        this.partner = partner;
        this.webView = webView;
        this.omidJsScriptContent = str;
        this.adSessionContextType = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VerificationScriptResource verificationScriptResource = (VerificationScriptResource) it.next();
                this.injectedResourcesMap.put(UUID.randomUUID().toString(), verificationScriptResource);
            }
        }
        this.contentUrl = str2;
        this.customReferenceData = str3;
        this.universalAdId = universalAdId;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        if (str2 != null) {
            g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, null, null, str, str2, AdSessionContextType.HTML, null);
    }

    public static AdSessionContext createJavascriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        if (str2 != null) {
            g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, null, null, str, str2, AdSessionContextType.JAVASCRIPT, null);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List list, String str2, String str3) {
        return createNativeAdSessionContext(partner, str, list, str2, str3, null);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List list, String str2, String str3, UniversalAdId universalAdId) {
        g.a(partner, "Partner is null");
        g.a((Object) str, "OM SDK JS script content is null");
        g.a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            g.a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, null, str, list, str2, str3, AdSessionContextType.NATIVE, universalAdId);
    }

    public final AdSessionContextType getAdSessionContextType() {
        return this.adSessionContextType;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final Map getInjectedResourcesMap() {
        return Collections.unmodifiableMap(this.injectedResourcesMap);
    }

    public final String getOmidJsScriptContent() {
        return this.omidJsScriptContent;
    }

    public final Partner getPartner() {
        return this.partner;
    }

    public final UniversalAdId getUniversalAdId() {
        return this.universalAdId;
    }

    public final List getVerificationScriptResources() {
        return Collections.unmodifiableList(this.verificationScriptResources);
    }

    public final WebView getWebView() {
        return this.webView;
    }
}
