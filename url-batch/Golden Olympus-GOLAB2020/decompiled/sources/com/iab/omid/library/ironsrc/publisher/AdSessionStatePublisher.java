package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import com.ironsource.da;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f14569a;

    /* renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.b f14570b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f14571c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f14572d;

    /* renamed from: e, reason: collision with root package name */
    private a f14573e;

    /* renamed from: f, reason: collision with root package name */
    private long f14574f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f14569a = str;
        this.f14570b = new com.iab.omid.library.ironsrc.weakreference.b(null);
    }

    public void a() {
        this.f14574f = f.b();
        this.f14573e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f14570b.clear();
    }

    public AdEvents c() {
        return this.f14571c;
    }

    public MediaEvents d() {
        return this.f14572d;
    }

    public boolean e() {
        return this.f14570b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f14569a);
    }

    public void g() {
        h.a().b(getWebView(), this.f14569a);
    }

    public WebView getWebView() {
        return this.f14570b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f4) {
        h.a().a(getWebView(), this.f14569a, f4);
    }

    public void b(String str, long j4) {
        if (j4 >= this.f14574f) {
            this.f14573e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f14569a, str);
        }
    }

    void a(WebView webView) {
        this.f14570b = new com.iab.omid.library.ironsrc.weakreference.b(webView);
    }

    public void b(boolean z4) {
        if (e()) {
            h.a().a(getWebView(), this.f14569a, z4 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f14571c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f14569a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f14569a, errorType, str);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.ironsrc.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.ironsrc.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.2-Ironsrc");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f14572d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j4) {
        if (j4 >= this.f14574f) {
            a aVar = this.f14573e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f14573e = aVar2;
                h.a().b(getWebView(), this.f14569a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f14569a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, da.a.f15878d, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f14569a, jSONObject);
    }

    public void a(boolean z4) {
        if (e()) {
            h.a().c(getWebView(), this.f14569a, z4 ? "foregrounded" : "backgrounded");
        }
    }
}
