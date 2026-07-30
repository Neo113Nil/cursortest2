package com.onesignal.user.internal.backend.impl;

import P3.f;
import P3.g;
import P3.h;
import P3.j;
import com.appsflyer.AdRevenueScheme;
import com.onesignal.common.e;
import com.onesignal.inAppMessages.internal.display.impl.m;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import o2.C0800b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            j.a aVar = j.Companion;
            String string = it.getString(m.EVENT_TYPE_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            j fromString = aVar.fromString(string);
            if (fromString != null) {
                return new h(it.getString("id"), fromString, e.safeString(it, "token"), e.safeBool(it, "enabled"), e.safeInt(it, "notification_types"), e.safeString(it, "sdk"), e.safeString(it, "device_model"), e.safeString(it, "device_os"), e.safeBool(it, "rooted"), e.safeInt(it, "net_type"), e.safeString(it, "carrier"), e.safeString(it, "app_version"));
            }
            return null;
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0077b extends p implements Function1 {
        public static final C0077b INSTANCE = new C0077b();

        public C0077b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JSONObject invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
        }
    }

    private b() {
    }

    public final P3.a convertToCreateUserResponse(JSONObject jsonObject) {
        Map c7;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map;
        Map<String, Object> map2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONObject safeJSONObject2 = e.safeJSONObject(jsonObject, T3.c.IDENTITY_NAME_SPACE);
        if (safeJSONObject2 == null || (map2 = e.toMap(safeJSONObject2)) == null) {
            c7 = I.c();
        } else {
            c7 = new LinkedHashMap(H.a(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                c7.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject safeJSONObject3 = e.safeJSONObject(jsonObject, "properties");
        if (safeJSONObject3 == null || (safeJSONObject = e.safeJSONObject(safeJSONObject3, "tags")) == null || (map = e.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(H.a(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        f fVar = new f(linkedHashMap, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "language") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, "timezone_id") : null, safeJSONObject3 != null ? e.safeString(safeJSONObject3, AdRevenueScheme.COUNTRY) : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "lat") : null, safeJSONObject3 != null ? e.safeDouble(safeJSONObject3, "long") : null);
        List expandJSONArray = e.expandJSONArray(jsonObject, "subscriptions", a.INSTANCE);
        String safeString = e.safeString(jsonObject, "ryw_token");
        return new P3.a(c7, fVar, expandJSONArray, safeString != null ? new C0800b(safeString, e.safeLong(jsonObject, "ryw_delay")) : null);
    }

    public final JSONObject convertToJSON(f properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), AdRevenueScheme.COUNTRY, properties.getCountry());
    }

    public final JSONObject convertToJSON(P3.e propertiesDeltas) {
        Intrinsics.checkNotNullParameter(propertiesDeltas, "propertiesDeltas");
        JSONObject putSafe = e.putSafe(e.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return e.putJSONArray(e.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), C0077b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(h subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        JSONObject putSafe = e.putSafe(new JSONObject(), "id", subscription.getId());
        j type = subscription.getType();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(putSafe, m.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), "sdk", subscription.getSdk()), "device_model", subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}
