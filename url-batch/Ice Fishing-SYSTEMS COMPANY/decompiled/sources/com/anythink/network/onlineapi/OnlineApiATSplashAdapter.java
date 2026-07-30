package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.h;
import com.anythink.basead.g.a;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.expressad.f.a.b;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    h f23376a;

    /* renamed from: b, reason: collision with root package name */
    x f23377b;

    /* renamed from: c, reason: collision with root package name */
    String f23378c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23379d;

    /* renamed from: com.anythink.network.onlineapi.OnlineApiATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClick(j jVar) {
            n trackingInfo = OnlineApiATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.I(jVar.f9139a);
                trackingInfo.J(jVar.f9140b);
            }
            if (((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClosed() {
            if (((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdShow(j jVar) {
            if (((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onDeeplinkCallback(boolean z8) {
            if (((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener.onDeeplinkCallback(z8);
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onShowFailed(f fVar) {
            if (((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) OnlineApiATSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, fVar.a(), fVar.b()));
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        h hVar = this.f23376a;
        if (hVar != null) {
            hVar.b();
            this.f23376a = null;
        }
        this.f23377b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23379d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23378c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        h hVar = this.f23376a;
        boolean z8 = hVar != null && hVar.c();
        if (z8 && this.f23379d == null) {
            this.f23379d = d.a(this.f23376a);
        }
        return z8;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        this.f23378c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey(b.dl) || (obj2 = map.get(b.dl)) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i = parseInt == 1 ? 0 : parseInt;
        }
        x xVar = (x) map.get(j.w.f12771a);
        this.f23377b = xVar;
        h hVar = new h(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23376a = hVar;
        hVar.a(new d.a().d(parseInt2).e(parseInt3).f(i).a());
        this.f23376a.a(new AnonymousClass2());
        this.f23376a.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.onlineapi.OnlineApiATSplashAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                OnlineApiATSplashAdapter onlineApiATSplashAdapter = OnlineApiATSplashAdapter.this;
                onlineApiATSplashAdapter.f23379d = com.anythink.basead.d.a(onlineApiATSplashAdapter.f23376a);
                if (((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATSplashAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f23376a != null) {
            if (isCustomSkipView()) {
                this.f23376a.a();
            }
            this.f23376a.a(viewGroup);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        this.f23378c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey(b.dl) || (obj2 = map.get(b.dl)) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i = parseInt == 1 ? 0 : parseInt;
        }
        x xVar = (x) map.get(j.w.f12771a);
        this.f23377b = xVar;
        h hVar = new h(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23376a = hVar;
        hVar.a(new d.a().d(parseInt2).e(parseInt3).f(i).a());
        this.f23376a.a(new AnonymousClass2());
    }
}
