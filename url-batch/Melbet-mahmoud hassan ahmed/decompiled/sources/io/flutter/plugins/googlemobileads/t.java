package io.flutter.plugins.googlemobileads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, o> f17574a;

    t(Map<String, o> map) {
        this.f17574a = map;
    }

    t(x2.b bVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, x2.a> entry : bVar.a().entrySet()) {
            hashMap.put(entry.getKey(), new o(entry.getValue()));
        }
        this.f17574a = hashMap;
    }
}
