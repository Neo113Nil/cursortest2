package com.moat.analytics.mobile.cha;

import android.graphics.Rect;
import android.view.View;
import com.moat.analytics.mobile.cha.NativeDisplayTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class q extends d implements NativeDisplayTracker {

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private final Map<String, String> f984;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private final Set<NativeDisplayTracker.MoatUserInteractionType> f985;

    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final String mo1024() {
        return "NativeDisplayTracker";
    }

    q(View view, Map<String, String> map) {
        super(view, true, false);
        this.f985 = new HashSet();
        a.m994(3, "NativeDisplayTracker", this, "Initializing.");
        this.f984 = map;
        if (view == null) {
            String str = "NativeDisplayTracker initialization not successful, Target view is null";
            a.m994(3, "NativeDisplayTracker", this, str);
            a.m991("[ERROR] ", str);
            this.f879 = new o("Target view is null");
            return;
        }
        if (map == null || map.isEmpty()) {
            String str2 = "NativeDisplayTracker initialization not successful, AdIds is null or empty";
            a.m994(3, "NativeDisplayTracker", this, str2);
            a.m991("[ERROR] ", str2);
            this.f879 = new o("AdIds is null or empty");
            return;
        }
        a aVar = ((f) f.getInstance()).f890;
        if (aVar == null) {
            String str3 = "NativeDisplayTracker initialization not successful, prepareNativeDisplayTracking was not called successfully";
            a.m994(3, "NativeDisplayTracker", this, str3);
            a.m991("[ERROR] ", str3);
            this.f879 = new o("prepareNativeDisplayTracking was not called successfully");
            return;
        }
        this.f876 = aVar.f845;
        try {
            super.m1027(aVar.f843);
            if (this.f876 != null) {
                this.f876.m1084(m1119());
            }
            a.m991("[SUCCESS] ", "NativeDisplayTracker created for " + m1020() + ", with adIds:" + map.toString());
        } catch (o e) {
            this.f879 = e;
        }
    }

    @Override // com.moat.analytics.mobile.cha.NativeDisplayTracker
    public final void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        try {
            a.m994(3, "NativeDisplayTracker", this, "reportUserInteractionEvent:" + moatUserInteractionType.name());
            if (this.f985.contains(moatUserInteractionType)) {
                return;
            }
            this.f985.add(moatUserInteractionType);
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("adKey", this.f875);
            jSONObject.accumulate("event", moatUserInteractionType.name().toLowerCase());
            if (this.f876 != null) {
                this.f876.m1085(jSONObject.toString());
            }
        } catch (JSONException e) {
            a.m995("NativeDisplayTracker", this, "Got JSON exception");
            o.m1110(e);
        } catch (Exception e2) {
            o.m1110(e2);
        }
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private String m1119() {
        try {
            Map<String, String> map = this.f984;
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
            a.m994(3, "NativeDisplayTracker", this, "Parsed ad ids = " + jSONObject);
            return "{\"adIds\":" + jSONObject + ", \"adKey\":\"" + this.f875 + "\", \"adSize\":" + m1120() + "}";
        } catch (Exception e) {
            o.m1110(e);
            return "";
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    private String m1120() {
        try {
            Rect m1157 = u.m1157(super.m1021());
            int width = m1157.width();
            int height = m1157.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            o.m1110(e);
            return null;
        }
    }
}
