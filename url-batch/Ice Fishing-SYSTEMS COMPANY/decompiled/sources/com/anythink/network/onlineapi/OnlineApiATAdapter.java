package com.anythink.network.onlineapi;

import android.content.Context;
import com.anythink.basead.f.a;
import com.anythink.basead.f.c;
import com.anythink.basead.f.f;
import com.anythink.basead.g.d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    f f23346a;

    /* renamed from: b, reason: collision with root package name */
    x f23347b;

    /* renamed from: c, reason: collision with root package name */
    String f23348c;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        if (this.f23346a != null) {
            this.f23346a = null;
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23348c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i4;
        this.f23348c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        x xVar = (x) map.get(j.w.f12771a);
        this.f23347b = xVar;
        this.f23346a = new f(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar, false);
        int i9 = -1;
        if (map2 != null) {
            try {
                i = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
            } catch (Throwable unused) {
                i = -1;
            }
            try {
                i9 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
            } catch (Throwable unused2) {
            }
            i4 = i9;
            i9 = i;
        } else {
            i4 = -1;
        }
        final int i10 = context.getResources().getDisplayMetrics().widthPixels;
        final int i11 = context.getResources().getDisplayMetrics().heightPixels;
        if (i9 <= 0) {
            i9 = Math.min(i10, i11);
        }
        if (i4 <= 0) {
            i4 = (i9 * 3) / 4;
        }
        if (i9 <= i10) {
            i10 = i9;
        }
        if (i4 <= i11) {
            i11 = i4;
        }
        final Context applicationContext = context.getApplicationContext();
        this.f23346a.a(new d() { // from class: com.anythink.network.onlineapi.OnlineApiATAdapter.1
            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoadError(com.anythink.basead.d.f fVar) {
                if (((ATBaseAdInternalAdapter) OnlineApiATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoaded(a... aVarArr) {
                OnlineApiATNativeAd[] onlineApiATNativeAdArr = new OnlineApiATNativeAd[aVarArr.length];
                for (int i12 = 0; i12 < aVarArr.length; i12++) {
                    aVarArr[i12].a(i10, i11);
                    onlineApiATNativeAdArr[i12] = new OnlineApiATNativeAd(applicationContext, aVarArr[i12]);
                }
                if (((ATBaseAdInternalAdapter) OnlineApiATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATAdapter.this).mLoadListener.onAdCacheLoaded(onlineApiATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        this.f23348c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        x xVar = (x) map.get(j.w.f12771a);
        this.f23347b = xVar;
        this.f23346a = new f(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar, false);
    }
}
