package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949sd {
    public static ArrayList a() {
        C0510bd c0510bd;
        List<String> a3 = C0501b4.l().f11467m.a();
        ArrayList arrayList = new ArrayList(d3.k.Y(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0510bd = new C0510bd(str, false);
            } else {
                C0501b4.l().m().f11284b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0510bd = new C0510bd(str, true);
            }
            arrayList.add(c0510bd);
        }
        return arrayList;
    }
}
