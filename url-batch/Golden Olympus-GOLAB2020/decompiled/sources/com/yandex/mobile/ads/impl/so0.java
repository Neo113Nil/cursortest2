package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class so0 {
    @NotNull
    public static ro0 a(@NotNull aa1 nativeValidator, @NotNull List showNotices) {
        int i4;
        Integer num;
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        if (!showNotices.isEmpty()) {
            Iterator it = showNotices.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((tx1) it.next()).d());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((tx1) it.next()).d());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (num != null) {
                i4 = num.intValue();
                return new ro0(nativeValidator, i4);
            }
        }
        i4 = 50;
        return new ro0(nativeValidator, i4);
    }
}
