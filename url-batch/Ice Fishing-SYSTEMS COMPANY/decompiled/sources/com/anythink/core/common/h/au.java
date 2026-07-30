package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f13727a = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f13728a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13729b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, Long> f13730c;

        public a(String str, long j9) {
            this.f13728a = str;
            this.f13729b = j9;
        }

        public final String a() {
            return this.f13728a;
        }

        public final long b() {
            return this.f13729b;
        }

        public final Map<String, Long> c() {
            return this.f13730c;
        }

        public final String toString() {
            return "{errorCode='" + this.f13728a + "', errorCodeInterval=" + this.f13729b + ", msgMap=" + this.f13730c + '}';
        }

        public final void a(Map<String, Long> map) {
            this.f13730c = map;
        }
    }

    public au(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                            a aVar = new a(next, optJSONObject.optLong("c_t", 0L));
                            try {
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.anythink.expressad.foundation.g.a.f19251q);
                                if (optJSONObject2 != null) {
                                    HashMap hashMap = new HashMap();
                                    Iterator<String> keys2 = optJSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        try {
                                            String next2 = keys2.next();
                                            if (!TextUtils.isEmpty(next2)) {
                                                long optLong = optJSONObject2.optLong(next2, 0L);
                                                if (optLong > 0) {
                                                    hashMap.put(next2, Long.valueOf(optLong));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!hashMap.isEmpty()) {
                                        aVar.a(hashMap);
                                    }
                                }
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            this.f13727a.add(aVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public final List<a> a() {
        return this.f13727a;
    }
}
