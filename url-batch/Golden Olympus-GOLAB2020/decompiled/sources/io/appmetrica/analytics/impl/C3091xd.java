package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3091xd extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f40171b;

    public C3091xd(@NotNull C2953s5 c2953s5) {
        super(c2953s5);
        String b4 = c2953s5.b().b();
        b4 = b4 == null ? "empty" : b4;
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b4}, 1));
        LinkedHashMap a4 = Ia.j().n().a(b4);
        ArrayList arrayList = new ArrayList(a4.size());
        for (Map.Entry entry : a4.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getValue(), new C2858od(c2953s5, (String) entry.getKey())));
        }
        this.f40171b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NotNull C2773l6 c2773l6) {
        ArrayList arrayList;
        if (this.f38930a.f39784t.c() && ((arrayList = this.f40171b) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                Pair pair = (Pair) obj;
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
                C2858od c2858od = (C2858od) pair.component2();
                if (moduleServiceEventHandler.handle(new C2935rd(c2858od.f39570b, c2858od.f39569a, new C2910qd(c2858od.f39572d, c2858od.f39571c, c2773l6)), c2773l6)) {
                    return true;
                }
            }
        }
        return false;
    }
}
