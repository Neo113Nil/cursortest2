package com.onesignal.user.internal.backend.impl;

import com.appsflyer.AdRevenueScheme;
import com.onesignal.common.e;
import com.onesignal.inAppMessages.internal.display.impl.n;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.k0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import uc.f;
import uc.g;
import uc.h;
import uc.j;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            j.a aVar = j.Companion;
            String string = jSONObject.getString(n.EVENT_TYPE_KEY);
            string.getClass();
            j fromString = aVar.fromString(string);
            if (fromString != null) {
                return new h(jSONObject.getString("id"), fromString, e.safeString(jSONObject, "token"), e.safeBool(jSONObject, "enabled"), e.safeInt(jSONObject, "notification_types"), e.safeString(jSONObject, "sdk"), e.safeString(jSONObject, "device_model"), e.safeString(jSONObject, "device_os"), e.safeBool(jSONObject, "rooted"), e.safeInt(jSONObject, "net_type"), e.safeString(jSONObject, "carrier"), e.safeString(jSONObject, "app_version"));
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0067b extends p implements Function1 {
        public static final C0067b INSTANCE = new C0067b();

        public C0067b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JSONObject invoke(g gVar) {
            gVar.getClass();
            return new JSONObject().put("sku", gVar.getSku()).put("iso", gVar.getIso()).put("amount", gVar.getAmount().toString());
        }
    }

    private b() {
    }

    public final uc.a convertToCreateUserResponse(JSONObject jSONObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        jSONObject.getClass();
        JSONObject safeJSONObject2 = e.safeJSONObject(jSONObject, "identity");
        if (safeJSONObject2 == null || (map3 = e.toMap(safeJSONObject2)) == null) {
            map = k0.f5575d;
            map.getClass();
        } else {
            map = new LinkedHashMap(o0.a(map3.size()));
            Iterator<T> it = map3.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = e.safeJSONObject(jSONObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = e.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = e.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(o0.a(map2.size()));
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new uc.a(map, new f(linkedHashMap, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, AdRevenueScheme.COUNTRY) : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "long") : null), e.expandJSONArray(jSONObject, "subscriptions", a.INSTANCE));
    }

    public final JSONObject convertToJSON(h hVar) {
        hVar.getClass();
        JSONObject putSafe = e.putSafe(new JSONObject(), "id", hVar.getId());
        j type = hVar.getType();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(putSafe, n.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", hVar.getToken()), "enabled", hVar.getEnabled()), "notification_types", hVar.getNotificationTypes()), "sdk", hVar.getSdk()), "device_model", hVar.getDeviceModel()), "device_os", hVar.getDeviceOS()), "rooted", hVar.getRooted()), "net_type", hVar.getNetType()), "carrier", hVar.getCarrier()), "app_version", hVar.getAppVersion());
    }

    public final JSONObject convertToJSON(uc.e eVar) {
        eVar.getClass();
        JSONObject putSafe = e.putSafe(e.putSafe(new JSONObject(), "session_time", eVar.getSessionTime()), "session_count", eVar.getSessionCount());
        BigDecimal amountSpent = eVar.getAmountSpent();
        return e.putJSONArray(e.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", eVar.getPurchases(), C0067b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(f fVar) {
        fVar.getClass();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putMap(new JSONObject(), "tags", fVar.getTags()), "language", fVar.getLanguage()), "timezone_id", fVar.getTimezoneId()), "lat", fVar.getLatitude()), "long", fVar.getLongitude()), AdRevenueScheme.COUNTRY, fVar.getCountry());
    }
}
