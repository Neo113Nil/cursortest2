package com.applovin.impl.sdk.d;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.mopub.common.FullAdType;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r extends a implements AppLovinAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f3128a;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f3129c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f3130d;
    private final AppLovinAdLoadListener e;

    public r(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessAdResponse", jVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f3128a = jSONObject;
        this.f3129c = dVar;
        this.f3130d = bVar;
        this.e = appLovinAdLoadListener;
    }

    private void a(int i) {
        com.applovin.impl.sdk.e.l.a(this.e, this.f3129c, i, this.f3073b);
    }

    private void a(AppLovinAd appLovinAd) {
        try {
            if (this.e != null) {
                this.e.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            a("Unable process a ad received notification", th);
        }
    }

    private void a(JSONObject jSONObject) {
        String a2 = com.applovin.impl.sdk.e.f.a(jSONObject, "type", "undefined", this.f3073b);
        if ("applovin".equalsIgnoreCase(a2)) {
            a("Starting task for AppLovin ad...");
            this.f3073b.C().a(new t(jSONObject, this.f3128a, this.f3130d, this, this.f3073b));
        } else {
            if (FullAdType.VAST.equalsIgnoreCase(a2)) {
                a("Starting task for VAST ad...");
                this.f3073b.C().a(s.a(jSONObject, this.f3128a, this.f3130d, this, this.f3073b));
                return;
            }
            c("Unable to process ad of unknown type: " + a2);
            failedToReceiveAd(-800);
        }
    }

    private void f() {
        a(-6);
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.q;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        a(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        f();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a("Processing ad response...");
            JSONArray jSONArray = this.f3128a.getJSONArray("ads");
            if (jSONArray.length() > 0) {
                a("Processing ad...");
                try {
                    a(jSONArray.getJSONObject(0));
                } catch (Throwable unused) {
                    d("Encountered error while processing ad");
                    f();
                    this.f3073b.E().a(a());
                }
            } else {
                c("No ads were returned from the server");
                a(204);
            }
        } catch (Throwable th) {
            a("Encountered error while processing ad response", th);
            f();
            this.f3073b.E().a(a());
        }
    }
}
