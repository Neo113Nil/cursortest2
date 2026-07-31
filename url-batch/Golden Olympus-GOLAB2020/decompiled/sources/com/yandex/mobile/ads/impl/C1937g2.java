package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1937g2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25979a;

    public C1937g2(@NotNull List<ss> adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f25979a = a(adBreaks);
    }

    private static LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((ss) it.next(), EnumC1913f2.f25579b);
        }
        return linkedHashMap;
    }

    @NotNull
    public final EnumC1913f2 a(@NotNull ss adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        EnumC1913f2 enumC1913f2 = (EnumC1913f2) this.f25979a.get(adBreak);
        return enumC1913f2 == null ? EnumC1913f2.f25583f : enumC1913f2;
    }

    public final boolean a() {
        List listOf = CollectionsKt.listOf((Object[]) new EnumC1913f2[]{EnumC1913f2.f25586i, EnumC1913f2.f25585h});
        Collection values = this.f25979a.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (listOf.contains((EnumC1913f2) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull ss adBreak, @NotNull EnumC1913f2 status) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f25979a.put(adBreak, status);
    }
}
