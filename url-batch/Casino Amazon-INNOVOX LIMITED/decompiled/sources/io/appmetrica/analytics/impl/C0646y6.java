package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0646y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Ul f1579a = new Ul();
    public Map b = MapsKt.emptyMap();
    public Map c = MapsKt.emptyMap();
    public IdentifiersResult d;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000c, B:10:0x0013, B:12:0x0017, B:18:0x001f, B:22:0x0056, B:23:0x006b, B:25:0x0071, B:29:0x0090, B:30:0x008b, B:33:0x00a3, B:34:0x00ba, B:36:0x00c0, B:40:0x00e2, B:42:0x00e6, B:49:0x00ea, B:51:0x009f, B:52:0x0027), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap hashMap;
        Map emptyMap;
        List a2;
        IdentifiersResult identifiersResult2 = this.d;
        String str = identifiersResult2 != null ? identifiersResult2.id : null;
        if (str != null) {
            if (str.length() != 0) {
                String str2 = identifiersResult.id;
                if (str2 != null) {
                    if (str2.length() == 0) {
                    }
                }
            }
        }
        this.d = identifiersResult;
        String str3 = identifiersResult.id;
        if (str3 == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        ArrayList a3 = AbstractC0224hb.a(new JSONArray(jSONObject.optString(next)));
                        if (a3 != null) {
                            hashMap.put(next, a3);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (hashMap != null) {
            emptyMap = new LinkedHashMap(MapsKt.mapCapacity(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                emptyMap.put(key, new IdentifiersResult(String.valueOf(mo.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
            }
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        this.c = emptyMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(emptyMap.size()));
        for (Map.Entry entry2 : emptyMap.entrySet()) {
            Object key2 = entry2.getKey();
            String str4 = ((IdentifiersResult) entry2.getValue()).id;
            if (str4 != null) {
                try {
                    a2 = AbstractC0224hb.a(new JSONArray(str4));
                } catch (Throwable unused3) {
                }
                if (a2 != null) {
                    a2 = CollectionsKt.emptyList();
                }
                linkedHashMap.put(key2, a2);
            }
            a2 = null;
            if (a2 != null) {
            }
            linkedHashMap.put(key2, a2);
        }
        this.b = linkedHashMap;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list2 = (List) this.b.get(str);
            if (list2 != null && !list2.isEmpty()) {
                linkedHashMap.put(str, list2);
            }
        }
        Ul ul = this.f1579a;
        String a2 = AbstractC0224hb.a((Map) linkedHashMap);
        IdentifiersResult identifiersResult = this.d;
        if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
            identifierStatus = IdentifierStatus.UNKNOWN;
        }
        hashMap.put("appmetrica_custom_sdk_hosts", ul.a(new IdentifiersResult(a2, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
    }
}
