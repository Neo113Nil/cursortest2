package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Uc {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11048a = new LinkedHashMap();

    public final LinkedHashMap a(String str) {
        LinkedHashMap linkedHashMap = this.f11048a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d3.u.z(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
