package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.b;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.g.a;
import com.anythink.basead.g.e;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.k;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23152a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f23153b;

    /* renamed from: c, reason: collision with root package name */
    private b f23154c;

    /* renamed from: d, reason: collision with root package name */
    private View f23155d;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23155d = null;
        b bVar = this.f23154c;
        if (bVar != null) {
            bVar.a((a) null);
            this.f23154c.b();
            this.f23154c = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar = this.f23154c;
        if (bVar != null && this.f23153b == null) {
            this.f23153b = d.a(bVar);
        }
        return this.f23155d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23153b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23152a;
        return xVar != null ? xVar.f14313b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        b bVar = this.f23154c;
        if (bVar == null) {
            return true;
        }
        bVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.f23154c.f());
                }
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f23152a);
                AdxATBannerAdapter.this.f23154c.a(new e(AdxATBannerAdapter.this.f23154c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.1
                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z8) {
                        CustomBannerEventListener customBannerEventListener;
                        if ((AdxATBannerAdapter.this.f23154c == null || AdxATBannerAdapter.this.f23154c.g()) && (customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener) != null) {
                            customBannerEventListener.onDeeplinkCallback(z8);
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }
                });
                AdxATBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                        adxATBannerAdapter.f23155d = adxATBannerAdapter.f23154c.a();
                    }
                });
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f23154c.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.adx.AdxATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.f23154c == null || ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener == null) {
                    return;
                }
                AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                adxATBannerAdapter.f23153b = d.a(adxATBannerAdapter.f23154c);
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f23152a);
                AdxATBannerAdapter.this.f23154c.a(new e(AdxATBannerAdapter.this.f23154c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.1.1
                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z8) {
                        CustomBannerEventListener customBannerEventListener;
                        if ((AdxATBannerAdapter.this.f23154c == null || AdxATBannerAdapter.this.f23154c.g()) && (customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener) != null) {
                            customBannerEventListener.onDeeplinkCallback(z8);
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }
                });
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.f23154c.f());
                }
                AdxATBannerAdapter adxATBannerAdapter2 = AdxATBannerAdapter.this;
                adxATBannerAdapter2.f23155d = adxATBannerAdapter2.f23154c.a();
                if (AdxATBannerAdapter.this.f23155d != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                } else {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError("", "Adx bannerView = null");
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str;
        int i;
        int i4;
        Object obj;
        Object obj2;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int i9 = 0;
        int parseInt = (!map.containsKey(k.aM) || (obj2 = map.get(k.aM)) == null) ? 0 : Integer.parseInt(obj2.toString());
        if (map.containsKey("size") && (obj = map.get("size")) != null) {
            str = obj.toString();
        } else {
            str = y.f14334a;
        }
        if (map2 != null) {
            if (map2.containsKey(ATAdConst.KEY.AD_WIDTH)) {
                try {
                    i4 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
                    try {
                        i9 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                i = i9;
                i9 = i4;
            }
            i4 = 0;
            if (map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
            }
            i = i9;
            i9 = i4;
        } else {
            i = 0;
        }
        x xVar = (x) map.get(j.w.f12771a);
        this.f23152a = xVar;
        b bVar = new b(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar);
        this.f23154c = bVar;
        bVar.a(new d.a().c(parseInt).b(str).g(i9).h(i).a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23152a);
    }
}
