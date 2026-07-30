package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d;
import com.anythink.basead.f.a;
import com.anythink.basead.f.c;
import com.anythink.basead.f.f;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.k;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class AdxATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    f f23141a;

    /* renamed from: b, reason: collision with root package name */
    x f23142b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23143c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23144d;

    /* renamed from: e, reason: collision with root package name */
    String f23145e;

    /* renamed from: f, reason: collision with root package name */
    int f23146f;

    /* renamed from: g, reason: collision with root package name */
    int f23147g;

    /* renamed from: h, reason: collision with root package name */
    JSONArray f23148h;
    private boolean i;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        if (this.f23141a != null) {
            this.f23141a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        a a9;
        f fVar = this.f23141a;
        if (fVar == null || !fVar.c() || (a9 = this.f23141a.a()) == null) {
            return null;
        }
        a9.a(this.f23146f, this.f23147g);
        a9.a(this.f23148h);
        a9.a(this.f23144d);
        a9.a(this.f23145e);
        AdxATNativeAd adxATNativeAd = new AdxATNativeAd(context.getApplicationContext(), a9, this.f23142b, this.i, this.f23143c);
        adxATNativeAd.setNetworkInfoMap(d.a(this.f23141a.d()));
        return adxATNativeAd;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 0);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23142b;
        return xVar != null ? xVar.f14313b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        f fVar = this.f23141a;
        if (fVar == null) {
            return true;
        }
        fVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATAdapter.2
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATAdapter.this.getTrackingInfo() != null) {
                    AdxATAdapter.this.getTrackingInfo().M(AdxATAdapter.this.f23141a.f());
                }
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f23141a.a(new com.anythink.basead.g.d() { // from class: com.anythink.network.adx.AdxATAdapter.1
            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoadError(com.anythink.basead.d.f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoaded(a... aVarArr) {
                AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    a aVar = aVarArr[i];
                    AdxATAdapter adxATAdapter = AdxATAdapter.this;
                    aVar.a(adxATAdapter.f23146f, adxATAdapter.f23147g);
                    aVar.a(AdxATAdapter.this.f23148h);
                    aVar.a(AdxATAdapter.this.f23144d);
                    aVar.a(AdxATAdapter.this.f23145e);
                    Context applicationContext = context.getApplicationContext();
                    AdxATAdapter adxATAdapter2 = AdxATAdapter.this;
                    adxATNativeAdArr[i] = new AdxATNativeAd(applicationContext, aVar, adxATAdapter2.f23142b, adxATAdapter2.i, AdxATAdapter.this.f23143c);
                }
                if (AdxATAdapter.this.getTrackingInfo() != null) {
                    AdxATAdapter.this.getTrackingInfo().M(AdxATAdapter.this.f23141a.f());
                }
                if (((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i4;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        this.i = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        x xVar = (x) map.get(j.w.f12771a);
        this.f23142b = xVar;
        this.f23141a = new f(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar, this.i);
        this.f23143c = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, k.aM, "0"));
        this.f23144d = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "v_m", "0"));
        this.f23145e = ATInitMediation.getStringFromMap(map, "video_autoplay", "1");
        if (this.i) {
            AdxATInitManager.getInstance();
            this.f23148h = AdxATInitManager.a(map);
        }
        if (!this.i) {
            this.f23144d = true;
            this.f23145e = ATInitMediation.getStringFromMap(map2, AdxATConst.NATIVE_VIDEO_AUTO_PLAY, "1");
        }
        if (map2 != null) {
            i = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
            i4 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
        } else {
            i = -1;
            i4 = -1;
        }
        int i9 = context.getResources().getDisplayMetrics().widthPixels;
        int i10 = context.getResources().getDisplayMetrics().heightPixels;
        if (i <= 0) {
            i = Math.min(i9, i10);
        }
        if (i <= i9) {
            i9 = i;
        }
        if (i4 > i10) {
            i4 = i10;
        }
        this.f23146f = i9;
        this.f23147g = i4;
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23142b);
    }
}
