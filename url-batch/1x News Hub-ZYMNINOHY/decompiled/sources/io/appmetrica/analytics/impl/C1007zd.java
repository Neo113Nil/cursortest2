package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007zd {
    public static ArrayList a() {
        C0569id c0569id;
        List<String> a3 = C0585j4.l().f7603m.a();
        ArrayList arrayList = new ArrayList(c2.g.N(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0569id = new C0569id(str, false);
            } else {
                C0585j4.l().m().f7353b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0569id = new C0569id(str, true);
            }
            arrayList.add(c0569id);
        }
        return arrayList;
    }
}
