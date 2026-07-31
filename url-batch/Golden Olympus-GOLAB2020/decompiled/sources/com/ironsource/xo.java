package com.ironsource;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class xo extends AbstractC1451e {

    /* renamed from: i, reason: collision with root package name */
    private final String f20333i = lp.f17109a;

    xo(int i4) {
        this.f15944g = i4;
    }

    @Override // com.ironsource.AbstractC1451e
    public String a() {
        return lp.f17109a;
    }

    @Override // com.ironsource.AbstractC1451e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC1451e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f15943f = jSONObject;
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
        return a(jSONArray);
    }
}
