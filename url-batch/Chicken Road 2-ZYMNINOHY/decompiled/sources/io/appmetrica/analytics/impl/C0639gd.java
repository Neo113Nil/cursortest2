package io.appmetrica.analytics.impl;

import c3.C0292d;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639gd extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11929b;

    public C0639gd(X4 x4) {
        super(x4);
        String b4 = x4.b().b();
        b4 = b4 == null ? "empty" : b4;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b4}, 1));
        LinkedHashMap a3 = C0817na.k().o().a(b4);
        ArrayList arrayList = new ArrayList(a3.size());
        for (Map.Entry entry : a3.entrySet()) {
            arrayList.add(new C0292d(entry.getValue(), new Tc(x4, (String) entry.getKey())));
        }
        this.f11929b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        ArrayList arrayList;
        if (this.f10886a.f11239t.c() && ((arrayList = this.f11929b) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C0292d c0292d = (C0292d) obj;
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c0292d.f5724a;
                Tc tc = (Tc) c0292d.f5725b;
                if (moduleServiceEventHandler.handle(new Wc(tc.f10991b, tc.f10990a, new Vc(tc.f10993d, tc.f10992c, p5)), p5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
