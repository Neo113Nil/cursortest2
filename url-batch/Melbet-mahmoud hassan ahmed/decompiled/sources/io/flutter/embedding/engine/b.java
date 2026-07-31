package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f17226b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f17227a = new HashMap();

    b() {
    }

    public static b b() {
        if (f17226b == null) {
            f17226b = new b();
        }
        return f17226b;
    }

    public a a(String str) {
        return this.f17227a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f17227a.put(str, aVar);
        } else {
            this.f17227a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
