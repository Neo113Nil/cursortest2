package com.baidu.bbalbscesium.j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3995c = "upc";

    /* renamed from: d, reason: collision with root package name */
    public static final long f3996d = 9000000;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3997e = "isc";

    /* renamed from: f, reason: collision with root package name */
    public static final long f3998f = 8000000;

    /* renamed from: a, reason: collision with root package name */
    private a f3999a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.baidu.bbalbscesium.j.a> f4000b = new HashMap();

    public interface a {
        List<com.baidu.bbalbscesium.j.a> a();
    }

    public b(a aVar) {
        this.f3999a = aVar;
        for (com.baidu.bbalbscesium.j.a aVar2 : aVar.a()) {
            this.f4000b.put(aVar2.a(), aVar2);
        }
    }

    public com.baidu.bbalbscesium.j.a a(String str) {
        return this.f4000b.get(str);
    }

    public List<com.baidu.bbalbscesium.j.a> a() {
        return new ArrayList(this.f4000b.values());
    }
}
