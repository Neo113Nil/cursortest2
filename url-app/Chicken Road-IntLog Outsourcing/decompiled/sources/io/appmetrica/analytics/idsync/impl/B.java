package io.appmetrica.analytics.idsync.impl;

import g4.AbstractC0467l;
import g4.AbstractC0476u;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f6387a;

    /* renamed from: b, reason: collision with root package name */
    public final A f6388b = new A();

    /* renamed from: c, reason: collision with root package name */
    public final String f6389c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f6390d = AbstractC0476u.e0(a());

    public B(ModulePreferences modulePreferences) {
        this.f6387a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<z> model = this.f6388b.toModel(this.f6387a.getString(this.f6389c, null));
        int W5 = AbstractC0476u.W(AbstractC0467l.D0(model, 10));
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (Object obj : model) {
            linkedHashMap.put(((z) obj).f6459a, obj);
        }
        return linkedHashMap;
    }
}
