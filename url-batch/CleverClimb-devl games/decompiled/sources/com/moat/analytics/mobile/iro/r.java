package com.moat.analytics.mobile.iro;

import android.graphics.Rect;
import android.view.View;
import com.moat.analytics.mobile.iro.NativeDisplayTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class r extends c implements NativeDisplayTracker {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<NativeDisplayTracker.MoatUserInteractionType> f1212;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<String, String> f1213;

    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˊ */
    final String mo1190() {
        return "NativeDisplayTracker";
    }

    r(View view, Map<String, String> map) {
        super(view, true, false);
        this.f1212 = new HashSet();
        b.m1182(3, "NativeDisplayTracker", this, "Initializing.");
        this.f1213 = map;
        if (view == null) {
            String str = "NativeDisplayTracker initialization not successful, Target view is null";
            b.m1182(3, "NativeDisplayTracker", this, str);
            b.m1180("[ERROR] ", str);
            this.f1088 = new o("Target view is null");
            return;
        }
        if (map == null || map.isEmpty()) {
            String str2 = "NativeDisplayTracker initialization not successful, AdIds is null or empty";
            b.m1182(3, "NativeDisplayTracker", this, str2);
            b.m1180("[ERROR] ", str2);
            this.f1088 = new o("AdIds is null or empty");
            return;
        }
        b bVar = ((j) j.getInstance()).f1166;
        if (bVar == null) {
            String str3 = "NativeDisplayTracker initialization not successful, prepareNativeDisplayTracking was not called successfully";
            b.m1182(3, "NativeDisplayTracker", this, str3);
            b.m1180("[ERROR] ", str3);
            this.f1088 = new o("prepareNativeDisplayTracking was not called successfully");
            return;
        }
        this.f1090 = bVar.f1073;
        try {
            super.m1192(bVar.f1075);
            if (this.f1090 != null) {
                this.f1090.m1230(m1308());
            }
            b.m1180("[SUCCESS] ", "NativeDisplayTracker created for " + m1189() + ", with adIds:" + map.toString());
        } catch (o e) {
            this.f1088 = e;
        }
    }

    @Override // com.moat.analytics.mobile.iro.NativeDisplayTracker
    public final void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        try {
            b.m1182(3, "NativeDisplayTracker", this, "reportUserInteractionEvent:" + moatUserInteractionType.name());
            if (this.f1212.contains(moatUserInteractionType)) {
                return;
            }
            this.f1212.add(moatUserInteractionType);
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("adKey", this.f1089);
            jSONObject.accumulate("event", moatUserInteractionType.name().toLowerCase());
            if (this.f1090 != null) {
                this.f1090.m1232(jSONObject.toString());
            }
        } catch (JSONException e) {
            b.m1183("NativeDisplayTracker", this, "Got JSON exception");
            o.m1290(e);
        } catch (Exception e2) {
            o.m1290(e2);
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    private String m1308() {
        try {
            Map<String, String> map = this.f1213;
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
            String jSONObject = new JSONObject(linkedHashMap).toString();
            b.m1182(3, "NativeDisplayTracker", this, "Parsed ad ids = " + jSONObject);
            return "{\"adIds\":" + jSONObject + ", \"adKey\":\"" + this.f1089 + "\", \"adSize\":" + m1307() + "}";
        } catch (Exception e) {
            o.m1290(e);
            return "";
        }
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private String m1307() {
        try {
            Rect m1338 = y.m1338(super.m1187());
            int width = m1338.width();
            int height = m1338.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            o.m1290(e);
            return null;
        }
    }
}
