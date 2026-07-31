package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import com.onesignal.inAppMessages.internal.display.impl.n;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.q;
import l5.t;
import n3.C0543a;
import n3.C0547e;
import n3.C0548f;
import n3.C0549g;
import n3.C0550h;
import n3.EnumC0552j;
import org.json.JSONArray;
import org.json.JSONObject;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final C0550h invoke(JSONObject it) {
            i.e(it, "it");
            EnumC0552j.a aVar = EnumC0552j.Companion;
            String string = it.getString(n.EVENT_TYPE_KEY);
            i.d(string, "getString(...)");
            EnumC0552j fromString = aVar.fromString(string);
            if (fromString != null) {
                return new C0550h(it.getString("id"), fromString, e.safeString(it, "token"), e.safeBool(it, "enabled"), e.safeInt(it, "notification_types"), e.safeString(it, "sdk"), e.safeString(it, "device_model"), e.safeString(it, "device_os"), e.safeBool(it, "rooted"), e.safeInt(it, "net_type"), e.safeString(it, "carrier"), e.safeString(it, "app_version"));
            }
            return null;
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0077b extends j implements InterfaceC0743l {
        public static final C0077b INSTANCE = new C0077b();

        public C0077b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final JSONObject invoke(C0549g it) {
            i.e(it, "it");
            return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
        }
    }

    private b() {
    }

    public final C0543a convertToCreateUserResponse(JSONObject jsonObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        i.e(jsonObject, "jsonObject");
        JSONObject safeJSONObject2 = e.safeJSONObject(jsonObject, r3.c.IDENTITY_NAME_SPACE);
        if (safeJSONObject2 == null || (map3 = e.toMap(safeJSONObject2)) == null) {
            map = q.f5304f;
        } else {
            map = new LinkedHashMap(t.p0(map3.size()));
            Iterator<T> it = map3.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = e.safeJSONObject(jsonObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = e.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = e.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.p0(map2.size()));
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        C0548f c0548f = new C0548f(linkedHashMap, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "country") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "long") : null);
        List expandJSONArray = e.expandJSONArray(jsonObject, "subscriptions", a.INSTANCE);
        String safeString = e.safeString(jsonObject, "ryw_token");
        return new C0543a(map, c0548f, expandJSONArray, safeString != null ? new M1.b(safeString, e.safeLong(jsonObject, "ryw_delay")) : null);
    }

    public final JSONObject convertToJSON(C0548f properties) {
        i.e(properties, "properties");
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), "country", properties.getCountry());
    }

    public final JSONObject convertToJSON(C0547e propertiesDeltas) {
        i.e(propertiesDeltas, "propertiesDeltas");
        JSONObject putSafe = e.putSafe(e.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return e.putJSONArray(e.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), C0077b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<C0550h> subscriptions) {
        i.e(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<C0550h> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(C0550h subscription) {
        i.e(subscription, "subscription");
        JSONObject putSafe = e.putSafe(new JSONObject(), "id", subscription.getId());
        EnumC0552j type = subscription.getType();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(putSafe, n.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), "sdk", subscription.getSdk()), "device_model", subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}
