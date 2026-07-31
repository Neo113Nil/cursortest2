package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class J3 implements Yn {
    @Override // io.appmetrica.analytics.impl.Yn, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<N3> invoke(@NotNull List<N3> list, @NotNull N3 n32) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC2775l8 enumC2775l8 = ((N3) it.next()).f37992b;
                EnumC2775l8 enumC2775l82 = n32.f37992b;
                if (enumC2775l8 == enumC2775l82) {
                    if (enumC2775l82 != EnumC2775l8.f39393c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((N3) obj).f37992b != EnumC2775l8.f39393c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.plus((Collection<? extends N3>) arrayList, n32);
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends N3>) list, n32);
    }
}
