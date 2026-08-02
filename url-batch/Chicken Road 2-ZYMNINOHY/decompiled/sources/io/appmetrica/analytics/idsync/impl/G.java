package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f9892a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9893b = new F();

    /* renamed from: c, reason: collision with root package name */
    public final String f9894c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f9895d = d3.t.H(a());

    public G(ModulePreferences modulePreferences) {
        this.f9892a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.f9893b.toModel(this.f9892a.getString(this.f9894c, null));
        int z = d3.u.z(d3.k.Y(model));
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).f9885a, obj);
        }
        return linkedHashMap;
    }
}
