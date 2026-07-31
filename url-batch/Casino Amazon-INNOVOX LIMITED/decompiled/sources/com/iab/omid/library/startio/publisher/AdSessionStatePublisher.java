package com.iab.omid.library.startio.publisher;

import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.ErrorType;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f47a;
    private com.iab.omid.library.startio.weakreference.b b;
    private AdEvents c;
    private MediaEvents d;
    private a e;
    private long f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f47a = str;
        this.b = new com.iab.omid.library.startio.weakreference.b(null);
    }

    private JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.iab.omid.library.startio.attestation.b bVar = (com.iab.omid.library.startio.attestation.b) it.next();
            Iterator it2 = bVar.c().iterator();
            while (it2.hasNext()) {
                jSONArray.put(a(bVar, (String) it2.next()));
            }
        }
        return jSONArray;
    }

    private JSONObject a(com.iab.omid.library.startio.attestation.b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put("version", str);
        return jSONObject;
    }

    private JSONObject a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        h.a().b(getWebView(), jSONObject);
    }

    public void a() {
        this.f = f.b();
        this.e = a.AD_STATE_IDLE;
    }

    public void a(float f) {
        h.a().a(getWebView(), this.f47a, f);
    }

    void a(WebView webView) {
        this.b = new com.iab.omid.library.startio.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f47a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f47a, errorType, str);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String c = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.startio.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.startio.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.6.0-Startio");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), c, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f) {
            a aVar = this.e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.e = aVar2;
                h.a().b(getWebView(), this.f47a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f47a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            h.a().c(getWebView(), this.f47a, z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(String str, long j) {
        if (j >= this.f) {
            this.e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f47a, str);
        }
    }

    public void b(List list) {
        try {
            a(a(a(list)));
        } catch (JSONException e) {
            d.a("Error creating JSON object publishSupportedAttestationMechanisms", e);
        }
    }

    public void b(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f47a, jSONObject);
    }

    public void b(boolean z) {
        if (e()) {
            h.a().a(getWebView(), this.f47a, z ? "locked" : "unlocked");
        }
    }

    public AdEvents c() {
        return this.c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != 0;
    }

    public void f() {
        h.a().a(getWebView(), this.f47a);
    }

    public void g() {
        h.a().b(getWebView(), this.f47a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView getWebView() {
        return (WebView) this.b.get();
    }

    public void h() {
        b((JSONObject) null);
    }

    public void i() {
    }
}
