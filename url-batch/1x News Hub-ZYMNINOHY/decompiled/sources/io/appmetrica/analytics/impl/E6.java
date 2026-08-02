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
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class E6 {

    /* renamed from: a, reason: collision with root package name */
    public final Xl f5948a = new Xl();

    /* renamed from: b, reason: collision with root package name */
    public Map f5949b;

    /* renamed from: c, reason: collision with root package name */
    public Map f5950c;

    /* renamed from: d, reason: collision with root package name */
    public IdentifiersResult f5951d;

    public E6() {
        c2.n nVar = c2.n.f2638a;
        this.f5949b = nVar;
        this.f5950c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:29:0x0093, B:30:0x008e, B:33:0x00a4, B:34:0x00bb, B:36:0x00c1, B:40:0x00e3, B:42:0x00e5, B:49:0x00e9, B:51:0x00a2, B:52:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap hashMap;
        Map map;
        RandomAccess a3;
        try {
            IdentifiersResult identifiersResult2 = this.f5951d;
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
            this.f5951d = identifiersResult;
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
                            ArrayList a4 = AbstractC0696nb.a(new JSONArray(jSONObject.optString(next)));
                            if (a4 != null) {
                                hashMap.put(next, a4);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (hashMap != null) {
                map = new LinkedHashMap(c2.q.Z(hashMap.size()));
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    map.put(key, new IdentifiersResult(String.valueOf(AbstractC0709no.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                map = c2.n.f2638a;
            }
            this.f5950c = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap(c2.q.Z(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                String str4 = ((IdentifiersResult) entry2.getValue()).id;
                if (str4 != null) {
                    try {
                        a3 = AbstractC0696nb.a(new JSONArray(str4));
                    } catch (Throwable unused3) {
                    }
                    if (a3 != null) {
                        a3 = c2.m.f2637a;
                    }
                    linkedHashMap.put(key2, a3);
                }
                a3 = null;
                if (a3 != null) {
                }
                linkedHashMap.put(key2, a3);
            }
            this.f5949b = linkedHashMap;
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f5949b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Xl xl = this.f5948a;
            String a3 = AbstractC0696nb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f5951d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", xl.a(new IdentifiersResult(a3, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
