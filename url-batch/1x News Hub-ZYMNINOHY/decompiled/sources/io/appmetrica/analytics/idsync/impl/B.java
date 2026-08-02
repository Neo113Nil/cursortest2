package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f5620a;

    /* renamed from: b, reason: collision with root package name */
    public final A f5621b = new A();

    /* renamed from: c, reason: collision with root package name */
    public final String f5622c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f5623d = c2.p.g0(a());

    public B(ModulePreferences modulePreferences) {
        this.f5620a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<z> model = this.f5621b.toModel(this.f5620a.getString(this.f5622c, null));
        int Z2 = c2.q.Z(c2.g.N(model));
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (Object obj : model) {
            linkedHashMap.put(((z) obj).f5687a, obj);
        }
        return linkedHashMap;
    }
}
