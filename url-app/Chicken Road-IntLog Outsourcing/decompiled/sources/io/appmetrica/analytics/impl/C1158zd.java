package io.appmetrica.analytics.impl;

import g4.AbstractC0467l;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158zd {
    public static ArrayList a() {
        C0720id c0720id;
        List<String> a6 = C0736j4.l().f8494m.a();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(a6, 10));
        for (String str : a6) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0720id = new C0720id(str, false);
            } else {
                C0736j4.l().m().f8223b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0720id = new C0720id(str, true);
            }
            arrayList.add(c0720id);
        }
        return arrayList;
    }
}
