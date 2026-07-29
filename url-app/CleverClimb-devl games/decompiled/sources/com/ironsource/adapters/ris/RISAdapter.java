package com.ironsource.adapters.ris;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.b;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.f.l;
import com.ironsource.b.f.u;
import com.ironsource.b.h.d;
import com.ironsource.b.h.g;
import com.ironsource.b.h.i;
import com.ironsource.sdk.a;
import com.ironsource.sdk.e.e;
import com.ironsource.sdk.g.f;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RISAdapter extends b implements e {
    private final String AD_VISIBLE_EVENT_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private boolean hasAdAvailable;
    private boolean mConsent;
    private boolean mDidReportInitStatus;
    private boolean mDidSetConsent;
    private com.ironsource.sdk.b mSSAPublisher;

    @Override // com.ironsource.b.f.r
    public void fetchRewardedVideo(JSONObject jSONObject) {
    }

    @Override // com.ironsource.b.f.r
    public void initRewardedVideo(Activity activity, String str, String str2, JSONObject jSONObject, u uVar) {
    }

    @Override // com.ironsource.b.f.r
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return false;
    }

    @Override // com.ironsource.b.f.r
    public void showRewardedVideo(JSONObject jSONObject, u uVar) {
    }

    public static RISAdapter startAdapter(String str) {
        return new RISAdapter(str);
    }

    private RISAdapter(String str) {
        super(str);
        this.hasAdAvailable = false;
        this.mDidReportInitStatus = false;
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.AD_VISIBLE_EVENT_NAME = "impressions";
    }

    @Override // com.ironsource.b.b
    public String getVersion() {
        return g.d();
    }

    @Override // com.ironsource.b.b
    public String getCoreSDKVersion() {
        return f.e();
    }

    @Override // com.ironsource.b.b
    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.b(activity);
        }
    }

    @Override // com.ironsource.b.b
    public void onPause(Activity activity) {
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.a(activity);
        }
    }

    @Override // com.ironsource.b.f.i
    public void initInterstitial(final Activity activity, final String str, final String str2, JSONObject jSONObject, l lVar) {
        f.d(jSONObject.optString("controllerUrl"));
        if (isAdaptersDebugEnabled()) {
            f.c(3);
        } else {
            f.c(jSONObject.optInt("debugMode", 0));
        }
        f.e(jSONObject.optString("controllerConfig", ""));
        activity.runOnUiThread(new Runnable() { // from class: com.ironsource.adapters.ris.RISAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    RISAdapter.this.mSSAPublisher = a.a(activity);
                    if (RISAdapter.this.mDidSetConsent) {
                        RISAdapter.this.applyConsent(RISAdapter.this.mConsent);
                    }
                    a.a(activity).a(str, str2, RISAdapter.this.getProviderName(), new HashMap(), RISAdapter.this);
                } catch (Exception e) {
                    RISAdapter.this.onRVInitFail(e.getMessage());
                }
            }
        });
    }

    @Override // com.ironsource.b.f.i
    public void loadInterstitial(JSONObject jSONObject, l lVar) {
        if (this.hasAdAvailable) {
            Iterator<l> it = this.mAllInterstitialSmashes.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next != null) {
                    next.z();
                }
            }
            return;
        }
        Iterator<l> it2 = this.mAllInterstitialSmashes.iterator();
        while (it2.hasNext()) {
            l next2 = it2.next();
            if (next2 != null) {
                next2.a_(d.e("No Ads to Load"));
            }
        }
    }

    @Override // com.ironsource.b.f.i
    public void showInterstitial(JSONObject jSONObject, l lVar) {
        this.mActiveInterstitialSmash = lVar;
        if (this.mSSAPublisher != null) {
            int b2 = i.a().b(2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put("sessionDepth", b2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mSSAPublisher.a(jSONObject2);
            return;
        }
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.c(new com.ironsource.b.d.b(509, "Please call init before calling showRewardedVideo"));
        }
    }

    @Override // com.ironsource.b.f.i
    public boolean isInterstitialReady(JSONObject jSONObject) {
        return this.hasAdAvailable;
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVInitSuccess(com.ironsource.sdk.data.a aVar) {
        int i;
        log(c.a.INTERNAL, getProviderName() + ":onRVInitSuccess()", 1);
        try {
            i = Integer.parseInt(aVar.a());
        } catch (NumberFormatException e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "onRVInitSuccess:parseInt()", e);
            i = 0;
        }
        this.hasAdAvailable = i > 0;
        if (this.mDidReportInitStatus) {
            return;
        }
        this.mDidReportInitStatus = true;
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.y();
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVInitFail(String str) {
        log(c.a.INTERNAL, getProviderName() + ":onRVInitFail()", 1);
        this.hasAdAvailable = false;
        if (this.mDidReportInitStatus) {
            return;
        }
        this.mDidReportInitStatus = true;
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.a(d.b(str, Constants.ADTYPE_INTERSTITIAL));
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVNoMoreOffers() {
        log(c.a.INTERNAL, getProviderName() + ":onRVNoMoreOffers()", 1);
        if (this.mDidReportInitStatus) {
            return;
        }
        this.mDidReportInitStatus = true;
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.y();
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdCredited(int i) {
        log(c.a.INTERNAL, getProviderName() + ":onRVAdCredited()", 1);
        if (this.mRewardedInterstitial != null) {
            this.mRewardedInterstitial.F();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdClosed() {
        log(c.a.INTERNAL, getProviderName() + ":onRVAdClosed()", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.B();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdOpened() {
        log(c.a.INTERNAL, getProviderName() + ":onRVAdOpened()", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.C();
            this.mActiveInterstitialSmash.A();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVShowFail(String str) {
        log(c.a.INTERNAL, getProviderName() + ":onRVShowFail()", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.c(new com.ironsource.b.d.b(509, "Show Failed"));
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdClicked() {
        log(c.a.INTERNAL, getProviderName() + ":onRVAdClicked()", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.D();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRISEventNotificationReceived: " + str + " extData: " + jSONObject.toString(), 1);
            if (TextUtils.isEmpty(str) || !"impressions".equals(str) || this.mActiveInterstitialSmash == null) {
                return;
            }
            this.mActiveInterstitialSmash.E();
        }
    }

    @Override // com.ironsource.b.b
    protected void setMediationState(c.a aVar, String str) {
        if (this.mSSAPublisher != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :setMediationState(RIS:(rewardedvideo)):" + str + " , " + getProviderName() + " , " + aVar.a() + ")", 1);
            this.mSSAPublisher.a("rewardedvideo", getProviderName(), aVar.a());
        }
    }

    @Override // com.ironsource.b.b
    protected void setConsent(boolean z) {
        this.mConsent = z;
        this.mDidSetConsent = true;
        applyConsent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyConsent(boolean z) {
        if (this.mSSAPublisher == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gdprConsentStatus", String.valueOf(z));
            jSONObject.put("demandSourceName", getProviderName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.mSSAPublisher.d(jSONObject);
    }
}
