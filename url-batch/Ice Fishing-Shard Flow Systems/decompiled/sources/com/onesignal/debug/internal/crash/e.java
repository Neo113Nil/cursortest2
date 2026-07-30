package com.onesignal.debug.internal.crash;

import E3.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {
    public static final H3.a createAnrDetector(E3.f platformProvider, E3.c logger, long j, long j7) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        return new d(new k(platformProvider, new B.f(platformProvider), new l2.c(platformProvider)), logger, j, j7);
    }

    public static /* synthetic */ H3.a createAnrDetector$default(E3.f fVar, E3.c cVar, long j, long j7, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 5000;
        }
        long j8 = j;
        if ((i2 & 8) != 0) {
            j7 = 2000;
        }
        return createAnrDetector(fVar, cVar, j8, j7);
    }
}
