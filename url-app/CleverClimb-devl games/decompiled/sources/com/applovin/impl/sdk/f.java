package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, f> f3262a = new HashMap(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3263b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f3264c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f3265d = new Object();

    private f() {
    }

    public static f a(String str) {
        f fVar;
        synchronized (f3263b) {
            if (!f3262a.containsKey(str)) {
                f3262a.put(str, new f());
            }
            fVar = f3262a.get(str);
        }
        return fVar;
    }

    public Integer b(String str) {
        Integer num;
        synchronized (this.f3265d) {
            if (this.f3264c.containsKey(str)) {
                this.f3264c.put(str, Integer.valueOf(this.f3264c.get(str).intValue() + 1));
            } else {
                this.f3264c.put(str, 1);
            }
            num = this.f3264c.get(str);
        }
        return num;
    }
}
