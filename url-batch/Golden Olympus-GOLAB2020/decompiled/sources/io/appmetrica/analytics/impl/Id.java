package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Id {
    public static void a() {
        Iterator it = C3082x4.l().f40128m.a().iterator();
        while (it.hasNext()) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                C3082x4.l().m().f39891b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
