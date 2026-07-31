package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class mk extends AbstractC1451e {

    /* renamed from: i, reason: collision with root package name */
    private final String f18055i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* renamed from: j, reason: collision with root package name */
    private final String f18056j = "super.dwh.mediation_events";

    /* renamed from: k, reason: collision with root package name */
    private final String f18057k = cc.f15724Q;

    /* renamed from: l, reason: collision with root package name */
    private final String f18058l = "data";

    mk(int i4) {
        this.f15944g = i4;
    }

    @Override // com.ironsource.AbstractC1451e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC1451e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC1451e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f15943f = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    zb zbVar = arrayList.get(i4);
                    i4++;
                    JSONObject a4 = a(zbVar);
                    if (a4 != null) {
                        jSONArray.put(a4);
                    }
                }
            }
            jSONObject2.put(cc.f15724Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return "";
        }
    }
}
