package com.facebook.ads.internal.f;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5109a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f5110b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5111c;

    public b(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public b(String str, Map<String, String> map, boolean z) {
        this.f5109a = str;
        this.f5110b = map;
        this.f5111c = z ? "1" : "0";
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("stacktrace", this.f5109a);
        hashMap.put("caught_exception", this.f5111c);
        hashMap.putAll(this.f5110b);
        return hashMap;
    }
}
