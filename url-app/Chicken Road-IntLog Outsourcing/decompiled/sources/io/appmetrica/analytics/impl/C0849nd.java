package io.appmetrica.analytics.impl;

import f4.C0430g;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849nd extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8864b;

    public C0849nd(C0608e5 c0608e5) {
        super(c0608e5);
        String b6 = c0608e5.b().b();
        b6 = b6 == null ? "empty" : b6;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b6}, 1));
        LinkedHashMap a6 = C1027ua.k().o().a(b6);
        ArrayList arrayList = new ArrayList(a6.size());
        for (Map.Entry entry : a6.entrySet()) {
            arrayList.add(new C0430g(entry.getValue(), new C0513ad(c0608e5, (String) entry.getKey())));
        }
        this.f8864b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        if (!this.f7670a.f8104t.c()) {
            return false;
        }
        ArrayList arrayList = this.f8864b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0430g c0430g = (C0430g) it.next();
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c0430g.f5668a;
            C0513ad c0513ad = (C0513ad) c0430g.f5669b;
            if (moduleServiceEventHandler.handle(new C0591dd(c0513ad.f7844b, c0513ad.f7843a, new C0565cd(c0513ad.f7846d, c0513ad.f7845c, w5)), w5)) {
                return true;
            }
        }
        return false;
    }
}
