package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tg1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f32434a;

    public tg1(@NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f32434a = adLoadingPhasesManager;
    }

    @NotNull
    public final LinkedHashMap a(@NotNull Set phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        Sequence<C2058l4> p4 = kotlin.sequences.k.p(CollectionsKt.asSequence(this.f32434a.b()), new sg1(phases));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2058l4 c2058l4 : p4) {
            String a4 = c2058l4.a().a();
            Object obj = linkedHashMap.get(a4);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a4, obj);
            }
            ((List) obj).add(c2058l4.b());
        }
        return linkedHashMap;
    }
}
