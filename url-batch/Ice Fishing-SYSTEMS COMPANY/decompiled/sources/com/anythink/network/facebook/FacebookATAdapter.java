package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.b.j;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationBidManager;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.facebook.FacebookATBaseNativeAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f23207a;

    /* renamed from: b, reason: collision with root package name */
    String f23208b = "";

    /* renamed from: c, reason: collision with root package name */
    String f23209c = "0";

    /* renamed from: d, reason: collision with root package name */
    String f23210d = "";

    /* renamed from: e, reason: collision with root package name */
    boolean f23211e = false;

    /* renamed from: com.anythink.network.facebook.FacebookATAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements FacebookATBaseNativeAd.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FacebookATBaseNativeAd f23212a;

        public AnonymousClass1(FacebookATBaseNativeAd facebookATBaseNativeAd) {
            this.f23212a = facebookATBaseNativeAd;
        }

        @Override // com.anythink.network.facebook.FacebookATBaseNativeAd.a
        public final void onLoadFail(String str, String str2) {
            if (((ATBaseAdInternalAdapter) FacebookATAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) FacebookATAdapter.this).mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.anythink.network.facebook.FacebookATBaseNativeAd.a
        public final void onLoadSuccess() {
            if (((ATBaseAdInternalAdapter) FacebookATAdapter.this).mLoadListener == null || ((ATBaseAdInternalAdapter) FacebookATAdapter.this).mLoadListener == null) {
                return;
            }
            ((ATBaseAdInternalAdapter) FacebookATAdapter.this).mLoadListener.onAdCacheLoaded(this.f23212a);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f23208b = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23208b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        char c4;
        try {
            if (map.containsKey("unit_id")) {
                this.f23208b = map.get("unit_id").toString();
            }
            if (map.containsKey("unit_type")) {
                this.f23209c = map.get("unit_type").toString();
            }
            if (map.containsKey("height")) {
                this.f23210d = map.get("height").toString();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f23208b)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "facebook unitId is empty.");
                return;
            }
            return;
        }
        if (map != null) {
            try {
                this.f23211e = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            } catch (Exception unused) {
            }
        }
        Context applicationContext = context.getApplicationContext();
        FacebookATInitManager.getInstance().initSDK(applicationContext, map);
        if (map.containsKey("payload")) {
            this.f23207a = map.get("payload").toString();
        }
        String str = this.f23209c;
        switch (str.hashCode()) {
            case j.f5973W /* 48 */:
                if (str.equals("0")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case j.f5974X /* 49 */:
                if (str.equals("1")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        FacebookATBaseNativeAd facebookATNativeAd = c4 != 0 ? c4 != 1 ? c4 != 2 ? new FacebookATNativeAd(applicationContext, new NativeAd(applicationContext, this.f23208b)) : new FacebookATNativeBannerAd(applicationContext, new NativeBannerAd(applicationContext, this.f23208b)) : new FacebookATNativeExpressAd(applicationContext, new NativeAd(applicationContext, this.f23208b)) : new FacebookATNativeBannerExpressAd(applicationContext, new NativeBannerAd(applicationContext, this.f23208b), this.f23210d);
        facebookATNativeAd.loadAd(this.f23207a, new AnonymousClass1(facebookATNativeAd));
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(Context context, Map<String, Object> map) {
        char c4;
        if (map.containsKey("payload")) {
            this.f23207a = map.get("payload").toString();
        }
        String str = this.f23209c;
        switch (str.hashCode()) {
            case j.f5973W /* 48 */:
                if (str.equals("0")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case j.f5974X /* 49 */:
                if (str.equals("1")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        FacebookATBaseNativeAd facebookATNativeAd = c4 != 0 ? c4 != 1 ? c4 != 2 ? new FacebookATNativeAd(context, new NativeAd(context, this.f23208b)) : new FacebookATNativeBannerAd(context, new NativeBannerAd(context, this.f23208b)) : new FacebookATNativeExpressAd(context, new NativeAd(context, this.f23208b)) : new FacebookATNativeBannerExpressAd(context, new NativeBannerAd(context, this.f23208b), this.f23210d);
        facebookATNativeAd.loadAd(this.f23207a, new AnonymousClass1(facebookATNativeAd));
    }
}
