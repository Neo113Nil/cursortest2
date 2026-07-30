package com.anythink.network.facebook;

import android.content.Context;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookATInitManager extends ATInitMediation {

    /* renamed from: b, reason: collision with root package name */
    private static final String f23231b = "FacebookATInitManager";

    /* renamed from: c, reason: collision with root package name */
    private static volatile FacebookATInitManager f23232c;

    /* renamed from: a, reason: collision with root package name */
    List<MediationInitCallback> f23233a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23234d = false;

    /* renamed from: e, reason: collision with root package name */
    private Object f23235e = new Object();

    public interface InitListener {
        void onError(String str);

        void onSuccess();
    }

    private FacebookATInitManager() {
    }

    private void a(AudienceNetworkAds.InitResult initResult) {
        synchronized (this.f23235e) {
            try {
                List<MediationInitCallback> list = this.f23233a;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (initResult.isSuccess()) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onSuccess();
                            }
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(initResult.getMessage());
                        }
                    }
                }
                this.f23234d = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FacebookATInitManager getInstance() {
        if (f23232c == null) {
            synchronized (FacebookATInitManager.class) {
                try {
                    if (f23232c == null) {
                        f23232c = new FacebookATInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23232c;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.13";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Facebook";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.facebook.ads.AudienceNetworkAds";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return FacebookATConst.getNetworkVersion();
    }

    public void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.anythink.core.api.ATInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            if (((Boolean) map.get(j.w.f12774d)).booleanValue()) {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 1, 1000);
            }
        } catch (Throwable unused) {
        }
        try {
            if (((Boolean) map.get(j.w.f12775e)).booleanValue()) {
                AdSettings.setMixedAudience(true);
            }
        } catch (Throwable unused2) {
        }
        try {
            synchronized (this.f23235e) {
                try {
                    if (AudienceNetworkAds.isInitialized(context)) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    if (this.f23233a == null) {
                        this.f23233a = new ArrayList();
                    }
                    if (mediationInitCallback != null) {
                        this.f23233a.add(mediationInitCallback);
                    }
                    if (this.f23234d) {
                        return;
                    }
                    this.f23234d = true;
                    AudienceNetworkAds.buildInitSettings(context.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener() { // from class: com.anythink.network.facebook.FacebookATInitManager.1
                        @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                        public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                            FacebookATInitManager.a(FacebookATInitManager.this, initResult);
                        }
                    }).initialize();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString(AdSDKNotificationListener.ENCRYPTED_CPM_KEY);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void a(final Context context, final Map<String, Object> map, final boolean z8, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.facebook.FacebookATInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidRequestInfo facebookBidRequestInfo = new FacebookBidRequestInfo(context, map);
                if (z8) {
                    facebookBidRequestInfo.fillBannerData(map);
                }
                if (facebookBidRequestInfo.isValid()) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onSuccess(facebookBidRequestInfo);
                        return;
                    }
                    return;
                }
                ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener3 != null) {
                    aTBidRequestInfoListener3.onFailed(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                }
            }
        });
    }

    public static /* synthetic */ void a(FacebookATInitManager facebookATInitManager, AudienceNetworkAds.InitResult initResult) {
        synchronized (facebookATInitManager.f23235e) {
            try {
                List<MediationInitCallback> list = facebookATInitManager.f23233a;
                if (list != null) {
                    for (MediationInitCallback mediationInitCallback : list) {
                        if (initResult.isSuccess()) {
                            if (mediationInitCallback != null) {
                                mediationInitCallback.onSuccess();
                            }
                        } else if (mediationInitCallback != null) {
                            mediationInitCallback.onFail(initResult.getMessage());
                        }
                    }
                }
                facebookATInitManager.f23234d = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
