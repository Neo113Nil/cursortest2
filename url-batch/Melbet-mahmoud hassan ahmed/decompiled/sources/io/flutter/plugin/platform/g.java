package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, e> f17360a = new HashMap();

    g() {
    }

    @Override // io.flutter.plugin.platform.f
    public boolean a(String str, e eVar) {
        if (this.f17360a.containsKey(str)) {
            return false;
        }
        this.f17360a.put(str, eVar);
        return true;
    }

    e b(String str) {
        return this.f17360a.get(str);
    }
}
