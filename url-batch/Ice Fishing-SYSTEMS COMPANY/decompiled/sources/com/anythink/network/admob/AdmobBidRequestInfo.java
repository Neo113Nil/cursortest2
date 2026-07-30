package com.anythink.network.admob;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import java.util.Map;
import k2.C4637h;
import k2.EnumC4631b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdmobBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f23061a;

    public AdmobBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, EnumC4631b enumC4631b) {
        int i;
        int i4;
        try {
            this.f23061a = new JSONObject();
            this.f23061a.put("unit_id", map.get("unit_id").toString());
            this.f23061a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, str);
            if (enumC4631b == EnumC4631b.BANNER) {
                C4637h a9 = AdmobATConst.a(context, map2, map);
                if (a9 == null || (i = a9.f38711a) <= 0) {
                    i = 320;
                }
                if (a9 == null || (i4 = a9.f38712b) <= 0) {
                    i4 = 50;
                }
                this.f23061a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, i);
                this.f23061a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i4);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f23061a;
    }
}
