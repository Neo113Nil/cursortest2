package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bv {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f15651a;

    public bv(C1454e2 c1454e2) {
        this.f15651a = c1454e2;
    }

    public void a() {
        this.f15651a.a(EnumC1433b2.COLLECT_TOKEN, new HashMap());
    }

    public void b(Map<String, Object> map, long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f15651a.a(EnumC1433b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    public void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f15651a.a(EnumC1433b2.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f15651a.a(EnumC1433b2.COLLECT_TOKENS_FAILED, hashMap);
    }

    public void a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f15651a.a(EnumC1433b2.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void a(Map<String, Object> map, long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f15651a.a(EnumC1433b2.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(Map<String, Object> map, long j4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f15651a.a(EnumC1433b2.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }
}
