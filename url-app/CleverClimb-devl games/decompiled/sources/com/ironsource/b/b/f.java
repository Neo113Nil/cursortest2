package com.ironsource.b.b;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OutcomeEventsFormatter.java */
/* loaded from: classes2.dex */
class f extends a {

    /* renamed from: c, reason: collision with root package name */
    private final String f6743c = "https://outcome.supersonicads.com/mediation/";

    @Override // com.ironsource.b.b.a
    public String b() {
        return "https://outcome.supersonicads.com/mediation/";
    }

    @Override // com.ironsource.b.b.a
    public String c() {
        return "outcome";
    }

    f(int i) {
        this.f6725b = i;
    }

    @Override // com.ironsource.b.b.a
    public String a(ArrayList<com.ironsource.a.b> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f6724a = new JSONObject();
        } else {
            this.f6724a = jSONObject;
        }
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
        return a(jSONArray);
    }
}
