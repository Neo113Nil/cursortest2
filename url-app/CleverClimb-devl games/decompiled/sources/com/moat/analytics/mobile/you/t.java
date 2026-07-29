package com.moat.analytics.mobile.you;

import android.graphics.Rect;
import android.view.View;
import com.moat.analytics.mobile.you.NativeDisplayTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class t extends b implements NativeDisplayTracker {
    private final Map<String, String> g;
    private final Set<NativeDisplayTracker.MoatUserInteractionType> h;

    t(View view, Map<String, String> map) {
        super(view, true, false);
        m e;
        m mVar;
        this.h = new HashSet();
        p.a(3, "NativeDisplayTracker", this, "Initializing.");
        this.g = map;
        if (view != null) {
            if (map == null || map.isEmpty()) {
                p.a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, AdIds is null or empty");
                e = new m("AdIds is null or empty");
            } else {
                g gVar = ((k) k.getInstance()).f7502d;
                if (gVar == null) {
                    p.a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, prepareNativeDisplayTracking was not called successfully");
                    mVar = new m("prepareNativeDisplayTracking was not called successfully");
                } else {
                    super.a(gVar.f7465b);
                    try {
                        super.a(gVar.f7464a);
                        i();
                        p.a("[SUCCESS] ", a() + " created for " + g() + ", with adIds:" + map.toString());
                        return;
                    } catch (m e2) {
                        e = e2;
                    }
                }
            }
            this.f7457a = e;
            return;
        }
        p.a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, Target view is null");
        mVar = new m("Target view is null");
        this.f7457a = mVar;
    }

    private static String a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            String str = "moatClientLevel" + i;
            if (map.containsKey(str)) {
                linkedHashMap.put(str, map.get(str));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            String str2 = "moatClientSlicer" + i2;
            if (map.containsKey(str2)) {
                linkedHashMap.put(str2, map.get(str2));
            }
        }
        for (String str3 : map.keySet()) {
            if (!linkedHashMap.containsKey(str3)) {
                linkedHashMap.put(str3, map.get(str3));
            }
        }
        return new JSONObject(linkedHashMap).toString();
    }

    private void i() {
        if (this.f7459c != null) {
            this.f7459c.a(j());
        }
    }

    private String j() {
        try {
            String a2 = a(this.g);
            p.a(3, "NativeDisplayTracker", this, "Parsed ad ids = " + a2);
            return "{\"adIds\":" + a2 + ", \"adKey\":\"" + this.e + "\", \"adSize\":" + k() + "}";
        } catch (Exception e) {
            m.a(e);
            return "";
        }
    }

    private String k() {
        try {
            Rect a2 = z.a(super.f());
            int width = a2.width();
            int height = a2.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            m.a(e);
            return null;
        }
    }

    @Override // com.moat.analytics.mobile.you.b
    String a() {
        return "NativeDisplayTracker";
    }

    @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
    public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        try {
            p.a(3, "NativeDisplayTracker", this, "reportUserInteractionEvent:" + moatUserInteractionType.name());
            if (this.h.contains(moatUserInteractionType)) {
                return;
            }
            this.h.add(moatUserInteractionType);
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("adKey", this.e);
            jSONObject.accumulate("event", moatUserInteractionType.name().toLowerCase());
            if (this.f7459c != null) {
                this.f7459c.b(jSONObject.toString());
            }
        } catch (JSONException e) {
            e = e;
            p.b(2, "NativeDisplayTracker", this, "Got JSON exception");
            m.a(e);
        } catch (Exception e2) {
            e = e2;
            m.a(e);
        }
    }
}
