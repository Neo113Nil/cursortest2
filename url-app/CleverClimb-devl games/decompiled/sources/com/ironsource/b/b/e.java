package com.ironsource.b.b;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronbeastEventsFormatter.java */
/* loaded from: classes2.dex */
class e extends a {

    /* renamed from: c, reason: collision with root package name */
    private final String f6741c = "https://track.atom-data.io";

    /* renamed from: d, reason: collision with root package name */
    private final String f6742d = "super.dwh.mediation_events";
    private final String e = "table";
    private final String f = "data";

    @Override // com.ironsource.b.b.a
    public String b() {
        return "https://track.atom-data.io";
    }

    @Override // com.ironsource.b.b.a
    public String c() {
        return "ironbeast";
    }

    e(int i) {
        this.f6725b = i;
    }

    @Override // com.ironsource.b.b.a
    public String a(ArrayList<com.ironsource.a.b> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f6724a = new JSONObject();
        } else {
            this.f6724a = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<com.ironsource.a.b> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a2 = a(it.next());
                    if (a2 != null) {
                        jSONArray.put(a2);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2.toString();
    }
}
