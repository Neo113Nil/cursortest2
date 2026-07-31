package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pz0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oz0 {
    public static final void a(@NotNull ArrayList report) {
        Intrinsics.checkNotNullParameter(report, "report");
        int size = report.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = report.get(i4);
            i4++;
            pz0.a aVar = (pz0.a) obj;
            int ordinal = aVar.b().ordinal();
            if (ordinal == 0) {
                po0.b(aVar.a(), new Object[0]);
            } else if (ordinal == 1) {
                po0.a(aVar.a(), new Object[0]);
            }
        }
    }
}
