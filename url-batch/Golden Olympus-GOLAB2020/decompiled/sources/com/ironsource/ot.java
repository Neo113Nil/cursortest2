package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ot extends ha {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(@NotNull AbstractC1584w1 adUnitData, @NotNull dw waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int a(dw dwVar) {
        Integer num;
        List<AbstractC1424a0> b4 = dwVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b4) {
            if (((AbstractC1424a0) obj).v()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(b((AbstractC1424a0) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(b((AbstractC1424a0) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final int b(AbstractC1424a0 abstractC1424a0) {
        return abstractC1424a0.h().l();
    }

    @Override // com.ironsource.AbstractC1466g0
    protected boolean a(@NotNull AbstractC1424a0 instance, @NotNull dw waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }
}
