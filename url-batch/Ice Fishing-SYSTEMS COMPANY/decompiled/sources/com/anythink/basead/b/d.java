package com.anythink.basead.b;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6137a = "d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f6138c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.anythink.basead.d.e> f6139b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (f6138c == null) {
            synchronized (d.class) {
                try {
                    if (f6138c == null) {
                        f6138c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6138c;
    }

    public final void a(int i, String str, com.anythink.basead.d.e eVar) {
        this.f6139b.put(i + str, eVar);
    }

    public final com.anythink.basead.d.e a(int i, String str) {
        return this.f6139b.get(i + str);
    }
}
