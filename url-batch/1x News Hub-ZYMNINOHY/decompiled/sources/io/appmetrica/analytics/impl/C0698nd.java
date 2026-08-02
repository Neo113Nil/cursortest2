package io.appmetrica.analytics.impl;

import b2.C0190d;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698nd extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7947b;

    public C0698nd(C0457e5 c0457e5) {
        super(c0457e5);
        String b3 = c0457e5.b().b();
        b3 = b3 == null ? "empty" : b3;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b3}, 1));
        LinkedHashMap a3 = C0876ua.k().o().a(b3);
        ArrayList arrayList = new ArrayList(a3.size());
        for (Map.Entry entry : a3.entrySet()) {
            arrayList.add(new C0190d(entry.getValue(), new C0362ad(c0457e5, (String) entry.getKey())));
        }
        this.f7947b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        ArrayList arrayList;
        if (this.f6835a.f7242t.c() && ((arrayList = this.f7947b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0190d c0190d = (C0190d) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c0190d.f2547a;
                C0362ad c0362ad = (C0362ad) c0190d.f2548b;
                if (moduleServiceEventHandler.handle(new C0440dd(c0362ad.f7000b, c0362ad.f6999a, new C0414cd(c0362ad.f7002d, c0362ad.f7001c, w5)), w5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
