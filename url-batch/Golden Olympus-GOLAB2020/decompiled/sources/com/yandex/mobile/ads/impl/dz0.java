package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cz0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dz0 {
    public static boolean a(@NotNull cz0 network) {
        Intrinsics.checkNotNullParameter(network, "network");
        List<cz0.c> b4 = network.b();
        if ((b4 instanceof Collection) && b4.isEmpty()) {
            return true;
        }
        Iterator<T> it = b4.iterator();
        while (it.hasNext()) {
            if (!((cz0.c) it.next()).c()) {
                return false;
            }
        }
        return true;
    }
}
