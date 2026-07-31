package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3040ve {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39976a;

    public C3040ve() {
        HashMap hashMap = new HashMap();
        this.f39976a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put(com.ironsource.c9.f15699c, "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f39976a.containsKey(str) ? (String) this.f39976a.get(str) : str;
    }
}
